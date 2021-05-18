from miasm.core.cpu import sign_ext
from miasm.expression.expression import *
from miasm.arch.vmv.regs import *
from miasm.arch.vmv.arch import mn_vmv
from miasm.ir.ir import IntermediateRepresentation


def nop(ir, instr):
  return [], []

def memshift_imm(ir, instr, imm):
  e = []
  e.append( ExprAssign(VM_MEM_PTR, VM_MEM_NEXT_PTR) )
  e.append( ExprAssign(VM_MEM_NEXT_PTR, VM_MEM_NEXT_PTR+imm))
  return e, []

def memshift_reg(ir, instr, reg):
  e = []
  e.append( ExprAssign(VM_MEM_PTR, VM_MEM_NEXT_PTR) )
  e.append( ExprAssign(VM_MEM_NEXT_PTR, VM_MEM_NEXT_PTR+reg))
  return e, []

def memstore(ir, instr, reg):
  e = []
  dst = ExprMem(VM_MEM + VM_MEM_PTR.zeroExtend(64), 32)
  e.append( ExprAssign(dst, reg) )
  return e, []

def memfetch(ir, instr, reg):
  e = []
  src = ExprMem(VM_MEM + VM_MEM_PTR.zeroExtend(64), 32)
  e.append( ExprAssign(reg, src) )
  return e, []

def push_reg(ir, instr, reg):
  e = []
  int4 = ExprInt(4, 32)
  e += [ExprAssign(ExprMem(SP + int4, 32), reg)]
  e += [ExprAssign(SP, SP + int4)]
  return e, []

def push_imm(ir, instr, imm):
  e = []
  int4 = ExprInt(4, 32)
  e += [ExprAssign(ExprMem(SP + int4, 32), imm)]
  e += [ExprAssign(SP, SP + int4)]
  return e, []

def pop(ir, instr, reg):
  e = []
  int4 = ExprInt(4, 32) 
  e += [ExprAssign(reg, ExprMem(SP, 32))]
  e += [ExprAssign(SP, SP - int4)]
  return e, []

def romfetch(ir, instr, reg):
  e =[]
  e.append((ExprAssign(reg, ExprMem(ROM + ROM_PTR, 32))))
  e.append(ExprAssign(ROM_PTR, ROM_PTR + ExprInt(4, ROM_PTR.size)))
  return e, []

def add(ir, instr):
  e = []
  var_A = ExprMem(SP,32)
  var_B = ExprMem(SP - ExprInt(4, 32), 32)
  var_res = ExprMem(SP - ExprInt(4, 32), 32)
  add_op = ExprOp('+',var_A, var_B)
  mod_op = ExprOp('%', add_op, ExprInt(0x7fffffff, 32))
  e += [ExprAssign(var_res, mod_op)]
  e += [ExprAssign(SP, SP - ExprInt(4, 32))]
  return e, []

def mul(ir, instr):
  e = []
  var_A = ExprMem(SP,32)
  var_B = ExprMem(SP - ExprInt(4, 32), 32)
  var_res = ExprMem(SP - ExprInt(4, 32), 32)
  mul_op = ExprOp('*',var_A, var_B)
  mod_op = ExprOp('%', mul_op, ExprInt(0x7fffffff, 32))
  e += [ExprAssign(var_res, mod_op)]
  e += [ExprAssign(SP, SP - ExprInt(4, 32))]
  return e, []

def xor(ir, instr):
  e = []
  var_A = ExprMem(SP,32)
  var_B = ExprMem(SP - ExprInt(4, 32), 32)
  var_res = ExprMem(SP - ExprInt(4, 32), 32)
  e += [ExprAssign(var_res, ExprOp('^',var_A, var_B))]
  e += [ExprAssign(SP, SP - ExprInt(4, 32))]
  return e, []

def and_(ir, instr):
  e = []
  var_A = ExprMem(SP,32)
  var_B = ExprMem(SP - ExprInt(4, 32), 32)
  var_res = ExprMem(SP - ExprInt(4, 32), 32)
  and_op = ExprOp('&',var_A, var_B)
  mod_op = ExprOp('%', and_op, ExprInt(0x7fffffff, 32))
  e += [ExprAssign(var_res, mod_op)]
  e += [ExprAssign(SP, SP - ExprInt(4, 32))]
  return e, []

def je(ir, instr, dst):
  e = []
  if dst.is_int():
    dst = ExprInt(dst, PC.size)
  elif dst.is_loc():
    dst = ExprLoc(dst.loc_key, PC.size)
  loc_next = ir.get_next_loc_key(instr)
  loc_next_expr = ExprLoc(loc_next, ir.IRDst.size)

  var_A = ExprMem(SP,32)
  var_B = ExprMem(SP - ExprInt(4, 32), 32)
  cmp_ = ExprOp("FLAG_EQ_CMP", var_A, var_B)

  e += [ExprAssign(PC, ExprCond(cmp_, dst, loc_next_expr))]
  e += [ExprAssign(ir.IRDst, ExprCond(cmp_, dst, loc_next_expr))]
  e += [ExprAssign(SP, SP - ExprInt(8,32))]
  return e, []


def jne(ir, instr, dst):  
  e = []
  if dst.is_int():
    dst = ExprInt(dst, PC.size)
  elif dst.is_loc():
    dst = ExprLoc(dst.loc_key, PC.size)
  loc_next = ir.get_next_loc_key(instr)
  loc_next_expr = ExprLoc(loc_next, ir.IRDst.size)

  var_A = ExprMem(SP,32)
  var_B = ExprMem(SP - ExprInt(4, 32), 32)
  cmp_ = ExprOp("FLAG_EQ_CMP", var_A, var_B)

  e += [ExprAssign(PC, ExprCond(cmp_, loc_next_expr, dst))]
  e += [ExprAssign(ir.IRDst, ExprCond(cmp_, loc_next_expr, dst))]
  e += [ExprAssign(SP, SP - ExprInt(8,32))]
  return e, []

def jmp(ir, instr, dst):
  e = []
  if dst.is_int():
    dst = ExprInt(dst, PC.size)
  elif dst.is_loc():
    dst = ExprLoc(dst.loc_key, PC.size)  
  e += [ExprAssign(PC, dst)]
  e += [ExprAssign(ir.IRDst, dst)]  
  return e, []

def inc(ir, instr, reg):
  e = []
  e.append( ExprAssign(reg, reg + ExprInt(1, reg.size)) )
  return e, []

def dec(ir, instr, reg):
  e = []
  e.append( ExprAssign(reg, reg - ExprInt(1, reg.size)) )
  return e, []

def call(ir, instr, dst):
  e = []
  #e += [ExprAssign(LR, PC)]
  # e += [ExprAssign(PC, dst)]
  # e += [ExprAssign(ir.IRDst, dst)]
  e += ir.call_effects(dst)
  return e, []

def ret(ir, instr):
  e = []
  e += [ExprAssign(PC, LR)]
  return e, []

def exit_reg(ir, instr, reg):
  e = []
  EXIT_CODE = ExprId("EXIT_CODE", 32)
  LOOP_STATUS = ExprId("LOOP_STATUS", 32)
  e += [ExprAssign(EXIT_CODE, reg)]
  e += [ExprAssign(LOOP_STATUS, ExprInt(0, LOOP_STATUS.size))]
  return e, []

def exit_imm(ir, instr, imm):
  e = []
  EXIT_CODE = ExprId("EXIT_CODE", 32)
  e += [ExprAssign(EXIT_CODE, imm)]
  e += [ExprAssign(PC, ExprId("VMEXIT", 32))]
  e += [ExprAssign(ir.IRDst, ExprId("VMEXIT", 32))]
  return e, []

def mod(ir, instr, reg):
  e = []
  r = ExprMem(SP, 32)
  res = ExprOp('%', r, reg)
  e += [ExprAssign(r, res)]
  return e, []

def putchar_reg(ir, instr, reg):
  e = []
  e += ir.call_effects(ExprId("putchar", 32), reg)
  e += [ExprAssign(ExprId("PUTCHAR_ARG", reg.size), reg)]
  PUT_FLAG = ExprId("PUT_FLAG", 8)
  e += [ExprAssign(PUT_FLAG, ExprInt(1, PUT_FLAG.size))]
  return e, []


def putchar_imm(ir, instr, imm):
  e = []
  #fcn = ExprId("putchar",32)
  #e += [ExprAssign(ir.IRDst, fcn)]  
  e += ir.call_effects(ExprId("putchar", 32), imm)
  return e, []


mnemo_func = {
"MEMSHIFT_IMM" : memshift_imm,
"MEMSHIFT_REG" : memshift_reg,
"PUSH_IMM" : push_imm,
"PUSH_REG" : push_reg,
"POP" : pop,
"ROMFETCH" : romfetch,
"ADD" : add,
"MUL" : mul,
"XOR" : xor,
"AND" : and_,
"MEMSTORE" : memstore,
"JE" : je,
"JNE" : jne,
"INC": inc,
"DEC": dec,
"JMP": jmp,
"CALL": call,
"RET" : ret,
"EXIT_REG" : exit_reg,
"EXIT_IMM" : exit_imm,
"MEMFETCH" : memfetch,
"MOD" : mod,
"PUTCHAR_REG" : putchar_reg,
"PUTCHAR_IMM" : putchar_imm,
}


class ir_vmv(IntermediateRepresentation):
  """Toshiba MeP miasm IR - Big Endian
      It transforms an instructon into an IR.
  """
  addrsize = 32

  def __init__(self, loc_db=None):
    IntermediateRepresentation.__init__(self, mn_vmv, None, loc_db)
    self.pc = mn_vmv.getpc()
    self.sp = mn_vmv.getsp()
    self.ret_reg = R0
    self.IRDst = ExprId("IRDst", 32)

  def get_ir(self, instr):
    """Get the IR from a miasm instruction."""
    args = instr.args
    instr_ir, extra_ir = mnemo_func[instr.name](self, instr, *args)
    return instr_ir, extra_ir