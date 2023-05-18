package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class WebSocketListener {
  private static final long a = o3.a(8183442216495378007L, -7697844671155913181L, MethodHandles.lookup().lookupClass()).a(217588602900958L);
  
  public void onFailure(@NotNull WebSocket paramWebSocket, @NotNull Throwable paramThrowable, @Nullable Response paramResponse) {
    long l = a ^ 0xA53412F42D0L;
    Intrinsics.checkNotNullParameter(paramWebSocket, "webSocket");
    Intrinsics.checkNotNullParameter(paramThrowable, "t");
  }
  
  public void onOpen(@NotNull WebSocket paramWebSocket, @NotNull Response paramResponse) {
    long l = a ^ 0x3AD12167A346L;
    Intrinsics.checkNotNullParameter(paramWebSocket, "webSocket");
    Intrinsics.checkNotNullParameter(paramResponse, "response");
  }
  
  public void onClosed(@NotNull WebSocket paramWebSocket, int paramInt, @NotNull String paramString) {
    long l = a ^ 0x12050107556BL;
    Intrinsics.checkNotNullParameter(paramWebSocket, "webSocket");
    Intrinsics.checkNotNullParameter(paramString, "reason");
  }
  
  public void onMessage(@NotNull WebSocket paramWebSocket, @NotNull String paramString) {
    long l = a ^ 0x31E32599D947L;
    Intrinsics.checkNotNullParameter(paramWebSocket, "webSocket");
    Intrinsics.checkNotNullParameter(paramString, "text");
  }
  
  public void onClosing(@NotNull WebSocket paramWebSocket, int paramInt, @NotNull String paramString) {
    long l = a ^ 0x50846EC87B67L;
    Intrinsics.checkNotNullParameter(paramWebSocket, "webSocket");
    Intrinsics.checkNotNullParameter(paramString, "reason");
  }
  
  public void onMessage(@NotNull WebSocket paramWebSocket, @NotNull ByteString paramByteString) {
    long l = a ^ 0x63FAA5CEC629L;
    Intrinsics.checkNotNullParameter(paramWebSocket, "webSocket");
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\WebSocketListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */