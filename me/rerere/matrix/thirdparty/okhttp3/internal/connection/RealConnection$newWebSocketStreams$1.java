package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import me.rerere.matrix.thirdparty.okhttp3.internal.ws.RealWebSocket;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;

public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
  public RealConnection$newWebSocketStreams$1(BufferedSource paramBufferedSource, BufferedSink paramBufferedSink, Exchange paramExchange) {
    super(true, paramBufferedSource, paramBufferedSink);
  }
  
  public void close() {
    this.$exchange.bodyComplete(-1L, true, true, null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnection$newWebSocketStreams$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */