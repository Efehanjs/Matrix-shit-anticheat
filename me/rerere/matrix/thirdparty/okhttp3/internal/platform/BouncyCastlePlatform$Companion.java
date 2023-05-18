package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class BouncyCastlePlatform$Companion {
  @Nullable
  public final BouncyCastlePlatform buildIfSupported() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isSupported() ? new BouncyCastlePlatform(null) : null;
  }
  
  public final boolean isSupported() {
    return BouncyCastlePlatform.access$isSupported$cp();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\BouncyCastlePlatform$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */