package me.rerere.matrix.thirdparty.com.google.gson.internal;

import me.rerere.matrix.internal.o3;

public final class JavaVersion {
  private static final int majorJavaVersion;
  
  private static final long a = o3.a(4016501854909292995L, -4054728999773958012L, null).a(68977506752471L);
  
  public static boolean isJava9OrLater() {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (majorJavaVersion >= 9);
  }
  
  public static int getMajorJavaVersion() {
    return majorJavaVersion;
  }
  
  static {
    majorJavaVersion = determineMajorJavaVersion();
  }
  
  public static int getMajorJavaVersion(String paramString) {
    int i = parseDotted(paramString);
    if (i == -1)
      i = extractBeginningInt(paramString); 
    try {
      if (i == -1)
        return 6; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return i;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\JavaVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */