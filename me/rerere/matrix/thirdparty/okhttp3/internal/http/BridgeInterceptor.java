package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.CookieJar;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.Interceptor;
import me.rerere.matrix.thirdparty.okhttp3.MediaType;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.RequestBody;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.ResponseBody;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.GzipSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class BridgeInterceptor implements Interceptor {
  @NotNull
  private final CookieJar cookieJar;
  
  private static final long a = o3.a(5301720529800058270L, 1982098582489938784L, MethodHandles.lookup().lookupClass()).a(194837298521767L);
  
  @NotNull
  public Response intercept(@NotNull Interceptor.Chain paramChain) throws IOException {
    long l = a ^ 0xCFD689648F5L;
    Intrinsics.checkNotNullParameter(paramChain, "chain");
    Request request = paramChain.request();
    Request.Builder builder = request.newBuilder();
    RequestBody requestBody = request.body();
    if (requestBody != null) {
      MediaType mediaType = requestBody.contentType();
      try {
        if (mediaType != null)
          builder.header("Content-Type", mediaType.toString()); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      long l1 = requestBody.contentLength();
      try {
        if (l1 != -1L) {
          builder.header("Content-Length", String.valueOf(l1));
          builder.removeHeader("Transfer-Encoding");
        } else {
          builder.header("Transfer-Encoding", "chunked");
          builder.removeHeader("Content-Length");
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    try {
      if (request.header("Host") == null)
        builder.header("Host", Util.toHostHeader$default(request.url(), false, 1, null)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (request.header("Connection") == null)
        builder.header("Connection", "Keep-Alive"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = false;
    try {
      if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
        bool = true;
        builder.header("Accept-Encoding", "gzip");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    List list = this.cookieJar.loadForRequest(request.url());
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!list.isEmpty())
        builder.header("Cookie", cookieHeader(list)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (request.header("User-Agent") == null)
        builder.header("User-Agent", "okhttp/4.10.0"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Response response = paramChain.proceed(builder.build());
    HttpHeaders.receiveHeaders(this.cookieJar, request.url(), response.headers());
    Response.Builder builder1 = response.newBuilder().request(request);
    try {
      if (bool)
        try {
          if (StringsKt.equals("gzip", Response.header$default(response, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody(response)) {
            ResponseBody responseBody = response.body();
            if (responseBody != null) {
              GzipSource gzipSource = new GzipSource((Source)responseBody.source());
              Headers headers = response.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build();
              builder1.headers(headers);
              String str = Response.header$default(response, "Content-Type", null, 2, null);
              builder1.body(new RealResponseBody(str, -1L, Okio.buffer((Source)gzipSource)));
            } 
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return builder1.build();
  }
  
  public BridgeInterceptor(@NotNull CookieJar paramCookieJar) {
    this.cookieJar = paramCookieJar;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\BridgeInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */