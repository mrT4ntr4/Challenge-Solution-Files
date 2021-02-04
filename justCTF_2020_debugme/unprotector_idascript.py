import struct
import ida_bytes
import idaapi


def find_1337babes():
	res = []
	ea = idaapi.get_segm_by_name('.text').startEA
	while True:
		found_addr = FindBinary(ea, SEARCH_NEXT|SEARCH_DOWN, "BE BA 37 13")
		if found_addr != 0xFFFFFFFFFFFFFFFF:
			res.append(found_addr)
			ea = found_addr
		else:
			break
  	return res


def decrypt(crackme_bytes, dec_key_data):

	xor_elem = (dec_key_data[0] + dec_key_data[4]) #[4] is always 0 in this case

	x = dec_key_data[3] ^ (xor_elem & 0xff)   #0x40
	y = dec_key_data[3] ^ (xor_elem >> 8)     #0x42

	xor_res = x ^ (y<<8)\
		    ^ (x << 16) ^ (y << 24)\
		    ^ (x << 32) ^ (y << 40)\
		    ^ (x << 48) ^ (y << 56)

	dec_bytes = crackme_bytes ^ xor_res
	return dec_bytes


def start_patch(leetbabes):
	dec_key_data = [['0x7777', '0x700000018', '0x8', '0x41', '0x0'], ['0x7777', '0x7000000018', '0x8', '0x42', '0x0'], ['0x7777', '0xdb00000018', '0x8', '0x43', '0x0'], ['0x7777', '0x3b00000018', '0x8', '0x27', '0x0'], ['0x7777', '0xa300000018', '0x8', '0x94', '0x0'], ['0x707', '0x700000014', '0x8', '0x41', '0x0'], ['0x707', '0x800000014', '0x8', '0x42', '0x0'], ['0x707', '0xb00000014', '0x8', '0x43', '0x0'], ['0x707', '0x700000014', '0x8', '0x27', '0x0'], ['0x707', '0x700000014', '0x8', '0x94', '0x0'], ['0xaabb', '0x700000014', '0x8', '0x41', '0x0'], ['0xaabb', '0xb00000014', '0x8', '0x42', '0x0'], ['0xaabb', '0x1200000014', '0x8', '0x43', '0x0'], ['0xaabb', '0x800000014', '0x8', '0x27', '0x0'], ['0xaabb', '0xc00000014', '0x8', '0x94', '0x0'], ['0x202', '0x700000018', '0x8', '0x41', '0x0'], ['0x202', '0x9000000018', '0x8', '0x42', '0x0'], ['0x202', '0x11b00000018', '0x8', '0x43', '0x0'], ['0x202', '0x4b00000018', '0x8', '0x27', '0x0'], ['0x202', '0xd300000018', '0x8', '0x94', '0x0'], ['0xabcd', '0x700000018', '0x8', '0x41', '0x0'], ['0xabcd', '0x9000000018', '0x8', '0x42', '0x0'], ['0xabcd', '0x11c00000018', '0x8', '0x43', '0x0'], ['0xabcd', '0x4b00000018', '0x8', '0x27', '0x0'], ['0xabcd', '0xd300000018', '0x8', '0x94', '0x0'], ['0x1234', '0x700000018', '0x8', '0x41', '0x0'], ['0x1234', '0x7700000018', '0x8', '0x42', '0x0'], ['0x1234', '0xe900000018', '0x8', '0x43', '0x0'], ['0x1234', '0x3e00000018', '0x8', '0x27', '0x0'], ['0x1234', '0xad00000018', '0x8', '0x94', '0x0'], ['0x301', '0x700000018', '0x8', '0x41', '0x0'], ['0x301', '0x7800000018', '0x8', '0x42', '0x0'], ['0x301', '0xec00000018', '0x8', '0x43', '0x0'], ['0x301', '0x3f00000018', '0x8', '0x27', '0x0'], ['0x301', '0xaf00000018', '0x8', '0x94', '0x0']]
	dec_key_data = [[int(x,16) for x in lst] for lst in dec_key_data]

	for leetbabe_addr in leetbabes:
		feedcode_addr = FindBinary(leetbabe_addr, SEARCH_DOWN , "DE C0 ED FE")
		deadcode_addr = FindBinary(leetbabe_addr, SEARCH_DOWN , "DE C0 AD DE")

		print("1337BABE @ "+hex(leetbabe_addr))
		print("FEEDC0DE @ "+hex(feedcode_addr))
		print("DEADC0DE @ "+hex(deadcode_addr))

		ref_bytes = Qword(leetbabe_addr+4) & 0xffff

		for qword in dec_key_data:
			if qword[0] == ref_bytes:
				patch_addr = leetbabe_addr + 4 + (qword[1] & 0xff) + (qword[1] >> 32)
				crackme_bytes = Qword(patch_addr)
				dec_res = decrypt(crackme_bytes, qword)
				print("Patching " + hex(crackme_bytes) + " with " + hex(dec_res) + " @ " + hex(patch_addr))
				ida_bytes.patch_qword(patch_addr, dec_res)

		print("Patching unnecessary code with NOPS :)")
		ida_bytes.patch_bytes(leetbabe_addr-1, "\x90"*7) # 0xcc + 1337babe + 2 bytes
		ida_bytes.patch_bytes(feedcode_addr, "\x90"*4)   # feedc0de
		ida_bytes.patch_bytes(deadcode_addr-1, "\x90"*5) # 0xcc + deadc0de
		print("======================================")


if __name__ == '__main__':
	print(">>>>   bl33d1ng edg3 (UN)pr0t3c70r!!!   <<<<")

	leetbabes = find_1337babes()

	if not leetbabes:
		print("File is not protected with bl33d1ng edg3 pr0t3c70r!!!")
	else:	
		start_patch(leetbabes)
		print(">>>>        Patched Successfully !!   <<<<")
		print("== Use the (Apply Patches to input file) option to save it ==")
