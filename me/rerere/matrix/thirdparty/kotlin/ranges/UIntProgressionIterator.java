package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.3")
public final class UIntProgressionIterator implements Iterator, KMappedMarker {
  private final int step;
  
  private boolean hasNext;
  
  private int next;
  
  private final int finalElement;
  
  private static final long a = o3.a(-8859533984371147945L, -1460778273059335641L, null).a(159807222263337L);
  
  public void remove() {
    long l = a ^ 0x78031C6B289CL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean hasNext() {
    return this.hasNext;
  }
  
  public int next-pVg5ArA() {
    int i = this.next;
    try {
      if (i == this.finalElement) {
        try {
          if (!this.hasNext)
            throw new NoSuchElementException(); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        this.hasNext = false;
      } else {
        this.next = UInt.constructor-impl(this.next + this.step);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return i;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\UIntProgressionIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */