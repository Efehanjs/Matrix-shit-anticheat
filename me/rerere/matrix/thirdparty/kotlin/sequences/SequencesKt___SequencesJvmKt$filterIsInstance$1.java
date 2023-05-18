package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements Function1 {
  @NotNull
  public final Boolean invoke(@Nullable Object paramObject) {
    return Boolean.valueOf(this.$klass.isInstance(paramObject));
  }
  
  public SequencesKt___SequencesJvmKt$filterIsInstance$1(Class paramClass) {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesJvmKt$filterIsInstance$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */