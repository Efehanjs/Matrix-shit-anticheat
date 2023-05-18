package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.FunctionBase;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Reflection;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase, SuspendFunction {
  private final int arity;
  
  private static final long d = o3.a(8627045610236371351L, -6405711690833435775L, null).a(275400578982755L);
  
  public RestrictedSuspendLambda(int paramInt) {
    this(paramInt, null);
  }
  
  public RestrictedSuspendLambda(int paramInt, @Nullable Continuation paramContinuation) {
    super(paramContinuation);
    this.arity = paramInt;
  }
  
  public int getArity() {
    return this.arity;
  }
  
  @NotNull
  public String toString() {
    long l = d ^ 0x61F5412BA908L;
    try {
      Intrinsics.checkNotNullExpressionValue(Reflection.renderLambdaToString(this), "renderLambdaToString(this)");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (getCompletion() == null) ? Reflection.renderLambdaToString(this) : super.toString();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\RestrictedSuspendLambda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */