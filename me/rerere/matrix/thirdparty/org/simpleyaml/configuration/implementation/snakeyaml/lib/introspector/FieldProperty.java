package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.ArrayUtils;

public class FieldProperty extends GenericProperty {
  private final Field field;
  
  private static final long a = o3.a(3857179670176021708L, -6622316961658669390L, MethodHandles.lookup().lookupClass()).a(36241697496348L);
  
  public Object get(Object paramObject) {
    long l = a ^ 0x609FEAAAF777L;
    try {
      return this.field.get(paramObject);
    } catch (Exception exception) {
      throw new YAMLException("Unable to access field " + this.field.getName() + " on object " + paramObject + " : " + exception);
    } 
  }
  
  public List getAnnotations() {
    return ArrayUtils.toUnmodifiableList((Object[])this.field.getAnnotations());
  }
  
  public Annotation getAnnotation(Class<Annotation> paramClass) {
    return this.field.getAnnotation(paramClass);
  }
  
  public void set(Object paramObject1, Object paramObject2) throws Exception {
    this.field.set(paramObject1, paramObject2);
  }
  
  public FieldProperty(Field paramField) {
    super(paramField.getName(), paramField.getType(), paramField.getGenericType());
    this.field = paramField;
    paramField.setAccessible(true);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\FieldProperty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */