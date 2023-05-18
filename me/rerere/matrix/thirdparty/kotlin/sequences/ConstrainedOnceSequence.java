package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ConstrainedOnceSequence implements Sequence {
  @NotNull
  private final AtomicReference sequenceRef;
  
  private static final long a = o3.a(-6187324641911086179L, 8936437581228522523L, null).a(86979371576322L);
  
  public ConstrainedOnceSequence(@NotNull Sequence paramSequence) {
    this.sequenceRef = new AtomicReference<Sequence>(paramSequence);
  }
  
  @NotNull
  public Iterator iterator() {
    Sequence sequence;
    long l = a ^ 0x10E9A8929DDBL;
    try {
      if ((Sequence)this.sequenceRef.getAndSet(null) == null) {
        (Sequence)this.sequenceRef.getAndSet(null);
        throw new IllegalStateException("This sequence can be consumed only once.");
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return sequence.iterator();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\ConstrainedOnceSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */