package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.util.Collections;
import java.util.List;

public class ArrayUtils {
  public static List toUnmodifiableCompositeList(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    List list;
    if (paramArrayOfObject1.length == 0) {
      list = toUnmodifiableList(paramArrayOfObject2);
    } else if (paramArrayOfObject2.length == 0) {
      list = toUnmodifiableList(paramArrayOfObject1);
    } else {
      list = new ArrayUtils$CompositeUnmodifiableArrayList(paramArrayOfObject1, paramArrayOfObject2);
    } 
    return list;
  }
  
  public static List toUnmodifiableList(Object[] paramArrayOfObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramArrayOfObject.length == 0) ? Collections.emptyList() : new ArrayUtils$UnmodifiableArrayList(paramArrayOfObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\ArrayUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */