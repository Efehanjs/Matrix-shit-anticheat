package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ContinuationInterceptor$DefaultImpls {
  private static final long a = o3.a(-4925930393088704052L, 7975083713171988285L, null).a(74374052429029L);
  
  public static void releaseInterceptedContinuation(@NotNull ContinuationInterceptor paramContinuationInterceptor, @NotNull Continuation paramContinuation) {
    long l = a ^ 0x5D26D9D1E549L;
    Intrinsics.checkNotNullParameter(paramContinuation, "continuation");
  }
  
  public static Object fold(@NotNull ContinuationInterceptor paramContinuationInterceptor, Object paramObject, @NotNull Function2 paramFunction2) {
    long l = a ^ 0x591867E0EEA8L;
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return CoroutineContext$Element$DefaultImpls.fold(paramContinuationInterceptor, paramObject, paramFunction2);
  }
  
  @NotNull
  public static CoroutineContext minusKey(@NotNull ContinuationInterceptor paramContinuationInterceptor, @NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0xD107600E9CCL;
    try {
      Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
      if (paramCoroutineContext$Key instanceof AbstractCoroutineContextKey) {
        try {
          if (((AbstractCoroutineContextKey)paramCoroutineContext$Key).isSubKey$kotlin_stdlib(paramContinuationInterceptor.getKey()))
            try {
              if (((AbstractCoroutineContextKey)paramCoroutineContext$Key).tryCast$kotlin_stdlib(paramContinuationInterceptor) != null);
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return paramContinuationInterceptor;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (ContinuationInterceptor.Key == paramCoroutineContext$Key) ? EmptyCoroutineContext.INSTANCE : paramContinuationInterceptor;
  }
  
  @Nullable
  public static CoroutineContext$Element get(@NotNull ContinuationInterceptor paramContinuationInterceptor, @NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x1E56303F2B8AL;
    try {
      Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
      if (paramCoroutineContext$Key instanceof AbstractCoroutineContextKey) {
        if (((AbstractCoroutineContextKey)paramCoroutineContext$Key).isSubKey$kotlin_stdlib(paramContinuationInterceptor.getKey())) {
          CoroutineContext$Element coroutineContext$Element = ((AbstractCoroutineContextKey)paramCoroutineContext$Key).tryCast$kotlin_stdlib(paramContinuationInterceptor);
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
        
        } 
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(paramContinuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (ContinuationInterceptor.Key == paramCoroutineContext$Key) ? paramContinuationInterceptor : null;
  }
  
  @NotNull
  public static CoroutineContext plus(@NotNull ContinuationInterceptor paramContinuationInterceptor, @NotNull CoroutineContext paramCoroutineContext) {
    long l = a ^ 0x2368739E7FA2L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext, "context");
    return CoroutineContext$Element$DefaultImpls.plus(paramContinuationInterceptor, paramCoroutineContext);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\ContinuationInterceptor$DefaultImpls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */