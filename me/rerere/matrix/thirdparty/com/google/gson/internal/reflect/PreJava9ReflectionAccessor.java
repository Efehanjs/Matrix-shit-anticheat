package me.rerere.matrix.thirdparty.com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;

public final class PreJava9ReflectionAccessor extends ReflectionAccessor {
  public void makeAccessible(AccessibleObject paramAccessibleObject) {
    paramAccessibleObject.setAccessible(true);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\reflect\PreJava9ReflectionAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */