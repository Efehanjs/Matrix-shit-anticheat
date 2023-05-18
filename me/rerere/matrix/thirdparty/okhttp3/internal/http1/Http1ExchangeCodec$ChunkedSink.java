package me.rerere.matrix.thirdparty.okhttp3.internal.http1;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingTimeout;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http1ExchangeCodec$ChunkedSink implements Sink {
  private boolean closed;
  
  @NotNull
  private final ForwardingTimeout timeout = new ForwardingTimeout(Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).timeout());
  
  private static final long a = o3.a(-7168547340132852621L, 2705250571286702422L, MethodHandles.lookup().lookupClass()).a(196378756358543L);
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x149DFC5E4096L;
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
    try {
      if (paramLong == 0L)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).writeHexadecimalUnsignedLong(paramLong);
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).writeUtf8("\r\n");
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).write(paramBuffer, paramLong);
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).writeUtf8("\r\n");
  }
  
  public synchronized void close() {
    long l = a ^ 0x1CA25BA95A18L;
    try {
      if (this.closed)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.closed = true;
    Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).writeUtf8("0\r\n\r\n");
    Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
    Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 3);
  }
  
  public synchronized void flush() {
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
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http1\Http1ExchangeCodec$ChunkedSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */