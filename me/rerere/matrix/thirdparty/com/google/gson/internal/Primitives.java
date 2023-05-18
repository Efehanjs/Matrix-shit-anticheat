package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Primitives {
  private static final Map PRIMITIVE_TO_WRAPPER_TYPE;
  
  private static final Map WRAPPER_TO_PRIMITIVE_TYPE;
  
  public static boolean isWrapperType(Type paramType) {
    return WRAPPER_TO_PRIMITIVE_TYPE.containsKey($Gson$Preconditions.checkNotNull(paramType));
  }
  
  static {
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(16);
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>(16);
    add(hashMap1, hashMap2, boolean.class, Boolean.class);
    add(hashMap1, hashMap2, byte.class, Byte.class);
    add(hashMap1, hashMap2, char.class, Character.class);
    add(hashMap1, hashMap2, double.class, Double.class);
    add(hashMap1, hashMap2, float.class, Float.class);
    add(hashMap1, hashMap2, int.class, Integer.class);
    add(hashMap1, hashMap2, long.class, Long.class);
    add(hashMap1, hashMap2, short.class, Short.class);
    add(hashMap1, hashMap2, void.class, Void.class);
    PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(hashMap1);
    WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(hashMap2);
  }
  
  public static Class unwrap(Class paramClass) {
    Class clazz = (Class)WRAPPER_TO_PRIMITIVE_TYPE.get($Gson$Preconditions.checkNotNull(paramClass));
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (clazz == null) ? paramClass : clazz;
  }
  
  public static Class wrap(Class paramClass) {
    Class clazz = (Class)PRIMITIVE_TO_WRAPPER_TYPE.get($Gson$Preconditions.checkNotNull(paramClass));
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (clazz == null) ? paramClass : clazz;
  }
  
  public static boolean isPrimitive(Type paramType) {
    return PRIMITIVE_TO_WRAPPER_TYPE.containsKey(paramType);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\Primitives.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */