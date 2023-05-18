package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import me.rerere.matrix.thirdparty.org.objectweb.asm.MethodVisitor;

public final class bg extends MethodVisitor {
  private boolean i;
  
  private static final long a = o3.a(8105113737028689033L, -3854047265150382811L, MethodHandles.lookup().lookupClass()).a(1958002598066L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public bg(@Nullable MethodVisitor paramMethodVisitor) {
    super(589824, paramMethodVisitor);
  }
  
  public void visitLdcInsn(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bg.a : J
    //   3: ldc2_w 93173810434706
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: instanceof java/lang/Double
    //   17: iload #4
    //   19: ifne -> 119
    //   22: ifeq -> 115
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aload_1
    //   33: checkcast java/lang/Number
    //   36: invokevirtual doubleValue : ()D
    //   39: ldc2_w 0.00390625
    //   42: dcmpg
    //   43: iload #4
    //   45: ifne -> 66
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: ifne -> 69
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iconst_0
    //   70: ifeq -> 115
    //   73: aload_0
    //   74: getfield mv : Lme/rerere/matrix/thirdparty/org/objectweb/asm/MethodVisitor;
    //   77: ldc2_w -1.0
    //   80: invokestatic valueOf : (D)Ljava/lang/Double;
    //   83: invokevirtual visitLdcInsn : (Ljava/lang/Object;)V
    //   86: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   89: sipush #5192
    //   92: ldc2_w 5476839709656014342
    //   95: lload_2
    //   96: lxor
    //   97: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   102: invokevirtual info : (Ljava/lang/String;)V
    //   105: aload_0
    //   106: iconst_1
    //   107: putfield i : Z
    //   110: return
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: aload_1
    //   116: instanceof java/lang/Float
    //   119: iload #4
    //   121: ifne -> 157
    //   124: ifeq -> 236
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: aload_0
    //   135: iload #4
    //   137: ifne -> 237
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: getfield i : Z
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: ifeq -> 236
    //   160: aload_1
    //   161: checkcast java/lang/Number
    //   164: invokevirtual floatValue : ()F
    //   167: ldc 10.0
    //   169: fcmpg
    //   170: iload #4
    //   172: ifne -> 193
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   181: athrow
    //   182: ifne -> 196
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: iconst_1
    //   193: goto -> 197
    //   196: iconst_0
    //   197: ifeq -> 236
    //   200: aload_0
    //   201: getfield mv : Lme/rerere/matrix/thirdparty/org/objectweb/asm/MethodVisitor;
    //   204: ldc -1.0
    //   206: invokestatic valueOf : (F)Ljava/lang/Float;
    //   209: invokevirtual visitLdcInsn : (Ljava/lang/Object;)V
    //   212: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   215: sipush #878
    //   218: ldc2_w 5326087322722683169
    //   221: lload_2
    //   222: lxor
    //   223: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   228: invokevirtual info : (Ljava/lang/String;)V
    //   231: return
    //   232: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   235: athrow
    //   236: aload_0
    //   237: aload_1
    //   238: invokespecial visitLdcInsn : (Ljava/lang/Object;)V
    //   241: return
    // Exception table:
    //   from	to	target	type
    //   13	25	28	java/lang/RuntimeException
    //   22	48	51	java/lang/RuntimeException
    //   32	58	61	java/lang/RuntimeException
    //   70	111	111	java/lang/RuntimeException
    //   119	127	130	java/lang/RuntimeException
    //   124	140	143	java/lang/RuntimeException
    //   134	150	153	java/lang/RuntimeException
    //   157	175	178	java/lang/RuntimeException
    //   160	185	188	java/lang/RuntimeException
    //   197	232	232	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x2C4F097AE7A4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "kªX©Þºuk°`\017ÌWü´EçÇy\f®ªD/·ÝîãÕ\006N¿ð8£\"\000Ö_kr\026Ø\021\023QF â?Oa\023'%LqGÞdÃ>Æç\r¦p\035mX\025\025[9¼\017L®ë  Wûöé*ãûÄ©\007Yíè\bà\024òà)Ë\016\\\020Ä~üE71}=±\035\013²VêR`½=\013«/*Åê;Lüi¹+\024.è\035h¼\020®\021/Ö\002&^Rèß").length();
    byte b2 = 80;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4C96;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/bg", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc [Ljava/lang/Object;
    //   15: aload_2
    //   16: invokevirtual parameterCount : ()I
    //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   22: iconst_0
    //   23: iconst_3
    //   24: anewarray java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_3
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: aload_1
    //   38: aastore
    //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   42: aload_2
    //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   49: goto -> 102
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc 'me/rerere/matrix/internal/bg'
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w ' : '
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_1
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: ldc_w ' : '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_2
    //   87: invokevirtual toString : ()Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: aload #4
    //   98: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: aload_3
    //   103: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */