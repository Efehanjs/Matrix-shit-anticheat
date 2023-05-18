package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Address {
  @NotNull
  private final Authenticator proxyAuthenticator;
  
  @Nullable
  private final CertificatePinner certificatePinner;
  
  @NotNull
  private final List protocols;
  
  @NotNull
  private final List connectionSpecs;
  
  @NotNull
  private final SocketFactory socketFactory;
  
  @Nullable
  private final Proxy proxy;
  
  @Nullable
  private final SSLSocketFactory sslSocketFactory;
  
  @NotNull
  private final ProxySelector proxySelector;
  
  @NotNull
  private final Dns dns;
  
  @NotNull
  private final HttpUrl url;
  
  @Nullable
  private final HostnameVerifier hostnameVerifier;
  
  private static final long a = o3.a(-5645092344673768150L, 8467688974126365501L, MethodHandles.lookup().lookupClass()).a(141512709019917L);
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final SocketFactory -deprecated_socketFactory() {
    return this.socketFactory;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final HostnameVerifier -deprecated_hostnameVerifier() {
    return this.hostnameVerifier;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Proxy -deprecated_proxy() {
    return this.proxy;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final SSLSocketFactory -deprecated_sslSocketFactory() {
    return this.sslSocketFactory;
  }
  
  @Nullable
  public final CertificatePinner certificatePinner() {
    return this.certificatePinner;
  }
  
  public Address(@NotNull String paramString, int paramInt, @NotNull Dns paramDns, @NotNull SocketFactory paramSocketFactory, @Nullable SSLSocketFactory paramSSLSocketFactory, @Nullable HostnameVerifier paramHostnameVerifier, @Nullable CertificatePinner paramCertificatePinner, @NotNull Authenticator paramAuthenticator, @Nullable Proxy paramProxy, @NotNull List paramList1, @NotNull List paramList2, @NotNull ProxySelector paramProxySelector) {
    this.dns = paramDns;
    this.socketFactory = paramSocketFactory;
    this.sslSocketFactory = paramSSLSocketFactory;
    this.hostnameVerifier = paramHostnameVerifier;
    this.certificatePinner = paramCertificatePinner;
    this.proxyAuthenticator = paramAuthenticator;
    this.proxy = paramProxy;
    this.proxySelector = paramProxySelector;
    this.url = (new HttpUrl$Builder()).scheme((this.sslSocketFactory != null) ? "https" : "http").host(paramString).port(paramInt).build();
    this.protocols = Util.toImmutableList(paramList1);
    this.connectionSpecs = Util.toImmutableList(paramList2);
  }
  
  @NotNull
  public final ProxySelector proxySelector() {
    return this.proxySelector;
  }
  
  @Nullable
  public final Proxy proxy() {
    return this.proxy;
  }
  
  @NotNull
  public final List connectionSpecs() {
    return this.connectionSpecs;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Authenticator -deprecated_proxyAuthenticator() {
    return this.proxyAuthenticator;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_protocols() {
    return this.protocols;
  }
  
  @NotNull
  public final Dns dns() {
    return this.dns;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final HttpUrl -deprecated_url() {
    return this.url;
  }
  
  public int hashCode() {
    null = 17;
    null = 31 * null + this.url.hashCode();
    null = 31 * null + this.dns.hashCode();
    null = 31 * null + this.proxyAuthenticator.hashCode();
    null = 31 * null + this.protocols.hashCode();
    null = 31 * null + this.connectionSpecs.hashCode();
    null = 31 * null + this.proxySelector.hashCode();
    null = 31 * null + Objects.hashCode(this.proxy);
    null = 31 * null + Objects.hashCode(this.sslSocketFactory);
    null = 31 * null + Objects.hashCode(this.hostnameVerifier);
    return 31 * null + Objects.hashCode(this.certificatePinner);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ProxySelector -deprecated_proxySelector() {
    return this.proxySelector;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Address)
        try {
          if (Intrinsics.areEqual(this.url, ((Address)paramObject).url))
            try {
              if (equalsNonHost$okhttp((Address)paramObject));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x6F55E9529F03L;
    return "Address{" + this.url.host() + ':' + this.url.port() + ", " + ((this.proxy != null) ? Intrinsics.stringPlus("proxy=", this.proxy) : Intrinsics.stringPlus("proxySelector=", this.proxySelector)) + '}';
  }
  
  public final boolean equalsNonHost$okhttp(@NotNull Address paramAddress) {
    long l = a ^ 0x275F8ED20570L;
    try {
      Intrinsics.checkNotNullParameter(paramAddress, "that");
      if (Intrinsics.areEqual(this.dns, paramAddress.dns))
        try {
          if (Intrinsics.areEqual(this.proxyAuthenticator, paramAddress.proxyAuthenticator))
            try {
              if (Intrinsics.areEqual(this.protocols, paramAddress.protocols))
                try {
                  if (Intrinsics.areEqual(this.connectionSpecs, paramAddress.connectionSpecs))
                    try {
                      if (Intrinsics.areEqual(this.proxySelector, paramAddress.proxySelector))
                        try {
                          if (Intrinsics.areEqual(this.proxy, paramAddress.proxy))
                            try {
                              if (Intrinsics.areEqual(this.sslSocketFactory, paramAddress.sslSocketFactory))
                                try {
                                  if (Intrinsics.areEqual(this.hostnameVerifier, paramAddress.hostnameVerifier))
                                    try {
                                      if (Intrinsics.areEqual(this.certificatePinner, paramAddress.certificatePinner))
                                        try {
                                          if (this.url.port() == paramAddress.url.port());
                                        } catch (RuntimeException runtimeException) {
                                          throw a(null);
                                        }  
                                    } catch (RuntimeException runtimeException) {
                                      throw a(null);
                                    }  
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                }  
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public final List protocols() {
    return this.protocols;
  }
  
  @Nullable
  public final HostnameVerifier hostnameVerifier() {
    return this.hostnameVerifier;
  }
  
  @NotNull
  public final Authenticator proxyAuthenticator() {
    return this.proxyAuthenticator;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Dns -deprecated_dns() {
    return this.dns;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_connectionSpecs() {
    return this.connectionSpecs;
  }
  
  @Nullable
  public final SSLSocketFactory sslSocketFactory() {
    return this.sslSocketFactory;
  }
  
  @NotNull
  public final SocketFactory socketFactory() {
    return this.socketFactory;
  }
  
  @NotNull
  public final HttpUrl url() {
    return this.url;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final CertificatePinner -deprecated_certificatePinner() {
    return this.certificatePinner;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Address.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */