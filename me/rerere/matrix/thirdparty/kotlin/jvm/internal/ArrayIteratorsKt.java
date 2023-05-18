package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.BooleanIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.ByteIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.CharIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.DoubleIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.FloatIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.LongIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.ShortIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayIteratorsKt {
  private static final long a = o3.a(-9071918018056289292L, 6492123957407576040L, null).a(67040090249765L);
  
  @NotNull
  public static final FloatIterator iterator(@NotNull float[] paramArrayOffloat) {
    long l = a ^ 0x24BCCE558628L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "array");
    return new ArrayFloatIterator(paramArrayOffloat);
  }
  
  @NotNull
  public static final CharIterator iterator(@NotNull char[] paramArrayOfchar) {
    long l = a ^ 0x1D6CD9B46425L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "array");
    return new ArrayCharIterator(paramArrayOfchar);
  }
  
  @NotNull
  public static final ByteIterator iterator(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x2F9C6F6DBE6DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    return new ArrayByteIterator(paramArrayOfbyte);
  }
  
  @NotNull
  public static final ShortIterator iterator(@NotNull short[] paramArrayOfshort) {
    long l = a ^ 0x3FA315E5EBF2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "array");
    return new ArrayShortIterator(paramArrayOfshort);
  }
  
  @NotNull
  public static final LongIterator iterator(@NotNull long[] paramArrayOflong) {
    long l = a ^ 0x18990546C4F0L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "array");
    return new ArrayLongIterator(paramArrayOflong);
  }
  
  @NotNull
  public static final BooleanIterator iterator(@NotNull boolean[] paramArrayOfboolean) {
    long l = a ^ 0x6DF2D440E4F1L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "array");
    return new ArrayBooleanIterator(paramArrayOfboolean);
  }
  
  @NotNull
  public static final IntIterator iterator(@NotNull int[] paramArrayOfint) {
    long l = a ^ 0x1C01635676F8L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "array");
    return new ArrayIntIterator(paramArrayOfint);
  }
  
  @NotNull
  public static final DoubleIterator iterator(@NotNull double[] paramArrayOfdouble) {
    long l = a ^ 0x3B2E766B2BB8L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "array");
    return new ArrayDoubleIterator(paramArrayOfdouble);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayIteratorsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */