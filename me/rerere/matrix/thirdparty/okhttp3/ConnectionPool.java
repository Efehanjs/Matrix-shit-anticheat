package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealConnectionPool;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ConnectionPool {
  @NotNull
  private final RealConnectionPool delegate;
  
  private static final long a = o3.a(4981414851415515791L, -5610169760231488640L, MethodHandles.lookup().lookupClass()).a(185967117504638L);
  
  public ConnectionPool() {
    this(5, 5L, TimeUnit.MINUTES);
  }
  
  @NotNull
  public final RealConnectionPool getDelegate$okhttp() {
    return this.delegate;
  }
  
  public ConnectionPool(@NotNull RealConnectionPool paramRealConnectionPool) {
    this.delegate = paramRealConnectionPool;
  }
  
  public final int idleConnectionCount() {
    return this.delegate.idleConnectionCount();
  }
  
  public final int connectionCount() {
    return this.delegate.connectionCount();
  }
  
  public ConnectionPool(int paramInt, long paramLong, @NotNull TimeUnit paramTimeUnit) {
    this(new RealConnectionPool(TaskRunner.INSTANCE, paramInt, paramLong, paramTimeUnit));
  }
  
  public final void evictAll() {
    this.delegate.evictAll();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ConnectionPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */