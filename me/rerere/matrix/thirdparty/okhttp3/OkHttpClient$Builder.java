package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RouteDatabase;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.OkHostnameVerifier;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class OkHttpClient$Builder {
  private boolean followRedirects = true;
  
  @NotNull
  private CookieJar cookieJar = CookieJar.NO_COOKIES;
  
  @NotNull
  private final List networkInterceptors = new ArrayList();
  
  private int pingInterval;
  
  @NotNull
  private HostnameVerifier hostnameVerifier;
  
  @NotNull
  private Authenticator authenticator = Authenticator.NONE;
  
  @Nullable
  private Cache cache;
  
  private long minWebSocketMessageToCompress;
  
  private boolean retryOnConnectionFailure = true;
  
  @NotNull
  private EventListener$Factory eventListenerFactory = Util.asFactory(EventListener.NONE);
  
  @Nullable
  private ProxySelector proxySelector;
  
  @NotNull
  private Dns dns = Dns.SYSTEM;
  
  @Nullable
  private CertificateChainCleaner certificateChainCleaner;
  
  @Nullable
  private SSLSocketFactory sslSocketFactoryOrNull;
  
  @NotNull
  private CertificatePinner certificatePinner;
  
  @Nullable
  private X509TrustManager x509TrustManagerOrNull;
  
  private boolean followSslRedirects = true;
  
  @Nullable
  private RouteDatabase routeDatabase;
  
  @NotNull
  private Dispatcher dispatcher = new Dispatcher();
  
  private int callTimeout;
  
  private int connectTimeout;
  
  @NotNull
  private Authenticator proxyAuthenticator = Authenticator.NONE;
  
  @NotNull
  private final List interceptors = new ArrayList();
  
  @NotNull
  private ConnectionPool connectionPool = new ConnectionPool();
  
  private int writeTimeout;
  
  private int readTimeout;
  
  @NotNull
  private List connectionSpecs;
  
  @Nullable
  private Proxy proxy;
  
  @NotNull
  private List protocols;
  
  @NotNull
  private SocketFactory socketFactory;
  
  private static final long a = o3.a(8548047587665050608L, -8845980642192338563L, MethodHandles.lookup().lookupClass()).a(15307476865850L);
  
  @NotNull
  public final OkHttpClient$Builder certificatePinner(@NotNull CertificatePinner paramCertificatePinner) {
    long l = a ^ 0x2F46A0EC94B4L;
    Intrinsics.checkNotNullParameter(paramCertificatePinner, "certificatePinner");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramCertificatePinner, okHttpClient$Builder2.getCertificatePinner$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setCertificatePinner$okhttp(paramCertificatePinner);
    return okHttpClient$Builder1;
  }
  
  public final OkHttpClient$Builder writeTimeout(@NotNull Duration paramDuration) {
    long l = a ^ 0x28A46ED6D6BFL;
    Intrinsics.checkNotNullParameter(paramDuration, "duration");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.writeTimeout(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
    return okHttpClient$Builder1;
  }
  
  public final int getConnectTimeout$okhttp() {
    return this.connectTimeout;
  }
  
  public final int getPingInterval$okhttp() {
    return this.pingInterval;
  }
  
  public final void setSocketFactory$okhttp(@NotNull SocketFactory paramSocketFactory) {
    long l = a ^ 0x4817BC4AC557L;
    Intrinsics.checkNotNullParameter(paramSocketFactory, "<set-?>");
    this.socketFactory = paramSocketFactory;
  }
  
  @NotNull
  public final OkHttpClient$Builder followRedirects(boolean paramBoolean) {
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setFollowRedirects$okhttp(paramBoolean);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient build() {
    return new OkHttpClient(this);
  }
  
  public final void setFollowSslRedirects$okhttp(boolean paramBoolean) {
    this.followSslRedirects = paramBoolean;
  }
  
  @NotNull
  public final OkHttpClient$Builder callTimeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x1801E7B6701CL;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setCallTimeout$okhttp(Util.checkDuration("timeout", paramLong, paramTimeUnit));
    return okHttpClient$Builder1;
  }
  
  public final int getCallTimeout$okhttp() {
    return this.callTimeout;
  }
  
  public OkHttpClient$Builder(@NotNull OkHttpClient paramOkHttpClient) {
    this();
    this.dispatcher = paramOkHttpClient.dispatcher();
    this.connectionPool = paramOkHttpClient.connectionPool();
    CollectionsKt.addAll(this.interceptors, paramOkHttpClient.interceptors());
    CollectionsKt.addAll(this.networkInterceptors, paramOkHttpClient.networkInterceptors());
    this.eventListenerFactory = paramOkHttpClient.eventListenerFactory();
    this.retryOnConnectionFailure = paramOkHttpClient.retryOnConnectionFailure();
    this.authenticator = paramOkHttpClient.authenticator();
    this.followRedirects = paramOkHttpClient.followRedirects();
    this.followSslRedirects = paramOkHttpClient.followSslRedirects();
    this.cookieJar = paramOkHttpClient.cookieJar();
    this.cache = paramOkHttpClient.cache();
    this.dns = paramOkHttpClient.dns();
    this.proxy = paramOkHttpClient.proxy();
    this.proxySelector = paramOkHttpClient.proxySelector();
    this.proxyAuthenticator = paramOkHttpClient.proxyAuthenticator();
    this.socketFactory = paramOkHttpClient.socketFactory();
    this.sslSocketFactoryOrNull = OkHttpClient.access$getSslSocketFactoryOrNull$p(paramOkHttpClient);
    this.x509TrustManagerOrNull = paramOkHttpClient.x509TrustManager();
    this.connectionSpecs = paramOkHttpClient.connectionSpecs();
    this.protocols = paramOkHttpClient.protocols();
    this.hostnameVerifier = paramOkHttpClient.hostnameVerifier();
    this.certificatePinner = paramOkHttpClient.certificatePinner();
    this.certificateChainCleaner = paramOkHttpClient.certificateChainCleaner();
    this.callTimeout = paramOkHttpClient.callTimeoutMillis();
    this.connectTimeout = paramOkHttpClient.connectTimeoutMillis();
    this.readTimeout = paramOkHttpClient.readTimeoutMillis();
    this.writeTimeout = paramOkHttpClient.writeTimeoutMillis();
    this.pingInterval = paramOkHttpClient.pingIntervalMillis();
    this.minWebSocketMessageToCompress = paramOkHttpClient.minWebSocketMessageToCompress();
    this.routeDatabase = paramOkHttpClient.getRouteDatabase();
  }
  
  public final void setConnectTimeout$okhttp(int paramInt) {
    this.connectTimeout = paramInt;
  }
  
  public final void setWriteTimeout$okhttp(int paramInt) {
    this.writeTimeout = paramInt;
  }
  
  public final void setRetryOnConnectionFailure$okhttp(boolean paramBoolean) {
    this.retryOnConnectionFailure = paramBoolean;
  }
  
  @NotNull
  public final OkHttpClient$Builder -addInterceptor(@NotNull Function1 paramFunction1) {
    long l = a ^ 0x853B25B0D2DL;
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    boolean bool = false;
    return addInterceptor(new OkHttpClient$Builder$addInterceptor$2(paramFunction1));
  }
  
  @NotNull
  public final OkHttpClient$Builder cookieJar(@NotNull CookieJar paramCookieJar) {
    long l = a ^ 0x2715212174A6L;
    Intrinsics.checkNotNullParameter(paramCookieJar, "cookieJar");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setCookieJar$okhttp(paramCookieJar);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder minWebSocketMessageToCompress(long paramLong) {
    long l = a ^ 0x46C339A5C6A3L;
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!((paramLong >= 0L) ? 1 : 0)) {
        boolean bool1 = false;
        String str = Intrinsics.stringPlus("minWebSocketMessageToCompress must be positive: ", Long.valueOf(paramLong));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setMinWebSocketMessageToCompress$okhttp(paramLong);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final Dns getDns$okhttp() {
    return this.dns;
  }
  
  @NotNull
  public final OkHttpClient$Builder proxySelector(@NotNull ProxySelector paramProxySelector) {
    long l = a ^ 0x45950580BCAEL;
    Intrinsics.checkNotNullParameter(paramProxySelector, "proxySelector");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramProxySelector, okHttpClient$Builder2.getProxySelector$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setProxySelector$okhttp(paramProxySelector);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder eventListener(@NotNull EventListener paramEventListener) {
    long l = a ^ 0x6632162AEE18L;
    Intrinsics.checkNotNullParameter(paramEventListener, "eventListener");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setEventListenerFactory$okhttp(Util.asFactory(paramEventListener));
    return okHttpClient$Builder1;
  }
  
  @Nullable
  public final ProxySelector getProxySelector$okhttp() {
    return this.proxySelector;
  }
  
  @NotNull
  public final OkHttpClient$Builder retryOnConnectionFailure(boolean paramBoolean) {
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setRetryOnConnectionFailure$okhttp(paramBoolean);
    return okHttpClient$Builder1;
  }
  
  public final OkHttpClient$Builder readTimeout(@NotNull Duration paramDuration) {
    long l = a ^ 0x24270D6C30B1L;
    Intrinsics.checkNotNullParameter(paramDuration, "duration");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.readTimeout(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder hostnameVerifier(@NotNull HostnameVerifier paramHostnameVerifier) {
    long l = a ^ 0x7C58B9241B4AL;
    Intrinsics.checkNotNullParameter(paramHostnameVerifier, "hostnameVerifier");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramHostnameVerifier, okHttpClient$Builder2.getHostnameVerifier$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setHostnameVerifier$okhttp(paramHostnameVerifier);
    return okHttpClient$Builder1;
  }
  
  public final OkHttpClient$Builder connectTimeout(@NotNull Duration paramDuration) {
    long l = a ^ 0x23E7390F42B9L;
    Intrinsics.checkNotNullParameter(paramDuration, "duration");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.connectTimeout(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final Authenticator getAuthenticator$okhttp() {
    return this.authenticator;
  }
  
  public final void setCertificatePinner$okhttp(@NotNull CertificatePinner paramCertificatePinner) {
    long l = a ^ 0x4BDA2D4B2823L;
    Intrinsics.checkNotNullParameter(paramCertificatePinner, "<set-?>");
    this.certificatePinner = paramCertificatePinner;
  }
  
  public final void setCallTimeout$okhttp(int paramInt) {
    this.callTimeout = paramInt;
  }
  
  @NotNull
  public final OkHttpClient$Builder writeTimeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x5C1DBAB700F4L;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setWriteTimeout$okhttp(Util.checkDuration("timeout", paramLong, paramTimeUnit));
    return okHttpClient$Builder1;
  }
  
  public final void setAuthenticator$okhttp(@NotNull Authenticator paramAuthenticator) {
    long l = a ^ 0x54A964561A31L;
    Intrinsics.checkNotNullParameter(paramAuthenticator, "<set-?>");
    this.authenticator = paramAuthenticator;
  }
  
  @NotNull
  public final OkHttpClient$Builder dns(@NotNull Dns paramDns) {
    long l = a ^ 0x66889D0BB087L;
    Intrinsics.checkNotNullParameter(paramDns, "dns");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramDns, okHttpClient$Builder2.getDns$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setDns$okhttp(paramDns);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final ConnectionPool getConnectionPool$okhttp() {
    return this.connectionPool;
  }
  
  @NotNull
  public final List interceptors() {
    return this.interceptors;
  }
  
  @NotNull
  public final List getConnectionSpecs$okhttp() {
    return this.connectionSpecs;
  }
  
  @NotNull
  public final List getNetworkInterceptors$okhttp() {
    return this.networkInterceptors;
  }
  
  @NotNull
  public final List networkInterceptors() {
    return this.networkInterceptors;
  }
  
  @NotNull
  public final CookieJar getCookieJar$okhttp() {
    return this.cookieJar;
  }
  
  public final void setConnectionPool$okhttp(@NotNull ConnectionPool paramConnectionPool) {
    long l = a ^ 0x67E77445242DL;
    Intrinsics.checkNotNullParameter(paramConnectionPool, "<set-?>");
    this.connectionPool = paramConnectionPool;
  }
  
  @NotNull
  public final OkHttpClient$Builder proxy(@Nullable Proxy paramProxy) {
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramProxy, okHttpClient$Builder2.getProxy$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setProxy$okhttp(paramProxy);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder proxyAuthenticator(@NotNull Authenticator paramAuthenticator) {
    long l = a ^ 0x16078CFE7E1L;
    Intrinsics.checkNotNullParameter(paramAuthenticator, "proxyAuthenticator");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramAuthenticator, okHttpClient$Builder2.getProxyAuthenticator$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setProxyAuthenticator$okhttp(paramAuthenticator);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder followSslRedirects(boolean paramBoolean) {
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setFollowSslRedirects$okhttp(paramBoolean);
    return okHttpClient$Builder1;
  }
  
  public final void setConnectionSpecs$okhttp(@NotNull List paramList) {
    long l = a ^ 0x7B23578DBDA9L;
    Intrinsics.checkNotNullParameter(paramList, "<set-?>");
    this.connectionSpecs = paramList;
  }
  
  @NotNull
  public final List getInterceptors$okhttp() {
    return this.interceptors;
  }
  
  public final int getWriteTimeout$okhttp() {
    return this.writeTimeout;
  }
  
  @NotNull
  public final OkHttpClient$Builder dispatcher(@NotNull Dispatcher paramDispatcher) {
    long l = a ^ 0x256F1B4DDC97L;
    Intrinsics.checkNotNullParameter(paramDispatcher, "dispatcher");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setDispatcher$okhttp(paramDispatcher);
    return okHttpClient$Builder1;
  }
  
  @Nullable
  public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
    return this.certificateChainCleaner;
  }
  
  @Nullable
  public final Proxy getProxy$okhttp() {
    return this.proxy;
  }
  
  public final void setRouteDatabase$okhttp(@Nullable RouteDatabase paramRouteDatabase) {
    this.routeDatabase = paramRouteDatabase;
  }
  
  @NotNull
  public final List getProtocols$okhttp() {
    return this.protocols;
  }
  
  @NotNull
  public final OkHttpClient$Builder cache(@Nullable Cache paramCache) {
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setCache$okhttp(paramCache);
    return okHttpClient$Builder1;
  }
  
  public final int getReadTimeout$okhttp() {
    return this.readTimeout;
  }
  
  public final void setReadTimeout$okhttp(int paramInt) {
    this.readTimeout = paramInt;
  }
  
  public final void setEventListenerFactory$okhttp(@NotNull EventListener$Factory paramEventListener$Factory) {
    long l = a ^ 0x2754204ECEC3L;
    Intrinsics.checkNotNullParameter(paramEventListener$Factory, "<set-?>");
    this.eventListenerFactory = paramEventListener$Factory;
  }
  
  public final boolean getFollowRedirects$okhttp() {
    return this.followRedirects;
  }
  
  public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier paramHostnameVerifier) {
    long l = a ^ 0x472FC6C4881AL;
    Intrinsics.checkNotNullParameter(paramHostnameVerifier, "<set-?>");
    this.hostnameVerifier = paramHostnameVerifier;
  }
  
  public final void setCache$okhttp(@Nullable Cache paramCache) {
    this.cache = paramCache;
  }
  
  public final long getMinWebSocketMessageToCompress$okhttp() {
    return this.minWebSocketMessageToCompress;
  }
  
  @NotNull
  public final OkHttpClient$Builder -addNetworkInterceptor(@NotNull Function1 paramFunction1) {
    long l = a ^ 0x5E945A5E8A83L;
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    boolean bool = false;
    return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$2(paramFunction1));
  }
  
  public final void setProxyAuthenticator$okhttp(@NotNull Authenticator paramAuthenticator) {
    long l = a ^ 0x7BF1225F7FB2L;
    Intrinsics.checkNotNullParameter(paramAuthenticator, "<set-?>");
    this.proxyAuthenticator = paramAuthenticator;
  }
  
  @NotNull
  public final OkHttpClient$Builder pingInterval(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x3CE5C6124C84L;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setPingInterval$okhttp(Util.checkDuration("interval", paramLong, paramTimeUnit));
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final HostnameVerifier getHostnameVerifier$okhttp() {
    return this.hostnameVerifier;
  }
  
  @NotNull
  public final OkHttpClient$Builder readTimeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x5F0AA1748DB7L;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setReadTimeout$okhttp(Util.checkDuration("timeout", paramLong, paramTimeUnit));
    return okHttpClient$Builder1;
  }
  
  public final void setCookieJar$okhttp(@NotNull CookieJar paramCookieJar) {
    long l = a ^ 0x7688F9249AF8L;
    Intrinsics.checkNotNullParameter(paramCookieJar, "<set-?>");
    this.cookieJar = paramCookieJar;
  }
  
  public final OkHttpClient$Builder callTimeout(@NotNull Duration paramDuration) {
    long l = a ^ 0x28EBEA6A089DL;
    Intrinsics.checkNotNullParameter(paramDuration, "duration");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.callTimeout(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder eventListenerFactory(@NotNull EventListener$Factory paramEventListener$Factory) {
    long l = a ^ 0x77A7FF52E21FL;
    Intrinsics.checkNotNullParameter(paramEventListener$Factory, "eventListenerFactory");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setEventListenerFactory$okhttp(paramEventListener$Factory);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder connectionPool(@NotNull ConnectionPool paramConnectionPool) {
    long l = a ^ 0x384F658F2966L;
    Intrinsics.checkNotNullParameter(paramConnectionPool, "connectionPool");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setConnectionPool$okhttp(paramConnectionPool);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final Authenticator getProxyAuthenticator$okhttp() {
    return this.proxyAuthenticator;
  }
  
  public final void setDns$okhttp(@NotNull Dns paramDns) {
    long l = a ^ 0x750CBA5EFC3L;
    Intrinsics.checkNotNullParameter(paramDns, "<set-?>");
    this.dns = paramDns;
  }
  
  @Nullable
  public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
    return this.x509TrustManagerOrNull;
  }
  
  public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner paramCertificateChainCleaner) {
    this.certificateChainCleaner = paramCertificateChainCleaner;
  }
  
  public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager paramX509TrustManager) {
    this.x509TrustManagerOrNull = paramX509TrustManager;
  }
  
  @NotNull
  public final OkHttpClient$Builder protocols(@NotNull List paramList) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/OkHttpClient$Builder.a : J
    //   3: ldc2_w 106392098634745
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc_w 'protocols'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #4
    //   18: aload #4
    //   20: checkcast me/rerere/matrix/thirdparty/okhttp3/OkHttpClient$Builder
    //   23: astore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: aload_1
    //   29: checkcast java/util/Collection
    //   32: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
    //   35: astore #7
    //   37: aload #7
    //   39: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.H2_PRIOR_KNOWLEDGE : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   42: invokeinterface contains : (Ljava/lang/Object;)Z
    //   47: ifne -> 70
    //   50: aload #7
    //   52: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.HTTP_1_1 : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   55: invokeinterface contains : (Ljava/lang/Object;)Z
    //   60: ifeq -> 78
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   69: athrow
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: iconst_0
    //   79: ifne -> 108
    //   82: iconst_0
    //   83: istore #9
    //   85: ldc_w 'protocols must contain h2_prior_knowledge or http/1.1: '
    //   88: aload #7
    //   90: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   93: astore #9
    //   95: new java/lang/IllegalArgumentException
    //   98: dup
    //   99: aload #9
    //   101: invokevirtual toString : ()Ljava/lang/String;
    //   104: invokespecial <init> : (Ljava/lang/String;)V
    //   107: athrow
    //   108: aload #7
    //   110: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.H2_PRIOR_KNOWLEDGE : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   113: invokeinterface contains : (Ljava/lang/Object;)Z
    //   118: ifeq -> 139
    //   121: aload #7
    //   123: invokeinterface size : ()I
    //   128: iconst_1
    //   129: if_icmpgt -> 147
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   138: athrow
    //   139: iconst_1
    //   140: goto -> 148
    //   143: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   146: athrow
    //   147: iconst_0
    //   148: ifne -> 177
    //   151: iconst_0
    //   152: istore #9
    //   154: ldc_w 'protocols containing h2_prior_knowledge cannot use other protocols: '
    //   157: aload #7
    //   159: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   162: astore #9
    //   164: new java/lang/IllegalArgumentException
    //   167: dup
    //   168: aload #9
    //   170: invokevirtual toString : ()Ljava/lang/String;
    //   173: invokespecial <init> : (Ljava/lang/String;)V
    //   176: athrow
    //   177: aload #7
    //   179: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.HTTP_1_0 : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   182: invokeinterface contains : (Ljava/lang/Object;)Z
    //   187: ifne -> 198
    //   190: iconst_1
    //   191: goto -> 199
    //   194: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   197: athrow
    //   198: iconst_0
    //   199: ifne -> 228
    //   202: iconst_0
    //   203: istore #9
    //   205: ldc_w 'protocols must not contain http/1.0: '
    //   208: aload #7
    //   210: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   213: astore #9
    //   215: new java/lang/IllegalArgumentException
    //   218: dup
    //   219: aload #9
    //   221: invokevirtual toString : ()Ljava/lang/String;
    //   224: invokespecial <init> : (Ljava/lang/String;)V
    //   227: athrow
    //   228: aload #7
    //   230: aconst_null
    //   231: invokeinterface contains : (Ljava/lang/Object;)Z
    //   236: ifne -> 247
    //   239: iconst_1
    //   240: goto -> 248
    //   243: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   246: athrow
    //   247: iconst_0
    //   248: ifne -> 272
    //   251: iconst_0
    //   252: istore #9
    //   254: ldc_w 'protocols must not contain null'
    //   257: astore #9
    //   259: new java/lang/IllegalArgumentException
    //   262: dup
    //   263: aload #9
    //   265: invokevirtual toString : ()Ljava/lang/String;
    //   268: invokespecial <init> : (Ljava/lang/String;)V
    //   271: athrow
    //   272: aload #7
    //   274: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.SPDY_3 : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   277: invokeinterface remove : (Ljava/lang/Object;)Z
    //   282: pop
    //   283: aload #7
    //   285: aload #5
    //   287: invokevirtual getProtocols$okhttp : ()Ljava/util/List;
    //   290: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   293: ifne -> 309
    //   296: aload #5
    //   298: aconst_null
    //   299: invokevirtual setRouteDatabase$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RouteDatabase;)V
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   308: athrow
    //   309: aload #5
    //   311: aload #7
    //   313: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   316: astore #8
    //   318: aload #8
    //   320: ldc_w 'unmodifiableList(protocolsCopy)'
    //   323: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   326: aload #8
    //   328: invokevirtual setProtocols$okhttp : (Ljava/util/List;)V
    //   331: nop
    //   332: aload #4
    //   334: checkcast me/rerere/matrix/thirdparty/okhttp3/OkHttpClient$Builder
    //   337: areturn
    // Exception table:
    //   from	to	target	type
    //   37	63	66	java/lang/IllegalArgumentException
    //   50	74	74	java/lang/IllegalArgumentException
    //   108	132	135	java/lang/IllegalArgumentException
    //   121	143	143	java/lang/IllegalArgumentException
    //   177	194	194	java/lang/IllegalArgumentException
    //   228	243	243	java/lang/IllegalArgumentException
    //   272	302	305	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final OkHttpClient$Builder sslSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory, @NotNull X509TrustManager paramX509TrustManager) {
    long l = a ^ 0x6024B2FD0168L;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (Intrinsics.areEqual(paramSSLSocketFactory, okHttpClient$Builder2.getSslSocketFactoryOrNull$okhttp())) {
        try {
          if (!Intrinsics.areEqual(paramX509TrustManager, okHttpClient$Builder2.getX509TrustManagerOrNull$okhttp())) {
            okHttpClient$Builder2.setRouteDatabase$okhttp(null);
            okHttpClient$Builder2.setSslSocketFactoryOrNull$okhttp(paramSSLSocketFactory);
            okHttpClient$Builder2.setCertificateChainCleaner$okhttp(CertificateChainCleaner.Companion.get(paramX509TrustManager));
            okHttpClient$Builder2.setX509TrustManagerOrNull$okhttp(paramX509TrustManager);
            return okHttpClient$Builder1;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        okHttpClient$Builder2.setSslSocketFactoryOrNull$okhttp(paramSSLSocketFactory);
        okHttpClient$Builder2.setCertificateChainCleaner$okhttp(CertificateChainCleaner.Companion.get(paramX509TrustManager));
        okHttpClient$Builder2.setX509TrustManagerOrNull$okhttp(paramX509TrustManager);
        return okHttpClient$Builder1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setRouteDatabase$okhttp(null);
    okHttpClient$Builder2.setSslSocketFactoryOrNull$okhttp(paramSSLSocketFactory);
    okHttpClient$Builder2.setCertificateChainCleaner$okhttp(CertificateChainCleaner.Companion.get(paramX509TrustManager));
    okHttpClient$Builder2.setX509TrustManagerOrNull$okhttp(paramX509TrustManager);
    return okHttpClient$Builder1;
  }
  
  public final void setProtocols$okhttp(@NotNull List paramList) {
    long l = a ^ 0x71ABC5C55E5BL;
    Intrinsics.checkNotNullParameter(paramList, "<set-?>");
    this.protocols = paramList;
  }
  
  public final void setProxy$okhttp(@Nullable Proxy paramProxy) {
    this.proxy = paramProxy;
  }
  
  @Nullable
  public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
    return this.sslSocketFactoryOrNull;
  }
  
  public final boolean getRetryOnConnectionFailure$okhttp() {
    return this.retryOnConnectionFailure;
  }
  
  @Deprecated(message = "Use the sslSocketFactory overload that accepts a X509TrustManager.", level = DeprecationLevel.ERROR)
  @NotNull
  public final OkHttpClient$Builder sslSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x313CEB267FCCL;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramSSLSocketFactory, okHttpClient$Builder2.getSslSocketFactoryOrNull$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      okHttpClient$Builder2.setSslSocketFactoryOrNull$okhttp(paramSSLSocketFactory);
      if (Platform.Companion.get().trustManager(paramSSLSocketFactory) == null) {
        Platform.Companion.get().trustManager(paramSSLSocketFactory);
        throw new IllegalStateException("Unable to extract the trust manager on " + Platform.Companion.get() + ", sslSocketFactory is " + paramSSLSocketFactory.getClass());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Platform.Companion.get().trustManager(paramSSLSocketFactory).setX509TrustManagerOrNull$okhttp(Platform.Companion.get().trustManager(paramSSLSocketFactory));
    Intrinsics.checkNotNull(okHttpClient$Builder2.getX509TrustManagerOrNull$okhttp());
    okHttpClient$Builder2.setCertificateChainCleaner$okhttp(Platform.Companion.get().buildCertificateChainCleaner(okHttpClient$Builder2.getX509TrustManagerOrNull$okhttp()));
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder addNetworkInterceptor(@NotNull Interceptor paramInterceptor) {
    long l = a ^ 0x500AC09F5640L;
    Intrinsics.checkNotNullParameter(paramInterceptor, "interceptor");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.getNetworkInterceptors$okhttp().add(paramInterceptor);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final SocketFactory getSocketFactory$okhttp() {
    return this.socketFactory;
  }
  
  public final void setProxySelector$okhttp(@Nullable ProxySelector paramProxySelector) {
    this.proxySelector = paramProxySelector;
  }
  
  public final void setPingInterval$okhttp(int paramInt) {
    this.pingInterval = paramInt;
  }
  
  public final OkHttpClient$Builder pingInterval(@NotNull Duration paramDuration) {
    long l = a ^ 0xDF0700A8DEFL;
    Intrinsics.checkNotNullParameter(paramDuration, "duration");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.pingInterval(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder socketFactory(@NotNull SocketFactory paramSocketFactory) {
    long l = a ^ 0x58254CA3373AL;
    Intrinsics.checkNotNullParameter(paramSocketFactory, "socketFactory");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!(!(paramSocketFactory instanceof SSLSocketFactory) ? 1 : 0)) {
        boolean bool1 = false;
        String str = "socketFactory instanceof SSLSocketFactory";
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(paramSocketFactory, okHttpClient$Builder2.getSocketFactory$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setSocketFactory$okhttp(paramSocketFactory);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder authenticator(@NotNull Authenticator paramAuthenticator) {
    long l = a ^ 0x2D0B8E6C9E14L;
    Intrinsics.checkNotNullParameter(paramAuthenticator, "authenticator");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setAuthenticator$okhttp(paramAuthenticator);
    return okHttpClient$Builder1;
  }
  
  public final void setFollowRedirects$okhttp(boolean paramBoolean) {
    this.followRedirects = paramBoolean;
  }
  
  public final void setMinWebSocketMessageToCompress$okhttp(long paramLong) {
    this.minWebSocketMessageToCompress = paramLong;
  }
  
  public final void setDispatcher$okhttp(@NotNull Dispatcher paramDispatcher) {
    long l = a ^ 0x3A5EA75A02DDL;
    Intrinsics.checkNotNullParameter(paramDispatcher, "<set-?>");
    this.dispatcher = paramDispatcher;
  }
  
  @NotNull
  public final EventListener$Factory getEventListenerFactory$okhttp() {
    return this.eventListenerFactory;
  }
  
  @Nullable
  public final RouteDatabase getRouteDatabase$okhttp() {
    return this.routeDatabase;
  }
  
  public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory paramSSLSocketFactory) {
    this.sslSocketFactoryOrNull = paramSSLSocketFactory;
  }
  
  @NotNull
  public final CertificatePinner getCertificatePinner$okhttp() {
    return this.certificatePinner;
  }
  
  @NotNull
  public final OkHttpClient$Builder connectionSpecs(@NotNull List paramList) {
    long l = a ^ 0x10AB9784E3B7L;
    Intrinsics.checkNotNullParameter(paramList, "connectionSpecs");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramList, okHttpClient$Builder2.getConnectionSpecs$okhttp()))
        okHttpClient$Builder2.setRouteDatabase$okhttp(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    okHttpClient$Builder2.setConnectionSpecs$okhttp(Util.toImmutableList(paramList));
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final Dispatcher getDispatcher$okhttp() {
    return this.dispatcher;
  }
  
  public OkHttpClient$Builder() {
    SocketFactory socketFactory = SocketFactory.getDefault();
    Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
    this.socketFactory = socketFactory;
    this.connectionSpecs = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
    this.protocols = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
    this.hostnameVerifier = (HostnameVerifier)OkHostnameVerifier.INSTANCE;
    this.certificatePinner = CertificatePinner.DEFAULT;
    this.connectTimeout = 10000;
    this.readTimeout = 10000;
    this.writeTimeout = 10000;
    this.minWebSocketMessageToCompress = 1024L;
  }
  
  @NotNull
  public final OkHttpClient$Builder addInterceptor(@NotNull Interceptor paramInterceptor) {
    long l = a ^ 0xCF8FFF28726L;
    Intrinsics.checkNotNullParameter(paramInterceptor, "interceptor");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.getInterceptors$okhttp().add(paramInterceptor);
    return okHttpClient$Builder1;
  }
  
  @NotNull
  public final OkHttpClient$Builder connectTimeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x17F8C9841438L;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    OkHttpClient$Builder okHttpClient$Builder1 = this;
    OkHttpClient$Builder okHttpClient$Builder2 = okHttpClient$Builder1;
    boolean bool = false;
    okHttpClient$Builder2.setConnectTimeout$okhttp(Util.checkDuration("timeout", paramLong, paramTimeUnit));
    return okHttpClient$Builder1;
  }
  
  public final boolean getFollowSslRedirects$okhttp() {
    return this.followSslRedirects;
  }
  
  @Nullable
  public final Cache getCache$okhttp() {
    return this.cache;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\OkHttpClient$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */