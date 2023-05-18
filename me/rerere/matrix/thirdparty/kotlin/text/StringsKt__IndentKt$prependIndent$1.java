package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt__IndentKt$prependIndent$1 extends Lambda implements Function1 {
  private static final long a = o3.a(4810776878518614581L, 5769819192384858556L, null).a(31461387921478L);
  
  public StringsKt__IndentKt$prependIndent$1(String paramString) {
    super(1);
  }
  
  @NotNull
  public final String invoke(@NotNull String paramString) {
    long l = a ^ 0x848B17E47B3L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "it");
      if (StringsKt.isBlank(paramString)) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.$indent + paramString;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__IndentKt$prependIndent$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */