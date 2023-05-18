package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2Reader implements Closeable {
  @NotNull
  private final BufferedSource source;
  
  @NotNull
  private final Http2Reader$ContinuationSource continuation;
  
  private final boolean client;
  
  @NotNull
  private static final Logger logger;
  
  @NotNull
  public static final Http2Reader$Companion Companion;
  
  @NotNull
  private final Hpack$Reader hpackReader;
  
  private static final long a = o3.a(6706168422954380115L, -1758185536543173529L, MethodHandles.lookup().lookupClass()).a(133697453785286L);
  
  public Http2Reader(@NotNull BufferedSource paramBufferedSource, boolean paramBoolean) {
    this.source = paramBufferedSource;
    this.client = paramBoolean;
    this.continuation = new Http2Reader$ContinuationSource(this.source);
    this.hpackReader = new Hpack$Reader(this.continuation, 4096, 0, 4, null);
  }
  
  public final boolean nextFrame(boolean paramBoolean, @NotNull Http2Reader$Handler paramHttp2Reader$Handler) throws IOException {
    long l = a ^ 0x2A7F502C6F26L;
    Intrinsics.checkNotNullParameter(paramHttp2Reader$Handler, "handler");
    try {
      this.source.require(9L);
    } catch (EOFException eOFException) {
      return false;
    } 
    int i = Util.readMedium(this.source);
    try {
      if (i > 16384)
        throw new IOException(Intrinsics.stringPlus("FRAME_SIZE_ERROR: ", Integer.valueOf(i))); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    int j = Util.and(this.source.readByte(), 255);
    int k = Util.and(this.source.readByte(), 255);
    int m = this.source.readInt() & Integer.MAX_VALUE;
    try {
      if (logger.isLoggable(Level.FINE))
        logger.fine(Http2.INSTANCE.frameLog(true, m, i, j, k)); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        try {
          if (j != 4)
            throw new IOException(Intrinsics.stringPlus("Expected a SETTINGS frame but was ", Http2.INSTANCE.formattedType$okhttp(j))); 
        } catch (EOFException eOFException) {
          throw a(null);
        }  
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    try {
      switch (j) {
        case 0:
          readData(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 1:
          readHeaders(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 2:
          readPriority(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 3:
          readRstStream(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 4:
          readSettings(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 5:
          readPushPromise(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 6:
          readPing(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 7:
          readGoAway(paramHttp2Reader$Handler, i, k, m);
          return true;
        case 8:
          readWindowUpdate(paramHttp2Reader$Handler, i, k, m);
          return true;
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    this.source.skip(i);
    return true;
  }
  
  public void close() throws IOException {
    this.source.close();
  }
  
  static {
    long l = a ^ 0x38A30D0BB1ECL;
    Companion = new Http2Reader$Companion(null);
    Logger logger = Logger.getLogger(Http2.class.getName());
    Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
    logger = logger;
  }
  
  public final void readConnectionPreface(@NotNull Http2Reader$Handler paramHttp2Reader$Handler) throws IOException {
    long l = a ^ 0x313D77F6A556L;
    try {
      Intrinsics.checkNotNullParameter(paramHttp2Reader$Handler, "handler");
      if (this.client) {
        try {
          if (!nextFrame(true, paramHttp2Reader$Handler))
            throw new IOException("Required SETTINGS preface not received"); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        ByteString byteString = this.source.readByteString(Http2.CONNECTION_PREFACE.size());
        try {
          if (logger.isLoggable(Level.FINE))
            logger.fine(Util.format(Intrinsics.stringPlus("<< CONNECTION ", byteString.hex()), new Object[0])); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!Intrinsics.areEqual(Http2.CONNECTION_PREFACE, byteString))
            throw new IOException(Intrinsics.stringPlus("Expected a connection header but was ", byteString.utf8())); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Reader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */