package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ConnectionSpec {
  @JvmField
  @NotNull
  public static final ConnectionSpec MODERN_TLS;
  
  @JvmField
  @NotNull
  public static final ConnectionSpec RESTRICTED_TLS;
  
  @Nullable
  private final String[] cipherSuitesAsString;
  
  @JvmField
  @NotNull
  public static final ConnectionSpec COMPATIBLE_TLS;
  
  private final boolean supportsTlsExtensions;
  
  @NotNull
  private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
  
  @Nullable
  private final String[] tlsVersionsAsString;
  
  private final boolean isTls;
  
  @NotNull
  public static final ConnectionSpec$Companion Companion;
  
  @NotNull
  private static final CipherSuite[] APPROVED_CIPHER_SUITES;
  
  @JvmField
  @NotNull
  public static final ConnectionSpec CLEARTEXT;
  
  private static final long a = o3.a(4762954152043500532L, 8772672912190555875L, MethodHandles.lookup().lookupClass()).a(19456103953728L);
  
  public final boolean isCompatible(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x11C0D5E64B2AL;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "socket");
      if (!this.isTls)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.tlsVersionsAsString != null)
        try {
          if (!Util.hasIntersection(this.tlsVersionsAsString, paramSSLSocket.getEnabledProtocols(), ComparisonsKt.naturalOrder()))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.cipherSuitesAsString != null)
        try {
          if (!Util.hasIntersection(this.cipherSuitesAsString, paramSSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp()))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuites", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final List -deprecated_cipherSuites() {
    return cipherSuites();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersions", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final List -deprecated_tlsVersions() {
    return tlsVersions();
  }
  
  @Nullable
  public final List tlsVersions() {
    try {
      String[] arrayOfString1;
      boolean bool1 = false;
      String[] arrayOfString2 = arrayOfString1;
      ArrayList<TlsVersion> arrayList2 = new ArrayList(arrayOfString1.length);
      boolean bool2 = false;
      byte b = 0;
      int i = arrayOfString2.length;
      while (b < i) {
        String str1 = arrayOfString2[b];
        String str2 = str1;
        ArrayList<TlsVersion> arrayList = arrayList2;
        boolean bool = false;
        arrayList.add(TlsVersion.Companion.forJavaName(str2));
        b++;
      } 
      ArrayList<TlsVersion> arrayList1 = arrayList2;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.tlsVersionsAsString == null) ? null : CollectionsKt.toList(arrayList1);
  }
  
  public final boolean isTls() {
    return this.isTls;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "supportsTlsExtensions", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_supportsTlsExtensions() {
    return this.supportsTlsExtensions;
  }
  
  public int hashCode() {
    int i = 17;
    if (this.isTls) {
      String[] arrayOfString = this.cipherSuitesAsString;
      try {
        int j = Arrays.hashCode((Object[])arrayOfString);
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      i = 31 * i + ((arrayOfString == null) ? 0 : j);
      arrayOfString = this.tlsVersionsAsString;
      try {
        int j = Arrays.hashCode((Object[])arrayOfString);
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      i = 31 * i + ((arrayOfString == null) ? 0 : j);
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      i = 31 * i + (this.supportsTlsExtensions ? 0 : 1);
    } 
    return i;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (!(paramObject instanceof ConnectionSpec))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject == this)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.isTls != ((ConnectionSpec)paramObject).isTls)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.isTls) {
        try {
          if (!Arrays.equals((Object[])this.cipherSuitesAsString, (Object[])((ConnectionSpec)paramObject).cipherSuitesAsString))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (!Arrays.equals((Object[])this.tlsVersionsAsString, (Object[])((ConnectionSpec)paramObject).tlsVersionsAsString))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (this.supportsTlsExtensions != ((ConnectionSpec)paramObject).supportsTlsExtensions)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public final boolean supportsTlsExtensions() {
    return this.supportsTlsExtensions;
  }
  
  public final void apply$okhttp(@NotNull SSLSocket paramSSLSocket, boolean paramBoolean) {
    long l = a ^ 0x74549CEE6CA9L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    ConnectionSpec connectionSpec = supportedSpec(paramSSLSocket, paramBoolean);
    try {
      if (connectionSpec.tlsVersions() != null)
        paramSSLSocket.setEnabledProtocols(connectionSpec.tlsVersionsAsString); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (connectionSpec.cipherSuites() != null)
        paramSSLSocket.setEnabledCipherSuites(connectionSpec.cipherSuitesAsString); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @Nullable
  public final List cipherSuites() {
    try {
      String[] arrayOfString1;
      boolean bool1 = false;
      String[] arrayOfString2 = arrayOfString1;
      ArrayList<CipherSuite> arrayList2 = new ArrayList(arrayOfString1.length);
      boolean bool2 = false;
      byte b = 0;
      int i = arrayOfString2.length;
      while (b < i) {
        String str1 = arrayOfString2[b];
        String str2 = str1;
        ArrayList<CipherSuite> arrayList = arrayList2;
        boolean bool = false;
        arrayList.add(CipherSuite.Companion.forJavaName(str2));
        b++;
      } 
      ArrayList<CipherSuite> arrayList1 = arrayList2;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.cipherSuitesAsString == null) ? null : CollectionsKt.toList(arrayList1);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x7E06DF5DBB9FL;
    try {
      if (!this.isTls)
        return "ConnectionSpec()"; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
  }
  
  static {
    Companion = new ConnectionSpec$Companion(null);
    CipherSuite[] arrayOfCipherSuite3 = new CipherSuite[9];
    arrayOfCipherSuite3[0] = CipherSuite.TLS_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[1] = CipherSuite.TLS_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[2] = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
    arrayOfCipherSuite3[3] = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[4] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[5] = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[6] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[7] = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    arrayOfCipherSuite3[8] = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    RESTRICTED_CIPHER_SUITES = arrayOfCipherSuite3;
    arrayOfCipherSuite3 = new CipherSuite[16];
    arrayOfCipherSuite3[0] = CipherSuite.TLS_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[1] = CipherSuite.TLS_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[2] = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
    arrayOfCipherSuite3[3] = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[4] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[5] = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[6] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[7] = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    arrayOfCipherSuite3[8] = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    arrayOfCipherSuite3[9] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    arrayOfCipherSuite3[10] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    arrayOfCipherSuite3[11] = CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
    arrayOfCipherSuite3[12] = CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384;
    arrayOfCipherSuite3[13] = CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA;
    arrayOfCipherSuite3[14] = CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA;
    arrayOfCipherSuite3[15] = CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    APPROVED_CIPHER_SUITES = arrayOfCipherSuite3;
    arrayOfCipherSuite3 = RESTRICTED_CIPHER_SUITES;
    TlsVersion[] arrayOfTlsVersion3 = new TlsVersion[2];
    arrayOfTlsVersion3[0] = TlsVersion.TLS_1_3;
    arrayOfTlsVersion3[1] = TlsVersion.TLS_1_2;
    RESTRICTED_TLS = (new ConnectionSpec$Builder(true)).cipherSuites(Arrays.<CipherSuite>copyOf(arrayOfCipherSuite3, arrayOfCipherSuite3.length)).tlsVersions(arrayOfTlsVersion3).supportsTlsExtensions(true).build();
    CipherSuite[] arrayOfCipherSuite2 = APPROVED_CIPHER_SUITES;
    TlsVersion[] arrayOfTlsVersion2 = new TlsVersion[2];
    arrayOfTlsVersion2[0] = TlsVersion.TLS_1_3;
    arrayOfTlsVersion2[1] = TlsVersion.TLS_1_2;
    MODERN_TLS = (new ConnectionSpec$Builder(true)).cipherSuites(Arrays.<CipherSuite>copyOf(arrayOfCipherSuite2, arrayOfCipherSuite2.length)).tlsVersions(arrayOfTlsVersion2).supportsTlsExtensions(true).build();
    CipherSuite[] arrayOfCipherSuite1 = APPROVED_CIPHER_SUITES;
    TlsVersion[] arrayOfTlsVersion1 = new TlsVersion[4];
    arrayOfTlsVersion1[0] = TlsVersion.TLS_1_3;
    arrayOfTlsVersion1[1] = TlsVersion.TLS_1_2;
    arrayOfTlsVersion1[2] = TlsVersion.TLS_1_1;
    arrayOfTlsVersion1[3] = TlsVersion.TLS_1_0;
    COMPATIBLE_TLS = (new ConnectionSpec$Builder(true)).cipherSuites(Arrays.<CipherSuite>copyOf(arrayOfCipherSuite1, arrayOfCipherSuite1.length)).tlsVersions(arrayOfTlsVersion1).supportsTlsExtensions(true).build();
    CLEARTEXT = (new ConnectionSpec$Builder(false)).build();
  }
  
  public ConnectionSpec(boolean paramBoolean1, boolean paramBoolean2, @Nullable String[] paramArrayOfString1, @Nullable String[] paramArrayOfString2) {
    this.isTls = paramBoolean1;
    this.supportsTlsExtensions = paramBoolean2;
    this.cipherSuitesAsString = paramArrayOfString1;
    this.tlsVersionsAsString = paramArrayOfString2;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ConnectionSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */