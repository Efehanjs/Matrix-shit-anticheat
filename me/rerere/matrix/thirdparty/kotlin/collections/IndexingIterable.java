package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class IndexingIterable implements Iterable, KMappedMarker {
  @NotNull
  private final Function0 iteratorFactory;
  
  private static final long a = o3.a(-3734767728388515576L, -3197371706935064776L, null).a(228909034850409L);
  
  public IndexingIterable(@NotNull Function0 paramFunction0) {
    this.iteratorFactory = paramFunction0;
  }
  
  @NotNull
  public Iterator iterator() {
    return new IndexingIterator((Iterator)this.iteratorFactory.invoke());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\IndexingIterable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */