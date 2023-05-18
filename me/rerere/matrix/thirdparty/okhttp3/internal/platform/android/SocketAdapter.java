package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface SocketAdapter {
  boolean matchesSocket(@NotNull SSLSocket paramSSLSocket);
  
  @Nullable
  String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket);
  
  boolean isSupported();
  
  boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory);
  
  @Nullable
  X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory);
  
  void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\SocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */