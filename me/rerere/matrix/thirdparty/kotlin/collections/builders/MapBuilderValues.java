package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractMutableCollection;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableCollection;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MapBuilderValues extends AbstractMutableCollection implements Collection, KMutableCollection {
  @NotNull
  private final MapBuilder backing;
  
  private static final long a = o3.a(4109085062519799928L, 7574070095401735424L, null).a(146079801330941L);
  
  public boolean remove(Object paramObject) {
    return this.backing.removeValue$kotlin_stdlib(paramObject);
  }
  
  public boolean addAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x299D158E7320L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    throw new UnsupportedOperationException();
  }
  
  public boolean isEmpty() {
    return this.backing.isEmpty();
  }
  
  @NotNull
  public Iterator iterator() {
    return this.backing.valuesIterator$kotlin_stdlib();
  }
  
  public boolean removeAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x8D2D451EB2EL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.removeAll(paramCollection);
  }
  
  public int getSize() {
    return this.backing.size();
  }
  
  public void clear() {
    this.backing.clear();
  }
  
  public boolean contains(Object paramObject) {
    return this.backing.containsValue(paramObject);
  }
  
  @NotNull
  public final MapBuilder getBacking() {
    return this.backing;
  }
  
  public MapBuilderValues(@NotNull MapBuilder paramMapBuilder) {
    this.backing = paramMapBuilder;
  }
  
  public boolean retainAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x42AA451F30BBL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.retainAll(paramCollection);
  }
  
  public boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilderValues.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */