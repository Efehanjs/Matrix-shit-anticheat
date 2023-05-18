package me.rerere.matrix.thirdparty.okio;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class -DeprecatedUpgrade {
  @NotNull
  private static final -DeprecatedUtf8 Utf8;
  
  @NotNull
  private static final -DeprecatedOkio Okio = -DeprecatedOkio.INSTANCE;
  
  @NotNull
  public static final -DeprecatedUtf8 getUtf8() {
    return Utf8;
  }
  
  @NotNull
  public static final -DeprecatedOkio getOkio() {
    return Okio;
  }
  
  static {
    Utf8 = -DeprecatedUtf8.INSTANCE;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-DeprecatedUpgrade.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */