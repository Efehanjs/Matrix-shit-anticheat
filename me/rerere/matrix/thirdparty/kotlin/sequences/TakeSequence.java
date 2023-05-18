package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TakeSequence implements Sequence, DropTakeSequence {
  private final int count;
  
  @NotNull
  private final Sequence sequence;
  
  private static final long a = o3.a(7387476727398816424L, -6051564037160012245L, null).a(257706288649169L);
  
  public TakeSequence(@NotNull Sequence paramSequence, int paramInt) {
    this.sequence = paramSequence;
    this.count = paramInt;
    boolean bool = (this.count >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "count must be non-negative, but was " + this.count + '.';
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  @NotNull
  public Sequence take(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt >= this.count) ? this : new TakeSequence(this.sequence, paramInt);
  }
  
  @NotNull
  public Iterator iterator() {
    return new TakeSequence$iterator$1(this);
  }
  
  @NotNull
  public Sequence drop(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt >= this.count) ? SequencesKt.emptySequence() : new SubSequence(this.sequence, paramInt, this.count);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TakeSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */