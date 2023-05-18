package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.util.Map;

public interface Configuration extends ConfigurationSection {
  void setDefaults(Configuration paramConfiguration);
  
  void addDefault(String paramString, Object paramObject);
  
  Configuration getDefaults();
  
  void addDefaults(Map paramMap);
  
  ConfigurationOptions options();
  
  void addDefaults(Configuration paramConfiguration);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\Configuration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */