package me.rerere.matrix.internal;

import java.io.File;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlFile;

public class uj {
  @NotNull
  private File v;
  
  @NotNull
  private YamlFile b;
  
  @NotNull
  private final String i;
  
  private static boolean c;
  
  private static final long h = o3.a(8411527572453401819L, -6843565044717234031L, MethodHandles.lookup().lookupClass()).a(113062892325614L);
  
  public final void b(@NotNull YamlFile paramYamlFile) {
    this.b = paramYamlFile;
  }
  
  @NotNull
  public final File b() {
    return this.v;
  }
  
  public uj(long paramLong, @NotNull String paramString) {
    this.i = paramString;
    int i = yl.a();
    File file1 = new File(Matrix.q.b(l).getDataFolder(), this.i);
    File file2 = file1;
    uj uj1 = this;
    boolean bool = false;
    try {
      if (i == 0) {
        try {
          if (!file2.exists())
            Matrix.q.b(l).saveResource(this.i, false); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        uj1.v = file1;
        this.b = b(this.v);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(byte paramByte, long paramLong) {
    long l1 = paramByte << 56L | paramLong << 8L >>> 8L;
    long l2 = l1 ^ 0x18C8C14D448EL;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (!this.v.exists())
            Matrix.q.b(l2).saveResource(this.i, false); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = b(this.v);
  }
  
  @NotNull
  public final YamlFile b() {
    return this.b;
  }
  
  public final void b(@NotNull File paramFile) {
    this.v = paramFile;
  }
  
  public static void K(boolean paramBoolean) {
    c = paramBoolean;
  }
  
  public static boolean D() {
    return c;
  }
  
  public static boolean f() {
    boolean bool = D();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    if (!f())
      K(true); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\uj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */