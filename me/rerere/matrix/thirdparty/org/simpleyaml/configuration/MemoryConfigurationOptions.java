package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

public class MemoryConfigurationOptions extends ConfigurationOptions {
  public MemoryConfigurationOptions(MemoryConfiguration paramMemoryConfiguration) {
    super(paramMemoryConfiguration);
  }
  
  public MemoryConfigurationOptions pathSeparator(char paramChar) {
    super.pathSeparator(paramChar);
    return this;
  }
  
  public MemoryConfiguration configuration() {
    return (MemoryConfiguration)super.configuration();
  }
  
  public MemoryConfigurationOptions copyDefaults(boolean paramBoolean) {
    super.copyDefaults(paramBoolean);
    return this;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\MemoryConfigurationOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */