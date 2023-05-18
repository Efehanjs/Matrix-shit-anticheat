package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlHeaderFormatter implements CommentFormatter {
  public YamlCommentFormatterConfiguration configuration;
  
  private static final long a = o3.a(4720044971907762710L, -2053540029918003336L, MethodHandles.lookup().lookupClass()).a(219824976756668L);
  
  public String dump(String paramString, CommentType paramCommentType, KeyTree.Node paramNode) {
    try {
      if (paramString == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    if (!StringUtils.allLinesArePrefixed(paramString, "#")) {
      str2 = commentPrefix();
      str1 = this.configuration.prefixFirst(str2);
      str4 = this.configuration.suffixMultiline();
      if (!str1.equals(str2)) {
        String str = '\n' + str2;
        if (!str1.endsWith(str))
          str1 = str1 + str; 
      } 
    } 
    if (!paramString.endsWith(this.configuration.suffixLast()))
      str3 = this.configuration.suffixLast(); 
    try {
      if (str3 != null)
        try {
          if (str4 != null && !str4.isEmpty()) {
            String str = str4 + '\n';
            if (!str3.startsWith(str))
              str3 = str + str3; 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return CommentFormatter.format(str1, str2, paramString, str4, str3);
  }
  
  public YamlHeaderFormatter suffixLast(String paramString) {
    long l = a ^ 0x3B791DC024DAL;
    if (paramString == null) {
      paramString = "\n\n";
    } else if (!paramString.endsWith("\n\n")) {
      paramString = paramString + "\n\n";
    } 
    this.configuration.suffix(paramString);
    return this;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.configuration });
  }
  
  public String parse(Reader paramReader, CommentType paramCommentType, KeyTree.Node paramNode) throws IOException {
    try {
      if (paramReader == null)
        return null; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    try {
    
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    BufferedReader bufferedReader = (paramReader instanceof BufferedReader) ? (BufferedReader)paramReader : new BufferedReader(paramReader);
    Throwable throwable = null;
    try {
      StringBuilder stringBuilder = new StringBuilder();
      boolean bool;
      String str;
      for (bool = false; (str = bufferedReader.readLine()) != null; bool = false) {
        String str1 = str.trim();
        try {
          if (str1.isEmpty()) {
            try {
              if (bool)
                break; 
            } catch (Throwable throwable1) {
              throw a(null);
            } 
            stringBuilder.append('\n');
            continue;
          } 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        try {
          if (str1.startsWith("#")) {
            if (stripPrefix())
              str = StringUtils.stripPrefix(str1, commentPrefix(), "#"); 
            try {
              if (bool) {
                stringBuilder.append('\n');
              } else {
                bool = true;
              } 
            } catch (Throwable throwable1) {
              throw a(null);
            } 
            stringBuilder.append(str);
            continue;
          } 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
      } 
      if (bool)
        return stringBuilder.toString(); 
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      try {
        if (bufferedReader != null)
          if (throwable != null) {
            try {
              bufferedReader.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            } 
          } else {
            bufferedReader.close();
          }  
      } catch (Throwable throwable1) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public YamlHeaderFormatter() {
    this("# ", false);
  }
  
  public String commentPrefix() {
    long l = a ^ 0x195E8F37E600L;
    return this.configuration.prefixMultiline("# ");
  }
  
  public String parse(String paramString, CommentType paramCommentType, KeyTree.Node paramNode) throws IOException {
    try {
      if (paramString == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return parse(new StringReader(paramString), paramCommentType, paramNode);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            YamlHeaderFormatter yamlHeaderFormatter = (YamlHeaderFormatter)paramObject;
            return Objects.equals(this.configuration, yamlHeaderFormatter.configuration);
          } 
          return false;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean stripPrefix() {
    return this.configuration.stripPrefix();
  }
  
  public YamlHeaderFormatter stripPrefix(boolean paramBoolean) {
    this.configuration.stripPrefix(paramBoolean);
    return this;
  }
  
  public YamlHeaderFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration) {
    Validate.notNull(paramYamlCommentFormatterConfiguration);
    this.configuration = paramYamlCommentFormatterConfiguration;
  }
  
  public YamlHeaderFormatter(String paramString, boolean paramBoolean) {
    this((new YamlCommentFormatterConfiguration()).prefix(paramString).stripPrefix(paramBoolean).suffix("\n\n"));
  }
  
  public YamlHeaderFormatter prefixFirst(String paramString) {
    this.configuration.prefix(paramString, commentPrefix());
    return this;
  }
  
  public YamlHeaderFormatter commentPrefix(String paramString) {
    long l = a ^ 0x25AED090DDFAL;
    String str = this.configuration.prefixFirst("# ");
    if (str.equals("# "))
      str = paramString; 
    this.configuration.prefix(str, paramString);
    return this;
  }
  
  public YamlHeaderFormatter commentSuffix(String paramString) {
    long l = a ^ 0x6CA0891FCAB6L;
    this.configuration.suffix(this.configuration.suffixLast("\n\n"), paramString);
    return this;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\YamlHeaderFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */