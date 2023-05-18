package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements Function1 {
  public static final SequencesKt__SequencesKt$flatten$1 INSTANCE;
  
  private static final long a = o3.a(5417978672067183529L, -4640801888466980450L, null).a(206944368294167L);
  
  static {
    INSTANCE = new SequencesKt__SequencesKt$flatten$1();
  }
  
  @NotNull
  public final Iterator invoke(@NotNull Sequence paramSequence) {
    long l = a ^ 0x2F793ACF06E6L;
    Intrinsics.checkNotNullParameter(paramSequence, "it");
    return paramSequence.iterator();
  }
  
  public SequencesKt__SequencesKt$flatten$1() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequencesKt$flatten$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */