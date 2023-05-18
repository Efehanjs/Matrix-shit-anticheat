package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TransformingSequence implements Sequence {
  @NotNull
  private final Function1 transformer;
  
  @NotNull
  private final Sequence sequence;
  
  private static final long a = o3.a(-503664309737335403L, 8539320042135678925L, null).a(133939911925427L);
  
  @NotNull
  public final Sequence flatten$kotlin_stdlib(@NotNull Function1 paramFunction1) {
    long l = a ^ 0x71DE1E60FD22L;
    Intrinsics.checkNotNullParameter(paramFunction1, "iterator");
    return new FlatteningSequence(this.sequence, this.transformer, paramFunction1);
  }
  
  public TransformingSequence(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    this.sequence = paramSequence;
    this.transformer = paramFunction1;
  }
  
  @NotNull
  public Iterator iterator() {
    return new TransformingSequence$iterator$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TransformingSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */