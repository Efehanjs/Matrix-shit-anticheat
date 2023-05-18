package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CertificatePinner$Companion {
  private static final long a = o3.a(-104077871677291505L, 7140777248952396300L, MethodHandles.lookup().lookupClass()).a(124173278832974L);
  
  @NotNull
  public final ByteString sha256Hash(@NotNull X509Certificate paramX509Certificate) {
    long l = a ^ 0x7AD428FFF9E0L;
    Intrinsics.checkNotNullParameter(paramX509Certificate, "<this>");
    byte[] arrayOfByte = paramX509Certificate.getPublicKey().getEncoded();
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "publicKey.encoded");
    return ByteString.Companion.of$default(ByteString.Companion, arrayOfByte, 0, 0, 3, null).sha256();
  }
  
  @NotNull
  public final String pin(@NotNull Certificate paramCertificate) {
    long l = a ^ 0xB9D376FCBBEL;
    Intrinsics.checkNotNullParameter(paramCertificate, "certificate");
    if (!(paramCertificate instanceof X509Certificate)) {
      boolean bool = false;
      String str = "Certificate pinning requires X509 certificates";
      throw new IllegalArgumentException(str.toString());
    } 
    return Intrinsics.stringPlus("sha256/", sha256Hash((X509Certificate)paramCertificate).base64());
  }
  
  @NotNull
  public final ByteString sha1Hash(@NotNull X509Certificate paramX509Certificate) {
    long l = a ^ 0x303DBB909965L;
    Intrinsics.checkNotNullParameter(paramX509Certificate, "<this>");
    byte[] arrayOfByte = paramX509Certificate.getPublicKey().getEncoded();
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "publicKey.encoded");
    return ByteString.Companion.of$default(ByteString.Companion, arrayOfByte, 0, 0, 3, null).sha1();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CertificatePinner$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */