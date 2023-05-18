package me.rerere.matrix.thirdparty.okhttp3.internal.proxy;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class NullProxySelector extends ProxySelector {
  @NotNull
  public static final NullProxySelector INSTANCE;
  
  private static final long a = o3.a(-5711926645162325938L, 5012003988326430653L, MethodHandles.lookup().lookupClass()).a(155393636665919L);
  
  @NotNull
  public List select(@Nullable URI paramURI) {
    long l = a ^ 0x10B313060469L;
    if (paramURI == null) {
      boolean bool = false;
      String str = "uri must not be null";
      throw new IllegalArgumentException(str.toString());
    } 
    return CollectionsKt.listOf(Proxy.NO_PROXY);
  }
  
  public void connectFailed(@Nullable URI paramURI, @Nullable SocketAddress paramSocketAddress, @Nullable IOException paramIOException) {}
  
  static {
    INSTANCE = new NullProxySelector();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\proxy\NullProxySelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */