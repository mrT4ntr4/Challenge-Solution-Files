import json
import idc


def rename_dwords():

	f = open('C:\Users\mrT4ntr4\Downloads\idascripts\method_map.json') 
	method_map = json.load(f) 
	token_list = [int(x,16) for x in method_map.keys()]

	data_seg_selector = idc.SegByName('.data')
	data_seg_startea = idc.SegByBase(data_seg_selector)
	data_seg_endea = idc.SegEnd(data_seg_startea)

	#maybe compability issue
	SN_FORCE = 0x800

	for ea in range(data_seg_startea, data_seg_endea):
		var_name = Name(ea)
		if 'dword' in var_name:
			dword_val = Dword(ea)

			if dword_val in token_list:
				formatted_token = "0x0%X" % dword_val
				new_name = str(method_map[formatted_token])
				idc.set_name(ea, new_name, SN_NOCHECK | SN_FORCE)
				print "done renaming " + var_name +" to " + new_name

def define_functions():
	native_rvas = [0x1930, 0x3A90, 0x44b0,]
	native_rvas = [(0x400000 + x) for x in native_rvas]

	for ea in native_rvas:

		if ea == 0x401930:
			# undefine and force convert to code as IDA doesn't analyse it at first
			print "Defining fcn GODDAG at 0x%x" % ea
			print "Making", ea, "unknown and defining it to code..."
			idc.MakeUnkn(ea,1)
			idc.MakeCode(ea)
			idc.MakeUnkn(ea+8,1)
			idc.MakeCode(ea+7)
		else:
			if ea == 0x403A90:
				fcn_name = "NativeGRUNDTAL_NORRVIKEN"
				print "Defining fcn %s at 0x%x" % (fcn_name, ea)
			elif ea == 0x4044B0:
				fcn_name = "FYRKANTIGImpl"
				print "Defining fcn %s at 0x%x" % (fcn_name, ea)

			idc.MakeFunction(ea)
			idc.MakeNameEx(ea, fcn_name, idc.SN_NOWARN)


if __name__ == '__main__':
	rename_dwords()
	define_functions()