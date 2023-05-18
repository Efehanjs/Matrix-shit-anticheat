package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class xi extends im {
  private Object b;
  
  private final Object i;
  
  private static String[] c;
  
  public void b() {
    this.b = b().b().get(b(), this.i);
  }
  
  public final Object b() {
    return this.i;
  }
  
  public xi(@NotNull String paramString, @NotNull zk paramzk, Object paramObject) {
    super(paramString, paramzk, null);
    this.i = paramObject;
    this.b = this.i;
  }
  
  public final Object b(@NotNull zk paramzk, @NotNull KProperty paramKProperty) {
    return this.b;
  }
  
  public static void p(String[] paramArrayOfString) {
    c = paramArrayOfString;
  }
  
  public static String[] h() {
    return c;
  }
  
  static {
    if (h() == null)
      p(new String[5]); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */