package me.rerere.matrix.thirdparty.okhttp3.internal.http1;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class HeadersReader {
  private long headerLimit;
  
  @NotNull
  public static final HeadersReader$Companion Companion;
  
  @NotNull
  private final BufferedSource source;
  
  private static final int HEADER_LIMIT = 262144;
  
  private static final long a = o3.a(-3346681743419230159L, -7091278286219619040L, MethodHandles.lookup().lookupClass()).a(183963318406119L);
  
  public HeadersReader(@NotNull BufferedSource paramBufferedSource) {
    this.source = paramBufferedSource;
    this.headerLimit = 262144L;
  }
  
  @NotNull
  public final BufferedSource getSource() {
    return this.source;
  }
  
  @NotNull
  public final Headers readHeaders() {
    Headers.Builder builder = new Headers.Builder();
    while (true) {
      String str = readLine();
      try {
        if ((((CharSequence)str).length() == 0))
          return builder.build(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      builder.addLenient$okhttp(str);
    } 
  }
  
  @NotNull
  public final String readLine() {
    String str = this.source.readUtf8LineStrict(this.headerLimit);
    this.headerLimit -= str.length();
    return str;
  }
  
  static {
    Companion = new HeadersReader$Companion(null);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http1\HeadersReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */