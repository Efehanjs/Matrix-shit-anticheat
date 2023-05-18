package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 extends Task {
  public Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(boolean paramBoolean1, Http2Connection$ReaderRunnable paramHttp2Connection$ReaderRunnable, boolean paramBoolean2, Settings paramSettings) {
    super(paramString, paramBoolean1);
  }
  
  public long runOnce() {
    boolean bool = false;
    Http2Connection$ReaderRunnable.this.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
    return -1L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */