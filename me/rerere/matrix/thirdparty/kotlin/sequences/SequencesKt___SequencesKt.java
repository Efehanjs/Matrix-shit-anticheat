package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
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
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.Grouping;
import me.rerere.matrix.thirdparty.kotlin.collections.SetsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.SlidingWindowKt;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
  private static final long e = o3.a(-4613930775082272731L, -3375611222152233074L, null).a(149231054871745L);
  
  @Nullable
  public static final Object singleOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x29B93E8B659EL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    try {
      if (iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @NotNull
  public static final Sequence mapIndexed(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x7B89ABC6FE95L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    return new TransformingIndexedSequence(paramSequence, paramFunction2);
  }
  
  public static final void forEachIndexed(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x59E0CA444DBFL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramSequence) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      paramFunction2.invoke(Integer.valueOf(b1), object);
    } 
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x6EC02780C171L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    for (Object object : paramSequence)
      d += ((Number)paramFunction1.invoke(object)).doubleValue(); 
    return d;
  }
  
  public static final double averageOfLong(@NotNull Sequence paramSequence) {
    long l = e ^ 0x3800A9836403L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      long l1 = ((Number)iterator.next()).longValue();
      d += l1;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object minWithOrNull(@NotNull Sequence paramSequence, @NotNull Comparator paramComparator) {
    long l = e ^ 0x4850C6ECEDC9L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  public static final Collection mapTo(@NotNull Sequence paramSequence, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x7A52CCCBBBE3L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramSequence)
      paramCollection.add(paramFunction1.invoke(object)); 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Sequence runningReduceIndexed(@NotNull Sequence paramSequence, @NotNull Function3 paramFunction3) {
    long l = e ^ 0x483B16193A3L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    return SequencesKt.sequence(new SequencesKt___SequencesKt$runningReduceIndexed$1(paramSequence, paramFunction3, null));
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Collection flatMapIterableTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0xBD8E75A356FL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramSequence) {
      Iterable iterable = (Iterable)paramFunction1.invoke(object);
      CollectionsKt.addAll(paramCollection, iterable);
    } 
    return paramCollection;
  }
  
  public static final int indexOfFirst(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x64EFD19145A6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramSequence) {
      try {
        if (b)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return b; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return -1;
  }
  
  public static final long sumOfLong(@NotNull Sequence paramSequence) {
    long l1 = e ^ 0x46D3D18CF26DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    long l2 = 0L;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      long l = ((Number)iterator.next()).longValue();
      l2 += l;
    } 
    return l2;
  }
  
  public static final Object reduce(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x6CFA656E3D4CL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new UnsupportedOperationException("Empty sequence can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction2.invoke(object, iterator.next()));
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final Sequence scanIndexed(@NotNull Sequence paramSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = e ^ 0x55DBD3D3BB67L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    return SequencesKt.runningFoldIndexed(paramSequence, paramObject, paramFunction3);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final Sequence runningReduce(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x5C2638722077L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return SequencesKt.sequence(new SequencesKt___SequencesKt$runningReduce$1(paramSequence, paramFunction2, null));
  }
  
  @NotNull
  public static final Sequence minus(@NotNull Sequence paramSequence1, @NotNull Sequence paramSequence2) {
    long l = e ^ 0x429EC8371F15L;
    Intrinsics.checkNotNullParameter(paramSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence2, "elements");
    return new SequencesKt___SequencesKt$minus$4(paramSequence2, paramSequence1);
  }
  
  @NotNull
  public static final Sequence filterNot(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x4D79D912E5C4L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return new FilteringSequence(paramSequence, false, paramFunction1);
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Sequence flatMapIndexedSequence(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x42B0FA1210D0L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    return SequencesKt.flatMapIndexed(paramSequence, paramFunction2, SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE);
  }
  
  @NotNull
  public static final Sequence dropWhile(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x5B64FA7EFD8CL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return new DropWhileSequence(paramSequence, paramFunction1);
  }
  
  @NotNull
  public static final Set toSet(@NotNull Sequence paramSequence) {
    long l = e ^ 0x489DB04A85B7L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SetsKt.optimizeReadOnlySet((Set)SequencesKt.toCollection(paramSequence, new LinkedHashSet()));
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Sequence flatMapIndexedIterable(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x61615BAF807EL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    return SequencesKt.flatMapIndexed(paramSequence, paramFunction2, SequencesKt___SequencesKt$flatMapIndexed$1.INSTANCE);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object maxByOrNull(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x188B1FD502ADL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  
  @NotNull
  public static final Collection toCollection(@NotNull Sequence paramSequence, @NotNull Collection paramCollection) {
    long l = e ^ 0x7C28A69F00E2L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    for (Object object : paramSequence)
      paramCollection.add(object); 
    return paramCollection;
  }
  
  @NotNull
  public static final Sequence plus(@NotNull Sequence paramSequence, @NotNull Iterable paramIterable) {
    long l = e ^ 0x7CE4549904F6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    Sequence[] arrayOfSequence = new Sequence[2];
    arrayOfSequence[0] = paramSequence;
    arrayOfSequence[1] = CollectionsKt.asSequence(paramIterable);
    return SequencesKt.flatten(SequencesKt.sequenceOf((Object[])arrayOfSequence));
  }
  
  @NotNull
  public static final Map associateBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = e ^ 0x32E7D7772D38L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    Sequence sequence = paramSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : sequence)
      linkedHashMap.put(paramFunction11.invoke(object), paramFunction12.invoke(object)); 
    return linkedHashMap;
  }
  
  public static final boolean contains(@NotNull Sequence paramSequence, Object paramObject) {
    long l = e ^ 0x118B48E9EA27L;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (SequencesKt.indexOf(paramSequence, paramObject) >= 0);
  }
  
  public static final void forEach(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x6AB19DA19892L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    for (Object object : paramSequence)
      paramFunction1.invoke(object); 
  }
  
  public static final Object single(@NotNull Sequence paramSequence) {
    long l = e ^ 0x71B4F5AAB606L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException("Sequence is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    try {
      if (iterator.hasNext())
        throw new IllegalArgumentException("Sequence has more than one element."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull Sequence paramSequence, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = e ^ 0x490DF772C36L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    for (Object object : paramSequence)
      paramMap.put(paramFunction11.invoke(object), paramFunction12.invoke(object)); 
    return paramMap;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull Sequence paramSequence) {
    long l = e ^ 0x1C51D01A6729L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(paramSequence);
  }
  
  @NotNull
  public static final Sequence filter(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x6F113491C904L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return new FilteringSequence(paramSequence, true, paramFunction1);
  }
  
  public static final Object last(@NotNull Sequence paramSequence) {
    long l = e ^ 0x2B563FE2F0FBL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException("Sequence is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = iterator.next());
    return object;
  }
  
  @NotNull
  public static final Sequence sortedBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x788C3294C5D1L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return SequencesKt.sortedWith(paramSequence, (Comparator)new Object(paramFunction1));
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object minByOrThrow(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x492149B75E8EL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  public static final Sequence filterNotNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x5242C2532C47L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNull(SequencesKt.filterNot(paramSequence, SequencesKt___SequencesKt$filterNotNull$1.INSTANCE), "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
    return SequencesKt.filterNot(paramSequence, SequencesKt___SequencesKt$filterNotNull$1.INSTANCE);
  }
  
  public static final boolean all(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x23409A014F17L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
        return false; 
    } 
    return true;
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x7B1BA95BCC5CL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Sequence zip(@NotNull Sequence paramSequence1, @NotNull Sequence paramSequence2, @NotNull Function2 paramFunction2) {
    long l = e ^ 0xC72E0627095L;
    Intrinsics.checkNotNullParameter(paramSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    return new MergingSequence(paramSequence1, paramSequence2, paramFunction2);
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x4737CF9E4085L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = iterator.next());
    return object;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull Sequence paramSequence, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x38FB5C61A579L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    for (Object object : paramSequence) {
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
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object minByOrNull(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x45F49DAD07FDL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  
  @SinceKotlin(version = "1.7")
  @NotNull
  public static final Comparable maxOrThrow(@NotNull Sequence paramSequence) {
    long l = e ^ 0x284CCCE4C4AEL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Comparable> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) < 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Comparable maxOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0xF234732F56DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Comparable> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) < 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map associateWithTo(@NotNull Sequence paramSequence, @NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0xAB0A5AE5826L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool = false;
    for (Object object : paramSequence)
      paramMap.put(object, paramFunction1.invoke(object)); 
    return paramMap;
  }
  
  @NotNull
  public static final Sequence sortedWith(@NotNull Sequence paramSequence, @NotNull Comparator paramComparator) {
    long l = e ^ 0x56E1E299F401L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return new SequencesKt___SequencesKt$sortedWith$1(paramSequence, paramComparator);
  }
  
  public static final int indexOfLast(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x63F657E60405L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = -1;
    byte b1 = 0;
    for (Object object : paramSequence) {
      try {
        if (b1)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        b = b1; 
      b1++;
    } 
    return b;
  }
  
  @NotNull
  public static final Sequence zip(@NotNull Sequence paramSequence1, @NotNull Sequence paramSequence2) {
    long l = e ^ 0x24D167CF5951L;
    Intrinsics.checkNotNullParameter(paramSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence2, "other");
    return new MergingSequence(paramSequence1, paramSequence2, SequencesKt___SequencesKt$zip$1.INSTANCE);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final Sequence scan(@NotNull Sequence paramSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x7F18047E960FL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return SequencesKt.runningFold(paramSequence, paramObject, paramFunction2);
  }
  
  public static final int sumOfShort(@NotNull Sequence paramSequence) {
    long l = e ^ 0xC8C8B2AE4D9L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    int i = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      short s = ((Number)iterator.next()).shortValue();
      i += s;
    } 
    return i;
  }
  
  public static final Object foldIndexed(@NotNull Sequence paramSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = e ^ 0x3A8F6E84EBEL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b = 0;
    Object object = paramObject;
    for (Object object1 : paramSequence) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      object = paramFunction3.invoke(Integer.valueOf(b1), object, object1);
    } 
    return object;
  }
  
  @NotNull
  public static final Map associate(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x1FE6EBD06A02L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Sequence sequence = paramSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : sequence) {
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(object);
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float maxOrThrow(@NotNull Sequence paramSequence) {
    long l = e ^ 0x36F708DBED17L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.max(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return f;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence chunked(@NotNull Sequence paramSequence, int paramInt, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x659222A5D2B5L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return SequencesKt.windowed(paramSequence, paramInt, paramInt, true, paramFunction1);
  }
  
  @NotNull
  public static final Sequence plus(@NotNull Sequence paramSequence, Object paramObject) {
    long l = e ^ 0x7E893956AF2BL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Sequence[] arrayOfSequence = new Sequence[2];
    arrayOfSequence[0] = paramSequence;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    arrayOfSequence[1] = SequencesKt.sequenceOf(arrayOfObject);
    return SequencesKt.flatten(SequencesKt.sequenceOf((Object[])arrayOfSequence));
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object minWithOrThrow(@NotNull Sequence paramSequence, @NotNull Comparator paramComparator) {
    long l = e ^ 0x5F908E260B6AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  public static final Collection filterIndexedTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt.e : J
    //   3: ldc2_w 113489835697395
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'predicate'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: iconst_0
    //   27: istore #5
    //   29: aload_0
    //   30: astore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: aload #6
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore #9
    //   47: aload #9
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 142
    //   57: aload #9
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: astore #10
    //   66: iload #8
    //   68: iinc #8, 1
    //   71: istore #11
    //   73: iload #11
    //   75: ifge -> 88
    //   78: invokestatic throwIndexOverflow : ()V
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   87: athrow
    //   88: iload #11
    //   90: aload #10
    //   92: astore #12
    //   94: istore #13
    //   96: iconst_0
    //   97: istore #14
    //   99: aload_2
    //   100: iload #13
    //   102: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   105: aload #12
    //   107: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   112: checkcast java/lang/Boolean
    //   115: invokevirtual booleanValue : ()Z
    //   118: ifeq -> 137
    //   121: aload_1
    //   122: aload #12
    //   124: invokeinterface add : (Ljava/lang/Object;)Z
    //   129: pop
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   136: athrow
    //   137: nop
    //   138: nop
    //   139: goto -> 47
    //   142: nop
    //   143: aload_1
    //   144: areturn
    // Exception table:
    //   from	to	target	type
    //   73	81	84	java/util/NoSuchElementException
    //   99	130	133	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull Sequence paramSequence, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = e ^ 0x77DD4A6D8F09L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    for (Object object : paramSequence) {
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
  
  @NotNull
  public static final Sequence sortedDescending(@NotNull Sequence paramSequence) {
    long l = e ^ 0x332A7B455EDEL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.sortedWith(paramSequence, ComparisonsKt.reverseOrder());
  }
  
  @NotNull
  public static final Sequence minus(@NotNull Sequence paramSequence, Object paramObject) {
    long l = e ^ 0xCF95057E21DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return new SequencesKt___SequencesKt$minus$1(paramSequence, paramObject);
  }
  
  @NotNull
  public static final Sequence mapIndexedNotNull(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x4E9CAA2AB2CL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    return SequencesKt.filterNotNull(new TransformingIndexedSequence(paramSequence, paramFunction2));
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object maxWithOrNull(@NotNull Sequence paramSequence, @NotNull Comparator paramComparator) {
    long l = e ^ 0x7E684EE1CA3AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    while (iterator.hasNext()) {
      Object object1 = iterator.next();
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
    } 
    return object;
  }
  
  @NotNull
  public static final Map associateTo(@NotNull Sequence paramSequence, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x292CCD7B1691L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramSequence) {
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(object);
      map.put(pair.getFirst(), pair.getSecond());
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Sequence onEach(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x3009B537BCBCL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    return SequencesKt.map(paramSequence, new SequencesKt___SequencesKt$onEach$1(paramFunction1));
  }
  
  @NotNull
  public static final Sequence plus(@NotNull Sequence paramSequence, @NotNull Object[] paramArrayOfObject) {
    long l = e ^ 0x71880D8513D2L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    return SequencesKt.plus(paramSequence, ArraysKt.asList(paramArrayOfObject));
  }
  
  @NotNull
  public static final List toMutableList(@NotNull Sequence paramSequence) {
    long l = e ^ 0x692E3F8E886AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return (List)SequencesKt.toCollection(paramSequence, new ArrayList());
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull Sequence paramSequence) {
    long l = e ^ 0x46B99E39B645L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return (HashSet)SequencesKt.toCollection(paramSequence, new HashSet());
  }
  
  @NotNull
  public static final Map groupBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = e ^ 0x1E911B520B7FL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    Sequence sequence = paramSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : sequence) {
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
  
  public static final double sumOfDouble(@NotNull Sequence paramSequence) {
    long l = e ^ 0x19ABD8D68F49L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      double d1 = ((Number)iterator.next()).doubleValue();
      d += d1;
    } 
    return d;
  }
  
  @NotNull
  public static final Sequence withIndex(@NotNull Sequence paramSequence) {
    long l = e ^ 0x5B40552B8996L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return new IndexingSequence(paramSequence);
  }
  
  public static final int lastIndexOf(@NotNull Sequence paramSequence, Object paramObject) {
    long l = e ^ 0x4549EF9210ACL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    byte b = -1;
    byte b1 = 0;
    for (Object object : paramSequence) {
      try {
        if (b1)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      if (Intrinsics.areEqual(paramObject, object))
        b = b1; 
      b1++;
    } 
    return b;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x206E30D4F386L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    Sequence sequence = paramSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : sequence)
      linkedHashMap.put(paramFunction1.invoke(object), object); 
    return linkedHashMap;
  }
  
  public static final int indexOf(@NotNull Sequence paramSequence, Object paramObject) {
    long l = e ^ 0x5621C4B33FA6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    byte b = 0;
    for (Object object : paramSequence) {
      try {
        if (b)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      try {
        if (Intrinsics.areEqual(paramObject, object))
          return b; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return -1;
  }
  
  public static final boolean none(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x4E6311C4C728L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return false; 
    } 
    return true;
  }
  
  public static final boolean any(@NotNull Sequence paramSequence) {
    long l = e ^ 0x4D9B98F527D6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return paramSequence.iterator().hasNext();
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x143C78F27E42L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x339EC4513EBFL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    Sequence sequence = paramSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Object object : sequence) {
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
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence windowed(@NotNull Sequence paramSequence, int paramInt1, int paramInt2, boolean paramBoolean, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x17AEA1FACD82L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return SequencesKt.map(SlidingWindowKt.windowedSequence(paramSequence, paramInt1, paramInt2, paramBoolean, true), paramFunction1);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map associateWith(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0xB4709F52A0DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool1 = false;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    Sequence sequence = paramSequence;
    boolean bool2 = false;
    for (Object object : sequence)
      linkedHashMap.put(object, paramFunction1.invoke(object)); 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Sequence takeWhile(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x7F13AD91D28AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    return new TakeWhileSequence(paramSequence, paramFunction1);
  }
  
  @NotNull
  public static final Sequence map(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x9D88C32BADBL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return new TransformingSequence(paramSequence, paramFunction1);
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull Sequence paramSequence) {
    long l = e ^ 0x6C41DAD0D679L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    for (Object object : paramSequence)
      linkedHashSet.add(object); 
    return linkedHashSet;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Sequence runningFold(@NotNull Sequence paramSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x48D9AE9730D1L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return SequencesKt.sequence(new SequencesKt___SequencesKt$runningFold$1(paramObject, paramSequence, paramFunction2, null));
  }
  
  public static final double averageOfDouble(@NotNull Sequence paramSequence) {
    long l = e ^ 0x1A43F00D0E8L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      double d1 = ((Number)iterator.next()).doubleValue();
      d += d1;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @NotNull
  public static final Sequence filterIndexed(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x40E3F59EE11BL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "predicate");
    return new TransformingSequence(new FilteringSequence(new IndexingSequence(paramSequence), true, new SequencesKt___SequencesKt$filterIndexed$1(paramFunction2)), SequencesKt___SequencesKt$filterIndexed$2.INSTANCE);
  }
  
  @Nullable
  public static final Object elementAtOrNull(@NotNull Sequence paramSequence, int paramInt) {
    long l = e ^ 0x1F1A67B7BD9BL;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
      if (paramInt < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Iterator<Object> iterator = paramSequence.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      Object object = iterator.next();
      if (paramInt == b++)
        return object; 
    } 
    return null;
  }
  
  public static final double averageOfInt(@NotNull Sequence paramSequence) {
    long l = e ^ 0x6B5D3B897511L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      d += i;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double maxOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x5F7381B4BC44L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.max(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return Double.valueOf(d);
  }
  
  public static final Object first(@NotNull Sequence paramSequence) {
    long l = e ^ 0x4D7FC5E2BF00L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException("Sequence is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return iterator.next();
  }
  
  public static final Object single(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x27450C03C2E6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    for (Object object1 : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
        try {
          if (bool2)
            throw new IllegalArgumentException("Sequence contains more than one matching element."); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        object = object1;
        bool2 = true;
      } 
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Sequence contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @NotNull
  public static final Sequence requireNoNulls(@NotNull Sequence paramSequence) {
    long l = e ^ 0x1EAF739B21FFL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.map(paramSequence, new SequencesKt___SequencesKt$requireNoNulls$1(paramSequence));
  }
  
  public static final Object fold(@NotNull Sequence paramSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x2C0F9C66070DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    for (Object object1 : paramSequence)
      object = paramFunction2.invoke(object, object1); 
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float maxOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x2AA663314570L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.max(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return Float.valueOf(f);
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object maxWithOrThrow(@NotNull Sequence paramSequence, @NotNull Comparator paramComparator) {
    long l = e ^ 0x25CB770F052DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    while (iterator.hasNext()) {
      Object object1 = iterator.next();
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
    } 
    return object;
  }
  
  public static final boolean none(@NotNull Sequence paramSequence) {
    long l = e ^ 0x4962685EBCC0L;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !paramSequence.iterator().hasNext();
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Sequence onEachIndexed(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x30D8E0F174D7L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    return SequencesKt.mapIndexed(paramSequence, new SequencesKt___SequencesKt$onEachIndexed$1(paramFunction2));
  }
  
  @NotNull
  public static final Sequence minus(@NotNull Sequence paramSequence, @NotNull Iterable paramIterable) {
    long l = e ^ 0x56810654C7B4L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "elements");
    return new SequencesKt___SequencesKt$minus$3(paramIterable, paramSequence);
  }
  
  @NotNull
  public static final Sequence sortedByDescending(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x39E5B7D71EA1L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return SequencesKt.sortedWith(paramSequence, (Comparator)new Object(paramFunction1));
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Sequence runningFoldIndexed(@NotNull Sequence paramSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = e ^ 0x2EEDB0F583E3L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    return SequencesKt.sequence(new SequencesKt___SequencesKt$runningFoldIndexed$1(paramObject, paramSequence, paramFunction3, null));
  }
  
  public static final int count(@NotNull Sequence paramSequence) {
    long l = e ^ 0x181F2AADA84BL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    byte b = 0;
    for (Object object : paramSequence) {
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    return b;
  }
  
  @NotNull
  public static final Sequence minus(@NotNull Sequence paramSequence, @NotNull Object[] paramArrayOfObject) {
    long l = e ^ 0x469B5F20C3CEL;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "elements");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return paramSequence; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new SequencesKt___SequencesKt$minus$2(paramArrayOfObject, paramSequence);
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0xF3D2CE5177AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return iterator.next();
  }
  
  @NotNull
  public static final Sequence flatMap(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x2A0D513E918EL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return new FlatteningSequence(paramSequence, paramFunction1, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
  }
  
  @NotNull
  public static final Sequence sorted(@NotNull Sequence paramSequence) {
    long l = e ^ 0x6C53DC5FD5L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return new SequencesKt___SequencesKt$sorted$1(paramSequence);
  }
  
  @NotNull
  public static final Pair partition(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x5238BF5AA6AFL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    for (Object object : paramSequence) {
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue()) {
          arrayList1.add(object);
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList2.add(object);
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x480781B93DA6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return object; 
    } 
    return null;
  }
  
  public static final double averageOfShort(@NotNull Sequence paramSequence) {
    long l = e ^ 0x7B97DB251327L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      short s = ((Number)iterator.next()).shortValue();
      d += s;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  public static final int sumOfInt(@NotNull Sequence paramSequence) {
    long l = e ^ 0x6DF7290F622EL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    int i = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      i += j;
    } 
    return i;
  }
  
  public static final double averageOfFloat(@NotNull Sequence paramSequence) {
    long l = e ^ 0x1380F778494AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      float f = ((Number)iterator.next()).floatValue();
      d += f;
      byte b1 = ++b;
      if (b1 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  public static final Object first(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x4A36BACF676DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return object; 
    } 
    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double minOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x24EDBE376E6CL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.min(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x4DBD790283CEL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Object object : paramSequence) {
      Sequence sequence = (Sequence)paramFunction1.invoke(object);
      CollectionsKt.addAll(paramCollection, sequence);
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull Sequence paramSequence, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = e ^ 0x636C66B3FDDBL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramAppendable, "buffer");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    paramAppendable.append(paramCharSequence2);
    byte b = 0;
    for (Object object : paramSequence) {
      try {
        if (++b > 1)
          paramAppendable.append(paramCharSequence1); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      try {
        if (paramInt >= 0) {
          try {
            if (b <= paramInt)
              continue; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          break;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
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
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    paramAppendable.append(paramCharSequence3);
    return paramAppendable;
  }
  
  @NotNull
  public static final Sequence distinctBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x243D0AFEC438L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    return new DistinctSequence(paramSequence, paramFunction1);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float minOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x70097AD1920L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.min(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return Float.valueOf(f);
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x6C4740027E62L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    for (Object object : paramSequence)
      i += ((Number)paramFunction1.invoke(object)).intValue(); 
    return i;
  }
  
  public static final double averageOfByte(@NotNull Sequence paramSequence) {
    long l = e ^ 0x11C7B952EC62L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    double d = 0.0D;
    byte b = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      byte b1 = ((Number)iterator.next()).byteValue();
      d += b1;
      byte b2 = ++b;
      if (b2 < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (b == 0) ? Double.NaN : (d / b);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence chunked(@NotNull Sequence paramSequence, int paramInt) {
    long l = e ^ 0x1FBFF671CD31L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.windowed(paramSequence, paramInt, paramInt, true);
  }
  
  @NotNull
  public static final Sequence mapNotNull(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x6C811E5A7335L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return SequencesKt.filterNotNull(new TransformingSequence(paramSequence, paramFunction1));
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence zipWithNext(@NotNull Sequence paramSequence) {
    long l = e ^ 0x188E7FE5A571L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.zipWithNext(paramSequence, SequencesKt___SequencesKt$zipWithNext$1.INSTANCE);
  }
  
  @SinceKotlin(version = "1.7")
  @NotNull
  public static final Comparable minOrThrow(@NotNull Sequence paramSequence) {
    long l = e ^ 0x2DA32074EE79L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Comparable> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  public static final Collection mapNotNullTo(@NotNull Sequence paramSequence, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt.e : J
    //   3: ldc2_w 136437873276937
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'transform'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: iconst_0
    //   27: istore #5
    //   29: aload_0
    //   30: astore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: aload #6
    //   37: invokeinterface iterator : ()Ljava/util/Iterator;
    //   42: astore #8
    //   44: aload #8
    //   46: invokeinterface hasNext : ()Z
    //   51: ifeq -> 109
    //   54: aload #8
    //   56: invokeinterface next : ()Ljava/lang/Object;
    //   61: astore #9
    //   63: aload #9
    //   65: astore #10
    //   67: iconst_0
    //   68: istore #11
    //   70: aload_2
    //   71: aload #10
    //   73: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   78: dup
    //   79: ifnull -> 103
    //   82: astore #12
    //   84: aload #12
    //   86: astore #13
    //   88: iconst_0
    //   89: istore #14
    //   91: aload_1
    //   92: aload #13
    //   94: invokeinterface add : (Ljava/lang/Object;)Z
    //   99: pop
    //   100: goto -> 105
    //   103: pop
    //   104: nop
    //   105: nop
    //   106: goto -> 44
    //   109: nop
    //   110: aload_1
    //   111: areturn
  }
  
  @NotNull
  public static final List toList(@NotNull Sequence paramSequence) {
    long l = e ^ 0xC7F8710C75L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return CollectionsKt.optimizeReadOnlyList(SequencesKt.toMutableList(paramSequence));
  }
  
  @NotNull
  public static final Collection filterNotNullTo(@NotNull Sequence paramSequence, @NotNull Collection paramCollection) {
    long l = e ^ 0x67E9189EA4B7L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    for (Object object : paramSequence) {
      if (object != null)
        paramCollection.add(object); 
    } 
    return paramCollection;
  }
  
  public static final boolean any(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x666724A0C945L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Object object : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue())
        return true; 
    } 
    return false;
  }
  
  @NotNull
  public static final Sequence take(@NotNull Sequence paramSequence, int paramInt) {
    long l = e ^ 0x422C8D94C423L;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramInt == 0) ? SequencesKt.emptySequence() : ((paramSequence instanceof DropTakeSequence) ? ((DropTakeSequence)paramSequence).take(paramInt) : new TakeSequence(paramSequence, paramInt));
  }
  
  @NotNull
  public static final Sequence distinct(@NotNull Sequence paramSequence) {
    long l = e ^ 0x6A4576484944L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.distinctBy(paramSequence, SequencesKt___SequencesKt$distinct$1.INSTANCE);
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Grouping groupingBy(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x3D6F1611E64DL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    return new SequencesKt___SequencesKt$groupingBy$1(paramSequence, paramFunction1);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence zipWithNext(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x5FC638E09D07L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    return SequencesKt.sequence(new SequencesKt___SequencesKt$zipWithNext$2(paramSequence, paramFunction2, null));
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x79F44530A916L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    Object object = null;
    for (Object object1 : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue())
        object = object1; 
    } 
    return object;
  }
  
  public static final float sumOfFloat(@NotNull Sequence paramSequence) {
    long l = e ^ 0xB1C66657ABL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    float f = 0.0F;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      float f1 = ((Number)iterator.next()).floatValue();
      f += f1;
    } 
    return f;
  }
  
  @NotNull
  public static final Collection mapIndexedNotNullTo(@NotNull Sequence paramSequence, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt.e : J
    //   3: ldc2_w 93171607230423
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'transform'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: iconst_0
    //   27: istore #5
    //   29: aload_0
    //   30: astore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: aload #6
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore #9
    //   47: aload #9
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 143
    //   57: aload #9
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: astore #10
    //   66: iload #8
    //   68: iinc #8, 1
    //   71: istore #11
    //   73: iload #11
    //   75: ifge -> 88
    //   78: invokestatic throwIndexOverflow : ()V
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   87: athrow
    //   88: iload #11
    //   90: aload #10
    //   92: astore #12
    //   94: istore #13
    //   96: iconst_0
    //   97: istore #14
    //   99: aload_2
    //   100: iload #13
    //   102: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   105: aload #12
    //   107: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   112: dup
    //   113: ifnull -> 137
    //   116: astore #15
    //   118: aload #15
    //   120: astore #16
    //   122: iconst_0
    //   123: istore #17
    //   125: aload_1
    //   126: aload #16
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: goto -> 139
    //   137: pop
    //   138: nop
    //   139: nop
    //   140: goto -> 47
    //   143: nop
    //   144: aload_1
    //   145: areturn
    // Exception table:
    //   from	to	target	type
    //   73	81	84	java/util/NoSuchElementException
  }
  
  public static final Object reduceIndexed(@NotNull Sequence paramSequence, @NotNull Function3 paramFunction3) {
    long l = e ^ 0x7C0DE85FE7B0L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new UnsupportedOperationException("Empty sequence can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = 1;
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction3.invoke(Integer.valueOf(b1), object, iterator.next())) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return object;
  }
  
  public static final int count(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x250BA7B15241L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue()) {
        byte b1 = ++b;
        if (b1 < 0)
          CollectionsKt.throwCountOverflow(); 
      } 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float minOrThrow(@NotNull Sequence paramSequence) {
    long l = e ^ 0x5372FE647EB7L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f;
    for (f = ((Number)iterator.next()).floatValue(); iterator.hasNext(); f = Math.min(f, f1))
      float f1 = ((Number)iterator.next()).floatValue(); 
    return f;
  }
  
  @NotNull
  public static final Sequence drop(@NotNull Sequence paramSequence, int paramInt) {
    long l = e ^ 0x6A75B4EC3188L;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramInt == 0) ? paramSequence : ((paramSequence instanceof DropTakeSequence) ? ((DropTakeSequence)paramSequence).drop(paramInt) : new DropSequence(paramSequence, paramInt));
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull Sequence paramSequence, @NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x474E78B30DBBL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    for (Object object : paramSequence)
      paramMap.put(paramFunction1.invoke(object), object); 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double maxOrThrow(@NotNull Sequence paramSequence) {
    long l = e ^ 0x26824804CEF6L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.max(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return d;
  }
  
  @NotNull
  public static final String joinToString(@NotNull Sequence paramSequence, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = e ^ 0x6063884F8D0AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)SequencesKt.joinTo(paramSequence, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)SequencesKt.joinTo(paramSequence, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object reduceOrNull(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x24916FAC1DEAL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction2.invoke(object, iterator.next()));
    return object;
  }
  
  public static final Object last(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x405343CA0071L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    for (Object object1 : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
        object = object1;
        bool2 = true;
      } 
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Sequence contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double minOrThrow(@NotNull Sequence paramSequence) {
    long l = e ^ 0x28E8A5D14BDDL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Number> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d;
    for (d = ((Number)iterator.next()).doubleValue(); iterator.hasNext(); d = Math.min(d, d1))
      double d1 = ((Number)iterator.next()).doubleValue(); 
    return d;
  }
  
  public static final Object elementAtOrElse(@NotNull Sequence paramSequence, int paramInt, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x6D9F9825A128L;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramFunction1, "defaultValue");
      if (paramInt < 0)
        return paramFunction1.invoke(Integer.valueOf(paramInt)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Iterator<Object> iterator = paramSequence.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      Object object = iterator.next();
      if (paramInt == b++)
        return object; 
    } 
    return paramFunction1.invoke(Integer.valueOf(paramInt));
  }
  
  @Nullable
  public static final Object singleOrNull(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x24BE848CB8CDL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    for (Object object1 : paramSequence) {
      if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
        try {
          if (bool2)
            return null; 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        object = object1;
        bool2 = true;
      } 
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  public static final int sumOfByte(@NotNull Sequence paramSequence) {
    long l = e ^ 0x44C420177665L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    int i = 0;
    Iterator<Number> iterator = paramSequence.iterator();
    while (iterator.hasNext()) {
      byte b = ((Number)iterator.next()).byteValue();
      i += b;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object maxByOrThrow(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x523705E31FF5L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = iterator.next();
    try {
      if (!iterator.hasNext())
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull Sequence paramSequence, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = e ^ 0x76FC00F278F0L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b = 0;
    for (Object object : paramSequence) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1), object));
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Comparable minOrNull(@NotNull Sequence paramSequence) {
    long l = e ^ 0x3DD7BE3C9B4FL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Iterator<Comparable> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = iterator.next();
    while (iterator.hasNext()) {
      Comparable<Comparable> comparable1 = iterator.next();
      if (comparable.compareTo(comparable1) > 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence windowed(@NotNull Sequence paramSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = e ^ 0x321EF4D0628FL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SlidingWindowKt.windowedSequence(paramSequence, paramInt1, paramInt2, paramBoolean, false);
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Sequence flatMapIterable(@NotNull Sequence paramSequence, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x1D65AD38917L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return new FlatteningSequence(paramSequence, paramFunction1, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object reduceIndexedOrNull(@NotNull Sequence paramSequence, @NotNull Function3 paramFunction3) {
    long l = e ^ 0x5E2987FC788EL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    Iterator<Object> iterator = paramSequence.iterator();
    try {
      if (!iterator.hasNext())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = 1;
    Object object;
    for (object = iterator.next(); iterator.hasNext(); object = paramFunction3.invoke(Integer.valueOf(b1), object, iterator.next())) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return object;
  }
  
  public static final Object elementAt(@NotNull Sequence paramSequence, int paramInt) {
    long l = e ^ 0x48D849D0AF3L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.elementAtOrElse(paramSequence, paramInt, new SequencesKt___SequencesKt$elementAt$1(paramInt));
  }
  
  @NotNull
  public static final Sequence plus(@NotNull Sequence paramSequence1, @NotNull Sequence paramSequence2) {
    long l = e ^ 0x7360678EC303L;
    Intrinsics.checkNotNullParameter(paramSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence2, "elements");
    Sequence[] arrayOfSequence = new Sequence[2];
    arrayOfSequence[0] = paramSequence1;
    arrayOfSequence[1] = paramSequence2;
    return SequencesKt.flatten(SequencesKt.sequenceOf((Object[])arrayOfSequence));
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */