package me.rerere.matrix.thirdparty.okhttp3.internal.tls;

import java.lang.invoke.MethodHandles;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CertificateChainCleaner$Companion {
  private static final long a = o3.a(6681673405159099787L, 6926559677707894777L, MethodHandles.lookup().lookupClass()).a(239367809587565L);
  
  @NotNull
  public final CertificateChainCleaner get(@NotNull X509TrustManager paramX509TrustManager) {
    long l = a ^ 0x5D714F0474B4L;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    return Platform.Companion.get().buildCertificateChainCleaner(paramX509TrustManager);
  }
  
  @NotNull
  public final CertificateChainCleaner get(@NotNull X509Certificate... paramVarArgs) {
    long l = a ^ 0x4773533765BEL;
    Intrinsics.checkNotNullParameter(paramVarArgs, "caCerts");
    return new BasicCertificateChainCleaner(new BasicTrustRootIndex(Arrays.<X509Certificate>copyOf(paramVarArgs, paramVarArgs.length)));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\tls\CertificateChainCleaner$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */