package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements Function1 {
  public CollectionsKt__CollectionsKt$binarySearchBy$1(Function1 paramFunction1, Comparable paramComparable) {
    super(1);
  }
  
  @NotNull
  public final Integer invoke(Object paramObject) {
    return Integer.valueOf(ComparisonsKt.compareValues((Comparable)this.$selector.invoke(paramObject), this.$key));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__CollectionsKt$binarySearchBy$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */