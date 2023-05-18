package me.rerere.matrix.thirdparty.kotlin.comparisons;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
  private static final long b = o3.a(994071945288808221L, -6296759665136359405L, null).a(186851482559649L);
  
  @SinceKotlin(version = "1.4")
  public static final long maxOf(long paramLong, @NotNull long... paramVarArgs) {
    long l1 = b ^ 0xABC1094F106L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    long l2 = paramLong;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      long l = paramVarArgs[b];
      l2 = Math.max(l2, l);
      b++;
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.4")
  public static final short maxOf(short paramShort, @NotNull short... paramVarArgs) {
    long l = b ^ 0x2027939CF55EL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    short s = paramShort;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      short s1 = paramVarArgs[b];
      s = (short)Math.max(s, s1);
      b++;
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Comparable maxOf(@NotNull Comparable paramComparable, @NotNull Comparable... paramVarArgs) {
    long l = b ^ 0x2A2816C8BEB4L;
    Intrinsics.checkNotNullParameter(paramComparable, "a");
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    Comparable comparable = paramComparable;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      Comparable comparable1 = paramVarArgs[b];
      comparable = ComparisonsKt.maxOf(comparable, comparable1);
      b++;
    } 
    return comparable;
  }
  
  @SinceKotlin(version = "1.4")
  public static final short minOf(short paramShort, @NotNull short... paramVarArgs) {
    long l = b ^ 0x49045BFAD8CL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    short s = paramShort;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      short s1 = paramVarArgs[b];
      s = (short)Math.min(s, s1);
      b++;
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.4")
  public static final byte minOf(byte paramByte, @NotNull byte... paramVarArgs) {
    long l = b ^ 0x434383DDBEECL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    byte b = paramByte;
    byte b1 = 0;
    int i = paramVarArgs.length;
    while (b1 < i) {
      byte b2 = paramVarArgs[b1];
      b = (byte)Math.min(b, b2);
      b1++;
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Comparable maxOf(@NotNull Comparable paramComparable1, @NotNull Comparable paramComparable2, @NotNull Comparable paramComparable3) {
    Intrinsics.checkNotNullParameter(paramComparable1, "a");
    Intrinsics.checkNotNullParameter(paramComparable2, "b");
    Intrinsics.checkNotNullParameter(paramComparable3, "c");
    return ComparisonsKt.maxOf(paramComparable1, ComparisonsKt.maxOf(paramComparable2, paramComparable3));
  }
  
  @SinceKotlin(version = "1.4")
  public static final double maxOf(double paramDouble, @NotNull double... paramVarArgs) {
    long l = b ^ 0x3CB91DAB3250L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    double d = paramDouble;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      double d1 = paramVarArgs[b];
      d = Math.max(d, d1);
      b++;
    } 
    return d;
  }
  
  @SinceKotlin(version = "1.4")
  public static final long minOf(long paramLong, @NotNull long... paramVarArgs) {
    long l1 = b ^ 0x508E3D547415L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    long l2 = paramLong;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      long l = paramVarArgs[b];
      l2 = Math.min(l2, l);
      b++;
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.4")
  public static final byte maxOf(byte paramByte, @NotNull byte... paramVarArgs) {
    long l = b ^ 0x5715C4B63045L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    byte b = paramByte;
    byte b1 = 0;
    int i = paramVarArgs.length;
    while (b1 < i) {
      byte b2 = paramVarArgs[b1];
      b = (byte)Math.max(b, b2);
      b1++;
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.4")
  public static final double minOf(double paramDouble, @NotNull double... paramVarArgs) {
    long l = b ^ 0x7B9995D29836L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    double d = paramDouble;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      double d1 = paramVarArgs[b];
      d = Math.min(d, d1);
      b++;
    } 
    return d;
  }
  
  @SinceKotlin(version = "1.4")
  public static final int maxOf(int paramInt, @NotNull int... paramVarArgs) {
    long l = b ^ 0x343957CE0A4BL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    int i = paramInt;
    byte b = 0;
    int j = paramVarArgs.length;
    while (b < j) {
      int k = paramVarArgs[b];
      i = Math.max(i, k);
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  public static final float maxOf(float paramFloat, @NotNull float... paramVarArgs) {
    long l = b ^ 0x6D786FA88BD1L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    float f = paramFloat;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      float f1 = paramVarArgs[b];
      f = Math.max(f, f1);
      b++;
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Comparable maxOf(@NotNull Comparable<Comparable> paramComparable1, @NotNull Comparable paramComparable2) {
    try {
      Intrinsics.checkNotNullParameter(paramComparable1, "a");
      Intrinsics.checkNotNullParameter(paramComparable2, "b");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramComparable1.compareTo(paramComparable2) >= 0) ? paramComparable1 : paramComparable2;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Comparable minOf(@NotNull Comparable paramComparable, @NotNull Comparable... paramVarArgs) {
    long l = b ^ 0x36F9161EFFB4L;
    Intrinsics.checkNotNullParameter(paramComparable, "a");
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    Comparable comparable = paramComparable;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      Comparable comparable1 = paramVarArgs[b];
      comparable = ComparisonsKt.minOf(comparable, comparable1);
      b++;
    } 
    return comparable;
  }
  
  @SinceKotlin(version = "1.4")
  public static final float minOf(float paramFloat, @NotNull float... paramVarArgs) {
    long l = b ^ 0x8FEAD1AACL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    float f = paramFloat;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      float f1 = paramVarArgs[b];
      f = Math.min(f, f1);
      b++;
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Comparable minOf(@NotNull Comparable paramComparable1, @NotNull Comparable paramComparable2, @NotNull Comparable paramComparable3) {
    Intrinsics.checkNotNullParameter(paramComparable1, "a");
    Intrinsics.checkNotNullParameter(paramComparable2, "b");
    Intrinsics.checkNotNullParameter(paramComparable3, "c");
    return ComparisonsKt.minOf(paramComparable1, ComparisonsKt.minOf(paramComparable2, paramComparable3));
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Comparable minOf(@NotNull Comparable<Comparable> paramComparable1, @NotNull Comparable paramComparable2) {
    try {
      Intrinsics.checkNotNullParameter(paramComparable1, "a");
      Intrinsics.checkNotNullParameter(paramComparable2, "b");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramComparable1.compareTo(paramComparable2) <= 0) ? paramComparable1 : paramComparable2;
  }
  
  @SinceKotlin(version = "1.4")
  public static final int minOf(int paramInt, @NotNull int... paramVarArgs) {
    long l = b ^ 0x57A28AADAA13L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "other");
    int i = paramInt;
    byte b = 0;
    int j = paramVarArgs.length;
    while (b < j) {
      int k = paramVarArgs[b];
      i = Math.min(i, k);
      b++;
    } 
    return i;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt___ComparisonsJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */