package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class AsyncTimeout$Companion {
  private static final long a = o3.a(1846473051200595434L, -6945505154501561058L, MethodHandles.lookup().lookupClass()).a(51406380273235L);
  
  @Nullable
  public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
    Intrinsics.checkNotNull(AsyncTimeout.access$getHead$cp());
    AsyncTimeout asyncTimeout = AsyncTimeout.access$getNext$p(AsyncTimeout.access$getHead$cp());
    if (asyncTimeout == null) {
      long l1 = System.nanoTime();
      try {
        AsyncTimeout.class.wait(AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp());
        Intrinsics.checkNotNull(AsyncTimeout.access$getHead$cp());
        if (AsyncTimeout.access$getNext$p(AsyncTimeout.access$getHead$cp()) == null)
          try {
            if (System.nanoTime() - l1 >= AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp());
          } catch (InterruptedException interruptedException) {
            throw a(null);
          }  
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      return (AsyncTimeout)null;
    } 
    long l = AsyncTimeout.access$remainingNanos(asyncTimeout, System.nanoTime());
    if (l > 0L) {
      long l1 = l / 1000000L;
      l -= l1 * 1000000L;
      AsyncTimeout.class.wait(l1, (int)l);
      return null;
    } 
    Intrinsics.checkNotNull(AsyncTimeout.access$getHead$cp());
    AsyncTimeout.access$setNext$p(AsyncTimeout.access$getHead$cp(), AsyncTimeout.access$getNext$p(asyncTimeout));
    AsyncTimeout.access$setNext$p(asyncTimeout, (AsyncTimeout)null);
    return asyncTimeout;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\AsyncTimeout$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */