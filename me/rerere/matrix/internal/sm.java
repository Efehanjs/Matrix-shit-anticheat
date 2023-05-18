package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class sm {
  private static String[] a;
  
  public static void w(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] q() {
    return a;
  }
  
  static {
    if (q() != null)
      w(new String[2]); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */