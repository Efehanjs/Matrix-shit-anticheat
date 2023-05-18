package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;

public final class ComparisonsKt__ComparisonsKt$thenDescending$1 implements Comparator {
  public ComparisonsKt__ComparisonsKt$thenDescending$1(Comparator paramComparator1, Comparator paramComparator2) {}
  
  public final int compare(Object paramObject1, Object paramObject2) {
    int i = this.$this_thenDescending.compare(paramObject1, paramObject2);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i != 0) ? i : this.$comparator.compare(paramObject2, paramObject1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$thenDescending$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */