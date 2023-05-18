package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.Callback;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.Exchange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealWebSocket$connect$1 implements Callback {
  private static final long a = o3.a(1952118236411321947L, 3099044395808809517L, MethodHandles.lookup().lookupClass()).a(10939313398501L);
  
  public void onFailure(@NotNull Call paramCall, @NotNull IOException paramIOException) {
    long l = a ^ 0x1A7C4F2545A2L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramIOException, "e");
    RealWebSocket.this.failWebSocket(paramIOException, null);
  }
  
  public void onResponse(@NotNull Call paramCall, @NotNull Response paramResponse) {
    long l = a ^ 0x12D598CD3D96L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    Exchange exchange = paramResponse.exchange();
    RealWebSocket$Streams realWebSocket$Streams = null;
    try {
      RealWebSocket.this.checkUpgradeSuccess$okhttp(paramResponse, exchange);
      Intrinsics.checkNotNull(exchange);
      realWebSocket$Streams = exchange.newWebSocketStreams();
    } catch (IOException iOException) {
      try {
        if (exchange == null) {
        
        } else {
          exchange.webSocketUpgradeFailed();
        } 
      } catch (IOException iOException1) {
        throw a(null);
      } 
      RealWebSocket.this.failWebSocket(iOException, paramResponse);
      Util.closeQuietly((Closeable)paramResponse);
      return;
    } 
    WebSocketExtensions webSocketExtensions = WebSocketExtensions.Companion.parse(paramResponse.headers());
    RealWebSocket.access$setExtensions$p(RealWebSocket.this, webSocketExtensions);
    if (!RealWebSocket.access$isValid(RealWebSocket.this, webSocketExtensions)) {
      RealWebSocket realWebSocket1 = RealWebSocket.this;
      RealWebSocket realWebSocket2 = RealWebSocket.this;
      synchronized (realWebSocket1) {
        boolean bool = false;
        RealWebSocket.access$getMessageAndCloseQueue$p(realWebSocket2).clear();
        bool = realWebSocket2.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
      } 
    } 
    try {
      String str = Util.okHttpName + " WebSocket " + this.$request.url().redact();
      RealWebSocket.this.initReaderAndWriter(str, realWebSocket$Streams);
      RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, paramResponse);
      RealWebSocket.this.loopReader();
    } catch (Exception exception) {
      RealWebSocket.this.failWebSocket(exception, null);
    } 
  }
  
  public RealWebSocket$connect$1(Request paramRequest) {}
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket$connect$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */