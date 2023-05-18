package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@ExperimentalStdlibApi
public abstract class AbstractCoroutineContextKey implements CoroutineContext$Key {
  @NotNull
  private final Function1 safeCast;
  
  @NotNull
  private final CoroutineContext$Key topmostKey;
  
  private static final long a = o3.a(1841987447085054653L, 8264783418319660887L, null).a(86134997528653L);
  
  public final boolean isSubKey$kotlin_stdlib(@NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x21C4F7DA5809L;
    try {
      Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
      if (paramCoroutineContext$Key != this) {
        try {
          if (this.topmostKey == paramCoroutineContext$Key);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @Nullable
  public final CoroutineContext$Element tryCast$kotlin_stdlib(@NotNull CoroutineContext$Element paramCoroutineContext$Element) {
    long l = a ^ 0x15C068AA4AF2L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Element, "element");
    return (CoroutineContext$Element)this.safeCast.invoke(paramCoroutineContext$Element);
  }
  
  public AbstractCoroutineContextKey(@NotNull CoroutineContext$Key paramCoroutineContext$Key, @NotNull Function1 paramFunction1) {
    this.safeCast = paramFunction1;
    this.topmostKey = (paramCoroutineContext$Key instanceof AbstractCoroutineContextKey) ? ((AbstractCoroutineContextKey)paramCoroutineContext$Key).topmostKey : paramCoroutineContext$Key;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\AbstractCoroutineContextKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */