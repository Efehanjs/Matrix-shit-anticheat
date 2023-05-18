package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okio.internal._ByteStringKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ByteString implements Serializable, Comparable {
  private transient int hashCode;
  
  @Nullable
  private transient String utf8;
  
  @NotNull
  public static final ByteString$Companion Companion;
  
  private static final long serialVersionUID = 1L;
  
  @JvmField
  @NotNull
  public static final ByteString EMPTY;
  
  @NotNull
  private final byte[] data;
  
  private static final long a = o3.a(-2795538074707504210L, -4353882233560711137L, MethodHandles.lookup().lookupClass()).a(174776097530076L);
  
  public final int getHashCode$okio() {
    return this.hashCode;
  }
  
  @NotNull
  public ByteString toAsciiUppercase() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/ByteString.a : J
    //   3: ldc2_w 116412461362788
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: aload_3
    //   19: invokevirtual getData$okio : ()[B
    //   22: arraylength
    //   23: if_icmpge -> 218
    //   26: aload_3
    //   27: invokevirtual getData$okio : ()[B
    //   30: iload #5
    //   32: baload
    //   33: istore #6
    //   35: iload #6
    //   37: bipush #97
    //   39: istore #7
    //   41: iconst_0
    //   42: istore #8
    //   44: iload #7
    //   46: i2b
    //   47: if_icmplt -> 65
    //   50: iload #6
    //   52: bipush #122
    //   54: istore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iload #7
    //   61: i2b
    //   62: if_icmple -> 78
    //   65: iload #5
    //   67: istore #7
    //   69: iload #7
    //   71: iconst_1
    //   72: iadd
    //   73: istore #5
    //   75: goto -> 16
    //   78: aload_3
    //   79: invokevirtual getData$okio : ()[B
    //   82: astore #8
    //   84: iconst_0
    //   85: istore #9
    //   87: aload #8
    //   89: aload #8
    //   91: arraylength
    //   92: invokestatic copyOf : ([BI)[B
    //   95: dup
    //   96: ldc 'java.util.Arrays.copyOf(this, size)'
    //   98: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   101: astore #7
    //   103: aload #7
    //   105: iload #5
    //   107: istore #8
    //   109: iload #8
    //   111: iconst_1
    //   112: iadd
    //   113: istore #5
    //   115: iload #8
    //   117: iload #6
    //   119: bipush #32
    //   121: isub
    //   122: i2b
    //   123: bastore
    //   124: iload #5
    //   126: aload #7
    //   128: arraylength
    //   129: if_icmpge -> 206
    //   132: aload #7
    //   134: iload #5
    //   136: baload
    //   137: istore #6
    //   139: iload #6
    //   141: bipush #97
    //   143: istore #8
    //   145: iconst_0
    //   146: istore #9
    //   148: iload #8
    //   150: i2b
    //   151: if_icmplt -> 169
    //   154: iload #6
    //   156: bipush #122
    //   158: istore #8
    //   160: iconst_0
    //   161: istore #9
    //   163: iload #8
    //   165: i2b
    //   166: if_icmple -> 182
    //   169: iload #5
    //   171: istore #8
    //   173: iload #8
    //   175: iconst_1
    //   176: iadd
    //   177: istore #5
    //   179: goto -> 124
    //   182: aload #7
    //   184: iload #5
    //   186: iload #6
    //   188: bipush #32
    //   190: isub
    //   191: i2b
    //   192: bastore
    //   193: iload #5
    //   195: istore #8
    //   197: iload #8
    //   199: iconst_1
    //   200: iadd
    //   201: istore #5
    //   203: goto -> 124
    //   206: new me/rerere/matrix/thirdparty/okio/ByteString
    //   209: dup
    //   210: aload #7
    //   212: invokespecial <init> : ([B)V
    //   215: goto -> 219
    //   218: aload_3
    //   219: areturn
  }
  
  @NotNull
  public ByteString digest$okio(@NotNull String paramString) {
    long l = a ^ 0x34933FFAA8CFL;
    Intrinsics.checkNotNullParameter(paramString, "algorithm");
    MessageDigest messageDigest1 = MessageDigest.getInstance(paramString);
    boolean bool1 = false;
    boolean bool2 = false;
    MessageDigest messageDigest2 = messageDigest1;
    boolean bool3 = false;
    messageDigest2.update(getData$okio(), 0, size());
    byte[] arrayOfByte = messageDigest2.digest();
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "digestBytes");
    return new ByteString(arrayOfByte);
  }
  
  @JvmOverloads
  public final int indexOf(@NotNull ByteString paramByteString) {
    long l = a ^ 0x1CC442183A55L;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    return indexOf$default(this, paramByteString, 0, 2, (Object)null);
  }
  
  @JvmOverloads
  public final int lastIndexOf(@NotNull ByteString paramByteString, int paramInt) {
    long l = a ^ 0x211F44705B2CL;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    ByteString byteString = this;
    boolean bool = false;
    return byteString.lastIndexOf(paramByteString.internalArray$okio(), paramInt);
  }
  
  @NotNull
  public final ByteString md5() {
    long l = a ^ 0xAD3E871199L;
    return digest$okio("MD5");
  }
  
  @NotNull
  public static final ByteString of(@NotNull byte... paramVarArgs) {
    return Companion.of(paramVarArgs);
  }
  
  public void copyInto(int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x4D16632E8EA5L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "target");
    ByteString byteString = this;
    boolean bool = false;
    ArraysKt.copyInto(byteString.getData$okio(), paramArrayOfbyte, paramInt2, paramInt1, paramInt1 + paramInt3);
  }
  
  @NotNull
  public static final ByteString of(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Companion.of(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @NotNull
  public ByteString hmacSha512(@NotNull ByteString paramByteString) {
    long l = a ^ 0x57D125B39404L;
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return hmac$okio("HmacSHA512", paramByteString);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x60271C8200CFL;
    ByteString byteString = this;
    boolean bool1 = false;
    byte[] arrayOfByte = byteString.getData$okio();
    boolean bool2 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      int i = _ByteStringKt.access$codePointIndexToCharIndex(byteString.getData$okio(), 64);
      try {
        try {
          ByteString byteString1 = byteString;
          byte b1 = 0;
          byte b2 = 64;
          boolean bool5 = false;
          int j = _UtilKt.resolveDefaultParameter(byteString1, b2);
          int k = 1;
          boolean bool6 = false;
          boolean bool7 = false;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          k = (j <= (byteString1.getData$okio()).length) ? 1 : 0;
          bool6 = false;
          bool7 = false;
          if (!k) {
            boolean bool = false;
            String str = "endIndex > length(" + (byteString1.getData$okio()).length + ')';
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
            byte[] arrayOfByte1 = byteString1.getData$okio();
            bool7 = false;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        String str1 = byteString.utf8();
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
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ((arrayOfByte.length == 0)) ? "[size=0]" : ((i == -1) ? (((byteString.getData$okio()).length <= 64) ? ("[hex=" + byteString.hex() + ']') : ("[size=" + (byteString.getData$okio()).length + " hex=" + ((j == (byteString1.getData$okio()).length) ? byteString1 : new ByteString(ArraysKt.copyOfRange(arrayOfByte1, b1, j))).hex() + "…]")) : ((i < str1.length()) ? ("[size=" + (byteString.getData$okio()).length + " text=" + str2 + "…]") : ("[text=" + str2 + ']')));
  }
  
  @JvmOverloads
  public final int lastIndexOf(@NotNull ByteString paramByteString) {
    long l = a ^ 0x24E552DB4CE6L;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    return lastIndexOf$default(this, paramByteString, 0, 2, (Object)null);
  }
  
  public final byte getByte(int paramInt) {
    return internalGet$okio(paramInt);
  }
  
  @Nullable
  public static final ByteString decodeBase64(@NotNull String paramString) {
    return Companion.decodeBase64(paramString);
  }
  
  public void write(@NotNull OutputStream paramOutputStream) throws IOException {
    long l = a ^ 0x560DB5043219L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    paramOutputStream.write(this.data);
  }
  
  @NotNull
  public String utf8() {
    ByteString byteString = this;
    boolean bool = false;
    String str = byteString.getUtf8$okio();
    if (str == null) {
      str = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
      byteString.setUtf8$okio(str);
    } 
    return str;
  }
  
  public final boolean endsWith(@NotNull ByteString paramByteString) {
    long l = a ^ 0x17E922508DE2L;
    Intrinsics.checkNotNullParameter(paramByteString, "suffix");
    ByteString byteString = this;
    boolean bool = false;
    return byteString.rangeEquals(byteString.size() - paramByteString.size(), paramByteString, 0, paramByteString.size());
  }
  
  public final boolean startsWith(@NotNull ByteString paramByteString) {
    long l = a ^ 0x538A463D6009L;
    Intrinsics.checkNotNullParameter(paramByteString, "prefix");
    ByteString byteString = this;
    boolean bool = false;
    return byteString.rangeEquals(0, paramByteString, 0, paramByteString.size());
  }
  
  public boolean equals(@Nullable Object paramObject) {
    ByteString byteString = this;
    boolean bool = false;
    try {
      try {
        try {
          if (((ByteString)paramObject).size() == (byteString.getData$okio()).length)
            try {
              if (((ByteString)paramObject).rangeEquals(0, byteString.getData$okio(), 0, (byteString.getData$okio()).length));
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
    return (paramObject == byteString) ? true : ((paramObject instanceof ByteString) ? false : false);
  }
  
  @NotNull
  public ByteString hmacSha256(@NotNull ByteString paramByteString) {
    long l = a ^ 0x5313E3487654L;
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return hmac$okio("HmacSHA256", paramByteString);
  }
  
  @NotNull
  public final ByteString sha512() {
    long l = a ^ 0x1469039F8A40L;
    return digest$okio("SHA-512");
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_size() {
    return size();
  }
  
  @JvmOverloads
  public final int indexOf(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x37E6B4595959L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    return indexOf$default(this, paramArrayOfbyte, 0, 2, (Object)null);
  }
  
  public byte internalGet$okio(int paramInt) {
    ByteString byteString = this;
    boolean bool = false;
    return byteString.getData$okio()[paramInt];
  }
  
  static {
    Companion = new ByteString$Companion(null);
    EMPTY = new ByteString(new byte[0]);
  }
  
  @JvmOverloads
  public int indexOf(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/ByteString.a : J
    //   3: ldc2_w 49136768202297
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc 'other'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: astore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: aload #5
    //   22: invokevirtual getData$okio : ()[B
    //   25: arraylength
    //   26: aload_1
    //   27: arraylength
    //   28: isub
    //   29: istore #7
    //   31: iconst_0
    //   32: istore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: iload_2
    //   38: iload #8
    //   40: invokestatic max : (II)I
    //   43: istore #10
    //   45: iload #10
    //   47: iload #7
    //   49: if_icmpgt -> 88
    //   52: iload #10
    //   54: istore #8
    //   56: iinc #10, 1
    //   59: aload #5
    //   61: invokevirtual getData$okio : ()[B
    //   64: iload #8
    //   66: aload_1
    //   67: iconst_0
    //   68: aload_1
    //   69: arraylength
    //   70: invokestatic arrayRangeEquals : ([BI[BII)Z
    //   73: ifeq -> 81
    //   76: iload #8
    //   78: goto -> 89
    //   81: iload #8
    //   83: iload #7
    //   85: if_icmpne -> 52
    //   88: iconst_m1
    //   89: ireturn
  }
  
  @JvmOverloads
  @NotNull
  public ByteString substring(int paramInt1, int paramInt2) {
    long l = a ^ 0x26B4691E2FC0L;
    ByteString byteString = this;
    boolean bool1 = false;
    int i = _UtilKt.resolveDefaultParameter(byteString, paramInt2);
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
    j = (i <= (byteString.getData$okio()).length) ? 1 : 0;
    bool2 = false;
    bool3 = false;
    if (!j) {
      boolean bool = false;
      String str = "endIndex > length(" + (byteString.getData$okio()).length + ')';
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
          if (i == (byteString.getData$okio()).length);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = byteString.getData$okio();
    bool3 = false;
    return new ByteString(ArraysKt.copyOfRange(arrayOfByte, paramInt1, i));
  }
  
  @NotNull
  public ByteBuffer asByteBuffer() {
    long l = a ^ 0xA174F6844A8L;
    ByteBuffer byteBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    Intrinsics.checkNotNullExpressionValue(byteBuffer, "wrap(data).asReadOnlyBuffer()");
    return byteBuffer;
  }
  
  @NotNull
  public String base64() {
    ByteString byteString = this;
    boolean bool = false;
    return _Base64Kt.encodeBase64$default(byteString.getData$okio(), null, 1, null);
  }
  
  @Deprecated(message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}), level = DeprecationLevel.ERROR)
  public final byte -deprecated_getByte(int paramInt) {
    return getByte(paramInt);
  }
  
  @NotNull
  public static final ByteString decodeHex(@NotNull String paramString) {
    return Companion.decodeHex(paramString);
  }
  
  @NotNull
  public byte[] internalArray$okio() {
    ByteString byteString = this;
    boolean bool = false;
    return byteString.getData$okio();
  }
  
  @NotNull
  public static final ByteString read(@NotNull InputStream paramInputStream, int paramInt) throws IOException {
    return Companion.read(paramInputStream, paramInt);
  }
  
  @NotNull
  public ByteString toAsciiLowercase() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/ByteString.a : J
    //   3: ldc2_w 6869568807175
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: aload_3
    //   19: invokevirtual getData$okio : ()[B
    //   22: arraylength
    //   23: if_icmpge -> 218
    //   26: aload_3
    //   27: invokevirtual getData$okio : ()[B
    //   30: iload #5
    //   32: baload
    //   33: istore #6
    //   35: iload #6
    //   37: bipush #65
    //   39: istore #7
    //   41: iconst_0
    //   42: istore #8
    //   44: iload #7
    //   46: i2b
    //   47: if_icmplt -> 65
    //   50: iload #6
    //   52: bipush #90
    //   54: istore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iload #7
    //   61: i2b
    //   62: if_icmple -> 78
    //   65: iload #5
    //   67: istore #7
    //   69: iload #7
    //   71: iconst_1
    //   72: iadd
    //   73: istore #5
    //   75: goto -> 16
    //   78: aload_3
    //   79: invokevirtual getData$okio : ()[B
    //   82: astore #8
    //   84: iconst_0
    //   85: istore #9
    //   87: aload #8
    //   89: aload #8
    //   91: arraylength
    //   92: invokestatic copyOf : ([BI)[B
    //   95: dup
    //   96: ldc 'java.util.Arrays.copyOf(this, size)'
    //   98: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   101: astore #7
    //   103: aload #7
    //   105: iload #5
    //   107: istore #8
    //   109: iload #8
    //   111: iconst_1
    //   112: iadd
    //   113: istore #5
    //   115: iload #8
    //   117: iload #6
    //   119: bipush #-32
    //   121: isub
    //   122: i2b
    //   123: bastore
    //   124: iload #5
    //   126: aload #7
    //   128: arraylength
    //   129: if_icmpge -> 206
    //   132: aload #7
    //   134: iload #5
    //   136: baload
    //   137: istore #6
    //   139: iload #6
    //   141: bipush #65
    //   143: istore #8
    //   145: iconst_0
    //   146: istore #9
    //   148: iload #8
    //   150: i2b
    //   151: if_icmplt -> 169
    //   154: iload #6
    //   156: bipush #90
    //   158: istore #8
    //   160: iconst_0
    //   161: istore #9
    //   163: iload #8
    //   165: i2b
    //   166: if_icmple -> 182
    //   169: iload #5
    //   171: istore #8
    //   173: iload #8
    //   175: iconst_1
    //   176: iadd
    //   177: istore #5
    //   179: goto -> 124
    //   182: aload #7
    //   184: iload #5
    //   186: iload #6
    //   188: bipush #-32
    //   190: isub
    //   191: i2b
    //   192: bastore
    //   193: iload #5
    //   195: istore #8
    //   197: iload #8
    //   199: iconst_1
    //   200: iadd
    //   201: istore #5
    //   203: goto -> 124
    //   206: new me/rerere/matrix/thirdparty/okio/ByteString
    //   209: dup
    //   210: aload #7
    //   212: invokespecial <init> : ([B)V
    //   215: goto -> 219
    //   218: aload_3
    //   219: areturn
  }
  
  public final void setUtf8$okio(@Nullable String paramString) {
    this.utf8 = paramString;
  }
  
  @NotNull
  public final byte[] getData$okio() {
    return this.data;
  }
  
  @JvmOverloads
  @NotNull
  public final ByteString substring() {
    return substring$default(this, 0, 0, 3, null);
  }
  
  public int hashCode() {
    ByteString byteString = this;
    boolean bool = false;
    int i = byteString.getHashCode$okio();
    try {
      byte[] arrayOfByte = byteString.getData$okio();
      boolean bool1 = false;
      int j = Arrays.hashCode(arrayOfByte);
      bool1 = false;
      boolean bool2 = false;
      int k = j;
      boolean bool3 = false;
      byteString.setHashCode$okio(k);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i != 0) ? i : j;
  }
  
  @NotNull
  public String base64Url() {
    ByteString byteString = this;
    boolean bool = false;
    return _Base64Kt.encodeBase64(byteString.getData$okio(), _Base64Kt.getBASE64_URL_SAFE());
  }
  
  @JvmOverloads
  @NotNull
  public final ByteString substring(int paramInt) {
    return substring$default(this, paramInt, 0, 2, null);
  }
  
  @NotNull
  public static final ByteString of(@NotNull ByteBuffer paramByteBuffer) {
    return Companion.of(paramByteBuffer);
  }
  
  public int compareTo(@NotNull ByteString paramByteString) {
    long l = a ^ 0x6B98A4EDD0AEL;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    ByteString byteString = this;
    boolean bool = false;
    int i = byteString.size();
    int j = paramByteString.size();
    int k = 0;
    int m = 0;
    int n = Math.min(i, j);
    while (k < n) {
      byte b = byteString.getByte(k);
      int i2 = 255;
      char c = Character.MIN_VALUE;
      m = b & i2;
      i2 = paramByteString.getByte(k);
      c = 'ÿ';
      boolean bool1 = false;
      int i1 = i2 & c;
      if (m == i1) {
        i2 = k;
        k = i2 + 1;
        continue;
      } 
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return (m < i1) ? -1 : 1;
    } 
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i == j) ? 0 : ((i < j) ? -1 : 1);
  }
  
  public boolean rangeEquals(int paramInt1, @NotNull ByteString paramByteString, int paramInt2, int paramInt3) {
    long l = a ^ 0x124BDA165478L;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    ByteString byteString = this;
    boolean bool = false;
    return paramByteString.rangeEquals(paramInt2, byteString.getData$okio(), paramInt1, paramInt3);
  }
  
  public boolean rangeEquals(int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x736A3A8F6D7EL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    ByteString byteString = this;
    boolean bool = false;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= (byteString.getData$okio()).length - paramInt3)
            try {
              if (paramInt2 >= 0)
                try {
                  if (paramInt2 <= paramArrayOfbyte.length - paramInt3)
                    try {
                      if (_UtilKt.arrayRangeEquals(byteString.getData$okio(), paramInt1, paramArrayOfbyte, paramInt2, paramInt3));
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
  
  @NotNull
  public static final ByteString encodeUtf8(@NotNull String paramString) {
    return Companion.encodeUtf8(paramString);
  }
  
  public final boolean endsWith(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x158F82C370DDL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "suffix");
    ByteString byteString = this;
    boolean bool = false;
    return byteString.rangeEquals(byteString.size() - paramArrayOfbyte.length, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  @NotNull
  public final ByteString sha1() {
    long l = a ^ 0x4689E81076L;
    return digest$okio("SHA-1");
  }
  
  @Nullable
  public final String getUtf8$okio() {
    return this.utf8;
  }
  
  @NotNull
  public static final ByteString encodeString(@NotNull String paramString, @NotNull Charset paramCharset) {
    return Companion.encodeString(paramString, paramCharset);
  }
  
  @NotNull
  public String string(@NotNull Charset paramCharset) {
    long l = a ^ 0x3C8E032D72C7L;
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    byte[] arrayOfByte = this.data;
    boolean bool = false;
    return new String(arrayOfByte, paramCharset);
  }
  
  public final int size() {
    return getSize$okio();
  }
  
  @NotNull
  public final ByteString sha256() {
    long l = a ^ 0x6E0FE9832CC1L;
    return digest$okio("SHA-256");
  }
  
  @NotNull
  public ByteString hmacSha1(@NotNull ByteString paramByteString) {
    long l = a ^ 0x49E5F7A819B8L;
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return hmac$okio("HmacSHA1", paramByteString);
  }
  
  @NotNull
  public String hex() {
    ByteString byteString = this;
    boolean bool = false;
    char[] arrayOfChar = new char[(byteString.getData$okio()).length * 2];
    int i = 0;
    byte[] arrayOfByte = byteString.getData$okio();
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
      arrayOfChar[k] = _ByteStringKt.getHEX_DIGIT_CHARS()[k >> b2 & 0xF];
      k = i;
      i = k + 1;
      k = b1;
      b2 = 15;
      bool1 = false;
      arrayOfChar[k] = _ByteStringKt.getHEX_DIGIT_CHARS()[k & b2];
    } 
    return StringsKt.concatToString(arrayOfChar);
  }
  
  @NotNull
  public byte[] toByteArray() {
    long l = a ^ 0x6AD686A4BDBBL;
    ByteString byteString = this;
    boolean bool1 = false;
    byte[] arrayOfByte = byteString.getData$okio();
    boolean bool2 = false;
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte, arrayOfByte.length), "java.util.Arrays.copyOf(this, size)");
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  @JvmOverloads
  public final int indexOf(@NotNull ByteString paramByteString, int paramInt) {
    long l = a ^ 0x1437ABFC8539L;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    return indexOf(paramByteString.internalArray$okio(), paramInt);
  }
  
  public final boolean startsWith(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x44CCA1974082L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "prefix");
    ByteString byteString = this;
    boolean bool = false;
    return byteString.rangeEquals(0, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  @JvmOverloads
  public int lastIndexOf(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/ByteString.a : J
    //   3: ldc2_w 116102010598643
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc 'other'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: astore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: aload #5
    //   22: iload_2
    //   23: invokestatic resolveDefaultParameter : (Lme/rerere/matrix/thirdparty/okio/ByteString;I)I
    //   26: istore #7
    //   28: aload #5
    //   30: invokevirtual getData$okio : ()[B
    //   33: arraylength
    //   34: aload_1
    //   35: arraylength
    //   36: isub
    //   37: istore #8
    //   39: iconst_0
    //   40: istore #9
    //   42: iload #7
    //   44: iload #8
    //   46: invokestatic min : (II)I
    //   49: istore #10
    //   51: iconst_0
    //   52: iload #10
    //   54: if_icmpgt -> 92
    //   57: iload #10
    //   59: istore #9
    //   61: iinc #10, -1
    //   64: aload #5
    //   66: invokevirtual getData$okio : ()[B
    //   69: iload #9
    //   71: aload_1
    //   72: iconst_0
    //   73: aload_1
    //   74: arraylength
    //   75: invokestatic arrayRangeEquals : ([BI[BII)Z
    //   78: ifeq -> 86
    //   81: iload #9
    //   83: goto -> 93
    //   86: iconst_0
    //   87: iload #10
    //   89: if_icmple -> 57
    //   92: iconst_m1
    //   93: ireturn
  }
  
  public int getSize$okio() {
    ByteString byteString = this;
    boolean bool = false;
    return (byteString.getData$okio()).length;
  }
  
  @JvmOverloads
  public final int lastIndexOf(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x15A32ACA199CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    return lastIndexOf$default(this, paramArrayOfbyte, 0, 2, (Object)null);
  }
  
  public final void setHashCode$okio(int paramInt) {
    this.hashCode = paramInt;
  }
  
  @NotNull
  public ByteString hmac$okio(@NotNull String paramString, @NotNull ByteString paramByteString) {
    long l = a ^ 0x66FB158996BAL;
    Intrinsics.checkNotNullParameter(paramString, "algorithm");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    try {
      Mac mac = Mac.getInstance(paramString);
      mac.init(new SecretKeySpec(paramByteString.toByteArray(), paramString));
      byte[] arrayOfByte = mac.doFinal(this.data);
      Intrinsics.checkNotNullExpressionValue(arrayOfByte, "mac.doFinal(data)");
      return new ByteString(arrayOfByte);
    } catch (InvalidKeyException invalidKeyException) {
      throw new IllegalArgumentException((Throwable)invalidKeyException);
    } 
  }
  
  public void write$okio(@NotNull Buffer paramBuffer, int paramInt1, int paramInt2) {
    long l = a ^ 0x77617752B0C8L;
    Intrinsics.checkNotNullParameter(paramBuffer, "buffer");
    _ByteStringKt.commonWrite(this, paramBuffer, paramInt1, paramInt2);
  }
  
  public ByteString(@NotNull byte[] paramArrayOfbyte) {
    this.data = paramArrayOfbyte;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\ByteString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */