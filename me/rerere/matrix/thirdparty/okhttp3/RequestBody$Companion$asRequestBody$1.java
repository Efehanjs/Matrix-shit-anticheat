package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.File;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
  private static final long a = o3.a(-8958420681385402814L, 4181805378678357810L, MethodHandles.lookup().lookupClass()).a(30146003978733L);
  
  public void writeTo(@NotNull BufferedSink paramBufferedSink) {
    long l = a ^ 0xB7009C6C8DDL;
    Intrinsics.checkNotNullParameter(paramBufferedSink, "sink");
    Closeable closeable = (Closeable)Okio.source(this.$this_asRequestBody);
    Throwable throwable = null;
    try {
      Source source = (Source)closeable;
      boolean bool = false;
      long l1 = paramBufferedSink.writeAll(source);
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
  }
  
  @Nullable
  public MediaType contentType() {
    return this.$contentType;
  }
  
  public RequestBody$Companion$asRequestBody$1(MediaType paramMediaType, File paramFile) {}
  
  public long contentLength() {
    return this.$this_asRequestBody.length();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\RequestBody$Companion$asRequestBody$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */