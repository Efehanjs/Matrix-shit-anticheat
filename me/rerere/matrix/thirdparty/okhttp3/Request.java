package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Request {
  @Nullable
  private final RequestBody body;
  
  @NotNull
  private final Map tags;
  
  @NotNull
  private final String method;
  
  @NotNull
  private final Headers headers;
  
  @NotNull
  private final HttpUrl url;
  
  @Nullable
  private CacheControl lazyCacheControl;
  
  private static final long a = o3.a(1477977835150662099L, -6119525675818206356L, MethodHandles.lookup().lookupClass()).a(172806611272128L);
  
  @NotNull
  public final List headers(@NotNull String paramString) {
    long l = a ^ 0x65ADC88E4936L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return this.headers.values(paramString);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final HttpUrl -deprecated_url() {
    return this.url;
  }
  
  @NotNull
  public final Map getTags$okhttp() {
    return this.tags;
  }
  
  @NotNull
  public final String method() {
    return this.method;
  }
  
  @Nullable
  public final Object tag() {
    return tag(Object.class);
  }
  
  @Nullable
  public final String header(@NotNull String paramString) {
    long l = a ^ 0x1788111BF27EL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return this.headers.get(paramString);
  }
  
  @NotNull
  public final Headers headers() {
    return this.headers;
  }
  
  @NotNull
  public final CacheControl cacheControl() {
    CacheControl cacheControl = this.lazyCacheControl;
    if (cacheControl == null) {
      cacheControl = CacheControl.Companion.parse(this.headers);
      this.lazyCacheControl = cacheControl;
    } 
    return cacheControl;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "method", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_method() {
    return this.method;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final RequestBody -deprecated_body() {
    return this.body;
  }
  
  @NotNull
  public final Request$Builder newBuilder() {
    return new Request$Builder(this);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final CacheControl -deprecated_cacheControl() {
    return cacheControl();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Headers -deprecated_headers() {
    return this.headers;
  }
  
  @NotNull
  public final HttpUrl url() {
    return this.url;
  }
  
  @Nullable
  public final Object tag(@NotNull Class paramClass) {
    long l = a ^ 0x6810E911DF5EL;
    Intrinsics.checkNotNullParameter(paramClass, "type");
    return paramClass.cast(this.tags.get(paramClass));
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/Request.a : J
    //   3: ldc2_w 92629838532628
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_3
    //   16: aload_3
    //   17: astore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: aload #4
    //   24: ldc 'Request{method='
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload #4
    //   32: aload_0
    //   33: invokevirtual method : ()Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload #4
    //   42: ldc ', url='
    //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload #4
    //   50: aload_0
    //   51: invokevirtual url : ()Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl;
    //   54: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_0
    //   59: invokevirtual headers : ()Lme/rerere/matrix/thirdparty/okhttp3/Headers;
    //   62: invokevirtual size : ()I
    //   65: ifeq -> 232
    //   68: aload #4
    //   70: ldc ', headers=['
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_0
    //   77: invokevirtual headers : ()Lme/rerere/matrix/thirdparty/okhttp3/Headers;
    //   80: checkcast java/lang/Iterable
    //   83: astore #6
    //   85: iconst_0
    //   86: istore #7
    //   88: iconst_0
    //   89: istore #8
    //   91: aload #6
    //   93: invokeinterface iterator : ()Ljava/util/Iterator;
    //   98: astore #9
    //   100: aload #9
    //   102: invokeinterface hasNext : ()Z
    //   107: ifeq -> 223
    //   110: aload #9
    //   112: invokeinterface next : ()Ljava/lang/Object;
    //   117: astore #10
    //   119: iload #8
    //   121: iinc #8, 1
    //   124: istore #11
    //   126: iload #11
    //   128: ifge -> 141
    //   131: invokestatic throwIndexOverflow : ()V
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: iload #11
    //   143: aload #10
    //   145: checkcast me/rerere/matrix/thirdparty/kotlin/Pair
    //   148: astore #12
    //   150: istore #13
    //   152: iconst_0
    //   153: istore #14
    //   155: aload #12
    //   157: invokevirtual component1 : ()Ljava/lang/Object;
    //   160: checkcast java/lang/String
    //   163: astore #15
    //   165: aload #12
    //   167: invokevirtual component2 : ()Ljava/lang/Object;
    //   170: checkcast java/lang/String
    //   173: astore #16
    //   175: iload #13
    //   177: ifle -> 195
    //   180: aload #4
    //   182: ldc ', '
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: aload #4
    //   197: aload #15
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload #4
    //   205: bipush #58
    //   207: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload #4
    //   213: aload #16
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: nop
    //   220: goto -> 100
    //   223: nop
    //   224: aload #4
    //   226: bipush #93
    //   228: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aload_0
    //   233: invokevirtual getTags$okhttp : ()Ljava/util/Map;
    //   236: invokeinterface isEmpty : ()Z
    //   241: ifne -> 252
    //   244: iconst_1
    //   245: goto -> 253
    //   248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   251: athrow
    //   252: iconst_0
    //   253: ifeq -> 281
    //   256: aload #4
    //   258: ldc ', tags='
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: aload #4
    //   266: aload_0
    //   267: invokevirtual getTags$okhttp : ()Ljava/util/Map;
    //   270: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   280: athrow
    //   281: aload #4
    //   283: bipush #125
    //   285: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: nop
    //   290: aload_3
    //   291: invokevirtual toString : ()Ljava/lang/String;
    //   294: dup
    //   295: ldc 'StringBuilder().apply(builderAction).toString()'
    //   297: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   300: areturn
    // Exception table:
    //   from	to	target	type
    //   126	134	137	java/lang/RuntimeException
    //   175	188	191	java/lang/RuntimeException
    //   232	248	248	java/lang/RuntimeException
    //   253	274	277	java/lang/RuntimeException
  }
  
  @Nullable
  public final RequestBody body() {
    return this.body;
  }
  
  public Request(@NotNull HttpUrl paramHttpUrl, @NotNull String paramString, @NotNull Headers paramHeaders, @Nullable RequestBody paramRequestBody, @NotNull Map paramMap) {
    this.url = paramHttpUrl;
    this.method = paramString;
    this.headers = paramHeaders;
    this.body = paramRequestBody;
    this.tags = paramMap;
  }
  
  public final boolean isHttps() {
    return this.url.isHttps();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Request.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */