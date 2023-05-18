package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CertificatePinner$Builder {
  @NotNull
  private final List pins = new ArrayList();
  
  private static final long a = o3.a(4548951960759746544L, 5908987513448315069L, MethodHandles.lookup().lookupClass()).a(276463502487996L);
  
  @NotNull
  public final CertificatePinner build() {
    return new CertificatePinner(CollectionsKt.toSet(this.pins), null, 2, null);
  }
  
  @NotNull
  public final List getPins() {
    return this.pins;
  }
  
  @NotNull
  public final CertificatePinner$Builder add(@NotNull String paramString, @NotNull String... paramVarArgs) {
    long l = a ^ 0x4584795324ACL;
    Intrinsics.checkNotNullParameter(paramString, "pattern");
    Intrinsics.checkNotNullParameter(paramVarArgs, "pins");
    CertificatePinner$Builder certificatePinner$Builder1 = this;
    CertificatePinner$Builder certificatePinner$Builder2 = certificatePinner$Builder1;
    boolean bool = false;
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      String str = paramVarArgs[b];
      b++;
      certificatePinner$Builder2.getPins().add(new CertificatePinner$Pin(paramString, str));
    } 
    return certificatePinner$Builder1;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CertificatePinner$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */