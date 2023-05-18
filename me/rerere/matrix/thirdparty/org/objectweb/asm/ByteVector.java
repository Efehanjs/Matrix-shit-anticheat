package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public class ByteVector {
  public int length;
  
  public byte[] data;
  
  private static final long a = o3.a(5591214851283973230L, 8869130031970867148L, null).a(84700224851498L);
  
  public final ByteVector put122(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.length;
    try {
      if (i + 5 > this.data.length)
        enlarge(5); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[i++] = (byte)paramInt1;
    arrayOfByte[i++] = (byte)(paramInt2 >>> 8);
    arrayOfByte[i++] = (byte)paramInt2;
    arrayOfByte[i++] = (byte)(paramInt3 >>> 8);
    arrayOfByte[i++] = (byte)paramInt3;
    this.length = i;
    return this;
  }
  
  public ByteVector(byte[] paramArrayOfbyte) {
    this.data = paramArrayOfbyte;
    this.length = paramArrayOfbyte.length;
  }
  
  public ByteVector putUTF8(String paramString) {
    long l = a ^ 0x3382F7821542L;
    int i = paramString.length();
    try {
      if (i > 65535)
        throw new IllegalArgumentException("UTF8 string too large"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = this.length;
    try {
      if (j + 2 + i > this.data.length)
        enlarge(2 + i); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[j++] = (byte)(i >>> 8);
    arrayOfByte[j++] = (byte)i;
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      try {
        if (c >= '\001') {
          try {
            if (c <= '') {
              arrayOfByte[j++] = (byte)c;
            } else {
              this.length = j;
              return encodeUtf8(paramString, b, 65535);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          this.length = j;
          return encodeUtf8(paramString, b, 65535);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    this.length = j;
    return this;
  }
  
  public final ByteVector put11(int paramInt1, int paramInt2) {
    int i = this.length;
    try {
      if (i + 2 > this.data.length)
        enlarge(2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[i++] = (byte)paramInt1;
    arrayOfByte[i++] = (byte)paramInt2;
    this.length = i;
    return this;
  }
  
  public ByteVector putShort(int paramInt) {
    int i = this.length;
    try {
      if (i + 2 > this.data.length)
        enlarge(2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[i++] = (byte)(paramInt >>> 8);
    arrayOfByte[i++] = (byte)paramInt;
    this.length = i;
    return this;
  }
  
  public ByteVector putLong(long paramLong) {
    int i = this.length;
    try {
      if (i + 8 > this.data.length)
        enlarge(8); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    int j = (int)(paramLong >>> 32L);
    arrayOfByte[i++] = (byte)(j >>> 24);
    arrayOfByte[i++] = (byte)(j >>> 16);
    arrayOfByte[i++] = (byte)(j >>> 8);
    arrayOfByte[i++] = (byte)j;
    j = (int)paramLong;
    arrayOfByte[i++] = (byte)(j >>> 24);
    arrayOfByte[i++] = (byte)(j >>> 16);
    arrayOfByte[i++] = (byte)(j >>> 8);
    arrayOfByte[i++] = (byte)j;
    this.length = i;
    return this;
  }
  
  public final ByteVector put12(int paramInt1, int paramInt2) {
    int i = this.length;
    try {
      if (i + 3 > this.data.length)
        enlarge(3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[i++] = (byte)paramInt1;
    arrayOfByte[i++] = (byte)(paramInt2 >>> 8);
    arrayOfByte[i++] = (byte)paramInt2;
    this.length = i;
    return this;
  }
  
  public ByteVector putByteArray(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      if (this.length + paramInt2 > this.data.length)
        enlarge(paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte != null)
        System.arraycopy(paramArrayOfbyte, paramInt1, this.data, this.length, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.length += paramInt2;
    return this;
  }
  
  public ByteVector putByte(int paramInt) {
    int i = this.length;
    try {
      if (i + 1 > this.data.length)
        enlarge(1); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.data[i++] = (byte)paramInt;
    this.length = i;
    return this;
  }
  
  public final ByteVector put112(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.length;
    try {
      if (i + 4 > this.data.length)
        enlarge(4); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[i++] = (byte)paramInt1;
    arrayOfByte[i++] = (byte)paramInt2;
    arrayOfByte[i++] = (byte)(paramInt3 >>> 8);
    arrayOfByte[i++] = (byte)paramInt3;
    this.length = i;
    return this;
  }
  
  public ByteVector(int paramInt) {
    this.data = new byte[paramInt];
  }
  
  public final ByteVector encodeUtf8(String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0xC4F3E96EAA2L;
    int i = paramString.length();
    int j = paramInt1;
    int k;
    for (k = paramInt1; k < i; k++) {
      char c = paramString.charAt(k);
      try {
        if (c >= '\001')
          try {
            if (c <= '') {
              j++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (c <= '߿') {
          j += 2;
        } else {
          j += 3;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      continue;
    } 
    try {
      if (j > paramInt2)
        throw new IllegalArgumentException("UTF8 string too large"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    k = this.length - paramInt1 - 2;
    try {
      if (k >= 0) {
        this.data[k] = (byte)(j >>> 8);
        this.data[k + 1] = (byte)j;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.length + j - paramInt1 > this.data.length)
        enlarge(j - paramInt1); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int m = this.length;
    for (int n = paramInt1; n < i; n++) {
      char c = paramString.charAt(n);
      try {
        if (c >= '\001')
          try {
            if (c <= '') {
              this.data[m++] = (byte)c;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (c <= '߿') {
          this.data[m++] = (byte)(0xC0 | c >> 6 & 0x1F);
          this.data[m++] = (byte)(0x80 | c & 0x3F);
        } else {
          this.data[m++] = (byte)(0xE0 | c >> 12 & 0xF);
          this.data[m++] = (byte)(0x80 | c >> 6 & 0x3F);
          this.data[m++] = (byte)(0x80 | c & 0x3F);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      continue;
    } 
    this.length = m;
    return this;
  }
  
  public int size() {
    return this.length;
  }
  
  public ByteVector putInt(int paramInt) {
    int i = this.length;
    try {
      if (i + 4 > this.data.length)
        enlarge(4); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.data;
    arrayOfByte[i++] = (byte)(paramInt >>> 24);
    arrayOfByte[i++] = (byte)(paramInt >>> 16);
    arrayOfByte[i++] = (byte)(paramInt >>> 8);
    arrayOfByte[i++] = (byte)paramInt;
    this.length = i;
    return this;
  }
  
  public ByteVector() {
    this.data = new byte[64];
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ByteVector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */