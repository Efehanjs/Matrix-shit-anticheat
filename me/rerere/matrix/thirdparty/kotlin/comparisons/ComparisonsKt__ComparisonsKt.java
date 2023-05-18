package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ComparisonsKt__ComparisonsKt {
  private static final long a = o3.a(584620559445618723L, 2415304310559366489L, null).a(278601616622302L);
  
  @NotNull
  public static final Comparator nullsLast(@NotNull Comparator paramComparator) {
    long l = a ^ 0x23EFC94B0173L;
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return new ComparisonsKt__ComparisonsKt$nullsLast$1(paramComparator);
  }
  
  @NotNull
  public static final Comparator thenDescending(@NotNull Comparator paramComparator1, @NotNull Comparator paramComparator2) {
    long l = a ^ 0x2E932DD7D24L;
    Intrinsics.checkNotNullParameter(paramComparator1, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator2, "comparator");
    return new ComparisonsKt__ComparisonsKt$thenDescending$1(paramComparator1, paramComparator2);
  }
  
  @NotNull
  public static final Comparator compareBy(@NotNull Function1... paramVarArgs) {
    long l = a ^ 0x726E83567AF0L;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "selectors");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramVarArgs.length > 0) ? true : false;
    if (!bool) {
      String str = "Failed requirement.";
      throw new IllegalArgumentException(str.toString());
    } 
    return new ComparisonsKt__ComparisonsKt$compareBy$1(paramVarArgs);
  }
  
  @NotNull
  public static final Comparator reversed(@NotNull Comparator paramComparator) {
    long l = a ^ 0x14597899DBA5L;
    Intrinsics.checkNotNullParameter(paramComparator, "<this>");
    Comparator comparator = paramComparator;
    try {
      try {
        Intrinsics.checkNotNull(ReverseOrderComparator.INSTANCE, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        try {
          Intrinsics.checkNotNull(NaturalOrderComparator.INSTANCE, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (comparator instanceof ReversedComparator) ? ((ReversedComparator)paramComparator).getComparator() : (Intrinsics.areEqual(comparator, NaturalOrderComparator.INSTANCE) ? ReverseOrderComparator.INSTANCE : (Intrinsics.areEqual(comparator, ReverseOrderComparator.INSTANCE) ? NaturalOrderComparator.INSTANCE : new ReversedComparator(paramComparator)));
  }
  
  @NotNull
  public static final Comparator nullsFirst(@NotNull Comparator paramComparator) {
    long l = a ^ 0x5E00814A6C81L;
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    return new ComparisonsKt__ComparisonsKt$nullsFirst$1(paramComparator);
  }
  
  @NotNull
  public static final Comparator naturalOrder() {
    long l = a ^ 0x3D9B02DB38E6L;
    Intrinsics.checkNotNull(NaturalOrderComparator.INSTANCE, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
    return NaturalOrderComparator.INSTANCE;
  }
  
  public static final int compareValues(@Nullable Comparable<Comparable> paramComparable1, @Nullable Comparable paramComparable2) {
    try {
      if (paramComparable1 == paramComparable2)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramComparable1 == null)
        return -1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramComparable2 == null)
        return 1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramComparable1.compareTo(paramComparable2);
  }
  
  @NotNull
  public static final Comparator reverseOrder() {
    long l = a ^ 0x653CF1DDCA12L;
    Intrinsics.checkNotNull(ReverseOrderComparator.INSTANCE, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
    return ReverseOrderComparator.INSTANCE;
  }
  
  public static final int compareValuesBy(Object paramObject1, Object paramObject2, @NotNull Function1... paramVarArgs) {
    long l = a ^ 0x3D2551147BBCL;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "selectors");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramVarArgs.length > 0) ? true : false;
    if (!bool) {
      String str = "Failed requirement.";
      throw new IllegalArgumentException(str.toString());
    } 
    return compareValuesByImpl$ComparisonsKt__ComparisonsKt(paramObject1, paramObject2, paramVarArgs);
  }
  
  @NotNull
  public static final Comparator then(@NotNull Comparator paramComparator1, @NotNull Comparator paramComparator2) {
    long l = a ^ 0x416953A8D74DL;
    Intrinsics.checkNotNullParameter(paramComparator1, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator2, "comparator");
    return new ComparisonsKt__ComparisonsKt$then$1(paramComparator1, paramComparator2);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */