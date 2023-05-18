package me.rerere.matrix.thirdparty.okhttp3;

import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
  public ResponseBody$Companion$asResponseBody$1(MediaType paramMediaType, long paramLong, BufferedSource paramBufferedSource) {}
  
  @NotNull
  public BufferedSource source() {
    return this.$this_asResponseBody;
  }
  
  @Nullable
  public MediaType contentType() {
    return this.$contentType;
  }
  
  public long contentLength() {
    return this.$contentLength;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ResponseBody$Companion$asResponseBody$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */