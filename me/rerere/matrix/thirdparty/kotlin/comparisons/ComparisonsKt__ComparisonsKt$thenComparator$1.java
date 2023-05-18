package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;

public final class ComparisonsKt__ComparisonsKt$thenComparator$1 implements Comparator {
  public final int compare(Object paramObject1, Object paramObject2) {
    int i = this.$this_thenComparator.compare(paramObject1, paramObject2);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i != 0) ? i : ((Number)this.$comparison.invoke(paramObject1, paramObject2)).intValue();
  }
  
  public ComparisonsKt__ComparisonsKt$thenComparator$1(Comparator paramComparator, Function2 paramFunction2) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$thenComparator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */