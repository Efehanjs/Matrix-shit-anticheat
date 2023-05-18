package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {
  private static final long c = o3.a(-1864139284630985194L, 6236469781485489882L, null).a(94316127364009L);
  
  @PublishedApi
  public static final int collectionSizeOrDefault(@NotNull Iterable paramIterable, int paramInt) {
    long l = c ^ 0x1AE17FE2EF23L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return (paramIterable instanceof Collection) ? ((Collection)paramIterable).size() : paramInt;
  }
  
  @NotNull
  public static final Pair unzip(@NotNull Iterable paramIterable) {
    long l = c ^ 0x268FBE5B9939L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    ArrayList<Object> arrayList1 = new ArrayList(i);
    ArrayList<Object> arrayList2 = new ArrayList(i);
    for (Pair pair : paramIterable) {
      arrayList1.add(pair.getFirst());
      arrayList2.add(pair.getSecond());
    } 
    return TuplesKt.to(arrayList1, arrayList2);
  }
  
  @NotNull
  public static final List flatten(@NotNull Iterable paramIterable) {
    long l = c ^ 0x776780413E7AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    ArrayList arrayList = new ArrayList();
    for (Iterable iterable : paramIterable)
      CollectionsKt.addAll(arrayList, iterable); 
    return arrayList;
  }
  
  @PublishedApi
  @Nullable
  public static final Integer collectionSizeOrNull(@NotNull Iterable paramIterable) {
    long l = c ^ 0x3002EA981FE1L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return (paramIterable instanceof Collection) ? Integer.valueOf(((Collection)paramIterable).size()) : null;
  }
  
  private static RuntimeException c(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__IterablesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */