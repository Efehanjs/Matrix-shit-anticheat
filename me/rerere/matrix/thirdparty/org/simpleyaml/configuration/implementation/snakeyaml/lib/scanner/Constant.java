package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;

public final class Constant {
  private static final String FULL_LINEBR_S = "\r\n  ";
  
  private String content;
  
  private static final String URI_CHARS_S = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%";
  
  public static final Constant NULL_BL_LINEBR;
  
  public static final Constant NULL_BL_T_LINEBR;
  
  public boolean[] contains = new boolean[128];
  
  public static final Constant NULL_OR_LINEBR;
  
  private static final String LINEBR_S = "\n  ";
  
  private static final String NULL_BL_LINEBR_S = " \000\r\n  ";
  
  public static final Constant URI_CHARS;
  
  private static final String NULL_BL_T_LINEBR_S = "\t \000\r\n  ";
  
  public static final Constant NULL_BL_T;
  
  public static final Constant LINEBR = new Constant("\n  ");
  
  public static final Constant ALPHA;
  
  public boolean noASCII = false;
  
  private static final String NULL_BL_T_S = "\000 \t";
  
  private static final String NULL_OR_LINEBR_S = "\000\r\n  ";
  
  private static final String ALPHA_S = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
  
  public boolean hasNo(int paramInt, String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !has(paramInt, paramString);
  }
  
  public boolean hasNo(int paramInt) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !has(paramInt);
  }
  
  static {
    NULL_OR_LINEBR = new Constant("\000\r\n  ");
    NULL_BL_LINEBR = new Constant(" \000\r\n  ");
    NULL_BL_T_LINEBR = new Constant("\t \000\r\n  ");
    NULL_BL_T = new Constant("\000 \t");
    URI_CHARS = new Constant("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
    ALPHA = new Constant("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
  }
  
  public boolean has(int paramInt) {
    try {
      try {
        if (this.noASCII)
          try {
            if (this.content.indexOf(paramInt) != -1);
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramInt < 128) ? this.contains[paramInt] : false;
  }
  
  public boolean has(int paramInt, String paramString) {
    try {
      if (!has(paramInt)) {
        try {
          if (paramString.indexOf(paramInt) != -1);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    long l = o3.a(4876565675894334319L, -1326543973754205384L, MethodHandles.lookup().lookupClass()).a(158993397226460L) ^ 0x164DD2B90E18L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\scanner\Constant.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */