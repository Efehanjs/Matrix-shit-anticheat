package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractIterator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DistinctIterator extends AbstractIterator {
  @NotNull
  private final Iterator source;
  
  @NotNull
  private final Function1 keySelector;
  
  @NotNull
  private final HashSet observed;
  
  private static final long b = o3.a(-1929562910441275451L, -2406315343544947993L, null).a(39354879990350L);
  
  public DistinctIterator(@NotNull Iterator paramIterator, @NotNull Function1 paramFunction1) {
    this.source = paramIterator;
    this.keySelector = paramFunction1;
    this.observed = new HashSet();
  }
  
  public void computeNext() {
    while (this.source.hasNext()) {
      Object object = this.source.next();
      Object object1 = this.keySelector.invoke(object);
      if (this.observed.add(object1)) {
        setNext(object);
        return;
      } 
    } 
    done();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DistinctIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */