package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface ClosedRange {
  @NotNull
  Comparable getEndInclusive();
  
  @NotNull
  Comparable getStart();
  
  boolean isEmpty();
  
  boolean contains(@NotNull Comparable paramComparable);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ClosedRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */