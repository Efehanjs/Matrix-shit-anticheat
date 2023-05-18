package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MapWithDefaultImpl implements MapWithDefault {
  @NotNull
  private final Function1 default;
  
  @NotNull
  private final Map map;
  
  private static final long a = o3.a(5124667300352835133L, -5358521848795324165L, null).a(31154274133583L);
  
  public MapWithDefaultImpl(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    this.map = paramMap;
    this.default = paramFunction1;
  }
  
  public boolean isEmpty() {
    return getMap().isEmpty();
  }
  
  @NotNull
  public String toString() {
    return getMap().toString();
  }
  
  @NotNull
  public Map getMap() {
    return this.map;
  }
  
  @NotNull
  public Collection getValues() {
    return getMap().values();
  }
  
  public void clear() {
    long l = a ^ 0x63E0237C48B2L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean containsValue(Object paramObject) {
    return getMap().containsValue(paramObject);
  }
  
  @Nullable
  public Object get(Object paramObject) {
    return getMap().get(paramObject);
  }
  
  public Object put(Object paramObject1, Object paramObject2) {
    long l = a ^ 0x68B6D0D022F6L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Set getEntries() {
    return getMap().entrySet();
  }
  
  public int getSize() {
    return getMap().size();
  }
  
  public void putAll(Map paramMap) {
    long l = a ^ 0x6A7FA9D2EC2BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object remove(Object paramObject) {
    long l = a ^ 0x3337A2230A7BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Set getKeys() {
    return getMap().keySet();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    return getMap().equals(paramObject);
  }
  
  public Object getOrImplicitDefault(Object paramObject) {
    Map map = getMap();
    boolean bool = false;
    Object object = map.get(paramObject);
    try {
      boolean bool1 = false;
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (object == null && !map.containsKey(paramObject)) ? this.default.invoke(paramObject) : object;
  }
  
  public int hashCode() {
    return getMap().hashCode();
  }
  
  public boolean containsKey(Object paramObject) {
    return getMap().containsKey(paramObject);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MapWithDefaultImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */