package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface DeferredSocketAdapter$Factory {
  @NotNull
  SocketAdapter create(@NotNull SSLSocket paramSSLSocket);
  
  boolean matchesSocket(@NotNull SSLSocket paramSSLSocket);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\DeferredSocketAdapter$Factory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */