package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.MediaType;
import me.rerere.matrix.thirdparty.okhttp3.ResponseBody;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealResponseBody extends ResponseBody {
  @NotNull
  private final BufferedSource source;
  
  private final long contentLength;
  
  @Nullable
  private final String contentTypeString;
  
  private static final long a = o3.a(-3593361258778121836L, -5463725984129623637L, MethodHandles.lookup().lookupClass()).a(231474644462215L);
  
  @NotNull
  public BufferedSource source() {
    return this.source;
  }
  
  @Nullable
  public MediaType contentType() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.contentTypeString == null) ? null : MediaType.Companion.parse(this.contentTypeString);
  }
  
  public RealResponseBody(@Nullable String paramString, long paramLong, @NotNull BufferedSource paramBufferedSource) {
    this.contentTypeString = paramString;
    this.contentLength = paramLong;
    this.source = paramBufferedSource;
  }
  
  public long contentLength() {
    return this.contentLength;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\RealResponseBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */