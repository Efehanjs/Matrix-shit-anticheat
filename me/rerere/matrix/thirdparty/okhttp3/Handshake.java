package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSession;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.kotlin.LazyKt;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Handshake {
  @NotNull
  private final CipherSuite cipherSuite;
  
  @NotNull
  private final Lazy peerCertificates$delegate;
  
  @NotNull
  private final List localCertificates;
  
  @NotNull
  private final TlsVersion tlsVersion;
  
  @NotNull
  public static final Handshake$Companion Companion;
  
  private static final long a = o3.a(5228853238144403828L, 3142133129241183031L, MethodHandles.lookup().lookupClass()).a(48064354343598L);
  
  @NotNull
  public static final Handshake get(@NotNull SSLSession paramSSLSession) throws IOException {
    return Companion.get(paramSSLSession);
  }
  
  @NotNull
  public final CipherSuite cipherSuite() {
    return this.cipherSuite;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "peerPrincipal", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Principal -deprecated_peerPrincipal() {
    return peerPrincipal();
  }
  
  @Nullable
  public final Principal localPrincipal() {
    Object object = CollectionsKt.firstOrNull(this.localCertificates);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      (object instanceof X509Certificate) ? object : null;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (((object instanceof X509Certificate) ? object : null) == null) ? null : ((object instanceof X509Certificate) ? object : null).getSubjectX500Principal();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "localPrincipal", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Principal -deprecated_localPrincipal() {
    return localPrincipal();
  }
  
  static {
    Companion = new Handshake$Companion(null);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "localCertificates", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_localCertificates() {
    return this.localCertificates;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuite", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final CipherSuite -deprecated_cipherSuite() {
    return this.cipherSuite;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x28F1E4281AB2L;
    List list1 = peerCertificates();
    boolean bool1 = false;
    List list2 = list1;
    ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
    boolean bool2 = false;
    for (Certificate certificate1 : list2) {
      Certificate certificate2 = certificate1;
      ArrayList<String> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(getName(certificate2));
    } 
    String str = arrayList.toString();
    list1 = this.localCertificates;
    StringBuilder stringBuilder = (new StringBuilder()).append("Handshake{tlsVersion=").append(this.tlsVersion).append(" cipherSuite=").append(this.cipherSuite).append(" peerCertificates=").append(str).append(" localCertificates=");
    bool1 = false;
    list2 = list1;
    arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list1, 10));
    bool2 = false;
    for (Certificate certificate1 : list2) {
      Certificate certificate2 = certificate1;
      ArrayList<String> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(getName(certificate2));
    } 
    return stringBuilder.append(arrayList).append('}').toString();
  }
  
  @NotNull
  public final List localCertificates() {
    return this.localCertificates;
  }
  
  @NotNull
  public final TlsVersion tlsVersion() {
    return this.tlsVersion;
  }
  
  public int hashCode() {
    null = 17;
    null = 31 * null + this.tlsVersion.hashCode();
    null = 31 * null + this.cipherSuite.hashCode();
    null = 31 * null + peerCertificates().hashCode();
    return 31 * null + this.localCertificates.hashCode();
  }
  
  public Handshake(@NotNull TlsVersion paramTlsVersion, @NotNull CipherSuite paramCipherSuite, @NotNull List paramList, @NotNull Function0 paramFunction0) {
    this.tlsVersion = paramTlsVersion;
    this.cipherSuite = paramCipherSuite;
    this.localCertificates = paramList;
    this.peerCertificates$delegate = LazyKt.lazy(new Handshake$peerCertificates$2(paramFunction0));
  }
  
  @NotNull
  public static final Handshake get(@NotNull TlsVersion paramTlsVersion, @NotNull CipherSuite paramCipherSuite, @NotNull List paramList1, @NotNull List paramList2) {
    return Companion.get(paramTlsVersion, paramCipherSuite, paramList1, paramList2);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersion", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final TlsVersion -deprecated_tlsVersion() {
    return this.tlsVersion;
  }
  
  @NotNull
  public final List peerCertificates() {
    Lazy lazy = this.peerCertificates$delegate;
    return (List)lazy.getValue();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "peerCertificates", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_peerCertificates() {
    return peerCertificates();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Handshake)
        try {
          if (((Handshake)paramObject).tlsVersion == this.tlsVersion)
            try {
              if (Intrinsics.areEqual(((Handshake)paramObject).cipherSuite, this.cipherSuite))
                try {
                  if (Intrinsics.areEqual(((Handshake)paramObject).peerCertificates(), peerCertificates()))
                    try {
                      if (Intrinsics.areEqual(((Handshake)paramObject).localCertificates, this.localCertificates));
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
  
  @Nullable
  public final Principal peerPrincipal() {
    Object object = CollectionsKt.firstOrNull(peerCertificates());
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      (object instanceof X509Certificate) ? object : null;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (((object instanceof X509Certificate) ? object : null) == null) ? null : ((object instanceof X509Certificate) ? object : null).getSubjectX500Principal();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Handshake.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */