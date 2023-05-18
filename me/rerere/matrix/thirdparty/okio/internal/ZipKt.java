package me.rerere.matrix.thirdparty.okio.internal;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.kotlin.text.CharsKt;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.FileMetadata;
import me.rerere.matrix.thirdparty.okio.FileSystem;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.okio.ZipFileSystem;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ZipKt {
  private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
  
  private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
  
  public static final int COMPRESSION_METHOD_DEFLATED = 8;
  
  private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;
  
  private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
  
  public static final int COMPRESSION_METHOD_STORED = 0;
  
  private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
  
  private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
  
  private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
  
  private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
  
  private static final int BIT_FLAG_ENCRYPTED = 1;
  
  private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
  
  private static final long a = o3.a(-531167313534115524L, -2157895668048726675L, MethodHandles.lookup().lookupClass()).a(147867966773963L);
  
  @NotNull
  public static final ZipFileSystem openZip(@NotNull Path paramPath, @NotNull FileSystem paramFileSystem, @NotNull Function1 paramFunction1) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/ZipKt.a : J
    //   3: ldc2_w 58915417698038
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc 'zipPath'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'fileSystem'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'predicate'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: aload_1
    //   27: aload_0
    //   28: invokevirtual openReadOnly : (Lme/rerere/matrix/thirdparty/okio/Path;)Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   31: checkcast java/io/Closeable
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: iconst_0
    //   40: istore #7
    //   42: aconst_null
    //   43: checkcast java/lang/Throwable
    //   46: astore #7
    //   48: nop
    //   49: aload #5
    //   51: checkcast me/rerere/matrix/thirdparty/okio/FileHandle
    //   54: astore #8
    //   56: iconst_0
    //   57: istore #9
    //   59: aload #8
    //   61: lconst_0
    //   62: iconst_1
    //   63: aconst_null
    //   64: invokestatic source$default : (Lme/rerere/matrix/thirdparty/okio/FileHandle;JILjava/lang/Object;)Lme/rerere/matrix/thirdparty/okio/Source;
    //   67: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Source;)Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   70: checkcast java/io/Closeable
    //   73: astore #10
    //   75: iconst_0
    //   76: istore #11
    //   78: iconst_0
    //   79: istore #12
    //   81: aconst_null
    //   82: checkcast java/lang/Throwable
    //   85: astore #12
    //   87: nop
    //   88: aload #10
    //   90: checkcast me/rerere/matrix/thirdparty/okio/BufferedSource
    //   93: astore #13
    //   95: iconst_0
    //   96: istore #14
    //   98: aload #13
    //   100: invokeinterface readIntLe : ()I
    //   105: istore #15
    //   107: iload #15
    //   109: ldc 67324752
    //   111: if_icmpeq -> 186
    //   114: iload #15
    //   116: ldc 101010256
    //   118: if_icmpne -> 142
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   127: athrow
    //   128: new java/io/IOException
    //   131: dup
    //   132: ldc 'unsupported zip: empty'
    //   134: invokespecial <init> : (Ljava/lang/String;)V
    //   137: athrow
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: new java/io/IOException
    //   145: dup
    //   146: new java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial <init> : ()V
    //   153: ldc 'not a zip: expected '
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: ldc 67324752
    //   160: invokestatic getHex : (I)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc ' but was '
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: iload #15
    //   173: invokestatic getHex : (I)Ljava/lang/String;
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual toString : ()Ljava/lang/String;
    //   182: invokespecial <init> : (Ljava/lang/String;)V
    //   185: athrow
    //   186: nop
    //   187: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   190: astore #13
    //   192: aload #10
    //   194: aload #12
    //   196: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   199: goto -> 223
    //   202: astore #13
    //   204: aload #13
    //   206: astore #12
    //   208: aload #13
    //   210: athrow
    //   211: astore #13
    //   213: aload #10
    //   215: aload #12
    //   217: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   220: aload #13
    //   222: athrow
    //   223: aload #8
    //   225: invokevirtual size : ()J
    //   228: bipush #22
    //   230: i2l
    //   231: lsub
    //   232: lstore #16
    //   234: lload #16
    //   236: lconst_0
    //   237: lcmp
    //   238: ifge -> 266
    //   241: new java/io/IOException
    //   244: dup
    //   245: ldc 'not a zip: size='
    //   247: aload #8
    //   249: invokevirtual size : ()J
    //   252: invokestatic valueOf : (J)Ljava/lang/Long;
    //   255: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   258: invokespecial <init> : (Ljava/lang/String;)V
    //   261: athrow
    //   262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   265: athrow
    //   266: lload #16
    //   268: ldc2_w 65536
    //   271: lsub
    //   272: lstore #18
    //   274: lconst_0
    //   275: lstore #20
    //   277: iconst_0
    //   278: istore #22
    //   280: lload #18
    //   282: lload #20
    //   284: invokestatic max : (JJ)J
    //   287: lstore #23
    //   289: lconst_0
    //   290: lstore #18
    //   292: aconst_null
    //   293: astore #25
    //   295: aconst_null
    //   296: astore #26
    //   298: nop
    //   299: aload #8
    //   301: lload #16
    //   303: invokevirtual source : (J)Lme/rerere/matrix/thirdparty/okio/Source;
    //   306: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Source;)Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   309: astore #22
    //   311: nop
    //   312: aload #22
    //   314: invokeinterface readIntLe : ()I
    //   319: ldc 101010256
    //   321: if_icmpne -> 360
    //   324: lload #16
    //   326: lstore #18
    //   328: aload #22
    //   330: invokestatic readEocdRecord : (Lme/rerere/matrix/thirdparty/okio/BufferedSource;)Lme/rerere/matrix/thirdparty/okio/internal/EocdRecord;
    //   333: astore #25
    //   335: aload #22
    //   337: aload #25
    //   339: invokevirtual getCommentByteCount : ()I
    //   342: i2l
    //   343: invokeinterface readUtf8 : (J)Ljava/lang/String;
    //   348: astore #26
    //   350: aload #22
    //   352: invokeinterface close : ()V
    //   357: goto -> 415
    //   360: aload #22
    //   362: invokeinterface close : ()V
    //   367: goto -> 382
    //   370: astore #27
    //   372: aload #22
    //   374: invokeinterface close : ()V
    //   379: aload #27
    //   381: athrow
    //   382: lload #16
    //   384: lstore #28
    //   386: lload #28
    //   388: ldc2_w -1
    //   391: ladd
    //   392: lstore #16
    //   394: lload #28
    //   396: pop2
    //   397: lload #16
    //   399: lload #23
    //   401: lcmp
    //   402: ifge -> 298
    //   405: new java/io/IOException
    //   408: dup
    //   409: ldc 'not a zip: end of central directory signature not found'
    //   411: invokespecial <init> : (Ljava/lang/String;)V
    //   414: athrow
    //   415: lload #18
    //   417: bipush #20
    //   419: i2l
    //   420: lsub
    //   421: lstore #30
    //   423: lload #30
    //   425: lconst_0
    //   426: lcmp
    //   427: ifle -> 724
    //   430: aload #8
    //   432: lload #30
    //   434: invokevirtual source : (J)Lme/rerere/matrix/thirdparty/okio/Source;
    //   437: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Source;)Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   440: checkcast java/io/Closeable
    //   443: astore #32
    //   445: iconst_0
    //   446: istore #33
    //   448: iconst_0
    //   449: istore #34
    //   451: aconst_null
    //   452: checkcast java/lang/Throwable
    //   455: astore #34
    //   457: nop
    //   458: aload #32
    //   460: checkcast me/rerere/matrix/thirdparty/okio/BufferedSource
    //   463: astore #35
    //   465: iconst_0
    //   466: istore #36
    //   468: aload #35
    //   470: invokeinterface readIntLe : ()I
    //   475: ldc 117853008
    //   477: if_icmpne -> 687
    //   480: aload #35
    //   482: invokeinterface readIntLe : ()I
    //   487: istore #37
    //   489: aload #35
    //   491: invokeinterface readLongLe : ()J
    //   496: lstore #38
    //   498: aload #35
    //   500: invokeinterface readIntLe : ()I
    //   505: istore #40
    //   507: iload #40
    //   509: iconst_1
    //   510: if_icmpne -> 525
    //   513: iload #37
    //   515: ifeq -> 539
    //   518: goto -> 525
    //   521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   524: athrow
    //   525: new java/io/IOException
    //   528: dup
    //   529: ldc 'unsupported zip: spanned'
    //   531: invokespecial <init> : (Ljava/lang/String;)V
    //   534: athrow
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #8
    //   541: lload #38
    //   543: invokevirtual source : (J)Lme/rerere/matrix/thirdparty/okio/Source;
    //   546: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Source;)Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   549: checkcast java/io/Closeable
    //   552: astore #41
    //   554: iconst_0
    //   555: istore #42
    //   557: iconst_0
    //   558: istore #43
    //   560: aconst_null
    //   561: checkcast java/lang/Throwable
    //   564: astore #43
    //   566: nop
    //   567: aload #41
    //   569: checkcast me/rerere/matrix/thirdparty/okio/BufferedSource
    //   572: astore #44
    //   574: iconst_0
    //   575: istore #45
    //   577: aload #44
    //   579: invokeinterface readIntLe : ()I
    //   584: istore #46
    //   586: iload #46
    //   588: ldc 101075792
    //   590: if_icmpeq -> 641
    //   593: new java/io/IOException
    //   596: dup
    //   597: new java/lang/StringBuilder
    //   600: dup
    //   601: invokespecial <init> : ()V
    //   604: ldc 'bad zip: expected '
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: ldc 101075792
    //   611: invokestatic getHex : (I)Ljava/lang/String;
    //   614: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   617: ldc ' but was '
    //   619: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   622: iload #46
    //   624: invokestatic getHex : (I)Ljava/lang/String;
    //   627: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   630: invokevirtual toString : ()Ljava/lang/String;
    //   633: invokespecial <init> : (Ljava/lang/String;)V
    //   636: athrow
    //   637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   640: athrow
    //   641: aload #44
    //   643: aload #25
    //   645: invokestatic readZip64EocdRecord : (Lme/rerere/matrix/thirdparty/okio/BufferedSource;Lme/rerere/matrix/thirdparty/okio/internal/EocdRecord;)Lme/rerere/matrix/thirdparty/okio/internal/EocdRecord;
    //   648: astore #25
    //   650: nop
    //   651: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   654: astore #44
    //   656: aload #41
    //   658: aload #43
    //   660: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   663: goto -> 687
    //   666: astore #44
    //   668: aload #44
    //   670: astore #43
    //   672: aload #44
    //   674: athrow
    //   675: astore #44
    //   677: aload #41
    //   679: aload #43
    //   681: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   684: aload #44
    //   686: athrow
    //   687: nop
    //   688: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   691: astore #35
    //   693: aload #32
    //   695: aload #34
    //   697: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   700: goto -> 724
    //   703: astore #35
    //   705: aload #35
    //   707: astore #34
    //   709: aload #35
    //   711: athrow
    //   712: astore #35
    //   714: aload #32
    //   716: aload #34
    //   718: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   721: aload #35
    //   723: athrow
    //   724: iconst_0
    //   725: istore #33
    //   727: new java/util/ArrayList
    //   730: dup
    //   731: invokespecial <init> : ()V
    //   734: checkcast java/util/List
    //   737: astore #32
    //   739: aload #8
    //   741: aload #25
    //   743: invokevirtual getCentralDirectoryOffset : ()J
    //   746: invokevirtual source : (J)Lme/rerere/matrix/thirdparty/okio/Source;
    //   749: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Source;)Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   752: checkcast java/io/Closeable
    //   755: astore #33
    //   757: iconst_0
    //   758: istore #34
    //   760: iconst_0
    //   761: istore #35
    //   763: aconst_null
    //   764: checkcast java/lang/Throwable
    //   767: astore #35
    //   769: nop
    //   770: aload #33
    //   772: checkcast me/rerere/matrix/thirdparty/okio/BufferedSource
    //   775: astore #36
    //   777: iconst_0
    //   778: istore #37
    //   780: lconst_0
    //   781: lstore #38
    //   783: aload #25
    //   785: invokevirtual getEntryCount : ()J
    //   788: lstore #47
    //   790: lload #38
    //   792: lload #47
    //   794: lcmp
    //   795: ifge -> 884
    //   798: lload #38
    //   800: lstore #49
    //   802: lload #38
    //   804: lconst_1
    //   805: ladd
    //   806: lstore #38
    //   808: aload #36
    //   810: invokestatic readEntry : (Lme/rerere/matrix/thirdparty/okio/BufferedSource;)Lme/rerere/matrix/thirdparty/okio/internal/ZipEntry;
    //   813: astore #44
    //   815: aload #44
    //   817: invokevirtual getOffset : ()J
    //   820: aload #25
    //   822: invokevirtual getCentralDirectoryOffset : ()J
    //   825: lcmp
    //   826: iflt -> 839
    //   829: new java/io/IOException
    //   832: dup
    //   833: ldc 'bad zip: local file header offset >= central directory offset'
    //   835: invokespecial <init> : (Ljava/lang/String;)V
    //   838: athrow
    //   839: aload_2
    //   840: aload #44
    //   842: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   847: checkcast java/lang/Boolean
    //   850: invokevirtual booleanValue : ()Z
    //   853: ifeq -> 876
    //   856: aload #32
    //   858: checkcast java/util/Collection
    //   861: astore #45
    //   863: iconst_0
    //   864: istore #46
    //   866: aload #45
    //   868: aload #44
    //   870: invokeinterface add : (Ljava/lang/Object;)Z
    //   875: pop
    //   876: lload #38
    //   878: lload #47
    //   880: lcmp
    //   881: iflt -> 798
    //   884: nop
    //   885: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   888: astore #36
    //   890: aload #33
    //   892: aload #35
    //   894: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   897: goto -> 921
    //   900: astore #36
    //   902: aload #36
    //   904: astore #35
    //   906: aload #36
    //   908: athrow
    //   909: astore #36
    //   911: aload #33
    //   913: aload #35
    //   915: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   918: aload #36
    //   920: athrow
    //   921: aload #32
    //   923: invokestatic buildIndex : (Ljava/util/List;)Ljava/util/Map;
    //   926: astore #33
    //   928: new me/rerere/matrix/thirdparty/okio/ZipFileSystem
    //   931: dup
    //   932: aload_0
    //   933: aload_1
    //   934: aload #33
    //   936: aload #26
    //   938: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okio/Path;Lme/rerere/matrix/thirdparty/okio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V
    //   941: astore #51
    //   943: aload #5
    //   945: aload #7
    //   947: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   950: aload #51
    //   952: areturn
    //   953: astore #8
    //   955: aload #8
    //   957: astore #7
    //   959: aload #8
    //   961: athrow
    //   962: astore #8
    //   964: aload #5
    //   966: aload #7
    //   968: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   971: aload #8
    //   973: athrow
    // Exception table:
    //   from	to	target	type
    //   48	943	953	java/lang/Throwable
    //   48	943	962	finally
    //   87	192	202	java/lang/Throwable
    //   87	192	211	finally
    //   107	121	124	java/lang/Throwable
    //   114	138	138	java/lang/Throwable
    //   202	211	211	finally
    //   211	213	211	finally
    //   234	262	262	java/lang/Throwable
    //   311	350	370	finally
    //   370	372	370	finally
    //   457	693	703	java/lang/Throwable
    //   457	693	712	finally
    //   507	518	521	java/lang/Throwable
    //   513	535	535	java/lang/Throwable
    //   566	656	666	java/lang/Throwable
    //   566	656	675	finally
    //   586	637	637	java/lang/Throwable
    //   666	675	675	finally
    //   675	677	675	finally
    //   703	712	712	finally
    //   712	714	712	finally
    //   769	890	900	java/lang/Throwable
    //   769	890	909	finally
    //   900	909	909	finally
    //   909	911	909	finally
    //   953	962	962	finally
    //   962	964	962	finally
  }
  
  @NotNull
  public static final FileMetadata readLocalHeader(@NotNull BufferedSource paramBufferedSource, @NotNull FileMetadata paramFileMetadata) {
    long l = a ^ 0x46C3ABE8870DL;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<this>");
    Intrinsics.checkNotNullParameter(paramFileMetadata, "basicMetadata");
    Intrinsics.checkNotNull(readOrSkipLocalHeader(paramBufferedSource, paramFileMetadata));
    return readOrSkipLocalHeader(paramBufferedSource, paramFileMetadata);
  }
  
  public static final void skipLocalHeader(@NotNull BufferedSource paramBufferedSource) {
    long l = a ^ 0x5C29A3BF0028L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<this>");
    readOrSkipLocalHeader(paramBufferedSource, null);
  }
  
  @NotNull
  public static final ZipEntry readEntry(@NotNull BufferedSource paramBufferedSource) throws IOException {
    long l1 = a ^ 0x240A32303CB4L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<this>");
    int i = paramBufferedSource.readIntLe();
    try {
      if (i != 33639248)
        throw new IOException("bad zip: expected " + getHex(33639248) + " but was " + getHex(i)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramBufferedSource.skip(4L);
    int j = paramBufferedSource.readShortLe() & 0xFFFF;
    try {
      if ((j & 0x1) != 0)
        throw new IOException(Intrinsics.stringPlus("unsupported zip: general purpose bit flag=", getHex(j))); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int k = paramBufferedSource.readShortLe() & 0xFFFF;
    int m = paramBufferedSource.readShortLe() & 0xFFFF;
    int n = paramBufferedSource.readShortLe() & 0xFFFF;
    Long long_ = dosDateTimeToEpochMillis(n, m);
    long l2 = paramBufferedSource.readIntLe() & 0xFFFFFFFFL;
    Ref.LongRef longRef1 = new Ref.LongRef();
    longRef1.element = paramBufferedSource.readIntLe() & 0xFFFFFFFFL;
    Ref.LongRef longRef2 = new Ref.LongRef();
    longRef2.element = paramBufferedSource.readIntLe() & 0xFFFFFFFFL;
    int i1 = paramBufferedSource.readShortLe() & 0xFFFF;
    int i2 = paramBufferedSource.readShortLe() & 0xFFFF;
    int i3 = paramBufferedSource.readShortLe() & 0xFFFF;
    paramBufferedSource.skip(8L);
    Ref.LongRef longRef3 = new Ref.LongRef();
    longRef3.element = paramBufferedSource.readIntLe() & 0xFFFFFFFFL;
    String str1 = paramBufferedSource.readUtf8(i1);
    try {
      if (StringsKt.contains$default(str1, false, false, 2, null))
        throw new IOException("bad zip: filename contains 0x00"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    BufferedSource bufferedSource1 = paramBufferedSource;
    boolean bool1 = false;
    boolean bool2 = false;
    BufferedSource bufferedSource2 = bufferedSource1;
    boolean bool3 = false;
    long l4 = 0L;
    if (longRef2.element == 4294967295L)
      l4 += 8L; 
    if (longRef1.element == 4294967295L)
      l4 += 8L; 
    if (longRef3.element == 4294967295L)
      l4 += 8L; 
    long l3 = l4;
    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
    try {
      readExtra(paramBufferedSource, i2, new ZipKt$readEntry$1(booleanRef, l3, longRef2, paramBufferedSource, longRef1, longRef3));
      if (l3 > 0L)
        try {
          if (!booleanRef.element)
            throw new IOException("bad zip: zip64 extra required but absent"); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str2 = paramBufferedSource.readUtf8(i3);
    Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, null).resolve(str1);
    boolean bool = StringsKt.endsWith$default(str1, "/", false, 2, null);
    return new ZipEntry(path, bool, str2, l2, longRef1.element, longRef2.element, k, long_, longRef3.element);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ZipKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */