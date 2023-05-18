package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class GeneratorSequence implements Sequence {
  @NotNull
  private final Function1 getNextValue;
  
  @NotNull
  private final Function0 getInitialValue;
  
  private static final long a = o3.a(-5461329424484330622L, 9051407517215568331L, null).a(55289856605770L);
  
  @NotNull
  public Iterator iterator() {
    return new GeneratorSequence$iterator$1(this);
  }
  
  public GeneratorSequence(@NotNull Function0 paramFunction0, @NotNull Function1 paramFunction1) {
    this.getInitialValue = paramFunction0;
    this.getNextValue = paramFunction1;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\GeneratorSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */