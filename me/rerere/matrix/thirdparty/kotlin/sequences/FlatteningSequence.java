package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FlatteningSequence implements Sequence {
  @NotNull
  private final Function1 transformer;
  
  @NotNull
  private final Function1 iterator;
  
  @NotNull
  private final Sequence sequence;
  
  private static final long a = o3.a(2312341409911152071L, -3803426692107268397L, null).a(50787543124020L);
  
  @NotNull
  public Iterator iterator() {
    return new FlatteningSequence$iterator$1(this);
  }
  
  public FlatteningSequence(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    this.sequence = paramSequence;
    this.transformer = paramFunction11;
    this.iterator = paramFunction12;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\FlatteningSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */