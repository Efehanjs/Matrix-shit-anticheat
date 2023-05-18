package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$zipWithNext$1 extends Lambda implements Function2 {
  public static final SequencesKt___SequencesKt$zipWithNext$1 INSTANCE = new SequencesKt___SequencesKt$zipWithNext$1();
  
  @NotNull
  public final Pair invoke(Object paramObject1, Object paramObject2) {
    return TuplesKt.to(paramObject1, paramObject2);
  }
  
  public SequencesKt___SequencesKt$zipWithNext$1() {
    super(2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$zipWithNext$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */