package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.3")
public final class ULongProgressionIterator implements Iterator, KMappedMarker {
  private final long finalElement;
  
  private long next;
  
  private final long step;
  
  private boolean hasNext;
  
  private static final long a = o3.a(6898707988036274473L, 2992714128140232259L, null).a(196085293324169L);
  
  public void remove() {
    long l = a ^ 0x6FBC1DD1C8EAL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public long next-s-VKNKU() {
    long l = this.next;
    try {
      if (l == this.finalElement) {
        try {
          if (!this.hasNext)
            throw new NoSuchElementException(); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        this.hasNext = false;
      } else {
        this.next = ULong.constructor-impl(this.next + this.step);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return l;
  }
  
  public boolean hasNext() {
    return this.hasNext;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ULongProgressionIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */