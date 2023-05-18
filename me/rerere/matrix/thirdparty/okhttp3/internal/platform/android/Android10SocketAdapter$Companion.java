package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import android.os.Build;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SuppressSignatureCheck
public final class Android10SocketAdapter$Companion {
  public final boolean isSupported() {
    try {
      if (Platform.Companion.isAndroid())
        try {
          if (Build.VERSION.SDK_INT >= 29);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @Nullable
  public final SocketAdapter buildIfSupported() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isSupported() ? new Android10SocketAdapter() : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\Android10SocketAdapter$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */