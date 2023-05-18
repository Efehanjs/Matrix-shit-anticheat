package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;

public final class ComparisonsKt__ComparisonsKt$compareBy$3 implements Comparator {
  public ComparisonsKt__ComparisonsKt$compareBy$3(Comparator paramComparator, Function1 paramFunction1) {}
  
  public final int compare(Object paramObject1, Object paramObject2) {
    Comparator<Object> comparator = this.$comparator;
    Function1 function1 = this.$selector;
    return comparator.compare(function1.invoke(paramObject1), function1.invoke(paramObject2));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$compareBy$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */