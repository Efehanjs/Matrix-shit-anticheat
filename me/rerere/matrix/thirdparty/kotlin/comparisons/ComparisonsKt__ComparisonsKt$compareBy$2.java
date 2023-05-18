package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;

public final class ComparisonsKt__ComparisonsKt$compareBy$2 implements Comparator {
  public ComparisonsKt__ComparisonsKt$compareBy$2(Function1 paramFunction1) {}
  
  public final int compare(Object paramObject1, Object paramObject2) {
    Function1 function1 = this.$selector;
    return ComparisonsKt.compareValues((Comparable)function1.invoke(paramObject1), (Comparable)function1.invoke(paramObject2));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$compareBy$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */