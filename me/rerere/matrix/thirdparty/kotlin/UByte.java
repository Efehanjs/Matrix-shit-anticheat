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
public final class UByte implements Comparable {
  public static final int SIZE_BYTES = 1;
  
  private final byte data;
  
  public static final int SIZE_BITS = 8;
  
  public static final byte MAX_VALUE = -1;
  
  @NotNull
  public static final UByte$Companion Companion = new UByte$Companion(null);
  
  public static final byte MIN_VALUE = 0;
  
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
  
  public static int hashCode-impl(byte paramByte) {
    return paramByte;
  }
  
  public static boolean equals-impl(byte paramByte, Object paramObject) {
    try {
      if (!(paramObject instanceof UByte))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    byte b = ((UByte)paramObject).unbox-impl();
    try {
      if (paramByte != b)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @IntrinsicConstEvaluation
  @PublishedApi
  public static byte constructor-impl(byte paramByte) {
    return paramByte;
  }
  
  public static final boolean equals-impl0(byte paramByte1, byte paramByte2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramByte1 == paramByte2);
  }
  
  @NotNull
  public static String toString-impl(byte paramByte) {
    return String.valueOf(paramByte & 0xFF);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UByte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */