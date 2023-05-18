package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements Function2 {
  private static final long a = o3.a(-7455616917022233920L, -8428039913042667553L, null).a(227510569084680L);
  
  public StringsKt__StringsKt$rangesDelimitedBy$2(List paramList, boolean paramBoolean) {
    super(2);
  }
  
  @Nullable
  public final Pair invoke(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x614575E22600L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "$this$$receiver");
    Pair pair1 = StringsKt__StringsKt.access$findAnyOf(paramCharSequence, this.$delimitersList, paramInt, this.$ignoreCase, false);
    Pair pair2 = pair1;
    boolean bool = false;
    StringsKt__StringsKt.access$findAnyOf(paramCharSequence, this.$delimitersList, paramInt, this.$ignoreCase, false);
    return (StringsKt__StringsKt.access$findAnyOf(paramCharSequence, this.$delimitersList, paramInt, this.$ignoreCase, false) != null) ? TuplesKt.to(pair2.getFirst(), Integer.valueOf(((String)pair2.getSecond()).length())) : null;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsKt$rangesDelimitedBy$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */