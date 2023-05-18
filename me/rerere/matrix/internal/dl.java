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
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class dl {
  @NotNull
  public static final dl i;
  
  private static String a;
  
  private static final long b = o3.a(1632105610100532539L, 296773424016077543L, MethodHandles.lookup().lookupClass()).a(280512227285975L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public final Pair b(short paramShort, char paramChar, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #32
    //   18: lshl
    //   19: bipush #32
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/dl.b : J
    //   26: lxor
    //   27: lstore #4
    //   29: sipush #4189
    //   32: ldc2_w 7899305338490770937
    //   35: lload #4
    //   37: lxor
    //   38: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   43: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyPairGenerator;
    //   46: astore #6
    //   48: aload #6
    //   50: sipush #2048
    //   53: invokevirtual initialize : (I)V
    //   56: aload #6
    //   58: invokevirtual generateKeyPair : ()Ljava/security/KeyPair;
    //   61: astore #7
    //   63: new me/rerere/matrix/thirdparty/kotlin/Pair
    //   66: dup
    //   67: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   70: aload #7
    //   72: invokevirtual getPublic : ()Ljava/security/PublicKey;
    //   75: invokeinterface getEncoded : ()[B
    //   80: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   83: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   86: aload #7
    //   88: invokevirtual getPrivate : ()Ljava/security/PrivateKey;
    //   91: invokeinterface getEncoded : ()[B
    //   96: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   99: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   102: areturn
  }
  
  @NotNull
  public final String m(@NotNull String paramString1, long paramLong, @NotNull String paramString2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dl.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: sipush #31270
    //   9: ldc2_w 1991039538085229976
    //   12: lload_2
    //   13: lxor
    //   14: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   19: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   22: astore #5
    //   24: new java/security/spec/PKCS8EncodedKeySpec
    //   27: dup
    //   28: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   31: aload #4
    //   33: invokevirtual decode : (Ljava/lang/String;)[B
    //   36: invokespecial <init> : ([B)V
    //   39: astore #6
    //   41: sipush #4189
    //   44: ldc2_w 7899231637541527522
    //   47: lload_2
    //   48: lxor
    //   49: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   54: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   57: astore #7
    //   59: aload #7
    //   61: aload #6
    //   63: checkcast java/security/spec/KeySpec
    //   66: invokevirtual generatePrivate : (Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   69: astore #8
    //   71: aload #5
    //   73: iconst_2
    //   74: aload #8
    //   76: checkcast java/security/Key
    //   79: invokevirtual init : (ILjava/security/Key;)V
    //   82: new java/lang/String
    //   85: dup
    //   86: aload #5
    //   88: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   91: aload_1
    //   92: invokevirtual decode : (Ljava/lang/String;)[B
    //   95: invokevirtual doFinal : ([B)[B
    //   98: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   101: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   104: areturn
  }
  
  @NotNull
  public final String p(@NotNull String paramString1, long paramLong, @NotNull String paramString2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dl.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: sipush #4189
    //   9: ldc2_w 7899202565627853179
    //   12: lload_2
    //   13: lxor
    //   14: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   19: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   22: astore #5
    //   24: new java/security/spec/PKCS8EncodedKeySpec
    //   27: dup
    //   28: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   31: aload #4
    //   33: invokevirtual decode : (Ljava/lang/String;)[B
    //   36: invokespecial <init> : ([B)V
    //   39: astore #6
    //   41: sipush #4189
    //   44: ldc2_w 7899202565627853179
    //   47: lload_2
    //   48: lxor
    //   49: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   54: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   57: astore #7
    //   59: aload #7
    //   61: aload #6
    //   63: checkcast java/security/spec/KeySpec
    //   66: invokevirtual generatePrivate : (Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   69: astore #8
    //   71: aload #5
    //   73: iconst_1
    //   74: aload #8
    //   76: checkcast java/security/Key
    //   79: invokevirtual init : (ILjava/security/Key;)V
    //   82: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   85: aload #5
    //   87: aload_1
    //   88: astore #9
    //   90: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   93: aload #9
    //   95: swap
    //   96: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   99: dup
    //   100: sipush #31372
    //   103: ldc2_w 8118632450232112041
    //   106: lload_2
    //   107: lxor
    //   108: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   113: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   116: invokevirtual doFinal : ([B)[B
    //   119: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   122: areturn
  }
  
  static {
    L("rrIqsb");
    long l = b ^ 0x1593FA01E57AL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "\006\0049\002Ó\005ØãØË¹&úÚdk«ôÂEv»F\bÉtì¶6ZDpF\b\0079¶£0x\027;*Å uèZë;R\032è\bm®r(WP$òôËd½z:¥<1Í\023ùOpþnU£R ¹`Ü~/EäÏè#=­R¹µzø\013úòì¶gÓò³¬ áó¤í\017Ôð:^}\"\034\031\037\033o").length();
    byte b2 = 72;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public final String j(int paramInt, short paramShort, char paramChar, @NotNull String paramString1, @NotNull String paramString2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/dl.b : J
    //   26: lxor
    //   27: lstore #6
    //   29: sipush #4189
    //   32: ldc2_w 7899210819407623441
    //   35: lload #6
    //   37: lxor
    //   38: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   43: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   46: astore #8
    //   48: new java/security/spec/X509EncodedKeySpec
    //   51: dup
    //   52: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   55: aload #5
    //   57: invokevirtual decode : (Ljava/lang/String;)[B
    //   60: invokespecial <init> : ([B)V
    //   63: astore #9
    //   65: sipush #4189
    //   68: ldc2_w 7899210819407623441
    //   71: lload #6
    //   73: lxor
    //   74: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   79: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   82: astore #10
    //   84: aload #10
    //   86: aload #9
    //   88: checkcast java/security/spec/KeySpec
    //   91: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   94: astore #11
    //   96: aload #8
    //   98: iconst_2
    //   99: aload #11
    //   101: checkcast java/security/Key
    //   104: invokevirtual init : (ILjava/security/Key;)V
    //   107: new java/lang/String
    //   110: dup
    //   111: aload #8
    //   113: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   116: aload #4
    //   118: invokevirtual decode : (Ljava/lang/String;)[B
    //   121: invokevirtual doFinal : ([B)[B
    //   124: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   127: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   130: areturn
  }
  
  @NotNull
  public final String b(@NotNull String paramString1, @NotNull String paramString2, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dl.b : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: sipush #4189
    //   9: ldc2_w 7899258512054743435
    //   12: lload_3
    //   13: lxor
    //   14: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   19: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   22: astore #5
    //   24: new java/security/spec/X509EncodedKeySpec
    //   27: dup
    //   28: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   31: aload_2
    //   32: invokevirtual decode : (Ljava/lang/String;)[B
    //   35: invokespecial <init> : ([B)V
    //   38: astore #6
    //   40: sipush #4189
    //   43: ldc2_w 7899258512054743435
    //   46: lload_3
    //   47: lxor
    //   48: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   53: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   56: astore #7
    //   58: aload #7
    //   60: aload #6
    //   62: checkcast java/security/spec/KeySpec
    //   65: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   68: astore #8
    //   70: aload #5
    //   72: iconst_1
    //   73: aload #8
    //   75: checkcast java/security/Key
    //   78: invokevirtual init : (ILjava/security/Key;)V
    //   81: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   84: aload #5
    //   86: aload_1
    //   87: astore #9
    //   89: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   92: aload #9
    //   94: swap
    //   95: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   98: dup
    //   99: sipush #2294
    //   102: ldc2_w 1376455968501524770
    //   105: lload_3
    //   106: lxor
    //   107: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   112: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   115: invokevirtual doFinal : ([B)[B
    //   118: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   121: areturn
  }
  
  public static void L(String paramString) {
    a = paramString;
  }
  
  public static String e() {
    return a;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7794;
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
        throw new RuntimeException("me/rerere/matrix/internal/dl", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/dl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */