package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KProperty1 extends KProperty, Function1 {
  Object get(Object paramObject);
  
  @SinceKotlin(version = "1.1")
  @Nullable
  Object getDelegate(Object paramObject);
  
  @NotNull
  KProperty1$Getter getGetter();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KProperty1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */