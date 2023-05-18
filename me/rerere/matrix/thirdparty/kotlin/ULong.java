package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.IntrinsicConstEvaluation;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.ranges.ULongRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class ULong implements Comparable {
  public static final long MIN_VALUE = 0L;
  
  public static final long MAX_VALUE = -1L;
  
  private final long data;
  
  public static final int SIZE_BYTES = 8;
  
  @NotNull
  public static final ULong$Companion Companion = new ULong$Companion(null);
  
  public static final int SIZE_BITS = 64;
  
  @IntrinsicConstEvaluation
  @PublishedApi
  public static long constructor-impl(long paramLong) {
    return paramLong;
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.data, paramObject);
  }
  
  public static final boolean equals-impl0(long paramLong1, long paramLong2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramLong1 == paramLong2);
  }
  
  @NotNull
  public String toString() {
    return toString-impl(this.data);
  }
  
  public static boolean equals-impl(long paramLong, Object paramObject) {
    try {
      if (!(paramObject instanceof ULong))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l = ((ULong)paramObject).unbox-impl();
    try {
      if (paramLong != l)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public static String toString-impl(long paramLong) {
    return UnsignedKt.ulongToString(paramLong);
  }
  
  public int hashCode() {
    return hashCode-impl(this.data);
  }
  
  public static int hashCode-impl(long paramLong) {
    return (int)(paramLong ^ paramLong >>> 32L);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ULong.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */