package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.builders.ListBuilder;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.CollectionToArray;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CollectionsKt__CollectionsJVMKt {
  private static final long a = o3.a(-1687624297588889342L, -2653592364222273552L, null).a(48393582206168L);
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final List createListBuilder(int paramInt) {
    return (List)new ListBuilder(paramInt);
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final List build(@NotNull List paramList) {
    long l = a ^ 0x35AE772F0FF4L;
    Intrinsics.checkNotNullParameter(paramList, "builder");
    return ((ListBuilder)paramList).build();
  }
  
  public static final boolean brittleContainsOptimizationEnabled() {
    boolean bool = false;
    return CollectionSystemProperties.brittleContainsOptimizationEnabled;
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final List createListBuilder() {
    return (List)new ListBuilder();
  }
  
  @NotNull
  public static final Object[] copyToArrayOfAny(@NotNull Object[] paramArrayOfObject, boolean paramBoolean) {
    long l = a ^ 0x5267BF12495FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      if (paramBoolean)
        try {
          if (Intrinsics.areEqual(paramArrayOfObject.getClass(), Object[].class));
        } catch (ArithmeticException arithmeticException) {
          throw a(null);
        }  
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length, Object[].class), "copyOf(this, this.size, Array<Any?>::class.java)");
    return Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length, Object[].class);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List shuffled(@NotNull Iterable paramIterable, @NotNull Random paramRandom) {
    long l = a ^ 0x633701BB817FL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    List<?> list1 = CollectionsKt.toMutableList(paramIterable);
    List<?> list2 = list1;
    boolean bool = false;
    Collections.shuffle(list2, paramRandom);
    return list1;
  }
  
  @NotNull
  public static final List listOf(Object paramObject) {
    long l = a ^ 0x5A47D7AE6A18L;
    Intrinsics.checkNotNullExpressionValue(Collections.singletonList(paramObject), "singletonList(element)");
    return Collections.singletonList(paramObject);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List shuffled(@NotNull Iterable paramIterable) {
    long l = a ^ 0x43F22BC6E707L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    List<?> list1 = CollectionsKt.toMutableList(paramIterable);
    List<?> list2 = list1;
    boolean bool = false;
    Collections.shuffle(list2);
    return list1;
  }
  
  private static ArithmeticException a(ArithmeticException paramArithmeticException) {
    return paramArithmeticException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__CollectionsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */