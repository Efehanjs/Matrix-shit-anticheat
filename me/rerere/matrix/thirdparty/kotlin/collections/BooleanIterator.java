package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class BooleanIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(-4809991585051536231L, -273875606141858176L, null).a(32953020745433L);
  
  public abstract boolean nextBoolean();
  
  @NotNull
  public final Boolean next() {
    return Boolean.valueOf(nextBoolean());
  }
  
  public void remove() {
    long l = a ^ 0x8F3109FB0C5L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\BooleanIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */