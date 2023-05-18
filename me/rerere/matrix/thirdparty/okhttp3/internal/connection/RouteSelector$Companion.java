package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RouteSelector$Companion {
  private static final long a = o3.a(-3734385231429051085L, -6505894381720631697L, MethodHandles.lookup().lookupClass()).a(171381570062112L);
  
  @NotNull
  public final String getSocketHost(@NotNull InetSocketAddress paramInetSocketAddress) {
    InetAddress inetAddress;
    long l = a ^ 0x5D7B2D6CD077L;
    Intrinsics.checkNotNullParameter(paramInetSocketAddress, "<this>");
    if (paramInetSocketAddress.getAddress() == null) {
      paramInetSocketAddress.getAddress();
      String str1 = paramInetSocketAddress.getHostName();
      Intrinsics.checkNotNullExpressionValue(str1, "hostName");
      return str1;
    } 
    String str = inetAddress.getHostAddress();
    Intrinsics.checkNotNullExpressionValue(str, "address.hostAddress");
    return str;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RouteSelector$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */