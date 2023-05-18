package me.rerere.matrix.misc.premium.dto;

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
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.internal.yk;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class VerifyRequest {
  @NotNull
  private final String hwid;
  
  @NotNull
  private final String ping;
  
  @NotNull
  private final String javaVersion;
  
  @NotNull
  private final String token;
  
  @NotNull
  private final String userName;
  
  @NotNull
  private final String userHome;
  
  @NotNull
  private final String javaVendor;
  
  @NotNull
  private final String osVersion;
  
  @NotNull
  private final String osName;
  
  @NotNull
  private final String osArch;
  
  private final int product;
  
  private static String a;
  
  private static final long b = o3.a(-7700363870988908103L, -8485777192699324862L, MethodHandles.lookup().lookupClass()).a(134736861378157L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public final String v() {
    return this.osArch;
  }
  
  @NotNull
  public final VerifyRequest b(@NotNull String paramString1, @NotNull String paramString2, int paramInt, @NotNull String paramString3, @NotNull String paramString4, @NotNull String paramString5, @NotNull String paramString6, @NotNull String paramString7, @NotNull String paramString8, @NotNull String paramString9, @NotNull String paramString10) {
    return new VerifyRequest(paramString1, paramString2, paramInt, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10);
  }
  
  @NotNull
  public final String f() {
    return this.javaVendor;
  }
  
  public final int j() {
    return this.product;
  }
  
  @NotNull
  public final String s() {
    return this.javaVersion;
  }
  
  @NotNull
  public final String u() {
    return this.token;
  }
  
  @NotNull
  public final String w() {
    return this.osName;
  }
  
  @NotNull
  public final String l() {
    return this.osVersion;
  }
  
  @NotNull
  public final String x() {
    return this.userHome;
  }
  
  @NotNull
  public final String g() {
    return this.hwid;
  }
  
  @NotNull
  public final String e() {
    return this.token;
  }
  
  @NotNull
  public final String r() {
    return this.osArch;
  }
  
  @NotNull
  public final String d() {
    return this.osName;
  }
  
  public int hashCode() {
    long l = b ^ 0x4A077C2CD2CCL;
    int i = this.ping.hashCode();
    i = i * 31 + this.token.hashCode();
    i = i * 31 + Integer.hashCode(this.product);
    i = i * 31 + this.hwid.hashCode();
    i = i * 31 + this.osName.hashCode();
    String str = o();
    i = i * 31 + this.osVersion.hashCode();
    i = i * 31 + this.osArch.hashCode();
    i = i * 31 + this.javaVersion.hashCode();
    i = i * 31 + this.javaVendor.hashCode();
    i = i * 31 + this.userName.hashCode();
    i = i * 31 + this.userHome.hashCode();
    try {
      if (str != null)
        yk.p("yDHyF"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return i;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/misc/premium/dto/VerifyRequest.b : J
    //   3: ldc2_w 139711800821729
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_3
    //   16: aload_3
    //   17: sipush #3990
    //   20: ldc2_w 3144576619795890116
    //   23: lload_1
    //   24: lxor
    //   25: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_0
    //   34: getfield ping : Ljava/lang/String;
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: sipush #3386
    //   43: ldc2_w 2939687551366872431
    //   46: lload_1
    //   47: lxor
    //   48: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_0
    //   57: getfield token : Ljava/lang/String;
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: sipush #13408
    //   66: ldc2_w 729402673859888183
    //   69: lload_1
    //   70: lxor
    //   71: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload_0
    //   80: getfield product : I
    //   83: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   86: sipush #22772
    //   89: ldc2_w 299737222810429600
    //   92: lload_1
    //   93: lxor
    //   94: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload_0
    //   103: getfield hwid : Ljava/lang/String;
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: sipush #171
    //   112: ldc2_w 5638241168433164539
    //   115: lload_1
    //   116: lxor
    //   117: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: aload_0
    //   126: getfield osName : Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: sipush #29748
    //   135: ldc2_w 1484000660702479461
    //   138: lload_1
    //   139: lxor
    //   140: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload_0
    //   149: getfield osVersion : Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: sipush #8397
    //   158: ldc2_w 1647580336367702171
    //   161: lload_1
    //   162: lxor
    //   163: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_0
    //   172: getfield osArch : Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: sipush #32470
    //   181: ldc2_w 7716850435140079237
    //   184: lload_1
    //   185: lxor
    //   186: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: aload_0
    //   195: getfield javaVersion : Ljava/lang/String;
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: sipush #11092
    //   204: ldc2_w 4901825757487373068
    //   207: lload_1
    //   208: lxor
    //   209: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: aload_0
    //   218: getfield javaVendor : Ljava/lang/String;
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: sipush #10528
    //   227: ldc2_w 3390241749043845497
    //   230: lload_1
    //   231: lxor
    //   232: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: aload_0
    //   241: getfield userName : Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: sipush #9192
    //   250: ldc2_w 2601682727058150322
    //   253: lload_1
    //   254: lxor
    //   255: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_0
    //   264: getfield userHome : Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: bipush #41
    //   272: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload_3
    //   277: invokevirtual toString : ()Ljava/lang/String;
    //   280: areturn
  }
  
  public final int b() {
    return this.product;
  }
  
  public VerifyRequest(@NotNull String paramString1, @NotNull String paramString2, int paramInt, @NotNull String paramString3, @NotNull String paramString4, @NotNull String paramString5, @NotNull String paramString6, @NotNull String paramString7, @NotNull String paramString8, @NotNull String paramString9, @NotNull String paramString10) {
    this.ping = paramString1;
    this.token = paramString2;
    this.product = paramInt;
    this.hwid = paramString3;
    this.osName = paramString4;
    this.osVersion = paramString5;
    this.osArch = paramString6;
    this.javaVersion = paramString7;
    this.javaVendor = paramString8;
    this.userName = paramString9;
    this.userHome = paramString10;
  }
  
  @NotNull
  public final String n() {
    return this.userHome;
  }
  
  @NotNull
  public final String c() {
    return this.userName;
  }
  
  @NotNull
  public final String i() {
    return this.userName;
  }
  
  @NotNull
  public final String t() {
    return this.hwid;
  }
  
  @NotNull
  public final String h() {
    return this.javaVersion;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    long l = b ^ 0x4EF2275821E7L;
    String str = o();
    try {
      if (str == null)
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
      if (str == null)
        try {
          if (!(paramObject instanceof VerifyRequest))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    VerifyRequest verifyRequest = (VerifyRequest)paramObject;
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.ping, verifyRequest.ping))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.token, verifyRequest.token))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (this.product != verifyRequest.product)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.hwid, verifyRequest.hwid))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.osName, verifyRequest.osName))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.osVersion, verifyRequest.osVersion))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.osArch, verifyRequest.osArch))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.javaVersion, verifyRequest.javaVersion))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.javaVendor, verifyRequest.javaVendor))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.userName, verifyRequest.userName))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (str == null)
        try {
          if (!Intrinsics.areEqual(this.userHome, verifyRequest.userHome))
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
  public final String m() {
    return this.javaVendor;
  }
  
  @NotNull
  public final String p() {
    return this.ping;
  }
  
  @NotNull
  public final String j() {
    return this.ping;
  }
  
  @NotNull
  public final String b() {
    return this.osVersion;
  }
  
  public static void F(String paramString) {
    a = paramString;
  }
  
  public static String o() {
    return a;
  }
  
  static {
    long l = b ^ 0x7362A562002L;
    F(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "\005eï«XÜxÜ_\017oyÃèx\036ËWM\\õÌtÕ\013E·¨ K\023ìHêÁ\001¬m­\000ÑßGUðÿ²\"±2±nz²Y]('°áæGýJ>\005U\005zÑ\032ô­ß\017±Ý);\027 Ô;ö\fu\017%ýd\\\t+\030*6b¯G1¸oÛ\tëHyVª\bsÄ\022b\027\020¿Èì\007'=\024\017ËGjsùTÚ 6\\IT#ÂJ\035À]þy¢M?]j\000\023\tZäçÌP²;yÝg¹ \"ëäíªÌ\001Ál5WûÉ[DßÓæüúèïÑ\r±ÄCo6Î]\030Iþ\nyÈ\002¨ðÏ'L±%1\002¥^ðaz %>s-àN/ª%óá¨âW\025ÎïsÏ±\033³½:xðêL®Ó").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5703;
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
        throw new RuntimeException("me/rerere/matrix/misc/premium/dto/VerifyRequest", exception);
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
    //   66: ldc_w 'me/rerere/matrix/misc/premium/dto/VerifyRequest'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\misc\premium\dto\VerifyRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */