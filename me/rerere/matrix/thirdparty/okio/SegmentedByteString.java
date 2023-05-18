package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.internal._SegmentedByteStringKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SegmentedByteString extends ByteString {
  @NotNull
  private final transient byte[][] segments;
  
  @NotNull
  private final transient int[] directory;
  
  private static final long b = o3.a(9180253569330503601L, -7276604549189427092L, MethodHandles.lookup().lookupClass()).a(69110353780486L);
  
  public boolean rangeEquals(int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = b ^ 0x2D34E8B2B186L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= segmentedByteString.size() - paramInt3)
            try {
              if (paramInt2 >= 0) {
                try {
                  if (paramInt2 <= paramArrayOfbyte.length - paramInt3) {
                    int i = 0;
                    i = paramInt2;
                    SegmentedByteString segmentedByteString1 = segmentedByteString;
                    int j = paramInt1 + paramInt3;
                    boolean bool1 = false;
                    int k = _SegmentedByteStringKt.segment(segmentedByteString1, paramInt1);
                    int m = paramInt1;
                    while (true) {
                      try {
                        if (m < j) {
                          try {
                          
                          } catch (IllegalArgumentException illegalArgumentException) {
                            throw b(null);
                          } 
                          byte b = (k == 0) ? 0 : segmentedByteString1.getDirectory$okio()[k - 1];
                          int n = segmentedByteString1.getDirectory$okio()[k] - b;
                          int i1 = segmentedByteString1.getDirectory$okio()[((Object[])segmentedByteString1.getSegments$okio()).length + k];
                          int i2 = b + n;
                          int i3 = 0;
                          int i4 = Math.min(j, i2) - m;
                          i2 = i1 + m - b;
                          int i5 = i4;
                          int i6 = i2;
                          byte[] arrayOfByte = segmentedByteString1.getSegments$okio()[k];
                          boolean bool2 = false;
                          try {
                            if (!_UtilKt.arrayRangeEquals(arrayOfByte, i6, paramArrayOfbyte, i, i5)) {
                            
                            } else {
                              i += i5;
                              m += i4;
                              i3 = k;
                              k = i3 + 1;
                              continue;
                            } 
                          } catch (IllegalArgumentException illegalArgumentException) {
                            throw b(null);
                          } 
                        } else {
                        
                        } 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw b(null);
                      } 
                      return true;
                    } 
                  } 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw b(null);
                } 
                return false;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public SegmentedByteString(@NotNull byte[][] paramArrayOfbyte, @NotNull int[] paramArrayOfint) {
    super(ByteString.EMPTY.getData$okio());
    this.segments = paramArrayOfbyte;
    this.directory = paramArrayOfint;
  }
  
  public int getSize$okio() {
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    return segmentedByteString.getDirectory$okio()[((Object[])segmentedByteString.getSegments$okio()).length - 1];
  }
  
  @NotNull
  public String string(@NotNull Charset paramCharset) {
    long l = b ^ 0x62D0D110AE3FL;
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    return toByteString().string(paramCharset);
  }
  
  @NotNull
  public String base64Url() {
    return toByteString().base64Url();
  }
  
  @NotNull
  public final int[] getDirectory$okio() {
    return this.directory;
  }
  
  public int hashCode() {
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    int i = 0;
    i = segmentedByteString.getHashCode$okio();
    try {
      i = 1;
      SegmentedByteString segmentedByteString1 = segmentedByteString;
      boolean bool1 = false;
      int j = ((Object[])segmentedByteString1.getSegments$okio()).length;
      int k = 0;
      int m = 0;
      while (k < j) {
        int n = segmentedByteString1.getDirectory$okio()[j + k];
        int i1 = segmentedByteString1.getDirectory$okio()[k];
        int i2 = i1 - m;
        int i3 = n;
        byte[] arrayOfByte = segmentedByteString1.getSegments$okio()[k];
        boolean bool2 = false;
        int i5 = i3;
        int i6 = i3 + i2;
        while (i5 < i6) {
          i = 31 * i + arrayOfByte[i5];
          int i7 = i5;
          i5 = i7 + 1;
        } 
        m = i1;
        int i4 = k;
        k = i4 + 1;
      } 
      segmentedByteString.setHashCode$okio(i);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (i != 0) ? i : i;
  }
  
  @NotNull
  public byte[] internalArray$okio() {
    return toByteArray();
  }
  
  @NotNull
  public String hex() {
    return toByteString().hex();
  }
  
  @NotNull
  public String toString() {
    return toByteString().toString();
  }
  
  @NotNull
  public ByteString hmac$okio(@NotNull String paramString, @NotNull ByteString paramByteString) {
    long l = b ^ 0x38A5C7B44A42L;
    Intrinsics.checkNotNullParameter(paramString, "algorithm");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    try {
      Mac mac = Mac.getInstance(paramString);
      mac.init(new SecretKeySpec(paramByteString.toByteArray(), paramString));
      SegmentedByteString segmentedByteString = this;
      boolean bool = false;
      int i = ((Object[])segmentedByteString.getSegments$okio()).length;
      int j = 0;
      int k = 0;
      while (j < i) {
        int m = segmentedByteString.getDirectory$okio()[i + j];
        int n = segmentedByteString.getDirectory$okio()[j];
        int i1 = n - k;
        int i2 = m;
        byte[] arrayOfByte1 = segmentedByteString.getSegments$okio()[j];
        boolean bool1 = false;
        mac.update(arrayOfByte1, i2, i1);
        k = n;
        int i3 = j;
        j = i3 + 1;
      } 
      byte[] arrayOfByte = mac.doFinal();
      Intrinsics.checkNotNullExpressionValue(arrayOfByte, "mac.doFinal()");
      return new ByteString(arrayOfByte);
    } catch (InvalidKeyException invalidKeyException) {
      throw new IllegalArgumentException((Throwable)invalidKeyException);
    } 
  }
  
  @NotNull
  public String base64() {
    return toByteString().base64();
  }
  
  @NotNull
  public ByteBuffer asByteBuffer() {
    long l = b ^ 0x54499D559850L;
    ByteBuffer byteBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    Intrinsics.checkNotNullExpressionValue(byteBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
    return byteBuffer;
  }
  
  public boolean rangeEquals(int paramInt1, @NotNull ByteString paramByteString, int paramInt2, int paramInt3) {
    long l = b ^ 0x4C15082B8880L;
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    try {
      if (paramInt1 >= 0) {
        try {
          if (paramInt1 <= segmentedByteString.size() - paramInt3) {
            int i = 0;
            i = paramInt2;
            SegmentedByteString segmentedByteString1 = segmentedByteString;
            int j = paramInt1 + paramInt3;
            boolean bool1 = false;
            int k = _SegmentedByteStringKt.segment(segmentedByteString1, paramInt1);
            int m = paramInt1;
            while (true) {
              try {
                if (m < j) {
                  try {
                  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw b(null);
                  } 
                  byte b = (k == 0) ? 0 : segmentedByteString1.getDirectory$okio()[k - 1];
                  int n = segmentedByteString1.getDirectory$okio()[k] - b;
                  int i1 = segmentedByteString1.getDirectory$okio()[((Object[])segmentedByteString1.getSegments$okio()).length + k];
                  int i2 = b + n;
                  int i3 = 0;
                  int i4 = Math.min(j, i2) - m;
                  i2 = i1 + m - b;
                  int i5 = i4;
                  int i6 = i2;
                  byte[] arrayOfByte = segmentedByteString1.getSegments$okio()[k];
                  boolean bool2 = false;
                  try {
                    if (!paramByteString.rangeEquals(i, arrayOfByte, i6, i5)) {
                    
                    } else {
                      i += i5;
                      m += i4;
                      i3 = k;
                      k = i3 + 1;
                      continue;
                    } 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw b(null);
                  } 
                } else {
                
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw b(null);
              } 
              return true;
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  @NotNull
  public ByteString toAsciiUppercase() {
    return toByteString().toAsciiUppercase();
  }
  
  public int lastIndexOf(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x37C6C924A80BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    return toByteString().lastIndexOf(paramArrayOfbyte, paramInt);
  }
  
  @NotNull
  public ByteString substring(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/SegmentedByteString.b : J
    //   3: ldc2_w 132949557375800
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: aload #5
    //   16: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   19: iload_2
    //   20: invokestatic resolveDefaultParameter : (Lme/rerere/matrix/thirdparty/okio/ByteString;I)I
    //   23: istore #7
    //   25: iload_1
    //   26: iflt -> 37
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #8
    //   40: iconst_0
    //   41: istore #9
    //   43: iconst_0
    //   44: istore #10
    //   46: iload #8
    //   48: ifne -> 96
    //   51: iconst_0
    //   52: istore #11
    //   54: new java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: ldc 'beginIndex='
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: iload_1
    //   67: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   70: ldc ' < 0'
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual toString : ()Ljava/lang/String;
    //   78: astore #10
    //   80: new java/lang/IllegalArgumentException
    //   83: dup
    //   84: aload #10
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: checkcast java/lang/Throwable
    //   95: athrow
    //   96: iload #7
    //   98: aload #5
    //   100: invokevirtual size : ()I
    //   103: if_icmpgt -> 114
    //   106: iconst_1
    //   107: goto -> 115
    //   110: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: iconst_0
    //   115: istore #8
    //   117: iconst_0
    //   118: istore #9
    //   120: iconst_0
    //   121: istore #10
    //   123: iload #8
    //   125: ifne -> 187
    //   128: iconst_0
    //   129: istore #11
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: ldc 'endIndex='
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: iload #7
    //   145: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   148: ldc ' > length('
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload #5
    //   155: invokevirtual size : ()I
    //   158: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   161: bipush #41
    //   163: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   166: invokevirtual toString : ()Ljava/lang/String;
    //   169: astore #10
    //   171: new java/lang/IllegalArgumentException
    //   174: dup
    //   175: aload #10
    //   177: invokevirtual toString : ()Ljava/lang/String;
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: checkcast java/lang/Throwable
    //   186: athrow
    //   187: iload #7
    //   189: iload_1
    //   190: isub
    //   191: istore #8
    //   193: iload #8
    //   195: iflt -> 206
    //   198: iconst_1
    //   199: goto -> 207
    //   202: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   205: athrow
    //   206: iconst_0
    //   207: istore #9
    //   209: iconst_0
    //   210: istore #10
    //   212: iconst_0
    //   213: istore #11
    //   215: iload #9
    //   217: ifne -> 270
    //   220: iconst_0
    //   221: istore #12
    //   223: new java/lang/StringBuilder
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: ldc 'endIndex='
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: iload #7
    //   237: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   240: ldc ' < beginIndex='
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: iload_1
    //   246: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   249: invokevirtual toString : ()Ljava/lang/String;
    //   252: astore #11
    //   254: new java/lang/IllegalArgumentException
    //   257: dup
    //   258: aload #11
    //   260: invokevirtual toString : ()Ljava/lang/String;
    //   263: invokespecial <init> : (Ljava/lang/String;)V
    //   266: checkcast java/lang/Throwable
    //   269: athrow
    //   270: nop
    //   271: iload_1
    //   272: ifne -> 304
    //   275: iload #7
    //   277: aload #5
    //   279: invokevirtual size : ()I
    //   282: if_icmpne -> 304
    //   285: goto -> 292
    //   288: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   291: athrow
    //   292: aload #5
    //   294: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   297: goto -> 552
    //   300: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   303: athrow
    //   304: iload_1
    //   305: iload #7
    //   307: if_icmpne -> 320
    //   310: getstatic me/rerere/matrix/thirdparty/okio/ByteString.EMPTY : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   313: goto -> 552
    //   316: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   319: athrow
    //   320: aload #5
    //   322: iload_1
    //   323: invokestatic segment : (Lme/rerere/matrix/thirdparty/okio/SegmentedByteString;I)I
    //   326: istore #9
    //   328: aload #5
    //   330: iload #7
    //   332: iconst_1
    //   333: isub
    //   334: invokestatic segment : (Lme/rerere/matrix/thirdparty/okio/SegmentedByteString;I)I
    //   337: istore #10
    //   339: aload #5
    //   341: invokevirtual getSegments$okio : ()[[B
    //   344: checkcast [Ljava/lang/Object;
    //   347: astore #12
    //   349: iload #10
    //   351: iconst_1
    //   352: iadd
    //   353: istore #13
    //   355: iconst_0
    //   356: istore #14
    //   358: aload #12
    //   360: iload #9
    //   362: iload #13
    //   364: invokestatic copyOfRange : ([Ljava/lang/Object;II)[Ljava/lang/Object;
    //   367: checkcast [[B
    //   370: astore #11
    //   372: aload #11
    //   374: checkcast [Ljava/lang/Object;
    //   377: arraylength
    //   378: iconst_2
    //   379: imul
    //   380: newarray int
    //   382: astore #12
    //   384: iconst_0
    //   385: istore #13
    //   387: iload #9
    //   389: istore #14
    //   391: iload #14
    //   393: iload #10
    //   395: if_icmpgt -> 479
    //   398: iload #14
    //   400: istore #15
    //   402: iinc #14, 1
    //   405: aload #12
    //   407: iload #13
    //   409: aload #5
    //   411: invokevirtual getDirectory$okio : ()[I
    //   414: iload #15
    //   416: iaload
    //   417: iload_1
    //   418: isub
    //   419: istore #16
    //   421: iconst_0
    //   422: istore #17
    //   424: iload #16
    //   426: iload #8
    //   428: invokestatic min : (II)I
    //   431: iastore
    //   432: aload #12
    //   434: iload #13
    //   436: istore #16
    //   438: iload #16
    //   440: iconst_1
    //   441: iadd
    //   442: istore #13
    //   444: iload #16
    //   446: aload #11
    //   448: checkcast [Ljava/lang/Object;
    //   451: arraylength
    //   452: iadd
    //   453: aload #5
    //   455: invokevirtual getDirectory$okio : ()[I
    //   458: iload #15
    //   460: aload #5
    //   462: invokevirtual getSegments$okio : ()[[B
    //   465: checkcast [Ljava/lang/Object;
    //   468: arraylength
    //   469: iadd
    //   470: iaload
    //   471: iastore
    //   472: iload #15
    //   474: iload #10
    //   476: if_icmpne -> 398
    //   479: iload #9
    //   481: ifne -> 499
    //   484: goto -> 491
    //   487: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   490: athrow
    //   491: iconst_0
    //   492: goto -> 509
    //   495: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   498: athrow
    //   499: aload #5
    //   501: invokevirtual getDirectory$okio : ()[I
    //   504: iload #9
    //   506: iconst_1
    //   507: isub
    //   508: iaload
    //   509: istore #14
    //   511: aload #12
    //   513: astore #15
    //   515: aload #11
    //   517: checkcast [Ljava/lang/Object;
    //   520: arraylength
    //   521: istore #16
    //   523: aload #15
    //   525: iload #16
    //   527: aload #15
    //   529: iload #16
    //   531: iaload
    //   532: iload_1
    //   533: iload #14
    //   535: isub
    //   536: iadd
    //   537: iastore
    //   538: new me/rerere/matrix/thirdparty/okio/SegmentedByteString
    //   541: dup
    //   542: aload #11
    //   544: aload #12
    //   546: invokespecial <init> : ([[B[I)V
    //   549: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   552: areturn
    // Exception table:
    //   from	to	target	type
    //   25	33	33	java/lang/IllegalArgumentException
    //   96	110	110	java/lang/IllegalArgumentException
    //   193	202	202	java/lang/IllegalArgumentException
    //   270	285	288	java/lang/IllegalArgumentException
    //   275	300	300	java/lang/IllegalArgumentException
    //   304	316	316	java/lang/IllegalArgumentException
    //   444	484	487	java/lang/IllegalArgumentException
    //   479	495	495	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public ByteString digest$okio(@NotNull String paramString) {
    long l = b ^ 0x6ACDEDC77437L;
    Intrinsics.checkNotNullParameter(paramString, "algorithm");
    MessageDigest messageDigest1 = MessageDigest.getInstance(paramString);
    boolean bool1 = false;
    boolean bool2 = false;
    MessageDigest messageDigest2 = messageDigest1;
    boolean bool3 = false;
    SegmentedByteString segmentedByteString = this;
    boolean bool4 = false;
    int i = ((Object[])segmentedByteString.getSegments$okio()).length;
    int j = 0;
    int k = 0;
    while (j < i) {
      int m = segmentedByteString.getDirectory$okio()[i + j];
      int n = segmentedByteString.getDirectory$okio()[j];
      int i1 = n - k;
      int i2 = m;
      byte[] arrayOfByte1 = segmentedByteString.getSegments$okio()[j];
      boolean bool = false;
      messageDigest2.update(arrayOfByte1, i2, i1);
      k = n;
      int i3 = j;
      j = i3 + 1;
    } 
    byte[] arrayOfByte = messageDigest2.digest();
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "digestBytes");
    return new ByteString(arrayOfByte);
  }
  
  @NotNull
  public ByteString toAsciiLowercase() {
    return toByteString().toAsciiLowercase();
  }
  
  @NotNull
  public final byte[][] getSegments$okio() {
    return this.segments;
  }
  
  public byte internalGet$okio(int paramInt) {
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    _UtilKt.checkOffsetAndCount(segmentedByteString.getDirectory$okio()[((Object[])segmentedByteString.getSegments$okio()).length - 1], paramInt, 1L);
    int i = _SegmentedByteStringKt.segment(segmentedByteString, paramInt);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    byte b = (i == 0) ? 0 : segmentedByteString.getDirectory$okio()[i - 1];
    int j = segmentedByteString.getDirectory$okio()[i + ((Object[])segmentedByteString.getSegments$okio()).length];
    return segmentedByteString.getSegments$okio()[i][paramInt - b + j];
  }
  
  public boolean equals(@Nullable Object paramObject) {
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    try {
      try {
        try {
          if (((ByteString)paramObject).size() == segmentedByteString.size())
            try {
              if (segmentedByteString.rangeEquals(0, (ByteString)paramObject, 0, segmentedByteString.size()));
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (paramObject == segmentedByteString) ? true : ((paramObject instanceof ByteString) ? false : false);
  }
  
  public void write(@NotNull OutputStream paramOutputStream) throws IOException {
    long l = b ^ 0x8536739EEE1L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    SegmentedByteString segmentedByteString = this;
    boolean bool = false;
    int i = ((Object[])segmentedByteString.getSegments$okio()).length;
    int j = 0;
    int k = 0;
    while (j < i) {
      int m = segmentedByteString.getDirectory$okio()[i + j];
      int n = segmentedByteString.getDirectory$okio()[j];
      int i1 = n - k;
      int i2 = m;
      byte[] arrayOfByte = segmentedByteString.getSegments$okio()[j];
      boolean bool1 = false;
      paramOutputStream.write(arrayOfByte, i2, i1);
      k = n;
      int i3 = j;
      j = i3 + 1;
    } 
  }
  
  public void write$okio(@NotNull Buffer paramBuffer, int paramInt1, int paramInt2) {
    long l = b ^ 0x293FA56F6C30L;
    Intrinsics.checkNotNullParameter(paramBuffer, "buffer");
    SegmentedByteString segmentedByteString1 = this;
    boolean bool1 = false;
    SegmentedByteString segmentedByteString2 = segmentedByteString1;
    int i = paramInt1 + paramInt2;
    boolean bool2 = false;
    int j = _SegmentedByteStringKt.segment(segmentedByteString2, paramInt1);
    int k = paramInt1;
    while (true) {
      try {
        if (k < i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          byte b = (j == 0) ? 0 : segmentedByteString2.getDirectory$okio()[j - 1];
          int m = segmentedByteString2.getDirectory$okio()[j] - b;
          int n = segmentedByteString2.getDirectory$okio()[((Object[])segmentedByteString2.getSegments$okio()).length + j];
          int i1 = b + m;
          int i2 = 0;
          int i3 = Math.min(i, i1) - k;
          i1 = n + k - b;
          int i4 = i3;
          int i5 = i1;
          byte[] arrayOfByte = segmentedByteString2.getSegments$okio()[j];
          boolean bool = false;
          Segment segment = new Segment(arrayOfByte, i5, i5 + i4, true, false);
          try {
            if (paramBuffer.head == null) {
              segment.prev = segment;
              segment.next = segment.prev;
              paramBuffer.head = segment.next;
            } else {
              Intrinsics.checkNotNull(paramBuffer.head);
              Intrinsics.checkNotNull(paramBuffer.head.prev);
              paramBuffer.head.prev.push(segment);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          k += i3;
          i2 = j;
          j = i2 + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      Buffer buffer = paramBuffer;
      buffer.setSize$okio(buffer.size() + paramInt2);
      return;
    } 
  }
  
  public int indexOf(@NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = b ^ 0x72EE59A0EAC1L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    return toByteString().indexOf(paramArrayOfbyte, paramInt);
  }
  
  @NotNull
  public byte[] toByteArray() {
    SegmentedByteString segmentedByteString1 = this;
    boolean bool1 = false;
    byte[] arrayOfByte = new byte[segmentedByteString1.size()];
    int i = 0;
    SegmentedByteString segmentedByteString2 = segmentedByteString1;
    boolean bool2 = false;
    int j = ((Object[])segmentedByteString2.getSegments$okio()).length;
    int k = 0;
    int m = 0;
    while (k < j) {
      int n = segmentedByteString2.getDirectory$okio()[j + k];
      int i1 = segmentedByteString2.getDirectory$okio()[k];
      int i2 = i1 - m;
      int i3 = n;
      byte[] arrayOfByte1 = segmentedByteString2.getSegments$okio()[k];
      boolean bool = false;
      ArraysKt.copyInto(arrayOfByte1, arrayOfByte, i, i3, i3 + i2);
      i += i2;
      m = i1;
      int i4 = k;
      k = i4 + 1;
    } 
    return arrayOfByte;
  }
  
  public void copyInto(int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = b ^ 0x1348B113525DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "target");
    SegmentedByteString segmentedByteString1 = this;
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(segmentedByteString1.size(), paramInt1, paramInt3);
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt2, paramInt3);
    int i = 0;
    i = paramInt2;
    SegmentedByteString segmentedByteString2 = segmentedByteString1;
    int j = paramInt1 + paramInt3;
    boolean bool2 = false;
    int k = _SegmentedByteStringKt.segment(segmentedByteString2, paramInt1);
    int m = paramInt1;
    while (true) {
      try {
        if (m < j) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          byte b = (k == 0) ? 0 : segmentedByteString2.getDirectory$okio()[k - 1];
          int n = segmentedByteString2.getDirectory$okio()[k] - b;
          int i1 = segmentedByteString2.getDirectory$okio()[((Object[])segmentedByteString2.getSegments$okio()).length + k];
          int i2 = b + n;
          int i3 = 0;
          int i4 = Math.min(j, i2) - m;
          i2 = i1 + m - b;
          int i5 = i4;
          int i6 = i2;
          byte[] arrayOfByte = segmentedByteString2.getSegments$okio()[k];
          boolean bool = false;
          ArraysKt.copyInto(arrayOfByte, paramArrayOfbyte, i, i6, i6 + i5);
          i += i5;
          m += i4;
          i3 = k;
          k = i3 + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      break;
    } 
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\SegmentedByteString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */