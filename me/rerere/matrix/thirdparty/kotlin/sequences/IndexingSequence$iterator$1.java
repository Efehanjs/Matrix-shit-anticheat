package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IndexedValue;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class IndexingSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  private int index;
  
  private static final long a = o3.a(-8466631757073679311L, 5841355351074261423L, null).a(100767678226260L);
  
  public final int getIndex() {
    return this.index;
  }
  
  @NotNull
  public IndexedValue next() {
    int i = this.index;
    this.index = i + 1;
    i = i;
    if (i < 0)
      CollectionsKt.throwIndexOverflow(); 
    return new IndexedValue(i, this.iterator.next());
  }
  
  public boolean hasNext() {
    return this.iterator.hasNext();
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public final void setIndex(int paramInt) {
    this.index = paramInt;
  }
  
  public IndexingSequence$iterator$1(IndexingSequence paramIndexingSequence) {
    this.iterator = IndexingSequence.access$getSequence$p(paramIndexingSequence).iterator();
  }
  
  public void remove() {
    long l = a ^ 0x72EA012BC567L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\IndexingSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */