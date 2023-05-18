package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _Base64Kt {
  @NotNull
  private static final byte[] BASE64_URL_SAFE;
  
  @NotNull
  private static final byte[] BASE64;
  
  private static final long a = o3.a(8580336448164967371L, -7234422103170917941L, MethodHandles.lookup().lookupClass()).a(39547807015060L);
  
  static {
    long l = a ^ 0x761F5269DB15L;
    BASE64 = ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
    BASE64_URL_SAFE = ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
  }
  
  @NotNull
  public static final byte[] getBASE64() {
    return BASE64;
  }
  
  @NotNull
  public static final byte[] getBASE64_URL_SAFE() {
    return BASE64_URL_SAFE;
  }
  
  @Nullable
  public static final byte[] decodeBase64ToArray(@NotNull String paramString) {
    long l = a ^ 0x22E514C54712L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i;
    for (i = paramString.length(); i > 0; i = i2 + -1) {
      char c = paramString.charAt(i - 1);
      try {
        if (c != '=')
          try {
            if (c != '\n')
              try {
                if (c != '\r')
                  try {
                    if (c != ' ')
                      try {
                        if (c != '\t')
                          break; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i2 = i;
    } 
    byte[] arrayOfByte1 = new byte[(int)(i * 6L / 8L)];
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    if (n < i)
      while (true) {
        int i2 = n;
        n++;
        char c = paramString.charAt(i2);
        int i3 = 0;
        if ('A' <= c) {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
        
        } 
        if (false) {
          char c1 = c;
          boolean bool1 = false;
          i3 = c1 - 65;
        } else {
          try {
            if ('a' <= c) {
              try {
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } else {
            
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          if (false) {
            char c1 = c;
            boolean bool1 = false;
            i3 = c1 - 71;
          } else {
            try {
              if ('0' <= c) {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
              
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            if (false) {
              char c1 = c;
              boolean bool1 = false;
              i3 = c1 + 4;
            } else {
              try {
                if (c == '+' || c == '-') {
                  i3 = 62;
                } else {
                  try {
                    if (c == '/' || c == '_') {
                      i3 = 63;
                    } else {
                      try {
                        if (c != '\n')
                          try {
                            if (c != '\r')
                              try {
                                if (c != ' ')
                                  try {
                                    if (c != '\t')
                                      return null; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  }  
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          }  
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      if (n >= i)
                        break; 
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } 
          } 
        } 
        m = m << 6 | i3;
        int i4 = k;
        k = i4 + 1;
        if (k % 4 == 0) {
          i4 = j;
          j = i4 + 1;
          arrayOfByte1[i4] = (byte)(m >> 16);
          i4 = j;
          j = i4 + 1;
          arrayOfByte1[i4] = (byte)(m >> 8);
          i4 = j;
          j = i4 + 1;
          arrayOfByte1[i4] = (byte)m;
        } 
        if (n >= i)
          break; 
      }  
    n = k % 4;
    int i1 = n;
    try {
      int i2;
      switch (i1) {
        case 1:
          return null;
        case 2:
          m <<= 12;
          i2 = j;
          j = i2 + 1;
          arrayOfByte1[i2] = (byte)(m >> 16);
          break;
        case 3:
          m <<= 6;
          i2 = j;
          j = i2 + 1;
          arrayOfByte1[i2] = (byte)(m >> 16);
          i2 = j;
          j = i2 + 1;
          arrayOfByte1[i2] = (byte)(m >> 8);
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (j == arrayOfByte1.length)
        return arrayOfByte1; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte2, j), "java.util.Arrays.copyOf(this, newSize)");
    return Arrays.copyOf(arrayOfByte2, j);
  }
  
  @NotNull
  public static final String encodeBase64(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2) {
    byte b;
    int i1;
    int i2;
    boolean bool;
    long l = a ^ 0x3CA2CC75E5E6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "map");
    int i = (paramArrayOfbyte1.length + 2) / 3 * 4;
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    int k = paramArrayOfbyte1.length - paramArrayOfbyte1.length % 3;
    int m = 0;
    while (m < k) {
      int i3 = m;
      m = i3 + 1;
      byte b1 = paramArrayOfbyte1[i3];
      int i4 = m;
      m = i4 + 1;
      i3 = paramArrayOfbyte1[i4];
      int i5 = m;
      m = i5 + 1;
      i4 = paramArrayOfbyte1[i5];
      i5 = j;
      j = i5 + 1;
      arrayOfByte[i5] = paramArrayOfbyte2[(b1 & 0xFF) >> 2];
      i5 = j;
      j = i5 + 1;
      arrayOfByte[i5] = paramArrayOfbyte2[(b1 & 0x3) << 4 | (i3 & 0xFF) >> 4];
      i5 = j;
      j = i5 + 1;
      arrayOfByte[i5] = paramArrayOfbyte2[(i3 & 0xF) << 2 | (i4 & 0xFF) >> 6];
      i5 = j;
      j = i5 + 1;
      arrayOfByte[i5] = paramArrayOfbyte2[i4 & 0x3F];
    } 
    int n = paramArrayOfbyte1.length - k;
    switch (n) {
      case 1:
        b = paramArrayOfbyte1[m];
        i1 = j;
        j = i1 + 1;
        arrayOfByte[i1] = paramArrayOfbyte2[(b & 0xFF) >> 2];
        i1 = j;
        j = i1 + 1;
        arrayOfByte[i1] = paramArrayOfbyte2[(b & 0x3) << 4];
        i1 = j;
        j = i1 + 1;
        i1 = 61;
        i2 = 0;
        arrayOfByte[i1] = (byte)i1;
        i1 = 61;
        i2 = 0;
        arrayOfByte[j] = (byte)i1;
        break;
      case 2:
        i1 = m;
        m = i1 + 1;
        b = paramArrayOfbyte1[i1];
        i1 = paramArrayOfbyte1[m];
        i2 = j;
        j = i2 + 1;
        arrayOfByte[i2] = paramArrayOfbyte2[(b & 0xFF) >> 2];
        i2 = j;
        j = i2 + 1;
        arrayOfByte[i2] = paramArrayOfbyte2[(b & 0x3) << 4 | (i1 & 0xFF) >> 4];
        i2 = j;
        j = i2 + 1;
        arrayOfByte[i2] = paramArrayOfbyte2[(i1 & 0xF) << 2];
        i2 = 61;
        bool = false;
        arrayOfByte[j] = (byte)i2;
        break;
    } 
    return _JvmPlatformKt.toUtf8String(arrayOfByte);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\_Base64Kt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */