from miasm.expression.expression import ExprId
from miasm.core.cpu import gen_regs

# Used by internal miasm exceptions
exception_flags = ExprId("exception_flags", 64)
exception_flags_init = ExprId("exception_flags_init", 64)


# 00000000 vm_context      struc ; (sizeof=0x89, mappedto_8)
# 00000000 stack_base      dq ?
# 00000008 r0              dd ?
# 0000000C r1              dd ?
# 00000010 r2              dd ?
# 00000014 r3              dd ?
# 00000018 r4              dd ?
# 0000001C r5              dd ?
# 00000020 r6              dd ?
# 00000024 pc              dd ?
# 00000028 vm_mem_ptr      dd ?
# 0000002C lr              dd ?
# 00000030 r10_            dd ?
# 00000034 r11_            dd ?
# 00000038 sp_             dd ?
# 0000003C r13_            dd ?
# 00000040 r14_            dd ?
# 00000044 r15_            dd ?
# 00000048 r16_            dd ?
# 0000004C r17_            dd ?
# 00000050 r18_            dd ?
# 00000054 r19_            dd ?
# 00000058 bytecode_base   dq ?
# 00000060 vm_mem          dq ?
# 00000068 vm_mem_next_ptr dq ?
# 00000070 rom             dq ?
# 00000078 rom_ptr         dq ?
# 00000080 loop_status     dd ?
# 00000084 exit_code       dd ?
# 00000088 put_flag        db ?
# 00000089 vm_context      ends


reg_names32 = ["R0","R1","R2","R3","R4","R5","R6","PC","VM_MEM_PTR","LR","R10","R11","SP","R13","R14","R15","R16","R17","R18","R19"]
reg_exprs, reg_inits, reg_infos = gen_regs(reg_names32, globals())  # sz=32 bits (default)

extra_names64 = ["BYTECODE_BASE","VM_MEM","ROM","ROM_PTR"]
extra_exprs, extra_inits, extra_infos = gen_regs(extra_names64, globals(), 64)

vmnp_expr, vmnp_inits, vmnp_infos  = gen_regs(["VM_MEM_NEXT_PTR"], globals())


all_regs_ids = reg_exprs + extra_exprs + vmnp_expr + [exception_flags]
all_regs_ids_init = reg_inits + extra_inits + vmnp_inits + [exception_flags_init]
all_regs_ids_no_alias = all_regs_ids[:]

all_regs_ids_byname = dict([(x.name, x) for x in all_regs_ids])

regs_init = dict()  # mandatory name
for i, r in enumerate(all_regs_ids):
  regs_init[r] = all_regs_ids_init[i]