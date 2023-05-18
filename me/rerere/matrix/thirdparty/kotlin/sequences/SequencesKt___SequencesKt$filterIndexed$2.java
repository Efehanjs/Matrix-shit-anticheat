package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.IndexedValue;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$filterIndexed$2 extends Lambda implements Function1 {
  public static final SequencesKt___SequencesKt$filterIndexed$2 INSTANCE;
  
  private static final long a = o3.a(-6618296945647328918L, -5641690410537960657L, null).a(249295954915114L);
  
  public final Object invoke(@NotNull IndexedValue paramIndexedValue) {
    long l = a ^ 0x777A62C40228L;
    Intrinsics.checkNotNullParameter(paramIndexedValue, "it");
    return paramIndexedValue.getValue();
  }
  
  static {
    INSTANCE = new SequencesKt___SequencesKt$filterIndexed$2();
  }
  
  public SequencesKt___SequencesKt$filterIndexed$2() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$filterIndexed$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */