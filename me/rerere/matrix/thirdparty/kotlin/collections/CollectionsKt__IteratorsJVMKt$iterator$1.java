package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;

public final class CollectionsKt__IteratorsJVMKt$iterator$1 implements Iterator, KMappedMarker {
  private static final long a = o3.a(5517668897065210246L, 5163665905192861113L, null).a(131872435036553L);
  
  public CollectionsKt__IteratorsJVMKt$iterator$1(Enumeration paramEnumeration) {}
  
  public Object next() {
    return this.$this_iterator.nextElement();
  }
  
  public void remove() {
    long l = a ^ 0x6217AE0EF1D9L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean hasNext() {
    return this.$this_iterator.hasMoreElements();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__IteratorsJVMKt$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */