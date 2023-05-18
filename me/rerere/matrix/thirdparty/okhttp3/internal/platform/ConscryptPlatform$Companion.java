package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.conscrypt.Conscrypt;

public final class ConscryptPlatform$Companion {
  public final boolean atLeastVersion(int paramInt1, int paramInt2, int paramInt3) {
    Conscrypt.Version version = Conscrypt.version();
    try {
      if (version.major() != paramInt1) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (version.major() > paramInt1);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (version.minor() != paramInt2) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (version.minor() > paramInt2);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (version.patch() >= paramInt3);
  }
  
  public final boolean isSupported() {
    return ConscryptPlatform.access$isSupported$cp();
  }
  
  @Nullable
  public final ConscryptPlatform buildIfSupported() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isSupported() ? new ConscryptPlatform(null) : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\ConscryptPlatform$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */