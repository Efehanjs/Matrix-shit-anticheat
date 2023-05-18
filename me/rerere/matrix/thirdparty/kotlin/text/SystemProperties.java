package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SystemProperties {
  @JvmField
  @NotNull
  public static final String LINE_SEPARATOR;
  
  @NotNull
  public static final SystemProperties INSTANCE = new SystemProperties();
  
  static {
    Intrinsics.checkNotNull(System.getProperty("line.separator"));
    LINE_SEPARATOR = System.getProperty("line.separator");
  }
  
  static {
    long l = o3.a(-7128643338929943608L, -1292856864782036647L, null).a(224337571548773L) ^ 0x5D87C2D3627L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\SystemProperties.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */