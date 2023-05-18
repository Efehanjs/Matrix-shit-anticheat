package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TransformingSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  private static final long a = o3.a(-2340916714584722968L, 693709622723840413L, null).a(196058244048833L);
  
  public TransformingSequence$iterator$1() {
    this.iterator = TransformingSequence.access$getSequence$p(paramTransformingSequence).iterator();
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public void remove() {
    long l = a ^ 0x2ECEFFABC259L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean hasNext() {
    return this.iterator.hasNext();
  }
  
  public Object next() {
    return TransformingSequence.access$getTransformer$p(TransformingSequence.this).invoke(this.iterator.next());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\TransformingSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */