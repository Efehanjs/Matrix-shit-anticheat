package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayIterator implements Iterator, KMappedMarker {
  @NotNull
  private final Object[] array;
  
  private int index;
  
  private static final long a = o3.a(-2287914553243267797L, 3425613960674774755L, null).a(151462297346880L);
  
  public Object next() {
    Object object;
    try {
      int i = this.index;
      this.index = i + 1;
      object = this.array[i];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      this.index--;
      throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
    } 
    return object;
  }
  
  public ArrayIterator(@NotNull Object[] paramArrayOfObject) {
    this.array = paramArrayOfObject;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  @NotNull
  public final Object[] getArray() {
    return this.array;
  }
  
  public void remove() {
    long l = a ^ 0x1A5E806DC43BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */