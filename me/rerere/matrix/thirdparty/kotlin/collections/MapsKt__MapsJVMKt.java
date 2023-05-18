package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.builders.MapBuilder;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
  private static final int INT_MAX_POWER_OF_TWO = 1073741824;
  
  private static final long b = o3.a(-5710350724472370712L, -8855099583772149859L, null).a(48733597958562L);
  
  @NotNull
  public static final Map toSingletonMap(@NotNull Map paramMap) {
    long l = b ^ 0x253EC00C296L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Map.Entry entry1 = (Map.Entry)paramMap.entrySet().iterator().next();
    Map.Entry entry2 = entry1;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(Collections.singletonMap(entry2.getKey(), entry2.getValue()), "with(entries.iterator().…ingletonMap(key, value) }");
    return Collections.singletonMap(entry2.getKey(), entry2.getValue());
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map build(@NotNull Map paramMap) {
    long l = b ^ 0x20990E3ECDD0L;
    Intrinsics.checkNotNullParameter(paramMap, "builder");
    return ((MapBuilder)paramMap).build();
  }
  
  @NotNull
  public static final SortedMap sortedMapOf(@NotNull Pair... paramVarArgs) {
    long l = b ^ 0x3CCDA92D9CE7L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    TreeMap<Object, Object> treeMap1 = new TreeMap<Object, Object>();
    TreeMap<Object, Object> treeMap2 = treeMap1;
    boolean bool = false;
    MapsKt.putAll(treeMap2, paramVarArgs);
    return treeMap1;
  }
  
  @NotNull
  public static final Map mapOf(@NotNull Pair paramPair) {
    long l = b ^ 0x136DF8E8B37AL;
    Intrinsics.checkNotNullParameter(paramPair, "pair");
    Intrinsics.checkNotNullExpressionValue(Collections.singletonMap(paramPair.getFirst(), paramPair.getSecond()), "singletonMap(pair.first, pair.second)");
    return Collections.singletonMap(paramPair.getFirst(), paramPair.getSecond());
  }
  
  @NotNull
  public static final SortedMap toSortedMap(@NotNull Map<?, ?> paramMap) {
    long l = b ^ 0x26191C7646DEL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    return new TreeMap<Object, Object>(paramMap);
  }
  
  @NotNull
  public static final SortedMap toSortedMap(@NotNull Map<?, ?> paramMap, @NotNull Comparator<?> paramComparator) {
    long l = b ^ 0x3E510DDD5DB5L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    TreeMap<Object, Object> treeMap1 = new TreeMap<Object, Object>(paramComparator);
    TreeMap<Object, Object> treeMap2 = treeMap1;
    boolean bool = false;
    treeMap2.putAll(paramMap);
    return treeMap1;
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map createMapBuilder() {
    return (Map)new MapBuilder();
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map createMapBuilder(int paramInt) {
    return (Map)new MapBuilder(paramInt);
  }
  
  @PublishedApi
  public static final int mapCapacity(int paramInt) {
    try {
      try {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramInt < 0) ? paramInt : ((paramInt < 3) ? (paramInt + 1) : ((paramInt < 1073741824) ? (int)(paramInt / 0.75F + 1.0F) : Integer.MAX_VALUE));
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final SortedMap sortedMapOf(@NotNull Comparator<?> paramComparator, @NotNull Pair... paramVarArgs) {
    long l = b ^ 0x57E52E69F00L;
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    TreeMap<Object, Object> treeMap1 = new TreeMap<Object, Object>(paramComparator);
    TreeMap<Object, Object> treeMap2 = treeMap1;
    boolean bool = false;
    MapsKt.putAll(treeMap2, paramVarArgs);
    return treeMap1;
  }
  
  public static final Object getOrPut(@NotNull ConcurrentMap<Object, Object> paramConcurrentMap, Object paramObject, @NotNull Function0 paramFunction0) {
    long l = b ^ 0x6E2F2E7790DCL;
    Intrinsics.checkNotNullParameter(paramConcurrentMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "defaultValue");
    boolean bool = false;
    if (paramConcurrentMap.get(paramObject) == null) {
      paramConcurrentMap.get(paramObject);
      Object object1 = paramFunction0.invoke();
      Object object2 = object1;
      boolean bool1 = false;
      try {
        if (paramConcurrentMap.putIfAbsent(paramObject, object2) == null)
          paramConcurrentMap.putIfAbsent(paramObject, object2); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return paramConcurrentMap.get(paramObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MapsKt__MapsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */