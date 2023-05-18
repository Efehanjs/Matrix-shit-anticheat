package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class BrittleContainsOptimizationKt {
  private static final long a = o3.a(4434209343196441967L, 4332445926454356207L, null).a(177269062107941L);
  
  @NotNull
  public static final Collection convertToSetForSetOperation(@NotNull Object[] paramArrayOfObject) {
    long l = a ^ 0x5C2DCD4622A2L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    boolean bool = false;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return CollectionSystemProperties.brittleContainsOptimizationEnabled ? ArraysKt.toHashSet(paramArrayOfObject) : ArraysKt.asList(paramArrayOfObject);
  }
  
  @NotNull
  public static final Collection convertToSetForSetOperationWith(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = a ^ 0x319D45843EE1L;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "source");
    Iterable iterable = paramIterable1;
    try {
      try {
        if (iterable instanceof Collection) {
          try {
            if (paramIterable2 instanceof Collection)
              try {
                if (((Collection)paramIterable2).size() < 2);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
          boolean bool = false;
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (iterable instanceof java.util.Set) ? (Collection)paramIterable1 : (CollectionSystemProperties.brittleContainsOptimizationEnabled ? CollectionsKt.toHashSet(paramIterable1) : CollectionsKt.toList(paramIterable1));
  }
  
  @NotNull
  public static final Collection convertToSetForSetOperation(@NotNull Iterable paramIterable) {
    long l = a ^ 0x16888A116D98L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterable iterable = paramIterable;
    try {
      try {
        if (iterable instanceof Collection) {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
          boolean bool = false;
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (iterable instanceof java.util.Set) ? (Collection)paramIterable : (CollectionSystemProperties.brittleContainsOptimizationEnabled ? CollectionsKt.toHashSet(paramIterable) : CollectionsKt.toList(paramIterable));
  }
  
  @NotNull
  public static final Collection convertToSetForSetOperation(@NotNull Sequence paramSequence) {
    long l = a ^ 0x4ACF5E267D1L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    boolean bool = false;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return CollectionSystemProperties.brittleContainsOptimizationEnabled ? SequencesKt.toHashSet(paramSequence) : SequencesKt.toList(paramSequence);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\BrittleContainsOptimizationKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */