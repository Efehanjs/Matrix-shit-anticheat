package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.Connection;
import me.rerere.matrix.thirdparty.okhttp3.Interceptor;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.Exchange;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealInterceptorChain implements Interceptor.Chain {
  @NotNull
  private final Request request;
  
  private final int connectTimeoutMillis;
  
  private final int readTimeoutMillis;
  
  @Nullable
  private final Exchange exchange;
  
  private int calls;
  
  @NotNull
  private final List interceptors;
  
  private final int index;
  
  @NotNull
  private final RealCall call;
  
  private final int writeTimeoutMillis;
  
  private static final long a = o3.a(662192012898754637L, -5790897903054015441L, MethodHandles.lookup().lookupClass()).a(49355367801084L);
  
  @NotNull
  public final RealInterceptorChain copy$okhttp(int paramInt1, @Nullable Exchange paramExchange, @NotNull Request paramRequest, int paramInt2, int paramInt3, int paramInt4) {
    long l = a ^ 0x53C2A9A28EBL;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    return new RealInterceptorChain(this.call, this.interceptors, paramInt1, paramExchange, paramRequest, paramInt2, paramInt3, paramInt4);
  }
  
  @NotNull
  public final RealCall getCall$okhttp() {
    return this.call;
  }
  
  @NotNull
  public Interceptor.Chain withConnectTimeout(int paramInt, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x1E4A80D66766L;
    try {
      Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!((this.exchange == null) ? 1 : 0)) {
      boolean bool = false;
      String str = "Timeouts can't be adjusted in a network interceptor";
      throw new IllegalStateException(str.toString());
    } 
    return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", paramInt, paramTimeUnit), 0, 0, 55, null);
  }
  
  public final int getReadTimeoutMillis$okhttp() {
    return this.readTimeoutMillis;
  }
  
  @NotNull
  public Request request() {
    return this.request;
  }
  
  public final int getWriteTimeoutMillis$okhttp() {
    return this.writeTimeoutMillis;
  }
  
  @Nullable
  public final Exchange getExchange$okhttp() {
    return this.exchange;
  }
  
  @NotNull
  public Interceptor.Chain withWriteTimeout(int paramInt, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x5A4647AD1A4BL;
    try {
      Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!((this.exchange == null) ? 1 : 0)) {
      boolean bool = false;
      String str = "Timeouts can't be adjusted in a network interceptor";
      throw new IllegalStateException(str.toString());
    } 
    return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", paramInt, paramTimeUnit), 31, null);
  }
  
  @NotNull
  public Interceptor.Chain withReadTimeout(int paramInt, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x6537800134E1L;
    try {
      Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!((this.exchange == null) ? 1 : 0)) {
      boolean bool = false;
      String str = "Timeouts can't be adjusted in a network interceptor";
      throw new IllegalStateException(str.toString());
    } 
    return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", paramInt, paramTimeUnit), 0, 47, null);
  }
  
  public int writeTimeoutMillis() {
    return this.writeTimeoutMillis;
  }
  
  public final int getConnectTimeoutMillis$okhttp() {
    return this.connectTimeoutMillis;
  }
  
  @NotNull
  public final Request getRequest$okhttp() {
    return this.request;
  }
  
  @NotNull
  public Response proceed(@NotNull Request paramRequest) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http/RealInterceptorChain.a : J
    //   3: ldc2_w 91615354565657
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'request'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield index : I
    //   18: aload_0
    //   19: getfield interceptors : Ljava/util/List;
    //   22: invokeinterface size : ()I
    //   27: if_icmpge -> 38
    //   30: iconst_1
    //   31: goto -> 39
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: iconst_0
    //   39: ifne -> 59
    //   42: ldc 'Check failed.'
    //   44: astore #5
    //   46: new java/lang/IllegalStateException
    //   49: dup
    //   50: aload #5
    //   52: invokevirtual toString : ()Ljava/lang/String;
    //   55: invokespecial <init> : (Ljava/lang/String;)V
    //   58: athrow
    //   59: aload_0
    //   60: getfield calls : I
    //   63: istore #4
    //   65: aload_0
    //   66: iload #4
    //   68: iconst_1
    //   69: iadd
    //   70: putfield calls : I
    //   73: aload_0
    //   74: getfield exchange : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;
    //   77: ifnull -> 236
    //   80: aload_0
    //   81: getfield exchange : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;
    //   84: invokevirtual getFinder$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/ExchangeFinder;
    //   87: aload_1
    //   88: invokevirtual url : ()Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl;
    //   91: invokevirtual sameHostAndPort : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl;)Z
    //   94: ifne -> 160
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iconst_0
    //   105: istore #5
    //   107: new java/lang/StringBuilder
    //   110: dup
    //   111: invokespecial <init> : ()V
    //   114: ldc 'network interceptor '
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: aload_0
    //   120: getfield interceptors : Ljava/util/List;
    //   123: aload_0
    //   124: getfield index : I
    //   127: iconst_1
    //   128: isub
    //   129: invokeinterface get : (I)Ljava/lang/Object;
    //   134: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   137: ldc ' must retain the same host and port'
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: astore #5
    //   147: new java/lang/IllegalStateException
    //   150: dup
    //   151: aload #5
    //   153: invokevirtual toString : ()Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: athrow
    //   160: aload_0
    //   161: getfield calls : I
    //   164: iconst_1
    //   165: if_icmpne -> 176
    //   168: iconst_1
    //   169: goto -> 177
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: iconst_0
    //   177: ifne -> 236
    //   180: iconst_0
    //   181: istore #5
    //   183: new java/lang/StringBuilder
    //   186: dup
    //   187: invokespecial <init> : ()V
    //   190: ldc 'network interceptor '
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: aload_0
    //   196: getfield interceptors : Ljava/util/List;
    //   199: aload_0
    //   200: getfield index : I
    //   203: iconst_1
    //   204: isub
    //   205: invokeinterface get : (I)Ljava/lang/Object;
    //   210: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   213: ldc ' must call proceed() exactly once'
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: astore #5
    //   223: new java/lang/IllegalStateException
    //   226: dup
    //   227: aload #5
    //   229: invokevirtual toString : ()Ljava/lang/String;
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: athrow
    //   236: aload_0
    //   237: aload_0
    //   238: getfield index : I
    //   241: iconst_1
    //   242: iadd
    //   243: aconst_null
    //   244: aload_1
    //   245: iconst_0
    //   246: iconst_0
    //   247: iconst_0
    //   248: bipush #58
    //   250: aconst_null
    //   251: invokestatic copy$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http/RealInterceptorChain;ILme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;Lme/rerere/matrix/thirdparty/okhttp3/Request;IIIILjava/lang/Object;)Lme/rerere/matrix/thirdparty/okhttp3/internal/http/RealInterceptorChain;
    //   254: astore #4
    //   256: aload_0
    //   257: getfield interceptors : Ljava/util/List;
    //   260: aload_0
    //   261: getfield index : I
    //   264: invokeinterface get : (I)Ljava/lang/Object;
    //   269: checkcast me/rerere/matrix/thirdparty/okhttp3/Interceptor
    //   272: astore #5
    //   274: aload #5
    //   276: aload #4
    //   278: checkcast me/rerere/matrix/thirdparty/okhttp3/Interceptor$Chain
    //   281: invokeinterface intercept : (Lme/rerere/matrix/thirdparty/okhttp3/Interceptor$Chain;)Lme/rerere/matrix/thirdparty/okhttp3/Response;
    //   286: dup
    //   287: ifnonnull -> 328
    //   290: pop
    //   291: new java/lang/NullPointerException
    //   294: dup
    //   295: new java/lang/StringBuilder
    //   298: dup
    //   299: invokespecial <init> : ()V
    //   302: ldc 'interceptor '
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload #5
    //   309: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   312: ldc ' returned null'
    //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: invokevirtual toString : ()Ljava/lang/String;
    //   320: invokespecial <init> : (Ljava/lang/String;)V
    //   323: athrow
    //   324: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   327: athrow
    //   328: astore #6
    //   330: aload_0
    //   331: getfield exchange : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;
    //   334: ifnull -> 433
    //   337: aload_0
    //   338: getfield index : I
    //   341: iconst_1
    //   342: iadd
    //   343: aload_0
    //   344: getfield interceptors : Ljava/util/List;
    //   347: invokeinterface size : ()I
    //   352: if_icmpge -> 378
    //   355: goto -> 362
    //   358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   361: athrow
    //   362: aload #4
    //   364: getfield calls : I
    //   367: iconst_1
    //   368: if_icmpne -> 386
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   377: athrow
    //   378: iconst_1
    //   379: goto -> 387
    //   382: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   385: athrow
    //   386: iconst_0
    //   387: ifne -> 433
    //   390: iconst_0
    //   391: istore #7
    //   393: new java/lang/StringBuilder
    //   396: dup
    //   397: invokespecial <init> : ()V
    //   400: ldc 'network interceptor '
    //   402: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   405: aload #5
    //   407: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   410: ldc ' must call proceed() exactly once'
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: invokevirtual toString : ()Ljava/lang/String;
    //   418: astore #7
    //   420: new java/lang/IllegalStateException
    //   423: dup
    //   424: aload #7
    //   426: invokevirtual toString : ()Ljava/lang/String;
    //   429: invokespecial <init> : (Ljava/lang/String;)V
    //   432: athrow
    //   433: aload #6
    //   435: invokevirtual body : ()Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;
    //   438: ifnull -> 449
    //   441: iconst_1
    //   442: goto -> 450
    //   445: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   448: athrow
    //   449: iconst_0
    //   450: ifne -> 496
    //   453: iconst_0
    //   454: istore #7
    //   456: new java/lang/StringBuilder
    //   459: dup
    //   460: invokespecial <init> : ()V
    //   463: ldc 'interceptor '
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: aload #5
    //   470: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   473: ldc ' returned a response with no body'
    //   475: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: invokevirtual toString : ()Ljava/lang/String;
    //   481: astore #7
    //   483: new java/lang/IllegalStateException
    //   486: dup
    //   487: aload #7
    //   489: invokevirtual toString : ()Ljava/lang/String;
    //   492: invokespecial <init> : (Ljava/lang/String;)V
    //   495: athrow
    //   496: aload #6
    //   498: areturn
    // Exception table:
    //   from	to	target	type
    //   8	34	34	java/io/IOException
    //   65	97	100	java/io/IOException
    //   160	172	172	java/io/IOException
    //   274	324	324	java/io/IOException
    //   330	355	358	java/io/IOException
    //   337	371	374	java/io/IOException
    //   362	382	382	java/io/IOException
    //   433	445	445	java/io/IOException
  }
  
  @NotNull
  public Call call() {
    return (Call)this.call;
  }
  
  public int readTimeoutMillis() {
    return this.readTimeoutMillis;
  }
  
  public int connectTimeoutMillis() {
    return this.connectTimeoutMillis;
  }
  
  public RealInterceptorChain(@NotNull RealCall paramRealCall, @NotNull List paramList, int paramInt1, @Nullable Exchange paramExchange, @NotNull Request paramRequest, int paramInt2, int paramInt3, int paramInt4) {
    this.call = paramRealCall;
    this.interceptors = paramList;
    this.index = paramInt1;
    this.exchange = paramExchange;
    this.request = paramRequest;
    this.connectTimeoutMillis = paramInt2;
    this.readTimeoutMillis = paramInt3;
    this.writeTimeoutMillis = paramInt4;
  }
  
  @Nullable
  public Connection connection() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.exchange == null) ? null : (Connection)this.exchange.getConnection$okhttp();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\RealInterceptorChain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */