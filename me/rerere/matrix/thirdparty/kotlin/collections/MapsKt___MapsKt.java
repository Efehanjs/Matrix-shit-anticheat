package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.HidesMembers;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class MapsKt___MapsKt extends MapsKt___MapsJvmKt {
  private static final long e = o3.a(6713952358015024295L, -7528040974462760161L, null).a(189700550885704L);
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Map onEachIndexed(@NotNull Map paramMap, @NotNull Function2 paramFunction2) {
    long l = e ^ 0xD9B52053E84L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool1 = false;
    Map map1 = paramMap;
    Map map2 = map1;
    boolean bool2 = false;
    Set set = map2.entrySet();
    boolean bool3 = false;
    byte b = 0;
    for (Object object : set) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (NoSuchElementException noSuchElementException) {
        throw b(null);
      } 
      paramFunction2.invoke(Integer.valueOf(b1), object);
    } 
    return map1;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map onEach(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0xCA1299F9BF5L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool1 = false;
    Map map1 = paramMap;
    Map map2 = map1;
    boolean bool2 = false;
    for (Map.Entry entry : map2.entrySet())
      paramFunction1.invoke(entry); 
    return map1;
  }
  
  @NotNull
  public static final Collection mapNotNullTo(@NotNull Map paramMap, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/MapsKt___MapsKt.e : J
    //   3: ldc2_w 52443161643161
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
    //   37: invokeinterface entrySet : ()Ljava/util/Set;
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #8
    //   49: aload #8
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 117
    //   59: aload #8
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast java/util/Map$Entry
    //   69: astore #9
    //   71: aload #9
    //   73: astore #10
    //   75: iconst_0
    //   76: istore #11
    //   78: aload_2
    //   79: aload #10
    //   81: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: dup
    //   87: ifnull -> 111
    //   90: astore #12
    //   92: aload #12
    //   94: astore #13
    //   96: iconst_0
    //   97: istore #14
    //   99: aload_1
    //   100: aload #13
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: goto -> 113
    //   111: pop
    //   112: nop
    //   113: nop
    //   114: goto -> 49
    //   117: nop
    //   118: aload_1
    //   119: areturn
  }
  
  @NotNull
  public static final Collection flatMapTo(@NotNull Map paramMap, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x620782C7C6CCL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Map.Entry entry : paramMap.entrySet()) {
      Iterable iterable = (Iterable)paramFunction1.invoke(entry);
      CollectionsKt.addAll(paramCollection, iterable);
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List map(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x7C3F1D3C1740L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Map map = paramMap;
    ArrayList<Object> arrayList = new ArrayList(paramMap.size());
    boolean bool2 = false;
    for (Map.Entry entry : map.entrySet())
      arrayList.add(paramFunction1.invoke(entry)); 
    return arrayList;
  }
  
  @HidesMembers
  public static final void forEach(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x2BCEE83B36E1L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    boolean bool = false;
    for (Map.Entry entry : paramMap.entrySet())
      paramFunction1.invoke(entry); 
  }
  
  @NotNull
  public static final List flatMap(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x54D6AA63A6B3L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Map map = paramMap;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Map.Entry entry : map.entrySet()) {
      Iterable iterable = (Iterable)paramFunction1.invoke(entry);
      CollectionsKt.addAll(arrayList, iterable);
    } 
    return arrayList;
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull Map paramMap) {
    long l = e ^ 0x43729E4C201L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    return CollectionsKt.asSequence(paramMap.entrySet());
  }
  
  public static final boolean any(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x7BDB9D0EB664L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramMap.isEmpty())
        return false; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry)).booleanValue())
        return true; 
    } 
    return false;
  }
  
  public static final boolean any(@NotNull Map paramMap) {
    long l = e ^ 0x2089F05EA7B2L;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return !paramMap.isEmpty();
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final List flatMapSequence(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x1559271E4143L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Map map = paramMap;
    ArrayList arrayList = new ArrayList();
    boolean bool2 = false;
    for (Map.Entry entry : map.entrySet()) {
      Sequence sequence = (Sequence)paramFunction1.invoke(entry);
      CollectionsKt.addAll(arrayList, sequence);
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.4")
  @OverloadResolutionByLambdaReturnType
  @NotNull
  public static final Collection flatMapSequenceTo(@NotNull Map paramMap, @NotNull Collection paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x3555C0659DCDL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Map.Entry entry : paramMap.entrySet()) {
      Sequence sequence = (Sequence)paramFunction1.invoke(entry);
      CollectionsKt.addAll(paramCollection, sequence);
    } 
    return paramCollection;
  }
  
  @NotNull
  public static final List mapNotNull(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/MapsKt___MapsKt.e : J
    //   3: ldc2_w 106995138964380
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
    //   50: invokeinterface entrySet : ()Ljava/util/Set;
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #10
    //   62: aload #10
    //   64: invokeinterface hasNext : ()Z
    //   69: ifeq -> 131
    //   72: aload #10
    //   74: invokeinterface next : ()Ljava/lang/Object;
    //   79: checkcast java/util/Map$Entry
    //   82: astore #11
    //   84: aload #11
    //   86: astore #12
    //   88: iconst_0
    //   89: istore #13
    //   91: aload_1
    //   92: aload #12
    //   94: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   99: dup
    //   100: ifnull -> 125
    //   103: astore #14
    //   105: aload #14
    //   107: astore #15
    //   109: iconst_0
    //   110: istore #16
    //   112: aload #6
    //   114: aload #15
    //   116: invokeinterface add : (Ljava/lang/Object;)Z
    //   121: pop
    //   122: goto -> 127
    //   125: pop
    //   126: nop
    //   127: nop
    //   128: goto -> 62
    //   131: nop
    //   132: aload #6
    //   134: checkcast java/util/List
    //   137: areturn
  }
  
  @NotNull
  public static final Collection mapTo(@NotNull Map paramMap, @NotNull Collection<Object> paramCollection, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x2D508563CBADL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool = false;
    for (Map.Entry entry : paramMap.entrySet())
      paramCollection.add(paramFunction1.invoke(entry)); 
    return paramCollection;
  }
  
  @NotNull
  public static final List toList(@NotNull Map paramMap) {
    long l = e ^ 0x36B6BB55D318L;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      if (paramMap.size() == 0)
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Iterator<Map.Entry> iterator = paramMap.entrySet().iterator();
    try {
      if (!iterator.hasNext())
        return CollectionsKt.emptyList(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    Map.Entry entry1 = iterator.next();
    if (!iterator.hasNext()) {
      Map.Entry entry = entry1;
      return CollectionsKt.listOf(new Pair(entry.getKey(), entry.getValue()));
    } 
    ArrayList<Pair> arrayList = new ArrayList(paramMap.size());
    Map.Entry entry2 = entry1;
    arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
    while (true) {
      entry2 = iterator.next();
      arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
      if (!iterator.hasNext())
        return arrayList; 
    } 
  }
  
  public static final boolean all(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x60FCC23296FEL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramMap.isEmpty())
        return true; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    for (Map.Entry entry : paramMap.entrySet()) {
      if (!((Boolean)paramFunction1.invoke(entry)).booleanValue())
        return false; 
    } 
    return true;
  }
  
  public static final boolean none(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x24AC3F028D1BL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramMap.isEmpty())
        return true; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry)).booleanValue())
        return false; 
    } 
    return true;
  }
  
  public static final int count(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = e ^ 0x595FFEF247F5L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    try {
      if (paramMap.isEmpty())
        return 0; 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    byte b = 0;
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry)).booleanValue())
        b++; 
    } 
    return b;
  }
  
  public static final boolean none(@NotNull Map paramMap) {
    long l = e ^ 0x3AA83B3D7F64L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    return paramMap.isEmpty();
  }
  
  private static NoSuchElementException b(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MapsKt___MapsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */