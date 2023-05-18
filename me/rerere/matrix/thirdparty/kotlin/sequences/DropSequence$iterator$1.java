package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DropSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  private int left;
  
  private static final long a = o3.a(-1110315488824893365L, -313349186711269346L, null).a(127816185851287L);
  
  public final int getLeft() {
    return this.left;
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public Object next() {
    drop();
    return this.iterator.next();
  }
  
  public DropSequence$iterator$1(DropSequence paramDropSequence) {
    this.iterator = DropSequence.access$getSequence$p(paramDropSequence).iterator();
    this.left = DropSequence.access$getCount$p(paramDropSequence);
  }
  
  public boolean hasNext() {
    drop();
    return this.iterator.hasNext();
  }
  
  public final void setLeft(int paramInt) {
    this.left = paramInt;
  }
  
  public void remove() {
    long l = a ^ 0x1E37F84DC533L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DropSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */