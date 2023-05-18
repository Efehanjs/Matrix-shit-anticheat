package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Address;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.ExchangeCodec;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealInterceptorChain;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.ErrorCode;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.StreamResetException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ExchangeFinder {
  @Nullable
  private RouteSelector routeSelector;
  
  private int refusedStreamCount;
  
  @NotNull
  private final Address address;
  
  @NotNull
  private final EventListener eventListener;
  
  private int connectionShutdownCount;
  
  @NotNull
  private final RealConnectionPool connectionPool;
  
  @NotNull
  private final RealCall call;
  
  private int otherFailureCount;
  
  @Nullable
  private RouteSelector$Selection routeSelection;
  
  @Nullable
  private Route nextRouteToTry;
  
  private static final long a = o3.a(-7775277715825157586L, 1805006294733013441L, MethodHandles.lookup().lookupClass()).a(13763143675047L);
  
  public final boolean sameHostAndPort(@NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x457E302A203FL;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    HttpUrl httpUrl = this.address.url();
    try {
      if (paramHttpUrl.port() == httpUrl.port())
        try {
          if (Intrinsics.areEqual(paramHttpUrl.host(), httpUrl.host()));
        } catch (RouteException routeException) {
          throw a(null);
        }  
    } catch (RouteException routeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public final Address getAddress$okhttp() {
    return this.address;
  }
  
  public final boolean retryAfterFailure() {
    RouteSelector routeSelector;
    try {
      if (this.refusedStreamCount == 0)
        try {
          if (this.connectionShutdownCount == 0)
            try {
              if (this.otherFailureCount == 0)
                return false; 
            } catch (RouteException routeException) {
              throw a(null);
            }  
        } catch (RouteException routeException) {
          throw a(null);
        }  
    } catch (RouteException routeException) {
      throw a(null);
    } 
    try {
      if (this.nextRouteToTry != null)
        return true; 
    } catch (RouteException routeException) {
      throw a(null);
    } 
    Route route = retryRoute();
    try {
      if (route != null) {
        this.nextRouteToTry = route;
        return true;
      } 
    } catch (RouteException routeException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (RouteException routeException) {
        throw a(null);
      } 
    } catch (RouteException routeException) {
      throw a(null);
    } 
    try {
      if ((this.routeSelection == null) ? false : ((this.routeSelection.hasNext() == true)))
        return true; 
    } catch (RouteException routeException) {
      throw a(null);
    } 
    try {
      if (this.routeSelector == null)
        return true; 
    } catch (RouteException routeException) {
      throw a(null);
    } 
    return routeSelector.hasNext();
  }
  
  public ExchangeFinder(@NotNull RealConnectionPool paramRealConnectionPool, @NotNull Address paramAddress, @NotNull RealCall paramRealCall, @NotNull EventListener paramEventListener) {
    this.connectionPool = paramRealConnectionPool;
    this.address = paramAddress;
    this.call = paramRealCall;
    this.eventListener = paramEventListener;
  }
  
  @NotNull
  public final ExchangeCodec find(@NotNull OkHttpClient paramOkHttpClient, @NotNull RealInterceptorChain paramRealInterceptorChain) {
    long l = a ^ 0x73F015688C72L;
    Intrinsics.checkNotNullParameter(paramOkHttpClient, "client");
    Intrinsics.checkNotNullParameter(paramRealInterceptorChain, "chain");
    try {
      RealConnection realConnection = findHealthyConnection(paramRealInterceptorChain.getConnectTimeoutMillis$okhttp(), paramRealInterceptorChain.getReadTimeoutMillis$okhttp(), paramRealInterceptorChain.getWriteTimeoutMillis$okhttp(), paramOkHttpClient.pingIntervalMillis(), paramOkHttpClient.retryOnConnectionFailure(), !Intrinsics.areEqual(paramRealInterceptorChain.getRequest$okhttp().method(), "GET"));
      return realConnection.newCodec$okhttp(paramOkHttpClient, paramRealInterceptorChain);
    } catch (RouteException routeException) {
      trackFailure(routeException.getLastConnectException());
      throw routeException;
    } catch (IOException iOException) {
      trackFailure(iOException);
      throw new RouteException(iOException);
    } 
  }
  
  public final void trackFailure(@NotNull IOException paramIOException) {
    try {
      Intrinsics.checkNotNullParameter(paramIOException, "e");
      this.nextRouteToTry = null;
      if (paramIOException instanceof StreamResetException && ((StreamResetException)paramIOException).errorCode == ErrorCode.REFUSED_STREAM) {
        int i = this.refusedStreamCount;
        this.refusedStreamCount = i + 1;
      } else if (paramIOException instanceof me.rerere.matrix.thirdparty.okhttp3.internal.http2.ConnectionShutdownException) {
        int i = this.connectionShutdownCount;
        this.connectionShutdownCount = i + 1;
      } else {
        int i = this.otherFailureCount;
        this.otherFailureCount = i + 1;
      } 
    } catch (RouteException routeException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\ExchangeFinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */