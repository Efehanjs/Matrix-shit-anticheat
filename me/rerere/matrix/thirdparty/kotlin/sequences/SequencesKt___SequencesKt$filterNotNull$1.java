package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements Function1 {
  public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();
  
  public SequencesKt___SequencesKt$filterNotNull$1() {
    super(1);
  }
  
  @NotNull
  public final Boolean invoke(@Nullable Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramObject == null));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$filterNotNull$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */