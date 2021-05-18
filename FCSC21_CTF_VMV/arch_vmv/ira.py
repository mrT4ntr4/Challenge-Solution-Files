from miasm.ir.analysis import ira
from miasm.arch.vmv.sem import ir_vmv
from miasm.expression.expression import *
from miasm.ir.ir import AssignBlock

class ir_a_vmv_base(ir_vmv, ira):

  def __init__(self, loc_db):
    ir_vmv.__init__(self, loc_db)
    self.ret_reg = self.arch.regs.R0
    self.sp = self.arch.regs.SP

  def call_effects(self, addr, *args):
    #print(*args)
    if all(isinstance(arg, Expr) for arg in args):
        call_assignblk = [
            ExprAssign(self.ret_reg, ExprOp('call_func', addr, *args)),
        ]

        return call_assignblk
    else:
        call_assignblk = AssignBlock(
        [
                ExprAssign(self.ret_reg, ExprOp('call_func_ret', addr, self.sp)),
                ExprAssign(self.sp, ExprOp('call_func_stack', addr, self.sp))
        ],
        args)

        return [call_assignblk], []


class ir_a_vmv(ir_a_vmv_base):

  def __init__(self, loc_db):
      ir_a_vmv_base.__init__(self, loc_db)

  def get_out_regs(self, _):
    return set([self.ret_reg, self.sp])

# class ir_a_vmv(ir_vmv, ira):
  
#   def get_out_regs(self, _):
#     return set([self.ret_reg, self.sp])