package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.RestrictsSuspension;
import me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics.IntrinsicsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@RestrictsSuspension
@SinceKotlin(version = "1.3")
public abstract class SequenceScope {
  @Nullable
  public abstract Object yield(Object paramObject, @NotNull Continuation paramContinuation);
  
  @Nullable
  public abstract Object yieldAll(@NotNull Iterator paramIterator, @NotNull Continuation paramContinuation);
  
  @Nullable
  public final Object yieldAll(@NotNull Iterable paramIterable, @NotNull Continuation paramContinuation) {
    try {
      if (paramIterable instanceof Collection)
        try {
          if (((Collection)paramIterable).isEmpty())
            return Unit.INSTANCE; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (yieldAll(paramIterable.iterator(), paramContinuation) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
        return yieldAll(paramIterable.iterator(), paramContinuation); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    yieldAll(paramIterable.iterator(), paramContinuation);
    return Unit.INSTANCE;
  }
  
  @Nullable
  public final Object yieldAll(@NotNull Sequence paramSequence, @NotNull Continuation paramContinuation) {
    try {
      if (yieldAll(paramSequence.iterator(), paramContinuation) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
        return yieldAll(paramSequence.iterator(), paramContinuation); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    yieldAll(paramSequence.iterator(), paramContinuation);
    return Unit.INSTANCE;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequenceScope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */