package me.nov.crackme;

import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import jeb.synthetic.InvokeCustoms;
import jeb.synthetic.PooledMethodTypes;

public class CrackMe {
    public static char fun;

    public static Object 0(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite0_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 10245(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite1_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 10310(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite2_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 10359(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite3_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 11024(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite4_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 11208(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite5_24(new Object[]{((int)(v5 ^ 24))});
    }

    public static Object 11394(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite6_200(new Object[]{((int)(v5 ^ 200))});
    }

    public static Object 11775(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite7_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 12009(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite8_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 12071(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite9_156(new Object[]{((int)(v5 ^ 0x9C))});
    }

    public static Object 1217(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite10_36(new Object[]{((int)(v5 ^ 36))});
    }

    public static Object 12505(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite11_220(new Object[]{((int)(v5 ^ 220))});
    }

    public static Object 12531(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite12_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 12689(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite13_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 127(Object[] arg8) {
        try {
            char v3 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * arg8[0].toString().hashCode() * 32767 << 3 | 127) & 127);
            if(Thread.currentThread().getStackTrace().length > 127) {
                return v3 > 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }

            return new MutableCallSite(((MethodHandles.Lookup)arg8[0]).findStatic(CrackMe.class, String.valueOf(CrackMe.fun), ((MethodType)arg8[3])));
        }
        catch(Throwable unused_ex) {
            return CrackMe.0(new Object[]{arg8[3].toString()});
        }
    }

    public static Object 13158(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite14_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 13529(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite15_24(new Object[]{((int)(v5 ^ 24))});
    }

    public static Object 13910(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite16_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 13946(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite17_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 14071(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite18_36(new Object[]{((int)(v5 ^ 36))});
    }

    public static Object 14256(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite19_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 14643(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite20_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 14981(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite21_132(new Object[]{((int)(v5 ^ 0x84))});
    }

    public static Object 15004(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite22_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 15021(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite23_20(new Object[]{((int)(v5 ^ 20))});
    }

    public static Object 15170(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite24_232(new Object[]{((int)(v5 ^ 0xE8))});
    }

    public static Object 15725(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite25_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 15889(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite26_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 15903(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite27_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 15999(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite28_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 16632(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite29_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 17038(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite30_132(new Object[]{((int)(v5 ^ 0x84))});
    }

    public static Object 1721(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite31_44(new Object[]{((int)(v5 ^ 44))});
    }

    public static Object 17270(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite32_44(new Object[]{((int)(v5 ^ 44))});
    }

    public static Object 17362(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite33_156(new Object[]{((int)(v5 ^ 0x9C))});
    }

    public static Object 17470(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite34_164(new Object[]{((int)(v5 ^ 0xA4))});
    }

    public static Object 17594(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite35_216(new Object[]{((int)(v5 ^ 0xD8))});
    }

    public static Object 18318(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite36_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 18415(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite37_124(new Object[]{((int)(v5 ^ 0x7C))});
    }

    public static Object 18642(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite38_12(new Object[]{((int)(v5 ^ 12))});
    }

    public static Object 18809(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite39_152(new Object[]{((int)(v5 ^ 0x98))});
    }

    public static Object 18943(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite40_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 1914(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite41_20(new Object[]{((int)(v5 ^ 20))});
    }

    public static Object 19300(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite42_20(new Object[]{((int)(v5 ^ 20))});
    }

    public static Object 19493(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite43_232(new Object[]{((int)(v5 ^ 0xE8))});
    }

    public static Object 19699(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite44_200(new Object[]{((int)(v5 ^ 200))});
    }

    public static Object 19813(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite45_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 20069(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite46_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 20753(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite47_228(new Object[]{((int)(v5 ^ 0xE4))});
    }

    public static Object 21238(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite48_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 21380(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite49_208(new Object[]{((int)(v5 ^ 0xD0))});
    }

    public static Object 21522(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite50_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 21855(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite51_220(new Object[]{((int)(v5 ^ 220))});
    }

    public static Object 21867(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite52_24(new Object[]{((int)(v5 ^ 24))});
    }

    public static Object 22095(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite53_208(new Object[]{((int)(v5 ^ 0xD0))});
    }

    public static Object 22909(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite54_120(new Object[]{((int)(v5 ^ 120))});
    }

    public static Object 22966(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite55_220(new Object[]{((int)(v5 ^ 220))});
    }

    public static Object 23046(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite56_124(new Object[]{((int)(v5 ^ 0x7C))});
    }

    public static Object 23167(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite57_124(new Object[]{((int)(v5 ^ 0x7C))});
    }

    public static Object 23469(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite58_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 23651(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite59_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 23762(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite60_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 23979(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite61_152(new Object[]{((int)(v5 ^ 0x98))});
    }

    public static Object 24112(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite62_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 24303(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite63_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 24352(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite64_72(new Object[]{((int)(v5 ^ 72))});
    }

    public static Object 24395(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite65_140(new Object[]{((int)(v5 ^ 140))});
    }

    public static Object 24440(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite66_200(new Object[]{((int)(v5 ^ 200))});
    }

    public static Object 2457(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite67_112(new Object[]{((int)(v5 ^ 0x70))});
    }

    public static Object 25087(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite68_208(new Object[]{((int)(v5 ^ 0xD0))});
    }

    public static Object 25167(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite69_4(new Object[]{((int)(v5 ^ 4))});
    }

    public static Object 25366(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite70_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 255(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite71_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 25592(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite72_148(new Object[]{((int)(v5 ^ 0x94))});
    }

    public static Object 25895(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite73_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 26142(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite74_148(new Object[]{((int)(v5 ^ 0x94))});
    }

    public static Object 26206(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite75_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 26442(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite76_200(new Object[]{((int)(v5 ^ 200))});
    }

    public static Object 26746(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite77_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 2697(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite78_248(new Object[]{((int)(v5 ^ 0xF8))});
    }

    public static Object 27153(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite79_216(new Object[]{((int)(v5 ^ 0xD8))});
    }

    public static Object 27647(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite80_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 27728(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite81_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 27903(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite82_228(new Object[]{((int)(v5 ^ 0xE4))});
    }

    public static Object 28356(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite83_72(new Object[]{((int)(v5 ^ 72))});
    }

    public static Object 28537(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite84_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 29070(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite85_248(new Object[]{((int)(v5 ^ 0xF8))});
    }

    public static Object 29177(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite86_216(new Object[]{((int)(v5 ^ 0xD8))});
    }

    public static Object 29329(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite87_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 29648(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite88_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 29760(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite89_88(new Object[]{((int)(v5 ^ 88))});
    }

    public static Object 30695(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite90_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 30827(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite91_0(new Object[]{((int)(v5 ^ 0))});
    }

    public static Object 31246(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite92_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 31314(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite93_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 31533(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite94_100(new Object[]{((int)(v5 ^ 100))});
    }

    public static Object 31709(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite95_248(new Object[]{((int)(v5 ^ 0xF8))});
    }

    public static Object 31797(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite96_100(new Object[]{((int)(v5 ^ 100))});
    }

    public static Object 32014(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite97_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 32263(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite98_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 32384(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite99_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 32681(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite100_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 32815(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite101_76(new Object[]{((int)(v5 ^ 76))});
    }

    public static Object 32896(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite102_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 32937(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite103_8(new Object[]{((int)(v5 ^ 8))});
    }

    public static Object 3300(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite104_128(new Object[]{((int)(v5 ^ 0x80))});
    }

    public static Object 33201(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite105_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 33323(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite106_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 33467(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite107_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 33511(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite108_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 34315(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite109_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 34374(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite110_4(new Object[]{((int)(v5 ^ 4))});
    }

    public static Object 35511(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite111_116(new Object[]{((int)(v5 ^ 0x74))});
    }

    public static Object 35812(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite112_100(new Object[]{((int)(v5 ^ 100))});
    }

    public static Object 36141(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite113_148(new Object[]{((int)(v5 ^ 0x94))});
    }

    public static Object 36234(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite114_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 36256(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite115_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 36382(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite116_216(new Object[]{((int)(v5 ^ 0xD8))});
    }

    public static Object 36556(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite117_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 37137(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite118_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 37298(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite119_12(new Object[]{((int)(v5 ^ 12))});
    }

    public static Object 37790(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite120_216(new Object[]{((int)(v5 ^ 0xD8))});
    }

    public static Object 37918(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite121_16(new Object[]{((int)(v5 ^ 16))});
    }

    public static Object 37995(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite122_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 38143(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite123_148(new Object[]{((int)(v5 ^ 0x94))});
    }

    public static Object 38435(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite124_124(new Object[]{((int)(v5 ^ 0x7C))});
    }

    public static Object 38867(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite125_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 38940(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite126_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 38974(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite127_124(new Object[]{((int)(v5 ^ 0x7C))});
    }

    public static Object 39041(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite128_36(new Object[]{((int)(v5 ^ 36))});
    }

    public static Object 39108(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite129_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 39166(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite130_20(new Object[]{((int)(v5 ^ 20))});
    }

    public static Object 39309(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite131_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 3994(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite132_188(new Object[]{((int)(v5 ^ 0xBC))});
    }

    public static Object 40355(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite133_228(new Object[]{((int)(v5 ^ 0xE4))});
    }

    public static Object 40726(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite134_68(new Object[]{((int)(v5 ^ 68))});
    }

    public static Object 40791(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite135_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 40986(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite136_84(new Object[]{((int)(v5 ^ 84))});
    }

    public static Object 41166(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite137_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 41503(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite138_212(new Object[]{((int)(v5 ^ 0xD4))});
    }

    public static Object 42447(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite139_220(new Object[]{((int)(v5 ^ 220))});
    }

    public static Object 42534(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite140_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 42704(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite141_204(new Object[]{((int)(v5 ^ 204))});
    }

    public static Object 43135(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite142_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 43263(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite143_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 43521(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite144_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 43557(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite145_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 43730(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite146_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 43779(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite147_152(new Object[]{((int)(v5 ^ 0x98))});
    }

    public static Object 44178(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite148_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 44677(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite149_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 44734(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite150_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 44797(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite151_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 44943(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite152_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 45007(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite153_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 4535(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite154_180(new Object[]{((int)(v5 ^ 180))});
    }

    public static Object 45966(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite155_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 462(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite156_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 46337(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite157_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 46396(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite158_72(new Object[]{((int)(v5 ^ 72))});
    }

    public static Object 4647(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite159_172(new Object[]{((int)(v5 ^ 0xAC))});
    }

    public static Object 46528(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite160_220(new Object[]{((int)(v5 ^ 220))});
    }

    public static Object 46979(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite161_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 47000(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite162_140(new Object[]{((int)(v5 ^ 140))});
    }

    public static Object 47533(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite163_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 47846(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite164_228(new Object[]{((int)(v5 ^ 0xE4))});
    }

    public static Object 47921(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite165_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 47948(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite166_24(new Object[]{((int)(v5 ^ 24))});
    }

    public static Object 48207(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite167_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 48557(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite168_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 48726(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite169_100(new Object[]{((int)(v5 ^ 100))});
    }

    public static Object 48975(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite170_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 48996(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite171_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 49636(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite172_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 49667(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite173_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 50383(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite174_116(new Object[]{((int)(v5 ^ 0x74))});
    }

    public static Object 5078(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite175_16(new Object[]{((int)(v5 ^ 16))});
    }

    public static Object 51030(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite176_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 51358(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite177_152(new Object[]{((int)(v5 ^ 0x98))});
    }

    public static Object 51578(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite178_152(new Object[]{((int)(v5 ^ 0x98))});
    }

    public static Object 51583(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite179_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 51692(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite180_116(new Object[]{((int)(v5 ^ 0x74))});
    }

    public static Object 51702(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite181_76(new Object[]{((int)(v5 ^ 76))});
    }

    public static Object 52032(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite182_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 52101(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite183_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 52184(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite184_64(new Object[]{((int)(v5 ^ 64))});
    }

    public static Object 52396(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite185_244(new Object[]{((int)(v5 ^ 244))});
    }

    public static Object 52500(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite186_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 52530(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite187_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 52538(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite188_76(new Object[]{((int)(v5 ^ 76))});
    }

    public static Object 52556(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite189_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 5256(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite190_136(new Object[]{((int)(v5 ^ 0x88))});
    }

    public static Object 52931(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite191_24(new Object[]{((int)(v5 ^ 24))});
    }

    public static Object 5311(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite192_136(new Object[]{((int)(v5 ^ 0x88))});
    }

    public static Object 53184(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite193_4(new Object[]{((int)(v5 ^ 4))});
    }

    public static Object 53275(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite194_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 53324(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite195_228(new Object[]{((int)(v5 ^ 0xE4))});
    }

    public static Object 53564(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite196_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 53774(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite197_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 53887(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite198_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 54212(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite199_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 54764(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite200_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 55039(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite201_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 55295(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite202_200(new Object[]{((int)(v5 ^ 200))});
    }

    public static Object 55342(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite203_124(new Object[]{((int)(v5 ^ 0x7C))});
    }

    public static Object 55359(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite204_100(new Object[]{((int)(v5 ^ 100))});
    }

    public static Object 55375(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite205_252(new Object[]{((int)(v5 ^ 0xFC))});
    }

    public static Object 55774(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite206_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 55938(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite207_136(new Object[]{((int)(v5 ^ 0x88))});
    }

    public static Object 5594(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite208_84(new Object[]{((int)(v5 ^ 84))});
    }

    public static Object 56138(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite209_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 56452(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite210_192(new Object[]{((int)(v5 ^ 0xC0))});
    }

    public static Object 56564(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite211_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 5680(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite212_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 56816(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite213_144(new Object[]{((int)(v5 ^ 0x90))});
    }

    public static Object 57016(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite214_116(new Object[]{((int)(v5 ^ 0x74))});
    }

    public static Object 57107(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite215_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 57508(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite216_212(new Object[]{((int)(v5 ^ 0xD4))});
    }

    public static Object 5751(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite217_136(new Object[]{((int)(v5 ^ 0x88))});
    }

    public static Object 57569(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite218_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 57611(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite219_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 57779(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite220_100(new Object[]{((int)(v5 ^ 100))});
    }

    public static Object 57796(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite221_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 58153(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite222_208(new Object[]{((int)(v5 ^ 0xD0))});
    }

    public static Object 59099(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite223_80(new Object[]{((int)(v5 ^ 80))});
    }

    public static Object 59380(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite224_36(new Object[]{((int)(v5 ^ 36))});
    }

    public static Object 59406(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite225_40(new Object[]{((int)(v5 ^ 40))});
    }

    public static Object 59575(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite226_132(new Object[]{((int)(v5 ^ 0x84))});
    }

    public static Object 59829(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite227_212(new Object[]{((int)(v5 ^ 0xD4))});
    }

    public static Object 59875(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite228_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 60282(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite229_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 60756(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite230_8(new Object[]{((int)(v5 ^ 8))});
    }

    public static Object 61041(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite231_56(new Object[]{((int)(v5 ^ 56))});
    }

    public static Object 61087(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite232_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 6139(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite233_60(new Object[]{((int)(v5 ^ 60))});
    }

    public static Object 61428(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite234_196(new Object[]{((int)(v5 ^ 0xC4))});
    }

    public static Object 61495(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite235_236(new Object[]{((int)(v5 ^ 0xEC))});
    }

    public static Object 61565(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite236_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 61664(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite237_92(new Object[]{((int)(v5 ^ 92))});
    }

    public static Object 61703(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite238_196(new Object[]{((int)(v5 ^ 0xC4))});
    }

    public static Object 61839(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite239_52(new Object[]{((int)(v5 ^ 52))});
    }

    public static Object 62288(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite240_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 62561(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite241_48(new Object[]{((int)(v5 ^ 0x30))});
    }

    public static Object 62614(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite242_76(new Object[]{((int)(v5 ^ 76))});
    }

    public static Object 62719(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite243_180(new Object[]{((int)(v5 ^ 180))});
    }

    public static Object 6273(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite244_160(new Object[]{((int)(v5 ^ 160))});
    }

    public static Object 62991(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite245_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 63(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 127);
        if(Thread.currentThread().getStackTrace().length < 127) {
            return v5 > 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite246_204(new Object[]{((int)(v5 ^ 204))});
    }

    public static Object 63231(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite247_116(new Object[]{((int)(v5 ^ 0x74))});
    }

    public static Object 63256(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite248_168(new Object[]{((int)(v5 ^ 0xA8))});
    }

    public static Object 63670(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite249_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 63882(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite250_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 64009(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite251_84(new Object[]{((int)(v5 ^ 84))});
    }

    public static Object 64051(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite252_72(new Object[]{((int)(v5 ^ 72))});
    }

    public static Object 64127(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite253_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 64191(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite254_20(new Object[]{((int)(v5 ^ 20))});
    }

    public static Object 64625(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite255_84(new Object[]{((int)(v5 ^ 84))});
    }

    public static Object 64934(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite256_144(new Object[]{((int)(v5 ^ 0x90))});
    }

    public static Object 65018(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite257_32(new Object[]{((int)(v5 ^ 0x20))});
    }

    public static Object 65155(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite258_184(new Object[]{((int)(v5 ^ 0xB8))});
    }

    public static Object 6544(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite259_68(new Object[]{((int)(v5 ^ 68))});
    }

    public static Object 6640(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite260_16(new Object[]{((int)(v5 ^ 16))});
    }

    public static Object 6740(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite261_204(new Object[]{((int)(v5 ^ 204))});
    }

    public static Object 6866(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite262_120(new Object[]{((int)(v5 ^ 120))});
    }

    public static Object 6956(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite263_112(new Object[]{((int)(v5 ^ 0x70))});
    }

    public static Object 7039(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite264_68(new Object[]{((int)(v5 ^ 68))});
    }

    public static Object 7127(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite265_196(new Object[]{((int)(v5 ^ 0xC4))});
    }

    public static Object 7205(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite266_128(new Object[]{((int)(v5 ^ 0x80))});
    }

    public static Object 7334(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite267_204(new Object[]{((int)(v5 ^ 204))});
    }

    public static Object 740(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite268_116(new Object[]{((int)(v5 ^ 0x74))});
    }

    public static Object 8392(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite269_176(new Object[]{((int)(v5 ^ 0xB0))});
    }

    public static Object 8489(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite270_204(new Object[]{((int)(v5 ^ 204))});
    }

    public static Object 8591(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite271_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 896(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite272_108(new Object[]{((int)(v5 ^ 108))});
    }

    public static Object 8963(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite273_136(new Object[]{((int)(v5 ^ 0x88))});
    }

    public static Object 9828(Object[] arg5) {
        char v5 = (char)((Thread.currentThread().getStackTrace()[2].getMethodName().hashCode() * Integer.parseInt(arg5[0].toString()) * 32767 << 3 | 127) & 65535);
        if(Thread.currentThread().getStackTrace().length > 127) {
            return v5 >= 127 ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }

        CrackMe.fun = new String(new String(new char[]{v5}).getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8).charAt(0);
        return InvokeCustoms.CallSite274_44(new Object[]{((int)(v5 ^ 44))});
    }

    public static void main(String[] arg19) throws InterruptedException {
        int v4_4;
        byte[] v8_1;
        int v5_2;
        String[] v9_1;
        int[] v6_1;
        int v0_5;
        int v4_2;
        int[] v5_1;
        String[] v8;
        int v0_3;
        int i;
        String[] v5;
        long myinput;
        String[] v1 = arg19;
        if(v1.length != 1) {
            System.out.println("Welcome to noverify\'s crackme! Please enter a numeric 64-bit key to play! The goal is to find a valid key!");
            return;
        }

        try {
            myinput = Long.parseLong(v1[0]);
        }
        catch(Throwable unused_ex) {
            System.out.println("Invalid key!");
            return;
        }

        byte[] arr1 = new byte[5];
        byte[] arr2 = new byte[3];
        arr2[2] = (byte)(((int)((myinput >> 0 & 15L | (myinput >> 0x20 & 15L) << 4) & 0xFFL)));
        arr1[2] = (byte)(((int)((myinput >> 20 & 15L | (myinput >> 52 & 15L) << 4) & 0xFFL)));
        arr1[4] = (byte)(((int)((myinput >> 16 & 15L | (myinput >> 0x30 & 15L) << 4) & 0xFFL)));
        arr1[1] = (byte)(((int)((myinput >> 4 & 15L | (myinput >> 36 & 15L) << 4) & 0xFFL)));
        arr2[1] = (byte)(((int)((myinput >> 8 & 15L | (myinput >> 40 & 15L) << 4) & 0xFFL)));
        arr1[0] = (byte)(((int)((myinput >> 28 & 15L | (myinput >> 60 & 15L) << 4) & 0xFFL)));
        arr2[0] = (byte)(((int)((myinput >> 24 & 15L | (myinput >> 56 & 15L) << 4) & 0xFFL)));
        arr1[3] = (byte)(((int)((myinput >> 12 & 15L | (myinput >> 44 & 15L) << 4) & 0xFFL)));
        int[] v4_1 = new int[0x100];
        try {
            __monitor_exit(arg19);
            __monitor_enter(arg19);
        }
        catch(Throwable v0) {
            goto label_126;
        }

        goto label_132;
    label_126:
        if(v0.getCause() == null) {
            v5 = arg19;
            i = 0;
        }
        else {
        label_132:
            v5 = arg19;
            i = 0;
        label_135:
            v4_1[i] = i;
            ++i;
        }

        if(i < 0x100) {
            goto label_135;
        }

        try {
            __monitor_exit(v5);
            __monitor_enter(v5);
        }
        catch(Throwable v0_2) {
            goto label_144;
        }

        goto label_152;
    label_144:
        if(v0_2.getCause() == null) {
            v0_3 = 0;
            v8 = v5;
            v5_1 = v4_1;
            v4_2 = 0;
        }
        else {
        label_152:
            v0_3 = 0;
            v8 = v5;
            v5_1 = v4_1;
            v4_2 = 0;
        label_157:
            v4_2 = (v4_2 + v5_1[v0_3] + arr1[v0_3 % arr1.length] & 0xFF) % 0x100;
            int v9 = v5_1[v0_3];
            v5_1[v0_3] = v5_1[v4_2];
            v5_1[v4_2] = v9;
            ++v0_3;
        }

        if(v0_3 < 0x100) {
            goto label_157;
        }

        byte[] v4_3 = new byte[arr2.length];
        try {
            __monitor_exit(PooledMethodTypes.Entry8());
            __monitor_enter(v8);
        }
        catch(Throwable v0_4) {
            goto label_180;
        }

        goto label_190;
    label_180:
        if(v0_4.getCause() == null) {
            v0_5 = 0;
            v6_1 = v5_1;
            v9_1 = v8;
            v5_2 = 0;
            v8_1 = v4_3;
            v4_4 = 0;
        }
        else {
        label_190:
            v0_5 = 0;
            v6_1 = v5_1;
            v9_1 = v8;
            v5_2 = 0;
            v8_1 = v4_3;
            v4_4 = 0;
        label_197:
            v5_2 = (v5_2 + 1) % 0x100;
            v4_4 = (v4_4 + v6_1[v5_2]) % 0x100;
            int v10 = v6_1[v5_2];
            v6_1[v5_2] = v6_1[v4_4];
            v6_1[v4_4] = v10;
            v8_1[v0_5] = (byte)(v6_1[(v6_1[v5_2] + v6_1[v4_4]) % 0x100] ^ arr2[v0_5]);
            ++v0_5;
        }

        if(v0_5 < arr2.length) {
            goto label_197;
        }

        long v4_5 = 500L;
        try {
            if(Boolean.valueOf(CrackMe.0(new Object[]{((int)Integer.parseInt(new String(arr2)))}).toString()).booleanValue()) {
                System.out.println("Congratulations, you found a right key!");
                System.out.println("Tell me if you liked it at twitter: @graxcoding");
                goto label_237;
            }

            goto label_245;
        }
        catch(Throwable unused_ex) {
            goto label_253;
        }

        try {
        label_237:
            __monitor_exit(v9_1);
            __monitor_enter(v9_1);
        }
        catch(Throwable v0_6) {
            goto label_242;
        }

        goto label_245;
    label_242:
        if(v0_6.getCause() != null) {
            try {
            label_245:
                System.out.println("Sorry, that\'s a wrong key!");
                System.out.println("Don\'t get lost in traces!");
                Thread.sleep(v4_5);
                goto label_262;
            }
            catch(Throwable unused_ex) {
            }

        label_253:
            System.out.println("Sorry, that\'s a wrong key!");
            System.out.println("Don\'t get lost in traces!");
            Thread.sleep(v4_5);
        }

    label_262:
        System.out.println();
        System.out.println("~Crackme by noverify 2020");
    }
}

