package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import me.rerere.matrix.thirdparty.okio.AsyncTimeout;

public final class RealCall$timeout$1 extends AsyncTimeout {
  public void timedOut() {
    RealCall.this.cancel();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealCall$timeout$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */