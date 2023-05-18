package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class RangesKt__RangesKt {
  private static final long a = o3.a(-5652166453847225388L, -4630318400384592615L, null).a(239903278796790L);
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final OpenEndRange rangeUntil(@NotNull Comparable paramComparable1, @NotNull Comparable paramComparable2) {
    long l = a ^ 0x7FFD9C2992F2L;
    Intrinsics.checkNotNullParameter(paramComparable1, "<this>");
    Intrinsics.checkNotNullParameter(paramComparable2, "that");
    return new ComparableOpenEndRange(paramComparable1, paramComparable2);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final OpenEndRange rangeUntil(double paramDouble1, double paramDouble2) {
    return new OpenEndDoubleRange(paramDouble1, paramDouble2);
  }
  
  public static final void checkStepIsPositive(boolean paramBoolean, @NotNull Number paramNumber) {
    long l = a ^ 0x77D78B618546L;
    try {
      Intrinsics.checkNotNullParameter(paramNumber, "step");
      if (!paramBoolean)
        throw new IllegalArgumentException("Step must be positive, was: " + paramNumber + '.'); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final ClosedFloatingPointRange rangeTo(double paramDouble1, double paramDouble2) {
    return new ClosedDoubleRange(paramDouble1, paramDouble2);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final OpenEndRange rangeUntil(float paramFloat1, float paramFloat2) {
    return new OpenEndFloatRange(paramFloat1, paramFloat2);
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final ClosedFloatingPointRange rangeTo(float paramFloat1, float paramFloat2) {
    return new ClosedFloatRange(paramFloat1, paramFloat2);
  }
  
  @NotNull
  public static final ClosedRange rangeTo(@NotNull Comparable paramComparable1, @NotNull Comparable paramComparable2) {
    long l = a ^ 0x2A2B361B17FAL;
    Intrinsics.checkNotNullParameter(paramComparable1, "<this>");
    Intrinsics.checkNotNullParameter(paramComparable2, "that");
    return new ComparableRange(paramComparable1, paramComparable2);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\RangesKt__RangesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */