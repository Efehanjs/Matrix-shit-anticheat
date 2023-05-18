package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class OpenEndRange$DefaultImpls {
  private static final long a = o3.a(3540242578289314705L, -5869860476847881616L, null).a(139297375809973L);
  
  public static boolean isEmpty(@NotNull OpenEndRange paramOpenEndRange) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramOpenEndRange.getStart().compareTo(paramOpenEndRange.getEndExclusive()) >= 0);
  }
  
  public static boolean contains(@NotNull OpenEndRange paramOpenEndRange, @NotNull Comparable<Comparable> paramComparable) {
    long l = a ^ 0x12AD4D091E07L;
    try {
      Intrinsics.checkNotNullParameter(paramComparable, "value");
      if (paramComparable.compareTo(paramOpenEndRange.getStart()) >= 0)
        try {
          if (paramComparable.compareTo(paramOpenEndRange.getEndExclusive()) < 0);
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\OpenEndRange$DefaultImpls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */