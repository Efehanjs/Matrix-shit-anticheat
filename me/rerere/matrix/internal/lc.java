package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class lc {
  @NotNull
  public static final String b;
  
  @NotNull
  public static final lc i;
  
  private static final long a = o3.a(2057473502027651828L, -813016752529477347L, MethodHandles.lookup().lookupClass()).a(142624985124717L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public static final String m(short paramShort1, @NotNull String paramString1, short paramShort2, int paramInt, @NotNull String paramString2) {
    // Byte code:
    //   0: iload_0
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
    //   23: getstatic me/rerere/matrix/internal/lc.a : J
    //   26: lxor
    //   27: lstore #5
    //   29: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   32: astore #7
    //   34: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   37: astore #8
    //   39: aload #7
    //   41: aload #4
    //   43: invokevirtual decode : (Ljava/lang/String;)[B
    //   46: astore #9
    //   48: sipush #17061
    //   51: ldc2_w 550903051813477883
    //   54: lload #5
    //   56: lxor
    //   57: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   62: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   65: new java/security/spec/PKCS8EncodedKeySpec
    //   68: dup
    //   69: aload #9
    //   71: invokespecial <init> : ([B)V
    //   74: checkcast java/security/spec/KeySpec
    //   77: invokevirtual generatePrivate : (Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   80: dup
    //   81: sipush #1869
    //   84: ldc2_w 7270291464315344914
    //   87: lload #5
    //   89: lxor
    //   90: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   95: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   98: checkcast java/security/interfaces/RSAPrivateKey
    //   101: astore #10
    //   103: sipush #17061
    //   106: ldc2_w 550903051813477883
    //   109: lload #5
    //   111: lxor
    //   112: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   117: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   120: astore #11
    //   122: aload #11
    //   124: iconst_1
    //   125: aload #10
    //   127: checkcast java/security/Key
    //   130: invokevirtual init : (ILjava/security/Key;)V
    //   133: aload #8
    //   135: aload #11
    //   137: aload_1
    //   138: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   141: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   144: dup
    //   145: sipush #23307
    //   148: ldc2_w 5251688106974659670
    //   151: lload #5
    //   153: lxor
    //   154: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   159: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   162: invokevirtual doFinal : ([B)[B
    //   165: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   168: areturn
  }
  
  static {
    long l = a ^ 0x3BE51189385BL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "¤¯Dq\026\013ßkYõ:\030\026§û8\033È²£Q¸îSd¯±«3Ý\003Ï¼ø3=ì äh´,}\fU`:U'ég\n\021Ûj)Àûâ«%Qt¯2v1\005ãÂÁ¤3ß©\030Î#+f5ÆxD~LO÷ãLmMr)Ê\001ë¹ªõæ(2\034K\002u\030naÍÁ²[/J1,Ï.¯ëPXõMÖ·p\020\034\027]8§~»Î9[×.\017ùßüUUÌÌ\032î[rã3®ÔíjnÄAUBF1ø\031\001ãæÕU}6ì?Èµ[µìSôÆ:í\\Æ0\034Ï\037Å|ºúh\033ª\035ã¥]µé54-\036÷Ïì|@®!vÅðîþà\003©«Å½HÂ*éF¬w¸¯8È=\005\tdDùÍ¨#\bÒ´,ÑÄÂøÍmPÜ¸é\"6ä¿nÌ<u?pìþ ¦@-+*¾ó.ð$éö\005}6É^C\030¾(\025ç§\013Õ{¥ÆÔ¸mhV\006wPH~·ÿ@éñ¯I6ÏN\013u\026°\fBdTÂ×7·ØiyrÙGÖ¹Ós$óÁ\024)½Êcû±\021yM\034í¶ïÉ0ädûbÏúM$ùÍ$øq´\020ulJ\020ÑéÌî\024R\031u\004O;çG©Í\033*Æù¾\b¿4n#)ÉLdtäL\031\032a +ö:¤%Û¢GËÄgå@9(\035Á4¬k\034àIt£M\0259»,ð¸\035Ñ\036Û Ì.Í®Ú5q\002\026øgù+xDZ#Ö-HZüÞås)0é­åmrÂéö\020&+Wt\004¦|\\©ù_uøõ\tðâ\030\002íLÎAF¤=ñõË\035Ñ U¦/\037j6@+í\022O\034Û8d­æà`\026[àËj6gIæ3Ý®6ß]iiò9\005!*¥¸xx¥ IZñT\025ýÜa\033ú©ø¦/q\007(§Å°PT®\027uâH:°ê;nw\026ùÂ¬D°JIÔ").length();
    byte b2 = 120;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public static final String p(long paramLong, @NotNull String paramString1, @NotNull String paramString2) throws Exception {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lc.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   9: astore #4
    //   11: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   14: astore #5
    //   16: aload #4
    //   18: aload_2
    //   19: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   22: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   25: dup
    //   26: sipush #1203
    //   29: ldc2_w 7303621772023192390
    //   32: lload_0
    //   33: lxor
    //   34: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   39: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   42: invokevirtual decode : ([B)[B
    //   45: astore #6
    //   47: aload #4
    //   49: aload_3
    //   50: invokevirtual decode : (Ljava/lang/String;)[B
    //   53: astore #7
    //   55: sipush #13236
    //   58: ldc2_w 7578836039875357768
    //   61: lload_0
    //   62: lxor
    //   63: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   68: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   71: new java/security/spec/X509EncodedKeySpec
    //   74: dup
    //   75: aload #7
    //   77: invokespecial <init> : ([B)V
    //   80: checkcast java/security/spec/KeySpec
    //   83: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   86: dup
    //   87: sipush #25822
    //   90: ldc2_w 6286230451760970528
    //   93: lload_0
    //   94: lxor
    //   95: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   100: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   103: checkcast java/security/interfaces/RSAPublicKey
    //   106: astore #8
    //   108: sipush #17061
    //   111: ldc2_w 550936361158516053
    //   114: lload_0
    //   115: lxor
    //   116: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   121: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   124: astore #9
    //   126: aload #9
    //   128: iconst_2
    //   129: aload #8
    //   131: checkcast java/security/Key
    //   134: invokevirtual init : (ILjava/security/Key;)V
    //   137: new java/lang/String
    //   140: dup
    //   141: aload #9
    //   143: aload #6
    //   145: invokevirtual doFinal : ([B)[B
    //   148: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   151: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   154: areturn
  }
  
  @NotNull
  public final String[] b(long paramLong) throws NoSuchAlgorithmException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lc.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   9: astore_3
    //   10: sipush #17061
    //   13: ldc2_w 550980315862262186
    //   16: lload_1
    //   17: lxor
    //   18: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   23: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyPairGenerator;
    //   26: astore #4
    //   28: aload #4
    //   30: sipush #1024
    //   33: new java/security/SecureRandom
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: invokevirtual initialize : (ILjava/security/SecureRandom;)V
    //   43: aload #4
    //   45: invokevirtual generateKeyPair : ()Ljava/security/KeyPair;
    //   48: astore #5
    //   50: aload #5
    //   52: invokevirtual getPrivate : ()Ljava/security/PrivateKey;
    //   55: dup
    //   56: sipush #26378
    //   59: ldc2_w 8174495664593257473
    //   62: lload_1
    //   63: lxor
    //   64: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   69: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   72: checkcast java/security/interfaces/RSAPrivateKey
    //   75: astore #6
    //   77: aload #5
    //   79: invokevirtual getPublic : ()Ljava/security/PublicKey;
    //   82: dup
    //   83: sipush #24667
    //   86: ldc2_w 8962578980947510098
    //   89: lload_1
    //   90: lxor
    //   91: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   96: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   99: checkcast java/security/interfaces/RSAPublicKey
    //   102: astore #7
    //   104: new java/lang/String
    //   107: dup
    //   108: aload_3
    //   109: aload #7
    //   111: invokeinterface getEncoded : ()[B
    //   116: invokevirtual encode : ([B)[B
    //   119: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   122: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   125: astore #8
    //   127: new java/lang/String
    //   130: dup
    //   131: aload_3
    //   132: aload #6
    //   134: invokeinterface getEncoded : ()[B
    //   139: invokevirtual encode : ([B)[B
    //   142: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   145: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   148: astore #9
    //   150: new java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: sipush #21775
    //   160: ldc2_w 2173630364765582855
    //   163: lload_1
    //   164: lxor
    //   165: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload #8
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   184: swap
    //   185: invokevirtual println : (Ljava/lang/Object;)V
    //   188: new java/lang/StringBuilder
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: sipush #8267
    //   198: ldc2_w 1372533066147103558
    //   201: lload_1
    //   202: lxor
    //   203: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload #9
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   222: swap
    //   223: invokevirtual println : (Ljava/lang/Object;)V
    //   226: iconst_2
    //   227: anewarray java/lang/String
    //   230: astore #10
    //   232: aload #10
    //   234: iconst_0
    //   235: aload #8
    //   237: aastore
    //   238: aload #10
    //   240: iconst_1
    //   241: aload #9
    //   243: aastore
    //   244: aload #10
    //   246: areturn
  }
  
  @NotNull
  public static final String j(@NotNull String paramString1, short paramShort, int paramInt1, int paramInt2, @NotNull String paramString2) throws Exception {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/lc.a : J
    //   26: lxor
    //   27: lstore #5
    //   29: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   32: astore #7
    //   34: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   37: astore #8
    //   39: aload #7
    //   41: aload #4
    //   43: invokevirtual decode : (Ljava/lang/String;)[B
    //   46: astore #9
    //   48: sipush #17061
    //   51: ldc2_w 550971633682173303
    //   54: lload #5
    //   56: lxor
    //   57: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   62: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   65: new java/security/spec/X509EncodedKeySpec
    //   68: dup
    //   69: aload #9
    //   71: invokespecial <init> : ([B)V
    //   74: checkcast java/security/spec/KeySpec
    //   77: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   80: dup
    //   81: sipush #24667
    //   84: ldc2_w 8962570616267927439
    //   87: lload #5
    //   89: lxor
    //   90: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   95: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   98: checkcast java/security/interfaces/RSAPublicKey
    //   101: astore #10
    //   103: sipush #17061
    //   106: ldc2_w 550971633682173303
    //   109: lload #5
    //   111: lxor
    //   112: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   117: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   120: astore #11
    //   122: aload #11
    //   124: iconst_1
    //   125: aload #10
    //   127: checkcast java/security/Key
    //   130: invokevirtual init : (ILjava/security/Key;)V
    //   133: aload #8
    //   135: aload #11
    //   137: aload_0
    //   138: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   141: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   144: dup
    //   145: sipush #23307
    //   148: ldc2_w 5251755863595177178
    //   151: lload #5
    //   153: lxor
    //   154: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   159: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   162: invokevirtual doFinal : ([B)[B
    //   165: invokevirtual encodeToString : ([B)Ljava/lang/String;
    //   168: areturn
  }
  
  @NotNull
  public final String b(@NotNull String paramString1, @Nullable String paramString2, long paramLong) throws Exception {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lc.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   9: astore #5
    //   11: invokestatic getEncoder : ()Ljava/util/Base64$Encoder;
    //   14: astore #6
    //   16: aload #5
    //   18: aload_1
    //   19: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   22: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   25: dup
    //   26: sipush #23307
    //   29: ldc2_w 5251625997813786504
    //   32: lload_3
    //   33: lxor
    //   34: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   39: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   42: invokevirtual decode : ([B)[B
    //   45: astore #7
    //   47: aload #5
    //   49: aload_2
    //   50: invokevirtual decode : (Ljava/lang/String;)[B
    //   53: astore #8
    //   55: sipush #17061
    //   58: ldc2_w 550859652137401893
    //   61: lload_3
    //   62: lxor
    //   63: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   68: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   71: new java/security/spec/PKCS8EncodedKeySpec
    //   74: dup
    //   75: aload #8
    //   77: invokespecial <init> : ([B)V
    //   80: checkcast java/security/spec/KeySpec
    //   83: invokevirtual generatePrivate : (Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   86: astore #10
    //   88: aload #10
    //   90: sipush #1869
    //   93: ldc2_w 7270352509148462028
    //   96: lload_3
    //   97: lxor
    //   98: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   103: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   106: aload #10
    //   108: checkcast java/security/interfaces/RSAPrivateKey
    //   111: astore #9
    //   113: sipush #17061
    //   116: ldc2_w 550859652137401893
    //   119: lload_3
    //   120: lxor
    //   121: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   126: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   129: astore #10
    //   131: aload #10
    //   133: iconst_2
    //   134: aload #9
    //   136: checkcast java/security/Key
    //   139: invokevirtual init : (ILjava/security/Key;)V
    //   142: new java/lang/String
    //   145: dup
    //   146: aload #10
    //   148: aload #7
    //   150: invokevirtual doFinal : ([B)[B
    //   153: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   156: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   159: areturn
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x450A;
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
        throw new RuntimeException("me/rerere/matrix/internal/lc", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/lc'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\lc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */