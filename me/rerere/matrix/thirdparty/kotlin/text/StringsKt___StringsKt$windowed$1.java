package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt___StringsKt$windowed$1 extends Lambda implements Function1 {
  public static final StringsKt___StringsKt$windowed$1 INSTANCE;
  
  private static final long a = o3.a(-3499983644111419442L, 5313535963572392255L, null).a(198167824938436L);
  
  public StringsKt___StringsKt$windowed$1() {
    super(1);
  }
  
  static {
    INSTANCE = new StringsKt___StringsKt$windowed$1();
  }
  
  @NotNull
  public final String invoke(@NotNull CharSequence paramCharSequence) {
    long l = a ^ 0x458459EA4323L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "it");
    return paramCharSequence.toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsKt$windowed$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */