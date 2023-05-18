package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements Function1 {
  public static final SequencesKt__SequencesKt$flatten$2 INSTANCE;
  
  private static final long a = o3.a(2424244961080874070L, -6952384081279186252L, null).a(78467623734390L);
  
  @NotNull
  public final Iterator invoke(@NotNull Iterable paramIterable) {
    long l = a ^ 0x60E37E45A5E7L;
    Intrinsics.checkNotNullParameter(paramIterable, "it");
    return paramIterable.iterator();
  }
  
  public SequencesKt__SequencesKt$flatten$2() {
    super(1);
  }
  
  static {
    INSTANCE = new SequencesKt__SequencesKt$flatten$2();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequencesKt$flatten$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */