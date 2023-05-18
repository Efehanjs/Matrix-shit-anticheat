package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class AsyncTimeout extends Timeout {
  private long timeoutAt;
  
  private boolean inQueue;
  
  private static final long IDLE_TIMEOUT_MILLIS;
  
  private static final long IDLE_TIMEOUT_NANOS;
  
  @NotNull
  public static final AsyncTimeout$Companion Companion;
  
  private static final int TIMEOUT_WRITE_SIZE = 65536;
  
  @Nullable
  private AsyncTimeout next;
  
  @Nullable
  private static AsyncTimeout head;
  
  private static final long b = o3.a(-1642469673497321424L, 2968785592733174576L, MethodHandles.lookup().lookupClass()).a(247302969801679L);
  
  @PublishedApi
  @NotNull
  public final IOException access$newTimeoutException(@Nullable IOException paramIOException) {
    return newTimeoutException(paramIOException);
  }
  
  @NotNull
  public IOException newTimeoutException(@Nullable IOException paramIOException) {
    long l = b ^ 0x3DE2FE201EA2L;
    InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
    try {
      if (paramIOException != null)
        interruptedIOException.initCause(paramIOException); 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return interruptedIOException;
  }
  
  public final Object withTimeout(@NotNull Function0 paramFunction0) {
    long l = b ^ 0x3330E8CDDA6BL;
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool1 = false;
    boolean bool2 = false;
    enter();
    try {
      Object object = paramFunction0.invoke();
      bool2 = true;
      return object;
    } catch (IOException iOException) {
      try {
      
      } catch (IOException iOException1) {
        throw c(null);
      } 
      throw !exit() ? (Throwable)iOException : (Throwable)access$newTimeoutException(iOException);
    } finally {
      InlineMarker.finallyStart(1);
      boolean bool = exit();
      try {
        if (bool)
          try {
            if (bool2)
              throw access$newTimeoutException(null); 
          } catch (IOException iOException) {
            throw c(null);
          }  
      } catch (IOException iOException) {
        throw c(null);
      } 
      InlineMarker.finallyEnd(1);
    } 
  }
  
  @NotNull
  public final Source source(@NotNull Source paramSource) {
    long l = b ^ 0x4A1013178D90L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    return new AsyncTimeout$source$1(this, paramSource);
  }
  
  public void timedOut() {}
  
  @NotNull
  public final Sink sink(@NotNull Sink paramSink) {
    long l = b ^ 0x202984FF09D8L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    return new AsyncTimeout$sink$1(this, paramSink);
  }
  
  static {
    Companion = new AsyncTimeout$Companion(null);
    IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60L);
    IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
  }
  
  public final void enter() {
    long l = timeoutNanos();
    boolean bool = hasDeadline();
    try {
      if (l == 0L)
        try {
          if (!bool)
            return; 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    AsyncTimeout$Companion.access$scheduleTimeout(Companion, this, l, bool);
  }
  
  public final boolean exit() {
    return AsyncTimeout$Companion.access$cancelScheduledTimeout(Companion, this);
  }
  
  private static Exception c(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\AsyncTimeout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */