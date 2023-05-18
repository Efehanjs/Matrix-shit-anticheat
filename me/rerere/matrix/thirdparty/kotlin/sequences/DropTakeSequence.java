package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface DropTakeSequence extends Sequence {
  @NotNull
  Sequence take(int paramInt);
  
  @NotNull
  Sequence drop(int paramInt);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DropTakeSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */