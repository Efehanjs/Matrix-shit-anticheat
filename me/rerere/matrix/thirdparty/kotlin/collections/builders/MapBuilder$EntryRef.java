package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableMap;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MapBuilder$EntryRef implements Map.Entry, KMutableMap.Entry {
  @NotNull
  private final MapBuilder map;
  
  private final int index;
  
  private static final long a = o3.a(-1792243034875670324L, 8477986762635774421L, null).a(242629634384577L);
  
  public int hashCode() {
    try {
      getKey();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      getValue();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((getKey() != null) ? getKey().hashCode() : 0) ^ ((getValue() != null) ? getValue().hashCode() : 0);
  }
  
  public Object getKey() {
    return MapBuilder.access$getKeysArray$p(this.map)[this.index];
  }
  
  public MapBuilder$EntryRef(@NotNull MapBuilder paramMapBuilder, int paramInt) {
    this.map = paramMapBuilder;
    this.index = paramInt;
  }
  
  public Object getValue() {
    Intrinsics.checkNotNull(MapBuilder.access$getValuesArray$p(this.map));
    return MapBuilder.access$getValuesArray$p(this.map)[this.index];
  }
  
  @NotNull
  public String toString() {
    return getKey() + '=' + getValue();
  }
  
  public Object setValue(Object paramObject) {
    this.map.checkIsMutable$kotlin_stdlib();
    Object[] arrayOfObject = MapBuilder.access$allocateValuesArray(this.map);
    Object object = arrayOfObject[this.index];
    arrayOfObject[this.index] = paramObject;
    return object;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Map.Entry)
        try {
          if (Intrinsics.areEqual(((Map.Entry)paramObject).getKey(), getKey()))
            try {
              if (Intrinsics.areEqual(((Map.Entry)paramObject).getValue(), getValue()));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilder$EntryRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */