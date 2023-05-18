package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractMutableSet;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableSet;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MapBuilderKeys extends AbstractMutableSet implements Set, KMutableSet {
  @NotNull
  private final MapBuilder backing;
  
  private static final long a = o3.a(-4642608273482205747L, -8428628378645330581L, null).a(277482632406746L);
  
  public boolean retainAll(@NotNull Collection paramCollection) {
    long l = a ^ 0xF3E8F5D8643L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.retainAll(paramCollection);
  }
  
  @NotNull
  public Iterator iterator() {
    return this.backing.keysIterator$kotlin_stdlib();
  }
  
  public boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public MapBuilderKeys(@NotNull MapBuilder paramMapBuilder) {
    this.backing = paramMapBuilder;
  }
  
  public boolean removeAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x35A57C23B1AL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.removeAll(paramCollection);
  }
  
  public int getSize() {
    return this.backing.size();
  }
  
  public boolean remove(Object paramObject) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.backing.removeKey$kotlin_stdlib(paramObject) >= 0);
  }
  
  public void clear() {
    this.backing.clear();
  }
  
  public boolean contains(Object paramObject) {
    return this.backing.containsKey(paramObject);
  }
  
  public boolean addAll(@NotNull Collection paramCollection) {
    long l = a ^ 0xD61C2EC7321L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    throw new UnsupportedOperationException();
  }
  
  public boolean isEmpty() {
    return this.backing.isEmpty();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilderKeys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */