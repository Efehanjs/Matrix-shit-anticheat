package me.rerere.matrix.thirdparty.kotlin.reflect;

import java.util.Collection;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface KClass extends KDeclarationContainer, KAnnotatedElement, KClassifier {
  @NotNull
  List getTypeParameters();
  
  boolean isFinal();
  
  boolean isFun();
  
  boolean isValue();
  
  @NotNull
  Collection getConstructors();
  
  @SinceKotlin(version = "1.1")
  boolean isInstance(@Nullable Object paramObject);
  
  @NotNull
  Collection getMembers();
  
  @Nullable
  Object getObjectInstance();
  
  @Nullable
  String getSimpleName();
  
  boolean isInner();
  
  boolean isCompanion();
  
  @Nullable
  String getQualifiedName();
  
  int hashCode();
  
  @Nullable
  KVisibility getVisibility();
  
  @NotNull
  Collection getNestedClasses();
  
  boolean isSealed();
  
  @NotNull
  List getSupertypes();
  
  boolean isAbstract();
  
  @NotNull
  List getSealedSubclasses();
  
  boolean equals(@Nullable Object paramObject);
  
  boolean isData();
  
  boolean isOpen();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KClass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */