package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.internal.HidesMembers;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
  private static final long j = o3.a(-5085699961697885196L, -899619471516697564L, null).a(190954543134258L);
  
  @NotNull
  public static final List mapIndexed(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x71AF09FA7FF6L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    ArrayList<Object> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paramIterable, 10));
    boolean bool2 = false;
    byte b = 0;
    for (Object object : iterable) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object reduceRightOrNull(@NotNull List paramList, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x84F7992157BL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    ListIterator<Object> listIterator = paramList.listIterator(paramList.size());
    try {
      if (!listIterator.hasPrevious())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = listIterator.previous(); listIterator.hasPrevious(); object = paramFunction2.invoke(listIterator.previous(), object));
    return object;
  }
  
  @Nullable
  public static final Object elementAtOrNull(@NotNull Iterable paramIterable, int paramInt) {
    long l = j ^ 0x656E0061B1E2L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return CollectionsKt.getOrNull((List)paramIterable, paramInt); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    try {
      if (paramInt < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Object> iterator = paramIterable.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      Object object = iterator.next();
      if (paramInt == b++)
        return object; 
    } 
    return null;
  }
  
  public static final double averageOfShort(@NotNull Iterable paramIterable) {
    long l = j ^ 0x1DB9895DA6EFL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      short s = ((Number)iterator.next()).shortValue();
      d += s;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x7ED6832687F8L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    Object object = null;
    for (Object object1 : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue())
        object = object1; 
    } 
    return object;
  }
  
  @NotNull
  public static final List slice(@NotNull List paramList, @NotNull IntRange paramIntRange) {
    long l = j ^ 0x28692B959C4FL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return CollectionsKt.toList(paramList.subList(paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1));
  }
  
  public static final long sumOfLong(@NotNull Iterable paramIterable) {
    long l1 = j ^ 0x79FC56F179D5L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    long l2 = 0L;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      long l = ((Number)iterator.next()).longValue();
      l2 += l;
    } 
    return l2;
  }
  
  public static final double averageOfByte(@NotNull Iterable paramIterable) {
    long l = j ^ 0x1A55CDACE800L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      byte b1 = ((Number)iterator.next()).byteValue();
      d += b1;
      byte b2 = ++b;
      if (b2 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double maxOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x572736D9CD8EL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.max(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return Double.valueOf(d);
  }
  
  @SinceKotlin(version = "1.7")
  public static final double maxOrThrow(@NotNull Iterable paramIterable) {
    long l = j ^ 0x24CA0BBE70D2L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.max(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return d;
  }
  
  @SinceKotlin(version = "1.7")
  @NotNull
  public static final Comparable maxOrThrow(@NotNull Iterable paramIterable) {
    long l = j ^ 0x20EA5EDA302CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Comparable> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) < 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  public static final Object elementAtOrElse(@NotNull Iterable paramIterable, int paramInt, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2935BD470711L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "defaultValue");
    if (paramIterable instanceof List) {
      List list = (List)paramIterable;
      try {
        if (paramInt >= 0)
          try {
            if (paramInt <= CollectionsKt.getLastIndex(list));
          } catch (NoSuchElementException noSuchElementException) {
            throw b(null);
          }  
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      return paramFunction1.invoke(Integer.valueOf(paramInt));
    } 
    try {
      if (paramInt < 0)
        return paramFunction1.invoke(Integer.valueOf(paramInt)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Object> iterator = paramIterable.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      Object object = iterator.next();
      if (paramInt == b++)
        return object; 
    } 
    return paramFunction1.invoke(Integer.valueOf(paramInt));
  }
  
  @NotNull
  public static final byte[] toByteArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x292E5AD2DDF3L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    byte[] arrayOfByte = new byte[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      byte b1 = ((Number)iterator.next()).byteValue();
      arrayOfByte[b++] = b1;
    } 
    return arrayOfByte;
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x2F279D538190L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return ((List)paramIterable).isEmpty() ? null : ((List)paramIterable).get(((List)paramIterable).size() - 1);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = iterator.next());
    return object;
  }
  
  @NotNull
  public static final int[] toIntArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x1C8CDA03B01BL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    int[] arrayOfInt = new int[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfInt[b++] = i;
    } 
    return arrayOfInt;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull Iterable paramIterable, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = j ^ 0x2F3045187B82L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    for (Object object : paramIterable)
      paramMap.put(paramFunction11.invoke(object), paramFunction12.invoke(object)); 
    return paramMap;
  }
  
  public static final Object first(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0xA90C7A0704L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return object; 
    } 
    throw new NoSuchElementException("Collection contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object reduceRightIndexedOrNull(@NotNull List paramList, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x26D0E38C190L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    ListIterator<Object> listIterator = paramList.listIterator(paramList.size());
    try {
      if (!listIterator.hasPrevious())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = listIterator.previous(); listIterator.hasPrevious(); object = paramFunction3.invoke(Integer.valueOf(i), listIterator.previous(), object))
      int i = listIterator.previousIndex(); 
    return object;
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 13018012810338
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'predicate'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore #4
    //   23: aload_0
    //   24: astore #5
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: checkcast java/util/Collection
    //   36: astore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: aload #5
    //   43: astore #8
    //   45: iconst_0
    //   46: istore #9
    //   48: iconst_0
    //   49: istore #10
    //   51: aload #8
    //   53: invokeinterface iterator : ()Ljava/util/Iterator;
    //   58: astore #11
    //   60: aload #11
    //   62: invokeinterface hasNext : ()Z
    //   67: ifeq -> 156
    //   70: aload #11
    //   72: invokeinterface next : ()Ljava/lang/Object;
    //   77: astore #12
    //   79: iload #10
    //   81: iinc #10, 1
    //   84: istore #13
    //   86: iload #13
    //   88: ifge -> 101
    //   91: invokestatic throwIndexOverflow : ()V
    //   94: goto -> 101
    //   97: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   100: athrow
    //   101: iload #13
    //   103: aload #12
    //   105: astore #14
    //   107: istore #15
    //   109: iconst_0
    //   110: istore #16
    //   112: aload_1
    //   113: iload #15
    //   115: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   118: aload #14
    //   120: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   125: checkcast java/lang/Boolean
    //   128: invokevirtual booleanValue : ()Z
    //   131: ifeq -> 151
    //   134: aload #6
    //   136: aload #14
    //   138: invokeinterface add : (Ljava/lang/Object;)Z
    //   143: pop
    //   144: goto -> 151
    //   147: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   150: athrow
    //   151: nop
    //   152: nop
    //   153: goto -> 60
    //   156: nop
    //   157: aload #6
    //   159: checkcast java/util/List
    //   162: areturn
    // Exception table:
    //   from	to	target	type
    //   86	94	97	java/util/NoSuchElementException
    //   112	144	147	java/util/NoSuchElementException
  }
  
  public static final Object foldIndexed(@NotNull Iterable paramIterable, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x28053E518B6EL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b = 0;
    Object object = paramObject;
    for (Object object1 : paramIterable) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      object = paramFunction3.invoke(Integer.valueOf(b1), object, object1);
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List zipWithNext(@NotNull Iterable paramIterable) {
    long l = j ^ 0x1E825CC7B7E2L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterable iterable = paramIterable;
    boolean bool = false;
    Iterator<Object> iterator = iterable.iterator();
    try {
      ArrayList<Pair> arrayList = new ArrayList();
      for (Object object = iterator.next(); iterator.hasNext(); object = object1) {
        Object object1 = iterator.next();
        Object object2 = object1;
        Object object3 = object;
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(object3, object2));
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return !iterator.hasNext() ? CollectionsKt.emptyList() : arrayList;
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 61154684563815
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'destination'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_2
    //   22: ldc 'predicate'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: iconst_0
    //   28: istore #5
    //   30: aload_0
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: iconst_0
    //   37: istore #8
    //   39: aload #6
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #9
    //   48: aload #9
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 143
    //   58: aload #9
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: astore #10
    //   67: iload #8
    //   69: iinc #8, 1
    //   72: istore #11
    //   74: iload #11
    //   76: ifge -> 89
    //   79: invokestatic throwIndexOverflow : ()V
    //   82: goto -> 89
    //   85: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   88: athrow
    //   89: iload #11
    //   91: aload #10
    //   93: astore #12
    //   95: istore #13
    //   97: iconst_0
    //   98: istore #14
    //   100: aload_2
    //   101: iload #13
    //   103: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   106: aload #12
    //   108: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   113: checkcast java/lang/Boolean
    //   116: invokevirtual booleanValue : ()Z
    //   119: ifeq -> 138
    //   122: aload_1
    //   123: aload #12
    //   125: invokeinterface add : (Ljava/lang/Object;)Z
    //   130: pop
    //   131: goto -> 138
    //   134: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: nop
    //   139: nop
    //   140: goto -> 48
    //   143: nop
    //   144: aload_1
    //   145: areturn
    // Exception table:
    //   from	to	target	type
    //   74	82	85	java/util/NoSuchElementException
    //   100	131	134	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List filterNotNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x7D0C70274739L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return (List)CollectionsKt.filterNotNullTo(paramIterable, new ArrayList());
  }
  
  public static final Object single(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x4437FA09E64AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    for (Object object1 : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
        try {
          if (bool2)
            throw new IllegalArgumentException("Collection contains more than one matching element."); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        object = object1;
        bool2 = true;
      } 
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Collection contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return object;
  }
  
  public static final int sumOfInt(@NotNull Iterable paramIterable) {
    long l = j ^ 0x2CECCFBEC01AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    int i = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      i += j;
    } 
    return i;
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x756E7803DE59L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ListIterator<Object> listIterator = paramList.listIterator(paramList.size());
    while (listIterator.hasPrevious()) {
      Object object = listIterator.previous();
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return object; 
    } 
    return null;
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull Iterable paramIterable, @NotNull Collection paramCollection) {
    long l = j ^ 0x70079609B4ECL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    for (Object object : paramIterable)
      paramCollection.add(object); 
    return paramCollection;
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x6EF2F57CF60DL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    if (!paramList.isEmpty()) {
      ListIterator listIterator = paramList.listIterator(paramList.size());
      while (listIterator.hasPrevious()) {
        if (!((Boolean)paramFunction1.invoke(listIterator.previous())).booleanValue())
          return CollectionsKt.take(paramList, listIterator.nextIndex() + 1); 
      } 
    } 
    return CollectionsKt.emptyList();
  }
  
  @NotNull
  public static final List distinctBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x4EEE9552BBBCL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList arrayList = new ArrayList();
    for (Object object : paramIterable) {
      Object object1 = paramFunction1.invoke(object);
      if (hashSet.add(object1))
        arrayList.add(object); 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeWhile(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x307BD3409D9DL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList arrayList = new ArrayList();
    for (Object object : paramIterable) {
      try {
        if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      arrayList.add(object);
    } 
    return arrayList;
  }
  
  public static final Object reduceRightIndexed(@NotNull List paramList, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x5D93A43CBAB1L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    ListIterator<Object> listIterator = paramList.listIterator(paramList.size());
    try {
      if (!listIterator.hasPrevious())
        throw new UnsupportedOperationException("Empty list can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = listIterator.previous(); listIterator.hasPrevious(); object = paramFunction3.invoke(Integer.valueOf(i), listIterator.previous(), object))
      int i = listIterator.previousIndex(); 
    return object;
  }
  
  public static final Object reduceIndexed(@NotNull Iterable paramIterable, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x2522CC5F9B35L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new UnsupportedOperationException("Empty collection can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = 1;
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction3.invoke(Integer.valueOf(b1), object, iterator.next())) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
    } 
    return object;
  }
  
  public static final boolean all(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x1964282DBF04L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramIterable instanceof Collection)
        try {
          if (((Collection)paramIterable).isEmpty())
            return true; 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    for (Object object : paramIterable) {
      if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
        return false; 
    } 
    return true;
  }
  
  public static final int lastIndexOf(@NotNull List paramList, Object paramObject) {
    long l = j ^ 0x11F008DFFF86L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    return paramList.lastIndexOf(paramObject);
  }
  
  @NotNull
  public static final List plus(@NotNull Collection<?> paramCollection, @NotNull Iterable paramIterable) {
    long l = j ^ 0x7FC5EAC6AB2EL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    if (paramIterable instanceof Collection) {
      ArrayList arrayList1 = new ArrayList(paramCollection.size() + ((Collection)paramIterable).size());
      arrayList1.addAll(paramCollection);
      arrayList1.addAll((Collection)paramIterable);
      return arrayList1;
    } 
    ArrayList arrayList = new ArrayList(paramCollection);
    CollectionsKt.addAll(arrayList, paramIterable);
    return arrayList;
  }
  
  @NotNull
  public static final List plus(@NotNull Collection paramCollection, Object paramObject) {
    long l = j ^ 0x52F7978D77CL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    ArrayList<Object> arrayList = new ArrayList(paramCollection.size() + 1);
    arrayList.addAll(paramCollection);
    arrayList.add(paramObject);
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object minByOrThrow(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x39F3FD1A3F2AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    while (true) {
      Object object1 = iterator.next();
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) > 0) {
        object = object1;
        comparable = comparable1;
      } 
      if (!iterator.hasNext())
        return object; 
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final List flatMapSequence(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x12B37410DA86L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object : iterable) {
      Sequence sequence = (Sequence)paramFunction1.invoke(object);
      CollectionsKt.addAll(arrayList, sequence);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List plus(@NotNull Collection paramCollection, @NotNull Object[] paramArrayOfObject) {
    long l = j ^ 0x48DA9F709097L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    ArrayList arrayList = new ArrayList(paramCollection.size() + paramArrayOfObject.length);
    arrayList.addAll(paramCollection);
    CollectionsKt.addAll(arrayList, paramArrayOfObject);
    return arrayList;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List chunked(@NotNull Iterable paramIterable, int paramInt, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x120A6F63DDB5L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return CollectionsKt.windowed(paramIterable, paramInt, paramInt, true, paramFunction1);
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x398AC8076F48L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramIterable) {
      if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  public static final Object reduceRight(@NotNull List paramList, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x5FE8254FC740L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    ListIterator<Object> listIterator = paramList.listIterator(paramList.size());
    try {
      if (!listIterator.hasPrevious())
        throw new UnsupportedOperationException("Empty list can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = listIterator.previous(); listIterator.hasPrevious(); object = paramFunction2.invoke(listIterator.previous(), object));
    return object;
  }
  
  public static final Object reduce(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x4B1448D4DE02L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new UnsupportedOperationException("Empty collection can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction2.invoke(object, iterator.next()));
    return object;
  }
  
  public static final Object first(@NotNull List paramList) {
    long l = j ^ 0x650D6A6C5B97L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (paramList.isEmpty())
        throw new NoSuchElementException("List is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return paramList.get(0);
  }
  
  public static final boolean any(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x65A5C09AE892L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramIterable instanceof Collection)
        try {
          if (((Collection)paramIterable).isEmpty())
            return false; 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return true; 
    } 
    return false;
  }
  
  public static final int indexOf(@NotNull List paramList, Object paramObject) {
    long l = j ^ 0x48B7C9A158F0L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    return paramList.indexOf(paramObject);
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull Iterable paramIterable, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = j ^ 0x782B22E21BFAL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    for (Object object : paramIterable) {
      Object object1 = paramFunction11.invoke(object);
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(object));
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.7")
  @NotNull
  public static final Comparable minOrThrow(@NotNull Iterable paramIterable) {
    long l = j ^ 0x2D276F777B18L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Comparable> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) > 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @NotNull
  public static final Set union(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = j ^ 0x1486B0FFBEDL;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "other");
    Set set = CollectionsKt.toMutableSet(paramIterable1);
    CollectionsKt.addAll(set, paramIterable2);
    return set;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object randomOrNull(@NotNull Collection paramCollection, @NotNull Random paramRandom) {
    long l = j ^ 0x140BB3D85933L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (paramCollection.isEmpty())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return CollectionsKt.elementAt(paramCollection, paramRandom.nextInt(paramCollection.size()));
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull Iterable paramIterable, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = j ^ 0x26735D17CE2DL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramAppendable, "buffer");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    paramAppendable.append(paramCharSequence2);
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (++b > 1)
          paramAppendable.append(paramCharSequence1); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      try {
        if (paramInt >= 0) {
          try {
            if (b <= paramInt)
              continue; 
          } catch (NoSuchElementException noSuchElementException) {
            throw b(null);
          } 
          break;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      continue;
      StringsKt.appendElement(paramAppendable, SYNTHETIC_LOCAL_VARIABLE_12, paramFunction1);
    } 
    try {
      if (paramInt >= 0)
        try {
          if (b > paramInt)
            paramAppendable.append(paramCharSequence4); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    paramAppendable.append(paramCharSequence3);
    return paramAppendable;
  }
  
  public static final Object single(@NotNull Iterable paramIterable) {
    long l = j ^ 0x1ED8933DAAC6L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return CollectionsKt.single((List)paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException("Collection is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    try {
      if (iterator.hasNext())
        throw new IllegalArgumentException("Collection has more than one element."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return object;
  }
  
  @Nullable
  public static final Object singleOrNull(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x623F6DF1EA72L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    for (Object object1 : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
        try {
          if (bool2)
            return null; 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        object = object1;
        bool2 = true;
      } 
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return object;
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull List paramList) {
    long l = j ^ 0x7A47A385BAB6L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return paramList.isEmpty() ? null : paramList.get(paramList.size() - 1);
  }
  
  @NotNull
  public static final long[] toLongArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x4BBCC78F4A7CL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    long[] arrayOfLong = new long[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      long l1 = ((Number)iterator.next()).longValue();
      arrayOfLong[b++] = l1;
    } 
    return arrayOfLong;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull Iterable paramIterable, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x6B47D4607548L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramIterable)
      paramCollection.add(paramFunction1.invoke(object)); 
    return paramCollection;
  }
  
  @NotNull
  public static final List plus(@NotNull Iterable paramIterable, @NotNull Sequence paramSequence) {
    long l = j ^ 0x3DF9A0A8FAE4L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    ArrayList arrayList = new ArrayList();
    CollectionsKt.addAll(arrayList, paramIterable);
    CollectionsKt.addAll(arrayList, paramSequence);
    return arrayList;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull Iterable paramIterable) {
    long l = j ^ 0xD5C0AB7B5DBL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection)
        return CollectionsKt.toMutableList((Collection)paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (List)CollectionsKt.toCollection(paramIterable, new ArrayList());
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object reduceOrNull(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0xA3707652BE0L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction2.invoke(object, iterator.next()));
    return object;
  }
  
  public static final int sumOfShort(@NotNull Iterable paramIterable) {
    long l = j ^ 0x17F6D2E929ABL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    int i = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      short s = ((Number)iterator.next()).shortValue();
      i += s;
    } 
    return i;
  }
  
  public static final void sortDescending(@NotNull List paramList) {
    long l = j ^ 0xC8B44E26582L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    CollectionsKt.sortWith(paramList, ComparisonsKt.reverseOrder());
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float minOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x26C20A7C4D56L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.min(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final List dropLast(@NotNull List paramList, int paramInt) {
    long l = j ^ 0x16A767A1BFC3L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return CollectionsKt.take(paramList, RangesKt.coerceAtLeast(paramList.size() - paramInt, 0));
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull Iterable paramIterable, @NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x1B9AAA0446BBL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    for (Object object : paramIterable)
      paramMap.put(paramFunction1.invoke(object), object); 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List windowed(@NotNull Iterable paramIterable, int paramInt1, int paramInt2, boolean paramBoolean, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 79506076186225
    //   6: lxor
    //   7: lstore #5
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload #4
    //   17: ldc 'transform'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: iload_1
    //   23: iload_2
    //   24: invokestatic checkWindowSizeStep : (II)V
    //   27: aload_0
    //   28: instanceof java/util/RandomAccess
    //   31: ifeq -> 215
    //   34: aload_0
    //   35: instanceof java/util/List
    //   38: ifeq -> 215
    //   41: goto -> 48
    //   44: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   47: athrow
    //   48: aload_0
    //   49: checkcast java/util/List
    //   52: invokeinterface size : ()I
    //   57: istore #7
    //   59: iload #7
    //   61: iload_2
    //   62: idiv
    //   63: iload #7
    //   65: iload_2
    //   66: irem
    //   67: ifne -> 78
    //   70: iconst_0
    //   71: goto -> 79
    //   74: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   77: athrow
    //   78: iconst_1
    //   79: iadd
    //   80: istore #8
    //   82: new java/util/ArrayList
    //   85: dup
    //   86: iload #8
    //   88: invokespecial <init> : (I)V
    //   91: astore #9
    //   93: new me/rerere/matrix/thirdparty/kotlin/collections/MovingSubList
    //   96: dup
    //   97: aload_0
    //   98: checkcast java/util/List
    //   101: invokespecial <init> : (Ljava/util/List;)V
    //   104: astore #10
    //   106: iconst_0
    //   107: istore #11
    //   109: iconst_0
    //   110: iload #11
    //   112: if_icmpgt -> 141
    //   115: iload #11
    //   117: iload #7
    //   119: if_icmpge -> 137
    //   122: goto -> 129
    //   125: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   128: athrow
    //   129: iconst_1
    //   130: goto -> 142
    //   133: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   136: athrow
    //   137: iconst_0
    //   138: goto -> 142
    //   141: iconst_0
    //   142: ifeq -> 209
    //   145: iload_1
    //   146: iload #7
    //   148: iload #11
    //   150: isub
    //   151: invokestatic coerceAtMost : (II)I
    //   154: istore #12
    //   156: iload_3
    //   157: ifne -> 173
    //   160: iload #12
    //   162: iload_1
    //   163: if_icmplt -> 209
    //   166: goto -> 173
    //   169: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   172: athrow
    //   173: aload #10
    //   175: iload #11
    //   177: iload #11
    //   179: iload #12
    //   181: iadd
    //   182: invokevirtual move : (II)V
    //   185: aload #9
    //   187: aload #4
    //   189: aload #10
    //   191: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   196: invokevirtual add : (Ljava/lang/Object;)Z
    //   199: pop
    //   200: iload #11
    //   202: iload_2
    //   203: iadd
    //   204: istore #11
    //   206: goto -> 109
    //   209: aload #9
    //   211: checkcast java/util/List
    //   214: areturn
    //   215: new java/util/ArrayList
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore #7
    //   224: aload_0
    //   225: invokeinterface iterator : ()Ljava/util/Iterator;
    //   230: iload_1
    //   231: iload_2
    //   232: iload_3
    //   233: iconst_1
    //   234: invokestatic windowedIterator : (Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;
    //   237: astore #8
    //   239: iconst_0
    //   240: istore #9
    //   242: aload #8
    //   244: astore #10
    //   246: aload #10
    //   248: invokeinterface hasNext : ()Z
    //   253: ifeq -> 295
    //   256: aload #10
    //   258: invokeinterface next : ()Ljava/lang/Object;
    //   263: astore #11
    //   265: aload #11
    //   267: checkcast java/util/List
    //   270: astore #12
    //   272: iconst_0
    //   273: istore #13
    //   275: aload #7
    //   277: aload #4
    //   279: aload #12
    //   281: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   286: invokevirtual add : (Ljava/lang/Object;)Z
    //   289: pop
    //   290: nop
    //   291: nop
    //   292: goto -> 246
    //   295: nop
    //   296: aload #7
    //   298: checkcast java/util/List
    //   301: areturn
    // Exception table:
    //   from	to	target	type
    //   9	41	44	java/util/NoSuchElementException
    //   59	74	74	java/util/NoSuchElementException
    //   109	122	125	java/util/NoSuchElementException
    //   115	133	133	java/util/NoSuchElementException
    //   156	166	169	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Comparable maxOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x76832F88BBD9L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Comparable> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) < 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  public static final int lastIndexOf(@NotNull Iterable paramIterable, Object paramObject) {
    long l = j ^ 0x7E9EC7CCDBF8L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return ((List)paramIterable).lastIndexOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = -1;
    byte b1 = 0;
    for (Object object : paramIterable) {
      try {
        if (b1)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      if (Intrinsics.areEqual(paramObject, object))
        b = b1; 
      b1++;
    } 
    return b;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull Iterable paramIterable, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2E4491D2A42DL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    for (Object object : paramIterable) {
      Object object1 = paramFunction1.invoke(object);
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List list = (object2 == null) ? arrayList : (List)object2;
      list.add(object);
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List minus(@NotNull Iterable paramIterable, @NotNull Sequence paramSequence) {
    long l = j ^ 0x60AFE99A2869L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    Collection collection = BrittleContainsOptimizationKt.convertToSetForSetOperation(paramSequence);
    try {
      if (collection.isEmpty())
        return CollectionsKt.toList(paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterable iterable1 = paramIterable;
    boolean bool1 = false;
    Iterable iterable2 = iterable1;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object1 : iterable2) {
      Object object2 = object1;
      boolean bool = false;
      if (!collection.contains(object2))
        arrayList.add(object1); 
    } 
    return arrayList;
  }
  
  public static final int indexOfLast(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x6D408C364B13L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ListIterator listIterator = paramList.listIterator(paramList.size());
    while (listIterator.hasPrevious()) {
      if (((Boolean)paramFunction1.invoke(listIterator.previous())).booleanValue())
        return listIterator.nextIndex(); 
    } 
    return -1;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x26C36DE7CD46L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object maxWithOrNull(@NotNull Iterable paramIterable, @NotNull Comparator paramComparator) {
    long l = j ^ 0x6DC75F8E044CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    while (iterator.hasNext()) {
      Object object1 = iterator.next();
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
    } 
    return object;
  }
  
  public static final int sumOfByte(@NotNull Iterable paramIterable) {
    long l = j ^ 0x59123117D02EL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    int i = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      byte b = ((Number)iterator.next()).byteValue();
      i += b;
    } 
    return i;
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull Iterable paramIterable) {
    long l = j ^ 0x58CAF033626EL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return (HashSet)CollectionsKt.toCollection(paramIterable, new HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramIterable, 12))));
  }
  
  @NotNull
  public static final List requireNoNulls(@NotNull List paramList) {
    long l = j ^ 0x7D5BE41BBCA0L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    for (Object object : paramList) {
      if (object == null)
        throw new IllegalArgumentException("null element found in " + paramList + '.'); 
    } 
    return paramList;
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x1A5548AFB7A6L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramIterable) {
      Iterable iterable = (Iterable)paramFunction1.invoke(object);
      CollectionsKt.addAll(paramCollection, iterable);
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final double[] toDoubleArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x5A208630DCFL;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    double[] arrayOfDouble = new double[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      double d = ((Number)iterator.next()).doubleValue();
      arrayOfDouble[b++] = d;
    } 
    return arrayOfDouble;
  }
  
  @NotNull
  public static final List plus(@NotNull Collection paramCollection, @NotNull Sequence paramSequence) {
    long l = j ^ 0x11DE3E141239L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "elements");
    ArrayList arrayList = new ArrayList(paramCollection.size() + 10);
    arrayList.addAll(paramCollection);
    CollectionsKt.addAll(arrayList, paramSequence);
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map associateWith(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x6848E400B04CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool1 = false;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramIterable, 10)), 16));
    Iterable iterable = paramIterable;
    boolean bool2 = false;
    for (Object object : iterable)
      linkedHashMap.put(object, paramFunction1.invoke(object)); 
    return linkedHashMap;
  }
  
  public static final boolean any(@NotNull Iterable paramIterable) {
    long l = j ^ 0x4154898BC4BL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return !((Collection)paramIterable).isEmpty();
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return paramIterable.iterator().hasNext();
  }
  
  @NotNull
  public static final boolean[] toBooleanArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x1C3D1E5D3CA6L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    boolean[] arrayOfBoolean = new boolean[paramCollection.size()];
    byte b = 0;
    Iterator<Boolean> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      boolean bool = ((Boolean)iterator.next()).booleanValue();
      arrayOfBoolean[b++] = bool;
    } 
    return arrayOfBoolean;
  }
  
  @NotNull
  public static final List distinct(@NotNull Iterable paramIterable) {
    long l = j ^ 0x44FE7CD369ADL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return CollectionsKt.toList(CollectionsKt.toMutableSet(paramIterable));
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull Iterable paramIterable, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x430411FAD140L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramIterable) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1), object));
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float minOrThrow(@NotNull Iterable paramIterable) {
    long l = j ^ 0x73ACE76BF1FAL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.min(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return f;
  }
  
  @SinceKotlin(version = "1.3")
  public static final void shuffle(@NotNull List paramList, @NotNull Random paramRandom) {
    long l = j ^ 0x10EADE28184BL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = CollectionsKt.getLastIndex(paramList); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      paramList.set(j, paramList.set(i, paramList.get(j)));
    } 
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Iterable onEach(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x1A2F22E6C242L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool1 = false;
    Iterable iterable1 = paramIterable;
    Iterable iterable2 = iterable1;
    boolean bool2 = false;
    for (Object object : iterable2)
      paramFunction1.invoke(object); 
    return iterable1;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull Collection<?> paramCollection) {
    long l = j ^ 0x648BEF9E6B91L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    return new ArrayList(paramCollection);
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull Iterable paramIterable) {
    long l = j ^ 0x6C14FBD8FE92L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return new IndexingIterable(new CollectionsKt___CollectionsKt$withIndex$1(paramIterable));
  }
  
  @NotNull
  public static final Map groupBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = j ^ 0x41318E91E1A7L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : iterable) {
      Object object1 = paramFunction11.invoke(object);
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(object));
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List take(@NotNull Iterable paramIterable, int paramInt) {
    long l = j ^ 0x7F46CE73C3E3L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = (paramInt >= 0) ? 1 : 0;
    if (!b) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    try {
      if (paramIterable instanceof Collection) {
        try {
          if (paramInt >= ((Collection)paramIterable).size())
            return CollectionsKt.toList(paramIterable); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        try {
          if (paramInt == 1)
            return CollectionsKt.listOf(CollectionsKt.first(paramIterable)); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    b = 0;
    ArrayList arrayList = new ArrayList(paramInt);
    for (Object object : paramIterable) {
      arrayList.add(object);
      if (++b == paramInt)
        break; 
    } 
    return CollectionsKt.optimizeReadOnlyList(arrayList);
  }
  
  @NotNull
  public static final List filterNot(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2938C0F83570L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object : iterable) {
      if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
        arrayList.add(object); 
    } 
    return arrayList;
  }
  
  public static final boolean none(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2F6330563058L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramIterable instanceof Collection)
        try {
          if (((Collection)paramIterable).isEmpty())
            return true; 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return false; 
    } 
    return true;
  }
  
  public static final float sumOfFloat(@NotNull Iterable paramIterable) {
    long l = j ^ 0x3BB720D1B1FFL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    float f = 0.0F;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      float f1 = ((Number)iterator.next()).floatValue();
      f += f1;
    } 
    return f;
  }
  
  public static final Object last(@NotNull Iterable paramIterable) {
    long l = j ^ 0x17F6768EADBCL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return CollectionsKt.last((List)paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException("Collection is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = iterator.next());
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Collection flatMapSequenceTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x56B1533239AEL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramIterable) {
      Sequence sequence = (Sequence)paramFunction1.invoke(object);
      CollectionsKt.addAll(paramCollection, sequence);
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Map associate(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x64FDDA75EA42L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramIterable, 10)), 16);
    Iterable iterable = paramIterable;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    for (Object object : iterable) {
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(object);
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List sorted(@NotNull Iterable paramIterable) {
    long l = j ^ 0x32AC6CB4A6F8L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection) {
        try {
          if (((Collection)paramIterable).size() <= 1)
            return CollectionsKt.toList(paramIterable); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        Collection collection1 = (Collection)paramIterable;
        boolean bool1 = false;
        Collection collection2 = collection1;
        Intrinsics.checkNotNull(collection2.toArray((Object[])new Comparable[0]), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Intrinsics.checkNotNull(collection2.toArray((Object[])new Comparable[0]), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
        Comparable[] arrayOfComparable1 = (Comparable[])collection2.toArray((Object[])new Comparable[0]);
        Comparable[] arrayOfComparable2 = arrayOfComparable1;
        bool1 = false;
        ArraysKt.sort((Object[])arrayOfComparable2);
        return ArraysKt.asList((Object[])arrayOfComparable1);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    List list1 = CollectionsKt.toMutableList(paramIterable);
    List list2 = list1;
    boolean bool = false;
    CollectionsKt.sort(list2);
    return list1;
  }
  
  public static final Object last(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x1A96180E518AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    for (Object object1 : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
        object = object1;
        bool2 = true;
      } 
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Collection contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List windowed(@NotNull Iterable paramIterable, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 76771850937698
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: iload_1
    //   16: iload_2
    //   17: invokestatic checkWindowSizeStep : (II)V
    //   20: aload_0
    //   21: instanceof java/util/RandomAccess
    //   24: ifeq -> 247
    //   27: aload_0
    //   28: instanceof java/util/List
    //   31: ifeq -> 247
    //   34: goto -> 41
    //   37: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   40: athrow
    //   41: aload_0
    //   42: checkcast java/util/List
    //   45: invokeinterface size : ()I
    //   50: istore #6
    //   52: iload #6
    //   54: iload_2
    //   55: idiv
    //   56: iload #6
    //   58: iload_2
    //   59: irem
    //   60: ifne -> 71
    //   63: iconst_0
    //   64: goto -> 72
    //   67: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   70: athrow
    //   71: iconst_1
    //   72: iadd
    //   73: istore #7
    //   75: new java/util/ArrayList
    //   78: dup
    //   79: iload #7
    //   81: invokespecial <init> : (I)V
    //   84: astore #8
    //   86: iconst_0
    //   87: istore #9
    //   89: iconst_0
    //   90: iload #9
    //   92: if_icmpgt -> 121
    //   95: iload #9
    //   97: iload #6
    //   99: if_icmpge -> 117
    //   102: goto -> 109
    //   105: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   108: athrow
    //   109: iconst_1
    //   110: goto -> 122
    //   113: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   116: athrow
    //   117: iconst_0
    //   118: goto -> 122
    //   121: iconst_0
    //   122: ifeq -> 241
    //   125: iload_1
    //   126: iload #6
    //   128: iload #9
    //   130: isub
    //   131: invokestatic coerceAtMost : (II)I
    //   134: istore #10
    //   136: iload #10
    //   138: iload_1
    //   139: if_icmpge -> 153
    //   142: iload_3
    //   143: ifeq -> 241
    //   146: goto -> 153
    //   149: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   152: athrow
    //   153: aload #8
    //   155: astore #16
    //   157: new java/util/ArrayList
    //   160: dup
    //   161: iload #10
    //   163: invokespecial <init> : (I)V
    //   166: astore #11
    //   168: iconst_0
    //   169: istore #12
    //   171: iload #12
    //   173: iload #10
    //   175: if_icmpge -> 220
    //   178: iload #12
    //   180: istore #13
    //   182: aload #11
    //   184: iload #13
    //   186: istore #14
    //   188: astore #17
    //   190: iconst_0
    //   191: istore #15
    //   193: aload_0
    //   194: checkcast java/util/List
    //   197: iload #14
    //   199: iload #9
    //   201: iadd
    //   202: invokeinterface get : (I)Ljava/lang/Object;
    //   207: aload #17
    //   209: swap
    //   210: invokevirtual add : (Ljava/lang/Object;)Z
    //   213: pop
    //   214: iinc #12, 1
    //   217: goto -> 171
    //   220: aload #11
    //   222: checkcast java/util/List
    //   225: aload #16
    //   227: swap
    //   228: invokevirtual add : (Ljava/lang/Object;)Z
    //   231: pop
    //   232: iload #9
    //   234: iload_2
    //   235: iadd
    //   236: istore #9
    //   238: goto -> 89
    //   241: aload #8
    //   243: checkcast java/util/List
    //   246: areturn
    //   247: new java/util/ArrayList
    //   250: dup
    //   251: invokespecial <init> : ()V
    //   254: astore #6
    //   256: aload_0
    //   257: invokeinterface iterator : ()Ljava/util/Iterator;
    //   262: iload_1
    //   263: iload_2
    //   264: iload_3
    //   265: iconst_0
    //   266: invokestatic windowedIterator : (Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;
    //   269: astore #7
    //   271: iconst_0
    //   272: istore #8
    //   274: aload #7
    //   276: astore #9
    //   278: aload #9
    //   280: invokeinterface hasNext : ()Z
    //   285: ifeq -> 320
    //   288: aload #9
    //   290: invokeinterface next : ()Ljava/lang/Object;
    //   295: astore #10
    //   297: aload #10
    //   299: checkcast java/util/List
    //   302: astore #11
    //   304: iconst_0
    //   305: istore #12
    //   307: aload #6
    //   309: aload #11
    //   311: invokevirtual add : (Ljava/lang/Object;)Z
    //   314: pop
    //   315: nop
    //   316: nop
    //   317: goto -> 278
    //   320: nop
    //   321: aload #6
    //   323: checkcast java/util/List
    //   326: areturn
    // Exception table:
    //   from	to	target	type
    //   9	34	37	java/util/NoSuchElementException
    //   52	67	67	java/util/NoSuchElementException
    //   89	102	105	java/util/NoSuchElementException
    //   95	113	113	java/util/NoSuchElementException
    //   136	146	149	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map associateBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x68651DF1EB68L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramIterable, 10)), 16);
    Iterable iterable = paramIterable;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    for (Object object : iterable)
      linkedHashMap.put(paramFunction1.invoke(object), object); 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningFoldIndexed(@NotNull Iterable paramIterable, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x6217381C2CEFL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 9);
    try {
      if (i == 0)
        return CollectionsKt.listOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList<Object> arrayList2 = new ArrayList(i + 1);
    ArrayList<Object> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(paramObject);
    ArrayList<Object> arrayList1 = arrayList2;
    byte b = 0;
    Object object = paramObject;
    for (Object object1 : paramIterable) {
      object = paramFunction3.invoke(Integer.valueOf(b++), object, object1);
      arrayList1.add(object);
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final String joinToString(@NotNull Iterable paramIterable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = j ^ 0x71463744F85DL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)CollectionsKt.joinTo(paramIterable, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)CollectionsKt.joinTo(paramIterable, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @Nullable
  public static final Object singleOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x5F1290F67835L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return (((List)paramIterable).size() == 1) ? ((List)paramIterable).get(0) : null;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    try {
      if (iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return object;
  }
  
  public static final Object last(@NotNull List paramList) {
    long l = j ^ 0x5B69EF76EC5EL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (paramList.isEmpty())
        throw new NoSuchElementException("List is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return paramList.get(CollectionsKt.getLastIndex(paramList));
  }
  
  @NotNull
  public static final Set subtract(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = j ^ 0x6C708A30CF5EL;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "other");
    Set set = CollectionsKt.toMutableSet(paramIterable1);
    CollectionsKt.removeAll(set, paramIterable2);
    return set;
  }
  
  @NotNull
  public static final char[] toCharArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x41B924893263L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    char[] arrayOfChar = new char[paramCollection.size()];
    byte b = 0;
    Iterator<Character> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      char c = ((Character)iterator.next()).charValue();
      arrayOfChar[b++] = c;
    } 
    return arrayOfChar;
  }
  
  @NotNull
  public static final List zip(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = j ^ 0x70EEBC885E68L;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "other");
    Iterable iterable = paramIterable1;
    boolean bool = false;
    Iterator<Object> iterator1 = iterable.iterator();
    Iterator<Object> iterator2 = paramIterable2.iterator();
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), CollectionsKt.collectionSizeOrDefault(paramIterable2, 10)));
    while (true) {
      try {
        if (iterator1.hasNext() && iterator2.hasNext()) {
          Object object1 = iterator2.next();
          Object object2 = iterator1.next();
          ArrayList<Pair> arrayList1 = arrayList;
          boolean bool1 = false;
          arrayList1.add(TuplesKt.to(object2, object1));
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      break;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List map(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2D443B537273L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    ArrayList<Object> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paramIterable, 10));
    boolean bool2 = false;
    for (Object object : iterable)
      arrayList.add(paramFunction1.invoke(object)); 
    return arrayList;
  }
  
  public static final Object first(@NotNull Iterable paramIterable) {
    long l = j ^ 0x3DBFBFF0E988L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return CollectionsKt.first((List)paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException("Collection is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return iterator.next();
  }
  
  @SinceKotlin(version = "1.3")
  public static final Object random(@NotNull Collection paramCollection, @NotNull Random paramRandom) {
    long l = j ^ 0x89845EAE88L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (paramCollection.isEmpty())
        throw new NoSuchElementException("Collection is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return CollectionsKt.elementAt(paramCollection, paramRandom.nextInt(paramCollection.size()));
  }
  
  @NotNull
  public static final List dropWhile(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x6B8BAC612A0BL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList arrayList = new ArrayList();
    for (Object object : paramIterable) {
      try {
        if (bool2) {
          arrayList.add(object);
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      if (!((Boolean)paramFunction1.invoke(object)).booleanValue()) {
        arrayList.add(object);
        bool2 = true;
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Pair partition(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x122CBAD45DC9L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    for (Object object : paramIterable) {
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue()) {
          arrayList1.add(object);
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      arrayList2.add(object);
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @SinceKotlin(version = "1.7")
  public static final float maxOrThrow(@NotNull Iterable paramIterable) {
    long l = j ^ 0x428DCCEAE6A3L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.max(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return f;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = j ^ 0xB0D19E0268L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramIterable, 10)), 16);
    Iterable iterable = paramIterable;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    for (Object object : iterable)
      linkedHashMap.put(paramFunction11.invoke(object), paramFunction12.invoke(object)); 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List runningReduce(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0xE94C8E64221L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = null;
    object = iterator.next();
    ArrayList<Object> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(paramIterable, 10));
    ArrayList<Object> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(object);
    ArrayList<Object> arrayList1 = arrayList2;
    while (iterator.hasNext()) {
      object = paramFunction2.invoke(object, iterator.next());
      arrayList1.add(object);
    } 
    return arrayList1;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x8A99463277DL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    for (Object object : paramIterable)
      d += ((Number)paramFunction1.invoke(object)).doubleValue(); 
    return d;
  }
  
  @NotNull
  public static final Set intersect(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = j ^ 0x5E3776E81B35L;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "other");
    Set set = CollectionsKt.toMutableSet(paramIterable1);
    CollectionsKt.retainAll(set, paramIterable2);
    return set;
  }
  
  public static final Object fold(@NotNull Iterable paramIterable, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x166ECEB32669L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    for (Object object1 : paramIterable)
      object = paramFunction2.invoke(object, object1); 
    return object;
  }
  
  @NotNull
  public static final Map associateTo(@NotNull Iterable paramIterable, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x41CA8AB80E95L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramIterable) {
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(object);
      map.put(pair.getFirst(), pair.getSecond());
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningFold(@NotNull Iterable paramIterable, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x587DE3BAC9AAL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 9);
    try {
      if (i == 0)
        return CollectionsKt.listOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList<Object> arrayList2 = new ArrayList(i + 1);
    ArrayList<Object> arrayList3 = arrayList2;
    bool2 = false;
    arrayList3.add(paramObject);
    ArrayList<Object> arrayList1 = arrayList2;
    Object object = paramObject;
    for (boolean bool2 : paramIterable) {
      object = paramFunction2.invoke(object, bool2);
      arrayList1.add(object);
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final List takeLast(@NotNull List paramList, int paramInt) {
    long l = j ^ 0x5B55969A951BL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    int i = (paramInt >= 0) ? 1 : 0;
    if (!i) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    i = paramList.size();
    try {
      if (paramInt >= i)
        return CollectionsKt.toList(paramList); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(CollectionsKt.last(paramList)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList arrayList = new ArrayList(paramInt);
    if (paramList instanceof java.util.RandomAccess) {
      int j = i - paramInt;
      try {
        while (j < i) {
          arrayList.add(paramList.get(j));
          j++;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
    } else {
      ListIterator<Object> listIterator = paramList.listIterator(i - paramInt);
      while (listIterator.hasNext()) {
        Object object = listIterator.next();
        arrayList.add(object);
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float maxOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x1AD5DFD2A68DL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.max(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final Iterable requireNoNulls(@NotNull Iterable paramIterable) {
    long l = j ^ 0x75EAFE33936CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    for (Object object : paramIterable) {
      if (object == null)
        throw new IllegalArgumentException("null element found in " + paramIterable + '.'); 
    } 
    return paramIterable;
  }
  
  @NotNull
  public static final float[] toFloatArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x5655CA8B324L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    float[] arrayOfFloat = new float[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      float f = ((Number)iterator.next()).floatValue();
      arrayOfFloat[b++] = f;
    } 
    return arrayOfFloat;
  }
  
  public static final boolean none(@NotNull Iterable paramIterable) {
    long l = j ^ 0x566ECA8070D7L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection)
        return ((Collection)paramIterable).isEmpty(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return !paramIterable.iterator().hasNext();
  }
  
  @NotNull
  public static final List mapIndexedNotNull(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 86949797290449
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'transform'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore #4
    //   23: aload_0
    //   24: astore #5
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: checkcast java/util/Collection
    //   36: astore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: aload #5
    //   43: astore #8
    //   45: iconst_0
    //   46: istore #9
    //   48: iconst_0
    //   49: istore #10
    //   51: aload #8
    //   53: invokeinterface iterator : ()Ljava/util/Iterator;
    //   58: astore #11
    //   60: aload #11
    //   62: invokeinterface hasNext : ()Z
    //   67: ifeq -> 157
    //   70: aload #11
    //   72: invokeinterface next : ()Ljava/lang/Object;
    //   77: astore #12
    //   79: iload #10
    //   81: iinc #10, 1
    //   84: istore #13
    //   86: iload #13
    //   88: ifge -> 101
    //   91: invokestatic throwIndexOverflow : ()V
    //   94: goto -> 101
    //   97: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   100: athrow
    //   101: iload #13
    //   103: aload #12
    //   105: astore #14
    //   107: istore #15
    //   109: iconst_0
    //   110: istore #16
    //   112: aload_1
    //   113: iload #15
    //   115: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   118: aload #14
    //   120: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   125: dup
    //   126: ifnull -> 151
    //   129: astore #17
    //   131: aload #17
    //   133: astore #18
    //   135: iconst_0
    //   136: istore #19
    //   138: aload #6
    //   140: aload #18
    //   142: invokeinterface add : (Ljava/lang/Object;)Z
    //   147: pop
    //   148: goto -> 153
    //   151: pop
    //   152: nop
    //   153: nop
    //   154: goto -> 60
    //   157: nop
    //   158: aload #6
    //   160: checkcast java/util/List
    //   163: areturn
    // Exception table:
    //   from	to	target	type
    //   86	94	97	java/util/NoSuchElementException
  }
  
  public static final int indexOfFirst(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x7E56D057B1CDL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return b; 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      b++;
    } 
    return -1;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningReduceIndexed(@NotNull Iterable paramIterable, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x7D0E540E54D6L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = null;
    object = iterator.next();
    ArrayList<Object> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(paramIterable, 10));
    ArrayList<Object> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(object);
    ArrayList<Object> arrayList1 = arrayList2;
    byte b = 1;
    while (iterator.hasNext()) {
      object = paramFunction3.invoke(Integer.valueOf(b++), object, iterator.next());
      arrayList1.add(object);
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x13213CDA3F0AL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return CollectionsKt.sortedWith(paramIterable, (Comparator)new Object(paramFunction1));
  }
  
  public static final void sortBy(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x15BA37724C28L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
      if (paramList.size() > 1)
        CollectionsKt.sortWith(paramList, (Comparator)new Object(paramFunction1)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object reduceIndexedOrNull(@NotNull Iterable paramIterable, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x36ACD6E7F5CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = 1;
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction3.invoke(Integer.valueOf(b1), object, iterator.next())) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
    } 
    return object;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull Iterable paramIterable) {
    long l = j ^ 0x481CDF437903L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (paramIterable instanceof Collection) ? new LinkedHashSet((Collection)paramIterable) : (Set)CollectionsKt.toCollection(paramIterable, new LinkedHashSet());
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull Iterable paramIterable) {
    long l = j ^ 0x7E143E4170CEL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(paramIterable);
  }
  
  public static final Object elementAt(@NotNull Iterable paramIterable, int paramInt) {
    long l = j ^ 0x321E8C641A7EL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return ((List)paramIterable).get(paramInt); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return CollectionsKt.elementAtOrElse(paramIterable, paramInt, new CollectionsKt___CollectionsKt$elementAt$1(paramInt));
  }
  
  @NotNull
  public static final short[] toShortArray(@NotNull Collection paramCollection) {
    long l = j ^ 0x4910E4531AA9L;
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    short[] arrayOfShort = new short[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      short s = ((Number)iterator.next()).shortValue();
      arrayOfShort[b++] = s;
    } 
    return arrayOfShort;
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull List paramList) {
    long l = j ^ 0x3B695D06E751L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return paramList.isEmpty() ? null : paramList.get(0);
  }
  
  @NotNull
  public static final List slice(@NotNull List paramList, @NotNull Iterable paramIterable) {
    long l = j ^ 0x252BBE469F66L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(paramList.get(j));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x4B35EADBC67FL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramList.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ListIterator listIterator = paramList.listIterator(paramList.size());
    while (listIterator.hasPrevious()) {
      if (!((Boolean)paramFunction1.invoke(listIterator.previous())).booleanValue()) {
        listIterator.next();
        int i = paramList.size() - listIterator.nextIndex();
        try {
          if (i == 0)
            return CollectionsKt.emptyList(); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        ArrayList arrayList1 = new ArrayList(i);
        ArrayList arrayList2 = arrayList1;
        boolean bool1 = false;
        try {
          while (listIterator.hasNext())
            arrayList2.add(listIterator.next()); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return arrayList1;
      } 
    } 
    return CollectionsKt.toList(paramList);
  }
  
  @NotNull
  public static final List zip(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x628B64A09883L;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    Iterator iterator1 = paramIterable1.iterator();
    Iterator iterator2 = paramIterable2.iterator();
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable1, 10), CollectionsKt.collectionSizeOrDefault(paramIterable2, 10)));
    while (true) {
      try {
        if (iterator1.hasNext())
          try {
            if (iterator2.hasNext()) {
              arrayList.add(paramFunction2.invoke(iterator1.next(), iterator2.next()));
              continue;
            } 
          } catch (NoSuchElementException noSuchElementException) {
            throw b(null);
          }  
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      break;
    } 
    return arrayList;
  }
  
  public static final void forEachIndexed(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x59D9510A2AE1L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramIterable) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      paramFunction2.invoke(Integer.valueOf(b1), object);
    } 
  }
  
  public static final double averageOfFloat(@NotNull Iterable paramIterable) {
    long l = j ^ 0x7471DAD5A1AEL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      float f = ((Number)iterator.next()).floatValue();
      d += f;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @NotNull
  public static final Collection mapIndexedNotNullTo(@NotNull Iterable paramIterable, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 21242591404597
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'destination'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_2
    //   22: ldc 'transform'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: iconst_0
    //   28: istore #5
    //   30: aload_0
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: iconst_0
    //   37: istore #8
    //   39: aload #6
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #9
    //   48: aload #9
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 144
    //   58: aload #9
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: astore #10
    //   67: iload #8
    //   69: iinc #8, 1
    //   72: istore #11
    //   74: iload #11
    //   76: ifge -> 89
    //   79: invokestatic throwIndexOverflow : ()V
    //   82: goto -> 89
    //   85: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   88: athrow
    //   89: iload #11
    //   91: aload #10
    //   93: astore #12
    //   95: istore #13
    //   97: iconst_0
    //   98: istore #14
    //   100: aload_2
    //   101: iload #13
    //   103: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   106: aload #12
    //   108: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   113: dup
    //   114: ifnull -> 138
    //   117: astore #15
    //   119: aload #15
    //   121: astore #16
    //   123: iconst_0
    //   124: istore #17
    //   126: aload_1
    //   127: aload #16
    //   129: invokeinterface add : (Ljava/lang/Object;)Z
    //   134: pop
    //   135: goto -> 140
    //   138: pop
    //   139: nop
    //   140: nop
    //   141: goto -> 48
    //   144: nop
    //   145: aload_1
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   74	82	85	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object maxByOrThrow(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2050DA2A7FCFL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    while (true) {
      Object object1 = iterator.next();
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) < 0) {
        object = object1;
        comparable = comparable1;
      } 
      if (!iterator.hasNext())
        return object; 
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Iterable onEachIndexed(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x35D8A2D2059BL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool1 = false;
    Iterable iterable1 = paramIterable;
    Iterable iterable2 = iterable1;
    boolean bool2 = false;
    Iterable iterable3 = iterable2;
    boolean bool3 = false;
    byte b = 0;
    for (Object object : iterable3) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      paramFunction2.invoke(Integer.valueOf(b1), object);
    } 
    return iterable1;
  }
  
  public static final Object foldRightIndexed(@NotNull List paramList, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x14EF76F7D6FCL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    Object object = paramObject;
    if (!paramList.isEmpty()) {
      ListIterator listIterator = paramList.listIterator(paramList.size());
      while (listIterator.hasPrevious()) {
        int i = listIterator.previousIndex();
        object = paramFunction3.invoke(Integer.valueOf(i), listIterator.previous(), object);
      } 
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List scanIndexed(@NotNull Iterable paramIterable, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = j ^ 0x3C7496ED4DAFL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    boolean bool2 = false;
    int i = CollectionsKt.collectionSizeOrDefault(iterable, 9);
    try {
      ArrayList<Object> arrayList1 = new ArrayList(i + 1);
      ArrayList<Object> arrayList2 = arrayList1;
      boolean bool = false;
      arrayList2.add(paramObject);
      ArrayList<Object> arrayList3 = arrayList1;
      byte b = 0;
      Object object = paramObject;
      for (Object object1 : iterable) {
        object = paramFunction3.invoke(Integer.valueOf(b++), object, object1);
        arrayList3.add(object);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (i == 0) ? CollectionsKt.listOf(paramObject) : arrayList3;
  }
  
  @NotNull
  public static final List zip(@NotNull Iterable paramIterable, @NotNull Object[] paramArrayOfObject) {
    long l = j ^ 0x22D7FB35FCA5L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Iterable iterable = paramIterable;
    boolean bool = false;
    int i = paramArrayOfObject.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), i));
    byte b = 0;
    for (Object object : iterable) {
      if (b < i) {
        Object object1 = paramArrayOfObject[b++];
        Object object2 = object;
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(object2, object1));
      } 
    } 
    return arrayList;
  }
  
  public static final int indexOfFirst(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x743D10F26883L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramList) {
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return b; 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      b++;
    } 
    return -1;
  }
  
  public static final Object single(@NotNull List paramList) {
    long l = j ^ 0x7ADA68F8144DL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      switch (paramList.size()) {
        case 0:
          throw new NoSuchElementException("List is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    throw new IllegalArgumentException("List has more than one element.");
  }
  
  @NotNull
  public static final List minus(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = j ^ 0x6DCB8D288E5DL;
    Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable2, "elements");
    Collection collection = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(paramIterable2, paramIterable1);
    try {
      if (collection.isEmpty())
        return CollectionsKt.toList(paramIterable1); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterable iterable1 = paramIterable1;
    boolean bool1 = false;
    Iterable iterable2 = iterable1;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object1 : iterable2) {
      Object object2 = object1;
      boolean bool = false;
      if (!collection.contains(object2))
        arrayList.add(object1); 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List drop(@NotNull Iterable paramIterable, int paramInt) {
    long l = j ^ 0x19718C6C124DL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.toList(paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList arrayList = null;
    if (paramIterable instanceof Collection) {
      int i = ((Collection)paramIterable).size() - paramInt;
      try {
        if (i <= 0)
          return CollectionsKt.emptyList(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      try {
        if (i == 1)
          return CollectionsKt.listOf(CollectionsKt.last(paramIterable)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      arrayList = new ArrayList(i);
      try {
        if (paramIterable instanceof List) {
          if (paramIterable instanceof java.util.RandomAccess) {
            int j = paramInt;
            int k = ((Collection)paramIterable).size();
            try {
              while (j < k) {
                arrayList.add(((List)paramIterable).get(j));
                j++;
              } 
            } catch (NoSuchElementException noSuchElementException) {
              throw b(null);
            } 
          } else {
            ListIterator<Object> listIterator = ((List)paramIterable).listIterator(paramInt);
            while (listIterator.hasNext()) {
              Object object = listIterator.next();
              arrayList.add(object);
            } 
          } 
          return arrayList;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
    } else {
      arrayList = new ArrayList();
    } 
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b >= paramInt) {
          arrayList.add(object);
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      b++;
    } 
    return CollectionsKt.optimizeReadOnlyList(arrayList);
  }
  
  public static final double averageOfInt(@NotNull Iterable paramIterable) {
    long l = j ^ 0x3062502791E6L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      d += i;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @NotNull
  public static final List plus(@NotNull Iterable paramIterable, @NotNull Object[] paramArrayOfObject) {
    long l = j ^ 0x3584242C3799L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
      if (paramIterable instanceof Collection)
        return CollectionsKt.plus((Collection)paramIterable, paramArrayOfObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList arrayList = new ArrayList();
    CollectionsKt.addAll(arrayList, paramIterable);
    CollectionsKt.addAll(arrayList, paramArrayOfObject);
    return arrayList;
  }
  
  public static final boolean contains(@NotNull Iterable paramIterable, Object paramObject) {
    long l = j ^ 0x338DEC06F852L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection)
        return ((Collection)paramIterable).contains(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (CollectionsKt.indexOf(paramIterable, paramObject) >= 0);
  }
  
  public static final int count(@NotNull Iterable paramIterable) {
    long l = j ^ 0x2DF666ACE82EL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection)
        return ((Collection)paramIterable).size(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = 0;
    for (Object object : paramIterable) {
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    return b;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x1D8F9443BFAAL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : iterable) {
      Object object1 = paramFunction1.invoke(object);
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List list = (object2 == null) ? arrayList : (List)object2;
      list.add(object);
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double minOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x5829C51D115FL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.min(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final List minus(@NotNull Iterable paramIterable, @NotNull Object[] paramArrayOfObject) {
    long l = j ^ 0x54EE23D08130L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.toList(paramIterable); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Collection collection = BrittleContainsOptimizationKt.convertToSetForSetOperation(paramArrayOfObject);
    Iterable iterable1 = paramIterable;
    boolean bool1 = false;
    Iterable iterable2 = iterable1;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object1 : iterable2) {
      Object object2 = object1;
      boolean bool = false;
      if (!collection.contains(object2))
        arrayList.add(object1); 
    } 
    return arrayList;
  }
  
  public static final Object last(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x40FDEA7C39C5L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ListIterator<Object> listIterator = paramList.listIterator(paramList.size());
    while (listIterator.hasPrevious()) {
      Object object = listIterator.previous();
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return object; 
    } 
    throw new NoSuchElementException("List contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List minus(@NotNull Iterable paramIterable, Object paramObject) {
    long l = j ^ 0x707803082C64L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paramIterable, 10));
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    boolean bool2 = false;
    for (Object object1 : iterable) {
      Object object2 = object1;
      boolean bool = false;
      try {
        bool1 = true;
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      if (!(!bool1 && Intrinsics.areEqual(object2, paramObject)))
        arrayList.add(object1); 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object maxWithOrThrow(@NotNull Iterable paramIterable, @NotNull Comparator paramComparator) {
    long l = j ^ 0x776327624EE8L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    while (iterator.hasNext()) {
      Object object1 = iterator.next();
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
    } 
    return object;
  }
  
  @HidesMembers
  public static final void forEach(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2446E5F9160CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    for (Object object : paramIterable)
      paramFunction1.invoke(object); 
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List zipWithNext(@NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x60DBCCBA010EL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList<Object> arrayList = new ArrayList();
    for (Object object = iterator.next(); iterator.hasNext(); object = object1) {
      Object object1 = iterator.next();
      arrayList.add(paramFunction2.invoke(object, object1));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull Iterable paramIterable, @NotNull Comparator paramComparator) {
    long l = j ^ 0x21794BA76C19L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (paramIterable instanceof Collection) {
        try {
          if (((Collection)paramIterable).size() <= 1)
            return CollectionsKt.toList(paramIterable); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        Collection collection1 = (Collection)paramIterable;
        boolean bool1 = false;
        Collection collection2 = collection1;
        Intrinsics.checkNotNull(collection2.toArray(new Object[0]), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Intrinsics.checkNotNull(collection2.toArray(new Object[0]), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
        Object[] arrayOfObject1 = collection2.toArray(new Object[0]);
        Object[] arrayOfObject2 = arrayOfObject1;
        bool1 = false;
        ArraysKt.sortWith(arrayOfObject2, paramComparator);
        return ArraysKt.asList(arrayOfObject1);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    List list1 = CollectionsKt.toMutableList(paramIterable);
    List list2 = list1;
    boolean bool = false;
    CollectionsKt.sortWith(list2, paramComparator);
    return list1;
  }
  
  public static final double averageOfDouble(@NotNull Iterable paramIterable) {
    long l = j ^ 0x724ABC00F917L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      double d1 = ((Number)iterator.next()).doubleValue();
      d += d1;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @NotNull
  public static final List reversed(@NotNull Iterable paramIterable) {
    long l = j ^ 0x76B0D14164E1L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection)
        try {
          if (((Collection)paramIterable).size() <= 1)
            return CollectionsKt.toList(paramIterable); 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    List list = CollectionsKt.toMutableList(paramIterable);
    CollectionsKt.reverse(list);
    return list;
  }
  
  @NotNull
  public static final Collection filterNotNullTo(@NotNull Iterable paramIterable, @NotNull Collection paramCollection) {
    long l = j ^ 0x7B655D99BB1CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    for (Object object : paramIterable) {
      if (object != null)
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  public static final int indexOfLast(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x7122C1731411L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = -1;
    byte b1 = 0;
    for (Object object : paramIterable) {
      try {
        if (b1)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        b = b1; 
      b1++;
    } 
    return b;
  }
  
  @NotNull
  public static final List mapNotNull(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 99739734990801
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'transform'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore #4
    //   23: aload_0
    //   24: astore #5
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: checkcast java/util/Collection
    //   36: astore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: aload #5
    //   43: astore #8
    //   45: iconst_0
    //   46: istore #9
    //   48: aload #8
    //   50: invokeinterface iterator : ()Ljava/util/Iterator;
    //   55: astore #10
    //   57: aload #10
    //   59: invokeinterface hasNext : ()Z
    //   64: ifeq -> 123
    //   67: aload #10
    //   69: invokeinterface next : ()Ljava/lang/Object;
    //   74: astore #11
    //   76: aload #11
    //   78: astore #12
    //   80: iconst_0
    //   81: istore #13
    //   83: aload_1
    //   84: aload #12
    //   86: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: dup
    //   92: ifnull -> 117
    //   95: astore #14
    //   97: aload #14
    //   99: astore #15
    //   101: iconst_0
    //   102: istore #16
    //   104: aload #6
    //   106: aload #15
    //   108: invokeinterface add : (Ljava/lang/Object;)Z
    //   113: pop
    //   114: goto -> 119
    //   117: pop
    //   118: nop
    //   119: nop
    //   120: goto -> 57
    //   123: nop
    //   124: aload #6
    //   126: checkcast java/util/List
    //   129: areturn
  }
  
  @NotNull
  public static final Collection mapNotNullTo(@NotNull Iterable paramIterable, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/CollectionsKt___CollectionsKt.j : J
    //   3: ldc2_w 59851888062622
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'destination'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_2
    //   22: ldc 'transform'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: iconst_0
    //   28: istore #5
    //   30: aload_0
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: aload #6
    //   38: invokeinterface iterator : ()Ljava/util/Iterator;
    //   43: astore #8
    //   45: aload #8
    //   47: invokeinterface hasNext : ()Z
    //   52: ifeq -> 110
    //   55: aload #8
    //   57: invokeinterface next : ()Ljava/lang/Object;
    //   62: astore #9
    //   64: aload #9
    //   66: astore #10
    //   68: iconst_0
    //   69: istore #11
    //   71: aload_2
    //   72: aload #10
    //   74: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   79: dup
    //   80: ifnull -> 104
    //   83: astore #12
    //   85: aload #12
    //   87: astore #13
    //   89: iconst_0
    //   90: istore #14
    //   92: aload_1
    //   93: aload #13
    //   95: invokeinterface add : (Ljava/lang/Object;)Z
    //   100: pop
    //   101: goto -> 106
    //   104: pop
    //   105: nop
    //   106: nop
    //   107: goto -> 45
    //   110: nop
    //   111: aload_1
    //   112: areturn
  }
  
  @Nullable
  public static final Object singleOrNull(@NotNull List paramList) {
    long l = j ^ 0x7D7624E85A06L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (paramList.size() == 1) ? paramList.get(0) : null;
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x2CB56241FCC3L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return object; 
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object minByOrNull(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x748B11E6A760L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    while (true) {
      Object object1 = iterator.next();
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) > 0) {
        object = object1;
        comparable = comparable1;
      } 
      if (!iterator.hasNext())
        return object; 
    } 
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull Iterable paramIterable) {
    long l = j ^ 0x147CAF8CBC1L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return CollectionsKt.sortedWith(paramIterable, ComparisonsKt.reverseOrder());
  }
  
  @NotNull
  public static final List toList(@NotNull Iterable paramIterable) {
    long l = j ^ 0x74BDAD1E8C1CL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection) {
        try {
          switch (((Collection)paramIterable).size()) {
            case 0:
            
            case 1:
              try {
              
              } catch (NoSuchElementException noSuchElementException) {
                throw b(null);
              } 
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return CollectionsKt.toMutableList((Collection)paramIterable);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return CollectionsKt.optimizeReadOnlyList(CollectionsKt.toMutableList(paramIterable));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List scan(@NotNull Iterable paramIterable, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x6C1CE13C1464L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    boolean bool2 = false;
    int i = CollectionsKt.collectionSizeOrDefault(iterable, 9);
    try {
      ArrayList<Object> arrayList1 = new ArrayList(i + 1);
      ArrayList<Object> arrayList2 = arrayList1;
      bool = false;
      arrayList2.add(paramObject);
      ArrayList<Object> arrayList3 = arrayList1;
      Object object = paramObject;
      for (boolean bool : iterable) {
        object = paramFunction2.invoke(object, bool);
        arrayList3.add(object);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (i == 0) ? CollectionsKt.listOf(paramObject) : arrayList3;
  }
  
  public static final double sumOfDouble(@NotNull Iterable paramIterable) {
    long l = j ^ 0x1B3D037E70DCL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      double d1 = ((Number)iterator.next()).doubleValue();
      d += d1;
    } 
    return d;
  }
  
  public static final void sortByDescending(@NotNull List paramList, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x7CC3FCB99433L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
      if (paramList.size() > 1)
        CollectionsKt.sortWith(paramList, (Comparator)new Object(paramFunction1)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
  }
  
  public static final double averageOfLong(@NotNull Iterable paramIterable) {
    long l = j ^ 0x161338801F48L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      long l1 = ((Number)iterator.next()).longValue();
      d += l1;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object minWithOrNull(@NotNull Iterable paramIterable, @NotNull Comparator paramComparator) {
    long l = j ^ 0xF02E24B1ABEL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    while (iterator.hasNext()) {
      Object object1 = iterator.next();
      if (paramComparator.compare(object, object1) > 0)
        object = object1; 
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object maxByOrNull(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x5BFE25246B69L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    while (true) {
      Object object1 = iterator.next();
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) < 0) {
        object = object1;
        comparable = comparable1;
      } 
      if (!iterator.hasNext())
        return object; 
    } 
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x414CA12E67BL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    for (Object object : paramIterable)
      i += ((Number)paramFunction1.invoke(object)).intValue(); 
    return i;
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x6D5BB2257A0AL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List) {
        try {
          if (((List)paramIterable).isEmpty())
            return null; 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return ((List)paramIterable).get(0);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return iterator.next();
  }
  
  public static final int count(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x390C579870E8L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramIterable instanceof Collection)
        try {
          if (((Collection)paramIterable).isEmpty())
            return 0; 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = 0;
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue()) {
        byte b1 = ++b;
        if (b1 < 0)
          CollectionsKt.throwCountOverflow(); 
      } 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double minOrThrow(@NotNull Iterable paramIterable) {
    long l = j ^ 0x623D5B23BF59L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Number> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.min(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return d;
  }
  
  @NotNull
  public static final List flatMap(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x68B7CA33986CL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object : iterable) {
      Iterable iterable1 = (Iterable)paramFunction1.invoke(object);
      CollectionsKt.addAll(arrayList, iterable1);
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Object getOrNull(@NotNull List paramList, int paramInt) {
    long l = j ^ 0x4F66D52E6CC0L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= CollectionsKt.getLastIndex(paramList));
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return null;
  }
  
  @NotNull
  public static final Set toSet(@NotNull Iterable paramIterable) {
    long l = j ^ 0x12C015EC5B6DL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection) {
        try {
          switch (((Collection)paramIterable).size()) {
            case 0:
            
            case 1:
              try {
              
              } catch (NoSuchElementException noSuchElementException) {
                throw b(null);
              } 
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw b(null);
        } 
        return (Set)CollectionsKt.toCollection(paramIterable, new LinkedHashSet(MapsKt.mapCapacity(((Collection)paramIterable).size())));
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return SetsKt.optimizeReadOnlySet((Set)CollectionsKt.toCollection(paramIterable, new LinkedHashSet()));
  }
  
  public static final int indexOf(@NotNull Iterable paramIterable, Object paramObject) {
    long l = j ^ 0x2C7522681E45L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof List)
        return ((List)paramIterable).indexOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      try {
        if (Intrinsics.areEqual(paramObject, object))
          return b; 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      b++;
    } 
    return -1;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map associateWithTo(@NotNull Iterable paramIterable, @NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x531B25C967F7L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool = false;
    for (Object object : paramIterable)
      paramMap.put(object, paramFunction1.invoke(object)); 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Comparable minOrNull(@NotNull Iterable paramIterable) {
    long l = j ^ 0x2ABA93AC84ADL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator<Comparable> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) > 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @NotNull
  public static final List plus(@NotNull Iterable paramIterable1, @NotNull Iterable paramIterable2) {
    long l = j ^ 0x53A12DEB97CFL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable1, "<this>");
      Intrinsics.checkNotNullParameter(paramIterable2, "elements");
      if (paramIterable1 instanceof Collection)
        return CollectionsKt.plus((Collection)paramIterable1, paramIterable2); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList arrayList = new ArrayList();
    CollectionsKt.addAll(arrayList, paramIterable1);
    CollectionsKt.addAll(arrayList, paramIterable2);
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object minWithOrThrow(@NotNull Iterable paramIterable, @NotNull Comparator paramComparator) {
    long l = j ^ 0x2DD7321612CAL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramIterable.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Object object = iterator.next();
    while (iterator.hasNext()) {
      Object object1 = iterator.next();
      if (paramComparator.compare(object, object1) > 0)
        object = object1; 
    } 
    return object;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x7398B5AC8EEL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return CollectionsKt.sortedWith(paramIterable, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List filter(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x5E056C666845L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Iterable iterable = paramIterable;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Object object : iterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        arrayList.add(object); 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Grouping groupingBy(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x66F2D78044A6L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    return new CollectionsKt___CollectionsKt$groupingBy$1(paramIterable, paramFunction1);
  }
  
  @NotNull
  public static final List plus(@NotNull Iterable paramIterable, Object paramObject) {
    long l = j ^ 0x6C2DAEA3E9CL;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection)
        return CollectionsKt.plus((Collection)paramIterable, paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    ArrayList<Object> arrayList = new ArrayList();
    CollectionsKt.addAll(arrayList, paramIterable);
    arrayList.add(paramObject);
    return arrayList;
  }
  
  @NotNull
  public static final List zip(@NotNull Iterable paramIterable, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = j ^ 0xE7BC8C8F8AFL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfObject.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(object, paramArrayOfObject[b++])); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
    } 
    return arrayList;
  }
  
  public static final Object foldRight(@NotNull List paramList, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = j ^ 0x5E36849C7DB9L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    if (!paramList.isEmpty()) {
      ListIterator listIterator = paramList.listIterator(paramList.size());
      while (listIterator.hasPrevious())
        object = paramFunction2.invoke(listIterator.previous(), object); 
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List chunked(@NotNull Iterable paramIterable, int paramInt) {
    long l = j ^ 0xA3754FE6CF5L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return CollectionsKt.windowed(paramIterable, paramInt, paramInt, true);
  }
  
  private static NoSuchElementException b(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt___CollectionsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */