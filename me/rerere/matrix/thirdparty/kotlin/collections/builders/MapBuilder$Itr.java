package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class MapBuilder$Itr {
  private int index;
  
  @NotNull
  private final MapBuilder map;
  
  private int lastIndex;
  
  private static final long b = o3.a(7607196207674921240L, 3787334510077279648L, null).a(121546358919916L);
  
  public MapBuilder$Itr(@NotNull MapBuilder paramMapBuilder) {
    this.map = paramMapBuilder;
    this.lastIndex = -1;
    initNext$kotlin_stdlib();
  }
  
  public final void initNext$kotlin_stdlib() {
    while (true) {
      try {
        if (this.index < MapBuilder.access$getLength$p(this.map) && MapBuilder.access$getPresenceArray$p(this.map)[this.index] < 0) {
          int i = this.index;
          this.index = i + 1;
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  public final void remove() {
    long l = b ^ 0x193AD8E33BA6L;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = (this.lastIndex != -1) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Call next() before removing element from the iterator.";
      throw new IllegalStateException(str.toString());
    } 
    this.map.checkIsMutable$kotlin_stdlib();
    MapBuilder.access$removeKeyAt(this.map, this.lastIndex);
    this.lastIndex = -1;
  }
  
  public final boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.index < MapBuilder.access$getLength$p(this.map));
  }
  
  public final int getLastIndex$kotlin_stdlib() {
    return this.lastIndex;
  }
  
  public final void setLastIndex$kotlin_stdlib(int paramInt) {
    this.lastIndex = paramInt;
  }
  
  public final void setIndex$kotlin_stdlib(int paramInt) {
    this.index = paramInt;
  }
  
  public final int getIndex$kotlin_stdlib() {
    return this.index;
  }
  
  @NotNull
  public final MapBuilder getMap$kotlin_stdlib() {
    return this.map;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilder$Itr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */