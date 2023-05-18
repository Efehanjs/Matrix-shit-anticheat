package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.UByteArray;
import me.rerere.matrix.thirdparty.kotlin.UIntArray;
import me.rerere.matrix.thirdparty.kotlin.ULongArray;
import me.rerere.matrix.thirdparty.kotlin.UShortArray;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class UArraySortingKt {
  private static final long a = o3.a(-3013704812947064605L, 6711330343573071952L, null).a(149895733715176L);
  
  @ExperimentalUnsignedTypes
  public static final void sortArray-Aa5vz7o(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = a ^ 0xC95DF9CCB96L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "array");
    quickSort-Aa5vz7o(paramArrayOfshort, paramInt1, paramInt2 - 1);
  }
  
  @ExperimentalUnsignedTypes
  public static final void sortArray-oBK06Vg(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = a ^ 0x61D3B9967013L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "array");
    quickSort-oBK06Vg(paramArrayOfint, paramInt1, paramInt2 - 1);
  }
  
  @ExperimentalUnsignedTypes
  public static final void sortArray-4UcCI2c(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x3AB47EEC7729L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    quickSort-4UcCI2c(paramArrayOfbyte, paramInt1, paramInt2 - 1);
  }
  
  @ExperimentalUnsignedTypes
  public static final void sortArray--nroSd4(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = a ^ 0x3E177C421D2L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "array");
    quickSort--nroSd4(paramArrayOflong, paramInt1, paramInt2 - 1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\UArraySortingKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */