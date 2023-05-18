package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class vc {
  @NotNull
  public static final vc i;
  
  private static boolean a;
  
  private static final long b = o3.a(1953856032544274365L, 5742267948486892349L, MethodHandles.lookup().lookupClass()).a(6420751699429L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  static {
    long l = b ^ 0x10E628C7B557L;
    B(false);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "ÜR,\0172µ%Ív¹¯Öð\036çÊ\030ã½îP§D£ä¬À`\000$!§/°TH'3.").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public static final Optional b(@Nullable String paramString) {
    return Optional.ofNullable(System.getenv(paramString));
  }
  
  @NotNull
  public static final String b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vc.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 111213545506232
    //   11: lxor
    //   12: lstore_2
    //   13: pop2
    //   14: ldc ''
    //   16: astore #5
    //   18: invokestatic getOperatingSystemMXBean : ()Ljava/lang/management/OperatingSystemMXBean;
    //   21: astore #6
    //   23: invokestatic a : ()I
    //   26: new java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: sipush #14620
    //   36: ldc2_w 2886638285747316120
    //   39: lload_0
    //   40: lxor
    //   41: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   46: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: bipush #47
    //   54: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   57: sipush #24917
    //   60: ldc2_w 4673496627098172880
    //   63: lload_0
    //   64: lxor
    //   65: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   70: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: bipush #47
    //   78: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   81: sipush #14056
    //   84: ldc2_w 6079619849372527214
    //   87: lload_0
    //   88: lxor
    //   89: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   94: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   97: astore #8
    //   99: astore #18
    //   101: iconst_0
    //   102: istore #9
    //   104: aload #8
    //   106: checkcast java/lang/CharSequence
    //   109: astore #10
    //   111: iconst_0
    //   112: istore #11
    //   114: iconst_0
    //   115: istore #12
    //   117: istore #4
    //   119: aload #10
    //   121: invokeinterface length : ()I
    //   126: iconst_1
    //   127: isub
    //   128: istore #13
    //   130: iconst_0
    //   131: istore #14
    //   133: iload #12
    //   135: iload #13
    //   137: if_icmpgt -> 301
    //   140: iload #14
    //   142: iload #4
    //   144: ifne -> 159
    //   147: ifne -> 162
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: iload #12
    //   159: goto -> 164
    //   162: iload #13
    //   164: istore #15
    //   166: aload #10
    //   168: iload #15
    //   170: invokeinterface charAt : (I)C
    //   175: istore #16
    //   177: iconst_0
    //   178: istore #17
    //   180: iload #16
    //   182: bipush #32
    //   184: invokestatic compare : (II)I
    //   187: iload #4
    //   189: ifne -> 203
    //   192: ifgt -> 206
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: iconst_1
    //   203: goto -> 207
    //   206: iconst_0
    //   207: istore #16
    //   209: iload #14
    //   211: iload #4
    //   213: ifne -> 286
    //   216: ifne -> 284
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: iload #16
    //   228: lload_0
    //   229: lconst_0
    //   230: lcmp
    //   231: iflt -> 261
    //   234: iload #4
    //   236: ifne -> 257
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: ifne -> 270
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: iconst_1
    //   257: istore #14
    //   259: iload #4
    //   261: lload_0
    //   262: lconst_0
    //   263: lcmp
    //   264: ifle -> 275
    //   267: ifeq -> 133
    //   270: iinc #12, 1
    //   273: iload #4
    //   275: lload_0
    //   276: lconst_0
    //   277: lcmp
    //   278: ifle -> 135
    //   281: ifeq -> 133
    //   284: iload #16
    //   286: ifne -> 292
    //   289: goto -> 301
    //   292: iinc #13, -1
    //   295: nop
    //   296: iload #4
    //   298: ifeq -> 133
    //   301: aload #10
    //   303: iload #12
    //   305: iload #13
    //   307: iconst_1
    //   308: iadd
    //   309: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   314: invokevirtual toString : ()Ljava/lang/String;
    //   317: aload #18
    //   319: swap
    //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: bipush #47
    //   325: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   328: sipush #11076
    //   331: ldc2_w 202211772727457731
    //   334: lload_0
    //   335: lxor
    //   336: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   341: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: bipush #47
    //   349: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   352: aload #6
    //   354: invokeinterface getAvailableProcessors : ()I
    //   359: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   362: bipush #47
    //   364: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   367: aload #6
    //   369: invokeinterface getArch : ()Ljava/lang/String;
    //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: bipush #47
    //   379: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   382: invokestatic getDefault : ()Ljava/util/Locale;
    //   385: invokevirtual getLanguage : ()Ljava/lang/String;
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: invokevirtual toString : ()Ljava/lang/String;
    //   394: astore #7
    //   396: lload_0
    //   397: lconst_0
    //   398: lcmp
    //   399: ifle -> 133
    //   402: aload #7
    //   404: lload_2
    //   405: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   408: areturn
    // Exception table:
    //   from	to	target	type
    //   140	150	153	java/lang/RuntimeException
    //   180	195	198	java/lang/RuntimeException
    //   209	219	222	java/lang/RuntimeException
    //   216	239	242	java/lang/RuntimeException
    //   226	249	252	java/lang/RuntimeException
  }
  
  public static void B(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean u() {
    return a;
  }
  
  public static boolean q() {
    boolean bool = u();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1C5F;
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
        throw new RuntimeException("me/rerere/matrix/internal/vc", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/vc'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */