package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.BrittleContainsOptimizationKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$minus$2 implements Sequence {
  @NotNull
  public Iterator iterator() {
    Collection collection = BrittleContainsOptimizationKt.convertToSetForSetOperation(this.$elements);
    return SequencesKt.filterNot(this.$this_minus, new SequencesKt___SequencesKt$minus$2$iterator$1(collection)).iterator();
  }
  
  public SequencesKt___SequencesKt$minus$2(Object[] paramArrayOfObject, Sequence paramSequence) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$minus$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */