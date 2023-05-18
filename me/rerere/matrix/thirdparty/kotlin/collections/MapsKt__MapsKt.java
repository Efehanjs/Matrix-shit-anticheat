package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.BuilderInference;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.TypeIntrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
  private static final long c = o3.a(2275488451483798826L, 2323034771148579733L, null).a(172510557337425L);
  
  @NotNull
  public static final Map mapOf(@NotNull Pair... paramVarArgs) {
    long l = c ^ 0x45B9DE93E70EL;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (paramVarArgs.length > 0) ? MapsKt.toMap(paramVarArgs, new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(paramVarArgs.length))) : MapsKt.emptyMap();
  }
  
  public static final void putAll(@NotNull Map<Object, Object> paramMap, @NotNull Sequence paramSequence) {
    long l = c ^ 0x2E09E1A8B2DAL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "pairs");
    for (Pair pair : paramSequence) {
      Object object1 = pair.component1();
      Object object2 = pair.component2();
      paramMap.put(object1, object2);
    } 
  }
  
  @NotNull
  public static final Map toMap(@NotNull Sequence paramSequence) {
    long l = c ^ 0x18343DB5AC62L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(paramSequence, new LinkedHashMap<Object, Object>()));
  }
  
  @NotNull
  public static final Map mapKeys(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x1A78C887919DL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Map map = paramMap;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(paramMap.size()));
    boolean bool2 = false;
    Set set = map.entrySet();
    boolean bool3 = false;
    for (Map.Entry entry1 : set) {
      Map.Entry entry2 = entry1;
      Object object1 = paramFunction1.invoke(entry1);
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool = false;
      Object object2 = entry2.getValue();
      linkedHashMap1.put(object1, object2);
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map toMutableMap(@NotNull Map<?, ?> paramMap) {
    long l = c ^ 0x301C2F0B4830L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    return new LinkedHashMap<Object, Object>(paramMap);
  }
  
  @NotNull
  public static final Map plus(@NotNull Map<?, ?> paramMap, @NotNull Pair[] paramArrayOfPair) {
    long l = c ^ 0x4A744902AC7DL;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfPair, "pairs");
      LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>(paramMap);
      LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
      boolean bool = false;
      MapsKt.putAll(linkedHashMap2, paramArrayOfPair);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return paramMap.isEmpty() ? MapsKt.toMap(paramArrayOfPair) : linkedHashMap1;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map minus(@NotNull Map paramMap, @NotNull Object[] paramArrayOfObject) {
    long l = c ^ 0x75E7DA3FC931L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "keys");
    Map map1 = MapsKt.toMutableMap(paramMap);
    Map map2 = map1;
    boolean bool = false;
    CollectionsKt.removeAll(map2.keySet(), paramArrayOfObject);
    return MapsKt.optimizeReadOnlyMap(map1);
  }
  
  @NotNull
  public static final HashMap hashMapOf(@NotNull Pair... paramVarArgs) {
    long l = c ^ 0x57ABE381514AL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(MapsKt.mapCapacity(paramVarArgs.length));
    HashMap<Object, Object> hashMap2 = hashMap1;
    boolean bool = false;
    MapsKt.putAll(hashMap2, paramVarArgs);
    return hashMap1;
  }
  
  @NotNull
  public static final Map filterNot(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x8B7692059CL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Map map = paramMap;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Map.Entry entry : map.entrySet()) {
      if (!((Boolean)paramFunction1.invoke(entry)).booleanValue())
        linkedHashMap.put(entry.getKey(), entry.getValue()); 
    } 
    return linkedHashMap;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map toMap(@NotNull Map paramMap) {
    long l = c ^ 0x2B735F9A6DFCL;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      switch (paramMap.size()) {
        case 0:
        
        case 1:
        
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return MapsKt.toMutableMap(paramMap);
  }
  
  @NotNull
  public static final Map filterNotTo(@NotNull Map paramMap1, @NotNull Map paramMap2, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x78E768C068B4L;
    Intrinsics.checkNotNullParameter(paramMap1, "<this>");
    Intrinsics.checkNotNullParameter(paramMap2, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Map.Entry entry : paramMap1.entrySet()) {
      if (!((Boolean)paramFunction1.invoke(entry)).booleanValue())
        paramMap2.put(entry.getKey(), entry.getValue()); 
    } 
    return paramMap2;
  }
  
  @NotNull
  public static final LinkedHashMap linkedMapOf(@NotNull Pair... paramVarArgs) {
    long l = c ^ 0x2ADD3271EF3DL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    return (LinkedHashMap)MapsKt.toMap(paramVarArgs, new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(paramVarArgs.length)));
  }
  
  @NotNull
  public static final Map plus(@NotNull Map<?, ?> paramMap1, @NotNull Map<?, ?> paramMap2) {
    long l = c ^ 0x3F644B27E91DL;
    Intrinsics.checkNotNullParameter(paramMap1, "<this>");
    Intrinsics.checkNotNullParameter(paramMap2, "map");
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>(paramMap1);
    LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
    boolean bool = false;
    linkedHashMap2.putAll(paramMap2);
    return linkedHashMap1;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map minus(@NotNull Map paramMap, @NotNull Sequence paramSequence) {
    long l = c ^ 0x56F3B853A94DL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "keys");
    Map map1 = MapsKt.toMutableMap(paramMap);
    Map map2 = map1;
    boolean bool = false;
    CollectionsKt.removeAll(map2.keySet(), paramSequence);
    return MapsKt.optimizeReadOnlyMap(map1);
  }
  
  @NotNull
  public static final Map toMap(@NotNull Pair[] paramArrayOfPair) {
    long l = c ^ 0x49CB6021ABDCL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfPair, "<this>");
      switch (paramArrayOfPair.length) {
        case 0:
        
        case 1:
        
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return MapsKt.toMap(paramArrayOfPair, new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(paramArrayOfPair.length)));
  }
  
  @NotNull
  public static final Map toMap(@NotNull Pair[] paramArrayOfPair, @NotNull Map paramMap) {
    long l = c ^ 0x73D683C370BFL;
    Intrinsics.checkNotNullParameter(paramArrayOfPair, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Map map1 = paramMap;
    Map map2 = map1;
    boolean bool = false;
    MapsKt.putAll(map2, paramArrayOfPair);
    return map1;
  }
  
  public static final Object getOrPut(@NotNull Map<Object, Object> paramMap, Object paramObject, @NotNull Function0 paramFunction0) {
    long l = c ^ 0x36125C3219AL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "defaultValue");
    boolean bool = false;
    Object object1 = paramMap.get(paramObject);
    Object object2 = paramFunction0.invoke();
    paramMap.put(paramObject, object2);
    return (object1 == null) ? object2 : object1;
  }
  
  @NotNull
  public static final Map emptyMap() {
    long l = c ^ 0x11A177C52AD2L;
    Intrinsics.checkNotNull(EmptyMap.INSTANCE, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
    return EmptyMap.INSTANCE;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map minus(@NotNull Map paramMap, Object paramObject) {
    long l = c ^ 0x321F79B8526EL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Map map1 = MapsKt.toMutableMap(paramMap);
    Map map2 = map1;
    boolean bool = false;
    map2.remove(paramObject);
    return MapsKt.optimizeReadOnlyMap(map1);
  }
  
  @NotNull
  public static final Map optimizeReadOnlyMap(@NotNull Map paramMap) {
    long l = c ^ 0x1D235A0EA578L;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      switch (paramMap.size()) {
        case 0:
        
        case 1:
        
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return paramMap;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map minus(@NotNull Map paramMap, @NotNull Iterable paramIterable) {
    long l = c ^ 0x30FF3A3923BDL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "keys");
    Map map1 = MapsKt.toMutableMap(paramMap);
    Map map2 = map1;
    boolean bool = false;
    CollectionsKt.removeAll(map2.keySet(), paramIterable);
    return MapsKt.optimizeReadOnlyMap(map1);
  }
  
  @NotNull
  public static final Map toMap(@NotNull Sequence paramSequence, @NotNull Map paramMap) {
    long l = c ^ 0x5E9246565123L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Map map1 = paramMap;
    Map map2 = map1;
    boolean bool = false;
    MapsKt.putAll(map2, paramSequence);
    return map1;
  }
  
  @NotNull
  public static final Map mapValues(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x670B3FD559A1L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Map map = paramMap;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(paramMap.size()));
    boolean bool2 = false;
    Set set = map.entrySet();
    boolean bool3 = false;
    for (Map.Entry entry1 : set) {
      Map.Entry entry2 = entry1;
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool = false;
      linkedHashMap1.put(entry2.getKey(), paramFunction1.invoke(entry1));
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Map filter(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x8BB5FB6CFFFL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    Map map = paramMap;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    boolean bool2 = false;
    for (Map.Entry entry : map.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry)).booleanValue())
        linkedHashMap.put(entry.getKey(), entry.getValue()); 
    } 
    return linkedHashMap;
  }
  
  public static final void putAll(@NotNull Map<Object, Object> paramMap, @NotNull Pair[] paramArrayOfPair) {
    long l = c ^ 0x561859E647B3L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfPair, "pairs");
    byte b = 0;
    int i = paramArrayOfPair.length;
    while (b < i) {
      Pair pair = paramArrayOfPair[b];
      Object object1 = pair.component1();
      Object object2 = pair.component2();
      paramMap.put(object1, object2);
      b++;
    } 
  }
  
  @NotNull
  public static final Map mapKeysTo(@NotNull Map paramMap1, @NotNull Map<Object, Object> paramMap2, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x1240CA8495A1L;
    Intrinsics.checkNotNullParameter(paramMap1, "<this>");
    Intrinsics.checkNotNullParameter(paramMap2, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Set set = paramMap1.entrySet();
    boolean bool2 = false;
    for (Map.Entry entry1 : set) {
      Map.Entry entry2 = entry1;
      Object object1 = paramFunction1.invoke(entry1);
      Map<Object, Object> map = paramMap2;
      boolean bool = false;
      Object object2 = entry2.getValue();
      map.put(object1, object2);
    } 
    return paramMap2;
  }
  
  public static final void putAll(@NotNull Map<Object, Object> paramMap, @NotNull Iterable paramIterable) {
    long l = c ^ 0x2C41C54FA0B1L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "pairs");
    for (Pair pair : paramIterable) {
      Object object1 = pair.component1();
      Object object2 = pair.component2();
      paramMap.put(object1, object2);
    } 
  }
  
  @NotNull
  public static final Map filterValues(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x430C52C3A071L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry.getValue())).booleanValue())
        linkedHashMap.put(entry.getKey(), entry.getValue()); 
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Map filterTo(@NotNull Map paramMap1, @NotNull Map paramMap2, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x19CEB8A60656L;
    Intrinsics.checkNotNullParameter(paramMap1, "<this>");
    Intrinsics.checkNotNullParameter(paramMap2, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    for (Map.Entry entry : paramMap1.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry)).booleanValue())
        paramMap2.put(entry.getKey(), entry.getValue()); 
    } 
    return paramMap2;
  }
  
  public static final Object getOrElseNullable(@NotNull Map paramMap, Object paramObject, @NotNull Function0 paramFunction0) {
    long l = c ^ 0x4012F767279AL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "defaultValue");
    boolean bool = false;
    Object object = paramMap.get(paramObject);
    try {
      if (object == null)
        try {
          if (!paramMap.containsKey(paramObject))
            return paramFunction0.invoke(); 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return object;
  }
  
  @NotNull
  public static final Map plus(@NotNull Map<?, ?> paramMap, @NotNull Iterable paramIterable) {
    long l = c ^ 0x59B22220426EL;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      Intrinsics.checkNotNullParameter(paramIterable, "pairs");
      LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>(paramMap);
      LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
      boolean bool = false;
      MapsKt.putAll(linkedHashMap2, paramIterable);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return paramMap.isEmpty() ? MapsKt.toMap(paramIterable) : linkedHashMap1;
  }
  
  @NotNull
  public static final Map mapValuesTo(@NotNull Map paramMap1, @NotNull Map paramMap2, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x6C51AD07DD28L;
    Intrinsics.checkNotNullParameter(paramMap1, "<this>");
    Intrinsics.checkNotNullParameter(paramMap2, "destination");
    Intrinsics.checkNotNullParameter(paramFunction1, "transform");
    boolean bool1 = false;
    Set set = paramMap1.entrySet();
    boolean bool2 = false;
    for (Map.Entry entry1 : set) {
      Map.Entry entry2 = entry1;
      Map map = paramMap2;
      boolean bool = false;
      map.put(entry2.getKey(), paramFunction1.invoke(entry1));
    } 
    return paramMap2;
  }
  
  @NotNull
  public static final Map toMap(@NotNull Iterable paramIterable, @NotNull Map paramMap) {
    long l = c ^ 0x3F38EE09392FL;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    Map map1 = paramMap;
    Map map2 = map1;
    boolean bool = false;
    MapsKt.putAll(map2, paramIterable);
    return map1;
  }
  
  @NotNull
  public static final Map mutableMapOf(@NotNull Pair... paramVarArgs) {
    long l = c ^ 0x3BB047B3EF62L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(paramVarArgs.length));
    LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
    boolean bool = false;
    MapsKt.putAll(linkedHashMap2, paramVarArgs);
    return linkedHashMap1;
  }
  
  @NotNull
  public static final Map plus(@NotNull Map<?, ?> paramMap, @NotNull Pair paramPair) {
    long l = c ^ 0x7FD8F120BFA2L;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      Intrinsics.checkNotNullParameter(paramPair, "pair");
      LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>(paramMap);
      LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
      boolean bool = false;
      linkedHashMap2.put(paramPair.getFirst(), paramPair.getSecond());
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return paramMap.isEmpty() ? MapsKt.mapOf(paramPair) : linkedHashMap1;
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map toMap(@NotNull Map paramMap1, @NotNull Map paramMap2) {
    long l = c ^ 0x1676452CA5B2L;
    Intrinsics.checkNotNullParameter(paramMap1, "<this>");
    Intrinsics.checkNotNullParameter(paramMap2, "destination");
    Map map1 = paramMap2;
    Map map2 = map1;
    boolean bool = false;
    map2.putAll(paramMap1);
    return map1;
  }
  
  @SinceKotlin(version = "1.1")
  public static final Object getValue(@NotNull Map paramMap, Object paramObject) {
    long l = c ^ 0x434F20A6ECC4L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    return MapsKt.getOrImplicitDefaultNullable(paramMap, paramObject);
  }
  
  @NotNull
  public static final Map filterKeys(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x3F39C6F38BBAL;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((Boolean)paramFunction1.invoke(entry.getKey())).booleanValue())
        linkedHashMap.put(entry.getKey(), entry.getValue()); 
    } 
    return linkedHashMap;
  }
  
  @NotNull
  public static final Map plus(@NotNull Map<?, ?> paramMap, @NotNull Sequence paramSequence) {
    long l = c ^ 0x50F537768BD9L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramSequence, "pairs");
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>(paramMap);
    LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
    boolean bool = false;
    MapsKt.putAll(linkedHashMap2, paramSequence);
    return MapsKt.optimizeReadOnlyMap(linkedHashMap1);
  }
  
  @NotNull
  public static final Map toMap(@NotNull Iterable paramIterable) {
    long l = c ^ 0x1D6EBE36B2L;
    try {
      Intrinsics.checkNotNullParameter(paramIterable, "<this>");
      if (paramIterable instanceof Collection) {
        try {
          switch (((Collection)paramIterable).size()) {
            case 0:
            
            case 1:
              try {
              
              } catch (RuntimeException runtimeException) {
                throw b(null);
              } 
          } 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
        return MapsKt.toMap(paramIterable, new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(((Collection)paramIterable).size())));
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(paramIterable, new LinkedHashMap<Object, Object>()));
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MapsKt__MapsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */