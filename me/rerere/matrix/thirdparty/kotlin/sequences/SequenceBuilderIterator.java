package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Result;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.EmptyCoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics.IntrinsicsKt;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.DebugProbesKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequenceBuilderIterator extends SequenceScope implements Iterator, Continuation, KMappedMarker {
  @Nullable
  private Continuation nextStep;
  
  @Nullable
  private Iterator nextIterator;
  
  @Nullable
  private Object nextValue;
  
  private int state;
  
  private static final long a = o3.a(-4887862397480062422L, 662725395202822934L, null).a(1048626501562L);
  
  public boolean hasNext() {
    while (true) {
      switch (this.state) {
        case 0:
          break;
        case 1:
          try {
            Intrinsics.checkNotNull(this.nextIterator);
            if (this.nextIterator.hasNext()) {
              this.state = 2;
              return true;
            } 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          this.nextIterator = null;
          break;
        case 4:
          return false;
        case 2:
        case 3:
          return true;
        default:
          throw exceptionalState();
      } 
      this.state = 5;
      Intrinsics.checkNotNull(this.nextStep);
      Continuation continuation = this.nextStep;
      this.nextStep = null;
      continuation.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    } 
  }
  
  public Object next() {
    try {
      Object object;
      switch (this.state) {
        case 0:
        case 1:
          return nextNotReady();
        case 2:
          this.state = 1;
          Intrinsics.checkNotNull(this.nextIterator);
          return this.nextIterator.next();
        case 3:
          this.state = 0;
          object = this.nextValue;
          this.nextValue = null;
          return object;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw exceptionalState();
  }
  
  @Nullable
  public Object yieldAll(@NotNull Iterator paramIterator, @NotNull Continuation paramContinuation) {
    try {
      if (!paramIterator.hasNext())
        return Unit.INSTANCE; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.nextIterator = paramIterator;
    this.state = 2;
    Continuation continuation = paramContinuation;
    boolean bool = false;
    try {
      this.nextStep = continuation;
      if (IntrinsicsKt.getCOROUTINE_SUSPENDED() == IntrinsicsKt.getCOROUTINE_SUSPENDED())
        DebugProbesKt.probeCoroutineSuspended(paramContinuation); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (IntrinsicsKt.getCOROUTINE_SUSPENDED() == IntrinsicsKt.getCOROUTINE_SUSPENDED())
        return IntrinsicsKt.getCOROUTINE_SUSPENDED(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    IntrinsicsKt.getCOROUTINE_SUSPENDED();
    return Unit.INSTANCE;
  }
  
  public void remove() {
    long l = a ^ 0x3F3B5097660DL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void setNextStep(@Nullable Continuation paramContinuation) {
    this.nextStep = paramContinuation;
  }
  
  @NotNull
  public CoroutineContext getContext() {
    return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
  }
  
  @Nullable
  public Object yield(Object paramObject, @NotNull Continuation paramContinuation) {
    this.nextValue = paramObject;
    this.state = 3;
    Continuation continuation = paramContinuation;
    boolean bool = false;
    try {
      this.nextStep = continuation;
      if (IntrinsicsKt.getCOROUTINE_SUSPENDED() == IntrinsicsKt.getCOROUTINE_SUSPENDED())
        DebugProbesKt.probeCoroutineSuspended(paramContinuation); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (IntrinsicsKt.getCOROUTINE_SUSPENDED() == IntrinsicsKt.getCOROUTINE_SUSPENDED())
        return IntrinsicsKt.getCOROUTINE_SUSPENDED(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    IntrinsicsKt.getCOROUTINE_SUSPENDED();
    return Unit.INSTANCE;
  }
  
  @Nullable
  public final Continuation getNextStep() {
    return this.nextStep;
  }
  
  public void resumeWith(@NotNull Object paramObject) {
    Object object = paramObject;
    ResultKt.throwOnFailure(object);
    this.state = 4;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequenceBuilderIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */