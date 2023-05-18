package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
public interface ClosedFloatingPointRange extends ClosedRange {
  boolean contains(@NotNull Comparable paramComparable);
  
  boolean isEmpty();
  
  boolean lessThanOrEquals(@NotNull Comparable paramComparable1, @NotNull Comparable paramComparable2);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ClosedFloatingPointRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */