package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KProperty2 extends KProperty, Function2 {
  @NotNull
  KProperty2$Getter getGetter();
  
  @SinceKotlin(version = "1.1")
  @Nullable
  Object getDelegate(Object paramObject1, Object paramObject2);
  
  Object get(Object paramObject1, Object paramObject2);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KProperty2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */