package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ClosedRange$DefaultImpls {
  private static final long a = o3.a(-8460044156700042671L, -2591184302844381760L, null).a(163797489553537L);
  
  public static boolean contains(@NotNull ClosedRange paramClosedRange, @NotNull Comparable<Comparable> paramComparable) {
    long l = a ^ 0x71F8545B55D3L;
    try {
      Intrinsics.checkNotNullParameter(paramComparable, "value");
      if (paramComparable.compareTo(paramClosedRange.getStart()) >= 0)
        try {
          if (paramComparable.compareTo(paramClosedRange.getEndInclusive()) <= 0);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean isEmpty(@NotNull ClosedRange paramClosedRange) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramClosedRange.getStart().compareTo(paramClosedRange.getEndInclusive()) > 0);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ClosedRange$DefaultImpls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */