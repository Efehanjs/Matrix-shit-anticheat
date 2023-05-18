package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
  private static final long h = o3.a(4670253232840863715L, 4658599696329907319L, null).a(199226376609704L);
  
  @NotNull
  public static final List asReversedMutable(@NotNull List paramList) {
    long l = h ^ 0x3D1E8CA437ECL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    return new ReversedList(paramList);
  }
  
  @NotNull
  public static final List asReversed(@NotNull List paramList) {
    long l = h ^ 0x3FE98CC2F643L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    return new ReversedListReadOnly(paramList);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__ReversedViewsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */