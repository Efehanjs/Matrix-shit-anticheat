package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskQueue;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2Connection$ReaderRunnable implements Http2Reader$Handler, Function0 {
  @NotNull
  private final Http2Reader reader;
  
  private static final long a = o3.a(-2088474364263556592L, 6705720860541675839L, MethodHandles.lookup().lookupClass()).a(52698253137924L);
  
  public void data(boolean paramBoolean, int paramInt1, @NotNull BufferedSource paramBufferedSource, int paramInt2) throws IOException {
    long l = a ^ 0x51EED9CEAA5CL;
    try {
      Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
      if (Http2Connection.this.pushedStream$okhttp(paramInt1)) {
        Http2Connection.this.pushDataLater$okhttp(paramInt1, paramBufferedSource, paramInt2, paramBoolean);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Http2Stream http2Stream = Http2Connection.this.getStream(paramInt1);
    try {
      if (http2Stream == null) {
        Http2Connection.this.writeSynResetLater$okhttp(paramInt1, ErrorCode.PROTOCOL_ERROR);
        Http2Connection.this.updateConnectionFlowControl$okhttp(paramInt2);
        paramBufferedSource.skip(paramInt2);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      http2Stream.receiveData(paramBufferedSource, paramInt2);
      if (paramBoolean)
        http2Stream.receiveHeaders(Util.EMPTY_HEADERS, true); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void ackSettings() {}
  
  public final void applyAndAckSettings(boolean paramBoolean, @NotNull Settings paramSettings) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection$ReaderRunnable.a : J
    //   3: ldc2_w 63534688837725
    //   6: lxor
    //   7: lstore_3
    //   8: aload_2
    //   9: ldc 'settings'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: lconst_0
    //   15: lstore #26
    //   17: aconst_null
    //   18: astore #5
    //   20: new me/rerere/matrix/thirdparty/kotlin/jvm/internal/Ref$ObjectRef
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #6
    //   29: aload_0
    //   30: getfield this$0 : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;
    //   33: invokevirtual getWriter : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Writer;
    //   36: astore #7
    //   38: aload_0
    //   39: getfield this$0 : Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;
    //   42: astore #8
    //   44: aload #7
    //   46: astore #9
    //   48: aload #9
    //   50: monitorenter
    //   51: nop
    //   52: iconst_0
    //   53: istore #10
    //   55: aload #8
    //   57: astore #11
    //   59: aload #11
    //   61: monitorenter
    //   62: nop
    //   63: iconst_0
    //   64: istore #12
    //   66: aload #8
    //   68: invokevirtual getPeerSettings : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings;
    //   71: astore #13
    //   73: aload #6
    //   75: iload_1
    //   76: ifeq -> 87
    //   79: aload_2
    //   80: goto -> 123
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: new me/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: astore #14
    //   96: aload #14
    //   98: astore #15
    //   100: astore #16
    //   102: iconst_0
    //   103: istore #17
    //   105: aload #15
    //   107: aload #13
    //   109: invokevirtual merge : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings;)V
    //   112: aload #15
    //   114: aload_2
    //   115: invokevirtual merge : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings;)V
    //   118: nop
    //   119: aload #16
    //   121: aload #14
    //   123: putfield element : Ljava/lang/Object;
    //   126: aload #6
    //   128: getfield element : Ljava/lang/Object;
    //   131: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings
    //   134: invokevirtual getInitialWindowSize : ()I
    //   137: i2l
    //   138: lstore #18
    //   140: lload #18
    //   142: aload #13
    //   144: invokevirtual getInitialWindowSize : ()I
    //   147: i2l
    //   148: lsub
    //   149: lstore #26
    //   151: nop
    //   152: lload #26
    //   154: lconst_0
    //   155: lcmp
    //   156: ifeq -> 179
    //   159: aload #8
    //   161: invokevirtual getStreams$okhttp : ()Ljava/util/Map;
    //   164: invokeinterface isEmpty : ()Z
    //   169: ifeq -> 187
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: aconst_null
    //   180: goto -> 239
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload #8
    //   189: invokevirtual getStreams$okhttp : ()Ljava/util/Map;
    //   192: invokeinterface values : ()Ljava/util/Collection;
    //   197: astore #17
    //   199: iconst_0
    //   200: istore #20
    //   202: aload #17
    //   204: astore #21
    //   206: aload #21
    //   208: iconst_0
    //   209: anewarray me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream
    //   212: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   217: dup
    //   218: ifnonnull -> 236
    //   221: pop
    //   222: new java/lang/NullPointerException
    //   225: dup
    //   226: ldc 'null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>'
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: athrow
    //   232: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   235: athrow
    //   236: checkcast [Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Stream;
    //   239: astore #5
    //   241: aload #8
    //   243: aload #6
    //   245: getfield element : Ljava/lang/Object;
    //   248: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings
    //   251: invokevirtual setPeerSettings : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings;)V
    //   254: aload #8
    //   256: invokestatic access$getSettingsListenerQueue$p : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;)Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;
    //   259: astore #17
    //   261: aload #8
    //   263: invokevirtual getConnectionName$okhttp : ()Ljava/lang/String;
    //   266: ldc ' onSettings'
    //   268: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   271: astore #20
    //   273: lconst_0
    //   274: lstore #22
    //   276: iconst_1
    //   277: istore #24
    //   279: iconst_0
    //   280: istore #25
    //   282: aload #17
    //   284: new me/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
    //   287: dup
    //   288: aload #20
    //   290: iload #24
    //   292: aload #8
    //   294: aload #6
    //   296: invokespecial <init> : (Ljava/lang/String;ZLme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;Lme/rerere/matrix/thirdparty/kotlin/jvm/internal/Ref$ObjectRef;)V
    //   299: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task
    //   302: lload #22
    //   304: invokevirtual schedule : (Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task;J)V
    //   307: nop
    //   308: nop
    //   309: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   312: astore #12
    //   314: aload #11
    //   316: monitorexit
    //   317: goto -> 328
    //   320: astore #12
    //   322: aload #11
    //   324: monitorexit
    //   325: aload #12
    //   327: athrow
    //   328: nop
    //   329: aload #8
    //   331: invokevirtual getWriter : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Writer;
    //   334: aload #6
    //   336: getfield element : Ljava/lang/Object;
    //   339: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings
    //   342: invokevirtual applyAndAckSettings : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Settings;)V
    //   345: goto -> 357
    //   348: astore #11
    //   350: aload #8
    //   352: aload #11
    //   354: invokestatic access$failConnection : (Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/Http2Connection;Ljava/io/IOException;)V
    //   357: nop
    //   358: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   361: astore #10
    //   363: aload #9
    //   365: monitorexit
    //   366: goto -> 377
    //   369: astore #10
    //   371: aload #9
    //   373: monitorexit
    //   374: aload #10
    //   376: athrow
    //   377: aload #5
    //   379: ifnull -> 449
    //   382: aload #5
    //   384: astore #7
    //   386: iconst_0
    //   387: istore #8
    //   389: aload #7
    //   391: arraylength
    //   392: istore #9
    //   394: iload #8
    //   396: iload #9
    //   398: if_icmpge -> 449
    //   401: aload #7
    //   403: iload #8
    //   405: aaload
    //   406: astore #10
    //   408: iinc #8, 1
    //   411: aload #10
    //   413: astore #11
    //   415: aload #11
    //   417: monitorenter
    //   418: nop
    //   419: iconst_0
    //   420: istore #12
    //   422: aload #10
    //   424: lload #26
    //   426: invokevirtual addBytesToWriteWindow : (J)V
    //   429: nop
    //   430: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   433: astore #12
    //   435: aload #11
    //   437: monitorexit
    //   438: goto -> 394
    //   441: astore #12
    //   443: aload #11
    //   445: monitorexit
    //   446: aload #12
    //   448: athrow
    //   449: return
    // Exception table:
    //   from	to	target	type
    //   51	363	369	finally
    //   62	314	320	finally
    //   73	83	83	java/io/IOException
    //   151	172	175	java/io/IOException
    //   159	183	183	java/io/IOException
    //   206	232	232	java/io/IOException
    //   320	322	320	finally
    //   328	345	348	java/io/IOException
    //   369	371	369	finally
    //   418	435	441	finally
    //   441	443	441	finally
  }
  
  public void invoke() {
    ErrorCode errorCode1 = ErrorCode.INTERNAL_ERROR;
    ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
    IOException iOException = null;
    try {
      this.reader.readConnectionPreface(this);
      try {
        while (this.reader.nextFrame(false, this));
      } catch (IOException iOException1) {
        throw a(null);
      } 
      errorCode1 = ErrorCode.NO_ERROR;
      errorCode2 = ErrorCode.CANCEL;
    } catch (IOException iOException1) {
      iOException = iOException1;
      errorCode1 = ErrorCode.PROTOCOL_ERROR;
      errorCode2 = ErrorCode.PROTOCOL_ERROR;
    } finally {
      Http2Connection.this.close$okhttp(errorCode1, errorCode2, iOException);
      Util.closeQuietly(this.reader);
    } 
  }
  
  public void headers(boolean paramBoolean, int paramInt1, int paramInt2, @NotNull List paramList) {
    long l = a ^ 0x83B59D7C497L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "headerBlock");
      if (Http2Connection.this.pushedStream$okhttp(paramInt1)) {
        Http2Connection.this.pushHeadersLater$okhttp(paramInt1, paramList, paramBoolean);
        return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Http2Stream http2Stream = null;
    Http2Connection http2Connection1 = Http2Connection.this;
    Http2Connection http2Connection2 = Http2Connection.this;
    synchronized (http2Connection1) {
      boolean bool = false;
      http2Stream = http2Connection2.getStream(paramInt1);
      try {
        if (http2Stream == null) {
          if (Http2Connection.access$isShutdown$p(http2Connection2))
            return; 
          if (paramInt1 <= http2Connection2.getLastGoodStreamId$okhttp())
            return; 
          if (paramInt1 % 2 == http2Connection2.getNextStreamId$okhttp() % 2)
            return; 
          Headers headers = Util.toHeaders(paramList);
          Http2Stream http2Stream1 = new Http2Stream(paramInt1, http2Connection2, false, paramBoolean, headers);
          http2Connection2.setLastGoodStreamId$okhttp(paramInt1);
          Map<Integer, Http2Stream> map = http2Connection2.getStreams$okhttp();
          Integer integer = Integer.valueOf(paramInt1);
          map.put(integer, http2Stream1);
          TaskQueue taskQueue = Http2Connection.access$getTaskRunner$p(http2Connection2).newQueue();
          String str = http2Connection2.getConnectionName$okhttp() + '[' + paramInt1 + "] onStream";
          long l1 = 0L;
          boolean bool1 = true;
          boolean bool2 = false;
          taskQueue.schedule(new Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1(str, bool1, http2Connection2, http2Stream1), l1);
          return;
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    http2Stream.receiveHeaders(Util.toHeaders(paramList), paramBoolean);
  }
  
  public void rstStream(int paramInt, @NotNull ErrorCode paramErrorCode) {
    long l = a ^ 0x5057A56B806DL;
    try {
      Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
      if (Http2Connection.this.pushedStream$okhttp(paramInt)) {
        Http2Connection.this.pushResetLater$okhttp(paramInt, paramErrorCode);
        return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Http2Stream http2Stream = Http2Connection.this.removeStream$okhttp(paramInt);
    try {
      if (http2Stream == null) {
      
      } else {
        http2Stream.receiveRstStream(paramErrorCode);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public void priority(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
  
  public void settings(boolean paramBoolean, @NotNull Settings paramSettings) {
    long l1 = a ^ 0x3EF431BC8309L;
    Intrinsics.checkNotNullParameter(paramSettings, "settings");
    TaskQueue taskQueue = Http2Connection.access$getWriterQueue$p(Http2Connection.this);
    String str = Intrinsics.stringPlus(Http2Connection.this.getConnectionName$okhttp(), " applyAndAckSettings");
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(str, bool1, this, paramBoolean, paramSettings), l2);
  }
  
  @NotNull
  public final Http2Reader getReader$okhttp() {
    return this.reader;
  }
  
  public void pushPromise(int paramInt1, int paramInt2, @NotNull List paramList) {
    long l = a ^ 0x53A9B882FC75L;
    Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
    Http2Connection.this.pushRequestLater$okhttp(paramInt2, paramList);
  }
  
  public void windowUpdate(int paramInt, long paramLong) {
    if (paramInt == 0) {
      Http2Connection http2Connection1 = Http2Connection.this;
      Http2Connection http2Connection2 = Http2Connection.this;
      synchronized (http2Connection1) {
        boolean bool1 = false;
        Http2Connection.access$setWriteBytesMaximum$p(http2Connection2, http2Connection2.getWriteBytesMaximum() + paramLong);
        Http2Connection http2Connection = http2Connection2;
        boolean bool2 = false;
        http2Connection.notifyAll();
        Unit unit = Unit.INSTANCE;
      } 
    } else {
      Http2Stream http2Stream = Http2Connection.this.getStream(paramInt);
      if (http2Stream != null)
        synchronized (http2Stream) {
          boolean bool = false;
          http2Stream.addBytesToWriteWindow(paramLong);
          Unit unit = Unit.INSTANCE;
        }  
    } 
  }
  
  public void goAway(int paramInt, @NotNull ErrorCode paramErrorCode, @NotNull ByteString paramByteString) {
    long l = a ^ 0x4EF7F9E8A8A2L;
    Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
    Intrinsics.checkNotNullParameter(paramByteString, "debugData");
    if (paramByteString.size() > 0);
    Object[] arrayOfObject = null;
    Http2Connection http2Connection1 = Http2Connection.this;
    Http2Connection http2Connection2 = Http2Connection.this;
    synchronized (http2Connection1) {
      boolean bool1 = false;
      Collection collection1 = http2Connection2.getStreams$okhttp().values();
      boolean bool2 = false;
      Collection collection2 = collection1;
      try {
        if (collection2.toArray((Object[])new Http2Stream[0]) == null) {
          collection2.toArray((Object[])new Http2Stream[0]);
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      Http2Connection.access$setShutdown$p(http2Connection2, true);
      Unit unit = Unit.INSTANCE;
    } 
    Http2Stream[] arrayOfHttp2Stream = (Http2Stream[])arrayOfObject;
    byte b = 0;
    int i = arrayOfHttp2Stream.length;
    while (b < i) {
      Http2Stream http2Stream = arrayOfHttp2Stream[b];
      b++;
      if (http2Stream.getId() > paramInt && http2Stream.isLocallyInitiated()) {
        http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
        Http2Connection.this.removeStream$okhttp(http2Stream.getId());
      } 
    } 
  }
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2) {
    long l = a ^ 0x6173F3EB92F2L;
    if (paramBoolean) {
      Http2Connection http2Connection1 = Http2Connection.this;
      Http2Connection http2Connection2 = Http2Connection.this;
      synchronized (http2Connection1) {
        long l1;
        Http2Connection http2Connection;
        boolean bool2;
        boolean bool1 = false;
        switch (paramInt1) {
          case 1:
            l1 = Http2Connection.access$getIntervalPongsReceived$p(http2Connection2);
            Http2Connection.access$setIntervalPongsReceived$p(http2Connection2, l1 + 1L);
          case 2:
            l1 = Http2Connection.access$getDegradedPongsReceived$p(http2Connection2);
            Http2Connection.access$setDegradedPongsReceived$p(http2Connection2, l1 + 1L);
          case 3:
            l1 = Http2Connection.access$getAwaitPongsReceived$p(http2Connection2);
            Http2Connection.access$setAwaitPongsReceived$p(http2Connection2, l1 + 1L);
            http2Connection = http2Connection2;
            bool2 = false;
            http2Connection.notifyAll();
          default:
            break;
        } 
        Unit unit = Unit.INSTANCE;
      } 
    } else {
      TaskQueue taskQueue = Http2Connection.access$getWriterQueue$p(Http2Connection.this);
      String str = Intrinsics.stringPlus(Http2Connection.this.getConnectionName$okhttp(), " ping");
      Http2Connection http2Connection = Http2Connection.this;
      long l1 = 0L;
      boolean bool1 = true;
      boolean bool2 = false;
      taskQueue.schedule(new Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(str, bool1, http2Connection, paramInt1, paramInt2), l1);
    } 
  }
  
  public Http2Connection$ReaderRunnable(Http2Reader paramHttp2Reader) {
    this.reader = paramHttp2Reader;
  }
  
  public void alternateService(int paramInt1, @NotNull String paramString1, @NotNull ByteString paramByteString, @NotNull String paramString2, int paramInt2, long paramLong) {
    long l = a ^ 0x179D6B3F93FCL;
    Intrinsics.checkNotNullParameter(paramString1, "origin");
    Intrinsics.checkNotNullParameter(paramByteString, "protocol");
    Intrinsics.checkNotNullParameter(paramString2, "host");
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$ReaderRunnable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */