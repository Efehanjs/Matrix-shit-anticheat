package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.com.google.gdata.util.common.base;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class PercentEscaper extends UnicodeEscaper {
  private static final char[] URI_ESCAPED_SPACE;
  
  private static final char[] UPPER_HEX_DIGITS;
  
  public static final String SAFEQUERYSTRINGCHARS_URLENCODER = "-_.!~*'()@:$,;/?:";
  
  public static final String SAFECHARS_URLENCODER = "-_.*";
  
  private final boolean plusForSpace;
  
  private final boolean[] safeOctets;
  
  public static final String SAFEPATHCHARS_URLENCODER = "-_.!~*'()@:$&,;=";
  
  private static final long a = o3.a(1807184634318752885L, 3718684811683990397L, MethodHandles.lookup().lookupClass()).a(31191957201314L);
  
  public char[] escape(int paramInt) {
    long l = a ^ 0x3A23262E0CBEL;
    try {
      if (paramInt < this.safeOctets.length)
        try {
          if (this.safeOctets[paramInt])
            return null; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt == 32)
        try {
          if (this.plusForSpace)
            return URI_ESCAPED_SPACE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramInt <= 127) {
      char[] arrayOfChar = new char[3];
      arrayOfChar[0] = '%';
      arrayOfChar[2] = UPPER_HEX_DIGITS[paramInt & 0xF];
      arrayOfChar[1] = UPPER_HEX_DIGITS[paramInt >>> 4];
      return arrayOfChar;
    } 
    if (paramInt <= 2047) {
      char[] arrayOfChar = new char[6];
      arrayOfChar[0] = '%';
      arrayOfChar[3] = '%';
      arrayOfChar[5] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[4] = UPPER_HEX_DIGITS[0x8 | paramInt & 0x3];
      paramInt >>>= 2;
      arrayOfChar[2] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[1] = UPPER_HEX_DIGITS[0xC | paramInt];
      return arrayOfChar;
    } 
    if (paramInt <= 65535) {
      char[] arrayOfChar = new char[9];
      arrayOfChar[0] = '%';
      arrayOfChar[1] = 'E';
      arrayOfChar[3] = '%';
      arrayOfChar[6] = '%';
      arrayOfChar[8] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[7] = UPPER_HEX_DIGITS[0x8 | paramInt & 0x3];
      paramInt >>>= 2;
      arrayOfChar[5] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[4] = UPPER_HEX_DIGITS[0x8 | paramInt & 0x3];
      paramInt >>>= 2;
      arrayOfChar[2] = UPPER_HEX_DIGITS[paramInt];
      return arrayOfChar;
    } 
    if (paramInt <= 1114111) {
      char[] arrayOfChar = new char[12];
      arrayOfChar[0] = '%';
      arrayOfChar[1] = 'F';
      arrayOfChar[3] = '%';
      arrayOfChar[6] = '%';
      arrayOfChar[9] = '%';
      arrayOfChar[11] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[10] = UPPER_HEX_DIGITS[0x8 | paramInt & 0x3];
      paramInt >>>= 2;
      arrayOfChar[8] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[7] = UPPER_HEX_DIGITS[0x8 | paramInt & 0x3];
      paramInt >>>= 2;
      arrayOfChar[5] = UPPER_HEX_DIGITS[paramInt & 0xF];
      paramInt >>>= 4;
      arrayOfChar[4] = UPPER_HEX_DIGITS[0x8 | paramInt & 0x3];
      paramInt >>>= 2;
      arrayOfChar[2] = UPPER_HEX_DIGITS[paramInt & 0x7];
      return arrayOfChar;
    } 
    throw new IllegalArgumentException("Invalid unicode character value " + paramInt);
  }
  
  public PercentEscaper(String paramString, boolean paramBoolean) {
    if (paramString.matches(".*[0-9A-Za-z].*"))
      throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified"); 
    try {
      if (paramBoolean)
        try {
          if (paramString.contains(" "))
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character"); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramString.contains("%"))
        throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.plusForSpace = paramBoolean;
    this.safeOctets = createSafeOctets(paramString);
  }
  
  public int nextEscapeIndex(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    while (paramInt1 < paramInt2) {
      char c = paramCharSequence.charAt(paramInt1);
      try {
        if (c < this.safeOctets.length) {
          try {
            if (!this.safeOctets[c])
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          paramInt1++;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return paramInt1;
  }
  
  static {
    long l = a ^ 0x2E13194A5E3BL;
    URI_ESCAPED_SPACE = new char[] { '+' };
    UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
  }
  
  public String escape(String paramString) {
    int i = paramString.length();
    byte b = 0;
    while (b < i) {
      char c = paramString.charAt(b);
      try {
        if (c < this.safeOctets.length)
          try {
            if (this.safeOctets[c]) {
              b++;
              continue;
            } 
            return escapeSlow(paramString, b);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return escapeSlow(paramString, b);
    } 
    return paramString;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\external\com\google\gdat\\util\common\base\PercentEscaper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */