package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements Function1 {
  @NotNull
  public final Boolean invoke(Object paramObject) {
    try {
      if (!this.$removed.element)
        try {
          if (Intrinsics.areEqual(paramObject, this.$element))
            this.$removed.element = true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf(true);
  }
  
  public SequencesKt___SequencesKt$minus$1$iterator$1(Ref.BooleanRef paramBooleanRef, Object paramObject) {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$minus$1$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */