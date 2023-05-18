package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.IntrinsicConstEvaluation;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.UIntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UShort implements Comparable {
  public static final short MIN_VALUE = 0;
  
  private final short data;
  
  public static final int SIZE_BYTES = 2;
  
  public static final short MAX_VALUE = -1;
  
  @NotNull
  public static final UShort$Companion Companion = new UShort$Companion(null);
  
  public static final int SIZE_BITS = 16;
  
  public static final boolean equals-impl0(short paramShort1, short paramShort2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramShort1 == paramShort2);
  }
  
  public static int hashCode-impl(short paramShort) {
    return paramShort;
  }
  
  @NotNull
  public String toString() {
    return toString-impl(this.data);
  }
  
  public static boolean equals-impl(short paramShort, Object paramObject) {
    try {
      if (!(paramObject instanceof UShort))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    short s = ((UShort)paramObject).unbox-impl();
    try {
      if (paramShort != s)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public static String toString-impl(short paramShort) {
    return String.valueOf(paramShort & 0xFFFF);
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.data, paramObject);
  }
  
  @IntrinsicConstEvaluation
  @PublishedApi
  public static short constructor-impl(short paramShort) {
    return paramShort;
  }
  
  public int hashCode() {
    return hashCode-impl(this.data);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UShort.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */