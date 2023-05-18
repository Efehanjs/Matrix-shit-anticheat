package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;

public final class ComparisonsKt__ComparisonsKt$thenBy$2 implements Comparator {
  public ComparisonsKt__ComparisonsKt$thenBy$2(Comparator paramComparator1, Comparator paramComparator2, Function1 paramFunction1) {}
  
  public final int compare(Object paramObject1, Object paramObject2) {
    int i = this.$this_thenBy.compare(paramObject1, paramObject2);
    try {
      Comparator<Object> comparator = this.$comparator;
      Function1 function1 = this.$selector;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i != 0) ? i : comparator.compare(function1.invoke(paramObject1), function1.invoke(paramObject2));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$thenBy$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */