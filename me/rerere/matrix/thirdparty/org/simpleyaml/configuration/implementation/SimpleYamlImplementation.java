package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentDumper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentMapper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentParser;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfiguration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlFile;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.SnakeYamlConstructor;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.SnakeYamlImplementation;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.SnakeYamlRepresenter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.SectionUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.SupplierIO;

public class SimpleYamlImplementation extends SnakeYamlImplementation {
  private static final long a = o3.a(-2966460436767039810L, -321887030052697473L, MethodHandles.lookup().lookupClass()).a(49333478196061L);
  
  public void load(SupplierIO.Reader paramReader, ConfigurationSection paramConfigurationSection) throws IOException, InvalidConfigurationException {
    try {
      if (paramReader != null)
        try {
          load((Reader)paramReader.get(), paramConfigurationSection);
          if (this.options.useComments())
            parseComments((Reader)paramReader.get()); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public SimpleYamlImplementation() {
    super(new SnakeYamlRepresenter());
  }
  
  public void dump(Writer paramWriter, ConfigurationSection paramConfigurationSection) throws IOException {
    try {
      configure(this.options);
      if (hasContent(paramWriter, paramConfigurationSection))
        if (this.options.useComments()) {
          YamlCommentDumper yamlCommentDumper = new YamlCommentDumper(parseComments(), paramWriter -> dumpYaml(paramWriter, paramConfigurationSection), paramWriter);
          yamlCommentDumper.dump();
        } else {
          dumpYaml(paramWriter, paramConfigurationSection);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void configure(YamlConfigurationOptions paramYamlConfigurationOptions) {
    super.configure(paramYamlConfigurationOptions);
    getLoaderOptions().setProcessComments(false);
    getDumperOptions().setProcessComments(false);
  }
  
  public YamlCommentMapper parseComments(Reader paramReader) throws InvalidConfigurationException {
    try {
      try {
        if (paramReader != null) {
          this.yamlCommentMapper = (YamlCommentMapper)new YamlCommentParser(this.options, paramReader);
          ((YamlCommentParser)this.yamlCommentMapper).parse();
        } else {
          this.yamlCommentMapper = new YamlCommentMapper(this.options);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return this.yamlCommentMapper;
    } catch (IOException iOException) {
      throw new InvalidConfigurationException(iOException);
    } 
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType) {
    try {
      if (this.yamlCommentMapper == null) {
        this.options.useComments(true);
        this.yamlCommentMapper = new YamlCommentMapper(this.options);
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    this.yamlCommentMapper.setComment(paramString1, paramString2, paramCommentType);
  }
  
  public SimpleYamlImplementation(SnakeYamlRepresenter paramSnakeYamlRepresenter) {
    super(paramSnakeYamlRepresenter);
  }
  
  public SimpleYamlImplementation(SnakeYamlConstructor paramSnakeYamlConstructor, SnakeYamlRepresenter paramSnakeYamlRepresenter, DumperOptions paramDumperOptions) {
    super(paramSnakeYamlConstructor, paramSnakeYamlRepresenter, paramDumperOptions);
  }
  
  public void load(Reader paramReader, ConfigurationSection paramConfigurationSection) throws IOException, InvalidConfigurationException {
    long l = a ^ 0x757EBAEDFB4EL;
    try {
      configure(this.options);
      if (paramReader != null && paramConfigurationSection != null)
        try {
          Map map = (Map)getYaml().load(paramReader);
          try {
            if (map != null)
              SectionUtils.convertMapsToSections(map, paramConfigurationSection); 
          } catch (YAMLException yAMLException) {
            throw a(null);
          } 
        } catch (YAMLException yAMLException) {
          throw new InvalidConfigurationException(yAMLException);
        } catch (ClassCastException classCastException) {
          throw new InvalidConfigurationException("Top level is not a Map.");
        } finally {
          paramReader.close();
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\SimpleYamlImplementation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */