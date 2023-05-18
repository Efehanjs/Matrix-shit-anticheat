package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.ConnectionPool;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealConnectionPool$Companion {
  private static final long a = o3.a(4837294644514258501L, 1884099031622535499L, MethodHandles.lookup().lookupClass()).a(138211783346380L);
  
  @NotNull
  public final RealConnectionPool get(@NotNull ConnectionPool paramConnectionPool) {
    long l = a ^ 0x67CB32306068L;
    Intrinsics.checkNotNullParameter(paramConnectionPool, "connectionPool");
    return paramConnectionPool.getDelegate$okhttp();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnectionPool$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */