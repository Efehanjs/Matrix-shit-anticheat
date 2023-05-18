package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.SocketException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.ResponseBody;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealResponseBody;
import me.rerere.matrix.thirdparty.okhttp3.internal.ws.RealWebSocket;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Exchange {
  @NotNull
  private final RealCall call;
  
  @NotNull
  private final ExchangeCodec codec;
  
  @NotNull
  private final RealConnection connection;
  
  private boolean isDuplex;
  
  @NotNull
  private final EventListener eventListener;
  
  @NotNull
  private final ExchangeFinder finder;
  
  private static final long a = o3.a(-7414376425054401340L, -6552898583337837077L, MethodHandles.lookup().lookupClass()).a(7498302384878L);
  
  @NotNull
  public final ResponseBody openResponseBody(@NotNull Response paramResponse) throws IOException {
    long l = a ^ 0x16B8D1B21A0CL;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    try {
      String str = Response.header$default(paramResponse, "Content-Type", null, 2, null);
      long l1 = this.codec.reportedContentLength(paramResponse);
      Source source = this.codec.openResponseBodySource(paramResponse);
      Exchange$ResponseBodySource exchange$ResponseBodySource = new Exchange$ResponseBodySource(this, source, l1);
      return (ResponseBody)new RealResponseBody(str, l1, Okio.buffer((Source)exchange$ResponseBodySource));
    } catch (IOException iOException) {
      this.eventListener.responseFailed(this.call, iOException);
      trackFailure(iOException);
      throw iOException;
    } 
  }
  
  @NotNull
  public final EventListener getEventListener$okhttp() {
    return this.eventListener;
  }
  
  public final void webSocketUpgradeFailed() {
    bodyComplete(-1L, true, true, null);
  }
  
  public final void responseHeadersStart() {
    this.eventListener.responseHeadersStart(this.call);
  }
  
  public final IOException bodyComplete(long paramLong, boolean paramBoolean1, boolean paramBoolean2, IOException paramIOException) {
    try {
      if (paramIOException != null)
        trackFailure(paramIOException); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramBoolean2)
        try {
          if (paramIOException != null) {
            this.eventListener.requestFailed(this.call, paramIOException);
          } else {
            this.eventListener.requestBodyEnd(this.call, paramLong);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramBoolean1)
        try {
          if (paramIOException != null) {
            this.eventListener.responseFailed(this.call, paramIOException);
          } else {
            this.eventListener.responseBodyEnd(this.call, paramLong);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.call.messageDone$okhttp(this, paramBoolean2, paramBoolean1, paramIOException);
  }
  
  public final void cancel() {
    this.codec.cancel();
  }
  
  @NotNull
  public final Sink createRequestBody(@NotNull Request paramRequest, boolean paramBoolean) throws IOException {
    long l1 = a ^ 0x30E26D466745L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    this.isDuplex = paramBoolean;
    Intrinsics.checkNotNull(paramRequest.body());
    long l2 = paramRequest.body().contentLength();
    this.eventListener.requestBodyStart(this.call);
    Sink sink = this.codec.createRequestBody(paramRequest, l2);
    return (Sink)new Exchange$RequestBodySink(this, sink, l2);
  }
  
  public final void flushRequest() throws IOException {
    try {
      this.codec.flushRequest();
    } catch (IOException iOException) {
      this.eventListener.requestFailed(this.call, iOException);
      trackFailure(iOException);
      throw iOException;
    } 
  }
  
  @NotNull
  public final ExchangeFinder getFinder$okhttp() {
    return this.finder;
  }
  
  public final void detachWithViolence() {
    this.codec.cancel();
    this.call.messageDone$okhttp(this, true, true, null);
  }
  
  public final void writeRequestHeaders(@NotNull Request paramRequest) throws IOException {
    long l = a ^ 0x65E32AE8E465L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    try {
      this.eventListener.requestHeadersStart(this.call);
      this.codec.writeRequestHeaders(paramRequest);
      this.eventListener.requestHeadersEnd(this.call, paramRequest);
    } catch (IOException iOException) {
      this.eventListener.requestFailed(this.call, iOException);
      trackFailure(iOException);
      throw iOException;
    } 
  }
  
  public final boolean isCoalescedConnection$okhttp() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !Intrinsics.areEqual(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
  }
  
  @NotNull
  public final RealConnection getConnection$okhttp() {
    return this.connection;
  }
  
  public final void noNewExchangesOnConnection() {
    this.codec.getConnection().noNewExchanges$okhttp();
  }
  
  public final boolean isDuplex$okhttp() {
    return this.isDuplex;
  }
  
  @Nullable
  public final Response.Builder readResponseHeaders(boolean paramBoolean) throws IOException {
    try {
      Response.Builder builder = this.codec.readResponseHeaders(paramBoolean);
      try {
        if (builder == null) {
        
        } else {
          builder.initExchange$okhttp(this);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return builder;
    } catch (IOException iOException) {
      this.eventListener.responseFailed(this.call, iOException);
      trackFailure(iOException);
      throw iOException;
    } 
  }
  
  public final void noRequestBody() {
    this.call.messageDone$okhttp(this, true, false, null);
  }
  
  @NotNull
  public final Headers trailers() throws IOException {
    return this.codec.trailers();
  }
  
  public Exchange(@NotNull RealCall paramRealCall, @NotNull EventListener paramEventListener, @NotNull ExchangeFinder paramExchangeFinder, @NotNull ExchangeCodec paramExchangeCodec) {
    this.call = paramRealCall;
    this.eventListener = paramEventListener;
    this.finder = paramExchangeFinder;
    this.codec = paramExchangeCodec;
    this.connection = this.codec.getConnection();
  }
  
  @NotNull
  public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
    this.call.timeoutEarlyExit();
    return this.codec.getConnection().newWebSocketStreams$okhttp(this);
  }
  
  @NotNull
  public final RealCall getCall$okhttp() {
    return this.call;
  }
  
  public final void finishRequest() throws IOException {
    try {
      this.codec.finishRequest();
    } catch (IOException iOException) {
      this.eventListener.requestFailed(this.call, iOException);
      trackFailure(iOException);
      throw iOException;
    } 
  }
  
  public final void responseHeadersEnd(@NotNull Response paramResponse) {
    long l = a ^ 0x658CAE6F51CCL;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    this.eventListener.responseHeadersEnd(this.call, paramResponse);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\Exchange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */