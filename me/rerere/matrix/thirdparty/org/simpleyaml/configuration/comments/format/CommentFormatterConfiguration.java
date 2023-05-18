package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public class CommentFormatterConfiguration {
  private String prefixMultiline;
  
  private String prefixFirst;
  
  private String suffixMultiline;
  
  private String suffixLast;
  
  private static final long a = o3.a(2825654814162988194L, 906207983819820077L, MethodHandles.lookup().lookupClass()).a(71664784974971L);
  
  public String suffixMultiline(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.suffixMultiline != null) ? this.suffixMultiline : paramString;
  }
  
  public String suffixLast(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.suffixLast != null) ? this.suffixLast : paramString;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.prefixFirst, this.prefixMultiline, this.suffixMultiline, this.suffixLast });
  }
  
  public CommentFormatterConfiguration suffix(String paramString1, String paramString2) {
    this.suffixLast = paramString1;
    this.suffixMultiline = paramString2;
    return this;
  }
  
  public String prefixFirst(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.prefixFirst != null) ? this.prefixFirst : paramString;
  }
  
  public String prefixMultiline(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.prefixMultiline != null) ? this.prefixMultiline : prefixFirst(paramString);
  }
  
  public String prefixMultiline() {
    return prefixMultiline("");
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    CommentFormatterConfiguration commentFormatterConfiguration = (CommentFormatterConfiguration)paramObject;
    try {
      if (Objects.equals(this.prefixFirst, commentFormatterConfiguration.prefixFirst))
        try {
          if (Objects.equals(this.prefixMultiline, commentFormatterConfiguration.prefixMultiline))
            try {
              if (Objects.equals(this.suffixMultiline, commentFormatterConfiguration.suffixMultiline))
                try {
                  if (Objects.equals(this.suffixLast, commentFormatterConfiguration.suffixLast));
                } catch (RuntimeException runtimeException) {
                  throw a(null);
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
    return false;
  }
  
  public String prefixFirst() {
    return prefixFirst("");
  }
  
  public CommentFormatterConfiguration prefix(String paramString1, String paramString2) {
    this.prefixFirst = paramString1;
    this.prefixMultiline = paramString2;
    return this;
  }
  
  public CommentFormatterConfiguration suffix(String paramString) {
    this.suffixLast = paramString;
    return this;
  }
  
  public String suffixLast() {
    return suffixLast("");
  }
  
  public CommentFormatterConfiguration prefix(String paramString) {
    return prefix(paramString, paramString);
  }
  
  public String suffixMultiline() {
    return suffixMultiline("");
  }
  
  public String toString() {
    long l = a ^ 0x2AA0A29F95F9L;
    return StringUtils.quoteNewLines("{prefixFirst='" + this.prefixFirst + '\'' + ", prefixMultiline='" + this.prefixMultiline + '\'' + ", suffixMultiline='" + this.suffixMultiline + '\'' + ", suffixLast='" + this.suffixLast + '\'' + '}');
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\CommentFormatterConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */