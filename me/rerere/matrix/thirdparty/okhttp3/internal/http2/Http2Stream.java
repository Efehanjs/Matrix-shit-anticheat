package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2Stream {
  private long writeBytesTotal;
  
  public static final long EMIT_BUFFER_SIZE = 16384L;
  
  private long readBytesTotal;
  
  @NotNull
  private final Http2Stream$StreamTimeout readTimeout;
  
  private long writeBytesMaximum;
  
  private long readBytesAcknowledged;
  
  @NotNull
  private final Http2Connection connection;
  
  @NotNull
  private final Http2Stream$StreamTimeout writeTimeout;
  
  @Nullable
  private IOException errorException;
  
  @Nullable
  private ErrorCode errorCode;
  
  @NotNull
  private final Http2Stream$FramingSource source;
  
  @NotNull
  private final ArrayDeque headersQueue;
  
  @NotNull
  private final Http2Stream$FramingSink sink;
  
  @NotNull
  public static final Http2Stream$Companion Companion;
  
  private boolean hasResponseHeaders;
  
  private final int id;
  
  private static final long a = o3.a(1301863179741402951L, 3281320809129378275L, MethodHandles.lookup().lookupClass()).a(42287745988893L);
  
  public Http2Stream(int paramInt, @NotNull Http2Connection paramHttp2Connection, boolean paramBoolean1, boolean paramBoolean2, @Nullable Headers paramHeaders) {
    this.id = paramInt;
    this.connection = paramHttp2Connection;
    this.writeBytesMaximum = this.connection.getPeerSettings().getInitialWindowSize();
    this.headersQueue = new ArrayDeque();
    this.source = new Http2Stream$FramingSource(this, this.connection.getOkHttpSettings().getInitialWindowSize(), paramBoolean2);
    this.sink = new Http2Stream$FramingSink(this, paramBoolean1);
    this.readTimeout = new Http2Stream$StreamTimeout(this);
    this.writeTimeout = new Http2Stream$StreamTimeout(this);
    if (paramHeaders != null) {
      try {
        if (!(!isLocallyInitiated() ? 1 : 0)) {
          boolean bool = false;
          String str = "locally-initiated streams shouldn't have headers yet";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      this.headersQueue.add(paramHeaders);
    } else if (!isLocallyInitiated()) {
      boolean bool = false;
      String str = "remotely-initiated streams should have headers";
      throw new IllegalStateException(str.toString());
    } 
  }
  
  public final synchronized boolean isOpen() {
    // Byte code:
    //   0: aload_0
    //   1: getfield errorCode : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   4: ifnull -> 13
    //   7: iconst_0
    //   8: ireturn
    //   9: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   12: athrow
    //   13: aload_0
    //   14: getfield source : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource;
    //   17: invokevirtual getFinished$okhttp : ()Z
    //   20: ifne -> 40
    //   23: aload_0
    //   24: getfield source : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource;
    //   27: invokevirtual getClosed$okhttp : ()Z
    //   30: ifeq -> 94
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_0
    //   41: getfield sink : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSink;
    //   44: invokevirtual getFinished : ()Z
    //   47: ifne -> 74
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield sink : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSink;
    //   61: invokevirtual getClosed : ()Z
    //   64: ifeq -> 94
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_0
    //   75: getfield hasResponseHeaders : Z
    //   78: ifeq -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: iconst_1
    //   95: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	9	9	java/lang/IllegalStateException
    //   13	33	36	java/lang/IllegalStateException
    //   23	50	53	java/lang/IllegalStateException
    //   40	67	70	java/lang/IllegalStateException
    //   57	81	84	java/lang/IllegalStateException
    //   74	90	90	java/lang/IllegalStateException
  }
  
  public final void addBytesToWriteWindow(long paramLong) {
    this.writeBytesMaximum += paramLong;
    if (paramLong > 0L) {
      Http2Stream http2Stream = this;
      boolean bool = false;
      http2Stream.notifyAll();
    } 
  }
  
  public final void checkOutNotClosed$okhttp() throws IOException {
    long l = a ^ 0x872562B672FL;
    try {
      if (this.sink.getClosed())
        throw new IOException("stream closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.sink.getFinished())
        throw new IOException("stream finished"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.errorCode != null) {
        try {
          Intrinsics.checkNotNull(this.errorCode);
        } catch (IOException iOException) {
          throw a(null);
        } 
        throw (this.errorException == null) ? (Throwable)new StreamResetException(this.errorCode) : (Throwable)this.errorException;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public final void waitForIo$okhttp() throws InterruptedIOException {
    try {
      Http2Stream http2Stream = this;
      boolean bool = false;
      http2Stream.wait();
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
      throw new InterruptedIOException();
    } 
  }
  
  @NotNull
  public final Timeout writeTimeout() {
    return (Timeout)this.writeTimeout;
  }
  
  public final void setWriteBytesTotal$okhttp(long paramLong) {
    this.writeBytesTotal = paramLong;
  }
  
  public final void enqueueTrailers(@NotNull Headers paramHeaders) {
    long l = a ^ 0xCA62D5E35C5L;
    Intrinsics.checkNotNullParameter(paramHeaders, "trailers");
    synchronized (this) {
      boolean bool = false;
      try {
        if (!(!getSink$okhttp().getFinished() ? 1 : 0)) {
          boolean bool1 = false;
          String str = "already finished";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!((paramHeaders.size() != 0) ? 1 : 0)) {
          boolean bool1 = false;
          String str = "trailers.size() == 0";
          throw new IllegalArgumentException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      getSink$okhttp().setTrailers(paramHeaders);
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  @NotNull
  public final synchronized Headers trailers() throws IOException {
    long l = a ^ 0x3887C449BC7DL;
    try {
      if (this.source.getFinished$okhttp())
        try {
          if (this.source.getReceiveBuffer().exhausted())
            try {
              if (this.source.getReadBuffer().exhausted()) {
                try {
                  if (this.source.getTrailers() == null)
                    this.source.getTrailers(); 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                return Util.EMPTY_HEADERS;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.errorCode != null) {
        try {
          Intrinsics.checkNotNull(this.errorCode);
        } catch (IOException iOException) {
          throw a(null);
        } 
        throw (this.errorException == null) ? (Throwable)new StreamResetException(this.errorCode) : (Throwable)this.errorException;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new IllegalStateException("too early; can't read the trailers yet");
  }
  
  public final void setReadBytesTotal$okhttp(long paramLong) {
    this.readBytesTotal = paramLong;
  }
  
  public final long getReadBytesTotal() {
    return this.readBytesTotal;
  }
  
  public final long getWriteBytesMaximum() {
    return this.writeBytesMaximum;
  }
  
  @NotNull
  public final Source getSource() {
    return this.source;
  }
  
  @NotNull
  public final Timeout readTimeout() {
    return (Timeout)this.readTimeout;
  }
  
  @NotNull
  public final Http2Stream$StreamTimeout getWriteTimeout$okhttp() {
    return this.writeTimeout;
  }
  
  public final void receiveData(@NotNull BufferedSource paramBufferedSource, int paramInt) throws IOException {
    long l = a ^ 0x385E9BDDE64AL;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    Http2Stream http2Stream = this;
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
    this.source.receive$okhttp(paramBufferedSource, paramInt);
  }
  
  public final void setReadBytesAcknowledged$okhttp(long paramLong) {
    this.readBytesAcknowledged = paramLong;
  }
  
  @NotNull
  public final synchronized Headers takeHeaders() throws IOException {
    long l = a ^ 0x153AF50D3927L;
    this.readTimeout.enter();
    try {
      while (true) {
        try {
          if (this.headersQueue.isEmpty())
            try {
              if (this.errorCode == null) {
                waitForIo$okhttp();
                continue;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        break;
      } 
    } finally {
      this.readTimeout.exitAndThrowIfTimedOut();
    } 
    try {
      if (!this.headersQueue.isEmpty()) {
        Headers headers = (Headers)this.headersQueue.removeFirst();
        Intrinsics.checkNotNullExpressionValue(headers, "headersQueue.removeFirst()");
        return headers;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(this.errorCode);
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw (this.errorException == null) ? (Throwable)new StreamResetException(this.errorCode) : (Throwable)this.errorException;
  }
  
  public final long getReadBytesAcknowledged() {
    return this.readBytesAcknowledged;
  }
  
  static {
    Companion = new Http2Stream$Companion(null);
  }
  
  public final synchronized void receiveRstStream(@NotNull ErrorCode paramErrorCode) {
    long l = a ^ 0x6D32CF1099D0L;
    Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
    if (this.errorCode == null) {
      this.errorCode = paramErrorCode;
      Http2Stream http2Stream = this;
      boolean bool = false;
      http2Stream.notifyAll();
    } 
  }
  
  @Nullable
  public final IOException getErrorException$okhttp() {
    return this.errorException;
  }
  
  public final void closeLater(@NotNull ErrorCode paramErrorCode) {
    long l = a ^ 0x4725045B5F73L;
    try {
      Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
      if (!closeInternal(paramErrorCode, null))
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.connection.writeSynResetLater$okhttp(this.id, paramErrorCode);
  }
  
  @Nullable
  public final synchronized ErrorCode getErrorCode$okhttp() {
    return this.errorCode;
  }
  
  @NotNull
  public final Sink getSink() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream.a : J
    //   3: ldc2_w 1566934972964
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: aload_3
    //   11: monitorenter
    //   12: nop
    //   13: iconst_0
    //   14: istore #4
    //   16: aload_0
    //   17: getfield hasResponseHeaders : Z
    //   20: ifne -> 37
    //   23: aload_0
    //   24: invokevirtual isLocallyInitiated : ()Z
    //   27: ifeq -> 45
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iconst_0
    //   46: ifne -> 70
    //   49: iconst_0
    //   50: istore #5
    //   52: ldc_w 'reply before requesting the sink'
    //   55: astore #5
    //   57: new java/lang/IllegalStateException
    //   60: dup
    //   61: aload #5
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokespecial <init> : (Ljava/lang/String;)V
    //   69: athrow
    //   70: nop
    //   71: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   74: astore #4
    //   76: aload_3
    //   77: monitorexit
    //   78: goto -> 88
    //   81: astore #4
    //   83: aload_3
    //   84: monitorexit
    //   85: aload #4
    //   87: athrow
    //   88: aload_0
    //   89: getfield sink : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSink;
    //   92: checkcast me/rerere/matrix/thirdparty/okio/Sink
    //   95: areturn
    // Exception table:
    //   from	to	target	type
    //   12	76	81	finally
    //   16	30	33	java/lang/IllegalStateException
    //   23	41	41	java/lang/IllegalStateException
    //   81	83	81	finally
  }
  
  public final void receiveHeaders(@NotNull Headers paramHeaders, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream.a : J
    //   3: ldc2_w 125018480651436
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc_w 'headers'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #5
    //   18: iconst_0
    //   19: istore #6
    //   21: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.assertionsEnabled : Z
    //   24: ifeq -> 90
    //   27: aload #5
    //   29: invokestatic holdsLock : (Ljava/lang/Object;)Z
    //   32: ifeq -> 90
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: new java/lang/AssertionError
    //   45: dup
    //   46: new java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: ldc_w 'Thread '
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokestatic currentThread : ()Ljava/lang/Thread;
    //   62: invokevirtual getName : ()Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: ldc_w ' MUST NOT hold lock on '
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload #5
    //   76: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokespecial <init> : (Ljava/lang/Object;)V
    //   85: athrow
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: nop
    //   91: iconst_0
    //   92: istore #5
    //   94: aload_0
    //   95: astore #6
    //   97: aload #6
    //   99: monitorenter
    //   100: nop
    //   101: iconst_0
    //   102: istore #7
    //   104: aload_0
    //   105: getfield hasResponseHeaders : Z
    //   108: ifeq -> 122
    //   111: iload_2
    //   112: ifne -> 148
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_0
    //   123: iconst_1
    //   124: putfield hasResponseHeaders : Z
    //   127: aload_0
    //   128: getfield headersQueue : Ljava/util/ArrayDeque;
    //   131: checkcast java/util/Collection
    //   134: aload_1
    //   135: invokeinterface add : (Ljava/lang/Object;)Z
    //   140: pop
    //   141: goto -> 156
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: invokevirtual getSource$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource;
    //   152: aload_1
    //   153: invokevirtual setTrailers : (Lme/rerere/matrix/thirdparty/okhttp3/Headers;)V
    //   156: iload_2
    //   157: ifeq -> 175
    //   160: aload_0
    //   161: invokevirtual getSource$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource;
    //   164: iconst_1
    //   165: invokevirtual setFinished$okhttp : (Z)V
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_0
    //   176: invokevirtual isOpen : ()Z
    //   179: istore #5
    //   181: aload_0
    //   182: astore #8
    //   184: iconst_0
    //   185: istore #9
    //   187: aload #8
    //   189: checkcast java/lang/Object
    //   192: invokevirtual notifyAll : ()V
    //   195: nop
    //   196: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   199: astore #7
    //   201: aload #6
    //   203: monitorexit
    //   204: goto -> 215
    //   207: astore #7
    //   209: aload #6
    //   211: monitorexit
    //   212: aload #7
    //   214: athrow
    //   215: iload #5
    //   217: ifne -> 239
    //   220: aload_0
    //   221: getfield connection : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;
    //   224: aload_0
    //   225: getfield id : I
    //   228: invokevirtual removeStream$okhttp : (I)Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream;
    //   231: pop
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: return
    // Exception table:
    //   from	to	target	type
    //   21	35	38	java/lang/IllegalStateException
    //   27	86	86	java/lang/IllegalStateException
    //   100	201	207	finally
    //   104	115	118	java/lang/IllegalStateException
    //   111	144	144	java/lang/IllegalStateException
    //   156	168	171	java/lang/IllegalStateException
    //   207	209	207	finally
    //   215	232	235	java/lang/IllegalStateException
  }
  
  public final boolean isLocallyInitiated() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = ((this.id & 0x1) == 1);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.connection.getClient$okhttp() == bool);
  }
  
  @NotNull
  public final Http2Stream$FramingSink getSink$okhttp() {
    return this.sink;
  }
  
  @NotNull
  public final Http2Stream$FramingSource getSource$okhttp() {
    return this.source;
  }
  
  public final void setErrorCode$okhttp(@Nullable ErrorCode paramErrorCode) {
    this.errorCode = paramErrorCode;
  }
  
  public final void setErrorException$okhttp(@Nullable IOException paramIOException) {
    this.errorException = paramIOException;
  }
  
  public final void setWriteBytesMaximum$okhttp(long paramLong) {
    this.writeBytesMaximum = paramLong;
  }
  
  public final void cancelStreamIfNecessary$okhttp() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream.a : J
    //   3: ldc2_w 34681191474438
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.assertionsEnabled : Z
    //   16: ifeq -> 80
    //   19: aload_3
    //   20: invokestatic holdsLock : (Ljava/lang/Object;)Z
    //   23: ifeq -> 80
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: new java/lang/AssertionError
    //   36: dup
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: ldc_w 'Thread '
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokestatic currentThread : ()Ljava/lang/Thread;
    //   53: invokevirtual getName : ()Ljava/lang/String;
    //   56: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   59: ldc_w ' MUST NOT hold lock on '
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: aload_3
    //   66: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/Object;)V
    //   75: athrow
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: nop
    //   81: iconst_0
    //   82: istore_3
    //   83: iconst_0
    //   84: istore #4
    //   86: aload_0
    //   87: astore #5
    //   89: aload #5
    //   91: monitorenter
    //   92: nop
    //   93: iconst_0
    //   94: istore #6
    //   96: aload_0
    //   97: invokevirtual getSource$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource;
    //   100: invokevirtual getFinished$okhttp : ()Z
    //   103: ifne -> 165
    //   106: aload_0
    //   107: invokevirtual getSource$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSource;
    //   110: invokevirtual getClosed$okhttp : ()Z
    //   113: ifeq -> 165
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: invokevirtual getSink$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSink;
    //   127: invokevirtual getFinished : ()Z
    //   130: ifne -> 157
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_0
    //   141: invokevirtual getSink$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream$FramingSink;
    //   144: invokevirtual getClosed : ()Z
    //   147: ifeq -> 165
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: iconst_1
    //   158: goto -> 166
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: iconst_0
    //   166: istore #4
    //   168: aload_0
    //   169: invokevirtual isOpen : ()Z
    //   172: istore_3
    //   173: nop
    //   174: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   177: astore #6
    //   179: aload #5
    //   181: monitorexit
    //   182: goto -> 193
    //   185: astore #6
    //   187: aload #5
    //   189: monitorexit
    //   190: aload #6
    //   192: athrow
    //   193: iload #4
    //   195: ifeq -> 213
    //   198: aload_0
    //   199: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode.CANCEL : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   202: aconst_null
    //   203: invokevirtual close : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V
    //   206: goto -> 236
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: iload_3
    //   214: ifne -> 236
    //   217: aload_0
    //   218: getfield connection : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;
    //   221: aload_0
    //   222: getfield id : I
    //   225: invokevirtual removeStream$okhttp : (I)Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream;
    //   228: pop
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   235: athrow
    //   236: return
    // Exception table:
    //   from	to	target	type
    //   13	26	29	java/io/IOException
    //   19	76	76	java/io/IOException
    //   92	179	185	finally
    //   96	116	119	java/io/IOException
    //   106	133	136	java/io/IOException
    //   123	150	153	java/io/IOException
    //   140	161	161	java/io/IOException
    //   185	187	185	finally
    //   193	209	209	java/io/IOException
    //   213	229	232	java/io/IOException
  }
  
  public final long getWriteBytesTotal() {
    return this.writeBytesTotal;
  }
  
  public final void writeHeaders(@NotNull List paramList, boolean paramBoolean1, boolean paramBoolean2) throws IOException {
    long l = a ^ 0x54FAB1DC6D5L;
    Intrinsics.checkNotNullParameter(paramList, "responseHeaders");
    Http2Stream http2Stream = this;
    boolean bool1 = false;
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
    boolean bool = false;
    bool = paramBoolean2;
    synchronized (this) {
      boolean bool2 = false;
      try {
        this.hasResponseHeaders = true;
        if (paramBoolean1)
          getSink$okhttp().setFinished(true); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    if (!bool)
      synchronized (this.connection) {
        boolean bool2 = false;
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        bool = (getConnection().getWriteBytesTotal() >= getConnection().getWriteBytesMaximum());
        Unit unit = Unit.INSTANCE;
      }  
    try {
      this.connection.writeHeaders$okhttp(this.id, paramBoolean1, paramList);
      if (bool)
        this.connection.flush(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public final int getId() {
    return this.id;
  }
  
  @NotNull
  public final Http2Stream$StreamTimeout getReadTimeout$okhttp() {
    return this.readTimeout;
  }
  
  public final void close(@NotNull ErrorCode paramErrorCode, @Nullable IOException paramIOException) throws IOException {
    long l = a ^ 0x128E5B8C5507L;
    try {
      Intrinsics.checkNotNullParameter(paramErrorCode, "rstStatusCode");
      if (!closeInternal(paramErrorCode, paramIOException))
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.connection.writeSynReset$okhttp(this.id, paramErrorCode);
  }
  
  @NotNull
  public final Http2Connection getConnection() {
    return this.connection;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Stream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */