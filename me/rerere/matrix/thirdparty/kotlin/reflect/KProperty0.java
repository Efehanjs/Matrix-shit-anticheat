package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KProperty0 extends KProperty, Function0 {
  @SinceKotlin(version = "1.1")
  @Nullable
  Object getDelegate();
  
  @NotNull
  KProperty0$Getter getGetter();
  
  Object get();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KProperty0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */