package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
  private static final long e = o3.a(-4102865208919868115L, 1849592503816936029L, null).a(273649518738648L);
  
  @NotNull
  public static final Iterator withIndex(@NotNull Iterator paramIterator) {
    long l = e ^ 0x1BA43A3A0062L;
    Intrinsics.checkNotNullParameter(paramIterator, "<this>");
    return new IndexingIterator(paramIterator);
  }
  
  public static final void forEach(@NotNull Iterator<Object> paramIterator, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x3AF4716218A1L;
    Intrinsics.checkNotNullParameter(paramIterator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramIterator;
    while (iterator.hasNext()) {
      Object object = iterator.next();
      paramFunction1.invoke(object);
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__IteratorsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */