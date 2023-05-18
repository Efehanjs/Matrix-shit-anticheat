package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TransformingIndexedSequence$iterator$1 implements Iterator, KMappedMarker {
  private int index;
  
  @NotNull
  private final Iterator iterator;
  
  private static final long a = o3.a(-2398726058513464782L, -1826124171684466872L, null).a(9176747572410L);
  
  public void remove() {
    long l = a ^ 0xC55ABA4C84BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void setIndex(int paramInt) {
    this.index = paramInt;
  }
  
  public Object next() {
    int i = this.index;
    this.index = i + 1;
    i = i;
    try {
      if (i < 0)
        CollectionsKt.throwIndexOverflow(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return TransformingIndexedSequence.access$getTransformer$p(TransformingIndexedSequence.this).invoke(Integer.valueOf(i), this.iterator.next());
  }
  
  public boolean hasNext() {
    return this.iterator.hasNext();
  }
  
  public TransformingIndexedSequence$iterator$1() {
    this.iterator = TransformingIndexedSequence.access$getSequence$p(paramTransformingIndexedSequence).iterator();
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public final int getIndex() {
    return this.index;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TransformingIndexedSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */