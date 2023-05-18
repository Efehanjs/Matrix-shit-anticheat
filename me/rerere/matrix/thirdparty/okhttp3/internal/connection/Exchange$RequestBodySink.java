package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingSink;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Exchange$RequestBodySink extends ForwardingSink {
  private final long contentLength;
  
  private boolean completed;
  
  private long bytesReceived;
  
  private boolean closed;
  
  private static final long a = o3.a(-6443152716180443543L, 9125578022652103856L, MethodHandles.lookup().lookupClass()).a(18048204347307L);
  
  public void flush() throws IOException {
    try {
      super.flush();
    } catch (IOException iOException) {
      throw complete(iOException);
    } 
  }
  
  public void close() throws IOException {
    long l = a ^ 0x58FA89EEBEB2L;
    try {
      if (this.closed)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.closed = true;
      if (this.contentLength != -1L)
        try {
          if (this.bytesReceived != this.contentLength)
            throw new ProtocolException("unexpected end of stream"); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      super.close();
      complete(null);
    } catch (IOException iOException) {
      throw complete(iOException);
    } 
  }
  
  public Exchange$RequestBodySink(Sink paramSink, long paramLong) {
    super(paramSink);
    this.contentLength = paramLong;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x75E9EA9DA95L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "source");
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (!(!this.closed ? 1 : 0)) {
      boolean bool = false;
      String str = "closed";
      throw new IllegalStateException(str.toString());
    } 
    try {
      if (this.contentLength != -1L)
        try {
          if (this.bytesReceived + paramLong > this.contentLength)
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + paramLong)); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      super.write(paramBuffer, paramLong);
      this.bytesReceived += paramLong;
    } catch (IOException iOException) {
      throw complete(iOException);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\Exchange$RequestBodySink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */