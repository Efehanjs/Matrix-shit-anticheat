package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Exchange$ResponseBodySource extends ForwardingSource {
  private boolean completed;
  
  private final long contentLength;
  
  private long bytesReceived;
  
  private boolean invokeStartEvent;
  
  private boolean closed;
  
  private static final long a = o3.a(8871149325397771469L, 1122111651572207883L, MethodHandles.lookup().lookupClass()).a(141762947812253L);
  
  public void close() throws IOException {
    try {
      if (this.closed)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.closed = true;
    try {
      super.close();
      complete(null);
    } catch (IOException iOException) {
      throw complete(iOException);
    } 
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x26A2B1B5DA53L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (!(!this.closed ? 1 : 0)) {
      boolean bool = false;
      String str = "closed";
      throw new IllegalStateException(str.toString());
    } 
    try {
      long l1 = delegate().read(paramBuffer, paramLong);
      try {
        if (this.invokeStartEvent) {
          this.invokeStartEvent = false;
          Exchange.this.getEventListener$okhttp().responseBodyStart(Exchange.this.getCall$okhttp());
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (l1 == -1L) {
          complete(null);
          return -1L;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      long l2 = this.bytesReceived + l1;
      try {
        if (this.contentLength != -1L)
          try {
            if (l2 > this.contentLength)
              throw new ProtocolException("expected " + this.contentLength + " bytes but received " + l2); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        this.bytesReceived = l2;
        if (l2 == this.contentLength)
          complete(null); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return l1;
    } catch (IOException iOException) {
      throw complete(iOException);
    } 
  }
  
  public final IOException complete(IOException paramIOException) {
    try {
      if (this.completed)
        return paramIOException; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.completed = true;
      if (paramIOException == null)
        try {
          if (this.invokeStartEvent) {
            this.invokeStartEvent = false;
            Exchange.this.getEventListener$okhttp().responseBodyStart(Exchange.this.getCall$okhttp());
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Exchange.this.bodyComplete(this.bytesReceived, true, false, paramIOException);
  }
  
  public Exchange$ResponseBodySource(Source paramSource, long paramLong) {
    super(paramSource);
    this.contentLength = paramLong;
    this.invokeStartEvent = true;
    if (this.contentLength == 0L)
      complete(null); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\Exchange$ResponseBodySource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */