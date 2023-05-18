package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.logging.Level;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2Reader$ContinuationSource implements Source {
  private int flags;
  
  private int padding;
  
  private int length;
  
  private int streamId;
  
  private int left;
  
  @NotNull
  private final BufferedSource source;
  
  private static final long a = o3.a(-7417636101316662606L, 6208987789135198374L, MethodHandles.lookup().lookupClass()).a(157307038110009L);
  
  public void close() throws IOException {}
  
  public final void setLeft(int paramInt) {
    this.left = paramInt;
  }
  
  public final int getStreamId() {
    return this.streamId;
  }
  
  public final void setPadding(int paramInt) {
    this.padding = paramInt;
  }
  
  public final void setLength(int paramInt) {
    this.length = paramInt;
  }
  
  public final int getLeft() {
    return this.left;
  }
  
  public final int getPadding() {
    return this.padding;
  }
  
  @NotNull
  public Timeout timeout() {
    return this.source.timeout();
  }
  
  public Http2Reader$ContinuationSource(@NotNull BufferedSource paramBufferedSource) {
    this.source = paramBufferedSource;
  }
  
  public final void setFlags(int paramInt) {
    this.flags = paramInt;
  }
  
  public final int getLength() {
    return this.length;
  }
  
  public final int getFlags() {
    return this.flags;
  }
  
  public final void setStreamId(int paramInt) {
    this.streamId = paramInt;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Reader$ContinuationSource.a : J
    //   3: ldc2_w 113835279569705
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sink'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield left : I
    //   19: ifne -> 72
    //   22: aload_0
    //   23: getfield source : Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   26: aload_0
    //   27: getfield padding : I
    //   30: i2l
    //   31: invokeinterface skip : (J)V
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield padding : I
    //   41: aload_0
    //   42: getfield flags : I
    //   45: iconst_4
    //   46: iand
    //   47: ifeq -> 65
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   56: athrow
    //   57: ldc2_w -1
    //   60: lreturn
    //   61: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   64: athrow
    //   65: aload_0
    //   66: invokespecial readContinuationHeader : ()V
    //   69: goto -> 15
    //   72: aload_0
    //   73: getfield source : Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   76: aload_1
    //   77: aload_0
    //   78: getfield left : I
    //   81: i2l
    //   82: lstore #8
    //   84: lload_2
    //   85: lload #8
    //   87: invokestatic min : (JJ)J
    //   90: invokeinterface read : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)J
    //   95: lstore #6
    //   97: lload #6
    //   99: ldc2_w -1
    //   102: lcmp
    //   103: ifne -> 114
    //   106: ldc2_w -1
    //   109: lreturn
    //   110: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   113: athrow
    //   114: aload_0
    //   115: aload_0
    //   116: getfield left : I
    //   119: lload #6
    //   121: l2i
    //   122: isub
    //   123: putfield left : I
    //   126: lload #6
    //   128: lreturn
    // Exception table:
    //   from	to	target	type
    //   15	50	53	java/io/IOException
    //   22	61	61	java/io/IOException
    //   97	110	110	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Reader$ContinuationSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */