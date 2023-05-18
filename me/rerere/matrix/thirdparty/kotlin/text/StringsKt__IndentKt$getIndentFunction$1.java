package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt__IndentKt$getIndentFunction$1 extends Lambda implements Function1 {
  public static final StringsKt__IndentKt$getIndentFunction$1 INSTANCE;
  
  private static final long a = o3.a(-5730843258387293972L, 217702652061002633L, null).a(169895993265902L);
  
  public StringsKt__IndentKt$getIndentFunction$1() {
    super(1);
  }
  
  static {
    INSTANCE = new StringsKt__IndentKt$getIndentFunction$1();
  }
  
  @NotNull
  public final String invoke(@NotNull String paramString) {
    long l = a ^ 0x70169EF5590CL;
    Intrinsics.checkNotNullParameter(paramString, "line");
    return paramString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__IndentKt$getIndentFunction$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */