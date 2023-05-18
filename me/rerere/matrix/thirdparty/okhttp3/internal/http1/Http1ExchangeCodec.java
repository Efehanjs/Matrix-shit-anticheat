package me.rerere.matrix.thirdparty.okhttp3.internal.http1;

import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealConnection;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.HttpHeaders;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RequestLine;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ForwardingTimeout;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http1ExchangeCodec implements ExchangeCodec {
  private static final int STATE_READ_RESPONSE_HEADERS = 3;
  
  @NotNull
  private final HeadersReader headersReader;
  
  @Nullable
  private Headers trailers;
  
  private static final int STATE_IDLE = 0;
  
  @NotNull
  private final RealConnection connection;
  
  @NotNull
  private final BufferedSink sink;
  
  @NotNull
  private final BufferedSource source;
  
  private static final int STATE_WRITING_REQUEST_BODY = 2;
  
  private static final int STATE_OPEN_REQUEST_BODY = 1;
  
  private int state;
  
  private static final int STATE_OPEN_RESPONSE_BODY = 4;
  
  @NotNull
  public static final Http1ExchangeCodec$Companion Companion;
  
  private static final int STATE_READING_RESPONSE_BODY = 5;
  
  @Nullable
  private final OkHttpClient client;
  
  private static final int STATE_CLOSED = 6;
  
  private static final long NO_CHUNK_YET = -1L;
  
  private static final long a = o3.a(3461227761520558660L, -6289242916301574625L, MethodHandles.lookup().lookupClass()).a(221458046092052L);
  
  @NotNull
  public Headers trailers() {
    long l = a ^ 0x1167B4ECE1FDL;
    try {
      if (!((this.state == 6) ? 1 : 0)) {
        boolean bool = false;
        String str = "too early; can't read the trailers yet";
        throw new IllegalStateException(str.toString());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.trailers == null);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Util.EMPTY_HEADERS;
  }
  
  public final void skipConnectBody(@NotNull Response paramResponse) {
    long l1 = a ^ 0x3998A1F9D1FFL;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    long l2 = Util.headersContentLength(paramResponse);
    try {
      if (l2 == -1L)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Source source = newFixedLengthSource(l2);
    Util.skipAll(source, 2147483647, TimeUnit.MILLISECONDS);
    source.close();
  }
  
  @NotNull
  public RealConnection getConnection() {
    return this.connection;
  }
  
  @NotNull
  public Sink createRequestBody(@NotNull Request paramRequest, long paramLong) {
    long l = a ^ 0x7899C91106C5L;
    try {
      Intrinsics.checkNotNullParameter(paramRequest, "request");
      if (paramRequest.body() != null)
        try {
          if (paramRequest.body().isDuplex())
            throw new ProtocolException("Duplex connections are not supported for HTTP/1"); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      try {
        if (paramLong != -1L) {
        
        } else {
          throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return isChunked(paramRequest) ? newChunkedSink() : (Sink)"JD-Core does not support Kotlin";
  }
  
  public void writeRequestHeaders(@NotNull Request paramRequest) {
    long l = a ^ 0x14881FA8380DL;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    Proxy.Type type = getConnection().route().proxy().type();
    Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
    String str = RequestLine.INSTANCE.get(paramRequest, type);
    writeRequest(paramRequest.headers(), str);
  }
  
  public void finishRequest() {
    this.sink.flush();
  }
  
  public long reportedContentLength(@NotNull Response paramResponse) {
    long l = a ^ 0x3CC35BE4591BL;
    try {
      Intrinsics.checkNotNullParameter(paramResponse, "response");
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !HttpHeaders.promisesBody(paramResponse) ? 0L : (isChunked(paramResponse) ? -1L : Util.headersContentLength(paramResponse));
  }
  
  public void cancel() {
    getConnection().cancel();
  }
  
  public Http1ExchangeCodec(@Nullable OkHttpClient paramOkHttpClient, @NotNull RealConnection paramRealConnection, @NotNull BufferedSource paramBufferedSource, @NotNull BufferedSink paramBufferedSink) {
    this.client = paramOkHttpClient;
    this.connection = paramRealConnection;
    this.source = paramBufferedSource;
    this.sink = paramBufferedSink;
    this.headersReader = new HeadersReader(this.source);
  }
  
  @NotNull
  public Source openResponseBodySource(@NotNull Response paramResponse) {
    long l = a ^ 0x5290EC4B074BL;
    try {
      Intrinsics.checkNotNullParameter(paramResponse, "response");
      try {
        long l1 = Util.headersContentLength(paramResponse);
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !HttpHeaders.promisesBody(paramResponse) ? newFixedLengthSource(0L) : (isChunked(paramResponse) ? newChunkedSource(paramResponse.request().url()) : ((l1 != -1L) ? newFixedLengthSource(l1) : newUnknownLengthSource()));
  }
  
  public final boolean isClosed() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.state == 6);
  }
  
  public void flushRequest() {
    this.sink.flush();
  }
  
  public final void writeRequest(@NotNull Headers paramHeaders, @NotNull String paramString) {
    long l = a ^ 0x465BEE05A59BL;
    try {
      Intrinsics.checkNotNullParameter(paramHeaders, "headers");
      Intrinsics.checkNotNullParameter(paramString, "requestLine");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!((this.state == 0) ? 1 : 0)) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("state: ", Integer.valueOf(this.state));
      throw new IllegalStateException(str.toString());
    } 
    this.sink.writeUtf8(paramString).writeUtf8("\r\n");
    byte b = 0;
    int i = paramHeaders.size();
    while (b < i) {
      byte b1 = b;
      b++;
      this.sink.writeUtf8(paramHeaders.name(b1)).writeUtf8(": ").writeUtf8(paramHeaders.value(b1)).writeUtf8("\r\n");
    } 
    this.sink.writeUtf8("\r\n");
    this.state = 1;
  }
  
  static {
    Companion = new Http1ExchangeCodec$Companion(null);
  }
  
  @Nullable
  public Response.Builder readResponseHeaders(boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http1/Http1ExchangeCodec.a : J
    //   3: ldc2_w 104896837375871
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: getfield state : I
    //   12: iconst_1
    //   13: if_icmpeq -> 31
    //   16: aload_0
    //   17: getfield state : I
    //   20: iconst_3
    //   21: if_icmpne -> 39
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: iconst_1
    //   32: goto -> 40
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iconst_0
    //   40: ifne -> 73
    //   43: iconst_0
    //   44: istore #5
    //   46: ldc 'state: '
    //   48: aload_0
    //   49: getfield state : I
    //   52: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   55: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   58: astore #5
    //   60: new java/lang/IllegalStateException
    //   63: dup
    //   64: aload #5
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: athrow
    //   73: nop
    //   74: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http/StatusLine.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/http/StatusLine$Companion;
    //   77: aload_0
    //   78: getfield headersReader : Lme/rerere/matrix/thirdparty/okhttp3/internal/http1/HeadersReader;
    //   81: invokevirtual readLine : ()Ljava/lang/String;
    //   84: invokevirtual parse : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okhttp3/internal/http/StatusLine;
    //   87: astore #4
    //   89: new me/rerere/matrix/thirdparty/okhttp3/Response$Builder
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: aload #4
    //   98: getfield protocol : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   101: invokevirtual protocol : (Lme/rerere/matrix/thirdparty/okhttp3/Protocol;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   104: aload #4
    //   106: getfield code : I
    //   109: invokevirtual code : (I)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   112: aload #4
    //   114: getfield message : Ljava/lang/String;
    //   117: invokevirtual message : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   120: aload_0
    //   121: getfield headersReader : Lme/rerere/matrix/thirdparty/okhttp3/internal/http1/HeadersReader;
    //   124: invokevirtual readHeaders : ()Lme/rerere/matrix/thirdparty/okhttp3/Headers;
    //   127: invokevirtual headers : (Lme/rerere/matrix/thirdparty/okhttp3/Headers;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   130: astore #5
    //   132: nop
    //   133: iload_1
    //   134: ifeq -> 165
    //   137: aload #4
    //   139: getfield code : I
    //   142: bipush #100
    //   144: if_icmpne -> 165
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aconst_null
    //   155: checkcast me/rerere/matrix/thirdparty/okhttp3/Response$Builder
    //   158: goto -> 196
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload #4
    //   167: getfield code : I
    //   170: bipush #100
    //   172: if_icmpne -> 189
    //   175: aload_0
    //   176: iconst_3
    //   177: putfield state : I
    //   180: aload #5
    //   182: goto -> 196
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: aload_0
    //   190: iconst_4
    //   191: putfield state : I
    //   194: aload #5
    //   196: areturn
    //   197: astore #4
    //   199: aload_0
    //   200: invokevirtual getConnection : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   203: invokevirtual route : ()Lme/rerere/matrix/thirdparty/okhttp3/Route;
    //   206: invokevirtual address : ()Lme/rerere/matrix/thirdparty/okhttp3/Address;
    //   209: invokevirtual url : ()Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl;
    //   212: invokevirtual redact : ()Ljava/lang/String;
    //   215: astore #5
    //   217: new java/io/IOException
    //   220: dup
    //   221: ldc_w 'unexpected end of stream on '
    //   224: aload #5
    //   226: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   229: aload #4
    //   231: checkcast java/lang/Throwable
    //   234: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   237: athrow
    // Exception table:
    //   from	to	target	type
    //   8	24	27	java/io/EOFException
    //   16	35	35	java/io/EOFException
    //   73	197	197	java/io/EOFException
    //   132	147	150	java/io/EOFException
    //   137	161	161	java/io/EOFException
    //   165	185	185	java/io/EOFException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http1\Http1ExchangeCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */