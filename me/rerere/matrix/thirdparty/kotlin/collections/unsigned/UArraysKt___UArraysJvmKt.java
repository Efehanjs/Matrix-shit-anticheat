package me.rerere.matrix.thirdparty.kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.UByte;
import me.rerere.matrix.thirdparty.kotlin.UByteArray;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.UIntArray;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.ULongArray;
import me.rerere.matrix.thirdparty.kotlin.UShort;
import me.rerere.matrix.thirdparty.kotlin.UShortArray;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class UArraysKt___UArraysJvmKt {
  private static final long a = o3.a(-1834123722436886635L, -6977718431305095228L, null).a(169128883317986L);
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final int binarySearch-WpHrYlw(@NotNull byte[] paramArrayOfbyte, byte paramByte, int paramInt1, int paramInt2) {
    long l = a ^ 0x7197CD27A323L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$binarySearch");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, UByteArray.getSize-impl(paramArrayOfbyte));
    int i = paramByte & 0xFF;
    int j = paramInt1;
    int k = paramInt2 - 1;
    while (j <= k) {
      int m = j + k >>> 1;
      byte b = paramArrayOfbyte[m];
      int n = UnsignedKt.uintCompare(b, i);
      if (n < 0) {
        j = m + 1;
        continue;
      } 
      if (n > 0) {
        k = m - 1;
        continue;
      } 
      return m;
    } 
    return -(j + 1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List asList-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = a ^ 0x118FCAB5873CL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$asList");
    return (List)new UArraysKt___UArraysJvmKt$asList$2(paramArrayOflong);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final int binarySearch-2fe2U9s(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    long l = a ^ 0x44AB944D8D4DL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$binarySearch");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt2, paramInt3, UIntArray.getSize-impl(paramArrayOfint));
    int i = paramInt1;
    int j = paramInt2;
    int k = paramInt3 - 1;
    while (j <= k) {
      int m = j + k >>> 1;
      int n = paramArrayOfint[m];
      int i1 = UnsignedKt.uintCompare(n, i);
      if (i1 < 0) {
        j = m + 1;
        continue;
      } 
      if (i1 > 0) {
        k = m - 1;
        continue;
      } 
      return m;
    } 
    return -(j + 1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List asList-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = a ^ 0x6C77AECBEE7EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$asList");
    return (List)new UArraysKt___UArraysJvmKt$asList$4(paramArrayOfshort);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final int binarySearch-EtDCXyQ(@NotNull short[] paramArrayOfshort, short paramShort, int paramInt1, int paramInt2) {
    long l = a ^ 0x138D1010F02CL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$binarySearch");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, UShortArray.getSize-impl(paramArrayOfshort));
    int i = paramShort & 0xFFFF;
    int j = paramInt1;
    int k = paramInt2 - 1;
    while (j <= k) {
      int m = j + k >>> 1;
      short s = paramArrayOfshort[m];
      int n = UnsignedKt.uintCompare(s, i);
      if (n < 0) {
        j = m + 1;
        continue;
      } 
      if (n > 0) {
        k = m - 1;
        continue;
      } 
      return m;
    } 
    return -(j + 1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List asList-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x38E31973C567L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$asList");
    return (List)new UArraysKt___UArraysJvmKt$asList$3(paramArrayOfbyte);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final int binarySearch-K6DWlUc(@NotNull long[] paramArrayOflong, long paramLong, int paramInt1, int paramInt2) {
    long l1 = a ^ 0x8FD9FE1A87CL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$binarySearch");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, ULongArray.getSize-impl(paramArrayOflong));
    long l2 = paramLong;
    int i = paramInt1;
    int j = paramInt2 - 1;
    while (i <= j) {
      int k = i + j >>> 1;
      long l = paramArrayOflong[k];
      int m = UnsignedKt.ulongCompare(l, l2);
      if (m < 0) {
        i = k + 1;
        continue;
      } 
      if (m > 0) {
        j = k - 1;
        continue;
      } 
      return k;
    } 
    return -(i + 1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List asList--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = a ^ 0x1752663C48C3L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$asList");
    return (List)new UArraysKt___UArraysJvmKt$asList$1(paramArrayOfint);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collection\\unsigned\UArraysKt___UArraysJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */