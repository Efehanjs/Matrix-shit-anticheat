package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ReverseOrderComparator implements Comparator {
  @NotNull
  public static final ReverseOrderComparator INSTANCE = new ReverseOrderComparator();
  
  @NotNull
  public final Comparator reversed() {
    return NaturalOrderComparator.INSTANCE;
  }
  
  public int compare(@NotNull Comparable paramComparable1, @NotNull Comparable<Comparable> paramComparable2) {
    Intrinsics.checkNotNullParameter(paramComparable1, "a");
    Intrinsics.checkNotNullParameter(paramComparable2, "b");
    return paramComparable2.compareTo(paramComparable1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ReverseOrderComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */