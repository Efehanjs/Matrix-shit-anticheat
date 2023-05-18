package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class ShortIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(5334364973474412527L, -2468089350762995778L, null).a(189750826058719L);
  
  public abstract short nextShort();
  
  @NotNull
  public final Short next() {
    return Short.valueOf(nextShort());
  }
  
  public void remove() {
    long l = a ^ 0x66D8F59C949DL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ShortIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */