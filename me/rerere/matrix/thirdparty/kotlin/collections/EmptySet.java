package me.rerere.matrix.thirdparty.kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.CollectionToArray;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class EmptySet implements Set, Serializable, KMappedMarker {
  private static final long serialVersionUID = 3406603774387020532L;
  
  @NotNull
  public static final EmptySet INSTANCE;
  
  private static final long a = o3.a(2936322117650543931L, 5190907936828920410L, null).a(261798880794704L);
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x53E86A52BF02L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains(@NotNull Void paramVoid) {
    long l = a ^ 0x37F040510CF5L;
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return false;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0x328F44B18D9FL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public int getSize() {
    return 0;
  }
  
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  public void clear() {
    long l = a ^ 0x221C3B6E5AD9L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x43001CFD142L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean add(Void paramVoid) {
    long l = a ^ 0x2D1EDF5D5E37L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Set)
        try {
          if (((Set)paramObject).isEmpty());
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x301F6E1E89D2L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int hashCode() {
    return 0;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x52E7616C3370L;
    return "[]";
  }
  
  @NotNull
  public Iterator iterator() {
    return EmptyIterator.INSTANCE;
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x7E7A47E38430L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0xC608EE9FC98L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  static {
    INSTANCE = new EmptySet();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\EmptySet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */