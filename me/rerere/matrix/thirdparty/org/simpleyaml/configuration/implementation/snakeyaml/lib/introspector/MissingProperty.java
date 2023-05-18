package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

public class MissingProperty extends Property {
  public Annotation getAnnotation(Class paramClass) {
    return null;
  }
  
  public Class[] getActualTypeArguments() {
    return new Class[0];
  }
  
  public void set(Object paramObject1, Object paramObject2) throws Exception {}
  
  public Object get(Object paramObject) {
    return paramObject;
  }
  
  public List getAnnotations() {
    return Collections.emptyList();
  }
  
  public MissingProperty(String paramString) {
    super(paramString, Object.class);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\MissingProperty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */