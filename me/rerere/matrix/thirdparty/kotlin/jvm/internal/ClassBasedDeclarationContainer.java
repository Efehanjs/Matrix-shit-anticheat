package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.reflect.KDeclarationContainer;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface ClassBasedDeclarationContainer extends KDeclarationContainer {
  @NotNull
  Class getJClass();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ClassBasedDeclarationContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */