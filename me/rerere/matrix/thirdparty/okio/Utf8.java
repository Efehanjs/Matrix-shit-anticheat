package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Utf8 {
  public static final char REPLACEMENT_CHARACTER = '�';
  
  public static final int MASK_2BYTES = 3968;
  
  public static final byte REPLACEMENT_BYTE = 63;
  
  public static final int MASK_3BYTES = -123008;
  
  public static final int REPLACEMENT_CODE_POINT = 65533;
  
  public static final int LOG_SURROGATE_HEADER = 56320;
  
  public static final int MASK_4BYTES = 3678080;
  
  public static final int HIGH_SURROGATE_HEADER = 55232;
  
  private static final long a = o3.a(-779599723603267771L, 2240916339204831428L, MethodHandles.lookup().lookupClass()).a(239452958928985L);
  
  public static final void processUtf8Bytes(@NotNull String paramString, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x216509968A5CL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "yield");
    boolean bool = false;
    int i;
    label54: for (i = paramInt1; i < paramInt2; i = j + 1) {
      char c = paramString.charAt(i);
      if (Intrinsics.compare(c, 128) < 0) {
        int k = c;
        boolean bool1 = false;
        paramFunction1.invoke(Byte.valueOf((byte)k));
        k = i;
        i = k + 1;
        while (true) {
          try {
            if (i < paramInt2) {
              if (Intrinsics.compare(paramString.charAt(i), 128) < 0) {
                k = i;
                i = k + 1;
                k = paramString.charAt(k);
                bool1 = false;
                paramFunction1.invoke(Byte.valueOf((byte)k));
                continue;
              } 
              continue label54;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          continue label54;
        } 
      } 
      if (Intrinsics.compare(c, 2048) < 0) {
        int k = c;
        boolean bool1 = false;
        paramFunction1.invoke(Byte.valueOf((byte)(k >> 6 | 0xC0)));
        k = c;
        bool1 = false;
        paramFunction1.invoke(Byte.valueOf((byte)(k & 0x3F | 0x80)));
        k = i;
        i = k + 1;
        continue;
      } 
      try {
        if ('?' <= c) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
        
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (!false) {
        int k = c;
        boolean bool1 = false;
        paramFunction1.invoke(Byte.valueOf((byte)(k >> 12 | 0xE0)));
        k = c;
        bool1 = false;
        paramFunction1.invoke(Byte.valueOf((byte)(k >> 6 & 0x3F | 0x80)));
        k = c;
        bool1 = false;
        paramFunction1.invoke(Byte.valueOf((byte)(k & 0x3F | 0x80)));
        k = i;
        i = k + 1;
        continue;
      } 
      try {
        if (Intrinsics.compare(c, 56319) <= 0 && paramInt2 > i + 1) {
          char c1 = paramString.charAt(i + 1);
          try {
            if ('?' <= c1) {
              try {
              
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
            
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          if (false) {
            char c2 = c;
            boolean bool1 = false;
            c2 = paramString.charAt(i + 1);
            bool1 = false;
            int k = (c2 << 10) + c2 + -56613888;
            paramFunction1.invoke(Byte.valueOf((byte)(k >> 18 | 0xF0)));
            paramFunction1.invoke(Byte.valueOf((byte)(k >> 12 & 0x3F | 0x80)));
            paramFunction1.invoke(Byte.valueOf((byte)(k >> 6 & 0x3F | 0x80)));
            paramFunction1.invoke(Byte.valueOf((byte)(k & 0x3F | 0x80)));
            i += 2;
            continue;
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramFunction1.invoke(Byte.valueOf((byte)63));
      int j = i;
    } 
  }
  
  @JvmOverloads
  public static final long size(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l1 = a ^ 0x49DB66FCB93EL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool1 = (paramInt1 >= 0) ? true : false;
    boolean bool2 = false;
    int i = 0;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(paramInt1));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool1 = (paramInt2 >= paramInt1) ? true : false;
    bool2 = false;
    i = 0;
    if (!bool1) {
      boolean bool = false;
      String str = "endIndex < beginIndex: " + paramInt2 + " < " + paramInt1;
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool1 = (paramInt2 <= paramString.length()) ? true : false;
    bool2 = false;
    i = 0;
    if (!bool1) {
      boolean bool = false;
      String str = "endIndex > string.length: " + paramInt2 + " > " + paramString.length();
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    long l2 = 0L;
    for (i = paramInt1; i < paramInt2; i = j + 1) {
      char c = paramString.charAt(i);
      char c2 = Character.MIN_VALUE;
      char c1 = c;
      if (c1 < '') {
        long l3 = l2;
        l2 = l3 + 1L;
        int k = i;
        i = k + 1;
        continue;
      } 
      if (c1 < 'ࠀ') {
        l2 += 2L;
        int k = i;
        i = k + 1;
        continue;
      } 
      try {
        if (c1 < '?' || c1 > '?') {
          l2 += 3L;
          int k = i;
          i = k + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      c2 = paramString.charAt(i + 1);
      boolean bool = false;
      c = (i + 1 < paramInt2) ? c2 : Character.MIN_VALUE;
      try {
        if (c1 <= '?')
          try {
            if (c >= '?' && c <= '?') {
              l2 += 4L;
              i += 2;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      long l = l2;
      l2 = l + 1L;
      int j = i;
    } 
    return l2;
  }
  
  public static final int process4Utf8Bytes(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x3F6260DAE1A8L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "yield");
    boolean bool1 = false;
    try {
      if (paramInt2 <= paramInt1 + 3) {
        paramFunction1.invoke(Integer.valueOf(65533));
        if (paramInt2 > paramInt1 + 1) {
          byte b1 = paramArrayOfbyte[paramInt1 + 1];
          boolean bool3 = false;
          byte b2 = b1;
          char c1 = 'À';
          boolean bool4 = false;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          try {
            if (!(((b2 & c1) == 128) ? 1 : 0))
              return 1; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          return 1;
        } 
        if (paramInt2 > paramInt1 + 2) {
          byte b1 = paramArrayOfbyte[paramInt1 + 2];
          boolean bool3 = false;
          byte b2 = b1;
          char c1 = 'À';
          boolean bool4 = false;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          try {
            return (((b2 & c1) == 128)) ? 3 : 2;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        return 2;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = paramArrayOfbyte[paramInt1];
    int i = paramArrayOfbyte[paramInt1 + 1];
    short s = 0;
    int j = i;
    int k = 192;
    int m = 0;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(((j & k) == 128) ? 1 : 0)) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    s = paramArrayOfbyte[paramInt1 + 2];
    j = 0;
    k = s;
    m = 192;
    char c = Character.MIN_VALUE;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(((k & m) == 128) ? 1 : 0)) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 2;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    j = paramArrayOfbyte[paramInt1 + 3];
    k = 0;
    m = j;
    c = 'À';
    boolean bool2 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(((m & c) == 128) ? 1 : 0)) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 3;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    k = 0x381F80 ^ j ^ s << 6 ^ i << 12 ^ b << 18;
    try {
      if (k > 1114111) {
        paramFunction1.invoke(Integer.valueOf(65533));
      } else {
        try {
          if (55296 <= k) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (false) {
            paramFunction1.invoke(Integer.valueOf(65533));
          } else {
            try {
              if (k < 65536) {
                paramFunction1.invoke(Integer.valueOf(65533));
              } else {
                paramFunction1.invoke(Integer.valueOf(k));
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 4;
  }
  
  public static final void processUtf8CodePoints(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Utf8.a : J
    //   3: ldc2_w 64444945438774
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_3
    //   16: ldc 'yield'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iconst_0
    //   22: istore #6
    //   24: iload_1
    //   25: istore #7
    //   27: iload #7
    //   29: iload_2
    //   30: if_icmpge -> 1483
    //   33: aload_0
    //   34: iload #7
    //   36: baload
    //   37: istore #8
    //   39: nop
    //   40: iload #8
    //   42: iflt -> 114
    //   45: aload_3
    //   46: iload #8
    //   48: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   51: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: iload #7
    //   59: istore #9
    //   61: iload #9
    //   63: iconst_1
    //   64: iadd
    //   65: istore #7
    //   67: iload #7
    //   69: iload_2
    //   70: if_icmpge -> 27
    //   73: aload_0
    //   74: iload #7
    //   76: baload
    //   77: iflt -> 27
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   86: athrow
    //   87: aload_3
    //   88: aload_0
    //   89: iload #7
    //   91: istore #9
    //   93: iload #9
    //   95: iconst_1
    //   96: iadd
    //   97: istore #7
    //   99: iload #9
    //   101: baload
    //   102: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   105: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: goto -> 67
    //   114: iload #8
    //   116: istore #9
    //   118: iconst_5
    //   119: istore #10
    //   121: iconst_0
    //   122: istore #11
    //   124: iload #9
    //   126: iload #10
    //   128: ishr
    //   129: bipush #-2
    //   131: if_icmpne -> 357
    //   134: iload #7
    //   136: aload_0
    //   137: astore #9
    //   139: iconst_0
    //   140: istore #10
    //   142: iload_2
    //   143: iload #7
    //   145: iconst_1
    //   146: iadd
    //   147: if_icmpgt -> 182
    //   150: ldc 65533
    //   152: istore #11
    //   154: istore #21
    //   156: iconst_0
    //   157: istore #12
    //   159: aload_3
    //   160: iload #11
    //   162: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   165: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   170: pop
    //   171: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   174: astore #22
    //   176: iload #21
    //   178: iconst_1
    //   179: goto -> 351
    //   182: aload #9
    //   184: iload #7
    //   186: baload
    //   187: istore #13
    //   189: aload #9
    //   191: iload #7
    //   193: iconst_1
    //   194: iadd
    //   195: baload
    //   196: istore #14
    //   198: iconst_0
    //   199: istore #15
    //   201: iload #14
    //   203: istore #16
    //   205: sipush #192
    //   208: istore #17
    //   210: iconst_0
    //   211: istore #18
    //   213: iload #16
    //   215: iload #17
    //   217: iand
    //   218: sipush #128
    //   221: if_icmpne -> 232
    //   224: iconst_1
    //   225: goto -> 233
    //   228: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   231: athrow
    //   232: iconst_0
    //   233: ifne -> 268
    //   236: ldc 65533
    //   238: istore #11
    //   240: istore #21
    //   242: iconst_0
    //   243: istore #12
    //   245: aload_3
    //   246: iload #11
    //   248: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   251: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   256: pop
    //   257: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   260: astore #22
    //   262: iload #21
    //   264: iconst_1
    //   265: goto -> 351
    //   268: sipush #3968
    //   271: iload #14
    //   273: ixor
    //   274: iload #13
    //   276: bipush #6
    //   278: ishl
    //   279: ixor
    //   280: istore #15
    //   282: nop
    //   283: iload #15
    //   285: sipush #128
    //   288: if_icmpge -> 322
    //   291: ldc 65533
    //   293: istore #11
    //   295: istore #21
    //   297: iconst_0
    //   298: istore #12
    //   300: aload_3
    //   301: iload #11
    //   303: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   306: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   311: pop
    //   312: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   315: astore #22
    //   317: iload #21
    //   319: goto -> 350
    //   322: iload #15
    //   324: istore #11
    //   326: istore #21
    //   328: iconst_0
    //   329: istore #12
    //   331: aload_3
    //   332: iload #11
    //   334: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   337: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   342: pop
    //   343: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   346: astore #22
    //   348: iload #21
    //   350: iconst_2
    //   351: iadd
    //   352: istore #7
    //   354: goto -> 27
    //   357: iload #8
    //   359: istore #9
    //   361: iconst_4
    //   362: istore #10
    //   364: iconst_0
    //   365: istore #11
    //   367: iload #9
    //   369: iload #10
    //   371: ishr
    //   372: bipush #-2
    //   374: if_icmpne -> 815
    //   377: iload #7
    //   379: aload_0
    //   380: astore #9
    //   382: iconst_0
    //   383: istore #10
    //   385: iload_2
    //   386: iload #7
    //   388: iconst_2
    //   389: iadd
    //   390: if_icmpgt -> 488
    //   393: ldc 65533
    //   395: istore #11
    //   397: istore #21
    //   399: iconst_0
    //   400: istore #12
    //   402: aload_3
    //   403: iload #11
    //   405: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   408: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   413: pop
    //   414: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   417: astore #22
    //   419: iload #21
    //   421: iload_2
    //   422: iload #7
    //   424: iconst_1
    //   425: iadd
    //   426: if_icmple -> 476
    //   429: aload #9
    //   431: iload #7
    //   433: iconst_1
    //   434: iadd
    //   435: baload
    //   436: istore #13
    //   438: iconst_0
    //   439: istore #14
    //   441: iload #13
    //   443: istore #15
    //   445: sipush #192
    //   448: istore #16
    //   450: iconst_0
    //   451: istore #17
    //   453: iload #15
    //   455: iload #16
    //   457: iand
    //   458: sipush #128
    //   461: if_icmpne -> 472
    //   464: iconst_1
    //   465: goto -> 473
    //   468: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   471: athrow
    //   472: iconst_0
    //   473: ifne -> 484
    //   476: iconst_1
    //   477: goto -> 809
    //   480: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   483: athrow
    //   484: iconst_2
    //   485: goto -> 809
    //   488: aload #9
    //   490: iload #7
    //   492: baload
    //   493: istore #13
    //   495: aload #9
    //   497: iload #7
    //   499: iconst_1
    //   500: iadd
    //   501: baload
    //   502: istore #14
    //   504: iconst_0
    //   505: istore #15
    //   507: iload #14
    //   509: istore #16
    //   511: sipush #192
    //   514: istore #17
    //   516: iconst_0
    //   517: istore #18
    //   519: iload #16
    //   521: iload #17
    //   523: iand
    //   524: sipush #128
    //   527: if_icmpne -> 538
    //   530: iconst_1
    //   531: goto -> 539
    //   534: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   537: athrow
    //   538: iconst_0
    //   539: ifne -> 574
    //   542: ldc 65533
    //   544: istore #11
    //   546: istore #21
    //   548: iconst_0
    //   549: istore #12
    //   551: aload_3
    //   552: iload #11
    //   554: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   557: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   562: pop
    //   563: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   566: astore #22
    //   568: iload #21
    //   570: iconst_1
    //   571: goto -> 809
    //   574: aload #9
    //   576: iload #7
    //   578: iconst_2
    //   579: iadd
    //   580: baload
    //   581: istore #15
    //   583: iconst_0
    //   584: istore #16
    //   586: iload #15
    //   588: istore #17
    //   590: sipush #192
    //   593: istore #18
    //   595: iconst_0
    //   596: istore #19
    //   598: iload #17
    //   600: iload #18
    //   602: iand
    //   603: sipush #128
    //   606: if_icmpne -> 617
    //   609: iconst_1
    //   610: goto -> 618
    //   613: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   616: athrow
    //   617: iconst_0
    //   618: ifne -> 653
    //   621: ldc 65533
    //   623: istore #11
    //   625: istore #21
    //   627: iconst_0
    //   628: istore #12
    //   630: aload_3
    //   631: iload #11
    //   633: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   636: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   641: pop
    //   642: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   645: astore #22
    //   647: iload #21
    //   649: iconst_2
    //   650: goto -> 809
    //   653: ldc -123008
    //   655: iload #15
    //   657: ixor
    //   658: iload #14
    //   660: bipush #6
    //   662: ishl
    //   663: ixor
    //   664: iload #13
    //   666: bipush #12
    //   668: ishl
    //   669: ixor
    //   670: istore #16
    //   672: nop
    //   673: iload #16
    //   675: sipush #2048
    //   678: if_icmpge -> 712
    //   681: ldc 65533
    //   683: istore #11
    //   685: istore #21
    //   687: iconst_0
    //   688: istore #12
    //   690: aload_3
    //   691: iload #11
    //   693: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   696: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   701: pop
    //   702: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   705: astore #22
    //   707: iload #21
    //   709: goto -> 808
    //   712: ldc 55296
    //   714: iload #16
    //   716: if_icmpgt -> 745
    //   719: iload #16
    //   721: ldc 57343
    //   723: if_icmpgt -> 741
    //   726: goto -> 733
    //   729: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   732: athrow
    //   733: iconst_1
    //   734: goto -> 746
    //   737: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   740: athrow
    //   741: iconst_0
    //   742: goto -> 746
    //   745: iconst_0
    //   746: ifeq -> 780
    //   749: ldc 65533
    //   751: istore #11
    //   753: istore #21
    //   755: iconst_0
    //   756: istore #12
    //   758: aload_3
    //   759: iload #11
    //   761: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   764: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   769: pop
    //   770: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   773: astore #22
    //   775: iload #21
    //   777: goto -> 808
    //   780: iload #16
    //   782: istore #11
    //   784: istore #21
    //   786: iconst_0
    //   787: istore #12
    //   789: aload_3
    //   790: iload #11
    //   792: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   795: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   800: pop
    //   801: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   804: astore #22
    //   806: iload #21
    //   808: iconst_3
    //   809: iadd
    //   810: istore #7
    //   812: goto -> 27
    //   815: iload #8
    //   817: istore #9
    //   819: iconst_3
    //   820: istore #10
    //   822: iconst_0
    //   823: istore #11
    //   825: iload #9
    //   827: iload #10
    //   829: ishr
    //   830: bipush #-2
    //   832: if_icmpne -> 1458
    //   835: iload #7
    //   837: aload_0
    //   838: astore #9
    //   840: iconst_0
    //   841: istore #10
    //   843: iload_2
    //   844: iload #7
    //   846: iconst_3
    //   847: iadd
    //   848: if_icmpgt -> 1009
    //   851: ldc 65533
    //   853: istore #11
    //   855: istore #21
    //   857: iconst_0
    //   858: istore #12
    //   860: aload_3
    //   861: iload #11
    //   863: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   866: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   871: pop
    //   872: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   875: astore #22
    //   877: iload #21
    //   879: iload_2
    //   880: iload #7
    //   882: iconst_1
    //   883: iadd
    //   884: if_icmple -> 934
    //   887: aload #9
    //   889: iload #7
    //   891: iconst_1
    //   892: iadd
    //   893: baload
    //   894: istore #13
    //   896: iconst_0
    //   897: istore #14
    //   899: iload #13
    //   901: istore #15
    //   903: sipush #192
    //   906: istore #16
    //   908: iconst_0
    //   909: istore #17
    //   911: iload #15
    //   913: iload #16
    //   915: iand
    //   916: sipush #128
    //   919: if_icmpne -> 930
    //   922: iconst_1
    //   923: goto -> 931
    //   926: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   929: athrow
    //   930: iconst_0
    //   931: ifne -> 942
    //   934: iconst_1
    //   935: goto -> 1452
    //   938: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   941: athrow
    //   942: iload_2
    //   943: iload #7
    //   945: iconst_2
    //   946: iadd
    //   947: if_icmple -> 997
    //   950: aload #9
    //   952: iload #7
    //   954: iconst_2
    //   955: iadd
    //   956: baload
    //   957: istore #13
    //   959: iconst_0
    //   960: istore #14
    //   962: iload #13
    //   964: istore #15
    //   966: sipush #192
    //   969: istore #16
    //   971: iconst_0
    //   972: istore #17
    //   974: iload #15
    //   976: iload #16
    //   978: iand
    //   979: sipush #128
    //   982: if_icmpne -> 993
    //   985: iconst_1
    //   986: goto -> 994
    //   989: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   992: athrow
    //   993: iconst_0
    //   994: ifne -> 1005
    //   997: iconst_2
    //   998: goto -> 1452
    //   1001: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1004: athrow
    //   1005: iconst_3
    //   1006: goto -> 1452
    //   1009: aload #9
    //   1011: iload #7
    //   1013: baload
    //   1014: istore #13
    //   1016: aload #9
    //   1018: iload #7
    //   1020: iconst_1
    //   1021: iadd
    //   1022: baload
    //   1023: istore #14
    //   1025: iconst_0
    //   1026: istore #15
    //   1028: iload #14
    //   1030: istore #16
    //   1032: sipush #192
    //   1035: istore #17
    //   1037: iconst_0
    //   1038: istore #18
    //   1040: iload #16
    //   1042: iload #17
    //   1044: iand
    //   1045: sipush #128
    //   1048: if_icmpne -> 1059
    //   1051: iconst_1
    //   1052: goto -> 1060
    //   1055: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1058: athrow
    //   1059: iconst_0
    //   1060: ifne -> 1095
    //   1063: ldc 65533
    //   1065: istore #11
    //   1067: istore #21
    //   1069: iconst_0
    //   1070: istore #12
    //   1072: aload_3
    //   1073: iload #11
    //   1075: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1078: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1083: pop
    //   1084: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1087: astore #22
    //   1089: iload #21
    //   1091: iconst_1
    //   1092: goto -> 1452
    //   1095: aload #9
    //   1097: iload #7
    //   1099: iconst_2
    //   1100: iadd
    //   1101: baload
    //   1102: istore #15
    //   1104: iconst_0
    //   1105: istore #16
    //   1107: iload #15
    //   1109: istore #17
    //   1111: sipush #192
    //   1114: istore #18
    //   1116: iconst_0
    //   1117: istore #19
    //   1119: iload #17
    //   1121: iload #18
    //   1123: iand
    //   1124: sipush #128
    //   1127: if_icmpne -> 1138
    //   1130: iconst_1
    //   1131: goto -> 1139
    //   1134: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1137: athrow
    //   1138: iconst_0
    //   1139: ifne -> 1174
    //   1142: ldc 65533
    //   1144: istore #11
    //   1146: istore #21
    //   1148: iconst_0
    //   1149: istore #12
    //   1151: aload_3
    //   1152: iload #11
    //   1154: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1157: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1162: pop
    //   1163: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1166: astore #22
    //   1168: iload #21
    //   1170: iconst_2
    //   1171: goto -> 1452
    //   1174: aload #9
    //   1176: iload #7
    //   1178: iconst_3
    //   1179: iadd
    //   1180: baload
    //   1181: istore #16
    //   1183: iconst_0
    //   1184: istore #17
    //   1186: iload #16
    //   1188: istore #18
    //   1190: sipush #192
    //   1193: istore #19
    //   1195: iconst_0
    //   1196: istore #20
    //   1198: iload #18
    //   1200: iload #19
    //   1202: iand
    //   1203: sipush #128
    //   1206: if_icmpne -> 1217
    //   1209: iconst_1
    //   1210: goto -> 1218
    //   1213: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1216: athrow
    //   1217: iconst_0
    //   1218: ifne -> 1253
    //   1221: ldc 65533
    //   1223: istore #11
    //   1225: istore #21
    //   1227: iconst_0
    //   1228: istore #12
    //   1230: aload_3
    //   1231: iload #11
    //   1233: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1236: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1241: pop
    //   1242: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1245: astore #22
    //   1247: iload #21
    //   1249: iconst_3
    //   1250: goto -> 1452
    //   1253: ldc 3678080
    //   1255: iload #16
    //   1257: ixor
    //   1258: iload #15
    //   1260: bipush #6
    //   1262: ishl
    //   1263: ixor
    //   1264: iload #14
    //   1266: bipush #12
    //   1268: ishl
    //   1269: ixor
    //   1270: iload #13
    //   1272: bipush #18
    //   1274: ishl
    //   1275: ixor
    //   1276: istore #17
    //   1278: nop
    //   1279: iload #17
    //   1281: ldc 1114111
    //   1283: if_icmple -> 1317
    //   1286: ldc 65533
    //   1288: istore #11
    //   1290: istore #21
    //   1292: iconst_0
    //   1293: istore #12
    //   1295: aload_3
    //   1296: iload #11
    //   1298: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1301: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1306: pop
    //   1307: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1310: astore #22
    //   1312: iload #21
    //   1314: goto -> 1451
    //   1317: ldc 55296
    //   1319: iload #17
    //   1321: if_icmpgt -> 1350
    //   1324: iload #17
    //   1326: ldc 57343
    //   1328: if_icmpgt -> 1346
    //   1331: goto -> 1338
    //   1334: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1337: athrow
    //   1338: iconst_1
    //   1339: goto -> 1351
    //   1342: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1345: athrow
    //   1346: iconst_0
    //   1347: goto -> 1351
    //   1350: iconst_0
    //   1351: ifeq -> 1385
    //   1354: ldc 65533
    //   1356: istore #11
    //   1358: istore #21
    //   1360: iconst_0
    //   1361: istore #12
    //   1363: aload_3
    //   1364: iload #11
    //   1366: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1369: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1374: pop
    //   1375: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1378: astore #22
    //   1380: iload #21
    //   1382: goto -> 1451
    //   1385: iload #17
    //   1387: ldc 65536
    //   1389: if_icmpge -> 1423
    //   1392: ldc 65533
    //   1394: istore #11
    //   1396: istore #21
    //   1398: iconst_0
    //   1399: istore #12
    //   1401: aload_3
    //   1402: iload #11
    //   1404: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1407: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1412: pop
    //   1413: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1416: astore #22
    //   1418: iload #21
    //   1420: goto -> 1451
    //   1423: iload #17
    //   1425: istore #11
    //   1427: istore #21
    //   1429: iconst_0
    //   1430: istore #12
    //   1432: aload_3
    //   1433: iload #11
    //   1435: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1438: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1443: pop
    //   1444: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1447: astore #22
    //   1449: iload #21
    //   1451: iconst_4
    //   1452: iadd
    //   1453: istore #7
    //   1455: goto -> 27
    //   1458: aload_3
    //   1459: ldc 65533
    //   1461: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1464: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1469: pop
    //   1470: iload #7
    //   1472: istore #9
    //   1474: iload #9
    //   1476: iconst_1
    //   1477: iadd
    //   1478: istore #7
    //   1480: goto -> 27
    //   1483: return
    // Exception table:
    //   from	to	target	type
    //   67	80	83	java/lang/IllegalArgumentException
    //   213	228	228	java/lang/IllegalArgumentException
    //   453	468	468	java/lang/IllegalArgumentException
    //   473	480	480	java/lang/IllegalArgumentException
    //   519	534	534	java/lang/IllegalArgumentException
    //   598	613	613	java/lang/IllegalArgumentException
    //   712	726	729	java/lang/IllegalArgumentException
    //   719	737	737	java/lang/IllegalArgumentException
    //   911	926	926	java/lang/IllegalArgumentException
    //   931	938	938	java/lang/IllegalArgumentException
    //   974	989	989	java/lang/IllegalArgumentException
    //   994	1001	1001	java/lang/IllegalArgumentException
    //   1040	1055	1055	java/lang/IllegalArgumentException
    //   1119	1134	1134	java/lang/IllegalArgumentException
    //   1198	1213	1213	java/lang/IllegalArgumentException
    //   1317	1331	1334	java/lang/IllegalArgumentException
    //   1324	1342	1342	java/lang/IllegalArgumentException
  }
  
  @JvmOverloads
  public static final long size(@NotNull String paramString) {
    long l = a ^ 0x52C94B71DFCEL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return size$default(paramString, 0, 0, 3, null);
  }
  
  public static final int process3Utf8Bytes(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x3AE3B81CC24BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "yield");
    boolean bool1 = false;
    try {
      if (paramInt2 <= paramInt1 + 2) {
        paramFunction1.invoke(Integer.valueOf(65533));
        if (paramInt2 > paramInt1 + 1) {
          byte b = paramArrayOfbyte[paramInt1 + 1];
          boolean bool3 = false;
          byte b3 = b;
          char c1 = 'À';
          boolean bool4 = false;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          try {
            return (((b3 & c1) == 128)) ? 2 : 1;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        return 1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b1 = paramArrayOfbyte[paramInt1];
    byte b2 = paramArrayOfbyte[paramInt1 + 1];
    short s1 = 0;
    int i = b2;
    short s2 = 192;
    char c = Character.MIN_VALUE;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(((i & s2) == 128) ? 1 : 0)) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    s1 = paramArrayOfbyte[paramInt1 + 2];
    i = 0;
    s2 = s1;
    c = 'À';
    boolean bool2 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(((s2 & c) == 128) ? 1 : 0)) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 2;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    i = 0xFFFE1F80 ^ s1 ^ b2 << 6 ^ b1 << 12;
    try {
      if (i < 2048) {
        paramFunction1.invoke(Integer.valueOf(65533));
      } else {
        try {
          if (55296 <= i) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (false) {
            paramFunction1.invoke(Integer.valueOf(65533));
          } else {
            paramFunction1.invoke(Integer.valueOf(i));
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 3;
  }
  
  @JvmOverloads
  public static final long size(@NotNull String paramString, int paramInt) {
    long l = a ^ 0x593C1F8E2683L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return size$default(paramString, paramInt, 0, 2, null);
  }
  
  public static final void processUtf16Chars(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Utf8.a : J
    //   3: ldc2_w 100312550244075
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_3
    //   16: ldc 'yield'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iconst_0
    //   22: istore #6
    //   24: iload_1
    //   25: istore #7
    //   27: iload #7
    //   29: iload_2
    //   30: if_icmpge -> 1933
    //   33: aload_0
    //   34: iload #7
    //   36: baload
    //   37: istore #8
    //   39: nop
    //   40: iload #8
    //   42: iflt -> 119
    //   45: aload_3
    //   46: iload #8
    //   48: i2c
    //   49: invokestatic valueOf : (C)Ljava/lang/Character;
    //   52: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: pop
    //   58: iload #7
    //   60: istore #9
    //   62: iload #9
    //   64: iconst_1
    //   65: iadd
    //   66: istore #7
    //   68: iload #9
    //   70: pop
    //   71: iload #7
    //   73: iload_2
    //   74: if_icmpge -> 27
    //   77: aload_0
    //   78: iload #7
    //   80: baload
    //   81: iflt -> 27
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: aload_3
    //   92: aload_0
    //   93: iload #7
    //   95: istore #9
    //   97: iload #9
    //   99: iconst_1
    //   100: iadd
    //   101: istore #7
    //   103: iload #9
    //   105: baload
    //   106: i2c
    //   107: invokestatic valueOf : (C)Ljava/lang/Character;
    //   110: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   115: pop
    //   116: goto -> 71
    //   119: iload #8
    //   121: istore #9
    //   123: iconst_5
    //   124: istore #10
    //   126: iconst_0
    //   127: istore #11
    //   129: iload #9
    //   131: iload #10
    //   133: ishr
    //   134: bipush #-2
    //   136: if_icmpne -> 366
    //   139: iload #7
    //   141: aload_0
    //   142: astore #9
    //   144: iconst_0
    //   145: istore #10
    //   147: iload_2
    //   148: iload #7
    //   150: iconst_1
    //   151: iadd
    //   152: if_icmpgt -> 188
    //   155: ldc 65533
    //   157: istore #11
    //   159: istore #21
    //   161: iconst_0
    //   162: istore #12
    //   164: aload_3
    //   165: iload #11
    //   167: i2c
    //   168: invokestatic valueOf : (C)Ljava/lang/Character;
    //   171: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   176: pop
    //   177: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   180: astore #22
    //   182: iload #21
    //   184: iconst_1
    //   185: goto -> 360
    //   188: aload #9
    //   190: iload #7
    //   192: baload
    //   193: istore #13
    //   195: aload #9
    //   197: iload #7
    //   199: iconst_1
    //   200: iadd
    //   201: baload
    //   202: istore #14
    //   204: iconst_0
    //   205: istore #15
    //   207: iload #14
    //   209: istore #16
    //   211: sipush #192
    //   214: istore #17
    //   216: iconst_0
    //   217: istore #18
    //   219: iload #16
    //   221: iload #17
    //   223: iand
    //   224: sipush #128
    //   227: if_icmpne -> 238
    //   230: iconst_1
    //   231: goto -> 239
    //   234: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   237: athrow
    //   238: iconst_0
    //   239: ifne -> 275
    //   242: ldc 65533
    //   244: istore #11
    //   246: istore #21
    //   248: iconst_0
    //   249: istore #12
    //   251: aload_3
    //   252: iload #11
    //   254: i2c
    //   255: invokestatic valueOf : (C)Ljava/lang/Character;
    //   258: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   263: pop
    //   264: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   267: astore #22
    //   269: iload #21
    //   271: iconst_1
    //   272: goto -> 360
    //   275: sipush #3968
    //   278: iload #14
    //   280: ixor
    //   281: iload #13
    //   283: bipush #6
    //   285: ishl
    //   286: ixor
    //   287: istore #15
    //   289: nop
    //   290: iload #15
    //   292: sipush #128
    //   295: if_icmpge -> 330
    //   298: ldc 65533
    //   300: istore #11
    //   302: istore #21
    //   304: iconst_0
    //   305: istore #12
    //   307: aload_3
    //   308: iload #11
    //   310: i2c
    //   311: invokestatic valueOf : (C)Ljava/lang/Character;
    //   314: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   319: pop
    //   320: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   323: astore #22
    //   325: iload #21
    //   327: goto -> 359
    //   330: iload #15
    //   332: istore #11
    //   334: istore #21
    //   336: iconst_0
    //   337: istore #12
    //   339: aload_3
    //   340: iload #11
    //   342: i2c
    //   343: invokestatic valueOf : (C)Ljava/lang/Character;
    //   346: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   351: pop
    //   352: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   355: astore #22
    //   357: iload #21
    //   359: iconst_2
    //   360: iadd
    //   361: istore #7
    //   363: goto -> 27
    //   366: iload #8
    //   368: istore #9
    //   370: iconst_4
    //   371: istore #10
    //   373: iconst_0
    //   374: istore #11
    //   376: iload #9
    //   378: iload #10
    //   380: ishr
    //   381: bipush #-2
    //   383: if_icmpne -> 830
    //   386: iload #7
    //   388: aload_0
    //   389: astore #9
    //   391: iconst_0
    //   392: istore #10
    //   394: iload_2
    //   395: iload #7
    //   397: iconst_2
    //   398: iadd
    //   399: if_icmpgt -> 498
    //   402: ldc 65533
    //   404: istore #11
    //   406: istore #21
    //   408: iconst_0
    //   409: istore #12
    //   411: aload_3
    //   412: iload #11
    //   414: i2c
    //   415: invokestatic valueOf : (C)Ljava/lang/Character;
    //   418: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   423: pop
    //   424: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   427: astore #22
    //   429: iload #21
    //   431: iload_2
    //   432: iload #7
    //   434: iconst_1
    //   435: iadd
    //   436: if_icmple -> 486
    //   439: aload #9
    //   441: iload #7
    //   443: iconst_1
    //   444: iadd
    //   445: baload
    //   446: istore #13
    //   448: iconst_0
    //   449: istore #14
    //   451: iload #13
    //   453: istore #15
    //   455: sipush #192
    //   458: istore #16
    //   460: iconst_0
    //   461: istore #17
    //   463: iload #15
    //   465: iload #16
    //   467: iand
    //   468: sipush #128
    //   471: if_icmpne -> 482
    //   474: iconst_1
    //   475: goto -> 483
    //   478: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   481: athrow
    //   482: iconst_0
    //   483: ifne -> 494
    //   486: iconst_1
    //   487: goto -> 824
    //   490: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   493: athrow
    //   494: iconst_2
    //   495: goto -> 824
    //   498: aload #9
    //   500: iload #7
    //   502: baload
    //   503: istore #13
    //   505: aload #9
    //   507: iload #7
    //   509: iconst_1
    //   510: iadd
    //   511: baload
    //   512: istore #14
    //   514: iconst_0
    //   515: istore #15
    //   517: iload #14
    //   519: istore #16
    //   521: sipush #192
    //   524: istore #17
    //   526: iconst_0
    //   527: istore #18
    //   529: iload #16
    //   531: iload #17
    //   533: iand
    //   534: sipush #128
    //   537: if_icmpne -> 548
    //   540: iconst_1
    //   541: goto -> 549
    //   544: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   547: athrow
    //   548: iconst_0
    //   549: ifne -> 585
    //   552: ldc 65533
    //   554: istore #11
    //   556: istore #21
    //   558: iconst_0
    //   559: istore #12
    //   561: aload_3
    //   562: iload #11
    //   564: i2c
    //   565: invokestatic valueOf : (C)Ljava/lang/Character;
    //   568: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   573: pop
    //   574: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   577: astore #22
    //   579: iload #21
    //   581: iconst_1
    //   582: goto -> 824
    //   585: aload #9
    //   587: iload #7
    //   589: iconst_2
    //   590: iadd
    //   591: baload
    //   592: istore #15
    //   594: iconst_0
    //   595: istore #16
    //   597: iload #15
    //   599: istore #17
    //   601: sipush #192
    //   604: istore #18
    //   606: iconst_0
    //   607: istore #19
    //   609: iload #17
    //   611: iload #18
    //   613: iand
    //   614: sipush #128
    //   617: if_icmpne -> 628
    //   620: iconst_1
    //   621: goto -> 629
    //   624: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   627: athrow
    //   628: iconst_0
    //   629: ifne -> 665
    //   632: ldc 65533
    //   634: istore #11
    //   636: istore #21
    //   638: iconst_0
    //   639: istore #12
    //   641: aload_3
    //   642: iload #11
    //   644: i2c
    //   645: invokestatic valueOf : (C)Ljava/lang/Character;
    //   648: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   653: pop
    //   654: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   657: astore #22
    //   659: iload #21
    //   661: iconst_2
    //   662: goto -> 824
    //   665: ldc -123008
    //   667: iload #15
    //   669: ixor
    //   670: iload #14
    //   672: bipush #6
    //   674: ishl
    //   675: ixor
    //   676: iload #13
    //   678: bipush #12
    //   680: ishl
    //   681: ixor
    //   682: istore #16
    //   684: nop
    //   685: iload #16
    //   687: sipush #2048
    //   690: if_icmpge -> 725
    //   693: ldc 65533
    //   695: istore #11
    //   697: istore #21
    //   699: iconst_0
    //   700: istore #12
    //   702: aload_3
    //   703: iload #11
    //   705: i2c
    //   706: invokestatic valueOf : (C)Ljava/lang/Character;
    //   709: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   714: pop
    //   715: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   718: astore #22
    //   720: iload #21
    //   722: goto -> 823
    //   725: ldc 55296
    //   727: iload #16
    //   729: if_icmpgt -> 758
    //   732: iload #16
    //   734: ldc 57343
    //   736: if_icmpgt -> 754
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   745: athrow
    //   746: iconst_1
    //   747: goto -> 759
    //   750: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   753: athrow
    //   754: iconst_0
    //   755: goto -> 759
    //   758: iconst_0
    //   759: ifeq -> 794
    //   762: ldc 65533
    //   764: istore #11
    //   766: istore #21
    //   768: iconst_0
    //   769: istore #12
    //   771: aload_3
    //   772: iload #11
    //   774: i2c
    //   775: invokestatic valueOf : (C)Ljava/lang/Character;
    //   778: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   783: pop
    //   784: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   787: astore #22
    //   789: iload #21
    //   791: goto -> 823
    //   794: iload #16
    //   796: istore #11
    //   798: istore #21
    //   800: iconst_0
    //   801: istore #12
    //   803: aload_3
    //   804: iload #11
    //   806: i2c
    //   807: invokestatic valueOf : (C)Ljava/lang/Character;
    //   810: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   815: pop
    //   816: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   819: astore #22
    //   821: iload #21
    //   823: iconst_3
    //   824: iadd
    //   825: istore #7
    //   827: goto -> 27
    //   830: iload #8
    //   832: istore #9
    //   834: iconst_3
    //   835: istore #10
    //   837: iconst_0
    //   838: istore #11
    //   840: iload #9
    //   842: iload #10
    //   844: ishr
    //   845: bipush #-2
    //   847: if_icmpne -> 1905
    //   850: iload #7
    //   852: aload_0
    //   853: astore #9
    //   855: iconst_0
    //   856: istore #10
    //   858: iload_2
    //   859: iload #7
    //   861: iconst_3
    //   862: iadd
    //   863: if_icmpgt -> 1078
    //   866: ldc 65533
    //   868: istore #11
    //   870: istore #21
    //   872: iconst_0
    //   873: istore #12
    //   875: iload #11
    //   877: ldc 65533
    //   879: if_icmpeq -> 928
    //   882: aload_3
    //   883: iload #11
    //   885: bipush #10
    //   887: iushr
    //   888: ldc 55232
    //   890: iadd
    //   891: i2c
    //   892: invokestatic valueOf : (C)Ljava/lang/Character;
    //   895: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   900: pop
    //   901: aload_3
    //   902: iload #11
    //   904: sipush #1023
    //   907: iand
    //   908: ldc 56320
    //   910: iadd
    //   911: i2c
    //   912: invokestatic valueOf : (C)Ljava/lang/Character;
    //   915: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   920: pop
    //   921: goto -> 940
    //   924: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   927: athrow
    //   928: aload_3
    //   929: ldc 65533
    //   931: invokestatic valueOf : (C)Ljava/lang/Character;
    //   934: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   939: pop
    //   940: nop
    //   941: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   944: astore #22
    //   946: iload #21
    //   948: iload_2
    //   949: iload #7
    //   951: iconst_1
    //   952: iadd
    //   953: if_icmple -> 1003
    //   956: aload #9
    //   958: iload #7
    //   960: iconst_1
    //   961: iadd
    //   962: baload
    //   963: istore #13
    //   965: iconst_0
    //   966: istore #14
    //   968: iload #13
    //   970: istore #15
    //   972: sipush #192
    //   975: istore #16
    //   977: iconst_0
    //   978: istore #17
    //   980: iload #15
    //   982: iload #16
    //   984: iand
    //   985: sipush #128
    //   988: if_icmpne -> 999
    //   991: iconst_1
    //   992: goto -> 1000
    //   995: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   998: athrow
    //   999: iconst_0
    //   1000: ifne -> 1011
    //   1003: iconst_1
    //   1004: goto -> 1899
    //   1007: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1010: athrow
    //   1011: iload_2
    //   1012: iload #7
    //   1014: iconst_2
    //   1015: iadd
    //   1016: if_icmple -> 1066
    //   1019: aload #9
    //   1021: iload #7
    //   1023: iconst_2
    //   1024: iadd
    //   1025: baload
    //   1026: istore #13
    //   1028: iconst_0
    //   1029: istore #14
    //   1031: iload #13
    //   1033: istore #15
    //   1035: sipush #192
    //   1038: istore #16
    //   1040: iconst_0
    //   1041: istore #17
    //   1043: iload #15
    //   1045: iload #16
    //   1047: iand
    //   1048: sipush #128
    //   1051: if_icmpne -> 1062
    //   1054: iconst_1
    //   1055: goto -> 1063
    //   1058: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1061: athrow
    //   1062: iconst_0
    //   1063: ifne -> 1074
    //   1066: iconst_2
    //   1067: goto -> 1899
    //   1070: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1073: athrow
    //   1074: iconst_3
    //   1075: goto -> 1899
    //   1078: aload #9
    //   1080: iload #7
    //   1082: baload
    //   1083: istore #13
    //   1085: aload #9
    //   1087: iload #7
    //   1089: iconst_1
    //   1090: iadd
    //   1091: baload
    //   1092: istore #14
    //   1094: iconst_0
    //   1095: istore #15
    //   1097: iload #14
    //   1099: istore #16
    //   1101: sipush #192
    //   1104: istore #17
    //   1106: iconst_0
    //   1107: istore #18
    //   1109: iload #16
    //   1111: iload #17
    //   1113: iand
    //   1114: sipush #128
    //   1117: if_icmpne -> 1128
    //   1120: iconst_1
    //   1121: goto -> 1129
    //   1124: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1127: athrow
    //   1128: iconst_0
    //   1129: ifne -> 1218
    //   1132: ldc 65533
    //   1134: istore #11
    //   1136: istore #21
    //   1138: iconst_0
    //   1139: istore #12
    //   1141: iload #11
    //   1143: ldc 65533
    //   1145: if_icmpeq -> 1194
    //   1148: aload_3
    //   1149: iload #11
    //   1151: bipush #10
    //   1153: iushr
    //   1154: ldc 55232
    //   1156: iadd
    //   1157: i2c
    //   1158: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1161: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1166: pop
    //   1167: aload_3
    //   1168: iload #11
    //   1170: sipush #1023
    //   1173: iand
    //   1174: ldc 56320
    //   1176: iadd
    //   1177: i2c
    //   1178: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1181: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1186: pop
    //   1187: goto -> 1206
    //   1190: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1193: athrow
    //   1194: aload_3
    //   1195: ldc 65533
    //   1197: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1200: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1205: pop
    //   1206: nop
    //   1207: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1210: astore #22
    //   1212: iload #21
    //   1214: iconst_1
    //   1215: goto -> 1899
    //   1218: aload #9
    //   1220: iload #7
    //   1222: iconst_2
    //   1223: iadd
    //   1224: baload
    //   1225: istore #15
    //   1227: iconst_0
    //   1228: istore #16
    //   1230: iload #15
    //   1232: istore #17
    //   1234: sipush #192
    //   1237: istore #18
    //   1239: iconst_0
    //   1240: istore #19
    //   1242: iload #17
    //   1244: iload #18
    //   1246: iand
    //   1247: sipush #128
    //   1250: if_icmpne -> 1261
    //   1253: iconst_1
    //   1254: goto -> 1262
    //   1257: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1260: athrow
    //   1261: iconst_0
    //   1262: ifne -> 1351
    //   1265: ldc 65533
    //   1267: istore #11
    //   1269: istore #21
    //   1271: iconst_0
    //   1272: istore #12
    //   1274: iload #11
    //   1276: ldc 65533
    //   1278: if_icmpeq -> 1327
    //   1281: aload_3
    //   1282: iload #11
    //   1284: bipush #10
    //   1286: iushr
    //   1287: ldc 55232
    //   1289: iadd
    //   1290: i2c
    //   1291: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1294: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1299: pop
    //   1300: aload_3
    //   1301: iload #11
    //   1303: sipush #1023
    //   1306: iand
    //   1307: ldc 56320
    //   1309: iadd
    //   1310: i2c
    //   1311: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1314: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1319: pop
    //   1320: goto -> 1339
    //   1323: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1326: athrow
    //   1327: aload_3
    //   1328: ldc 65533
    //   1330: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1333: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1338: pop
    //   1339: nop
    //   1340: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1343: astore #22
    //   1345: iload #21
    //   1347: iconst_2
    //   1348: goto -> 1899
    //   1351: aload #9
    //   1353: iload #7
    //   1355: iconst_3
    //   1356: iadd
    //   1357: baload
    //   1358: istore #16
    //   1360: iconst_0
    //   1361: istore #17
    //   1363: iload #16
    //   1365: istore #18
    //   1367: sipush #192
    //   1370: istore #19
    //   1372: iconst_0
    //   1373: istore #20
    //   1375: iload #18
    //   1377: iload #19
    //   1379: iand
    //   1380: sipush #128
    //   1383: if_icmpne -> 1394
    //   1386: iconst_1
    //   1387: goto -> 1395
    //   1390: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1393: athrow
    //   1394: iconst_0
    //   1395: ifne -> 1484
    //   1398: ldc 65533
    //   1400: istore #11
    //   1402: istore #21
    //   1404: iconst_0
    //   1405: istore #12
    //   1407: iload #11
    //   1409: ldc 65533
    //   1411: if_icmpeq -> 1460
    //   1414: aload_3
    //   1415: iload #11
    //   1417: bipush #10
    //   1419: iushr
    //   1420: ldc 55232
    //   1422: iadd
    //   1423: i2c
    //   1424: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1427: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1432: pop
    //   1433: aload_3
    //   1434: iload #11
    //   1436: sipush #1023
    //   1439: iand
    //   1440: ldc 56320
    //   1442: iadd
    //   1443: i2c
    //   1444: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1447: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1452: pop
    //   1453: goto -> 1472
    //   1456: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1459: athrow
    //   1460: aload_3
    //   1461: ldc 65533
    //   1463: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1466: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1471: pop
    //   1472: nop
    //   1473: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1476: astore #22
    //   1478: iload #21
    //   1480: iconst_3
    //   1481: goto -> 1899
    //   1484: ldc 3678080
    //   1486: iload #16
    //   1488: ixor
    //   1489: iload #15
    //   1491: bipush #6
    //   1493: ishl
    //   1494: ixor
    //   1495: iload #14
    //   1497: bipush #12
    //   1499: ishl
    //   1500: ixor
    //   1501: iload #13
    //   1503: bipush #18
    //   1505: ishl
    //   1506: ixor
    //   1507: istore #17
    //   1509: nop
    //   1510: iload #17
    //   1512: ldc 1114111
    //   1514: if_icmple -> 1602
    //   1517: ldc 65533
    //   1519: istore #11
    //   1521: istore #21
    //   1523: iconst_0
    //   1524: istore #12
    //   1526: iload #11
    //   1528: ldc 65533
    //   1530: if_icmpeq -> 1579
    //   1533: aload_3
    //   1534: iload #11
    //   1536: bipush #10
    //   1538: iushr
    //   1539: ldc 55232
    //   1541: iadd
    //   1542: i2c
    //   1543: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1546: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1551: pop
    //   1552: aload_3
    //   1553: iload #11
    //   1555: sipush #1023
    //   1558: iand
    //   1559: ldc 56320
    //   1561: iadd
    //   1562: i2c
    //   1563: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1566: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1571: pop
    //   1572: goto -> 1591
    //   1575: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1578: athrow
    //   1579: aload_3
    //   1580: ldc 65533
    //   1582: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1585: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1590: pop
    //   1591: nop
    //   1592: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1595: astore #22
    //   1597: iload #21
    //   1599: goto -> 1898
    //   1602: ldc 55296
    //   1604: iload #17
    //   1606: if_icmpgt -> 1635
    //   1609: iload #17
    //   1611: ldc 57343
    //   1613: if_icmpgt -> 1631
    //   1616: goto -> 1623
    //   1619: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1622: athrow
    //   1623: iconst_1
    //   1624: goto -> 1636
    //   1627: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1630: athrow
    //   1631: iconst_0
    //   1632: goto -> 1636
    //   1635: iconst_0
    //   1636: ifeq -> 1724
    //   1639: ldc 65533
    //   1641: istore #11
    //   1643: istore #21
    //   1645: iconst_0
    //   1646: istore #12
    //   1648: iload #11
    //   1650: ldc 65533
    //   1652: if_icmpeq -> 1701
    //   1655: aload_3
    //   1656: iload #11
    //   1658: bipush #10
    //   1660: iushr
    //   1661: ldc 55232
    //   1663: iadd
    //   1664: i2c
    //   1665: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1668: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1673: pop
    //   1674: aload_3
    //   1675: iload #11
    //   1677: sipush #1023
    //   1680: iand
    //   1681: ldc 56320
    //   1683: iadd
    //   1684: i2c
    //   1685: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1688: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1693: pop
    //   1694: goto -> 1713
    //   1697: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1700: athrow
    //   1701: aload_3
    //   1702: ldc 65533
    //   1704: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1707: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1712: pop
    //   1713: nop
    //   1714: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1717: astore #22
    //   1719: iload #21
    //   1721: goto -> 1898
    //   1724: iload #17
    //   1726: ldc 65536
    //   1728: if_icmpge -> 1816
    //   1731: ldc 65533
    //   1733: istore #11
    //   1735: istore #21
    //   1737: iconst_0
    //   1738: istore #12
    //   1740: iload #11
    //   1742: ldc 65533
    //   1744: if_icmpeq -> 1793
    //   1747: aload_3
    //   1748: iload #11
    //   1750: bipush #10
    //   1752: iushr
    //   1753: ldc 55232
    //   1755: iadd
    //   1756: i2c
    //   1757: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1760: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1765: pop
    //   1766: aload_3
    //   1767: iload #11
    //   1769: sipush #1023
    //   1772: iand
    //   1773: ldc 56320
    //   1775: iadd
    //   1776: i2c
    //   1777: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1780: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1785: pop
    //   1786: goto -> 1805
    //   1789: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1792: athrow
    //   1793: aload_3
    //   1794: ldc 65533
    //   1796: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1799: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1804: pop
    //   1805: nop
    //   1806: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1809: astore #22
    //   1811: iload #21
    //   1813: goto -> 1898
    //   1816: iload #17
    //   1818: istore #11
    //   1820: istore #21
    //   1822: iconst_0
    //   1823: istore #12
    //   1825: iload #11
    //   1827: ldc 65533
    //   1829: if_icmpeq -> 1878
    //   1832: aload_3
    //   1833: iload #11
    //   1835: bipush #10
    //   1837: iushr
    //   1838: ldc 55232
    //   1840: iadd
    //   1841: i2c
    //   1842: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1845: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1850: pop
    //   1851: aload_3
    //   1852: iload #11
    //   1854: sipush #1023
    //   1857: iand
    //   1858: ldc 56320
    //   1860: iadd
    //   1861: i2c
    //   1862: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1865: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1870: pop
    //   1871: goto -> 1890
    //   1874: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1877: athrow
    //   1878: aload_3
    //   1879: ldc 65533
    //   1881: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1884: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1889: pop
    //   1890: nop
    //   1891: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1894: astore #22
    //   1896: iload #21
    //   1898: iconst_4
    //   1899: iadd
    //   1900: istore #7
    //   1902: goto -> 27
    //   1905: aload_3
    //   1906: ldc 65533
    //   1908: invokestatic valueOf : (C)Ljava/lang/Character;
    //   1911: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1916: pop
    //   1917: iload #7
    //   1919: istore #9
    //   1921: iload #9
    //   1923: iconst_1
    //   1924: iadd
    //   1925: istore #7
    //   1927: iload #9
    //   1929: pop
    //   1930: goto -> 27
    //   1933: return
    // Exception table:
    //   from	to	target	type
    //   71	84	87	java/lang/IllegalArgumentException
    //   219	234	234	java/lang/IllegalArgumentException
    //   463	478	478	java/lang/IllegalArgumentException
    //   483	490	490	java/lang/IllegalArgumentException
    //   529	544	544	java/lang/IllegalArgumentException
    //   609	624	624	java/lang/IllegalArgumentException
    //   725	739	742	java/lang/IllegalArgumentException
    //   732	750	750	java/lang/IllegalArgumentException
    //   875	924	924	java/lang/IllegalArgumentException
    //   980	995	995	java/lang/IllegalArgumentException
    //   1000	1007	1007	java/lang/IllegalArgumentException
    //   1043	1058	1058	java/lang/IllegalArgumentException
    //   1063	1070	1070	java/lang/IllegalArgumentException
    //   1109	1124	1124	java/lang/IllegalArgumentException
    //   1141	1190	1190	java/lang/IllegalArgumentException
    //   1242	1257	1257	java/lang/IllegalArgumentException
    //   1274	1323	1323	java/lang/IllegalArgumentException
    //   1375	1390	1390	java/lang/IllegalArgumentException
    //   1407	1456	1456	java/lang/IllegalArgumentException
    //   1526	1575	1575	java/lang/IllegalArgumentException
    //   1602	1616	1619	java/lang/IllegalArgumentException
    //   1609	1627	1627	java/lang/IllegalArgumentException
    //   1648	1697	1697	java/lang/IllegalArgumentException
    //   1740	1789	1789	java/lang/IllegalArgumentException
    //   1825	1874	1874	java/lang/IllegalArgumentException
  }
  
  public static final boolean isUtf8Continuation(byte paramByte) {
    boolean bool1 = false;
    byte b = paramByte;
    char c = 'À';
    boolean bool2 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ((b & c) == 128);
  }
  
  public static final boolean isIsoControl(int paramInt) {
    boolean bool = false;
    try {
      if (0 <= paramInt) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!false) {
        try {
          if (127 <= paramInt) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (false);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static final int process2Utf8Bytes(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x4E350DFB4B5L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "yield");
    boolean bool1 = false;
    try {
      if (paramInt2 <= paramInt1 + 1) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b1 = paramArrayOfbyte[paramInt1];
    byte b2 = paramArrayOfbyte[paramInt1 + 1];
    int i = 0;
    byte b = b2;
    char c = 'À';
    boolean bool2 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(((b & c) == 128) ? 1 : 0)) {
        paramFunction1.invoke(Integer.valueOf(65533));
        return 1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    i = 0xF80 ^ b2 ^ b1 << 6;
    try {
      if (i < 128) {
        paramFunction1.invoke(Integer.valueOf(65533));
      } else {
        paramFunction1.invoke(Integer.valueOf(i));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 2;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Utf8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */