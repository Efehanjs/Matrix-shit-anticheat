package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;

public final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements Function1 {
  private static final long a = o3.a(5653753215428670901L, 7321553957978431763L, null).a(72568282453125L);
  
  public final Object invoke(int paramInt) {
    long l = a ^ 0x3DFCF6812E02L;
    throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.$index + '.');
  }
  
  public SequencesKt___SequencesKt$elementAt$1(int paramInt) {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$elementAt$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */