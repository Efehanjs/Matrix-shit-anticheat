package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class LongIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(-2831325995491219942L, -6467826710720892822L, null).a(144057020001313L);
  
  public abstract long nextLong();
  
  public void remove() {
    long l = a ^ 0x250716A6BECL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public final Long next() {
    return Long.valueOf(nextLong());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\LongIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */