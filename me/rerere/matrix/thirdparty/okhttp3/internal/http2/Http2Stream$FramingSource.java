package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2Stream$FramingSource implements Source {
  private final long maxByteCount;
  
  @NotNull
  private final Buffer readBuffer;
  
  @Nullable
  private Headers trailers;
  
  @NotNull
  private final Buffer receiveBuffer;
  
  private boolean finished;
  
  private boolean closed;
  
  private static final long a = o3.a(1059787956150689048L, -2408729182352039873L, MethodHandles.lookup().lookupClass()).a(120403416930408L);
  
  @NotNull
  public final Buffer getReceiveBuffer() {
    return this.receiveBuffer;
  }
  
  public final void setClosed$okhttp(boolean paramBoolean) {
    this.closed = paramBoolean;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource.a : J
    //   3: ldc2_w 28583618473120
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sink'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: lload_2
    //   16: lconst_0
    //   17: lcmp
    //   18: iflt -> 29
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: iconst_0
    //   30: ifne -> 60
    //   33: iconst_0
    //   34: istore #7
    //   36: ldc 'byteCount < 0: '
    //   38: lload_2
    //   39: invokestatic valueOf : (J)Ljava/lang/Long;
    //   42: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   45: astore #7
    //   47: new java/lang/IllegalArgumentException
    //   50: dup
    //   51: aload #7
    //   53: invokevirtual toString : ()Ljava/lang/String;
    //   56: invokespecial <init> : (Ljava/lang/String;)V
    //   59: athrow
    //   60: nop
    //   61: iconst_0
    //   62: istore #6
    //   64: lconst_0
    //   65: lstore #16
    //   67: ldc2_w -1
    //   70: lstore #16
    //   72: aconst_null
    //   73: astore #8
    //   75: aload_0
    //   76: getfield this$0 : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream;
    //   79: astore #9
    //   81: aload_0
    //   82: getfield this$0 : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream;
    //   85: astore #10
    //   87: aload #9
    //   89: astore #11
    //   91: aload #11
    //   93: monitorenter
    //   94: nop
    //   95: iconst_0
    //   96: istore #12
    //   98: aload #10
    //   100: invokevirtual getReadTimeout$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$StreamTimeout;
    //   103: invokevirtual enter : ()V
    //   106: nop
    //   107: aload #10
    //   109: invokevirtual getErrorCode$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   112: ifnull -> 153
    //   115: aload #10
    //   117: invokevirtual getErrorException$okhttp : ()Ljava/io/IOException;
    //   120: dup
    //   121: ifnonnull -> 151
    //   124: pop
    //   125: new me/rerere/matrix/thirdparty/okhttp3/internal/http2/StreamResetException
    //   128: dup
    //   129: aload #10
    //   131: invokevirtual getErrorCode$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   134: dup
    //   135: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   138: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;)V
    //   141: checkcast java/io/IOException
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: astore #8
    //   153: aload_0
    //   154: invokevirtual getClosed$okhttp : ()Z
    //   157: ifeq -> 174
    //   160: new java/io/IOException
    //   163: dup
    //   164: ldc 'stream closed'
    //   166: invokespecial <init> : (Ljava/lang/String;)V
    //   169: athrow
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_0
    //   175: invokevirtual getReadBuffer : ()Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   178: invokevirtual size : ()J
    //   181: lconst_0
    //   182: lcmp
    //   183: ifle -> 301
    //   186: aload_0
    //   187: invokevirtual getReadBuffer : ()Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   190: aload_1
    //   191: aload_0
    //   192: invokevirtual getReadBuffer : ()Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   195: invokevirtual size : ()J
    //   198: lstore #14
    //   200: lload_2
    //   201: lload #14
    //   203: invokestatic min : (JJ)J
    //   206: invokevirtual read : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)J
    //   209: lstore #16
    //   211: aload #10
    //   213: aload #10
    //   215: invokevirtual getReadBytesTotal : ()J
    //   218: lload #16
    //   220: ladd
    //   221: invokevirtual setReadBytesTotal$okhttp : (J)V
    //   224: aload #10
    //   226: invokevirtual getReadBytesTotal : ()J
    //   229: aload #10
    //   231: invokevirtual getReadBytesAcknowledged : ()J
    //   234: lsub
    //   235: lstore #14
    //   237: aload #8
    //   239: ifnonnull -> 328
    //   242: lload #14
    //   244: aload #10
    //   246: invokevirtual getConnection : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;
    //   249: invokevirtual getOkHttpSettings : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings;
    //   252: invokevirtual getInitialWindowSize : ()I
    //   255: iconst_2
    //   256: idiv
    //   257: i2l
    //   258: lcmp
    //   259: iflt -> 328
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: aload #10
    //   271: invokevirtual getConnection : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;
    //   274: aload #10
    //   276: invokevirtual getId : ()I
    //   279: lload #14
    //   281: invokevirtual writeWindowUpdateLater$okhttp : (IJ)V
    //   284: aload #10
    //   286: aload #10
    //   288: invokevirtual getReadBytesTotal : ()J
    //   291: invokevirtual setReadBytesAcknowledged$okhttp : (J)V
    //   294: goto -> 328
    //   297: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   300: athrow
    //   301: aload_0
    //   302: invokevirtual getFinished$okhttp : ()Z
    //   305: ifne -> 328
    //   308: aload #8
    //   310: ifnonnull -> 328
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   319: athrow
    //   320: aload #10
    //   322: invokevirtual waitForIo$okhttp : ()V
    //   325: iconst_1
    //   326: istore #6
    //   328: aload #10
    //   330: invokevirtual getReadTimeout$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$StreamTimeout;
    //   333: invokevirtual exitAndThrowIfTimedOut : ()V
    //   336: goto -> 352
    //   339: astore #13
    //   341: aload #10
    //   343: invokevirtual getReadTimeout$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$StreamTimeout;
    //   346: invokevirtual exitAndThrowIfTimedOut : ()V
    //   349: aload #13
    //   351: athrow
    //   352: nop
    //   353: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   356: astore #12
    //   358: aload #11
    //   360: monitorexit
    //   361: goto -> 372
    //   364: astore #12
    //   366: aload #11
    //   368: monitorexit
    //   369: aload #12
    //   371: athrow
    //   372: iload #6
    //   374: ifeq -> 384
    //   377: goto -> 60
    //   380: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   383: athrow
    //   384: lload #16
    //   386: ldc2_w -1
    //   389: lcmp
    //   390: ifeq -> 406
    //   393: aload_0
    //   394: lload #16
    //   396: invokespecial updateConnectionFlowControl : (J)V
    //   399: lload #16
    //   401: lreturn
    //   402: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   405: athrow
    //   406: aload #8
    //   408: ifnull -> 421
    //   411: aload #8
    //   413: checkcast java/lang/Throwable
    //   416: athrow
    //   417: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   420: athrow
    //   421: ldc2_w -1
    //   424: lreturn
    // Exception table:
    //   from	to	target	type
    //   9	25	25	java/io/IOException
    //   94	358	364	finally
    //   106	328	339	finally
    //   115	144	147	java/io/IOException
    //   153	170	170	java/io/IOException
    //   237	262	265	java/io/IOException
    //   242	297	297	java/io/IOException
    //   301	313	316	java/io/IOException
    //   339	341	339	finally
    //   364	366	364	finally
    //   372	380	380	java/io/IOException
    //   384	402	402	java/io/IOException
    //   406	417	417	java/io/IOException
  }
  
  public Http2Stream$FramingSource(long paramLong, boolean paramBoolean) {
    this.maxByteCount = paramLong;
    this.finished = paramBoolean;
    this.receiveBuffer = new Buffer();
    this.readBuffer = new Buffer();
  }
  
  public final void receive$okhttp(@NotNull BufferedSource paramBufferedSource, long paramLong) throws IOException {
    long l1 = a ^ 0xAD200AFEB28L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
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
    long l2 = 0L;
    l2 = paramLong;
    while (l2 > 0L) {
      bool = false;
      boolean bool1 = false;
      synchronized (Http2Stream.this) {
        boolean bool2 = false;
        bool = getFinished$okhttp();
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        bool1 = (l2 + getReadBuffer().size() > this.maxByteCount) ? true : false;
        Unit unit = Unit.INSTANCE;
      } 
      try {
        if (bool1) {
          paramBufferedSource.skip(l2);
          Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
          return;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (bool) {
          paramBufferedSource.skip(l2);
          return;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      long l3 = paramBufferedSource.read(this.receiveBuffer, l2);
      try {
        if (l3 == -1L)
          throw new EOFException(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      l2 -= l3;
      long l4 = 0L;
      Http2Stream http2Stream1 = Http2Stream.this;
      Http2Stream http2Stream2 = Http2Stream.this;
      synchronized (http2Stream1) {
        boolean bool2 = false;
        if (getClosed$okhttp()) {
          l4 = getReceiveBuffer().size();
          getReceiveBuffer().clear();
        } else {
          try {
          
          } catch (IOException iOException) {
            throw a(null);
          } 
          boolean bool3 = (getReadBuffer().size() == 0L) ? true : false;
          getReadBuffer().writeAll((Source)getReceiveBuffer());
          if (bool3) {
            Http2Stream http2Stream3 = http2Stream2;
            boolean bool4 = false;
            http2Stream3.notifyAll();
          } 
        } 
        Unit unit = Unit.INSTANCE;
      } 
      if (l4 > 0L)
        updateConnectionFlowControl(l4); 
    } 
  }
  
  @NotNull
  public final Buffer getReadBuffer() {
    return this.readBuffer;
  }
  
  public final void setTrailers(@Nullable Headers paramHeaders) {
    this.trailers = paramHeaders;
  }
  
  public void close() throws IOException {
    long l = 0L;
    Http2Stream http2Stream1 = Http2Stream.this;
    Http2Stream http2Stream2 = Http2Stream.this;
    synchronized (http2Stream1) {
      boolean bool1 = false;
      setClosed$okhttp(true);
      l = getReadBuffer().size();
      getReadBuffer().clear();
      Http2Stream http2Stream = http2Stream2;
      boolean bool2 = false;
      http2Stream.notifyAll();
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if (l > 0L)
        updateConnectionFlowControl(l); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Http2Stream.this.cancelStreamIfNecessary$okhttp();
  }
  
  public final boolean getFinished$okhttp() {
    return this.finished;
  }
  
  public final boolean getClosed$okhttp() {
    return this.closed;
  }
  
  public final void setFinished$okhttp(boolean paramBoolean) {
    this.finished = paramBoolean;
  }
  
  @Nullable
  public final Headers getTrailers() {
    return this.trailers;
  }
  
  @NotNull
  public Timeout timeout() {
    return (Timeout)Http2Stream.this.getReadTimeout$okhttp();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Stream$FramingSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */