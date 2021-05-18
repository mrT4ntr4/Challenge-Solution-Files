from miasm.analysis.machine import Machine
from miasm.core.locationdb import LocationDB
from miasm.analysis.simplifier import *
from miasm.arch.vmv.regs import *
from miasm.arch.vmv.arch import *
import miasm.arch.vmv.arch as arch_vmv
from miasm.core.utils import *
import subprocess


opcodes = defaultdict()

op_dic = {
    0xcb8 : ["EXIT_REG", reg_idx],
    0xbcc : ["DEC", reg_idx],
    0xd70 : ["RET", ],
    0x6e8 : ["MEMFETCH", reg_idx],
    0xcd8 : ["CALL", imm32],
    0x358 : ["PUTCHAR_REG", reg_idx],
    0x444 : ["JMP", imm32],
    0x980 : ["XOR", ],
    0x8fc : ["MUL", ],
    0x770 : ["AND", ],
    0xb68 : ["INC", reg_idx],
    0x4ac : ["JE", imm32],
    0x67c : ["MEMSTORE", reg_idx],
    0x878 : ["ADD", ],
    0x380 : ["PUSH_IMM", imm32],
    0x3f0 : ["ROMFETCH", reg_idx],
    0x3b0 : ["PUSH_REG", reg_idx],
    0x594 : ["JNE", imm32],
    0xa04 : ["PUTCHAR_IMM", putchar_imm32],
    0xa44 : ["EXIT_IMM", imm32],
    0xa54 : ["MEMSHIFT_IMM", imm32],
    0xaa0 : ["MEMSHIFT_REG", reg_idx],
    0xafc : ["POP", reg_idx],
    0xc30 : ["MOD", reg_idx],
}


def save_ircfg(asmcfg, name):
		open(name, 'w').write(asmcfg.dot())
		subprocess.call(["dot", "-Tpng", name, "-o", name.split('.')[0]+'.png'])


def get_opcodes(mdis, cur_bloc, offsets_to_dis):
    #pattern 1
    if (len(cur_bloc.lines) == 3 and
            cur_bloc.lines[0].name == "PUSH_REG" and
            cur_bloc.lines[1].name == "PUSH_IMM" and
            cur_bloc.lines[2].name == "JE"):
    	
        
        op = cur_bloc.lines[1].args[0]
        jmp_loc = cur_bloc.lines[2].args[0]
        loc = jmp_loc.loc_key
        offset = mdis.loc_db.get_location_offset(loc)
        if isinstance(op, ExprInt):
            op = int(op.arg)
        opcodes[op] = offset

    #pattern 2
    if(mdis.loc_db.get_location_offset(cur_bloc.loc_key) == 0xe8):
        arch_vmv.putchar_xorlist.append(int(cur_bloc.lines[0].args[0]) & 0xff)
        arch_vmv.reg_xorlist.append(int(cur_bloc.lines[2].args[0]) & 0xff)
        
        


def add_new_opcodes(opcodes,level):
    print("\n===========   OPCODES FOR VM %d ============"%level)
    for op, offset in opcodes.items():
        print(hex(op), op_dic[offset][0])
        if len(op_dic[offset])>1:
            addop(op_dic[offset][0], [bs32(op), op_dic[offset][1], ])
        else:
            addop(op_dic[offset][0], [bs32(op), ])



bclist = []
fin = open("vmv_bytecode.bin", 'rb')
vm_init_bc = fin.read()
bclist.append(vm_init_bc)

fin = open("vmv_nested_bytecode.bin", 'rb')

i = 1
while True: 
    data = fin.read(4)
    if not data:
        break
    end_index = struct.unpack('<I',data)[0]
    bc = fin.read(end_index*4)
    bclist.append(bc)
    i+=1


print("\n>>>>>> MAX No. of VM Nesting Levels =", len(bclist), "  <<<<<<" )

machine = Machine("vmv")
addr = 0x0
res_list = []

for i in range(len(bclist)):
    print("\nLength of VM(%d) bytecode = 0x%x" % (i+1, len(bclist[i])//4))

    opcodes = defaultdict()

    loc_db = LocationDB()
    mdis = machine.dis_engine(bclist[i], loc_db=loc_db)
    mdis.dis_block_callback = get_opcodes
    asmcfg = mdis.dis_multiblock(addr)
    #asmcfg_dc0 = mdis.dis_multiblock(0xdc0)
    res_list.append([loc_db, asmcfg])
    save_ircfg(asmcfg, "output/vmv_asmcfg%s.dot"%str(i+1))
    #save_ircfg(asmcfg_dc0, "output/vmv_asmcfg_dc0_%s.dot"%str(i+1))
    arch_vmv.nest_level += 1

    if len(opcodes) == 24:
        add_new_opcodes(opcodes, i+1)

#print(res_list)
nl = 4
# saving the simplified IR for a specific level
loc_db = res_list[nl][0]
asmcfg = res_list[nl][1]

ira = machine.ira(loc_db)
ircfg = ira.new_ircfg_from_asmcfg(asmcfg)
save_ircfg(ircfg, "output/vmv_ircfg%s.dot"%str(nl+1))

loc = loc_db.get_offset_location(addr)

simp = IRCFGSimplifierCommon(ira)
simp.simplify(ircfg, loc)
save_ircfg(ircfg, "output/vmv_ircfg_simp_common%s.dot"%str(nl+1))

simp = IRCFGSimplifierSSA(ira)
simp.simplify(ircfg, loc)
save_ircfg(ircfg, "output/vmv_ircfg_simp_ssa%s.dot"%str(nl+1))
