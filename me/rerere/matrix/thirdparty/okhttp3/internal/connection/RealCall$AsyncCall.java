package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Callback;
import me.rerere.matrix.thirdparty.okhttp3.Dispatcher;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealCall$AsyncCall implements Runnable {
  @NotNull
  private volatile AtomicInteger callsPerHost;
  
  @NotNull
  private final Callback responseCallback;
  
  private static final long a = o3.a(5156452093649516264L, 5476529663178873474L, MethodHandles.lookup().lookupClass()).a(30644736209508L);
  
  @NotNull
  public final String getHost() {
    return RealCall.this.getOriginalRequest().url().host();
  }
  
  public RealCall$AsyncCall(Callback paramCallback) {
    this.responseCallback = paramCallback;
    this.callsPerHost = new AtomicInteger(0);
  }
  
  public final void executeOn(@NotNull ExecutorService paramExecutorService) {
    long l = a ^ 0xA63A9DDE8F7L;
    Intrinsics.checkNotNullParameter(paramExecutorService, "executorService");
    Dispatcher dispatcher = RealCall.this.getClient().dispatcher();
    boolean bool2 = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(dispatcher))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher); 
        } catch (RejectedExecutionException rejectedExecutionException) {
          throw a(null);
        }  
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    boolean bool1 = false;
    try {
      paramExecutorService.execute(this);
      bool1 = true;
    } catch (RejectedExecutionException rejectedExecutionException) {
      InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
      interruptedIOException.initCause(rejectedExecutionException);
      RealCall.this.noMoreExchanges$okhttp(interruptedIOException);
      this.responseCallback.onFailure(RealCall.this, interruptedIOException);
    } finally {
      RealCall.this.getClient().dispatcher().finished$okhttp(this);
    } 
  }
  
  public void run() {
    long l = a ^ 0x13D83CA7AFE1L;
    String str1 = Intrinsics.stringPlus("OkHttp ", RealCall.this.redactedUrl$okhttp());
    RealCall realCall = RealCall.this;
    boolean bool = false;
    Thread thread = Thread.currentThread();
    String str2 = thread.getName();
    thread.setName(str1);
    try {
      boolean bool1 = false;
      boolean bool2 = false;
      RealCall.access$getTimeout$p(realCall).enter();
      try {
        Response response = realCall.getResponseWithInterceptorChain$okhttp();
        bool2 = true;
        this.responseCallback.onResponse(realCall, response);
      } catch (IOException iOException) {
        try {
          if (bool2) {
            Platform.Companion.get().log(Intrinsics.stringPlus("Callback failure for ", RealCall.access$toLoggableString(realCall)), 4, iOException);
          } else {
            this.responseCallback.onFailure(realCall, iOException);
          } 
        } catch (IOException iOException1) {
          throw a(null);
        } 
      } catch (Throwable throwable) {
        realCall.cancel();
        if (!bool2) {
          IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", throwable));
          ExceptionsKt.addSuppressed(iOException, throwable);
          this.responseCallback.onFailure(realCall, iOException);
        } 
        throw throwable;
      } finally {
        realCall.getClient().dispatcher().finished$okhttp(this);
      } 
    } finally {
      thread.setName(str2);
    } 
  }
  
  @NotNull
  public final RealCall getCall() {
    return RealCall.this;
  }
  
  @NotNull
  public final AtomicInteger getCallsPerHost() {
    return this.callsPerHost;
  }
  
  public final void reuseCallsPerHostFrom(@NotNull RealCall$AsyncCall paramRealCall$AsyncCall) {
    long l = a ^ 0x7C1AB37C0F0L;
    Intrinsics.checkNotNullParameter(paramRealCall$AsyncCall, "other");
    this.callsPerHost = paramRealCall$AsyncCall.callsPerHost;
  }
  
  @NotNull
  public final Request getRequest() {
    return RealCall.this.getOriginalRequest();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealCall$AsyncCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */