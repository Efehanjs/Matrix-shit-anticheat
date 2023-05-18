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
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ef {
  @NotNull
  private final String b;
  
  @NotNull
  private final bd i;
  
  private static String[] a;
  
  private static final long c = o3.a(-2010417988533997531L, 2425007002255558072L, MethodHandles.lookup().lookupClass()).a(222212005268277L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @NotNull
  public final ef b(@NotNull String paramString, @NotNull bd parambd) {
    return new ef(paramString, parambd);
  }
  
  public ef(@NotNull String paramString, @NotNull bd parambd) {
    this.b = paramString;
    this.i = parambd;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ef.c : J
    //   3: ldc2_w 111846346016289
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #4473
    //   18: ldc2_w 1413257233392767091
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield b : Ljava/lang/String;
    //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: sipush #24851
    //   41: ldc2_w 1919275523989004312
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield i : Lme/rerere/matrix/internal/bd;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: bipush #41
    //   63: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: areturn
  }
  
  @NotNull
  public final bd j() {
    return this.i;
  }
  
  public int hashCode() {
    null = this.b.hashCode();
    return null * 31 + this.i.hashCode();
  }
  
  @NotNull
  public final String j() {
    return this.b;
  }
  
  @NotNull
  public final bd b() {
    return this.i;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    long l = c ^ 0x5E7B94D63B0FL;
    int i = yl.a();
    try {
      if (i == 0)
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
      if (i == 0)
        try {
          if (!(paramObject instanceof ef))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ef ef1 = (ef)paramObject;
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.b, ef1.b))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.i != ef1.i)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final String b() {
    return this.b;
  }
  
  public static void m(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] U() {
    return a;
  }
  
  static {
    long l = c ^ 0x309D5A40D12L;
    m(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "Ez/\bÇg3Ä\032Ðbf\030Ûú,¹úÂlÞ]\013í\007!\020t¸ÝÌ\002Ç®").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x255C;
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
        throw new RuntimeException("me/rerere/matrix/internal/ef", exception);
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
    //   49: goto -> 102
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc 'me/rerere/matrix/internal/ef'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */