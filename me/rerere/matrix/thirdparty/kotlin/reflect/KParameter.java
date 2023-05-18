package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KParameter extends KAnnotatedElement {
  @NotNull
  KParameter$Kind getKind();
  
  boolean isOptional();
  
  @Nullable
  String getName();
  
  int getIndex();
  
  boolean isVararg();
  
  @NotNull
  KType getType();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KParameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */