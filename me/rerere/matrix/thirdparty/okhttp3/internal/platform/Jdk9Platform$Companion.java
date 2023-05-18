package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Jdk9Platform$Companion {
  public final boolean isAvailable() {
    return Jdk9Platform.access$isAvailable$cp();
  }
  
  @Nullable
  public final Jdk9Platform buildIfSupported() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isAvailable() ? new Jdk9Platform() : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Jdk9Platform$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */