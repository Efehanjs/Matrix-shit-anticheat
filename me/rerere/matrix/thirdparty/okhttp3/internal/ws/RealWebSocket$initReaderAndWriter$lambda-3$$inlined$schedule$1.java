package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1 extends Task {
  public RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1(RealWebSocket paramRealWebSocket, long paramLong) {
    super(paramString, false, 2, null);
  }
  
  public long runOnce() {
    boolean bool = false;
    RealWebSocket.this.writePingFrame$okhttp();
    return this.$pingIntervalNanos$inlined;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */