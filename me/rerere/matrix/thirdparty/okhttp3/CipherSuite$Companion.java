package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CipherSuite$Companion {
  private static final long a = o3.a(-5243168308216176350L, -7626229940030523303L, MethodHandles.lookup().lookupClass()).a(111246766882886L);
  
  @NotNull
  public final Comparator getORDER_BY_NAME$okhttp() {
    return CipherSuite.access$getORDER_BY_NAME$cp();
  }
  
  @NotNull
  public final synchronized CipherSuite forJavaName(@NotNull String paramString) {
    long l = a ^ 0x7B6743C1CE1AL;
    Intrinsics.checkNotNullParameter(paramString, "javaName");
    CipherSuite cipherSuite = (CipherSuite)CipherSuite.access$getINSTANCES$cp().get(paramString);
    if (cipherSuite == null) {
      cipherSuite = (CipherSuite)CipherSuite.access$getINSTANCES$cp().get(secondaryName(paramString));
      if (cipherSuite == null)
        cipherSuite = new CipherSuite(paramString, null); 
      CipherSuite.access$getINSTANCES$cp().put(paramString, cipherSuite);
    } 
    return cipherSuite;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CipherSuite$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */