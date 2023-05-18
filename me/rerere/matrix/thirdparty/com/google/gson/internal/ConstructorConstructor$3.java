package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import me.rerere.matrix.internal.o3;

public class ConstructorConstructor$3 implements ObjectConstructor {
  private static final long a = o3.a(1056898351756569933L, 4551501727610371618L, null).a(20672424091729L);
  
  public Object construct() {
    long l = a ^ 0x25A8C092203EL;
    try {
      Object[] arrayOfObject = null;
      return constructor.newInstance(arrayOfObject);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException("Failed to invoke " + constructor + " with no args", instantiationException);
    } catch (InvocationTargetException invocationTargetException) {
      throw new RuntimeException("Failed to invoke " + constructor + " with no args", invocationTargetException.getTargetException());
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError(illegalAccessException);
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\ConstructorConstructor$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */