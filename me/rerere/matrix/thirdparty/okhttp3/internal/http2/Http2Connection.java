package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskQueue;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2Connection implements Closeable {
  @NotNull
  private Settings peerSettings;
  
  @NotNull
  private final Http2Writer writer;
  
  @NotNull
  private final TaskQueue pushQueue;
  
  @NotNull
  private final TaskQueue settingsListenerQueue;
  
  @NotNull
  private final Map streams;
  
  private long degradedPongsReceived;
  
  @NotNull
  private final TaskQueue writerQueue;
  
  @NotNull
  private final Http2Connection$ReaderRunnable readerRunnable;
  
  private long intervalPongsReceived;
  
  private long awaitPongsReceived;
  
  @NotNull
  private final TaskRunner taskRunner;
  
  @NotNull
  private final Set currentPushRequests;
  
  private long intervalPingsSent;
  
  public static final int INTERVAL_PING = 1;
  
  private long readBytesTotal;
  
  @NotNull
  private final Settings okHttpSettings;
  
  private boolean isShutdown;
  
  private long writeBytesTotal;
  
  private long degradedPongDeadlineNs;
  
  @NotNull
  private final String connectionName;
  
  public static final int AWAIT_PING = 3;
  
  @NotNull
  private final Http2Connection$Listener listener;
  
  private long readBytesAcknowledged;
  
  @NotNull
  private static final Settings DEFAULT_SETTINGS;
  
  private long degradedPingsSent;
  
  private long writeBytesMaximum;
  
  private int lastGoodStreamId;
  
  public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
  
  private long awaitPingsSent;
  
  public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
  
  private int nextStreamId;
  
  @NotNull
  public static final Http2Connection$Companion Companion;
  
  @NotNull
  private final Socket socket;
  
  private final boolean client;
  
  public static final int DEGRADED_PING = 2;
  
  @NotNull
  private final PushObserver pushObserver;
  
  private static final long a = o3.a(7749507050887897448L, -5106037011491171996L, MethodHandles.lookup().lookupClass()).a(11373951591644L);
  
  @JvmOverloads
  public final void start(boolean paramBoolean) throws IOException {
    start$default(this, paramBoolean, null, 2, null);
  }
  
  @JvmOverloads
  public final void start(boolean paramBoolean, @NotNull TaskRunner paramTaskRunner) throws IOException {
    long l1 = a ^ 0x52877BD9FACEL;
    Intrinsics.checkNotNullParameter(paramTaskRunner, "taskRunner");
    if (paramBoolean) {
      this.writer.connectionPreface();
      this.writer.settings(this.okHttpSettings);
      int i = this.okHttpSettings.getInitialWindowSize();
      try {
        if (i != 65535)
          this.writer.windowUpdate(0, (i - 65535)); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    TaskQueue taskQueue = paramTaskRunner.newQueue();
    String str = this.connectionName;
    Http2Connection$ReaderRunnable http2Connection$ReaderRunnable = this.readerRunnable;
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule((Task)new Object(str, bool1, http2Connection$ReaderRunnable), l2);
  }
  
  public final long getWriteBytesTotal() {
    return this.writeBytesTotal;
  }
  
  public final void pushDataLater$okhttp(int paramInt1, @NotNull BufferedSource paramBufferedSource, int paramInt2, boolean paramBoolean) throws IOException {
    long l1 = a ^ 0x35A3AA56DBADL;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    Buffer buffer = new Buffer();
    paramBufferedSource.require(paramInt2);
    paramBufferedSource.read(buffer, paramInt2);
    TaskQueue taskQueue = this.pushQueue;
    String str = this.connectionName + '[' + paramInt1 + "] onData";
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$pushDataLater$$inlined$execute$default$1(str, bool1, this, paramInt1, buffer, paramInt2, paramBoolean), l2);
  }
  
  public final void writeWindowUpdateLater$okhttp(int paramInt, long paramLong) {
    long l1 = a ^ 0x2A5ABE0EC3FEL;
    TaskQueue taskQueue = this.writerQueue;
    String str = this.connectionName + '[' + paramInt + "] windowUpdate";
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(str, bool1, this, paramInt, paramLong), l2);
  }
  
  @NotNull
  public final Http2Stream pushStream(int paramInt, @NotNull List paramList, boolean paramBoolean) throws IOException {
    long l = a ^ 0x69DC4B78E265L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (!(!this.client ? 1 : 0)) {
      boolean bool = false;
      String str = "Client cannot push requests.";
      throw new IllegalStateException(str.toString());
    } 
    return newStream(paramInt, paramList, paramBoolean);
  }
  
  @Nullable
  public final synchronized Http2Stream getStream(int paramInt) {
    return (Http2Stream)this.streams.get(Integer.valueOf(paramInt));
  }
  
  static {
    Companion = new Http2Connection$Companion(null);
    Settings settings1 = new Settings();
    Settings settings2 = settings1;
    boolean bool = false;
    settings2.set(7, 65535);
    settings2.set(5, 16384);
    DEFAULT_SETTINGS = settings1;
  }
  
  public Http2Connection(@NotNull Http2Connection$Builder paramHttp2Connection$Builder) {
    this.client = paramHttp2Connection$Builder.getClient$okhttp();
    this.listener = paramHttp2Connection$Builder.getListener$okhttp();
    this.streams = new LinkedHashMap<>();
    this.connectionName = paramHttp2Connection$Builder.getConnectionName$okhttp();
    this.nextStreamId = paramHttp2Connection$Builder.getClient$okhttp() ? 3 : 2;
    this.taskRunner = paramHttp2Connection$Builder.getTaskRunner$okhttp();
    this.writerQueue = this.taskRunner.newQueue();
    this.pushQueue = this.taskRunner.newQueue();
    this.settingsListenerQueue = this.taskRunner.newQueue();
    this.pushObserver = paramHttp2Connection$Builder.getPushObserver$okhttp();
    Settings settings1 = new Settings();
    Settings settings2 = settings1;
    Http2Connection http2Connection = this;
    boolean bool = false;
    try {
      if (paramHttp2Connection$Builder.getClient$okhttp())
        settings2.set(7, 16777216); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    http2Connection.okHttpSettings = settings1;
    this.peerSettings = DEFAULT_SETTINGS;
    this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
    this.socket = paramHttp2Connection$Builder.getSocket$okhttp();
    this.writer = new Http2Writer(paramHttp2Connection$Builder.getSink$okhttp(), this.client);
    this.readerRunnable = new Http2Connection$ReaderRunnable(this, new Http2Reader(paramHttp2Connection$Builder.getSource$okhttp(), this.client));
    this.currentPushRequests = new LinkedHashSet();
    if (paramHttp2Connection$Builder.getPingIntervalMillis$okhttp() != 0) {
      long l1 = TimeUnit.MILLISECONDS.toNanos(paramHttp2Connection$Builder.getPingIntervalMillis$okhttp());
      TaskQueue taskQueue = this.writerQueue;
      String str = Intrinsics.stringPlus(this.connectionName, " ping");
      boolean bool1 = false;
      taskQueue.schedule(new Http2Connection$special$$inlined$schedule$1(str, this, l1), l1);
    } 
  }
  
  @Nullable
  public final synchronized Http2Stream removeStream$okhttp(int paramInt) {
    Http2Stream http2Stream = (Http2Stream)this.streams.remove(Integer.valueOf(paramInt));
    Http2Connection http2Connection = this;
    boolean bool = false;
    http2Connection.notifyAll();
    return http2Stream;
  }
  
  public final long getReadBytesTotal() {
    return this.readBytesTotal;
  }
  
  public final void pushHeadersLater$okhttp(int paramInt, @NotNull List paramList, boolean paramBoolean) {
    long l1 = a ^ 0x35881D4E92BDL;
    Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
    TaskQueue taskQueue = this.pushQueue;
    String str = this.connectionName + '[' + paramInt + "] onHeaders";
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$pushHeadersLater$$inlined$execute$default$1(str, bool1, this, paramInt, paramList, paramBoolean), l2);
  }
  
  public final void sendDegradedPingLater$okhttp() {
    long l1 = a ^ 0x54D1AF75A0BFL;
    synchronized (this) {
      boolean bool = false;
      if (this.degradedPongsReceived < this.degradedPingsSent)
        return; 
      long l = this.degradedPingsSent;
      this.degradedPingsSent = l + 1L;
      this.degradedPongDeadlineNs = System.nanoTime() + 1000000000L;
      Unit unit = Unit.INSTANCE;
    } 
    TaskQueue taskQueue = this.writerQueue;
    String str = Intrinsics.stringPlus(this.connectionName, " ping");
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(str, bool1, this), l2);
  }
  
  public final void close$okhttp(@NotNull ErrorCode paramErrorCode1, @NotNull ErrorCode paramErrorCode2, @Nullable IOException paramIOException) {
    long l = a ^ 0x73002525E95AL;
    Intrinsics.checkNotNullParameter(paramErrorCode1, "connectionCode");
    Intrinsics.checkNotNullParameter(paramErrorCode2, "streamCode");
    Http2Connection http2Connection = this;
    boolean bool2 = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(http2Connection))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Connection); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool1 = false;
    try {
      bool2 = false;
      shutdown(paramErrorCode1);
    } catch (IOException iOException) {}
    Object[] arrayOfObject = null;
    synchronized (this) {
      boolean bool = false;
      try {
        if (!getStreams$okhttp().isEmpty()) {
          Collection collection1 = getStreams$okhttp().values();
          boolean bool3 = false;
          Collection collection2 = collection1;
          try {
            if (collection2.toArray((Object[])new Http2Stream[0]) == null) {
              collection2.toArray((Object[])new Http2Stream[0]);
              throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          getStreams$okhttp().clear();
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if ((Http2Stream[])arrayOfObject == null) {
        (Http2Stream[])arrayOfObject;
      } else {
        Http2Stream[] arrayOfHttp2Stream;
        boolean bool = false;
        byte b = 0;
        int i = arrayOfHttp2Stream.length;
        if (b < i) {
          Http2Stream http2Stream1 = arrayOfHttp2Stream[b];
          Http2Stream http2Stream2 = http2Stream1;
          boolean bool3 = false;
          boolean bool4 = false;
          try {
            boolean bool5 = false;
            http2Stream2.close(paramErrorCode2, paramIOException);
          } catch (IOException iOException) {}
          b++;
        } else {
          bool2 = false;
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    bool2 = false;
  }
  
  public final void pushRequestLater$okhttp(int paramInt, @NotNull List paramList) {
    long l1 = a ^ 0x311BB580B899L;
    Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
    synchronized (this) {
      boolean bool = false;
      if (this.currentPushRequests.contains(Integer.valueOf(paramInt))) {
        writeSynResetLater$okhttp(paramInt, ErrorCode.PROTOCOL_ERROR);
        return;
      } 
      bool = this.currentPushRequests.add(Integer.valueOf(paramInt));
    } 
    TaskQueue taskQueue = this.pushQueue;
    String str = this.connectionName + '[' + paramInt + "] onRequest";
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$pushRequestLater$$inlined$execute$default$1(str, bool1, this, paramInt, paramList), l2);
  }
  
  public final void setPeerSettings(@NotNull Settings paramSettings) {
    long l = a ^ 0x68014CC93923L;
    Intrinsics.checkNotNullParameter(paramSettings, "<set-?>");
    this.peerSettings = paramSettings;
  }
  
  public final void setSettings(@NotNull Settings paramSettings) throws IOException {
    long l = a ^ 0x4F4DF4724E46L;
    Intrinsics.checkNotNullParameter(paramSettings, "settings");
    synchronized (this.writer) {
      boolean bool = false;
      synchronized (this) {
        boolean bool1 = false;
        try {
          if (this.isShutdown)
            throw new ConnectionShutdownException(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        getOkHttpSettings().merge(paramSettings);
        Unit unit1 = Unit.INSTANCE;
      } 
      getWriter().settings(paramSettings);
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  public final void writeSynResetLater$okhttp(int paramInt, @NotNull ErrorCode paramErrorCode) {
    long l1 = a ^ 0x449291B0A08EL;
    Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
    TaskQueue taskQueue = this.writerQueue;
    String str = this.connectionName + '[' + paramInt + "] writeSynReset";
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$writeSynResetLater$$inlined$execute$default$1(str, bool1, this, paramInt, paramErrorCode), l2);
  }
  
  @NotNull
  public final String getConnectionName$okhttp() {
    return this.connectionName;
  }
  
  public final long getReadBytesAcknowledged() {
    return this.readBytesAcknowledged;
  }
  
  public final void setLastGoodStreamId$okhttp(int paramInt) {
    this.lastGoodStreamId = paramInt;
  }
  
  public final void writeSynReset$okhttp(int paramInt, @NotNull ErrorCode paramErrorCode) throws IOException {
    long l = a ^ 0x4FC8B5F90D56L;
    Intrinsics.checkNotNullParameter(paramErrorCode, "statusCode");
    this.writer.rstStream(paramInt, paramErrorCode);
  }
  
  public final int getNextStreamId$okhttp() {
    return this.nextStreamId;
  }
  
  public final long getWriteBytesMaximum() {
    return this.writeBytesMaximum;
  }
  
  @NotNull
  public final Settings getPeerSettings() {
    return this.peerSettings;
  }
  
  @NotNull
  public final Settings getOkHttpSettings() {
    return this.okHttpSettings;
  }
  
  @NotNull
  public final Http2Connection$Listener getListener$okhttp() {
    return this.listener;
  }
  
  public final int getLastGoodStreamId$okhttp() {
    return this.lastGoodStreamId;
  }
  
  public final void setNextStreamId$okhttp(int paramInt) {
    this.nextStreamId = paramInt;
  }
  
  @NotNull
  public final Http2Connection$ReaderRunnable getReaderRunnable() {
    return this.readerRunnable;
  }
  
  @NotNull
  public final Http2Stream newStream(@NotNull List paramList, boolean paramBoolean) throws IOException {
    long l = a ^ 0x10627B673535L;
    Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
    return newStream(0, paramList, paramBoolean);
  }
  
  public final boolean pushedStream$okhttp(int paramInt) {
    try {
      if (paramInt != 0)
        try {
          if ((paramInt & 0x1) == 0);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public void close() {
    close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
  }
  
  public final void shutdown(@NotNull ErrorCode paramErrorCode) throws IOException {
    long l = a ^ 0xCD00313D493L;
    Intrinsics.checkNotNullParameter(paramErrorCode, "statusCode");
    synchronized (this.writer) {
      boolean bool = false;
      Ref.IntRef intRef = new Ref.IntRef();
      synchronized (this) {
        boolean bool1 = false;
        if (this.isShutdown)
          return; 
        this.isShutdown = true;
        intRef.element = getLastGoodStreamId$okhttp();
        Unit unit1 = Unit.INSTANCE;
      } 
      getWriter().goAway(intRef.element, paramErrorCode, Util.EMPTY_BYTE_ARRAY);
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  public final synchronized boolean isHealthy(long paramLong) {
    try {
      if (this.isShutdown)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.degradedPongsReceived < this.degradedPingsSent)
        try {
          if (paramLong >= this.degradedPongDeadlineNs)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  @JvmOverloads
  public final void start() throws IOException {
    start$default(this, false, null, 3, null);
  }
  
  public final void writeHeaders$okhttp(int paramInt, boolean paramBoolean, @NotNull List paramList) throws IOException {
    long l = a ^ 0x554399A8A9FAL;
    Intrinsics.checkNotNullParameter(paramList, "alternating");
    this.writer.headers(paramBoolean, paramInt, paramList);
  }
  
  @NotNull
  public final Socket getSocket$okhttp() {
    return this.socket;
  }
  
  public final synchronized void updateConnectionFlowControl$okhttp(long paramLong) {
    this.readBytesTotal += paramLong;
    long l = this.readBytesTotal - this.readBytesAcknowledged;
    try {
      if (l >= (this.okHttpSettings.getInitialWindowSize() / 2)) {
        writeWindowUpdateLater$okhttp(0, l);
        this.readBytesAcknowledged += l;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public final synchronized int openStreamCount() {
    return this.streams.size();
  }
  
  public final void writeData(int paramInt, boolean paramBoolean, @Nullable Buffer paramBuffer, long paramLong) throws IOException {
    long l1 = a ^ 0x24AEEDC2B58CL;
    try {
      if (paramLong == 0L) {
        this.writer.data(paramBoolean, paramInt, paramBuffer, 0);
        return;
      } 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    long l2 = 0L;
    l2 = paramLong;
    while (l2 > 0L) {
      int i = 0;
      synchronized (this) {
        boolean bool = false;
        try {
          while (true) {
            try {
              if (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                try {
                  if (!getStreams$okhttp().containsKey(Integer.valueOf(paramInt)))
                    throw new IOException("stream closed"); 
                } catch (InterruptedException interruptedException) {
                  throw a(null);
                } 
                Http2Connection http2Connection = this;
                boolean bool1 = false;
                http2Connection.wait();
                continue;
              } 
            } catch (InterruptedException interruptedException) {
              throw a(null);
            } 
            i = (int)Math.min(l2, getWriteBytesMaximum() - getWriteBytesTotal());
            i = Math.min(i, getWriter().maxDataLength());
            this.writeBytesTotal = getWriteBytesTotal() + i;
            Unit unit = Unit.INSTANCE;
            l2 -= i;
            try {
              if (paramBoolean)
                try {
                  if (l2 == 0L);
                } catch (InterruptedException interruptedException) {
                  throw a(null);
                }  
            } catch (InterruptedException interruptedException) {
              throw a(null);
            } 
            break;
          } 
        } catch (InterruptedException interruptedException) {
          Thread.currentThread().interrupt();
          throw new InterruptedIOException();
        } 
      } 
      this.writer.data(false, paramInt, paramBuffer, i);
    } 
  }
  
  public final void writePing() throws InterruptedException {
    synchronized (this) {
      boolean bool = false;
      long l2 = this.awaitPingsSent;
      this.awaitPingsSent = l2 + 1L;
      long l1 = l2;
    } 
    writePing(false, 3, 1330343787);
  }
  
  @NotNull
  public final Map getStreams$okhttp() {
    return this.streams;
  }
  
  @NotNull
  public final Http2Writer getWriter() {
    return this.writer;
  }
  
  public final void flush() throws IOException {
    this.writer.flush();
  }
  
  public final void writePingAndAwaitPong() throws InterruptedException {
    writePing();
    awaitPong();
  }
  
  public final void writePing(boolean paramBoolean, int paramInt1, int paramInt2) {
    try {
      this.writer.ping(paramBoolean, paramInt1, paramInt2);
    } catch (IOException iOException) {
      failConnection(iOException);
    } 
  }
  
  public final void pushResetLater$okhttp(int paramInt, @NotNull ErrorCode paramErrorCode) {
    long l1 = a ^ 0xA97D2567F5BL;
    Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
    TaskQueue taskQueue = this.pushQueue;
    String str = this.connectionName + '[' + paramInt + "] onReset";
    long l2 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    taskQueue.schedule(new Http2Connection$pushResetLater$$inlined$execute$default$1(str, bool1, this, paramInt, paramErrorCode), l2);
  }
  
  public final boolean getClient$okhttp() {
    return this.client;
  }
  
  public final synchronized void awaitPong() throws InterruptedException {
    while (this.awaitPongsReceived < this.awaitPingsSent) {
      Http2Connection http2Connection = this;
      boolean bool = false;
      http2Connection.wait();
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */