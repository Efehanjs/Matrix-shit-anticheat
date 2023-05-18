package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MutableMapWithDefaultImpl implements MutableMapWithDefault {
  @NotNull
  private final Map map;
  
  @NotNull
  private final Function1 default;
  
  private static final long a = o3.a(6607518044752284577L, 1083627706280712944L, null).a(60905359288210L);
  
  @NotNull
  public Map getMap() {
    return this.map;
  }
  
  @NotNull
  public Collection getValues() {
    return getMap().values();
  }
  
  @NotNull
  public Set getKeys() {
    return getMap().keySet();
  }
  
  @NotNull
  public String toString() {
    return getMap().toString();
  }
  
  public boolean containsValue(Object paramObject) {
    return getMap().containsValue(paramObject);
  }
  
  @Nullable
  public Object get(Object paramObject) {
    return getMap().get(paramObject);
  }
  
  public void clear() {
    getMap().clear();
  }
  
  public void putAll(@NotNull Map paramMap) {
    long l = a ^ 0x37960B247845L;
    Intrinsics.checkNotNullParameter(paramMap, "from");
    getMap().putAll(paramMap);
  }
  
  public boolean containsKey(Object paramObject) {
    return getMap().containsKey(paramObject);
  }
  
  public int getSize() {
    return getMap().size();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    return getMap().equals(paramObject);
  }
  
  public int hashCode() {
    return getMap().hashCode();
  }
  
  @NotNull
  public Set getEntries() {
    return getMap().entrySet();
  }
  
  @Nullable
  public Object remove(Object paramObject) {
    return getMap().remove(paramObject);
  }
  
  @Nullable
  public Object put(Object paramObject1, Object paramObject2) {
    return getMap().put(paramObject1, paramObject2);
  }
  
  public boolean isEmpty() {
    return getMap().isEmpty();
  }
  
  public MutableMapWithDefaultImpl(@NotNull Map paramMap, @NotNull Function1 paramFunction1) {
    this.map = paramMap;
    this.default = paramFunction1;
  }
  
  public Object getOrImplicitDefault(Object paramObject) {
    Map map = getMap();
    boolean bool = false;
    Object object = map.get(paramObject);
    try {
      boolean bool1 = false;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (object == null && !map.containsKey(paramObject)) ? this.default.invoke(paramObject) : object;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MutableMapWithDefaultImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */