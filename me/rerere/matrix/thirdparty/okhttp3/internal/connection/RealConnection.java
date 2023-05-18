package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Address;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.CertificatePinner;
import me.rerere.matrix.thirdparty.okhttp3.Connection;
import me.rerere.matrix.thirdparty.okhttp3.ConnectionSpec;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.Handshake;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealInterceptorChain;
import me.rerere.matrix.thirdparty.okhttp3.internal.http1.Http1ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.ErrorCode;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.Http2Connection;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.Http2ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.Http2Stream;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.Settings;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.OkHostnameVerifier;
import me.rerere.matrix.thirdparty.okhttp3.internal.ws.RealWebSocket;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealConnection extends Http2Connection.Listener implements Connection {
  private int routeFailureCount;
  
  private long idleAtNs;
  
  @NotNull
  private static final String NPE_THROW_WITH_NULL = "throw with null exception";
  
  @Nullable
  private BufferedSink sink;
  
  @Nullable
  private Socket socket;
  
  private boolean noCoalescedConnections;
  
  public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
  
  @Nullable
  private Protocol protocol;
  
  @Nullable
  private Socket rawSocket;
  
  private boolean noNewExchanges;
  
  @Nullable
  private BufferedSource source;
  
  @NotNull
  private final List calls;
  
  @Nullable
  private Handshake handshake;
  
  private int refusedStreamCount;
  
  @NotNull
  public static final RealConnection$Companion Companion;
  
  private int allocationLimit;
  
  @Nullable
  private Http2Connection http2Connection;
  
  @NotNull
  private final Route route;
  
  private static final int MAX_TUNNEL_ATTEMPTS = 21;
  
  @NotNull
  private final RealConnectionPool connectionPool;
  
  private int successCount;
  
  private static final long a = o3.a(6808669863083568172L, -8320757728800773667L, MethodHandles.lookup().lookupClass()).a(254982258933915L);
  
  @NotNull
  public final List getCalls() {
    return this.calls;
  }
  
  static {
    Companion = new RealConnection$Companion(null);
  }
  
  @NotNull
  public final RealConnectionPool getConnectionPool() {
    return this.connectionPool;
  }
  
  @NotNull
  public Route route() {
    return this.route;
  }
  
  @Nullable
  public Handshake handshake() {
    return this.handshake;
  }
  
  @NotNull
  public final RealWebSocket.Streams newWebSocketStreams$okhttp(@NotNull Exchange paramExchange) throws SocketException {
    long l = a ^ 0x3822C94B93EAL;
    Intrinsics.checkNotNullParameter(paramExchange, "exchange");
    Intrinsics.checkNotNull(this.socket);
    Socket socket = this.socket;
    Intrinsics.checkNotNull(this.source);
    BufferedSource bufferedSource = this.source;
    Intrinsics.checkNotNull(this.sink);
    BufferedSink bufferedSink = this.sink;
    socket.setSoTimeout(0);
    noNewExchanges$okhttp();
    return new RealConnection$newWebSocketStreams$1(bufferedSource, bufferedSink, paramExchange);
  }
  
  @NotNull
  public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient paramOkHttpClient, @NotNull RealInterceptorChain paramRealInterceptorChain) throws SocketException {
    long l = a ^ 0x74D610CCD84CL;
    Intrinsics.checkNotNullParameter(paramOkHttpClient, "client");
    Intrinsics.checkNotNullParameter(paramRealInterceptorChain, "chain");
    Intrinsics.checkNotNull(this.socket);
    Socket socket = this.socket;
    Intrinsics.checkNotNull(this.source);
    BufferedSource bufferedSource = this.source;
    Intrinsics.checkNotNull(this.sink);
    BufferedSink bufferedSink = this.sink;
    Http2Connection http2Connection = this.http2Connection;
    try {
      socket.setSoTimeout(paramRealInterceptorChain.readTimeoutMillis());
      bufferedSource.timeout().timeout(paramRealInterceptorChain.getReadTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
      bufferedSink.timeout().timeout(paramRealInterceptorChain.getWriteTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
    } catch (SocketException socketException) {
      throw a(null);
    } 
    return (http2Connection != null) ? (ExchangeCodec)new Http2ExchangeCodec(paramOkHttpClient, this, paramRealInterceptorChain, http2Connection) : (ExchangeCodec)new Http1ExchangeCodec(paramOkHttpClient, this, bufferedSource, bufferedSink);
  }
  
  public final long getIdleAtNs$okhttp() {
    return this.idleAtNs;
  }
  
  public final boolean isMultiplexed$okhttp() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.http2Connection != null);
  }
  
  public void onStream(@NotNull Http2Stream paramHttp2Stream) throws IOException {
    long l = a ^ 0x5D90D392A98BL;
    Intrinsics.checkNotNullParameter(paramHttp2Stream, "stream");
    paramHttp2Stream.close(ErrorCode.REFUSED_STREAM, null);
  }
  
  public final synchronized void noCoalescedConnections$okhttp() {
    this.noCoalescedConnections = true;
  }
  
  public final synchronized void noNewExchanges$okhttp() {
    this.noNewExchanges = true;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x61F6D2A6BFC8L;
    try {
      if (this.handshake.cipherSuite() == null)
        this.handshake.cipherSuite(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return this.handshake.cipherSuite().append((this.handshake == null) ? "none" : "none").append(" protocol=").append(this.protocol).append('}').toString();
  }
  
  public final void setNoNewExchanges(boolean paramBoolean) {
    this.noNewExchanges = paramBoolean;
  }
  
  public final boolean getNoNewExchanges() {
    return this.noNewExchanges;
  }
  
  public RealConnection(@NotNull RealConnectionPool paramRealConnectionPool, @NotNull Route paramRoute) {
    this.connectionPool = paramRealConnectionPool;
    this.route = paramRoute;
    this.allocationLimit = 1;
    this.calls = new ArrayList();
    this.idleAtNs = Long.MAX_VALUE;
  }
  
  public final synchronized void trackFailure$okhttp(@NotNull RealCall paramRealCall, @Nullable IOException paramIOException) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection.a : J
    //   3: ldc2_w 15749457635833
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc_w 'call'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_2
    //   16: instanceof me/rerere/matrix/thirdparty/okhttp3/internal/http2/StreamResetException
    //   19: ifeq -> 143
    //   22: nop
    //   23: aload_2
    //   24: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/http2/StreamResetException
    //   27: getfield errorCode : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   30: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode.REFUSED_STREAM : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   33: if_acmpne -> 87
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: getfield refusedStreamCount : I
    //   47: istore #5
    //   49: aload_0
    //   50: iload #5
    //   52: iconst_1
    //   53: iadd
    //   54: putfield refusedStreamCount : I
    //   57: aload_0
    //   58: getfield refusedStreamCount : I
    //   61: iconst_1
    //   62: if_icmple -> 228
    //   65: aload_0
    //   66: iconst_1
    //   67: putfield noNewExchanges : Z
    //   70: aload_0
    //   71: getfield routeFailureCount : I
    //   74: istore #5
    //   76: aload_0
    //   77: iload #5
    //   79: iconst_1
    //   80: iadd
    //   81: putfield routeFailureCount : I
    //   84: goto -> 228
    //   87: aload_2
    //   88: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/http2/StreamResetException
    //   91: getfield errorCode : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   94: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode.CANCEL : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   97: if_acmpne -> 121
    //   100: aload_1
    //   101: invokevirtual isCanceled : ()Z
    //   104: ifeq -> 121
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: goto -> 228
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: iconst_1
    //   123: putfield noNewExchanges : Z
    //   126: aload_0
    //   127: getfield routeFailureCount : I
    //   130: istore #5
    //   132: aload_0
    //   133: iload #5
    //   135: iconst_1
    //   136: iadd
    //   137: putfield routeFailureCount : I
    //   140: goto -> 228
    //   143: aload_0
    //   144: invokevirtual isMultiplexed$okhttp : ()Z
    //   147: ifeq -> 164
    //   150: aload_2
    //   151: instanceof me/rerere/matrix/thirdparty/okhttp3/internal/http2/ConnectionShutdownException
    //   154: ifeq -> 228
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_0
    //   165: iconst_1
    //   166: putfield noNewExchanges : Z
    //   169: aload_0
    //   170: getfield successCount : I
    //   173: ifne -> 228
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_2
    //   184: ifnull -> 214
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload_0
    //   195: aload_1
    //   196: invokevirtual getClient : ()Lme/rerere/matrix/thirdparty/okhttp3/OkHttpClient;
    //   199: aload_0
    //   200: getfield route : Lme/rerere/matrix/thirdparty/okhttp3/Route;
    //   203: aload_2
    //   204: invokevirtual connectFailed$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/OkHttpClient;Lme/rerere/matrix/thirdparty/okhttp3/Route;Ljava/io/IOException;)V
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_0
    //   215: getfield routeFailureCount : I
    //   218: istore #5
    //   220: aload_0
    //   221: iload #5
    //   223: iconst_1
    //   224: iadd
    //   225: putfield routeFailureCount : I
    //   228: return
    // Exception table:
    //   from	to	target	type
    //   8	36	39	java/lang/NullPointerException
    //   87	107	110	java/lang/NullPointerException
    //   100	117	117	java/lang/NullPointerException
    //   143	157	160	java/lang/NullPointerException
    //   150	176	179	java/lang/NullPointerException
    //   164	187	190	java/lang/NullPointerException
    //   183	207	210	java/lang/NullPointerException
  }
  
  public final boolean isHealthy(boolean paramBoolean) {
    long l1 = a ^ 0x6612E613E243L;
    RealConnection realConnection = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(realConnection))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    long l2 = System.nanoTime();
    Intrinsics.checkNotNull(this.rawSocket);
    Socket socket1 = this.rawSocket;
    Intrinsics.checkNotNull(this.socket);
    Socket socket2 = this.socket;
    Intrinsics.checkNotNull(this.source);
    BufferedSource bufferedSource = this.source;
    try {
      if (!socket1.isClosed())
        try {
          if (!socket2.isClosed())
            try {
              if (!socket2.isInputShutdown())
                try {
                  if (!socket2.isOutputShutdown()) {
                    Http2Connection http2Connection = this.http2Connection;
                    try {
                      if (http2Connection != null)
                        return http2Connection.isHealthy(l2); 
                    } catch (NullPointerException nullPointerException) {
                      throw a(null);
                    } 
                    synchronized (this) {
                      boolean bool1 = false;
                      long l3 = l2 - getIdleAtNs$okhttp();
                    } 
                    long l = l3;
                    try {
                      if (l >= 10000000000L)
                        try {
                          if (paramBoolean)
                            return Util.isHealthy(socket2, bufferedSource); 
                        } catch (NullPointerException nullPointerException) {
                          throw a(null);
                        }  
                    } catch (NullPointerException nullPointerException) {
                      throw a(null);
                    } 
                    return true;
                  } 
                  return false;
                } catch (NullPointerException nullPointerException) {
                  throw a(null);
                }  
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public final void setIdleAtNs$okhttp(long paramLong) {
    this.idleAtNs = paramLong;
  }
  
  @NotNull
  public Protocol protocol() {
    Intrinsics.checkNotNull(this.protocol);
    return this.protocol;
  }
  
  public final void connect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, @NotNull Call paramCall, @NotNull EventListener paramEventListener) {
    long l = a ^ 0x479C0F166972L;
    try {
      Intrinsics.checkNotNullParameter(paramCall, "call");
      Intrinsics.checkNotNullParameter(paramEventListener, "eventListener");
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (!((this.protocol == null) ? 1 : 0)) {
      boolean bool = false;
      String str = "already connected";
      throw new IllegalStateException(str.toString());
    } 
    RouteException routeException = null;
    List list = this.route.address().connectionSpecs();
    ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
    try {
      if (this.route.address().sslSocketFactory() == null) {
        try {
          if (!list.contains(ConnectionSpec.CLEARTEXT))
            throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client")); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        String str = this.route.address().url().host();
        try {
          if (!Platform.Companion.get().isCleartextTrafficPermitted(str))
            throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy")); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        try {
          if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE))
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS")); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    while (true) {
      try {
        if (this.route.requiresTunnel()) {
          try {
            connectTunnel(paramInt1, paramInt2, paramInt3, paramCall, paramEventListener);
            if (this.rawSocket == null)
              break; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } else {
          connectSocket(paramInt1, paramInt2, paramCall, paramEventListener);
        } 
        establishProtocol(connectionSpecSelector, paramInt4, paramCall, paramEventListener);
        paramEventListener.connectEnd(paramCall, this.route.socketAddress(), this.route.proxy(), this.protocol);
        break;
      } catch (IOException iOException) {
        try {
          if (this.socket == null) {
          
          } else {
            Util.closeQuietly(this.socket);
          } 
        } catch (IOException iOException1) {
          throw a(null);
        } 
        try {
          if (this.rawSocket == null) {
          
          } else {
            Util.closeQuietly(this.rawSocket);
          } 
        } catch (IOException iOException1) {
          throw a(null);
        } 
        this.socket = null;
        this.rawSocket = null;
        this.source = null;
        this.sink = null;
        this.handshake = null;
        this.protocol = null;
        this.http2Connection = null;
        this.allocationLimit = 1;
        paramEventListener.connectFailed(paramCall, this.route.socketAddress(), this.route.proxy(), null, iOException);
        if (routeException == null) {
          routeException = new RouteException(iOException);
        } else {
          routeException.addConnectException(iOException);
        } 
        try {
          if (!paramBoolean || !connectionSpecSelector.connectionFailed(iOException))
            throw routeException; 
        } catch (IOException iOException1) {
          throw a(null);
        } 
      } 
    } 
    try {
      if (this.route.requiresTunnel())
        try {
          if (this.rawSocket == null)
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21")); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.idleAtNs = System.nanoTime();
  }
  
  public final int getRouteFailureCount$okhttp() {
    return this.routeFailureCount;
  }
  
  public final boolean isEligible$okhttp(@NotNull Address paramAddress, @Nullable List paramList) {
    long l = a ^ 0x5FFC3A68D7F3L;
    Intrinsics.checkNotNullParameter(paramAddress, "address");
    RealConnection realConnection = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(realConnection))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection); 
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        }  
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      if (this.calls.size() < this.allocationLimit) {
        try {
          if (this.noNewExchanges)
            return false; 
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      if (!this.route.address().equalsNonHost$okhttp(paramAddress))
        return false; 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      if (Intrinsics.areEqual(paramAddress.url().host(), route().address().url().host()))
        return true; 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      if (this.http2Connection == null)
        return false; 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      if (paramList != null)
        try {
          if (routeMatchesAny(paramList)) {
            try {
              if (paramAddress.hostnameVerifier() != OkHostnameVerifier.INSTANCE)
                return false; 
            } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
              throw a(null);
            } 
            try {
              if (!supportsUrl(paramAddress.url()))
                return false; 
            } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
              throw a(null);
            } 
            try {
              Intrinsics.checkNotNull(paramAddress.certificatePinner());
              Intrinsics.checkNotNull(handshake());
              paramAddress.certificatePinner().check(paramAddress.url().host(), handshake().peerCertificates());
            } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
              return false;
            } 
            return true;
          } 
          return false;
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        }  
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    return false;
  }
  
  public synchronized void onSettings(@NotNull Http2Connection paramHttp2Connection, @NotNull Settings paramSettings) {
    long l = a ^ 0x35991C4A9CE1L;
    Intrinsics.checkNotNullParameter(paramHttp2Connection, "connection");
    Intrinsics.checkNotNullParameter(paramSettings, "settings");
    this.allocationLimit = paramSettings.getMaxConcurrentStreams();
  }
  
  public final void cancel() {
    try {
      if (this.rawSocket == null) {
      
      } else {
        Util.closeQuietly(this.rawSocket);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public final synchronized void incrementSuccessCount$okhttp() {
    int i = this.successCount;
    this.successCount = i + 1;
  }
  
  public final void connectFailed$okhttp(@NotNull OkHttpClient paramOkHttpClient, @NotNull Route paramRoute, @NotNull IOException paramIOException) {
    long l = a ^ 0x267CAF4BC7AFL;
    Intrinsics.checkNotNullParameter(paramOkHttpClient, "client");
    Intrinsics.checkNotNullParameter(paramRoute, "failedRoute");
    Intrinsics.checkNotNullParameter(paramIOException, "failure");
    if (paramRoute.proxy().type() != Proxy.Type.DIRECT) {
      Address address = paramRoute.address();
      address.proxySelector().connectFailed(address.url().uri(), paramRoute.proxy().address(), paramIOException);
    } 
    paramOkHttpClient.getRouteDatabase().failed(paramRoute);
  }
  
  public final void setRouteFailureCount$okhttp(int paramInt) {
    this.routeFailureCount = paramInt;
  }
  
  @NotNull
  public Socket socket() {
    Intrinsics.checkNotNull(this.socket);
    return this.socket;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */