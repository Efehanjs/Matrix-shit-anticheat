package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class GenericProperty extends Property {
  private boolean actualClassesChecked;
  
  private Class[] actualClasses;
  
  private final Type genType;
  
  public GenericProperty(String paramString, Class paramClass, Type paramType) {
    super(paramString, paramClass);
    this.genType = paramType;
    this.actualClassesChecked = (paramType == null);
  }
  
  public Class[] getActualTypeArguments() {
    try {
      if (!this.actualClassesChecked) {
        if (this.genType instanceof ParameterizedType) {
          ParameterizedType parameterizedType = (ParameterizedType)this.genType;
          Type[] arrayOfType = parameterizedType.getActualTypeArguments();
          if (arrayOfType.length > 0) {
            this.actualClasses = new Class[arrayOfType.length];
            byte b = 0;
            while (true) {
              try {
                if (b < arrayOfType.length) {
                  try {
                    if (arrayOfType[b] instanceof Class) {
                      this.actualClasses[b] = (Class)arrayOfType[b];
                    } else {
                      try {
                        if (arrayOfType[b] instanceof ParameterizedType) {
                          this.actualClasses[b] = (Class)((ParameterizedType)arrayOfType[b]).getRawType();
                        } else if (arrayOfType[b] instanceof GenericArrayType) {
                          Type type = ((GenericArrayType)arrayOfType[b]).getGenericComponentType();
                          try {
                            if (type instanceof Class) {
                              this.actualClasses[b] = Array.newInstance((Class)type, 0).getClass();
                            } else {
                              this.actualClasses = null;
                              break;
                            } 
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                        } else {
                          this.actualClasses = null;
                          break;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  b++;
                  continue;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } 
        } else if (this.genType instanceof GenericArrayType) {
          Type type = ((GenericArrayType)this.genType).getGenericComponentType();
          try {
            if (type instanceof Class)
              this.actualClasses = new Class[] { (Class)type }; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else if (this.genType instanceof Class) {
          Class clazz = (Class)this.genType;
          try {
            if (clazz.isArray()) {
              this.actualClasses = new Class[1];
              this.actualClasses[0] = getType().getComponentType();
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
        this.actualClassesChecked = true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.actualClasses;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\GenericProperty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */