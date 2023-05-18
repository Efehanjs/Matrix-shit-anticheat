package me.rerere.matrix.thirdparty.com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;
import me.rerere.matrix.thirdparty.com.google.gson.internal.JavaVersion;

public abstract class ReflectionAccessor {
  public abstract void makeAccessible(AccessibleObject paramAccessibleObject);
  
  public static ReflectionAccessor getInstance() {
    return instance;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static final ReflectionAccessor instance = (JavaVersion.getMajorJavaVersion() < 9) ? new PreJava9ReflectionAccessor() : new UnsafeReflectionAccessor();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\reflect\ReflectionAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */