package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public final class YamlCommentReader$ReadingExplicitStyle {
  private final int indent;
  
  private StringBuilder valueComment;
  
  private boolean isListKey = false;
  
  private StringBuilder keyComment;
  
  private char step = '?';
  
  private StringBuilder key;
  
  public static final char VALUE = ':';
  
  private boolean finished = false;
  
  public static final char KEY = '?';
  
  private KeyTree$Node node;
  
  private static final long a = o3.a(-4424944923914291646L, 2069442431209903110L, MethodHandles.lookup().lookupClass()).a(110629358242324L);
  
  public boolean isValue() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.step == ':');
  }
  
  public String getValueComment() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.valueComment != null) ? this.valueComment.toString() : null;
  }
  
  public String toString() {
    long l = a ^ 0x31C63B6A1785L;
    return "{step = " + getStep() + ", indent = " + getIndentation() + ", key = " + getKey() + ", keyComment = " + getKeyComment() + ", valueComment = " + getValueComment() + "}";
  }
  
  public String getKeyComment() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.keyComment != null) ? this.keyComment.toString() : null;
  }
  
  public KeyTree$Node getNode() {
    return this.node;
  }
  
  public int getIndentation() {
    return this.indent;
  }
  
  public YamlCommentReader$ReadingExplicitStyle(int paramInt) {
    this.indent = paramInt;
  }
  
  public KeyTree$Node track() {
    try {
      if (this.node == null)
        this.node = YamlCommentReader.this.track(getIndentation(), getKey()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.node;
  }
  
  public boolean isKey() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.step == '?');
  }
  
  public void addKey(String paramString, boolean paramBoolean) {
    long l = a ^ 0x6EFB2768C2B0L;
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty())
            try {
              if (this.key == null) {
                if (paramBoolean) {
                  this.isListKey = true;
                  paramString = '[' + paramString;
                } 
                this.key = new StringBuilder(paramString);
              } else {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                this.key.append(this.isListKey ? ", " : " ").append(paramString);
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
  }
  
  public void addComment(String paramString) {
    try {
      if (isKey()) {
        this.keyComment = addComment(paramString, this.keyComment);
      } else {
        this.valueComment = addComment(paramString, this.valueComment);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean isFinished() {
    return this.finished;
  }
  
  public void finish() {
    track();
    this.finished = true;
  }
  
  public String getStep() {
    long l = a ^ 0x45F760C5B002L;
    try {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isFinished() ? "END" : (isKey() ? "KEY" : "VALUE");
  }
  
  public void valueStep() {
    this.step = ':';
  }
  
  public String getKey() {
    try {
      if (this.key == null)
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = this.key.toString();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.isListKey ? (str + ']') : str;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentReader$ReadingExplicitStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */