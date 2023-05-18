package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.NotImplementedError;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
  private static final long f = o3.a(2328431350726536184L, -4377985455650895851L, null).a(245282183911915L);
  
  public static final void sortWith(@NotNull List<?> paramList, @NotNull Comparator<?> paramComparator) {
    long l = f ^ 0x6BD9874D5C1DL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
      if (paramList.size() > 1)
        Collections.sort(paramList, paramComparator); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static final void sort(@NotNull List<Comparable> paramList) {
    long l = f ^ 0x9F81C81908CL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (paramList.size() > 1)
        Collections.sort(paramList); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt__MutableCollectionsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */