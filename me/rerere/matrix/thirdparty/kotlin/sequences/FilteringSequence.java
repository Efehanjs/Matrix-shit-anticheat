package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FilteringSequence implements Sequence {
  private final boolean sendWhen;
  
  @NotNull
  private final Sequence sequence;
  
  @NotNull
  private final Function1 predicate;
  
  private static final long a = o3.a(-3335816155666244965L, -969298835368865319L, null).a(198359796872002L);
  
  public FilteringSequence(@NotNull Sequence paramSequence, boolean paramBoolean, @NotNull Function1 paramFunction1) {
    this.sequence = paramSequence;
    this.sendWhen = paramBoolean;
    this.predicate = paramFunction1;
  }
  
  @NotNull
  public Iterator iterator() {
    return new FilteringSequence$iterator$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\FilteringSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */