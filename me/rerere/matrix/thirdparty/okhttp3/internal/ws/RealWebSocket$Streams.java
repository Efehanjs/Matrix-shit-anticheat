package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.Closeable;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class RealWebSocket$Streams implements Closeable {
  @NotNull
  private final BufferedSink sink;
  
  @NotNull
  private final BufferedSource source;
  
  private final boolean client;
  
  private static final long a = o3.a(3943309549935027657L, -7924075314228030777L, MethodHandles.lookup().lookupClass()).a(63759566539185L);
  
  @NotNull
  public final BufferedSink getSink() {
    return this.sink;
  }
  
  public final boolean getClient() {
    return this.client;
  }
  
  @NotNull
  public final BufferedSource getSource() {
    return this.source;
  }
  
  public RealWebSocket$Streams(boolean paramBoolean, @NotNull BufferedSource paramBufferedSource, @NotNull BufferedSink paramBufferedSink) {
    this.client = paramBoolean;
    this.source = paramBufferedSource;
    this.sink = paramBufferedSink;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket$Streams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */