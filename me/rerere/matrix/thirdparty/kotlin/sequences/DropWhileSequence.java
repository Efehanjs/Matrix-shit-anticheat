package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DropWhileSequence implements Sequence {
  @NotNull
  private final Function1 predicate;
  
  @NotNull
  private final Sequence sequence;
  
  private static final long a = o3.a(4043619324928673577L, -6940826125998073096L, null).a(183487697665921L);
  
  public DropWhileSequence(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    this.sequence = paramSequence;
    this.predicate = paramFunction1;
  }
  
  @NotNull
  public Iterator iterator() {
    return new DropWhileSequence$iterator$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DropWhileSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */