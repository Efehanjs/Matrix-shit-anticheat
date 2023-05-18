package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2Stream$FramingSink implements Sink {
  private boolean closed;
  
  private boolean finished;
  
  @NotNull
  private final Buffer sendBuffer;
  
  @Nullable
  private Headers trailers;
  
  private static final long a = o3.a(2747217386238791827L, 2140141499046250920L, MethodHandles.lookup().lookupClass()).a(149447492890377L);
  
  @Nullable
  public final Headers getTrailers() {
    return this.trailers;
  }
  
  public void flush() throws IOException {
    long l = a ^ 0x20571C5A87A7L;
    Http2Stream http2Stream1 = Http2Stream.this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(http2Stream1))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream1); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    http2Stream1 = Http2Stream.this;
    Http2Stream http2Stream2 = Http2Stream.this;
    synchronized (http2Stream1) {
      boolean bool1 = false;
      http2Stream2.checkOutNotClosed$okhttp();
      Unit unit = Unit.INSTANCE;
    } 
    try {
      while (this.sendBuffer.size() > 0L) {
        emitFrame(false);
        Http2Stream.this.getConnection().flush();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public Timeout timeout() {
    return (Timeout)Http2Stream.this.getWriteTimeout$okhttp();
  }
  
  public final boolean getClosed() {
    return this.closed;
  }
  
  public final void setTrailers(@Nullable Headers paramHeaders) {
    this.trailers = paramHeaders;
  }
  
  public final void setFinished(boolean paramBoolean) {
    this.finished = paramBoolean;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x2F228DBC8641L;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    Http2Stream http2Stream = Http2Stream.this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(http2Stream))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.sendBuffer.write(paramBuffer, paramLong);
    try {
      while (this.sendBuffer.size() >= 16384L)
        emitFrame(false); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public final boolean getFinished() {
    return this.finished;
  }
  
  public final void setClosed(boolean paramBoolean) {
    this.closed = paramBoolean;
  }
  
  public void close() throws IOException {
    long l = a ^ 0x249933457F17L;
    Http2Stream http2Stream1 = Http2Stream.this;
    boolean bool2 = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(http2Stream1))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream1); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool1 = false;
    Http2Stream http2Stream2 = Http2Stream.this;
    null = Http2Stream.this;
    synchronized (http2Stream2) {
      boolean bool = false;
      if (getClosed())
        return; 
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      bool1 = (null.getErrorCode$okhttp() == null) ? true : false;
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if (!(Http2Stream.this.getSink$okhttp()).finished) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        boolean bool3 = (this.sendBuffer.size() > 0L) ? true : false;
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        boolean bool4 = (this.trailers != null) ? true : false;
        try {
          if (bool4) {
            try {
              while (this.sendBuffer.size() > 0L)
                emitFrame(false); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            Intrinsics.checkNotNull(this.trailers);
            Http2Stream.this.getConnection().writeHeaders$okhttp(Http2Stream.this.getId(), bool1, Util.toHeaderList(this.trailers));
          } else {
            try {
              if (bool3) {
                try {
                  while (this.sendBuffer.size() > 0L)
                    emitFrame(true); 
                } catch (IOException iOException) {
                  throw a(null);
                } 
              } else {
                try {
                  if (bool1)
                    Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L); 
                } catch (IOException iOException) {
                  throw a(null);
                } 
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    synchronized (Http2Stream.this) {
      boolean bool = false;
      setClosed(true);
      Unit unit = Unit.INSTANCE;
    } 
    Http2Stream.this.getConnection().flush();
    Http2Stream.this.cancelStreamIfNecessary$okhttp();
  }
  
  public Http2Stream$FramingSink(boolean paramBoolean) {
    this.finished = paramBoolean;
    this.sendBuffer = new Buffer();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Stream$FramingSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */