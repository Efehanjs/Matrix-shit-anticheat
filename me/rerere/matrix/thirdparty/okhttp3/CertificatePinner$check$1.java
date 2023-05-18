package me.rerere.matrix.thirdparty.okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CertificatePinner$check$1 extends Lambda implements Function0 {
  public CertificatePinner$check$1(List paramList, String paramString) {
    super(0);
  }
  
  @NotNull
  public final List invoke() {
    try {
      CertificatePinner.this.getCertificateChainCleaner$okhttp();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((CertificatePinner.this.getCertificateChainCleaner$okhttp() == null) ? null : CertificatePinner.this.getCertificateChainCleaner$okhttp().clean(this.$peerCertificates, this.$hostname)) == null)
        (CertificatePinner.this.getCertificateChainCleaner$okhttp() == null) ? null : CertificatePinner.this.getCertificateChainCleaner$okhttp().clean(this.$peerCertificates, this.$hostname); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list1 = this.$peerCertificates;
    boolean bool1 = false;
    List list2 = list1;
    ArrayList<X509Certificate> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
    boolean bool2 = false;
    for (Certificate certificate1 : list2) {
      Certificate certificate2 = certificate1;
      ArrayList<X509Certificate> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add((X509Certificate)certificate2);
    } 
    return arrayList;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CertificatePinner$check$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */