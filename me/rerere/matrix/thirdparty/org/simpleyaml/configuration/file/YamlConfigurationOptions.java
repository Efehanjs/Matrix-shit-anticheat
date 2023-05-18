package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.Configuration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfiguration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.CommentFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormat;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlHeaderFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlConfigurationOptions extends FileConfigurationOptions {
  private boolean useComments = false;
  
  private int indentList = 2;
  
  private YamlCommentFormatter commentFormatter;
  
  private final YamlConfigurationOptions$QuoteStyleDefaults quoteStyleDefaults = new YamlConfigurationOptions$QuoteStyleDefaults(null);
  
  private static final long c = o3.a(-1908021568307212512L, 4478130756936384493L, MethodHandles.lookup().lookupClass()).a(247921903481481L);
  
  public YamlConfigurationOptions copyDefaults(boolean paramBoolean) {
    super.copyDefaults(paramBoolean);
    return this;
  }
  
  public YamlConfigurationOptions useComments(boolean paramBoolean) {
    this.useComments = paramBoolean;
    return this;
  }
  
  public YamlConfiguration configuration() {
    return (YamlConfiguration)super.configuration();
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.indentList), this.commentFormatter });
  }
  
  public YamlConfigurationOptions commentFormatter(YamlCommentFormatter paramYamlCommentFormatter) {
    this.commentFormatter = paramYamlCommentFormatter;
    return this;
  }
  
  public YamlConfigurationOptions indent(int paramInt) {
    long l = c ^ 0x7ECF78B5CBB1L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      Validate.isTrue((paramInt >= 2), "Indent must be at least 2 characters");
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    Validate.isTrue((paramInt <= 9), "Indent cannot be greater than 9 characters");
    super.indent(paramInt);
    return this;
  }
  
  public YamlConfigurationOptions pathSeparator(char paramChar) {
    super.pathSeparator(paramChar);
    return this;
  }
  
  public YamlConfigurationOptions copyHeader(boolean paramBoolean) {
    super.copyHeader(paramBoolean);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (!(paramObject instanceof YamlConfigurationOptions))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (!super.equals(paramObject))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    YamlConfigurationOptions yamlConfigurationOptions = (YamlConfigurationOptions)paramObject;
    try {
      if (this.indentList == yamlConfigurationOptions.indentList)
        try {
          if (Objects.equals(this.commentFormatter, yamlConfigurationOptions.commentFormatter));
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public YamlConfigurationOptions indentList(int paramInt) {
    long l = c ^ 0x327BF9B35A45L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      Validate.isTrue((paramInt >= 0), "List indent must be at least 0 characters");
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    Validate.isTrue((paramInt <= indent()), "List indent cannot be greater than the indent");
    this.indentList = paramInt;
    return this;
  }
  
  public YamlConfigurationOptions header(String paramString) {
    super.header(paramString);
    return this;
  }
  
  public int indentList() {
    return this.indentList;
  }
  
  public YamlConfigurationOptions headerFormatter(CommentFormatter paramCommentFormatter) {
    long l = c ^ 0x88BEB592344L;
    Validate.isTrue(paramCommentFormatter instanceof YamlHeaderFormatter, "The header formatter must inherit YamlHeaderFormatter");
    super.headerFormatter(paramCommentFormatter);
    return this;
  }
  
  public YamlConfigurationOptions(YamlConfiguration paramYamlConfiguration) {
    super(paramYamlConfiguration);
    headerFormatter((CommentFormatter)new YamlHeaderFormatter());
  }
  
  public boolean useComments() {
    return this.useComments;
  }
  
  public YamlConfigurationOptions$QuoteStyleDefaults quoteStyleDefaults() {
    return this.quoteStyleDefaults;
  }
  
  public YamlCommentFormatter commentFormatter() {
    try {
      if (this.commentFormatter == null)
        this.commentFormatter = YamlCommentFormat.DEFAULT.commentFormatter(); 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return this.commentFormatter;
  }
  
  public YamlConfigurationOptions charset(Charset paramCharset) {
    super.charset(paramCharset);
    return this;
  }
  
  public YamlHeaderFormatter headerFormatter() {
    return (YamlHeaderFormatter)super.headerFormatter();
  }
  
  private static RuntimeException c(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\YamlConfigurationOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */