package me.rerere.matrix.thirdparty.org.apache.commons.codec.binary;

import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.apache.commons.codec.BinaryDecoder;
import me.rerere.matrix.thirdparty.org.apache.commons.codec.BinaryEncoder;
import me.rerere.matrix.thirdparty.org.apache.commons.codec.DecoderException;
import me.rerere.matrix.thirdparty.org.apache.commons.codec.EncoderException;

public class Hex implements BinaryEncoder, BinaryDecoder {
  public static final Charset DEFAULT_CHARSET;
  
  private final Charset charset;
  
  private static final char[] DIGITS_UPPER;
  
  private static final char[] DIGITS_LOWER;
  
  public static final String DEFAULT_CHARSET_NAME = "UTF-8";
  
  private static final long a = o3.a(-8671111401319057187L, -5108075362430235143L, MethodHandles.lookup().lookupClass()).a(54239627381639L);
  
  public static String encodeHexString(byte[] paramArrayOfbyte) {
    return new String(encodeHex(paramArrayOfbyte));
  }
  
  public byte[] encode(ByteBuffer paramByteBuffer) {
    return encodeHexString(paramByteBuffer).getBytes(getCharset());
  }
  
  public byte[] decode(ByteBuffer paramByteBuffer) throws DecoderException {
    return decodeHex((new String(toByteArray(paramByteBuffer), getCharset())).toCharArray());
  }
  
  public Charset getCharset() {
    return this.charset;
  }
  
  public Object decode(Object paramObject) throws DecoderException {
    try {
      if (paramObject instanceof String)
        return decode(((String)paramObject).toCharArray()); 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof byte[])
        return decode((byte[])paramObject); 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof ByteBuffer)
        return decode((ByteBuffer)paramObject); 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      return decodeHex((char[])paramObject);
    } catch (ClassCastException classCastException) {
      throw new DecoderException(classCastException.getMessage(), classCastException);
    } 
  }
  
  public static char[] encodeHex(ByteBuffer paramByteBuffer) {
    return encodeHex(paramByteBuffer, true);
  }
  
  static {
    DEFAULT_CHARSET = StandardCharsets.UTF_8;
    DIGITS_LOWER = new char[] { 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f' };
    DIGITS_UPPER = new char[] { 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F' };
  }
  
  public static String encodeHexString(ByteBuffer paramByteBuffer) {
    return new String(encodeHex(paramByteBuffer));
  }
  
  public static char[] encodeHex(byte[] paramArrayOfbyte) {
    return encodeHex(paramArrayOfbyte, true);
  }
  
  public static byte[] decodeHex(String paramString) throws DecoderException {
    return decodeHex(paramString.toCharArray());
  }
  
  public static char[] encodeHex(ByteBuffer paramByteBuffer, char[] paramArrayOfchar) {
    return encodeHex(toByteArray(paramByteBuffer), paramArrayOfchar);
  }
  
  public byte[] encode(byte[] paramArrayOfbyte) {
    return encodeHexString(paramArrayOfbyte).getBytes(getCharset());
  }
  
  public byte[] decode(byte[] paramArrayOfbyte) throws DecoderException {
    return decodeHex((new String(paramArrayOfbyte, getCharset())).toCharArray());
  }
  
  public static char[] encodeHex(ByteBuffer paramByteBuffer, boolean paramBoolean) {
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return encodeHex(paramByteBuffer, paramBoolean ? DIGITS_LOWER : DIGITS_UPPER);
  }
  
  public static char[] encodeHex(byte[] paramArrayOfbyte, char[] paramArrayOfchar) {
    int i = paramArrayOfbyte.length;
    char[] arrayOfChar = new char[i << 1];
    encodeHex(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramArrayOfchar, arrayOfChar, 0);
    return arrayOfChar;
  }
  
  public Object encode(Object paramObject) throws EncoderException {
    byte[] arrayOfByte;
    if (paramObject instanceof String) {
      arrayOfByte = ((String)paramObject).getBytes(getCharset());
    } else if (paramObject instanceof ByteBuffer) {
      arrayOfByte = toByteArray((ByteBuffer)paramObject);
    } else {
      try {
        arrayOfByte = (byte[])paramObject;
      } catch (ClassCastException classCastException) {
        throw new EncoderException(classCastException.getMessage(), classCastException);
      } 
    } 
    return encodeHex(arrayOfByte);
  }
  
  public static String encodeHexString(ByteBuffer paramByteBuffer, boolean paramBoolean) {
    return new String(encodeHex(paramByteBuffer, paramBoolean));
  }
  
  public static byte[] decodeHex(char[] paramArrayOfchar) throws DecoderException {
    byte[] arrayOfByte = new byte[paramArrayOfchar.length >> 1];
    decodeHex(paramArrayOfchar, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static void encodeHex(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean, char[] paramArrayOfchar, int paramInt3) {
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    encodeHex(paramArrayOfbyte, paramInt1, paramInt2, paramBoolean ? DIGITS_LOWER : DIGITS_UPPER, paramArrayOfchar, paramInt3);
  }
  
  public Hex(Charset paramCharset) {
    this.charset = paramCharset;
  }
  
  public static char[] encodeHex(byte[] paramArrayOfbyte, boolean paramBoolean) {
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return encodeHex(paramArrayOfbyte, paramBoolean ? DIGITS_LOWER : DIGITS_UPPER);
  }
  
  public String toString() {
    long l = a ^ 0x6AB910C9A04FL;
    return super.toString() + "[charsetName=" + this.charset + "]";
  }
  
  public static int toDigit(char paramChar, int paramInt) throws DecoderException {
    long l = a ^ 0x64C3AB69A5AAL;
    int i = Character.digit(paramChar, 16);
    try {
      if (i == -1)
        throw new DecoderException("Illegal hexadecimal character " + paramChar + " at index " + paramInt); 
    } catch (DecoderException decoderException) {
      throw a(null);
    } 
    return i;
  }
  
  public static char[] encodeHex(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    char[] arrayOfChar = new char[paramInt2 << 1];
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    encodeHex(paramArrayOfbyte, paramInt1, paramInt2, paramBoolean ? DIGITS_LOWER : DIGITS_UPPER, arrayOfChar, 0);
    return arrayOfChar;
  }
  
  public Hex(String paramString) {
    this(Charset.forName(paramString));
  }
  
  public static int decodeHex(char[] paramArrayOfchar, byte[] paramArrayOfbyte, int paramInt) throws DecoderException {
    long l = a ^ 0x5D8E5DB834EEL;
    int i = paramArrayOfchar.length;
    try {
      if ((i & 0x1) != 0)
        throw new DecoderException("Odd number of characters."); 
    } catch (DecoderException decoderException) {
      throw a(null);
    } 
    int j = i >> 1;
    try {
      if (paramArrayOfbyte.length - paramInt < j)
        throw new DecoderException("Output array is not large enough to accommodate decoded data."); 
    } catch (DecoderException decoderException) {
      throw a(null);
    } 
    int k = paramInt;
    byte b = 0;
    while (b < i) {
      int m = toDigit(paramArrayOfchar[b], b) << 4;
      m |= toDigit(paramArrayOfchar[++b], b);
      b++;
      paramArrayOfbyte[k] = (byte)(m & 0xFF);
      k++;
    } 
    return j;
  }
  
  public String getCharsetName() {
    return this.charset.name();
  }
  
  public Hex() {
    this.charset = DEFAULT_CHARSET;
  }
  
  public static String encodeHexString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new String(encodeHex(paramArrayOfbyte, paramBoolean));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\apache\commons\codec\binary\Hex.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */