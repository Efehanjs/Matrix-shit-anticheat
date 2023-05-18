package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okio.internal._ByteStringKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class _UtilKt {
  @NotNull
  private static final Buffer$UnsafeCursor DEFAULT__new_UnsafeCursor;
  
  private static final int DEFAULT__ByteString_size;
  
  private static final long a = o3.a(5270909177852003031L, -6431735125496426175L, MethodHandles.lookup().lookupClass()).a(246447188251669L);
  
  @NotNull
  public static final String toHexString(byte paramByte) {
    char[] arrayOfChar = new char[2];
    byte b = paramByte;
    byte b1 = 4;
    boolean bool = false;
    arrayOfChar[0] = _ByteStringKt.getHEX_DIGIT_CHARS()[b >> b1 & 0xF];
    b = paramByte;
    b1 = 15;
    bool = false;
    arrayOfChar[1] = _ByteStringKt.getHEX_DIGIT_CHARS()[b & b1];
    return StringsKt.concatToString(arrayOfChar);
  }
  
  @NotNull
  public static final String toHexString(int paramInt) {
    try {
      if (paramInt == 0)
        return "0"; 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    char[] arrayOfChar = new char[8];
    arrayOfChar[0] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 28 & 0xF];
    arrayOfChar[1] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 24 & 0xF];
    arrayOfChar[2] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 20 & 0xF];
    arrayOfChar[3] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 16 & 0xF];
    arrayOfChar[4] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 12 & 0xF];
    arrayOfChar[5] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 8 & 0xF];
    arrayOfChar[6] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt >> 4 & 0xF];
    arrayOfChar[7] = _ByteStringKt.getHEX_DIGIT_CHARS()[paramInt & 0xF];
    int i = 0;
    while (true) {
      try {
        if (i < arrayOfChar.length) {
          try {
            if (arrayOfChar[i] != '0')
              break; 
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw a(null);
          } 
          int j = i;
          i = j + 1;
          continue;
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
      break;
    } 
    return StringsKt.concatToString(arrayOfChar, i, arrayOfChar.length);
  }
  
  @NotNull
  public static final Buffer$UnsafeCursor getDEFAULT__new_UnsafeCursor() {
    return DEFAULT__new_UnsafeCursor;
  }
  
  public static final boolean arrayRangeEquals(@NotNull byte[] paramArrayOfbyte1, int paramInt1, @NotNull byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "a");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "b");
    byte b = 0;
    if (b < paramInt3)
      do {
        byte b1 = b;
        b++;
        if (paramArrayOfbyte1[b1 + paramInt1] != paramArrayOfbyte2[b1 + paramInt2])
          return false; 
      } while (b < paramInt3); 
    return true;
  }
  
  public static final long reverseBytes(long paramLong) {
    return (paramLong & 0xFF00000000000000L) >>> 56L | (paramLong & 0xFF000000000000L) >>> 40L | (paramLong & 0xFF0000000000L) >>> 24L | (paramLong & 0xFF00000000L) >>> 8L | (paramLong & 0xFF000000L) << 8L | (paramLong & 0xFF0000L) << 24L | (paramLong & 0xFF00L) << 40L | (paramLong & 0xFFL) << 56L;
  }
  
  @NotNull
  public static final Buffer$UnsafeCursor resolveDefaultParameter(@NotNull Buffer$UnsafeCursor paramBuffer$UnsafeCursor) {
    long l = a ^ 0x351A3D06C2F4L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer$UnsafeCursor, "unsafeCursor");
      if (paramBuffer$UnsafeCursor == DEFAULT__new_UnsafeCursor)
        return new Buffer$UnsafeCursor(); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return paramBuffer$UnsafeCursor;
  }
  
  public static final int shr(byte paramByte, int paramInt) {
    boolean bool = false;
    return paramByte >> paramInt;
  }
  
  public static final long minOf(int paramInt, long paramLong) {
    boolean bool1 = false;
    long l = paramInt;
    boolean bool2 = false;
    return Math.min(l, paramLong);
  }
  
  public static final int resolveDefaultParameter(@NotNull ByteString paramByteString, int paramInt) {
    long l = a ^ 0x1BC33F81A571L;
    try {
      Intrinsics.checkNotNullParameter(paramByteString, "<this>");
      if (paramInt == DEFAULT__ByteString_size)
        return paramByteString.size(); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return paramInt;
  }
  
  public static final long and(int paramInt, long paramLong) {
    boolean bool = false;
    return paramInt & paramLong;
  }
  
  public static final int leftRotate(int paramInt1, int paramInt2) {
    boolean bool = false;
    return paramInt1 << paramInt2 | paramInt1 >>> 32 - paramInt2;
  }
  
  public static final int getDEFAULT__ByteString_size() {
    return DEFAULT__ByteString_size;
  }
  
  public static final short reverseBytes(short paramShort) {
    int i = paramShort & 0xFFFF;
    int j = (i & 0xFF00) >>> 8 | (i & 0xFF) << 8;
    return (short)j;
  }
  
  public static final byte xor(byte paramByte1, byte paramByte2) {
    boolean bool = false;
    return (byte)(paramByte1 ^ paramByte2);
  }
  
  public static final int reverseBytes(int paramInt) {
    return (paramInt & 0xFF000000) >>> 24 | (paramInt & 0xFF0000) >>> 8 | (paramInt & 0xFF00) << 8 | (paramInt & 0xFF) << 24;
  }
  
  public static final long minOf(long paramLong, int paramInt) {
    boolean bool1 = false;
    long l = paramInt;
    boolean bool2 = false;
    return Math.min(paramLong, l);
  }
  
  @NotNull
  public static final String toHexString(long paramLong) {
    try {
      if (paramLong == 0L)
        return "0"; 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 60L & 0xFL)];
    arrayOfChar[1] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 56L & 0xFL)];
    arrayOfChar[2] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 52L & 0xFL)];
    arrayOfChar[3] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 48L & 0xFL)];
    arrayOfChar[4] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 44L & 0xFL)];
    arrayOfChar[5] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 40L & 0xFL)];
    arrayOfChar[6] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 36L & 0xFL)];
    arrayOfChar[7] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 32L & 0xFL)];
    arrayOfChar[8] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 28L & 0xFL)];
    arrayOfChar[9] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 24L & 0xFL)];
    arrayOfChar[10] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 20L & 0xFL)];
    arrayOfChar[11] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 16L & 0xFL)];
    arrayOfChar[12] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 12L & 0xFL)];
    arrayOfChar[13] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 8L & 0xFL)];
    arrayOfChar[14] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong >> 4L & 0xFL)];
    arrayOfChar[15] = _ByteStringKt.getHEX_DIGIT_CHARS()[(int)(paramLong & 0xFL)];
    int i = 0;
    while (true) {
      try {
        if (i < arrayOfChar.length) {
          try {
            if (arrayOfChar[i] != '0')
              break; 
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw a(null);
          } 
          int j = i;
          i = j + 1;
          continue;
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
      break;
    } 
    return StringsKt.concatToString(arrayOfChar, i, arrayOfChar.length);
  }
  
  public static final void checkOffsetAndCount(long paramLong1, long paramLong2, long paramLong3) {
    long l = a ^ 0x3A87B434099L;
    try {
      if ((paramLong2 | paramLong3) >= 0L)
        try {
          if (paramLong2 <= paramLong1)
            try {
              if (paramLong1 - paramLong2 >= paramLong3)
                return; 
              throw new ArrayIndexOutOfBoundsException("size=" + paramLong1 + " offset=" + paramLong2 + " byteCount=" + paramLong3);
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            }  
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException("size=" + paramLong1 + " offset=" + paramLong2 + " byteCount=" + paramLong3);
  }
  
  public static final long and(byte paramByte, long paramLong) {
    boolean bool = false;
    return paramByte & paramLong;
  }
  
  public static final long rightRotate(long paramLong, int paramInt) {
    boolean bool = false;
    return paramLong >>> paramInt | paramLong << 64 - paramInt;
  }
  
  static {
    DEFAULT__new_UnsafeCursor = new Buffer$UnsafeCursor();
    DEFAULT__ByteString_size = -1234567890;
  }
  
  public static final int and(byte paramByte, int paramInt) {
    boolean bool = false;
    return paramByte & paramInt;
  }
  
  public static final int shl(byte paramByte, int paramInt) {
    boolean bool = false;
    return paramByte << paramInt;
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\_UtilKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */