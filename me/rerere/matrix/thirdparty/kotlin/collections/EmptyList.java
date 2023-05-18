package me.rerere.matrix.thirdparty.kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.CollectionToArray;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class EmptyList implements List, Serializable, RandomAccess, KMappedMarker {
  private static final long serialVersionUID = -7390468764508069838L;
  
  @NotNull
  public static final EmptyList INSTANCE;
  
  private static final long a = o3.a(-4531799090648457302L, 8074047537434345124L, null).a(149857706862259L);
  
  public int getSize() {
    return 0;
  }
  
  @NotNull
  public Iterator iterator() {
    return EmptyIterator.INSTANCE;
  }
  
  public void clear() {
    long l = a ^ 0x57FF2D01865BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof List)
        try {
          if (((List)paramObject).isEmpty());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x3255939B81AFL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x2213BE72F7E7L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void add(int paramInt, Void paramVoid) {
    long l = a ^ 0x480EC0045DCDL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Void set(int paramInt, Void paramVoid) {
    long l = a ^ 0x3BF7C440B9A1L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0x5BE39AEFFB34L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public int hashCode() {
    return 1;
  }
  
  @NotNull
  public ListIterator listIterator(int paramInt) {
    long l = a ^ 0x27D91B519573L;
    try {
      if (paramInt != 0)
        throw new IndexOutOfBoundsException("Index: " + paramInt); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return EmptyIterator.INSTANCE;
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x36C4BFFA5073L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public int indexOf(@NotNull Void paramVoid) {
    long l = a ^ 0x2156CB6AB0F1L;
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return -1;
  }
  
  @NotNull
  public ListIterator listIterator() {
    return EmptyIterator.INSTANCE;
  }
  
  public boolean contains(@NotNull Void paramVoid) {
    long l = a ^ 0x6BA26B86BE18L;
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return false;
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x5F5556F76B2CL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public List subList(int paramInt1, int paramInt2) {
    long l = a ^ 0x19E5F02A92BBL;
    try {
      if (paramInt1 == 0)
        try {
          if (paramInt2 == 0)
            return this; 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException("fromIndex: " + paramInt1 + ", toIndex: " + paramInt2);
  }
  
  public boolean add(Void paramVoid) {
    long l = a ^ 0x5529EED76B93L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  static {
    INSTANCE = new EmptyList();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x3A96622C6FA9L;
    return "[]";
  }
  
  public boolean addAll(int paramInt, Collection paramCollection) {
    long l = a ^ 0x72AEE2AB2099L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x2E98B3E5BD26L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Void get(int paramInt) {
    long l = a ^ 0xD95F2E4F04AL;
    throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + paramInt + '.');
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  public int lastIndexOf(@NotNull Void paramVoid) {
    long l = a ^ 0x363FA68DC80FL;
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return -1;
  }
  
  public Void remove(int paramInt) {
    long l = a ^ 0x12F87F884BEL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\EmptyList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */