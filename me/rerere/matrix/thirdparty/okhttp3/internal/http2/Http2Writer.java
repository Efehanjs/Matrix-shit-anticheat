package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2Writer implements Closeable {
  private boolean closed;
  
  @NotNull
  private final Hpack$Writer hpackWriter;
  
  private final boolean client;
  
  private int maxFrameSize;
  
  @NotNull
  public static final Http2Writer$Companion Companion;
  
  private static final Logger logger;
  
  @NotNull
  private final BufferedSink sink;
  
  @NotNull
  private final Buffer hpackBuffer;
  
  private static final long a = o3.a(8691076764625161247L, -5819910116815388818L, MethodHandles.lookup().lookupClass()).a(66892919981376L);
  
  public final synchronized void pushPromise(int paramInt1, int paramInt2, @NotNull List paramList) throws IOException {
    long l1 = a ^ 0x16A1DCF883E3L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.hpackWriter.writeHeaders(paramList);
    long l2 = this.hpackBuffer.size();
    int i = (int)Math.min(this.maxFrameSize - 4L, l2);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      frameHeader(paramInt1, i + 4, 5, (l2 == i) ? 4 : 0);
      this.sink.writeInt(paramInt2 & Integer.MAX_VALUE);
      this.sink.write(this.hpackBuffer, i);
      if (l2 > i)
        writeContinuationFrames(paramInt1, l2 - i); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public final synchronized void goAway(int paramInt, @NotNull ErrorCode paramErrorCode, @NotNull byte[] paramArrayOfbyte) throws IOException {
    long l = a ^ 0x7C0A60121CF4L;
    try {
      Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "debugData");
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!((paramErrorCode.getHttpCode() != -1) ? 1 : 0)) {
        boolean bool = false;
        String str = "errorCode.httpCode == -1";
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      frameHeader(0, 8 + paramArrayOfbyte.length, 7, 0);
      this.sink.writeInt(paramInt);
      this.sink.writeInt(paramErrorCode.getHttpCode());
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!((paramArrayOfbyte.length == 0) ? 1 : 0))
        this.sink.write(paramArrayOfbyte); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.sink.flush();
  }
  
  public final synchronized void connectionPreface() throws IOException {
    long l = a ^ 0x5B5F45214858L;
    try {
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!this.client)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (logger.isLoggable(Level.FINE))
        logger.fine(Util.format(Intrinsics.stringPlus(">> CONNECTION ", Http2.CONNECTION_PREFACE.hex()), new Object[0])); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.sink.write(Http2.CONNECTION_PREFACE);
    this.sink.flush();
  }
  
  public synchronized void close() throws IOException {
    this.closed = true;
    this.sink.close();
  }
  
  public final synchronized void ping(boolean paramBoolean, int paramInt1, int paramInt2) throws IOException {
    long l = a ^ 0x48CAC2B3453EL;
    try {
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    frameHeader(0, 8, 6, paramBoolean ? 1 : 0);
    this.sink.writeInt(paramInt1);
    this.sink.writeInt(paramInt2);
    this.sink.flush();
  }
  
  public final void frameHeader(int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws IOException {
    long l = a ^ 0x1F353D8139A1L;
    try {
      if (logger.isLoggable(Level.FINE))
        logger.fine(Http2.INSTANCE.frameLog(false, paramInt1, paramInt2, paramInt3, paramInt4)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!((paramInt2 <= this.maxFrameSize) ? 1 : 0)) {
        boolean bool = false;
        String str = "FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + paramInt2;
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!(((paramInt1 & Integer.MIN_VALUE) == 0) ? 1 : 0)) {
        boolean bool = false;
        String str = Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(paramInt1));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Util.writeMedium(this.sink, paramInt2);
    this.sink.writeByte(paramInt3 & 0xFF);
    this.sink.writeByte(paramInt4 & 0xFF);
    this.sink.writeInt(paramInt1 & Integer.MAX_VALUE);
  }
  
  public final synchronized void applyAndAckSettings(@NotNull Settings paramSettings) throws IOException {
    long l = a ^ 0x3C20218E5A4L;
    try {
      Intrinsics.checkNotNullParameter(paramSettings, "peerSettings");
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.maxFrameSize = paramSettings.getMaxFrameSize(this.maxFrameSize);
      if (paramSettings.getHeaderTableSize() != -1)
        this.hpackWriter.resizeHeaderTable(paramSettings.getHeaderTableSize()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    frameHeader(0, 0, 4, 1);
    this.sink.flush();
  }
  
  public final synchronized void settings(@NotNull Settings paramSettings) throws IOException {
    long l = a ^ 0x31650B0ADE97L;
    try {
      Intrinsics.checkNotNullParameter(paramSettings, "settings");
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    frameHeader(0, paramSettings.size() * 6, 4, 0);
    byte b = 0;
    while (b < 10) {
      byte b1 = b;
      try {
        b++;
        if (!paramSettings.isSet(b1))
          continue; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        switch (b1) {
          case 4:
          
          case 7:
          
          default:
            break;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      byte b2 = b1;
      this.sink.writeShort(b2);
      this.sink.writeInt(paramSettings.get(b1));
    } 
    this.sink.flush();
  }
  
  static {
    Companion = new Http2Writer$Companion(null);
    logger = Logger.getLogger(Http2.class.getName());
  }
  
  public final void dataFrame(int paramInt1, int paramInt2, @Nullable Buffer paramBuffer, int paramInt3) throws IOException {
    try {
      frameHeader(paramInt1, paramInt3, 0, paramInt2);
      if (paramInt3 > 0) {
        Intrinsics.checkNotNull(paramBuffer);
        this.sink.write(paramBuffer, paramInt3);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final Hpack$Writer getHpackWriter() {
    return this.hpackWriter;
  }
  
  public final synchronized void headers(boolean paramBoolean, int paramInt, @NotNull List paramList) throws IOException {
    long l1 = a ^ 0x4B5E5A3A8C5FL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "headerBlock");
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.hpackWriter.writeHeaders(paramList);
    long l2 = this.hpackBuffer.size();
    long l3 = Math.min(this.maxFrameSize, l2);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = (l2 == l3) ? 4 : 0;
    if (paramBoolean)
      i |= 0x1; 
    try {
      frameHeader(paramInt, (int)l3, 1, i);
      this.sink.write(this.hpackBuffer, l3);
      if (l2 > l3)
        writeContinuationFrames(paramInt, l2 - l3); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public final synchronized void windowUpdate(int paramInt, long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Writer.a : J
    //   3: ldc2_w 86484561975996
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: getfield closed : Z
    //   13: ifeq -> 30
    //   16: new java/io/IOException
    //   19: dup
    //   20: ldc 'closed'
    //   22: invokespecial <init> : (Ljava/lang/String;)V
    //   25: athrow
    //   26: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   29: athrow
    //   30: lload_2
    //   31: lconst_0
    //   32: lcmp
    //   33: ifeq -> 59
    //   36: lload_2
    //   37: ldc2_w 2147483647
    //   40: lcmp
    //   41: ifgt -> 59
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: iconst_1
    //   52: goto -> 60
    //   55: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   58: athrow
    //   59: iconst_0
    //   60: ifne -> 91
    //   63: iconst_0
    //   64: istore #6
    //   66: ldc_w 'windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: '
    //   69: lload_2
    //   70: invokestatic valueOf : (J)Ljava/lang/Long;
    //   73: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   76: astore #6
    //   78: new java/lang/IllegalArgumentException
    //   81: dup
    //   82: aload #6
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokespecial <init> : (Ljava/lang/String;)V
    //   90: athrow
    //   91: aload_0
    //   92: iload_1
    //   93: iconst_4
    //   94: bipush #8
    //   96: iconst_0
    //   97: invokevirtual frameHeader : (IIII)V
    //   100: aload_0
    //   101: getfield sink : Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   104: lload_2
    //   105: l2i
    //   106: invokeinterface writeInt : (I)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   111: pop
    //   112: aload_0
    //   113: getfield sink : Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   116: invokeinterface flush : ()V
    //   121: return
    // Exception table:
    //   from	to	target	type
    //   9	26	26	java/io/IOException
    //   30	44	47	java/io/IOException
    //   36	55	55	java/io/IOException
  }
  
  public final synchronized void rstStream(int paramInt, @NotNull ErrorCode paramErrorCode) throws IOException {
    long l = a ^ 0x24956C5AE73CL;
    try {
      Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!((paramErrorCode.getHttpCode() != -1) ? 1 : 0)) {
        String str = "Failed requirement.";
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    frameHeader(paramInt, 4, 3, 0);
    this.sink.writeInt(paramErrorCode.getHttpCode());
    this.sink.flush();
  }
  
  public final int maxDataLength() {
    return this.maxFrameSize;
  }
  
  public Http2Writer(@NotNull BufferedSink paramBufferedSink, boolean paramBoolean) {
    this.sink = paramBufferedSink;
    this.client = paramBoolean;
    this.hpackBuffer = new Buffer();
    this.maxFrameSize = 16384;
    this.hpackWriter = new Hpack$Writer(0, false, this.hpackBuffer, 3, null);
  }
  
  public final synchronized void flush() throws IOException {
    long l = a ^ 0x61247F01AAFFL;
    try {
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.sink.flush();
  }
  
  public final synchronized void data(boolean paramBoolean, int paramInt1, @Nullable Buffer paramBuffer, int paramInt2) throws IOException {
    long l = a ^ 0x789817B59A3L;
    try {
      if (this.closed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = 0;
    if (paramBoolean)
      i |= 0x1; 
    dataFrame(paramInt1, i, paramBuffer, paramInt2);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Writer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */