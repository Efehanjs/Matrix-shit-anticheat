package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class MemoryConfiguration extends MemorySection implements Configuration {
  public Configuration defaults;
  
  public MemoryConfigurationOptions options;
  
  private static final long a = o3.a(7151562918515345839L, 3214692546716893378L, MethodHandles.lookup().lookupClass()).a(158262921557780L);
  
  public MemoryConfiguration() {}
  
  public void addDefaults(Map paramMap) {
    long l = a ^ 0x36A95A1FFC66L;
    Validate.notNull(paramMap, "Defaults may not be null");
    for (Map.Entry entry : paramMap.entrySet())
      addDefault((String)entry.getKey(), entry.getValue()); 
  }
  
  public MemoryConfigurationOptions options() {
    try {
      if (this.options == null)
        this.options = new MemoryConfigurationOptions(this); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.options;
  }
  
  public void addDefaults(Configuration paramConfiguration) {
    long l = a ^ 0x407B62971C3EL;
    Validate.notNull(paramConfiguration, "Defaults may not be null");
    for (String str : paramConfiguration.getKeys(true)) {
      try {
        if (!paramConfiguration.isConfigurationSection(str))
          addDefault(str, paramConfiguration.get(str)); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void setDefaults(Configuration paramConfiguration) {
    long l = a ^ 0x2AB2EFB018DDL;
    Validate.notNull(paramConfiguration, "Defaults may not be null");
    this.defaults = paramConfiguration;
  }
  
  public MemoryConfiguration(Configuration paramConfiguration) {
    this.defaults = paramConfiguration;
  }
  
  public Configuration getDefaults() {
    return this.defaults;
  }
  
  public ConfigurationSection getParent() {
    return null;
  }
  
  public void addDefault(String paramString, Object paramObject) {
    long l = a ^ 0x34E3D79C3220L;
    try {
      Validate.notNull(paramString, "Path may not be null");
      if (this.defaults == null)
        this.defaults = new MemoryConfiguration(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.defaults.set(paramString, paramObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\MemoryConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */