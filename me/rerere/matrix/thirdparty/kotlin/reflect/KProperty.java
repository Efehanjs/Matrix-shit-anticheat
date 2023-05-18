package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface KProperty extends KCallable {
  boolean isConst();
  
  @NotNull
  KProperty$Getter getGetter();
  
  boolean isLateinit();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */