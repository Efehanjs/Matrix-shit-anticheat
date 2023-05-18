package me.rerere.matrix.thirdparty.kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Regex$Serialized implements Serializable {
  @NotNull
  private final String pattern;
  
  private final int flags;
  
  @NotNull
  public static final Regex$Serialized$Companion Companion;
  
  private static final long serialVersionUID = 0L;
  
  private static final long a = o3.a(-2516893029438979989L, 3429687471779810736L, null).a(236162887520789L);
  
  static {
    Companion = new Regex$Serialized$Companion(null);
  }
  
  public final int getFlags() {
    return this.flags;
  }
  
  @NotNull
  public final String getPattern() {
    return this.pattern;
  }
  
  public Regex$Serialized(@NotNull String paramString, int paramInt) {
    this.pattern = paramString;
    this.flags = paramInt;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\Regex$Serialized.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */