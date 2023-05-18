package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
  private static final long a = o3.a(-2580874288801304738L, 8004026161636023774L, MethodHandles.lookup().lookupClass()).a(269206728583716L);
  
  @Nullable
  public MediaType contentType() {
    return this.$contentType;
  }
  
  public RequestBody$Companion$toRequestBody$2(MediaType paramMediaType, int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {}
  
  public long contentLength() {
    return this.$byteCount;
  }
  
  public void writeTo(@NotNull BufferedSink paramBufferedSink) {
    long l = a ^ 0x6C7441E87812L;
    Intrinsics.checkNotNullParameter(paramBufferedSink, "sink");
    paramBufferedSink.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\RequestBody$Companion$toRequestBody$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */