package me.rerere.matrix.thirdparty.org.simpleyaml.utils;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;

public final class StringUtils {
  public static final Pattern LIST_INDEX;
  
  public static final String BLANK_LINE = "\n\n";
  
  public static final char ESCAPE_CHAR = '\\';
  
  private static String SEPARATOR;
  
  public static final Pattern NEW_LINE;
  
  private static String ESCAPE_SEPARATOR;
  
  public static final Pattern INDENTATION;
  
  private static final long a = o3.a(229170982029589242L, -2578888697034819214L, MethodHandles.lookup().lookupClass()).a(53412761441416L);
  
  public static String[] splitNewLines(String paramString, int paramInt) {
    return NEW_LINE.split(paramString, paramInt);
  }
  
  public static int lastSeparatorIndex(String paramString, char paramChar, int paramInt) {
    if (paramInt < 0)
      paramInt = 0; 
    boolean bool = false;
    int i = paramString.length();
    int j = -1;
    for (int k = paramInt; k < i; k++) {
      char c = paramString.charAt(k);
      try {
        if (c == '\\') {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = !bool ? true : false;
        } else {
          try {
            if (c == paramChar && !bool)
              j = k; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = false;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return j;
  }
  
  public static String escape(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramString != null) ? paramString.replace(SEPARATOR, ESCAPE_SEPARATOR) : null;
  }
  
  static {
    long l = a ^ 0x4D6E3B06EDE8L;
    NEW_LINE = Pattern.compile("\\R");
    INDENTATION = Pattern.compile("^[^\\S\n]+", 8);
    LIST_INDEX = Pattern.compile("^(.*)\\[(-?\\d+)]$", 32);
    SEPARATOR = ".";
    ESCAPE_SEPARATOR = '\\' + SEPARATOR;
  }
  
  public static String wrap(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramString == null) ? "" : ('\'' + paramString + '\'');
  }
  
  public static String[] lines(String paramString) {
    return lines(paramString, true);
  }
  
  public static String indentation(int paramInt) {
    return padding(paramInt, ' ');
  }
  
  public static String padding(int paramInt, char paramChar) {
    try {
      if (paramInt <= 0)
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    char[] arrayOfChar = new char[paramInt];
    byte b = 0;
    try {
      while (b < paramInt) {
        arrayOfChar[b] = paramChar;
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new String(arrayOfChar);
  }
  
  public static String afterNewLine(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramString.indexOf('\n');
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i >= 0) ? paramString.substring(i + 1) : "";
  }
  
  public static int lastSeparatorIndex(String paramString, char paramChar) {
    return lastSeparatorIndex(paramString, paramChar, 0);
  }
  
  public static void setSeparator(char paramChar) {
    SEPARATOR = String.valueOf(paramChar);
    ESCAPE_SEPARATOR = '\\' + SEPARATOR;
  }
  
  public static int firstSeparatorIndex(String paramString, char paramChar) {
    return firstSeparatorIndex(paramString, paramChar, 0);
  }
  
  public static String quoteNewLines(String paramString) {
    long l = a ^ 0x5361B8CE14A3L;
    return NEW_LINE.matcher(paramString).replaceAll("\\\\n");
  }
  
  public static int firstSeparatorIndex(String paramString, char paramChar, int paramInt) {
    if (paramInt < 0)
      paramInt = 0; 
    boolean bool = false;
    int i = paramString.length();
    for (int j = paramInt; j < i; j++) {
      char c = paramString.charAt(j);
      try {
        if (c == '\\') {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = !bool ? true : false;
        } else {
          try {
            if (c == paramChar)
              try {
                if (!bool)
                  return j; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = false;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return -1;
  }
  
  public static String stripPrefix(String paramString1, String paramString2, String paramString3) {
    try {
      if (paramString1 == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = 0;
    try {
      if (paramString2 != null && paramString1.startsWith(paramString2)) {
        i = paramString2.length();
      } else {
        try {
          if (paramString3 != null && paramString1.startsWith(paramString3))
            i = paramString3.length(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramString1.substring(i);
  }
  
  public static String[] lines(String paramString, boolean paramBoolean) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return splitNewLines(paramString, paramBoolean ? 0 : -1);
  }
  
  public static boolean allLinesArePrefixed(String paramString1, String paramString2) {
    return Arrays.<String>stream(lines(paramString1, false)).allMatch(paramString2 -> paramString2.trim().startsWith(paramString1));
  }
  
  public static String stripIndentation(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return INDENTATION.matcher(paramString).replaceAll("");
  }
  
  public static String stripCarriage(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramString != null) ? paramString.replace("\r", "") : null;
  }
  
  public static String stripPrefix(String paramString1, String paramString2) {
    return stripPrefix(paramString1, paramString2, null);
  }
  
  public static String[] splitTrailingNewLines(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String[] arrayOfString = new String[2];
    int i = paramString.length() - 1;
    while (true) {
      try {
        if (i >= 0)
          try {
            if (paramString.charAt(i) == '\n') {
              i--;
              continue;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      break;
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    arrayOfString[0] = (i >= 0) ? paramString.substring(0, i + 1) : "";
    arrayOfString[1] = paramString.substring(i + 1);
    return arrayOfString;
  }
  
  public static boolean allLinesArePrefixedOrBlank(String paramString1, String paramString2) {
    return Arrays.<String>stream(lines(paramString1)).map(String::trim).allMatch(paramString2 -> {
          try {
            if (!paramString2.isEmpty()) {
              try {
                if (paramString2.startsWith(paramString1));
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              return false;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        });
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyam\\utils\StringUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */