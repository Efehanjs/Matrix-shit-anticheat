package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements Function1 {
  private static final long a = o3.a(3683582112925112638L, 2308582955569799445L, null).a(87296401407002L);
  
  public StringsKt__IndentKt$getIndentFunction$2(String paramString) {
    super(1);
  }
  
  @NotNull
  public final String invoke(@NotNull String paramString) {
    long l = a ^ 0x6D302C6E8236L;
    Intrinsics.checkNotNullParameter(paramString, "line");
    return this.$indent + paramString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__IndentKt$getIndentFunction$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */