package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import me.rerere.matrix.thirdparty.com.google.gson.InstanceCreator;
import me.rerere.matrix.thirdparty.com.google.gson.internal.reflect.ReflectionAccessor;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class ConstructorConstructor {
  private final Map instanceCreators;
  
  private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
  
  public ConstructorConstructor(Map paramMap) {
    this.instanceCreators = paramMap;
  }
  
  public String toString() {
    return this.instanceCreators.toString();
  }
  
  public ObjectConstructor get(TypeToken paramTypeToken) {
    Type type = paramTypeToken.getType();
    Class clazz = paramTypeToken.getRawType();
    InstanceCreator instanceCreator1 = (InstanceCreator)this.instanceCreators.get(type);
    try {
      if (instanceCreator1 != null)
        return new ConstructorConstructor$1(this, instanceCreator1, type); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    InstanceCreator instanceCreator2 = (InstanceCreator)this.instanceCreators.get(clazz);
    try {
      if (instanceCreator2 != null)
        return new ConstructorConstructor$2(this, instanceCreator2, type); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ObjectConstructor objectConstructor1 = newDefaultConstructor(clazz);
    try {
      if (objectConstructor1 != null)
        return objectConstructor1; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ObjectConstructor objectConstructor2 = newDefaultImplementationConstructor(type, clazz);
    try {
      if (objectConstructor2 != null)
        return objectConstructor2; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return newUnsafeAllocator(type, clazz);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\ConstructorConstructor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */