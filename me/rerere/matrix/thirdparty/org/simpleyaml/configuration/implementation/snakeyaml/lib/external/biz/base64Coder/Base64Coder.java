package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.biz.base64Coder;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class Base64Coder {
  private static final String systemLineSeparator;
  
  private static final byte[] map2;
  
  private static final char[] map1;
  
  private static final long a = o3.a(-5042379252414532001L, -3625640186584619821L, MethodHandles.lookup().lookupClass()).a(44005957109696L);
  
  public static String encodeString(String paramString) {
    return new String(encode(paramString.getBytes()));
  }
  
  public static byte[] decode(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    long l = a ^ 0x4029E79FB33BL;
    try {
      if (paramInt2 % 4 != 0)
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    while (true) {
      try {
        if (paramInt2 > 0)
          try {
            if (paramArrayOfchar[paramInt1 + paramInt2 - 1] == '=') {
              paramInt2--;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
    int i = paramInt2 * 3 / 4;
    byte[] arrayOfByte = new byte[i];
    int j = paramInt1;
    int k = paramInt1 + paramInt2;
    byte b = 0;
    while (j < k) {
      char c1 = paramArrayOfchar[j++];
      char c2 = paramArrayOfchar[j++];
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b1 = (j < k) ? paramArrayOfchar[j++] : 65;
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b2 = (j < k) ? paramArrayOfchar[j++] : 65;
      try {
        if (c1 <= '') {
          try {
            if (c2 <= '') {
              try {
                if (b1 <= 127) {
                  try {
                    if (b2 > 127)
                      throw new IllegalArgumentException("Illegal character in Base64 encoded data."); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } else {
                  throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
              throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b3 = map2[c1];
      byte b4 = map2[c2];
      byte b5 = map2[b1];
      byte b6 = map2[b2];
      try {
        if (b3 >= 0)
          try {
            if (b4 >= 0)
              try {
                if (b5 >= 0)
                  try {
                    if (b6 >= 0) {
                      int m = b3 << 2 | b4 >>> 4;
                      int n = (b4 & 0xF) << 4 | b5 >>> 2;
                      int i1 = (b5 & 0x3) << 6 | b6;
                      try {
                        arrayOfByte[b++] = (byte)m;
                        if (b < i)
                          arrayOfByte[b++] = (byte)n; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      } 
                      try {
                        if (b < i)
                          arrayOfByte[b++] = (byte)i1; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      } 
                      continue;
                    } 
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
    } 
    return arrayOfByte;
  }
  
  static {
    long l = a ^ 0x49FDAC515225L;
    systemLineSeparator = System.getProperty("line.separator");
    map1 = new char[64];
    byte b = 0;
    char c;
    for (c = 'A'; c <= 'Z'; c = (char)(c + 1))
      map1[b++] = c; 
    for (c = 'a'; c <= 'z'; c = (char)(c + 1))
      map1[b++] = c; 
    for (c = '0'; c <= '9'; c = (char)(c + 1))
      map1[b++] = c; 
    map1[b++] = '+';
    map1[b++] = '/';
    map2 = new byte[128];
    b = 0;
    try {
      while (b < map2.length) {
        map2[b] = -1;
        b++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    b = 0;
    try {
      while (b < 64) {
        map2[map1[b]] = (byte)b;
        b++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static String decodeString(String paramString) {
    return new String(decode(paramString));
  }
  
  public static char[] encode(byte[] paramArrayOfbyte) {
    return encode(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static char[] encode(byte[] paramArrayOfbyte, int paramInt) {
    return encode(paramArrayOfbyte, 0, paramInt);
  }
  
  public static char[] encode(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = (paramInt2 * 4 + 2) / 3;
    int j = (paramInt2 + 2) / 3 * 4;
    char[] arrayOfChar = new char[j];
    int k = paramInt1;
    int m = paramInt1 + paramInt2;
    for (byte b = 0; k < m; b++) {
      int n = paramArrayOfbyte[k++] & 0xFF;
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b1 = (k < m) ? (paramArrayOfbyte[k++] & 0xFF) : 0;
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b2 = (k < m) ? (paramArrayOfbyte[k++] & 0xFF) : 0;
      int i1 = n >>> 2;
      int i2 = (n & 0x3) << 4 | b1 >>> 4;
      int i3 = (b1 & 0xF) << 2 | b2 >>> 6;
      int i4 = b2 & 0x3F;
      try {
        arrayOfChar[b++] = map1[i1];
        arrayOfChar[b++] = map1[i2];
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        arrayOfChar[b] = (b < i) ? map1[i3] : '=';
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      arrayOfChar[++b] = (b < i) ? map1[i4] : '=';
    } 
    return arrayOfChar;
  }
  
  public static String encodeLines(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    int i = paramInt3 * 3 / 4;
    try {
      if (i <= 0)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = (paramInt2 + i - 1) / i;
    int k = (paramInt2 + 2) / 3 * 4 + j * paramString.length();
    StringBuilder stringBuilder = new StringBuilder(k);
    int m;
    for (m = 0; m < paramInt2; m += n) {
      int n = Math.min(paramInt2 - m, i);
      stringBuilder.append(encode(paramArrayOfbyte, paramInt1 + m, n));
      stringBuilder.append(paramString);
    } 
    return stringBuilder.toString();
  }
  
  public static String encodeLines(byte[] paramArrayOfbyte) {
    return encodeLines(paramArrayOfbyte, 0, paramArrayOfbyte.length, 76, systemLineSeparator);
  }
  
  public static byte[] decode(char[] paramArrayOfchar) {
    return decode(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public static byte[] decodeLines(String paramString) {
    char[] arrayOfChar = new char[paramString.length()];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramString.length(); b2++) {
      char c = paramString.charAt(b2);
      try {
        if (c != ' ')
          try {
            if (c != '\r')
              try {
                if (c != '\n')
                  try {
                    if (c != '\t')
                      arrayOfChar[b1++] = c; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return decode(arrayOfChar, 0, b1);
  }
  
  public static byte[] decode(String paramString) {
    return decode(paramString.toCharArray());
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\external\biz\base64Coder\Base64Coder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */