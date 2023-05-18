package me.rerere.matrix.thirdparty.org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import me.rerere.matrix.internal.o3;

public class StringUtils {
  private static final long a = o3.a(7892169454535134232L, 7031962441528527212L, MethodHandles.lookup().lookupClass()).a(53647959473343L);
  
  public static byte[] getBytesIso8859_1(String paramString) {
    return getBytes(paramString, StandardCharsets.ISO_8859_1);
  }
  
  public static byte[] getBytesUtf16(String paramString) {
    return getBytes(paramString, StandardCharsets.UTF_16);
  }
  
  public static byte[] getBytesUtf8(String paramString) {
    return getBytes(paramString, StandardCharsets.UTF_8);
  }
  
  public static String newStringUtf16Le(byte[] paramArrayOfbyte) {
    return newString(paramArrayOfbyte, StandardCharsets.UTF_16LE);
  }
  
  public static byte[] getBytesUtf16Le(String paramString) {
    return getBytes(paramString, StandardCharsets.UTF_16LE);
  }
  
  public static String newStringUtf16Be(byte[] paramArrayOfbyte) {
    return newString(paramArrayOfbyte, StandardCharsets.UTF_16BE);
  }
  
  public static String newStringUsAscii(byte[] paramArrayOfbyte) {
    return newString(paramArrayOfbyte, StandardCharsets.US_ASCII);
  }
  
  public static String newStringIso8859_1(byte[] paramArrayOfbyte) {
    return newString(paramArrayOfbyte, StandardCharsets.ISO_8859_1);
  }
  
  public static boolean equals(CharSequence paramCharSequence1, CharSequence paramCharSequence2) {
    try {
      if (paramCharSequence1 == paramCharSequence2)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramCharSequence1 != null) {
        try {
          if (paramCharSequence2 == null)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramCharSequence1 instanceof String)
        try {
          if (paramCharSequence2 instanceof String)
            return paramCharSequence1.equals(paramCharSequence2); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramCharSequence1.length() == paramCharSequence2.length())
        try {
          if (CharSequenceUtils.regionMatches(paramCharSequence1, false, 0, paramCharSequence2, 0, paramCharSequence1.length()));
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static byte[] getBytesUtf16Be(String paramString) {
    return getBytes(paramString, StandardCharsets.UTF_16BE);
  }
  
  public static String newStringUtf8(byte[] paramArrayOfbyte) {
    return newString(paramArrayOfbyte, StandardCharsets.UTF_8);
  }
  
  public static String newString(byte[] paramArrayOfbyte, String paramString) {
    try {
      if (paramArrayOfbyte == null)
        return null; 
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw a(null);
    } 
    try {
      return new String(paramArrayOfbyte, paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw newIllegalStateException(paramString, unsupportedEncodingException);
    } 
  }
  
  public static byte[] getBytesUnchecked(String paramString1, String paramString2) {
    try {
      if (paramString1 == null)
        return null; 
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw a(null);
    } 
    try {
      return paramString1.getBytes(paramString2);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw newIllegalStateException(paramString2, unsupportedEncodingException);
    } 
  }
  
  public static byte[] getBytesUsAscii(String paramString) {
    return getBytes(paramString, StandardCharsets.US_ASCII);
  }
  
  public static ByteBuffer getByteBufferUtf8(String paramString) {
    return getByteBuffer(paramString, StandardCharsets.UTF_8);
  }
  
  public static String newStringUtf16(byte[] paramArrayOfbyte) {
    return newString(paramArrayOfbyte, StandardCharsets.UTF_16);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\apache\commons\codec\binary\StringUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */