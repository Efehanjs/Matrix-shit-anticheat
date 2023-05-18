package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.ArrayUtils;

public class MethodProperty extends GenericProperty {
  private final boolean writable;
  
  private final PropertyDescriptor property;
  
  private final boolean readable;
  
  private static final long a = o3.a(-3154719247951052600L, 446457404548857889L, MethodHandles.lookup().lookupClass()).a(154919141139972L);
  
  public Annotation getAnnotation(Class<Object> paramClass) {
    Annotation annotation = null;
    if (isReadable())
      annotation = this.property.getReadMethod().getAnnotation(paramClass); 
    try {
      if (annotation == null && isWritable())
        annotation = this.property.getWriteMethod().getAnnotation(paramClass); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return annotation;
  }
  
  public MethodProperty(PropertyDescriptor paramPropertyDescriptor) {
    super(paramPropertyDescriptor.getName(), paramPropertyDescriptor.getPropertyType(), discoverGenericType(paramPropertyDescriptor));
    this.property = paramPropertyDescriptor;
    try {
      this.readable = (paramPropertyDescriptor.getReadMethod() != null);
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    this.writable = (paramPropertyDescriptor.getWriteMethod() != null);
  }
  
  public boolean isReadable() {
    return this.readable;
  }
  
  public boolean isWritable() {
    return this.writable;
  }
  
  public List getAnnotations() {
    List list;
    try {
      if (isReadable() && isWritable()) {
        list = ArrayUtils.toUnmodifiableCompositeList((Object[])this.property.getReadMethod().getAnnotations(), (Object[])this.property.getWriteMethod().getAnnotations());
      } else if (isReadable()) {
        list = ArrayUtils.toUnmodifiableList((Object[])this.property.getReadMethod().getAnnotations());
      } else {
        list = ArrayUtils.toUnmodifiableList((Object[])this.property.getWriteMethod().getAnnotations());
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return list;
  }
  
  public Object get(Object paramObject) {
    long l = a ^ 0xEDAF4E11A3BL;
    try {
      this.property.getReadMethod().setAccessible(true);
      return this.property.getReadMethod().invoke(paramObject, new Object[0]);
    } catch (Exception exception) {
      throw new YAMLException("Unable to find getter for property '" + this.property.getName() + "' on object " + paramObject + ":" + exception);
    } 
  }
  
  public void set(Object paramObject1, Object paramObject2) throws Exception {
    long l = a ^ 0x670BD71DDF28L;
    try {
      if (!this.writable)
        throw new YAMLException("No writable property '" + getName() + "' on class: " + paramObject1.getClass().getName()); 
    } catch (Exception exception) {
      throw a(null);
    } 
    this.property.getWriteMethod().invoke(paramObject1, new Object[] { paramObject2 });
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\MethodProperty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */