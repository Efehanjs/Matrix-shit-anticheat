package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.Configuration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationWrapper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormat;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteStyle;

public class YamlFileWrapper extends ConfigurationWrapper {
  public YamlFileWrapper comment(String paramString, YamlCommentFormatter paramYamlCommentFormatter) {
    ((YamlFile)this.configuration).setComment(this.path, paramString, CommentType.BLOCK, paramYamlCommentFormatter);
    return this;
  }
  
  public YamlFileWrapper setChild(String paramString, Object paramObject) {
    super.setChild(paramString, paramObject);
    return this;
  }
  
  public YamlFileWrapper addDefault(String paramString, Object paramObject) {
    super.addDefault(paramString, paramObject);
    return this;
  }
  
  public YamlFileWrapper setChild(String paramString, Object paramObject, QuoteStyle paramQuoteStyle) {
    ((YamlFile)this.configuration).set(childPath(paramString), paramObject, paramQuoteStyle);
    return this;
  }
  
  public YamlFileWrapper path(String paramString) {
    return new YamlFileWrapper((YamlFile)this.configuration, paramString, this);
  }
  
  public YamlFileWrapper(YamlFile paramYamlFile, String paramString, YamlFileWrapper paramYamlFileWrapper) {
    super((Configuration)paramYamlFile, paramString, paramYamlFileWrapper);
  }
  
  public YamlFileWrapper comment(String paramString) {
    ((YamlFile)this.configuration).setComment(this.path, paramString, CommentType.BLOCK);
    return this;
  }
  
  public YamlFileWrapper createSection(String paramString) {
    super.createSection(paramString);
    return this;
  }
  
  public YamlFileWrapper set(Object paramObject) {
    super.set(paramObject);
    return this;
  }
  
  public YamlFileWrapper blankLine() {
    apply((YamlFile)this.configuration::setBlankLine);
    return this;
  }
  
  public YamlFileWrapper(YamlFile paramYamlFile, String paramString) {
    super((Configuration)paramYamlFile, paramString);
  }
  
  public YamlFileWrapper set(Object paramObject, QuoteStyle paramQuoteStyle) {
    ((YamlFile)this.configuration).set(this.path, paramObject, paramQuoteStyle);
    return this;
  }
  
  public YamlFileWrapper commentSide(String paramString, YamlCommentFormatter paramYamlCommentFormatter) {
    ((YamlFile)this.configuration).setComment(this.path, paramString, CommentType.SIDE, paramYamlCommentFormatter);
    return this;
  }
  
  public YamlFileWrapper addDefault(Object paramObject) {
    super.addDefault(paramObject);
    return this;
  }
  
  public YamlFileWrapper commentSide(String paramString, YamlCommentFormat paramYamlCommentFormat) {
    ((YamlFile)this.configuration).setComment(this.path, paramString, CommentType.SIDE, paramYamlCommentFormat);
    return this;
  }
  
  public YamlFileWrapper createSection() {
    super.createSection();
    return this;
  }
  
  public YamlFileWrapper commentSide(String paramString) {
    ((YamlFile)this.configuration).setComment(this.path, paramString, CommentType.SIDE);
    return this;
  }
  
  public YamlFileWrapper comment(String paramString, YamlCommentFormat paramYamlCommentFormat) {
    ((YamlFile)this.configuration).setComment(this.path, paramString, CommentType.BLOCK, paramYamlCommentFormat);
    return this;
  }
  
  public YamlFileWrapper parent() {
    try {
      if (this.parent == null && this.path != null) {
        int i = this.path.lastIndexOf(((YamlFile)this.configuration).options().pathSeparator());
        try {
          if (i >= 0)
            return new YamlFileWrapper((YamlFile)this.configuration, this.path.substring(0, i)); 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (YamlFileWrapper)this.parent;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\YamlFileWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */