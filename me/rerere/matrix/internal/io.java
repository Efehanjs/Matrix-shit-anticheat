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

public final class io {
  private final double v;
  
  private final double b;
  
  private final double i;
  
  private static String a;
  
  private static final long c = o3.a(-1685554407047851091L, -5900116646029321892L, MethodHandles.lookup().lookupClass()).a(272822703591037L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public int hashCode() {
    null = Double.hashCode(this.b);
    null = null * 31 + Double.hashCode(this.i);
    return null * 31 + Double.hashCode(this.v);
  }
  
  public final double t() {
    return this.i;
  }
  
  public final double h() {
    return this.v;
  }
  
  @NotNull
  public final io b(double paramDouble1, double paramDouble2, double paramDouble3) {
    return new io(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public final double m() {
    return this.v;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/io.c : J
    //   3: ldc2_w 87153617329636
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #28181
    //   18: ldc2_w 6337296768448785279
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield b : D
    //   35: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   38: sipush #25054
    //   41: ldc2_w 641013345272980662
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield i : D
    //   58: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   61: sipush #4809
    //   64: ldc2_w 2606146764628072354
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield v : D
    //   81: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   84: bipush #41
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: areturn
  }
  
  public io(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.b = paramDouble1;
    this.i = paramDouble2;
    this.v = paramDouble3;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    long l = c ^ 0x34CF6EAC80B8L;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (this == paramObject)
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (!(paramObject instanceof io))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    io io1 = (io)paramObject;
    try {
      if (i != 0)
        try {
          if (Double.compare(this.b, io1.b) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(this.i, io1.i) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(this.v, io1.v) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public final double p() {
    return this.b;
  }
  
  public final double j() {
    return this.i;
  }
  
  public final double b() {
    return this.b;
  }
  
  public static void h(String paramString) {
    a = paramString;
  }
  
  public static String u() {
    return a;
  }
  
  static {
    long l = c ^ 0x48C3FF138F1FL;
    h("Z4ZHSc");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "\036\fkêïÃ\020Øq7ø\021êCu\fÅøÅ~EÀD\003Rêjª1 ÞÛö³±v\020\024\007y°ð!lÓ^\035ûÐB±\020-,MHLÔÂ\004s\nþøÆú").length();
    byte b2 = 40;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7D6D;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/io", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   49: goto -> 103
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc_w 'me/rerere/matrix/internal/io'
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc_w ' : '
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_1
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc_w ' : '
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_2
    //   88: invokevirtual toString : ()Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: aload #4
    //   99: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   102: athrow
    //   103: aload_3
    //   104: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\io.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */