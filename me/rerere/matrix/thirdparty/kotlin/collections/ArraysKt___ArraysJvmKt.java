package me.rerere.matrix.thirdparty.kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.LowPriorityInOverloadResolution;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
  private static final long c = o3.a(-422841781789611068L, -8710445766095476819L, null).a(246250289491467L);
  
  public static final void sortWith(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<? super Object> paramComparator, int paramInt1, int paramInt2) {
    long l = c ^ 0x15B0C9633D0L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Arrays.sort(paramArrayOfObject, paramInt1, paramInt2, paramComparator);
  }
  
  public static final void fill(@NotNull char[] paramArrayOfchar, char paramChar, int paramInt1, int paramInt2) {
    long l = c ^ 0x65E6C21AD320L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Arrays.fill(paramArrayOfchar, paramInt1, paramInt2, paramChar);
  }
  
  public static final void fill(@NotNull short[] paramArrayOfshort, short paramShort, int paramInt1, int paramInt2) {
    long l = c ^ 0x63C7E8051760L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Arrays.fill(paramArrayOfshort, paramInt1, paramInt2, paramShort);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final long[] copyInto(@NotNull long[] paramArrayOflong1, @NotNull long[] paramArrayOflong2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x361D49F29DD1L;
    Intrinsics.checkNotNullParameter(paramArrayOflong1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOflong2, "destination");
    System.arraycopy(paramArrayOflong1, paramInt2, paramArrayOflong2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOflong2;
  }
  
  @NotNull
  public static final Character[] toTypedArray(@NotNull char[] paramArrayOfchar) {
    long l = c ^ 0x41FCFD14E437L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Character[] arrayOfCharacter = new Character[paramArrayOfchar.length];
    byte b = 0;
    int i = paramArrayOfchar.length;
    try {
      while (b < i) {
        arrayOfCharacter[b] = Character.valueOf(paramArrayOfchar[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfCharacter;
  }
  
  @SinceKotlin(version = "1.4")
  public static final void sort(@NotNull Comparable[] paramArrayOfComparable, int paramInt1, int paramInt2) {
    long l = c ^ 0x133E2610870DL;
    Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    Arrays.sort((Object[])paramArrayOfComparable, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull long[] paramArrayOflong) {
    long l = c ^ 0x4F427581F47DL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOflong, new TreeSet());
  }
  
  @NotNull
  public static final Object[] plus(@NotNull Object[] paramArrayOfObject, Object paramObject) {
    long l = c ^ 0xC435BE5C691L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    int i = paramArrayOfObject.length;
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject, i + 1);
    arrayOfObject[i] = paramObject;
    Intrinsics.checkNotNullExpressionValue(arrayOfObject, "result");
    return arrayOfObject;
  }
  
  @NotNull
  public static final Byte[] toTypedArray(@NotNull byte[] paramArrayOfbyte) {
    long l = c ^ 0x43472E8AF594L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Byte[] arrayOfByte = new Byte[paramArrayOfbyte.length];
    byte b = 0;
    int i = paramArrayOfbyte.length;
    try {
      while (b < i) {
        arrayOfByte[b] = Byte.valueOf(paramArrayOfbyte[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfByte;
  }
  
  @NotNull
  public static final Object[] plus(@NotNull Object[] paramArrayOfObject1, @NotNull Object[] paramArrayOfObject2) {
    long l = c ^ 0x7911501F1584L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject2, "elements");
    int i = paramArrayOfObject1.length;
    int j = paramArrayOfObject2.length;
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject1, i + j);
    System.arraycopy(paramArrayOfObject2, 0, arrayOfObject, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfObject, "result");
    return arrayOfObject;
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull byte[] paramArrayOfbyte) {
    long l = c ^ 0xE6F71C6C14BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfbyte, new TreeSet());
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Object[] copyInto(@NotNull Object[] paramArrayOfObject1, @NotNull Object[] paramArrayOfObject2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x96E2689F556L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject2, "destination");
    System.arraycopy(paramArrayOfObject1, paramInt2, paramArrayOfObject2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfObject2;
  }
  
  public static final void fill(@NotNull Object[] paramArrayOfObject, Object paramObject, int paramInt1, int paramInt2) {
    long l = c ^ 0x1BCBB2F65944L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Arrays.fill(paramArrayOfObject, paramInt1, paramInt2, paramObject);
  }
  
  public static final void sort(@NotNull char[] paramArrayOfchar) {
    long l = c ^ 0x21BFA12B3B8EL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
      if (paramArrayOfchar.length > 1)
        Arrays.sort(paramArrayOfchar); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  @NotNull
  public static final long[] plus(@NotNull long[] paramArrayOflong, @NotNull Collection paramCollection) {
    long l = c ^ 0x395B60EC1A4EL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOflong.length;
    long[] arrayOfLong = Arrays.copyOf(paramArrayOflong, i + paramCollection.size());
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      long l1 = ((Number)iterator.next()).longValue();
      arrayOfLong[i++] = l1;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfLong, "result");
    return arrayOfLong;
  }
  
  @NotNull
  public static final Integer[] toTypedArray(@NotNull int[] paramArrayOfint) {
    long l = c ^ 0x2C33704BD58EL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Integer[] arrayOfInteger = new Integer[paramArrayOfint.length];
    byte b = 0;
    int i = paramArrayOfint.length;
    try {
      while (b < i) {
        arrayOfInteger[b] = Integer.valueOf(paramArrayOfint[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfInteger;
  }
  
  @NotNull
  public static final float[] plus(@NotNull float[] paramArrayOffloat, @NotNull Collection paramCollection) {
    long l = c ^ 0x5FA0780A532FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOffloat.length;
    float[] arrayOfFloat = Arrays.copyOf(paramArrayOffloat, i + paramCollection.size());
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      float f = ((Number)iterator.next()).floatValue();
      arrayOfFloat[i++] = f;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfFloat, "result");
    return arrayOfFloat;
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull double[] paramArrayOfdouble) {
    long l = c ^ 0x19E714FE7C03L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfdouble, new TreeSet());
  }
  
  @NotNull
  public static final List asList(@NotNull long[] paramArrayOflong) {
    long l = c ^ 0x3DF98FA71E24L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$4(paramArrayOflong);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final float[] copyInto(@NotNull float[] paramArrayOffloat1, @NotNull float[] paramArrayOffloat2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x225A6C4D0D6AL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOffloat2, "destination");
    System.arraycopy(paramArrayOffloat1, paramInt2, paramArrayOffloat2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOffloat2;
  }
  
  public static final void sort(@NotNull short[] paramArrayOfshort) {
    long l = c ^ 0x1467EB589D8CL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
      if (paramArrayOfshort.length > 1)
        Arrays.sort(paramArrayOfshort); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  @NotNull
  public static final Object[] plus(@NotNull Object[] paramArrayOfObject, @NotNull Collection paramCollection) {
    long l = c ^ 0x637F82AA1DF2L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfObject.length;
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject, i + paramCollection.size());
    for (Object object : paramCollection)
      arrayOfObject[i++] = object; 
    Intrinsics.checkNotNullExpressionValue(arrayOfObject, "result");
    return arrayOfObject;
  }
  
  @NotNull
  public static final List asList(@NotNull float[] paramArrayOffloat) {
    long l = c ^ 0x605246541D0EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$5(paramArrayOffloat);
  }
  
  public static final int binarySearch(@NotNull long[] paramArrayOflong, long paramLong, int paramInt1, int paramInt2) {
    long l = c ^ 0x4433638D9FF5L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    return Arrays.binarySearch(paramArrayOflong, paramInt1, paramInt2, paramLong);
  }
  
  public static final void fill(@NotNull long[] paramArrayOflong, long paramLong, int paramInt1, int paramInt2) {
    long l = c ^ 0x7F3B6DBC5A51L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Arrays.fill(paramArrayOflong, paramInt1, paramInt2, paramLong);
  }
  
  @NotNull
  public static final List asList(@NotNull short[] paramArrayOfshort) {
    long l = c ^ 0x7B422BDA2806L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$2(paramArrayOfshort);
  }
  
  @NotNull
  public static final boolean[] plus(@NotNull boolean[] paramArrayOfboolean, @NotNull Collection paramCollection) {
    long l = c ^ 0x3B8A31D56F6CL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfboolean.length;
    boolean[] arrayOfBoolean = Arrays.copyOf(paramArrayOfboolean, i + paramCollection.size());
    Iterator<Boolean> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      boolean bool = ((Boolean)iterator.next()).booleanValue();
      arrayOfBoolean[i++] = bool;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfBoolean, "result");
    return arrayOfBoolean;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final short[] copyInto(@NotNull short[] paramArrayOfshort1, @NotNull short[] paramArrayOfshort2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x279600B03B36L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfshort2, "destination");
    System.arraycopy(paramArrayOfshort1, paramInt2, paramArrayOfshort2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfshort2;
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<?> paramComparator) {
    long l = c ^ 0x54A13E03B276L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfObject, new TreeSet(paramComparator));
  }
  
  public static final int binarySearch(@NotNull char[] paramArrayOfchar, char paramChar, int paramInt1, int paramInt2) {
    long l = c ^ 0x545A852927FFL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return Arrays.binarySearch(paramArrayOfchar, paramInt1, paramInt2, paramChar);
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull boolean[] paramArrayOfboolean) {
    long l = c ^ 0x63B3BF337F5DL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfboolean, new TreeSet());
  }
  
  public static final void sort(@NotNull double[] paramArrayOfdouble) {
    long l = c ^ 0x7283ACB9826BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
      if (paramArrayOfdouble.length > 1)
        Arrays.sort(paramArrayOfdouble); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  public static final int binarySearch(@NotNull float[] paramArrayOffloat, float paramFloat, int paramInt1, int paramInt2) {
    long l = c ^ 0x192522AB1013L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return Arrays.binarySearch(paramArrayOffloat, paramInt1, paramInt2, paramFloat);
  }
  
  @NotNull
  public static final Float[] toTypedArray(@NotNull float[] paramArrayOffloat) {
    long l = c ^ 0x7B610ADB585FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Float[] arrayOfFloat = new Float[paramArrayOffloat.length];
    byte b = 0;
    int i = paramArrayOffloat.length;
    try {
      while (b < i) {
        arrayOfFloat[b] = Float.valueOf(paramArrayOffloat[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfFloat;
  }
  
  @NotNull
  public static final Boolean[] toTypedArray(@NotNull boolean[] paramArrayOfboolean) {
    long l = c ^ 0x6F2751F64B79L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Boolean[] arrayOfBoolean = new Boolean[paramArrayOfboolean.length];
    byte b = 0;
    int i = paramArrayOfboolean.length;
    try {
      while (b < i) {
        arrayOfBoolean[b] = Boolean.valueOf(paramArrayOfboolean[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfBoolean;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final boolean[] copyInto(@NotNull boolean[] paramArrayOfboolean1, @NotNull boolean[] paramArrayOfboolean2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x39F75B69E8C9L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfboolean2, "destination");
    System.arraycopy(paramArrayOfboolean1, paramInt2, paramArrayOfboolean2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfboolean2;
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final int[] copyOfRange(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = c ^ 0x243AE70FF63AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfint.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfint, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfint, paramInt1, paramInt2);
  }
  
  public static final void sort(@NotNull int[] paramArrayOfint) {
    long l = c ^ 0x630266D6A513L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
      if (paramArrayOfint.length > 1)
        Arrays.sort(paramArrayOfint); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  @NotNull
  public static final byte[] plus(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2) {
    long l = c ^ 0x64175C6EB9B0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "elements");
    int i = paramArrayOfbyte1.length;
    int j = paramArrayOfbyte2.length;
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte1, i + j);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "result");
    return arrayOfByte;
  }
  
  @NotNull
  public static final short[] plus(@NotNull short[] paramArrayOfshort, @NotNull Collection paramCollection) {
    long l = c ^ 0x6AF2675D360L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfshort.length;
    short[] arrayOfShort = Arrays.copyOf(paramArrayOfshort, i + paramCollection.size());
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      short s = ((Number)iterator.next()).shortValue();
      arrayOfShort[i++] = s;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfShort, "result");
    return arrayOfShort;
  }
  
  @NotNull
  public static final long[] plus(@NotNull long[] paramArrayOflong1, @NotNull long[] paramArrayOflong2) {
    long l = c ^ 0x66277403164AL;
    Intrinsics.checkNotNullParameter(paramArrayOflong1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOflong2, "elements");
    int i = paramArrayOflong1.length;
    int j = paramArrayOflong2.length;
    long[] arrayOfLong = Arrays.copyOf(paramArrayOflong1, i + j);
    System.arraycopy(paramArrayOflong2, 0, arrayOfLong, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfLong, "result");
    return arrayOfLong;
  }
  
  @NotNull
  public static final Double[] toTypedArray(@NotNull double[] paramArrayOfdouble) {
    long l = c ^ 0x5F99A1D98CD1L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Double[] arrayOfDouble = new Double[paramArrayOfdouble.length];
    byte b = 0;
    int i = paramArrayOfdouble.length;
    try {
      while (b < i) {
        arrayOfDouble[b] = Double.valueOf(paramArrayOfdouble[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfDouble;
  }
  
  @NotNull
  public static final boolean[] plus(@NotNull boolean[] paramArrayOfboolean, boolean paramBoolean) {
    long l = c ^ 0x56D78BF66429L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    int i = paramArrayOfboolean.length;
    boolean[] arrayOfBoolean = Arrays.copyOf(paramArrayOfboolean, i + 1);
    arrayOfBoolean[i] = paramBoolean;
    Intrinsics.checkNotNullExpressionValue(arrayOfBoolean, "result");
    return arrayOfBoolean;
  }
  
  public static final int binarySearch(@NotNull Object[] paramArrayOfObject, Object paramObject, @NotNull Comparator<? super Object> paramComparator, int paramInt1, int paramInt2) {
    long l = c ^ 0x513665DDB12DL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return Arrays.binarySearch(paramArrayOfObject, paramInt1, paramInt2, paramObject, paramComparator);
  }
  
  public static final void fill(@NotNull float[] paramArrayOffloat, float paramFloat, int paramInt1, int paramInt2) {
    long l = c ^ 0x452C05849CF7L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Arrays.fill(paramArrayOffloat, paramInt1, paramInt2, paramFloat);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final double[] copyInto(@NotNull double[] paramArrayOfdouble1, @NotNull double[] paramArrayOfdouble2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x5D88188425ACL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfdouble2, "destination");
    System.arraycopy(paramArrayOfdouble1, paramInt2, paramArrayOfdouble2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfdouble2;
  }
  
  public static final void sort(@NotNull Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    long l = c ^ 0x3F512E0D0C10L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Arrays.sort(paramArrayOfObject, paramInt1, paramInt2);
  }
  
  public static final void sort(@NotNull long[] paramArrayOflong) {
    long l = c ^ 0x7A8823E4A450L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
      if (paramArrayOflong.length > 1)
        Arrays.sort(paramArrayOflong); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  public static final void fill(@NotNull boolean[] paramArrayOfboolean, boolean paramBoolean, int paramInt1, int paramInt2) {
    long l = c ^ 0x2F09897DA816L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    Arrays.fill(paramArrayOfboolean, paramInt1, paramInt2, paramBoolean);
  }
  
  @NotNull
  public static final List asList(@NotNull double[] paramArrayOfdouble) {
    long l = c ^ 0x5C8103DAF4CL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$6(paramArrayOfdouble);
  }
  
  @NotNull
  public static final byte[] plus(@NotNull byte[] paramArrayOfbyte, @NotNull Collection paramCollection) {
    long l = c ^ 0x34A313D94A43L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfbyte.length;
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte, i + paramCollection.size());
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      byte b = ((Number)iterator.next()).byteValue();
      arrayOfByte[i++] = b;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "result");
    return arrayOfByte;
  }
  
  @NotNull
  public static final byte[] plus(@NotNull byte[] paramArrayOfbyte, byte paramByte) {
    long l = c ^ 0xF760ADB2967L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    int i = paramArrayOfbyte.length;
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte, i + 1);
    arrayOfByte[i] = paramByte;
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "result");
    return arrayOfByte;
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull float[] paramArrayOffloat) {
    long l = c ^ 0x1EAE6EC3732EL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOffloat, new TreeSet());
  }
  
  @NotNull
  public static final int[] plus(@NotNull int[] paramArrayOfint1, @NotNull int[] paramArrayOfint2) {
    long l = c ^ 0x1B5A6160C86CL;
    Intrinsics.checkNotNullParameter(paramArrayOfint1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfint2, "elements");
    int i = paramArrayOfint1.length;
    int j = paramArrayOfint2.length;
    int[] arrayOfInt = Arrays.copyOf(paramArrayOfint1, i + j);
    System.arraycopy(paramArrayOfint2, 0, arrayOfInt, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfInt, "result");
    return arrayOfInt;
  }
  
  public static final int binarySearch(@NotNull Object[] paramArrayOfObject, Object paramObject, int paramInt1, int paramInt2) {
    long l = c ^ 0x51DF085C972CL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return Arrays.binarySearch(paramArrayOfObject, paramInt1, paramInt2, paramObject);
  }
  
  @NotNull
  public static final List asList(@NotNull byte[] paramArrayOfbyte) {
    long l = c ^ 0x65E1CE667B47L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$1(paramArrayOfbyte);
  }
  
  @NotNull
  public static final double[] plus(@NotNull double[] paramArrayOfdouble, double paramDouble) {
    long l = c ^ 0x163C8FA80DBL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    int i = paramArrayOfdouble.length;
    double[] arrayOfDouble = Arrays.copyOf(paramArrayOfdouble, i + 1);
    arrayOfDouble[i] = paramDouble;
    Intrinsics.checkNotNullExpressionValue(arrayOfDouble, "result");
    return arrayOfDouble;
  }
  
  @NotNull
  public static final char[] plus(@NotNull char[] paramArrayOfchar, @NotNull Collection paramCollection) {
    long l = c ^ 0xDD3F22E4647L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfchar.length;
    char[] arrayOfChar = Arrays.copyOf(paramArrayOfchar, i + paramCollection.size());
    Iterator<Character> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      char c = ((Character)iterator.next()).charValue();
      arrayOfChar[i++] = c;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfChar, "result");
    return arrayOfChar;
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final double[] copyOfRange(@NotNull double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
    long l = c ^ 0x5FDA5562D5F4L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfdouble.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfdouble, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfdouble, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final List asList(@NotNull Object[] paramArrayOfObject) {
    long l = c ^ 0x4BD79004B7F9L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullExpressionValue(ArraysUtilJVM.asList(paramArrayOfObject), "asList(this)");
    return ArraysUtilJVM.asList(paramArrayOfObject);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final float[] copyOfRange(@NotNull float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    long l = c ^ 0x29523007AF4FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOffloat.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOffloat, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOffloat, paramInt1, paramInt2);
  }
  
  public static final void sort(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = c ^ 0x213F548FC2C9L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Arrays.sort(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public static final void sort(@NotNull float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    long l = c ^ 0x6A1DA5023910L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    Arrays.sort(paramArrayOffloat, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final double[] plus(@NotNull double[] paramArrayOfdouble1, @NotNull double[] paramArrayOfdouble2) {
    long l = c ^ 0x4A267F215451L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfdouble2, "elements");
    int i = paramArrayOfdouble1.length;
    int j = paramArrayOfdouble2.length;
    double[] arrayOfDouble = Arrays.copyOf(paramArrayOfdouble1, i + j);
    System.arraycopy(paramArrayOfdouble2, 0, arrayOfDouble, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfDouble, "result");
    return arrayOfDouble;
  }
  
  public static final void fill(@NotNull byte[] paramArrayOfbyte, byte paramByte, int paramInt1, int paramInt2) {
    long l = c ^ 0x696A80974F88L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Arrays.fill(paramArrayOfbyte, paramInt1, paramInt2, paramByte);
  }
  
  @NotNull
  public static final short[] plus(@NotNull short[] paramArrayOfshort, short paramShort) {
    long l = c ^ 0x7316939C0C20L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    int i = paramArrayOfshort.length;
    short[] arrayOfShort = Arrays.copyOf(paramArrayOfshort, i + 1);
    arrayOfShort[i] = paramShort;
    Intrinsics.checkNotNullExpressionValue(arrayOfShort, "result");
    return arrayOfShort;
  }
  
  @NotNull
  public static final List asList(@NotNull boolean[] paramArrayOfboolean) {
    long l = c ^ 0x3F9B9E35E439L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$7(paramArrayOfboolean);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final int[] copyInto(@NotNull int[] paramArrayOfint1, @NotNull int[] paramArrayOfint2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x1FEDB787E6B0L;
    Intrinsics.checkNotNullParameter(paramArrayOfint1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfint2, "destination");
    System.arraycopy(paramArrayOfint1, paramInt2, paramArrayOfint2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfint2;
  }
  
  @NotNull
  public static final Collection filterIsInstanceTo(@NotNull Object[] paramArrayOfObject, @NotNull Collection<Object> paramCollection, @NotNull Class paramClass) {
    long l = c ^ 0x435D99DE6CA8L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramClass, "klass");
    byte b = 0;
    int i = paramArrayOfObject.length;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      try {
        if (paramClass.isInstance(object))
          paramCollection.add(object); 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw b(null);
      } 
      b++;
    } 
    return paramCollection;
  }
  
  public static final void sort(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2) {
    long l = c ^ 0x125119FF020AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Arrays.sort(paramArrayOfint, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final short[] plus(@NotNull short[] paramArrayOfshort1, @NotNull short[] paramArrayOfshort2) {
    long l = c ^ 0x5B82685CBB70L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfshort2, "elements");
    int i = paramArrayOfshort1.length;
    int j = paramArrayOfshort2.length;
    short[] arrayOfShort = Arrays.copyOf(paramArrayOfshort1, i + j);
    System.arraycopy(paramArrayOfshort2, 0, arrayOfShort, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfShort, "result");
    return arrayOfShort;
  }
  
  public static final void sort(@NotNull double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
    long l = c ^ 0x597EF0D2D226L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Arrays.sort(paramArrayOfdouble, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final int[] plus(@NotNull int[] paramArrayOfint, int paramInt) {
    long l = c ^ 0x1033CFECD7D2L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    int i = paramArrayOfint.length;
    int[] arrayOfInt = Arrays.copyOf(paramArrayOfint, i + 1);
    arrayOfInt[i] = paramInt;
    Intrinsics.checkNotNullExpressionValue(arrayOfInt, "result");
    return arrayOfInt;
  }
  
  public static final void sort(@NotNull Object[] paramArrayOfObject) {
    long l = c ^ 0x5419DB743E1BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      if (paramArrayOfObject.length > 1)
        Arrays.sort(paramArrayOfObject); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  public static final int binarySearch(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x68EF6A3E765BL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return Arrays.binarySearch(paramArrayOfint, paramInt2, paramInt3, paramInt1);
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull char[] paramArrayOfchar) {
    long l = c ^ 0x54611DE44799L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfchar, new TreeSet());
  }
  
  public static final int binarySearch(@NotNull byte[] paramArrayOfbyte, byte paramByte, int paramInt1, int paramInt2) {
    long l = c ^ 0x3F60815932C1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return Arrays.binarySearch(paramArrayOfbyte, paramInt1, paramInt2, paramByte);
  }
  
  @NotNull
  public static final int[] plus(@NotNull int[] paramArrayOfint, @NotNull Collection paramCollection) {
    long l = c ^ 0x3D9A5869E81EL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfint.length;
    int[] arrayOfInt = Arrays.copyOf(paramArrayOfint, i + paramCollection.size());
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      arrayOfInt[i++] = j;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfInt, "result");
    return arrayOfInt;
  }
  
  public static final int binarySearch(@NotNull short[] paramArrayOfshort, short paramShort, int paramInt1, int paramInt2) {
    long l = c ^ 0x5A358663B728L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return Arrays.binarySearch(paramArrayOfshort, paramInt1, paramInt2, paramShort);
  }
  
  @NotNull
  public static final float[] plus(@NotNull float[] paramArrayOffloat1, @NotNull float[] paramArrayOffloat2) {
    long l = c ^ 0x2B385CAFE07FL;
    Intrinsics.checkNotNullParameter(paramArrayOffloat1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOffloat2, "elements");
    int i = paramArrayOffloat1.length;
    int j = paramArrayOffloat2.length;
    float[] arrayOfFloat = Arrays.copyOf(paramArrayOffloat1, i + j);
    System.arraycopy(paramArrayOffloat2, 0, arrayOfFloat, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfFloat, "result");
    return arrayOfFloat;
  }
  
  public static final void fill(@NotNull double[] paramArrayOfdouble, double paramDouble, int paramInt1, int paramInt2) {
    long l = c ^ 0x622480A9F066L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Arrays.fill(paramArrayOfdouble, paramInt1, paramInt2, paramDouble);
  }
  
  @NotNull
  public static final char[] plus(@NotNull char[] paramArrayOfchar1, @NotNull char[] paramArrayOfchar2) {
    long l = c ^ 0x38E56A6C94FCL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfchar2, "elements");
    int i = paramArrayOfchar1.length;
    int j = paramArrayOfchar2.length;
    char[] arrayOfChar = Arrays.copyOf(paramArrayOfchar1, i + j);
    System.arraycopy(paramArrayOfchar2, 0, arrayOfChar, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfChar, "result");
    return arrayOfChar;
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final long[] copyOfRange(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = c ^ 0x13C5575DF1E5L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOflong.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOflong, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOflong, paramInt1, paramInt2);
  }
  
  public static final void sort(@NotNull char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    long l = c ^ 0x404DF8358A2L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    Arrays.sort(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull short[] paramArrayOfshort) {
    long l = c ^ 0x6223ABF4E8F6L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfshort, new TreeSet());
  }
  
  @NotNull
  public static final char[] plus(@NotNull char[] paramArrayOfchar, char paramChar) {
    long l = c ^ 0x3ED0AD80EF9L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    int i = paramArrayOfchar.length;
    char[] arrayOfChar = Arrays.copyOf(paramArrayOfchar, i + 1);
    arrayOfChar[i] = paramChar;
    Intrinsics.checkNotNullExpressionValue(arrayOfChar, "result");
    return arrayOfChar;
  }
  
  public static final void sort(@NotNull long[] paramArrayOflong, int paramInt1, int paramInt2) {
    long l = c ^ 0x20BE1195A249L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Arrays.sort(paramArrayOflong, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final double[] plus(@NotNull double[] paramArrayOfdouble, @NotNull Collection paramCollection) {
    long l = c ^ 0x73BD102D5F2BL;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    int i = paramArrayOfdouble.length;
    double[] arrayOfDouble = Arrays.copyOf(paramArrayOfdouble, i + paramCollection.size());
    Iterator<Number> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      double d = ((Number)iterator.next()).doubleValue();
      arrayOfDouble[i++] = d;
    } 
    Intrinsics.checkNotNullExpressionValue(arrayOfDouble, "result");
    return arrayOfDouble;
  }
  
  public static final int binarySearch(@NotNull double[] paramArrayOfdouble, double paramDouble, int paramInt1, int paramInt2) {
    long l = c ^ 0x4DC60E9780E1L;
    Intrinsics.checkNotNullParameter(paramArrayOfdouble, "<this>");
    return Arrays.binarySearch(paramArrayOfdouble, paramInt1, paramInt2, paramDouble);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final short[] copyOfRange(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = c ^ 0x2F1E69BCCD65L;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfshort.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfshort, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfshort, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final List filterIsInstance(@NotNull Object[] paramArrayOfObject, @NotNull Class paramClass) {
    long l = c ^ 0x632608C67A3BL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramClass, "klass");
    return (List)ArraysKt.filterIsInstanceTo(paramArrayOfObject, new ArrayList(), paramClass);
  }
  
  public static final void sortWith(@NotNull Object[] paramArrayOfObject, @NotNull Comparator<? super Object> paramComparator) {
    long l = c ^ 0x7779EDB0C891L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (paramArrayOfObject.length > 1)
        Arrays.sort(paramArrayOfObject, paramComparator); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  @NotNull
  public static final Long[] toTypedArray(@NotNull long[] paramArrayOflong) {
    long l = c ^ 0x6FB83B39FC86L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    Long[] arrayOfLong = new Long[paramArrayOflong.length];
    byte b = 0;
    int i = paramArrayOflong.length;
    try {
      while (b < i) {
        arrayOfLong[b] = Long.valueOf(paramArrayOflong[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfLong;
  }
  
  @NotNull
  public static final List asList(@NotNull char[] paramArrayOfchar) {
    long l = c ^ 0x5A41AB09866CL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$8(paramArrayOfchar);
  }
  
  @NotNull
  public static final long[] plus(@NotNull long[] paramArrayOflong, long paramLong) {
    long l = c ^ 0x3891875EB05CL;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "<this>");
    int i = paramArrayOflong.length;
    long[] arrayOfLong = Arrays.copyOf(paramArrayOflong, i + 1);
    arrayOfLong[i] = paramLong;
    Intrinsics.checkNotNullExpressionValue(arrayOfLong, "result");
    return arrayOfLong;
  }
  
  public static final void sort(@NotNull float[] paramArrayOffloat) {
    long l = c ^ 0x2BB49257FA6BL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
      if (paramArrayOffloat.length > 1)
        Arrays.sort(paramArrayOffloat); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final byte[] copyOfRange(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = c ^ 0x4ACD5E2D53BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfbyte.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Object[] copyOfRange(@NotNull Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    long l = c ^ 0x75E811602268L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfObject.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfObject, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfObject, paramInt1, paramInt2);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final byte[] copyInto(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x4316076E4D30L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "destination");
    System.arraycopy(paramArrayOfbyte1, paramInt2, paramArrayOfbyte2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfbyte2;
  }
  
  @NotNull
  public static final List asList(@NotNull int[] paramArrayOfint) {
    long l = c ^ 0x2F80BAC43077L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return new ArraysKt___ArraysJvmKt$asList$3(paramArrayOfint);
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull int[] paramArrayOfint) {
    long l = c ^ 0x3A1FAEA8EB28L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    return (SortedSet)ArraysKt.toCollection(paramArrayOfint, new TreeSet());
  }
  
  @NotNull
  public static final float[] plus(@NotNull float[] paramArrayOffloat, float paramFloat) {
    long l = c ^ 0x37737ED9E1D7L;
    Intrinsics.checkNotNullParameter(paramArrayOffloat, "<this>");
    int i = paramArrayOffloat.length;
    float[] arrayOfFloat = Arrays.copyOf(paramArrayOffloat, i + 1);
    arrayOfFloat[i] = paramFloat;
    Intrinsics.checkNotNullExpressionValue(arrayOfFloat, "result");
    return arrayOfFloat;
  }
  
  public static final void sort(@NotNull short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    long l = c ^ 0x258977AF9D5CL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Arrays.sort(paramArrayOfshort, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final SortedSet toSortedSet(@NotNull Comparable[] paramArrayOfComparable) {
    long l = c ^ 0x1015C4154C48L;
    Intrinsics.checkNotNullParameter(paramArrayOfComparable, "<this>");
    return (SortedSet)ArraysKt.toCollection((Object[])paramArrayOfComparable, new TreeSet());
  }
  
  @NotNull
  public static final boolean[] plus(@NotNull boolean[] paramArrayOfboolean1, @NotNull boolean[] paramArrayOfboolean2) {
    long l = c ^ 0x3D533CC8F3DBL;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfboolean2, "elements");
    int i = paramArrayOfboolean1.length;
    int j = paramArrayOfboolean2.length;
    boolean[] arrayOfBoolean = Arrays.copyOf(paramArrayOfboolean1, i + j);
    System.arraycopy(paramArrayOfboolean2, 0, arrayOfBoolean, i, j);
    Intrinsics.checkNotNullExpressionValue(arrayOfBoolean, "result");
    return arrayOfBoolean;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final char[] copyInto(@NotNull char[] paramArrayOfchar1, @NotNull char[] paramArrayOfchar2, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x19634AE0E19CL;
    Intrinsics.checkNotNullParameter(paramArrayOfchar1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfchar2, "destination");
    System.arraycopy(paramArrayOfchar1, paramInt2, paramArrayOfchar2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfchar2;
  }
  
  public static final void fill(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    long l = c ^ 0x73878AB17C86L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    Arrays.fill(paramArrayOfint, paramInt2, paramInt3, paramInt1);
  }
  
  public static final void sort(@NotNull byte[] paramArrayOfbyte) {
    long l = c ^ 0x60E78D51546FL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      if (paramArrayOfbyte.length > 1)
        Arrays.sort(paramArrayOfbyte); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final char[] copyOfRange(@NotNull char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    long l = c ^ 0x608BFE12B3F7L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfchar.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfchar, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  @NotNull
  public static final Short[] toTypedArray(@NotNull short[] paramArrayOfshort) {
    long l = c ^ 0xBC3B9CB166AL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "<this>");
    Short[] arrayOfShort = new Short[paramArrayOfshort.length];
    byte b = 0;
    int i = paramArrayOfshort.length;
    try {
      while (b < i) {
        arrayOfShort[b] = Short.valueOf(paramArrayOfshort[b]);
        b++;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfShort;
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final boolean[] copyOfRange(@NotNull boolean[] paramArrayOfboolean, int paramInt1, int paramInt2) {
    long l = c ^ 0x261D73EDFB01L;
    Intrinsics.checkNotNullParameter(paramArrayOfboolean, "<this>");
    ArraysKt.copyOfRangeToIndexCheck(paramInt2, paramArrayOfboolean.length);
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(paramArrayOfboolean, paramInt1, paramInt2), "copyOfRange(this, fromIndex, toIndex)");
    return Arrays.copyOfRange(paramArrayOfboolean, paramInt1, paramInt2);
  }
  
  private static IndexOutOfBoundsException b(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */