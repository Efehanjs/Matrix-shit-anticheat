package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
  private static final long c = o3.a(6854028913307028702L, -2047796626797452565L, null).a(279339676237756L);
  
  @SinceKotlin(version = "1.1")
  public static final Object maxOf(Object paramObject1, Object paramObject2, @NotNull Comparator<Object> paramComparator) {
    long l = c ^ 0x193B50CD78B9L;
    try {
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (paramComparator.compare(paramObject1, paramObject2) >= 0) ? paramObject1 : paramObject2;
  }
  
  @SinceKotlin(version = "1.1")
  public static final Object maxOf(Object paramObject1, Object paramObject2, Object paramObject3, @NotNull Comparator paramComparator) {
    long l = c ^ 0x27C88B921B5FL;
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return ComparisonsKt.maxOf(paramObject1, ComparisonsKt.maxOf(paramObject2, paramObject3, paramComparator), paramComparator);
  }
  
  @SinceKotlin(version = "1.1")
  public static final Object minOf(Object paramObject1, Object paramObject2, Object paramObject3, @NotNull Comparator paramComparator) {
    long l = c ^ 0x214E0249EA6FL;
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return ComparisonsKt.minOf(paramObject1, ComparisonsKt.minOf(paramObject2, paramObject3, paramComparator), paramComparator);
  }
  
  @SinceKotlin(version = "1.4")
  public static final Object maxOf(Object paramObject, @NotNull Object[] paramArrayOfObject, @NotNull Comparator<Object> paramComparator) {
    long l = c ^ 0x62CD1027B836L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
      b++;
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.1")
  public static final Object minOf(Object paramObject1, Object paramObject2, @NotNull Comparator<Object> paramComparator) {
    long l = c ^ 0x4070D04E6639L;
    try {
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (paramComparator.compare(paramObject1, paramObject2) <= 0) ? paramObject1 : paramObject2;
  }
  
  @SinceKotlin(version = "1.4")
  public static final Object minOf(Object paramObject, @NotNull Object[] paramArrayOfObject, @NotNull Comparator<Object> paramComparator) {
    long l = c ^ 0x5B5E53910DFCL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      if (paramComparator.compare(object, object1) > 0)
        object = object1; 
      b++;
    } 
    return object;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt___ComparisonsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */