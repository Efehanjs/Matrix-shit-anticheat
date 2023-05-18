package me.rerere.matrix.thirdparty.kotlin.reflect;

import java.util.List;
import java.util.Map;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KCallable extends KAnnotatedElement {
  @Nullable
  KVisibility getVisibility();
  
  @NotNull
  List getTypeParameters();
  
  @NotNull
  String getName();
  
  Object callBy(@NotNull Map paramMap);
  
  boolean isFinal();
  
  @NotNull
  List getParameters();
  
  @NotNull
  KType getReturnType();
  
  Object call(@NotNull Object... paramVarArgs);
  
  boolean isSuspend();
  
  boolean isAbstract();
  
  boolean isOpen();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KCallable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */