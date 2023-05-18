package me.rerere.matrix.thirdparty.okhttp3.internal.http1;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingTimeout;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class Http1ExchangeCodec$AbstractSource implements Source {
  @NotNull
  private final ForwardingTimeout timeout = new ForwardingTimeout(Http1ExchangeCodec.access$getSource$p(Http1ExchangeCodec.this).timeout());
  
  private boolean closed;
  
  private static final long a = o3.a(5485751937712934302L, -2582052731586080991L, MethodHandles.lookup().lookupClass()).a(120638614454L);
  
  public final boolean getClosed() {
    return this.closed;
  }
  
  @NotNull
  public final ForwardingTimeout getTimeout() {
    return this.timeout;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l2;
    long l1 = a ^ 0x2AFEE6994B7DL;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    try {
      l2 = Http1ExchangeCodec.access$getSource$p(Http1ExchangeCodec.this).read(paramBuffer, paramLong);
    } catch (IOException iOException) {
      Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
      responseBodyComplete();
      throw iOException;
    } 
    return l2;
  }
  
  public final void responseBodyComplete() {
    long l = a ^ 0x34CC3929D4F3L;
    try {
      if (Http1ExchangeCodec.access$getState$p(Http1ExchangeCodec.this) == 6)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (Http1ExchangeCodec.access$getState$p(Http1ExchangeCodec.this) != 5)
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(Http1ExchangeCodec.access$getState$p(Http1ExchangeCodec.this)))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
    Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 6);
  }
  
  @NotNull
  public Timeout timeout() {
    return (Timeout)this.timeout;
  }
  
  public final void setClosed(boolean paramBoolean) {
    this.closed = paramBoolean;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http1\Http1ExchangeCodec$AbstractSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */