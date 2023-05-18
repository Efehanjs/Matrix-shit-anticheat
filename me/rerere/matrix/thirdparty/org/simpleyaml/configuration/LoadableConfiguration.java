package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;

public interface LoadableConfiguration {
  void loadFromString(String paramString) throws IOException, InvalidConfigurationException;
  
  String saveToString() throws IOException;
  
  void save(Writer paramWriter) throws IOException;
  
  void load(Reader paramReader) throws IOException, InvalidConfigurationException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\LoadableConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */