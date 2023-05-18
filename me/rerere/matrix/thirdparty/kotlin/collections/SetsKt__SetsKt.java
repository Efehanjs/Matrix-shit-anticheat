package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.BuilderInference;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
  private static final long b = o3.a(-6296599313224819806L, -826403778288042941L, null).a(81146094782075L);
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Set setOfNotNull(@Nullable Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject != null) ? SetsKt.setOf(paramObject) : SetsKt.emptySet();
  }
  
  @NotNull
  public static final HashSet hashSetOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x7932AC979B00L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (HashSet)ArraysKt.toCollection(paramVarArgs, new HashSet(MapsKt.mapCapacity(paramVarArgs.length)));
  }
  
  @NotNull
  public static final LinkedHashSet linkedSetOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x43702575CC92L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (LinkedHashSet)ArraysKt.toCollection(paramVarArgs, new LinkedHashSet(MapsKt.mapCapacity(paramVarArgs.length)));
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Set setOfNotNull(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x33D4CDE6C080L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (Set)ArraysKt.filterNotNullTo(paramVarArgs, new LinkedHashSet());
  }
  
  @NotNull
  public static final Set mutableSetOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x6CCC8963B663L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (Set)ArraysKt.toCollection(paramVarArgs, new LinkedHashSet(MapsKt.mapCapacity(paramVarArgs.length)));
  }
  
  @NotNull
  public static final Set emptySet() {
    return EmptySet.INSTANCE;
  }
  
  @NotNull
  public static final Set optimizeReadOnlySet(@NotNull Set paramSet) {
    long l = b ^ 0x56C562F776FDL;
    try {
      Intrinsics.checkNotNullParameter(paramSet, "<this>");
      switch (paramSet.size()) {
        case 0:
        
        case 1:
        
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramSet;
  }
  
  @NotNull
  public static final Set setOf(@NotNull Object... paramVarArgs) {
    long l = b ^ 0x6C45F139BF72L;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramVarArgs.length > 0) ? ArraysKt.toSet(paramVarArgs) : SetsKt.emptySet();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\SetsKt__SetsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */