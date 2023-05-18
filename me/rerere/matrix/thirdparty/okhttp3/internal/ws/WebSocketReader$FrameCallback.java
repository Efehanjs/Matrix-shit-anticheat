package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface WebSocketReader$FrameCallback {
  void onReadPing(@NotNull ByteString paramByteString);
  
  void onReadMessage(@NotNull String paramString) throws IOException;
  
  void onReadPong(@NotNull ByteString paramByteString);
  
  void onReadClose(int paramInt, @NotNull String paramString);
  
  void onReadMessage(@NotNull ByteString paramByteString) throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\WebSocketReader$FrameCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */