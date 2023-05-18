package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Regex;
import me.rerere.matrix.thirdparty.okhttp3.Interceptor;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.RequestBody;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.Exchange;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RouteException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RetryAndFollowUpInterceptor implements Interceptor {
  private static final int MAX_FOLLOW_UPS = 20;
  
  @NotNull
  private final OkHttpClient client;
  
  @NotNull
  public static final RetryAndFollowUpInterceptor$Companion Companion;
  
  private static final long a = o3.a(2559745631247185695L, 8014129690259972008L, MethodHandles.lookup().lookupClass()).a(157006469070472L);
  
  static {
    Companion = new RetryAndFollowUpInterceptor$Companion(null);
  }
  
  public RetryAndFollowUpInterceptor(@NotNull OkHttpClient paramOkHttpClient) {
    this.client = paramOkHttpClient;
  }
  
  @NotNull
  public Response intercept(@NotNull Interceptor.Chain paramChain) throws IOException {
    long l = a ^ 0x100A6CBD891AL;
    Intrinsics.checkNotNullParameter(paramChain, "chain");
    RealInterceptorChain realInterceptorChain = (RealInterceptorChain)paramChain;
    Request request = ((RealInterceptorChain)paramChain).getRequest$okhttp();
    RealCall realCall = realInterceptorChain.getCall$okhttp();
    byte b = 0;
    Response response = null;
    boolean bool = true;
    List list = CollectionsKt.emptyList();
    while (true) {
      realCall.enterNetworkInterceptorExchange(request, bool);
      Response response1 = null;
      boolean bool1 = true;
      try {
        try {
          if (realCall.isCanceled())
            throw new IOException("Canceled"); 
        } catch (RouteException routeException) {
          throw a(null);
        } 
        try {
          response1 = realInterceptorChain.proceed(request);
          bool = true;
        } catch (RouteException routeException) {
          try {
            if (!recover(routeException.getLastConnectException(), realCall, request, false))
              throw Util.withSuppressed(routeException.getFirstConnectException(), list); 
          } catch (RouteException routeException1) {
            throw a(null);
          } 
          list = CollectionsKt.plus(list, routeException.getFirstConnectException());
          bool = false;
          realCall.exitNetworkInterceptorExchange$okhttp(bool1);
          continue;
        } catch (IOException iOException) {
          try {
          
          } catch (RouteException routeException) {
            throw a(null);
          } 
          try {
            if (!recover(iOException, realCall, request, !(iOException instanceof me.rerere.matrix.thirdparty.okhttp3.internal.http2.ConnectionShutdownException)))
              throw Util.withSuppressed(iOException, list); 
          } catch (RouteException routeException) {
            throw a(null);
          } 
          list = CollectionsKt.plus(list, iOException);
          bool = false;
          realCall.exitNetworkInterceptorExchange$okhttp(bool1);
          continue;
        } 
        if (response != null)
          response1 = response1.newBuilder().priorResponse(response.newBuilder().body(null).build()).build(); 
        Exchange exchange = realCall.getInterceptorScopedExchange$okhttp();
        Request request1 = followUpRequest(response1, exchange);
        try {
          if (request1 == null) {
            try {
              if (exchange != null)
                try {
                  if (exchange.isDuplex$okhttp())
                    realCall.timeoutEarlyExit(); 
                } catch (RouteException routeException) {
                  throw a(null);
                }  
            } catch (RouteException routeException) {
              throw a(null);
            } 
            bool1 = false;
            return response1;
          } 
        } catch (RouteException routeException) {
          throw a(null);
        } 
        RequestBody requestBody = request1.body();
        try {
          if (requestBody != null && requestBody.isOneShot()) {
            bool1 = false;
            return response1;
          } 
        } catch (RouteException routeException) {
          throw a(null);
        } 
        try {
          if (response1.body() == null) {
            response1.body();
          } else {
            Util.closeQuietly((Closeable)response1.body());
          } 
        } catch (RouteException routeException) {
          throw a(null);
        } 
        try {
          if (++b > 20)
            throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(b))); 
        } catch (RouteException routeException) {
          throw a(null);
        } 
        request = request1;
        response = response1;
      } finally {
        realCall.exitNetworkInterceptorExchange$okhttp(bool1);
      } 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\RetryAndFollowUpInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */