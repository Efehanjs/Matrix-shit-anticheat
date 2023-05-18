package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class IntIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(-3482676473397229917L, 3043614338115088604L, null).a(248536160025829L);
  
  public void remove() {
    long l = a ^ 0xE846CC3E84DL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public abstract int nextInt();
  
  @NotNull
  public final Integer next() {
    return Integer.valueOf(nextInt());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\IntIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */