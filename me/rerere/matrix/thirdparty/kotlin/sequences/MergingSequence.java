package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MergingSequence implements Sequence {
  @NotNull
  private final Sequence sequence1;
  
  @NotNull
  private final Function2 transform;
  
  @NotNull
  private final Sequence sequence2;
  
  private static final long a = o3.a(-6622143069619934838L, 7614195086370621066L, null).a(27602879221167L);
  
  public MergingSequence(@NotNull Sequence paramSequence1, @NotNull Sequence paramSequence2, @NotNull Function2 paramFunction2) {
    this.sequence1 = paramSequence1;
    this.sequence2 = paramSequence2;
    this.transform = paramFunction2;
  }
  
  @NotNull
  public Iterator iterator() {
    return new MergingSequence$iterator$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\MergingSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */