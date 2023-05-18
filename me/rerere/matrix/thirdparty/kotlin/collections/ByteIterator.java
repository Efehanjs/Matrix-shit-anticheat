package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class ByteIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(4793797043838683483L, 1195331065573498332L, null).a(40064145997979L);
  
  public abstract byte nextByte();
  
  public void remove() {
    long l = a ^ 0x11273B23FCDBL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public final Byte next() {
    return Byte.valueOf(nextByte());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ByteIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */