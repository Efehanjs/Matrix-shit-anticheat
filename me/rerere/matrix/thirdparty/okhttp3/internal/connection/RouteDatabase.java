package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashSet;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RouteDatabase {
  @NotNull
  private final Set failedRoutes = new LinkedHashSet();
  
  private static final long a = o3.a(-3091514057455373743L, 4732346820593844809L, MethodHandles.lookup().lookupClass()).a(150534175381941L);
  
  public final synchronized void failed(@NotNull Route paramRoute) {
    long l = a ^ 0x4347AF7C4848L;
    Intrinsics.checkNotNullParameter(paramRoute, "failedRoute");
    this.failedRoutes.add(paramRoute);
  }
  
  public final synchronized boolean shouldPostpone(@NotNull Route paramRoute) {
    long l = a ^ 0x4C75B4FAD91BL;
    Intrinsics.checkNotNullParameter(paramRoute, "route");
    return this.failedRoutes.contains(paramRoute);
  }
  
  public final synchronized void connected(@NotNull Route paramRoute) {
    long l = a ^ 0x34B346BC8294L;
    Intrinsics.checkNotNullParameter(paramRoute, "route");
    this.failedRoutes.remove(paramRoute);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RouteDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */