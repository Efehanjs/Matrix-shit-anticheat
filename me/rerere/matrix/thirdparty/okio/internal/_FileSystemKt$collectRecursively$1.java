package me.rerere.matrix.thirdparty.okio.internal;

import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _FileSystemKt$collectRecursively$1 extends ContinuationImpl {
  public Object L$1;
  
  public Object L$4;
  
  public Object L$0;
  
  public Object L$3;
  
  public int label;
  
  public Object L$2;
  
  public boolean Z$0;
  
  public boolean Z$1;
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    this.result = paramObject;
    this.label |= Integer.MIN_VALUE;
    return _FileSystemKt.collectRecursively(null, null, null, null, false, false, (Continuation)this);
  }
  
  public _FileSystemKt$collectRecursively$1(Continuation paramContinuation) {
    super(paramContinuation);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_FileSystemKt$collectRecursively$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */