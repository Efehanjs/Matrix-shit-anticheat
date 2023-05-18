package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$sortedWith$1 implements Sequence {
  @NotNull
  public Iterator iterator() {
    List list = SequencesKt.toMutableList(this.$this_sortedWith);
    CollectionsKt.sortWith(list, this.$comparator);
    return list.iterator();
  }
  
  public SequencesKt___SequencesKt$sortedWith$1(Sequence paramSequence, Comparator paramComparator) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$sortedWith$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */