package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Android10Platform$Companion {
  public final boolean isSupported() {
    return Android10Platform.access$isSupported$cp();
  }
  
  @Nullable
  public final Platform buildIfSupported() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isSupported() ? new Android10Platform() : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Android10Platform$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */