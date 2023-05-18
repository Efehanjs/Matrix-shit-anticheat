package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Arrays;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ListBuilderKt {
  private static final long a = o3.a(-6228410966699902135L, 4013609128473332919L, null).a(233527072640578L);
  
  public static final void resetRange(@NotNull Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    long l = a ^ 0x62D0327E8F6BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    int i = paramInt1;
    try {
      while (i < paramInt2) {
        resetAt(paramArrayOfObject, i);
        i++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final Object[] copyOfUninitializedElements(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = a ^ 0x5D38F663448BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfObject, paramInt), "copyOf(this, newSize)");
    Intrinsics.checkNotNull(Arrays.copyOf(paramArrayOfObject, paramInt), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>");
    return Arrays.copyOf(paramArrayOfObject, paramInt);
  }
  
  @NotNull
  public static final Object[] arrayOfUninitializedElements(int paramInt) {
    long l = a ^ 0x1CE5650550CDL;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "capacity must be non-negative.";
      throw new IllegalArgumentException(str.toString());
    } 
    return new Object[paramInt];
  }
  
  public static final void resetAt(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = a ^ 0x372794E6E26BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    paramArrayOfObject[paramInt] = null;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\ListBuilderKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */