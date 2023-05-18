package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class im {
  @NotNull
  private final String b;
  
  @NotNull
  private final zk i;
  
  private static yk[] a;
  
  @NotNull
  public final String b() {
    return this.b;
  }
  
  public abstract void b();
  
  @NotNull
  public final zk b() {
    return this.i;
  }
  
  public static void m(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] K() {
    return a;
  }
  
  static {
    if (K() != null)
      m(new yk[3]); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\im.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */