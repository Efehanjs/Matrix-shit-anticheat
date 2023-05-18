package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;

public class AbstractList$ListIteratorImpl extends AbstractList$IteratorImpl implements ListIterator, KMappedMarker {
  private static final long b = o3.a(-1881213976521632847L, -5933577206203510016L, null).a(219966617918676L);
  
  public boolean hasPrevious() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    return (getIndex() > 0);
  }
  
  public int nextIndex() {
    return getIndex();
  }
  
  public AbstractList$ListIteratorImpl(int paramInt) {
    super(paramAbstractList);
    AbstractList.Companion.checkPositionIndex$kotlin_stdlib(paramInt, AbstractList.this.size());
    setIndex(paramInt);
  }
  
  public Object previous() {
    try {
      if (!hasPrevious())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw b(null);
    } 
    setIndex(getIndex() + -1);
    return AbstractList.this.get(getIndex());
  }
  
  public void set(Object paramObject) {
    long l = b ^ 0x2C44B7C8FEAFL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void add(Object paramObject) {
    long l = b ^ 0x20236FC0E335L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int previousIndex() {
    return getIndex() - 1;
  }
  
  private static NoSuchElementException b(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractList$ListIteratorImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */