package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class mc {
  private static final Base64.Decoder v;
  
  private static final Base64.Encoder b;
  
  @NotNull
  public static final mc i;
  
  private static final long a = o3.a(-4135546678102801123L, -201252692133422456L, MethodHandles.lookup().lookupClass()).a(244001464878942L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  static {
    long l = a ^ 0x24B6C9217320L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "Y.w¢xÃ¾=Öåd^Ó0<m£÷?Ã®8¸ïu\013ªÍ`Rg±F*ÖÇ<Sw%&Ì,¤¸Û\034Þìýê\rà{\017ã(áË\r\fyßtë¬'¿ðóËre[F\021e÷Ï®0õ\031¿ýs½é\026+\021\025\n").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public final String j(char paramChar1, @Nullable String paramString1, @Nullable String paramString2, char paramChar2, int paramInt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload #4
    //   7: i2l
    //   8: bipush #48
    //   10: lshl
    //   11: bipush #16
    //   13: lushr
    //   14: lor
    //   15: iload #5
    //   17: i2l
    //   18: bipush #32
    //   20: lshl
    //   21: bipush #32
    //   23: lushr
    //   24: lor
    //   25: getstatic me/rerere/matrix/internal/mc.a : J
    //   28: lxor
    //   29: lstore #6
    //   31: new javax/crypto/spec/SecretKeySpec
    //   34: dup
    //   35: getstatic me/rerere/matrix/internal/mc.v : Ljava/util/Base64$Decoder;
    //   38: aload_3
    //   39: invokevirtual decode : (Ljava/lang/String;)[B
    //   42: sipush #12173
    //   45: ldc2_w 8876666689551209870
    //   48: lload #6
    //   50: lxor
    //   51: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   56: invokespecial <init> : ([BLjava/lang/String;)V
    //   59: checkcast java/security/Key
    //   62: astore #8
    //   64: sipush #25921
    //   67: ldc2_w 5822923842919489347
    //   70: lload #6
    //   72: lxor
    //   73: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   78: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   81: astore #9
    //   83: aload #9
    //   85: iconst_2
    //   86: aload #8
    //   88: invokevirtual init : (ILjava/security/Key;)V
    //   91: getstatic me/rerere/matrix/internal/mc.v : Ljava/util/Base64$Decoder;
    //   94: aload_2
    //   95: invokevirtual decode : (Ljava/lang/String;)[B
    //   98: astore #10
    //   100: aload #9
    //   102: aload #10
    //   104: invokevirtual doFinal : ([B)[B
    //   107: astore #11
    //   109: new java/lang/String
    //   112: dup
    //   113: aload #11
    //   115: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   118: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   121: areturn
  }
  
  @NotNull
  public static final String b(long paramLong, @NotNull String paramString1, @Nullable String paramString2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mc.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: new javax/crypto/spec/SecretKeySpec
    //   9: dup
    //   10: getstatic me/rerere/matrix/internal/mc.v : Ljava/util/Base64$Decoder;
    //   13: aload_3
    //   14: invokevirtual decode : (Ljava/lang/String;)[B
    //   17: sipush #22934
    //   20: ldc2_w 1155440258648031687
    //   23: lload_0
    //   24: lxor
    //   25: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   30: invokespecial <init> : ([BLjava/lang/String;)V
    //   33: checkcast java/security/Key
    //   36: astore #4
    //   38: sipush #24776
    //   41: ldc2_w 5198118460891363480
    //   44: lload_0
    //   45: lxor
    //   46: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   51: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   54: astore #5
    //   56: aload #5
    //   58: iconst_1
    //   59: aload #4
    //   61: invokevirtual init : (ILjava/security/Key;)V
    //   64: aload #5
    //   66: aload_2
    //   67: astore #7
    //   69: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   72: aload #7
    //   74: swap
    //   75: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   78: dup
    //   79: sipush #11200
    //   82: ldc2_w 7912903175781757846
    //   85: lload_0
    //   86: lxor
    //   87: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   92: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   95: invokevirtual doFinal : ([B)[B
    //   98: astore #6
    //   100: getstatic me/rerere/matrix/internal/mc.b : Ljava/util/Base64$Encoder;
    //   103: aload #6
    //   105: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   108: areturn
  }
  
  @NotNull
  public static final String b(long paramLong) throws NoSuchAlgorithmException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mc.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: sipush #22934
    //   9: ldc2_w 1155381009788002722
    //   12: lload_0
    //   13: lxor
    //   14: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   19: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/KeyGenerator;
    //   22: astore_2
    //   23: aload_2
    //   24: new java/security/SecureRandom
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: invokevirtual init : (Ljava/security/SecureRandom;)V
    //   34: aload_2
    //   35: invokevirtual generateKey : ()Ljavax/crypto/SecretKey;
    //   38: astore_3
    //   39: aload_3
    //   40: invokeinterface getEncoded : ()[B
    //   45: astore #4
    //   47: getstatic me/rerere/matrix/internal/mc.b : Ljava/util/Base64$Encoder;
    //   50: aload #4
    //   52: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   55: areturn
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4174;
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
        throw new RuntimeException("me/rerere/matrix/internal/mc", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/mc'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\mc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */