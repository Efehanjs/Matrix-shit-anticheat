package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.com.google.gdata.util.common.base;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class UnicodeEscaper$1 implements Appendable {
  public int pendingHighSurrogate = -1;
  
  public final char[] decodedChars = new char[2];
  
  private static final long a = o3.a(1200916901728325086L, 4989584992719934234L, MethodHandles.lookup().lookupClass()).a(39248791484557L);
  
  public Appendable append(char paramChar) throws IOException {
    long l = a ^ 0x302A3B7A2B0EL;
    try {
      if (this.pendingHighSurrogate != -1) {
        try {
          if (!Character.isLowSurrogate(paramChar))
            throw new IllegalArgumentException("Expected low surrogate character but got '" + paramChar + "' with value " + paramChar); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        char[] arrayOfChar = UnicodeEscaper.this.escape(Character.toCodePoint((char)this.pendingHighSurrogate, paramChar));
        try {
          if (arrayOfChar != null) {
            outputChars(arrayOfChar, arrayOfChar.length);
          } else {
            out.append((char)this.pendingHighSurrogate);
            out.append(paramChar);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.pendingHighSurrogate = -1;
      } else {
        try {
          if (Character.isHighSurrogate(paramChar)) {
            this.pendingHighSurrogate = paramChar;
          } else {
            try {
              if (Character.isLowSurrogate(paramChar))
                throw new IllegalArgumentException("Unexpected low surrogate character '" + paramChar + "' with value " + paramChar); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            char[] arrayOfChar = UnicodeEscaper.this.escape(paramChar);
            try {
              if (arrayOfChar != null) {
                outputChars(arrayOfChar, arrayOfChar.length);
              } else {
                out.append(paramChar);
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this;
  }
  
  public Appendable append(CharSequence paramCharSequence) throws IOException {
    return append(paramCharSequence, 0, paramCharSequence.length());
  }
  
  public Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2) throws IOException {
    long l = a ^ 0x740B4BB25B98L;
    int i = paramInt1;
    if (i < paramInt2) {
      int j = i;
      if (this.pendingHighSurrogate != -1) {
        char c = paramCharSequence.charAt(i++);
        try {
          if (!Character.isLowSurrogate(c))
            throw new IllegalArgumentException("Expected low surrogate character but got " + c); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        char[] arrayOfChar = UnicodeEscaper.this.escape(Character.toCodePoint((char)this.pendingHighSurrogate, c));
        try {
          if (arrayOfChar != null) {
            outputChars(arrayOfChar, arrayOfChar.length);
            j++;
          } else {
            out.append((char)this.pendingHighSurrogate);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.pendingHighSurrogate = -1;
      } 
      while (true) {
        i = UnicodeEscaper.this.nextEscapeIndex(paramCharSequence, i, paramInt2);
        try {
          if (i > j)
            out.append(paramCharSequence, j, i); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (i == paramInt2)
            break; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        int k = UnicodeEscaper.codePointAt(paramCharSequence, i, paramInt2);
        try {
          if (k < 0) {
            this.pendingHighSurrogate = -k;
            break;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        char[] arrayOfChar = UnicodeEscaper.this.escape(k);
        try {
          if (arrayOfChar != null) {
            outputChars(arrayOfChar, arrayOfChar.length);
          } else {
            int m = Character.toChars(k, this.decodedChars, 0);
            outputChars(this.decodedChars, m);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        i += Character.isSupplementaryCodePoint(k) ? 2 : 1;
        j = i;
      } 
    } 
    return this;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\external\com\google\gdat\\util\common\base\UnicodeEscaper$1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */