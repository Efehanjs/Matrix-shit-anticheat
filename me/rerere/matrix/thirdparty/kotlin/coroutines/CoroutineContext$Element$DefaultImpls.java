package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CoroutineContext$Element$DefaultImpls {
  private static final long a = o3.a(-6396513111401916158L, 542634051282727507L, null).a(217630510675729L);
  
  @NotNull
  public static CoroutineContext minusKey(@NotNull CoroutineContext$Element paramCoroutineContext$Element, @NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x40CE06FA2E11L;
    try {
      Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Intrinsics.areEqual(paramCoroutineContext$Element.getKey(), paramCoroutineContext$Key) ? EmptyCoroutineContext.INSTANCE : paramCoroutineContext$Element;
  }
  
  @NotNull
  public static CoroutineContext plus(@NotNull CoroutineContext$Element paramCoroutineContext$Element, @NotNull CoroutineContext paramCoroutineContext) {
    long l = a ^ 0x3CD4459D680EL;
    Intrinsics.checkNotNullParameter(paramCoroutineContext, "context");
    return CoroutineContext$DefaultImpls.plus(paramCoroutineContext$Element, paramCoroutineContext);
  }
  
  @Nullable
  public static CoroutineContext$Element get(@NotNull CoroutineContext$Element paramCoroutineContext$Element, @NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x794D4FE565CAL;
    try {
      Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
      Intrinsics.checkNotNull(paramCoroutineContext$Element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Intrinsics.areEqual(paramCoroutineContext$Element.getKey(), paramCoroutineContext$Key) ? paramCoroutineContext$Element : null;
  }
  
  public static Object fold(@NotNull CoroutineContext$Element paramCoroutineContext$Element, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = a ^ 0x3AE001AA3564L;
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return paramFunction2.invoke(paramObject, paramCoroutineContext$Element);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CoroutineContext$Element$DefaultImpls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */