package me.rerere.matrix.internal;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;

public final class ae implements Comparator {
  public final int compare(Object paramObject1, Object paramObject2) {
    d d = (d)paramObject1;
    boolean bool = false;
    d = (d)paramObject2;
    Long long_ = Long.valueOf(d.j());
    bool = false;
    return ComparisonsKt.compareValues(long_, Long.valueOf(d.j()));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */