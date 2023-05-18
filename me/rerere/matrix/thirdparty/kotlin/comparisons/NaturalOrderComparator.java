package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class NaturalOrderComparator implements Comparator {
  @NotNull
  public static final NaturalOrderComparator INSTANCE = new NaturalOrderComparator();
  
  @NotNull
  public final Comparator reversed() {
    return ReverseOrderComparator.INSTANCE;
  }
  
  public int compare(@NotNull Comparable<Comparable> paramComparable1, @NotNull Comparable paramComparable2) {
    Intrinsics.checkNotNullParameter(paramComparable1, "a");
    Intrinsics.checkNotNullParameter(paramComparable2, "b");
    return paramComparable1.compareTo(paramComparable2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\NaturalOrderComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */