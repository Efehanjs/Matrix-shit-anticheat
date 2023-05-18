package me.rerere.matrix.thirdparty.kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class StringsKt___StringsJvmKt extends StringsKt__StringsKt {
  private static final long k = o3.a(-1762158853594774743L, 3181671995347405742L, null).a(56382358189280L);
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull CharSequence paramCharSequence) {
    long l = k ^ 0x6F8F42014A63L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return (SortedSet)StringsKt.toCollection(paramCharSequence, new TreeSet());
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */