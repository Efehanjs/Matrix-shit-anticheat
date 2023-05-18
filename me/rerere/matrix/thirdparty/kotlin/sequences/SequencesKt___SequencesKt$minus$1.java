package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$minus$1 implements Sequence {
  public SequencesKt___SequencesKt$minus$1(Sequence paramSequence, Object paramObject) {}
  
  @NotNull
  public Iterator iterator() {
    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
    return SequencesKt.filter(this.$this_minus, new SequencesKt___SequencesKt$minus$1$iterator$1(booleanRef, this.$element)).iterator();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$minus$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */