from z3 import *

s = Solver()
inp = BitVec('inp',64)

res1 = ((inp >> 24 & 15 | (inp >> 56 & 15) << 4)& 0xFF)
res2 = ((inp >> 8 & 15 | (inp >> 40 & 15) << 4)& 0xFF)
res3 = ((inp >> 0 & 15 | (inp >> 0x20 & 15) << 4)& 0xFF)

s.add(And(res1 >= 48,res1 <= 57))
s.add(And(res2 >= 48,res2 <= 57))
s.add(And(res3 >= 48,res3 <= 57))

got = (res1-48)*100 + (res2-48)*10 + (res3-48)
#got can be : 191, 465, 739

s.add(got == 191)

print s.check()
print s.model()
# Multiple solutions possible
'''
while s.check() == sat:
	solution = s.model()
	block = []
	c = inp
	print solution[c] 
	block.append(c != solution[c])
	s.add(Or(block))
'''