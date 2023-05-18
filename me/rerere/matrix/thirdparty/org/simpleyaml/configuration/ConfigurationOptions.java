package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class ConfigurationOptions {
  private int indent = 2;
  
  private char pathSeparator = '.';
  
  private boolean copyDefaults = true;
  
  private final Configuration configuration;
  
  private static final long a = o3.a(-8133808957319846915L, -4788895463623919459L, MethodHandles.lookup().lookupClass()).a(256273684270100L);
  
  public ConfigurationOptions(Configuration paramConfiguration) {
    this.configuration = paramConfiguration;
  }
  
  public char pathSeparator() {
    return this.pathSeparator;
  }
  
  public ConfigurationOptions indent(int paramInt) {
    this.indent = paramInt;
    return this;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.indent), Character.valueOf(this.pathSeparator), Boolean.valueOf(this.copyDefaults), this.configuration });
  }
  
  public ConfigurationOptions copyDefaults(boolean paramBoolean) {
    this.copyDefaults = paramBoolean;
    return this;
  }
  
  public boolean copyDefaults() {
    return this.copyDefaults;
  }
  
  public ConfigurationOptions pathSeparator(char paramChar) {
    long l = a ^ 0x459F13257ED9L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      Validate.isTrue((paramChar != '\\'), paramChar + " is used for escaping and cannot be a path separator");
      if (paramChar != '[')
        try {
          if (paramChar != ']');
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Validate.isTrue(false, paramChar + " is used for indexing and cannot be a path separator");
    this.pathSeparator = paramChar;
    StringUtils.setSeparator(paramChar);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof ConfigurationOptions))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ConfigurationOptions configurationOptions = (ConfigurationOptions)paramObject;
    try {
      if (this.indent == configurationOptions.indent)
        try {
          if (this.pathSeparator == configurationOptions.pathSeparator)
            try {
              if (this.copyDefaults == configurationOptions.copyDefaults)
                try {
                  if (Objects.equals(this.configuration, configurationOptions.configuration));
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
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
  
  public Configuration configuration() {
    return this.configuration;
  }
  
  public int indent() {
    return this.indent;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\ConfigurationOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */