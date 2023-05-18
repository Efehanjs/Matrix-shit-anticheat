package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class FloatIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(-3961799530741063112L, -3961138131704816687L, null).a(159746192129110L);
  
  public void remove() {
    long l = a ^ 0x1E898D60B982L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public abstract float nextFloat();
  
  @NotNull
  public final Float next() {
    return Float.valueOf(nextFloat());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\FloatIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */