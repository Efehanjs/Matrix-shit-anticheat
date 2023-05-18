package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.Segment;
import me.rerere.matrix.thirdparty.okio.SegmentedByteString;
import me.rerere.matrix.thirdparty.okio._UtilKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _SegmentedByteStringKt {
  private static final long a = o3.a(6091580891061285436L, -3664441313673743433L, MethodHandles.lookup().lookupClass()).a(125097162355554L);
  
  public static final int segment(@NotNull SegmentedByteString paramSegmentedByteString, int paramInt) {
    long l = a ^ 0x6509EF4013F6L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    int i = binarySearch(paramSegmentedByteString.getDirectory$okio(), paramInt + 1, 0, ((Object[])paramSegmentedByteString.getSegments$okio()).length);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i >= 0) ? i : (i ^ 0xFFFFFFFF);
  }
  
  public static final int binarySearch(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    long l = a ^ 0x596BCCD8713AL;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "<this>");
    int i = paramInt2;
    int j = paramInt3 - 1;
    while (i <= j) {
      int k = i + j >>> 1;
      int m = paramArrayOfint[k];
      if (m < paramInt1) {
        i = k + 1;
        continue;
      } 
      if (m > paramInt1) {
        j = k - 1;
        continue;
      } 
      return k;
    } 
    return -i - 1;
  }
  
  @NotNull
  public static final byte[] commonToByteArray(@NotNull SegmentedByteString paramSegmentedByteString) {
    long l = a ^ 0x6EF25E865978L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    boolean bool1 = false;
    byte[] arrayOfByte = new byte[paramSegmentedByteString.size()];
    int i = 0;
    SegmentedByteString segmentedByteString = paramSegmentedByteString;
    boolean bool2 = false;
    int j = ((Object[])segmentedByteString.getSegments$okio()).length;
    int k = 0;
    int m = 0;
    while (k < j) {
      int n = segmentedByteString.getDirectory$okio()[j + k];
      int i1 = segmentedByteString.getDirectory$okio()[k];
      int i2 = i1 - m;
      int i3 = n;
      byte[] arrayOfByte1 = segmentedByteString.getSegments$okio()[k];
      boolean bool = false;
      ArraysKt.copyInto(arrayOfByte1, arrayOfByte, i, i3, i3 + i2);
      i += i2;
      m = i1;
      int i4 = k;
      k = i4 + 1;
    } 
    return arrayOfByte;
  }
  
  public static final void commonWrite(@NotNull SegmentedByteString paramSegmentedByteString, @NotNull Buffer paramBuffer, int paramInt1, int paramInt2) {
    long l = a ^ 0x79057E5D71CAL;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer, "buffer");
    boolean bool1 = false;
    SegmentedByteString segmentedByteString = paramSegmentedByteString;
    int i = paramInt1 + paramInt2;
    boolean bool2 = false;
    int j = segment(segmentedByteString, paramInt1);
    int k = paramInt1;
    while (true) {
      try {
        if (k < i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          byte b = (j == 0) ? 0 : segmentedByteString.getDirectory$okio()[j - 1];
          int m = segmentedByteString.getDirectory$okio()[j] - b;
          int n = segmentedByteString.getDirectory$okio()[((Object[])segmentedByteString.getSegments$okio()).length + j];
          int i1 = b + m;
          int i2 = 0;
          int i3 = Math.min(i, i1) - k;
          i1 = n + k - b;
          int i4 = i3;
          int i5 = i1;
          byte[] arrayOfByte = segmentedByteString.getSegments$okio()[j];
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
            throw a(null);
          } 
          k += i3;
          i2 = j;
          j = i2 + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Buffer buffer = paramBuffer;
      buffer.setSize$okio(buffer.size() + paramInt2);
      return;
    } 
  }
  
  public static final int commonHashCode(@NotNull SegmentedByteString paramSegmentedByteString) {
    long l = a ^ 0x4839217B9E20L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    boolean bool1 = false;
    int i = 0;
    i = paramSegmentedByteString.getHashCode$okio();
    try {
      if (i != 0)
        return i; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    i = 1;
    SegmentedByteString segmentedByteString = paramSegmentedByteString;
    boolean bool2 = false;
    int j = ((Object[])segmentedByteString.getSegments$okio()).length;
    int k = 0;
    int m = 0;
    while (k < j) {
      int n = segmentedByteString.getDirectory$okio()[j + k];
      int i1 = segmentedByteString.getDirectory$okio()[k];
      int i2 = i1 - m;
      int i3 = n;
      byte[] arrayOfByte = segmentedByteString.getSegments$okio()[k];
      boolean bool = false;
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
    paramSegmentedByteString.setHashCode$okio(i);
    return i;
  }
  
  @NotNull
  public static final ByteString commonSubstring(@NotNull SegmentedByteString paramSegmentedByteString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_SegmentedByteStringKt.a : J
    //   3: ldc2_w 120191273849947
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #5
    //   17: aload_0
    //   18: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   21: iload_2
    //   22: invokestatic resolveDefaultParameter : (Lme/rerere/matrix/thirdparty/okio/ByteString;I)I
    //   25: istore #6
    //   27: iload_1
    //   28: iflt -> 39
    //   31: iconst_1
    //   32: goto -> 40
    //   35: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   38: athrow
    //   39: iconst_0
    //   40: istore #7
    //   42: iconst_0
    //   43: istore #8
    //   45: iconst_0
    //   46: istore #9
    //   48: iload #7
    //   50: ifne -> 98
    //   53: iconst_0
    //   54: istore #10
    //   56: new java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: ldc 'beginIndex='
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: iload_1
    //   69: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   72: ldc ' < 0'
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual toString : ()Ljava/lang/String;
    //   80: astore #9
    //   82: new java/lang/IllegalArgumentException
    //   85: dup
    //   86: aload #9
    //   88: invokevirtual toString : ()Ljava/lang/String;
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: checkcast java/lang/Throwable
    //   97: athrow
    //   98: iload #6
    //   100: aload_0
    //   101: invokevirtual size : ()I
    //   104: if_icmpgt -> 115
    //   107: iconst_1
    //   108: goto -> 116
    //   111: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   114: athrow
    //   115: iconst_0
    //   116: istore #7
    //   118: iconst_0
    //   119: istore #8
    //   121: iconst_0
    //   122: istore #9
    //   124: iload #7
    //   126: ifne -> 187
    //   129: iconst_0
    //   130: istore #10
    //   132: new java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial <init> : ()V
    //   139: ldc 'endIndex='
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: iload #6
    //   146: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   149: ldc ' > length('
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload_0
    //   155: invokevirtual size : ()I
    //   158: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   161: bipush #41
    //   163: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   166: invokevirtual toString : ()Ljava/lang/String;
    //   169: astore #9
    //   171: new java/lang/IllegalArgumentException
    //   174: dup
    //   175: aload #9
    //   177: invokevirtual toString : ()Ljava/lang/String;
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: checkcast java/lang/Throwable
    //   186: athrow
    //   187: iload #6
    //   189: iload_1
    //   190: isub
    //   191: istore #7
    //   193: iload #7
    //   195: iflt -> 206
    //   198: iconst_1
    //   199: goto -> 207
    //   202: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   205: athrow
    //   206: iconst_0
    //   207: istore #8
    //   209: iconst_0
    //   210: istore #9
    //   212: iconst_0
    //   213: istore #10
    //   215: iload #8
    //   217: ifne -> 270
    //   220: iconst_0
    //   221: istore #11
    //   223: new java/lang/StringBuilder
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: ldc 'endIndex='
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: iload #6
    //   237: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   240: ldc ' < beginIndex='
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: iload_1
    //   246: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   249: invokevirtual toString : ()Ljava/lang/String;
    //   252: astore #10
    //   254: new java/lang/IllegalArgumentException
    //   257: dup
    //   258: aload #10
    //   260: invokevirtual toString : ()Ljava/lang/String;
    //   263: invokespecial <init> : (Ljava/lang/String;)V
    //   266: checkcast java/lang/Throwable
    //   269: athrow
    //   270: nop
    //   271: iload_1
    //   272: ifne -> 300
    //   275: iload #6
    //   277: aload_0
    //   278: invokevirtual size : ()I
    //   281: if_icmpne -> 300
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   290: athrow
    //   291: aload_0
    //   292: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   295: areturn
    //   296: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   299: athrow
    //   300: iload_1
    //   301: iload #6
    //   303: if_icmpne -> 314
    //   306: getstatic me/rerere/matrix/thirdparty/okio/ByteString.EMPTY : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   309: areturn
    //   310: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   313: athrow
    //   314: aload_0
    //   315: iload_1
    //   316: invokestatic segment : (Lme/rerere/matrix/thirdparty/okio/SegmentedByteString;I)I
    //   319: istore #8
    //   321: aload_0
    //   322: iload #6
    //   324: iconst_1
    //   325: isub
    //   326: invokestatic segment : (Lme/rerere/matrix/thirdparty/okio/SegmentedByteString;I)I
    //   329: istore #9
    //   331: aload_0
    //   332: invokevirtual getSegments$okio : ()[[B
    //   335: checkcast [Ljava/lang/Object;
    //   338: astore #11
    //   340: iload #9
    //   342: iconst_1
    //   343: iadd
    //   344: istore #12
    //   346: iconst_0
    //   347: istore #13
    //   349: aload #11
    //   351: iload #8
    //   353: iload #12
    //   355: invokestatic copyOfRange : ([Ljava/lang/Object;II)[Ljava/lang/Object;
    //   358: checkcast [[B
    //   361: astore #10
    //   363: aload #10
    //   365: checkcast [Ljava/lang/Object;
    //   368: arraylength
    //   369: iconst_2
    //   370: imul
    //   371: newarray int
    //   373: astore #11
    //   375: iconst_0
    //   376: istore #12
    //   378: iload #8
    //   380: istore #13
    //   382: iload #13
    //   384: iload #9
    //   386: if_icmpgt -> 467
    //   389: iload #13
    //   391: istore #14
    //   393: iinc #13, 1
    //   396: aload #11
    //   398: iload #12
    //   400: aload_0
    //   401: invokevirtual getDirectory$okio : ()[I
    //   404: iload #14
    //   406: iaload
    //   407: iload_1
    //   408: isub
    //   409: istore #15
    //   411: iconst_0
    //   412: istore #16
    //   414: iload #15
    //   416: iload #7
    //   418: invokestatic min : (II)I
    //   421: iastore
    //   422: aload #11
    //   424: iload #12
    //   426: istore #15
    //   428: iload #15
    //   430: iconst_1
    //   431: iadd
    //   432: istore #12
    //   434: iload #15
    //   436: aload #10
    //   438: checkcast [Ljava/lang/Object;
    //   441: arraylength
    //   442: iadd
    //   443: aload_0
    //   444: invokevirtual getDirectory$okio : ()[I
    //   447: iload #14
    //   449: aload_0
    //   450: invokevirtual getSegments$okio : ()[[B
    //   453: checkcast [Ljava/lang/Object;
    //   456: arraylength
    //   457: iadd
    //   458: iaload
    //   459: iastore
    //   460: iload #14
    //   462: iload #9
    //   464: if_icmpne -> 389
    //   467: iload #8
    //   469: ifne -> 487
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   478: athrow
    //   479: iconst_0
    //   480: goto -> 496
    //   483: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   486: athrow
    //   487: aload_0
    //   488: invokevirtual getDirectory$okio : ()[I
    //   491: iload #8
    //   493: iconst_1
    //   494: isub
    //   495: iaload
    //   496: istore #13
    //   498: aload #11
    //   500: astore #14
    //   502: aload #10
    //   504: checkcast [Ljava/lang/Object;
    //   507: arraylength
    //   508: istore #15
    //   510: aload #14
    //   512: iload #15
    //   514: aload #14
    //   516: iload #15
    //   518: iaload
    //   519: iload_1
    //   520: iload #13
    //   522: isub
    //   523: iadd
    //   524: iastore
    //   525: new me/rerere/matrix/thirdparty/okio/SegmentedByteString
    //   528: dup
    //   529: aload #10
    //   531: aload #11
    //   533: invokespecial <init> : ([[B[I)V
    //   536: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   539: areturn
    // Exception table:
    //   from	to	target	type
    //   27	35	35	java/lang/IllegalArgumentException
    //   98	111	111	java/lang/IllegalArgumentException
    //   193	202	202	java/lang/IllegalArgumentException
    //   270	284	287	java/lang/IllegalArgumentException
    //   275	296	296	java/lang/IllegalArgumentException
    //   300	310	310	java/lang/IllegalArgumentException
    //   434	472	475	java/lang/IllegalArgumentException
    //   467	483	483	java/lang/IllegalArgumentException
  }
  
  public static final void forEachSegment(@NotNull SegmentedByteString paramSegmentedByteString, @NotNull Function3 paramFunction3) {
    long l = a ^ 0x263E55244946L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "action");
    boolean bool = false;
    int i = ((Object[])paramSegmentedByteString.getSegments$okio()).length;
    int j = 0;
    int k = 0;
    while (j < i) {
      int m = paramSegmentedByteString.getDirectory$okio()[i + j];
      int n = paramSegmentedByteString.getDirectory$okio()[j];
      paramFunction3.invoke(paramSegmentedByteString.getSegments$okio()[j], Integer.valueOf(m), Integer.valueOf(n - k));
      k = n;
      int i1 = j;
      j = i1 + 1;
    } 
  }
  
  public static final void commonCopyInto(@NotNull SegmentedByteString paramSegmentedByteString, int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x3EB437D1FCB1L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "target");
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(paramSegmentedByteString.size(), paramInt1, paramInt3);
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt2, paramInt3);
    int i = 0;
    i = paramInt2;
    SegmentedByteString segmentedByteString = paramSegmentedByteString;
    int j = paramInt1 + paramInt3;
    boolean bool2 = false;
    int k = segment(segmentedByteString, paramInt1);
    int m = paramInt1;
    while (true) {
      try {
        if (m < j) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          byte b = (k == 0) ? 0 : segmentedByteString.getDirectory$okio()[k - 1];
          int n = segmentedByteString.getDirectory$okio()[k] - b;
          int i1 = segmentedByteString.getDirectory$okio()[((Object[])segmentedByteString.getSegments$okio()).length + k];
          int i2 = b + n;
          int i3 = 0;
          int i4 = Math.min(j, i2) - m;
          i2 = i1 + m - b;
          int i5 = i4;
          int i6 = i2;
          byte[] arrayOfByte = segmentedByteString.getSegments$okio()[k];
          boolean bool = false;
          ArraysKt.copyInto(arrayOfByte, paramArrayOfbyte, i, i6, i6 + i5);
          i += i5;
          m += i4;
          i3 = k;
          k = i3 + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  public static final byte commonInternalGet(@NotNull SegmentedByteString paramSegmentedByteString, int paramInt) {
    long l = a ^ 0x11804F69BB74L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    boolean bool = false;
    _UtilKt.checkOffsetAndCount(paramSegmentedByteString.getDirectory$okio()[((Object[])paramSegmentedByteString.getSegments$okio()).length - 1], paramInt, 1L);
    int i = segment(paramSegmentedByteString, paramInt);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = (i == 0) ? 0 : paramSegmentedByteString.getDirectory$okio()[i - 1];
    int j = paramSegmentedByteString.getDirectory$okio()[i + ((Object[])paramSegmentedByteString.getSegments$okio()).length];
    return paramSegmentedByteString.getSegments$okio()[i][paramInt - b + j];
  }
  
  public static final boolean commonRangeEquals(@NotNull SegmentedByteString paramSegmentedByteString, int paramInt1, @NotNull ByteString paramByteString, int paramInt2, int paramInt3) {
    long l = a ^ 0x6663262E2C3FL;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString, "other");
    boolean bool = false;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= paramSegmentedByteString.size() - paramInt3) {
            int i = 0;
            i = paramInt2;
            SegmentedByteString segmentedByteString = paramSegmentedByteString;
            int j = paramInt1 + paramInt3;
            boolean bool1 = false;
            int k = segment(segmentedByteString, paramInt1);
            int m = paramInt1;
            while (true) {
              try {
                if (m < j) {
                  try {
                  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                  byte b = (k == 0) ? 0 : segmentedByteString.getDirectory$okio()[k - 1];
                  int n = segmentedByteString.getDirectory$okio()[k] - b;
                  int i1 = segmentedByteString.getDirectory$okio()[((Object[])segmentedByteString.getSegments$okio()).length + k];
                  int i2 = b + n;
                  int i3 = 0;
                  int i4 = Math.min(j, i2) - m;
                  i2 = i1 + m - b;
                  int i5 = i4;
                  int i6 = i2;
                  byte[] arrayOfByte = segmentedByteString.getSegments$okio()[k];
                  boolean bool2 = false;
                  try {
                    if (!paramByteString.rangeEquals(i, arrayOfByte, i6, i5))
                      return false; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                  i += i5;
                  m += i4;
                  i3 = k;
                  k = i3 + 1;
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              return true;
            } 
          } 
          return false;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public static final int commonGetSize(@NotNull SegmentedByteString paramSegmentedByteString) {
    long l = a ^ 0x502BB411AB52L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    boolean bool = false;
    return paramSegmentedByteString.getDirectory$okio()[((Object[])paramSegmentedByteString.getSegments$okio()).length - 1];
  }
  
  public static final boolean commonRangeEquals(@NotNull SegmentedByteString paramSegmentedByteString, int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x6B285778F738L;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "other");
    boolean bool = false;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= paramSegmentedByteString.size() - paramInt3)
            try {
              if (paramInt2 >= 0)
                try {
                  if (paramInt2 <= paramArrayOfbyte.length - paramInt3) {
                    int i = 0;
                    i = paramInt2;
                    SegmentedByteString segmentedByteString = paramSegmentedByteString;
                    int j = paramInt1 + paramInt3;
                    boolean bool1 = false;
                    int k = segment(segmentedByteString, paramInt1);
                    int m = paramInt1;
                    while (true) {
                      try {
                        if (m < j) {
                          try {
                          
                          } catch (IllegalArgumentException illegalArgumentException) {
                            throw a(null);
                          } 
                          byte b = (k == 0) ? 0 : segmentedByteString.getDirectory$okio()[k - 1];
                          int n = segmentedByteString.getDirectory$okio()[k] - b;
                          int i1 = segmentedByteString.getDirectory$okio()[((Object[])segmentedByteString.getSegments$okio()).length + k];
                          int i2 = b + n;
                          int i3 = 0;
                          int i4 = Math.min(j, i2) - m;
                          i2 = i1 + m - b;
                          int i5 = i4;
                          int i6 = i2;
                          byte[] arrayOfByte = segmentedByteString.getSegments$okio()[k];
                          boolean bool2 = false;
                          try {
                            if (!_UtilKt.arrayRangeEquals(arrayOfByte, i6, paramArrayOfbyte, i, i5))
                              return false; 
                          } catch (IllegalArgumentException illegalArgumentException) {
                            throw a(null);
                          } 
                          i += i5;
                          m += i4;
                          i3 = k;
                          k = i3 + 1;
                          continue;
                        } 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      } 
                      return true;
                    } 
                  } 
                  return false;
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
  
  public static final boolean commonEquals(@NotNull SegmentedByteString paramSegmentedByteString, @Nullable Object paramObject) {
    long l = a ^ 0x6695CCEA455AL;
    Intrinsics.checkNotNullParameter(paramSegmentedByteString, "<this>");
    boolean bool = false;
    try {
      try {
        try {
          if (((ByteString)paramObject).size() == paramSegmentedByteString.size())
            try {
              if (paramSegmentedByteString.rangeEquals(0, (ByteString)paramObject, 0, paramSegmentedByteString.size()));
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
    return (paramObject == paramSegmentedByteString) ? true : ((paramObject instanceof ByteString) ? false : false);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_SegmentedByteStringKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */