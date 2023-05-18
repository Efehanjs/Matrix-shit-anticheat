package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Collection;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$minus$4$iterator$1 extends Lambda implements Function1 {
  public SequencesKt___SequencesKt$minus$4$iterator$1(Collection paramCollection) {
    super(1);
  }
  
  @NotNull
  public final Boolean invoke(Object paramObject) {
    return Boolean.valueOf(this.$other.contains(paramObject));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$minus$4$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */