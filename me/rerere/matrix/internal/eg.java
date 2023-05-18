package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class eg {
  @NotNull
  public static final eg b;
  
  @NotNull
  private static final SecureRandom i;
  
  private static final long a = o3.a(-3420520681411757502L, 5551561455040869969L, MethodHandles.lookup().lookupClass()).a(126094876084229L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public final String j(@NotNull String paramString1, long paramLong, @NotNull String paramString2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/eg.a : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: sipush #4047
    //   9: ldc2_w 5420955881152981992
    //   12: lload_2
    //   13: lxor
    //   14: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   19: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   22: astore #5
    //   24: new javax/crypto/spec/SecretKeySpec
    //   27: dup
    //   28: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   31: aload #4
    //   33: invokevirtual decode : (Ljava/lang/String;)[B
    //   36: sipush #4047
    //   39: ldc2_w 5420955881152981992
    //   42: lload_2
    //   43: lxor
    //   44: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   49: invokespecial <init> : ([BLjava/lang/String;)V
    //   52: astore #6
    //   54: aload #5
    //   56: iconst_1
    //   57: aload #6
    //   59: checkcast java/security/Key
    //   62: invokevirtual init : (ILjava/security/Key;)V
    //   65: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   68: aload #5
    //   70: aload_1
    //   71: astore #7
    //   73: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   76: aload #7
    //   78: swap
    //   79: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   82: dup
    //   83: sipush #22565
    //   86: ldc2_w 1323873931914705920
    //   89: lload_2
    //   90: lxor
    //   91: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   96: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   99: invokevirtual doFinal : ([B)[B
    //   102: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   105: areturn
  }
  
  static {
    long l = a ^ 0x2669DBA9FC5L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "vÄÉ)©{D°¶efGö\020\021KQÍC£\\·¼A\026\bÌsP·(â3\035\027\003³4\nß\nz\036\036Ämoø#M<ÆÌuª:û.\020Úï®Pu;Ô/z\b\f\024?XB{R Úò¥¹_Æ!\\jýÚ\035\006\0078X\0200").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public final String b(@NotNull String paramString1, @NotNull String paramString2, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/eg.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: sipush #30295
    //   9: ldc2_w 1555049903945992620
    //   12: lload_3
    //   13: lxor
    //   14: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   19: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   22: astore #5
    //   24: new javax/crypto/spec/SecretKeySpec
    //   27: dup
    //   28: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   31: aload_2
    //   32: invokevirtual decode : (Ljava/lang/String;)[B
    //   35: sipush #4047
    //   38: ldc2_w 5421010869030891573
    //   41: lload_3
    //   42: lxor
    //   43: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   48: invokespecial <init> : ([BLjava/lang/String;)V
    //   51: astore #6
    //   53: aload #5
    //   55: iconst_2
    //   56: aload #6
    //   58: checkcast java/security/Key
    //   61: invokevirtual init : (ILjava/security/Key;)V
    //   64: new java/lang/String
    //   67: dup
    //   68: aload #5
    //   70: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   73: aload_1
    //   74: invokevirtual decode : (Ljava/lang/String;)[B
    //   77: invokevirtual doFinal : ([B)[B
    //   80: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   83: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   86: areturn
  }
  
  @NotNull
  public final String b(int paramInt1, int paramInt2, byte paramByte) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #40
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #56
    //   18: lshl
    //   19: bipush #56
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/eg.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: iconst_0
    //   30: istore #8
    //   32: invokestatic r : ()I
    //   35: bipush #32
    //   37: newarray byte
    //   39: astore #9
    //   41: istore #6
    //   43: iload #8
    //   45: bipush #32
    //   47: if_icmpge -> 97
    //   50: iload #8
    //   52: istore #10
    //   54: aload #9
    //   56: iload #6
    //   58: iload_2
    //   59: ifle -> 67
    //   62: ifeq -> 99
    //   65: iload #10
    //   67: getstatic me/rerere/matrix/internal/eg.i : Ljava/security/SecureRandom;
    //   70: sipush #256
    //   73: invokevirtual nextInt : (I)I
    //   76: i2b
    //   77: bastore
    //   78: iinc #8, 1
    //   81: iload #6
    //   83: ifne -> 43
    //   86: iload_3
    //   87: iflt -> 54
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload #9
    //   99: astore #7
    //   101: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   104: aload #7
    //   106: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   109: areturn
    // Exception table:
    //   from	to	target	type
    //   54	86	93	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2B52;
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
        throw new RuntimeException("me/rerere/matrix/internal/eg", exception);
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
    //   49: goto -> 103
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc_w 'me/rerere/matrix/internal/eg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\eg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */