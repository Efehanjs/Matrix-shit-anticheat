package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SlidingWindowKt$windowedSequence$$inlined$Sequence$1 implements Sequence {
  @NotNull
  public Iterator iterator() {
    boolean bool = false;
    return SlidingWindowKt.windowedIterator(this.$this_windowedSequence$inlined.iterator(), this.$size$inlined, this.$step$inlined, this.$partialWindows$inlined, this.$reuseBuffer$inlined);
  }
  
  public SlidingWindowKt$windowedSequence$$inlined$Sequence$1(Sequence paramSequence, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\SlidingWindowKt$windowedSequence$$inlined$Sequence$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */