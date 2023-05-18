package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface Http2Reader$Handler {
  void goAway(int paramInt, @NotNull ErrorCode paramErrorCode, @NotNull ByteString paramByteString);
  
  void windowUpdate(int paramInt, long paramLong);
  
  void data(boolean paramBoolean, int paramInt1, @NotNull BufferedSource paramBufferedSource, int paramInt2) throws IOException;
  
  void ping(boolean paramBoolean, int paramInt1, int paramInt2);
  
  void ackSettings();
  
  void settings(boolean paramBoolean, @NotNull Settings paramSettings);
  
  void rstStream(int paramInt, @NotNull ErrorCode paramErrorCode);
  
  void pushPromise(int paramInt1, int paramInt2, @NotNull List paramList) throws IOException;
  
  void headers(boolean paramBoolean, int paramInt1, int paramInt2, @NotNull List paramList);
  
  void alternateService(int paramInt1, @NotNull String paramString1, @NotNull ByteString paramByteString, @NotNull String paramString2, int paramInt2, long paramLong);
  
  void priority(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Reader$Handler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */