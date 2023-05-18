package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TakeSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  private int left;
  
  private static final long a = o3.a(9153342884598321924L, -4857760411505710391L, null).a(102023649367988L);
  
  public boolean hasNext() {
    try {
      if (this.left > 0)
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
  
  public final int getLeft() {
    return this.left;
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public Object next() {
    try {
      if (this.left == 0)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = this.left;
    this.left = i + -1;
    return this.iterator.next();
  }
  
  public final void setLeft(int paramInt) {
    this.left = paramInt;
  }
  
  public void remove() {
    long l = a ^ 0x4AE5471A15EAL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public TakeSequence$iterator$1(TakeSequence paramTakeSequence) {
    this.left = TakeSequence.access$getCount$p(paramTakeSequence);
    this.iterator = TakeSequence.access$getSequence$p(paramTakeSequence).iterator();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TakeSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */