package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.7")
@ExperimentalStdlibApi
public interface OpenEndRange {
  boolean isEmpty();
  
  @NotNull
  Comparable getEndExclusive();
  
  @NotNull
  Comparable getStart();
  
  boolean contains(@NotNull Comparable paramComparable);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\OpenEndRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */