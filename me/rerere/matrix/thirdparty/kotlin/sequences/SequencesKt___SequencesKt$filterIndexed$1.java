package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.IndexedValue;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements Function1 {
  private static final long a = o3.a(-2886909145776060738L, -6469881549742271495L, null).a(241311862830265L);
  
  public SequencesKt___SequencesKt$filterIndexed$1(Function2 paramFunction2) {
    super(1);
  }
  
  @NotNull
  public final Boolean invoke(@NotNull IndexedValue paramIndexedValue) {
    long l = a ^ 0x1CFC8AE4838AL;
    Intrinsics.checkNotNullParameter(paramIndexedValue, "it");
    return (Boolean)this.$predicate.invoke(Integer.valueOf(paramIndexedValue.getIndex()), paramIndexedValue.getValue());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$filterIndexed$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */