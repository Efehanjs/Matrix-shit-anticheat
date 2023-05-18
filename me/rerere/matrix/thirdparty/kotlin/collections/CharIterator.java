package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class CharIterator implements Iterator, KMappedMarker {
  private static final long a = o3.a(4663524026619079377L, 808408889893876881L, null).a(71208929899713L);
  
  @NotNull
  public final Character next() {
    return Character.valueOf(nextChar());
  }
  
  public void remove() {
    long l = a ^ 0x74FBD94A4B6BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public abstract char nextChar();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CharIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */