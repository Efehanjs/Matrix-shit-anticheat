package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class DoubleIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(8469450883193197167L, -2469739260198343689L, null).a(264447191108661L);
  
  @NotNull
  public final Double next() {
    return Double.valueOf(nextDouble());
  }
  
  public abstract double nextDouble();
  
  public void remove() {
    long l = a ^ 0x394C153E267FL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\DoubleIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */