package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class RealConnectionPool$cleanupTask$1 extends Task {
  public RealConnectionPool$cleanupTask$1(String paramString) {
    super(paramString, false, 2, null);
  }
  
  public long runOnce() {
    return RealConnectionPool.this.cleanup(System.nanoTime());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnectionPool$cleanupTask$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */