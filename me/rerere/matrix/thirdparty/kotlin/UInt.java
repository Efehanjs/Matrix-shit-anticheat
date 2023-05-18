package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.IntrinsicConstEvaluation;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.ranges.UIntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UInt implements Comparable {
  public static final int MAX_VALUE = -1;
  
  public static final int MIN_VALUE = 0;
  
  @NotNull
  public static final UInt$Companion Companion = new UInt$Companion(null);
  
  public static final int SIZE_BITS = 32;
  
  private final int data;
  
  public static final int SIZE_BYTES = 4;
  
  @NotNull
  public static String toString-impl(int paramInt) {
    return String.valueOf(paramInt & 0xFFFFFFFFL);
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.data, paramObject);
  }
  
  @NotNull
  public String toString() {
    return toString-impl(this.data);
  }
  
  public int hashCode() {
    return hashCode-impl(this.data);
  }
  
  public static final boolean equals-impl0(int paramInt1, int paramInt2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramInt1 == paramInt2);
  }
  
  public static boolean equals-impl(int paramInt, Object paramObject) {
    try {
      if (!(paramObject instanceof UInt))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = ((UInt)paramObject).unbox-impl();
    try {
      if (paramInt != i)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public static int hashCode-impl(int paramInt) {
    return paramInt;
  }
  
  @IntrinsicConstEvaluation
  @PublishedApi
  public static int constructor-impl(int paramInt) {
    return paramInt;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UInt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */