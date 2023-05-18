package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class EventListener {
  @NotNull
  public static final EventListener$Companion Companion;
  
  @JvmField
  @NotNull
  public static final EventListener NONE;
  
  private static final long a = o3.a(-1826957105846759748L, 197804847071520812L, MethodHandles.lookup().lookupClass()).a(25077696977616L);
  
  public void requestFailed(@NotNull Call paramCall, @NotNull IOException paramIOException) {
    long l = a ^ 0x3B9285AF4154L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramIOException, "ioe");
  }
  
  public void dnsStart(@NotNull Call paramCall, @NotNull String paramString) {
    long l = a ^ 0x79A6401713B3L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramString, "domainName");
  }
  
  public void responseFailed(@NotNull Call paramCall, @NotNull IOException paramIOException) {
    long l = a ^ 0x6AACB4894ECFL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramIOException, "ioe");
  }
  
  static {
    Companion = new EventListener$Companion(null);
    NONE = new EventListener$Companion$NONE$1();
  }
  
  public void connectionReleased(@NotNull Call paramCall, @NotNull Connection paramConnection) {
    long l = a ^ 0x75B231F60DF0L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramConnection, "connection");
  }
  
  public void secureConnectEnd(@NotNull Call paramCall, @Nullable Handshake paramHandshake) {
    long l = a ^ 0x6FCB8BC310DBL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void cacheConditionalHit(@NotNull Call paramCall, @NotNull Response paramResponse) {
    long l = a ^ 0x6409B23B6B80L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramResponse, "cachedResponse");
  }
  
  public void requestHeadersEnd(@NotNull Call paramCall, @NotNull Request paramRequest) {
    long l = a ^ 0x720D9DF156FEL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramRequest, "request");
  }
  
  public void callEnd(@NotNull Call paramCall) {
    long l = a ^ 0x20D15054ECDAL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void proxySelectStart(@NotNull Call paramCall, @NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x586C30B5DAB9L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
  }
  
  public void proxySelectEnd(@NotNull Call paramCall, @NotNull HttpUrl paramHttpUrl, @NotNull List paramList) {
    long l = a ^ 0x785A058A129FL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    Intrinsics.checkNotNullParameter(paramList, "proxies");
  }
  
  public void dnsEnd(@NotNull Call paramCall, @NotNull String paramString, @NotNull List paramList) {
    long l = a ^ 0x3E07E1D71CDBL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramString, "domainName");
    Intrinsics.checkNotNullParameter(paramList, "inetAddressList");
  }
  
  public void cacheMiss(@NotNull Call paramCall) {
    long l = a ^ 0x4FF0EDB70EA7L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void requestBodyEnd(@NotNull Call paramCall, long paramLong) {
    long l = a ^ 0x4D803DA7BC3L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void canceled(@NotNull Call paramCall) {
    long l = a ^ 0x41B77CFE3FDL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void callStart(@NotNull Call paramCall) {
    long l = a ^ 0x3C5D8ECD83D6L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void responseBodyStart(@NotNull Call paramCall) {
    long l = a ^ 0x4EDB0281F3A0L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void cacheHit(@NotNull Call paramCall, @NotNull Response paramResponse) {
    long l = a ^ 0x980914B432FL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramResponse, "response");
  }
  
  public void callFailed(@NotNull Call paramCall, @NotNull IOException paramIOException) {
    long l = a ^ 0x603E81C1E47DL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramIOException, "ioe");
  }
  
  public void responseHeadersStart(@NotNull Call paramCall) {
    long l = a ^ 0x7890C5543057L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void responseBodyEnd(@NotNull Call paramCall, long paramLong) {
    long l = a ^ 0x7EC080FBDFCEL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void requestHeadersStart(@NotNull Call paramCall) {
    long l = a ^ 0x2762B07850AEL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void responseHeadersEnd(@NotNull Call paramCall, @NotNull Response paramResponse) {
    long l = a ^ 0x6AAB79FB6795L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramResponse, "response");
  }
  
  public void connectionAcquired(@NotNull Call paramCall, @NotNull Connection paramConnection) {
    long l = a ^ 0x5BEE61D7339CL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramConnection, "connection");
  }
  
  public void connectFailed(@NotNull Call paramCall, @NotNull InetSocketAddress paramInetSocketAddress, @NotNull Proxy paramProxy, @Nullable Protocol paramProtocol, @NotNull IOException paramIOException) {
    long l = a ^ 0x2382525611E9L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramInetSocketAddress, "inetSocketAddress");
    Intrinsics.checkNotNullParameter(paramProxy, "proxy");
    Intrinsics.checkNotNullParameter(paramIOException, "ioe");
  }
  
  public void connectStart(@NotNull Call paramCall, @NotNull InetSocketAddress paramInetSocketAddress, @NotNull Proxy paramProxy) {
    long l = a ^ 0x33595010517EL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramInetSocketAddress, "inetSocketAddress");
    Intrinsics.checkNotNullParameter(paramProxy, "proxy");
  }
  
  public void connectEnd(@NotNull Call paramCall, @NotNull InetSocketAddress paramInetSocketAddress, @NotNull Proxy paramProxy, @Nullable Protocol paramProtocol) {
    long l = a ^ 0x4D90AE773AA9L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramInetSocketAddress, "inetSocketAddress");
    Intrinsics.checkNotNullParameter(paramProxy, "proxy");
  }
  
  public void requestBodyStart(@NotNull Call paramCall) {
    long l = a ^ 0x21DBC71EDB7DL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void secureConnectStart(@NotNull Call paramCall) {
    long l = a ^ 0x567EA69233DFL;
    Intrinsics.checkNotNullParameter(paramCall, "call");
  }
  
  public void satisfactionFailure(@NotNull Call paramCall, @NotNull Response paramResponse) {
    long l = a ^ 0x17C2955DDBB1L;
    Intrinsics.checkNotNullParameter(paramCall, "call");
    Intrinsics.checkNotNullParameter(paramResponse, "response");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\EventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */