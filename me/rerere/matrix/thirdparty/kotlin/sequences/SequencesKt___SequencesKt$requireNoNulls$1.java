package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements Function1 {
  private static final long a = o3.a(7053786866854194983L, 3896550964793505763L, null).a(144232683759L);
  
  public SequencesKt___SequencesKt$requireNoNulls$1(Sequence paramSequence) {
    super(1);
  }
  
  @NotNull
  public final Object invoke(@Nullable Object paramObject) {
    long l = a ^ 0x183BFDF47EC7L;
    try {
      if (paramObject == null)
        throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.'); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramObject;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$requireNoNulls$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */