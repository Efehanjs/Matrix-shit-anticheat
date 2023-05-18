package me.rerere.matrix.thirdparty.com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import me.rerere.matrix.thirdparty.com.google.gson.internal.;

public final class FieldAttributes {
  private final Field field;
  
  public boolean hasModifier(int paramInt) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((this.field.getModifiers() & paramInt) != 0);
  }
  
  public Collection getAnnotations() {
    return Arrays.asList(this.field.getAnnotations());
  }
  
  public Class getDeclaringClass() {
    return this.field.getDeclaringClass();
  }
  
  public boolean isSynthetic() {
    return this.field.isSynthetic();
  }
  
  public Annotation getAnnotation(Class<Annotation> paramClass) {
    return this.field.getAnnotation(paramClass);
  }
  
  public FieldAttributes(Field paramField) {
    .Gson.Preconditions.checkNotNull(paramField);
    this.field = paramField;
  }
  
  public Class getDeclaredClass() {
    return this.field.getType();
  }
  
  public Object get(Object paramObject) throws IllegalAccessException {
    return this.field.get(paramObject);
  }
  
  public Type getDeclaredType() {
    return this.field.getGenericType();
  }
  
  public String getName() {
    return this.field.getName();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\FieldAttributes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */