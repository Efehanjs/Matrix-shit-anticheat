package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SubSequence implements Sequence, DropTakeSequence {
  private final int endIndex;
  
  @NotNull
  private final Sequence sequence;
  
  private final int startIndex;
  
  private static final long a = o3.a(-7296523186835874211L, 4256224896568965191L, null).a(4626455097447L);
  
  @NotNull
  public Sequence drop(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt >= getCount()) ? SequencesKt.emptySequence() : new SubSequence(this.sequence, this.startIndex + paramInt, this.endIndex);
  }
  
  @NotNull
  public Sequence take(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt >= getCount()) ? this : new SubSequence(this.sequence, this.startIndex, this.startIndex + paramInt);
  }
  
  @NotNull
  public Iterator iterator() {
    return new SubSequence$iterator$1(this);
  }
  
  public SubSequence(@NotNull Sequence paramSequence, int paramInt1, int paramInt2) {
    this.sequence = paramSequence;
    this.startIndex = paramInt1;
    this.endIndex = paramInt2;
    boolean bool = (this.startIndex >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "startIndex should be non-negative, but is " + this.startIndex;
      throw new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool = (this.endIndex >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "endIndex should be non-negative, but is " + this.endIndex;
      throw new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool = (this.endIndex >= this.startIndex) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "endIndex should be not less than startIndex, but was " + this.endIndex + " < " + this.startIndex;
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SubSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */