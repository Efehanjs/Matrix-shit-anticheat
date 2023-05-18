package me.rerere.matrix.thirdparty.kotlin.text;

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
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.Grouping;
import me.rerere.matrix.thirdparty.kotlin.collections.IndexingIterable;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.SlidingWindowKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntProgression;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
  private static final long l = o3.a(-6026641858486208269L, 4911828479784154292L, null).a(14990139156136L);
  
  @NotNull
  public static final Map associateBy(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = l ^ 0x45F88EB1E572L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramCharSequence.length()), 16);
    CharSequence charSequence = paramCharSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      linkedHashMap.put(paramFunction11.invoke(Character.valueOf(c)), paramFunction12.invoke(Character.valueOf(c)));
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final List mapIndexedNotNull(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 85639566420329
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
    //   51: iconst_0
    //   52: istore #11
    //   54: iload #11
    //   56: aload #8
    //   58: invokeinterface length : ()I
    //   63: if_icmpge -> 142
    //   66: aload #8
    //   68: iload #11
    //   70: invokeinterface charAt : (I)C
    //   75: istore #12
    //   77: iload #10
    //   79: iinc #10, 1
    //   82: iload #12
    //   84: istore #13
    //   86: istore #14
    //   88: iconst_0
    //   89: istore #15
    //   91: aload_1
    //   92: iload #14
    //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   97: iload #13
    //   99: invokestatic valueOf : (C)Ljava/lang/Character;
    //   102: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   107: dup
    //   108: ifnull -> 133
    //   111: astore #16
    //   113: aload #16
    //   115: astore #17
    //   117: iconst_0
    //   118: istore #18
    //   120: aload #6
    //   122: aload #17
    //   124: invokeinterface add : (Ljava/lang/Object;)Z
    //   129: pop
    //   130: goto -> 135
    //   133: pop
    //   134: nop
    //   135: nop
    //   136: iinc #11, 1
    //   139: goto -> 54
    //   142: nop
    //   143: aload #6
    //   145: checkcast java/util/List
    //   148: areturn
  }
  
  @NotNull
  public static final Map associateTo(@NotNull CharSequence paramCharSequence, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x700FFB8A6FDDL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      Map<Object, Object> map = paramMap;
      Pair pair = (Pair)paramFunction1.invoke(Character.valueOf(c));
      map.put(pair.getFirst(), pair.getSecond());
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull CharSequence paramCharSequence, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x4E82041BA14FL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      Object object1 = paramFunction1.invoke(Character.valueOf(c));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Character> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Character.valueOf(c));
    } 
    return paramMap;
  }
  
  @NotNull
  public static final String takeWhile(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0xA35C0907456L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramString.length();
    while (true) {
      try {
        if (b < i) {
          if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramString.charAt(b)))).booleanValue()) {
            String str = paramString;
            boolean bool1 = false;
            Intrinsics.checkNotNullExpressionValue(str.substring(bool1, b), "this as java.lang.String…ing(startIndex, endIndex)");
            return str.substring(bool1, b);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return paramString;
    } 
  }
  
  @NotNull
  public static final List mapIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x306506DCED6BL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    ArrayList<Object> arrayList = new ArrayList(paramCharSequence.length());
    boolean bool2 = false;
    byte b1 = 0;
    for (byte b2 = 0; b2 < charSequence.length(); b2++) {
      char c = charSequence.charAt(b2);
      arrayList.add(paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List scan(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x7AAE644094BAL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    boolean bool2 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      ArrayList<Object> arrayList1 = new ArrayList(charSequence.length() + 1);
      ArrayList<Object> arrayList2 = arrayList1;
      char c = Character.MIN_VALUE;
      arrayList2.add(paramObject);
      ArrayList<Object> arrayList3 = arrayList1;
      Object object = paramObject;
      for (byte b = 0; b < charSequence.length(); b++) {
        c = charSequence.charAt(b);
        object = paramFunction2.invoke(object, Character.valueOf(c));
        arrayList3.add(object);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((charSequence.length() == 0)) ? CollectionsKt.listOf(paramObject) : arrayList3;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character minOrNull(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x43FF19C816D2L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (Intrinsics.compare(c, c1) > 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final String takeLastWhile(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x1E9061EA7F17L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramString);
    while (true) {
      try {
        if (-1 < i) {
          if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramString.charAt(i)))).booleanValue()) {
            String str = paramString;
            int j = i + 1;
            Intrinsics.checkNotNullExpressionValue(str.substring(j), "this as java.lang.String).substring(startIndex)");
            return str.substring(j);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return paramString;
    } 
  }
  
  public static final boolean all(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x41C25F40B6A6L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  @NotNull
  public static final CharSequence reversed(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0xA813D673D4AL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullExpressionValue((new StringBuilder(paramCharSequence)).reverse(), "StringBuilder(this).reverse()");
    return (new StringBuilder(paramCharSequence)).reverse();
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final List scanIndexed(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x532E9A02EA3EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    boolean bool2 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      ArrayList<Object> arrayList1 = new ArrayList(charSequence.length() + 1);
      ArrayList<Object> arrayList2 = arrayList1;
      int i = 0;
      arrayList2.add(paramObject);
      ArrayList<Object> arrayList3 = arrayList1;
      Object object = paramObject;
      byte b = 0;
      i = charSequence.length();
      while (b < i) {
        object = paramFunction3.invoke(Integer.valueOf(b), object, Character.valueOf(charSequence.charAt(b)));
        arrayList3.add(object);
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((charSequence.length() == 0)) ? CollectionsKt.listOf(paramObject) : arrayList3;
  }
  
  @NotNull
  public static final CharSequence filter(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x1166BF16407FL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool2 = false;
    byte b = 0;
    int i = charSequence.length();
    while (b < i) {
      char c = charSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          stringBuilder.append(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return stringBuilder;
  }
  
  @NotNull
  public static final CharSequence filterNot(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x5714726A22BCL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          stringBuilder.append(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return stringBuilder;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List windowed(@NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 61718001560637
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
    //   28: invokeinterface length : ()I
    //   33: istore #7
    //   35: iload #7
    //   37: iload_2
    //   38: idiv
    //   39: iload #7
    //   41: iload_2
    //   42: irem
    //   43: ifne -> 54
    //   46: iconst_0
    //   47: goto -> 55
    //   50: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   53: athrow
    //   54: iconst_1
    //   55: iadd
    //   56: istore #8
    //   58: new java/util/ArrayList
    //   61: dup
    //   62: iload #8
    //   64: invokespecial <init> : (I)V
    //   67: astore #9
    //   69: iconst_0
    //   70: istore #10
    //   72: iconst_0
    //   73: iload #10
    //   75: if_icmpgt -> 104
    //   78: iload #10
    //   80: iload #7
    //   82: if_icmpge -> 100
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   91: athrow
    //   92: iconst_1
    //   93: goto -> 105
    //   96: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   99: athrow
    //   100: iconst_0
    //   101: goto -> 105
    //   104: iconst_0
    //   105: ifeq -> 189
    //   108: iload #10
    //   110: iload_1
    //   111: iadd
    //   112: istore #11
    //   114: iload #11
    //   116: iflt -> 133
    //   119: iload #11
    //   121: iload #7
    //   123: if_icmple -> 153
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   132: athrow
    //   133: iload_3
    //   134: ifeq -> 189
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   143: athrow
    //   144: iload #7
    //   146: goto -> 155
    //   149: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   152: athrow
    //   153: iload #11
    //   155: istore #12
    //   157: aload #9
    //   159: aload #4
    //   161: aload_0
    //   162: iload #10
    //   164: iload #12
    //   166: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   171: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   176: invokevirtual add : (Ljava/lang/Object;)Z
    //   179: pop
    //   180: iload #10
    //   182: iload_2
    //   183: iadd
    //   184: istore #10
    //   186: goto -> 72
    //   189: aload #9
    //   191: checkcast java/util/List
    //   194: areturn
    // Exception table:
    //   from	to	target	type
    //   35	50	50	java/util/NoSuchElementException
    //   72	85	88	java/util/NoSuchElementException
    //   78	96	96	java/util/NoSuchElementException
    //   114	126	129	java/util/NoSuchElementException
    //   119	137	140	java/util/NoSuchElementException
    //   133	149	149	java/util/NoSuchElementException
  }
  
  @NotNull
  public static final List toMutableList(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x1C9CC2FC19C7L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return (List)StringsKt.toCollection(paramCharSequence, new ArrayList(paramCharSequence.length()));
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List chunked(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0x7A17430C0B9BL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return StringsKt.windowed(paramCharSequence, paramInt, paramInt, true);
  }
  
  public static final int indexOfLast(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x36CB7FDF7B94L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramCharSequence.length() + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(j)))).booleanValue())
          return j; 
      } while (0 <= i); 
    return -1;
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final double sumByDouble(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0xCD58264694EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    double d = 0.0D;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      d += ((Number)paramFunction1.invoke(Character.valueOf(c))).doubleValue();
    } 
    return d;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Grouping groupingBy(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x43CBB3BD48E2L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    return new StringsKt___StringsKt$groupingBy$1(paramCharSequence, paramFunction1);
  }
  
  public static final boolean any(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x477A15AD7CD8L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !((paramCharSequence.length() == 0) ? 1 : 0);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character randomOrNull(@NotNull CharSequence paramCharSequence, @NotNull Random paramRandom) {
    long l = l ^ 0x339C2939292DL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Character.valueOf(paramCharSequence.charAt(paramRandom.nextInt(paramCharSequence.length())));
  }
  
  @NotNull
  public static final List toList(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x7705EE7713ABL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      switch (paramCharSequence.length()) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return StringsKt.toMutableList(paramCharSequence);
  }
  
  @NotNull
  public static final Appendable filterNotTo(@NotNull CharSequence paramCharSequence, @NotNull Appendable paramAppendable, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x7B1E408850A3L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramAppendable, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          paramAppendable.append(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return paramAppendable;
  }
  
  public static final char single(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x7E23372A19EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Character character = null;
    boolean bool2 = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          try {
            if (bool2)
              throw new IllegalArgumentException("Char sequence contains more than one matching element."); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          character = Character.valueOf(c);
          bool2 = true;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    try {
      if (!bool2)
        throw new NoSuchElementException("Char sequence contains no character matching the predicate."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(character, "null cannot be cast to non-null type kotlin.Char");
    return character.charValue();
  }
  
  public static final Object foldIndexed(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x2FC26EA6C87EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    byte b1 = 0;
    Object object = paramObject;
    for (byte b2 = 0; b2 < paramCharSequence.length(); b2++) {
      char c = paramCharSequence.charAt(b2);
      object = paramFunction3.invoke(Integer.valueOf(b1++), object, Character.valueOf(c));
    } 
    return object;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningFoldIndexed(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x1BF53AE6C60EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return CollectionsKt.listOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList2 = new ArrayList(paramCharSequence.length() + 1);
    ArrayList<Object> arrayList3 = arrayList2;
    int i = 0;
    arrayList3.add(paramObject);
    ArrayList<Object> arrayList1 = arrayList2;
    Object object = paramObject;
    byte b = 0;
    i = paramCharSequence.length();
    while (b < i) {
      object = paramFunction3.invoke(Integer.valueOf(b), object, Character.valueOf(paramCharSequence.charAt(b)));
      arrayList1.add(object);
      b++;
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final String filterNot(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x6E1477C1920FL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    CharSequence charSequence = paramString;
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      try {
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          stringBuilder.append(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder.toString(), "filterNotTo(StringBuilder(), predicate).toString()");
    return stringBuilder.toString();
  }
  
  @NotNull
  public static final String takeLast(@NotNull String paramString, int paramInt) {
    long l = l ^ 0x5EED2EC6F4DDL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = (paramInt >= 0) ? 1 : 0;
    if (!i) {
      boolean bool = false;
      String str1 = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str1.toString());
    } 
    i = paramString.length();
    String str = paramString;
    int j = i - RangesKt.coerceAtMost(paramInt, i);
    Intrinsics.checkNotNullExpressionValue(str.substring(j), "this as java.lang.String).substring(startIndex)");
    return str.substring(j);
  }
  
  @NotNull
  public static final Pair partition(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x18F47F3AD28BL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          stringBuilder1.append(c);
        } else {
          stringBuilder2.append(c);
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return new Pair(stringBuilder1, stringBuilder2);
  }
  
  @NotNull
  public static final String take(@NotNull String paramString, int paramInt) {
    long l = l ^ 0x301A508D7084L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool1 = (paramInt >= 0) ? true : false;
    if (!bool1) {
      boolean bool = false;
      String str1 = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str1.toString());
    } 
    String str = paramString;
    boolean bool2 = false;
    int i = RangesKt.coerceAtMost(paramInt, paramString.length());
    Intrinsics.checkNotNullExpressionValue(str.substring(bool2, i), "this as java.lang.String…ing(startIndex, endIndex)");
    return str.substring(bool2, i);
  }
  
  @NotNull
  public static final String drop(@NotNull String paramString, int paramInt) {
    long l = l ^ 0x3B49211C6E14L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str1 = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str1.toString());
    } 
    String str = paramString;
    int i = RangesKt.coerceAtMost(paramInt, paramString.length());
    Intrinsics.checkNotNullExpressionValue(str.substring(i), "this as java.lang.String).substring(startIndex)");
    return str.substring(i);
  }
  
  public static final int count(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x39CB14D5BBAFL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramCharSequence.length(); b2++) {
      char c = paramCharSequence.charAt(b2);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          b1++; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return b1;
  }
  
  @NotNull
  public static final Set toSet(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x7C5294522B83L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      switch (paramCharSequence.length()) {
        case 0:
        
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Set)StringsKt.toCollection(paramCharSequence, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(paramCharSequence.length(), 128))));
  }
  
  public static final boolean any(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x6F84CFE35B5DL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return true; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  @NotNull
  public static final Map groupByTo(@NotNull CharSequence paramCharSequence, @NotNull Map<Object, ArrayList> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = l ^ 0x631B6CDDD0EDL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      Object object1 = paramFunction11.invoke(Character.valueOf(c));
      Map<Object, ArrayList> map = paramMap;
      boolean bool1 = false;
      Object object2 = map.get(object1);
      boolean bool2 = false;
      ArrayList arrayList = new ArrayList();
      map.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Character.valueOf(c)));
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char maxOrThrow(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x753BAF8A69EL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (Intrinsics.compare(c, c1) < 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final CharSequence drop(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0x11EF6FD6C511L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return paramCharSequence.subSequence(RangesKt.coerceAtMost(paramInt, paramCharSequence.length()), paramCharSequence.length());
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence windowedSequence(@NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = l ^ 0x6D77EA5AAA20L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return StringsKt.windowedSequence(paramCharSequence, paramInt1, paramInt2, paramBoolean, StringsKt___StringsKt$windowedSequence$1.INSTANCE);
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character reduceIndexedOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x5A126BAAB691L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(c), Character.valueOf(paramCharSequence.charAt(i)))).charValue();
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final List map(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x6DDB4D66EADBL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    ArrayList<Object> arrayList = new ArrayList(paramCharSequence.length());
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      arrayList.add(paramFunction1.invoke(Character.valueOf(c)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char maxWithOrThrow(@NotNull CharSequence paramCharSequence, @NotNull Comparator<Character> paramComparator) {
    long l = l ^ 0x4174F02828FEL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) < 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final CharSequence take(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0x6B3FFB950625L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return paramCharSequence.subSequence(0, RangesKt.coerceAtMost(paramInt, paramCharSequence.length()));
  }
  
  public static final void forEachIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x3ECE56830A5CL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramCharSequence.length(); b2++) {
      char c = paramCharSequence.charAt(b2);
      paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c));
    } 
  }
  
  public static final char last(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x39F89FE6E42CL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramCharSequence.length() + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        char c = paramCharSequence.charAt(j);
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return c; 
      } while (0 <= i); 
    throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
  }
  
  @NotNull
  public static final List flatMap(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x369E0D9BBBDAL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      Iterable iterable = (Iterable)paramFunction1.invoke(Character.valueOf(c));
      CollectionsKt.addAll(arrayList, iterable);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Pair partition(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x14D5DB9BAE68L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    byte b = 0;
    int i = paramString.length();
    while (b < i) {
      char c = paramString.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue()) {
          stringBuilder1.append(c);
        } else {
          stringBuilder2.append(c);
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "first.toString()");
    Intrinsics.checkNotNullExpressionValue(stringBuilder2.toString(), "second.toString()");
    return new Pair(stringBuilder1.toString(), stringBuilder2.toString());
  }
  
  @NotNull
  public static final String filter(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x4AB31D15EA1DL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    CharSequence charSequence = paramString;
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool2 = false;
    byte b = 0;
    int i = charSequence.length();
    while (b < i) {
      char c = charSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          stringBuilder.append(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder.toString(), "filterTo(StringBuilder(), predicate).toString()");
    return stringBuilder.toString();
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List windowed(@NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = l ^ 0x5D095ADD644EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return StringsKt.windowed(paramCharSequence, paramInt1, paramInt2, paramBoolean, StringsKt___StringsKt$windowed$1.INSTANCE);
  }
  
  @NotNull
  public static final Iterable withIndex(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x6203D4DF275EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return (Iterable)new IndexingIterable(new StringsKt___StringsKt$withIndex$1(paramCharSequence));
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character minByOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x428461EA4194L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    int i = StringsKt.getLastIndex(paramCharSequence);
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
      char c1 = paramCharSequence.charAt(j);
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) > 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return Character.valueOf(c);
  }
  
  @Nullable
  public static final Character firstOrNull(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x3D3EE3A9FDF8L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramCharSequence.length() == 0)) ? null : Character.valueOf(paramCharSequence.charAt(0));
  }
  
  @NotNull
  public static final CharSequence filterIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 111998559071556
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
    //   26: new java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: checkcast java/lang/Appendable
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
    //   54: iload #11
    //   56: aload #8
    //   58: invokeinterface length : ()I
    //   63: if_icmpge -> 141
    //   66: aload #8
    //   68: iload #11
    //   70: invokeinterface charAt : (I)C
    //   75: istore #12
    //   77: iload #10
    //   79: iinc #10, 1
    //   82: iload #12
    //   84: istore #13
    //   86: istore #14
    //   88: iconst_0
    //   89: istore #15
    //   91: aload_1
    //   92: iload #14
    //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   97: iload #13
    //   99: invokestatic valueOf : (C)Ljava/lang/Character;
    //   102: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   107: checkcast java/lang/Boolean
    //   110: invokevirtual booleanValue : ()Z
    //   113: ifeq -> 133
    //   116: aload #6
    //   118: iload #13
    //   120: invokeinterface append : (C)Ljava/lang/Appendable;
    //   125: pop
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   132: athrow
    //   133: nop
    //   134: nop
    //   135: iinc #11, 1
    //   138: goto -> 54
    //   141: nop
    //   142: aload #6
    //   144: checkcast java/lang/CharSequence
    //   147: areturn
    // Exception table:
    //   from	to	target	type
    //   91	126	129	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.3")
  public static final char random(@NotNull CharSequence paramCharSequence, @NotNull Random paramRandom) {
    long l = l ^ 0x6DFA5C539E84L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException("Char sequence is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharSequence.charAt(paramRandom.nextInt(paramCharSequence.length()));
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence windowedSequence(@NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x5694063C3B70L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramFunction1, "transform");
      SlidingWindowKt.checkWindowSizeStep(paramInt1, paramInt2);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    IntProgression intProgression = RangesKt.step(paramBoolean ? (IntProgression)StringsKt.getIndices(paramCharSequence) : (IntProgression)RangesKt.until(0, paramCharSequence.length() - paramInt1 + 1), paramInt2);
    return SequencesKt.map(CollectionsKt.asSequence((Iterable)intProgression), new StringsKt___StringsKt$windowedSequence$2(paramInt1, paramCharSequence, paramFunction1));
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull CharSequence paramCharSequence, @NotNull Map<Object, Object> paramMap, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = l ^ 0x769609934D69L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      paramMap.put(paramFunction11.invoke(Character.valueOf(c)), paramFunction12.invoke(Character.valueOf(c)));
    } 
    return paramMap;
  }
  
  public static final Object foldRightIndexed(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x59D26833C11L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    Object object = paramObject;
    while (i >= 0) {
      object = paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(paramCharSequence.charAt(i)), object);
      i--;
    } 
    return object;
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull CharSequence paramCharSequence, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = l ^ 0xF811D08C2F5L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      paramCollection.add(paramFunction1.invoke(Character.valueOf(c)));
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List mapNotNull(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 108065531369387
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
    //   51: iload #10
    //   53: aload #8
    //   55: invokeinterface length : ()I
    //   60: if_icmpge -> 127
    //   63: aload #8
    //   65: iload #10
    //   67: invokeinterface charAt : (I)C
    //   72: istore #11
    //   74: iload #11
    //   76: istore #12
    //   78: iconst_0
    //   79: istore #13
    //   81: aload_1
    //   82: iload #12
    //   84: invokestatic valueOf : (C)Ljava/lang/Character;
    //   87: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: dup
    //   93: ifnull -> 118
    //   96: astore #14
    //   98: aload #14
    //   100: astore #15
    //   102: iconst_0
    //   103: istore #16
    //   105: aload #6
    //   107: aload #15
    //   109: invokeinterface add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: goto -> 120
    //   118: pop
    //   119: nop
    //   120: nop
    //   121: iinc #10, 1
    //   124: goto -> 51
    //   127: nop
    //   128: aload #6
    //   130: checkcast java/util/List
    //   133: areturn
  }
  
  public static final char reduceRight(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x52B6A45BADAFL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty char sequence can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c;
    for (c = paramCharSequence.charAt(i--); i >= 0; c = ((Character)paramFunction2.invoke(Character.valueOf(paramCharSequence.charAt(i--)), Character.valueOf(c))).charValue());
    return c;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char maxByOrThrow(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x709847714ABCL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    int i = StringsKt.getLastIndex(paramCharSequence);
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
      char c1 = paramCharSequence.charAt(j);
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) < 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return c;
  }
  
  @NotNull
  public static final List zip(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x2CFCE1A5DC18L;
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = Math.min(paramCharSequence1.length(), paramCharSequence2.length());
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Character.valueOf(paramCharSequence1.charAt(b)), Character.valueOf(paramCharSequence2.charAt(b))));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List chunked(@NotNull CharSequence paramCharSequence, int paramInt, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x2884FFCC13D6L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return StringsKt.windowed(paramCharSequence, paramInt, paramInt, true, paramFunction1);
  }
  
  @NotNull
  public static final Map associateBy(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x5284C2353F8L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramCharSequence.length()), 16);
    CharSequence charSequence = paramCharSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      linkedHashMap.put(paramFunction1.invoke(Character.valueOf(c)), Character.valueOf(c));
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningFold(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x233142CD6339L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return CollectionsKt.listOf(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList2 = new ArrayList(paramCharSequence.length() + 1);
    ArrayList<Object> arrayList3 = arrayList2;
    char c = Character.MIN_VALUE;
    arrayList3.add(paramObject);
    ArrayList<Object> arrayList1 = arrayList2;
    Object object = paramObject;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      c = paramCharSequence.charAt(b);
      object = paramFunction2.invoke(object, Character.valueOf(c));
      arrayList1.add(object);
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final String dropLastWhile(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x55504D1FEB6L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramString);
    while (true) {
      try {
        if (-1 < i) {
          if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramString.charAt(i)))).booleanValue()) {
            String str = paramString;
            boolean bool1 = false;
            int j = i + 1;
            Intrinsics.checkNotNullExpressionValue(str.substring(bool1, j), "this as java.lang.String…ing(startIndex, endIndex)");
            return str.substring(bool1, j);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return "";
    } 
  }
  
  @NotNull
  public static final Map associate(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x60C2E544E3ADL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramCharSequence.length()), 16);
    CharSequence charSequence = paramCharSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      Pair pair = (Pair)paramFunction1.invoke(Character.valueOf(c));
      linkedHashMap1.put(pair.getFirst(), pair.getSecond());
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final CharSequence dropLastWhile(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x5A4892F7E681L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(i)))).booleanValue())
              return paramCharSequence.subSequence(0, i + 1); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return "";
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character maxWithOrNull(@NotNull CharSequence paramCharSequence, @NotNull Comparator<Character> paramComparator) {
    long l = l ^ 0x29186D0C5A33L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) < 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final CharSequence dropLast(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0xBD2BA428989L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return StringsKt.take(paramCharSequence, RangesKt.coerceAtLeast(paramCharSequence.length() - paramInt, 0));
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningReduceIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x23830ABDA4FFL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool1 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = Character.MIN_VALUE;
    c = paramCharSequence.charAt(0);
    ArrayList<Character> arrayList2 = new ArrayList(paramCharSequence.length());
    ArrayList<Character> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(Character.valueOf(c));
    ArrayList<Character> arrayList1 = arrayList2;
    byte b = 1;
    int i = paramCharSequence.length();
    while (b < i) {
      c = ((Character)paramFunction3.invoke(Integer.valueOf(b), Character.valueOf(c), Character.valueOf(paramCharSequence.charAt(b)))).charValue();
      arrayList1.add(Character.valueOf(c));
      b++;
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final Appendable filterTo(@NotNull CharSequence paramCharSequence, @NotNull Appendable paramAppendable, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x71E56BFD2C34L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramAppendable, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramCharSequence.length();
    while (b < i) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          paramAppendable.append(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramAppendable;
  }
  
  @NotNull
  public static final Map associateByTo(@NotNull CharSequence paramCharSequence, @NotNull Map<Object, Character> paramMap, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x976EEE16D4AL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      paramMap.put(paramFunction1.invoke(Character.valueOf(c)), Character.valueOf(c));
    } 
    return paramMap;
  }
  
  @Nullable
  public static final Character singleOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x5C09DACA3747L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Character character = null;
    boolean bool2 = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
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
    } 
    try {
      if (!bool2)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return character;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char minWithOrThrow(@NotNull CharSequence paramCharSequence, @NotNull Comparator<Character> paramComparator) {
    long l = l ^ 0x16C8377E5987L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) > 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final List zip(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2) {
    long l = l ^ 0x2D6865465117L;
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
    CharSequence charSequence = paramCharSequence1;
    boolean bool = false;
    int i = Math.min(charSequence.length(), paramCharSequence2.length());
    ArrayList<Pair> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      char c1 = paramCharSequence2.charAt(b);
      char c2 = charSequence.charAt(b);
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool1 = false;
      arrayList1.add(TuplesKt.to(Character.valueOf(c2), Character.valueOf(c1)));
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char minByOrThrow(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x23AB09FB464FL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    int i = StringsKt.getLastIndex(paramCharSequence);
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
      char c1 = paramCharSequence.charAt(j);
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) > 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return c;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List zipWithNext(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x26B3403F765L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    CharSequence charSequence = paramCharSequence;
    boolean bool = false;
    int i = charSequence.length() - 1;
    try {
      ArrayList<Pair> arrayList = new ArrayList(i);
      for (byte b = 0; b < i; b++) {
        char c1 = charSequence.charAt(b + 1);
        char c2 = charSequence.charAt(b);
        ArrayList<Pair> arrayList1 = arrayList;
        boolean bool1 = false;
        arrayList1.add(TuplesKt.to(Character.valueOf(c2), Character.valueOf(c1)));
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (i < 1) ? CollectionsKt.emptyList() : arrayList;
  }
  
  public static final Object foldRight(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x241DB6200042L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    Object object;
    for (object = paramObject; i >= 0; object = paramFunction2.invoke(Character.valueOf(paramCharSequence.charAt(i--)), object));
    return object;
  }
  
  @SinceKotlin(version = "1.7")
  public static final char minOrThrow(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x35C58E1BDC34L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (Intrinsics.compare(c, c1) > 0)
        c = c1; 
    } 
    return c;
  }
  
  @NotNull
  public static final HashSet toHashSet(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x5651C42D1D17L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return (HashSet)StringsKt.toCollection(paramCharSequence, new HashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(paramCharSequence.length(), 128))));
  }
  
  public static final char first(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x7718F09DA838L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException("Char sequence is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharSequence.charAt(0);
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final CharSequence onEachIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x1F6A451B624CL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool1 = false;
    CharSequence charSequence1 = paramCharSequence;
    CharSequence charSequence2 = charSequence1;
    boolean bool2 = false;
    CharSequence charSequence3 = charSequence2;
    boolean bool3 = false;
    byte b1 = 0;
    for (byte b2 = 0; b2 < charSequence3.length(); b2++) {
      char c = charSequence3.charAt(b2);
      paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c));
    } 
    return charSequence1;
  }
  
  @NotNull
  public static final CharSequence slice(@NotNull CharSequence paramCharSequence, @NotNull IntRange paramIntRange) {
    long l = l ^ 0x1C9AE0758C32L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return ""; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return StringsKt.subSequence(paramCharSequence, paramIntRange);
  }
  
  @NotNull
  public static final String dropWhile(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x6313CFDF73C5L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramString.length();
    while (true) {
      try {
        if (b < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramString.charAt(b)))).booleanValue()) {
              Intrinsics.checkNotNullExpressionValue(paramString.substring(b), "this as java.lang.String).substring(startIndex)");
              return paramString.substring(b);
            } 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return "";
    } 
  }
  
  @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  public static final int sumBy(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0xDAD128F6D7EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    int i = 0;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      i += ((Number)paramFunction1.invoke(Character.valueOf(c))).intValue();
    } 
    return i;
  }
  
  public static final char last(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x33BCB953D644L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new NoSuchElementException("Char sequence is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharSequence.charAt(StringsKt.getLastIndex(paramCharSequence));
  }
  
  public static final char reduce(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x3BDAD2F77AFEL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new UnsupportedOperationException("Empty char sequence can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction2.invoke(Character.valueOf(c), Character.valueOf(paramCharSequence.charAt(i)))).charValue();
    } 
    return c;
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List zipWithNext(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x3A37FC7113BCL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    int i = paramCharSequence.length() - 1;
    try {
      if (i < 1)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList = new ArrayList(i);
    byte b = 0;
    try {
      while (b < i) {
        arrayList.add(paramFunction2.invoke(Character.valueOf(paramCharSequence.charAt(b)), Character.valueOf(paramCharSequence.charAt(b + 1))));
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map associateWithTo(@NotNull CharSequence paramCharSequence, @NotNull Map<Character, Object> paramMap, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x493A468D7ED4L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      paramMap.put(Character.valueOf(c), paramFunction1.invoke(Character.valueOf(c)));
    } 
    return paramMap;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    long l = l ^ 0x58D12121B1CEL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "keySelector");
    Intrinsics.checkNotNullParameter(paramFunction12, "valueTransform");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      Object object1 = paramFunction11.invoke(Character.valueOf(c));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Object> list = (object2 == null) ? arrayList : (List)object2;
      list.add(paramFunction12.invoke(Character.valueOf(c)));
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character maxOrNull(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x2AC9E82F2387L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (Intrinsics.compare(c, c1) < 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  public static final char reduceRightIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x5B313B6E7DACL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    try {
      if (i < 0)
        throw new UnsupportedOperationException("Empty char sequence can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(i--);
    while (i >= 0) {
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(paramCharSequence.charAt(i)), Character.valueOf(c))).charValue();
      i--;
    } 
    return c;
  }
  
  @NotNull
  public static final Map groupBy(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x363DB615E16FL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "keySelector");
    boolean bool1 = false;
    CharSequence charSequence = paramCharSequence;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      Object object1 = paramFunction1.invoke(Character.valueOf(c));
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool3 = false;
      Object object2 = linkedHashMap1.get(object1);
      boolean bool4 = false;
      ArrayList arrayList = new ArrayList();
      linkedHashMap1.put(object1, arrayList);
      List<Character> list = (object2 == null) ? arrayList : (List)object2;
      list.add(Character.valueOf(c));
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character reduceRightIndexedOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x6BB5F09A7BD5L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(i--);
    while (i >= 0) {
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(paramCharSequence.charAt(i)), Character.valueOf(c))).charValue();
      i--;
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final Collection toCollection(@NotNull CharSequence paramCharSequence, @NotNull Collection<Character> paramCollection) {
    long l = l ^ 0x217B34F67FEEL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      paramCollection.add(Character.valueOf(c));
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull CharSequence paramCharSequence, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x4B88D78080F0L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      Iterable iterable = (Iterable)paramFunction1.invoke(Character.valueOf(c));
      CollectionsKt.addAll(paramCollection, iterable);
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final Appendable filterIndexedTo(@NotNull CharSequence paramCharSequence, @NotNull Appendable paramAppendable, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 84123505785927
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
    //   41: iload #9
    //   43: aload #6
    //   45: invokeinterface length : ()I
    //   50: if_icmpge -> 127
    //   53: aload #6
    //   55: iload #9
    //   57: invokeinterface charAt : (I)C
    //   62: istore #10
    //   64: iload #8
    //   66: iinc #8, 1
    //   69: iload #10
    //   71: istore #11
    //   73: istore #12
    //   75: iconst_0
    //   76: istore #13
    //   78: aload_2
    //   79: iload #12
    //   81: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   84: iload #11
    //   86: invokestatic valueOf : (C)Ljava/lang/Character;
    //   89: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   94: checkcast java/lang/Boolean
    //   97: invokevirtual booleanValue : ()Z
    //   100: ifeq -> 119
    //   103: aload_1
    //   104: iload #11
    //   106: invokeinterface append : (C)Ljava/lang/Appendable;
    //   111: pop
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   118: athrow
    //   119: nop
    //   120: nop
    //   121: iinc #9, 1
    //   124: goto -> 41
    //   127: nop
    //   128: aload_1
    //   129: areturn
    // Exception table:
    //   from	to	target	type
    //   78	112	115	java/util/NoSuchElementException
  }
  
  public static final Object fold(@NotNull CharSequence paramCharSequence, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x538712CA80F2L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    Object object = paramObject;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      object = paramFunction2.invoke(object, Character.valueOf(c));
    } 
    return object;
  }
  
  @NotNull
  public static final Iterable asIterable(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0xAF19030E54L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramCharSequence instanceof String) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        try {
          if ((paramCharSequence.length() == 0))
            return CollectionsKt.emptyList(); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(paramCharSequence);
  }
  
  public static final boolean none(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x5414978996FEL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramCharSequence.length() == 0);
  }
  
  @NotNull
  public static final CharSequence slice(@NotNull CharSequence paramCharSequence, @NotNull Iterable paramIterable) {
    long l = l ^ 0x3ACF63913A01L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "indices");
    int i = CollectionsKt.collectionSizeOrDefault(paramIterable, 10);
    try {
      if (i == 0)
        return ""; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(i);
    Iterator<Number> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      int j = ((Number)iterator.next()).intValue();
      stringBuilder.append(paramCharSequence.charAt(j));
    } 
    return stringBuilder;
  }
  
  @NotNull
  public static final String dropLast(@NotNull String paramString, int paramInt) {
    long l = l ^ 0xE3AC83C8349L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    return StringsKt.take(paramString, RangesKt.coerceAtLeast(paramString.length() - paramInt, 0));
  }
  
  @NotNull
  public static final String slice(@NotNull String paramString, @NotNull IntRange paramIntRange) {
    long l = l ^ 0x4A2E6032D342L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "indices");
      if (paramIntRange.isEmpty())
        return ""; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return StringsKt.substring(paramString, paramIntRange);
  }
  
  public static final char single(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x4A537DBD5F05L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      switch (paramCharSequence.length()) {
        case 0:
          throw new NoSuchElementException("Char sequence is empty.");
        case 1:
        
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Char sequence has more than one element.");
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence chunkedSequence(@NotNull CharSequence paramCharSequence, int paramInt, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x7DDEEB385C5EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    return StringsKt.windowedSequence(paramCharSequence, paramInt, paramInt, true, paramFunction1);
  }
  
  @NotNull
  public static final Collection mapIndexedTo(@NotNull CharSequence paramCharSequence, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x1E6E4342710EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    boolean bool = false;
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramCharSequence.length(); b2++) {
      char c = paramCharSequence.charAt(b2);
      paramCollection.add(paramFunction2.invoke(Integer.valueOf(b1++), Character.valueOf(c)));
    } 
    return paramCollection;
  }
  
  public static final char reduceIndexed(@NotNull CharSequence paramCharSequence, @NotNull Function3 paramFunction3) {
    long l = l ^ 0x6E7680CA79BAL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        throw new UnsupportedOperationException("Empty char sequence can't be reduced."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction3.invoke(Integer.valueOf(i), Character.valueOf(c), Character.valueOf(paramCharSequence.charAt(i)))).charValue();
    } 
    return c;
  }
  
  @NotNull
  public static final String filterIndexed(@NotNull String paramString, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 94771735494286
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
    //   24: checkcast java/lang/CharSequence
    //   27: astore #5
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: checkcast java/lang/Appendable
    //   39: astore #6
    //   41: iconst_0
    //   42: istore #7
    //   44: aload #5
    //   46: astore #8
    //   48: iconst_0
    //   49: istore #9
    //   51: iconst_0
    //   52: istore #10
    //   54: iconst_0
    //   55: istore #11
    //   57: iload #11
    //   59: aload #8
    //   61: invokeinterface length : ()I
    //   66: if_icmpge -> 144
    //   69: aload #8
    //   71: iload #11
    //   73: invokeinterface charAt : (I)C
    //   78: istore #12
    //   80: iload #10
    //   82: iinc #10, 1
    //   85: iload #12
    //   87: istore #13
    //   89: istore #14
    //   91: iconst_0
    //   92: istore #15
    //   94: aload_1
    //   95: iload #14
    //   97: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   100: iload #13
    //   102: invokestatic valueOf : (C)Ljava/lang/Character;
    //   105: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast java/lang/Boolean
    //   113: invokevirtual booleanValue : ()Z
    //   116: ifeq -> 136
    //   119: aload #6
    //   121: iload #13
    //   123: invokeinterface append : (C)Ljava/lang/Appendable;
    //   128: pop
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   135: athrow
    //   136: nop
    //   137: nop
    //   138: iinc #11, 1
    //   141: goto -> 57
    //   144: nop
    //   145: aload #6
    //   147: checkcast java/lang/StringBuilder
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: dup
    //   154: ldc_w 'filterIndexedTo(StringBu…(), predicate).toString()'
    //   157: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   94	129	132	java/util/NoSuchElementException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final CharSequence onEach(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x39D618F04CE3L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool1 = false;
    CharSequence charSequence1 = paramCharSequence;
    CharSequence charSequence2 = charSequence1;
    boolean bool2 = false;
    for (byte b = 0; b < charSequence2.length(); b++) {
      char c = charSequence2.charAt(b);
      paramFunction1.invoke(Character.valueOf(c));
    } 
    return charSequence1;
  }
  
  public static final boolean none(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x64A4CF0EEC7DL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return false; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  @NotNull
  public static final Collection mapIndexedNotNullTo(@NotNull CharSequence paramCharSequence, @NotNull Collection<Object> paramCollection, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 58928194622668
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
    //   38: iconst_0
    //   39: istore #9
    //   41: iload #9
    //   43: aload #6
    //   45: invokeinterface length : ()I
    //   50: if_icmpge -> 128
    //   53: aload #6
    //   55: iload #9
    //   57: invokeinterface charAt : (I)C
    //   62: istore #10
    //   64: iload #8
    //   66: iinc #8, 1
    //   69: iload #10
    //   71: istore #11
    //   73: istore #12
    //   75: iconst_0
    //   76: istore #13
    //   78: aload_2
    //   79: iload #12
    //   81: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   84: iload #11
    //   86: invokestatic valueOf : (C)Ljava/lang/Character;
    //   89: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   94: dup
    //   95: ifnull -> 119
    //   98: astore #14
    //   100: aload #14
    //   102: astore #15
    //   104: iconst_0
    //   105: istore #16
    //   107: aload_1
    //   108: aload #15
    //   110: invokeinterface add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: goto -> 121
    //   119: pop
    //   120: nop
    //   121: nop
    //   122: iinc #9, 1
    //   125: goto -> 41
    //   128: nop
    //   129: aload_1
    //   130: areturn
  }
  
  @NotNull
  public static final CharSequence dropWhile(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0xF37B6D66BD1L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramCharSequence.length();
    while (true) {
      try {
        if (b < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(b)))).booleanValue())
              return paramCharSequence.subSequence(b, paramCharSequence.length()); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return "";
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character reduceOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x3AFCD25817F7L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      c = ((Character)paramFunction2.invoke(Character.valueOf(c), Character.valueOf(paramCharSequence.charAt(i)))).charValue();
    } 
    return Character.valueOf(c);
  }
  
  public static final int indexOfFirst(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x7425D4F850C7L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramCharSequence.length();
    while (true) {
      try {
        if (b < i) {
          try {
            if (((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(b)))).booleanValue())
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
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence chunkedSequence(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0x21CE3352224DL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return StringsKt.chunkedSequence(paramCharSequence, paramInt, StringsKt___StringsKt$chunkedSequence$1.INSTANCE);
  }
  
  @Nullable
  public static final Character lastOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x6B09A7935F9BL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramCharSequence.length() + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        char c = paramCharSequence.charAt(j);
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return Character.valueOf(c); 
      } while (0 <= i); 
    return null;
  }
  
  @Nullable
  public static final Character getOrNull(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0x3FDA64BB2B78L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramInt >= 0)
        try {
          if (paramInt <= StringsKt.getLastIndex(paramCharSequence));
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
  public static final Character minWithOrNull(@NotNull CharSequence paramCharSequence, @NotNull Comparator<Character> paramComparator) {
    long l = l ^ 0x4BD7163DE6C1L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    IntIterator intIterator = (new IntRange(1, StringsKt.getLastIndex(paramCharSequence))).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      char c1 = paramCharSequence.charAt(i);
      if (paramComparator.compare(Character.valueOf(c), Character.valueOf(c1)) > 0)
        c = c1; 
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final CharSequence takeWhile(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x1BAE145BE43FL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramCharSequence.length();
    while (true) {
      try {
        if (b < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(b)))).booleanValue())
              return paramCharSequence.subSequence(0, b); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return paramCharSequence.subSequence(0, paramCharSequence.length());
    } 
  }
  
  @SinceKotlin(version = "1.4")
  @Nullable
  public static final Character maxByOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x3533FF1CCF56L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "selector");
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(0);
    int i = StringsKt.getLastIndex(paramCharSequence);
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
      char c1 = paramCharSequence.charAt(j);
      Comparable<Comparable> comparable1 = (Comparable)paramFunction1.invoke(Character.valueOf(c1));
      if (comparable.compareTo(comparable1) < 0) {
        c = c1;
        comparable = comparable1;
      } 
    } 
    return Character.valueOf(c);
  }
  
  @Nullable
  public static final Character singleOrNull(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0xB02143F7A9L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramCharSequence.length() == 1) ? Character.valueOf(paramCharSequence.charAt(0)) : null;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character reduceRightOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x15387172930CL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    try {
      if (i < 0)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c;
    for (c = paramCharSequence.charAt(i--); i >= 0; c = ((Character)paramFunction2.invoke(Character.valueOf(paramCharSequence.charAt(i--)), Character.valueOf(c))).charValue());
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final CharSequence takeLastWhile(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x3A7D7CE4BFBDL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = StringsKt.getLastIndex(paramCharSequence);
    while (true) {
      try {
        if (-1 < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(i)))).booleanValue())
              return paramCharSequence.subSequence(i + 1, paramCharSequence.length()); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      return paramCharSequence.subSequence(0, paramCharSequence.length());
    } 
  }
  
  @Nullable
  public static final Character lastOrNull(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x4C3A1A57FCA0L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ((paramCharSequence.length() == 0)) ? null : Character.valueOf(paramCharSequence.charAt(paramCharSequence.length() - 1));
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull CharSequence paramCharSequence) {
    long l = l ^ 0x77D4A9503AEAL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramCharSequence instanceof String) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        try {
          if ((paramCharSequence.length() == 0))
            return SequencesKt.emptySequence(); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new StringsKt___StringsKt$asSequence$$inlined$Sequence$1(paramCharSequence);
  }
  
  @Nullable
  public static final Character firstOrNull(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0xA4FA4B91306L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return Character.valueOf(c); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Map associateWith(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x434F42E01F7DL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "valueSelector");
    boolean bool1 = false;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost(paramCharSequence.length(), 128)), 16));
    CharSequence charSequence = paramCharSequence;
    boolean bool2 = false;
    for (byte b = 0; b < charSequence.length(); b++) {
      char c = charSequence.charAt(b);
      linkedHashMap.put(Character.valueOf(c), paramFunction1.invoke(Character.valueOf(c)));
    } 
    return linkedHashMap;
  }
  
  public static final void forEach(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x36519E481888L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      paramFunction1.invoke(Character.valueOf(c));
    } 
  }
  
  public static final char first(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = l ^ 0x4C90A284D20L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      try {
        if (((Boolean)paramFunction1.invoke(Character.valueOf(c))).booleanValue())
          return c; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final List runningReduce(@NotNull CharSequence paramCharSequence, @NotNull Function2 paramFunction2) {
    long l = l ^ 0x635493F4149DL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    boolean bool1 = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if ((paramCharSequence.length() == 0))
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    char c = Character.MIN_VALUE;
    c = paramCharSequence.charAt(0);
    ArrayList<Character> arrayList2 = new ArrayList(paramCharSequence.length());
    ArrayList<Character> arrayList3 = arrayList2;
    boolean bool2 = false;
    arrayList3.add(Character.valueOf(c));
    ArrayList<Character> arrayList1 = arrayList2;
    byte b = 1;
    int i = paramCharSequence.length();
    while (b < i) {
      c = ((Character)paramFunction2.invoke(Character.valueOf(c), Character.valueOf(paramCharSequence.charAt(b)))).charValue();
      arrayList1.add(Character.valueOf(c));
      b++;
    } 
    return arrayList1;
  }
  
  @NotNull
  public static final CharSequence takeLast(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = l ^ 0x22792D56BD8BL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = (paramInt >= 0) ? 1 : 0;
    if (!i) {
      boolean bool = false;
      String str = "Requested character count " + paramInt + " is less than zero.";
      throw new IllegalArgumentException(str.toString());
    } 
    i = paramCharSequence.length();
    return paramCharSequence.subSequence(i - RangesKt.coerceAtMost(paramInt, i), i);
  }
  
  @NotNull
  public static final Collection mapNotNullTo(@NotNull CharSequence paramCharSequence, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt___StringsKt.l : J
    //   3: ldc2_w 10901293758108
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
    //   38: iload #8
    //   40: aload #6
    //   42: invokeinterface length : ()I
    //   47: if_icmpge -> 113
    //   50: aload #6
    //   52: iload #8
    //   54: invokeinterface charAt : (I)C
    //   59: istore #9
    //   61: iload #9
    //   63: istore #10
    //   65: iconst_0
    //   66: istore #11
    //   68: aload_2
    //   69: iload #10
    //   71: invokestatic valueOf : (C)Ljava/lang/Character;
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
    //   107: iinc #8, 1
    //   110: goto -> 38
    //   113: nop
    //   114: aload_1
    //   115: areturn
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */