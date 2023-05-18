package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.EmptyCoroutineContext;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
  private static final long c = o3.a(-2740191096789766870L, -8176660640985013217L, null).a(272820474914693L);
  
  @NotNull
  public CoroutineContext getContext() {
    return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
  }
  
  public RestrictedContinuationImpl(@Nullable Continuation paramContinuation) {
    super(paramContinuation);
    Continuation continuation1 = paramContinuation;
    Continuation continuation2 = continuation1;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (continuation2.getContext() == EmptyCoroutineContext.INSTANCE) ? true : false;
    if (!bool2) {
      boolean bool = false;
      String str = "Coroutines with restricted suspension must have EmptyCoroutineContext";
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\RestrictedContinuationImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */