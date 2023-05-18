package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Regex;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@JvmInline
public final class mb {
  @NotNull
  private final String i;
  
  private static boolean a;
  
  private static final long b = o3.a(-4069115924449480649L, -5139082872916388786L, MethodHandles.lookup().lookupClass()).a(192722260900032L);
  
  private static final String c;
  
  public int hashCode() {
    return j(this.i);
  }
  
  public static final int m(String paramString, long paramLong) {
    boolean bool;
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x6AF1E04CFE47L;
    try {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ".";
      bool = Integer.parseInt(StringsKt.split$default(b(l, paramString), arrayOfString, false, 0, 6, null).get(2));
    } catch (Exception exception) {
      bool = false;
    } 
    return bool;
  }
  
  public boolean equals(Object paramObject) {
    long l1 = b ^ 0x22AA5FCD384AL;
    long l2 = l1 ^ 0x685E4A943159L;
    return b(this.i, l2, paramObject);
  }
  
  public static final int b(String paramString1, @NotNull String paramString2) {
    Function1[] arrayOfFunction1 = new Function1[3];
    arrayOfFunction1[0] = (Function1)kb.i;
    arrayOfFunction1[1] = (Function1)bb.i;
    arrayOfFunction1[2] = (Function1)lb.i;
    return ComparisonsKt.compareValuesBy(b(paramString1), b(paramString2), arrayOfFunction1);
  }
  
  @NotNull
  public static String p(@NotNull String paramString) {
    return paramString;
  }
  
  public static final int p(long paramLong, String paramString) {
    boolean bool;
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x5A4244406B82L;
    try {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ".";
      bool = Integer.parseInt(StringsKt.split$default(b(l, paramString), arrayOfString, false, 0, 6, null).get(1));
    } catch (Exception exception) {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean b(String paramString, long paramLong, Object paramObject) {
    paramLong = b ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (!(paramObject instanceof mb))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (!Intrinsics.areEqual(paramString, ((mb)paramObject).b()))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public static int j(String paramString) {
    return paramString.hashCode();
  }
  
  @NotNull
  public static String j(String paramString) {
    return paramString;
  }
  
  @NotNull
  public String toString() {
    return j(this.i);
  }
  
  public static final int b(short paramShort, String paramString, long paramLong) {
    boolean bool;
    long l1 = (paramShort << 48L | paramLong << 16L >>> 16L) ^ b;
    long l2 = l1 ^ 0x14D1EB005ED3L;
    try {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ".";
      bool = Integer.parseInt(StringsKt.split$default(b(l2, paramString), arrayOfString, false, 0, 6, null).get(0));
    } catch (Exception exception) {
      bool = false;
    } 
    return bool;
  }
  
  public static final boolean j(String paramString1, String paramString2) {
    return Intrinsics.areEqual(paramString1, paramString2);
  }
  
  public static final boolean b(char paramChar, String paramString1, @NotNull String paramString2, long paramLong) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_3
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/mb.b : J
    //   16: lxor
    //   17: lstore #5
    //   19: lload #5
    //   21: dup2
    //   22: ldc2_w 8600728681341
    //   25: lxor
    //   26: dup2
    //   27: bipush #48
    //   29: lushr
    //   30: l2i
    //   31: istore #7
    //   33: dup2
    //   34: bipush #16
    //   36: lshl
    //   37: bipush #16
    //   39: lushr
    //   40: lstore #8
    //   42: pop2
    //   43: dup2
    //   44: ldc2_w 80544262032940
    //   47: lxor
    //   48: lstore #10
    //   50: pop2
    //   51: invokestatic r : ()I
    //   54: istore #12
    //   56: iload #7
    //   58: i2s
    //   59: aload_1
    //   60: lload #8
    //   62: invokestatic b : (SLjava/lang/String;J)I
    //   65: iload #7
    //   67: i2s
    //   68: aload_2
    //   69: lload #8
    //   71: invokestatic b : (SLjava/lang/String;J)I
    //   74: iload #12
    //   76: ifeq -> 120
    //   79: if_icmpne -> 127
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: lload #10
    //   91: aload_1
    //   92: invokestatic p : (JLjava/lang/String;)I
    //   95: iload #12
    //   97: ifeq -> 124
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: lload #10
    //   109: aload_2
    //   110: invokestatic p : (JLjava/lang/String;)I
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: if_icmpne -> 127
    //   123: iconst_1
    //   124: goto -> 128
    //   127: iconst_0
    //   128: ireturn
    // Exception table:
    //   from	to	target	type
    //   56	82	85	java/lang/RuntimeException
    //   79	100	103	java/lang/RuntimeException
    //   89	113	116	java/lang/RuntimeException
  }
  
  public static void J(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean W() {
    return a;
  }
  
  public static boolean O() {
    boolean bool = W();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = b ^ 0x567021959782L;
    J(false);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\mb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */