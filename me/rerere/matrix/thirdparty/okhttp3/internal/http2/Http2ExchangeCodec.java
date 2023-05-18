package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealConnection;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.HttpHeaders;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealInterceptorChain;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2ExchangeCodec implements ExchangeCodec {
  @NotNull
  private static final String CONNECTION = "connection";
  
  @NotNull
  private final RealConnection connection;
  
  @NotNull
  private static final String PROXY_CONNECTION = "proxy-connection";
  
  private volatile boolean canceled;
  
  @NotNull
  private static final String ENCODING = "encoding";
  
  @NotNull
  private final Http2Connection http2Connection;
  
  @NotNull
  public static final Http2ExchangeCodec$Companion Companion;
  
  @NotNull
  private static final List HTTP_2_SKIPPED_RESPONSE_HEADERS;
  
  @Nullable
  private volatile Http2Stream stream;
  
  @NotNull
  private static final String TE = "te";
  
  @NotNull
  private final Protocol protocol;
  
  @NotNull
  private static final String HOST = "host";
  
  @NotNull
  private static final String TRANSFER_ENCODING = "transfer-encoding";
  
  @NotNull
  private final RealInterceptorChain chain;
  
  @NotNull
  private static final String UPGRADE = "upgrade";
  
  @NotNull
  private static final String KEEP_ALIVE = "keep-alive";
  
  @NotNull
  private static final List HTTP_2_SKIPPED_REQUEST_HEADERS;
  
  private static final long a = o3.a(8253473319762171191L, -4677278112011397178L, MethodHandles.lookup().lookupClass()).a(153406836426290L);
  
  public long reportedContentLength(@NotNull Response paramResponse) {
    long l = a ^ 0x4E63E3732E28L;
    try {
      Intrinsics.checkNotNullParameter(paramResponse, "response");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !HttpHeaders.promisesBody(paramResponse) ? 0L : Util.headersContentLength(paramResponse);
  }
  
  public void finishRequest() {
    Intrinsics.checkNotNull(this.stream);
    this.stream.getSink().close();
  }
  
  public Http2ExchangeCodec(@NotNull OkHttpClient paramOkHttpClient, @NotNull RealConnection paramRealConnection, @NotNull RealInterceptorChain paramRealInterceptorChain, @NotNull Http2Connection paramHttp2Connection) {
    this.connection = paramRealConnection;
    this.chain = paramRealInterceptorChain;
    this.http2Connection = paramHttp2Connection;
    this.protocol = paramOkHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
  }
  
  @NotNull
  public Source openResponseBodySource(@NotNull Response paramResponse) {
    long l = a ^ 0x203054DC7078L;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    Intrinsics.checkNotNull(this.stream);
    return this.stream.getSource$okhttp();
  }
  
  public void cancel() {
    try {
      this.canceled = true;
      if (this.stream == null) {
      
      } else {
        this.stream.closeLater(ErrorCode.CANCEL);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public Headers trailers() {
    Intrinsics.checkNotNull(this.stream);
    return this.stream.trailers();
  }
  
  public void flushRequest() {
    this.http2Connection.flush();
  }
  
  @NotNull
  public Sink createRequestBody(@NotNull Request paramRequest, long paramLong) {
    long l = a ^ 0xA39718671F6L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    Intrinsics.checkNotNull(this.stream);
    return this.stream.getSink();
  }
  
  @Nullable
  public Response.Builder readResponseHeaders(boolean paramBoolean) {
    Intrinsics.checkNotNull(this.stream);
    Headers headers = this.stream.takeHeaders();
    Response.Builder builder = Companion.readHttp2HeadersList(headers, this.protocol);
    try {
      if (paramBoolean)
        try {
          if (builder.getCode$okhttp() == 100);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return builder;
  }
  
  @NotNull
  public RealConnection getConnection() {
    return this.connection;
  }
  
  static {
    long l = a ^ 0x25442C7E6188L;
    Companion = new Http2ExchangeCodec$Companion(null);
    String[] arrayOfString = new String[12];
    arrayOfString[0] = "connection";
    arrayOfString[1] = "host";
    arrayOfString[2] = "keep-alive";
    arrayOfString[3] = "proxy-connection";
    arrayOfString[4] = "te";
    arrayOfString[5] = "transfer-encoding";
    arrayOfString[6] = "encoding";
    arrayOfString[7] = "upgrade";
    arrayOfString[8] = ":method";
    arrayOfString[9] = ":path";
    arrayOfString[10] = ":scheme";
    arrayOfString[11] = ":authority";
    HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf((Object[])arrayOfString);
    arrayOfString = new String[8];
    arrayOfString[0] = "connection";
    arrayOfString[1] = "host";
    arrayOfString[2] = "keep-alive";
    arrayOfString[3] = "proxy-connection";
    arrayOfString[4] = "te";
    arrayOfString[5] = "transfer-encoding";
    arrayOfString[6] = "encoding";
    arrayOfString[7] = "upgrade";
    HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf((Object[])arrayOfString);
  }
  
  public void writeRequestHeaders(@NotNull Request paramRequest) {
    long l = a ^ 0x6628A73F4F3EL;
    try {
      Intrinsics.checkNotNullParameter(paramRequest, "request");
      if (this.stream != null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (paramRequest.body() != null) ? true : false;
    List list = Companion.http2HeadersList(paramRequest);
    try {
      this.stream = this.http2Connection.newStream(list, bool);
      if (this.canceled) {
        Intrinsics.checkNotNull(this.stream);
        this.stream.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.stream);
    this.stream.readTimeout().timeout(this.chain.getReadTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
    Intrinsics.checkNotNull(this.stream);
    this.stream.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2ExchangeCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */