package me.rerere.matrix.thirdparty.kotlin.reflect;

import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KType extends KAnnotatedElement {
  @NotNull
  List getArguments();
  
  @Nullable
  KClassifier getClassifier();
  
  boolean isMarkedNullable();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */