package me.rerere.matrix.thirdparty.kotlin.io;

import java.util.ArrayList;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TextStreamsKt$readLines$1 extends Lambda implements Function1 {
  private static final long a = o3.a(-4439458503177427146L, -137224286280420421L, null).a(88851706937081L);
  
  public TextStreamsKt$readLines$1(ArrayList paramArrayList) {
    super(1);
  }
  
  public final void invoke(@NotNull String paramString) {
    long l = a ^ 0x7D5BDB9D4F09L;
    Intrinsics.checkNotNullParameter(paramString, "it");
    this.$result.add(paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\TextStreamsKt$readLines$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */