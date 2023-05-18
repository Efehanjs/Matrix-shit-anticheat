package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1 extends Task {
  public Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1(boolean paramBoolean, Http2Connection paramHttp2Connection, Ref.ObjectRef paramObjectRef) {
    super(paramString, paramBoolean);
  }
  
  public long runOnce() {
    boolean bool = false;
    Http2Connection.this.getListener$okhttp().onSettings(Http2Connection.this, (Settings)this.$newPeerSettings$inlined.element);
    return -1L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */