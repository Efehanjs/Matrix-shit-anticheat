package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.HttpMethod;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class Request$Builder {
  @Nullable
  private RequestBody body;
  
  @NotNull
  private Map tags = new LinkedHashMap<>();
  
  @Nullable
  private HttpUrl url;
  
  @NotNull
  private String method;
  
  @NotNull
  private Headers$Builder headers;
  
  private static final long a = o3.a(7834017043919663614L, -3848548090345591489L, MethodHandles.lookup().lookupClass()).a(92636683819661L);
  
  @NotNull
  public Request$Builder patch(@NotNull RequestBody paramRequestBody) {
    long l = a ^ 0x1E03B571A688L;
    Intrinsics.checkNotNullParameter(paramRequestBody, "body");
    return method("PATCH", paramRequestBody);
  }
  
  @NotNull
  public Request build() {
    HttpUrl httpUrl;
    long l = a ^ 0x69383F7F9FA3L;
    if (this.url == null) {
      boolean bool = false;
      String str1 = "url == null";
      throw new IllegalStateException(str1.toString());
    } 
    Map map = Util.toImmutableMap(this.tags);
    RequestBody requestBody = this.body;
    Headers headers = this.headers.build();
    String str = this.method;
    return new Request(httpUrl, str, headers, requestBody, map);
  }
  
  public final void setUrl$okhttp(@Nullable HttpUrl paramHttpUrl) {
    this.url = paramHttpUrl;
  }
  
  @NotNull
  public Request$Builder method(@NotNull String paramString, @Nullable RequestBody paramRequestBody) {
    long l = a ^ 0x1AF7032E75E5L;
    Intrinsics.checkNotNullParameter(paramString, "method");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    try {
      if (!((((CharSequence)paramString).length() > 0) ? 1 : 0)) {
        boolean bool1 = false;
        String str = "method.isEmpty() == true";
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramRequestBody == null) {
        try {
          if (!(!HttpMethod.requiresRequestBody(paramString) ? 1 : 0)) {
            boolean bool1 = false;
            String str = "method " + paramString + " must have a request body.";
            throw new IllegalArgumentException(str.toString());
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else if (!HttpMethod.permitsRequestBody(paramString)) {
        boolean bool1 = false;
        String str = "method " + paramString + " must not have a request body.";
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    request$Builder2.setMethod$okhttp(paramString);
    request$Builder2.setBody$okhttp(paramRequestBody);
    return request$Builder1;
  }
  
  @NotNull
  public Request$Builder url(@NotNull URL paramURL) {
    long l = a ^ 0x75F2AA8E2835L;
    Intrinsics.checkNotNullParameter(paramURL, "url");
    String str = paramURL.toString();
    Intrinsics.checkNotNullExpressionValue(str, "url.toString()");
    return url(HttpUrl.Companion.get(str));
  }
  
  @NotNull
  public final Headers$Builder getHeaders$okhttp() {
    return this.headers;
  }
  
  @NotNull
  public Request$Builder header(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x57D7109955F1L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    request$Builder2.getHeaders$okhttp().set(paramString1, paramString2);
    return request$Builder1;
  }
  
  @NotNull
  public Request$Builder removeHeader(@NotNull String paramString) {
    long l = a ^ 0x441A68F4442CL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    request$Builder2.getHeaders$okhttp().removeAll(paramString);
    return request$Builder1;
  }
  
  @NotNull
  public Request$Builder url(@NotNull String paramString) {
    long l = a ^ 0x1A73043B66BCL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "url");
      Intrinsics.checkNotNullExpressionValue(paramString.substring(3), "this as java.lang.String).substring(startIndex)");
      try {
        Intrinsics.checkNotNullExpressionValue(paramString.substring(4), "this as java.lang.String).substring(startIndex)");
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    String str = StringsKt.startsWith(paramString, "ws:", true) ? Intrinsics.stringPlus("http:", paramString.substring(3)) : (StringsKt.startsWith(paramString, "wss:", true) ? Intrinsics.stringPlus("https:", paramString.substring(4)) : paramString);
    return url(HttpUrl.Companion.get(str));
  }
  
  @NotNull
  public Request$Builder put(@NotNull RequestBody paramRequestBody) {
    long l = a ^ 0x38D79F46129BL;
    Intrinsics.checkNotNullParameter(paramRequestBody, "body");
    return method("PUT", paramRequestBody);
  }
  
  @NotNull
  public Request$Builder cacheControl(@NotNull CacheControl paramCacheControl) {
    long l = a ^ 0x7FB5A494E72BL;
    Intrinsics.checkNotNullParameter(paramCacheControl, "cacheControl");
    String str = paramCacheControl.toString();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ((((CharSequence)str).length() == 0)) ? removeHeader("Cache-Control") : header("Cache-Control", str);
  }
  
  @NotNull
  public final String getMethod$okhttp() {
    return this.method;
  }
  
  @JvmOverloads
  @NotNull
  public Request$Builder delete(@Nullable RequestBody paramRequestBody) {
    long l = a ^ 0x78CB13BDDE7EL;
    return method("DELETE", paramRequestBody);
  }
  
  @NotNull
  public Request$Builder tag(@Nullable Object paramObject) {
    return tag(Object.class, paramObject);
  }
  
  @NotNull
  public Request$Builder addHeader(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x5EC9AB2603DL;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    request$Builder2.getHeaders$okhttp().add(paramString1, paramString2);
    return request$Builder1;
  }
  
  @NotNull
  public Request$Builder head() {
    long l = a ^ 0x753769004ABDL;
    return method("HEAD", null);
  }
  
  @NotNull
  public Request$Builder url(@NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x1BDDB5CA49C2L;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    request$Builder2.setUrl$okhttp(paramHttpUrl);
    return request$Builder1;
  }
  
  public Request$Builder(@NotNull Request paramRequest) {
    this.url = paramRequest.url();
    this.method = paramRequest.method();
    this.body = paramRequest.body();
    this.tags = paramRequest.getTags$okhttp().isEmpty() ? new LinkedHashMap<>() : MapsKt.toMutableMap(paramRequest.getTags$okhttp());
    this.headers = paramRequest.headers().newBuilder();
  }
  
  @NotNull
  public Request$Builder tag(@NotNull Class<?> paramClass, @Nullable Object paramObject) {
    long l = a ^ 0x21BE8EE4B54EL;
    Intrinsics.checkNotNullParameter(paramClass, "type");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    try {
      if (paramObject == null) {
        request$Builder2.getTags$okhttp().remove(paramClass);
      } else {
        try {
          if (request$Builder2.getTags$okhttp().isEmpty())
            request$Builder2.setTags$okhttp(new LinkedHashMap<>()); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Map<Class<?>, Object> map = request$Builder2.getTags$okhttp();
        Intrinsics.checkNotNull(paramClass.cast(paramObject));
        Object object = paramClass.cast(paramObject);
        map.put(paramClass, object);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return request$Builder1;
  }
  
  public final void setTags$okhttp(@NotNull Map paramMap) {
    long l = a ^ 0x744B47C98958L;
    Intrinsics.checkNotNullParameter(paramMap, "<set-?>");
    this.tags = paramMap;
  }
  
  @NotNull
  public Request$Builder get() {
    long l = a ^ 0x49BEEF7D7A83L;
    return method("GET", null);
  }
  
  @JvmOverloads
  @NotNull
  public final Request$Builder delete() {
    return delete$default(this, null, 1, null);
  }
  
  @Nullable
  public final RequestBody getBody$okhttp() {
    return this.body;
  }
  
  @NotNull
  public final Map getTags$okhttp() {
    return this.tags;
  }
  
  @NotNull
  public Request$Builder post(@NotNull RequestBody paramRequestBody) {
    long l = a ^ 0x16EFDCB12C44L;
    Intrinsics.checkNotNullParameter(paramRequestBody, "body");
    return method("POST", paramRequestBody);
  }
  
  public Request$Builder() {
    this.method = "GET";
    this.headers = new Headers$Builder();
  }
  
  public final void setHeaders$okhttp(@NotNull Headers$Builder paramHeaders$Builder) {
    long l = a ^ 0x7F545565B094L;
    Intrinsics.checkNotNullParameter(paramHeaders$Builder, "<set-?>");
    this.headers = paramHeaders$Builder;
  }
  
  public final void setBody$okhttp(@Nullable RequestBody paramRequestBody) {
    this.body = paramRequestBody;
  }
  
  @NotNull
  public Request$Builder headers(@NotNull Headers paramHeaders) {
    long l = a ^ 0x1C800C0E1A60L;
    Intrinsics.checkNotNullParameter(paramHeaders, "headers");
    Request$Builder request$Builder1 = this;
    Request$Builder request$Builder2 = request$Builder1;
    boolean bool = false;
    request$Builder2.setHeaders$okhttp(paramHeaders.newBuilder());
    return request$Builder1;
  }
  
  public final void setMethod$okhttp(@NotNull String paramString) {
    long l = a ^ 0x1D7B25481B95L;
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    this.method = paramString;
  }
  
  @Nullable
  public final HttpUrl getUrl$okhttp() {
    return this.url;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Request$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */