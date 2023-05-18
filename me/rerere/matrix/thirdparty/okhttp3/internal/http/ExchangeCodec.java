package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealConnection;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface ExchangeCodec {
  public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
  
  @NotNull
  public static final ExchangeCodec$Companion Companion = ExchangeCodec$Companion.$$INSTANCE;
  
  void writeRequestHeaders(@NotNull Request paramRequest) throws IOException;
  
  @NotNull
  Headers trailers() throws IOException;
  
  void finishRequest() throws IOException;
  
  @NotNull
  Source openResponseBodySource(@NotNull Response paramResponse) throws IOException;
  
  @NotNull
  Sink createRequestBody(@NotNull Request paramRequest, long paramLong) throws IOException;
  
  void cancel();
  
  @Nullable
  Response.Builder readResponseHeaders(boolean paramBoolean) throws IOException;
  
  long reportedContentLength(@NotNull Response paramResponse) throws IOException;
  
  @NotNull
  RealConnection getConnection();
  
  void flushRequest() throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\ExchangeCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */