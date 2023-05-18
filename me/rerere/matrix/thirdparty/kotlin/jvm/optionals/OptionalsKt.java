package me.rerere.matrix.thirdparty.kotlin.jvm.optionals;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.SetsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class OptionalsKt {
  private static final long a = o3.a(7855385593519899435L, 6962941367559523475L, MethodHandles.lookup().lookupClass()).a(116425169357247L);
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @Nullable
  public static final Object getOrNull(@NotNull Optional paramOptional) {
    long l = a ^ 0x7A46772E13B3L;
    Intrinsics.checkNotNullParameter(paramOptional, "<this>");
    return paramOptional.orElse(null);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final Sequence asSequence(@NotNull Optional paramOptional) {
    long l = a ^ 0x187DCBD42F6DL;
    Intrinsics.checkNotNullParameter(paramOptional, "<this>");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramOptional.get();
    return paramOptional.isPresent() ? SequencesKt.sequenceOf(arrayOfObject) : SequencesKt.emptySequence();
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final Object getOrDefault(@NotNull Optional paramOptional, Object paramObject) {
    long l = a ^ 0x6BB6DA5F944DL;
    try {
      Intrinsics.checkNotNullParameter(paramOptional, "<this>");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramOptional.isPresent() ? paramOptional.get() : paramObject;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final Set toSet(@NotNull Optional paramOptional) {
    long l = a ^ 0x4D1D10DBCC9DL;
    try {
      Intrinsics.checkNotNullParameter(paramOptional, "<this>");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramOptional.isPresent() ? SetsKt.setOf(paramOptional.get()) : SetsKt.emptySet();
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final List toList(@NotNull Optional paramOptional) {
    long l = a ^ 0x2E285CD5B56AL;
    try {
      Intrinsics.checkNotNullParameter(paramOptional, "<this>");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramOptional.isPresent() ? CollectionsKt.listOf(paramOptional.get()) : CollectionsKt.emptyList();
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  @NotNull
  public static final Collection toCollection(@NotNull Optional paramOptional, @NotNull Collection<Object> paramCollection) {
    long l = a ^ 0x5BB1787D74C4L;
    try {
      Intrinsics.checkNotNullParameter(paramOptional, "<this>");
      Intrinsics.checkNotNullParameter(paramCollection, "destination");
      if (paramOptional.isPresent()) {
        Intrinsics.checkNotNullExpressionValue(paramOptional.get(), "get()");
        paramCollection.add(paramOptional.get());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramCollection;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final Object getOrElse(@NotNull Optional paramOptional, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x154BA79693E6L;
    Intrinsics.checkNotNullParameter(paramOptional, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "defaultValue");
    boolean bool = false;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramOptional.isPresent() ? paramOptional.get() : paramFunction0.invoke();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\optionals\OptionalsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */