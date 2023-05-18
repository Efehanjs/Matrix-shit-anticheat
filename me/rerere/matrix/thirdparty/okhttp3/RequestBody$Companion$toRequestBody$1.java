package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
  private static final long a = o3.a(-6008905389530892245L, 5983517174461838057L, MethodHandles.lookup().lookupClass()).a(185669545362404L);
  
  @Nullable
  public MediaType contentType() {
    return this.$contentType;
  }
  
  public RequestBody$Companion$toRequestBody$1(MediaType paramMediaType, ByteString paramByteString) {}
  
  public void writeTo(@NotNull BufferedSink paramBufferedSink) {
    long l = a ^ 0x4E950E75CED8L;
    Intrinsics.checkNotNullParameter(paramBufferedSink, "sink");
    paramBufferedSink.write(this.$this_toRequestBody);
  }
  
  public long contentLength() {
    return this.$this_toRequestBody.size();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\RequestBody$Companion$toRequestBody$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */