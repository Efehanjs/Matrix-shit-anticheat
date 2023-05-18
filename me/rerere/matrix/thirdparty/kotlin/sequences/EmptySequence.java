package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.EmptyIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class EmptySequence implements Sequence, DropTakeSequence {
  @NotNull
  public static final EmptySequence INSTANCE = new EmptySequence();
  
  @NotNull
  public Iterator iterator() {
    return (Iterator)EmptyIterator.INSTANCE;
  }
  
  @NotNull
  public EmptySequence take(int paramInt) {
    return INSTANCE;
  }
  
  @NotNull
  public EmptySequence drop(int paramInt) {
    return INSTANCE;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\EmptySequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */