package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RegexKt$fromInt$1$1 extends Lambda implements Function1 {
  @NotNull
  public final Boolean invoke(Enum paramEnum) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf(((this.$value & ((FlagEnum)paramEnum).getMask()) == ((FlagEnum)paramEnum).getValue()));
  }
  
  public RegexKt$fromInt$1$1(int paramInt) {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\RegexKt$fromInt$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */