package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class IndexingSequence implements Sequence {
  @NotNull
  private final Sequence sequence;
  
  private static final long a = o3.a(-2217266207640339647L, 2778067107498069690L, null).a(124995842556775L);
  
  @NotNull
  public Iterator iterator() {
    return new IndexingSequence$iterator$1(this);
  }
  
  public IndexingSequence(@NotNull Sequence paramSequence) {
    this.sequence = paramSequence;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\IndexingSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */