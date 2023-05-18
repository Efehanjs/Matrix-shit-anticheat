package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Address;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.Callback;
import me.rerere.matrix.thirdparty.okhttp3.CertificatePinner;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.CacheInterceptor;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.BridgeInterceptor;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.CallServerInterceptor;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealInterceptorChain;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RetryAndFollowUpInterceptor;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okio.AsyncTimeout;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealCall implements Call {
  private boolean expectMoreExchanges;
  
  @NotNull
  private final RealConnectionPool connectionPool;
  
  @Nullable
  private volatile Exchange exchange;
  
  @Nullable
  private RealConnection connection;
  
  @Nullable
  private Object callStackTrace;
  
  @NotNull
  private final Request originalRequest;
  
  @NotNull
  private final AtomicBoolean executed;
  
  private boolean responseBodyOpen;
  
  private boolean requestBodyOpen;
  
  private boolean timeoutEarlyExit;
  
  @NotNull
  private final OkHttpClient client;
  
  private volatile boolean canceled;
  
  @Nullable
  private ExchangeFinder exchangeFinder;
  
  @Nullable
  private volatile RealConnection connectionToCancel;
  
  @NotNull
  private final RealCall$timeout$1 timeout;
  
  @NotNull
  private final EventListener eventListener;
  
  @Nullable
  private Exchange interceptorScopedExchange;
  
  private final boolean forWebSocket;
  
  private static final long a = o3.a(8403330599932163318L, -4921523906470791398L, MethodHandles.lookup().lookupClass()).a(276088593394744L);
  
  public final void setConnectionToCancel(@Nullable RealConnection paramRealConnection) {
    this.connectionToCancel = paramRealConnection;
  }
  
  public void cancel() {
    try {
      if (this.canceled)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.canceled = true;
      if (this.exchange == null) {
      
      } else {
        this.exchange.cancel();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.connectionToCancel == null) {
      
      } else {
        this.connectionToCancel.cancel();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.eventListener.canceled(this);
  }
  
  @Nullable
  public final Socket releaseConnectionNoEvents$okhttp() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/connection/RealCall.a : J
    //   3: ldc2_w 98254406444416
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield connection : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   12: dup
    //   13: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   16: astore_3
    //   17: aload_3
    //   18: astore #4
    //   20: iconst_0
    //   21: istore #5
    //   23: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.assertionsEnabled : Z
    //   26: ifeq -> 90
    //   29: aload #4
    //   31: invokestatic holdsLock : (Ljava/lang/Object;)Z
    //   34: ifne -> 90
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: new java/lang/AssertionError
    //   47: dup
    //   48: new java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: ldc 'Thread '
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokestatic currentThread : ()Ljava/lang/Thread;
    //   63: invokevirtual getName : ()Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   69: ldc ' MUST hold lock on '
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload #4
    //   76: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokespecial <init> : (Ljava/lang/Object;)V
    //   85: athrow
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: nop
    //   91: aload_3
    //   92: invokevirtual getCalls : ()Ljava/util/List;
    //   95: astore #4
    //   97: aload #4
    //   99: astore #6
    //   101: iconst_0
    //   102: istore #7
    //   104: iconst_0
    //   105: istore #8
    //   107: aload #6
    //   109: invokeinterface iterator : ()Ljava/util/Iterator;
    //   114: astore #9
    //   116: aload #9
    //   118: invokeinterface hasNext : ()Z
    //   123: ifeq -> 172
    //   126: aload #9
    //   128: invokeinterface next : ()Ljava/lang/Object;
    //   133: astore #10
    //   135: aload #10
    //   137: checkcast java/lang/ref/Reference
    //   140: astore #11
    //   142: iconst_0
    //   143: istore #12
    //   145: aload #11
    //   147: invokevirtual get : ()Ljava/lang/Object;
    //   150: aload_0
    //   151: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   154: ifeq -> 166
    //   157: iload #8
    //   159: goto -> 173
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: iinc #8, 1
    //   169: goto -> 116
    //   172: iconst_m1
    //   173: istore #5
    //   175: iload #5
    //   177: iconst_m1
    //   178: if_icmpeq -> 189
    //   181: iconst_1
    //   182: goto -> 190
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: iconst_0
    //   190: ifne -> 210
    //   193: ldc 'Check failed.'
    //   195: astore #7
    //   197: new java/lang/IllegalStateException
    //   200: dup
    //   201: aload #7
    //   203: invokevirtual toString : ()Ljava/lang/String;
    //   206: invokespecial <init> : (Ljava/lang/String;)V
    //   209: athrow
    //   210: aload #4
    //   212: iload #5
    //   214: invokeinterface remove : (I)Ljava/lang/Object;
    //   219: pop
    //   220: aload_0
    //   221: aconst_null
    //   222: putfield connection : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   225: aload #4
    //   227: invokeinterface isEmpty : ()Z
    //   232: ifeq -> 269
    //   235: aload_3
    //   236: invokestatic nanoTime : ()J
    //   239: invokevirtual setIdleAtNs$okhttp : (J)V
    //   242: aload_0
    //   243: getfield connectionPool : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnectionPool;
    //   246: aload_3
    //   247: invokevirtual connectionBecameIdle : (Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;)Z
    //   250: ifeq -> 269
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   259: athrow
    //   260: aload_3
    //   261: invokevirtual socket : ()Ljava/net/Socket;
    //   264: areturn
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: aconst_null
    //   270: areturn
    // Exception table:
    //   from	to	target	type
    //   23	37	40	java/lang/IllegalStateException
    //   29	86	86	java/lang/IllegalStateException
    //   145	162	162	java/lang/IllegalStateException
    //   175	185	185	java/lang/IllegalStateException
    //   210	253	256	java/lang/IllegalStateException
    //   235	265	265	java/lang/IllegalStateException
  }
  
  @NotNull
  public final String redactedUrl$okhttp() {
    return this.originalRequest.url().redact();
  }
  
  @NotNull
  public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain paramRealInterceptorChain) {
    long l = a ^ 0x379815FE90L;
    Intrinsics.checkNotNullParameter(paramRealInterceptorChain, "chain");
    synchronized (this) {
      boolean bool = false;
      if (!this.expectMoreExchanges) {
        boolean bool1 = false;
        String str = "released";
        throw new IllegalStateException(str.toString());
      } 
      try {
        if (!(!this.responseBodyOpen ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!(!this.requestBodyOpen ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    Intrinsics.checkNotNull(this.exchangeFinder);
    ExchangeFinder exchangeFinder = this.exchangeFinder;
    ExchangeCodec exchangeCodec = exchangeFinder.find(this.client, paramRealInterceptorChain);
    Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeCodec);
    this.interceptorScopedExchange = exchange;
    this.exchange = exchange;
    synchronized (this) {
      boolean bool = false;
      this.requestBodyOpen = true;
      this.responseBodyOpen = true;
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if (this.canceled)
        throw new IOException("Canceled"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return exchange;
  }
  
  public final boolean retryAfterFailure() {
    Intrinsics.checkNotNull(this.exchangeFinder);
    return this.exchangeFinder.retryAfterFailure();
  }
  
  public RealCall(@NotNull OkHttpClient paramOkHttpClient, @NotNull Request paramRequest, boolean paramBoolean) {
    this.client = paramOkHttpClient;
    this.originalRequest = paramRequest;
    this.forWebSocket = paramBoolean;
    this.connectionPool = this.client.connectionPool().getDelegate$okhttp();
    this.eventListener = this.client.eventListenerFactory().create(this);
    RealCall$timeout$1 realCall$timeout$11 = new RealCall$timeout$1(this);
    RealCall$timeout$1 realCall$timeout$12 = realCall$timeout$11;
    RealCall realCall = this;
    boolean bool = false;
    realCall$timeout$12.timeout(getClient().callTimeoutMillis(), TimeUnit.MILLISECONDS);
    realCall.timeout = realCall$timeout$11;
    this.executed = new AtomicBoolean();
    this.expectMoreExchanges = true;
  }
  
  public boolean isCanceled() {
    return this.canceled;
  }
  
  public boolean isExecuted() {
    return this.executed.get();
  }
  
  @NotNull
  public final EventListener getEventListener$okhttp() {
    return this.eventListener;
  }
  
  @Nullable
  public final IOException noMoreExchanges$okhttp(@Nullable IOException paramIOException) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: nop
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_0
    //   11: getfield expectMoreExchanges : Z
    //   14: ifeq -> 60
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield expectMoreExchanges : Z
    //   22: aload_0
    //   23: getfield requestBodyOpen : Z
    //   26: ifne -> 58
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield responseBodyOpen : Z
    //   40: ifne -> 58
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: iconst_1
    //   51: goto -> 59
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iconst_0
    //   59: istore_2
    //   60: nop
    //   61: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   64: astore #4
    //   66: aload_3
    //   67: monitorexit
    //   68: goto -> 78
    //   71: astore #4
    //   73: aload_3
    //   74: monitorexit
    //   75: aload #4
    //   77: athrow
    //   78: iload_2
    //   79: ifeq -> 92
    //   82: aload_0
    //   83: aload_1
    //   84: invokespecial callDone : (Ljava/io/IOException;)Ljava/io/IOException;
    //   87: areturn
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_1
    //   93: areturn
    // Exception table:
    //   from	to	target	type
    //   6	66	71	finally
    //   10	29	32	java/lang/IllegalStateException
    //   17	43	46	java/lang/IllegalStateException
    //   36	54	54	java/lang/IllegalStateException
    //   71	73	71	finally
    //   78	88	88	java/lang/IllegalStateException
  }
  
  @NotNull
  public final OkHttpClient getClient() {
    return this.client;
  }
  
  @Nullable
  public final RealConnection getConnectionToCancel() {
    return this.connectionToCancel;
  }
  
  public final boolean getForWebSocket() {
    return this.forWebSocket;
  }
  
  @NotNull
  public Request request() {
    return this.originalRequest;
  }
  
  public final void timeoutEarlyExit() {
    long l = a ^ 0x3A07AD69C873L;
    try {
      if (!(!this.timeoutEarlyExit ? 1 : 0)) {
        String str = "Check failed.";
        throw new IllegalStateException(str.toString());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.timeoutEarlyExit = true;
    this.timeout.exit();
  }
  
  public void enqueue(@NotNull Callback paramCallback) {
    long l = a ^ 0x1D12EFEAD2B7L;
    Intrinsics.checkNotNullParameter(paramCallback, "responseCallback");
    if (!this.executed.compareAndSet(false, true)) {
      boolean bool = false;
      String str = "Already Executed";
      throw new IllegalStateException(str.toString());
    } 
    callStart();
    this.client.dispatcher().enqueue$okhttp(new RealCall$AsyncCall(this, paramCallback));
  }
  
  @NotNull
  public AsyncTimeout timeout() {
    return this.timeout;
  }
  
  @NotNull
  public Response execute() {
    long l = a ^ 0x24F5F000C626L;
    if (!this.executed.compareAndSet(false, true)) {
      boolean bool = false;
      String str = "Already Executed";
      throw new IllegalStateException(str.toString());
    } 
    this.timeout.enter();
    callStart();
    try {
      this.client.dispatcher().executed$okhttp(this);
      return getResponseWithInterceptorChain$okhttp();
    } finally {
      this.client.dispatcher().finished$okhttp(this);
    } 
  }
  
  @Nullable
  public final RealConnection getConnection() {
    return this.connection;
  }
  
  public final void exitNetworkInterceptorExchange$okhttp(boolean paramBoolean) {
    long l = a ^ 0x52CEA43252A5L;
    synchronized (this) {
      boolean bool = false;
      if (!this.expectMoreExchanges) {
        boolean bool1 = false;
        String str = "released";
        throw new IllegalStateException(str.toString());
      } 
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if (paramBoolean)
        try {
          if (this.exchange == null) {
          
          } else {
            this.exchange.detachWithViolence();
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.interceptorScopedExchange = null;
  }
  
  public final IOException messageDone$okhttp(@NotNull Exchange paramExchange, boolean paramBoolean1, boolean paramBoolean2, IOException paramIOException) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/connection/RealCall.a : J
    //   3: ldc2_w 52314704246071
    //   6: lxor
    //   7: lstore #5
    //   9: aload_1
    //   10: ldc_w 'exchange'
    //   13: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: aload_0
    //   18: getfield exchange : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;
    //   21: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   24: ifne -> 34
    //   27: aload #4
    //   29: areturn
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: iconst_0
    //   35: istore #7
    //   37: iconst_0
    //   38: istore #8
    //   40: aload_0
    //   41: astore #9
    //   43: aload #9
    //   45: monitorenter
    //   46: nop
    //   47: iconst_0
    //   48: istore #10
    //   50: iload_2
    //   51: ifeq -> 68
    //   54: aload_0
    //   55: getfield requestBodyOpen : Z
    //   58: ifne -> 93
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: iload_3
    //   69: ifeq -> 210
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_0
    //   80: getfield responseBodyOpen : Z
    //   83: ifeq -> 210
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iload_2
    //   94: ifeq -> 116
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield requestBodyOpen : Z
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: iload_3
    //   117: ifeq -> 132
    //   120: aload_0
    //   121: iconst_0
    //   122: putfield responseBodyOpen : Z
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload_0
    //   133: getfield requestBodyOpen : Z
    //   136: ifne -> 161
    //   139: aload_0
    //   140: getfield responseBodyOpen : Z
    //   143: ifne -> 161
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: iconst_1
    //   154: goto -> 162
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: iconst_0
    //   162: istore #7
    //   164: aload_0
    //   165: getfield requestBodyOpen : Z
    //   168: ifne -> 207
    //   171: aload_0
    //   172: getfield responseBodyOpen : Z
    //   175: ifne -> 207
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: aload_0
    //   186: getfield expectMoreExchanges : Z
    //   189: ifne -> 207
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: iconst_1
    //   200: goto -> 208
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: iconst_0
    //   208: istore #8
    //   210: nop
    //   211: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   214: astore #10
    //   216: aload #9
    //   218: monitorexit
    //   219: goto -> 230
    //   222: astore #10
    //   224: aload #9
    //   226: monitorexit
    //   227: aload #10
    //   229: athrow
    //   230: iload #7
    //   232: ifeq -> 266
    //   235: aload_0
    //   236: aconst_null
    //   237: putfield exchange : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;
    //   240: aload_0
    //   241: getfield connection : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   244: dup
    //   245: ifnonnull -> 263
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: pop
    //   256: goto -> 266
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: invokevirtual incrementSuccessCount$okhttp : ()V
    //   266: iload #8
    //   268: ifeq -> 282
    //   271: aload_0
    //   272: aload #4
    //   274: invokespecial callDone : (Ljava/io/IOException;)Ljava/io/IOException;
    //   277: areturn
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload #4
    //   284: areturn
    // Exception table:
    //   from	to	target	type
    //   9	30	30	java/lang/IllegalStateException
    //   46	216	222	finally
    //   50	61	64	java/lang/IllegalStateException
    //   54	72	75	java/lang/IllegalStateException
    //   68	86	89	java/lang/IllegalStateException
    //   79	97	100	java/lang/IllegalStateException
    //   93	109	112	java/lang/IllegalStateException
    //   116	125	128	java/lang/IllegalStateException
    //   132	146	149	java/lang/IllegalStateException
    //   139	157	157	java/lang/IllegalStateException
    //   164	178	181	java/lang/IllegalStateException
    //   171	192	195	java/lang/IllegalStateException
    //   185	203	203	java/lang/IllegalStateException
    //   222	224	222	finally
    //   230	248	251	java/lang/IllegalStateException
    //   235	259	259	java/lang/IllegalStateException
    //   266	278	278	java/lang/IllegalStateException
  }
  
  @Nullable
  public final Exchange getInterceptorScopedExchange$okhttp() {
    return this.interceptorScopedExchange;
  }
  
  @NotNull
  public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
    long l = a ^ 0x37554F9509B8L;
    ArrayList<RetryAndFollowUpInterceptor> arrayList = new ArrayList();
    try {
      CollectionsKt.addAll(arrayList, this.client.interceptors());
      arrayList.add(new RetryAndFollowUpInterceptor(this.client));
      arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
      arrayList.add(new CacheInterceptor(this.client.cache()));
      arrayList.add(ConnectInterceptor.INSTANCE);
      if (!this.forWebSocket)
        CollectionsKt.addAll(arrayList, this.client.networkInterceptors()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    arrayList.add(new CallServerInterceptor(this.forWebSocket));
    RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
    boolean bool = false;
  }
  
  @NotNull
  public RealCall clone() {
    return new RealCall(this.client, this.originalRequest, this.forWebSocket);
  }
  
  @NotNull
  public final Request getOriginalRequest() {
    return this.originalRequest;
  }
  
  public final void enterNetworkInterceptorExchange(@NotNull Request paramRequest, boolean paramBoolean) {
    long l = a ^ 0x6483A062208CL;
    try {
      Intrinsics.checkNotNullParameter(paramRequest, "request");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!((this.interceptorScopedExchange == null) ? 1 : 0)) {
      String str = "Check failed.";
      throw new IllegalStateException(str.toString());
    } 
    synchronized (this) {
      boolean bool = false;
      try {
        if (!(!this.responseBodyOpen ? 1 : 0)) {
          boolean bool1 = false;
          String str = "cannot make a new request because the previous response is still open: please call response.close()";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!(!this.requestBodyOpen ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if (paramBoolean)
        this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(paramRequest.url()), this, this.eventListener); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public final void acquireConnectionNoEvents(@NotNull RealConnection paramRealConnection) {
    long l = a ^ 0x2C75D4EE7875L;
    Intrinsics.checkNotNullParameter(paramRealConnection, "connection");
    RealConnection realConnection = paramRealConnection;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(realConnection))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!((this.connection == null) ? 1 : 0)) {
        String str = "Check failed.";
        throw new IllegalStateException(str.toString());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.connection = paramRealConnection;
    paramRealConnection.getCalls().add(new RealCall$CallReference(this, this.callStackTrace));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */