package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TransformingIndexedSequence implements Sequence {
  @NotNull
  private final Sequence sequence;
  
  @NotNull
  private final Function2 transformer;
  
  private static final long a = o3.a(-5074915072783817863L, -4705226115822086936L, null).a(14082357730003L);
  
  @NotNull
  public Iterator iterator() {
    return new TransformingIndexedSequence$iterator$1(this);
  }
  
  public TransformingIndexedSequence(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    this.sequence = paramSequence;
    this.transformer = paramFunction2;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TransformingIndexedSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */