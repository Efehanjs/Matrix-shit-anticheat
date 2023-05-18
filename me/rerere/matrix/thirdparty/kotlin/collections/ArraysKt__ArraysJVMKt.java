package me.rerere.matrix.thirdparty.kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ArraysKt__ArraysJVMKt {
  private static final long a = o3.a(6420949280176786987L, 4082156421772117228L, null).a(106656943400087L);
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  public static final int contentDeepHashCode(@Nullable Object[] paramArrayOfObject) {
    return Arrays.deepHashCode(paramArrayOfObject);
  }
  
  @SinceKotlin(version = "1.3")
  public static final void copyOfRangeToIndexCheck(int paramInt1, int paramInt2) {
    long l = a ^ 0x7CBE7D2BF8A0L;
    try {
      if (paramInt1 > paramInt2)
        throw new IndexOutOfBoundsException("toIndex (" + paramInt1 + ") is greater than size (" + paramInt2 + ")."); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final Object[] arrayOfNulls(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = a ^ 0x5FBD0471DD00L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "reference");
    Intrinsics.checkNotNull(Array.newInstance(paramArrayOfObject.getClass().getComponentType(), paramInt), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
    return (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), paramInt);
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt__ArraysJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */