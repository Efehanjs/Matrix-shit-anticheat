package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealWebSocket$Close {
  private final int code;
  
  private final long cancelAfterCloseMillis;
  
  @Nullable
  private final ByteString reason;
  
  @Nullable
  public final ByteString getReason() {
    return this.reason;
  }
  
  public RealWebSocket$Close(int paramInt, @Nullable ByteString paramByteString, long paramLong) {
    this.code = paramInt;
    this.reason = paramByteString;
    this.cancelAfterCloseMillis = paramLong;
  }
  
  public final int getCode() {
    return this.code;
  }
  
  public final long getCancelAfterCloseMillis() {
    return this.cancelAfterCloseMillis;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket$Close.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */