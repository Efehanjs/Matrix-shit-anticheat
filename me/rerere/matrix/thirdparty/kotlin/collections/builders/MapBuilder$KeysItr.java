package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MapBuilder$KeysItr extends MapBuilder$Itr implements Iterator, KMutableIterator {
  private static final long a = o3.a(8462475350353831272L, -3840499475616849636L, null).a(156794778011410L);
  
  public MapBuilder$KeysItr(@NotNull MapBuilder paramMapBuilder) {
    super(paramMapBuilder);
  }
  
  public Object next() {
    try {
      if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib()))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = getIndex$kotlin_stdlib();
    setIndex$kotlin_stdlib(i + 1);
    setLastIndex$kotlin_stdlib(i);
    Object object = MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
    initNext$kotlin_stdlib();
    return object;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilder$KeysItr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */