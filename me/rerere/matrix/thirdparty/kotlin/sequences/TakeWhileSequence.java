package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TakeWhileSequence implements Sequence {
  @NotNull
  private final Sequence sequence;
  
  @NotNull
  private final Function1 predicate;
  
  private static final long a = o3.a(-2010032301326046042L, -4501081217483759460L, null).a(42698280413882L);
  
  public TakeWhileSequence(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    this.sequence = paramSequence;
    this.predicate = paramFunction1;
  }
  
  @NotNull
  public Iterator iterator() {
    return new TakeWhileSequence$iterator$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TakeWhileSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */