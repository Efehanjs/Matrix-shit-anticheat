package me.rerere.matrix.thirdparty.kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
  private static final long i = o3.a(4224158986056707021L, -8958302381086102255L, null).a(67847308588489L);
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull Iterable paramIterable, @NotNull Comparator<?> paramComparator) {
    long l = i ^ 0x5FC96E002C0EL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return (SortedSet)CollectionsKt.toCollection(paramIterable, new TreeSet(paramComparator));
  }
  
  @NotNull
  public static final Collection filterIsInstanceTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection, @NotNull Class paramClass) {
    long l = i ^ 0x41B7186279E7L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramClass, "klass");
    for (Object object : paramIterable) {
      if (paramClass.isInstance(object))
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull Iterable paramIterable) {
    long l = i ^ 0x662E23464D87L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return (SortedSet)CollectionsKt.toCollection(paramIterable, new TreeSet());
  }
  
  @NotNull
  public static final List filterIsInstance(@NotNull Iterable paramIterable, @NotNull Class paramClass) {
    long l = i ^ 0x71842ADF65A2L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramClass, "klass");
    return (List)CollectionsKt.filterIsInstanceTo(paramIterable, new ArrayList(), paramClass);
  }
  
  public static final void reverse(@NotNull List<?> paramList) {
    long l = i ^ 0x1E8FB4F9FF36L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Collections.reverse(paramList);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt___CollectionsJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */