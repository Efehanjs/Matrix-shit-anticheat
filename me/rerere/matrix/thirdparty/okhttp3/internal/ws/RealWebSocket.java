package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.WebSocket;
import me.rerere.matrix.thirdparty.okhttp3.WebSocketListener;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskQueue;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.Exchange;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealWebSocket implements WebSocket, WebSocketReader$FrameCallback {
  @Nullable
  private String name;
  
  private final long pingIntervalMillis;
  
  @NotNull
  private TaskQueue taskQueue;
  
  @Nullable
  private Task writerTask;
  
  @Nullable
  private RealWebSocket$Streams streams;
  
  private boolean enqueuedClose;
  
  private int receivedPongCount;
  
  @NotNull
  private final Random random;
  
  @NotNull
  private final Request originalRequest;
  
  private long queueSize;
  
  private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000L;
  
  @NotNull
  private static final List ONLY_HTTP1;
  
  @Nullable
  private WebSocketWriter writer;
  
  @NotNull
  private final ArrayDeque pongQueue;
  
  @NotNull
  private final WebSocketListener listener;
  
  private int receivedCloseCode;
  
  @NotNull
  public static final RealWebSocket$Companion Companion;
  
  private int sentPingCount;
  
  @NotNull
  private final ArrayDeque messageAndCloseQueue;
  
  private int receivedPingCount;
  
  private boolean awaitingPong;
  
  @NotNull
  private final String key;
  
  @Nullable
  private String receivedCloseReason;
  
  @Nullable
  private WebSocketExtensions extensions;
  
  private long minimumDeflateSize;
  
  @Nullable
  private Call call;
  
  @Nullable
  private WebSocketReader reader;
  
  public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024L;
  
  private static final long MAX_QUEUE_SIZE = 16777216L;
  
  private boolean failed;
  
  private static final long a = o3.a(5804100272484407078L, 2107664846260115633L, MethodHandles.lookup().lookupClass()).a(237433444873251L);
  
  public final void initReaderAndWriter(@NotNull String paramString, @NotNull RealWebSocket$Streams paramRealWebSocket$Streams) throws IOException {
    long l = a ^ 0x4E9D78BB25L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramRealWebSocket$Streams, "streams");
    Intrinsics.checkNotNull(this.extensions);
    WebSocketExtensions webSocketExtensions = this.extensions;
    synchronized (this) {
      boolean bool = false;
      this.name = paramString;
      this.streams = paramRealWebSocket$Streams;
      this.writer = new WebSocketWriter(paramRealWebSocket$Streams.getClient(), paramRealWebSocket$Streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(paramRealWebSocket$Streams.getClient()), this.minimumDeflateSize);
      this.writerTask = new RealWebSocket$WriterTask(this);
      if (this.pingIntervalMillis != 0L) {
        long l1 = TimeUnit.MILLISECONDS.toNanos(this.pingIntervalMillis);
        TaskQueue taskQueue = this.taskQueue;
        String str = Intrinsics.stringPlus(paramString, " ping");
        boolean bool1 = false;
        taskQueue.schedule(new RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1(str, this, l1), l1);
      } 
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (!this.messageAndCloseQueue.isEmpty())
          runWriter(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.reader = new WebSocketReader(paramRealWebSocket$Streams.getClient(), paramRealWebSocket$Streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!paramRealWebSocket$Streams.getClient()));
  }
  
  public void cancel() {
    Intrinsics.checkNotNull(this.call);
    this.call.cancel();
  }
  
  public final synchronized int receivedPingCount() {
    return this.receivedPingCount;
  }
  
  public final void checkUpgradeSuccess$okhttp(@NotNull Response paramResponse, @Nullable Exchange paramExchange) throws IOException {
    long l = a ^ 0x5E445F6EA605L;
    try {
      Intrinsics.checkNotNullParameter(paramResponse, "response");
      if (paramResponse.code() != 101)
        throw new ProtocolException("Expected HTTP 101 response but was '" + paramResponse.code() + ' ' + paramResponse.message() + '\''); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str1 = Response.header$default(paramResponse, "Connection", null, 2, null);
    try {
      if (!StringsKt.equals("Upgrade", str1, true))
        throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + str1 + '\''); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str2 = Response.header$default(paramResponse, "Upgrade", null, 2, null);
    try {
      if (!StringsKt.equals("websocket", str2, true))
        throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + str2 + '\''); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str3 = Response.header$default(paramResponse, "Sec-WebSocket-Accept", null, 2, null);
    String str4 = ByteString.Companion.encodeUtf8(Intrinsics.stringPlus(this.key, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).sha1().base64();
    try {
      if (!Intrinsics.areEqual(str4, str3))
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + str4 + "' but was '" + str3 + '\''); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramExchange == null)
        throw new ProtocolException("Web Socket exchange missing: bad interceptor?"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public synchronized void onReadPong(@NotNull ByteString paramByteString) {
    long l = a ^ 0x6FDC5CA27447L;
    Intrinsics.checkNotNullParameter(paramByteString, "payload");
    int i = this.receivedPongCount;
    this.receivedPongCount = i + 1;
    this.awaitingPong = false;
  }
  
  public final synchronized boolean pong(@NotNull ByteString paramByteString) {
    long l = a ^ 0x5F91D81A15ADL;
    try {
      Intrinsics.checkNotNullParameter(paramByteString, "payload");
      if (!this.failed) {
        try {
          if (this.enqueuedClose)
            try {
              if (this.messageAndCloseQueue.isEmpty())
                return false; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.pongQueue.add(paramByteString);
    runWriter();
    return true;
  }
  
  public final void connect(@NotNull OkHttpClient paramOkHttpClient) {
    long l = a ^ 0x7AB31D1ED265L;
    try {
      Intrinsics.checkNotNullParameter(paramOkHttpClient, "client");
      if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
        failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    OkHttpClient okHttpClient = paramOkHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
    Request request = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
    this.call = (Call)new RealCall(okHttpClient, request, true);
    Intrinsics.checkNotNull(this.call);
    this.call.enqueue(new RealWebSocket$connect$1(this, request));
  }
  
  public final void awaitTermination(long paramLong, @NotNull TimeUnit paramTimeUnit) throws InterruptedException {
    long l = a ^ 0x1764761C611CL;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "timeUnit");
    this.taskQueue.idleLatch().await(paramLong, paramTimeUnit);
  }
  
  public final boolean writeOneFrame$okhttp() throws IOException {
    long l = a ^ 0x73FE07D539B3L;
    WebSocketWriter webSocketWriter1 = null;
    ByteString byteString = null;
    RealWebSocket$Close realWebSocket$Close = null;
    int i = 0;
    i = -1;
    String str = null;
    RealWebSocket$Streams realWebSocket$Streams = null;
    WebSocketReader webSocketReader = null;
    WebSocketWriter webSocketWriter2 = null;
    synchronized (this) {
      boolean bool = false;
      if (this.failed)
        return false; 
      webSocketWriter1 = this.writer;
      byteString = (ByteString)this.pongQueue.poll();
      if (byteString == null) {
        realWebSocket$Close = (RealWebSocket$Close)this.messageAndCloseQueue.poll();
        if (realWebSocket$Close instanceof RealWebSocket$Close) {
          i = this.receivedCloseCode;
          str = this.receivedCloseReason;
          if (i != -1) {
            realWebSocket$Streams = this.streams;
            this.streams = null;
            webSocketReader = this.reader;
            this.reader = null;
            webSocketWriter2 = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
          } else {
            RealWebSocket$Close realWebSocket$Close1 = realWebSocket$Close;
            long l1 = ((RealWebSocket$Close)realWebSocket$Close1).getCancelAfterCloseMillis();
            TaskQueue taskQueue = this.taskQueue;
            String str1 = Intrinsics.stringPlus(this.name, " cancel");
            long l2 = TimeUnit.MILLISECONDS.toNanos(l1);
            boolean bool1 = true;
            boolean bool2 = false;
            taskQueue.schedule(new RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1(str1, bool1, this), l2);
          } 
        } else if (realWebSocket$Close == null) {
          return false;
        } 
      } 
      Unit unit = Unit.INSTANCE;
    } 
    try {
      try {
        if (byteString != null) {
          Intrinsics.checkNotNull(webSocketWriter1);
          webSocketWriter1.writePong(byteString);
        } else if (realWebSocket$Close instanceof RealWebSocket$Message) {
          RealWebSocket$Close realWebSocket$Close1 = realWebSocket$Close;
          RealWebSocket$Message realWebSocket$Message = (RealWebSocket$Message)realWebSocket$Close1;
          Intrinsics.checkNotNull(webSocketWriter1);
          webSocketWriter1.writeMessageFrame(realWebSocket$Message.getFormatOpcode(), realWebSocket$Message.getData());
          synchronized (this) {
            boolean bool = false;
            this.queueSize -= realWebSocket$Message.getData().size();
            Unit unit = Unit.INSTANCE;
          } 
        } else if (realWebSocket$Close instanceof RealWebSocket$Close) {
          RealWebSocket$Close realWebSocket$Close2 = realWebSocket$Close;
          RealWebSocket$Close realWebSocket$Close1 = realWebSocket$Close2;
          try {
            Intrinsics.checkNotNull(webSocketWriter1);
            webSocketWriter1.writeClose(realWebSocket$Close1.getCode(), realWebSocket$Close1.getReason());
            if (realWebSocket$Streams != null) {
              Intrinsics.checkNotNull(str);
              this.listener.onClosed(this, i, str);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } else {
          throw new AssertionError();
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return true;
    } finally {
      try {
        if (realWebSocket$Streams == null) {
        
        } else {
          Util.closeQuietly(realWebSocket$Streams);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (webSocketReader == null) {
        
        } else {
          Util.closeQuietly(webSocketReader);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (webSocketWriter2 == null) {
        
        } else {
          Util.closeQuietly(webSocketWriter2);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  public boolean send(@NotNull ByteString paramByteString) {
    long l = a ^ 0x1D944CF514C2L;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    return send(paramByteString, 2);
  }
  
  public final synchronized int receivedPongCount() {
    return this.receivedPongCount;
  }
  
  public final synchronized boolean close(int paramInt, @Nullable String paramString, long paramLong) {
    long l = a ^ 0x230A8944EDF3L;
    WebSocketProtocol.INSTANCE.validateCloseCode(paramInt);
    ByteString byteString = null;
    if (paramString != null) {
      byteString = ByteString.Companion.encodeUtf8(paramString);
      try {
        if (!((byteString.size() <= 123L) ? 1 : 0)) {
          boolean bool = false;
          String str = Intrinsics.stringPlus("reason.size() > 123: ", paramString);
          throw new IllegalArgumentException(str.toString());
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    try {
      if (!this.failed)
        try {
          if (!this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new RealWebSocket$Close(paramInt, byteString, paramLong));
            runWriter();
            return true;
          } 
          return false;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public synchronized long queueSize() {
    return this.queueSize;
  }
  
  @NotNull
  public final WebSocketListener getListener$okhttp() {
    return this.listener;
  }
  
  static {
    Companion = new RealWebSocket$Companion(null);
    ONLY_HTTP1 = CollectionsKt.listOf(Protocol.HTTP_1_1);
  }
  
  public void onReadClose(int paramInt, @NotNull String paramString) {
    long l = a ^ 0x284E2C3EEC24L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "reason");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!((paramInt != -1) ? 1 : 0)) {
      String str = "Failed requirement.";
      throw new IllegalArgumentException(str.toString());
    } 
    RealWebSocket$Streams realWebSocket$Streams = null;
    WebSocketReader webSocketReader = null;
    WebSocketWriter webSocketWriter = null;
    synchronized (this) {
      boolean bool = false;
      try {
        if (!((this.receivedCloseCode == -1) ? 1 : 0)) {
          boolean bool1 = false;
          String str = "already closed";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        this.receivedCloseCode = paramInt;
        this.receivedCloseReason = paramString;
        if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
          realWebSocket$Streams = this.streams;
          this.streams = null;
          webSocketReader = this.reader;
          this.reader = null;
          webSocketWriter = this.writer;
          this.writer = null;
          this.taskQueue.shutdown();
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
    try {
      this.listener.onClosing(this, paramInt, paramString);
      if (realWebSocket$Streams != null)
        this.listener.onClosed(this, paramInt, paramString); 
    } finally {
      try {
        if (realWebSocket$Streams == null) {
        
        } else {
          Util.closeQuietly(realWebSocket$Streams);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (webSocketReader == null) {
        
        } else {
          Util.closeQuietly(webSocketReader);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (webSocketWriter == null) {
        
        } else {
          Util.closeQuietly(webSocketWriter);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public final boolean processNextFrame() throws IOException {
    boolean bool;
    try {
      try {
        Intrinsics.checkNotNull(this.reader);
        this.reader.processNextFrame();
      } catch (Exception exception) {
        throw a(null);
      } 
      bool = (this.receivedCloseCode == -1) ? true : false;
    } catch (Exception exception) {
      failWebSocket(exception, null);
      bool = false;
    } 
    return bool;
  }
  
  public final void loopReader() throws IOException {
    try {
      while (this.receivedCloseCode == -1) {
        Intrinsics.checkNotNull(this.reader);
        this.reader.processNextFrame();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public final void tearDown() throws InterruptedException {
    this.taskQueue.shutdown();
    this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
  }
  
  public synchronized void onReadPing(@NotNull ByteString paramByteString) {
    long l = a ^ 0x212280C9A0C2L;
    try {
      Intrinsics.checkNotNullParameter(paramByteString, "payload");
      if (!this.failed) {
        try {
          if (this.enqueuedClose)
            try {
              if (this.messageAndCloseQueue.isEmpty())
                return; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.pongQueue.add(paramByteString);
    runWriter();
    int i = this.receivedPingCount;
    this.receivedPingCount = i + 1;
  }
  
  public final synchronized int sentPingCount() {
    return this.sentPingCount;
  }
  
  public final void failWebSocket(@NotNull Exception paramException, @Nullable Response paramResponse) {
    Intrinsics.checkNotNullParameter(paramException, "e");
    RealWebSocket$Streams realWebSocket$Streams = null;
    WebSocketReader webSocketReader = null;
    WebSocketWriter webSocketWriter = null;
    synchronized (this) {
      boolean bool = false;
      if (this.failed)
        return; 
      this.failed = true;
      realWebSocket$Streams = this.streams;
      this.streams = null;
      webSocketReader = this.reader;
      this.reader = null;
      webSocketWriter = this.writer;
      this.writer = null;
      this.taskQueue.shutdown();
      Unit unit = Unit.INSTANCE;
    } 
    try {
      this.listener.onFailure(this, paramException, paramResponse);
    } finally {
      try {
        if (realWebSocket$Streams == null) {
        
        } else {
          Util.closeQuietly(realWebSocket$Streams);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (webSocketReader == null) {
        
        } else {
          Util.closeQuietly(webSocketReader);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (webSocketWriter == null) {
        
        } else {
          Util.closeQuietly(webSocketWriter);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public RealWebSocket(@NotNull TaskRunner paramTaskRunner, @NotNull Request paramRequest, @NotNull WebSocketListener paramWebSocketListener, @NotNull Random paramRandom, long paramLong1, @Nullable WebSocketExtensions paramWebSocketExtensions, long paramLong2) {
    this.originalRequest = paramRequest;
    this.listener = paramWebSocketListener;
    this.random = paramRandom;
    this.pingIntervalMillis = paramLong1;
    this.extensions = paramWebSocketExtensions;
    this.minimumDeflateSize = paramLong2;
    this.taskQueue = paramTaskRunner.newQueue();
    this.pongQueue = new ArrayDeque();
    this.messageAndCloseQueue = new ArrayDeque();
    this.receivedCloseCode = -1;
    if (!Intrinsics.areEqual("GET", this.originalRequest.method())) {
      boolean bool1 = false;
      String str = Intrinsics.stringPlus("Request must be GET: ", this.originalRequest.method());
      throw new IllegalArgumentException(str.toString());
    } 
    byte[] arrayOfByte1 = new byte[16];
    byte[] arrayOfByte2 = arrayOfByte1;
    ByteString.Companion companion = ByteString.Companion;
    RealWebSocket realWebSocket = this;
    boolean bool = false;
    this.random.nextBytes(arrayOfByte2);
    Unit unit = Unit.INSTANCE;
    realWebSocket.key = ByteString.Companion.of$default(companion, arrayOfByte1, 0, 0, 3, null).base64();
  }
  
  @NotNull
  public Request request() {
    return this.originalRequest;
  }
  
  public void onReadMessage(@NotNull String paramString) throws IOException {
    long l = a ^ 0x7E3C4F53AEBCL;
    Intrinsics.checkNotNullParameter(paramString, "text");
    this.listener.onMessage(this, paramString);
  }
  
  public boolean close(int paramInt, @Nullable String paramString) {
    return close(paramInt, paramString, 60000L);
  }
  
  public boolean send(@NotNull String paramString) {
    long l = a ^ 0x6839EE7B455L;
    Intrinsics.checkNotNullParameter(paramString, "text");
    return send(ByteString.Companion.encodeUtf8(paramString), 1);
  }
  
  public final void writePingFrame$okhttp() {
    long l = a ^ 0x34F53FEE1E2BL;
    WebSocketWriter webSocketWriter = null;
    byte b = 0;
    synchronized (this) {
      boolean bool = false;
      if (this.failed)
        return; 
      if (this.writer == null)
        return; 
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      b = this.awaitingPong ? this.sentPingCount : -1;
      int i = this.sentPingCount;
      this.sentPingCount = i + 1;
      this.awaitingPong = true;
      Unit unit = Unit.INSTANCE;
    } 
    try {
      if (b != -1) {
        failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (b - 1) + " successful ping/pongs)"), null);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      webSocketWriter.writePing(ByteString.EMPTY);
    } catch (IOException iOException) {
      failWebSocket(iOException, null);
    } 
  }
  
  public void onReadMessage(@NotNull ByteString paramByteString) throws IOException {
    long l = a ^ 0x4D415BA4FA58L;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    this.listener.onMessage(this, paramByteString);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */