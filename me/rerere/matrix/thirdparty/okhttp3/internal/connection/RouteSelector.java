package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Address;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RouteSelector {
  @NotNull
  private List inetSocketAddresses;
  
  @NotNull
  private List proxies;
  
  @NotNull
  private final Call call;
  
  @NotNull
  private final Address address;
  
  private int nextProxyIndex;
  
  @NotNull
  private final RouteDatabase routeDatabase;
  
  @NotNull
  public static final RouteSelector$Companion Companion;
  
  @NotNull
  private final EventListener eventListener;
  
  @NotNull
  private final List postponedRoutes;
  
  private static final long a = o3.a(3140600076689515991L, 5658800719291338283L, MethodHandles.lookup().lookupClass()).a(203242941912848L);
  
  public final boolean hasNext() {
    try {
      if (!hasNextProxy()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (!this.postponedRoutes.isEmpty());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  static {
    Companion = new RouteSelector$Companion(null);
  }
  
  public RouteSelector(@NotNull Address paramAddress, @NotNull RouteDatabase paramRouteDatabase, @NotNull Call paramCall, @NotNull EventListener paramEventListener) {
    this.address = paramAddress;
    this.routeDatabase = paramRouteDatabase;
    this.call = paramCall;
    this.eventListener = paramEventListener;
    this.proxies = CollectionsKt.emptyList();
    this.inetSocketAddresses = CollectionsKt.emptyList();
    this.postponedRoutes = new ArrayList();
    resetNextProxy(this.address.url(), this.address.proxy());
  }
  
  @NotNull
  public final RouteSelector$Selection next() throws IOException {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ArrayList<Route> arrayList = new ArrayList();
    while (hasNextProxy()) {
      Proxy proxy = nextProxy();
      for (InetSocketAddress inetSocketAddress : this.inetSocketAddresses) {
        Route route = new Route(this.address, proxy, inetSocketAddress);
        try {
          if (this.routeDatabase.shouldPostpone(route)) {
            this.postponedRoutes.add(route);
            continue;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        arrayList.add(route);
      } 
      try {
        if (!arrayList.isEmpty())
          break; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    if (arrayList.isEmpty()) {
      ArrayList<Route> arrayList1 = arrayList;
      List list = this.postponedRoutes;
      CollectionsKt.addAll(arrayList1, list);
      this.postponedRoutes.clear();
    } 
    return new RouteSelector$Selection(arrayList);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RouteSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */