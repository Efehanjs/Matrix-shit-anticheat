package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;

public final class StringsKt___StringsKt$windowedSequence$2 extends Lambda implements Function1 {
  public final Object invoke(int paramInt) {
    int i = paramInt + this.$size;
    try {
      if (i >= 0) {
        try {
          if (i > this.$this_windowedSequence.length());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        int j = i;
        return this.$transform.invoke(this.$this_windowedSequence.subSequence(paramInt, j));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public StringsKt___StringsKt$windowedSequence$2(int paramInt, CharSequence paramCharSequence, Function1 paramFunction1) {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsKt$windowedSequence$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */