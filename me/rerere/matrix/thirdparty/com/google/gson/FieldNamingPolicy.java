package me.rerere.matrix.thirdparty.com.google.gson;

import me.rerere.matrix.internal.o3;

public enum FieldNamingPolicy implements FieldNamingStrategy {
  UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_DASHES, IDENTITY, LOWER_CASE_WITH_DOTS, UPPER_CAMEL_CASE, LOWER_CASE_WITH_UNDERSCORES;
  
  static {
    UPPER_CAMEL_CASE_WITH_SPACES = new FieldNamingPolicy$3("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    LOWER_CASE_WITH_UNDERSCORES = new FieldNamingPolicy$4("LOWER_CASE_WITH_UNDERSCORES", 3);
    LOWER_CASE_WITH_DASHES = new FieldNamingPolicy$5("LOWER_CASE_WITH_DASHES", 4);
    LOWER_CASE_WITH_DOTS = new FieldNamingPolicy$6("LOWER_CASE_WITH_DOTS", 5);
    $VALUES = new FieldNamingPolicy[] { IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES, LOWER_CASE_WITH_DOTS };
  }
  
  public static String upperCaseFirstLetter(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    char c = paramString.charAt(b);
    int i = paramString.length();
    while (true) {
      try {
        if (b < i - 1) {
          try {
            if (Character.isLetter(c))
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          stringBuilder.append(c);
          c = paramString.charAt(++b);
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      break;
    } 
    if (!Character.isUpperCase(c)) {
      String str = modifyString(Character.toUpperCase(c), paramString, ++b);
      return stringBuilder.append(str).toString();
    } 
    return paramString;
  }
  
  public static String separateCamelCase(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    int i = paramString1.length();
    while (b < i) {
      char c = paramString1.charAt(b);
      try {
        if (Character.isUpperCase(c))
          try {
            if (stringBuilder.length() != 0)
              stringBuilder.append(paramString2); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      stringBuilder.append(c);
      b++;
    } 
    return stringBuilder.toString();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    long l = o3.a(4219360483194667743L, 160696399488036526L, null).a(164955908228231L) ^ 0x233FE24685CL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\FieldNamingPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */