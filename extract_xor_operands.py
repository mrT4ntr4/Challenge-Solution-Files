import re

filedata = open("jeb2_decompiled_code.java").read().split("\n")

desired_lines1, desired_lines2 = filedata[0::10], filedata[7::10]

for x,y in zip(desired_lines1, desired_lines2):
	x = re.search(r"Object (.*)\(Object", x).group(1)
	y = re.search(r"\(new Object\[\]\{\(\(int\)\(v5 \^ (.*)\)\)\}\);", y).group(1)
	if '0x' in y:
		y = int(y,16)
	
	print x,":",y