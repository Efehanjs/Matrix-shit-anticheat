package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlCommentFormatterConfiguration extends CommentFormatterConfiguration {
  private boolean trim = true;
  
  private boolean stripPrefix = false;
  
  public static final String COMMENT_INDICATOR = "#";
  
  public static final String DEFAULT_COMMENT_PREFIX = "# ";
  
  private static final long b = o3.a(2781243224503604658L, 8147675640482190011L, MethodHandles.lookup().lookupClass()).a(239888833783510L);
  
  public YamlCommentFormatterConfiguration stripPrefix(boolean paramBoolean) {
    this.stripPrefix = paramBoolean;
    return this;
  }
  
  public YamlCommentFormatterConfiguration(String paramString) {
    prefix(paramString);
  }
  
  public YamlCommentFormatterConfiguration(String paramString1, String paramString2) {
    prefix(paramString1, paramString2);
  }
  
  public YamlCommentFormatterConfiguration prefix(String paramString1, String paramString2) {
    checkCommentPrefix(paramString1);
    checkCommentPrefixMultiline(paramString2);
    super.prefix(paramString1, paramString2);
    return this;
  }
  
  public String toString() {
    long l = b ^ 0x296985557A31L;
    return "{stripPrefix=" + this.stripPrefix + ", trim=" + this.trim + ", " + super.toString() + '}';
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Boolean.valueOf(this.stripPrefix), Boolean.valueOf(this.trim) });
  }
  
  public YamlCommentFormatterConfiguration suffix(String paramString1, String paramString2) {
    checkCommentSuffix(paramString1);
    checkCommentSuffixMultiline(paramString2);
    super.suffix(paramString1, paramString2);
    return this;
  }
  
  public YamlCommentFormatterConfiguration trim(boolean paramBoolean) {
    this.trim = paramBoolean;
    return this;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!super.equals(paramObject))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    YamlCommentFormatterConfiguration yamlCommentFormatterConfiguration = (YamlCommentFormatterConfiguration)paramObject;
    try {
      if (this.stripPrefix == yamlCommentFormatterConfiguration.stripPrefix)
        try {
          if (this.trim == yamlCommentFormatterConfiguration.trim);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean trim() {
    return this.trim;
  }
  
  public boolean stripPrefix() {
    return this.stripPrefix;
  }
  
  public YamlCommentFormatterConfiguration() {
    this("# ");
  }
  
  public YamlCommentFormatterConfiguration suffix(String paramString) {
    checkCommentSuffix(paramString);
    super.suffix(paramString);
    return this;
  }
  
  public void checkCommentSuffix(String paramString) {
    long l = b ^ 0x833AD7F1353L;
    Validate.notNull(paramString, "Comment suffix cannot be null");
    Validate.isTrue(StringUtils.allLinesArePrefixedOrBlank(StringUtils.afterNewLine(paramString), "#"), "All comment suffix lines must be blank or optional space followed by a #");
  }
  
  public void checkCommentPrefix(String paramString) {
    long l = b ^ 0x111421D3F1C7L;
    Validate.notNull(paramString, "Comment prefix cannot be null");
    String[] arrayOfString = StringUtils.lines(paramString, false);
    int i = arrayOfString.length - 1;
    for (byte b = 0; b <= i; b++) {
      String str = arrayOfString[b].trim();
      try {
        if (b == i)
          try {
            if (!str.startsWith("#"))
              throw new IllegalArgumentException("Last prefix line must be optional space followed by a #"); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (!str.isEmpty())
          try {
            if (!str.startsWith("#"))
              throw new IllegalArgumentException("All comment prefix lines must be blank or optional space followed by a #"); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public void checkCommentSuffixMultiline(String paramString) {
    checkCommentSuffix(paramString);
  }
  
  public YamlCommentFormatterConfiguration prefix(String paramString) {
    checkCommentPrefix(paramString);
    super.prefix(paramString, paramString);
    return this;
  }
  
  public void checkCommentPrefixMultiline(String paramString) {
    checkCommentPrefix(paramString);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\YamlCommentFormatterConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */