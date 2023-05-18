package me.rerere.matrix.thirdparty.kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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
import me.rerere.matrix.thirdparty.kotlin.UByte;
import me.rerere.matrix.thirdparty.kotlin.UByteArray;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.UIntArray;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.ULongArray;
import me.rerere.matrix.thirdparty.kotlin.UShort;
import me.rerere.matrix.thirdparty.kotlin.UShortArray;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IndexingIterable;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.UArraySortingKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
  private static final long b = o3.a(803359953518153018L, 4112379955278847449L, null).a(135093206236324L);
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List dropLast-qFRl0hI(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = b ^ 0x629ABF837991L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$dropLast");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.take-qFRl0hI(paramArrayOfint, RangesKt.coerceAtLeast(UIntArray.getSize-impl(paramArrayOfint) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final int minOrThrow-U(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x6D6688FB55E4L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$min");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (UnsignedKt.uintCompare(i, j) > 0)
        i = j; 
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final byte maxOrThrow-U(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x4608461B812FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$max");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (Intrinsics.compare(b & 0xFF, b1 & 0xFF) < 0)
        b = b1; 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final int[] sliceArray-CFIt9YE(@NotNull int[] paramArrayOfint, @NotNull Collection paramCollection) {
    long l = b ^ 0x43ECD641FA92L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    return UIntArray.constructor-impl(ArraysKt.sliceArray(paramArrayOfint, paramCollection));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final int minWithOrThrow-U(@NotNull int[] paramArrayOfint, @NotNull Comparator<UInt> paramComparator) {
    long l = b ^ 0x286351D0DF7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$minWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (paramComparator.compare(UInt.box-impl(i), UInt.box-impl(j)) > 0)
        i = j; 
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] plus-xo_DsdI(@NotNull byte[] paramArrayOfbyte, @NotNull Collection paramCollection) {
    long l = b ^ 0x2570E784D9C1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$plus");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = UByteArray.getSize-impl(paramArrayOfbyte);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, UByteArray.getSize-impl(paramArrayOfbyte) + paramCollection.size()), "copyOf(this, newSize)");
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte, UByteArray.getSize-impl(paramArrayOfbyte) + paramCollection.size());
    Iterator<UByte> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      byte b = ((UByte)iterator.next()).unbox-impl();
      arrayOfByte[i++] = b;
    } 
    return UByteArray.constructor-impl(arrayOfByte);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final byte minOrThrow-U(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x45A46B4781F7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$min");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (Intrinsics.compare(b & 0xFF, b1 & 0xFF) > 0)
        b = b1; 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort lastOrNull-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x75830EA4A257L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$lastOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UShortArray.isEmpty-impl(paramArrayOfshort) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, UShortArray.getSize-impl(paramArrayOfshort) - 1));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final int[] sortedArray--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x69B680CC6A5CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sortedArray");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return paramArrayOfint; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = UIntArray.constructor-impl(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length));
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    UArraysKt.sort--ajY-9A(arrayOfInt2);
    return arrayOfInt1;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sortDescending-4UcCI2c(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = b ^ 0x3A7E356BA570L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sortDescending");
    UArraysKt.sort-4UcCI2c(paramArrayOfbyte, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-kdPth3s(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2) {
    long l = b ^ 0x38CCDE9DD65FL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "other");
    byte[] arrayOfByte = paramArrayOfbyte1;
    int i = Math.min(UByteArray.getSize-impl(arrayOfByte), UByteArray.getSize-impl(paramArrayOfbyte2));
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      byte b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte2, b);
      byte b2 = UByteArray.get-w2LRezQ(arrayOfByte, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(UByte.box-impl(b2), UByte.box-impl(b1)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final long[] sortedArrayDescending-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x6131A1FAA909L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sortedArrayDescending");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return paramArrayOflong; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = ULongArray.constructor-impl(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length));
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    UArraysKt.sortDescending-QwZRm1k(arrayOfLong2);
    return arrayOfLong1;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final long minOrThrow-U(@NotNull long[] paramArrayOflong) {
    long l1 = b ^ 0x3060D09C61E3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$min");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (UnsignedKt.ulongCompare(l2, l) > 0)
        l2 = l; 
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final int random-2D5oskM(@NotNull int[] paramArrayOfint, @NotNull Random paramRandom) {
    long l = b ^ 0x79E97AAADAD9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$random");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UIntArray.get-pVg5ArA(paramArrayOfint, paramRandom.nextInt(UIntArray.getSize-impl(paramArrayOfint)));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-C-E_24M(@NotNull int[] paramArrayOfint, @NotNull Object[] paramArrayOfObject) {
    long l = b ^ 0x228CCA7266EBL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    int[] arrayOfInt = paramArrayOfint;
    int i = Math.min(UIntArray.getSize-impl(arrayOfInt), paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      int j = UIntArray.get-pVg5ArA(arrayOfInt, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(UInt.box-impl(j), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List drop-qFRl0hI(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = b ^ 0x7BA1398B493FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$drop");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.takeLast-qFRl0hI(paramArrayOfint, RangesKt.coerceAtLeast(UIntArray.getSize-impl(paramArrayOfint) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sort--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x1501437B06BFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sort");
      if (UIntArray.getSize-impl(paramArrayOfint) > 1)
        UArraySortingKt.sortArray-oBK06Vg(paramArrayOfint, 0, UIntArray.getSize-impl(paramArrayOfint)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] toUByteArray(@NotNull UByte[] paramArrayOfUByte) {
    long l = b ^ 0x69E76D2DA54EL;
    Intrinsics.checkNotNullParameter(paramArrayOfUByte, "<this>");
    int i = paramArrayOfUByte.length;
    byte b = 0;
    byte[] arrayOfByte = new byte[i];
    while (b < i) {
      byte b1 = b;
      byte b2 = b1;
      byte b3 = b1;
      byte[] arrayOfByte1 = arrayOfByte;
      boolean bool = false;
      byte b4 = paramArrayOfUByte[b2].unbox-impl();
      arrayOfByte1[b3] = b4;
      b++;
    } 
    return UByteArray.constructor-impl(arrayOfByte);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final short minOrThrow-U(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x1618C0A0E30EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$min");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (Intrinsics.compare(s & 0xFFFF, s1 & 0xFFFF) > 0)
        s = s1; 
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-s5X_as8(@NotNull short[] paramArrayOfshort, @NotNull Random paramRandom) {
    long l = b ^ 0x7658F082E4B0L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$shuffle");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    short[] arrayOfShort = paramArrayOfshort;
    short s = 0;
    for (int i = ArraysKt.getLastIndex(arrayOfShort); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      s = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      UShortArray.set-01HTLdE(paramArrayOfshort, i, UShortArray.get-Mh2AYeg(paramArrayOfshort, j));
      UShortArray.set-01HTLdE(paramArrayOfshort, j, s);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sort-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x7DF95118DB7EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sort");
      if (ULongArray.getSize-impl(paramArrayOflong) > 1)
        UArraySortingKt.sortArray--nroSd4(paramArrayOflong, 0, ULongArray.getSize-impl(paramArrayOflong)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UInt[] toTypedArray--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x45CA523D15A1L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$toTypedArray");
    byte b = 0;
    int i = UIntArray.getSize-impl(paramArrayOfint);
    UInt[] arrayOfUInt = new UInt[i];
    while (b < i) {
      byte b1 = b;
      arrayOfUInt[b1] = UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, b1));
      b++;
    } 
    return arrayOfUInt;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-d-6D3K8(@Nullable short[] paramArrayOfshort) {
    try {
      if (paramArrayOfshort == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.hashCode((short[])null);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final long[] sliceArray-ZRhS8yI(@NotNull long[] paramArrayOflong, @NotNull IntRange paramIntRange) {
    long l = b ^ 0x4A5EE367B7CBL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramIntRange, "indices");
    return ULongArray.constructor-impl(ArraysKt.sliceArray(paramArrayOflong, paramIntRange));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong lastOrNull-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x6AE38F5A8916L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$lastOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ULongArray.isEmpty-impl(paramArrayOflong) ? null : ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, ULongArray.getSize-impl(paramArrayOflong) - 1));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final long maxWithOrThrow-U(@NotNull long[] paramArrayOflong, @NotNull Comparator<ULong> paramComparator) {
    long l1 = b ^ 0xAFFFA965682L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$maxWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (paramComparator.compare(ULong.box-impl(l2), ULong.box-impl(l)) < 0)
        l2 = l; 
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sortDescending--nroSd4(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = b ^ 0x3D68FC3570D6L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sortDescending");
    UArraysKt.sort--nroSd4(paramArrayOflong, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOflong, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-JQknh5Q(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = b ^ 0x5E7BFA090285L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$zip");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = UByteArray.getSize-impl(arrayOfByte);
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        byte b1 = UByteArray.get-w2LRezQ(arrayOfByte, b++);
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool = false;
        arrayList1.add(TuplesKt.to(UByte.box-impl(b1), object1));
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x4EABD1F15E5BL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$shuffle");
    UArraysKt.shuffle-JzugnMA(paramArrayOflong, (Random)Random.Default);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-kV0jMPg(@Nullable byte[] paramArrayOfbyte1, @Nullable byte[] paramArrayOfbyte2) {
    try {
      if (paramArrayOfbyte1 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte2 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.equals(paramArrayOfbyte2, (byte[])null);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0xF30ED173FBL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$shuffle");
    UArraysKt.shuffle-oSF2wD8(paramArrayOfbyte, (Random)Random.Default);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final Iterable withIndex-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x3B1A0FC36193L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$withIndex");
    return (Iterable)new IndexingIterable(new UArraysKt___UArraysKt$withIndex$2(paramArrayOflong));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final long[] plus-kzHmqpY(@NotNull long[] paramArrayOflong, @NotNull Collection paramCollection) {
    long l = b ^ 0x41BA3D091AACL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$plus");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = ULongArray.getSize-impl(paramArrayOflong);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, ULongArray.getSize-impl(paramArrayOflong) + paramCollection.size()), "copyOf(this, newSize)");
    long[] arrayOfLong = Arrays.copyOf(paramArrayOflong, ULongArray.getSize-impl(paramArrayOflong) + paramCollection.size());
    Iterator<ULong> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      long l1 = ((ULong)iterator.next()).unbox-impl();
      arrayOfLong[i++] = l1;
    } 
    return ULongArray.constructor-impl(arrayOfLong);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong maxWithOrNull-zrEWJaI(@NotNull long[] paramArrayOflong, @NotNull Comparator<ULong> paramComparator) {
    long l1 = b ^ 0x55C9311AE673L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (paramComparator.compare(ULong.box-impl(l2), ULong.box-impl(l)) < 0)
        l2 = l; 
    } 
    return ULong.box-impl(l2);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort maxWithOrNull-eOHTfZs(@NotNull short[] paramArrayOfshort, @NotNull Comparator<UShort> paramComparator) {
    long l = b ^ 0x113AA3B9494L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (paramComparator.compare(UShort.box-impl(s), UShort.box-impl(s1)) < 0)
        s = s1; 
    } 
    return UShort.box-impl(s);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final int[] sliceArray-tAntMlw(@NotNull int[] paramArrayOfint, @NotNull IntRange paramIntRange) {
    long l = b ^ 0x7636886F8D23L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramIntRange, "indices");
    return UIntArray.constructor-impl(ArraysKt.sliceArray(paramArrayOfint, paramIntRange));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final byte minWithOrThrow-U(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<UByte> paramComparator) {
    long l = b ^ 0x5F1D58080BDFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$minWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (paramComparator.compare(UByte.box-impl(b), UByte.box-impl(b1)) > 0)
        b = b1; 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sort-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x15F81DF8F59FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sort");
      if (UShortArray.getSize-impl(paramArrayOfshort) > 1)
        UArraySortingKt.sortArray-Aa5vz7o(paramArrayOfshort, 0, UShortArray.getSize-impl(paramArrayOfshort)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sort-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x54CE5D1313ABL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sort");
      if (UByteArray.getSize-impl(paramArrayOfbyte) > 1)
        UArraySortingKt.sortArray-4UcCI2c(paramArrayOfbyte, 0, UByteArray.getSize-impl(paramArrayOfbyte)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final short random-s5X_as8(@NotNull short[] paramArrayOfshort, @NotNull Random paramRandom) {
    long l = b ^ 0x2A5588731BD6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$random");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UShortArray.get-Mh2AYeg(paramArrayOfshort, paramRandom.nextInt(UShortArray.getSize-impl(paramArrayOfshort)));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sortDescending-Aa5vz7o(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = b ^ 0x1599196B5FCDL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sortDescending");
    UArraysKt.sort-Aa5vz7o(paramArrayOfshort, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfshort, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] sliceArray-c0bezYM(@NotNull byte[] paramArrayOfbyte, @NotNull IntRange paramIntRange) {
    long l = b ^ 0xE0387717FA6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramIntRange, "indices");
    return UByteArray.constructor-impl(ArraysKt.sliceArray(paramArrayOfbyte, paramIntRange));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-ctEhBpI(@NotNull int[] paramArrayOfint1, @NotNull int[] paramArrayOfint2) {
    long l = b ^ 0x2889651BCD94L;
    Intrinsics.checkNotNullParameter(paramArrayOfint1, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfint2, "other");
    int[] arrayOfInt = paramArrayOfint1;
    int i = Math.min(UIntArray.getSize-impl(arrayOfInt), UIntArray.getSize-impl(paramArrayOfint2));
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      int j = UIntArray.get-pVg5ArA(paramArrayOfint2, b);
      int k = UIntArray.get-pVg5ArA(arrayOfInt, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(UInt.box-impl(k), UInt.box-impl(j)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sortDescending-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x281A7F95542EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sortDescending");
      if (ULongArray.getSize-impl(paramArrayOflong) > 1) {
        UArraysKt.sort-QwZRm1k(paramArrayOflong);
        ArraysKt.reverse(paramArrayOflong);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UByte[] toTypedArray-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x173AD548FFF0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$toTypedArray");
    byte b = 0;
    int i = UByteArray.getSize-impl(paramArrayOfbyte);
    UByte[] arrayOfUByte = new UByte[i];
    while (b < i) {
      byte b1 = b;
      arrayOfUByte[b1] = UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, b1));
      b++;
    } 
    return arrayOfUByte;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte minOrNull-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x2E17CA96646L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$minOrNull");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (Intrinsics.compare(b & 0xFF, b1 & 0xFF) > 0)
        b = b1; 
    } 
    return UByte.box-impl(b);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final Iterable withIndex-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x63849D043E23L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$withIndex");
    return (Iterable)new IndexingIterable(new UArraysKt___UArraysKt$withIndex$3(paramArrayOfbyte));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final short[] sortedArray-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x2D88D1B099B6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sortedArray");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return paramArrayOfshort; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = UShortArray.constructor-impl(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length));
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    UArraysKt.sort-rL5Bavg(arrayOfShort2);
    return arrayOfShort1;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sorted--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x2EDC084B1816L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sorted");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = UIntArray.constructor-impl(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length));
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    UArraysKt.sort--ajY-9A(arrayOfInt2);
    return UArraysKt.asList--ajY-9A(arrayOfInt1);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-uLth9ew(@Nullable long[] paramArrayOflong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/unsigned/UArraysKt___UArraysKt.b : J
    //   3: ldc2_w 93694387429648
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: dup
    //   10: ifnull -> 54
    //   13: invokestatic box-impl : ([J)Lme/rerere/matrix/thirdparty/kotlin/ULongArray;
    //   16: ldc_w ', '
    //   19: checkcast java/lang/CharSequence
    //   22: ldc_w '['
    //   25: checkcast java/lang/CharSequence
    //   28: ldc_w ']'
    //   31: checkcast java/lang/CharSequence
    //   34: iconst_0
    //   35: aconst_null
    //   36: aconst_null
    //   37: bipush #56
    //   39: aconst_null
    //   40: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   43: dup
    //   44: ifnonnull -> 65
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   53: athrow
    //   54: pop
    //   55: ldc_w 'null'
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   64: athrow
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   8	47	50	java/util/NoSuchElementException
    //   13	58	61	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sortedDescending-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x3E536EDFE4C7L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sortedDescending");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = UShortArray.constructor-impl(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length));
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    UArraysKt.sort-rL5Bavg(arrayOfShort2);
    return UArraysKt.reversed-rL5Bavg(arrayOfShort1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-JGPC0-M(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = b ^ 0x10B3AD0A101EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$slice");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<UShort> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, j)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt firstOrNull--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x614714537C50L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$firstOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UIntArray.isEmpty-impl(paramArrayOfint) ? null : UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final int[] plus-CFIt9YE(@NotNull int[] paramArrayOfint, @NotNull Collection paramCollection) {
    long l = b ^ 0x71CD8B7115F1L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$plus");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = UIntArray.getSize-impl(paramArrayOfint);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, UIntArray.getSize-impl(paramArrayOfint) + paramCollection.size()), "copyOf(this, newSize)");
    int[] arrayOfInt = Arrays.copyOf(paramArrayOfint, UIntArray.getSize-impl(paramArrayOfint) + paramCollection.size());
    Iterator<UInt> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int j = ((UInt)iterator.next()).unbox-impl();
      arrayOfInt[i++] = j;
    } 
    return UIntArray.constructor-impl(arrayOfInt);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sortDescending-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x8AE98C20A7FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sortDescending");
      if (UShortArray.getSize-impl(paramArrayOfshort) > 1) {
        UArraysKt.sort-rL5Bavg(paramArrayOfshort);
        ArraysKt.reverse(paramArrayOfshort);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sortedDescending-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0xE5632AC5BC3L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sortedDescending");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = UByteArray.constructor-impl(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length));
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    UArraysKt.sort-GBYM_sE(arrayOfByte2);
    return UArraysKt.reversed-GBYM_sE(arrayOfByte1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-us8wMrg(@NotNull long[] paramArrayOflong1, @NotNull long[] paramArrayOflong2) {
    long l = b ^ 0x25CE15C49541L;
    Intrinsics.checkNotNullParameter(paramArrayOflong1, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOflong2, "other");
    long[] arrayOfLong = paramArrayOflong1;
    int i = Math.min(ULongArray.getSize-impl(arrayOfLong), ULongArray.getSize-impl(paramArrayOflong2));
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      long l1 = ULongArray.get-s-VKNKU(paramArrayOflong2, b);
      long l2 = ULongArray.get-s-VKNKU(arrayOfLong, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(ULong.box-impl(l2), ULong.box-impl(l1)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final short maxWithOrThrow-U(@NotNull short[] paramArrayOfshort, @NotNull Comparator<UShort> paramComparator) {
    long l = b ^ 0x486F4F63A423L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$maxWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (paramComparator.compare(UShort.box-impl(s), UShort.box-impl(s1)) < 0)
        s = s1; 
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x4CE0F42A6175L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$shuffle");
    UArraysKt.shuffle-2D5oskM(paramArrayOfint, (Random)Random.Default);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt getOrNull-qFRl0hI(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = b ^ 0x1A391D95E910L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$getOrNull");
    if (paramInt >= 0) {
      int[] arrayOfInt = paramArrayOfint;
      boolean bool = false;
      try {
        if (paramInt <= ArraysKt.getLastIndex(arrayOfInt));
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-uLth9ew(@Nullable long[] paramArrayOflong) {
    try {
      if (paramArrayOflong == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.hashCode((long[])null);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sorted-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x3ACD09C3AE4BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sorted");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = UShortArray.constructor-impl(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length));
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    UArraysKt.sort-rL5Bavg(arrayOfShort2);
    return UArraysKt.asList-rL5Bavg(arrayOfShort1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort singleOrNull-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0xF08F02F8953L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$singleOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (UShortArray.getSize-impl(paramArrayOfshort) == 1) ? UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, 0)) : null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-2csIQuQ(@Nullable byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.hashCode((byte[])null);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-mazbYpA(@NotNull short[] paramArrayOfshort1, @NotNull short[] paramArrayOfshort2) {
    long l = b ^ 0x2E2E5C1A0EB2L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort1, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfshort2, "other");
    short[] arrayOfShort = paramArrayOfshort1;
    int i = Math.min(UShortArray.getSize-impl(arrayOfShort), UShortArray.getSize-impl(paramArrayOfshort2));
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      short s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort2, b);
      short s2 = UShortArray.get-Mh2AYeg(arrayOfShort, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(UShort.box-impl(s2), UShort.box-impl(s1)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final short minWithOrThrow-U(@NotNull short[] paramArrayOfshort, @NotNull Comparator<UShort> paramComparator) {
    long l = b ^ 0x45CF0E22A372L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$minWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (paramComparator.compare(UShort.box-impl(s), UShort.box-impl(s1)) > 0)
        s = s1; 
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte maxOrNull-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x69F30F753BCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$maxOrNull");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (Intrinsics.compare(b & 0xFF, b1 & 0xFF) < 0)
        b = b1; 
    } 
    return UByte.box-impl(b);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-KJPZfPQ(@Nullable int[] paramArrayOfint1, @Nullable int[] paramArrayOfint2) {
    try {
      if (paramArrayOfint1 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfint2 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.equals(paramArrayOfint2, (int[])null);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final byte random-oSF2wD8(@NotNull byte[] paramArrayOfbyte, @NotNull Random paramRandom) {
    long l = b ^ 0x4277F2C8CB66L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$random");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UByteArray.get-w2LRezQ(paramArrayOfbyte, paramRandom.nextInt(UByteArray.getSize-impl(paramArrayOfbyte)));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sorted-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x66B43BDEF59AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sorted");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = UByteArray.constructor-impl(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length));
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    UArraysKt.sort-GBYM_sE(arrayOfByte2);
    return UArraysKt.asList-GBYM_sE(arrayOfByte1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List take-r7IrZao(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = b ^ 0x2DCCFC927CF9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$take");
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
      if (paramInt >= ULongArray.getSize-impl(paramArrayOflong))
        return CollectionsKt.toList((Iterable)ULongArray.box-impl(paramArrayOflong)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, 0))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<ULong> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = ULongArray.getSize-impl(paramArrayOflong);
    while (b2 < i) {
      long l1 = ULongArray.get-s-VKNKU(paramArrayOflong, b2);
      try {
        arrayList.add(ULong.box-impl(l1));
        if (++b1 == paramInt)
          break; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-HwE9HBo(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = b ^ 0x3819CE79ECB8L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$slice");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<UInt> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, j)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-tAntMlw(@NotNull int[] paramArrayOfint, @NotNull IntRange paramIntRange) {
    long l = b ^ 0x7D3F60743D59L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$slice");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int[] arrayOfInt = paramArrayOfint;
    return UArraysKt.asList--ajY-9A(UIntArray.constructor-impl(ArraysKt.copyOfRange(arrayOfInt, paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1)));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt maxWithOrNull-YmdZ_VM(@NotNull int[] paramArrayOfint, @NotNull Comparator<UInt> paramComparator) {
    long l = b ^ 0x211E6E8B66F4L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (paramComparator.compare(UInt.box-impl(i), UInt.box-impl(j)) < 0)
        i = j; 
    } 
    return UInt.box-impl(i);
  }
  
  @NotNull
  public static final IntRange getIndices-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x703ABC6BBA7BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$indices");
    boolean bool = false;
    return ArraysKt.getIndices(paramArrayOfbyte);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte singleOrNull-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0xD048301DDD2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$singleOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (UByteArray.getSize-impl(paramArrayOfbyte) == 1) ? UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, 0)) : null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-oSF2wD8(@NotNull byte[] paramArrayOfbyte, @NotNull Random paramRandom) {
    long l = b ^ 0x5A3AED0B39CCL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$shuffle");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b = 0;
    for (int i = ArraysKt.getLastIndex(arrayOfByte); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      b = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      UByteArray.set-VurrAj0(paramArrayOfbyte, i, UByteArray.get-w2LRezQ(paramArrayOfbyte, j));
      UByteArray.set-VurrAj0(paramArrayOfbyte, j, b);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List take-PpDY95g(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x1D4727873DD3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$take");
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
      if (paramInt >= UByteArray.getSize-impl(paramArrayOfbyte))
        return CollectionsKt.toList((Iterable)UByteArray.box-impl(paramArrayOfbyte)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, 0))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<UByte> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = UByteArray.getSize-impl(paramArrayOfbyte);
    while (b2 < i) {
      byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, b2);
      try {
        arrayList.add(UByte.box-impl(b));
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
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort minOrNull-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x1AFD1102016BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$minOrNull");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (Intrinsics.compare(s & 0xFFFF, s1 & 0xFFFF) > 0)
        s = s1; 
    } 
    return UShort.box-impl(s);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final long[] sliceArray-kzHmqpY(@NotNull long[] paramArrayOflong, @NotNull Collection paramCollection) {
    long l = b ^ 0x66A6349135CEL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    return ULongArray.constructor-impl(ArraysKt.sliceArray(paramArrayOflong, paramCollection));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List dropLast-nggk6HY(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = b ^ 0x45F13F48BCF9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$dropLast");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.take-nggk6HY(paramArrayOfshort, RangesKt.coerceAtLeast(UShortArray.getSize-impl(paramArrayOfshort) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sort--nroSd4(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = b ^ 0x5ADC65211877L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sort");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, ULongArray.getSize-impl(paramArrayOflong));
    UArraySortingKt.sortArray--nroSd4(paramArrayOflong, paramInt1, paramInt2);
  }
  
  public static final int getLastIndex--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x1D732027BD87L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$lastIndex");
    boolean bool = false;
    return ArraysKt.getLastIndex(paramArrayOfint);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort minWithOrNull-eOHTfZs(@NotNull short[] paramArrayOfshort, @NotNull Comparator<UShort> paramComparator) {
    long l = b ^ 0x2EBBCB7FC29FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (paramComparator.compare(UShort.box-impl(s), UShort.box-impl(s1)) > 0)
        s = s1; 
    } 
    return UShort.box-impl(s);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void fill-EtDCXyQ(@NotNull short[] paramArrayOfshort, short paramShort, int paramInt1, int paramInt2) {
    long l = b ^ 0x592DB1E8030AL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$fill");
    ArraysKt.fill(paramArrayOfshort, paramShort, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-f7H3mmw(@NotNull long[] paramArrayOflong, @NotNull Object[] paramArrayOfObject) {
    long l = b ^ 0x34145B93341CL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    long[] arrayOfLong = paramArrayOflong;
    int i = Math.min(ULongArray.getSize-impl(arrayOfLong), paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      long l1 = ULongArray.get-s-VKNKU(arrayOfLong, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(ULong.box-impl(l1), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte lastOrNull-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0xA7582BEACCEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$lastOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UByteArray.isEmpty-impl(paramArrayOfbyte) ? null : UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, UByteArray.getSize-impl(paramArrayOfbyte) - 1));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void fill-WpHrYlw(@NotNull byte[] paramArrayOfbyte, byte paramByte, int paramInt1, int paramInt2) {
    long l = b ^ 0x21E228BDD80L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$fill");
    ArraysKt.fill(paramArrayOfbyte, paramByte, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort maxOrNull-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x27611B925D6CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$maxOrNull");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (Intrinsics.compare(s & 0xFFFF, s1 & 0xFFFF) < 0)
        s = s1; 
    } 
    return UShort.box-impl(s);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-JGPC0-M(@NotNull short[] paramArrayOfshort, @NotNull Iterable paramIterable) {
    long l = b ^ 0x121E6C96ECBBL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$zip");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    short[] arrayOfShort = paramArrayOfshort;
    int i = UShortArray.getSize-impl(arrayOfShort);
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        short s = UShortArray.get-Mh2AYeg(arrayOfShort, b++);
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool = false;
        arrayList1.add(TuplesKt.to(UShort.box-impl(s), object1));
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UShort[] toTypedArray-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x5FB162F3449BL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$toTypedArray");
    byte b = 0;
    int i = UShortArray.getSize-impl(paramArrayOfshort);
    UShort[] arrayOfUShort = new UShort[i];
    while (b < i) {
      byte b1 = b;
      arrayOfUShort[b1] = UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, b1));
      b++;
    } 
    return arrayOfUShort;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sorted-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x38CEF61F47BCL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sorted");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = ULongArray.constructor-impl(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length));
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    UArraysKt.sort-QwZRm1k(arrayOfLong2);
    return UArraysKt.asList-QwZRm1k(arrayOfLong1);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte getOrNull-PpDY95g(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x6BACA6571355L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$getOrNull");
    if (paramInt >= 0) {
      byte[] arrayOfByte = paramArrayOfbyte;
      boolean bool = false;
      try {
        if (paramInt <= ArraysKt.getLastIndex(arrayOfByte));
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong minWithOrNull-zrEWJaI(@NotNull long[] paramArrayOflong, @NotNull Comparator<ULong> paramComparator) {
    long l1 = b ^ 0x6A3CE0A38D17L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (paramComparator.compare(ULong.box-impl(l2), ULong.box-impl(l)) > 0)
        l2 = l; 
    } 
    return ULong.box-impl(l2);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte maxWithOrNull-XMRcp5o(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<UByte> paramComparator) {
    long l = b ^ 0x3B0D077DF234L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (paramComparator.compare(UByte.box-impl(b), UByte.box-impl(b1)) < 0)
        b = b1; 
    } 
    return UByte.box-impl(b);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final long[] toULongArray(@NotNull ULong[] paramArrayOfULong) {
    long l = b ^ 0x5F316473E5FDL;
    Intrinsics.checkNotNullParameter(paramArrayOfULong, "<this>");
    int i = paramArrayOfULong.length;
    byte b = 0;
    long[] arrayOfLong = new long[i];
    while (b < i) {
      byte b1 = b;
      byte b2 = b1;
      byte b3 = b1;
      long[] arrayOfLong1 = arrayOfLong;
      boolean bool = false;
      long l1 = paramArrayOfULong[b2].unbox-impl();
      arrayOfLong1[b3] = l1;
      b++;
    } 
    return ULongArray.constructor-impl(arrayOfLong);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] sortedArray-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x4E83DF5FB7C0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sortedArray");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return paramArrayOfbyte; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = UByteArray.constructor-impl(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length));
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    UArraysKt.sort-GBYM_sE(arrayOfByte2);
    return arrayOfByte1;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List reversed--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x3F275BB49259L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$reversed");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = CollectionsKt.toMutableList((Collection)UIntArray.box-impl(paramArrayOfint));
    CollectionsKt.reverse(list);
    return list;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-F7u83W8(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = b ^ 0x1DC4114C6385L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$slice");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<ULong> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, j)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final short[] sliceArray-ojwP5H8(@NotNull short[] paramArrayOfshort, @NotNull Collection paramCollection) {
    long l = b ^ 0x113A1B5AE265L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    return UShortArray.constructor-impl(ArraysKt.sliceArray(paramArrayOfshort, paramCollection));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-JzugnMA(@NotNull long[] paramArrayOflong, @NotNull Random paramRandom) {
    long l = b ^ 0x7F4A61F75A06L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$shuffle");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    for (int i = ArraysKt.getLastIndex(arrayOfLong); 0 < i; i--) {
      int j = paramRandom.nextInt(i + 1);
      long l1 = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      ULongArray.set-k8EXiF4(paramArrayOflong, i, ULongArray.get-s-VKNKU(paramArrayOflong, j));
      ULongArray.set-k8EXiF4(paramArrayOflong, j, l1);
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-XUkPCBk(@Nullable int[] paramArrayOfint) {
    try {
      if (paramArrayOfint == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.hashCode((int[])null);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final int maxOrThrow-U(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x144A11EF2FB8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$max");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (UnsignedKt.uintCompare(i, j) < 0)
        i = j; 
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte minWithOrNull-XMRcp5o(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<UByte> paramComparator) {
    long l = b ^ 0xFB7112B3B18L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (paramComparator.compare(UByte.box-impl(b), UByte.box-impl(b1)) > 0)
        b = b1; 
    } 
    return UByte.box-impl(b);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final short[] sortedArrayDescending-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x198129269E81L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sortedArrayDescending");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return paramArrayOfshort; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length), "copyOf(this, size)");
    short[] arrayOfShort1 = UShortArray.constructor-impl(Arrays.copyOf(paramArrayOfshort, paramArrayOfshort.length));
    short[] arrayOfShort2 = arrayOfShort1;
    boolean bool = false;
    UArraysKt.sortDescending-rL5Bavg(arrayOfShort2);
    return arrayOfShort1;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-HwE9HBo(@NotNull int[] paramArrayOfint, @NotNull Iterable paramIterable) {
    long l = b ^ 0x6FAE6A0D9788L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$zip");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    int[] arrayOfInt = paramArrayOfint;
    int i = UIntArray.getSize-impl(arrayOfInt);
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        int j = UIntArray.get-pVg5ArA(arrayOfInt, b++);
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool = false;
        arrayList1.add(TuplesKt.to(UInt.box-impl(j), object1));
      } 
    } 
    return arrayList;
  }
  
  public static final int getLastIndex-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x40288F52A136L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$lastIndex");
    boolean bool = false;
    return ArraysKt.getLastIndex(paramArrayOfbyte);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void fill-2fe2U9s(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    long l = b ^ 0x76946E09B2D7L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$fill");
    ArraysKt.fill(paramArrayOfint, paramInt1, paramInt2, paramInt3);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final short maxOrThrow-U(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x431C7F75A72BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$max");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, 0);
    short[] arrayOfShort = paramArrayOfshort;
    short s1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfShort))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      s1 = UShortArray.get-Mh2AYeg(paramArrayOfshort, i);
      if (Intrinsics.compare(s & 0xFFFF, s1 & 0xFFFF) < 0)
        s = s1; 
    } 
    return s;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List takeLast-nggk6HY(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = b ^ 0x1DF9E072DA7CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$takeLast");
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
    i = UShortArray.getSize-impl(paramArrayOfshort);
    try {
      if (paramInt >= i)
        return CollectionsKt.toList((Iterable)UShortArray.box-impl(paramArrayOfshort)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, i - 1))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<UShort> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, j)));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sortDescending-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x5119549D988CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sortDescending");
      if (UByteArray.getSize-impl(paramArrayOfbyte) > 1) {
        UArraysKt.sort-GBYM_sE(paramArrayOfbyte);
        ArraysKt.reverse(paramArrayOfbyte);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List take-qFRl0hI(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = b ^ 0x6626B0F5B63L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$take");
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
      if (paramInt >= UIntArray.getSize-impl(paramArrayOfint))
        return CollectionsKt.toList((Iterable)UIntArray.box-impl(paramArrayOfint)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, 0))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<UInt> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = UIntArray.getSize-impl(paramArrayOfint);
    while (b2 < i) {
      int j = UIntArray.get-pVg5ArA(paramArrayOfint, b2);
      try {
        arrayList.add(UInt.box-impl(j));
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
  @ExperimentalUnsignedTypes
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final UInt randomOrNull-2D5oskM(@NotNull int[] paramArrayOfint, @NotNull Random paramRandom) {
    long l = b ^ 0xE992373030L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, paramRandom.nextInt(UIntArray.getSize-impl(paramArrayOfint))));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] sliceArray-xo_DsdI(@NotNull byte[] paramArrayOfbyte, @NotNull Collection paramCollection) {
    long l = b ^ 0x4C1ECA73284L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramCollection, "indices");
    return UByteArray.constructor-impl(ArraysKt.sliceArray(paramArrayOfbyte, paramCollection));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-d-6D3K8(@Nullable short[] paramArrayOfshort) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/unsigned/UArraysKt___UArraysKt.b : J
    //   3: ldc2_w 71010936696416
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: dup
    //   10: ifnull -> 54
    //   13: invokestatic box-impl : ([S)Lme/rerere/matrix/thirdparty/kotlin/UShortArray;
    //   16: ldc_w ', '
    //   19: checkcast java/lang/CharSequence
    //   22: ldc_w '['
    //   25: checkcast java/lang/CharSequence
    //   28: ldc_w ']'
    //   31: checkcast java/lang/CharSequence
    //   34: iconst_0
    //   35: aconst_null
    //   36: aconst_null
    //   37: bipush #56
    //   39: aconst_null
    //   40: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   43: dup
    //   44: ifnonnull -> 65
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   53: athrow
    //   54: pop
    //   55: ldc_w 'null'
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   64: athrow
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   8	47	50	java/util/NoSuchElementException
    //   13	58	61	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-2D5oskM(@NotNull int[] paramArrayOfint, @NotNull Random paramRandom) {
    long l = b ^ 0x5358299D7776L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$shuffle");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    for (int i = ArraysKt.getLastIndex(arrayOfInt); 0 < i; i--) {
      int k = paramRandom.nextInt(i + 1);
      j = UIntArray.get-pVg5ArA(paramArrayOfint, i);
      UIntArray.set-VXSXFK8(paramArrayOfint, i, UIntArray.get-pVg5ArA(paramArrayOfint, k));
      UIntArray.set-VXSXFK8(paramArrayOfint, k, j);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final long random-JzugnMA(@NotNull long[] paramArrayOflong, @NotNull Random paramRandom) {
    long l = b ^ 0x7A8EBA5AC4E5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$random");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        throw new NoSuchElementException("Array is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ULongArray.get-s-VKNKU(paramArrayOflong, paramRandom.nextInt(ULongArray.getSize-impl(paramArrayOflong)));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong minOrNull-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l1 = b ^ 0x451EFB405756L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$minOrNull");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (UnsignedKt.ulongCompare(l2, l) > 0)
        l2 = l; 
    } 
    return ULong.box-impl(l2);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-XUkPCBk(@Nullable int[] paramArrayOfint) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/unsigned/UArraysKt___UArraysKt.b : J
    //   3: ldc2_w 38057225143727
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: dup
    //   10: ifnull -> 54
    //   13: invokestatic box-impl : ([I)Lme/rerere/matrix/thirdparty/kotlin/UIntArray;
    //   16: ldc_w ', '
    //   19: checkcast java/lang/CharSequence
    //   22: ldc_w '['
    //   25: checkcast java/lang/CharSequence
    //   28: ldc_w ']'
    //   31: checkcast java/lang/CharSequence
    //   34: iconst_0
    //   35: aconst_null
    //   36: aconst_null
    //   37: bipush #56
    //   39: aconst_null
    //   40: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   43: dup
    //   44: ifnonnull -> 65
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   53: athrow
    //   54: pop
    //   55: ldc_w 'null'
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   64: athrow
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   8	47	50	java/util/NoSuchElementException
    //   13	58	61	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final long maxOrThrow-U(@NotNull long[] paramArrayOflong) {
    long l1 = b ^ 0x7B4EDBDF3787L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$max");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (UnsignedKt.ulongCompare(l2, l) < 0)
        l2 = l; 
    } 
    return l2;
  }
  
  @NotNull
  public static final IntRange getIndices-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x44A0826FF0E7L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$indices");
    boolean bool = false;
    return ArraysKt.getIndices(paramArrayOfshort);
  }
  
  @NotNull
  public static final IntRange getIndices-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x76815322C699L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$indices");
    boolean bool = false;
    return ArraysKt.getIndices(paramArrayOflong);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-nl983wc(@NotNull byte[] paramArrayOfbyte, @NotNull Object[] paramArrayOfObject) {
    long l = b ^ 0x71F78DC768A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = Math.min(UByteArray.getSize-impl(arrayOfByte), paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      byte b1 = UByteArray.get-w2LRezQ(arrayOfByte, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(UByte.box-impl(b1), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List reversed-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x138080F75207L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$reversed");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = CollectionsKt.toMutableList((Collection)ULongArray.box-impl(paramArrayOflong));
    CollectionsKt.reverse(list);
    return list;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort getOrNull-nggk6HY(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = b ^ 0x1A21C6052705L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$getOrNull");
    if (paramInt >= 0) {
      short[] arrayOfShort = paramArrayOfshort;
      boolean bool = false;
      try {
        if (paramInt <= ArraysKt.getLastIndex(arrayOfShort));
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sort-Aa5vz7o(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = b ^ 0x340A973925DAL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sort");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, UShortArray.getSize-impl(paramArrayOfshort));
    UArraySortingKt.sortArray-Aa5vz7o(paramArrayOfshort, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt lastOrNull--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x51639BE39C3FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$lastOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UIntArray.isEmpty-impl(paramArrayOfint) ? null : UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, UIntArray.getSize-impl(paramArrayOfint) - 1));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UByte firstOrNull-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x62D38724920BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$firstOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UByteArray.isEmpty-impl(paramArrayOfbyte) ? null : UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, 0));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final byte maxWithOrThrow-U(@NotNull byte[] paramArrayOfbyte, @NotNull Comparator<UByte> paramComparator) {
    long l = b ^ 0x37E0F59D10C5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$maxWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = UByteArray.get-w2LRezQ(paramArrayOfbyte, 0);
    byte[] arrayOfByte = paramArrayOfbyte;
    byte b1 = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfByte))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      b1 = UByteArray.get-w2LRezQ(paramArrayOfbyte, i);
      if (paramComparator.compare(UByte.box-impl(b), UByte.box-impl(b1)) < 0)
        b = b1; 
    } 
    return b;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List drop-PpDY95g(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x2223A6AF9F26L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$drop");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.takeLast-PpDY95g(paramArrayOfbyte, RangesKt.coerceAtLeast(UByteArray.getSize-impl(paramArrayOfbyte) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void sortDescending--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x669823C4BE0L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sortDescending");
      if (UIntArray.getSize-impl(paramArrayOfint) > 1) {
        UArraysKt.sort--ajY-9A(paramArrayOfint);
        ArraysKt.reverse(paramArrayOfint);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final int[] toUIntArray(@NotNull UInt[] paramArrayOfUInt) {
    long l = b ^ 0x1F9BE5545CEBL;
    Intrinsics.checkNotNullParameter(paramArrayOfUInt, "<this>");
    int i = paramArrayOfUInt.length;
    byte b = 0;
    int[] arrayOfInt = new int[i];
    while (b < i) {
      byte b1 = b;
      byte b2 = b1;
      byte b3 = b1;
      int[] arrayOfInt1 = arrayOfInt;
      boolean bool = false;
      int j = paramArrayOfUInt[b2].unbox-impl();
      arrayOfInt1[b3] = j;
      b++;
    } 
    return UIntArray.constructor-impl(arrayOfInt);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final short[] toUShortArray(@NotNull UShort[] paramArrayOfUShort) {
    long l = b ^ 0x742CB4EF8871L;
    Intrinsics.checkNotNullParameter(paramArrayOfUShort, "<this>");
    int i = paramArrayOfUShort.length;
    byte b = 0;
    short[] arrayOfShort = new short[i];
    while (b < i) {
      byte b1 = b;
      byte b2 = b1;
      byte b3 = b1;
      short[] arrayOfShort1 = arrayOfShort;
      boolean bool = false;
      short s = paramArrayOfUShort[b2].unbox-impl();
      arrayOfShort1[b3] = s;
      b++;
    } 
    return UShortArray.constructor-impl(arrayOfShort);
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
  public static final int sumOfUByte(@NotNull UByte[] paramArrayOfUByte) {
    long l = b ^ 0x6FE89EDF48C2L;
    Intrinsics.checkNotNullParameter(paramArrayOfUByte, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfUByte.length;
    while (b < j) {
      byte b1 = paramArrayOfUByte[b].unbox-impl();
      i = UInt.constructor-impl(i + UInt.constructor-impl(b1 & 0xFF));
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
  public static final int sumOfUShort(@NotNull UShort[] paramArrayOfUShort) {
    long l = b ^ 0x66B66378F7C4L;
    Intrinsics.checkNotNullParameter(paramArrayOfUShort, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfUShort.length;
    while (b < j) {
      short s = paramArrayOfUShort[b].unbox-impl();
      i = UInt.constructor-impl(i + UInt.constructor-impl(s & 0xFFFF));
      b++;
    } 
    return i;
  }
  
  public static final int getLastIndex-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x598107DC581DL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$lastIndex");
    boolean bool = false;
    return ArraysKt.getLastIndex(paramArrayOflong);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt minOrNull--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x2D900D022EAFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$minOrNull");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (UnsignedKt.uintCompare(i, j) > 0)
        i = j; 
    } 
    return UInt.box-impl(i);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-c0bezYM(@NotNull byte[] paramArrayOfbyte, @NotNull IntRange paramIntRange) {
    long l = b ^ 0x1900C5D016B7L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$slice");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramArrayOfbyte;
    return UArraysKt.asList-GBYM_sE(UByteArray.constructor-impl(ArraysKt.copyOfRange(arrayOfByte, paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1)));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List takeLast-PpDY95g(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x6243D7D62732L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$takeLast");
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
    i = UByteArray.getSize-impl(paramArrayOfbyte);
    try {
      if (paramInt >= i)
        return CollectionsKt.toList((Iterable)UByteArray.box-impl(paramArrayOfbyte)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, i - 1))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<UByte> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, j)));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final Iterable withIndex-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x5F0F20483150L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$withIndex");
    return (Iterable)new IndexingIterable(new UArraysKt___UArraysKt$withIndex$4(paramArrayOfshort));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List dropLast-r7IrZao(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = b ^ 0x503B109A469DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$dropLast");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.take-r7IrZao(paramArrayOflong, RangesKt.coerceAtLeast(ULongArray.getSize-impl(paramArrayOflong) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  public static final void fill-K6DWlUc(@NotNull long[] paramArrayOflong, long paramLong, int paramInt1, int paramInt2) {
    long l = b ^ 0x38A43975B65EL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$fill");
    ArraysKt.fill(paramArrayOflong, paramLong, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt maxOrNull--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x594FDC7588AAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$maxOrNull");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (UnsignedKt.uintCompare(i, j) < 0)
        i = j; 
    } 
    return UInt.box-impl(i);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-2csIQuQ(@Nullable byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/unsigned/UArraysKt___UArraysKt.b : J
    //   3: ldc2_w 10064088162540
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: dup
    //   10: ifnull -> 54
    //   13: invokestatic box-impl : ([B)Lme/rerere/matrix/thirdparty/kotlin/UByteArray;
    //   16: ldc_w ', '
    //   19: checkcast java/lang/CharSequence
    //   22: ldc_w '['
    //   25: checkcast java/lang/CharSequence
    //   28: ldc_w ']'
    //   31: checkcast java/lang/CharSequence
    //   34: iconst_0
    //   35: aconst_null
    //   36: aconst_null
    //   37: bipush #56
    //   39: aconst_null
    //   40: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   43: dup
    //   44: ifnonnull -> 65
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   53: athrow
    //   54: pop
    //   55: ldc_w 'null'
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   64: athrow
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   8	47	50	java/util/NoSuchElementException
    //   13	58	61	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-JQknh5Q(@NotNull byte[] paramArrayOfbyte, @NotNull Iterable paramIterable) {
    long l = b ^ 0x4B2540658D11L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$slice");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<UByte> arrayList = new ArrayList(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayList.add(UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, j)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final int maxWithOrThrow-U(@NotNull int[] paramArrayOfint, @NotNull Comparator<UInt> paramComparator) {
    long l = b ^ 0x4496797C8CC2L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$maxWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (paramComparator.compare(UInt.box-impl(i), UInt.box-impl(j)) < 0)
        i = j; 
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-Q6IL4kU(@NotNull short[] paramArrayOfshort, @NotNull IntRange paramIntRange) {
    long l = b ^ 0xCCF8710AE68L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$slice");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    short[] arrayOfShort = paramArrayOfshort;
    return UArraysKt.asList-rL5Bavg(UShortArray.constructor-impl(ArraysKt.copyOfRange(arrayOfShort, paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1)));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List dropLast-PpDY95g(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x3AA42F71C68CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$dropLast");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.take-PpDY95g(paramArrayOfbyte, RangesKt.coerceAtLeast(UByteArray.getSize-impl(paramArrayOfbyte) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-uaTIQ5s(@NotNull short[] paramArrayOfshort, @NotNull Object[] paramArrayOfObject) {
    long l = b ^ 0x54692A4ED05EL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$zip");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "other");
    short[] arrayOfShort = paramArrayOfshort;
    int i = Math.min(UShortArray.getSize-impl(arrayOfShort), paramArrayOfObject.length);
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = paramArrayOfObject[b];
      short s = UShortArray.get-Mh2AYeg(arrayOfShort, b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(UShort.box-impl(s), object));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final short[] plus-ojwP5H8(@NotNull short[] paramArrayOfshort, @NotNull Collection paramCollection) {
    long l = b ^ 0x3540CE4BE0A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$plus");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = UShortArray.getSize-impl(paramArrayOfshort);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfshort, UShortArray.getSize-impl(paramArrayOfshort) + paramCollection.size()), "copyOf(this, newSize)");
    short[] arrayOfShort = Arrays.copyOf(paramArrayOfshort, UShortArray.getSize-impl(paramArrayOfshort) + paramCollection.size());
    Iterator<UShort> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      short s = ((UShort)iterator.next()).unbox-impl();
      arrayOfShort[i++] = s;
    } 
    return UShortArray.constructor-impl(arrayOfShort);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sort-oBK06Vg(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = b ^ 0x7D5B9C9C92F5L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sort");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, UIntArray.getSize-impl(paramArrayOfint));
    UArraySortingKt.sortArray-oBK06Vg(paramArrayOfint, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final UShort randomOrNull-s5X_as8(@NotNull short[] paramArrayOfshort, @NotNull Random paramRandom) {
    long l = b ^ 0x33D16F476297L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, paramRandom.nextInt(UShortArray.getSize-impl(paramArrayOfshort))));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final UByte randomOrNull-oSF2wD8(@NotNull byte[] paramArrayOfbyte, @NotNull Random paramRandom) {
    long l = b ^ 0x4D88B1CD1E7FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UByte.box-impl(UByteArray.get-w2LRezQ(paramArrayOfbyte, paramRandom.nextInt(UByteArray.getSize-impl(paramArrayOfbyte))));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final short[] sliceArray-Q6IL4kU(@NotNull short[] paramArrayOfshort, @NotNull IntRange paramIntRange) {
    long l = b ^ 0x5F677D1451D9L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$sliceArray");
    Intrinsics.checkNotNullParameter(paramIntRange, "indices");
    return UShortArray.constructor-impl(ArraysKt.sliceArray(paramArrayOfshort, paramIntRange));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void shuffle-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x504A07583BD6L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$shuffle");
    UArraysKt.shuffle-s5X_as8(paramArrayOfshort, (Random)Random.Default);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt minWithOrNull-YmdZ_VM(@NotNull int[] paramArrayOfint, @NotNull Comparator<UInt> paramComparator) {
    long l = b ^ 0x353CAD762DAEL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = UIntArray.get-pVg5ArA(paramArrayOfint, 0);
    int[] arrayOfInt = paramArrayOfint;
    int j = 0;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt))).iterator();
    while (intIterator.hasNext()) {
      int k = intIterator.nextInt();
      j = UIntArray.get-pVg5ArA(paramArrayOfint, k);
      if (paramComparator.compare(UInt.box-impl(i), UInt.box-impl(j)) > 0)
        i = j; 
    } 
    return UInt.box-impl(i);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List takeLast-qFRl0hI(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = b ^ 0x3E3E28920348L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$takeLast");
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
    i = UIntArray.getSize-impl(paramArrayOfint);
    try {
      if (paramInt >= i)
        return CollectionsKt.toList((Iterable)UIntArray.box-impl(paramArrayOfint)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, i - 1))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<UInt> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, j)));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalUnsignedTypes
  public static final long minWithOrThrow-U(@NotNull long[] paramArrayOflong, @NotNull Comparator<ULong> paramComparator) {
    long l1 = b ^ 0x698927E35C27L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$minWith");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (paramComparator.compare(ULong.box-impl(l2), ULong.box-impl(l)) > 0)
        l2 = l; 
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UInt singleOrNull--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x593C0BEFD1F9L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$singleOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (UIntArray.getSize-impl(paramArrayOfint) == 1) ? UInt.box-impl(UIntArray.get-pVg5ArA(paramArrayOfint, 0)) : null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sortDescending-oBK06Vg(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = b ^ 0x60A706E39D84L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sortDescending");
    UArraysKt.sort-oBK06Vg(paramArrayOfint, paramInt1, paramInt2);
    ArraysKt.reverse(paramArrayOfint, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final Iterable withIndex--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x7EA5B4CCCD0DL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$withIndex");
    return (Iterable)new IndexingIterable(new UArraysKt___UArraysKt$withIndex$1(paramArrayOfint));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List takeLast-r7IrZao(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = b ^ 0x4E4CD351672L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$takeLast");
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
    i = ULongArray.getSize-impl(paramArrayOflong);
    try {
      if (paramInt >= i)
        return CollectionsKt.toList((Iterable)ULongArray.box-impl(paramArrayOflong)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, i - 1))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<ULong> arrayList = new ArrayList(paramInt);
    int j = i - paramInt;
    try {
      while (j < i) {
        arrayList.add(ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, j)));
        j++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List reversed-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x35F1AEC54F1FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$reversed");
      if (UShortArray.isEmpty-impl(paramArrayOfshort))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = CollectionsKt.toMutableList((Collection)UShortArray.box-impl(paramArrayOfshort));
    CollectionsKt.reverse(list);
    return list;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong getOrNull-r7IrZao(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = b ^ 0x73ABE8E43255L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$getOrNull");
    if (paramInt >= 0) {
      long[] arrayOfLong = paramArrayOflong;
      boolean bool = false;
      try {
        if (paramInt <= ArraysKt.getLastIndex(arrayOfLong));
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final ULong randomOrNull-JzugnMA(@NotNull long[] paramArrayOflong, @NotNull Random paramRandom) {
    long l = b ^ 0x33ABEC468EF5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, paramRandom.nextInt(ULongArray.getSize-impl(paramArrayOflong))));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final UShort firstOrNull-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x6A3480D9B811L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$firstOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return UShortArray.isEmpty-impl(paramArrayOfshort) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List zip-F7u83W8(@NotNull long[] paramArrayOflong, @NotNull Iterable paramIterable) {
    long l = b ^ 0x5C8B9C97C61FL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$zip");
    Intrinsics.checkNotNullParameter(paramIterable, "other");
    long[] arrayOfLong = paramArrayOflong;
    int i = ULongArray.getSize-impl(arrayOfLong);
    ArrayList<Pair> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(paramIterable, 10), i));
    byte b = 0;
    for (Object object : paramIterable) {
      if (b < i) {
        Object object1 = object;
        long l1 = ULongArray.get-s-VKNKU(arrayOfLong, b++);
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool = false;
        arrayList1.add(TuplesKt.to(ULong.box-impl(l1), object1));
      } 
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final ULong[] toTypedArray-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x27B642C237E2L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$toTypedArray");
    byte b = 0;
    int i = ULongArray.getSize-impl(paramArrayOflong);
    ULong[] arrayOfULong = new ULong[i];
    while (b < i) {
      byte b1 = b;
      arrayOfULong[b1] = ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, b1));
      b++;
    } 
    return arrayOfULong;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong singleOrNull-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x1107AE02B900L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$singleOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ULongArray.getSize-impl(paramArrayOflong) == 1) ? ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, 0)) : null;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List drop-r7IrZao(@NotNull long[] paramArrayOflong, int paramInt) {
    long l = b ^ 0x2631A01AE239L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$drop");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.takeLast-r7IrZao(paramArrayOflong, RangesKt.coerceAtLeast(ULongArray.getSize-impl(paramArrayOflong) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final int[] sortedArrayDescending--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x3CCAE7056DC3L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sortedArrayDescending");
      if (UIntArray.isEmpty-impl(paramArrayOfint))
        return paramArrayOfint; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = UIntArray.constructor-impl(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length));
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    UArraysKt.sortDescending--ajY-9A(arrayOfInt2);
    return arrayOfInt1;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sortedDescending-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x712CBCEB94A3L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sortedDescending");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = ULongArray.constructor-impl(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length));
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    UArraysKt.sort-QwZRm1k(arrayOfLong2);
    return UArraysKt.reversed-QwZRm1k(arrayOfLong1);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final void sort-4UcCI2c(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = b ^ 0x24042584BBCEL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sort");
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, UByteArray.getSize-impl(paramArrayOfbyte));
    UArraySortingKt.sortArray-4UcCI2c(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List slice-ZRhS8yI(@NotNull long[] paramArrayOflong, @NotNull IntRange paramIntRange) {
    long l = b ^ 0x2B2B9762D233L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$slice");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long[] arrayOfLong = paramArrayOflong;
    return UArraysKt.asList-QwZRm1k(ULongArray.constructor-impl(ArraysKt.copyOfRange(arrayOfLong, paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1)));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List drop-nggk6HY(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = b ^ 0x76F0EB405CFFL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$drop");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested element count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return UArraysKt.takeLast-nggk6HY(paramArrayOfshort, RangesKt.coerceAtLeast(UShortArray.getSize-impl(paramArrayOfshort) - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-FGO6Aew(@Nullable short[] paramArrayOfshort1, @Nullable short[] paramArrayOfshort2) {
    try {
      if (paramArrayOfshort1 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfshort2 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.equals(paramArrayOfshort2, (short[])null);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-lec5QzE(@Nullable long[] paramArrayOflong1, @Nullable long[] paramArrayOflong2) {
    try {
      if (paramArrayOflong1 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramArrayOflong2 == null);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Arrays.equals(paramArrayOflong2, (long[])null);
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
  public static final long sumOfULong(@NotNull ULong[] paramArrayOfULong) {
    long l1 = b ^ 0x73B6A8BC05D3L;
    Intrinsics.checkNotNullParameter(paramArrayOfULong, "<this>");
    long l2 = 0L;
    byte b = 0;
    int i = paramArrayOfULong.length;
    while (b < i) {
      long l = paramArrayOfULong[b].unbox-impl();
      l2 = ULong.constructor-impl(l2 + l);
      b++;
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List take-nggk6HY(@NotNull short[] paramArrayOfshort, int paramInt) {
    long l = b ^ 0x6A3736027651L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$take");
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
      if (paramInt >= UShortArray.getSize-impl(paramArrayOfshort))
        return CollectionsKt.toList((Iterable)UShortArray.box-impl(paramArrayOfshort)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt == 1)
        return CollectionsKt.listOf(UShort.box-impl(UShortArray.get-Mh2AYeg(paramArrayOfshort, 0))); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    b1 = 0;
    ArrayList<UShort> arrayList = new ArrayList(paramInt);
    byte b2 = 0;
    int i = UShortArray.getSize-impl(paramArrayOfshort);
    while (b2 < i) {
      short s = UShortArray.get-Mh2AYeg(paramArrayOfshort, b2);
      try {
        arrayList.add(UShort.box-impl(s));
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
  public static final IntRange getIndices--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x3B019E47B4ECL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$indices");
    boolean bool = false;
    return ArraysKt.getIndices(paramArrayOfint);
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] sortedArrayDescending-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x206D46C8D148L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$sortedArrayDescending");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return paramArrayOfbyte; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length), "copyOf(this, size)");
    byte[] arrayOfByte1 = UByteArray.constructor-impl(Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length));
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    UArraysKt.sortDescending-GBYM_sE(arrayOfByte2);
    return arrayOfByte1;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List reversed-GBYM_sE(@NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x40C39F6E8050L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "$this$reversed");
      if (UByteArray.isEmpty-impl(paramArrayOfbyte))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    List list = CollectionsKt.toMutableList((Collection)UByteArray.box-impl(paramArrayOfbyte));
    CollectionsKt.reverse(list);
    return list;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final List sortedDescending--ajY-9A(@NotNull int[] paramArrayOfint) {
    long l = b ^ 0x4FC41DF5C0FEL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "$this$sortedDescending");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length), "copyOf(this, size)");
    int[] arrayOfInt1 = UIntArray.constructor-impl(Arrays.copyOf(paramArrayOfint, paramArrayOfint.length));
    int[] arrayOfInt2 = arrayOfInt1;
    boolean bool = false;
    UArraysKt.sort--ajY-9A(arrayOfInt2);
    return UArraysKt.reversed--ajY-9A(arrayOfInt1);
  }
  
  @SinceKotlin(version = "1.4")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong maxOrNull-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l1 = b ^ 0x4C52C274617DL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$maxOrNull");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    long l2 = ULongArray.get-s-VKNKU(paramArrayOflong, 0);
    long[] arrayOfLong = paramArrayOflong;
    boolean bool = false;
    IntIterator intIterator = (new IntRange(1, ArraysKt.getLastIndex(arrayOfLong))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      long l = ULongArray.get-s-VKNKU(paramArrayOflong, i);
      if (UnsignedKt.ulongCompare(l2, l) < 0)
        l2 = l; 
    } 
    return ULong.box-impl(l2);
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
  public static final int sumOfUInt(@NotNull UInt[] paramArrayOfUInt) {
    long l = b ^ 0x1604B3129B5DL;
    Intrinsics.checkNotNullParameter(paramArrayOfUInt, "<this>");
    int i = 0;
    byte b = 0;
    int j = paramArrayOfUInt.length;
    while (b < j) {
      int k = paramArrayOfUInt[b].unbox-impl();
      i = UInt.constructor-impl(i + k);
      b++;
    } 
    return i;
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @Nullable
  public static final ULong firstOrNull-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x44CC4F218990L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$firstOrNull");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ULongArray.isEmpty-impl(paramArrayOflong) ? null : ULong.box-impl(ULongArray.get-s-VKNKU(paramArrayOflong, 0));
  }
  
  @SinceKotlin(version = "1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final long[] sortedArray-QwZRm1k(@NotNull long[] paramArrayOflong) {
    long l = b ^ 0x576C7119A8BCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "$this$sortedArray");
      if (ULongArray.isEmpty-impl(paramArrayOflong))
        return paramArrayOflong; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length), "copyOf(this, size)");
    long[] arrayOfLong1 = ULongArray.constructor-impl(Arrays.copyOf(paramArrayOflong, paramArrayOflong.length));
    long[] arrayOfLong2 = arrayOfLong1;
    boolean bool = false;
    UArraysKt.sort-QwZRm1k(arrayOfLong2);
    return arrayOfLong1;
  }
  
  public static final int getLastIndex-rL5Bavg(@NotNull short[] paramArrayOfshort) {
    long l = b ^ 0x334221A7DDDAL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "$this$lastIndex");
    boolean bool = false;
    return ArraysKt.getLastIndex(paramArrayOfshort);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collection\\unsigned\UArraysKt___UArraysKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */