package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@PublishedApi
public final class _Assertions {
  @NotNull
  public static final _Assertions INSTANCE = new _Assertions();
  
  @JvmField
  public static final boolean ENABLED = INSTANCE.getClass().desiredAssertionStatus();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\_Assertions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */