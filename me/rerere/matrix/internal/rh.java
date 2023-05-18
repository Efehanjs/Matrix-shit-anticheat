package me.rerere.matrix.internal;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.Grouping;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class rh implements Grouping {
  public rh(Iterable paramIterable) {}
  
  @NotNull
  public Iterator sourceIterator() {
    return this.i.iterator();
  }
  
  public Object keyOf(Object paramObject) {
    int i = ((Number)paramObject).intValue();
    boolean bool = false;
    return Integer.valueOf(i);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */