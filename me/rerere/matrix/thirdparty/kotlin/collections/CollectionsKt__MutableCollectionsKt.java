package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.TypeIntrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
  private static final long g = o3.a(-2369003809250552190L, 5377612328439508243L, null).a(61635445833235L);
  
  public static final boolean removeAll(@NotNull Collection paramCollection, @NotNull Sequence paramSequence) {
    long l = g ^ 0x3F97F79CCE44L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    Collection<?> collection = BrittleContainsOptimizationKt.convertToSetForSetOperation(paramSequence);
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (!collection.isEmpty())
        try {
          if (paramCollection.removeAll(collection));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false;
  }
  
  public static final boolean retainAll(@NotNull Collection paramCollection, @NotNull Object[] paramArrayOfObject) {
    long l = g ^ 0x1AFC4DE258A3L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (!((paramArrayOfObject.length == 0) ? 1 : 0))
        return paramCollection.retainAll(BrittleContainsOptimizationKt.convertToSetForSetOperation(paramArrayOfObject)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return retainNothing$CollectionsKt__MutableCollectionsKt(paramCollection);
  }
  
  public static final boolean retainAll(@NotNull Collection paramCollection, @NotNull Iterable paramIterable) {
    long l = g ^ 0x52AE2C9C88L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    Collection collection = paramCollection;
    Collection<?> collection1 = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(paramIterable, paramCollection);
    return TypeIntrinsics.asMutableCollection(collection).retainAll(collection1);
  }
  
  public static final boolean removeAll(@NotNull Collection paramCollection, @NotNull Iterable paramIterable) {
    long l = g ^ 0x510DF30A0B83L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    Collection collection = paramCollection;
    Collection<?> collection1 = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(paramIterable, paramCollection);
    return TypeIntrinsics.asMutableCollection(collection).removeAll(collection1);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public static final Object removeFirst(@NotNull List paramList) {
    long l = g ^ 0x23ED18721872L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (paramList.isEmpty())
        throw new NoSuchElementException("List is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramList.remove(0);
  }
  
  public static final boolean addAll(@NotNull Collection paramCollection, @NotNull Iterable paramIterable) {
    long l = g ^ 0x449E04470FADL;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "<this>");
      Intrinsics.checkNotNullParameter(paramIterable, "elements");
      if (paramIterable instanceof Collection)
        return paramCollection.addAll((Collection)paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = false;
    for (Object object : paramIterable) {
      if (paramCollection.add(object))
        bool = true; 
    } 
    return bool;
  }
  
  public static final boolean removeAll(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = g ^ 0x603AF52CDCD0L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return filterInPlace$CollectionsKt__MutableCollectionsKt(paramList, paramFunction1, true);
  }
  
  public static final boolean removeAll(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = g ^ 0x49993FFD70BCL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return filterInPlace$CollectionsKt__MutableCollectionsKt(paramIterable, paramFunction1, true);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public static final Object removeLast(@NotNull List paramList) {
    long l = g ^ 0x48262D1E915BL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (paramList.isEmpty())
        throw new NoSuchElementException("List is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramList.remove(CollectionsKt.getLastIndex(paramList));
  }
  
  public static final boolean addAll(@NotNull Collection paramCollection, @NotNull Sequence paramSequence) {
    long l = g ^ 0x238FCBC0804FL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (paramCollection.add(object))
        bool = true; 
    } 
    return bool;
  }
  
  public static final boolean removeAll(@NotNull Collection paramCollection, @NotNull Object[] paramArrayOfObject) {
    long l = g ^ 0x7E57F8C12458L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (!((paramArrayOfObject.length == 0) ? 1 : 0))
        try {
          if (paramCollection.removeAll(BrittleContainsOptimizationKt.convertToSetForSetOperation(paramArrayOfObject)));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false;
  }
  
  public static final boolean retainAll(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = g ^ 0x6956F107C945L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return filterInPlace$CollectionsKt__MutableCollectionsKt(paramIterable, paramFunction1, false);
  }
  
  public static final boolean retainAll(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = g ^ 0x4C19301CBC70L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return filterInPlace$CollectionsKt__MutableCollectionsKt(paramList, paramFunction1, false);
  }
  
  public static final boolean retainAll(@NotNull Collection paramCollection, @NotNull Sequence paramSequence) {
    long l = g ^ 0x5923C4E98A7CL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    Collection<?> collection = BrittleContainsOptimizationKt.convertToSetForSetOperation(paramSequence);
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (!collection.isEmpty())
        return paramCollection.retainAll(collection); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return retainNothing$CollectionsKt__MutableCollectionsKt(paramCollection);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object removeLastOrNull(@NotNull List paramList) {
    long l = g ^ 0x4540ADE04BB0L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramList.isEmpty() ? null : paramList.remove(CollectionsKt.getLastIndex(paramList));
  }
  
  public static final boolean addAll(@NotNull Collection paramCollection, @NotNull Object[] paramArrayOfObject) {
    long l = g ^ 0x476E84CCD66AL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    return paramCollection.addAll(ArraysKt.asList(paramArrayOfObject));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object removeFirstOrNull(@NotNull List paramList) {
    long l = g ^ 0x90FA9CF5CD8L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramList.isEmpty() ? null : paramList.remove(0);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__MutableCollectionsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */