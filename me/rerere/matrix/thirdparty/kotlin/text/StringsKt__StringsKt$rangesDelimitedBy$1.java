package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements Function2 {
  private static final long a = o3.a(1380441775174221846L, 7818653482006312847L, null).a(8170062719776L);
  
  @Nullable
  public final Pair invoke(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x7D939DBEDB1EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "$this$$receiver");
    int i = StringsKt.indexOfAny(paramCharSequence, this.$delimiters, paramInt, this.$ignoreCase);
    int j = i;
    boolean bool = false;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (j < 0) ? null : TuplesKt.to(Integer.valueOf(j), Integer.valueOf(1));
  }
  
  public StringsKt__StringsKt$rangesDelimitedBy$1(char[] paramArrayOfchar, boolean paramBoolean) {
    super(2);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsKt$rangesDelimitedBy$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */