package me.rerere.matrix.internal;

import java.util.TimerTask;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class pc extends TimerTask {
  private static volatile long b;
  
  @NotNull
  public static final pc i = new pc();
  
  private static int a;
  
  public static final long j() {
    return System.currentTimeMillis();
  }
  
  public static final long b() {
    return b;
  }
  
  public void run() {
    b = j();
  }
  
  public static final double b(long paramLong) {
    return paramLong / 1000.0D;
  }
  
  public static void M(int paramInt) {
    a = paramInt;
  }
  
  public static int y() {
    return a;
  }
  
  public static int k() {
    int i = y();
    try {
      if (i == 0)
        return 37; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    if (y() == 0)
      M(87); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */