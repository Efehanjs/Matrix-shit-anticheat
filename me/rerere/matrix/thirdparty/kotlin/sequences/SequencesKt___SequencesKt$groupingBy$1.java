package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.Grouping;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$groupingBy$1 implements Grouping {
  public Object keyOf(Object paramObject) {
    return this.$keySelector.invoke(paramObject);
  }
  
  public SequencesKt___SequencesKt$groupingBy$1(Sequence paramSequence, Function1 paramFunction1) {}
  
  @NotNull
  public Iterator sourceIterator() {
    return this.$this_groupingBy.iterator();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$groupingBy$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */