package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt___StringsKt$windowedSequence$1 extends Lambda implements Function1 {
  public static final StringsKt___StringsKt$windowedSequence$1 INSTANCE;
  
  private static final long a = o3.a(-1240250106385112898L, -4490949377925167995L, null).a(143353295032609L);
  
  @NotNull
  public final String invoke(@NotNull CharSequence paramCharSequence) {
    long l = a ^ 0x4B86337D1EC1L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "it");
    return paramCharSequence.toString();
  }
  
  static {
    INSTANCE = new StringsKt___StringsKt$windowedSequence$1();
  }
  
  public StringsKt___StringsKt$windowedSequence$1() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsKt$windowedSequence$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */