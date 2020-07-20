import re

bytecode =  open('noverify_bytecode.java').read()

def repl1(m):
	xor_res = int(m.group(1)) ^ int(m.group(2))
	return re.sub(r"($)", "// "+ m.group(1) + " ^ "\
			+ m.group(2) + " = [" + str(xor_res) + "]"+ "\n\t\t\t "\
			, m.group())
 

def repl2(m):
	return re.sub(r"($)", "// "+ m.group(1) + " ^ " \
			+ m.group(1) + " = [0]" + "\n\t\t\t "\
			, m.group())


regex1 = r" {13}ldc (.*) \(java\.lang\.Integer\)\n"\
			+" {13}ldc (.*) \(java\.lang\.Integer\)\n {13}"

regex2 = r" {13}ldc (.*) \(java\.lang\.Integer\)\n {13}dup\n {13}"

got1 = re.sub(regex1, repl1, bytecode)
got2 = re.sub(regex2, repl2, got1)

out = open('formatted_bytecode.java', 'w')
out.write(got2)
out.close