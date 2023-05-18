package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MergingSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator2;
  
  @NotNull
  private final Iterator iterator1;
  
  private static final long a = o3.a(-7520318072172088610L, 2136163716499929023L, null).a(140252897935577L);
  
  public MergingSequence$iterator$1() {
    this.iterator1 = MergingSequence.access$getSequence1$p(paramMergingSequence).iterator();
    this.iterator2 = MergingSequence.access$getSequence2$p(paramMergingSequence).iterator();
  }
  
  @NotNull
  public final Iterator getIterator2() {
    return this.iterator2;
  }
  
  @NotNull
  public final Iterator getIterator1() {
    return this.iterator1;
  }
  
  public boolean hasNext() {
    try {
      if (this.iterator1.hasNext())
        try {
          if (this.iterator2.hasNext());
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public void remove() {
    long l = a ^ 0x671FFF041849L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object next() {
    return MergingSequence.access$getTransform$p(MergingSequence.this).invoke(this.iterator1.next(), this.iterator2.next());
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\MergingSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */