package me.rerere.matrix.misc.premium;

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
import me.rerere.matrix.internal.co;
import me.rerere.matrix.internal.dl;
import me.rerere.matrix.internal.eg;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.internal.yk;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Envelop {
  @NotNull
  private final String data;
  
  @NotNull
  public static final co Companion;
  
  @NotNull
  private final String key;
  
  private static int[] a;
  
  private static final long b = o3.a(-173356970114803782L, 4977097771917469409L, MethodHandles.lookup().lookupClass()).a(280054032732676L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public final String j(long paramLong, @NotNull String paramString) {
    paramLong = b ^ paramLong;
    int i = (int)((paramLong ^ 0x48922AAB5BD6L) >>> 32L);
    int j = (int)((paramLong ^ 0x48922AAB5BD6L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x48922AAB5BD6L) << 48L >>> 48L);
    paramLong ^ 0x48922AAB5BD6L;
    long l = paramLong ^ 0x791338D6D3ECL;
    String str = dl.i.j(i, (short)j, (char)k, this.key, paramString);
    return eg.b.b(this.data, str, l);
  }
  
  @NotNull
  public final String m() {
    return this.data;
  }
  
  static {
    j(new int[5]);
    long l = b ^ 0x10A7CF327D4FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "\r§Ù¡Y Ç§ÔêV\016=P2n®Sc2ñ\020s\025J\034Ï/¥Ã?àBMáê").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    long l = b ^ 0x53C67D0E5F70L;
    int[] arrayOfInt = g();
    try {
      if (arrayOfInt != null)
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
      if (arrayOfInt != null)
        try {
          if (!(paramObject instanceof Envelop))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Envelop envelop = (Envelop)paramObject;
    try {
      if (arrayOfInt != null)
        try {
          if (!Intrinsics.areEqual(this.key, envelop.key))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (arrayOfInt != null)
        try {
          if (!Intrinsics.areEqual(this.data, envelop.data))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final String p() {
    return this.key;
  }
  
  public int hashCode() {
    null = this.key.hashCode();
    return null * 31 + this.data.hashCode();
  }
  
  @NotNull
  public final Envelop b(@NotNull String paramString1, @NotNull String paramString2) {
    return new Envelop(paramString1, paramString2);
  }
  
  @NotNull
  public final String b(long paramLong, @NotNull String paramString, short paramShort) {
    long l1 = (paramLong << 16L | paramShort << 48L >>> 48L) ^ b;
    long l2 = l1 ^ 0x511CA883D133L;
    long l3 = l1 ^ 0x77AC407873FAL;
    String str = dl.i.m(this.key, l3, paramString);
    return eg.b.b(this.data, str, l2);
  }
  
  @NotNull
  public final String j() {
    return this.key;
  }
  
  public Envelop(@NotNull String paramString1, @NotNull String paramString2) {
    this.key = paramString1;
    this.data = paramString2;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/misc/premium/Envelop.b : J
    //   3: ldc2_w 85366709432334
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic g : ()[I
    //   11: astore_3
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: sipush #7232
    //   22: ldc2_w 61579453752780557
    //   25: lload_1
    //   26: lxor
    //   27: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: aload_0
    //   36: getfield key : Ljava/lang/String;
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: sipush #22677
    //   45: ldc2_w 8483663096032879577
    //   48: lload_1
    //   49: lxor
    //   50: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload_0
    //   59: getfield data : Ljava/lang/String;
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: bipush #41
    //   67: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   70: invokevirtual toString : ()Ljava/lang/String;
    //   73: aload_3
    //   74: ifnonnull -> 82
    //   77: ldc 'FXlE3'
    //   79: invokestatic p : (Ljava/lang/String;)V
    //   82: areturn
  }
  
  @NotNull
  public final String b() {
    return this.data;
  }
  
  public static void j(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] g() {
    return a;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5037;
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
        throw new RuntimeException("me/rerere/matrix/misc/premium/Envelop", exception);
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
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/misc/premium/Envelop'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\misc\premium\Envelop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */