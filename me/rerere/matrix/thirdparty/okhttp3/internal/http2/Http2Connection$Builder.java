package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2Connection$Builder {
  private int pingIntervalMillis;
  
  public Socket socket;
  
  @NotNull
  private final TaskRunner taskRunner;
  
  public BufferedSource source;
  
  @NotNull
  private PushObserver pushObserver;
  
  public String connectionName;
  
  private boolean client;
  
  @NotNull
  private Http2Connection$Listener listener;
  
  public BufferedSink sink;
  
  private static final long a = o3.a(6717157339868361199L, -1895841252800094116L, MethodHandles.lookup().lookupClass()).a(99199965885763L);
  
  public final int getPingIntervalMillis$okhttp() {
    return this.pingIntervalMillis;
  }
  
  @JvmOverloads
  @NotNull
  public final Http2Connection$Builder socket(@NotNull Socket paramSocket, @NotNull String paramString, @NotNull BufferedSource paramBufferedSource) throws IOException {
    long l = a ^ 0x1C4331CC0DABL;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    Intrinsics.checkNotNullParameter(paramString, "peerName");
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    return socket$default(this, paramSocket, paramString, paramBufferedSource, null, 8, null);
  }
  
  public final void setSocket$okhttp(@NotNull Socket paramSocket) {
    long l = a ^ 0x79A090048185L;
    Intrinsics.checkNotNullParameter(paramSocket, "<set-?>");
    this.socket = paramSocket;
  }
  
  @NotNull
  public final Http2Connection$Builder pingIntervalMillis(int paramInt) {
    Http2Connection$Builder http2Connection$Builder1 = this;
    Http2Connection$Builder http2Connection$Builder2 = http2Connection$Builder1;
    boolean bool = false;
    http2Connection$Builder2.setPingIntervalMillis$okhttp(paramInt);
    return http2Connection$Builder1;
  }
  
  @NotNull
  public final Http2Connection$Builder pushObserver(@NotNull PushObserver paramPushObserver) {
    long l = a ^ 0x4EFA0B839FE9L;
    Intrinsics.checkNotNullParameter(paramPushObserver, "pushObserver");
    Http2Connection$Builder http2Connection$Builder1 = this;
    Http2Connection$Builder http2Connection$Builder2 = http2Connection$Builder1;
    boolean bool = false;
    http2Connection$Builder2.setPushObserver$okhttp(paramPushObserver);
    return http2Connection$Builder1;
  }
  
  @NotNull
  public final BufferedSource getSource$okhttp() {
    long l = a ^ 0xFC8953EA4F1L;
    BufferedSource bufferedSource = this.source;
    try {
      if (bufferedSource != null)
        return bufferedSource; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.throwUninitializedPropertyAccessException("source");
    return null;
  }
  
  public final void setSource$okhttp(@NotNull BufferedSource paramBufferedSource) {
    long l = a ^ 0x33E9766BAD06L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<set-?>");
    this.source = paramBufferedSource;
  }
  
  @JvmOverloads
  @NotNull
  public final Http2Connection$Builder socket(@NotNull Socket paramSocket, @NotNull String paramString, @NotNull BufferedSource paramBufferedSource, @NotNull BufferedSink paramBufferedSink) throws IOException {
    long l = a ^ 0x7DE283395B8FL;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    Intrinsics.checkNotNullParameter(paramString, "peerName");
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    Intrinsics.checkNotNullParameter(paramBufferedSink, "sink");
    Http2Connection$Builder http2Connection$Builder1 = this;
    Http2Connection$Builder http2Connection$Builder2 = http2Connection$Builder1;
    boolean bool = false;
    try {
      http2Connection$Builder2.setSocket$okhttp(paramSocket);
    } catch (IOException iOException) {
      throw a(null);
    } 
    http2Connection$Builder2.setConnectionName$okhttp(http2Connection$Builder2.getClient$okhttp() ? (Util.okHttpName + ' ' + paramString) : Intrinsics.stringPlus("MockWebServer ", paramString));
    http2Connection$Builder2.setSource$okhttp(paramBufferedSource);
    http2Connection$Builder2.setSink$okhttp(paramBufferedSink);
    return http2Connection$Builder1;
  }
  
  @NotNull
  public final BufferedSink getSink$okhttp() {
    long l = a ^ 0x1EFB3FD49AE8L;
    BufferedSink bufferedSink = this.sink;
    try {
      if (bufferedSink != null)
        return bufferedSink; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.throwUninitializedPropertyAccessException("sink");
    return null;
  }
  
  @NotNull
  public final TaskRunner getTaskRunner$okhttp() {
    return this.taskRunner;
  }
  
  public final void setClient$okhttp(boolean paramBoolean) {
    this.client = paramBoolean;
  }
  
  public Http2Connection$Builder(boolean paramBoolean, @NotNull TaskRunner paramTaskRunner) {
    this.client = paramBoolean;
    this.taskRunner = paramTaskRunner;
    this.listener = Http2Connection$Listener.REFUSE_INCOMING_STREAMS;
    this.pushObserver = PushObserver.CANCEL;
  }
  
  public final void setConnectionName$okhttp(@NotNull String paramString) {
    long l = a ^ 0x674DDAE30F82L;
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    this.connectionName = paramString;
  }
  
  @JvmOverloads
  @NotNull
  public final Http2Connection$Builder socket(@NotNull Socket paramSocket, @NotNull String paramString) throws IOException {
    long l = a ^ 0x7A2F8ED9A77FL;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    Intrinsics.checkNotNullParameter(paramString, "peerName");
    return socket$default(this, paramSocket, paramString, null, null, 12, null);
  }
  
  public final boolean getClient$okhttp() {
    return this.client;
  }
  
  public final void setPingIntervalMillis$okhttp(int paramInt) {
    this.pingIntervalMillis = paramInt;
  }
  
  @NotNull
  public final PushObserver getPushObserver$okhttp() {
    return this.pushObserver;
  }
  
  public final void setListener$okhttp(@NotNull Http2Connection$Listener paramHttp2Connection$Listener) {
    long l = a ^ 0x7E29499A6CA0L;
    Intrinsics.checkNotNullParameter(paramHttp2Connection$Listener, "<set-?>");
    this.listener = paramHttp2Connection$Listener;
  }
  
  @NotNull
  public final Socket getSocket$okhttp() {
    long l = a ^ 0x36D7DDDD3DDAL;
    Socket socket = this.socket;
    try {
      if (socket != null)
        return socket; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.throwUninitializedPropertyAccessException("socket");
    return null;
  }
  
  @NotNull
  public final String getConnectionName$okhttp() {
    long l = a ^ 0x329365BCB1D0L;
    String str = this.connectionName;
    try {
      if (str != null)
        return str; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.throwUninitializedPropertyAccessException("connectionName");
    return null;
  }
  
  @JvmOverloads
  @NotNull
  public final Http2Connection$Builder socket(@NotNull Socket paramSocket) throws IOException {
    long l = a ^ 0x5F09F18180B2L;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    return socket$default(this, paramSocket, null, null, null, 14, null);
  }
  
  @NotNull
  public final Http2Connection$Listener getListener$okhttp() {
    return this.listener;
  }
  
  @NotNull
  public final Http2Connection build() {
    return new Http2Connection(this);
  }
  
  public final void setPushObserver$okhttp(@NotNull PushObserver paramPushObserver) {
    long l = a ^ 0x247B69F9A652L;
    Intrinsics.checkNotNullParameter(paramPushObserver, "<set-?>");
    this.pushObserver = paramPushObserver;
  }
  
  public final void setSink$okhttp(@NotNull BufferedSink paramBufferedSink) {
    long l = a ^ 0x357A637F38A2L;
    Intrinsics.checkNotNullParameter(paramBufferedSink, "<set-?>");
    this.sink = paramBufferedSink;
  }
  
  @NotNull
  public final Http2Connection$Builder listener(@NotNull Http2Connection$Listener paramHttp2Connection$Listener) {
    long l = a ^ 0x6BE320C9B0EFL;
    Intrinsics.checkNotNullParameter(paramHttp2Connection$Listener, "listener");
    Http2Connection$Builder http2Connection$Builder1 = this;
    Http2Connection$Builder http2Connection$Builder2 = http2Connection$Builder1;
    boolean bool = false;
    http2Connection$Builder2.setListener$okhttp(paramHttp2Connection$Listener);
    return http2Connection$Builder1;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */