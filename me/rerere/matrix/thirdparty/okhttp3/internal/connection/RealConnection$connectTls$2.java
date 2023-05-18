package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealConnection$connectTls$2 extends Lambda implements Function0 {
  public RealConnection$connectTls$2() {
    super(0);
  }
  
  @NotNull
  public final List invoke() {
    Intrinsics.checkNotNull(RealConnection.access$getHandshake$p(RealConnection.this));
    List list1 = RealConnection.access$getHandshake$p(RealConnection.this).peerCertificates();
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnection$connectTls$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */