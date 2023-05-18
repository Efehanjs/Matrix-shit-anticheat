package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CoroutineContext$plus$1 extends Lambda implements Function2 {
  public static final CoroutineContext$plus$1 INSTANCE;
  
  private static final long a = o3.a(2990267392106969688L, -9150749997044151849L, null).a(19314823462793L);
  
  public CoroutineContext$plus$1() {
    super(2);
  }
  
  static {
    INSTANCE = new CoroutineContext$plus$1();
  }
  
  @NotNull
  public final CoroutineContext invoke(@NotNull CoroutineContext paramCoroutineContext, @NotNull CoroutineContext$Element paramCoroutineContext$Element) {
    long l = a ^ 0x5DADD1E09769L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext, "acc");
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Element, "element");
    CoroutineContext coroutineContext = paramCoroutineContext.minusKey(paramCoroutineContext$Element.getKey());
    try {
      ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor)coroutineContext.get(ContinuationInterceptor.Key);
      try {
        CoroutineContext coroutineContext1 = coroutineContext.minusKey(ContinuationInterceptor.Key);
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (coroutineContext == EmptyCoroutineContext.INSTANCE) ? paramCoroutineContext$Element : ((continuationInterceptor == null) ? new CombinedContext(coroutineContext, paramCoroutineContext$Element) : ((coroutineContext1 == EmptyCoroutineContext.INSTANCE) ? new CombinedContext(paramCoroutineContext$Element, continuationInterceptor) : new CombinedContext(new CombinedContext(coroutineContext1, paramCoroutineContext$Element), continuationInterceptor)));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CoroutineContext$plus$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */