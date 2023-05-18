package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt___StringsKt$chunkedSequence$1 extends Lambda implements Function1 {
  public static final StringsKt___StringsKt$chunkedSequence$1 INSTANCE;
  
  private static final long a = o3.a(-6265835580469493795L, -5210507302872578995L, null).a(217039278716108L);
  
  @NotNull
  public final String invoke(@NotNull CharSequence paramCharSequence) {
    long l = a ^ 0x220E94A91482L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "it");
    return paramCharSequence.toString();
  }
  
  public StringsKt___StringsKt$chunkedSequence$1() {
    super(1);
  }
  
  static {
    INSTANCE = new StringsKt___StringsKt$chunkedSequence$1();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsKt$chunkedSequence$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */