package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SubSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  private int position;
  
  private static final long a = o3.a(2107579526997441598L, -3060172267528188065L, null).a(217590531754230L);
  
  public final void setPosition(int paramInt) {
    this.position = paramInt;
  }
  
  public boolean hasNext() {
    try {
      drop();
      if (this.position < SubSequence.access$getEndIndex$p(SubSequence.this))
        try {
          if (this.iterator.hasNext());
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false;
  }
  
  public final int getPosition() {
    return this.position;
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public void remove() {
    long l = a ^ 0x1D362D0A8D2DL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public SubSequence$iterator$1() {
    this.iterator = SubSequence.access$getSequence$p(paramSubSequence).iterator();
  }
  
  public Object next() {
    try {
      drop();
      if (this.position >= SubSequence.access$getEndIndex$p(SubSequence.this))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = this.position;
    this.position = i + 1;
    return this.iterator.next();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SubSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */