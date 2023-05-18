package me.rerere.matrix.thirdparty.kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class EmptyMap implements Map, Serializable, KMappedMarker {
  @NotNull
  public static final EmptyMap INSTANCE;
  
  private static final long serialVersionUID = 8246714829545688274L;
  
  private static final long a = o3.a(161484790431808251L, -2547099866335343256L, null).a(67350909260765L);
  
  static {
    INSTANCE = new EmptyMap();
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  public void clear() {
    long l = a ^ 0x7CF81D84DDCAL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Set getKeys() {
    return EmptySet.INSTANCE;
  }
  
  public Void remove(Object paramObject) {
    long l = a ^ 0x3AC17CA72227L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Map)
        try {
          if (((Map)paramObject).isEmpty());
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public int getSize() {
    return 0;
  }
  
  public boolean containsKey(@Nullable Object paramObject) {
    return false;
  }
  
  @Nullable
  public Void get(@Nullable Object paramObject) {
    return null;
  }
  
  public Void put(Object paramObject, Void paramVoid) {
    long l = a ^ 0x565D0A92B508L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void putAll(Map paramMap) {
    long l = a ^ 0x221C96C17797L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Set getEntries() {
    return EmptySet.INSTANCE;
  }
  
  @NotNull
  public Collection getValues() {
    return EmptyList.INSTANCE;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x32D71E202CE3L;
    return "{}";
  }
  
  public boolean containsValue(@NotNull Void paramVoid) {
    long l = a ^ 0x652AC8C995L;
    Intrinsics.checkNotNullParameter(paramVoid, "value");
    return false;
  }
  
  public int hashCode() {
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\EmptyMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */