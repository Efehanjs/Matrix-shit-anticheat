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

public final class ii {
  private static final long a = o3.a(-8271332343551407419L, 3435428195425055370L, MethodHandles.lookup().lookupClass()).a(76168363816351L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public static final void b(int paramInt1, int paramInt2, char paramChar) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_1
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_2
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/ii.a : J
    //   26: lxor
    //   27: lstore_3
    //   28: lload_3
    //   29: dup2
    //   30: ldc2_w 136910372461197
    //   33: lxor
    //   34: lstore #5
    //   36: dup2
    //   37: ldc2_w 122139083161199
    //   40: lxor
    //   41: dup2
    //   42: bipush #16
    //   44: lushr
    //   45: lstore #7
    //   47: dup2
    //   48: bipush #48
    //   50: lshl
    //   51: bipush #48
    //   53: lushr
    //   54: l2i
    //   55: istore #9
    //   57: pop2
    //   58: dup2
    //   59: ldc2_w 119059394583802
    //   62: lxor
    //   63: dup2
    //   64: bipush #48
    //   66: lushr
    //   67: l2i
    //   68: istore #10
    //   70: dup2
    //   71: bipush #16
    //   73: lshl
    //   74: bipush #48
    //   76: lushr
    //   77: l2i
    //   78: istore #11
    //   80: dup2
    //   81: bipush #32
    //   83: lshl
    //   84: bipush #32
    //   86: lushr
    //   87: l2i
    //   88: istore #12
    //   90: pop2
    //   91: pop2
    //   92: getstatic me/rerere/matrix/internal/dl.i : Lme/rerere/matrix/internal/dl;
    //   95: iload #10
    //   97: i2s
    //   98: iload #11
    //   100: i2c
    //   101: iload #12
    //   103: invokevirtual b : (SCI)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   106: astore #13
    //   108: aload #13
    //   110: invokevirtual component1 : ()Ljava/lang/Object;
    //   113: checkcast java/lang/String
    //   116: astore #14
    //   118: aload #13
    //   120: invokevirtual component2 : ()Ljava/lang/Object;
    //   123: checkcast java/lang/String
    //   126: astore #15
    //   128: new java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: sipush #28029
    //   138: ldc2_w 2029698280974961072
    //   141: lload_3
    //   142: lxor
    //   143: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload #14
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual toString : ()Ljava/lang/String;
    //   159: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   162: swap
    //   163: invokevirtual println : (Ljava/lang/Object;)V
    //   166: new java/lang/StringBuilder
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: sipush #14247
    //   176: ldc2_w 3752544242433266537
    //   179: lload_3
    //   180: lxor
    //   181: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: aload #15
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   200: swap
    //   201: invokevirtual println : (Ljava/lang/Object;)V
    //   204: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   207: invokevirtual println : ()V
    //   210: getstatic me/rerere/matrix/misc/premium/Envelop.Companion : Lme/rerere/matrix/internal/co;
    //   213: lload #5
    //   215: sipush #17573
    //   218: ldc2_w 484704454495985770
    //   221: lload_3
    //   222: lxor
    //   223: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   228: aload #14
    //   230: invokevirtual j : (JLjava/lang/String;Ljava/lang/String;)Lme/rerere/matrix/misc/premium/Envelop;
    //   233: astore #16
    //   235: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   238: aload #16
    //   240: invokevirtual println : (Ljava/lang/Object;)V
    //   243: aload #16
    //   245: lload #7
    //   247: aload #15
    //   249: iload #9
    //   251: i2s
    //   252: invokevirtual b : (JLjava/lang/String;S)Ljava/lang/String;
    //   255: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   258: swap
    //   259: invokevirtual println : (Ljava/lang/Object;)V
    //   262: return
  }
  
  static {
    long l = a ^ 0x307AFCB1E2AFL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "^\017\0343r­§\025Ó¹ýôåækÙãû4Ã\006©\007)¼\007½2Ñô_Ã\0042Õ\026>¥(:~@\036\013\fZ¢M\032½Üuông*\017\020,\027e;éÝDxTMCÝ¦ìêw\020\003³Õ¾È_=1q\025B\037\bk]\033").length();
    byte b2 = 64;
    byte b = -1;
    while (true);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x52E2;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ii", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   65: ldc 'me/rerere/matrix/internal/ii'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */