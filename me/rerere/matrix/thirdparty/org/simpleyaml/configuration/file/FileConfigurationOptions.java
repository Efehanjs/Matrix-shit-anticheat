package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.Configuration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfiguration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.CommentFormatter;

public class FileConfigurationOptions extends MemoryConfigurationOptions {
  private Charset charset = StandardCharsets.UTF_8;
  
  private CommentFormatter headerFormatter;
  
  private boolean copyHeader = true;
  
  private String header = null;
  
  private static final long b = o3.a(7208619083527959936L, -3622443608796975491L, MethodHandles.lookup().lookupClass()).a(218717998645943L);
  
  public FileConfigurationOptions copyHeader(boolean paramBoolean) {
    this.copyHeader = paramBoolean;
    return this;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.charset, this.header, Boolean.valueOf(this.copyHeader), this.headerFormatter });
  }
  
  public Charset charset() {
    return this.charset;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!(paramObject instanceof FileConfigurationOptions))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!super.equals(paramObject))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    FileConfigurationOptions fileConfigurationOptions = (FileConfigurationOptions)paramObject;
    try {
      if (this.copyHeader == fileConfigurationOptions.copyHeader)
        try {
          if (Objects.equals(this.charset, fileConfigurationOptions.charset))
            try {
              if (Objects.equals(this.header, fileConfigurationOptions.header))
                try {
                  if (Objects.equals(this.headerFormatter, fileConfigurationOptions.headerFormatter));
                } catch (RuntimeException runtimeException) {
                  throw b(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw b(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return false;
  }
  
  public boolean copyHeader() {
    return this.copyHeader;
  }
  
  public FileConfiguration configuration() {
    return (FileConfiguration)super.configuration();
  }
  
  public CommentFormatter headerFormatter() {
    return this.headerFormatter;
  }
  
  public FileConfigurationOptions headerFormatter(CommentFormatter paramCommentFormatter) {
    this.headerFormatter = paramCommentFormatter;
    return this;
  }
  
  public FileConfigurationOptions charset(Charset paramCharset) {
    this.charset = paramCharset;
    return this;
  }
  
  public FileConfigurationOptions copyDefaults(boolean paramBoolean) {
    super.copyDefaults(paramBoolean);
    return this;
  }
  
  public boolean isUnicode() {
    long l = b ^ 0x7D50B530B0E9L;
    return this.charset.name().startsWith("UTF");
  }
  
  public FileConfigurationOptions pathSeparator(char paramChar) {
    super.pathSeparator(paramChar);
    return this;
  }
  
  public FileConfigurationOptions header(String paramString) {
    this.header = paramString;
    return this;
  }
  
  public String header() {
    return this.header;
  }
  
  public FileConfigurationOptions(MemoryConfiguration paramMemoryConfiguration) {
    super(paramMemoryConfiguration);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\FileConfigurationOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */