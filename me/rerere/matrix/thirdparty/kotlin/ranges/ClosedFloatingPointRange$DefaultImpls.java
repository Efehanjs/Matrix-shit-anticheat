package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ClosedFloatingPointRange$DefaultImpls {
  private static final long a = o3.a(-8784240020388210416L, 4651170143884541475L, null).a(156438127948537L);
  
  public static boolean isEmpty(@NotNull ClosedFloatingPointRange paramClosedFloatingPointRange) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !paramClosedFloatingPointRange.lessThanOrEquals(paramClosedFloatingPointRange.getStart(), paramClosedFloatingPointRange.getEndInclusive());
  }
  
  public static boolean contains(@NotNull ClosedFloatingPointRange paramClosedFloatingPointRange, @NotNull Comparable paramComparable) {
    long l = a ^ 0x4D51875B7604L;
    try {
      Intrinsics.checkNotNullParameter(paramComparable, "value");
      if (paramClosedFloatingPointRange.lessThanOrEquals(paramClosedFloatingPointRange.getStart(), paramComparable))
        try {
          if (paramClosedFloatingPointRange.lessThanOrEquals(paramComparable, paramClosedFloatingPointRange.getEndInclusive()));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ClosedFloatingPointRange$DefaultImpls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */