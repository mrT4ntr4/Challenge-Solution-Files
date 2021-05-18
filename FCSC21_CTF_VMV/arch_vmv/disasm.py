from miasm.core.asmblock import disasmEngine
from miasm.arch.vmv.arch import mn_vmv


cb_vmv_funcs = []


def cb_vmv_disasm(mdis, cur_block, offset_to_dis):
    for func in cb_vmv_funcs:
        func(mdis, cur_block, offset_to_dis)


class dis_vmv(disasmEngine):
    attrib = None

    def __init__(self, bs=None, **kwargs):
        super(dis_vmv, self).__init__(mn_vmv, self.attrib, bs, **kwargs)
        self.dis_block_callback = cb_vmv_disasm