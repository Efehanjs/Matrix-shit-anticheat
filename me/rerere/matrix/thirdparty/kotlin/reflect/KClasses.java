package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.LowPriorityInOverloadResolution;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class KClasses {
  private static final long a = o3.a(-104409667284073857L, 9043819591698381654L, null).a(32107153812910L);
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @LowPriorityInOverloadResolution
  @Nullable
  public static final Object safeCast(@NotNull KClass paramKClass, @Nullable Object paramObject) {
    long l = a ^ 0x1A2587A4772CL;
    try {
      Intrinsics.checkNotNullParameter(paramKClass, "<this>");
      Intrinsics.checkNotNull(paramObject, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return paramKClass.isInstance(paramObject) ? paramObject : null;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @LowPriorityInOverloadResolution
  @NotNull
  public static final Object cast(@NotNull KClass paramKClass, @Nullable Object paramObject) {
    long l = a ^ 0x617EE832072CL;
    Intrinsics.checkNotNullParameter(paramKClass, "<this>");
    if (!paramKClass.isInstance(paramObject)) {
      KClass kClass = paramKClass;
      boolean bool = false;
      throw new ClassCastException("Value cannot be cast to " + kClass.getQualifiedName());
    } 
    Intrinsics.checkNotNull(paramObject, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
    return paramObject;
  }
  
  private static ClassCastException a(ClassCastException paramClassCastException) {
    return paramClassCastException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KClasses.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */