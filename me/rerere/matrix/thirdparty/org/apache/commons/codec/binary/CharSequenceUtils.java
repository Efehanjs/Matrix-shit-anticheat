package me.rerere.matrix.thirdparty.org.apache.commons.codec.binary;

public class CharSequenceUtils {
  public static boolean regionMatches(CharSequence paramCharSequence1, boolean paramBoolean, int paramInt1, CharSequence paramCharSequence2, int paramInt2, int paramInt3) {
    try {
      if (paramCharSequence1 instanceof String)
        try {
          if (paramCharSequence2 instanceof String)
            return ((String)paramCharSequence1).regionMatches(paramBoolean, paramInt1, (String)paramCharSequence2, paramInt2, paramInt3); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramInt1;
    int j = paramInt2;
    int k = paramInt3;
    while (k-- > 0) {
      char c1 = paramCharSequence1.charAt(i++);
      char c2 = paramCharSequence2.charAt(j++);
      try {
        if (c1 == c2)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!paramBoolean)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (Character.toUpperCase(c1) != Character.toUpperCase(c2))
          try {
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2))
              return false; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\apache\commons\codec\binary\CharSequenceUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */