package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class IndexingIterator implements Iterator, KMappedMarker {
  private int index;
  
  @NotNull
  private final Iterator iterator;
  
  private static final long a = o3.a(-5029652346426409491L, 6055123789220680770L, null).a(251714599048846L);
  
  public final boolean hasNext() {
    return this.iterator.hasNext();
  }
  
  @NotNull
  public final IndexedValue next() {
    int i = this.index;
    this.index = i + 1;
    i = i;
    if (i < 0)
      CollectionsKt.throwIndexOverflow(); 
    return new IndexedValue(i, this.iterator.next());
  }
  
  public IndexingIterator(@NotNull Iterator paramIterator) {
    this.iterator = paramIterator;
  }
  
  public void remove() {
    long l = a ^ 0x1D46DFEE99B2L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\IndexingIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */