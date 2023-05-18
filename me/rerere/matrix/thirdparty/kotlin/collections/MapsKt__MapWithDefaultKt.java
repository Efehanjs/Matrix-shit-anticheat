package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class MapsKt__MapWithDefaultKt {
  private static final long a = o3.a(1195820838126630168L, 6495446546598092600L, null).a(215672658392651L);
  
  @NotNull
  public static final Map withDefault(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x68752CB2DC02L;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      Intrinsics.checkNotNullParameter(paramFunction1, "defaultValue");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramMap instanceof MapWithDefault) ? MapsKt.withDefault(((MapWithDefault)paramMap).getMap(), paramFunction1) : new MapWithDefaultImpl(paramMap, paramFunction1);
  }
  
  @PublishedApi
  public static final Object getOrImplicitDefaultNullable(@NotNull Map paramMap, Object paramObject) {
    long l = a ^ 0x76BC6EA8757CL;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      if (paramMap instanceof MapWithDefault)
        return ((MapWithDefault)paramMap).getOrImplicitDefault(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Map map = paramMap;
    boolean bool = false;
    Object object = map.get(paramObject);
    try {
      if (object == null && !map.containsKey(paramObject)) {
        boolean bool1 = false;
        throw new NoSuchElementException("Key " + paramObject + " is missing in the map.");
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  @NotNull
  public static final Map withDefaultMutable(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x2A3AEA5661L;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      Intrinsics.checkNotNullParameter(paramFunction1, "defaultValue");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramMap instanceof MutableMapWithDefault) ? MapsKt.withDefaultMutable(((MutableMapWithDefault)paramMap).getMap(), paramFunction1) : new MutableMapWithDefaultImpl(paramMap, paramFunction1);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MapsKt__MapWithDefaultKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */