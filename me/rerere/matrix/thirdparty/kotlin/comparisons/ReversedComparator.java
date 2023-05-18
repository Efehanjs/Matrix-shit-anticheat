package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ReversedComparator implements Comparator {
  @NotNull
  private final Comparator comparator;
  
  private static final long a = o3.a(-6592369990027879445L, 8075837188933245991L, null).a(73497526413186L);
  
  @NotNull
  public final Comparator reversed() {
    return this.comparator;
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return this.comparator.compare(paramObject2, paramObject1);
  }
  
  @NotNull
  public final Comparator getComparator() {
    return this.comparator;
  }
  
  public ReversedComparator(@NotNull Comparator paramComparator) {
    this.comparator = paramComparator;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ReversedComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */