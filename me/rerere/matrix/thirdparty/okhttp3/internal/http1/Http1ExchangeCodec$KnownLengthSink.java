package me.rerere.matrix.thirdparty.okhttp3.internal.http1;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingTimeout;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http1ExchangeCodec$KnownLengthSink implements Sink {
  private boolean closed;
  
  @NotNull
  private final ForwardingTimeout timeout = new ForwardingTimeout(Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).timeout());
  
  private static final long a = o3.a(1917574395717701034L, 5629720027394457194L, MethodHandles.lookup().lookupClass()).a(52705938363827L);
  
  public void flush() {
    try {
      if (this.closed)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).flush();
  }
  
  @NotNull
  public Timeout timeout() {
    return (Timeout)this.timeout;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x56939EC28808L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "source");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!(!this.closed ? 1 : 0)) {
      boolean bool = false;
      String str = "closed";
      throw new IllegalStateException(str.toString());
    } 
    Util.checkOffsetAndCount(paramBuffer.size(), 0L, paramLong);
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).write(paramBuffer, paramLong);
  }
  
  public void close() {
    try {
      if (this.closed)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.closed = true;
    Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
    Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 3);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http1\Http1ExchangeCodec$KnownLengthSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */