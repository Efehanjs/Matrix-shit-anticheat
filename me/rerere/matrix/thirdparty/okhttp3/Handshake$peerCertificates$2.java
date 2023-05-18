package me.rerere.matrix.thirdparty.okhttp3;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Handshake$peerCertificates$2 extends Lambda implements Function0 {
  public Handshake$peerCertificates$2(Function0 paramFunction0) {
    super(0);
  }
  
  @NotNull
  public final List invoke() {
    List list;
    try {
      list = (List)this.$peerCertificatesFn.invoke();
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      list = CollectionsKt.emptyList();
    } 
    return list;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Handshake$peerCertificates$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */