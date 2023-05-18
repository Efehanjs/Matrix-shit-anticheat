package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;

public abstract class Property implements Comparable {
  private final Class type;
  
  private final String name;
  
  private static final long b = o3.a(4035437544420636096L, 6638809940721059885L, MethodHandles.lookup().lookupClass()).a(64579352130703L);
  
  public boolean isReadable() {
    return true;
  }
  
  public Class getType() {
    return this.type;
  }
  
  public int hashCode() {
    return getName().hashCode() + getType().hashCode();
  }
  
  public String toString() {
    long l = b ^ 0x68272810C64DL;
    return getName() + " of " + getType();
  }
  
  public abstract Class[] getActualTypeArguments();
  
  public Property(String paramString, Class paramClass) {
    this.name = paramString;
    this.type = paramClass;
  }
  
  public boolean isWritable() {
    return true;
  }
  
  public int compareTo(Property paramProperty) {
    return getName().compareTo(paramProperty.getName());
  }
  
  public abstract List getAnnotations();
  
  public abstract Object get(Object paramObject);
  
  public abstract Annotation getAnnotation(Class paramClass);
  
  public abstract void set(Object paramObject1, Object paramObject2) throws Exception;
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof Property) {
      Property property = (Property)paramObject;
      try {
        if (getName().equals(property.getName()))
          try {
            if (getType().equals(property.getType()));
          } catch (RuntimeException runtimeException) {
            throw b(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      return false;
    } 
    return false;
  }
  
  public String getName() {
    return this.name;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\Property.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */