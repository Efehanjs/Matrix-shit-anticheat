package me.rerere.matrix.thirdparty.okhttp3;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator {
  public int compare(@NotNull String paramString1, @NotNull String paramString2) {
    Intrinsics.checkNotNullParameter(paramString1, "a");
    Intrinsics.checkNotNullParameter(paramString2, "b");
    int i = 4;
    int j = Math.min(paramString1.length(), paramString2.length());
    while (i < j) {
      char c1 = paramString1.charAt(i);
      char c2 = paramString2.charAt(i);
      try {
        if (c1 != c2) {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return (Intrinsics.compare(c1, c2) < 0) ? -1 : 1;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int n = i;
      i = n + 1;
    } 
    int k = paramString1.length();
    int m = paramString2.length();
    try {
      if (k != m) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (k < m) ? -1 : 1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CipherSuite$Companion$ORDER_BY_NAME$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */