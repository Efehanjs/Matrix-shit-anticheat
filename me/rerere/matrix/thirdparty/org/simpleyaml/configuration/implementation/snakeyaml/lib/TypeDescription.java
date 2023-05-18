package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.BeanAccess;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.Property;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.PropertySubstitute;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.PropertyUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class TypeDescription {
  private final Class type;
  
  private Map properties = Collections.emptyMap();
  
  private final Tag tag;
  
  public Set excludes = Collections.emptySet();
  
  private Class impl;
  
  private transient boolean delegatesChecked;
  
  public String[] includes = null;
  
  public BeanAccess beanAccess;
  
  private static final Logger log;
  
  private transient PropertyUtils propertyUtils;
  
  private transient Set dumpProperties;
  
  private static final long a = o3.a(-1030332723736617123L, -1944209961636455993L, MethodHandles.lookup().lookupClass()).a(57913809752983L);
  
  public boolean setProperty(Object paramObject1, String paramString, Object paramObject2) throws Exception {
    return false;
  }
  
  @Deprecated
  public void putMapPropertyType(String paramString, Class paramClass1, Class paramClass2) {
    addPropertyParameters(paramString, new Class[] { paramClass1, paramClass2 });
  }
  
  public Object finalizeConstruction(Object paramObject) {
    return paramObject;
  }
  
  public void substituteProperty(PropertySubstitute paramPropertySubstitute) {
    try {
      if (Collections.EMPTY_MAP == this.properties)
        this.properties = new LinkedHashMap<>(); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    paramPropertySubstitute.setTargetType(this.type);
    this.properties.put(paramPropertySubstitute.getName(), paramPropertySubstitute);
  }
  
  public boolean setupPropertyType(String paramString, Node paramNode) {
    return false;
  }
  
  public Property getProperty(String paramString) {
    try {
      if (!this.delegatesChecked)
        checkDelegates(); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
    
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return this.properties.containsKey(paramString) ? (Property)this.properties.get(paramString) : discoverProperty(paramString);
  }
  
  public Class getType() {
    return this.type;
  }
  
  public void setPropertyUtils(PropertyUtils paramPropertyUtils) {
    this.propertyUtils = paramPropertyUtils;
  }
  
  @Deprecated
  public void putListPropertyType(String paramString, Class paramClass) {
    addPropertyParameters(paramString, new Class[] { paramClass });
  }
  
  @Deprecated
  public Class getMapKeyType(String paramString) {
    if (this.properties.containsKey(paramString)) {
      Class[] arrayOfClass = ((PropertySubstitute)this.properties.get(paramString)).getActualTypeArguments();
      try {
        if (arrayOfClass != null)
          try {
            if (arrayOfClass.length > 0)
              return arrayOfClass[0]; 
          } catch (YAMLException yAMLException) {
            throw a(null);
          }  
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object newInstance(Node paramNode) {
    if (this.impl != null)
      try {
        Constructor constructor = this.impl.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        return constructor.newInstance(new Object[0]);
      } catch (Exception exception) {
        log.fine(exception.getLocalizedMessage());
        this.impl = null;
      }  
    return null;
  }
  
  public void addPropertyParameters(String paramString, Class... paramVarArgs) {
    try {
      if (!this.properties.containsKey(paramString)) {
        substituteProperty(paramString, null, null, null, paramVarArgs);
      } else {
        PropertySubstitute propertySubstitute = (PropertySubstitute)this.properties.get(paramString);
        propertySubstitute.setActualTypeArguments(paramVarArgs);
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public void setIncludes(String... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: ifnull -> 25
    //   5: aload_1
    //   6: arraylength
    //   7: ifle -> 25
    //   10: goto -> 17
    //   13: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException;
    //   16: athrow
    //   17: aload_1
    //   18: goto -> 26
    //   21: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException;
    //   24: athrow
    //   25: aconst_null
    //   26: putfield includes : [Ljava/lang/String;
    //   29: return
    // Exception table:
    //   from	to	target	type
    //   0	10	13	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   5	21	21	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
  }
  
  public TypeDescription(Class paramClass1, Class paramClass2) {
    this(paramClass1, new Tag(paramClass1), paramClass2);
  }
  
  public String toString() {
    long l = a ^ 0x57CEEAB82645L;
    return "TypeDescription for " + getType() + " (tag='" + getTag() + "')";
  }
  
  public Tag getTag() {
    return this.tag;
  }
  
  static {
    log = Logger.getLogger(TypeDescription.class.getPackage().getName());
  }
  
  public TypeDescription(Class paramClass1, Tag paramTag, Class paramClass2) {
    this.type = paramClass1;
    this.tag = paramTag;
    this.impl = paramClass2;
    this.beanAccess = null;
  }
  
  public TypeDescription(Class paramClass, String paramString) {
    this(paramClass, new Tag(paramString), null);
  }
  
  public TypeDescription(Class paramClass) {
    this(paramClass, new Tag(paramClass), null);
  }
  
  public TypeDescription(Class paramClass, Tag paramTag) {
    this(paramClass, paramTag, null);
  }
  
  @Deprecated
  public Class getListPropertyType(String paramString) {
    if (this.properties.containsKey(paramString)) {
      Class[] arrayOfClass = ((PropertySubstitute)this.properties.get(paramString)).getActualTypeArguments();
      try {
        if (arrayOfClass != null)
          try {
            if (arrayOfClass.length > 0)
              return arrayOfClass[0]; 
          } catch (YAMLException yAMLException) {
            throw a(null);
          }  
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public void setExcludes(String... paramVarArgs) {
    try {
      if (paramVarArgs != null)
        try {
          if (paramVarArgs.length > 0) {
            this.excludes = new HashSet();
            Collections.addAll(this.excludes, paramVarArgs);
            return;
          } 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    this.excludes = Collections.emptySet();
  }
  
  public Object newInstance(String paramString, Node paramNode) {
    return null;
  }
  
  public Set getProperties() {
    try {
      if (this.dumpProperties != null)
        return this.dumpProperties; 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (this.propertyUtils != null) {
        if (this.includes != null) {
          this.dumpProperties = new LinkedHashSet();
          for (String str : this.includes) {
            try {
              if (!this.excludes.contains(str))
                this.dumpProperties.add(getProperty(str)); 
            } catch (YAMLException yAMLException) {
              throw a(null);
            } 
          } 
          return this.dumpProperties;
        } 
        try {
        
        } catch (YAMLException yAMLException) {
          throw a(null);
        } 
        Set set = (this.beanAccess == null) ? this.propertyUtils.getProperties(this.type) : this.propertyUtils.getProperties(this.type, this.beanAccess);
        try {
          if (this.properties.isEmpty()) {
            try {
              if (this.excludes.isEmpty())
                return this.dumpProperties = set; 
            } catch (YAMLException yAMLException) {
              throw a(null);
            } 
            this.dumpProperties = new LinkedHashSet();
            for (Property property : set) {
              try {
                if (!this.excludes.contains(property.getName()))
                  this.dumpProperties.add(property); 
              } catch (YAMLException yAMLException) {
                throw a(null);
              } 
            } 
            return this.dumpProperties;
          } 
        } catch (YAMLException yAMLException) {
          throw a(null);
        } 
        try {
          if (!this.delegatesChecked)
            checkDelegates(); 
        } catch (YAMLException yAMLException) {
          throw a(null);
        } 
        this.dumpProperties = new LinkedHashSet();
        for (Property property : this.properties.values()) {
          try {
            if (!this.excludes.contains(property.getName()))
              try {
                if (property.isReadable())
                  this.dumpProperties.add(property); 
              } catch (YAMLException yAMLException) {
                throw a(null);
              }  
          } catch (YAMLException yAMLException) {
            throw a(null);
          } 
        } 
        for (Property property : set) {
          try {
            if (!this.excludes.contains(property.getName()))
              this.dumpProperties.add(property); 
          } catch (YAMLException yAMLException) {
            throw a(null);
          } 
        } 
        return this.dumpProperties;
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return null;
  }
  
  public void substituteProperty(String paramString1, Class paramClass, String paramString2, String paramString3, Class... paramVarArgs) {
    substituteProperty(new PropertySubstitute(paramString1, paramClass, paramString2, paramString3, paramVarArgs));
  }
  
  @Deprecated
  public Class getMapValueType(String paramString) {
    if (this.properties.containsKey(paramString)) {
      Class[] arrayOfClass = ((PropertySubstitute)this.properties.get(paramString)).getActualTypeArguments();
      try {
        if (arrayOfClass != null)
          try {
            if (arrayOfClass.length > 1)
              return arrayOfClass[1]; 
          } catch (YAMLException yAMLException) {
            throw a(null);
          }  
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\TypeDescription.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */