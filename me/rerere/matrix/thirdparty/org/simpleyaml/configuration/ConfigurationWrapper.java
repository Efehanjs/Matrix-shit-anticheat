package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class ConfigurationWrapper {
  public final Configuration configuration;
  
  public final ConfigurationWrapper parent;
  
  public final String path;
  
  private static final long a = o3.a(-3097710414508336315L, 4364483310865312595L, MethodHandles.lookup().lookupClass()).a(58630706376993L);
  
  public ConfigurationWrapper addDefault(Object paramObject) {
    return set(this.configuration::addDefault, paramObject);
  }
  
  public ConfigurationWrapper path(String paramString) {
    return new ConfigurationWrapper(this.configuration, paramString, this);
  }
  
  public final String childPath(String paramString) {
    try {
      if (this.path == null)
        return paramString; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.path + this.configuration.options().pathSeparator() + paramString;
  }
  
  public ConfigurationWrapper(Configuration paramConfiguration, String paramString) {
    this(paramConfiguration, paramString, null);
  }
  
  public ConfigurationWrapper parent() {
    try {
      if (this.parent == null && this.path != null) {
        int i = this.path.lastIndexOf(this.configuration.options().pathSeparator());
        try {
          if (i >= 0)
            return new ConfigurationWrapper(this.configuration, this.path.substring(0, i)); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.parent;
  }
  
  public ConfigurationWrapper addDefault(String paramString, Object paramObject) {
    return setToChild(this.configuration::addDefault, paramString, paramObject);
  }
  
  public ConfigurationWrapper applyToChild(ConfigurationWrapper$ApplyToPath paramConfigurationWrapper$ApplyToPath, String paramString) {
    paramConfigurationWrapper$ApplyToPath.apply(childPath(paramString));
    return this;
  }
  
  public String getCurrentPath() {
    return this.path;
  }
  
  public ConfigurationWrapper set(ConfigurationWrapper$SetToPath paramConfigurationWrapper$SetToPath, Object paramObject) {
    paramConfigurationWrapper$SetToPath.set(this.path, paramObject);
    return this;
  }
  
  public ConfigurationWrapper(Configuration paramConfiguration, String paramString, ConfigurationWrapper paramConfigurationWrapper) {
    Validate.notNull(paramConfiguration, "configuration cannot be null!");
    this.configuration = paramConfiguration;
    this.path = (paramConfigurationWrapper == null) ? paramString : paramConfigurationWrapper.childPath(paramString);
    this.parent = paramConfigurationWrapper;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ConfigurationWrapper configurationWrapper = (ConfigurationWrapper)paramObject;
    try {
      if (this.configuration == configurationWrapper.configuration)
        try {
          if (Objects.equals(this.path, configurationWrapper.path))
            try {
              if (Objects.equals(this.parent, configurationWrapper.parent));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public ConfigurationWrapper apply(ConfigurationWrapper$ApplyToPath paramConfigurationWrapper$ApplyToPath) {
    paramConfigurationWrapper$ApplyToPath.apply(this.path);
    return this;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.configuration, this.path, this.parent });
  }
  
  public ConfigurationWrapper createSection(String paramString) {
    return applyToChild(this.configuration::createSection, paramString);
  }
  
  public ConfigurationWrapper setToChild(ConfigurationWrapper$SetToPath paramConfigurationWrapper$SetToPath, String paramString, Object paramObject) {
    paramConfigurationWrapper$SetToPath.set(childPath(paramString), paramObject);
    return this;
  }
  
  public ConfigurationWrapper createSection() {
    return apply(this.configuration::createSection);
  }
  
  public ConfigurationWrapper setChild(String paramString, Object paramObject) {
    return setToChild(this.configuration::set, paramString, paramObject);
  }
  
  public ConfigurationWrapper set(Object paramObject) {
    return set(this.configuration::set, paramObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\ConfigurationWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */