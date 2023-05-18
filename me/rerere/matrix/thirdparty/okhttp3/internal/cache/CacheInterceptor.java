package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Cache;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.Interceptor;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.ResponseBody;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.HttpHeaders;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.HttpMethod;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealResponseBody;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CacheInterceptor implements Interceptor {
  @NotNull
  public static final CacheInterceptor$Companion Companion;
  
  @Nullable
  private final Cache cache;
  
  private static final long a = o3.a(2465253495505990836L, 1983224059133651367L, MethodHandles.lookup().lookupClass()).a(28821795594421L);
  
  @NotNull
  public Response intercept(@NotNull Interceptor.Chain paramChain) throws IOException {
    long l1 = a ^ 0x388EF82FC5CDL;
    Intrinsics.checkNotNullParameter(paramChain, "chain");
    Call call = paramChain.call();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Response response1 = (this.cache == null) ? null : this.cache.get$okhttp(paramChain.request());
    long l2 = System.currentTimeMillis();
    CacheStrategy cacheStrategy = (new CacheStrategy$Factory(l2, paramChain.request(), response1)).compute();
    Request request = cacheStrategy.getNetworkRequest();
    Response response2 = cacheStrategy.getCacheResponse();
    try {
      if (this.cache == null) {
      
      } else {
        this.cache.trackResponse$okhttp(cacheStrategy);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      (call instanceof me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall) ? call : null;
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (((((call instanceof me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall) ? call : null) == null) ? null : ((call instanceof me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall) ? call : null).getEventListener$okhttp()) == null)
        (((call instanceof me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall) ? call : null) == null) ? null : ((call instanceof me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall) ? call : null).getEventListener$okhttp(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    EventListener eventListener = EventListener.NONE;
    try {
      if (response1 != null)
        try {
          if (response2 == null)
            try {
              if (response1.body() == null) {
                response1.body();
              } else {
                Util.closeQuietly((Closeable)response1.body());
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (request == null && response2 == null) {
        Response response5 = (new Response.Builder()).request(paramChain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        Response response6 = response5;
        boolean bool = false;
        eventListener.satisfactionFailure(call, response6);
        return response5;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (request == null) {
      Intrinsics.checkNotNull(response2);
      Response response5 = response2.newBuilder().cacheResponse(CacheInterceptor$Companion.access$stripBody(Companion, response2)).build();
      Response response6 = response5;
      boolean bool = false;
      eventListener.cacheHit(call, response6);
      return response5;
    } 
    try {
      if (response2 != null) {
        eventListener.cacheConditionalHit(call, response2);
      } else {
        try {
          if (this.cache != null)
            eventListener.cacheMiss(call); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Response response3 = null;
    try {
      response3 = paramChain.proceed(request);
    } finally {
      try {
        if (response1 != null)
          try {
            if (response1.body() == null) {
              response1.body();
            } else {
              Util.closeQuietly((Closeable)response1.body());
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    try {
      if (response2 != null) {
        try {
          try {
          
          } catch (IOException iOException) {
            throw a(null);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        if ((response3 == null) ? false : ((response3.code() == 304))) {
          Response response5 = response2.newBuilder().headers(CacheInterceptor$Companion.access$combine(Companion, response2.headers(), response3.headers())).sentRequestAtMillis(response3.sentRequestAtMillis()).receivedResponseAtMillis(response3.receivedResponseAtMillis()).cacheResponse(CacheInterceptor$Companion.access$stripBody(Companion, response2)).networkResponse(CacheInterceptor$Companion.access$stripBody(Companion, response3)).build();
          Intrinsics.checkNotNull(response3.body());
          response3.body().close();
          Intrinsics.checkNotNull(this.cache);
          this.cache.trackConditionalCacheHit$okhttp();
          this.cache.update$okhttp(response2, response5);
          Response response6 = response5;
          Response response7 = response6;
          boolean bool = false;
          eventListener.cacheHit(call, response7);
          return response6;
        } 
        try {
          if (response2.body() == null) {
            response2.body();
          } else {
            Util.closeQuietly((Closeable)response2.body());
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(response3);
    Response response4 = response3.newBuilder().cacheResponse(CacheInterceptor$Companion.access$stripBody(Companion, response2)).networkResponse(CacheInterceptor$Companion.access$stripBody(Companion, response3)).build();
    try {
      if (this.cache != null) {
        try {
          if (HttpHeaders.promisesBody(response4) && CacheStrategy.Companion.isCacheable(response4, request)) {
            CacheRequest cacheRequest = this.cache.put$okhttp(response4);
            Response response5 = cacheWritingResponse(cacheRequest, response4);
            Response response6 = response5;
            boolean bool = false;
            try {
              if (response2 != null)
                eventListener.cacheMiss(call); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return response5;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (HttpMethod.INSTANCE.invalidatesCache(request.method()))
            try {
              this.cache.remove$okhttp(request);
            } catch (IOException iOException) {} 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return response4;
  }
  
  public CacheInterceptor(@Nullable Cache paramCache) {
    this.cache = paramCache;
  }
  
  static {
    Companion = new CacheInterceptor$Companion(null);
  }
  
  @Nullable
  public final Cache getCache$okhttp() {
    return this.cache;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\CacheInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */