package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class ConfigurationSerialization {
  public static final String SERIALIZED_TYPE_KEY = "==";
  
  private final Class clazz;
  
  private static final Map aliases;
  
  private static final long a = o3.a(-2002919939866621951L, 4371690788880788916L, MethodHandles.lookup().lookupClass()).a(11772585827456L);
  
  public ConfigurationSerializable deserializeViaMethod(Method paramMethod, Map paramMap) {
    long l = a ^ 0x42EF130E2C83L;
    try {
      ConfigurationSerializable configurationSerializable = (ConfigurationSerializable)paramMethod.invoke(null, new Object[] { paramMap });
      try {
        if (configurationSerializable == null) {
          Logger.getLogger(ConfigurationSerialization.class.getName()).log(Level.SEVERE, "Could not call method '" + paramMethod + "' of " + this.clazz + " for deserialization: method returned null");
        } else {
          return configurationSerializable;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
    } catch (Throwable throwable) {
      try {
      
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      Logger.getLogger(ConfigurationSerialization.class.getName()).log(Level.SEVERE, "Could not call method '" + paramMethod.toString() + "' of " + this.clazz + " for deserialization", (throwable instanceof java.lang.reflect.InvocationTargetException) ? throwable.getCause() : throwable);
    } 
    return null;
  }
  
  public static void registerClass(Class paramClass) {
    DelegateDeserialization delegateDeserialization = (DelegateDeserialization)paramClass.getAnnotation(DelegateDeserialization.class);
    try {
      if (delegateDeserialization == null) {
        registerClass(paramClass, getAlias(paramClass));
        registerClass(paramClass, paramClass.getName());
      } 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public ConfigurationSerializable deserializeViaCtor(Constructor<ConfigurationSerializable> paramConstructor, Map paramMap) {
    long l = a ^ 0x77742D53660EL;
    try {
      return paramConstructor.newInstance(new Object[] { paramMap });
    } catch (Throwable throwable) {
      try {
      
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      Logger.getLogger(ConfigurationSerialization.class.getName()).log(Level.SEVERE, "Could not call constructor '" + paramConstructor.toString() + "' of " + this.clazz + " for deserialization", (throwable instanceof java.lang.reflect.InvocationTargetException) ? throwable.getCause() : throwable);
      return null;
    } 
  }
  
  public ConfigurationSerializable deserialize(Map paramMap) {
    long l = a ^ 0x33542C33826FL;
    Validate.notNull(paramMap, "Args must not be null");
    ConfigurationSerializable configurationSerializable = null;
    Method method = getMethod("deserialize", true);
    if (method != null)
      configurationSerializable = deserializeViaMethod(method, paramMap); 
    if (configurationSerializable == null) {
      method = getMethod("valueOf", true);
      if (method != null)
        configurationSerializable = deserializeViaMethod(method, paramMap); 
    } 
    if (configurationSerializable == null) {
      Constructor constructor = getConstructor();
      if (constructor != null)
        configurationSerializable = deserializeViaCtor(constructor, paramMap); 
    } 
    return configurationSerializable;
  }
  
  public Constructor getConstructor() {
    try {
      return this.clazz.getConstructor(new Class[] { Map.class });
    } catch (NoSuchMethodException|SecurityException noSuchMethodException) {
      return null;
    } 
  }
  
  public Method getMethod(String paramString, boolean paramBoolean) {
    try {
      Method method = this.clazz.getDeclaredMethod(av.b(paramString, this.clazz, new Class[] { Map.class }), new Class[1]);
      if (!ConfigurationSerializable.class.isAssignableFrom(method.getReturnType()))
        return null; 
      try {
        if (Modifier.isStatic(method.getModifiers()) != paramBoolean)
          return null; 
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      return method;
    } catch (NoSuchMethodException|SecurityException noSuchMethodException) {
      return null;
    } 
  }
  
  public static void unregisterClass(String paramString) {
    aliases.remove(paramString);
  }
  
  public static String getAlias(Class paramClass) {
    DelegateDeserialization delegateDeserialization = (DelegateDeserialization)paramClass.getAnnotation(DelegateDeserialization.class);
    try {
      if (delegateDeserialization != null)
        try {
          if (delegateDeserialization.value() != paramClass)
            return getAlias(delegateDeserialization.value()); 
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    SerializableAs serializableAs = (SerializableAs)paramClass.getAnnotation(SerializableAs.class);
    try {
      if (serializableAs != null)
        return serializableAs.value(); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramClass.getName();
  }
  
  public static Class getClassByAlias(String paramString) {
    return (Class)aliases.get(paramString);
  }
  
  public static void unregisterClass(Class paramClass) {
    try {
      do {
      
      } while (aliases.values().remove(paramClass));
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public ConfigurationSerialization(Class paramClass) {
    this.clazz = paramClass;
  }
  
  public static void registerClass(Class<?> paramClass, String paramString) {
    aliases.put(paramString, paramClass);
  }
  
  public static ConfigurationSerializable deserializeObject(Map paramMap, Class paramClass) {
    return (new ConfigurationSerialization(paramClass)).deserialize(paramMap);
  }
  
  public static ConfigurationSerializable deserializeObject(Map paramMap) {
    Class clazz;
    long l = a ^ 0x427532457EE3L;
    if (paramMap.containsKey("==")) {
      try {
        String str = (String)paramMap.get("==");
        try {
          if (str == null)
            throw new IllegalArgumentException("Cannot have null alias"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        } 
        clazz = getClassByAlias(str);
        try {
          if (clazz == null)
            throw new IllegalArgumentException("Specified class does not exist ('" + str + "')"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        } 
      } catch (ClassCastException classCastException) {
        classCastException.fillInStackTrace();
        throw classCastException;
      } 
    } else {
      throw new IllegalArgumentException("Args doesn't contain type key ('==')");
    } 
    return (new ConfigurationSerialization(clazz)).deserialize(paramMap);
  }
  
  static {
    aliases = new HashMap<>();
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\serialization\ConfigurationSerialization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */