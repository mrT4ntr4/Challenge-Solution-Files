from z3 import *

def xor_mod(mod_list):
	xor_mask = [0x1F, 0x23, 0x3F, 0x3F, 0x1B, 0x07, 0x37, 0x21, 0x04, 0x33, 0x09, 0x3B, 0x39, 0x28, 0x30, 0x0C,	0x0E, 0x2E, 0x3F, 0x25, 0x2A, 0x27, 0x3E, 0x0B, 0x27, 0x1C, 0x38, 0x31, 0x1E, 0x3D]

	lol = []
	for i in range(len(mod_list)):
		lol.append(mod_list[i] ^ xor_mask[i])
	return lol


def get_checksum(mod_list):
	num = 16

	for i in range(len(mod_list)):
		if (i != len(mod_list) - 2):
			num = mod_list[i] + num

			if (i % 2 == 0):
				num = mod_list[i] + num
			
			if (i % 3 == 0):
				num = mod_list[i] * 4294967294 + num
			
			if (i % 5 == 0):
				num = mod_list[i] * 4294967293 + num
			
			if (i % 7 == 0):
				num = mod_list[i] * 4 + num
			
			num &= 0xffffffff

	return num & 63


def random_shuffle(arg_list):
	num_list = [0, 1, 0, 2, 3, 3, 7, 0, 6, 7, 7, 0, 3, 0xa, 0x6, 0xf, 0x3, 0x5, 0xc, 0xe, 0x3, 0x5, 0x8, 0x11, 0x17, 0x16, 0xa ]
	j = 1
	
	for i in num_list:
		if i != j:
			#print "Swapping :", (hex(arg_list[i]), hex(arg_list[j]) )
			#print "num =", hex(i)
			arg_list[i], arg_list[j] = arg_list[j], arg_list[i]
		#print i,j	
		j+=1

	return arg_list

def swap_more(arg_list):
	
	for j in range(0,len(arg_list)-3,3):
		arg_list[j], arg_list[j+1] = arg_list[j+1], arg_list[j]

	return arg_list

def decode_inp(enc):
	dec = ""
	valid_range1 = ord('9') - ord('0')
	valid_range2 = ord('Z') - ord('0') - 7
	valid_range3 = ord('z') - ord('0') - (7+6)

	for c in enc:
		if c <= valid_range1:
			dec += chr(c + 48)
		elif c <= valid_range2:
			dec += chr(c + 55)
		elif c <= valid_range3:
			dec += chr(c + 61)
		elif c == 62:
			dec += '{'
		elif c == 63:
			dec += '}'

	return dec


def final_conds(MATHOPEN, s):
	
	s.add(MATHOPEN[1] == 25)
	s.add(MATHOPEN[2] == 23)
	s.add(MATHOPEN[9] == 9)
	s.add(MATHOPEN[20] == 45)
	s.add(MATHOPEN[26] == 7)
	s.add(UGE(MATHOPEN[8], 15))
	s.add(ULE(MATHOPEN[12], 4))
	s.add(UGE(MATHOPEN[14], 48))
	s.add(UGE(MATHOPEN[29], 1))

	s.add(ULE(MATHOPEN[0] + MATHOPEN[1] + MATHOPEN[2] + MATHOPEN[3] + MATHOPEN[4] - 130, 10))
	s.add(ULE(MATHOPEN[5] + MATHOPEN[6] + MATHOPEN[7] + MATHOPEN[8] + MATHOPEN[9] - 140, 10))
	s.add(ULE(MATHOPEN[10] + MATHOPEN[11] + MATHOPEN[12] + MATHOPEN[13] + MATHOPEN[14] - 150 ,10)) 
	s.add(ULE(MATHOPEN[15] + MATHOPEN[16] + MATHOPEN[17] + MATHOPEN[18] + MATHOPEN[19] - 160 ,10)) 
	s.add(ULE(MATHOPEN[20] + MATHOPEN[21] + MATHOPEN[22] + MATHOPEN[23] + MATHOPEN[24] - 170 ,10)) 

	s.add(ULE(MATHOPEN[0] + MATHOPEN[5] + MATHOPEN[10] + MATHOPEN[15] + MATHOPEN[20] + MATHOPEN[25] - 172, 6)) 
	s.add(ULE(MATHOPEN[1] + MATHOPEN[6] + MATHOPEN[11] + MATHOPEN[16] +MATHOPEN[21] + MATHOPEN[26] - 162, 6)) 
	s.add(ULE(MATHOPEN[2] + MATHOPEN[7] + MATHOPEN[12] + MATHOPEN[17]+ MATHOPEN[22] + MATHOPEN[27] - 152, 6)) 
	s.add(ULE(MATHOPEN[3] + MATHOPEN[8] + MATHOPEN[13] + MATHOPEN[18] + MATHOPEN[23] - 142, 6)) 
	s.add(ULE(MATHOPEN[4] + MATHOPEN[9] + MATHOPEN[14] + MATHOPEN[19] + MATHOPEN[24] + MATHOPEN[29] - 132, 6)) 

	num45 = ((MATHOPEN[7] + (MATHOPEN[27] * 3)) * 3 - MATHOPEN[5] * 13) - 57
	s.add(ULE(num45, 28))
	
	num45 = (MATHOPEN[22] * 3 + ((MATHOPEN[14] << 2) - (MATHOPEN[20] * 5))) - 12
	s.add(ULE(num45, 70))

	num46 = (MATHOPEN[14] + (MATHOPEN[16] * 2)) * 2 + ((MATHOPEN[15] - ( MATHOPEN[18] * 2)) * 3) - MATHOPEN[17] * 5
	s.add(MATHOPEN[13] + num46 == 0)

	s.add(MATHOPEN[5] == MATHOPEN[6] * 2)
	s.add(MATHOPEN[29] + MATHOPEN[7] == 59)
	s.add(MATHOPEN[0] == MATHOPEN[17] * 6)
	s.add(MATHOPEN[8] == MATHOPEN[9] * 4)
	s.add(MATHOPEN[11] << 1 == MATHOPEN[13] * 3)
	s.add(MATHOPEN[13] + MATHOPEN[29] + MATHOPEN[11] + MATHOPEN[4] == MATHOPEN[19])
	s.add(MATHOPEN[10] == MATHOPEN[12] * 13)



def main():

	s = Solver()

	inp = []

	for i in range(30):
		b = BitVec("%d_i" % i, 32)
		inp.append(b)
		s.add(ULE(inp[i], 63))

	xor_res_list = xor_mod(inp)
	res1 = random_shuffle(xor_res_list)
	res2 = swap_more(res1)

	s.add(Distinct(res2))
	
	ret_num = get_checksum(res2)

	s.add(res2[28] == ret_num )

	final_conds(res2, s)

	print s.check()


	if s.check() == sat:
		sol = s.model()
		flag = []
		for i in range(len(inp)):
			c = inp[i]
			flag.append(int(str(sol[c])))
		print flag
		print decode_inp(flag)


if __name__ == "__main__":
	main()