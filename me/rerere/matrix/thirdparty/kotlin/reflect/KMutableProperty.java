package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface KMutableProperty extends KProperty {
  @NotNull
  KMutableProperty$Setter getSetter();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KMutableProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */