package com.dark;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;



class FilteringTransformer implements ClassFileTransformer{
    public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException {
    	//System.out.println(s);
        if ("me/nov/crackme/CrackMe".equals(s)) {
            // ASM Code
        	
            ClassReader reader = new ClassReader(bytes);
            ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_FRAMES);
            Debugger visitor = new Debugger(writer);
            reader.accept(visitor, 0);

            return writer.toByteArray();

        }

        return null;
    }
}


public class Agent {

    public static void premain(String agentArgs, Instrumentation inst) {
        //inst.addTransformer(new ClassFileTransformer());
        
        inst.addTransformer(new FilteringTransformer());
    }

}