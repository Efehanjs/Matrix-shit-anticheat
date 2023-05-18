package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface KMutableProperty2 extends KProperty2, KMutableProperty {
  @NotNull
  KMutableProperty2$Setter getSetter();
  
  void set(Object paramObject1, Object paramObject2, Object paramObject3);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KMutableProperty2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */