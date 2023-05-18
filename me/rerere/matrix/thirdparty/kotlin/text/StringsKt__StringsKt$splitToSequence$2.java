package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt__StringsKt$splitToSequence$2 extends Lambda implements Function1 {
  private static final long a = o3.a(8127107952270738318L, -8492434253061871623L, null).a(107873410989129L);
  
  @NotNull
  public final String invoke(@NotNull IntRange paramIntRange) {
    long l = a ^ 0x3F9DF9E80FCDL;
    Intrinsics.checkNotNullParameter(paramIntRange, "it");
    return StringsKt.substring(this.$this_splitToSequence, paramIntRange);
  }
  
  public StringsKt__StringsKt$splitToSequence$2(CharSequence paramCharSequence) {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsKt$splitToSequence$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */