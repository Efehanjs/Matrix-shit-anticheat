package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio._Base64Kt;
import me.rerere.matrix.thirdparty.okio._JvmPlatformKt;
import me.rerere.matrix.thirdparty.okio._UtilKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _ByteStringKt {
  @NotNull
  private static final char[] HEX_DIGIT_CHARS;
  
  private static final long a = o3.a(-9043009537100017872L, 3682845026098974592L, MethodHandles.lookup().lookupClass()).a(276716766053838L);
  
  @NotNull
  public static final ByteString commonToByteString(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x6C52CEB0259AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt1, paramInt2);
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = paramInt1 + paramInt2;
    boolean bool2 = false;
    return new ByteString(ArraysKt.copyOfRange(arrayOfByte, paramInt1, i));
  }
  
  public static final int commonHashCode(@NotNull ByteString paramByteString) {
    long l = a ^ 0x48F85C30F511L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool1 = false;
    int i = paramByteString.getHashCode$okio();
    try {
      if (i != 0)
        return i; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramByteString.getData$okio();
    boolean bool2 = false;
    int j = Arrays.hashCode(arrayOfByte);
    bool2 = false;
    boolean bool3 = false;
    int k = j;
    boolean bool4 = false;
    paramByteString.setHashCode$okio(k);
    return j;
  }
  
  public static final int commonCompareTo(@NotNull ByteString paramByteString1, @NotNull ByteString paramByteString2) {
    long l = a ^ 0x1D0F863A1CFCL;
    Intrinsics.checkNotNullParameter(paramByteString1, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString2, "other");
    boolean bool = false;
    int i = paramByteString1.size();
    int j = paramByteString2.size();
    int k = 0;
    int n = 0;
    int m = Math.min(i, j);
    while (k < m) {
      byte b = paramByteString1.getByte(k);
      int i2 = 255;
      char c = Character.MIN_VALUE;
      n = b & i2;
      i2 = paramByteString2.getByte(k);
      c = 'ÿ';
      boolean bool1 = false;
      int i1 = i2 & c;
      if (n == i1) {
        i2 = k;
        k = i2 + 1;
        continue;
      } 
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return (n < i1) ? -1 : 1;
    } 
    try {
      if (i == j)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i < j) ? -1 : 1;
  }
  
  public static final int commonGetSize(@NotNull ByteString paramByteString) {
    long l = a ^ 0x5D3C6024207AL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    return (paramByteString.getData$okio()).length;
  }
  
  public static final boolean commonEndsWith(@NotNull ByteString paramByteString, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x70127F2721BBL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "suffix");
    boolean bool = false;
    return paramByteString.rangeEquals(paramByteString.size() - paramArrayOfbyte.length, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  @NotNull
  public static final ByteString commonToAsciiLowercase(@NotNull ByteString paramByteString) {
    long l = a ^ 0x576F46532D72L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    int i = 0;
    while (i < (paramByteString.getData$okio()).length) {
      byte b = paramByteString.getData$okio()[i];
      int j = 65;
      boolean bool1 = false;
      j = 90;
      bool1 = false;
      if (b < (byte)j || b > (byte)j) {
        j = i;
        i = j + 1;
        continue;
      } 
      byte[] arrayOfByte2 = paramByteString.getData$okio();
      boolean bool2 = false;
      Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte2, arrayOfByte2.length), "java.util.Arrays.copyOf(this, size)");
      byte[] arrayOfByte1 = Arrays.copyOf(arrayOfByte2, arrayOfByte2.length);
      int k = i;
      i = k + 1;
      arrayOfByte1[k] = (byte)(b - -32);
      while (i < arrayOfByte1.length) {
        b = arrayOfByte1[i];
        k = 65;
        bool2 = false;
        k = 90;
        bool2 = false;
        if (b < (byte)k || b > (byte)k) {
          k = i;
          i = k + 1;
          continue;
        } 
        arrayOfByte1[i] = (byte)(b - -32);
        k = i;
        i = k + 1;
      } 
      return new ByteString(arrayOfByte1);
    } 
    return paramByteString;
  }
  
  @NotNull
  public static final char[] getHEX_DIGIT_CHARS() {
    return HEX_DIGIT_CHARS;
  }
  
  @NotNull
  public static final ByteString commonSubstring(@NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    long l = a ^ 0x3AB76FC05791L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool1 = false;
    int i = _UtilKt.resolveDefaultParameter(paramByteString, paramInt2);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = (paramInt1 >= 0) ? 1 : 0;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!j) {
      boolean bool = false;
      String str = "beginIndex < 0";
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    j = (i <= (paramByteString.getData$okio()).length) ? 1 : 0;
    bool2 = false;
    bool3 = false;
    if (!j) {
      boolean bool = false;
      String str = "endIndex > length(" + (paramByteString.getData$okio()).length + ')';
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    j = i - paramInt1;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool2 = (j >= 0) ? true : false;
    bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "endIndex < beginIndex";
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramInt1 == 0)
        try {
          if (i == (paramByteString.getData$okio()).length)
            return paramByteString; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramByteString.getData$okio();
    bool3 = false;
    return new ByteString(ArraysKt.copyOfRange(arrayOfByte, paramInt1, i));
  }
  
  static {
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = '0';
    arrayOfChar[1] = '1';
    arrayOfChar[2] = '2';
    arrayOfChar[3] = '3';
    arrayOfChar[4] = '4';
    arrayOfChar[5] = '5';
    arrayOfChar[6] = '6';
    arrayOfChar[7] = '7';
    arrayOfChar[8] = '8';
    arrayOfChar[9] = '9';
    arrayOfChar[10] = 'a';
    arrayOfChar[11] = 'b';
    arrayOfChar[12] = 'c';
    arrayOfChar[13] = 'd';
    arrayOfChar[14] = 'e';
    arrayOfChar[15] = 'f';
    HEX_DIGIT_CHARS = arrayOfChar;
  }
  
  @NotNull
  public static final String commonBase64(@NotNull ByteString paramByteString) {
    long l = a ^ 0x7C4B3AEAAB9FL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    return _Base64Kt.encodeBase64$default(paramByteString.getData$okio(), null, 1, null);
  }
  
  public static final boolean commonStartsWith(@NotNull ByteString paramByteString1, @NotNull ByteString paramByteString2) {
    long l = a ^ 0x430B3FB064F1L;
    Intrinsics.checkNotNullParameter(paramByteString1, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString2, "prefix");
    boolean bool = false;
    return paramByteString1.rangeEquals(0, paramByteString2, 0, paramByteString2.size());
  }
  
  @NotNull
  public static final ByteString commonOf(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x20589A07EDAFL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "data");
    boolean bool1 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    boolean bool2 = false;
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte, arrayOfByte.length), "java.util.Arrays.copyOf(this, size)");
    return new ByteString(Arrays.copyOf(arrayOfByte, arrayOfByte.length));
  }
  
  @NotNull
  public static final String commonToString(@NotNull ByteString paramByteString) {
    long l = a ^ 0x331F6416CF78L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool1 = false;
    byte[] arrayOfByte = paramByteString.getData$okio();
    boolean bool2 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if ((arrayOfByte.length == 0))
        return "[size=0]"; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = access$codePointIndexToCharIndex(paramByteString.getData$okio(), 64);
    try {
      if (i == -1) {
        try {
          ByteString byteString = paramByteString;
          byte b1 = 0;
          byte b2 = 64;
          boolean bool5 = false;
          int j = _UtilKt.resolveDefaultParameter(byteString, b2);
          int k = 1;
          boolean bool6 = false;
          boolean bool7 = false;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          k = (j <= (byteString.getData$okio()).length) ? 1 : 0;
          bool6 = false;
          bool7 = false;
          if (!k) {
            boolean bool = false;
            String str = "endIndex > length(" + (byteString.getData$okio()).length + ')';
            throw (Throwable)new IllegalArgumentException(str.toString());
          } 
          k = j - b1;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          bool6 = (k >= 0) ? true : false;
          bool7 = false;
          boolean bool8 = false;
          if (!bool6) {
            boolean bool = false;
            String str = "endIndex < beginIndex";
            throw (Throwable)new IllegalArgumentException(str.toString());
          } 
          try {
            byte[] arrayOfByte1 = byteString.getData$okio();
            bool7 = false;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return ((paramByteString.getData$okio()).length <= 64) ? ("[hex=" + paramByteString.hex() + ']') : ("[size=" + (paramByteString.getData$okio()).length + " hex=" + ((j == (byteString.getData$okio()).length) ? byteString : new ByteString(ArraysKt.copyOfRange(arrayOfByte1, b1, j))).hex() + "…]");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str1 = paramByteString.utf8();
    String str3 = str1;
    boolean bool3 = false;
    boolean bool4 = false;
    try {
      if (str3 == null)
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(str3.substring(bool3, i), "(this as java.lang.Strin…ing(startIndex, endIndex)");
    String str2 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str3.substring(bool3, i), "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i < str1.length()) ? ("[size=" + (paramByteString.getData$okio()).length + " text=" + str2 + "…]") : ("[text=" + str2 + ']');
  }
  
  @NotNull
  public static final byte[] commonToByteArray(@NotNull ByteString paramByteString) {
    long l = a ^ 0x37DB0D330330L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool1 = false;
    byte[] arrayOfByte = paramByteString.getData$okio();
    boolean bool2 = false;
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte, arrayOfByte.length), "java.util.Arrays.copyOf(this, size)");
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  @NotNull
  public static final String commonUtf8(@NotNull ByteString paramByteString) {
    long l = a ^ 0x7D6B001EB5D4L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    String str = paramByteString.getUtf8$okio();
    if (str == null) {
      str = _JvmPlatformKt.toUtf8String(paramByteString.internalArray$okio());
      paramByteString.setUtf8$okio(str);
    } 
    return str;
  }
  
  public static final int commonIndexOf(@NotNull ByteString paramByteString, @NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = a ^ 0x47DB388E0C53L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    boolean bool1 = false;
    int i = (paramByteString.getData$okio()).length - paramArrayOfbyte.length;
    int k = 0;
    boolean bool2 = false;
    int j = Math.max(paramInt, k);
    if (j <= i)
      do {
        k = j;
        j++;
        if (_UtilKt.arrayRangeEquals(paramByteString.getData$okio(), k, paramArrayOfbyte, 0, paramArrayOfbyte.length))
          return k; 
      } while (k != i); 
    return -1;
  }
  
  public static final boolean commonEquals(@NotNull ByteString paramByteString, @Nullable Object paramObject) {
    long l = a ^ 0x3AAA23A3D87EL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    try {
      try {
        try {
          if (((ByteString)paramObject).size() == (paramByteString.getData$okio()).length)
            try {
              if (((ByteString)paramObject).rangeEquals(0, paramByteString.getData$okio(), 0, (paramByteString.getData$okio()).length));
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
    return (paramObject == paramByteString) ? true : ((paramObject instanceof ByteString) ? false : false);
  }
  
  public static final boolean commonStartsWith(@NotNull ByteString paramByteString, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x15CB444A5F8DL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "prefix");
    boolean bool = false;
    return paramByteString.rangeEquals(0, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  @NotNull
  public static final byte[] commonInternalArray(@NotNull ByteString paramByteString) {
    long l = a ^ 0x1081BF069E1DL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    return paramByteString.getData$okio();
  }
  
  public static final boolean commonRangeEquals(@NotNull ByteString paramByteString, int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x732D84137540L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    boolean bool = false;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= (paramByteString.getData$okio()).length - paramInt3)
            try {
              if (paramInt2 >= 0)
                try {
                  if (paramInt2 <= paramArrayOfbyte.length - paramInt3)
                    try {
                      if (_UtilKt.arrayRangeEquals(paramByteString.getData$okio(), paramInt1, paramArrayOfbyte, paramInt2, paramInt3));
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
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  @Nullable
  public static final ByteString commonDecodeBase64(@NotNull String paramString) {
    long l = a ^ 0x4E7A35522A72L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    boolean bool = false;
    byte[] arrayOfByte = _Base64Kt.decodeBase64ToArray(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (arrayOfByte != null) ? new ByteString(arrayOfByte) : null;
  }
  
  @NotNull
  public static final String commonBase64Url(@NotNull ByteString paramByteString) {
    long l = a ^ 0x6E219B281E07L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    return _Base64Kt.encodeBase64(paramByteString.getData$okio(), _Base64Kt.getBASE64_URL_SAFE());
  }
  
  public static final void commonCopyInto(@NotNull ByteString paramByteString, int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x527D522E3333L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "target");
    boolean bool = false;
    ArraysKt.copyInto(paramByteString.getData$okio(), paramArrayOfbyte, paramInt2, paramInt1, paramInt1 + paramInt3);
  }
  
  @NotNull
  public static final String commonHex(@NotNull ByteString paramByteString) {
    long l = a ^ 0x1AAB029C874BL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    char[] arrayOfChar = new char[(paramByteString.getData$okio()).length * 2];
    int i = 0;
    byte[] arrayOfByte = paramByteString.getData$okio();
    byte b = 0;
    int j = arrayOfByte.length;
    while (b < j) {
      byte b1 = arrayOfByte[b];
      b++;
      int k = i;
      i = k + 1;
      k = b1;
      byte b2 = 4;
      boolean bool1 = false;
      arrayOfChar[k] = getHEX_DIGIT_CHARS()[k >> b2 & 0xF];
      k = i;
      i = k + 1;
      k = b1;
      b2 = 15;
      bool1 = false;
      arrayOfChar[k] = getHEX_DIGIT_CHARS()[k & b2];
    } 
    return StringsKt.concatToString(arrayOfChar);
  }
  
  @NotNull
  public static final ByteString commonToAsciiUppercase(@NotNull ByteString paramByteString) {
    long l = a ^ 0x6EE054699194L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    int i = 0;
    while (i < (paramByteString.getData$okio()).length) {
      byte b = paramByteString.getData$okio()[i];
      int j = 97;
      boolean bool1 = false;
      j = 122;
      bool1 = false;
      if (b < (byte)j || b > (byte)j) {
        j = i;
        i = j + 1;
        continue;
      } 
      byte[] arrayOfByte2 = paramByteString.getData$okio();
      boolean bool2 = false;
      Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte2, arrayOfByte2.length), "java.util.Arrays.copyOf(this, size)");
      byte[] arrayOfByte1 = Arrays.copyOf(arrayOfByte2, arrayOfByte2.length);
      int k = i;
      i = k + 1;
      arrayOfByte1[k] = (byte)(b - 32);
      while (i < arrayOfByte1.length) {
        b = arrayOfByte1[i];
        k = 97;
        bool2 = false;
        k = 122;
        bool2 = false;
        if (b < (byte)k || b > (byte)k) {
          k = i;
          i = k + 1;
          continue;
        } 
        arrayOfByte1[i] = (byte)(b - 32);
        k = i;
        i = k + 1;
      } 
      return new ByteString(arrayOfByte1);
    } 
    return paramByteString;
  }
  
  public static final int commonLastIndexOf(@NotNull ByteString paramByteString1, @NotNull ByteString paramByteString2, int paramInt) {
    long l = a ^ 0x538650DB0805L;
    Intrinsics.checkNotNullParameter(paramByteString1, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString2, "other");
    boolean bool = false;
    return paramByteString1.lastIndexOf(paramByteString2.internalArray$okio(), paramInt);
  }
  
  public static final boolean commonRangeEquals(@NotNull ByteString paramByteString1, int paramInt1, @NotNull ByteString paramByteString2, int paramInt2, int paramInt3) {
    long l = a ^ 0x46A143E5BB2BL;
    Intrinsics.checkNotNullParameter(paramByteString1, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString2, "other");
    boolean bool = false;
    return paramByteString2.rangeEquals(paramInt2, paramByteString1.getData$okio(), paramInt1, paramInt3);
  }
  
  @NotNull
  public static final ByteString commonEncodeUtf8(@NotNull String paramString) {
    long l = a ^ 0x539C4ED5326L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    boolean bool = false;
    ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(paramString));
    byteString.setUtf8$okio(paramString);
    return byteString;
  }
  
  public static final int commonLastIndexOf(@NotNull ByteString paramByteString, @NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = a ^ 0x5797D879E17AL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    boolean bool = false;
    int i = _UtilKt.resolveDefaultParameter(paramByteString, paramInt);
    int j = (paramByteString.getData$okio()).length - paramArrayOfbyte.length;
    int m = 0;
    int k = Math.min(i, j);
    if (0 <= k)
      do {
        m = k;
        k--;
        if (_UtilKt.arrayRangeEquals(paramByteString.getData$okio(), m, paramArrayOfbyte, 0, paramArrayOfbyte.length))
          return m; 
      } while (0 <= k); 
    return -1;
  }
  
  public static final boolean commonEndsWith(@NotNull ByteString paramByteString1, @NotNull ByteString paramByteString2) {
    long l = a ^ 0x50EB67180900L;
    Intrinsics.checkNotNullParameter(paramByteString1, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString2, "suffix");
    boolean bool = false;
    return paramByteString1.rangeEquals(paramByteString1.size() - paramByteString2.size(), paramByteString2, 0, paramByteString2.size());
  }
  
  @NotNull
  public static final ByteString commonDecodeHex(@NotNull String paramString) {
    long l = a ^ 0x20D6AE602696L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramString.length() % 2 == 0) ? true : false;
    byte b = 0;
    int i = 0;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("Unexpected hex string: ", paramString);
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    b = 0;
    i = arrayOfByte.length + -1;
    if (b <= i)
      do {
        byte b1 = b;
        b++;
        int j = access$decodeHexDigit(paramString.charAt(b1 * 2)) << 4;
        int k = access$decodeHexDigit(paramString.charAt(b1 * 2 + 1));
        arrayOfByte[b1] = (byte)(j + k);
      } while (b <= i); 
    return new ByteString(arrayOfByte);
  }
  
  public static final void commonWrite(@NotNull ByteString paramByteString, @NotNull Buffer paramBuffer, int paramInt1, int paramInt2) {
    long l = a ^ 0x7E5C771992AAL;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer, "buffer");
    paramBuffer.write(paramByteString.getData$okio(), paramInt1, paramInt2);
  }
  
  public static final byte commonGetByte(@NotNull ByteString paramByteString, int paramInt) {
    long l = a ^ 0x471013A29CC9L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    boolean bool = false;
    return paramByteString.getData$okio()[paramInt];
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_ByteStringKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */