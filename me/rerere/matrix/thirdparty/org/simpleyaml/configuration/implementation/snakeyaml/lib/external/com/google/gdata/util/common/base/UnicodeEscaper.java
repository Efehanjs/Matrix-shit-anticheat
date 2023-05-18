package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.com.google.gdata.util.common.base;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public abstract class UnicodeEscaper implements Escaper {
  private static final int DEST_PAD = 32;
  
  private static final ThreadLocal DEST_TL;
  
  private static final long b = o3.a(4661923928586343758L, 1733350911104709118L, MethodHandles.lookup().lookupClass()).a(281295891965739L);
  
  public Appendable escape(Appendable paramAppendable) {
    try {
      assert false;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return new UnicodeEscaper$1(this, paramAppendable);
  }
  
  public abstract char[] escape(int paramInt);
  
  public int nextEscapeIndex(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    int i = paramInt1;
    while (i < paramInt2) {
      int j = codePointAt(paramCharSequence, i, paramInt2);
      try {
        if (j >= 0) {
          try {
            if (escape(j) != null)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          i += Character.isSupplementaryCodePoint(j) ? 2 : 1;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
    } 
    return i;
  }
  
  public String escape(String paramString) {
    int i = paramString.length();
    int j = nextEscapeIndex(paramString, 0, i);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (j == i) ? paramString : escapeSlow(paramString, j);
  }
  
  static {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    $assertionsDisabled = !UnicodeEscaper.class.desiredAssertionStatus();
    DEST_TL = new UnicodeEscaper$2();
  }
  
  public final String escapeSlow(String paramString, int paramInt) {
    long l = b ^ 0x57E6D646AAA3L;
    int i = paramString.length();
    char[] arrayOfChar = DEST_TL.get();
    int j = 0;
    int k = 0;
    while (paramInt < i) {
      int n = codePointAt(paramString, paramInt, i);
      try {
        if (n < 0)
          throw new IllegalArgumentException("Trailing high surrogate at end of input"); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      char[] arrayOfChar1 = escape(n);
      if (arrayOfChar1 != null) {
        int i1 = paramInt - k;
        int i2 = j + i1 + arrayOfChar1.length;
        if (arrayOfChar.length < i2) {
          int i3 = i2 + i - paramInt + 32;
          arrayOfChar = growBuffer(arrayOfChar, j, i3);
        } 
        if (i1 > 0) {
          paramString.getChars(k, paramInt, arrayOfChar, j);
          j += i1;
        } 
        if (arrayOfChar1.length > 0) {
          System.arraycopy(arrayOfChar1, 0, arrayOfChar, j, arrayOfChar1.length);
          j += arrayOfChar1.length;
        } 
      } 
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      k = paramInt + (Character.isSupplementaryCodePoint(n) ? 2 : 1);
      paramInt = nextEscapeIndex(paramString, k, i);
    } 
    int m = i - k;
    if (m > 0) {
      int n = j + m;
      if (arrayOfChar.length < n)
        arrayOfChar = growBuffer(arrayOfChar, j, n); 
      paramString.getChars(k, i, arrayOfChar, j);
      j = n;
    } 
    return new String(arrayOfChar, 0, j);
  }
  
  public static final int codePointAt(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    long l = b ^ 0x4F7855840F4AL;
    if (paramInt1 < paramInt2) {
      char c = paramCharSequence.charAt(paramInt1++);
      try {
        if (c >= '?')
          try {
            if (c <= '?') {
              try {
                if (c <= '?') {
                  try {
                    if (paramInt1 == paramInt2)
                      return -c; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw b(null);
                  } 
                  char c1 = paramCharSequence.charAt(paramInt1);
                  try {
                    if (Character.isLowSurrogate(c1))
                      return Character.toCodePoint(c, c1); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw b(null);
                  } 
                  throw new IllegalArgumentException("Expected low surrogate but got char '" + c1 + "' with value " + c1 + " at index " + paramInt1);
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw b(null);
              } 
              throw new IllegalArgumentException("Unexpected low surrogate character '" + c + "' with value " + c + " at index " + (paramInt1 - 1));
            } 
            return c;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      return c;
    } 
    throw new IndexOutOfBoundsException("Index exceeds specified range");
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\external\com\google\gdat\\util\common\base\UnicodeEscaper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */