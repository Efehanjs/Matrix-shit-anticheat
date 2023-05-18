package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;

public class PropertySubstitute extends Property {
  private transient Method read;
  
  private final String writeMethod;
  
  private static final Logger log;
  
  public Class[] parameters;
  
  private final String readMethod;
  
  public Class targetType;
  
  private Property delegate;
  
  private Field field;
  
  private boolean filler;
  
  private transient Method write;
  
  private static final long a = o3.a(3626938596027375860L, 1595793306641103639L, MethodHandles.lookup().lookupClass()).a(228121293846035L);
  
  static {
    log = Logger.getLogger(PropertySubstitute.class.getPackage().getName());
  }
  
  public boolean isReadable() {
    try {
      if (this.read == null)
        try {
          if (this.field == null) {
            try {
              if (this.delegate != null)
                try {
                  if (this.delegate.isReadable());
                } catch (YAMLException yAMLException) {
                  throw a(null);
                }  
            } catch (YAMLException yAMLException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public List getAnnotations() {
    Annotation[] arrayOfAnnotation = null;
    if (this.read != null) {
      arrayOfAnnotation = this.read.getAnnotations();
    } else if (this.field != null) {
      arrayOfAnnotation = this.field.getAnnotations();
    } 
    try {
    
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return (arrayOfAnnotation != null) ? Arrays.<Annotation>asList(arrayOfAnnotation) : this.delegate.getAnnotations();
  }
  
  public Annotation getAnnotation(Class<Object> paramClass) {
    Annotation annotation;
    if (this.read != null) {
      annotation = this.read.getAnnotation(paramClass);
    } else if (this.field != null) {
      annotation = this.field.getAnnotation(paramClass);
    } else {
      annotation = this.delegate.getAnnotation(paramClass);
    } 
    return annotation;
  }
  
  public Object get(Object paramObject) {
    long l = a ^ 0x44AFD4B7B468L;
    try {
      if (this.read != null)
        return this.read.invoke(paramObject, new Object[0]); 
      if (this.field != null)
        return this.field.get(paramObject); 
    } catch (Exception exception) {
      throw new YAMLException("Unable to find getter for property '" + getName() + "' on object " + paramObject + ":" + exception);
    } 
    try {
      if (this.delegate != null)
        return this.delegate.get(paramObject); 
    } catch (Exception exception) {
      throw a(null);
    } 
    throw new YAMLException("No getter or delegate for property '" + getName() + "' on object " + paramObject);
  }
  
  public Class[] getActualTypeArguments() {
    try {
      if (this.parameters == null)
        try {
          if (this.delegate != null)
            return this.delegate.getActualTypeArguments(); 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return this.parameters;
  }
  
  public void set(Object paramObject1, Object paramObject2) throws Exception {
    long l = a ^ 0x2D7EF74B717BL;
    try {
      if (this.write != null) {
        try {
          if (!this.filler) {
            this.write.invoke(paramObject1, new Object[] { paramObject2 });
          } else {
            try {
              if (paramObject2 != null)
                if (paramObject2 instanceof Collection) {
                  Collection collection = (Collection)paramObject2;
                  for (Object object : collection) {
                    this.write.invoke(paramObject1, new Object[] { object });
                  } 
                } else if (paramObject2 instanceof Map) {
                  Map map = (Map)paramObject2;
                  for (Map.Entry entry : map.entrySet()) {
                    this.write.invoke(paramObject1, new Object[] { entry.getKey(), entry.getValue() });
                  } 
                } else if (paramObject2.getClass().isArray()) {
                  int i = Array.getLength(paramObject2);
                  byte b = 0;
                  try {
                    while (b < i) {
                      this.write.invoke(paramObject1, new Object[] { Array.get(paramObject2, b) });
                      b++;
                    } 
                  } catch (Exception exception) {
                    throw a(null);
                  } 
                }  
            } catch (Exception exception) {
              throw a(null);
            } 
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } else {
        try {
          if (this.field != null) {
            this.field.set(paramObject1, paramObject2);
          } else {
            try {
              if (this.delegate != null) {
                this.delegate.set(paramObject1, paramObject2);
              } else {
                log.warning("No setter/delegate for '" + getName() + "' on object " + paramObject1);
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public PropertySubstitute(String paramString1, Class paramClass, String paramString2, String paramString3, Class... paramVarArgs) {
    super(paramString1, paramClass);
    this.readMethod = paramString2;
    this.writeMethod = paramString3;
    setActualTypeArguments(paramVarArgs);
    this.filler = false;
  }
  
  public boolean isWritable() {
    try {
      if (this.write == null)
        try {
          if (this.field == null) {
            try {
              if (this.delegate != null)
                try {
                  if (this.delegate.isWritable());
                } catch (YAMLException yAMLException) {
                  throw a(null);
                }  
            } catch (YAMLException yAMLException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public void setDelegate(Property paramProperty) {
    try {
      this.delegate = paramProperty;
      if (this.writeMethod != null)
        try {
          if (this.write == null)
            try {
              if (!this.filler) {
                this.filler = true;
                this.write = discoverMethod(this.targetType, this.writeMethod, getActualTypeArguments());
              } 
            } catch (YAMLException yAMLException) {
              throw a(null);
            }  
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public String getName() {
    String str = super.getName();
    try {
      if (str != null)
        return str; 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
    
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return (this.delegate != null) ? this.delegate.getName() : null;
  }
  
  public void setActualTypeArguments(Class... paramVarArgs) {
    try {
      if (paramVarArgs != null)
        try {
          if (paramVarArgs.length > 0) {
            this.parameters = paramVarArgs;
            return;
          } 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    this.parameters = null;
  }
  
  public void setTargetType(Class paramClass) {
    long l = a ^ 0x1E1E41DC2EB5L;
    if (this.targetType != paramClass) {
      this.targetType = paramClass;
      String str = getName();
      for (Class clazz = paramClass; clazz != null; clazz = clazz.getSuperclass()) {
        for (Field field : clazz.getDeclaredFields()) {
          if (field.getName().equals(str)) {
            int i = field.getModifiers();
            try {
              if (!Modifier.isStatic(i))
                try {
                  if (!Modifier.isTransient(i)) {
                    field.setAccessible(true);
                    this.field = field;
                  } 
                } catch (YAMLException yAMLException) {
                  throw a(null);
                }  
            } catch (YAMLException yAMLException) {
              throw a(null);
            } 
            break;
          } 
        } 
      } 
      try {
        if (this.field == null)
          try {
            if (log.isLoggable(Level.FINE))
              log.fine(String.format("Failed to find field for %s.%s", new Object[] { paramClass.getName(), getName() })); 
          } catch (YAMLException yAMLException) {
            throw a(null);
          }  
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
      try {
        if (this.readMethod != null)
          this.read = discoverMethod(paramClass, this.readMethod, new Class[0]); 
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
      try {
        if (this.writeMethod != null)
          try {
            this.filler = false;
            this.write = discoverMethod(paramClass, this.writeMethod, new Class[] { getType() });
            if (this.write == null)
              try {
                if (this.parameters != null) {
                  this.filler = true;
                  this.write = discoverMethod(paramClass, this.writeMethod, this.parameters);
                } 
              } catch (YAMLException yAMLException) {
                throw a(null);
              }  
          } catch (YAMLException yAMLException) {
            throw a(null);
          }  
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
    } 
  }
  
  public Class getType() {
    Class clazz = super.getType();
    try {
      if (clazz != null)
        return clazz; 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
    
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return (this.delegate != null) ? this.delegate.getType() : null;
  }
  
  public PropertySubstitute(String paramString, Class paramClass, Class... paramVarArgs) {
    this(paramString, paramClass, null, null, paramVarArgs);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\PropertySubstitute.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */