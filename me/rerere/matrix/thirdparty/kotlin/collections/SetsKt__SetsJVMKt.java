package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.builders.SetBuilder;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class SetsKt__SetsJVMKt {
  private static final long a = o3.a(-7120557722428462509L, 2630643701372915954L, null).a(232017196214615L);
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Set createSetBuilder() {
    return (Set)new SetBuilder();
  }
  
  @NotNull
  public static final Set setOf(Object paramObject) {
    long l = a ^ 0x128BC773ECC4L;
    Intrinsics.checkNotNullExpressionValue(Collections.singleton(paramObject), "singleton(element)");
    return Collections.singleton(paramObject);
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Set build(@NotNull Set paramSet) {
    long l = a ^ 0x6D38194EB141L;
    Intrinsics.checkNotNullParameter(paramSet, "builder");
    return ((SetBuilder)paramSet).build();
  }
  
  @NotNull
  public static final TreeSet sortedSetOf(@NotNull Object... paramVarArgs) {
    long l = a ^ 0x4956E2651EACL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (TreeSet)ArraysKt.toCollection(paramVarArgs, new TreeSet());
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Set createSetBuilder(int paramInt) {
    return (Set)new SetBuilder(paramInt);
  }
  
  @NotNull
  public static final TreeSet sortedSetOf(@NotNull Comparator<?> paramComparator, @NotNull Object... paramVarArgs) {
    long l = a ^ 0x55EB5049CD50L;
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (TreeSet)ArraysKt.toCollection(paramVarArgs, new TreeSet(paramComparator));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\SetsKt__SetsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */