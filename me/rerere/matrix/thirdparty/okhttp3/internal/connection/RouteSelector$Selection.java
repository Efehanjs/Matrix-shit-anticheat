package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RouteSelector$Selection {
  private int nextRouteIndex;
  
  @NotNull
  private final List routes;
  
  private static final long a = o3.a(-5145264840312873747L, 5842234646206423595L, MethodHandles.lookup().lookupClass()).a(195038553929225L);
  
  public RouteSelector$Selection(@NotNull List paramList) {
    this.routes = paramList;
  }
  
  @NotNull
  public final Route next() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = this.nextRouteIndex;
    this.nextRouteIndex = i + 1;
    return this.routes.get(i);
  }
  
  @NotNull
  public final List getRoutes() {
    return this.routes;
  }
  
  public final boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.nextRouteIndex < this.routes.size());
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RouteSelector$Selection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */