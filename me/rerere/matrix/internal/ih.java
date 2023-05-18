package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ih {
  public boolean l = false;
  
  public final short r;
  
  public boolean x = false;
  
  public long z;
  
  public double k;
  
  public boolean v = false;
  
  public double b;
  
  public double i;
  
  private static final long a = o3.a(-3311436485651342769L, -5870065844693429633L, MethodHandles.lookup().lookupClass()).a(207929617946203L);
  
  private static final String c;
  
  public boolean b(Object paramObject) {
    return paramObject instanceof ih;
  }
  
  public boolean equals(Object paramObject) {
    long l = a ^ 0x64876C68A485L;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (paramObject == this)
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (!(paramObject instanceof ih))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ih ih1 = (ih)paramObject;
    try {
      if (i != 0)
        try {
          if (!ih1.b(this))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(this.b, ih1.b) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(this.k, ih1.k) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(this.i, ih1.i) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (this.z != ih1.z)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public String b(long paramLong) {
    paramLong = a ^ paramLong;
    return String.format(c, new Object[] { Double.valueOf(zc.b(this.b)), Double.valueOf(zc.b(this.k)), Double.valueOf(zc.b(this.i)) });
  }
  
  public int hashCode() {
    byte b = 59;
    null = 1;
    long l1 = Double.doubleToLongBits(this.b);
    null = null * 59 + (int)(l1 >>> 32L ^ l1);
    long l2 = Double.doubleToLongBits(this.k);
    null = null * 59 + (int)(l2 >>> 32L ^ l2);
    long l3 = Double.doubleToLongBits(this.i);
    null = null * 59 + (int)(l3 >>> 32L ^ l3);
    long l4 = this.z;
    return null * 59 + (int)(l4 >>> 32L ^ l4);
  }
  
  public ih(double paramDouble1, double paramDouble2, double paramDouble3, short paramShort) {
    this.b = paramDouble1;
    this.k = paramDouble2;
    this.i = paramDouble3;
    this.r = paramShort;
    this.z = pc.j();
  }
  
  static {
    long l = a ^ 0x5E3DFB7A23F4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */