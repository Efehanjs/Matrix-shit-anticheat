package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public final class gg {
  @NotNull
  private final List k;
  
  @NotNull
  private final Map v;
  
  @NotNull
  private final String b;
  
  @NotNull
  private final List i;
  
  private static final long a = o3.a(1494739520037264334L, -709967489994403297L, MethodHandles.lookup().lookupClass()).a(228592182608485L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public final boolean b(char paramChar, int paramInt, long paramLong) {
    long l1 = (paramChar << 48L | paramLong << 16L >>> 16L) ^ a;
    long l2 = l1 ^ 0x583228D77D73L;
    return Boolean.parseBoolean(j(paramInt, l2));
  }
  
  @NotNull
  public final List m() {
    return this.i;
  }
  
  @Nullable
  public final Boolean b(int paramInt1, @NotNull String paramString, int paramInt2) {
    long l = (paramInt1 << 32L | paramInt2 << 32L >>> 32L) ^ a;
    try {
      j(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (j(paramString) != null) ? Boolean.valueOf(Boolean.parseBoolean(j(paramString))) : null;
  }
  
  @NotNull
  public final String j() {
    return this.b;
  }
  
  @Nullable
  public final Player b(long paramLong, int paramInt) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x445608DC7235L;
    return Bukkit.getPlayer(j(paramInt, l));
  }
  
  @NotNull
  public final gg b(int paramInt1, int paramInt2, int paramInt3) {
    long l1 = (paramInt2 << 32L | paramInt3 << 32L >>> 32L) ^ a;
    long l2 = l1 ^ 0x31A05AC5BC02L;
    long l3 = l1 ^ 0x5B57A6E993ABL;
    return of.b(j(paramInt1, l3), l2);
  }
  
  public final int b(int paramInt1, char paramChar, int paramInt2, short paramShort) {
    long l1 = (paramChar << 48L | paramInt2 << 32L >>> 16L | paramShort << 48L >>> 48L) ^ a;
    long l2 = l1 ^ 0x361D660921F9L;
    return Integer.parseInt(j(paramInt1, l2));
  }
  
  @NotNull
  public final gg b(@NotNull String paramString, @NotNull List paramList1, @NotNull List paramList2, @NotNull Map paramMap) {
    return new gg(paramString, paramList1, paramList2, paramMap);
  }
  
  public gg(@NotNull String paramString, @NotNull List paramList1, @NotNull List paramList2, @NotNull Map paramMap) {
    this.b = paramString;
    this.k = paramList1;
    this.i = paramList2;
    this.v = paramMap;
  }
  
  @NotNull
  public final Map j() {
    return this.v;
  }
  
  @Nullable
  public final Player b(@NotNull String paramString, long paramLong, char paramChar) {
    long l = (paramLong << 16L | paramChar << 48L >>> 48L) ^ a;
    String str = j(paramString);
    boolean bool = false;
    j(paramString);
    return (j(paramString) != null) ? Bukkit.getPlayer(str) : null;
  }
  
  public final double b(byte paramByte, int paramInt, long paramLong) {
    long l1 = (paramByte << 56L | paramLong << 8L >>> 8L) ^ a;
    long l2 = l1 ^ 0x202C412B8329L;
    return Double.parseDouble(j(paramInt, l2));
  }
  
  @NotNull
  public final List p() {
    return this.k;
  }
  
  public int hashCode() {
    null = this.b.hashCode();
    null = null * 31 + this.k.hashCode();
    null = null * 31 + this.i.hashCode();
    return null * 31 + this.v.hashCode();
  }
  
  @NotNull
  public final List j() {
    return this.k;
  }
  
  @NotNull
  public final Map b() {
    return this.v;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/gg.a : J
    //   3: ldc2_w 12715088100096
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #1168
    //   18: ldc2_w 3497595099248033625
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield b : Ljava/lang/String;
    //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: sipush #13494
    //   41: ldc2_w 8768260816215035760
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield k : Ljava/util/List;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: sipush #7144
    //   64: ldc2_w 2769376326012690471
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield i : Ljava/util/List;
    //   81: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: sipush #1463
    //   87: ldc2_w 7578427743856066175
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: getfield v : Ljava/util/Map;
    //   104: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   107: sipush #11490
    //   110: ldc2_w 4827733427539203880
    //   113: lload_1
    //   114: lxor
    //   115: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: invokevirtual toString : ()Ljava/lang/String;
    //   126: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
    //   129: areturn
  }
  
  @Nullable
  public final String b(@NotNull String paramString) {
    return j(paramString);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    long l = a ^ 0xFC0E1B7CCD6L;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          if (this == paramObject)
            return true; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!(paramObject instanceof gg))
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    gg gg1 = (gg)paramObject;
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.b, gg1.b))
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.k, gg1.k))
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.i, gg1.i))
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!Intrinsics.areEqual(this.v, gg1.v))
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final String b(int paramInt, long paramLong) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x3A61AEB45B10L;
    return j(paramInt, l);
  }
  
  @Nullable
  public final gg b(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramInt2 << 32L >>> 32L) ^ a;
    long l2 = l1 ^ 0x291C6AFA0FFCL;
    String str = j(paramString);
    boolean bool = false;
    j(paramString);
    return (j(paramString) != null) ? of.b(str, l2) : null;
  }
  
  @Nullable
  public final Double b(long paramLong, @NotNull String paramString) {
    paramLong = a ^ paramLong;
    try {
      j(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (j(paramString) != null) ? Double.valueOf(Double.parseDouble(j(paramString))) : null;
  }
  
  @NotNull
  public final String b() {
    return this.b;
  }
  
  @Nullable
  public final Integer b(@NotNull String paramString, long paramLong) {
    paramLong = a ^ paramLong;
    try {
      j(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (j(paramString) != null) ? Integer.valueOf(Integer.parseInt(j(paramString))) : null;
  }
  
  @NotNull
  public final List b() {
    return this.i;
  }
  
  static {
    long l = a ^ 0x32D0B2B33854L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "5â¢ßÏ¹P\026\\­)ùÕùQ£#ñ\036wA0OíÞ\017<{ùùÞktØß\031_Ó8\bB\nÀëé|B¡xÇº°ÿ\030ÀÂ÷\013&-e2êõåfÃ/«y3\bxh\004ê\035XR/ÈýNR!8ðÄ¬Õ2ë«D×]¡¬1Ù»)'9ßà-\033\023xÎSNËý\021}xù\036Á?6n\\{ká¶íÈ\nÁ®:Ë+(ÌóÎCJm¢­køÞWÌgïzlKjB\b\r\036I`^0úÒ¦ÃÏÌüº8_\t]ò«%Wy\bëì\013N¹@QÂV\032cDÐ\007°¼Ú\003«\003\034\022;èÃ|9tGË«\020.+¼\033R|\030B\r¶l\000\016Û½ð\000\bÛmù3\f6ö»SÔ8\0255\025ÂQ¿\026³<¨\035Ï\bÊÂlÜ§\036nd\003\002\"A]«N}E¬jé\\ú¸!Æ \036gT)ìB[\\o£m").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x567B;
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
        throw new RuntimeException("me/rerere/matrix/internal/gg", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/gg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\gg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */