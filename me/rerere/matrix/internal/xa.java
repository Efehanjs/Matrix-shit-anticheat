package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;

public class xa {
  private static String i;
  
  private static int a;
  
  private static final long b;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e;
  
  public static String b(long paramLong) {
    paramLong = b ^ paramLong;
    try {
      if (i == null)
        i = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return i;
  }
  
  @NotNull
  public static String j(String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xa.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: new java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: sipush #5404
    //   16: ldc2_w 2754575023666543344
    //   19: lload_1
    //   20: lxor
    //   21: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: getstatic me/rerere/matrix/internal/xa.i : Ljava/lang/String;
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc '.'
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: aload_0
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: areturn
  }
  
  @NotNull
  public static String b(String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xa.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic b : ()I
    //   9: bipush #17
    //   11: if_icmpge -> 60
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: sipush #20866
    //   24: ldc2_w 879568035449282766
    //   27: lload_1
    //   28: lxor
    //   29: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: getstatic me/rerere/matrix/internal/xa.i : Ljava/lang/String;
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: ldc '.'
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_0
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual toString : ()Ljava/lang/String;
    //   55: areturn
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: new java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: sipush #15710
    //   70: ldc2_w 4944397216917474320
    //   73: lload_1
    //   74: lxor
    //   75: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload_0
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual toString : ()Ljava/lang/String;
    //   90: areturn
    // Exception table:
    //   from	to	target	type
    //   6	56	56	java/lang/RuntimeException
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -667957187014870369
    //   3: ldc2_w -7666413143453232132
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 48361660467655
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/internal/xa.b : J
    //   26: getstatic me/rerere/matrix/internal/xa.b : J
    //   29: ldc2_w 17327026214764
    //   32: lxor
    //   33: lstore #9
    //   35: lload #9
    //   37: dup2
    //   38: ldc2_w 107654330024987
    //   41: lxor
    //   42: lstore #11
    //   44: pop2
    //   45: bipush #67
    //   47: new java/util/HashMap
    //   50: dup
    //   51: bipush #13
    //   53: invokespecial <init> : (I)V
    //   56: putstatic me/rerere/matrix/internal/xa.e : Ljava/util/Map;
    //   59: invokestatic T : (I)V
    //   62: ldc 'DES/CBC/PKCS5Padding'
    //   64: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   67: dup
    //   68: astore_0
    //   69: iconst_2
    //   70: ldc 'DES'
    //   72: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   75: bipush #8
    //   77: newarray byte
    //   79: dup
    //   80: iconst_0
    //   81: lload #9
    //   83: bipush #56
    //   85: lushr
    //   86: l2i
    //   87: i2b
    //   88: bastore
    //   89: iconst_1
    //   90: istore_1
    //   91: iload_1
    //   92: bipush #8
    //   94: if_icmpge -> 118
    //   97: dup
    //   98: iload_1
    //   99: lload #9
    //   101: iload_1
    //   102: bipush #8
    //   104: imul
    //   105: lshl
    //   106: bipush #56
    //   108: lushr
    //   109: l2i
    //   110: i2b
    //   111: bastore
    //   112: iinc #1, 1
    //   115: goto -> 91
    //   118: new javax/crypto/spec/DESKeySpec
    //   121: dup_x1
    //   122: swap
    //   123: invokespecial <init> : ([B)V
    //   126: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   129: new javax/crypto/spec/IvParameterSpec
    //   132: dup
    //   133: bipush #8
    //   135: newarray byte
    //   137: invokespecial <init> : ([B)V
    //   140: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   143: iconst_3
    //   144: anewarray java/lang/String
    //   147: astore #7
    //   149: iconst_0
    //   150: istore #5
    //   152: ldc '=Es¸7ØvÖdeåzÛ1n,Ïø0¥çDÎYéoÄ)hy(Î,y(Õ'(qí:¦È'X;WjxJ18Åceê[Ý+#lEf« ÂÀ3tÒæ\\tÛ>SpbÑ¬Î¦\\fc'
    //   154: dup
    //   155: astore #4
    //   157: invokevirtual length : ()I
    //   160: istore #6
    //   162: bipush #40
    //   164: istore_3
    //   165: iconst_m1
    //   166: istore_2
    //   167: iinc #2, 1
    //   170: aload #4
    //   172: iload_2
    //   173: dup
    //   174: iload_3
    //   175: iadd
    //   176: invokevirtual substring : (II)Ljava/lang/String;
    //   179: iconst_m1
    //   180: goto -> 228
    //   183: aload #7
    //   185: swap
    //   186: iload #5
    //   188: iinc #5, 1
    //   191: swap
    //   192: aastore
    //   193: iload_2
    //   194: iload_3
    //   195: iadd
    //   196: dup
    //   197: istore_2
    //   198: iload #6
    //   200: if_icmpge -> 213
    //   203: aload #4
    //   205: iload_2
    //   206: invokevirtual charAt : (I)C
    //   209: istore_3
    //   210: goto -> 167
    //   213: aload #7
    //   215: putstatic me/rerere/matrix/internal/xa.c : [Ljava/lang/String;
    //   218: iconst_3
    //   219: anewarray java/lang/String
    //   222: putstatic me/rerere/matrix/internal/xa.d : [Ljava/lang/String;
    //   225: goto -> 254
    //   228: swap
    //   229: ldc 'ISO-8859-1'
    //   231: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   234: aload_0
    //   235: swap
    //   236: invokevirtual doFinal : ([B)[B
    //   239: astore #8
    //   241: aload #8
    //   243: invokestatic a : ([B)Ljava/lang/String;
    //   246: invokevirtual intern : ()Ljava/lang/String;
    //   249: swap
    //   250: pop
    //   251: goto -> 183
    //   254: lload #11
    //   256: invokestatic b : (J)Ljava/lang/String;
    //   259: putstatic me/rerere/matrix/internal/xa.i : Ljava/lang/String;
    //   262: goto -> 272
    //   265: astore #13
    //   267: aload #13
    //   269: invokevirtual printStackTrace : ()V
    //   272: return
    // Exception table:
    //   from	to	target	type
    //   254	262	265	java/lang/Exception
  }
  
  public static void T(int paramInt) {
    a = paramInt;
  }
  
  public static int M() {
    return a;
  }
  
  public static int L() {
    int i = M();
    try {
      if (i == 0)
        return 31; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x762B;
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
        throw new RuntimeException("me/rerere/matrix/internal/xa", exception);
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
    //   65: ldc 'me/rerere/matrix/internal/xa'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */