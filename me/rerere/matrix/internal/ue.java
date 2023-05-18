package me.rerere.matrix.internal;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.Grouping;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ue implements Grouping {
  @NotNull
  public Iterator sourceIterator() {
    return this.i.iterator();
  }
  
  public ue(Iterable paramIterable) {}
  
  public Object keyOf(Object paramObject) {
    float f = ((Number)paramObject).floatValue();
    boolean bool = false;
    return Float.valueOf(f);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\ue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */