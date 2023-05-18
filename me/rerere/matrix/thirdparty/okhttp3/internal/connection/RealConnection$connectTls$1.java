package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.okhttp3.Address;
import me.rerere.matrix.thirdparty.okhttp3.CertificatePinner;
import me.rerere.matrix.thirdparty.okhttp3.Handshake;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealConnection$connectTls$1 extends Lambda implements Function0 {
  @NotNull
  public final List invoke() {
    Intrinsics.checkNotNull(this.$certificatePinner.getCertificateChainCleaner$okhttp());
    return this.$certificatePinner.getCertificateChainCleaner$okhttp().clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
  }
  
  public RealConnection$connectTls$1(CertificatePinner paramCertificatePinner, Handshake paramHandshake, Address paramAddress) {
    super(0);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnection$connectTls$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */