package com.dark;


import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.*;
import org.objectweb.asm.Type;

class Debugger extends ClassVisitor implements Opcodes {
	
	
    public Debugger(final ClassVisitor cv) {
        super(ASM7, cv);
    }

    @Override
    public MethodVisitor visitMethod(final int access, final String name,
            final String desc, final String signature, final String[] exceptions) {
        MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
        return mv == null ? null : new MethodAdapter(mv);
    }
    

    
    
}

class MethodAdapter extends MethodVisitor implements Opcodes {

    public MethodAdapter(final MethodVisitor mv) {
        super(ASM7, mv);
    }
    
    @Override
    public void visitVarInsn(int opcode, int var) {
    	super.visitVarInsn(opcode, var);
    	
        if (opcode == ISTORE && var == 1) {
        	mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        	mv.visitVarInsn(ILOAD, 1);
        	mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
        }
    } 

    
    //mv.visitFieldInsn(PUTSTATIC, "me/nov/crackme/CrackMe", "fun", "C");
    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {

    	super.visitFieldInsn(opcode, owner, name, descriptor);
    	if(opcode == PUTSTATIC && name.equals("fun")) {
    		//System.out.println(opcode + " " + owner + " " +  name + " " + descriptor);
           	mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        	mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        	mv.visitInsn(DUP);
        	mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        	mv.visitLdcInsn("Crackme.fun = ");
        	mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
    		
        	mv.visitFieldInsn(GETSTATIC, "me/nov/crackme/CrackMe", "fun", "C");
        	
        	mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        	mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        	mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);  
    	}
    } 
    
 
    
    
}