package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractMutableSet;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableSet;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SetBuilder extends AbstractMutableSet implements Set, Serializable, KMutableSet {
  @NotNull
  private final MapBuilder backing;
  
  private static final long a = o3.a(5558004298704186255L, -359682408626771906L, null).a(39360978542422L);
  
  public void clear() {
    this.backing.clear();
  }
  
  public int getSize() {
    return this.backing.size();
  }
  
  public SetBuilder(@NotNull MapBuilder paramMapBuilder) {
    this.backing = paramMapBuilder;
  }
  
  public SetBuilder(int paramInt) {
    this(new MapBuilder(paramInt));
  }
  
  public boolean remove(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.backing.removeKey$kotlin_stdlib(paramObject) >= 0);
  }
  
  public SetBuilder() {
    this(new MapBuilder());
  }
  
  public boolean contains(Object paramObject) {
    return this.backing.containsKey(paramObject);
  }
  
  public boolean retainAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x2CE677042E92L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.retainAll(paramCollection);
  }
  
  @NotNull
  public Iterator iterator() {
    return this.backing.keysIterator$kotlin_stdlib();
  }
  
  public boolean removeAll(@NotNull Collection paramCollection) {
    long l = a ^ 0xA0B1A22B216L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.removeAll(paramCollection);
  }
  
  public boolean add(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.backing.addKey$kotlin_stdlib(paramObject) >= 0);
  }
  
  public boolean addAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x53AA07AAFD38L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.addAll(paramCollection);
  }
  
  @NotNull
  public final Set build() {
    this.backing.build();
    return this;
  }
  
  public boolean isEmpty() {
    return this.backing.isEmpty();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\SetBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */