package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DropSequence implements Sequence, DropTakeSequence {
  @NotNull
  private final Sequence sequence;
  
  private final int count;
  
  private static final long a = o3.a(-602870046223926135L, -4958035916597696797L, null).a(34729364044865L);
  
  public DropSequence(@NotNull Sequence paramSequence, int paramInt) {
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
    int i = this.count + paramInt;
    int j = i;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (j < 0) ? new TakeSequence(this, paramInt) : new SubSequence(this.sequence, this.count, j);
  }
  
  @NotNull
  public Sequence drop(int paramInt) {
    int i = this.count + paramInt;
    int j = i;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (j < 0) ? new DropSequence(this, paramInt) : new DropSequence(this.sequence, j);
  }
  
  @NotNull
  public Iterator iterator() {
    return new DropSequence$iterator$1(this);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DropSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */