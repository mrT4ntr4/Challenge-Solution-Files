from miasm.core.cpu import *
from miasm.core.utils import Disasm_Exception
from miasm.expression.expression import ExprId, ExprInt, ExprLoc, \
    ExprMem, ExprOp, is_expr
from miasm.core.asm_ast import AstId, AstMem
from miasm.arch.vmv.regs import *
import miasm.arch.vmv.regs as vmv_regs_module
from pyparsing import *

conditional_branch = ["JE","JNE"]
unconditional_branch = ["JMP"]

call_instr = ["CALL"]
breakflow = ["EXIT_IMM"]+conditional_branch+unconditional_branch+["RET"]

class bs32(bs):
    prio = default_prio

    def __init__(self, v, cls=None, fname=None, **kargs):
        super(bs32, self).__init__(int2bin(swap32(v), 32), 32,
                                  cls=cls, fname=fname, **kargs)

class instruction_vmv(instruction):
  """Generic vmv instruction
  """
  delayslot = 0

  def __init__(self, name, mode, args, additional_info=None):
    self.name = name
    self.mode = mode
    self.args = args
    self.additional_info = additional_info
    self.offset = None
    self.l = None
    self.b = None


  @staticmethod
  def arg2str(expr, pos=None, loc_db=None):
      """Convert mnemonics arguments into readable strings according to the
      vmv architecture and their internal types
      """

      if isinstance(expr, ExprId) or isinstance(expr, ExprInt):
          return str(expr)

      elif isinstance(expr, ExprLoc):
          if loc_db is not None:
              return loc_db.pretty_str(expr.loc_key)
          else:
              return str(expr)
      return str(expr)

  def to_string(self, loc_db=None):
    #print(hex(self.offset))
    return super(instruction_vmv, self).to_string(loc_db)
  
  def fixDstOffset(self):
    expr = self.args[self.get_dst_num()]
    if expr.is_int():
      return
    self.args[self.get_dst_num()] = ((int(expr)*4)+self.offset + 8) & 0xffffffff

  def breakflow(self):
    """Instructions that stop a basic block."""
    if self.name in breakflow:
      return True

    return self.name in ['CALL']

  def splitflow(self):
    """Instructions that splits a basic block, i.e. the CPU can go somewhere else."""
    if self.name in conditional_branch:
        return True
    if self.name in unconditional_branch:
        return False
    return self.name in ['CALL']

  def dstflow(self):
    """Instructions that explicitly provide the destination."""
    if self.name in conditional_branch+unconditional_branch:
      return True
    return self.name in ['CALL']

  def dstflow2label(self, loc_db):
    """Set the label for the current destination.
        Note: it is used at disassembly"""

    loc_arg = self.get_dst_num()
    expr = self.args[loc_arg]
    if not expr.is_int():
      return
    addr = ((int(expr)*4)+self.offset + 8) & 0xffffffff
    loc_key = loc_db.get_or_create_offset_location(addr)
    self.args[0] = ExprLoc(loc_key, expr.size)

  def getdstflow(self, loc_db):
    """Get the argument that points to the instruction destination."""
    if self.name in conditional_branch+call_instr+unconditional_branch:
      return [self.args[0]]
    raise RuntimeError

  def is_subcall(self):
    """
    Instructions used to call sub functions.
    """
    return self.name in ['CALL']

  def get_dst_num(self):
    return 0

class vmv_additional_info(object):
  """Additional vmv instructions information
  """

  def __init__(self):
    self.except_on_instr = False

class mn_vmv(cls_mn):
  num = 0  # holds the number of mnemonics
  all_mn = list()  # list of mnenomnics, converted to metamn objects
  all_mn_mode = defaultdict(list) # mneomnics, converted to metamn objects
  all_mn_name = defaultdict(list) # mnenomnics strings
  all_mn_inst = defaultdict(list) # mnemonics objects
  bintree = dict()  # Variable storing internal values used to guess a
  instruction = instruction_vmv
  regs = vmv_regs_module
  max_instruction_len = 8
  delayslot = 0
  name = "vmv"

  def additional_info(self):
    return vmv_additional_info()

  @classmethod
  def gen_modes(cls, subcls, name, bases, dct, fields):
    dct["mode"] = None
    return [(subcls, name, bases, dct, fields)]

  @classmethod
  def getmn(cls, name):
    return name.upper()

  @classmethod
  def getpc(cls, attrib=None):
    """"Return the ExprId that represents the Program Counter.
    Notes:
        - mandatory for the symbolic execution
        - PC is defined in regs.py
    """
    return PC

  @classmethod
  def getsp(cls, attrib=None):
    """"Return the ExprId that represents the Stack Pointer.
    Notes:
        - mandatory for the symbolic execution
        - SP is defined in regs.py
    """
    return SP

def addop(name, fields, args=None, alias=False):
  """
  Dynamically create the "name" object
  Notes:
      - it could be moved to a generic function such as:
        addop(name, fields, cls_mn, args=None, alias=False).
      - most architectures use the same code
  Args:
      name:   the mnemonic name
      fields: used to fill the object.__dict__'fields' attribute # GV: not understood yet
      args:   used to fill the object.__dict__'fields' attribute # GV: not understood yet
      alias:  used to fill the object.__dict__'fields' attribute # GV: not understood yet
  """

  namespace = {"fields": fields, "alias": alias}

  if args is not None:
      namespace["args"] = args

  # Dynamically create the "name" object
  type(name, (mn_vmv,), namespace)

class vmv_arg(m_arg):
  def asm_ast_to_expr(self, arg, loc_db):
    """Convert AST to expressions
       Note: - Must be implemented"""

    if isinstance(arg, AstId):
      if isinstance(arg.name, ExprId):
        return arg.name
      if isinstance(arg.name, str) and arg.name in gpr_names:
        return None  # GV: why?
      loc_key = loc_db.get_or_create_name_location(arg.name.encode())
      return ExprLoc(loc_key, 64)

    elif isinstance(arg, AstMem):
      addr = self.asm_ast_to_expr(arg.ptr, loc_db)
      if addr is None:
        return None
      return ExprMem(addr, 64)

    elif isinstance(arg, AstInt):
      return ExprInt(arg.value, 64)

    elif isinstance(arg, AstOp):
      args = [self.asm_ast_to_expr(tmp, loc_db) for tmp in arg.args]
      if None in args:
          return None
      return ExprOp(arg.op, *args)

    # Raise an exception if the argument was not processed
    message = "mep_arg.asm_ast_to_expr(): don't know what \
                to do with a '%s' instance." % type(arg)
    raise Exception(message)

class vmv_reg(reg_noarg, vmv_arg):
  """Generic vmv register
  Note:
      - the register size will be set using bs()
  """
  reg_info = reg_infos  # the list of vmv registers defined in regs.py
  parser = reg_info.parser  # GV: not understood yet



class vmv_reg_idx(vmv_arg):

  reg_info = reg_infos  # the list of vmv registers defined in regs.py
  intsize = 32
  intmask = (1 << intsize) - 1

  def decode(self, v):
    v = swap_sint(self.l, v) & self.intmask 
    v = (v^reg_xorlist[nest_level])&0x3f
    if v >= len(self.reg_info.expr):
      return False
    self.expr = self.reg_info.expr[v]
    return True


class vmv_putchar_imm32(imm_noarg, vmv_arg):
  intmask = 0xff
  
  def decodeval(self, v):
    return (putchar_xorlist[nest_level] ^ swap_sint(self.l, v)) & self.intmask


class vmv_imm8(imm_noarg, vmv_arg):
  """Generic vmv immediate
  Note:
      - the immediate size will be set using bs()
  """
  intsize = 8
  intmask = (1 << intsize) - 1
  parser = base_expr

class vmv_imm16(imm_noarg, vmv_arg):
  """Generic vmv immediate
  Note:
      - the immediate size will be set using bs()
  """
  intsize = 16
  intmask = (1 << intsize) - 1
  parser = base_expr

  def decodeval(self, v):
    return swap_sint(self.l, v) & self.intmask

  def encodeval(self, v):
    return swap_sint(self.l, v) & self.intmask

class vmv_imm32(imm_noarg, vmv_arg):
  """Generic vmv immediate
  Note:
      - the immediate size will be set using bs()
  """
  intsize = 32
  intmask = (1 << intsize) - 1
  parser = base_expr

  def decodeval(self, v):
    return swap_sint(self.l, v) & self.intmask 

  def encodeval(self, v):
    return swap_sint(self.l, v) & self.intmask

class vmv_imm64(imm_noarg, vmv_arg):
  """Generic vmv immediate
  Note:
      - the immediate size will be set using bs()
  """
  intsize = 64
  intmask = (1 << intsize) - 1
  parser = base_expr

  def decodeval(self, v):
    return swap_sint(self.l, v) & self.intmask

  def encodeval(self, v):
    return swap_sint(self.l, v) & self.intmask

reg   = bs(l=32,   cls=(vmv_reg, ))
imm8  = bs(l=8,   cls=(vmv_imm8,  vmv_arg))
imm16 = bs(l=16,  cls=(vmv_imm16, vmv_arg))
imm32 = bs(l=32,  cls=(vmv_imm32, vmv_arg))
imm64 = bs(l=64,  cls=(vmv_imm64, vmv_arg))

reg_idx = bs(l=32,   cls=(vmv_reg_idx,  vmv_arg))
putchar_imm32 = bs(l=32,   cls=(vmv_putchar_imm32,  vmv_arg))

reg_xorlist = [0x7b]
putchar_xorlist = [0x0]
nest_level = 0


addop("MEMSHIFT_IMM", [bs32(0xba1116a9), imm32, ])
addop("PUSH_REG",     [bs32(0x5991ba22), reg_idx, ] )
addop("POP",          [bs32(0x8960888a), reg_idx, ] )
addop("PUSH_IMM",     [bs32(0x5e64bb6c), imm32, ] )
addop("MEMSHIFT_REG", [bs32(0x1f0a8e6f), reg_idx, ])
addop("ROMFETCH",     [bs32(0x8d67bae1), reg_idx, ])
addop("ADD",          [bs32(0xadc52d),])
addop("MEMSTORE",     [bs32(0xfb521a9c), reg_idx])
addop("JE",           [bs32(0x180bc12d), imm32])
addop("INC",          [bs32(0xf00bb6c1), reg_idx])
addop("CALL",         [bs32(0xfa83fa5e), imm32])
addop("JMP",          [bs32(0xed4e2cfb), imm32])
addop("EXIT_IMM",     [bs32(0x27497906), imm32])
addop("PUTCHAR_REG",  [bs32(0xd1450d67), reg_idx])
addop("DEC",          [bs32(0x8ea45b38), reg_idx])
addop("XOR",          [bs32(0x48c5ccc6), ])
addop("AND",          [bs32(0x542010a0), ])
addop("MUL",          [bs32(0x560729d),  ])
addop("MEMFETCH",     [bs32(0xc650f15d), reg_idx])
addop("JNE",          [bs32(0x5a0f38fc), imm32])
addop("EXIT_REG",     [bs32(0x818cd6b5), reg_idx])
addop("MOD",          [bs32(0x43ae1f53), reg_idx])
addop("RET",          [bs32(0xbdecfe55), ])

