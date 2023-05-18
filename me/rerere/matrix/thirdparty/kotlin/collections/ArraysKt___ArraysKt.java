package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
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
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
  private static final long d = o3.a(5475509881278901834L, -707768595588834211L, null).a(185447218125461L);
  
  @NotNull
  public static final Map groupByTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x202B7FBFFE9L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      Object object1 = paramFunction11.invoke(Boolean.valueOf(bool1));
      Map<Object, ArrayList> map = paramMap;
      boolean bool2 = false;
      Object object2 = map.get(object1);
      boolean bool3 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Boolean.valueOf(bool1)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Set intersect(@NotNull float[] paramArrayOffloat, @NotNull Iterable paramIterable) {
    long l = d ^ 0x1B40189FB0DBL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOffloat);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List sorted(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x7BF0798BF1BCL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Byte[] arrayOfByte1 = ArraysKt.toTypedArray(paramArrayOfbyte);
    Byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfByte2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfByte2);
    return ArraysKt.asList((Object[])arrayOfByte1);
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x90053A94F02L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Integer.valueOf(paramArrayOfint[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOfint, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfint);
    } 
  }
  
  @Nullable
  public static final Long getOrNull(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = d ^ 0x7EAC385EA012L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOflong));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x669AB7A75277L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfboolean, (Comparator)new Object(paramFunction1));
  }
  
  @Nullable
  public static final Double getOrNull(@NotNull double[] paramArrayOfdouble, int paramInt) {
    long l = d ^ 0x3361CA952B35L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfdouble));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  @NotNull
  public static final List zip(@NotNull short[] paramArrayOfshort, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x129702AF6A87L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfshort.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Short.valueOf(paramArrayOfshort[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x26831EB64E1DL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOffloat.length;
    while (b < j) {
      float f = paramArrayOffloat[b];
      i += ((Number)paramFunction1.invoke(Float.valueOf(f))).intValue();
      b++;
    } 
    return i;
  }
  
  public static final long sumOfLong(@NotNull Long[] paramArrayOfLong) {
    long l1 = d ^ 0x3382C8CC7ABAL;
    Intrinsics.checkNotNullParameter(paramArrayOfLong, "<this>");
    long l2 = 0L;
    byte b = 0;
    int i = paramArrayOfLong.length;
    while (b < i) {
      long l = paramArrayOfLong[b].longValue();
      l2 += l;
      b++;
    } 
    return l2;
  }
  
  @NotNull
  public static final List slice(@NotNull Object[] paramArrayOfObject, @NotNull Iterable paramIterable) {
    long l = d ^ 0x114D7D3ED6B6L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(paramArrayOfObject[j]);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull double[] paramArrayOfdouble, @NotNull Collection<Double> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5F1087F43767L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          paramCollection.add(Double.valueOf(d)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  public static final double average(@NotNull double[] paramArrayOfdouble) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 110095914753316
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 54
    //   33: aload_0
    //   34: iload #6
    //   36: daload
    //   37: dstore #8
    //   39: dload_3
    //   40: dload #8
    //   42: dadd
    //   43: dstore_3
    //   44: iinc #5, 1
    //   47: nop
    //   48: iinc #6, 1
    //   51: goto -> 26
    //   54: iload #5
    //   56: ifne -> 69
    //   59: ldc2_w NaN
    //   62: goto -> 74
    //   65: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   68: athrow
    //   69: dload_3
    //   70: iload #5
    //   72: i2d
    //   73: ddiv
    //   74: dreturn
    // Exception table:
    //   from	to	target	type
    //   54	65	65	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List take(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = d ^ 0x79D43426F115L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfObject.length)
        return ArraysKt.toList(paramArrayOfObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(paramArrayOfObject[0]); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Object> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfObject.length;
    while (b2 < i) {
      Object object = paramArrayOfObject[b2];
      try {
        arrayList.add(object);
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull double[] paramArrayOfdouble, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x7B80454B31FL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      Object object1 = paramFunction11.invoke(Double.valueOf(d));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Double.valueOf(d)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List reversed(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x1B8BBBBC534EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfbyte);
    CollectionsKt.reverse(list);
    return list;
  }
  
  public static final long single(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x4D920E6A8F13L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      switch (paramArrayOflong.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @NotNull
  public static final List toList(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0xAA16D739FBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      switch (paramArrayOffloat.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOffloat);
  }
  
  @NotNull
  public static final List filterNot(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x677FC7C6B9AFL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    ArrayList<Float> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfFloat.length;
    while (b < i) {
      float f = arrayOfFloat[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          arrayList.add(Float.valueOf(f)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static final Object foldRight(@NotNull float[] paramArrayOffloat, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x211F14593A0L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Float.valueOf(paramArrayOffloat[i--]), object));
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull Comparable[] paramArrayOfComparable, int paramInt1, int paramInt2) {
    long l = d ^ 0x417B70C5C2C8L;
    Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    ArraysKt.sortWith((Object[])paramArrayOfComparable, ComparisonsKt.reverseOrder(), paramInt1, paramInt2);
  }
  
  @NotNull
  public static final List dropLast(@NotNull float[] paramArrayOffloat, int paramInt) {
    long l = d ^ 0x1D93C41E115AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOffloat, RangesKt.coerceAtLeast(paramArrayOffloat.length - paramInt, 0));
  }
  
  public static final int indexOfFirst(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x94D27801C46L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Byte.valueOf(paramArrayOfbyte[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @Nullable
  public static final Character singleOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x42D7F4DF4A70L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Character character = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          character = Character.valueOf(c);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return character;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x538105E37927L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(paramArrayOfboolean);
  }
  
  @SinceKotlin(version = "1.3")
  public static final int random(@NotNull int[] paramArrayOfint, @NotNull Random paramRandom) {
    long l = d ^ 0x646BED9BBC81L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfint[paramRandom.nextInt(paramArrayOfint.length)];
  }
  
  @NotNull
  public static final Set union(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = d ^ 0x751692360DFEL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfint);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final Set subtract(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = d ^ 0xC5A01488BE4L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfshort);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List zip(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x732A0172CCACL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfshort.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Short.valueOf(paramArrayOfshort[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterNotNullTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection) {
    long l = d ^ 0x12E3C50C3F1L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (object != null)
          paramCollection.add(object); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningFold(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6DEA002C16CDL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.listOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList2 = new ArrayList(paramArrayOfObject.length + 1);
    ArrayList<Object> arrayList3 = arrayList2;
    int i = 0;
    arrayList3.add(paramObject);
    ArrayList<Object> arrayList1 = arrayList2;
    Object object = paramObject;
    byte b = 0;
    i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      object = paramFunction2.invoke(object, object1);
      arrayList1.add(object);
      b++;
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5E48DD024AC2L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfbyte, (Comparator)new Object(paramFunction1));
  }
  
  public static final void forEachIndexed(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6D63962A0221L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfint.length;
    while (b2 < i) {
      int j = paramArrayOfint[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Integer.valueOf(j));
      b2++;
    } 
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x509547AC31BDL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfboolean, new HashSet(MapsKt.mapCapacity(paramArrayOfboolean.length)));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character reduceOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xAB9E29ED6A6L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction2.invoke(Character.valueOf(c), Character.valueOf(paramArrayOfchar[i]))).charValue();
    } 
    return Character.valueOf(c);
  }
  
  public static final Object foldRight(@NotNull double[] paramArrayOfdouble, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x590294E65436L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Double.valueOf(paramArrayOfdouble[i--]), object));
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Boolean reduceOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x66880200A4D5L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      bool1 = ((Boolean)paramFunction2.invoke(Boolean.valueOf(bool1), Boolean.valueOf(paramArrayOfboolean[i]))).booleanValue();
    } 
    return Boolean.valueOf(bool1);
  }
  
  @SinceKotlin(version = "1.7")
  public static final char maxByOrThrow(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2C3852BCC61BL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i == 0)
        return c; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Character.valueOf(c));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      char c1 = paramArrayOfchar[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) < 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return c;
  }
  
  public static final boolean none(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x6AB24D8F9994L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfshort.length == 0);
  }
  
  @NotNull
  public static final List toMutableList(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x3BFFCC9826ACL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    ArrayList<Short> arrayList = new ArrayList(paramArrayOfshort.length);
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      arrayList.add(Short.valueOf(s));
      b++;
    } 
    return arrayList;
  }
  
  public static final boolean any(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x75EF25563CA0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOffloat.length == 0) ? 1 : 0);
  }
  
  @SinceKotlin(version = "1.7")
  public static final short maxOrThrow(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x6154C2AE891L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (s < s1)
        s = s1; 
    } 
    return s;
  }
  
  @NotNull
  public static final int[] toIntArray(@NotNull Integer[] paramArrayOfInteger) {
    long l = d ^ 0x4EBB41D0C53AL;
    Intrinsics.checkNotNullParameter(paramArrayOfInteger, "<this>");
    byte b = 0;
    int i = paramArrayOfInteger.length;
    int[] arrayOfInt = new int[i];
    while (b < i) {
      byte b1 = b;
      arrayOfInt[b1] = paramArrayOfInteger[b1].intValue();
      b++;
    } 
    return arrayOfInt;
  }
  
  @Nullable
  public static final Integer singleOrNull(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3D98C5A800A5L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Integer integer = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          integer = Integer.valueOf(j);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return integer;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningReduceIndexed(@NotNull Object[] paramArrayOfObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x65DD0CFBD0F9L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = null;
    object = paramArrayOfObject[0];
    ArrayList<Object> arrayList2 = new ArrayList(paramArrayOfObject.length);
    ArrayList<Object> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(object);
    ArrayList<Object> arrayList1 = arrayList2;
    byte b = 1;
    int i = paramArrayOfObject.length;
    while (b < i) {
      object = paramFunction3.invoke(Integer.valueOf(b), object, paramArrayOfObject[b]);
      arrayList1.add(object);
      b++;
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2887EAF13AB6L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOffloat.length), 16);
    float[] arrayOfFloat = paramArrayOffloat;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfFloat.length;
    while (b < j) {
      float f = arrayOfFloat[b];
      linkedHashMap.put(paramFunction1.invoke(Float.valueOf(f)), Float.valueOf(f));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final boolean none(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x9F7693B92AEL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final List filterNotNull(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x20BBF6426EC0L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return (List)ArraysKt.filterNotNullTo(paramArrayOfObject, new ArrayList());
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5D93428B8916L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfdouble.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfDouble.length;
    while (b2 < i) {
      double d = arrayOfDouble[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Double.valueOf(d)));
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final byte[] sliceArray(@NotNull byte[] paramArrayOfbyte, @NotNull Collection paramCollection) {
    long l = d ^ 0xD1ACBD28643L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    byte[] arrayOfByte = new byte[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfByte[b++] = paramArrayOfbyte[i];
    } 
    return arrayOfByte;
  }
  
  @Nullable
  public static final Boolean lastOrNull(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x301AE12F1CEAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfboolean.length == 0)) ? null : Boolean.valueOf(paramArrayOfboolean[paramArrayOfboolean.length - 1]);
  }
  
  public static final void forEach(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x62109CFF4DBEL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      paramFunction1.invoke(Short.valueOf(s));
      b++;
    } 
  }
  
  @NotNull
  public static final Map associateTo(@NotNull float[] paramArrayOffloat, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x54A7318F6A6AL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Float.valueOf(f));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  public static final long reduceRight(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    long l1 = d ^ 0x792B37EE3311L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2;
    for (l2 = paramArrayOflong[i--]; i >= 0; l2 = ((Number)paramFunction2.invoke(Long.valueOf(paramArrayOflong[i--]), Long.valueOf(l2))).longValue());
    return l2;
  }
  
  @NotNull
  public static final List filterNot(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x37F86BC43BB6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    ArrayList<Byte> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfByte.length;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          arrayList.add(Byte.valueOf(b1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull int[] paramArrayOfint, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x1174584EAC57L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      Object object1 = paramFunction11.invoke(Integer.valueOf(j));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Integer.valueOf(j)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List filter(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x777A9D9360B2L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    ArrayList<Boolean> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfBoolean.length;
    while (b < i) {
      boolean bool = arrayOfBoolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool))).booleanValue())
          arrayList.add(Boolean.valueOf(bool)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x39A379440C3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(paramArrayOfchar);
  }
  
  @NotNull
  public static final List dropWhile(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1CA38247A2C1L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Character> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (bool2) {
          arrayList.add(Character.valueOf(c));
        } else if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          arrayList.add(Character.valueOf(c));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Long singleOrNull(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x349CD552ECD3L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Long long_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          long_ = Long.valueOf(l1);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return long_;
  }
  
  @SinceKotlin(version = "1.3")
  public static final double random(@NotNull double[] paramArrayOfdouble, @NotNull Random paramRandom) {
    long l = d ^ 0x44D0527E1170L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfdouble[paramRandom.nextInt(paramArrayOfdouble.length)];
  }
  
  public static final Object reduce(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5E5117752604L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      object = paramFunction2.invoke(object, paramArrayOfObject[i]);
    } 
    return object;
  }
  
  @NotNull
  public static final Set union(@NotNull char[] paramArrayOfchar, @NotNull Iterable paramIterable) {
    long l = d ^ 0x3F1A1AAC3843L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfchar);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List dropLast(@NotNull double[] paramArrayOfdouble, int paramInt) {
    long l = d ^ 0x58CDBAC2CAEDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfdouble, RangesKt.coerceAtLeast(paramArrayOfdouble.length - paramInt, 0));
  }
  
  public static final void sortDescending(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x62F9A13CC01L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      if (paramArrayOfint.length > 1) {
        ArraysKt.sort(paramArrayOfint);
        ArraysKt.reverse(paramArrayOfint);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final List takeWhile(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x28477F3202AEL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Byte> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Byte.valueOf(b1));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeLast(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0xCE87257956FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfint.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfint); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Integer.valueOf(paramArrayOfint[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Integer> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Integer.valueOf(paramArrayOfint[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List slice(@NotNull boolean[] paramArrayOfboolean, @NotNull Iterable paramIterable) {
    long l = d ^ 0x191FBEB8454L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Boolean> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Boolean.valueOf(paramArrayOfboolean[j]));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x4622C36D6CD5L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOffloat));
  }
  
  @NotNull
  public static final Object[] reversedArray(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x63988F6F68D8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return paramArrayOfObject; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object[] arrayOfObject = ArraysKt.arrayOfNulls(paramArrayOfObject, paramArrayOfObject.length);
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfObject[i - j] = paramArrayOfObject[j];
    } 
    return arrayOfObject;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x6BB9A61A11F7L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfint.length), 16);
    int[] arrayOfInt = paramArrayOfint;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfInt.length;
    while (b < j) {
      int k = arrayOfInt[b];
      linkedHashMap.put(paramFunction11.invoke(Integer.valueOf(k)), paramFunction12.invoke(Integer.valueOf(k)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull char[] paramArrayOfchar, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4216AE8D79CBL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      paramCollection.add(paramFunction1.invoke(Character.valueOf(c)));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final long[] reversedArray(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x2856B2D9CCE7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return paramArrayOflong; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long[] arrayOfLong = new long[paramArrayOflong.length];
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfLong[i - j] = paramArrayOflong[j];
    } 
    return arrayOfLong;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7502D0DB76A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      d += ((Number)paramFunction1.invoke(Short.valueOf(s))).doubleValue();
      b++;
    } 
    return d;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long minByOrThrow(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l1 = d ^ 0x6BEB1197247AL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i == 0)
        return l2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Long.valueOf(l2));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      long l = paramArrayOflong[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Long.valueOf(l));
      if (comparable.compareTo(comparable1) > 0) {
        l2 = l;
        comparable = comparable1;
      } 
    } 
    return l2;
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x4B5111BDDABDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2(paramArrayOfbyte);
  }
  
  public static final int getLastIndex(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x4CFC0BB52A2BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return paramArrayOfdouble.length - 1;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Long reduceRightOrNull(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    long l1 = d ^ 0x5C1A524947F1L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2;
    for (l2 = paramArrayOflong[i--]; i >= 0; l2 = ((Number)paramFunction2.invoke(Long.valueOf(paramArrayOflong[i--]), Long.valueOf(l2))).longValue());
    return Long.valueOf(l2);
  }
  
  public static final Object foldIndexed(@NotNull boolean[] paramArrayOfboolean, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x57C4079F1967L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfboolean.length;
    while (b2 < i) {
      boolean bool1 = paramArrayOfboolean[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Boolean.valueOf(bool1));
      b2++;
    } 
    return object;
  }
  
  public static final float sumOfFloat(@NotNull Float[] paramArrayOfFloat) {
    long l = d ^ 0x5807EB2D22CDL;
    Intrinsics.checkNotNullParameter(paramArrayOfFloat, "<this>");
    float f = 0.0F;
    byte b = 0;
    int i = paramArrayOfFloat.length;
    while (b < i) {
      float f1 = paramArrayOfFloat[b].floatValue();
      f += f1;
      b++;
    } 
    return f;
  }
  
  public static final void reverse(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x4BE9777BDA7CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    int i = paramArrayOfboolean.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfboolean);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      boolean bool = paramArrayOfboolean[k];
      paramArrayOfboolean[k] = paramArrayOfboolean[j];
      paramArrayOfboolean[j] = bool;
      j--;
    } 
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull float[] paramArrayOffloat, @NotNull Collection<Float> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 138146495794948
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: faload
    //   58: fstore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: fload #11
    //   67: fstore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: fload #12
    //   82: invokestatic valueOf : (F)Ljava/lang/Float;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: fload #12
    //   102: invokestatic valueOf : (F)Ljava/lang/Float;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x543B1610E6B9L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d1 = paramArrayOfdouble[b];
      d += ((Number)paramFunction1.invoke(Double.valueOf(d1))).doubleValue();
      b++;
    } 
    return d;
  }
  
  @NotNull
  public static final String joinToString(@NotNull float[] paramArrayOffloat, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x21F7BCB3712FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOffloat, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOffloat, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  public static final Object fold(@NotNull short[] paramArrayOfshort, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x14F9C94435B5L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      object = paramFunction2.invoke(object, Short.valueOf(s));
      b++;
    } 
    return object;
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull int[] paramArrayOfint, @NotNull Collection<Integer> paramCollection) {
    long l = d ^ 0x52EAEE5064C6L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      paramCollection.add(Integer.valueOf(j));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull short[] paramArrayOfshort, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 96181112252303
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: saload
    //   81: istore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: iload #13
    //   143: invokestatic valueOf : (S)Ljava/lang/Short;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: iload #13
    //   170: invokestatic valueOf : (I)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final float[] sortedArray(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x4DCE7320344BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return paramArrayOffloat; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOffloat, paramArrayOffloat.length), "copyOf(this, size)");
    float[] arrayOfFloat1 = Arrays.copyOf(paramArrayOffloat, paramArrayOffloat.length);
    float[] arrayOfFloat2 = arrayOfFloat1;
    boolean bool = false;
    ArraysKt.sort(arrayOfFloat2);
    return arrayOfFloat1;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x1CCB6FF77411L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    ArrayList<Boolean> arrayList = new ArrayList(paramArrayOfboolean.length);
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool = paramArrayOfboolean[b];
      arrayList.add(Boolean.valueOf(bool));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List map(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x646C4CA703F6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOflong.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      arrayList.add(paramFunction1.invoke(Long.valueOf(l1)));
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x249BD30131EBL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfObject.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        Object object = paramArrayOfObject[j];
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return object; 
      } while (0 <= i); 
    return null;
  }
  
  public static final boolean contains(@NotNull boolean[] paramArrayOfboolean, boolean paramBoolean) {
    long l = d ^ 0x69C608E259D5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOfboolean, paramBoolean) >= 0);
  }
  
  @NotNull
  public static final List distinct(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x35B2453E16F2L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfchar));
  }
  
  @NotNull
  public static final Map associateBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x4478DC206574L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfchar.length), 16);
    char[] arrayOfChar = paramArrayOfchar;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfChar.length;
    while (b < j) {
      char c = arrayOfChar[b];
      linkedHashMap.put(paramFunction11.invoke(Character.valueOf(c)), paramFunction12.invoke(Character.valueOf(c)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Set union(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = d ^ 0x108C0D69E9A9L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfbyte);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final Comparable[] sortedArray(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x5FF1D0ABCCDEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfComparable.length == 0))
        return paramArrayOfComparable; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfComparable, paramArrayOfComparable.length), "copyOf(this, size)");
    Comparable[] arrayOfComparable1 = Arrays.copyOf(paramArrayOfComparable, paramArrayOfComparable.length);
    Comparable[] arrayOfComparable2 = arrayOfComparable1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfComparable2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfComparable2);
    return arrayOfComparable1;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x5283225DDCA1L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(paramArrayOfbyte);
  }
  
  @NotNull
  public static final Map associateTo(@NotNull byte[] paramArrayOfbyte, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1ED58B2EED71L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Byte.valueOf(b1));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character minOrNull(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x2B401A272E9CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (Intrinsics.compare(c, c1) > 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long maxByOrNull(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l1 = d ^ 0x2401D6F1179BL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i == 0)
        return Long.valueOf(l2); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Long.valueOf(l2));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      long l = paramArrayOflong[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Long.valueOf(l));
      if (comparable.compareTo(comparable1) < 0) {
        l2 = l;
        comparable = comparable1;
      } 
    } 
    return Long.valueOf(l2);
  }
  
  @NotNull
  public static final List distinct(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x242B7065B094L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfboolean));
  }
  
  @NotNull
  public static final Map groupBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x26D257BC750CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfBoolean.length;
    while (b < i) {
      boolean bool = arrayOfBoolean[b];
      Object object1 = paramFunction1.invoke(Boolean.valueOf(bool));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Boolean> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Boolean.valueOf(bool));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final int count(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x423F1C37F02FL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfshort.length;
    while (b2 < i) {
      short s = paramArrayOfshort[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final int[] sortedArrayDescending(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x6048E2823EA5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return paramArrayOfint; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length);
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfInt2);
    return arrayOfInt1;
  }
  
  @NotNull
  public static final List zip(@NotNull double[] paramArrayOfdouble, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3E2E23D28899L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfdouble.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Double.valueOf(paramArrayOfdouble[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List flatMap(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x235D5E007C6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Long.valueOf(l1));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x14270FBF3A25L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfshort.length;
    while (b < j) {
      short s = paramArrayOfshort[b];
      i += ((Number)paramFunction1.invoke(Short.valueOf(s))).intValue();
      b++;
    } 
    return i;
  }
  
  public static final boolean all(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5821988F877BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  public static final long sum(@NotNull long[] paramArrayOflong) {
    long l1 = d ^ 0x627401820FECL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    long l2 = 0L;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l = paramArrayOflong[b];
      l2 += l;
      b++;
    } 
    return l2;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull long[] paramArrayOflong, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x772F6F045C4CL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      paramMap.put(paramFunction11.invoke(Long.valueOf(l1)), paramFunction12.invoke(Long.valueOf(l1)));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Double reduceOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5BCCF2C839D6L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      d = ((Number)paramFunction2.invoke(Double.valueOf(d), Double.valueOf(paramArrayOfdouble[i]))).doubleValue();
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final short[] sortedArray(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x7E9F7D8D466BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return paramArrayOfshort; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length);
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    ArraysKt.sort(arrayOfShort2);
    return arrayOfShort1;
  }
  
  @NotNull
  public static final List drop(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x59445E0E5C75L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfint, RangesKt.coerceAtLeast(paramArrayOfint.length - paramInt, 0));
  }
  
  @NotNull
  public static final String joinToString(@NotNull long[] paramArrayOflong, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x7E182D9C92C1L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOflong, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOflong, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull char[] paramArrayOfchar, @NotNull Map<Object, Character> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x72A4B1F5984CL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      paramMap.put(paramFunction1.invoke(Character.valueOf(c)), Character.valueOf(c));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object maxWithOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<Object> paramComparator) {
    long l = d ^ 0x7E96E50F5A86L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Object object1 = paramArrayOfObject[i];
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float minByOrThrow(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1E53503BEAFL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i == 0)
        return f; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Float.valueOf(f));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      float f1 = paramArrayOffloat[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Float.valueOf(f1));
      if (comparable.compareTo(comparable1) > 0) {
        f = f1;
        comparable = comparable1;
      } 
    } 
    return f;
  }
  
  public static final boolean contains(@NotNull long[] paramArrayOflong, long paramLong) {
    long l = d ^ 0x7F6814D110F5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOflong, paramLong) >= 0);
  }
  
  public static final int count(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x616F8FD67599L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfint.length;
    while (b2 < i) {
      int j = paramArrayOfint[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final List toList(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x6346C0002AC7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      switch (paramArrayOfObject.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfObject);
  }
  
  @Nullable
  public static final Character firstOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x651B3DB87DD4L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return Character.valueOf(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  public static final boolean none(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x572B92D0037L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfchar.length == 0);
  }
  
  @NotNull
  public static final double[] reversedArray(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x34FBEAD508D5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return paramArrayOfdouble; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double[] arrayOfDouble = new double[paramArrayOfdouble.length];
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfDouble[i - j] = paramArrayOfdouble[j];
    } 
    return arrayOfDouble;
  }
  
  @NotNull
  public static final byte[] sortedArray(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x7992B127E90L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return paramArrayOfbyte; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    ArraysKt.sort(arrayOfByte2);
    return arrayOfByte1;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6791A01CF7E0L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfboolean.length;
    while (b2 < i) {
      boolean bool1 = paramArrayOfboolean[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Boolean.valueOf(bool1)));
      b2++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Pair partition(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xDAD6A061449L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Short> arrayList1 = new ArrayList();
    ArrayList<Short> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue()) {
          arrayList1.add(Short.valueOf(s));
        } else {
          arrayList2.add(Short.valueOf(s));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @SinceKotlin(version = "1.7")
  public static final byte maxWithOrThrow(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<Byte> paramComparator) {
    long l = d ^ 0x600FFC9188D7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (paramComparator.compare(Byte.valueOf(b), Byte.valueOf(b1)) < 0)
        b = b1; 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Byte reduceOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x208FF97B062BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b = ((Number)paramFunction2.invoke(Byte.valueOf(b), Byte.valueOf(paramArrayOfbyte[i]))).byteValue();
    } 
    return Byte.valueOf(b);
  }
  
  @NotNull
  public static final Set intersect(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = d ^ 0x4140D13725A5L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfint);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  public static final boolean all(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2220A57D4CBBL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull byte[] paramArrayOfbyte, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3385C071B603L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfbyte.length;
    while (b2 < i) {
      byte b = paramArrayOfbyte[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Byte.valueOf(b)));
      b2++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List dropLast(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = d ^ 0x7CFA856DEAE9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOflong, RangesKt.coerceAtLeast(paramArrayOflong.length - paramInt, 0));
  }
  
  public static final boolean first(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x458ABF2F1F97L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return bool1; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List dropWhile(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3E08B4ADB681L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Byte> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (bool2) {
          arrayList.add(Byte.valueOf(b1));
        } else if (!((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue()) {
          arrayList.add(Byte.valueOf(b1));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static final char reduce(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2567966722D9L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction2.invoke(Character.valueOf(c), Character.valueOf(paramArrayOfchar[i]))).charValue();
    } 
    return c;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull Object[] paramArrayOfObject, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x7BABB2DE0B9CL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      paramMap.put(paramFunction11.invoke(object), paramFunction12.invoke(object));
      b++;
    } 
    return paramMap;
  }
  
  public static final int count(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4766AF33F5A7L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfchar.length;
    while (b2 < i) {
      char c = paramArrayOfchar[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final byte[] sliceArray(@NotNull byte[] paramArrayOfbyte, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x154F64C5E6D9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new byte[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfByte, i, j);
  }
  
  @Nullable
  public static final Float firstOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1B20BB5AB583L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return Float.valueOf(f); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @NotNull
  public static final List takeLast(@NotNull boolean[] paramArrayOfboolean, int paramInt) {
    long l = d ^ 0x606D99F1D8D6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfboolean.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfboolean); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Boolean.valueOf(paramArrayOfboolean[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Boolean> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Boolean.valueOf(paramArrayOfboolean[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull double[] paramArrayOfdouble, @NotNull Collection<Double> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 13726825177790
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: daload
    //   58: dstore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: dload #11
    //   67: dstore #13
    //   69: istore #15
    //   71: iconst_0
    //   72: istore #16
    //   74: aload_2
    //   75: iload #15
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: dload #13
    //   82: invokestatic valueOf : (D)Ljava/lang/Double;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: dload #13
    //   102: invokestatic valueOf : (D)Ljava/lang/Double;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte reduceRightIndexedOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x437E3A999A2AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[i--];
    while (i >= 0) {
      b = ((Number)paramFunction3.invoke(Integer.valueOf(i), Byte.valueOf(paramArrayOfbyte[i]), Byte.valueOf(b))).byteValue();
      i--;
    } 
    return Byte.valueOf(b);
  }
  
  @Nullable
  public static final Short singleOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5630C11F49BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Short short_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          short_ = Short.valueOf(s);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return short_;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x7DFEDBABD6B9L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    ArraysKt.shuffle(paramArrayOffloat, (Random)Random.Default);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer maxOrNull(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x4F3AB45300EAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (i < k)
        i = k; 
    } 
    return Integer.valueOf(i);
  }
  
  @NotNull
  public static final List zip(@NotNull float[] paramArrayOffloat, @NotNull Iterable paramIterable) {
    long l = d ^ 0x77F13896BCAAL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    float[] arrayOfFloat = paramArrayOffloat;
    boolean bool = false;
    int i = arrayOfFloat.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        float f = arrayOfFloat[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Float.valueOf(f), object1));
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List zip(@NotNull int[] paramArrayOfint, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x6FA0DAE5DBDCL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    int[] arrayOfInt = paramArrayOfint;
    boolean bool = false;
    int i = Math.min(arrayOfInt.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      int j = arrayOfInt[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Integer.valueOf(j), object));
    } 
    return arrayList;
  }
  
  public static final int indexOfLast(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4342FCF8CA15L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfboolean.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(paramArrayOfboolean[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @Nullable
  public static final Long singleOrNull(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x70A251270534L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOflong.length == 1) ? Long.valueOf(paramArrayOflong[0]) : null;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = d ^ 0x44BD19E3DC34L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    ArraysKt.sort(paramArrayOfshort, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfshort, paramInt1, paramInt2);
  }
  
  public static final int getLastIndex(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x733F22578D69L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return paramArrayOfint.length - 1;
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x41918229DDB7L;
    Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    return ArraysKt.sortedWith((Object[])paramArrayOfComparable, ComparisonsKt.reverseOrder());
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull short[] paramArrayOfshort, @NotNull Random paramRandom) {
    long l = d ^ 0x49ACFD003999L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfshort); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      short s = paramArrayOfshort[i];
      paramArrayOfshort[i] = paramArrayOfshort[j];
      paramArrayOfshort[j] = s;
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long maxOrNull(@NotNull long[] paramArrayOflong) {
    long l1 = d ^ 0x6742A6F4D5B7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (l2 < l)
        l2 = l; 
    } 
    return Long.valueOf(l2);
  }
  
  @NotNull
  public static final List toList(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x310003337F41L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      switch (paramArrayOfchar.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfchar);
  }
  
  public static final boolean any(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x46D16021F01BL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @NotNull
  public static final List sorted(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x99B480C0CF0L;
    Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    return ArraysKt.asList((Object[])ArraysKt.sortedArray(paramArrayOfComparable));
  }
  
  @Nullable
  public static final Byte lastOrNull(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x9B42290BAE8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfbyte.length == 0)) ? null : Byte.valueOf(paramArrayOfbyte[paramArrayOfbyte.length - 1]);
  }
  
  public static final double reduceRight(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x7F2BE3D546D6L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d;
    for (d = paramArrayOfdouble[i--]; i >= 0; d = ((Number)paramFunction2.invoke(Double.valueOf(paramArrayOfdouble[i--]), Double.valueOf(d))).doubleValue());
    return d;
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0xDA165EE0E74L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length);
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    ArraysKt.sort(arrayOfInt2);
    return ArraysKt.reversed(arrayOfInt1);
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = d ^ 0x6C4B533531EBL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    ArraysKt.sort(paramArrayOfbyte, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.7")
  public static final double minOrThrow(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x35930065D2B2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      d = Math.min(d, d1);
    } 
    return d;
  }
  
  public static final int lastIndexOf(@NotNull long[] paramArrayOflong, long paramLong) {
    long l = d ^ 0x1AA441560F01L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    int i = paramArrayOflong.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (paramLong == paramArrayOflong[j])
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final List dropWhile(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5FD01263C199L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Integer> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (bool2) {
          arrayList.add(Integer.valueOf(j));
        } else if (!((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue()) {
          arrayList.add(Integer.valueOf(j));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static final boolean first(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x4A2C68C34D3DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfboolean[0];
  }
  
  @NotNull
  public static final Pair partition(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2F939C5E399L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Byte> arrayList1 = new ArrayList();
    ArrayList<Byte> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue()) {
          arrayList1.add(Byte.valueOf(b1));
        } else {
          arrayList2.add(Byte.valueOf(b1));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  public static final boolean none(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3820E9669A83L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final String joinToString(@NotNull char[] paramArrayOfchar, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0xAF8BC6F9579L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfchar, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfchar, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object minByOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x338445C7DA00L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i == 0)
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      Object object1 = paramArrayOfObject[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) > 0) {
        object = object1;
        comparable = comparable1;
      } 
    } 
    return object;
  }
  
  public static final byte single(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1D0064CE4B23L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Byte byte_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          byte_ = Byte.valueOf(b1);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(byte_, "null cannot be cast to non-null type kotlin.Byte");
    return byte_.byteValue();
  }
  
  @SinceKotlin(version = "1.7")
  public static final float maxByOrThrow(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7AE9D5BEA941L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i == 0)
        return f; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Float.valueOf(f));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      float f1 = paramArrayOffloat[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Float.valueOf(f1));
      if (comparable.compareTo(comparable1) < 0) {
        f = f1;
        comparable = comparable1;
      } 
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Double randomOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Random paramRandom) {
    long l = d ^ 0x69CB8B8A950L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Double.valueOf(paramArrayOfdouble[paramRandom.nextInt(paramArrayOfdouble.length)]);
  }
  
  public static final boolean reduceIndexed(@NotNull boolean[] paramArrayOfboolean, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x405BD63A313DL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      bool1 = ((Boolean)paramFunction3.invoke(Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(paramArrayOfboolean[i]))).booleanValue();
    } 
    return bool1;
  }
  
  @NotNull
  public static final Collection mapNotNullTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 54019639846222
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc_w 'transform'
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
    //   41: arraylength
    //   42: istore #9
    //   44: iload #8
    //   46: iload #9
    //   48: if_icmpge -> 107
    //   51: aload #6
    //   53: iload #8
    //   55: aaload
    //   56: astore #10
    //   58: aload #10
    //   60: astore #11
    //   62: iconst_0
    //   63: istore #12
    //   65: aload_2
    //   66: aload #11
    //   68: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   73: dup
    //   74: ifnull -> 98
    //   77: astore #13
    //   79: aload #13
    //   81: astore #14
    //   83: iconst_0
    //   84: istore #15
    //   86: aload_1
    //   87: aload #14
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: goto -> 100
    //   98: pop
    //   99: nop
    //   100: nop
    //   101: iinc #8, 1
    //   104: goto -> 44
    //   107: nop
    //   108: aload_1
    //   109: areturn
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull Object[] paramArrayOfObject, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4C587175120FL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      paramMap.put(paramFunction1.invoke(object), object);
      b++;
    } 
    return paramMap;
  }
  
  public static final Object foldRightIndexed(@NotNull short[] paramArrayOfshort, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x181780B04D4CL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Short.valueOf(paramArrayOfshort[i]), object);
      i--;
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  @NotNull
  public static final Comparable minOrThrow(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x3FB4BBE2D7BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfComparable.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = paramArrayOfComparable[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfComparable))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Comparable<Comparable> comparable1 = paramArrayOfComparable[i];
      if (comparable.compareTo(comparable1) > 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3F2B5879D802L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Float.valueOf(paramArrayOffloat[i]))).booleanValue())
              return ArraysKt.take(paramArrayOffloat, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @SinceKotlin(version = "1.7")
  public static final char minOrThrow(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0xE80B6306179L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (Intrinsics.compare(c, c1) > 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x74651CEB9157L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfchar, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 101762654335648
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 134
    //   66: aload #8
    //   68: iload #11
    //   70: aaload
    //   71: astore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: aload #13
    //   80: astore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: aload #14
    //   95: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   100: checkcast java/lang/Boolean
    //   103: invokevirtual booleanValue : ()Z
    //   106: ifeq -> 126
    //   109: aload #6
    //   111: aload #14
    //   113: invokeinterface add : (Ljava/lang/Object;)Z
    //   118: pop
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: nop
    //   127: nop
    //   128: iinc #11, 1
    //   131: goto -> 59
    //   134: nop
    //   135: aload #6
    //   137: checkcast java/util/List
    //   140: areturn
    // Exception table:
    //   from	to	target	type
    //   87	119	122	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map groupBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x30017E25934L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfChar.length;
    while (b < i) {
      char c = arrayOfChar[b];
      Object object1 = paramFunction11.invoke(Character.valueOf(c));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Character.valueOf(c)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Map associate(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x63426C4CA572L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOffloat.length), 16);
    float[] arrayOfFloat = paramArrayOffloat;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfFloat.length;
    while (b < j) {
      float f = arrayOfFloat[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Float.valueOf(f));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final double last(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x24AF325AB950L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfdouble[ArraysKt.getLastIndex(paramArrayOfdouble)];
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 56505142975052
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: saload
    //   71: istore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: iload #13
    //   80: istore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: iload #14
    //   95: invokestatic valueOf : (S)Ljava/lang/Short;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: iload #14
    //   116: invokestatic valueOf : (S)Ljava/lang/Short;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List drop(@NotNull float[] paramArrayOffloat, int paramInt) {
    long l = d ^ 0x7746F4C4AA18L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOffloat, RangesKt.coerceAtLeast(paramArrayOffloat.length - paramInt, 0));
  }
  
  public static final void forEach(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x16C9EF2470BDL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      paramFunction1.invoke(Byte.valueOf(b1));
      b++;
    } 
  }
  
  @NotNull
  public static final List sortedBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4F6CE34CB5D7L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfObject, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List mapNotNull(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 9307477411577
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'transform'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iconst_0
    //   22: istore #4
    //   24: aload_0
    //   25: astore #5
    //   27: new java/util/ArrayList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: checkcast java/util/Collection
    //   37: astore #6
    //   39: iconst_0
    //   40: istore #7
    //   42: aload #5
    //   44: astore #8
    //   46: iconst_0
    //   47: istore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: aload #8
    //   54: arraylength
    //   55: istore #11
    //   57: iload #10
    //   59: iload #11
    //   61: if_icmpge -> 121
    //   64: aload #8
    //   66: iload #10
    //   68: aaload
    //   69: astore #12
    //   71: aload #12
    //   73: astore #13
    //   75: iconst_0
    //   76: istore #14
    //   78: aload_1
    //   79: aload #13
    //   81: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: dup
    //   87: ifnull -> 112
    //   90: astore #15
    //   92: aload #15
    //   94: astore #16
    //   96: iconst_0
    //   97: istore #17
    //   99: aload #6
    //   101: aload #16
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: goto -> 114
    //   112: pop
    //   113: nop
    //   114: nop
    //   115: iinc #10, 1
    //   118: goto -> 57
    //   121: nop
    //   122: aload #6
    //   124: checkcast java/util/List
    //   127: areturn
  }
  
  @NotNull
  public static final Map associateTo(@NotNull Object[] paramArrayOfObject, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x73D1727EC8A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(object);
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List zip(@NotNull float[] paramArrayOffloat, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x78ABA6D473CDL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOffloat.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Float.valueOf(paramArrayOffloat[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte maxWithOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<Byte> paramComparator) {
    long l = d ^ 0x7398E9359FB4L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (paramComparator.compare(Byte.valueOf(b), Byte.valueOf(b1)) < 0)
        b = b1; 
    } 
    return Byte.valueOf(b);
  }
  
  @NotNull
  public static final List filterNot(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x499DD315A069L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    ArrayList<Object> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object = arrayOfObject[b];
      try {
        if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
          arrayList.add(object); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List filter(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1F6FFD778A31L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    ArrayList<Integer> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      int j = arrayOfInt[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          arrayList.add(Integer.valueOf(j)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double maxWithOrThrow(@NotNull double[] paramArrayOfdouble, @NotNull Comparator<Double> paramComparator) {
    long l = d ^ 0x74765CD1F815L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      if (paramComparator.compare(Double.valueOf(d), Double.valueOf(d1)) < 0)
        d = d1; 
    } 
    return d;
  }
  
  public static final void reverse(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x771CBE27AB72L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    int i = paramArrayOflong.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOflong);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      long l1 = paramArrayOflong[k];
      paramArrayOflong[k] = paramArrayOflong[j];
      paramArrayOflong[j] = l1;
      j--;
    } 
  }
  
  public static final float last(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x66C8912E4269L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOffloat[ArraysKt.getLastIndex(paramArrayOffloat)];
  }
  
  @NotNull
  public static final List slice(@NotNull double[] paramArrayOfdouble, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x77C121AE51A3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double[] arrayOfDouble = paramArrayOfdouble;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfDouble, i, j));
  }
  
  @Nullable
  public static final Short getOrNull(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = d ^ 0x5828F15C8F58L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfshort));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.7")
  public static final byte minWithOrThrow(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<Byte> paramComparator) {
    long l = d ^ 0x34CA8D5ABF30L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (paramComparator.compare(Byte.valueOf(b), Byte.valueOf(b1)) > 0)
        b = b1; 
    } 
    return b;
  }
  
  @NotNull
  public static final Set union(@NotNull float[] paramArrayOffloat, @NotNull Iterable paramIterable) {
    long l = d ^ 0x798C9E2B151L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOffloat);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List zip(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4FCB66BF0BBL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfint.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Integer.valueOf(paramArrayOfint[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object maxByOrThrow(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1ECA4386A7DAL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i == 0)
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      Object object1 = paramArrayOfObject[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) < 0) {
        object = object1;
        comparable = comparable1;
      } 
    } 
    return object;
  }
  
  @NotNull
  public static final long[] sliceArray(@NotNull long[] paramArrayOflong, @NotNull Collection paramCollection) {
    long l = d ^ 0x473CF243F5A6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    long[] arrayOfLong = new long[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfLong[b++] = paramArrayOflong[i];
    } 
    return arrayOfLong;
  }
  
  public static final boolean all(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1118129DA58FL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x3EE65CF238D4L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      paramMap.put(paramFunction11.invoke(Boolean.valueOf(bool1)), paramFunction12.invoke(Boolean.valueOf(bool1)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final float[] toFloatArray(@NotNull Float[] paramArrayOfFloat) {
    long l = d ^ 0x137A33B9420EL;
    Intrinsics.checkNotNullParameter(paramArrayOfFloat, "<this>");
    byte b = 0;
    int i = paramArrayOfFloat.length;
    float[] arrayOfFloat = new float[i];
    while (b < i) {
      byte b1 = b;
      arrayOfFloat[b1] = paramArrayOfFloat[b1].floatValue();
      b++;
    } 
    return arrayOfFloat;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x6E1C40888BB7L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfshort, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfshort.length)));
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull byte[] paramArrayOfbyte, @NotNull Collection<Byte> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6638BEADFDADL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          paramCollection.add(Byte.valueOf(b1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  public static final boolean none(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4AFD5A4CCE1CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final List zip(@NotNull boolean[] paramArrayOfboolean, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x13196C36D70AL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    boolean bool = false;
    int i = Math.min(arrayOfBoolean.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      boolean bool1 = arrayOfBoolean[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool2 = false;
      arrayList1.add(TuplesKt.to(Boolean.valueOf(bool1), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double minWithOrThrow(@NotNull double[] paramArrayOfdouble, @NotNull Comparator<Double> paramComparator) {
    long l = d ^ 0x3970CC721630L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      if (paramComparator.compare(Double.valueOf(d), Double.valueOf(d1)) > 0)
        d = d1; 
    } 
    return d;
  }
  
  public static final int indexOfFirst(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7AD3CEEB2BADL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Character.valueOf(paramArrayOfchar[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull short[] paramArrayOfshort, @NotNull Collection<Short> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 111088283739543
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: saload
    //   58: istore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: iload #11
    //   67: istore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: iload #12
    //   82: invokestatic valueOf : (S)Ljava/lang/Short;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: iload #12
    //   102: invokestatic valueOf : (S)Ljava/lang/Short;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  public static final double sumOfDouble(@NotNull Double[] paramArrayOfDouble) {
    long l = d ^ 0x5E66D3135193L;
    Intrinsics.checkNotNullParameter(paramArrayOfDouble, "<this>");
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfDouble.length;
    while (b < i) {
      double d1 = paramArrayOfDouble[b].doubleValue();
      d += d1;
      b++;
    } 
    return d;
  }
  
  @NotNull
  public static final List flatMap(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6DA52E5F9E8L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfByte.length;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Byte.valueOf(b1));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  public static final double average(@NotNull short[] paramArrayOfshort) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 135019083823394
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 55
    //   33: aload_0
    //   34: iload #6
    //   36: saload
    //   37: istore #8
    //   39: dload_3
    //   40: iload #8
    //   42: i2d
    //   43: dadd
    //   44: dstore_3
    //   45: iinc #5, 1
    //   48: nop
    //   49: iinc #6, 1
    //   52: goto -> 26
    //   55: iload #5
    //   57: ifne -> 70
    //   60: ldc2_w NaN
    //   63: goto -> 75
    //   66: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   69: athrow
    //   70: dload_3
    //   71: iload #5
    //   73: i2d
    //   74: ddiv
    //   75: dreturn
    // Exception table:
    //   from	to	target	type
    //   55	66	66	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull long[] paramArrayOflong, @NotNull Map<Object, Long> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x66214427A3F1L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      paramMap.put(paramFunction1.invoke(Long.valueOf(l1)), Long.valueOf(l1));
      b++;
    } 
    return paramMap;
  }
  
  @Nullable
  public static final Character getOrNull(@NotNull char[] paramArrayOfchar, int paramInt) {
    long l = d ^ 0x18E5F3B611EAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfchar));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  public static final int sum(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x6CB957927256L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfint.length;
    while (b < j) {
      int k = paramArrayOfint[b];
      i += k;
      b++;
    } 
    return i;
  }
  
  public static final void reverse(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x4081765162A7L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    int i = paramArrayOfshort.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfshort);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      short s = paramArrayOfshort[k];
      paramArrayOfshort[k] = paramArrayOfshort[j];
      paramArrayOfshort[j] = s;
      j--;
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long reduceRightIndexedOrNull(@NotNull long[] paramArrayOflong, @NotNull Function3 paramFunction3) {
    long l1 = d ^ 0x2702A65ECD70L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[i--];
    while (i >= 0) {
      l2 = ((Number)paramFunction3.invoke(Integer.valueOf(i), Long.valueOf(paramArrayOflong[i]), Long.valueOf(l2))).longValue();
      i--;
    } 
    return Long.valueOf(l2);
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull byte[] paramArrayOfbyte, @NotNull Random paramRandom) {
    long l = d ^ 0x7341BA7C5B9EL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfbyte); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      byte b = paramArrayOfbyte[i];
      paramArrayOfbyte[i] = paramArrayOfbyte[j];
      paramArrayOfbyte[j] = b;
    } 
  }
  
  @NotNull
  public static final List distinct(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x6AE1B0A4C31FL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfObject));
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull double[] paramArrayOfdouble, @NotNull Map<Object, Double> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x63928673588L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      paramMap.put(paramFunction1.invoke(Double.valueOf(d)), Double.valueOf(d));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List reversed(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x6A4238430688L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfObject);
    CollectionsKt.reverse(list);
    return list;
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull byte[] paramArrayOfbyte, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xB5EBB12082AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Byte.valueOf(b1));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List takeLast(@NotNull float[] paramArrayOffloat, int paramInt) {
    long l = d ^ 0x301B4172694DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOffloat.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOffloat); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Float.valueOf(paramArrayOffloat[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Float> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Float.valueOf(paramArrayOffloat[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x22458E5E921EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfshort, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List zip(@NotNull double[] paramArrayOfdouble, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x7B6954CA0CF6L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfdouble.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Double.valueOf(paramArrayOfdouble[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double maxByOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7F6B90D963DFL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i == 0)
        return Double.valueOf(d); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Double.valueOf(d));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      double d1 = paramArrayOfdouble[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Double.valueOf(d1));
      if (comparable.compareTo(comparable1) < 0) {
        d = d1;
        comparable = comparable1;
      } 
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final List zip(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x49880F7315D1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfbyte.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Byte.valueOf(paramArrayOfbyte[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x12730CDAD44AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfObject, (Comparator)new Object(paramFunction1));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Short reduceRightOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x21A3F585867BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s;
    for (s = paramArrayOfshort[i--]; i >= 0; s = ((Number)paramFunction2.invoke(Short.valueOf(paramArrayOfshort[i--]), Short.valueOf(s))).shortValue());
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final char[] sliceArray(@NotNull char[] paramArrayOfchar, @NotNull Collection paramCollection) {
    long l = d ^ 0x31BCA980D076L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    char[] arrayOfChar = new char[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfChar[b++] = paramArrayOfchar[i];
    } 
    return arrayOfChar;
  }
  
  public static final Object reduceRightIndexed(@NotNull Object[] paramArrayOfObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x562CC73C424AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[i--];
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), paramArrayOfObject[i], object);
      i--;
    } 
    return object;
  }
  
  @Nullable
  public static final Character lastOrNull(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x104222FF14D5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfchar.length == 0)) ? null : Character.valueOf(paramArrayOfchar[paramArrayOfchar.length - 1]);
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull short[] paramArrayOfshort, @NotNull Map<Object, Short> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2537E79F8FA0L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      paramMap.put(paramFunction1.invoke(Short.valueOf(s)), Short.valueOf(s));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Set toSet(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x415F0E83423L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      switch (paramArrayOfshort.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfshort, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfshort.length)));
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 121927477705041
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: iaload
    //   71: istore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: iload #13
    //   80: istore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: iload #14
    //   95: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: iload #14
    //   116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map associateBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1EED8AFA8AECL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOflong.length), 16);
    long[] arrayOfLong = paramArrayOflong;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfLong.length;
    while (b < j) {
      long l1 = arrayOfLong[b];
      linkedHashMap.put(paramFunction1.invoke(Long.valueOf(l1)), Long.valueOf(l1));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x4EC6D0D094F0L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfShort.length;
    while (b < i) {
      short s = arrayOfShort[b];
      Object object1 = paramFunction11.invoke(Short.valueOf(s));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Short.valueOf(s)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x4C9307EC8083L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfdouble, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfdouble.length)));
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull float[] paramArrayOffloat, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3DEE66A8F8BCL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      paramCollection.add(paramFunction1.invoke(Float.valueOf(f)));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Set subtract(@NotNull Object[] paramArrayOfObject, @NotNull Iterable paramIterable) {
    long l = d ^ 0x3CF4AA2DA80BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfObject);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5025DC17351EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Float> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      Object object = paramFunction1.invoke(Float.valueOf(f));
      try {
        if (hashSet.add(object))
          arrayList.add(Float.valueOf(f)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List reversed(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x3A0C033F6576L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfshort);
    CollectionsKt.reverse(list);
    return list;
  }
  
  public static final double averageOfFloat(@NotNull Float[] paramArrayOfFloat) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 15127874109942
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 58
    //   33: aload_0
    //   34: iload #6
    //   36: aaload
    //   37: invokevirtual floatValue : ()F
    //   40: fstore #8
    //   42: dload_3
    //   43: fload #8
    //   45: f2d
    //   46: dadd
    //   47: dstore_3
    //   48: iinc #5, 1
    //   51: nop
    //   52: iinc #6, 1
    //   55: goto -> 26
    //   58: iload #5
    //   60: ifne -> 73
    //   63: ldc2_w NaN
    //   66: goto -> 78
    //   69: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   72: athrow
    //   73: dload_3
    //   74: iload #5
    //   76: i2d
    //   77: ddiv
    //   78: dreturn
    // Exception table:
    //   from	to	target	type
    //   58	69	69	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.7")
  public static final char minWithOrThrow(@NotNull char[] paramArrayOfchar, @NotNull Comparator<Character> paramComparator) {
    long l = d ^ 0x6CB10F4EB2BDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) > 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final Map associateTo(@NotNull char[] paramArrayOfchar, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x647968B31C98L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Character.valueOf(c));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  public static final char first(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x23FBCD43CD03L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return c; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7CF8E57A651CL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Long.valueOf(paramArrayOflong[i]))).booleanValue())
              return ArraysKt.take(paramArrayOflong, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @NotNull
  public static final List take(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x3E9DF44D5ACEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfint.length)
        return ArraysKt.toList(paramArrayOfint); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Integer.valueOf(paramArrayOfint[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Integer> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfint.length;
    while (b2 < i) {
      int j = paramArrayOfint[b2];
      try {
        arrayList.add(Integer.valueOf(j));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set union(@NotNull double[] paramArrayOfdouble, @NotNull Iterable paramIterable) {
    long l = d ^ 0x6015C781D75BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfdouble);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull Object[] paramArrayOfObject, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2EAA20208FCBL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      Object object2 = paramFunction1.invoke(object1);
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object3 = map.get(object2);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object2, arrayList);
      List<Object> list = (object3 == null) ? arrayList : (List)object3;
      list.add(object1);
      b++;
    } 
    return paramMap;
  }
  
  public static final boolean none(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1BC4C5CDCDF6L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Map associateWithTo(@NotNull Object[] paramArrayOfObject, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x651462D13096L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      paramMap.put(object, paramFunction1.invoke(object));
      b++;
    } 
    return paramMap;
  }
  
  public static final Object foldIndexed(@NotNull short[] paramArrayOfshort, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x67944B5BBF3L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfshort.length;
    while (b2 < i) {
      short s = paramArrayOfshort[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Short.valueOf(s));
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2F5FF65F24AL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Float.valueOf(paramArrayOffloat[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOffloat, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOffloat);
    } 
  }
  
  @NotNull
  public static final List zip(@NotNull byte[] paramArrayOfbyte, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4923AB5D358BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfbyte.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Byte.valueOf(paramArrayOfbyte[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull char[] paramArrayOfchar, @NotNull Collection<Character> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1BF453A5B4C2L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          paramCollection.add(Character.valueOf(c)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List filter(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x77C854030186L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    ArrayList<Double> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfDouble.length;
    while (b < i) {
      double d = arrayOfDouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          arrayList.add(Double.valueOf(d)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long maxOrThrow(@NotNull long[] paramArrayOflong) {
    long l1 = d ^ 0x61845DA20DF1L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (l2 < l)
        l2 = l; 
    } 
    return l2;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x34DAB1D59C00L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfint.length), 16);
    int[] arrayOfInt = paramArrayOfint;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfInt.length;
    while (b < j) {
      int k = arrayOfInt[b];
      linkedHashMap.put(paramFunction1.invoke(Integer.valueOf(k)), Integer.valueOf(k));
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Boolean minByOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x14B4C052789BL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i == 0)
        return Boolean.valueOf(bool1); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool1));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      boolean bool2 = paramArrayOfboolean[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool2));
      if (comparable.compareTo(comparable1) > 0) {
        bool1 = bool2;
        comparable = comparable1;
      } 
    } 
    return Boolean.valueOf(bool1);
  }
  
  public static final boolean any(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x49A74C168420L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection<Boolean> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6A39296ADCF1L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          paramCollection.add(Boolean.valueOf(bool1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List filterNot(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x35226CB9459DL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    ArrayList<Integer> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      int j = arrayOfInt[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          arrayList.add(Integer.valueOf(j)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x590072EB54F1L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Long.valueOf(paramArrayOflong[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOflong, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOflong);
    } 
  }
  
  public static final int getLastIndex(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x784D73197F32L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return paramArrayOflong.length - 1;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x450588E86DF3L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfObject.length;
    while (b2 < i) {
      Object object = paramArrayOfObject[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), object));
      b2++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Integer reduceOrNull(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x22FE8CF9A551L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      i = ((Number)paramFunction2.invoke(Integer.valueOf(i), Integer.valueOf(paramArrayOfint[j]))).intValue();
    } 
    return Integer.valueOf(i);
  }
  
  @NotNull
  public static final List flatMap(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6E6BD339145BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfDouble.length;
    while (b < i) {
      double d = arrayOfDouble[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Double.valueOf(d));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List toList(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x7EDAC857C640L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      switch (paramArrayOfbyte.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfbyte);
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x644348803DB6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5(paramArrayOflong);
  }
  
  @NotNull
  public static final Pair partition(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5C08AC5496FDL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Character> arrayList1 = new ArrayList();
    ArrayList<Character> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          arrayList1.add(Character.valueOf(c));
        } else {
          arrayList2.add(Character.valueOf(c));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @Nullable
  public static final Byte singleOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x35738CD46B13L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Byte byte_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          byte_ = Byte.valueOf(b1);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return byte_;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x65B15FB8EC4FL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      d += ((Number)paramFunction1.invoke(Boolean.valueOf(bool1))).doubleValue();
      b++;
    } 
    return d;
  }
  
  public static final void forEach(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4ED6C8128AADL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      paramFunction1.invoke(Double.valueOf(d));
      b++;
    } 
  }
  
  @NotNull
  public static final List filter(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x71DB8D3A21FFL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    ArrayList<Long> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          arrayList.add(Long.valueOf(l1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull char[] paramArrayOfchar, @NotNull Random paramRandom) {
    long l = d ^ 0x2F46988C3F2DL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfchar); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      char c = paramArrayOfchar[i];
      paramArrayOfchar[i] = paramArrayOfchar[j];
      paramArrayOfchar[j] = c;
    } 
  }
  
  @NotNull
  public static final List zip(@NotNull Object[] paramArrayOfObject, @NotNull Iterable paramIterable) {
    long l = d ^ 0x4CFDDFE410AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Object[] arrayOfObject = paramArrayOfObject;
    boolean bool = false;
    int i = arrayOfObject.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        Object object2 = arrayOfObject[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(object2, object1));
      } 
    } 
    return arrayList;
  }
  
  public static final Object fold(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x70F86E81B0F2L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      object = paramFunction2.invoke(object, object1);
      b++;
    } 
    return object;
  }
  
  @NotNull
  public static final List toList(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x6F2F06FE7CCEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      switch (paramArrayOfshort.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfshort);
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull short[] paramArrayOfshort, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x124FE8C9B7C7L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Short.valueOf(s));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @Nullable
  public static final Character firstOrNull(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x47C28A34D8E2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfchar.length == 0)) ? null : Character.valueOf(paramArrayOfchar[0]);
  }
  
  public static final int indexOfFirst(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x619AED880A42L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Double.valueOf(paramArrayOfdouble[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final short[] sliceArray(@NotNull short[] paramArrayOfshort, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x37A7B9C021C7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new short[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short[] arrayOfShort = paramArrayOfshort;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfShort, i, j);
  }
  
  @NotNull
  public static final List dropWhile(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x366643BAE9C6L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Object> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (bool2) {
          arrayList.add(object);
        } else if (!((Boolean)paramFunction1.invoke(object)).booleanValue()) {
          arrayList.add(object);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Double firstOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x618C230B7AB9L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return Double.valueOf(d); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object randomOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Random paramRandom) {
    long l = d ^ 0x29ADBB0B9728L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfObject[paramRandom.nextInt(paramArrayOfObject.length)];
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short minWithOrNull(@NotNull short[] paramArrayOfshort, @NotNull Comparator<Short> paramComparator) {
    long l = d ^ 0x1CB79C8197B0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (paramComparator.compare(Short.valueOf(s), Short.valueOf(s1)) > 0)
        s = s1; 
    } 
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final List dropLast(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = d ^ 0x171E7D097985L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfshort, RangesKt.coerceAtLeast(paramArrayOfshort.length - paramInt, 0));
  }
  
  public static final short first(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x70EF3841EBA9L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return s; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull float[] paramArrayOffloat, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x44952D13123DL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      Object object1 = paramFunction11.invoke(Float.valueOf(f));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Float.valueOf(f)));
      b++;
    } 
    return paramMap;
  }
  
  public static final Object first(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x4A339C1F892DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfObject[0];
  }
  
  public static final Object single(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2290FE108741L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object1)).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          object = object1;
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6489D5456D99L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfObject.length), 16);
    Object[] arrayOfObject = paramArrayOfObject;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfObject.length;
    while (b < j) {
      Object object = arrayOfObject[b];
      linkedHashMap.put(paramFunction1.invoke(object), object);
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final int sum(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x2BBAB668BFAAL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfshort.length;
    while (b < j) {
      short s = paramArrayOfshort[b];
      i += s;
      b++;
    } 
    return i;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x552220F2AD18L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfDouble.length;
    while (b < i) {
      double d = arrayOfDouble[b];
      Object object1 = paramFunction1.invoke(Double.valueOf(d));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Double> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Double.valueOf(d));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull Object[] paramArrayOfObject, @NotNull Comparator paramComparator) {
    long l = d ^ 0x7A31CE45076L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return ArraysKt.asList(ArraysKt.sortedArrayWith(paramArrayOfObject, paramComparator));
  }
  
  @SinceKotlin(version = "1.3")
  public static final boolean random(@NotNull boolean[] paramArrayOfboolean, @NotNull Random paramRandom) {
    long l = d ^ 0x746FCD00D458L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfboolean[paramRandom.nextInt(paramArrayOfboolean.length)];
  }
  
  public static final int indexOfFirst(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2AA91AE8B05AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Integer.valueOf(paramArrayOfint[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @Nullable
  public static final Integer lastOrNull(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7F36BE36616L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfint.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        int k = paramArrayOfint[j];
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(k))).booleanValue())
          return Integer.valueOf(k); 
      } while (0 <= i); 
    return null;
  }
  
  @Nullable
  public static final Short lastOrNull(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x47F9A0B4BFD4L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfshort.length == 0)) ? null : Short.valueOf(paramArrayOfshort[paramArrayOfshort.length - 1]);
  }
  
  @NotNull
  public static final List zip(@NotNull int[] paramArrayOfint1, @NotNull int[] paramArrayOfint2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5C2C4E631772L;
    Intrinsics.checkNotNullParameter(paramArrayOfint1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfint2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfint1.length, paramArrayOfint2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Integer.valueOf(paramArrayOfint1[b]), Integer.valueOf(paramArrayOfint2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  public static final int count(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x245C46605A74L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfboolean.length;
    while (b2 < i) {
      boolean bool1 = paramArrayOfboolean[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x68C215664A8BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(paramArrayOfObject[i])).booleanValue())
              return ArraysKt.drop(paramArrayOfObject, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfObject);
    } 
  }
  
  public static final char reduceIndexed(@NotNull char[] paramArrayOfchar, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x51AEF8E81F8FL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(c), Character.valueOf(paramArrayOfchar[i]))).charValue();
    } 
    return c;
  }
  
  @NotNull
  public static final String joinToString(@NotNull short[] paramArrayOfshort, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x1B68BE46D006L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfshort, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfshort, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  public static final boolean reduceRightIndexed(@NotNull boolean[] paramArrayOfboolean, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x82526F98F2DL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[i--];
    while (i >= 0) {
      bool1 = ((Boolean)paramFunction3.invoke(Integer.valueOf(i), Boolean.valueOf(paramArrayOfboolean[i]), Boolean.valueOf(bool1))).booleanValue();
      i--;
    } 
    return bool1;
  }
  
  public static final int indexOf(@NotNull boolean[] paramArrayOfboolean, boolean paramBoolean) {
    long l = d ^ 0x7BB81FD1B777L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (paramBoolean == paramArrayOfboolean[b])
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x13D599DB6881L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfchar.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfChar.length;
    while (b2 < i) {
      char c = arrayOfChar[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c)));
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull char[] paramArrayOfchar, @NotNull Collection<Character> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 77411673677857
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: caload
    //   58: istore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: iload #11
    //   67: istore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: iload #12
    //   82: invokestatic valueOf : (C)Ljava/lang/Character;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: iload #12
    //   102: invokestatic valueOf : (C)Ljava/lang/Character;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull long[] paramArrayOflong, @NotNull Collection<Long> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 88912315437393
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: laload
    //   58: lstore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: lload #11
    //   67: lstore #13
    //   69: istore #15
    //   71: iconst_0
    //   72: istore #16
    //   74: aload_2
    //   75: iload #15
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: lload #13
    //   82: invokestatic valueOf : (J)Ljava/lang/Long;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: lload #13
    //   102: invokestatic valueOf : (J)Ljava/lang/Long;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final float[] sliceArray(@NotNull float[] paramArrayOffloat, @NotNull Collection paramCollection) {
    long l = d ^ 0x7CC8BD739D5BL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    float[] arrayOfFloat = new float[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfFloat[b++] = paramArrayOffloat[i];
    } 
    return arrayOfFloat;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4E6A9E663A7L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOflong, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x1559101BD0L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfboolean));
  }
  
  public static final int indexOfLast(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4C0E1C8C1EACL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfshort.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Short.valueOf(paramArrayOfshort[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  public static final boolean none(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xDA809F04EAL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long maxWithOrThrow(@NotNull long[] paramArrayOflong, @NotNull Comparator<Long> paramComparator) {
    long l1 = d ^ 0x79EB3C61864EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (paramComparator.compare(Long.valueOf(l2), Long.valueOf(l)) < 0)
        l2 = l; 
    } 
    return l2;
  }
  
  public static final Object fold(@NotNull char[] paramArrayOfchar, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x1131E09273A2L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      object = paramFunction2.invoke(object, Character.valueOf(c));
      b++;
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  public static final int maxWithOrThrow(@NotNull int[] paramArrayOfint, @NotNull Comparator<Integer> paramComparator) {
    long l = d ^ 0x17976F144377L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (paramComparator.compare(Integer.valueOf(i), Integer.valueOf(k)) < 0)
        i = k; 
    } 
    return i;
  }
  
  @NotNull
  public static final List zip(@NotNull long[] paramArrayOflong, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x51E453FAE5A7L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    int i = Math.min(arrayOfLong.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      long l1 = arrayOfLong[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Long.valueOf(l1), object));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set union(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = d ^ 0x2D39E7D830CBL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfshort);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  public static final int first(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x7436B6E2BBB1L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfint[0];
  }
  
  @SinceKotlin(version = "1.7")
  public static final float minWithOrThrow(@NotNull float[] paramArrayOffloat, @NotNull Comparator<Float> paramComparator) {
    long l = d ^ 0x2AA1926A63A3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      if (paramComparator.compare(Float.valueOf(f), Float.valueOf(f1)) > 0)
        f = f1; 
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float maxOrThrow(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x3E3255C5D14FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      f = Math.max(f, f1);
    } 
    return f;
  }
  
  public static final int lastIndexOf(@NotNull Object[] paramArrayOfObject, Object paramObject) {
    long l = d ^ 0x6DCC97B77440L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if (paramObject == null) {
      int i = paramArrayOfObject.length + -1;
      if (0 <= i)
        do {
          int j = i;
          i--;
          if (paramArrayOfObject[j] == null)
            return j; 
        } while (0 <= i); 
    } else {
      int i = paramArrayOfObject.length + -1;
      if (0 <= i)
        do {
          int j = i;
          i--;
          if (Intrinsics.areEqual(paramObject, paramArrayOfObject[j]))
            return j; 
        } while (0 <= i); 
    } 
    return -1;
  }
  
  public static final boolean any(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1E61635FDC48L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float maxOrNull(@NotNull Float[] paramArrayOfFloat) {
    long l = d ^ 0x40C01C803751L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfFloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfFloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOfFloat[0].floatValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfFloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOfFloat[i].floatValue();
      f = Math.max(f, f1);
    } 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final Map groupBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5CE4F057CCDBL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      int j = arrayOfInt[b];
      Object object1 = paramFunction1.invoke(Integer.valueOf(j));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Integer> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Integer.valueOf(j));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final Object foldIndexed(@NotNull long[] paramArrayOflong, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x798B428D6BF6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOflong.length;
    while (b2 < i) {
      long l1 = paramArrayOflong[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Long.valueOf(l1));
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x4CF45A726E42L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(paramArrayOfshort);
  }
  
  public static final float single(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2752CBCF1772L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Float float_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          float_ = Float.valueOf(f);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(float_, "null cannot be cast to non-null type kotlin.Float");
    return float_.floatValue();
  }
  
  @NotNull
  public static final char[] reversedArray(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x18EA10DC8DC9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return paramArrayOfchar; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char[] arrayOfChar = new char[paramArrayOfchar.length];
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfChar[i - j] = paramArrayOfchar[j];
    } 
    return arrayOfChar;
  }
  
  @Nullable
  public static final Object lastOrNull(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x76A782FC96C4L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfObject.length == 0)) ? null : paramArrayOfObject[paramArrayOfObject.length - 1];
  }
  
  @NotNull
  public static final List distinct(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x36AA99614401L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOffloat));
  }
  
  @NotNull
  public static final List toList(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x4CCC66FF178L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      switch (paramArrayOfdouble.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfdouble);
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x4F82EE4A5B3EL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfchar, new HashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(paramArrayOfchar.length, 128))));
  }
  
  @NotNull
  public static final Map groupBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7EB7C25DBAB6L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfShort.length;
    while (b < i) {
      short s = arrayOfShort[b];
      Object object1 = paramFunction1.invoke(Short.valueOf(s));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Short> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Short.valueOf(s));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull short[] paramArrayOfshort, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4AAF1E1D05FCL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfshort.length;
    while (b2 < i) {
      short s = paramArrayOfshort[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Short.valueOf(s)));
      b2++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final short[] reversedArray(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x3DF6474A01A6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return paramArrayOfshort; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short[] arrayOfShort = new short[paramArrayOfshort.length];
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfShort[i - j] = paramArrayOfshort[j];
    } 
    return arrayOfShort;
  }
  
  @NotNull
  public static final List takeWhile(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6FF5C353294AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Object> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(object);
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte maxOrNull(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x4BD1D597E099L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (b < b1)
        b = b1; 
    } 
    return Byte.valueOf(b);
  }
  
  @NotNull
  public static final List map(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x24880C232301L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOffloat.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfFloat.length;
    while (b < i) {
      float f = arrayOfFloat[b];
      arrayList.add(paramFunction1.invoke(Float.valueOf(f)));
      b++;
    } 
    return arrayList;
  }
  
  public static final void sortByDescending(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x321D5ED64400L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
      if (paramArrayOfObject.length > 1)
        ArraysKt.sortWith(paramArrayOfObject, (Comparator)new Object(paramFunction1)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public static final int indexOfLast(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7228877531A8L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfint.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(paramArrayOfint[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = d ^ 0x3FFA81EA90E7L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    ArraysKt.sort(paramArrayOflong, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOflong, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull char[] paramArrayOfchar, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x19119C33E200L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Character.valueOf(c));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Map associateWith(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5B0FE11A028FL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool1 = false;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfObject.length), 16));
    Object[] arrayOfObject = paramArrayOfObject;
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object = arrayOfObject[b];
      linkedHashMap.put(object, paramFunction1.invoke(object));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final boolean contains(@NotNull byte[] paramArrayOfbyte, byte paramByte) {
    long l = d ^ 0xD47E57D5566L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOfbyte, paramByte) >= 0);
  }
  
  public static final boolean any(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x143C8E04E831L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfboolean.length == 0) ? 1 : 0);
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull int[] paramArrayOfint, @NotNull Map<Object, Integer> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x662123054042L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      paramMap.put(paramFunction1.invoke(Integer.valueOf(j)), Integer.valueOf(j));
      b++;
    } 
    return paramMap;
  }
  
  public static final long last(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x2DAB818C6B49L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOflong[ArraysKt.getLastIndex(paramArrayOflong)];
  }
  
  public static final void reverse(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x757AB9946EDAL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    int i = paramArrayOfdouble.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfdouble);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      double d = paramArrayOfdouble[k];
      paramArrayOfdouble[k] = paramArrayOfdouble[j];
      paramArrayOfdouble[j] = d;
      j--;
    } 
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull int[] paramArrayOfint, @NotNull Collection<Integer> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2110EC3DAD4BL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          paramCollection.add(Integer.valueOf(j)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x581C383AAEAFL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfboolean, (Comparator)new Object(paramFunction1));
  }
  
  public static final short single(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x178A2D149635L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Short short_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          short_ = Short.valueOf(s);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(short_, "null cannot be cast to non-null type kotlin.Short");
    return short_.shortValue();
  }
  
  @NotNull
  public static final List flatMap(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2F2B5EA1D744L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      int j = arrayOfInt[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Integer.valueOf(j));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull short[] paramArrayOfshort, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x42B00439F896L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      Object object1 = paramFunction1.invoke(Short.valueOf(s));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Short> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Short.valueOf(s));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final boolean[] sliceArray(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection paramCollection) {
    long l = d ^ 0xBAA11D671BBL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    boolean[] arrayOfBoolean = new boolean[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfBoolean[b++] = paramArrayOfboolean[i];
    } 
    return arrayOfBoolean;
  }
  
  public static final Object fold(@NotNull boolean[] paramArrayOfboolean, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x74119981A89EL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      object = paramFunction2.invoke(object, Boolean.valueOf(bool1));
      b++;
    } 
    return object;
  }
  
  @NotNull
  public static final List distinct(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x5803FBEC6F9BL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOflong));
  }
  
  @Nullable
  public static final Float getOrNull(@NotNull float[] paramArrayOffloat, int paramInt) {
    long l = d ^ 0x71825324AB47L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOffloat));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  public static final boolean any(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x7A0B97769882L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfint.length == 0) ? 1 : 0);
  }
  
  @NotNull
  public static final List dropLast(@NotNull char[] paramArrayOfchar, int paramInt) {
    long l = d ^ 0x3EB0AA55C53L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfchar, RangesKt.coerceAtLeast(paramArrayOfchar.length - paramInt, 0));
  }
  
  @Nullable
  public static final Long lastOrNull(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6573B8165055L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOflong.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        long l1 = paramArrayOflong[j];
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return Long.valueOf(l1); 
      } while (0 <= i); 
    return null;
  }
  
  @SinceKotlin(version = "1.7")
  public static final int minWithOrThrow(@NotNull int[] paramArrayOfint, @NotNull Comparator<Integer> paramComparator) {
    long l = d ^ 0x8416ECBC0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (paramComparator.compare(Integer.valueOf(i), Integer.valueOf(k)) > 0)
        i = k; 
    } 
    return i;
  }
  
  public static final int indexOfLast(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x665AA649E3CL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfchar.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Character.valueOf(paramArrayOfchar[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final double[] sliceArray(@NotNull double[] paramArrayOfdouble, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x27E4B463B6BFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new double[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double[] arrayOfDouble = paramArrayOfdouble;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfDouble, i, j);
  }
  
  @SinceKotlin(version = "1.3")
  public static final short random(@NotNull short[] paramArrayOfshort, @NotNull Random paramRandom) {
    long l = d ^ 0x181C44425D09L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfshort[paramRandom.nextInt(paramArrayOfshort.length)];
  }
  
  @NotNull
  public static final List dropWhile(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x470E8550F4CBL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Double> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (bool2) {
          arrayList.add(Double.valueOf(d));
        } else if (!((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue()) {
          arrayList.add(Double.valueOf(d));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Double lastOrNull(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x5F1ED8736EEDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfdouble.length == 0)) ? null : Double.valueOf(paramArrayOfdouble[paramArrayOfdouble.length - 1]);
  }
  
  public static final int getLastIndex(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x2206194BE617L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return paramArrayOffloat.length - 1;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x14ADE440B3E6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Byte.valueOf(paramArrayOfbyte[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOfbyte, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfbyte);
    } 
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object minByOrThrow(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x60E5BBCBBBC3L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i == 0)
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      Object object1 = paramArrayOfObject[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) > 0) {
        object = object1;
        comparable = comparable1;
      } 
    } 
    return object;
  }
  
  public static final boolean last(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x1B7F39B2FE53L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfboolean[ArraysKt.getLastIndex(paramArrayOfboolean)];
  }
  
  @NotNull
  public static final List zip(@NotNull long[] paramArrayOflong, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4053117C21E3L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOflong.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Long.valueOf(paramArrayOflong[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4B266059F7A1L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Character> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      Object object = paramFunction1.invoke(Character.valueOf(c));
      try {
        if (hashSet.add(object))
          arrayList.add(Character.valueOf(c)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull short[] paramArrayOfshort, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x746665B1A0A2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      paramMap.put(paramFunction11.invoke(Short.valueOf(s)), paramFunction12.invoke(Short.valueOf(s)));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long minOrNull(@NotNull long[] paramArrayOflong) {
    long l1 = d ^ 0x405DEECD12EEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (l2 > l)
        l2 = l; 
    } 
    return Long.valueOf(l2);
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull byte[] paramArrayOfbyte, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3758468D0FFL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      Object object1 = paramFunction1.invoke(Byte.valueOf(b1));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Byte> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Byte.valueOf(b1));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double minOrNull(@NotNull Double[] paramArrayOfDouble) {
    long l = d ^ 0x423ABF5ED0AEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfDouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfDouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfDouble[0].doubleValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfDouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfDouble[i].doubleValue();
      d = Math.min(d, d1);
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final List sorted(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x6D433896EE7AL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Long[] arrayOfLong1 = ArraysKt.toTypedArray(paramArrayOflong);
    Long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfLong2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfLong2);
    return ArraysKt.asList((Object[])arrayOfLong1);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short minByOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x58E5DC36582FL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i == 0)
        return Short.valueOf(s); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Short.valueOf(s));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      short s1 = paramArrayOfshort[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Short.valueOf(s1));
      if (comparable.compareTo(comparable1) > 0) {
        s = s1;
        comparable = comparable1;
      } 
    } 
    return Short.valueOf(s);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short maxOrNull(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x312C50CDE954L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (s < s1)
        s = s1; 
    } 
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final List zip(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2) {
    long l = d ^ 0x3F0E3CDAC274L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "other");
    byte[] arrayOfByte = paramArrayOfbyte1;
    boolean bool = false;
    int i = Math.min(arrayOfByte.length, paramArrayOfbyte2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      byte b1 = paramArrayOfbyte2[b];
      byte b2 = arrayOfByte[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Byte.valueOf(b2), Byte.valueOf(b1)));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull Object[] paramArrayOfObject, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 117237042490437
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 150
    //   77: aload_0
    //   78: iload #11
    //   80: aaload
    //   81: astore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 141
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload_1
    //   127: aload #13
    //   129: aload #7
    //   131: invokestatic appendElement : (Ljava/lang/Appendable;Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)V
    //   134: goto -> 144
    //   137: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   140: athrow
    //   141: goto -> 150
    //   144: iinc #11, 1
    //   147: goto -> 70
    //   150: iload #5
    //   152: iflt -> 185
    //   155: iload #10
    //   157: iload #5
    //   159: if_icmple -> 185
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   168: athrow
    //   169: aload_1
    //   170: aload #6
    //   172: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   177: pop
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   184: athrow
    //   185: aload_1
    //   186: aload #4
    //   188: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   193: pop
    //   194: aload_1
    //   195: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	137	137	java/util/NoSuchElementException
    //   150	162	165	java/util/NoSuchElementException
    //   155	178	181	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object maxByOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x761DC8D8D377L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i == 0)
        return object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(object);
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      Object object1 = paramArrayOfObject[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(object1);
      if (comparable.compareTo(comparable1) < 0) {
        object = object1;
        comparable = comparable1;
      } 
    } 
    return object;
  }
  
  @Nullable
  public static final Boolean firstOrNull(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x6E0AA70551B3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfboolean.length == 0)) ? null : Boolean.valueOf(paramArrayOfboolean[0]);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Boolean reduceIndexedOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x1EBB91B2A5A9L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      bool1 = ((Boolean)paramFunction3.invoke(Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(paramArrayOfboolean[i]))).booleanValue();
    } 
    return Boolean.valueOf(bool1);
  }
  
  @NotNull
  public static final List dropWhile(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3138A6889B03L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Short> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (bool2) {
          arrayList.add(Short.valueOf(s));
        } else if (!((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue()) {
          arrayList.add(Short.valueOf(s));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double maxOrNull(@NotNull Double[] paramArrayOfDouble) {
    long l = d ^ 0x6CF25E7393C8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfDouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfDouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfDouble[0].doubleValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfDouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfDouble[i].doubleValue();
      d = Math.max(d, d1);
    } 
    return Double.valueOf(d);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Double reduceRightOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xEC79E728B5CL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d;
    for (d = paramArrayOfdouble[i--]; i >= 0; d = ((Number)paramFunction2.invoke(Double.valueOf(paramArrayOfdouble[i--]), Double.valueOf(d))).doubleValue());
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection) {
    long l = d ^ 0x527494B07974L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      paramCollection.add(object);
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List zip(@NotNull boolean[] paramArrayOfboolean, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2DAEBEA252C1L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfboolean.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Boolean.valueOf(paramArrayOfboolean[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    long l = d ^ 0xAA2CF9A02A7L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfObject.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      Object object = paramArrayOfObject[k];
      paramArrayOfObject[k] = paramArrayOfObject[j];
      paramArrayOfObject[j] = object;
      j--;
    } 
  }
  
  public static final float single(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x6C149D25C7CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      switch (paramArrayOffloat.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @NotNull
  public static final List flatMap(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x15FA11F96F85L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object = arrayOfObject[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(object);
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  public static final double averageOfDouble(@NotNull Double[] paramArrayOfDouble) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 56727156517388
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 57
    //   33: aload_0
    //   34: iload #6
    //   36: aaload
    //   37: invokevirtual doubleValue : ()D
    //   40: dstore #8
    //   42: dload_3
    //   43: dload #8
    //   45: dadd
    //   46: dstore_3
    //   47: iinc #5, 1
    //   50: nop
    //   51: iinc #6, 1
    //   54: goto -> 26
    //   57: iload #5
    //   59: ifne -> 72
    //   62: ldc2_w NaN
    //   65: goto -> 77
    //   68: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   71: athrow
    //   72: dload_3
    //   73: iload #5
    //   75: i2d
    //   76: ddiv
    //   77: dreturn
    // Exception table:
    //   from	to	target	type
    //   57	68	68	java/util/NoSuchElementException
  }
  
  public static final void reverse(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x66F40BCBA3EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    int i = paramArrayOffloat.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOffloat);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      float f = paramArrayOffloat[k];
      paramArrayOffloat[k] = paramArrayOffloat[j];
      paramArrayOffloat[j] = f;
      j--;
    } 
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5E1CCBB56EE0L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Double.valueOf(paramArrayOfdouble[i]))).booleanValue())
              return ArraysKt.take(paramArrayOfdouble, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x36F1B778E194L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfint.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfInt.length;
    while (b2 < i) {
      int j = arrayOfInt[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Integer.valueOf(j)));
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List zip(@NotNull boolean[] paramArrayOfboolean1, @NotNull boolean[] paramArrayOfboolean2) {
    long l = d ^ 0x4C408172599L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfboolean2, "other");
    boolean[] arrayOfBoolean = paramArrayOfboolean1;
    boolean bool = false;
    int i = Math.min(arrayOfBoolean.length, paramArrayOfboolean2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      boolean bool1 = paramArrayOfboolean2[b];
      boolean bool2 = arrayOfBoolean[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool3 = false;
      arrayList1.add(TuplesKt.to(Boolean.valueOf(bool2), Boolean.valueOf(bool1)));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x458FBEED9915L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(paramArrayOflong);
  }
  
  public static final boolean all(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3F551B5E0EFDL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  public static final int reduceRightIndexed(@NotNull int[] paramArrayOfint, @NotNull Function3 paramFunction3) {
    long l = d ^ 0xEA0F759A310L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramArrayOfint[i--];
    while (i >= 0) {
      j = ((Number)paramFunction3.invoke(Integer.valueOf(i), Integer.valueOf(paramArrayOfint[i]), Integer.valueOf(j))).intValue();
      i--;
    } 
    return j;
  }
  
  @NotNull
  public static final List reversed(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x1E3206E76265L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfchar);
    CollectionsKt.reverse(list);
    return list;
  }
  
  public static final byte reduceIndexed(@NotNull byte[] paramArrayOfbyte, @NotNull Function3 paramFunction3) {
    long l = d ^ 0xFB88029D2E7L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b = ((Number)paramFunction3.invoke(Integer.valueOf(i), Byte.valueOf(b), Byte.valueOf(paramArrayOfbyte[i]))).byteValue();
    } 
    return b;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull float[] paramArrayOffloat, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x1616906F0EBAL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      paramMap.put(paramFunction11.invoke(Float.valueOf(f)), paramFunction12.invoke(Float.valueOf(f)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull double[] paramArrayOfdouble, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x39AA345A4E7BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      paramCollection.add(paramFunction1.invoke(Double.valueOf(d)));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull float[] paramArrayOffloat, @NotNull Map<Object, Float> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6DEF37E118F8L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      paramMap.put(paramFunction1.invoke(Float.valueOf(f)), Float.valueOf(f));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Set intersect(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = d ^ 0x4E70458B1B5BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfshort);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull char[] paramArrayOfchar, @NotNull Comparator paramComparator) {
    long l = d ^ 0x440F51878D16L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Character[] arrayOfCharacter1 = ArraysKt.toTypedArray(paramArrayOfchar);
    Character[] arrayOfCharacter2 = arrayOfCharacter1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfCharacter2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfCharacter1);
  }
  
  @NotNull
  public static final List takeLast(@NotNull char[] paramArrayOfchar, int paramInt) {
    long l = d ^ 0x6B383B45A6BFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfchar.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfchar); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Character.valueOf(paramArrayOfchar[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Character> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Character.valueOf(paramArrayOfchar[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x65AF94CF71ACL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Long> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      Object object = paramFunction1.invoke(Long.valueOf(l1));
      try {
        if (hashSet.add(object))
          arrayList.add(Long.valueOf(l1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeLast(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = d ^ 0x15AFBC28D39EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfObject.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(paramArrayOfObject[i - 1]); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(paramArrayOfObject[j]);
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List map(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x123F26B00420L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfshort.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfShort.length;
    while (b < i) {
      short s = arrayOfShort[b];
      arrayList.add(paramFunction1.invoke(Short.valueOf(s)));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List map(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4AD7050A878CL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfdouble.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfDouble.length;
    while (b < i) {
      double d = arrayOfDouble[b];
      arrayList.add(paramFunction1.invoke(Double.valueOf(d)));
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float maxWithOrNull(@NotNull float[] paramArrayOffloat, @NotNull Comparator<Float> paramComparator) {
    long l = d ^ 0x3F2ABA930E83L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      if (paramComparator.compare(Float.valueOf(f), Float.valueOf(f1)) < 0)
        f = f1; 
    } 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x3E82D08B7135L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3(paramArrayOfshort);
  }
  
  @NotNull
  public static final List zip(@NotNull short[] paramArrayOfshort1, @NotNull short[] paramArrayOfshort2) {
    long l = d ^ 0x37DBB2C030F2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfshort2, "other");
    short[] arrayOfShort = paramArrayOfshort1;
    boolean bool = false;
    int i = Math.min(arrayOfShort.length, paramArrayOfshort2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      short s1 = paramArrayOfshort2[b];
      short s2 = arrayOfShort[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Short.valueOf(s2), Short.valueOf(s1)));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x335035F2E657L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfshort.length), 16);
    short[] arrayOfShort = paramArrayOfshort;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfShort.length;
    while (b < j) {
      short s = arrayOfShort[b];
      linkedHashMap.put(paramFunction1.invoke(Short.valueOf(s)), Short.valueOf(s));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull double[] paramArrayOfdouble, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3529FE5C2844L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Double.valueOf(d));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  public static final int indexOfFirst(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1811105C2503L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Boolean.valueOf(paramArrayOfboolean[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  public static final int count(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6B35BD6C3AF1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfbyte.length;
    while (b2 < i) {
      byte b = paramArrayOfbyte[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final List slice(@NotNull short[] paramArrayOfshort, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x3B2694DA931CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short[] arrayOfShort = paramArrayOfshort;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfShort, i, j));
  }
  
  @NotNull
  public static final short[] sortedArrayDescending(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0xF400A15422AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return paramArrayOfshort; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length);
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfShort2);
    return arrayOfShort1;
  }
  
  @NotNull
  public static final List slice(@NotNull boolean[] paramArrayOfboolean, @NotNull IntRange paramIntRange) {
    long l = d ^ 0xF3CC8472296L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfBoolean, i, j));
  }
  
  public static final boolean none(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0xFB2C1B09D9DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOflong.length == 0);
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7853F788E812L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfdouble.length;
    while (b < j) {
      double d = paramArrayOfdouble[b];
      i += ((Number)paramFunction1.invoke(Double.valueOf(d))).intValue();
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float maxOrNull(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x53D2CA5518F8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      f = Math.max(f, f1);
    } 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final List drop(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = d ^ 0x2BFE370E8363L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOflong, RangesKt.coerceAtLeast(paramArrayOflong.length - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.7")
  public static final int maxByOrThrow(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1C5592513438L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    int j = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (j == 0)
        return i; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Integer.valueOf(i));
    IntIterator intIterator = (new IntRange(1, j)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      int m = paramArrayOfint[k];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Integer.valueOf(m));
      if (comparable.compareTo(comparable1) < 0) {
        i = m;
        comparable = comparable1;
      } 
    } 
    return i;
  }
  
  @NotNull
  public static final Set union(@NotNull Object[] paramArrayOfObject, @NotNull Iterable paramIterable) {
    long l = d ^ 0x35939F0F6DF7L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfObject);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List slice(@NotNull double[] paramArrayOfdouble, @NotNull Iterable paramIterable) {
    long l = d ^ 0x734B269CDACBL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Double> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Double.valueOf(paramArrayOfdouble[j]));
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Short firstOrNull(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x50DAF789A0EBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfshort.length == 0)) ? null : Short.valueOf(paramArrayOfshort[0]);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Long reduceOrNull(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    long l1 = d ^ 0x61030343E12L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      l2 = ((Number)paramFunction2.invoke(Long.valueOf(l2), Long.valueOf(paramArrayOflong[i]))).longValue();
    } 
    return Long.valueOf(l2);
  }
  
  @SinceKotlin(version = "1.7")
  public static final byte maxByOrThrow(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x18F9CEBDDDBEL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i == 0)
        return b; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Byte.valueOf(b));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Byte.valueOf(b1));
      if (comparable.compareTo(comparable1) < 0) {
        b = b1;
        comparable = comparable1;
      } 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character reduceRightIndexedOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x21748F97CA66L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[i--];
    while (i >= 0) {
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(paramArrayOfchar[i]), Character.valueOf(c))).charValue();
      i--;
    } 
    return Character.valueOf(c);
  }
  
  public static final int getLastIndex(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x6F7BFD25E487L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return paramArrayOfboolean.length - 1;
  }
  
  @Nullable
  public static final Object singleOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x15D67CCBB22CL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object object = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      try {
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
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @NotNull
  public static final List drop(@NotNull double[] paramArrayOfdouble, int paramInt) {
    long l = d ^ 0x3BD31A7241CFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfdouble, RangesKt.coerceAtLeast(paramArrayOfdouble.length - paramInt, 0));
  }
  
  public static final short reduceIndexed(@NotNull short[] paramArrayOfshort, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x57293EDF70A5L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s = ((Number)paramFunction3.invoke(Integer.valueOf(i), Short.valueOf(s), Short.valueOf(paramArrayOfshort[i]))).shortValue();
    } 
    return s;
  }
  
  public static final void forEach(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6296859E27C2L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      paramFunction1.invoke(Integer.valueOf(j));
      b++;
    } 
  }
  
  @NotNull
  public static final List zip(@NotNull float[] paramArrayOffloat, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x7EBCE323CD5FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    float[] arrayOfFloat = paramArrayOffloat;
    boolean bool = false;
    int i = Math.min(arrayOfFloat.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      float f = arrayOfFloat[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Float.valueOf(f), object));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3CB0B6FE1CB6L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Boolean> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      Object object = paramFunction1.invoke(Boolean.valueOf(bool1));
      try {
        if (hashSet.add(object))
          arrayList.add(Boolean.valueOf(bool1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeWhile(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3F82BC1D8D18L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Character> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Character.valueOf(c));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x401B5612AB8FL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    ArrayList<Integer> arrayList = new ArrayList(paramArrayOfint.length);
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      arrayList.add(Integer.valueOf(j));
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short reduceRightIndexedOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x4107886E8525L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[i--];
    while (i >= 0) {
      s = ((Number)paramFunction3.invoke(Integer.valueOf(i), Short.valueOf(paramArrayOfshort[i]), Short.valueOf(s))).shortValue();
      i--;
    } 
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final List drop(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = d ^ 0x2530C5FD3DE0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfbyte, RangesKt.coerceAtLeast(paramArrayOfbyte.length - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.3")
  public static final byte random(@NotNull byte[] paramArrayOfbyte, @NotNull Random paramRandom) {
    long l = d ^ 0x7956487E61BCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfbyte[paramRandom.nextInt(paramArrayOfbyte.length)];
  }
  
  public static final int sumOfShort(@NotNull Short[] paramArrayOfShort) {
    long l = d ^ 0x55F620903447L;
    Intrinsics.checkNotNullParameter(paramArrayOfShort, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfShort.length;
    while (b < j) {
      short s = paramArrayOfShort[b].shortValue();
      i += s;
      b++;
    } 
    return i;
  }
  
  @NotNull
  public static final Collection mapIndexedNotNullTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 88630323100693
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc_w 'transform'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: iconst_0
    //   28: istore #5
    //   30: aload_0
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: iconst_0
    //   37: istore #8
    //   39: iconst_0
    //   40: istore #9
    //   42: aload #6
    //   44: arraylength
    //   45: istore #10
    //   47: iload #9
    //   49: iload #10
    //   51: if_icmpge -> 122
    //   54: aload #6
    //   56: iload #9
    //   58: aaload
    //   59: astore #11
    //   61: iload #8
    //   63: iinc #8, 1
    //   66: aload #11
    //   68: astore #12
    //   70: istore #13
    //   72: iconst_0
    //   73: istore #14
    //   75: aload_2
    //   76: iload #13
    //   78: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   81: aload #12
    //   83: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   88: dup
    //   89: ifnull -> 113
    //   92: astore #15
    //   94: aload #15
    //   96: astore #16
    //   98: iconst_0
    //   99: istore #17
    //   101: aload_1
    //   102: aload #16
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: goto -> 115
    //   113: pop
    //   114: nop
    //   115: nop
    //   116: iinc #9, 1
    //   119: goto -> 47
    //   122: nop
    //   123: aload_1
    //   124: areturn
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte reduceIndexedOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x59E0E8C69902L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b = ((Number)paramFunction3.invoke(Integer.valueOf(i), Byte.valueOf(b), Byte.valueOf(paramArrayOfbyte[i]))).byteValue();
    } 
    return Byte.valueOf(b);
  }
  
  @Nullable
  public static final Double firstOrNull(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x3AFC180FECCCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfdouble.length == 0)) ? null : Double.valueOf(paramArrayOfdouble[0]);
  }
  
  @NotNull
  public static final List map(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1A75D6E3B9E7L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfObject.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object = arrayOfObject[b];
      arrayList.add(paramFunction1.invoke(object));
      b++;
    } 
    return arrayList;
  }
  
  public static final void forEach(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7F4EBE3B05A0L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      paramFunction1.invoke(Boolean.valueOf(bool1));
      b++;
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object reduceIndexedOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x558E344ADD74L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      object = paramFunction3.invoke(Integer.valueOf(i), object, paramArrayOfObject[i]);
    } 
    return object;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull boolean[] paramArrayOfboolean, @NotNull Comparator paramComparator) {
    long l = d ^ 0x7071F55656D0L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Boolean[] arrayOfBoolean1 = ArraysKt.toTypedArray(paramArrayOfboolean);
    Boolean[] arrayOfBoolean2 = arrayOfBoolean1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfBoolean2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfBoolean1);
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull long[] paramArrayOflong, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6281EE25D23EL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Long.valueOf(l1));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List distinct(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x56EEDF9F3CD0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfbyte));
  }
  
  public static final void reverse(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x55E311BFE278L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    int i = paramArrayOfchar.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfchar);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      char c = paramArrayOfchar[k];
      paramArrayOfchar[k] = paramArrayOfchar[j];
      paramArrayOfchar[j] = c;
      j--;
    } 
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2EE56E7867BCL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Integer.valueOf(paramArrayOfint[i]))).booleanValue())
              return ArraysKt.take(paramArrayOfint, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  public static final int indexOf(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x638C4C0CBE39L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    byte b = 0;
    int i = paramArrayOfint.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (paramInt == paramArrayOfint[b])
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  public static final boolean none(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x754DAC1FCB74L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfint.length == 0);
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Map<Object, Boolean> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7B85AB5D0F17L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      paramMap.put(paramFunction1.invoke(Boolean.valueOf(bool1)), Boolean.valueOf(bool1));
      b++;
    } 
    return paramMap;
  }
  
  @Nullable
  public static final Long firstOrNull(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x1467A168C39EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOflong.length == 0)) ? null : Long.valueOf(paramArrayOflong[0]);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character minByOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5E3F9B0D3F5FL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i == 0)
        return Character.valueOf(c); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Character.valueOf(c));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      char c1 = paramArrayOfchar[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) > 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull short[] paramArrayOfshort, @NotNull Collection<Short> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x67B2CCB38554L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          paramCollection.add(Short.valueOf(s)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x4258A0415A3DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfByte.length;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      Object object1 = paramFunction11.invoke(Byte.valueOf(b1));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Byte.valueOf(b1)));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final Object foldIndexed(@NotNull byte[] paramArrayOfbyte, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x61AC88749D5CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfbyte.length;
    while (b2 < i) {
      byte b = paramArrayOfbyte[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Byte.valueOf(b));
      b2++;
    } 
    return object;
  }
  
  public static final int indexOfLast(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x37D65F89700DL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOflong.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Long.valueOf(paramArrayOflong[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x176AC82DAEE7L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Double.valueOf(paramArrayOfdouble[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOfdouble, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfdouble);
    } 
  }
  
  public static final boolean any(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x259AE2523ABEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOflong.length == 0) ? 1 : 0);
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x5BAFEABF98CDL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length);
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    ArraysKt.sort(arrayOfShort2);
    return ArraysKt.reversed(arrayOfShort1);
  }
  
  @NotNull
  public static final double[] toDoubleArray(@NotNull Double[] paramArrayOfDouble) {
    long l = d ^ 0x3BCAFF433345L;
    Intrinsics.checkNotNullParameter(paramArrayOfDouble, "<this>");
    byte b = 0;
    int i = paramArrayOfDouble.length;
    double[] arrayOfDouble = new double[i];
    while (b < i) {
      byte b1 = b;
      arrayOfDouble[b1] = paramArrayOfDouble[b1].doubleValue();
      b++;
    } 
    return arrayOfDouble;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character maxOrNull(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x653E46379C61L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (Intrinsics.compare(c, c1) < 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character reduceIndexedOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x528DB6614EEAL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(c), Character.valueOf(paramArrayOfchar[i]))).charValue();
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final List flatMap(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x21C8FFA8D99AL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfChar.length;
    while (b < i) {
      char c = arrayOfChar[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Character.valueOf(c));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List slice(@NotNull byte[] paramArrayOfbyte, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x49A85F3ED15EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfByte, i, j));
  }
  
  public static final Object foldRight(@NotNull byte[] paramArrayOfbyte, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x62D2EFF49B95L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Byte.valueOf(paramArrayOfbyte[i--]), object));
    return object;
  }
  
  public static final boolean none(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x632AABA423D3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfbyte.length == 0);
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5BBF1FA7B6DAL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      d += ((Number)paramFunction1.invoke(Long.valueOf(l1))).doubleValue();
      b++;
    } 
    return d;
  }
  
  @NotNull
  public static final List map(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x37805993AD3CL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfchar.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfChar.length;
    while (b < i) {
      char c = arrayOfChar[b];
      arrayList.add(paramFunction1.invoke(Character.valueOf(c)));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4990FF9D92A6L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOffloat, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List dropLast(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = d ^ 0x273EC7E9C632L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfbyte, RangesKt.coerceAtLeast(paramArrayOfbyte.length - paramInt, 0));
  }
  
  public static final int count(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x59AAF3B48736L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOflong.length;
    while (b2 < i) {
      long l1 = paramArrayOflong[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final List zip(@NotNull double[] paramArrayOfdouble, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x4EF4E385146AL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    double[] arrayOfDouble = paramArrayOfdouble;
    boolean bool = false;
    int i = Math.min(arrayOfDouble.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      double d = arrayOfDouble[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Double.valueOf(d), object));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x3D9E935D3CF7L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOffloat.length), 16);
    float[] arrayOfFloat = paramArrayOffloat;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfFloat.length;
    while (b < j) {
      float f = arrayOfFloat[b];
      linkedHashMap.put(paramFunction11.invoke(Float.valueOf(f)), paramFunction12.invoke(Float.valueOf(f)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x72292DCB3261L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          paramCollection.add(object); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0xC698BB37C3CL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$4(paramArrayOfint));
  }
  
  public static final int indexOf(@NotNull short[] paramArrayOfshort, short paramShort) {
    long l = d ^ 0x66D8BD2E9E4EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (paramShort == paramArrayOfshort[b])
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final Map associateTo(@NotNull int[] paramArrayOfint, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x23AAD6EE379FL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Integer.valueOf(j));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List take(@NotNull float[] paramArrayOffloat, int paramInt) {
    long l = d ^ 0x74362CB3A342L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOffloat.length)
        return ArraysKt.toList(paramArrayOffloat); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Float.valueOf(paramArrayOffloat[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Float> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOffloat.length;
    while (b2 < i) {
      float f = paramArrayOffloat[b2];
      try {
        arrayList.add(Float.valueOf(f));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List filterNot(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1786E37EE060L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    ArrayList<Character> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfChar.length;
    while (b < i) {
      char c = arrayOfChar[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          arrayList.add(Character.valueOf(c)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte minByOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x62A55B7B6487L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i == 0)
        return Byte.valueOf(b); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Byte.valueOf(b));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Byte.valueOf(b1));
      if (comparable.compareTo(comparable1) > 0) {
        b = b1;
        comparable = comparable1;
      } 
    } 
    return Byte.valueOf(b);
  }
  
  @SinceKotlin(version = "1.7")
  public static final byte minByOrThrow(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3AB2E22CCA19L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i == 0)
        return b; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Byte.valueOf(b));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Byte.valueOf(b1));
      if (comparable.compareTo(comparable1) > 0) {
        b = b1;
        comparable = comparable1;
      } 
    } 
    return b;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7B612AB5D6EDL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOffloat, (Comparator)new Object(paramFunction1));
  }
  
  @Nullable
  public static final Double lastOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2C88C367E87FL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfdouble.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        double d = paramArrayOfdouble[j];
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return Double.valueOf(d); 
      } while (0 <= i); 
    return null;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double maxOrThrow(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x96EDB33B914L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      d = Math.max(d, d1);
    } 
    return d;
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x611E72108350L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$7(paramArrayOfdouble));
  }
  
  @NotNull
  public static final List filterNot(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xAEF2ADAF89L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    ArrayList<Short> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfShort.length;
    while (b < i) {
      short s = arrayOfShort[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          arrayList.add(Short.valueOf(s)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static final void forEachIndexed(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x76D17AF60BA6L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfdouble.length;
    while (b2 < i) {
      double d = paramArrayOfdouble[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Double.valueOf(d));
      b2++;
    } 
  }
  
  @NotNull
  public static final List sortedBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x705CBD4294ECL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfshort, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4874802D84F9L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOflong, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final Map groupBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x1A4A13B3C2F2L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfDouble.length;
    while (b < i) {
      double d = arrayOfDouble[b];
      Object object1 = paramFunction11.invoke(Double.valueOf(d));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Double.valueOf(d)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final byte[] sortedArrayDescending(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x4DB0B14B840DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return paramArrayOfbyte; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfByte2);
    return arrayOfByte1;
  }
  
  @NotNull
  public static final boolean[] toBooleanArray(@NotNull Boolean[] paramArrayOfBoolean) {
    long l = d ^ 0x4AAFA53540CL;
    Intrinsics.checkNotNullParameter(paramArrayOfBoolean, "<this>");
    byte b = 0;
    int i = paramArrayOfBoolean.length;
    boolean[] arrayOfBoolean = new boolean[i];
    while (b < i) {
      byte b1 = b;
      arrayOfBoolean[b1] = paramArrayOfBoolean[b1].booleanValue();
      b++;
    } 
    return arrayOfBoolean;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float maxWithOrThrow(@NotNull float[] paramArrayOffloat, @NotNull Comparator<Float> paramComparator) {
    long l = d ^ 0x1A4E9A4EA845L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      if (paramComparator.compare(Float.valueOf(f), Float.valueOf(f1)) < 0)
        f = f1; 
    } 
    return f;
  }
  
  public static final Object fold(@NotNull byte[] paramArrayOfbyte, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x17C8120F2359L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      object = paramFunction2.invoke(object, Byte.valueOf(b1));
      b++;
    } 
    return object;
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x3B5246168428L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfshort, new HashSet(MapsKt.mapCapacity(paramArrayOfshort.length)));
  }
  
  public static final double first(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x71B55FCF42ECL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfdouble[0];
  }
  
  @NotNull
  public static final List slice(@NotNull int[] paramArrayOfint, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x1B7E3BB61488L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int[] arrayOfInt = paramArrayOfint;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfInt, i, j));
  }
  
  @NotNull
  public static final List filter(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6FDC8E390224L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    ArrayList<Character> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfChar.length;
    while (b < i) {
      char c = arrayOfChar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          arrayList.add(Character.valueOf(c)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static final int lastIndexOf(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x1D9811B7ECBBL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    int i = paramArrayOfint.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (paramInt == paramArrayOfint[j])
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Comparable maxOrNull(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x3393F521696L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfComparable.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = paramArrayOfComparable[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfComparable))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Comparable<Comparable> comparable1 = paramArrayOfComparable[i];
      if (comparable.compareTo(comparable1) < 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Collection flatMapSequenceTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x69E069993B90L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      Sequence sequence = (Sequence)paramFunction1.invoke(object);
      CollectionsKt.addAll(paramCollection, sequence);
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull long[] paramArrayOflong, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4E431C69777L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOflong.length;
    while (b2 < i) {
      long l1 = paramArrayOflong[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Long.valueOf(l1)));
      b2++;
    } 
    return paramCollection;
  }
  
  public static final Object foldIndexed(@NotNull char[] paramArrayOfchar, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x71DC4F17F322L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfchar.length;
    while (b2 < i) {
      char c = paramArrayOfchar[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Character.valueOf(c));
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final List take(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = d ^ 0x125020D96B3BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfshort.length)
        return ArraysKt.toList(paramArrayOfshort); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Short.valueOf(paramArrayOfshort[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Short> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfshort.length;
    while (b2 < i) {
      short s = paramArrayOfshort[b2];
      try {
        arrayList.add(Short.valueOf(s));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List zip(@NotNull Object[] paramArrayOfObject, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x15AD27295BCCL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfObject.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(paramArrayOfObject[b++], object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public static final byte first(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x49B1045C4320L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfbyte[0];
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List scanIndexed(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x3E25B2BA9317L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    boolean bool2 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      ArrayList<Object> arrayList1 = new ArrayList(arrayOfObject.length + 1);
      ArrayList<Object> arrayList2 = arrayList1;
      int i = 0;
      arrayList2.add(paramObject);
      ArrayList<Object> arrayList3 = arrayList1;
      Object object = paramObject;
      byte b = 0;
      i = arrayOfObject.length;
      while (b < i) {
        object = paramFunction3.invoke(Integer.valueOf(b), object, arrayOfObject[b]);
        arrayList3.add(object);
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((arrayOfObject.length == 0)) ? CollectionsKt.listOf(paramObject) : arrayList3;
  }
  
  @SinceKotlin(version = "1.7")
  public static final int minOrThrow(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x2815E193A09AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (i > k)
        i = k; 
    } 
    return i;
  }
  
  @NotNull
  public static final Set subtract(@NotNull char[] paramArrayOfchar, @NotNull Iterable paramIterable) {
    long l = d ^ 0x2B553DB820E4L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfchar);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x407197FE8518L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Byte> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      Object object = paramFunction1.invoke(Byte.valueOf(b1));
      try {
        if (hashSet.add(object))
          arrayList.add(Byte.valueOf(b1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float minOrNull(@NotNull Float[] paramArrayOfFloat) {
    long l = d ^ 0x148BFF280959L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfFloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfFloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOfFloat[0].floatValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfFloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOfFloat[i].floatValue();
      f = Math.min(f, f1);
    } 
    return Float.valueOf(f);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer maxWithOrNull(@NotNull int[] paramArrayOfint, @NotNull Comparator<Integer> paramComparator) {
    long l = d ^ 0x4F060000C119L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (paramComparator.compare(Integer.valueOf(i), Integer.valueOf(k)) < 0)
        i = k; 
    } 
    return Integer.valueOf(i);
  }
  
  @NotNull
  public static final Map groupBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x124122047205L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfFloat.length;
    while (b < i) {
      float f = arrayOfFloat[b];
      Object object1 = paramFunction11.invoke(Float.valueOf(f));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Float.valueOf(f)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull double[] paramArrayOfdouble, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 127955058262143
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: daload
    //   81: dstore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: dload #13
    //   143: invokestatic valueOf : (D)Ljava/lang/Double;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: dload #13
    //   170: invokestatic valueOf : (D)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull float[] paramArrayOffloat, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1E5CB3B63927L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Float.valueOf(f));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char maxOrThrow(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x6B5467EB5619L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (Intrinsics.compare(c, c1) < 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final Map associate(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x50B4D1DF57F4L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfObject.length), 16);
    Object[] arrayOfObject = paramArrayOfObject;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfObject.length;
    while (b < j) {
      Object object = arrayOfObject[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(object);
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float minOrThrow(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x478F9A2F1027L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      f = Math.min(f, f1);
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char maxWithOrThrow(@NotNull char[] paramArrayOfchar, @NotNull Comparator<Character> paramComparator) {
    long l = d ^ 0x13F4EEAB035EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) < 0)
        c = c1; 
    } 
    return c;
  }
  
  public static final Object reduceRight(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x7CBADC11A6CEL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object;
    for (object = paramArrayOfObject[i--]; i >= 0; object = paramFunction2.invoke(paramArrayOfObject[i--], object));
    return object;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull double[] paramArrayOfdouble, @NotNull Comparator paramComparator) {
    long l = d ^ 0x4C1D25232A55L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Double[] arrayOfDouble1 = ArraysKt.toTypedArray(paramArrayOfdouble);
    Double[] arrayOfDouble2 = arrayOfDouble1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfDouble2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfDouble1);
  }
  
  @NotNull
  public static final Map groupBy(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x468E8A73A2F0L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfFloat.length;
    while (b < i) {
      float f = arrayOfFloat[b];
      Object object1 = paramFunction1.invoke(Float.valueOf(f));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Float> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Float.valueOf(f));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 33210100364033
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: faload
    //   71: fstore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: fload #13
    //   80: fstore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: fload #14
    //   95: invokestatic valueOf : (F)Ljava/lang/Float;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: fload #14
    //   116: invokestatic valueOf : (F)Ljava/lang/Float;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x400D85552692L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return object; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x1EC23DBCD621L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfbyte, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfbyte.length)));
  }
  
  @NotNull
  public static final List zip(@NotNull char[] paramArrayOfchar, @NotNull Iterable paramIterable) {
    long l = d ^ 0x11354A893A60L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    char[] arrayOfChar = paramArrayOfchar;
    boolean bool = false;
    int i = arrayOfChar.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        char c = arrayOfChar[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Character.valueOf(c), object1));
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final byte[] toByteArray(@NotNull Byte[] paramArrayOfByte) {
    long l = d ^ 0x5E3C50ACFBE4L;
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "<this>");
    byte b = 0;
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[i];
    while (b < i) {
      byte b1 = b;
      arrayOfByte[b1] = paramArrayOfByte[b1].byteValue();
      b++;
    } 
    return arrayOfByte;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float minByOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7A3A8041092CL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i == 0)
        return Float.valueOf(f); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Float.valueOf(f));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      float f1 = paramArrayOffloat[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Float.valueOf(f1));
      if (comparable.compareTo(comparable1) > 0) {
        f = f1;
        comparable = comparable1;
      } 
    } 
    return Float.valueOf(f);
  }
  
  @Nullable
  public static final Boolean lastOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4CDF993B1495L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfboolean.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        boolean bool1 = paramArrayOfboolean[j];
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return Boolean.valueOf(bool1); 
      } while (0 <= i); 
    return null;
  }
  
  public static final Object last(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x6950B00F535L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfObject[ArraysKt.getLastIndex(paramArrayOfObject)];
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x59202D4EA9C4L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$8(paramArrayOfboolean));
  }
  
  @SinceKotlin(version = "1.7")
  public static final short minWithOrThrow(@NotNull short[] paramArrayOfshort, @NotNull Comparator<Short> paramComparator) {
    long l = d ^ 0x3BC271614FA0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (paramComparator.compare(Short.valueOf(s), Short.valueOf(s1)) > 0)
        s = s1; 
    } 
    return s;
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x18EDB3C42EDEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4(paramArrayOfint);
  }
  
  public static final double averageOfShort(@NotNull Short[] paramArrayOfShort) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 39171895000040
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 58
    //   33: aload_0
    //   34: iload #6
    //   36: aaload
    //   37: invokevirtual shortValue : ()S
    //   40: istore #8
    //   42: dload_3
    //   43: iload #8
    //   45: i2d
    //   46: dadd
    //   47: dstore_3
    //   48: iinc #5, 1
    //   51: nop
    //   52: iinc #6, 1
    //   55: goto -> 26
    //   58: iload #5
    //   60: ifne -> 73
    //   63: ldc2_w NaN
    //   66: goto -> 78
    //   69: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   72: athrow
    //   73: dload_3
    //   74: iload #5
    //   76: i2d
    //   77: ddiv
    //   78: dreturn
    // Exception table:
    //   from	to	target	type
    //   58	69	69	java/util/NoSuchElementException
  }
  
  public static final Object fold(@NotNull long[] paramArrayOflong, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xA034764215DL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      object = paramFunction2.invoke(object, Long.valueOf(l1));
      b++;
    } 
    return object;
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x69D7625D99D3L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Short.valueOf(paramArrayOfshort[i]))).booleanValue())
              return ArraysKt.take(paramArrayOfshort, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull long[] paramArrayOflong, @NotNull Collection<Long> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x504AFC15E520L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          paramCollection.add(Long.valueOf(l1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Pair partition(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x550F8F7B381AL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Boolean> arrayList1 = new ArrayList();
    ArrayList<Boolean> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue()) {
          arrayList1.add(Boolean.valueOf(bool1));
        } else {
          arrayList2.add(Boolean.valueOf(bool1));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @NotNull
  public static final List zip(@NotNull double[] paramArrayOfdouble, @NotNull Iterable paramIterable) {
    long l = d ^ 0x5F04163408FEL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    double[] arrayOfDouble = paramArrayOfdouble;
    boolean bool = false;
    int i = arrayOfDouble.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        double d = arrayOfDouble[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Double.valueOf(d), object1));
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set union(@NotNull boolean[] paramArrayOfboolean, @NotNull Iterable paramIterable) {
    long l = d ^ 0x7595DD424D6CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfboolean);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List takeLast(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = d ^ 0x48672E3CEF0BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfshort.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfshort); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Short.valueOf(paramArrayOfshort[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Short> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Short.valueOf(paramArrayOfshort[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x9072ACF9CBFL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Double> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      Object object = paramFunction1.invoke(Double.valueOf(d));
      try {
        if (hashSet.add(object))
          arrayList.add(Double.valueOf(d)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateTo(@NotNull short[] paramArrayOfshort, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2D0332DFA2B4L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Short.valueOf(s));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List flatMap(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4E4508999A2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfShort.length;
    while (b < i) {
      short s = arrayOfShort[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Short.valueOf(s));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List toList(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x47FE9B4D89A7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      switch (paramArrayOflong.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOflong);
  }
  
  public static final void forEachIndexed(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4A8B686DC15L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfboolean.length;
    while (b2 < i) {
      boolean bool1 = paramArrayOfboolean[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Boolean.valueOf(bool1));
      b2++;
    } 
  }
  
  public static final float reduce(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3886AC1DE98L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      f = ((Number)paramFunction2.invoke(Float.valueOf(f), Float.valueOf(paramArrayOffloat[i]))).floatValue();
    } 
    return f;
  }
  
  public static final Object foldIndexed(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x5A39906404CDL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfObject.length;
    while (b2 < i) {
      Object object1 = paramArrayOfObject[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, object1);
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final long[] sortedArrayDescending(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x2626D259AB96L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return paramArrayOflong; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = Arrays.copyOf(paramArrayOflong, paramArrayOflong.length);
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfLong2);
    return arrayOfLong1;
  }
  
  public static final char single(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3F07F03EEFE0L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Character character = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          character = Character.valueOf(c);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(character, "null cannot be cast to non-null type kotlin.Char");
    return character.charValue();
  }
  
  @NotNull
  public static final List map(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x28C2129E15A4L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfboolean.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfBoolean.length;
    while (b < i) {
      boolean bool = arrayOfBoolean[b];
      arrayList.add(paramFunction1.invoke(Boolean.valueOf(bool)));
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object maxWithOrThrow(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<Object> paramComparator) {
    long l = d ^ 0x7FD2A1FEA40CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Object object1 = paramArrayOfObject[i];
      if (paramComparator.compare(object, object1) < 0)
        object = object1; 
    } 
    return object;
  }
  
  public static final byte first(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x17999600096BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          return b1; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.7")
  public static final short maxByOrThrow(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5DD370253EB0L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i == 0)
        return s; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Short.valueOf(s));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      short s1 = paramArrayOfshort[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Short.valueOf(s1));
      if (comparable.compareTo(comparable1) < 0) {
        s = s1;
        comparable = comparable1;
      } 
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull boolean[] paramArrayOfboolean, int paramInt1, int paramInt2) {
    long l = d ^ 0x2E23B10BA01CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfboolean.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      boolean bool = paramArrayOfboolean[k];
      paramArrayOfboolean[k] = paramArrayOfboolean[j];
      paramArrayOfboolean[j] = bool;
      j--;
    } 
  }
  
  @NotNull
  public static final Map associateBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x508E22AC5336L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfObject.length), 16);
    Object[] arrayOfObject = paramArrayOfObject;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfObject.length;
    while (b < j) {
      Object object = arrayOfObject[b];
      linkedHashMap.put(paramFunction11.invoke(object), paramFunction12.invoke(object));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final int sumOfByte(@NotNull Byte[] paramArrayOfByte) {
    long l = d ^ 0x2C1B919DF1D4L;
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfByte.length;
    while (b < j) {
      byte b1 = paramArrayOfByte[b].byteValue();
      i += b1;
      b++;
    } 
    return i;
  }
  
  public static final double average(@NotNull long[] paramArrayOflong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 20109545070893
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 55
    //   33: aload_0
    //   34: iload #6
    //   36: laload
    //   37: lstore #8
    //   39: dload_3
    //   40: lload #8
    //   42: l2d
    //   43: dadd
    //   44: dstore_3
    //   45: iinc #5, 1
    //   48: nop
    //   49: iinc #6, 1
    //   52: goto -> 26
    //   55: iload #5
    //   57: ifne -> 70
    //   60: ldc2_w NaN
    //   63: goto -> 75
    //   66: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   69: athrow
    //   70: dload_3
    //   71: iload #5
    //   73: i2d
    //   74: ddiv
    //   75: dreturn
    // Exception table:
    //   from	to	target	type
    //   55	66	66	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map associateBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x28EFD5F0C5EFL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfboolean.length), 16);
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfBoolean.length;
    while (b < j) {
      boolean bool = arrayOfBoolean[b];
      linkedHashMap.put(paramFunction1.invoke(Boolean.valueOf(bool)), Boolean.valueOf(bool));
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningFoldIndexed(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x2E13D07833E8L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.listOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList2 = new ArrayList(paramArrayOfObject.length + 1);
    ArrayList<Object> arrayList3 = arrayList2;
    int i = 0;
    arrayList3.add(paramObject);
    ArrayList<Object> arrayList1 = arrayList2;
    Object object = paramObject;
    byte b = 0;
    i = paramArrayOfObject.length;
    while (b < i) {
      object = paramFunction3.invoke(Integer.valueOf(b), object, paramArrayOfObject[b]);
      arrayList1.add(object);
      b++;
    } 
    return arrayList1;
  }
  
  public static final int indexOfLast(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5AEA319B53CFL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfObject.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(paramArrayOfObject[j])).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull byte[] paramArrayOfbyte, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x5AED39F9994BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      Object object1 = paramFunction11.invoke(Byte.valueOf(b1));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Byte.valueOf(b1)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull int[] paramArrayOfint, @NotNull Comparator paramComparator) {
    long l = d ^ 0x5EF6FF686499L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Integer[] arrayOfInteger1 = ArraysKt.toTypedArray(paramArrayOfint);
    Integer[] arrayOfInteger2 = arrayOfInteger1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfInteger2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfInteger1);
  }
  
  @SinceKotlin(version = "1.7")
  public static final float maxOrThrow(@NotNull Float[] paramArrayOfFloat) {
    long l = d ^ 0x3E0B354C054L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfFloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfFloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOfFloat[0].floatValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfFloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOfFloat[i].floatValue();
      f = Math.max(f, f1);
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Boolean maxByOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3889D2E26413L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i == 0)
        return Boolean.valueOf(bool1); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool1));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      boolean bool2 = paramArrayOfboolean[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool2));
      if (comparable.compareTo(comparable1) < 0) {
        bool1 = bool2;
        comparable = comparable1;
      } 
    } 
    return Boolean.valueOf(bool1);
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull float[] paramArrayOffloat, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 109428373418308
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: faload
    //   81: fstore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: fload #13
    //   143: invokestatic valueOf : (F)Ljava/lang/Float;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: fload #13
    //   170: invokestatic valueOf : (F)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x6508695B316EL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$9(paramArrayOfchar));
  }
  
  @Nullable
  public static final Long firstOrNull(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3FF0506CD8BL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return Long.valueOf(l1); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull char[] paramArrayOfchar, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x20FFFFBA6B35L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      Object object1 = paramFunction11.invoke(Character.valueOf(c));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Character.valueOf(c)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x3B21461E4377L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOflong));
  }
  
  public static final float reduceRightIndexed(@NotNull float[] paramArrayOffloat, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x1A5F036526BEL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[i--];
    while (i >= 0) {
      f = ((Number)paramFunction3.invoke(Integer.valueOf(i), Float.valueOf(paramArrayOffloat[i]), Float.valueOf(f))).floatValue();
      i--;
    } 
    return f;
  }
  
  @NotNull
  public static final Set subtract(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = d ^ 0x56FEF7142ECAL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfbyte);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List dropWhile(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2D40D5BC039L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Long> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (bool2) {
          arrayList.add(Long.valueOf(l1));
        } else if (!((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue()) {
          arrayList.add(Long.valueOf(l1));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Float lastOrNull(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x7CBFDAF12A3AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOffloat.length == 0)) ? null : Float.valueOf(paramArrayOffloat[paramArrayOffloat.length - 1]);
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 66228155322391
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: caload
    //   71: istore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: iload #13
    //   80: istore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: iload #14
    //   95: invokestatic valueOf : (C)Ljava/lang/Character;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: iload #14
    //   116: invokestatic valueOf : (C)Ljava/lang/Character;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @Nullable
  public static final Byte lastOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x61DB9561C2F0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfbyte.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        byte b = paramArrayOfbyte[j];
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b))).booleanValue())
          return Byte.valueOf(b); 
      } while (0 <= i); 
    return null;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x21015641F80BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object1 = arrayOfObject[b];
      Object object2 = paramFunction1.invoke(object1);
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object3 = linkedHashMap1.get(object2);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object2, arrayList);
      List<Object> list = (object3 == null) ? arrayList : (List)object3;
      list.add(object1);
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull long[] paramArrayOflong, @NotNull Collection<Long> paramCollection) {
    long l = d ^ 0x5487E48AB1D5L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      paramCollection.add(Long.valueOf(l1));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final boolean[] sliceArray(@NotNull boolean[] paramArrayOfboolean, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x2A61A4128873L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new boolean[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfBoolean, i, j);
  }
  
  @SinceKotlin(version = "1.3")
  public static final float random(@NotNull float[] paramArrayOffloat, @NotNull Random paramRandom) {
    long l = d ^ 0x66F441B84DCBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOffloat[paramRandom.nextInt(paramArrayOffloat.length)];
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x2E5F0A3F269DL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfdouble, paramArrayOfdouble.length), "copyOf(this, size)");
    double[] arrayOfDouble1 = Arrays.copyOf(paramArrayOfdouble, paramArrayOfdouble.length);
    double[] arrayOfDouble2 = arrayOfDouble1;
    boolean bool = false;
    ArraysKt.sort(arrayOfDouble2);
    return ArraysKt.reversed(arrayOfDouble1);
  }
  
  public static final Object foldIndexed(@NotNull double[] paramArrayOfdouble, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x585E3B1D01A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfdouble.length;
    while (b2 < i) {
      double d = paramArrayOfdouble[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Double.valueOf(d));
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final List distinctBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5BBB1D6C9FD9L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Object> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      Object object2 = paramFunction1.invoke(object1);
      try {
        if (hashSet.add(object2))
          arrayList.add(object1); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer minOrNull(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x7CFDFAC054C8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (i > k)
        i = k; 
    } 
    return Integer.valueOf(i);
  }
  
  @SinceKotlin(version = "1.7")
  public static final double minOrThrow(@NotNull Double[] paramArrayOfDouble) {
    long l = d ^ 0x2EEE8292BC14L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfDouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfDouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfDouble[0].doubleValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfDouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfDouble[i].doubleValue();
      d = Math.min(d, d1);
    } 
    return d;
  }
  
  @NotNull
  public static final Comparable[] sortedArrayDescending(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x428983CDE680L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfComparable.length == 0))
        return paramArrayOfComparable; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfComparable, paramArrayOfComparable.length), "copyOf(this, size)");
    Comparable[] arrayOfComparable1 = Arrays.copyOf(paramArrayOfComparable, paramArrayOfComparable.length);
    Comparable[] arrayOfComparable2 = arrayOfComparable1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfComparable2, ComparisonsKt.reverseOrder());
    return arrayOfComparable1;
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x196A1F3C8964L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Boolean.valueOf(bool1));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull short[] paramArrayOfshort, @NotNull Comparator paramComparator) {
    long l = d ^ 0x4030752C8EF8L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Short[] arrayOfShort1 = ArraysKt.toTypedArray(paramArrayOfshort);
    Short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfShort2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfShort1);
  }
  
  public static final void sortDescending(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x4CAD3DDE53EDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      if (paramArrayOflong.length > 1) {
        ArraysKt.sort(paramArrayOflong);
        ArraysKt.reverse(paramArrayOflong);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public static final float last(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x622EF2ECECEL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOffloat.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        float f = paramArrayOffloat[j];
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return f; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x58B34F751CAFL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOffloat, paramArrayOffloat.length), "copyOf(this, size)");
    float[] arrayOfFloat1 = Arrays.copyOf(paramArrayOffloat, paramArrayOffloat.length);
    float[] arrayOfFloat2 = arrayOfFloat1;
    boolean bool = false;
    ArraysKt.sort(arrayOfFloat2);
    return ArraysKt.reversed(arrayOfFloat1);
  }
  
  @NotNull
  public static final List slice(@NotNull char[] paramArrayOfchar, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x1E660ABE0493L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char[] arrayOfChar = paramArrayOfchar;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfChar, i, j));
  }
  
  @Nullable
  public static final Integer firstOrNull(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3C1C634A7502L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          return Integer.valueOf(j); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
    long l = d ^ 0x6C079BC6F248L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    ArraysKt.sort(paramArrayOfdouble, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfdouble, paramInt1, paramInt2);
  }
  
  public static final Object foldRightIndexed(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x48582D1092BEL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), paramArrayOfObject[i], object);
      i--;
    } 
    return object;
  }
  
  public static final Object foldRightIndexed(@NotNull byte[] paramArrayOfbyte, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x609A1E3297EDL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Byte.valueOf(paramArrayOfbyte[i]), object);
      i--;
    } 
    return object;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3CF710904092L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      d += ((Number)paramFunction1.invoke(Integer.valueOf(j))).doubleValue();
      b++;
    } 
    return d;
  }
  
  @Nullable
  public static final Integer singleOrNull(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x1088D5BF48EFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfint.length == 1) ? Integer.valueOf(paramArrayOfint[0]) : null;
  }
  
  @NotNull
  public static final List zip(@NotNull char[] paramArrayOfchar1, @NotNull char[] paramArrayOfchar2) {
    long l = d ^ 0x51A51D779613L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfchar2, "other");
    char[] arrayOfChar = paramArrayOfchar1;
    boolean bool = false;
    int i = Math.min(arrayOfChar.length, paramArrayOfchar2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      char c1 = paramArrayOfchar2[b];
      char c2 = arrayOfChar[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Character.valueOf(c2), Character.valueOf(c1)));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x425218702069L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (!((Boolean)paramFunction1.invoke(object)).booleanValue())
          paramCollection.add(object); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List slice(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = d ^ 0x2D76F467C507L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Byte> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Byte.valueOf(paramArrayOfbyte[j]));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x2CAB7D66EBF6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfbyte));
  }
  
  @NotNull
  public static final Object[] requireNoNulls(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x540757C6DB91L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (object == null)
          throw new IllegalArgumentException("null element found in " + paramArrayOfObject + '.'); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramArrayOfObject;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object reduceRightIndexedOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x4BEE9C8090ADL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[i--];
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), paramArrayOfObject[i], object);
      i--;
    } 
    return object;
  }
  
  public static final long last(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x373B74F380A3L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOflong.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        long l1 = paramArrayOflong[j];
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return l1; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List zip(@NotNull short[] paramArrayOfshort, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x472127E33489L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    short[] arrayOfShort = paramArrayOfshort;
    boolean bool = false;
    int i = Math.min(arrayOfShort.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      short s = arrayOfShort[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Short.valueOf(s), object));
    } 
    return arrayList;
  }
  
  public static final int indexOfFirst(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1F5C5FB03311L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(paramArrayOfObject[b])).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x69D36E2A32B2L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      d += ((Number)paramFunction1.invoke(Float.valueOf(f))).doubleValue();
      b++;
    } 
    return d;
  }
  
  public static final double single(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x63462E97A947L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      switch (paramArrayOfdouble.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float maxByOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x66D79CFADE45L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i == 0)
        return Float.valueOf(f); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Float.valueOf(f));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      float f1 = paramArrayOffloat[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Float.valueOf(f1));
      if (comparable.compareTo(comparable1) < 0) {
        f = f1;
        comparable = comparable1;
      } 
    } 
    return Float.valueOf(f);
  }
  
  public static final float first(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x2AF6A164375AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOffloat[0];
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object reduceOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x50ECE6E89C67L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      object = paramFunction2.invoke(object, paramArrayOfObject[i]);
    } 
    return object;
  }
  
  @NotNull
  public static final Map associate(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x46177B29775L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfdouble.length), 16);
    double[] arrayOfDouble = paramArrayOfdouble;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfDouble.length;
    while (b < j) {
      double d = arrayOfDouble[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Double.valueOf(d));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final int count(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5EBE38CEE609L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfdouble.length;
    while (b2 < i) {
      double d = paramArrayOfdouble[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @NotNull
  public static final Set subtract(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = d ^ 0x250A15CA3FE9L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOflong);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5E94EFFA84DDL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfboolean.length;
    while (b < j) {
      boolean bool1 = paramArrayOfboolean[b];
      i += ((Number)paramFunction1.invoke(Boolean.valueOf(bool1))).intValue();
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Integer reduceRightOrNull(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6F7EB3200CD0L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j;
    for (j = paramArrayOfint[i--]; i >= 0; j = ((Number)paramFunction2.invoke(Integer.valueOf(paramArrayOfint[i--]), Integer.valueOf(j))).intValue());
    return Integer.valueOf(j);
  }
  
  @NotNull
  public static final List zip(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xCF8266750ADL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfbyte1.length, paramArrayOfbyte2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Byte.valueOf(paramArrayOfbyte1[b]), Byte.valueOf(paramArrayOfbyte2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6A400FD5BC4L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(paramArrayOfObject[i])).booleanValue())
              return ArraysKt.take(paramArrayOfObject, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7C03C24772E7L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfint, (Comparator)new Object(paramFunction1));
  }
  
  public static final double averageOfInt(@NotNull Integer[] paramArrayOfInteger) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 83276009991540
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 58
    //   33: aload_0
    //   34: iload #6
    //   36: aaload
    //   37: invokevirtual intValue : ()I
    //   40: istore #8
    //   42: dload_3
    //   43: iload #8
    //   45: i2d
    //   46: dadd
    //   47: dstore_3
    //   48: iinc #5, 1
    //   51: nop
    //   52: iinc #6, 1
    //   55: goto -> 26
    //   58: iload #5
    //   60: ifne -> 73
    //   63: ldc2_w NaN
    //   66: goto -> 78
    //   69: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   72: athrow
    //   73: dload_3
    //   74: iload #5
    //   76: i2d
    //   77: ddiv
    //   78: dreturn
    // Exception table:
    //   from	to	target	type
    //   58	69	69	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List map(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x467E95645FD7L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfbyte.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfByte.length;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      arrayList.add(paramFunction1.invoke(Byte.valueOf(b1)));
      b++;
    } 
    return arrayList;
  }
  
  public static final Object foldRightIndexed(@NotNull char[] paramArrayOfchar, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x2594407F32FEL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(paramArrayOfchar[i]), object);
      i--;
    } 
    return object;
  }
  
  public static final Object foldRight(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x25A568D3EB57L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(paramArrayOfObject[i--], object));
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long minWithOrThrow(@NotNull long[] paramArrayOflong, @NotNull Comparator<Long> paramComparator) {
    long l1 = d ^ 0x3DC7CC190C78L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (paramComparator.compare(Long.valueOf(l2), Long.valueOf(l)) > 0)
        l2 = l; 
    } 
    return l2;
  }
  
  @NotNull
  public static final List zip(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2B8814399454L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOflong.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Long.valueOf(paramArrayOflong[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3424E86BA9A7L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfint.length;
    while (b < j) {
      int k = paramArrayOfint[b];
      i += ((Number)paramFunction1.invoke(Integer.valueOf(k))).intValue();
      b++;
    } 
    return i;
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull byte[] paramArrayOfbyte, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 929390504247
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: baload
    //   81: istore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: iload #13
    //   143: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: iload #13
    //   170: invokestatic valueOf : (I)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull double[] paramArrayOfdouble, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x732755867B83L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      Object object1 = paramFunction1.invoke(Double.valueOf(d));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Double> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Double.valueOf(d));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x443B3E55C48EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfshort));
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull short[] paramArrayOfshort, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x68B43A61C1F4L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      Object object1 = paramFunction11.invoke(Short.valueOf(s));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Short.valueOf(s)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x6A847D041009L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    ArrayList<Byte> arrayList = new ArrayList(paramArrayOfbyte.length);
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      arrayList.add(Byte.valueOf(b1));
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer maxByOrNull(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5FE31AAF909AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    int j = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (j == 0)
        return Integer.valueOf(i); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Integer.valueOf(i));
    IntIterator intIterator = (new IntRange(1, j)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      int m = paramArrayOfint[k];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Integer.valueOf(m));
      if (comparable.compareTo(comparable1) < 0) {
        i = m;
        comparable = comparable1;
      } 
    } 
    return Integer.valueOf(i);
  }
  
  @NotNull
  public static final boolean[] reversedArray(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x5EC381D3025L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return paramArrayOfboolean; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean[] arrayOfBoolean = new boolean[paramArrayOfboolean.length];
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfBoolean[i - j] = paramArrayOfboolean[j];
    } 
    return arrayOfBoolean;
  }
  
  @NotNull
  public static final String joinToString(@NotNull byte[] paramArrayOfbyte, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x75D9547AB5ACL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfbyte, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfbyte, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @NotNull
  public static final Map groupBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x78000D346675L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      int j = arrayOfInt[b];
      Object object1 = paramFunction11.invoke(Integer.valueOf(j));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Integer.valueOf(j)));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final void forEach(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5BA9A528D5EL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      paramFunction1.invoke(Character.valueOf(c));
      b++;
    } 
  }
  
  public static final boolean any(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x43A47A7A4896L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  public static final void forEachIndexed(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5C8651E985A2L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOffloat.length;
    while (b2 < i) {
      float f = paramArrayOffloat[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Float.valueOf(f));
      b2++;
    } 
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull double[] paramArrayOfdouble, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x7DDCB5E618DBL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      paramMap.put(paramFunction11.invoke(Double.valueOf(d)), paramFunction12.invoke(Double.valueOf(d)));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 31484665355137
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: laload
    //   71: lstore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: lload #13
    //   80: lstore #15
    //   82: istore #17
    //   84: iconst_0
    //   85: istore #18
    //   87: aload_1
    //   88: iload #17
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: lload #15
    //   95: invokestatic valueOf : (J)Ljava/lang/Long;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: lload #15
    //   116: invokestatic valueOf : (J)Ljava/lang/Long;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x795BF6505BB6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    ArraysKt.shuffle(paramArrayOflong, (Random)Random.Default);
  }
  
  public static final Object foldIndexed(@NotNull int[] paramArrayOfint, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x1A48C4D60CCBL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOfint.length;
    while (b2 < i) {
      int j = paramArrayOfint[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Integer.valueOf(j));
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final Pair partition(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x59F344A7E699L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Object> arrayList1 = new ArrayList();
    ArrayList<Object> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue()) {
          arrayList1.add(object);
        } else {
          arrayList2.add(object);
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  public static final byte last(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x4A63AB6B8699L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfbyte[ArraysKt.getLastIndex(paramArrayOfbyte)];
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 30141572675504
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: baload
    //   71: istore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: iload #13
    //   80: istore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: iload #14
    //   95: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: iload #14
    //   116: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Float randomOrNull(@NotNull float[] paramArrayOffloat, @NotNull Random paramRandom) {
    long l = d ^ 0x3DB7DE18E109L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Float.valueOf(paramArrayOffloat[paramRandom.nextInt(paramArrayOffloat.length)]);
  }
  
  public static final int single(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x7C0A9FF30E94L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      switch (paramArrayOfint.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2C22A03B8DDAL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      paramCollection.add(paramFunction1.invoke(Boolean.valueOf(bool1)));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x6FCD0BFC9DACL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$1(paramArrayOfObject));
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5747FF898BD3L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      d += ((Number)paramFunction1.invoke(Character.valueOf(c))).doubleValue();
      b++;
    } 
    return d;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x7356E6E66968L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    ArrayList<Character> arrayList = new ArrayList(paramArrayOfchar.length);
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      arrayList.add(Character.valueOf(c));
      b++;
    } 
    return arrayList;
  }
  
  public static final int lastIndexOf(@NotNull boolean[] paramArrayOfboolean, boolean paramBoolean) {
    long l = d ^ 0x62C02797E1FCL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    int i = paramArrayOfboolean.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (paramBoolean == paramArrayOfboolean[j])
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final Set toSet(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x3A872552D5A2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      switch (paramArrayOfint.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfint, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfint.length)));
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull short[] paramArrayOfshort, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6AC4D929303BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      paramCollection.add(paramFunction1.invoke(Short.valueOf(s)));
      b++;
    } 
    return paramCollection;
  }
  
  public static final int getLastIndex(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x34259E3ADB04L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return paramArrayOfObject.length - 1;
  }
  
  public static final double sum(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x7BD0500D7A05L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d1 = paramArrayOfdouble[b];
      d += d1;
      b++;
    } 
    return d;
  }
  
  public static final boolean any(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x542EF7D1E00FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfdouble.length == 0) ? 1 : 0);
  }
  
  public static final boolean none(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x5EDF92A61986L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfdouble.length == 0);
  }
  
  @NotNull
  public static final List zip(@NotNull double[] paramArrayOfdouble1, @NotNull double[] paramArrayOfdouble2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x66DE57E5E85DL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfdouble2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfdouble1.length, paramArrayOfdouble2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Double.valueOf(paramArrayOfdouble1[b]), Double.valueOf(paramArrayOfdouble2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  public static final void forEach(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x29731DE41C2FL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      paramFunction1.invoke(object);
      b++;
    } 
  }
  
  @NotNull
  public static final String joinToString(@NotNull boolean[] paramArrayOfboolean, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x1111AA9D5BDAL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfboolean, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfboolean, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character minWithOrNull(@NotNull char[] paramArrayOfchar, @NotNull Comparator<Character> paramComparator) {
    long l = d ^ 0x3CDA0D98C73AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) > 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final Set intersect(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = d ^ 0x76D89D21D9B6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOflong);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List distinct(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x1811AE65F090L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfint));
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x75743D82021DL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfObject));
  }
  
  public static final int reduceIndexed(@NotNull int[] paramArrayOfint, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x2B39F1F10135L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      i = ((Number)paramFunction3.invoke(Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramArrayOfint[j]))).intValue();
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer minWithOrNull(@NotNull int[] paramArrayOfint, @NotNull Comparator<Integer> paramComparator) {
    long l = d ^ 0x329E5362E8C9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (paramComparator.compare(Integer.valueOf(i), Integer.valueOf(k)) > 0)
        i = k; 
    } 
    return Integer.valueOf(i);
  }
  
  @SinceKotlin(version = "1.7")
  public static final int minByOrThrow(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x70200E138EA3L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    int j = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (j == 0)
        return i; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Integer.valueOf(i));
    IntIterator intIterator = (new IntRange(1, j)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      int m = paramArrayOfint[k];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Integer.valueOf(m));
      if (comparable.compareTo(comparable1) > 0) {
        i = m;
        comparable = comparable1;
      } 
    } 
    return i;
  }
  
  @Nullable
  public static final Byte singleOrNull(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x58CAB0C19572L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfbyte.length == 1) ? Byte.valueOf(paramArrayOfbyte[0]) : null;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double reduceRightIndexedOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x266C278A977BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[i--];
    while (i >= 0) {
      d = ((Number)paramFunction3.invoke(Integer.valueOf(i), Double.valueOf(paramArrayOfdouble[i]), Double.valueOf(d))).doubleValue();
      i--;
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final float[] sortedArrayDescending(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x135ED02351F9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return paramArrayOffloat; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOffloat, paramArrayOffloat.length), "copyOf(this, size)");
    float[] arrayOfFloat1 = Arrays.copyOf(paramArrayOffloat, paramArrayOffloat.length);
    float[] arrayOfFloat2 = arrayOfFloat1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfFloat2);
    return arrayOfFloat1;
  }
  
  @NotNull
  public static final List zip(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = d ^ 0x4110B3B081B5L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    int i = arrayOfLong.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        long l1 = arrayOfLong[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Long.valueOf(l1), object1));
      } 
    } 
    return arrayList;
  }
  
  public static final short reduceRight(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x7C4C4A9EA7C3L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s;
    for (s = paramArrayOfshort[i--]; i >= 0; s = ((Number)paramFunction2.invoke(Short.valueOf(paramArrayOfshort[i--]), Short.valueOf(s))).shortValue());
    return s;
  }
  
  @NotNull
  public static final List slice(@NotNull float[] paramArrayOffloat, @NotNull IntRange paramIntRange) {
    long l = d ^ 0xAF95D934844L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float[] arrayOfFloat = paramArrayOffloat;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfFloat, i, j));
  }
  
  @NotNull
  public static final Map associateTo(@NotNull long[] paramArrayOflong, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x303C006AEC03L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Long.valueOf(l1));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List distinct(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x1357475586A4L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfshort));
  }
  
  @Nullable
  public static final Double singleOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7B9F3E5C6442L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Double double_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          double_ = Double.valueOf(d);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return double_;
  }
  
  public static final byte reduceRightIndexed(@NotNull byte[] paramArrayOfbyte, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x3467A3E0A135L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[i--];
    while (i >= 0) {
      b = ((Number)paramFunction3.invoke(Integer.valueOf(i), Byte.valueOf(paramArrayOfbyte[i]), Byte.valueOf(b))).byteValue();
      i--;
    } 
    return b;
  }
  
  public static final boolean reduce(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x12C2E75E54F7L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      bool1 = ((Boolean)paramFunction2.invoke(Boolean.valueOf(bool1), Boolean.valueOf(paramArrayOfboolean[i]))).booleanValue();
    } 
    return bool1;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List scan(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x57326EABE510L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    boolean bool2 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      ArrayList<Object> arrayList1 = new ArrayList(arrayOfObject.length + 1);
      ArrayList<Object> arrayList2 = arrayList1;
      int i = 0;
      arrayList2.add(paramObject);
      ArrayList<Object> arrayList3 = arrayList1;
      Object object = paramObject;
      byte b = 0;
      i = arrayOfObject.length;
      while (b < i) {
        Object object1 = arrayOfObject[b];
        object = paramFunction2.invoke(object, object1);
        arrayList3.add(object);
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((arrayOfObject.length == 0)) ? CollectionsKt.listOf(paramObject) : arrayList3;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x5E0BC3CDE122L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    ArraysKt.shuffle(paramArrayOfint, (Random)Random.Default);
  }
  
  @NotNull
  public static final List takeLast(@NotNull double[] paramArrayOfdouble, int paramInt) {
    long l = d ^ 0x649D0DC560AFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfdouble.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfdouble); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Double.valueOf(paramArrayOfdouble[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Double> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Double.valueOf(paramArrayOfdouble[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  public static final void forEach(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xF313437F076L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      paramFunction1.invoke(Float.valueOf(f));
      b++;
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Boolean reduceRightIndexedOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x47A6503E37A7L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[i--];
    while (i >= 0) {
      bool1 = ((Boolean)paramFunction3.invoke(Integer.valueOf(i), Boolean.valueOf(paramArrayOfboolean[i]), Boolean.valueOf(bool1))).booleanValue();
      i--;
    } 
    return Boolean.valueOf(bool1);
  }
  
  @NotNull
  public static final Map associate(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3E05955B7E49L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfchar.length), 16);
    char[] arrayOfChar = paramArrayOfchar;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfChar.length;
    while (b < j) {
      char c = arrayOfChar[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Character.valueOf(c));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4E0AEE89950L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfdouble, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List distinctBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x79FACD9B3731L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Short> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      Object object = paramFunction1.invoke(Short.valueOf(s));
      try {
        if (hashSet.add(object))
          arrayList.add(Short.valueOf(s)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Boolean singleOrNull(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x759238E9C9ECL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfboolean.length == 1) ? Boolean.valueOf(paramArrayOfboolean[0]) : null;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x3E87278C0D7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(paramArrayOfObject);
  }
  
  @NotNull
  public static final List take(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = d ^ 0x4126381D1720L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOflong.length)
        return ArraysKt.toList(paramArrayOflong); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Long.valueOf(paramArrayOflong[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Long> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOflong.length;
    while (b2 < i) {
      long l1 = paramArrayOflong[b2];
      try {
        arrayList.add(Long.valueOf(l1));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Object firstOrNull(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x5E00B84A814L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfObject.length == 0)) ? null : paramArrayOfObject[0];
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull float[] paramArrayOffloat, @NotNull Collection<Float> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3CEB49BBF697L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          paramCollection.add(Float.valueOf(f)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x3FE24F98C46BL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = Arrays.copyOf(paramArrayOflong, paramArrayOflong.length);
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    ArraysKt.sort(arrayOfLong2);
    return ArraysKt.reversed(arrayOfLong1);
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6FC951F35007L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfdouble, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x147EA661A125L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfObject, new HashSet(MapsKt.mapCapacity(paramArrayOfObject.length)));
  }
  
  public static final int indexOf(@NotNull byte[] paramArrayOfbyte, byte paramByte) {
    long l = d ^ 0x5BD818AD5643L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (paramByte == paramArrayOfbyte[b])
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final List take(@NotNull double[] paramArrayOfdouble, int paramInt) {
    long l = d ^ 0x7433E547FD08L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfdouble.length)
        return ArraysKt.toList(paramArrayOfdouble); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Double.valueOf(paramArrayOfdouble[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Double> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfdouble.length;
    while (b2 < i) {
      double d = paramArrayOfdouble[b2];
      try {
        arrayList.add(Double.valueOf(d));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long maxByOrThrow(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l1 = d ^ 0x2BEACC9AD666L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i == 0)
        return l2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Long.valueOf(l2));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      long l = paramArrayOflong[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Long.valueOf(l));
      if (comparable.compareTo(comparable1) < 0) {
        l2 = l;
        comparable = comparable1;
      } 
    } 
    return l2;
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x391F7141B754L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$6(paramArrayOffloat));
  }
  
  public static final boolean all(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x490773346D4DL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection<Boolean> paramCollection) {
    long l = d ^ 0x2DF3496D256L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool = paramArrayOfboolean[b];
      paramCollection.add(Boolean.valueOf(bool));
      b++;
    } 
    return paramCollection;
  }
  
  public static final Object foldRight(@NotNull long[] paramArrayOflong, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5C553D0822CEL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Long.valueOf(paramArrayOflong[i--]), object));
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull float[] paramArrayOffloat, @NotNull Random paramRandom) {
    long l = d ^ 0x17A71FC9948CL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOffloat); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      float f = paramArrayOffloat[i];
      paramArrayOffloat[i] = paramArrayOffloat[j];
      paramArrayOffloat[j] = f;
    } 
  }
  
  @Nullable
  public static final Boolean getOrNull(@NotNull boolean[] paramArrayOfboolean, int paramInt) {
    long l = d ^ 0x19D1C9CF68FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfboolean));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull short[] paramArrayOfshort, @NotNull Collection<Short> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5E5BF95EF001L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          paramCollection.add(Short.valueOf(s)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final double[] sliceArray(@NotNull double[] paramArrayOfdouble, @NotNull Collection paramCollection) {
    long l = d ^ 0x6ED7D50C6C5L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    double[] arrayOfDouble = new double[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfDouble[b++] = paramArrayOfdouble[i];
    } 
    return arrayOfDouble;
  }
  
  @NotNull
  public static final Set subtract(@NotNull float[] paramArrayOffloat, @NotNull Iterable paramIterable) {
    long l = d ^ 0x7AD956155132L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOffloat);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x4D11521CAF85L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(paramArrayOfint);
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x571C7A2B4EA1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfbyte, new HashSet(MapsKt.mapCapacity(paramArrayOfbyte.length)));
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double minOrNull(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x2FFFEEC51F99L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      d = Math.min(d, d1);
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final long[] toLongArray(@NotNull Long[] paramArrayOfLong) {
    long l = d ^ 0x66ED76A177FEL;
    Intrinsics.checkNotNullParameter(paramArrayOfLong, "<this>");
    byte b = 0;
    int i = paramArrayOfLong.length;
    long[] arrayOfLong = new long[i];
    while (b < i) {
      byte b1 = b;
      arrayOfLong[b1] = paramArrayOfLong[b1].longValue();
      b++;
    } 
    return arrayOfLong;
  }
  
  @NotNull
  public static final Set subtract(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = d ^ 0x4DB1E96F3E6AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfint);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @SinceKotlin(version = "1.7")
  public static final byte maxOrThrow(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x2C0F0ADA689DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (b < b1)
        b = b1; 
    } 
    return b;
  }
  
  @NotNull
  public static final long[] sortedArray(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x7DF9E10D0AB9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return paramArrayOflong; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = Arrays.copyOf(paramArrayOflong, paramArrayOflong.length);
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    ArraysKt.sort(arrayOfLong2);
    return arrayOfLong1;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x4D7ED2FE949L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfboolean.length), 16);
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfBoolean.length;
    while (b < j) {
      boolean bool = arrayOfBoolean[b];
      linkedHashMap.put(paramFunction11.invoke(Boolean.valueOf(bool)), paramFunction12.invoke(Boolean.valueOf(bool)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3AD11A0B7CC9L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Byte.valueOf(paramArrayOfbyte[i]))).booleanValue())
              return ArraysKt.take(paramArrayOfbyte, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @NotNull
  public static final Pair partition(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6F2065656ED6L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Integer> arrayList1 = new ArrayList();
    ArrayList<Integer> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue()) {
          arrayList1.add(Integer.valueOf(j));
        } else {
          arrayList2.add(Integer.valueOf(j));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @NotNull
  public static final List zip(@NotNull char[] paramArrayOfchar, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x519026BC8430L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfchar.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Character.valueOf(paramArrayOfchar[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  public static final double average(@NotNull byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 57202607114309
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 55
    //   33: aload_0
    //   34: iload #6
    //   36: baload
    //   37: istore #8
    //   39: dload_3
    //   40: iload #8
    //   42: i2d
    //   43: dadd
    //   44: dstore_3
    //   45: iinc #5, 1
    //   48: nop
    //   49: iinc #6, 1
    //   52: goto -> 26
    //   55: iload #5
    //   57: ifne -> 70
    //   60: ldc2_w NaN
    //   63: goto -> 75
    //   66: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   69: athrow
    //   70: dload_3
    //   71: iload #5
    //   73: i2d
    //   74: ddiv
    //   75: dreturn
    // Exception table:
    //   from	to	target	type
    //   55	66	66	java/util/NoSuchElementException
  }
  
  public static final int indexOf(@NotNull Object[] paramArrayOfObject, Object paramObject) {
    long l = d ^ 0xFC1ADC6EC5CL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if (paramObject == null) {
      byte b = 0;
      int i = paramArrayOfObject.length;
      while (true) {
        try {
          if (b < i) {
            try {
              if (paramArrayOfObject[b] == null)
                return b; 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            b++;
            continue;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        break;
      } 
    } else {
      byte b = 0;
      int i = paramArrayOfObject.length;
      while (true) {
        try {
          if (b < i) {
            try {
              if (Intrinsics.areEqual(paramObject, paramArrayOfObject[b]))
                return b; 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            b++;
            continue;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        break;
      } 
    } 
    return -1;
  }
  
  @NotNull
  public static final Set union(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = d ^ 0x60A4DCA6C8C8L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOflong);
    CollectionsKt.addAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final Set intersect(@NotNull boolean[] paramArrayOfboolean, @NotNull Iterable paramIterable) {
    long l = d ^ 0x53D7378FD65FL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfboolean);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x14859C744282L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfint, new HashSet(MapsKt.mapCapacity(paramArrayOfint.length)));
  }
  
  @SinceKotlin(version = "1.7")
  public static final short minOrThrow(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x5CF60953A64BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (s > s1)
        s = s1; 
    } 
    return s;
  }
  
  public static final void sortBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x58EC57AD178AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
      if (paramArrayOfObject.length > 1)
        ArraysKt.sortWith(paramArrayOfObject, (Comparator)new Object(paramFunction1)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public static final void sortDescending(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x132B31EF117DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      if (paramArrayOffloat.length > 1) {
        ArraysKt.sort(paramArrayOffloat);
        ArraysKt.reverse(paramArrayOffloat);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long minWithOrNull(@NotNull long[] paramArrayOflong, @NotNull Comparator<Long> paramComparator) {
    long l1 = d ^ 0x34BFA3FD42BDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (paramComparator.compare(Long.valueOf(l2), Long.valueOf(l)) > 0)
        l2 = l; 
    } 
    return Long.valueOf(l2);
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull char[] paramArrayOfchar, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 69730688471681
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 188
    //   77: aload_0
    //   78: iload #11
    //   80: caload
    //   81: istore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 179
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: iload #13
    //   143: invokestatic valueOf : (C)Ljava/lang/Character;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 182
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: iload #13
    //   170: invokeinterface append : (C)Ljava/lang/Appendable;
    //   175: pop
    //   176: goto -> 182
    //   179: goto -> 188
    //   182: iinc #11, 1
    //   185: goto -> 70
    //   188: iload #5
    //   190: iflt -> 223
    //   193: iload #10
    //   195: iload #5
    //   197: if_icmple -> 223
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   206: athrow
    //   207: aload_1
    //   208: aload #6
    //   210: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   215: pop
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   222: athrow
    //   223: aload_1
    //   224: aload #4
    //   226: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   231: pop
    //   232: aload_1
    //   233: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   188	200	203	java/util/NoSuchElementException
    //   193	216	219	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Set toSet(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x460E63F9D3B7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      switch (paramArrayOffloat.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOffloat, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOffloat.length)));
  }
  
  @Nullable
  public static final Short lastOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x102415A37155L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfshort.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        short s = paramArrayOfshort[j];
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return Short.valueOf(s); 
      } while (0 <= i); 
    return null;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x37E699CF9320L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfdouble));
  }
  
  @NotNull
  public static final List slice(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = d ^ 0x3E7B18F416ABL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Integer> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Integer.valueOf(paramArrayOfint[j]));
    } 
    return arrayList;
  }
  
  public static final long reduce(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    long l1 = d ^ 0x783D10597522L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      l2 = ((Number)paramFunction2.invoke(Long.valueOf(l2), Long.valueOf(paramArrayOflong[i]))).longValue();
    } 
    return l2;
  }
  
  @NotNull
  public static final List slice(@NotNull float[] paramArrayOffloat, @NotNull Iterable paramIterable) {
    long l = d ^ 0x1FB0A32877D9L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Float> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Float.valueOf(paramArrayOffloat[j]));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Pair partition(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1ACBFC456C7EL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Double> arrayList1 = new ArrayList();
    ArrayList<Double> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue()) {
          arrayList1.add(Double.valueOf(d));
        } else {
          arrayList2.add(Double.valueOf(d));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short reduceIndexedOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function3 paramFunction3) {
    long l = d ^ 0xDE2B259D941L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s = ((Number)paramFunction3.invoke(Integer.valueOf(i), Short.valueOf(s), Short.valueOf(paramArrayOfshort[i]))).shortValue();
    } 
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final List distinctBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x26941329DA69L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Integer> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      Object object = paramFunction1.invoke(Integer.valueOf(j));
      try {
        if (hashSet.add(object))
          arrayList.add(Integer.valueOf(j)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  public static final long random(@NotNull long[] paramArrayOflong, @NotNull Random paramRandom) {
    long l = d ^ 0x786C61511A1AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOflong[paramRandom.nextInt(paramArrayOflong.length)];
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull Object[] paramArrayOfObject, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x2EFC8365E041L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object1 = paramArrayOfObject[b];
      Object object2 = paramFunction11.invoke(object1);
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object3 = map.get(object2);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object2, arrayList);
      List<Object> list = (object3 == null) ? arrayList : (List)object3;
      list.add(paramFunction12.invoke(object1));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List map(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1684E225ABBEL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int[] arrayOfInt = paramArrayOfint;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfint.length);
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      int j = arrayOfInt[b];
      arrayList.add(paramFunction1.invoke(Integer.valueOf(j)));
      b++;
    } 
    return arrayList;
  }
  
  public static final int reduceRight(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6F695145B0CCL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j;
    for (j = paramArrayOfint[i--]; i >= 0; j = ((Number)paramFunction2.invoke(Integer.valueOf(paramArrayOfint[i--]), Integer.valueOf(j))).intValue());
    return j;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer reduceIndexedOrNull(@NotNull int[] paramArrayOfint, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x366F684FEEF7L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      i = ((Number)paramFunction3.invoke(Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramArrayOfint[j]))).intValue();
    } 
    return Integer.valueOf(i);
  }
  
  public static final void reverse(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x25CEC66267B9L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    int i = paramArrayOfint.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfint);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      int m = paramArrayOfint[k];
      paramArrayOfint[k] = paramArrayOfint[j];
      paramArrayOfint[j] = m;
      j--;
    } 
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x25E9ACF04206L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7(paramArrayOfdouble);
  }
  
  @SinceKotlin(version = "1.7")
  public static final char minByOrThrow(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3E144EA0E046L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i == 0)
        return c; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Character.valueOf(c));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      char c1 = paramArrayOfchar[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) > 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return c;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float minWithOrNull(@NotNull float[] paramArrayOffloat, @NotNull Comparator<Float> paramComparator) {
    long l = d ^ 0x3CB28432AD67L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      if (paramComparator.compare(Float.valueOf(f), Float.valueOf(f1)) > 0)
        f = f1; 
    } 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final List drop(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = d ^ 0xF2E16621FD6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfshort, RangesKt.coerceAtLeast(paramArrayOfshort.length - paramInt, 0));
  }
  
  public static final boolean none(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x852E045EBE2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long minOrThrow(@NotNull long[] paramArrayOflong) {
    long l1 = d ^ 0xAF3BAC5EF91L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (l2 > l)
        l2 = l; 
    } 
    return l2;
  }
  
  public static final Object foldRightIndexed(@NotNull boolean[] paramArrayOfboolean, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x27C8B1FC9145L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Boolean.valueOf(paramArrayOfboolean[i]), object);
      i--;
    } 
    return object;
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x5DAECDE85D45L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfchar, paramArrayOfchar.length), "copyOf(this, size)");
    char[] arrayOfChar1 = Arrays.copyOf(paramArrayOfchar, paramArrayOfchar.length);
    char[] arrayOfChar2 = arrayOfChar1;
    boolean bool = false;
    ArraysKt.sort(arrayOfChar2);
    return ArraysKt.reversed(arrayOfChar1);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character maxByOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x411BFD9771AL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i == 0)
        return Character.valueOf(c); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Character.valueOf(c));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      char c1 = paramArrayOfchar[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) < 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final List sorted(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x1F6D360A7F3CL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Double[] arrayOfDouble1 = ArraysKt.toTypedArray(paramArrayOfdouble);
    Double[] arrayOfDouble2 = arrayOfDouble1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfDouble2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfDouble2);
    return ArraysKt.asList((Object[])arrayOfDouble1);
  }
  
  @NotNull
  public static final List zip(@NotNull char[] paramArrayOfchar, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x5575755D3819L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    char[] arrayOfChar = paramArrayOfchar;
    boolean bool = false;
    int i = Math.min(arrayOfChar.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      char c = arrayOfChar[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Character.valueOf(c), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Byte randomOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Random paramRandom) {
    long l = d ^ 0x7E4FFFAECEFCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Byte.valueOf(paramArrayOfbyte[paramRandom.nextInt(paramArrayOfbyte.length)]);
  }
  
  public static final int indexOfLast(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1B745CE4CD64L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfbyte.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(paramArrayOfbyte[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final String joinToString(@NotNull double[] paramArrayOfdouble, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x211021572EE2L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfdouble, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfdouble, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @NotNull
  public static final char[] sliceArray(@NotNull char[] paramArrayOfchar, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x57523C5EE19DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new char[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char[] arrayOfChar = paramArrayOfchar;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfChar, i, j);
  }
  
  @NotNull
  public static final short[] sliceArray(@NotNull short[] paramArrayOfshort, @NotNull Collection paramCollection) {
    long l = d ^ 0x243251439DC2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    short[] arrayOfShort = new short[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfShort[b++] = paramArrayOfshort[i];
    } 
    return arrayOfShort;
  }
  
  @NotNull
  public static final short[] toShortArray(@NotNull Short[] paramArrayOfShort) {
    long l = d ^ 0x543330CF7A84L;
    Intrinsics.checkNotNullParameter(paramArrayOfShort, "<this>");
    byte b = 0;
    int i = paramArrayOfShort.length;
    short[] arrayOfShort = new short[i];
    while (b < i) {
      byte b1 = b;
      arrayOfShort[b1] = paramArrayOfShort[b1].shortValue();
      b++;
    } 
    return arrayOfShort;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double maxByOrThrow(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4974987D6DBCL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i == 0)
        return d; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Double.valueOf(d));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      double d1 = paramArrayOfdouble[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Double.valueOf(d1));
      if (comparable.compareTo(comparable1) < 0) {
        d = d1;
        comparable = comparable1;
      } 
    } 
    return d;
  }
  
  @NotNull
  public static final List filter(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2C0C76C184B5L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    ArrayList<Object> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object = arrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          arrayList.add(object); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static final void forEachIndexed(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x4BECC248634DL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfshort.length;
    while (b2 < i) {
      short s = paramArrayOfshort[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Short.valueOf(s));
      b2++;
    } 
  }
  
  public static final Object foldIndexed(@NotNull float[] paramArrayOffloat, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x715E6C19A91DL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    byte b2 = 0;
    int i = paramArrayOffloat.length;
    while (b2 < i) {
      float f = paramArrayOffloat[b2];
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Float.valueOf(f));
      b2++;
    } 
    return object;
  }
  
  @NotNull
  public static final List sorted(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x3227D63ECFAEL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Integer[] arrayOfInteger1 = ArraysKt.toTypedArray(paramArrayOfint);
    Integer[] arrayOfInteger2 = arrayOfInteger1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfInteger2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfInteger2);
    return ArraysKt.asList((Object[])arrayOfInteger1);
  }
  
  @NotNull
  public static final Pair partition(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x621AB27A1192L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Float> arrayList1 = new ArrayList();
    ArrayList<Float> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue()) {
          arrayList1.add(Float.valueOf(f));
        } else {
          arrayList2.add(Float.valueOf(f));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  @NotNull
  public static final List toList(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x37091ADFF5AAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      switch (paramArrayOfboolean.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfboolean);
  }
  
  @NotNull
  public static final double[] sortedArray(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x5848BA5443BDL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return paramArrayOfdouble; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfdouble, paramArrayOfdouble.length), "copyOf(this, size)");
    double[] arrayOfDouble1 = Arrays.copyOf(paramArrayOfdouble, paramArrayOfdouble.length);
    double[] arrayOfDouble2 = arrayOfDouble1;
    boolean bool = false;
    ArraysKt.sort(arrayOfDouble2);
    return arrayOfDouble1;
  }
  
  @NotNull
  public static final Object[] sortedArrayWith(@NotNull Object[] paramArrayOfObject, @NotNull Comparator paramComparator) {
    long l = d ^ 0x44255D2B0FE6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return paramArrayOfObject; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length), "copyOf(this, size)");
    Object[] arrayOfObject1 = Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length);
    Object[] arrayOfObject2 = arrayOfObject1;
    boolean bool = false;
    ArraysKt.sortWith(arrayOfObject2, paramComparator);
    return arrayOfObject1;
  }
  
  @NotNull
  public static final float[] sliceArray(@NotNull float[] paramArrayOffloat, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x5F6EC183FD7AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new float[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float[] arrayOfFloat = paramArrayOffloat;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfFloat, i, j);
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x77F16033AC3CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8(paramArrayOfboolean);
  }
  
  @NotNull
  public static final List sortedBy(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x68D55DB8712AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfint, (Comparator)new Object(paramFunction1));
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer reduceRightIndexedOrNull(@NotNull int[] paramArrayOfint, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x5E9C239A49F3L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramArrayOfint[i--];
    while (i >= 0) {
      j = ((Number)paramFunction3.invoke(Integer.valueOf(i), Integer.valueOf(paramArrayOfint[i]), Integer.valueOf(j))).intValue();
      i--;
    } 
    return Integer.valueOf(j);
  }
  
  @NotNull
  public static final Map associateBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x273225648040L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfchar.length), 16);
    char[] arrayOfChar = paramArrayOfchar;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfChar.length;
    while (b < j) {
      char c = arrayOfChar[b];
      linkedHashMap.put(paramFunction1.invoke(Character.valueOf(c)), Character.valueOf(c));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List zip(@NotNull byte[] paramArrayOfbyte, @NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x7259A6F8F6AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    byte[] arrayOfByte = paramArrayOfbyte;
    boolean bool = false;
    int i = Math.min(arrayOfByte.length, paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      byte b1 = arrayOfByte[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Byte.valueOf(b1), object));
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Short firstOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7C747ACF9B5AL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return Short.valueOf(s); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull float[] paramArrayOffloat, @NotNull Collection<Float> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x9ACCE0DF76AL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          paramCollection.add(Float.valueOf(f)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @Nullable
  public static final Byte firstOrNull(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0xEC445330723L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfbyte.length == 0)) ? null : Byte.valueOf(paramArrayOfbyte[0]);
  }
  
  @NotNull
  public static final List zip(@NotNull float[] paramArrayOffloat1, @NotNull float[] paramArrayOffloat2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x540250EC1EBDL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOffloat2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOffloat1.length, paramArrayOffloat2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Float.valueOf(paramArrayOffloat1[b]), Float.valueOf(paramArrayOffloat2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List toMutableList(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x5F7A497B1200L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    ArrayList<Float> arrayList = new ArrayList(paramArrayOffloat.length);
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      arrayList.add(Float.valueOf(f));
      b++;
    } 
    return arrayList;
  }
  
  public static final boolean any(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x63C67A813669L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7B6AD410FC96L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      d += ((Number)paramFunction1.invoke(Byte.valueOf(b1))).doubleValue();
      b++;
    } 
    return d;
  }
  
  @NotNull
  public static final int[] sliceArray(@NotNull int[] paramArrayOfint, @NotNull Collection paramCollection) {
    long l = d ^ 0x49EB16D4D3F2L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    int[] arrayOfInt = new int[paramCollection.size()];
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfInt[b++] = paramArrayOfint[i];
    } 
    return arrayOfInt;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = d ^ 0x21F9C38DC9F0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfbyte.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      byte b = paramArrayOfbyte[k];
      paramArrayOfbyte[k] = paramArrayOfbyte[j];
      paramArrayOfbyte[j] = b;
      j--;
    } 
  }
  
  @NotNull
  public static final Map associate(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6FEB788C711AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfint.length), 16);
    int[] arrayOfInt = paramArrayOfint;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfInt.length;
    while (b < j) {
      int k = arrayOfInt[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Integer.valueOf(k));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Set toSet(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x1CC1C3822E7BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      switch (paramArrayOfdouble.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfdouble, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfdouble.length)));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List runningReduce(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xC419FA042ACL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = null;
    object = paramArrayOfObject[0];
    ArrayList<Object> arrayList2 = new ArrayList(paramArrayOfObject.length);
    ArrayList<Object> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(object);
    ArrayList<Object> arrayList1 = arrayList2;
    byte b = 1;
    int i = paramArrayOfObject.length;
    while (b < i) {
      object = paramFunction2.invoke(object, paramArrayOfObject[b]);
      arrayList1.add(object);
      b++;
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull char[] paramArrayOfchar, @NotNull Collection<Character> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x520F79CB7154L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          paramCollection.add(Character.valueOf(c)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    long l = d ^ 0x3CE4BF899DABL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfchar.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      char c = paramArrayOfchar[k];
      paramArrayOfchar[k] = paramArrayOfchar[j];
      paramArrayOfchar[j] = c;
      j--;
    } 
  }
  
  public static final boolean contains(@NotNull Object[] paramArrayOfObject, Object paramObject) {
    long l = d ^ 0x70A3E66F5B8FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOfObject, paramObject) >= 0);
  }
  
  public static final double single(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xACA093F7606L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Double double_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          double_ = Double.valueOf(d);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(double_, "null cannot be cast to non-null type kotlin.Double");
    return double_.doubleValue();
  }
  
  @NotNull
  public static final Map associateBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x1D1D52153C04L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfdouble.length), 16);
    double[] arrayOfDouble = paramArrayOfdouble;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfDouble.length;
    while (b < j) {
      double d = arrayOfDouble[b];
      linkedHashMap.put(paramFunction11.invoke(Double.valueOf(d)), paramFunction12.invoke(Double.valueOf(d)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List zip(@NotNull double[] paramArrayOfdouble1, @NotNull double[] paramArrayOfdouble2) {
    long l = d ^ 0x7FF059BE4EFFL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfdouble2, "other");
    double[] arrayOfDouble = paramArrayOfdouble1;
    boolean bool = false;
    int i = Math.min(arrayOfDouble.length, paramArrayOfdouble2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      double d1 = paramArrayOfdouble2[b];
      double d2 = arrayOfDouble[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Double.valueOf(d2), Double.valueOf(d1)));
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Float singleOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6598C7D9FC1DL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Float float_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          float_ = Float.valueOf(f);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return float_;
  }
  
  @Nullable
  public static final Integer firstOrNull(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x7F44D000CD59L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfint.length == 0)) ? null : Integer.valueOf(paramArrayOfint[0]);
  }
  
  @Nullable
  public static final Float singleOrNull(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x6877FC9A46B7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOffloat.length == 1) ? Float.valueOf(paramArrayOffloat[0]) : null;
  }
  
  public static final boolean none(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x193588E5EFBBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfObject.length == 0);
  }
  
  @Nullable
  public static final Boolean firstOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4E3B02A6078AL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return Boolean.valueOf(bool1); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull boolean[] paramArrayOfboolean, @NotNull Random paramRandom) {
    long l = d ^ 0x41EEC96EBC3L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfboolean); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      boolean bool = paramArrayOfboolean[i];
      paramArrayOfboolean[i] = paramArrayOfboolean[j];
      paramArrayOfboolean[j] = bool;
    } 
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x326094F5E88DL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfint));
  }
  
  public static final boolean any(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x557DECA81790L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull double[] paramArrayOfdouble, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x40C8F96FB744L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfdouble.length;
    while (b2 < i) {
      double d = paramArrayOfdouble[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Double.valueOf(d)));
      b2++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List filterNot(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1C54B348FE1DL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    ArrayList<Boolean> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfBoolean.length;
    while (b < i) {
      boolean bool = arrayOfBoolean[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(bool))).booleanValue())
          arrayList.add(Boolean.valueOf(bool)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final float minOrThrow(@NotNull Float[] paramArrayOfFloat) {
    long l = d ^ 0x3DD45683263AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfFloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfFloat.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOfFloat[0].floatValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfFloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOfFloat[i].floatValue();
      f = Math.min(f, f1);
    } 
    return f;
  }
  
  @NotNull
  public static final List zip(@NotNull float[] paramArrayOffloat1, @NotNull float[] paramArrayOffloat2) {
    long l = d ^ 0x7F0C668C901AL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOffloat2, "other");
    float[] arrayOfFloat = paramArrayOffloat1;
    boolean bool = false;
    int i = Math.min(arrayOfFloat.length, paramArrayOffloat2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      float f1 = paramArrayOffloat2[b];
      float f2 = arrayOfFloat[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Float.valueOf(f2), Float.valueOf(f1)));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x3BC0CFBFD76AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfObject, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfObject.length)));
  }
  
  @NotNull
  public static final List reversed(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x9D898170551L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfint);
    CollectionsKt.reverse(list);
    return list;
  }
  
  public static final double last(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3B1D8DB92132L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfdouble.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        double d = paramArrayOfdouble[j];
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return d; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = d ^ 0x46EE7F2974F7L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOflong.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      long l1 = paramArrayOflong[k];
      paramArrayOflong[k] = paramArrayOflong[j];
      paramArrayOflong[j] = l1;
      j--;
    } 
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull long[] paramArrayOflong, @NotNull Collection<Long> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7F7F265486C6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          paramCollection.add(Long.valueOf(l1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List takeWhile(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x44601B6F5D1DL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Float> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Float.valueOf(f));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Object[] sliceArray(@NotNull Object[] paramArrayOfObject, @NotNull Collection paramCollection) {
    long l = d ^ 0x6EA423462B2CL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    Object[] arrayOfObject = ArraysKt.arrayOfNulls(paramArrayOfObject, paramCollection.size());
    byte b = 0;
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int i = ((Number)iterator.next()).intValue();
      arrayOfObject[b++] = paramArrayOfObject[i];
    } 
    return arrayOfObject;
  }
  
  @NotNull
  public static final List mapIndexedNotNull(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 4340590804056
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'transform'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iconst_0
    //   22: istore #4
    //   24: aload_0
    //   25: astore #5
    //   27: new java/util/ArrayList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: checkcast java/util/Collection
    //   37: astore #6
    //   39: iconst_0
    //   40: istore #7
    //   42: aload #5
    //   44: astore #8
    //   46: iconst_0
    //   47: istore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: iconst_0
    //   53: istore #11
    //   55: aload #8
    //   57: arraylength
    //   58: istore #12
    //   60: iload #11
    //   62: iload #12
    //   64: if_icmpge -> 136
    //   67: aload #8
    //   69: iload #11
    //   71: aaload
    //   72: astore #13
    //   74: iload #10
    //   76: iinc #10, 1
    //   79: aload #13
    //   81: astore #14
    //   83: istore #15
    //   85: iconst_0
    //   86: istore #16
    //   88: aload_1
    //   89: iload #15
    //   91: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   94: aload #14
    //   96: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   101: dup
    //   102: ifnull -> 127
    //   105: astore #17
    //   107: aload #17
    //   109: astore #18
    //   111: iconst_0
    //   112: istore #19
    //   114: aload #6
    //   116: aload #18
    //   118: invokeinterface add : (Ljava/lang/Object;)Z
    //   123: pop
    //   124: goto -> 129
    //   127: pop
    //   128: nop
    //   129: nop
    //   130: iinc #11, 1
    //   133: goto -> 60
    //   136: nop
    //   137: aload #6
    //   139: checkcast java/util/List
    //   142: areturn
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Integer randomOrNull(@NotNull int[] paramArrayOfint, @NotNull Random paramRandom) {
    long l = d ^ 0x13C34A6B99FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Integer.valueOf(paramArrayOfint[paramRandom.nextInt(paramArrayOfint.length)]);
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x39E3EB600E64L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(object);
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x40D8CEDED3FFL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(paramArrayOfboolean[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOfboolean, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfboolean);
    } 
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull double[] paramArrayOfdouble, @NotNull Collection<Double> paramCollection) {
    long l = d ^ 0x5DD40D796DD3L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      paramCollection.add(Double.valueOf(d));
      b++;
    } 
    return paramCollection;
  }
  
  public static final Object foldRightIndexed(@NotNull int[] paramArrayOfint, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x3491D081CC66L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Integer.valueOf(paramArrayOfint[i]), object);
      i--;
    } 
    return object;
  }
  
  @NotNull
  public static final Pair partition(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x608ACE9C0F53L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Long> arrayList1 = new ArrayList();
    ArrayList<Long> arrayList2 = new ArrayList();
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue()) {
          arrayList1.add(Long.valueOf(l1));
        } else {
          arrayList2.add(Long.valueOf(l1));
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return new Pair(arrayList1, arrayList2);
  }
  
  public static final int sumOfInt(@NotNull Integer[] paramArrayOfInteger) {
    long l = d ^ 0x19291F93C1D0L;
    Intrinsics.checkNotNullParameter(paramArrayOfInteger, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfInteger.length;
    while (b < j) {
      int k = paramArrayOfInteger[b].intValue();
      i += k;
      b++;
    } 
    return i;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull byte[] paramArrayOfbyte, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1097FAA3828L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      paramCollection.add(paramFunction1.invoke(Byte.valueOf(b1)));
      b++;
    } 
    return paramCollection;
  }
  
  public static final Object fold(@NotNull int[] paramArrayOfint, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6FB0390F7B98L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      object = paramFunction2.invoke(object, Integer.valueOf(j));
      b++;
    } 
    return object;
  }
  
  @NotNull
  public static final List dropWhile(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x13677A0EB914L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Boolean> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool = paramArrayOfboolean[b];
      try {
        if (bool2) {
          arrayList.add(Boolean.valueOf(bool));
        } else if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(bool))).booleanValue()) {
          arrayList.add(Boolean.valueOf(bool));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 47575926988377
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 120
    //   53: aload #6
    //   55: iload #9
    //   57: aaload
    //   58: astore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: aload #11
    //   67: astore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: aload #12
    //   82: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   87: checkcast java/lang/Boolean
    //   90: invokevirtual booleanValue : ()Z
    //   93: ifeq -> 112
    //   96: aload_1
    //   97: aload #12
    //   99: invokeinterface add : (Ljava/lang/Object;)Z
    //   104: pop
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   111: athrow
    //   112: nop
    //   113: nop
    //   114: iinc #9, 1
    //   117: goto -> 46
    //   120: nop
    //   121: aload_1
    //   122: areturn
    // Exception table:
    //   from	to	target	type
    //   74	105	108	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull float[] paramArrayOffloat, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3BC3C7341969L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      Object object1 = paramFunction1.invoke(Float.valueOf(f));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Float> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Float.valueOf(f));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x637509EF2437L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOffloat.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfFloat.length;
    while (b2 < i) {
      float f = arrayOfFloat[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Float.valueOf(f)));
      b2++;
    } 
    return arrayList;
  }
  
  public static final void forEachIndexed(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x50292AB2AE9L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOflong.length;
    while (b2 < i) {
      long l1 = paramArrayOflong[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Long.valueOf(l1));
      b2++;
    } 
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x3726C9AE215BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(paramArrayOfdouble);
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x73A1D114857BL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(paramArrayOfboolean[i]))).booleanValue())
              return ArraysKt.take(paramArrayOfboolean, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  public static final Object foldRightIndexed(@NotNull double[] paramArrayOfdouble, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x1D80B8FFD38L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Double.valueOf(paramArrayOfdouble[i]), object);
      i--;
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte minOrNull(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x396CB9D55618L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (b > b1)
        b = b1; 
    } 
    return Byte.valueOf(b);
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull int[] paramArrayOfint, @NotNull Collection<Integer> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 139059301946189
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: iaload
    //   58: istore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: iload #11
    //   67: istore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: iload #12
    //   82: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: iload #12
    //   102: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final byte[] reversedArray(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x2AFAB3A2DBEBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return paramArrayOfbyte; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfByte[i - j] = paramArrayOfbyte[j];
    } 
    return arrayOfByte;
  }
  
  public static final int getLastIndex(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x27AC376F512EL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return paramArrayOfchar.length - 1;
  }
  
  @NotNull
  public static final List zip(@NotNull boolean[] paramArrayOfboolean, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2B2124A9DFC6L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfboolean.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Boolean.valueOf(paramArrayOfboolean[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public static final boolean contains(@NotNull short[] paramArrayOfshort, short paramShort) {
    long l = d ^ 0x28862AFA8B32L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOfshort, paramShort) >= 0);
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x6580CECC3D97L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    ArraysKt.shuffle(paramArrayOfboolean, (Random)Random.Default);
  }
  
  public static final long reduceIndexed(@NotNull long[] paramArrayOflong, @NotNull Function3 paramFunction3) {
    long l1 = d ^ 0x32AEFF1D52F3L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      l2 = ((Number)paramFunction3.invoke(Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(paramArrayOflong[i]))).longValue();
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.7")
  public static final int maxOrThrow(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x3DFCBD015B8EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      int k = paramArrayOfint[j];
      if (i < k)
        i = k; 
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Short reduceOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x1618D9A90ADFL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s = ((Number)paramFunction2.invoke(Short.valueOf(s), Short.valueOf(paramArrayOfshort[i]))).shortValue();
    } 
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x14834432E85DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(paramArrayOffloat);
  }
  
  public static final Object first(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x62D0F950516AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return object; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public static final long reduceRightIndexed(@NotNull long[] paramArrayOflong, @NotNull Function3 paramFunction3) {
    long l1 = d ^ 0x6D27B8E64FE9L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[i--];
    while (i >= 0) {
      l2 = ((Number)paramFunction3.invoke(Integer.valueOf(i), Long.valueOf(paramArrayOflong[i]), Long.valueOf(l2))).longValue();
      i--;
    } 
    return l2;
  }
  
  public static final boolean none(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x33D0F614D712L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  public static final int getLastIndex(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x79E6687B3098L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return paramArrayOfbyte.length - 1;
  }
  
  @NotNull
  public static final List zip(@NotNull boolean[] paramArrayOfboolean, @NotNull Iterable paramIterable) {
    long l = d ^ 0x398CDB19CDC1L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    boolean bool = false;
    int i = arrayOfBoolean.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        boolean bool1 = arrayOfBoolean[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool2 = false;
        arrayList1.add(TuplesKt.to(Boolean.valueOf(bool1), object1));
      } 
    } 
    return arrayList;
  }
  
  public static final boolean reduceRight(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6F2D321C9E2CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1;
    for (bool1 = paramArrayOfboolean[i--]; i >= 0; bool1 = ((Boolean)paramFunction2.invoke(Boolean.valueOf(paramArrayOfboolean[i--]), Boolean.valueOf(bool1))).booleanValue());
    return bool1;
  }
  
  public static final int indexOf(@NotNull long[] paramArrayOflong, long paramLong) {
    long l = d ^ 0x12847E68B25FL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    byte b = 0;
    int i = paramArrayOflong.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (paramLong == paramArrayOflong[b])
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final Map groupBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x47A7B1D67FC8L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    char[] arrayOfChar = paramArrayOfchar;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfChar.length;
    while (b < i) {
      char c = arrayOfChar[b];
      Object object1 = paramFunction1.invoke(Character.valueOf(c));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Character> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Character.valueOf(c));
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte maxByOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x719D123DBF8DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i == 0)
        return Byte.valueOf(b); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Byte.valueOf(b));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Byte.valueOf(b1));
      if (comparable.compareTo(comparable1) < 0) {
        b = b1;
        comparable = comparable1;
      } 
    } 
    return Byte.valueOf(b);
  }
  
  public static final void sortDescending(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x2D2DD5744F0FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      if (paramArrayOfchar.length > 1) {
        ArraysKt.sort(paramArrayOfchar);
        ArraysKt.reverse(paramArrayOfchar);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x11651C790345L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOflong.length;
    while (b < j) {
      long l1 = paramArrayOflong[b];
      i += ((Number)paramFunction1.invoke(Long.valueOf(l1))).intValue();
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Object minWithOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<Object> paramComparator) {
    long l = d ^ 0x50A5FB86D51BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Object object1 = paramArrayOfObject[i];
      if (paramComparator.compare(object, object1) > 0)
        object = object1; 
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double minWithOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Comparator<Double> paramComparator) {
    long l = d ^ 0x448108B8336BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      if (paramComparator.compare(Double.valueOf(d), Double.valueOf(d1)) > 0)
        d = d1; 
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final List zip(@NotNull long[] paramArrayOflong1, @NotNull long[] paramArrayOflong2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6CAB1486C484L;
    Intrinsics.checkNotNullParameter(paramArrayOflong1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOflong2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOflong1.length, paramArrayOflong2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Long.valueOf(paramArrayOflong1[b]), Long.valueOf(paramArrayOflong2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set toSet(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x429DDE6E989CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      switch (paramArrayOfchar.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfchar, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(paramArrayOfchar.length, 128))));
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull char[] paramArrayOfchar, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x5D45914BDB3DL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      paramMap.put(paramFunction11.invoke(Character.valueOf(c)), paramFunction12.invoke(Character.valueOf(c)));
      b++;
    } 
    return paramMap;
  }
  
  public static final double average(@NotNull float[] paramArrayOffloat) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 57070768983828
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 55
    //   33: aload_0
    //   34: iload #6
    //   36: faload
    //   37: fstore #8
    //   39: dload_3
    //   40: fload #8
    //   42: f2d
    //   43: dadd
    //   44: dstore_3
    //   45: iinc #5, 1
    //   48: nop
    //   49: iinc #6, 1
    //   52: goto -> 26
    //   55: iload #5
    //   57: ifne -> 70
    //   60: ldc2_w NaN
    //   63: goto -> 75
    //   66: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   69: athrow
    //   70: dload_3
    //   71: iload #5
    //   73: i2d
    //   74: ddiv
    //   75: dreturn
    // Exception table:
    //   from	to	target	type
    //   55	66	66	java/util/NoSuchElementException
  }
  
  @Nullable
  public static final Character lastOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5519F4A656FAL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfchar.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        char c = paramArrayOfchar[j];
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return Character.valueOf(c); 
      } while (0 <= i); 
    return null;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4D682ECBB8FCL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfByte.length;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      Object object1 = paramFunction1.invoke(Byte.valueOf(b1));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Byte> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Byte.valueOf(b1));
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short maxWithOrNull(@NotNull short[] paramArrayOfshort, @NotNull Comparator<Short> paramComparator) {
    long l = d ^ 0x318B0DE7DAADL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (paramComparator.compare(Short.valueOf(s), Short.valueOf(s1)) < 0)
        s = s1; 
    } 
    return Short.valueOf(s);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Byte minWithOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<Byte> paramComparator) {
    long l = d ^ 0x567B0824C612L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (paramComparator.compare(Byte.valueOf(b), Byte.valueOf(b1)) > 0)
        b = b1; 
    } 
    return Byte.valueOf(b);
  }
  
  @NotNull
  public static final List zip(@NotNull long[] paramArrayOflong1, @NotNull long[] paramArrayOflong2) {
    long l = d ^ 0x72C536AB8493L;
    Intrinsics.checkNotNullParameter(paramArrayOflong1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOflong2, "other");
    long[] arrayOfLong = paramArrayOflong1;
    boolean bool = false;
    int i = Math.min(arrayOfLong.length, paramArrayOflong2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      long l1 = paramArrayOflong2[b];
      long l2 = arrayOfLong[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Long.valueOf(l2), Long.valueOf(l1)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0xD0FB3156D41L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    ArraysKt.shuffle(paramArrayOfdouble, (Random)Random.Default);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Boolean reduceRightOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x75903984F6DEL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1;
    for (bool1 = paramArrayOfboolean[i--]; i >= 0; bool1 = ((Boolean)paramFunction2.invoke(Boolean.valueOf(paramArrayOfboolean[i--]), Boolean.valueOf(bool1))).booleanValue());
    return Boolean.valueOf(bool1);
  }
  
  @NotNull
  public static final List slice(@NotNull long[] paramArrayOflong, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x2FECF08A9C39L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long[] arrayOfLong = paramArrayOflong;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfLong, i, j));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Float reduceRightOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x64EDEDD4989L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f;
    for (f = paramArrayOffloat[i--]; i >= 0; f = ((Number)paramFunction2.invoke(Float.valueOf(paramArrayOffloat[i--]), Float.valueOf(f))).floatValue());
    return Float.valueOf(f);
  }
  
  public static final void sortDescending(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x34905447A3A8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      if (paramArrayOfshort.length > 1) {
        ArraysKt.sort(paramArrayOfshort);
        ArraysKt.reverse(paramArrayOfshort);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character reduceRightOrNull(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2BC555331CE4L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c;
    for (c = paramArrayOfchar[i--]; i >= 0; c = ((Character)paramFunction2.invoke(Character.valueOf(paramArrayOfchar[i--]), Character.valueOf(c))).charValue());
    return Character.valueOf(c);
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = d ^ 0x51BA878BB904L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfint.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      int m = paramArrayOfint[k];
      paramArrayOfint[k] = paramArrayOfint[j];
      paramArrayOfint[j] = m;
      j--;
    } 
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull int[] paramArrayOfint, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 63187413154132
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: iaload
    //   81: istore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: iload #13
    //   143: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: iload #13
    //   170: invokestatic valueOf : (I)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull char[] paramArrayOfchar, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5FDB8416BEC9L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      Object object1 = paramFunction1.invoke(Character.valueOf(c));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Character> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Character.valueOf(c));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character maxWithOrNull(@NotNull char[] paramArrayOfchar, @NotNull Comparator<Character> paramComparator) {
    long l = d ^ 0x38D369172062L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfchar))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramArrayOfchar[i];
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) < 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double reduceIndexedOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x1FAA26B072DL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      d = ((Number)paramFunction3.invoke(Integer.valueOf(i), Double.valueOf(d), Double.valueOf(paramArrayOfdouble[i]))).doubleValue();
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x13A242467F2AL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOflong, new HashSet(MapsKt.mapCapacity(paramArrayOflong.length)));
  }
  
  @NotNull
  public static final char[] sortedArray(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x5E3102A1A83EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return paramArrayOfchar; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfchar, paramArrayOfchar.length), "copyOf(this, size)");
    char[] arrayOfChar1 = Arrays.copyOf(paramArrayOfchar, paramArrayOfchar.length);
    char[] arrayOfChar2 = arrayOfChar1;
    boolean bool = false;
    ArraysKt.sort(arrayOfChar2);
    return arrayOfChar1;
  }
  
  public static final short last(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4CEBA52C2A8FL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfshort.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        short s = paramArrayOfshort[j];
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          return s; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List dropLast(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x467B9EAC8F0AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfint, RangesKt.coerceAtLeast(paramArrayOfint.length - paramInt, 0));
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x13DA8C3E47CEL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$2(paramArrayOfbyte));
  }
  
  @NotNull
  public static final List drop(@NotNull char[] paramArrayOfchar, int paramInt) {
    long l = d ^ 0x5EE1FB51F3CBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfchar, RangesKt.coerceAtLeast(paramArrayOfchar.length - paramInt, 0));
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1D709239B728L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      d += ((Number)paramFunction1.invoke(object)).doubleValue();
      b++;
    } 
    return d;
  }
  
  public static final boolean any(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x123DB0E9E128L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @NotNull
  public static final Map associate(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x50852DD43ECCL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfboolean.length), 16);
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfBoolean.length;
    while (b < j) {
      boolean bool = arrayOfBoolean[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Boolean.valueOf(bool));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final char[] toCharArray(@NotNull Character[] paramArrayOfCharacter) {
    long l = d ^ 0x5861DF2CE8DL;
    Intrinsics.checkNotNullParameter(paramArrayOfCharacter, "<this>");
    byte b = 0;
    int i = paramArrayOfCharacter.length;
    char[] arrayOfChar = new char[i];
    while (b < i) {
      byte b1 = b;
      arrayOfChar[b1] = paramArrayOfCharacter[b1].charValue();
      b++;
    } 
    return arrayOfChar;
  }
  
  @NotNull
  public static final List sorted(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x134FC13D3F8AL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Short[] arrayOfShort1 = ArraysKt.toTypedArray(paramArrayOfshort);
    Short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfShort2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfShort2);
    return ArraysKt.asList((Object[])arrayOfShort1);
  }
  
  @NotNull
  public static final Map associateBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7887295C81B7L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfbyte.length), 16);
    byte[] arrayOfByte = paramArrayOfbyte;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfByte.length;
    while (b < j) {
      byte b1 = arrayOfByte[b];
      linkedHashMap.put(paramFunction1.invoke(Byte.valueOf(b1)), Byte.valueOf(b1));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull byte[] paramArrayOfbyte, @NotNull Map<Object, Byte> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x211FDAEE003FL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      paramMap.put(paramFunction1.invoke(Byte.valueOf(b1)), Byte.valueOf(b1));
      b++;
    } 
    return paramMap;
  }
  
  public static final short single(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x2A53E3160E4EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      switch (paramArrayOfshort.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull byte[] paramArrayOfbyte, @NotNull Collection<Byte> paramCollection) {
    long l = d ^ 0x1849DFB7FC94L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      paramCollection.add(Byte.valueOf(b1));
      b++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    long l = d ^ 0x5073B9D672DFL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOffloat.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      float f = paramArrayOffloat[k];
      paramArrayOffloat[k] = paramArrayOffloat[j];
      paramArrayOffloat[j] = f;
      j--;
    } 
  }
  
  @Nullable
  public static final Boolean singleOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x364B79E0E666L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Boolean bool = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool3 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool3))).booleanValue()) {
          try {
            if (bool2)
              return null; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          bool = Boolean.valueOf(bool3);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return bool;
  }
  
  public static final double averageOfLong(@NotNull Long[] paramArrayOfLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 92440320837810
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 58
    //   33: aload_0
    //   34: iload #6
    //   36: aaload
    //   37: invokevirtual longValue : ()J
    //   40: lstore #8
    //   42: dload_3
    //   43: lload #8
    //   45: l2d
    //   46: dadd
    //   47: dstore_3
    //   48: iinc #5, 1
    //   51: nop
    //   52: iinc #6, 1
    //   55: goto -> 26
    //   58: iload #5
    //   60: ifne -> 73
    //   63: ldc2_w NaN
    //   66: goto -> 78
    //   69: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   72: athrow
    //   73: dload_3
    //   74: iload #5
    //   76: i2d
    //   77: ddiv
    //   78: dreturn
    // Exception table:
    //   from	to	target	type
    //   58	69	69	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final long[] sliceArray(@NotNull long[] paramArrayOflong, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x168E34771473L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new long[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long[] arrayOfLong = paramArrayOflong;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfLong, i, j);
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x36EE0D9D31B3L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      paramCollection.add(paramFunction1.invoke(object));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List sortedWith(@NotNull long[] paramArrayOflong, @NotNull Comparator paramComparator) {
    long l = d ^ 0x53B8241340C7L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Long[] arrayOfLong1 = ArraysKt.toTypedArray(paramArrayOflong);
    Long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfLong2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfLong1);
  }
  
  @NotNull
  public static final int[] sortedArray(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0xC9C22A5BEE0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return paramArrayOfint; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length);
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    ArraysKt.sort(arrayOfInt2);
    return arrayOfInt1;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x6DD013FE1CE0L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfint, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfint.length)));
  }
  
  @NotNull
  public static final List slice(@NotNull char[] paramArrayOfchar, @NotNull Iterable paramIterable) {
    long l = d ^ 0x6C826D1D1D9FL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Character> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Character.valueOf(paramArrayOfchar[j]));
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Short singleOrNull(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x1EFCEAA9E2EAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfshort.length == 1) ? Short.valueOf(paramArrayOfshort[0]) : null;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5539F24B83E0L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      Object object1 = paramFunction1.invoke(Boolean.valueOf(bool1));
      Map<Object, ArrayList> map = paramMap;
      boolean bool2 = false;
      Object object2 = map.get(object1);
      boolean bool3 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Boolean> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Boolean.valueOf(bool1));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double maxOrThrow(@NotNull Double[] paramArrayOfDouble) {
    long l = d ^ 0x79307DEAEC76L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfDouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfDouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfDouble[0].doubleValue();
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfDouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfDouble[i].doubleValue();
      d = Math.max(d, d1);
    } 
    return d;
  }
  
  @SinceKotlin(version = "1.7")
  public static final short maxWithOrThrow(@NotNull short[] paramArrayOfshort, @NotNull Comparator<Short> paramComparator) {
    long l = d ^ 0x532DFDF4FF84L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (paramComparator.compare(Short.valueOf(s), Short.valueOf(s1)) < 0)
        s = s1; 
    } 
    return s;
  }
  
  public static final long first(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1301C96B9CE6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return l1; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public static final boolean contains(@NotNull char[] paramArrayOfchar, char paramChar) {
    long l = d ^ 0x7142E25CD032L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOfchar, paramChar) >= 0);
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 135472039111602
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: baload
    //   81: istore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: iload #13
    //   143: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: iload #13
    //   170: invokestatic valueOf : (Z)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull long[] paramArrayOflong, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3AB63D984070L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOflong.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfLong.length;
    while (b2 < i) {
      long l1 = arrayOfLong[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Long.valueOf(l1)));
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x46789823BE18L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6(paramArrayOffloat);
  }
  
  @NotNull
  public static final List takeWhile(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x9B6BA86F929L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Double> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Double.valueOf(d));
      b++;
    } 
    return arrayList;
  }
  
  public static final Object foldRight(@NotNull int[] paramArrayOfint, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x210A557E0820L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Integer.valueOf(paramArrayOfint[i--]), object));
    return object;
  }
  
  public static final boolean any(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x387BAC1B44F2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfbyte.length == 0) ? 1 : 0);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Comparable minOrNull(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x328B45DD124AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfComparable.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = paramArrayOfComparable[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfComparable))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Comparable<Comparable> comparable1 = paramArrayOfComparable[i];
      if (comparable.compareTo(comparable1) > 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  @NotNull
  public static final List take(@NotNull boolean[] paramArrayOfboolean, int paramInt) {
    long l = d ^ 0x29E7DDF04F3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfboolean.length)
        return ArraysKt.toList(paramArrayOfboolean); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Boolean.valueOf(paramArrayOfboolean[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Boolean> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfboolean.length;
    while (b2 < i) {
      boolean bool = paramArrayOfboolean[b2];
      try {
        arrayList.add(Boolean.valueOf(bool));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  public static final int indexOfFirst(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x5BC3CC69BC92L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Short.valueOf(paramArrayOfshort[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final List filterNot(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6AAE7888554EL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    ArrayList<Long> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          arrayList.add(Long.valueOf(l1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull int[] paramArrayOfint, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x76D16833E5CFL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      paramCollection.add(paramFunction1.invoke(Integer.valueOf(j)));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List zip(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = d ^ 0x42AD53B0AFB1L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    short[] arrayOfShort = paramArrayOfshort;
    boolean bool = false;
    int i = arrayOfShort.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        short s = arrayOfShort[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Short.valueOf(s), object1));
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List slice(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = d ^ 0x5C710F8880CBL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Short> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Short.valueOf(paramArrayOfshort[j]));
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Float lastOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x168ACA957482L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOffloat.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        float f = paramArrayOffloat[j];
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return Float.valueOf(f); 
      } while (0 <= i); 
    return null;
  }
  
  @NotNull
  public static final List drop(@NotNull boolean[] paramArrayOfboolean, int paramInt) {
    long l = d ^ 0x77B3C2178E25L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfboolean, RangesKt.coerceAtLeast(paramArrayOfboolean.length - paramInt, 0));
  }
  
  public static final float first(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2E911F5BA6D1L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return f; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public static final float reduceRight(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x72D4D22CE461L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f;
    for (f = paramArrayOffloat[i--]; i >= 0; f = ((Number)paramFunction2.invoke(Float.valueOf(paramArrayOffloat[i--]), Float.valueOf(f))).floatValue());
    return f;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x79CAC6313426L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    ArraysKt.shuffle(paramArrayOfchar, (Random)Random.Default);
  }
  
  @NotNull
  public static final List toMutableList(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x47D4FB11354AL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    ArrayList<Long> arrayList = new ArrayList(paramArrayOflong.length);
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      arrayList.add(Long.valueOf(l1));
      b++;
    } 
    return arrayList;
  }
  
  public static final Object reduceIndexed(@NotNull Object[] paramArrayOfObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x3CC1073E1BBDL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      object = paramFunction3.invoke(Integer.valueOf(i), object, paramArrayOfObject[i]);
    } 
    return object;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull int[] paramArrayOfint, @NotNull Collection<Integer> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3627AA2DA368L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          paramCollection.add(Integer.valueOf(j)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  public static final boolean all(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2BA67117E36BL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x676322B4139DL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return new IntRange(0, ArraysKt.getLastIndex(paramArrayOfchar));
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x28F9548F59B6L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramArrayOfchar[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOfchar, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfchar);
    } 
  }
  
  @NotNull
  public static final List takeWhile(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6FDEBF8BE831L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Long> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Long.valueOf(l1));
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Grouping groupingBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x51B12DC64EB8L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    return new ArraysKt___ArraysKt$groupingBy$1(paramArrayOfObject, paramFunction1);
  }
  
  public static final int last(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x65D847ACC15FL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfint.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        int k = paramArrayOfint[j];
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(k))).booleanValue())
          return k; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public static final Object foldRight(@NotNull boolean[] paramArrayOfboolean, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x62E3C6A85A77L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Boolean.valueOf(paramArrayOfboolean[i--]), object));
    return object;
  }
  
  public static final void reverse(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x329EB0C5AC0BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    int i = paramArrayOfbyte.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfbyte);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      byte b = paramArrayOfbyte[k];
      paramArrayOfbyte[k] = paramArrayOfbyte[j];
      paramArrayOfbyte[j] = b;
      j--;
    } 
  }
  
  @NotNull
  public static final Set toSet(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x74140E5C645FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      switch (paramArrayOfObject.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfObject, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfObject.length)));
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull int[] paramArrayOfint, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3CCE196949C7L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfint.length;
    while (b2 < i) {
      int j = paramArrayOfint[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Integer.valueOf(j)));
      b2++;
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Boolean maxWithOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Comparator<Boolean> paramComparator) {
    long l = d ^ 0x4678A77BF01DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      boolean bool1 = paramArrayOfboolean[i];
      if (paramComparator.compare(Boolean.valueOf(bool), Boolean.valueOf(bool1)) < 0)
        bool = bool1; 
    } 
    return Boolean.valueOf(bool);
  }
  
  public static final long single(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x295EF490808EL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Long long_ = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          long_ = Long.valueOf(l1);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(long_, "null cannot be cast to non-null type kotlin.Long");
    return long_.longValue();
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Boolean randomOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Random paramRandom) {
    long l = d ^ 0x49077270FAA6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Boolean.valueOf(paramArrayOfboolean[paramRandom.nextInt(paramArrayOfboolean.length)]);
  }
  
  @SinceKotlin(version = "1.7")
  public static final Object minWithOrThrow(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<Object> paramComparator) {
    long l = d ^ 0x6D25E9B0E0E9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = paramArrayOfObject[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfObject))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Object object1 = paramArrayOfObject[i];
      if (paramComparator.compare(object, object1) > 0)
        object = object1; 
    } 
    return object;
  }
  
  @NotNull
  public static final List filter(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7A2F437E2B87L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    ArrayList<Short> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfShort.length;
    while (b < i) {
      short s = arrayOfShort[b];
      try {
        if (((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          arrayList.add(Short.valueOf(s)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x113D3717C76DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1(paramArrayOfObject);
  }
  
  @NotNull
  public static final List reversed(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x37897B1F0279L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOflong);
    CollectionsKt.reverse(list);
    return list;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float reduceRightIndexedOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x62542F5E3074L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[i--];
    while (i >= 0) {
      f = ((Number)paramFunction3.invoke(Integer.valueOf(i), Float.valueOf(paramArrayOffloat[i]), Float.valueOf(f))).floatValue();
      i--;
    } 
    return Float.valueOf(f);
  }
  
  @SinceKotlin(version = "1.7")
  public static final boolean maxByOrThrow(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x42ED21649CAL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i == 0)
        return bool1; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool1));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      boolean bool2 = paramArrayOfboolean[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool2));
      if (comparable.compareTo(comparable1) < 0) {
        bool1 = bool2;
        comparable = comparable1;
      } 
    } 
    return bool1;
  }
  
  @NotNull
  public static final Set toSet(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x38E28C5431FCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      switch (paramArrayOfboolean.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfboolean, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfboolean.length)));
  }
  
  public static final int indexOfFirst(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x649340C792CDL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Float.valueOf(paramArrayOffloat[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  public static final boolean none(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x6B8C629396D5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfboolean.length == 0);
  }
  
  public static final int count(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3A9353D9CA97L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfObject.length;
    while (b2 < i) {
      Object object = paramArrayOfObject[b2];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Object reduceRightOrNull(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x27392A2C737DL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfObject);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object;
    for (object = paramArrayOfObject[i--]; i >= 0; object = paramFunction2.invoke(paramArrayOfObject[i--], object));
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = d ^ 0x2A19C67402FAL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfshort.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      short s = paramArrayOfshort[k];
      paramArrayOfshort[k] = paramArrayOfshort[j];
      paramArrayOfshort[j] = s;
      j--;
    } 
  }
  
  @SinceKotlin(version = "1.7")
  public static final byte minOrThrow(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x2EFAF499249EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      byte b1 = paramArrayOfbyte[i];
      if (b > b1)
        b = b1; 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull double[] paramArrayOfdouble, @NotNull Random paramRandom) {
    long l = d ^ 0x1D9E2F9D5D8L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfdouble); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      double d = paramArrayOfdouble[i];
      paramArrayOfdouble[i] = paramArrayOfdouble[j];
      paramArrayOfdouble[j] = d;
    } 
  }
  
  public static final boolean any(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1F8586971845L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @NotNull
  public static final Map associateTo(@NotNull double[] paramArrayOfdouble, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7D338473CEA8L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Double.valueOf(d));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  public static final int sum(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x160AC0265B53L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfbyte.length;
    while (b < j) {
      byte b1 = paramArrayOfbyte[b];
      i += b1;
      b++;
    } 
    return i;
  }
  
  public static final int single(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3AE00CF326AEL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Integer integer = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          integer = Integer.valueOf(j);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(integer, "null cannot be cast to non-null type kotlin.Int");
    return integer.intValue();
  }
  
  @NotNull
  public static final List dropLastWhile(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4C83E007695BL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramArrayOfchar[i]))).booleanValue())
              return ArraysKt.take(paramArrayOfchar, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return CollectionsKt.emptyList();
    } 
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull int[] paramArrayOfint, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1B409BA4812DL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      Object object1 = paramFunction1.invoke(Integer.valueOf(j));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Integer> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Integer.valueOf(j));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.3")
  public static final Object random(@NotNull Object[] paramArrayOfObject, @NotNull Random paramRandom) {
    long l = d ^ 0x4BFD12500F31L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfObject.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfObject[paramRandom.nextInt(paramArrayOfObject.length)];
  }
  
  @SinceKotlin(version = "1.4")
  public static final void reverse(@NotNull double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
    long l = d ^ 0x73A0A095EAE2L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfdouble.length);
    int i = (paramInt1 + paramInt2) / 2;
    try {
      if (paramInt1 == i)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = paramInt2 - 1;
    for (int k = paramInt1; k < i; k++) {
      double d = paramArrayOfdouble[k];
      paramArrayOfdouble[k] = paramArrayOfdouble[j];
      paramArrayOfdouble[j] = d;
      j--;
    } 
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x70A2444CB15EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$3(paramArrayOfshort));
  }
  
  @NotNull
  public static final List takeWhile(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x42A32822BEA5L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Short> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Short.valueOf(s))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Short.valueOf(s));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final double[] sortedArrayDescending(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x25D8C157BB6AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return paramArrayOfdouble; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfdouble, paramArrayOfdouble.length), "copyOf(this, size)");
    double[] arrayOfDouble1 = Arrays.copyOf(paramArrayOfdouble, paramArrayOfdouble.length);
    double[] arrayOfDouble2 = arrayOfDouble1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfDouble2);
    return arrayOfDouble1;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Integer minByOrNull(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x69061C01F231L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    int j = ArraysKt.getLastIndex(paramArrayOfint);
    try {
      if (j == 0)
        return Integer.valueOf(i); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Integer.valueOf(i));
    IntIterator intIterator = (new IntRange(1, j)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      int m = paramArrayOfint[k];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Integer.valueOf(m));
      if (comparable.compareTo(comparable1) > 0) {
        i = m;
        comparable = comparable1;
      } 
    } 
    return Integer.valueOf(i);
  }
  
  public static final Object foldRightIndexed(@NotNull float[] paramArrayOffloat, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x1F675DEAF6EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Float.valueOf(paramArrayOffloat[i]), object);
      i--;
    } 
    return object;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x338F0BC89C02L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfBoolean.length;
    while (b < i) {
      boolean bool = arrayOfBoolean[b];
      Object object1 = paramFunction11.invoke(Boolean.valueOf(bool));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Boolean.valueOf(bool)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List reversed(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x5BF068F0671L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfdouble);
    CollectionsKt.reverse(list);
    return list;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x169BA5DEFE2DL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOflong, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOflong.length)));
  }
  
  @NotNull
  public static final List zip(@NotNull Object[] paramArrayOfObject1, @NotNull Object[] paramArrayOfObject2) {
    long l = d ^ 0x2176D497DF53L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject2, "other");
    Object[] arrayOfObject = paramArrayOfObject1;
    boolean bool = false;
    int i = Math.min(arrayOfObject.length, paramArrayOfObject2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object1 = paramArrayOfObject2[b];
      Object object2 = arrayOfObject[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(object2, object1));
    } 
    return arrayList;
  }
  
  public static final boolean single(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x54AAE77232E7L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Boolean bool = null;
    boolean bool2 = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool3 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool3))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Array contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          bool = Boolean.valueOf(bool3);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Array contains no element matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
    return bool.booleanValue();
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull long[] paramArrayOflong, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x3CB0FBD7A8FL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      Object object1 = paramFunction11.invoke(Long.valueOf(l1));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Long.valueOf(l1)));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final double minByOrThrow(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x79FF62C839BFL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i == 0)
        return d; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Double.valueOf(d));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      double d1 = paramArrayOfdouble[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Double.valueOf(d1));
      if (comparable.compareTo(comparable1) > 0) {
        d = d1;
        comparable = comparable1;
      } 
    } 
    return d;
  }
  
  @NotNull
  public static final Set subtract(@NotNull boolean[] paramArrayOfboolean, @NotNull Iterable paramIterable) {
    long l = d ^ 0x2662B763EAE5L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfboolean);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  public static final void forEachIndexed(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x42ECCF545EEL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfchar.length;
    while (b2 < i) {
      char c = paramArrayOfchar[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c));
      b2++;
    } 
  }
  
  @NotNull
  public static final List reversed(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x64994557E9BAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOffloat);
    CollectionsKt.reverse(list);
    return list;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Byte reduceRightOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x1C660F7150C1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b;
    for (b = paramArrayOfbyte[i--]; i >= 0; b = ((Number)paramFunction2.invoke(Byte.valueOf(paramArrayOfbyte[i--]), Byte.valueOf(b))).byteValue());
    return Byte.valueOf(b);
  }
  
  @NotNull
  public static final Map groupBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x670B62B50CFBL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      Object object1 = paramFunction1.invoke(Long.valueOf(l1));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Long> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Long.valueOf(l1));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final int indexOfLast(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x647E3DCEC95EL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfdouble.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Double.valueOf(paramArrayOfdouble[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @Nullable
  public static final Double singleOrNull(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x5326B8A9B77BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfdouble.length == 1) ? Double.valueOf(paramArrayOfdouble[0]) : null;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float reduceIndexedOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x4281D6E08DBCL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      f = ((Number)paramFunction3.invoke(Integer.valueOf(i), Float.valueOf(f), Float.valueOf(paramArrayOffloat[i]))).floatValue();
    } 
    return Float.valueOf(f);
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull byte[] paramArrayOfbyte, @NotNull Collection<Byte> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x62A17ABA2DABL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          paramCollection.add(Byte.valueOf(b1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x642470682E8DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfbyte.length), 16);
    byte[] arrayOfByte = paramArrayOfbyte;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfByte.length;
    while (b < j) {
      byte b1 = arrayOfByte[b];
      linkedHashMap.put(paramFunction11.invoke(Byte.valueOf(b1)), paramFunction12.invoke(Byte.valueOf(b1)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double maxOrNull(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x4A5C85AC0DAFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      d = Math.max(d, d1);
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final char[] sortedArrayDescending(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x6793D135DAA9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return paramArrayOfchar; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfchar, paramArrayOfchar.length), "copyOf(this, size)");
    char[] arrayOfChar1 = Arrays.copyOf(paramArrayOfchar, paramArrayOfchar.length);
    char[] arrayOfChar2 = arrayOfChar1;
    boolean bool = false;
    ArraysKt.sortDescending(arrayOfChar2);
    return arrayOfChar1;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull int[] paramArrayOfint, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x65520D4CB3B5L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      paramMap.put(paramFunction11.invoke(Integer.valueOf(j)), paramFunction12.invoke(Integer.valueOf(j)));
      b++;
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long reduceIndexedOrNull(@NotNull long[] paramArrayOflong, @NotNull Function3 paramFunction3) {
    long l1 = d ^ 0x5B88F90F8224L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      l2 = ((Number)paramFunction3.invoke(Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(paramArrayOflong[i]))).longValue();
    } 
    return Long.valueOf(l2);
  }
  
  public static final boolean any(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0xB3510B21CB0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfshort.length == 0) ? 1 : 0);
  }
  
  public static final char single(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x3AB0C79D7CBBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      switch (paramArrayOfchar.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @NotNull
  public static final List zip(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = d ^ 0x50C3B086522AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    byte[] arrayOfByte = paramArrayOfbyte;
    boolean bool = false;
    int i = arrayOfByte.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        byte b1 = arrayOfByte[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Byte.valueOf(b1), object1));
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List zip(@NotNull boolean[] paramArrayOfboolean1, @NotNull boolean[] paramArrayOfboolean2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x67F07B2B4D35L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfboolean2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfboolean1.length, paramArrayOfboolean2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Boolean.valueOf(paramArrayOfboolean1[b]), Boolean.valueOf(paramArrayOfboolean2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull long[] paramArrayOflong, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6D6110272A56L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      paramCollection.add(paramFunction1.invoke(Long.valueOf(l1)));
      b++;
    } 
    return paramCollection;
  }
  
  public static final boolean contains(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x2F12155C77FCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ArraysKt.indexOf(paramArrayOfint, paramInt) >= 0);
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    long l = d ^ 0x52E940CB5D3DL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    ArraysKt.sort(paramArrayOfchar, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x12F22836EF30L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOffloat, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOffloat.length)));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Long randomOrNull(@NotNull long[] paramArrayOflong, @NotNull Random paramRandom) {
    long l = d ^ 0x7F92FBB3BBA3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Long.valueOf(paramArrayOflong[paramRandom.nextInt(paramArrayOflong.length)]);
  }
  
  @NotNull
  public static final List sortedWith(@NotNull float[] paramArrayOffloat, @NotNull Comparator paramComparator) {
    long l = d ^ 0x4BEBD6622891L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Float[] arrayOfFloat1 = ArraysKt.toTypedArray(paramArrayOffloat);
    Float[] arrayOfFloat2 = arrayOfFloat1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfFloat2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfFloat1);
  }
  
  public static final int first(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x18819BC43E8EL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          return j; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final List zip(@NotNull char[] paramArrayOfchar, @NotNull Iterable paramIterable, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2F6B1D82711BL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramArrayOfchar.length;
    ArrayList<Object> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      try {
        if (b < i)
          arrayList.add(paramFunction2.invoke(Character.valueOf(paramArrayOfchar[b++]), object)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection<Boolean> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 130863039676174
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: baload
    //   58: istore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: iload #11
    //   67: istore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: iload #12
    //   82: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: iload #12
    //   102: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List dropWhile(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xFF1515E4357L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList<Float> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (bool2) {
          arrayList.add(Float.valueOf(f));
        } else if (!((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue()) {
          arrayList.add(Float.valueOf(f));
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List sorted(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x7A3EEB5E80F4L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Float[] arrayOfFloat1 = ArraysKt.toTypedArray(paramArrayOffloat);
    Float[] arrayOfFloat2 = arrayOfFloat1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfFloat2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfFloat2);
    return ArraysKt.asList((Object[])arrayOfFloat1);
  }
  
  public static final void sortDescending(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x67D746A195E7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      if (paramArrayOfdouble.length > 1) {
        ArraysKt.sort(paramArrayOfdouble);
        ArraysKt.reverse(paramArrayOfdouble);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final Map associate(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1F9157AB068L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOflong.length), 16);
    long[] arrayOfLong = paramArrayOflong;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfLong.length;
    while (b < j) {
      long l1 = arrayOfLong[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Long.valueOf(l1));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final boolean maxWithOrThrow(@NotNull boolean[] paramArrayOfboolean, @NotNull Comparator<Boolean> paramComparator) {
    long l = d ^ 0x1E786065148FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      boolean bool1 = paramArrayOfboolean[i];
      if (paramComparator.compare(Boolean.valueOf(bool), Boolean.valueOf(bool1)) < 0)
        bool = bool1; 
    } 
    return bool;
  }
  
  @NotNull
  public static final List takeLast(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = d ^ 0x56C6C412D08AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOfbyte.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOfbyte); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Byte.valueOf(paramArrayOfbyte[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Byte> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Byte.valueOf(paramArrayOfbyte[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associate(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3D3EE90D3020L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfbyte.length), 16);
    byte[] arrayOfByte = paramArrayOfbyte;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfByte.length;
    while (b < j) {
      byte b1 = arrayOfByte[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Byte.valueOf(b1));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List takeLast(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = d ^ 0x3AAF464C669L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
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
      throw a(null);
    } 
    i = paramArrayOflong.length;
    try {
      if (paramInt >= i)
        return ArraysKt.toList(paramArrayOflong); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Long.valueOf(paramArrayOflong[i - 1])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Long> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(Long.valueOf(paramArrayOflong[j]));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List takeLastWhile(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6A6D185BB55BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Short.valueOf(paramArrayOfshort[i]))).booleanValue())
              return ArraysKt.drop(paramArrayOfshort, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return ArraysKt.toList(paramArrayOfshort);
    } 
  }
  
  @NotNull
  public static final List drop(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = d ^ 0x391CDF637B67L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.takeLast(paramArrayOfObject, RangesKt.coerceAtLeast(paramArrayOfObject.length - paramInt, 0));
  }
  
  public static final int indexOf(@NotNull char[] paramArrayOfchar, char paramChar) {
    long l = d ^ 0x194955154A1AL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (paramChar == paramArrayOfchar[b])
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final List zip(@NotNull short[] paramArrayOfshort1, @NotNull short[] paramArrayOfshort2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3879A6860AB4L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfshort2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfshort1.length, paramArrayOfshort2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Short.valueOf(paramArrayOfshort1[b]), Short.valueOf(paramArrayOfshort2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set toSet(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x66FC2695B03L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      switch (paramArrayOfbyte.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOfbyte, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfbyte.length)));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Float reduceOrNull(@NotNull float[] paramArrayOffloat, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2EA63E3E350FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      f = ((Number)paramFunction2.invoke(Float.valueOf(f), Float.valueOf(paramArrayOffloat[i]))).floatValue();
    } 
    return Float.valueOf(f);
  }
  
  @Nullable
  public static final Object singleOrNull(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x1E1E908A6C34L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfObject.length == 1) ? paramArrayOfObject[0] : null;
  }
  
  @Nullable
  public static final Byte firstOrNull(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x483FDAA1CC56L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          return Byte.valueOf(b1); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return null;
  }
  
  public static final int lastIndexOf(@NotNull byte[] paramArrayOfbyte, byte paramByte) {
    long l = d ^ 0x64D5ED8EF860L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    int i = paramArrayOfbyte.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (paramByte == paramArrayOfbyte[j])
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final Set intersect(@NotNull Object[] paramArrayOfObject, @NotNull Iterable paramIterable) {
    long l = d ^ 0x5FBE8E3ACE0BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfObject);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull short[] paramArrayOfshort, @NotNull Collection<Short> paramCollection) {
    long l = d ^ 0x2D97F92E6AA8L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfshort.length;
    while (b < i) {
      short s = paramArrayOfshort[b];
      paramCollection.add(Short.valueOf(s));
      b++;
    } 
    return paramCollection;
  }
  
  public static final void reverse(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x719E6348C5A0L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    int i = paramArrayOfObject.length / 2 - 1;
    try {
      if (i < 0)
        return; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int j = ArraysKt.getLastIndex(paramArrayOfObject);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      Object object = paramArrayOfObject[k];
      paramArrayOfObject[k] = paramArrayOfObject[j];
      paramArrayOfObject[j] = object;
      j--;
    } 
  }
  
  @NotNull
  public static final Object[] sliceArray(@NotNull Object[] paramArrayOfObject, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x6F3D853FDE1BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramIntRange, "indices");
    if (paramIntRange.isEmpty()) {
      Object[] arrayOfObject1 = paramArrayOfObject;
      boolean bool1 = false;
      boolean bool2 = false;
      return ArraysKt.copyOfRange(arrayOfObject1, bool1, bool2);
    } 
    Object[] arrayOfObject = paramArrayOfObject;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfObject, i, j);
  }
  
  public static final boolean any(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x63F46C3F311EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfchar.length == 0) ? 1 : 0);
  }
  
  public static final boolean any(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6FE096692650L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return false;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x5B25883EF00EL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    long[] arrayOfLong = paramArrayOflong;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      Object object1 = paramFunction11.invoke(Long.valueOf(l1));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Long.valueOf(l1)));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final Object single(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x5B226AA64E02L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      switch (paramArrayOfObject.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  @NotNull
  public static final List filterNot(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x53FFC32E1901L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    double[] arrayOfDouble = paramArrayOfdouble;
    ArrayList<Double> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfDouble.length;
    while (b < i) {
      double d = arrayOfDouble[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          arrayList.add(Double.valueOf(d)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x613CFC3FF4FCL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object1 = arrayOfObject[b];
      Object object2 = paramFunction11.invoke(object1);
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object3 = linkedHashMap1.get(object2);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object2, arrayList);
      List<Object> list = (object3 == null) ? arrayList : (List)object3;
      list.add(paramFunction12.invoke(object1));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Set intersect(@NotNull double[] paramArrayOfdouble, @NotNull Iterable paramIterable) {
    long l = d ^ 0x7CEB114BF7D3L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfdouble);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  @NotNull
  public static final List toList(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x67F88D7822L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      switch (paramArrayOfint.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ArraysKt.toMutableList(paramArrayOfint);
  }
  
  @NotNull
  public static final List dropLast(@NotNull boolean[] paramArrayOfboolean, int paramInt) {
    long l = d ^ 0x626BB640B41FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfboolean, RangesKt.coerceAtLeast(paramArrayOfboolean.length - paramInt, 0));
  }
  
  @NotNull
  public static final List sortedWith(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator paramComparator) {
    long l = d ^ 0x5B33DD87D15CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Byte[] arrayOfByte1 = ArraysKt.toTypedArray(paramArrayOfbyte);
    Byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    ArraysKt.sortWith((Object[])arrayOfByte2, paramComparator);
    return ArraysKt.asList((Object[])arrayOfByte1);
  }
  
  public static final int getLastIndex(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x4AC2C9B92D2BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return paramArrayOfshort.length - 1;
  }
  
  @NotNull
  public static final Collection filterNotTo(@NotNull double[] paramArrayOfdouble, @NotNull Collection<Double> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x249BE8333EF7L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          paramCollection.add(Double.valueOf(d)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xA4E3E3357C8L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfbyte.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfByte.length;
    while (b2 < i) {
      byte b = arrayOfByte[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Byte.valueOf(b)));
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List zip(@NotNull int[] paramArrayOfint1, @NotNull int[] paramArrayOfint2) {
    long l = d ^ 0x536F7F90DED3L;
    Intrinsics.checkNotNullParameter(paramArrayOfint1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfint2, "other");
    int[] arrayOfInt = paramArrayOfint1;
    boolean bool = false;
    int i = Math.min(arrayOfInt.length, paramArrayOfint2.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint2[b];
      int k = arrayOfInt[b];
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Integer.valueOf(k), Integer.valueOf(j)));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List take(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = d ^ 0x6EBED703A2BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfbyte.length)
        return ArraysKt.toList(paramArrayOfbyte); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Byte.valueOf(paramArrayOfbyte[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Byte> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfbyte.length;
    while (b2 < i) {
      byte b = paramArrayOfbyte[b2];
      try {
        arrayList.add(Byte.valueOf(b));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull float[] paramArrayOffloat, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x32878CAFF1CDL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOffloat.length;
    while (b2 < i) {
      float f = paramArrayOffloat[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Float.valueOf(f)));
      b2++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List take(@NotNull char[] paramArrayOfchar, int paramInt) {
    long l = d ^ 0x24D55F1B0390L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b1 = (paramInt >= 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt >= paramArrayOfchar.length)
        return ArraysKt.toList(paramArrayOfchar); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(Character.valueOf(paramArrayOfchar[0])); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<Character> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = paramArrayOfchar.length;
    while (b2 < i) {
      char c = paramArrayOfchar[b2];
      try {
        arrayList.add(Character.valueOf(c));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x6527267E7AFEL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    ArraysKt.shuffle(paramArrayOfshort, (Random)Random.Default);
  }
  
  public static final float sum(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x5D2F2246DD1CL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    float f = 0.0F;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f1 = paramArrayOffloat[b];
      f += f1;
      b++;
    } 
    return f;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull long[] paramArrayOflong, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x31D6E6F91452L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      Object object1 = paramFunction1.invoke(Long.valueOf(l1));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Long> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Long.valueOf(l1));
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Collection filterTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection<Boolean> paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x35A399645480L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          paramCollection.add(Boolean.valueOf(bool1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  public static final Object fold(@NotNull float[] paramArrayOffloat, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x58F0423C2D9FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      object = paramFunction2.invoke(object, Float.valueOf(f));
      b++;
    } 
    return object;
  }
  
  public static final short reduce(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    long l = d ^ 0xD640CFD2EC9L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s = ((Number)paramFunction2.invoke(Short.valueOf(s), Short.valueOf(paramArrayOfshort[i]))).shortValue();
    } 
    return s;
  }
  
  public static final byte single(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x249E4A7CA6D2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      switch (paramArrayOfbyte.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  public static final boolean none(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x73A8FB603282L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOffloat.length == 0);
  }
  
  @NotNull
  public static final float[] reversedArray(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x67704FBEC969L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return paramArrayOffloat; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float[] arrayOfFloat = new float[paramArrayOffloat.length];
    int i = ArraysKt.getLastIndex(paramArrayOffloat);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfFloat[i - j] = paramArrayOffloat[j];
    } 
    return arrayOfFloat;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull long[] paramArrayOflong, @NotNull Random paramRandom) {
    long l = d ^ 0x76F4CF5FF511L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOflong); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      long l1 = paramArrayOflong[i];
      paramArrayOflong[i] = paramArrayOflong[j];
      paramArrayOflong[j] = l1;
    } 
  }
  
  public static final double average(@NotNull int[] paramArrayOfint) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 56846881993876
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 55
    //   33: aload_0
    //   34: iload #6
    //   36: iaload
    //   37: istore #8
    //   39: dload_3
    //   40: iload #8
    //   42: i2d
    //   43: dadd
    //   44: dstore_3
    //   45: iinc #5, 1
    //   48: nop
    //   49: iinc #6, 1
    //   52: goto -> 26
    //   55: iload #5
    //   57: ifne -> 70
    //   60: ldc2_w NaN
    //   63: goto -> 75
    //   66: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   69: athrow
    //   70: dload_3
    //   71: iload #5
    //   73: i2d
    //   74: ddiv
    //   75: dreturn
    // Exception table:
    //   from	to	target	type
    //   55	66	66	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List zip(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = d ^ 0x988F5B30379L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    int[] arrayOfInt = paramArrayOfint;
    boolean bool = false;
    int i = arrayOfInt.length;
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        int j = arrayOfInt[b++];
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Integer.valueOf(j), object1));
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull short[] paramArrayOfshort, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2569FFADD202L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    short[] arrayOfShort = paramArrayOfshort;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfshort.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfShort.length;
    while (b2 < i) {
      short s = arrayOfShort[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Short.valueOf(s)));
      b2++;
    } 
    return arrayList;
  }
  
  public static final Object fold(@NotNull double[] paramArrayOfdouble, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x7898A18DE4F9L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      object = paramFunction2.invoke(object, Double.valueOf(d));
      b++;
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  public static final boolean minWithOrThrow(@NotNull boolean[] paramArrayOfboolean, @NotNull Comparator<Boolean> paramComparator) {
    long l = d ^ 0x59A2940B6F56L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      boolean bool1 = paramArrayOfboolean[i];
      if (paramComparator.compare(Boolean.valueOf(bool), Boolean.valueOf(bool1)) > 0)
        bool = bool1; 
    } 
    return bool;
  }
  
  public static final char reduceRight(@NotNull char[] paramArrayOfchar, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x1A9222E0DE6BL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c;
    for (c = paramArrayOfchar[i--]; i >= 0; c = ((Character)paramFunction2.invoke(Character.valueOf(paramArrayOfchar[i--]), Character.valueOf(c))).charValue());
    return c;
  }
  
  public static final Object foldRight(@NotNull char[] paramArrayOfchar, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x38DFA427FADEL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Character.valueOf(paramArrayOfchar[i--]), object));
    return object;
  }
  
  public static final byte last(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2EC6768DC734L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfbyte.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        byte b = paramArrayOfbyte[j];
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b))).booleanValue())
          return b; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public static final Object foldRight(@NotNull short[] paramArrayOfshort, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6AE74C363F81L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Short.valueOf(paramArrayOfshort[i--]), object));
    return object;
  }
  
  public static final double reduce(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x343CC9410178L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      d = ((Number)paramFunction2.invoke(Double.valueOf(d), Double.valueOf(paramArrayOfdouble[i]))).doubleValue();
    } 
    return d;
  }
  
  public static final void sortDescending(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x4241203DA6BAL;
    Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    ArraysKt.sortWith((Object[])paramArrayOfComparable, ComparisonsKt.reverseOrder());
  }
  
  @Nullable
  public static final Byte getOrNull(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = d ^ 0x3913AD9D67BBL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfbyte));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  public static final double reduceRightIndexed(@NotNull double[] paramArrayOfdouble, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x786830DA5FF2L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[i--];
    while (i >= 0) {
      d = ((Number)paramFunction3.invoke(Integer.valueOf(i), Double.valueOf(paramArrayOfdouble[i]), Double.valueOf(d))).doubleValue();
      i--;
    } 
    return d;
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull float[] paramArrayOffloat, @NotNull Collection<Float> paramCollection) {
    long l = d ^ 0x305A164E1E5EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      paramCollection.add(Float.valueOf(f));
      b++;
    } 
    return paramCollection;
  }
  
  public static final boolean none(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x455B66D4CAD4L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final String joinToString(@NotNull Object[] paramArrayOfObject, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x18EADA2CA09AL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfObject, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfObject, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  public static final double reduceIndexed(@NotNull double[] paramArrayOfdouble, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x45C702900430L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      d = ((Number)paramFunction3.invoke(Integer.valueOf(i), Double.valueOf(d), Double.valueOf(paramArrayOfdouble[i]))).doubleValue();
    } 
    return d;
  }
  
  @NotNull
  public static final Map associate(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x52510B51088AL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfshort.length), 16);
    short[] arrayOfShort = paramArrayOfshort;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfShort.length;
    while (b < j) {
      short s = arrayOfShort[b];
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Short.valueOf(s));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final char reduceRightIndexed(@NotNull char[] paramArrayOfchar, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x5CA49FF1C3DCL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfchar);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramArrayOfchar[i--];
    while (i >= 0) {
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(paramArrayOfchar[i]), Character.valueOf(c))).charValue();
      i--;
    } 
    return c;
  }
  
  public static final char first(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x69E78B1A251L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfchar[0];
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double minByOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3C466A050C56L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    int i = ArraysKt.getLastIndex(paramArrayOfdouble);
    try {
      if (i == 0)
        return Double.valueOf(d); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Double.valueOf(d));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      double d1 = paramArrayOfdouble[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Double.valueOf(d1));
      if (comparable.compareTo(comparable1) > 0) {
        d = d1;
        comparable = comparable1;
      } 
    } 
    return Double.valueOf(d);
  }
  
  @NotNull
  public static final List toMutableList(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x4C9ACAB20A70L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    ArrayList<Double> arrayList = new ArrayList(paramArrayOfdouble.length);
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      arrayList.add(Double.valueOf(d));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateTo(@NotNull boolean[] paramArrayOfboolean, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3B36B9E0931BL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Boolean.valueOf(bool1));
      map.put(pair.getFirst(), pair.getSecond());
      b++;
    } 
    return paramMap;
  }
  
  @NotNull
  public static final int[] sliceArray(@NotNull int[] paramArrayOfint, @NotNull IntRange paramIntRange) {
    long l = d ^ 0xE540BD26981L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return new int[0]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int[] arrayOfInt = paramArrayOfint;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.copyOfRange(arrayOfInt, i, j);
  }
  
  public static final int lastIndexOf(@NotNull short[] paramArrayOfshort, short paramShort) {
    long l = d ^ 0x2DECF445BA3AL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    int i = paramArrayOfshort.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (paramShort == paramArrayOfshort[j])
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @NotNull
  public static final List flatMap(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1670BCAA038DL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfBoolean.length;
    while (b < i) {
      boolean bool = arrayOfBoolean[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Boolean.valueOf(bool));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Object getOrNull(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = d ^ 0x61BE7D66D5F9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfObject));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long maxWithOrNull(@NotNull long[] paramArrayOflong, @NotNull Comparator<Long> paramComparator) {
    long l1 = d ^ 0x67714822A72L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOflong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = paramArrayOflong[i];
      if (paramComparator.compare(Long.valueOf(l2), Long.valueOf(l)) < 0)
        l2 = l; 
    } 
    return Long.valueOf(l2);
  }
  
  public static final Object foldRightIndexed(@NotNull long[] paramArrayOflong, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x291F1B05C426L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Long.valueOf(paramArrayOflong[i]), object);
      i--;
    } 
    return object;
  }
  
  @NotNull
  public static final List sortedByDescending(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7F0A2CFA3DD4L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfbyte, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List zip(@NotNull int[] paramArrayOfint, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x504D7099FD4CL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfint.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Integer.valueOf(paramArrayOfint[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set intersect(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = d ^ 0x675CFA5CA2FL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfbyte);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  public static final byte reduce(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x225E058DB465L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfbyte.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfbyte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b = ((Number)paramFunction2.invoke(Byte.valueOf(b), Byte.valueOf(paramArrayOfbyte[i]))).byteValue();
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Boolean minWithOrNull(@NotNull boolean[] paramArrayOfboolean, @NotNull Comparator<Boolean> paramComparator) {
    long l = d ^ 0x23A93F71EFA8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = paramArrayOfboolean[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfboolean))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      boolean bool1 = paramArrayOfboolean[i];
      if (paramComparator.compare(Boolean.valueOf(bool), Boolean.valueOf(bool1)) > 0)
        bool = bool1; 
    } 
    return Boolean.valueOf(bool);
  }
  
  public static final short last(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x64061010B12AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfshort[ArraysKt.getLastIndex(paramArrayOfshort)];
  }
  
  @NotNull
  public static final List slice(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = d ^ 0x6153B7F1D450L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Long> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(Long.valueOf(paramArrayOflong[j]));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 43151153316381
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: baload
    //   71: istore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: iload #13
    //   80: istore #14
    //   82: istore #15
    //   84: iconst_0
    //   85: istore #16
    //   87: aload_1
    //   88: iload #15
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: iload #14
    //   95: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: iload #14
    //   116: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List filterIndexed(@NotNull double[] paramArrayOfdouble, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 14859428740841
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
    //   51: iconst_0
    //   52: istore #11
    //   54: aload #8
    //   56: arraylength
    //   57: istore #12
    //   59: iload #11
    //   61: iload #12
    //   63: if_icmpge -> 140
    //   66: aload #8
    //   68: iload #11
    //   70: daload
    //   71: dstore #13
    //   73: iload #10
    //   75: iinc #10, 1
    //   78: dload #13
    //   80: dstore #15
    //   82: istore #17
    //   84: iconst_0
    //   85: istore #18
    //   87: aload_1
    //   88: iload #17
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: dload #15
    //   95: invokestatic valueOf : (D)Ljava/lang/Double;
    //   98: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 132
    //   112: aload #6
    //   114: dload #15
    //   116: invokestatic valueOf : (D)Ljava/lang/Double;
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: iinc #11, 1
    //   137: goto -> 59
    //   140: nop
    //   141: aload #6
    //   143: checkcast java/util/List
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   87	125	128	java/util/NoSuchElementException
  }
  
  public static final boolean all(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x244635223595L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  public static final void forEach(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7540FAAE32D8L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      paramFunction1.invoke(Long.valueOf(l1));
      b++;
    } 
  }
  
  @NotNull
  public static final int[] reversedArray(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x6A431F86A64FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        return paramArrayOfint; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int[] arrayOfInt = new int[paramArrayOfint.length];
    int i = ArraysKt.getLastIndex(paramArrayOfint);
    IntIterator intIterator = (new IntRange(0, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      arrayOfInt[i - j] = paramArrayOfint[j];
    } 
    return arrayOfInt;
  }
  
  @NotNull
  public static final List sorted(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x2941100112FCL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Character[] arrayOfCharacter1 = ArraysKt.toTypedArray(paramArrayOfchar);
    Character[] arrayOfCharacter2 = arrayOfCharacter1;
    boolean bool = false;
    Intrinsics.checkNotNull(arrayOfCharacter2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    ArraysKt.sort((Object[])arrayOfCharacter2);
    return ArraysKt.asList((Object[])arrayOfCharacter1);
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = d ^ 0x67FD5EF2C41AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    ArraysKt.sort(paramArrayOfint, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfint, paramInt1, paramInt2);
  }
  
  public static final int lastIndexOf(@NotNull char[] paramArrayOfchar, char paramChar) {
    long l = d ^ 0x23A7958F217L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    int i = paramArrayOfchar.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (paramChar == paramArrayOfchar[j])
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull Object[] paramArrayOfObject, @NotNull Random paramRandom) {
    long l = d ^ 0x415D612A06D0L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfObject); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      Object object = paramArrayOfObject[i];
      paramArrayOfObject[i] = paramArrayOfObject[j];
      paramArrayOfObject[j] = object;
    } 
  }
  
  @SinceKotlin(version = "1.7")
  public static final short minByOrThrow(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6D04B0C01BDFL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i == 0)
        return s; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Short.valueOf(s));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      short s1 = paramArrayOfshort[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Short.valueOf(s1));
      if (comparable.compareTo(comparable1) > 0) {
        s = s1;
        comparable = comparable1;
      } 
    } 
    return s;
  }
  
  @NotNull
  public static final Set toSet(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x562FBEFAB1D7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      switch (paramArrayOflong.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)ArraysKt.toCollection(paramArrayOflong, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOflong.length)));
  }
  
  public static final void sortDescending(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x13B216E08635L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      if (paramArrayOfbyte.length > 1) {
        ArraysKt.sort(paramArrayOfbyte);
        ArraysKt.reverse(paramArrayOfbyte);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x667AB5364322L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return new IndexingIterable(new ArraysKt___ArraysKt$withIndex$5(paramArrayOflong));
  }
  
  @NotNull
  public static final List zip(@NotNull char[] paramArrayOfchar1, @NotNull char[] paramArrayOfchar2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x349803F2A235L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfchar2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfchar1.length, paramArrayOfchar2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Character.valueOf(paramArrayOfchar1[b]), Character.valueOf(paramArrayOfchar2[b])));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  public static final int indexOfFirst(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4EAE66069BEL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Long.valueOf(paramArrayOflong[b]))).booleanValue())
              return b; 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  @NotNull
  public static final List flatMap(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x686B4A53611FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfFloat.length;
    while (b < i) {
      float f = arrayOfFloat[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Float.valueOf(f));
      CollectionsKt.addAll(arrayList, iterable);
      b++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull int[] paramArrayOfint, @NotNull Random paramRandom) {
    long l = d ^ 0x675DCF0D4166L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    for (int i = ArraysKt.getLastIndex(paramArrayOfint); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      int k = paramArrayOfint[i];
      paramArrayOfint[i] = paramArrayOfint[j];
      paramArrayOfint[j] = k;
    } 
  }
  
  public static final short reduceRightIndexed(@NotNull short[] paramArrayOfshort, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x6132ADB13B71L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[i--];
    while (i >= 0) {
      s = ((Number)paramFunction3.invoke(Integer.valueOf(i), Short.valueOf(paramArrayOfshort[i]), Short.valueOf(s))).shortValue();
      i--;
    } 
    return s;
  }
  
  public static final boolean all(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6810FA24F253L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short maxByOrNull(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2AA13C34A775L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    int i = ArraysKt.getLastIndex(paramArrayOfshort);
    try {
      if (i == 0)
        return Short.valueOf(s); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Short.valueOf(s));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      short s1 = paramArrayOfshort[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Short.valueOf(s1));
      if (comparable.compareTo(comparable1) < 0) {
        s = s1;
        comparable = comparable1;
      } 
    } 
    return Short.valueOf(s);
  }
  
  public static final void forEachIndexed(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x6AAFE5F05C73L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfbyte.length;
    while (b2 < i) {
      byte b = paramArrayOfbyte[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), Byte.valueOf(b));
      b2++;
    } 
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull char[] paramArrayOfchar, @NotNull Collection<Character> paramCollection) {
    long l = d ^ 0x37CF069E1EE4L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    byte b = 0;
    int i = paramArrayOfchar.length;
    while (b < i) {
      char c = paramArrayOfchar[b];
      paramCollection.add(Character.valueOf(c));
      b++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List sortedBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0xB863EF74847L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    return ArraysKt.sortedWith(paramArrayOfchar, (Comparator)new Object(paramFunction1));
  }
  
  @NotNull
  public static final List slice(@NotNull Object[] paramArrayOfObject, @NotNull IntRange paramIntRange) {
    long l = d ^ 0x5BFD4E6EEBD4L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object[] arrayOfObject = paramArrayOfObject;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    return ArraysKt.asList(ArraysKt.copyOfRange(arrayOfObject, i, j));
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull char[] paramArrayOfchar, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x5FB8C5A8909AL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfchar.length;
    while (b2 < i) {
      char c = paramArrayOfchar[b2];
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c)));
      b2++;
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List sortedDescending(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x721C708BAC6CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    ArraysKt.sort(arrayOfByte2);
    return ArraysKt.reversed(arrayOfByte1);
  }
  
  public static final char last(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x13A8554584B8L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfchar.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        char c = paramArrayOfchar[j];
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return c; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Long minByOrNull(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l1 = d ^ 0x4CFB4A17C483L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = paramArrayOflong[0];
    int i = ArraysKt.getLastIndex(paramArrayOflong);
    try {
      if (i == 0)
        return Long.valueOf(l2); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Long.valueOf(l2));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      long l = paramArrayOflong[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Long.valueOf(l));
      if (comparable.compareTo(comparable1) > 0) {
        l2 = l;
        comparable = comparable1;
      } 
    } 
    return Long.valueOf(l2);
  }
  
  @NotNull
  public static final List zip(@NotNull Object[] paramArrayOfObject1, @NotNull Object[] paramArrayOfObject2, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x3613BA5AC2DCL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOfObject1.length, paramArrayOfObject2.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(paramArrayOfObject1[b], paramArrayOfObject2[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x771F41C2B57DL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfchar, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(paramArrayOfchar.length, 128))));
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x39C8EB0113D5L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfObject.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfObject.length;
    while (b2 < i) {
      Object object = arrayOfObject[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), object));
      b2++;
    } 
    return arrayList;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x6F1AA8366F92L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfObject.length;
    while (b < j) {
      Object object = paramArrayOfObject[b];
      i += ((Number)paramFunction1.invoke(object)).intValue();
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x43D287E1F7D0L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    ArraysKt.shuffle(paramArrayOfObject, (Random)Random.Default);
  }
  
  @NotNull
  public static final Set subtract(@NotNull double[] paramArrayOfdouble, @NotNull Iterable paramIterable) {
    long l = d ^ 0x2570C331C0D5L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfdouble);
    CollectionsKt.removeAll(set, paramIterable);
    return set;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sortDescending(@NotNull float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    long l = d ^ 0x20849F55FE27L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    ArraysKt.sort(paramArrayOffloat, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOffloat, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Short randomOrNull(@NotNull short[] paramArrayOfshort, @NotNull Random paramRandom) {
    long l = d ^ 0x2FF833CA627AL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Short.valueOf(paramArrayOfshort[paramRandom.nextInt(paramArrayOfshort.length)]);
  }
  
  @SinceKotlin(version = "1.7")
  public static final boolean minByOrThrow(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x71F7A88B5BF9L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = paramArrayOfboolean[0];
    int i = ArraysKt.getLastIndex(paramArrayOfboolean);
    try {
      if (i == 0)
        return bool1; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool1));
    IntIterator intIterator = (new IntRange(1, i)).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      boolean bool2 = paramArrayOfboolean[j];
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Boolean.valueOf(bool2));
      if (comparable.compareTo(comparable1) > 0) {
        bool1 = bool2;
        comparable = comparable1;
      } 
    } 
    return bool1;
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x6A19866EEF47L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return SequencesKt.emptySequence(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9(paramArrayOfchar);
  }
  
  public static final int last(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x388AB1094020L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfint[ArraysKt.getLastIndex(paramArrayOfint)];
  }
  
  public static final boolean none(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x45DCCF0336EFL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOffloat.length;
    while (b < i) {
      float f = paramArrayOffloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Double maxWithOrNull(@NotNull double[] paramArrayOfdouble, @NotNull Comparator<Double> paramComparator) {
    long l = d ^ 0xDAE64F326CCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfdouble.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    double d = paramArrayOfdouble[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfdouble))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      double d1 = paramArrayOfdouble[i];
      if (paramComparator.compare(Double.valueOf(d), Double.valueOf(d1)) < 0)
        d = d1; 
    } 
    return Double.valueOf(d);
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull char[] paramArrayOfchar, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x395D044BB5BEL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfchar.length;
    while (b < j) {
      char c = paramArrayOfchar[b];
      i += ((Number)paramFunction1.invoke(Character.valueOf(c))).intValue();
      b++;
    } 
    return i;
  }
  
  public static final double averageOfByte(@NotNull Byte[] paramArrayOfByte) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 7008780754301
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: dconst_0
    //   15: dstore_3
    //   16: iconst_0
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: arraylength
    //   24: istore #7
    //   26: iload #6
    //   28: iload #7
    //   30: if_icmpge -> 58
    //   33: aload_0
    //   34: iload #6
    //   36: aaload
    //   37: invokevirtual byteValue : ()B
    //   40: istore #8
    //   42: dload_3
    //   43: iload #8
    //   45: i2d
    //   46: dadd
    //   47: dstore_3
    //   48: iinc #5, 1
    //   51: nop
    //   52: iinc #6, 1
    //   55: goto -> 26
    //   58: iload #5
    //   60: ifne -> 73
    //   63: ldc2_w NaN
    //   66: goto -> 78
    //   69: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   72: athrow
    //   73: dload_3
    //   74: iload #5
    //   76: i2d
    //   77: ddiv
    //   78: dreturn
    // Exception table:
    //   from	to	target	type
    //   58	69	69	java/util/NoSuchElementException
  }
  
  public static final boolean all(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3426F564BC83L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOflong.length;
    while (b < i) {
      long l1 = paramArrayOflong[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Long.valueOf(l1))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return true;
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x553255A4324BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOfdouble, new HashSet(MapsKt.mapCapacity(paramArrayOfdouble.length)));
  }
  
  public static final void forEachIndexed(@NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x14EECF216BFDL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfObject.length;
    while (b2 < i) {
      Object object = paramArrayOfObject[b2];
      paramFunction2.invoke(Integer.valueOf(b1++), object);
      b2++;
    } 
  }
  
  @NotNull
  public static final List reversed(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x3FB4F662FBD1L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfboolean.length == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = ArraysKt.toMutableList(paramArrayOfboolean);
    CollectionsKt.reverse(list);
    return list;
  }
  
  public static final long first(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x35DC9901367EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOflong.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOflong[0];
  }
  
  @Nullable
  public static final Integer lastOrNull(@NotNull int[] paramArrayOfint) {
    long l = d ^ 0x7CCD1CCF5FBCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOfint.length == 0)) ? null : Integer.valueOf(paramArrayOfint[paramArrayOfint.length - 1]);
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x2133F88A9B6CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = paramArrayOfbyte.length;
    while (b < j) {
      byte b1 = paramArrayOfbyte[b];
      i += ((Number)paramFunction1.invoke(Byte.valueOf(b1))).intValue();
      b++;
    } 
    return i;
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull boolean[] paramArrayOfboolean, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x70386DBDA7CFL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    boolean[] arrayOfBoolean = paramArrayOfboolean;
    ArrayList<Object> arrayList = new ArrayList(paramArrayOfboolean.length);
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = arrayOfBoolean.length;
    while (b2 < i) {
      boolean bool = arrayOfBoolean[b2];
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Boolean.valueOf(bool)));
      b2++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull short[] paramArrayOfshort, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x4E94C374600FL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfshort.length), 16);
    short[] arrayOfShort = paramArrayOfshort;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfShort.length;
    while (b < j) {
      short s = arrayOfShort[b];
      linkedHashMap.put(paramFunction11.invoke(Short.valueOf(s)), paramFunction12.invoke(Short.valueOf(s)));
      b++;
    } 
    return linkedHashMap;
  }
  
  public static final boolean single(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x70EF8EB62EA8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
      switch (paramArrayOfboolean.length) {
        case 0:
          throw new NoSuchElementException("Array is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Array has more than one element.");
  }
  
  public static final boolean last(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x41E2E9BBD18CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfboolean.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        boolean bool1 = paramArrayOfboolean[j];
        if (((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          return bool1; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character randomOrNull(@NotNull char[] paramArrayOfchar, @NotNull Random paramRandom) {
    long l = d ^ 0x299650A595F8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Character.valueOf(paramArrayOfchar[paramRandom.nextInt(paramArrayOfchar.length)]);
  }
  
  public static final int indexOfLast(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x1155F5BE3A29L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOffloat.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Float.valueOf(paramArrayOffloat[j]))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @Nullable
  public static final Integer getOrNull(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = d ^ 0x70BB43F9E0C5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= ArraysKt.getLastIndex(paramArrayOfint));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return null;
  }
  
  @NotNull
  public static final List distinct(@NotNull double[] paramArrayOfdouble) {
    long l = d ^ 0x1B9EDB7F03DAL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return CollectionsKt.toList(ArraysKt.toMutableSet(paramArrayOfdouble));
  }
  
  @NotNull
  public static final Map associateBy(@NotNull long[] paramArrayOflong, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x750427830A06L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOflong.length), 16);
    long[] arrayOfLong = paramArrayOflong;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfLong.length;
    while (b < j) {
      long l1 = arrayOfLong[b];
      linkedHashMap.put(paramFunction11.invoke(Long.valueOf(l1)), paramFunction12.invoke(Long.valueOf(l1)));
      b++;
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List zip(@NotNull float[] paramArrayOffloat, @NotNull Object[] paramArrayOfObject, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x2E6859A5EE7EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramArrayOffloat.length, paramArrayOfObject.length);
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Float.valueOf(paramArrayOffloat[b]), paramArrayOfObject[b]));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final List dropLast(@NotNull Object[] paramArrayOfObject, int paramInt) {
    long l = d ^ 0x3179B547F3F7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return ArraysKt.take(paramArrayOfObject, RangesKt.coerceAtLeast(paramArrayOfObject.length - paramInt, 0));
  }
  
  public static final int reduce(@NotNull int[] paramArrayOfint, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x9855766C585L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfint.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfint))).iterator();
    while (intIterator.hasNext()) {
      int j = intIterator.nextInt();
      i = ((Number)paramFunction2.invoke(Integer.valueOf(i), Integer.valueOf(paramArrayOfint[j]))).intValue();
    } 
    return i;
  }
  
  public static final float reduceIndexed(@NotNull float[] paramArrayOffloat, @NotNull Function3 paramFunction3) {
    long l = d ^ 0x38248DECB1B9L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      f = ((Number)paramFunction3.invoke(Integer.valueOf(i), Float.valueOf(f), Float.valueOf(paramArrayOffloat[i]))).floatValue();
    } 
    return f;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Short minOrNull(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x7D3099B08B78L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = paramArrayOfshort[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOfshort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      short s1 = paramArrayOfshort[i];
      if (s > s1)
        s = s1; 
    } 
    return Short.valueOf(s);
  }
  
  @NotNull
  public static final List filter(@NotNull byte[] paramArrayOfbyte, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7A07989E8B61L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    ArrayList<Byte> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfByte.length;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      try {
        if (((Boolean)paramFunction1.invoke(Byte.valueOf(b1))).booleanValue())
          arrayList.add(Byte.valueOf(b1)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Set toMutableSet(@NotNull boolean[] paramArrayOfboolean) {
    long l = d ^ 0x4D5A719607A1L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return (Set)ArraysKt.toCollection(paramArrayOfboolean, new LinkedHashSet(MapsKt.mapCapacity(paramArrayOfboolean.length)));
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull int[] paramArrayOfint, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x658DE45FE354L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      Iterable iterable = (Iterable)paramFunction1.invoke(Integer.valueOf(j));
      CollectionsKt.addAll(paramCollection, iterable);
      b++;
    } 
    return paramCollection;
  }
  
  @Nullable
  public static final Long lastOrNull(@NotNull long[] paramArrayOflong) {
    long l = d ^ 0x2CBF0DC9D817L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOflong.length == 0)) ? null : Long.valueOf(paramArrayOflong[paramArrayOflong.length - 1]);
  }
  
  @NotNull
  public static final List toMutableList(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x460D8B0F1494L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return new ArrayList(CollectionsKt.asCollection(paramArrayOfObject));
  }
  
  @SinceKotlin(version = "1.3")
  public static final char random(@NotNull char[] paramArrayOfchar, @NotNull Random paramRandom) {
    long l = d ^ 0x264943808F43L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfchar[paramRandom.nextInt(paramArrayOfchar.length)];
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final List flatMapSequence(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x56CFFA4705D7L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Object[] arrayOfObject = paramArrayOfObject;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object = arrayOfObject[b];
      Sequence sequence = (Sequence)paramFunction1.invoke(object);
      CollectionsKt.addAll(arrayList, sequence);
      b++;
    } 
    return arrayList;
  }
  
  public static final boolean any(@NotNull Object[] paramArrayOfObject) {
    long l = d ^ 0x5175080FCDD9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramArrayOfObject.length == 0) ? 1 : 0);
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x4F440981AC7CL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return (HashSet)ArraysKt.toCollection(paramArrayOffloat, new HashSet(MapsKt.mapCapacity(paramArrayOffloat.length)));
  }
  
  @NotNull
  public static final Collection filterIndexedTo(@NotNull byte[] paramArrayOfbyte, @NotNull Collection<Byte> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 7958217730095
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
    //   38: iconst_0
    //   39: istore #9
    //   41: aload #6
    //   43: arraylength
    //   44: istore #10
    //   46: iload #9
    //   48: iload #10
    //   50: if_icmpge -> 126
    //   53: aload #6
    //   55: iload #9
    //   57: baload
    //   58: istore #11
    //   60: iload #8
    //   62: iinc #8, 1
    //   65: iload #11
    //   67: istore #12
    //   69: istore #13
    //   71: iconst_0
    //   72: istore #14
    //   74: aload_2
    //   75: iload #13
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: iload #12
    //   82: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: checkcast java/lang/Boolean
    //   93: invokevirtual booleanValue : ()Z
    //   96: ifeq -> 118
    //   99: aload_1
    //   100: iload #12
    //   102: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: nop
    //   119: nop
    //   120: iinc #9, 1
    //   123: goto -> 46
    //   126: nop
    //   127: aload_1
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   74	111	114	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List takeWhile(@NotNull boolean[] paramArrayOfboolean, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x43DB3E5CCC39L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Boolean> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfboolean.length;
    while (b < i) {
      boolean bool1 = paramArrayOfboolean[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Boolean.valueOf(bool1))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Boolean.valueOf(bool1));
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateBy(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x21B52CDB8492L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfdouble.length), 16);
    double[] arrayOfDouble = paramArrayOfdouble;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfDouble.length;
    while (b < j) {
      double d = arrayOfDouble[b];
      linkedHashMap.put(paramFunction1.invoke(Double.valueOf(d)), Double.valueOf(d));
      b++;
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.7")
  @NotNull
  public static final Comparable maxOrThrow(@NotNull Comparable[] paramArrayOfComparable) {
    long l = d ^ 0x4363A72CC47BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfComparable.length == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Comparable<Comparable> comparable = paramArrayOfComparable[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex((Object[])paramArrayOfComparable))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      Comparable<Comparable> comparable1 = paramArrayOfComparable[i];
      if (comparable.compareTo(comparable1) < 0)
        comparable = comparable1; 
    } 
    return comparable;
  }
  
  public static final char last(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x11BEB8D440F3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfchar.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfchar[ArraysKt.getLastIndex(paramArrayOfchar)];
  }
  
  @NotNull
  public static final List takeWhile(@NotNull int[] paramArrayOfint, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x3F9B306193ABL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    ArrayList<Integer> arrayList = new ArrayList();
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      int j = paramArrayOfint[b];
      try {
        if (!((Boolean)paramFunction1.invoke(Integer.valueOf(j))).booleanValue())
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      arrayList.add(Integer.valueOf(j));
      b++;
    } 
    return arrayList;
  }
  
  @Nullable
  public static final Character singleOrNull(@NotNull char[] paramArrayOfchar) {
    long l = d ^ 0x2C1B56CF2908L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramArrayOfchar.length == 1) ? Character.valueOf(paramArrayOfchar[0]) : null;
  }
  
  @NotNull
  public static final List filter(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x11C3F76212B4L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    float[] arrayOfFloat = paramArrayOffloat;
    ArrayList<Float> arrayList = new ArrayList();
    boolean bool2 = false;
    byte b = 0;
    int i = arrayOfFloat.length;
    while (b < i) {
      float f = arrayOfFloat[b];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          arrayList.add(Float.valueOf(f)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull byte[] paramArrayOfbyte, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = d ^ 0x43CB1B7E24C5L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfbyte.length;
    while (b < i) {
      byte b1 = paramArrayOfbyte[b];
      paramMap.put(paramFunction11.invoke(Byte.valueOf(b1)), paramFunction12.invoke(Byte.valueOf(b1)));
      b++;
    } 
    return paramMap;
  }
  
  public static final byte reduceRight(@NotNull byte[] paramArrayOfbyte, @NotNull Function2 paramFunction2) {
    long l = d ^ 0x316B627A20C7L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = ArraysKt.getLastIndex(paramArrayOfbyte);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty array can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b;
    for (b = paramArrayOfbyte[i--]; i >= 0; b = ((Number)paramFunction2.invoke(Byte.valueOf(paramArrayOfbyte[i--]), Byte.valueOf(b))).byteValue());
    return b;
  }
  
  public static final double first(@NotNull double[] paramArrayOfdouble, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x462C045F2094L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramArrayOfdouble.length;
    while (b < i) {
      double d = paramArrayOfdouble[b];
      try {
        if (((Boolean)paramFunction1.invoke(Double.valueOf(d))).booleanValue())
          return d; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @NotNull
  public static final String joinToString(@NotNull int[] paramArrayOfint, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    long l = d ^ 0x5F874A78A803L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    Intrinsics.checkNotNullExpressionValue(((StringBuilder)ArraysKt.joinTo(paramArrayOfint, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString(), "joinTo(StringBuilder(), …ed, transform).toString()");
    return ((StringBuilder)ArraysKt.joinTo(paramArrayOfint, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramFunction1)).toString();
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Float minOrNull(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x5CA0533F725CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOffloat.length == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    float f = paramArrayOffloat[0];
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(paramArrayOffloat))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      float f1 = paramArrayOffloat[i];
      f = Math.min(f, f1);
    } 
    return Float.valueOf(f);
  }
  
  @Nullable
  public static final Float firstOrNull(@NotNull float[] paramArrayOffloat) {
    long l = d ^ 0x441DDDD51B9DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramArrayOffloat.length == 0)) ? null : Float.valueOf(paramArrayOffloat[0]);
  }
  
  @NotNull
  public static final Set intersect(@NotNull char[] paramArrayOfchar, @NotNull Iterable paramIterable) {
    long l = d ^ 0x5FC95B89F55FL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    Set set = ArraysKt.toMutableSet(paramArrayOfchar);
    CollectionsKt.retainAll(set, paramIterable);
    return set;
  }
  
  public static final short first(@NotNull short[] paramArrayOfshort) {
    long l = d ^ 0x2FEAB1F421DFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramArrayOfshort.length == 0))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramArrayOfshort[0];
  }
  
  public static final Object last(@NotNull Object[] paramArrayOfObject, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x4FE9FCB1F2C5L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramArrayOfObject.length + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        Object object = paramArrayOfObject[j];
        if (((Boolean)paramFunction1.invoke(object)).booleanValue())
          return object; 
      } while (0 <= i); 
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  public static final void shuffle(@NotNull byte[] paramArrayOfbyte) {
    long l = d ^ 0x5F75BC52D134L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    ArraysKt.shuffle(paramArrayOfbyte, (Random)Random.Default);
  }
  
  @NotNull
  public static final Appendable joinTo(@NotNull long[] paramArrayOflong, @NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3, int paramInt, @NotNull CharSequence paramCharSequence4, @Nullable Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArraysKt___ArraysKt.d : J
    //   3: ldc2_w 72896006188726
    //   6: lxor
    //   7: lstore #8
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'buffer'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 'separator'
    //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload_3
    //   30: ldc_w 'prefix'
    //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   36: aload #4
    //   38: ldc_w 'postfix'
    //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   44: aload #6
    //   46: ldc_w 'truncated'
    //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_1
    //   53: aload_3
    //   54: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   59: pop
    //   60: iconst_0
    //   61: istore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: aload_0
    //   67: arraylength
    //   68: istore #12
    //   70: iload #11
    //   72: iload #12
    //   74: if_icmpge -> 194
    //   77: aload_0
    //   78: iload #11
    //   80: laload
    //   81: lstore #13
    //   83: iinc #10, 1
    //   86: iload #10
    //   88: iconst_1
    //   89: if_icmple -> 107
    //   92: aload_1
    //   93: aload_2
    //   94: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   99: pop
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   106: athrow
    //   107: iload #5
    //   109: iflt -> 126
    //   112: iload #10
    //   114: iload #5
    //   116: if_icmpgt -> 185
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   125: athrow
    //   126: aload #7
    //   128: ifnull -> 167
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   137: athrow
    //   138: aload_1
    //   139: aload #7
    //   141: lload #13
    //   143: invokestatic valueOf : (J)Ljava/lang/Long;
    //   146: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/CharSequence
    //   154: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   159: pop
    //   160: goto -> 188
    //   163: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   166: athrow
    //   167: aload_1
    //   168: lload #13
    //   170: invokestatic valueOf : (J)Ljava/lang/String;
    //   173: checkcast java/lang/CharSequence
    //   176: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   181: pop
    //   182: goto -> 188
    //   185: goto -> 194
    //   188: iinc #11, 1
    //   191: goto -> 70
    //   194: iload #5
    //   196: iflt -> 229
    //   199: iload #10
    //   201: iload #5
    //   203: if_icmple -> 229
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   212: athrow
    //   213: aload_1
    //   214: aload #6
    //   216: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   221: pop
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: aload_1
    //   230: aload #4
    //   232: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   237: pop
    //   238: aload_1
    //   239: areturn
    // Exception table:
    //   from	to	target	type
    //   83	100	103	java/util/NoSuchElementException
    //   107	119	122	java/util/NoSuchElementException
    //   112	131	134	java/util/NoSuchElementException
    //   126	163	163	java/util/NoSuchElementException
    //   194	206	209	java/util/NoSuchElementException
    //   199	222	225	java/util/NoSuchElementException
  }
  
  public static final int count(@NotNull float[] paramArrayOffloat, @NotNull Function1 paramFunction1) {
    long l = d ^ 0x7495D8B63272L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOffloat.length;
    while (b2 < i) {
      float f = paramArrayOffloat[b2];
      try {
        if (((Boolean)paramFunction1.invoke(Float.valueOf(f))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return b1;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */