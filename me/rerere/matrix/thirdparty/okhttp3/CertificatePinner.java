package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.TypeIntrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CertificatePinner {
  @NotNull
  public static final CertificatePinner$Companion Companion;
  
  @JvmField
  @NotNull
  public static final CertificatePinner DEFAULT;
  
  @NotNull
  private final Set pins;
  
  @Nullable
  private final CertificateChainCleaner certificateChainCleaner;
  
  private static final long a = o3.a(-5511958057787918093L, -7911060423491642874L, MethodHandles.lookup().lookupClass()).a(111063374151812L);
  
  public final void check$okhttp(@NotNull String paramString, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x29BDE66F1D7EL;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    Intrinsics.checkNotNullParameter(paramFunction0, "cleanedPeerCertificatesFn");
    List list1 = findMatchingPins(paramString);
    try {
      if (list1.isEmpty())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list2 = (List)paramFunction0.invoke();
    for (X509Certificate x509Certificate : list2) {
      ByteString byteString1 = null;
      ByteString byteString2 = null;
      for (CertificatePinner$Pin certificatePinner$Pin : list1) {
        String str1 = certificatePinner$Pin.getHashAlgorithm();
        try {
          if (Intrinsics.areEqual(str1, "sha256")) {
            if (byteString2 == null)
              byteString2 = Companion.sha256Hash(x509Certificate); 
            if (Intrinsics.areEqual(certificatePinner$Pin.getHash(), byteString2))
              return; 
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (Intrinsics.areEqual(str1, "sha1")) {
            if (byteString1 == null)
              byteString1 = Companion.sha1Hash(x509Certificate); 
            if (Intrinsics.areEqual(certificatePinner$Pin.getHash(), byteString1))
              return; 
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", certificatePinner$Pin.getHashAlgorithm()));
      } 
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    stringBuilder2.append("Certificate pinning failure!");
    stringBuilder2.append("\n  Peer certificate chain:");
    for (X509Certificate x509Certificate : list2) {
      stringBuilder2.append("\n    ");
      stringBuilder2.append(Companion.pin(x509Certificate));
      stringBuilder2.append(": ");
      stringBuilder2.append(x509Certificate.getSubjectDN().getName());
    } 
    stringBuilder2.append("\n  Pinned certificates for ");
    stringBuilder2.append(paramString);
    stringBuilder2.append(":");
    for (CertificatePinner$Pin certificatePinner$Pin : list1) {
      stringBuilder2.append("\n    ");
      stringBuilder2.append(certificatePinner$Pin);
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
    String str = stringBuilder1.toString();
    throw new SSLPeerUnverifiedException(str);
  }
  
  @NotNull
  public final List findMatchingPins(@NotNull String paramString) {
    long l = a ^ 0x499E8E03A1AL;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    Set set = this.pins;
    boolean bool = false;
    List list = CollectionsKt.emptyList();
    for (CertificatePinner$Pin certificatePinner$Pin1 : set) {
      CertificatePinner$Pin certificatePinner$Pin2 = certificatePinner$Pin1;
      boolean bool1 = false;
      if (certificatePinner$Pin2.matchesHostname(paramString)) {
        if (list.isEmpty())
          list = new ArrayList(); 
        TypeIntrinsics.asMutableList(list).add(certificatePinner$Pin1);
      } 
    } 
    return list;
  }
  
  static {
    Companion = new CertificatePinner$Companion(null);
    DEFAULT = (new CertificatePinner$Builder()).build();
  }
  
  public CertificatePinner(@NotNull Set paramSet, @Nullable CertificateChainCleaner paramCertificateChainCleaner) {
    this.pins = paramSet;
    this.certificateChainCleaner = paramCertificateChainCleaner;
  }
  
  @NotNull
  public static final String pin(@NotNull Certificate paramCertificate) {
    return Companion.pin(paramCertificate);
  }
  
  @Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
  public final void check(@NotNull String paramString, @NotNull Certificate... paramVarArgs) throws SSLPeerUnverifiedException {
    long l = a ^ 0x39100EF0E360L;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    Intrinsics.checkNotNullParameter(paramVarArgs, "peerCertificates");
    check(paramString, ArraysKt.toList((Object[])paramVarArgs));
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof CertificatePinner)
        try {
          if (Intrinsics.areEqual(((CertificatePinner)paramObject).pins, this.pins))
            try {
              if (Intrinsics.areEqual(((CertificatePinner)paramObject).certificateChainCleaner, this.certificateChainCleaner));
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
  public final Set getPins() {
    return this.pins;
  }
  
  @Nullable
  public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
    return this.certificateChainCleaner;
  }
  
  @NotNull
  public static final ByteString sha256Hash(@NotNull X509Certificate paramX509Certificate) {
    return Companion.sha256Hash(paramX509Certificate);
  }
  
  @NotNull
  public static final ByteString sha1Hash(@NotNull X509Certificate paramX509Certificate) {
    return Companion.sha1Hash(paramX509Certificate);
  }
  
  @NotNull
  public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner paramCertificateChainCleaner) {
    long l = a ^ 0x21600708DAD7L;
    try {
      Intrinsics.checkNotNullParameter(paramCertificateChainCleaner, "certificateChainCleaner");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Intrinsics.areEqual(this.certificateChainCleaner, paramCertificateChainCleaner) ? this : new CertificatePinner(this.pins, paramCertificateChainCleaner);
  }
  
  public int hashCode() {
    null = 37;
    null = 41 * null + this.pins.hashCode();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 41 * null + ((this.certificateChainCleaner != null) ? this.certificateChainCleaner.hashCode() : 0);
  }
  
  public final void check(@NotNull String paramString, @NotNull List paramList) throws SSLPeerUnverifiedException {
    long l = a ^ 0x2014C98DB891L;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    Intrinsics.checkNotNullParameter(paramList, "peerCertificates");
    check$okhttp(paramString, new CertificatePinner$check$1(this, paramList, paramString));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CertificatePinner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */