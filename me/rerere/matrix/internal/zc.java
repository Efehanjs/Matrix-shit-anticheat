package me.rerere.matrix.internal;

import java.util.OptionalInt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class zc {
  private static boolean a;
  
  public static OptionalInt b(@NotNull String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      return OptionalInt.of(i);
    } catch (Exception exception) {
      return OptionalInt.empty();
    } 
  }
  
  public static boolean b(@NotNull String paramString) {
    try {
      Integer.parseInt(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static double b(double paramDouble) {
    return Math.round(paramDouble * 1000.0D) / 1000.0D;
  }
  
  public static float b(float paramFloat) {
    return Math.round(paramFloat * 1000.0F) / 1000.0F;
  }
  
  public static double b(double paramDouble, int paramInt) {
    return Math.round(paramDouble * Math.pow(10.0D, paramInt)) / Math.pow(10.0D, paramInt);
  }
  
  public static void D(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean O() {
    return a;
  }
  
  public static boolean r() {
    boolean bool = O();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    if (!r())
      D(true); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */