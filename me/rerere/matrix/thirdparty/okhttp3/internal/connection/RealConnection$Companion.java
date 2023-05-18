package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import java.net.Socket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealConnection$Companion {
  private static final long a = o3.a(9124373038508897950L, 5297840228136471624L, MethodHandles.lookup().lookupClass()).a(198439564571675L);
  
  @NotNull
  public final RealConnection newTestConnection(@NotNull RealConnectionPool paramRealConnectionPool, @NotNull Route paramRoute, @NotNull Socket paramSocket, long paramLong) {
    long l = a ^ 0x7D09EC984190L;
    Intrinsics.checkNotNullParameter(paramRealConnectionPool, "connectionPool");
    Intrinsics.checkNotNullParameter(paramRoute, "route");
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    RealConnection realConnection = new RealConnection(paramRealConnectionPool, paramRoute);
    RealConnection.access$setSocket$p(realConnection, paramSocket);
    realConnection.setIdleAtNs$okhttp(paramLong);
    return realConnection;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnection$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */