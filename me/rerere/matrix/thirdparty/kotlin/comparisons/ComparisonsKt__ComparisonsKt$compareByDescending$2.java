package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;

public final class ComparisonsKt__ComparisonsKt$compareByDescending$2 implements Comparator {
  public final int compare(Object paramObject1, Object paramObject2) {
    Comparator<Object> comparator = this.$comparator;
    Function1 function1 = this.$selector;
    return comparator.compare(function1.invoke(paramObject2), function1.invoke(paramObject1));
  }
  
  public ComparisonsKt__ComparisonsKt$compareByDescending$2(Comparator paramComparator, Function1 paramFunction1) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$compareByDescending$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */