package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
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

public class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
  private static final long d = o3.a(3441609322469144941L, -3522647914182807632L, null).a(202373996323684L);
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull Sequence paramSequence, @NotNull Comparator<?> paramComparator) {
    long l = d ^ 0x360322E058B6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return (SortedSet)SequencesKt.toCollection(paramSequence, new TreeSet(paramComparator));
  }
  
  @NotNull
  public static final Sequence filterIsInstance(@NotNull Sequence paramSequence, @NotNull Class paramClass) {
    long l = d ^ 0x4E2C7CB387DBL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramClass, "klass");
    Intrinsics.checkNotNull(SequencesKt.filter(paramSequence, new SequencesKt___SequencesJvmKt$filterIsInstance$1(paramClass)), "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
    return SequencesKt.filter(paramSequence, new SequencesKt___SequencesJvmKt$filterIsInstance$1(paramClass));
  }
  
  @NotNull
  public static final Collection filterIsInstanceTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection, @NotNull Class paramClass) {
    long l = d ^ 0x45E06FA32FF2L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramClass, "klass");
    for (Object object : paramSequence) {
      if (paramClass.isInstance(object))
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull Sequence paramSequence) {
    long l = d ^ 0x68164870DAAL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return (SortedSet)SequencesKt.toCollection(paramSequence, new TreeSet());
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */