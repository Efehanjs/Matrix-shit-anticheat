package me.rerere.matrix.thirdparty.okhttp3;

import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface WebSocket {
  void cancel();
  
  boolean close(int paramInt, @Nullable String paramString);
  
  boolean send(@NotNull String paramString);
  
  long queueSize();
  
  boolean send(@NotNull ByteString paramByteString);
  
  @NotNull
  Request request();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\WebSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */