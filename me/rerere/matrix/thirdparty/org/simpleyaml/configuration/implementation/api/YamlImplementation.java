package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.SupplierIO;

public interface YamlImplementation {
  default String dump(ConfigurationSection paramConfigurationSection) throws IOException {
    StringWriter stringWriter = new StringWriter();
    dump(stringWriter, paramConfigurationSection);
    return stringWriter.toString();
  }
  
  void dump(Writer paramWriter, ConfigurationSection paramConfigurationSection) throws IOException;
  
  void load(Reader paramReader, ConfigurationSection paramConfigurationSection) throws IOException, InvalidConfigurationException;
  
  default void load(SupplierIO.Reader paramReader, ConfigurationSection paramConfigurationSection) throws IOException, InvalidConfigurationException {
    load((Reader)paramReader.get(), paramConfigurationSection);
  }
  
  default void load(String paramString, ConfigurationSection paramConfigurationSection) throws IOException, InvalidConfigurationException {
    load(new StringReader(paramString), paramConfigurationSection);
  }
  
  void configure(YamlConfigurationOptions paramYamlConfigurationOptions);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\api\YamlImplementation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */