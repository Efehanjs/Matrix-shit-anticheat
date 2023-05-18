package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.BuilderInference;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
  private static final long b = o3.a(-9132631594676976747L, -2518297032241015968L, null).a(990070020080L);
  
  @NotNull
  public static final IntRange getIndices(@NotNull Collection paramCollection) {
    long l = b ^ 0x5FF63A223F4FL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    return new IntRange(0, paramCollection.size() - 1);
  }
  
  public static final int binarySearch(@NotNull List<Comparable> paramList, @Nullable Comparable paramComparable, int paramInt1, int paramInt2) {
    long l = b ^ 0x65E2F5ED4973L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    rangeCheck$CollectionsKt__CollectionsKt(paramList.size(), paramInt1, paramInt2);
    int i = paramInt1;
    int j = paramInt2 - 1;
    while (i <= j) {
      int k = i + j >>> 1;
      Comparable comparable = paramList.get(k);
      int m = ComparisonsKt.compareValues(comparable, paramComparable);
      if (m < 0) {
        i = k + 1;
        continue;
      } 
      if (m > 0) {
        j = k - 1;
        continue;
      } 
      return k;
    } 
    return -(i + 1);
  }
  
  @NotNull
  public static final List listOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x1EF8FC29D01CL;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramVarArgs.length > 0) ? ArraysKt.asList(paramVarArgs) : CollectionsKt.emptyList();
  }
  
  @NotNull
  public static final List listOfNotNull(@Nullable Object paramObject) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramObject != null) ? CollectionsKt.listOf(paramObject) : CollectionsKt.emptyList();
  }
  
  @NotNull
  public static final List mutableListOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x180A55CF50AFL;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramVarArgs.length == 0) ? new ArrayList() : new ArrayList(new ArrayAsCollection(paramVarArgs, true));
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final List shuffled(@NotNull Iterable paramIterable, @NotNull Random paramRandom) {
    long l = b ^ 0x179A529E305AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    List list1 = CollectionsKt.toMutableList(paramIterable);
    List list2 = list1;
    boolean bool = false;
    CollectionsKt.shuffle(list2, paramRandom);
    return list1;
  }
  
  public static final int binarySearchBy(@NotNull List paramList, @Nullable Comparable paramComparable, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    long l = b ^ 0x2D5C3F31DDBCL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return CollectionsKt.binarySearch(paramList, paramInt1, paramInt2, new CollectionsKt__CollectionsKt$binarySearchBy$1(paramFunction1, paramComparable));
  }
  
  @NotNull
  public static final List optimizeReadOnlyList(@NotNull List paramList) {
    long l = b ^ 0x7BAE38FD66F8L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      switch (paramList.size()) {
        case 0:
        
        case 1:
        
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramList;
  }
  
  @NotNull
  public static final List listOfNotNull(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x5C8698560B7AL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return ArraysKt.filterNotNull(paramVarArgs);
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  public static final void throwIndexOverflow() {
    long l = b ^ 0x2E095F519A0CL;
    throw new ArithmeticException("Index overflow has happened.");
  }
  
  public static final int binarySearch(@NotNull List<Object> paramList, Object paramObject, @NotNull Comparator<Object> paramComparator, int paramInt1, int paramInt2) {
    long l = b ^ 0x53716C4FBA1DL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    rangeCheck$CollectionsKt__CollectionsKt(paramList.size(), paramInt1, paramInt2);
    int i = paramInt1;
    int j = paramInt2 - 1;
    while (i <= j) {
      int k = i + j >>> 1;
      Object object = paramList.get(k);
      int m = paramComparator.compare(object, paramObject);
      if (m < 0) {
        i = k + 1;
        continue;
      } 
      if (m > 0) {
        j = k - 1;
        continue;
      } 
      return k;
    } 
    return -(i + 1);
  }
  
  @NotNull
  public static final Collection asCollection(@NotNull Object[] paramArrayOfObject) {
    long l = b ^ 0x5181148E1882L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return new ArrayAsCollection(paramArrayOfObject, false);
  }
  
  @NotNull
  public static final ArrayList arrayListOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x75103A0083BCL;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramVarArgs.length == 0) ? new ArrayList() : new ArrayList(new ArrayAsCollection(paramVarArgs, true));
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  public static final void throwCountOverflow() {
    long l = b ^ 0x12EE1B5B8026L;
    throw new ArithmeticException("Count overflow has happened.");
  }
  
  public static final int binarySearch(@NotNull List<Object> paramList, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    long l = b ^ 0xADD7FCA569FL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "comparison");
    rangeCheck$CollectionsKt__CollectionsKt(paramList.size(), paramInt1, paramInt2);
    int i = paramInt1;
    int j = paramInt2 - 1;
    while (i <= j) {
      int k = i + j >>> 1;
      Object object = paramList.get(k);
      int m = ((Number)paramFunction1.invoke(object)).intValue();
      if (m < 0) {
        i = k + 1;
        continue;
      } 
      if (m > 0) {
        j = k - 1;
        continue;
      } 
      return k;
    } 
    return -(i + 1);
  }
  
  @NotNull
  public static final List emptyList() {
    return EmptyList.INSTANCE;
  }
  
  public static final int getLastIndex(@NotNull List paramList) {
    long l = b ^ 0x7D4D42C870AAL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    return paramList.size() - 1;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__CollectionsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */