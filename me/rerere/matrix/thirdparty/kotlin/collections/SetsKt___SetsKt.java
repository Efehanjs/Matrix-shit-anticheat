package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class SetsKt___SetsKt extends SetsKt__SetsKt {
  private static final long c = o3.a(3679048742395579855L, 337873176315971533L, null).a(194980582180758L);
  
  @NotNull
  public static final Set minus(@NotNull Set paramSet, Object paramObject) {
    long l = c ^ 0x26EBC052A691L;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(paramSet.size()));
    boolean bool1 = false;
    Set set = paramSet;
    boolean bool2 = false;
    for (Object object1 : set) {
      Object object2 = object1;
      boolean bool = false;
      try {
        bool1 = true;
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      if (!(!bool1 && Intrinsics.areEqual(object2, paramObject)))
        linkedHashSet.add(object1); 
    } 
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set plus(@NotNull Set paramSet, Object paramObject) {
    long l = c ^ 0x2E2E4BD4D96DL;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    LinkedHashSet<Object> linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(paramSet.size() + 1));
    linkedHashSet.addAll(paramSet);
    linkedHashSet.add(paramObject);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set minus(@NotNull Set<?> paramSet, @NotNull Sequence paramSequence) {
    long l = c ^ 0x2C6507EC4BABL;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    LinkedHashSet linkedHashSet = new LinkedHashSet(paramSet);
    CollectionsKt.removeAll(linkedHashSet, paramSequence);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set plus(@NotNull Set paramSet, @NotNull Iterable paramIterable) {
    long l = c ^ 0x19F1D4C91B9FL;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    Integer integer = CollectionsKt.collectionSizeOrNull(paramIterable);
    int i = integer.intValue();
    boolean bool = false;
    CollectionsKt.collectionSizeOrNull(paramIterable);
    int j = MapsKt.mapCapacity((CollectionsKt.collectionSizeOrNull(paramIterable) != null) ? (paramSet.size() + i) : (paramSet.size() * 2));
    LinkedHashSet linkedHashSet = new LinkedHashSet(j);
    linkedHashSet.addAll(paramSet);
    CollectionsKt.addAll(linkedHashSet, paramIterable);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set plus(@NotNull Set paramSet, @NotNull Object[] paramArrayOfObject) {
    long l = c ^ 0x75161365BAAAL;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(paramSet.size() + paramArrayOfObject.length));
    linkedHashSet.addAll(paramSet);
    CollectionsKt.addAll(linkedHashSet, paramArrayOfObject);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set plus(@NotNull Set paramSet, @NotNull Sequence paramSequence) {
    long l = c ^ 0x221EDE20538AL;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(paramSet.size() * 2));
    linkedHashSet.addAll(paramSet);
    CollectionsKt.addAll(linkedHashSet, paramSequence);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set minus(@NotNull Set<?> paramSet, @NotNull Iterable paramIterable) {
    long l = c ^ 0x5C66E80857C9L;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    Collection<?> collection = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(paramIterable, paramSet);
    try {
      if (collection.isEmpty())
        return CollectionsKt.toSet(paramSet); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    if (collection instanceof Set) {
      Set<?> set = paramSet;
      LinkedHashSet linkedHashSet1 = new LinkedHashSet();
      boolean bool = false;
      for (Object object1 : set) {
        Object object2 = object1;
        boolean bool1 = false;
        if (!collection.contains(object2))
          linkedHashSet1.add(object1); 
      } 
      return linkedHashSet1;
    } 
    LinkedHashSet linkedHashSet = new LinkedHashSet(paramSet);
    linkedHashSet.removeAll(collection);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set minus(@NotNull Set<?> paramSet, @NotNull Object[] paramArrayOfObject) {
    long l = c ^ 0x3E7395976E80L;
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    LinkedHashSet linkedHashSet = new LinkedHashSet(paramSet);
    CollectionsKt.removeAll(linkedHashSet, paramArrayOfObject);
    return linkedHashSet;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\SetsKt___SetsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */