package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements Function1 {
  private static final long a = o3.a(8478248230829690763L, -5546455446651698293L, null).a(264556728189335L);
  
  public StringsKt__StringsKt$splitToSequence$1(CharSequence paramCharSequence) {
    super(1);
  }
  
  @NotNull
  public final String invoke(@NotNull IntRange paramIntRange) {
    long l = a ^ 0x9F25634A3D1L;
    Intrinsics.checkNotNullParameter(paramIntRange, "it");
    return StringsKt.substring(this.$this_splitToSequence, paramIntRange);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsKt$splitToSequence$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */