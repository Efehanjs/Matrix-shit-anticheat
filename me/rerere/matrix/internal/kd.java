package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class kd {
  @NotNull
  private final al v;
  
  @NotNull
  private final ge b;
  
  @NotNull
  private final gl i;
  
  private static int[] a;
  
  private static final long c = o3.a(4225208841334414831L, -7276976460408642191L, MethodHandles.lookup().lookupClass()).a(240625214572901L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public boolean equals(@Nullable Object paramObject) {
    long l = c ^ 0x23ADAB6AEE2L;
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
          if (!(paramObject instanceof kd))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.b, ((kd)paramObject).b))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.v, ((kd)paramObject).v))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.i, ((kd)paramObject).i))
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
  public final gl b() {
    return this.i;
  }
  
  @NotNull
  public final al b() {
    return this.v;
  }
  
  @NotNull
  public final ge b() {
    return this.b;
  }
  
  public kd(long paramLong) {
    this.b = new ge(l2);
    this.v = new al(l1);
    this.i = new gl(l3);
  }
  
  public final void b(int paramInt, char paramChar1, char paramChar2) {
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
    //   23: getstatic me/rerere/matrix/internal/kd.c : J
    //   26: lxor
    //   27: lstore #4
    //   29: lload #4
    //   31: dup2
    //   32: ldc2_w 92663569907370
    //   35: lxor
    //   36: dup2
    //   37: bipush #56
    //   39: lushr
    //   40: l2i
    //   41: istore #6
    //   43: dup2
    //   44: bipush #8
    //   46: lshl
    //   47: bipush #8
    //   49: lushr
    //   50: lstore #7
    //   52: pop2
    //   53: dup2
    //   54: ldc2_w 92663569907370
    //   57: lxor
    //   58: dup2
    //   59: bipush #56
    //   61: lushr
    //   62: l2i
    //   63: istore #9
    //   65: dup2
    //   66: bipush #8
    //   68: lshl
    //   69: bipush #8
    //   71: lushr
    //   72: lstore #10
    //   74: pop2
    //   75: dup2
    //   76: ldc2_w 92663569907370
    //   79: lxor
    //   80: dup2
    //   81: bipush #56
    //   83: lushr
    //   84: l2i
    //   85: istore #12
    //   87: dup2
    //   88: bipush #8
    //   90: lshl
    //   91: bipush #8
    //   93: lushr
    //   94: lstore #13
    //   96: pop2
    //   97: dup2
    //   98: ldc2_w 84672673166318
    //   101: lxor
    //   102: lstore #15
    //   104: dup2
    //   105: ldc2_w 84173480507940
    //   108: lxor
    //   109: lstore #17
    //   111: pop2
    //   112: invokestatic a : ()I
    //   115: istore #19
    //   117: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   120: lload #17
    //   122: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   125: astore #20
    //   127: iload #19
    //   129: ifne -> 190
    //   132: aload #20
    //   134: invokevirtual getDataFolder : ()Ljava/io/File;
    //   137: invokevirtual exists : ()Z
    //   140: ifne -> 166
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   149: athrow
    //   150: aload #20
    //   152: invokevirtual getDataFolder : ()Ljava/io/File;
    //   155: invokevirtual mkdirs : ()Z
    //   158: pop
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   165: athrow
    //   166: aload_0
    //   167: getfield b : Lme/rerere/matrix/internal/ge;
    //   170: iload #12
    //   172: i2b
    //   173: lload #13
    //   175: invokevirtual b : (BJ)V
    //   178: aload_0
    //   179: getfield i : Lme/rerere/matrix/internal/gl;
    //   182: iload #9
    //   184: i2b
    //   185: lload #10
    //   187: invokevirtual b : (BJ)V
    //   190: aload_0
    //   191: astore #21
    //   193: nop
    //   194: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   197: pop
    //   198: aload #21
    //   200: checkcast me/rerere/matrix/internal/kd
    //   203: astore #22
    //   205: iconst_0
    //   206: istore #23
    //   208: aload #22
    //   210: getfield v : Lme/rerere/matrix/internal/al;
    //   213: iload #6
    //   215: i2b
    //   216: lload #7
    //   218: invokevirtual b : (BJ)V
    //   221: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   224: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   227: astore #22
    //   229: goto -> 248
    //   232: astore #23
    //   234: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   237: pop
    //   238: aload #23
    //   240: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   243: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   246: astore #22
    //   248: aload #22
    //   250: astore #21
    //   252: aload #21
    //   254: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   257: dup
    //   258: ifnull -> 408
    //   261: astore #22
    //   263: aload #22
    //   265: astore #23
    //   267: iconst_0
    //   268: istore #24
    //   270: aload #23
    //   272: invokevirtual printStackTrace : ()V
    //   275: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   278: sipush #15455
    //   281: ldc2_w 6107344172230991032
    //   284: lload #4
    //   286: lxor
    //   287: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   292: lload #15
    //   294: invokevirtual b : (Ljava/lang/String;J)V
    //   297: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   300: sipush #30866
    //   303: ldc2_w 2244136262014670964
    //   306: lload #4
    //   308: lxor
    //   309: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   314: lload #15
    //   316: invokevirtual b : (Ljava/lang/String;J)V
    //   319: aload_0
    //   320: astore #25
    //   322: nop
    //   323: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   326: pop
    //   327: aload #25
    //   329: checkcast me/rerere/matrix/internal/kd
    //   332: astore #26
    //   334: iconst_0
    //   335: istore #27
    //   337: ldc2_w 5000
    //   340: invokestatic sleep : (J)V
    //   343: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   346: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   349: astore #26
    //   351: goto -> 370
    //   354: astore #27
    //   356: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   359: pop
    //   360: aload #27
    //   362: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   365: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   368: astore #26
    //   370: aload #26
    //   372: astore #25
    //   374: aload #25
    //   376: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   379: dup
    //   380: ifnull -> 400
    //   383: astore #26
    //   385: aload #26
    //   387: astore #27
    //   389: iconst_0
    //   390: istore #28
    //   392: aload #27
    //   394: invokevirtual printStackTrace : ()V
    //   397: goto -> 401
    //   400: pop
    //   401: invokestatic shutdown : ()V
    //   404: nop
    //   405: goto -> 409
    //   408: pop
    //   409: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   412: sipush #21239
    //   415: ldc2_w 4334970747068592659
    //   418: lload #4
    //   420: lxor
    //   421: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   426: lload #15
    //   428: invokevirtual b : (Ljava/lang/String;J)V
    //   431: return
    // Exception table:
    //   from	to	target	type
    //   127	143	146	java/lang/Throwable
    //   132	159	162	java/lang/Throwable
    //   193	229	232	java/lang/Throwable
    //   322	351	354	java/lang/Throwable
  }
  
  public int hashCode() {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.v;
    arrayOfObject[2] = this.i;
    return Objects.hash(arrayOfObject);
  }
  
  public static void W(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] x() {
    return a;
  }
  
  static {
    long l = c ^ 0x2C402453AC50L;
    W(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "<3°&\"Bg%¸b¥\007dÞô\f\035Ûå\006«\\ñ\035<{rA_éåmÌv6Ë¡ü@rö\\¸bt9hVW$å\034e§9AJu\001È\\C¥ãC3ÈPT2´\032P=0Í]5üç\036B\\ÇÍeÕÿM£¹¢\020s\017Ex>h\032£ÄêÃ­s'IH8æ{ÒÁtÙ5\rÛ¦×\027p\r=A¤*Ç3éô\0026ã×®\023¥Ó\021[¦÷è\037¨E{ù)\006öê%çY0\001ø,êâ»ld.!yÇç«µ;VéA\032y\b%x×Æû'\007\033þ#Dwd`\033n½¯ÖC#\\R\b¿?EèäØUNÐorvú³×qÕÀ&\017î|õSê\032\032ºDTßB0\024\025KrÐÒfúzbh\0000â£óù ÏÜc\026[\034²Ö\"|¢äDw\023ò\025JZ\017\007").length();
    char c = '';
    byte b1 = -1;
    while (true);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6411;
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
        throw new RuntimeException("me/rerere/matrix/internal/kd", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/kd'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\kd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */