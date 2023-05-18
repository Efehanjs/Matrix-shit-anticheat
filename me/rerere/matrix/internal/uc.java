package me.rerere.matrix.internal;

import java.util.Map;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class uc {
  private final Map i = bc.b();
  
  private static boolean a;
  
  @NotNull
  public uc b(Object paramObject1, Object paramObject2) {
    this.i.put(paramObject1, paramObject2);
    return this;
  }
  
  @NotNull
  public Map b() {
    return this.i;
  }
  
  public static void n(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean E() {
    return a;
  }
  
  public static boolean H() {
    boolean bool = E();
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
    if (!H())
      n(true); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\uc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */