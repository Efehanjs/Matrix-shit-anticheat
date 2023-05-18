package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.Commentable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentMapper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;

public abstract class YamlImplementationCommentable implements YamlImplementation, Commentable {
  public YamlCommentMapper yamlCommentMapper;
  
  public YamlConfigurationOptions options;
  
  public String getComment(String paramString, CommentType paramCommentType) {
    try {
      if (this.yamlCommentMapper == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.yamlCommentMapper.getComment(paramString, paramCommentType);
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType) {
    try {
      if (this.yamlCommentMapper != null)
        this.yamlCommentMapper.setComment(paramString1, paramString2, paramCommentType); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public YamlCommentMapper getCommentMapper() {
    return this.yamlCommentMapper;
  }
  
  public void configure(YamlConfigurationOptions paramYamlConfigurationOptions) {
    this.options = paramYamlConfigurationOptions;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\api\YamlImplementationCommentable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */