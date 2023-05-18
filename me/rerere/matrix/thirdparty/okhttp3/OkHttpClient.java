package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RouteDatabase;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.ws.RealWebSocket;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class OkHttpClient implements Cloneable, Call$Factory, WebSocket$Factory {
  @Nullable
  private final X509TrustManager x509TrustManager;
  
  @NotNull
  private static final List DEFAULT_CONNECTION_SPECS;
  
  @NotNull
  private final ConnectionPool connectionPool;
  
  @NotNull
  private final Dispatcher dispatcher;
  
  @NotNull
  private final Dns dns;
  
  @NotNull
  private final List interceptors;
  
  @NotNull
  private final SocketFactory socketFactory;
  
  @NotNull
  private final RouteDatabase routeDatabase;
  
  @NotNull
  private final CookieJar cookieJar;
  
  @Nullable
  private final CertificateChainCleaner certificateChainCleaner;
  
  @Nullable
  private final Cache cache;
  
  private final int connectTimeoutMillis;
  
  private final boolean followSslRedirects;
  
  private final int callTimeoutMillis;
  
  private final long minWebSocketMessageToCompress;
  
  private final boolean retryOnConnectionFailure;
  
  @NotNull
  private final Authenticator authenticator;
  
  @NotNull
  private final EventListener$Factory eventListenerFactory;
  
  @NotNull
  private final ProxySelector proxySelector;
  
  private final int pingIntervalMillis;
  
  @NotNull
  private final List connectionSpecs;
  
  private final boolean followRedirects;
  
  @Nullable
  private final Proxy proxy;
  
  @NotNull
  private final HostnameVerifier hostnameVerifier;
  
  private final int writeTimeoutMillis;
  
  private final int readTimeoutMillis;
  
  @NotNull
  private static final List DEFAULT_PROTOCOLS;
  
  @NotNull
  private final List networkInterceptors;
  
  @NotNull
  public static final OkHttpClient$Companion Companion;
  
  @NotNull
  private final CertificatePinner certificatePinner;
  
  @Nullable
  private final SSLSocketFactory sslSocketFactoryOrNull;
  
  @NotNull
  private final List protocols;
  
  @NotNull
  private final Authenticator proxyAuthenticator;
  
  private static final long a = o3.a(2960594185364008403L, -6947099930191984247L, MethodHandles.lookup().lookupClass()).a(259747240036578L);
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final EventListener$Factory -deprecated_eventListenerFactory() {
    return this.eventListenerFactory;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final SSLSocketFactory -deprecated_sslSocketFactory() {
    return sslSocketFactory();
  }
  
  public final int writeTimeoutMillis() {
    return this.writeTimeoutMillis;
  }
  
  @NotNull
  public final ProxySelector proxySelector() {
    return this.proxySelector;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_pingIntervalMillis() {
    return this.pingIntervalMillis;
  }
  
  @NotNull
  public final List connectionSpecs() {
    return this.connectionSpecs;
  }
  
  @NotNull
  public final CertificatePinner certificatePinner() {
    return this.certificatePinner;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final CookieJar -deprecated_cookieJar() {
    return this.cookieJar;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Dispatcher -deprecated_dispatcher() {
    return this.dispatcher;
  }
  
  @NotNull
  public final List networkInterceptors() {
    return this.networkInterceptors;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_networkInterceptors() {
    return this.networkInterceptors;
  }
  
  @NotNull
  public OkHttpClient$Builder newBuilder() {
    return new OkHttpClient$Builder(this);
  }
  
  @NotNull
  public final List protocols() {
    return this.protocols;
  }
  
  public final int callTimeoutMillis() {
    return this.callTimeoutMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_protocols() {
    return this.protocols;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_writeTimeoutMillis() {
    return this.writeTimeoutMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_interceptors() {
    return this.interceptors;
  }
  
  public final boolean followSslRedirects() {
    return this.followSslRedirects;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_connectTimeoutMillis() {
    return this.connectTimeoutMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_followSslRedirects() {
    return this.followSslRedirects;
  }
  
  @NotNull
  public final List interceptors() {
    return this.interceptors;
  }
  
  @NotNull
  public final ConnectionPool connectionPool() {
    return this.connectionPool;
  }
  
  public final boolean followRedirects() {
    return this.followRedirects;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_callTimeoutMillis() {
    return this.callTimeoutMillis;
  }
  
  @NotNull
  public final RouteDatabase getRouteDatabase() {
    return this.routeDatabase;
  }
  
  @NotNull
  public final Dns dns() {
    return this.dns;
  }
  
  @NotNull
  public final HostnameVerifier hostnameVerifier() {
    return this.hostnameVerifier;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final SocketFactory -deprecated_socketFactory() {
    return this.socketFactory;
  }
  
  @NotNull
  public final Authenticator authenticator() {
    return this.authenticator;
  }
  
  @NotNull
  public final EventListener$Factory eventListenerFactory() {
    return this.eventListenerFactory;
  }
  
  @Nullable
  public final Proxy proxy() {
    return this.proxy;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_readTimeoutMillis() {
    return this.readTimeoutMillis;
  }
  
  @Nullable
  public final CertificateChainCleaner certificateChainCleaner() {
    return this.certificateChainCleaner;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final CertificatePinner -deprecated_certificatePinner() {
    return this.certificatePinner;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_connectionSpecs() {
    return this.connectionSpecs;
  }
  
  @NotNull
  public Object clone() {
    return super.clone();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Authenticator -deprecated_proxyAuthenticator() {
    return this.proxyAuthenticator;
  }
  
  @NotNull
  public final Authenticator proxyAuthenticator() {
    return this.proxyAuthenticator;
  }
  
  static {
    Companion = new OkHttpClient$Companion(null);
    Protocol[] arrayOfProtocol = new Protocol[2];
    arrayOfProtocol[0] = Protocol.HTTP_2;
    arrayOfProtocol[1] = Protocol.HTTP_1_1;
    DEFAULT_PROTOCOLS = Util.immutableListOf((Object[])arrayOfProtocol);
    ConnectionSpec[] arrayOfConnectionSpec = new ConnectionSpec[2];
    arrayOfConnectionSpec[0] = ConnectionSpec.MODERN_TLS;
    arrayOfConnectionSpec[1] = ConnectionSpec.CLEARTEXT;
    DEFAULT_CONNECTION_SPECS = Util.immutableListOf((Object[])arrayOfConnectionSpec);
  }
  
  @NotNull
  public WebSocket newWebSocket(@NotNull Request paramRequest, @NotNull WebSocketListener paramWebSocketListener) {
    long l = a ^ 0x455FF9596178L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    Intrinsics.checkNotNullParameter(paramWebSocketListener, "listener");
    RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, paramRequest, paramWebSocketListener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
    realWebSocket.connect(this);
    return (WebSocket)realWebSocket;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_followRedirects() {
    return this.followRedirects;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Dns -deprecated_dns() {
    return this.dns;
  }
  
  @NotNull
  public Call newCall(@NotNull Request paramRequest) {
    long l = a ^ 0x47403CF2049CL;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    return (Call)new RealCall(this, paramRequest, false);
  }
  
  @NotNull
  public final SocketFactory socketFactory() {
    return this.socketFactory;
  }
  
  public final int connectTimeoutMillis() {
    return this.connectTimeoutMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ProxySelector -deprecated_proxySelector() {
    return this.proxySelector;
  }
  
  public final int readTimeoutMillis() {
    return this.readTimeoutMillis;
  }
  
  public OkHttpClient() {
    this(new OkHttpClient$Builder());
  }
  
  @Nullable
  public final X509TrustManager x509TrustManager() {
    return this.x509TrustManager;
  }
  
  @NotNull
  public final CookieJar cookieJar() {
    return this.cookieJar;
  }
  
  @NotNull
  public final Dispatcher dispatcher() {
    return this.dispatcher;
  }
  
  public OkHttpClient(@NotNull OkHttpClient$Builder paramOkHttpClient$Builder) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/OkHttpClient.a : J
    //   3: ldc2_w 7713930834132
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc_w 'builder'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokespecial <init> : ()V
    //   19: aload_0
    //   20: aload_1
    //   21: invokevirtual getDispatcher$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/Dispatcher;
    //   24: putfield dispatcher : Lme/rerere/matrix/thirdparty/okhttp3/Dispatcher;
    //   27: aload_0
    //   28: aload_1
    //   29: invokevirtual getConnectionPool$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/ConnectionPool;
    //   32: putfield connectionPool : Lme/rerere/matrix/thirdparty/okhttp3/ConnectionPool;
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual getInterceptors$okhttp : ()Ljava/util/List;
    //   40: invokestatic toImmutableList : (Ljava/util/List;)Ljava/util/List;
    //   43: putfield interceptors : Ljava/util/List;
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual getNetworkInterceptors$okhttp : ()Ljava/util/List;
    //   51: invokestatic toImmutableList : (Ljava/util/List;)Ljava/util/List;
    //   54: putfield networkInterceptors : Ljava/util/List;
    //   57: aload_0
    //   58: aload_1
    //   59: invokevirtual getEventListenerFactory$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/EventListener$Factory;
    //   62: putfield eventListenerFactory : Lme/rerere/matrix/thirdparty/okhttp3/EventListener$Factory;
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual getRetryOnConnectionFailure$okhttp : ()Z
    //   70: putfield retryOnConnectionFailure : Z
    //   73: aload_0
    //   74: aload_1
    //   75: invokevirtual getAuthenticator$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/Authenticator;
    //   78: putfield authenticator : Lme/rerere/matrix/thirdparty/okhttp3/Authenticator;
    //   81: aload_0
    //   82: aload_1
    //   83: invokevirtual getFollowRedirects$okhttp : ()Z
    //   86: putfield followRedirects : Z
    //   89: aload_0
    //   90: aload_1
    //   91: invokevirtual getFollowSslRedirects$okhttp : ()Z
    //   94: putfield followSslRedirects : Z
    //   97: aload_0
    //   98: aload_1
    //   99: invokevirtual getCookieJar$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/CookieJar;
    //   102: putfield cookieJar : Lme/rerere/matrix/thirdparty/okhttp3/CookieJar;
    //   105: aload_0
    //   106: aload_1
    //   107: invokevirtual getCache$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/Cache;
    //   110: putfield cache : Lme/rerere/matrix/thirdparty/okhttp3/Cache;
    //   113: aload_0
    //   114: aload_1
    //   115: invokevirtual getDns$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/Dns;
    //   118: putfield dns : Lme/rerere/matrix/thirdparty/okhttp3/Dns;
    //   121: aload_0
    //   122: aload_1
    //   123: invokevirtual getProxy$okhttp : ()Ljava/net/Proxy;
    //   126: putfield proxy : Ljava/net/Proxy;
    //   129: aload_0
    //   130: aload_1
    //   131: invokevirtual getProxy$okhttp : ()Ljava/net/Proxy;
    //   134: ifnull -> 146
    //   137: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/proxy/NullProxySelector.INSTANCE : Lme/rerere/matrix/thirdparty/okhttp3/internal/proxy/NullProxySelector;
    //   140: checkcast java/net/ProxySelector
    //   143: goto -> 183
    //   146: aload_1
    //   147: invokevirtual getProxySelector$okhttp : ()Ljava/net/ProxySelector;
    //   150: dup
    //   151: ifnonnull -> 165
    //   154: pop
    //   155: invokestatic getDefault : ()Ljava/net/ProxySelector;
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   164: athrow
    //   165: dup
    //   166: ifnonnull -> 183
    //   169: pop
    //   170: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/proxy/NullProxySelector.INSTANCE : Lme/rerere/matrix/thirdparty/okhttp3/internal/proxy/NullProxySelector;
    //   173: checkcast java/net/ProxySelector
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   182: athrow
    //   183: putfield proxySelector : Ljava/net/ProxySelector;
    //   186: aload_0
    //   187: aload_1
    //   188: invokevirtual getProxyAuthenticator$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/Authenticator;
    //   191: putfield proxyAuthenticator : Lme/rerere/matrix/thirdparty/okhttp3/Authenticator;
    //   194: aload_0
    //   195: aload_1
    //   196: invokevirtual getSocketFactory$okhttp : ()Ljavax/net/SocketFactory;
    //   199: putfield socketFactory : Ljavax/net/SocketFactory;
    //   202: aload_0
    //   203: aload_1
    //   204: invokevirtual getConnectionSpecs$okhttp : ()Ljava/util/List;
    //   207: putfield connectionSpecs : Ljava/util/List;
    //   210: aload_0
    //   211: aload_1
    //   212: invokevirtual getProtocols$okhttp : ()Ljava/util/List;
    //   215: putfield protocols : Ljava/util/List;
    //   218: aload_0
    //   219: aload_1
    //   220: invokevirtual getHostnameVerifier$okhttp : ()Ljavax/net/ssl/HostnameVerifier;
    //   223: putfield hostnameVerifier : Ljavax/net/ssl/HostnameVerifier;
    //   226: aload_0
    //   227: aload_1
    //   228: invokevirtual getCallTimeout$okhttp : ()I
    //   231: putfield callTimeoutMillis : I
    //   234: aload_0
    //   235: aload_1
    //   236: invokevirtual getConnectTimeout$okhttp : ()I
    //   239: putfield connectTimeoutMillis : I
    //   242: aload_0
    //   243: aload_1
    //   244: invokevirtual getReadTimeout$okhttp : ()I
    //   247: putfield readTimeoutMillis : I
    //   250: aload_0
    //   251: aload_1
    //   252: invokevirtual getWriteTimeout$okhttp : ()I
    //   255: putfield writeTimeoutMillis : I
    //   258: aload_0
    //   259: aload_1
    //   260: invokevirtual getPingInterval$okhttp : ()I
    //   263: putfield pingIntervalMillis : I
    //   266: aload_0
    //   267: aload_1
    //   268: invokevirtual getMinWebSocketMessageToCompress$okhttp : ()J
    //   271: putfield minWebSocketMessageToCompress : J
    //   274: aload_0
    //   275: aload_1
    //   276: invokevirtual getRouteDatabase$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RouteDatabase;
    //   279: dup
    //   280: ifnonnull -> 298
    //   283: pop
    //   284: new me/rerere/matrix/thirdparty/okhttp3/internal/connection/RouteDatabase
    //   287: dup
    //   288: invokespecial <init> : ()V
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   297: athrow
    //   298: putfield routeDatabase : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RouteDatabase;
    //   301: nop
    //   302: aload_0
    //   303: getfield connectionSpecs : Ljava/util/List;
    //   306: checkcast java/lang/Iterable
    //   309: astore #4
    //   311: iconst_0
    //   312: istore #5
    //   314: aload #4
    //   316: instanceof java/util/Collection
    //   319: ifeq -> 350
    //   322: aload #4
    //   324: checkcast java/util/Collection
    //   327: invokeinterface isEmpty : ()Z
    //   332: ifeq -> 350
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   341: athrow
    //   342: iconst_1
    //   343: goto -> 401
    //   346: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   349: athrow
    //   350: aload #4
    //   352: invokeinterface iterator : ()Ljava/util/Iterator;
    //   357: astore #6
    //   359: aload #6
    //   361: invokeinterface hasNext : ()Z
    //   366: ifeq -> 400
    //   369: aload #6
    //   371: invokeinterface next : ()Ljava/lang/Object;
    //   376: astore #7
    //   378: aload #7
    //   380: checkcast me/rerere/matrix/thirdparty/okhttp3/ConnectionSpec
    //   383: astore #8
    //   385: iconst_0
    //   386: istore #9
    //   388: aload #8
    //   390: invokevirtual isTls : ()Z
    //   393: ifeq -> 359
    //   396: iconst_0
    //   397: goto -> 401
    //   400: iconst_1
    //   401: ifeq -> 433
    //   404: aload_0
    //   405: aconst_null
    //   406: putfield sslSocketFactoryOrNull : Ljavax/net/ssl/SSLSocketFactory;
    //   409: aload_0
    //   410: aconst_null
    //   411: putfield certificateChainCleaner : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   414: aload_0
    //   415: aconst_null
    //   416: putfield x509TrustManager : Ljavax/net/ssl/X509TrustManager;
    //   419: aload_0
    //   420: getstatic me/rerere/matrix/thirdparty/okhttp3/CertificatePinner.DEFAULT : Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   423: putfield certificatePinner : Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   426: goto -> 569
    //   429: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   432: athrow
    //   433: aload_1
    //   434: invokevirtual getSslSocketFactoryOrNull$okhttp : ()Ljavax/net/ssl/SSLSocketFactory;
    //   437: ifnull -> 498
    //   440: aload_0
    //   441: aload_1
    //   442: invokevirtual getSslSocketFactoryOrNull$okhttp : ()Ljavax/net/ssl/SSLSocketFactory;
    //   445: putfield sslSocketFactoryOrNull : Ljavax/net/ssl/SSLSocketFactory;
    //   448: aload_0
    //   449: aload_1
    //   450: invokevirtual getCertificateChainCleaner$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   453: dup
    //   454: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   457: putfield certificateChainCleaner : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   460: aload_0
    //   461: aload_1
    //   462: invokevirtual getX509TrustManagerOrNull$okhttp : ()Ljavax/net/ssl/X509TrustManager;
    //   465: dup
    //   466: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   469: putfield x509TrustManager : Ljavax/net/ssl/X509TrustManager;
    //   472: aload_0
    //   473: aload_1
    //   474: invokevirtual getCertificatePinner$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   477: aload_0
    //   478: getfield certificateChainCleaner : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   481: dup
    //   482: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   485: invokevirtual withCertificateChainCleaner$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;)Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   488: putfield certificatePinner : Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   491: goto -> 569
    //   494: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   497: athrow
    //   498: aload_0
    //   499: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform$Companion;
    //   502: invokevirtual get : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform;
    //   505: invokevirtual platformTrustManager : ()Ljavax/net/ssl/X509TrustManager;
    //   508: putfield x509TrustManager : Ljavax/net/ssl/X509TrustManager;
    //   511: aload_0
    //   512: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform$Companion;
    //   515: invokevirtual get : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform;
    //   518: aload_0
    //   519: getfield x509TrustManager : Ljavax/net/ssl/X509TrustManager;
    //   522: dup
    //   523: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   526: invokevirtual newSslSocketFactory : (Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    //   529: putfield sslSocketFactoryOrNull : Ljavax/net/ssl/SSLSocketFactory;
    //   532: aload_0
    //   533: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner$Companion;
    //   536: aload_0
    //   537: getfield x509TrustManager : Ljavax/net/ssl/X509TrustManager;
    //   540: dup
    //   541: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   544: invokevirtual get : (Ljavax/net/ssl/X509TrustManager;)Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   547: putfield certificateChainCleaner : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   550: aload_0
    //   551: aload_1
    //   552: invokevirtual getCertificatePinner$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   555: aload_0
    //   556: getfield certificateChainCleaner : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;
    //   559: dup
    //   560: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   563: invokevirtual withCertificateChainCleaner$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/CertificateChainCleaner;)Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   566: putfield certificatePinner : Lme/rerere/matrix/thirdparty/okhttp3/CertificatePinner;
    //   569: aload_0
    //   570: invokespecial verifyClientState : ()V
    //   573: nop
    //   574: return
    // Exception table:
    //   from	to	target	type
    //   146	158	161	java/lang/IllegalStateException
    //   165	176	179	java/lang/IllegalStateException
    //   183	291	294	java/lang/IllegalStateException
    //   314	335	338	java/lang/IllegalStateException
    //   322	346	346	java/lang/IllegalStateException
    //   401	429	429	java/lang/IllegalStateException
    //   433	494	494	java/lang/IllegalStateException
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ConnectionPool -deprecated_connectionPool() {
    return this.connectionPool;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Proxy -deprecated_proxy() {
    return this.proxy;
  }
  
  @NotNull
  public final SSLSocketFactory sslSocketFactory() {
    long l = a ^ 0x2097E748984CL;
    try {
      if (this.sslSocketFactoryOrNull == null)
        throw new IllegalStateException("CLEARTEXT-only client"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.sslSocketFactoryOrNull;
  }
  
  public final boolean retryOnConnectionFailure() {
    return this.retryOnConnectionFailure;
  }
  
  public final long minWebSocketMessageToCompress() {
    return this.minWebSocketMessageToCompress;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Authenticator -deprecated_authenticator() {
    return this.authenticator;
  }
  
  public final int pingIntervalMillis() {
    return this.pingIntervalMillis;
  }
  
  @Nullable
  public final Cache cache() {
    return this.cache;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final HostnameVerifier -deprecated_hostnameVerifier() {
    return this.hostnameVerifier;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cache", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Cache -deprecated_cache() {
    return this.cache;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_retryOnConnectionFailure() {
    return this.retryOnConnectionFailure;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\OkHttpClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */