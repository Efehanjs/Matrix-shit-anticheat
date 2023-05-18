package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;

public class AbstractList$IteratorImpl implements Iterator, KMappedMarker {
  private int index;
  
  private static final long a = o3.a(-2039322406808477881L, 1117071601193335976L, null).a(153119119653615L);
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.index < AbstractList.this.size());
  }
  
  public final int getIndex() {
    return this.index;
  }
  
  public void remove() {
    long l = a ^ 0x58029F976CC8L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object next() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = this.index;
    this.index = i + 1;
    return AbstractList.this.get(i);
  }
  
  public final void setIndex(int paramInt) {
    this.index = paramInt;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractList$IteratorImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */