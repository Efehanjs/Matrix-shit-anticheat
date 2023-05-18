package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DistinctSequence implements Sequence {
  @NotNull
  private final Sequence source;
  
  @NotNull
  private final Function1 keySelector;
  
  private static final long a = o3.a(-6158800100328125743L, 5741792105647297492L, null).a(262861109798006L);
  
  public DistinctSequence(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    this.source = paramSequence;
    this.keySelector = paramFunction1;
  }
  
  @NotNull
  public Iterator iterator() {
    return (Iterator)new DistinctIterator(this.source.iterator(), this.keySelector);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DistinctSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */