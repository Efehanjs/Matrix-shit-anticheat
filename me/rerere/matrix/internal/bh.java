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
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class bh {
  @NotNull
  private final Function1 v;
  
  private final int b;
  
  private final long i;
  
  private static boolean a;
  
  private static final long c = o3.a(3501404318895586399L, 4436009744717521484L, MethodHandles.lookup().lookupClass()).a(266982035231209L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @NotNull
  public final Function1 j() {
    return this.v;
  }
  
  public final long j() {
    return this.i;
  }
  
  public bh(int paramInt, @NotNull Function1 paramFunction1, long paramLong) {
    this.b = paramInt;
    this.v = paramFunction1;
    this.i = paramLong;
  }
  
  public final long b() {
    return this.i;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bh.c : J
    //   3: ldc2_w 4402537593035
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #21287
    //   18: ldc2_w 8494026543796594412
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield b : I
    //   35: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   38: sipush #20011
    //   41: ldc2_w 512327319523834849
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield v : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: sipush #21493
    //   64: ldc2_w 7873751298489558588
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield i : J
    //   81: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   84: bipush #41
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: areturn
  }
  
  @NotNull
  public final Function1 b() {
    return this.v;
  }
  
  public final int j() {
    return this.b;
  }
  
  @NotNull
  public final bh b(int paramInt, @NotNull Function1 paramFunction1, long paramLong) {
    return new bh(paramInt, paramFunction1, paramLong);
  }
  
  public final int b() {
    return this.b;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bh.c : J
    //   3: ldc2_w 58239346300675
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_1
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual getClass : ()Ljava/lang/Class;
    //   40: iload #4
    //   42: ifeq -> 80
    //   45: aload_1
    //   46: dup
    //   47: ifnull -> 72
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: invokevirtual getClass : ()Ljava/lang/Class;
    //   60: iload #4
    //   62: ifne -> 81
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: pop
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aconst_null
    //   81: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   84: iload #4
    //   86: ifeq -> 131
    //   89: ifne -> 105
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: iconst_0
    //   100: ireturn
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_1
    //   106: sipush #16731
    //   109: ldc2_w 6177489596791429979
    //   112: lload_2
    //   113: lxor
    //   114: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   119: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   122: aload_1
    //   123: checkcast me/rerere/matrix/internal/bh
    //   126: pop
    //   127: aload_0
    //   128: getfield b : I
    //   131: iload #4
    //   133: ifeq -> 171
    //   136: aload_1
    //   137: checkcast me/rerere/matrix/internal/bh
    //   140: getfield b : I
    //   143: if_icmpeq -> 159
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: iconst_0
    //   154: ireturn
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload_0
    //   160: getfield i : J
    //   163: aload_1
    //   164: checkcast me/rerere/matrix/internal/bh
    //   167: getfield i : J
    //   170: lcmp
    //   171: iload #4
    //   173: ifeq -> 193
    //   176: ifeq -> 192
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   185: athrow
    //   186: iconst_0
    //   187: ireturn
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: iconst_1
    //   193: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	50	53	java/lang/RuntimeException
    //   45	65	68	java/lang/RuntimeException
    //   57	73	76	java/lang/RuntimeException
    //   81	92	95	java/lang/RuntimeException
    //   89	101	101	java/lang/RuntimeException
    //   131	146	149	java/lang/RuntimeException
    //   136	155	155	java/lang/RuntimeException
    //   171	179	182	java/lang/RuntimeException
    //   176	188	188	java/lang/RuntimeException
  }
  
  public int hashCode() {
    null = this.b;
    return 31 * null + Long.hashCode(this.i);
  }
  
  public static void N(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean P() {
    return a;
  }
  
  public static boolean d() {
    boolean bool = P();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = c ^ 0x4861BC68071CL;
    N(false);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "\027ûÒ.¢c\002h\\íìb±Ï±\001á¿2+ëÚjMÈûu\002Ð\0255mz|S{ÃØ@ÀÁ±VZ¶ørÜ©ìâº$s\bbYb(¥åDI±_¬ì[6mÕt_Ø¼\027Õ\0002\b4ÇqJqØÑ£û=r/Ýs²¯{o½(óåµ\tú\023öªAJ\f ¤R\001\017°~CbØ'&ýE4¾\034\026m6\022wæüÙg\021J¨").length();
    char c = '';
    byte b1 = -1;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2619;
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
        throw new RuntimeException("me/rerere/matrix/internal/bh", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/bh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */