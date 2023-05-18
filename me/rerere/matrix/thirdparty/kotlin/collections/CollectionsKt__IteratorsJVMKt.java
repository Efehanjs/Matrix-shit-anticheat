package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt {
  private static final long d = o3.a(-71047011962747760L, -1971507894346970678L, null).a(7983125855908L);
  
  @NotNull
  public static final Iterator iterator(@NotNull Enumeration paramEnumeration) {
    long l = d ^ 0x17FF85CCED84L;
    Intrinsics.checkNotNullParameter(paramEnumeration, "<this>");
    return new CollectionsKt__IteratorsJVMKt$iterator$1(paramEnumeration);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__IteratorsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */