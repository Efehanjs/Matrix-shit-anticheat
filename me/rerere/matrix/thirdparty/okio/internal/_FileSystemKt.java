package me.rerere.matrix.thirdparty.okio.internal;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.ArrayDeque;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequenceScope;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.FileMetadata;
import me.rerere.matrix.thirdparty.okio.FileSystem;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _FileSystemKt {
  private static final long a = o3.a(9203544195840719333L, 3905434822217031962L, MethodHandles.lookup().lookupClass()).a(219647002739051L);
  
  @Nullable
  public static final Object collectRecursively(@NotNull SequenceScope paramSequenceScope, @NotNull FileSystem paramFileSystem, @NotNull ArrayDeque paramArrayDeque, @NotNull Path paramPath, boolean paramBoolean1, boolean paramBoolean2, @NotNull Continuation paramContinuation) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt.a : J
    //   3: ldc2_w 18871366934572
    //   6: lxor
    //   7: lstore #7
    //   9: aload #6
    //   11: instanceof me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt$collectRecursively$1
    //   14: ifeq -> 54
    //   17: aload #6
    //   19: checkcast me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt$collectRecursively$1
    //   22: astore #15
    //   24: aload #15
    //   26: getfield label : I
    //   29: ldc -2147483648
    //   31: iand
    //   32: ifeq -> 54
    //   35: aload #15
    //   37: dup
    //   38: getfield label : I
    //   41: ldc -2147483648
    //   43: isub
    //   44: putfield label : I
    //   47: goto -> 65
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: new me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt$collectRecursively$1
    //   57: dup
    //   58: aload #6
    //   60: invokespecial <init> : (Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)V
    //   63: astore #15
    //   65: aload #15
    //   67: getfield result : Ljava/lang/Object;
    //   70: astore #14
    //   72: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   75: astore #16
    //   77: aload #15
    //   79: getfield label : I
    //   82: tableswitch default -> 725, 0 -> 112, 1 -> 200, 2 -> 551, 3 -> 709
    //   112: aload #14
    //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   117: iload #5
    //   119: ifne -> 258
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   128: athrow
    //   129: aload_0
    //   130: aload_3
    //   131: aload #15
    //   133: aload #15
    //   135: aload_0
    //   136: putfield L$0 : Ljava/lang/Object;
    //   139: aload #15
    //   141: aload_1
    //   142: putfield L$1 : Ljava/lang/Object;
    //   145: aload #15
    //   147: aload_2
    //   148: putfield L$2 : Ljava/lang/Object;
    //   151: aload #15
    //   153: aload_3
    //   154: putfield L$3 : Ljava/lang/Object;
    //   157: aload #15
    //   159: iload #4
    //   161: putfield Z$0 : Z
    //   164: aload #15
    //   166: iload #5
    //   168: putfield Z$1 : Z
    //   171: aload #15
    //   173: iconst_1
    //   174: putfield label : I
    //   177: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   180: dup
    //   181: aload #16
    //   183: if_acmpne -> 257
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   192: athrow
    //   193: aload #16
    //   195: areturn
    //   196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   199: athrow
    //   200: aload #15
    //   202: getfield Z$1 : Z
    //   205: istore #5
    //   207: aload #15
    //   209: getfield Z$0 : Z
    //   212: istore #4
    //   214: aload #15
    //   216: getfield L$3 : Ljava/lang/Object;
    //   219: checkcast me/rerere/matrix/thirdparty/okio/Path
    //   222: astore_3
    //   223: aload #15
    //   225: getfield L$2 : Ljava/lang/Object;
    //   228: checkcast me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque
    //   231: astore_2
    //   232: aload #15
    //   234: getfield L$1 : Ljava/lang/Object;
    //   237: checkcast me/rerere/matrix/thirdparty/okio/FileSystem
    //   240: astore_1
    //   241: aload #15
    //   243: getfield L$0 : Ljava/lang/Object;
    //   246: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   249: astore_0
    //   250: aload #14
    //   252: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   255: aload #14
    //   257: pop
    //   258: aload_1
    //   259: aload_3
    //   260: invokevirtual listOrNull : (Lme/rerere/matrix/thirdparty/okio/Path;)Ljava/util/List;
    //   263: astore #10
    //   265: aload #10
    //   267: ifnonnull -> 279
    //   270: iconst_0
    //   271: istore #11
    //   273: invokestatic emptyList : ()Ljava/util/List;
    //   276: goto -> 281
    //   279: aload #10
    //   281: astore #9
    //   283: aload #9
    //   285: checkcast java/util/Collection
    //   288: astore #10
    //   290: iconst_0
    //   291: istore #11
    //   293: aload #10
    //   295: invokeinterface isEmpty : ()Z
    //   300: ifne -> 311
    //   303: iconst_1
    //   304: goto -> 312
    //   307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   310: athrow
    //   311: iconst_0
    //   312: ifeq -> 641
    //   315: aload_3
    //   316: astore #10
    //   318: iconst_0
    //   319: istore #11
    //   321: nop
    //   322: iload #4
    //   324: ifeq -> 361
    //   327: aload_2
    //   328: aload #10
    //   330: invokevirtual contains : (Ljava/lang/Object;)Z
    //   333: ifeq -> 361
    //   336: goto -> 343
    //   339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   342: athrow
    //   343: new java/io/IOException
    //   346: dup
    //   347: ldc 'symlink cycle at '
    //   349: aload_3
    //   350: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   353: invokespecial <init> : (Ljava/lang/String;)V
    //   356: athrow
    //   357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   360: athrow
    //   361: aload_1
    //   362: aload #10
    //   364: invokestatic symlinkTarget : (Lme/rerere/matrix/thirdparty/okio/FileSystem;Lme/rerere/matrix/thirdparty/okio/Path;)Lme/rerere/matrix/thirdparty/okio/Path;
    //   367: astore #12
    //   369: aload #12
    //   371: ifnonnull -> 381
    //   374: goto -> 398
    //   377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   380: athrow
    //   381: aload #12
    //   383: astore #10
    //   385: iload #11
    //   387: istore #12
    //   389: iload #12
    //   391: iconst_1
    //   392: iadd
    //   393: istore #11
    //   395: goto -> 321
    //   398: iload #4
    //   400: ifne -> 415
    //   403: iload #11
    //   405: ifne -> 641
    //   408: goto -> 415
    //   411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   414: athrow
    //   415: aload_2
    //   416: aload #10
    //   418: invokevirtual addLast : (Ljava/lang/Object;)V
    //   421: nop
    //   422: aload #9
    //   424: invokeinterface iterator : ()Ljava/util/Iterator;
    //   429: astore #12
    //   431: aload #12
    //   433: invokeinterface hasNext : ()Z
    //   438: ifeq -> 623
    //   441: aload #12
    //   443: invokeinterface next : ()Ljava/lang/Object;
    //   448: checkcast me/rerere/matrix/thirdparty/okio/Path
    //   451: astore #13
    //   453: aload_0
    //   454: aload_1
    //   455: aload_2
    //   456: aload #13
    //   458: iload #4
    //   460: ifeq -> 471
    //   463: iconst_1
    //   464: goto -> 472
    //   467: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   470: athrow
    //   471: iconst_0
    //   472: iload #5
    //   474: ifeq -> 485
    //   477: iconst_1
    //   478: goto -> 486
    //   481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   484: athrow
    //   485: iconst_0
    //   486: aload #15
    //   488: aload #15
    //   490: aload_0
    //   491: putfield L$0 : Ljava/lang/Object;
    //   494: aload #15
    //   496: aload_1
    //   497: putfield L$1 : Ljava/lang/Object;
    //   500: aload #15
    //   502: aload_2
    //   503: putfield L$2 : Ljava/lang/Object;
    //   506: aload #15
    //   508: aload_3
    //   509: putfield L$3 : Ljava/lang/Object;
    //   512: aload #15
    //   514: aload #12
    //   516: putfield L$4 : Ljava/lang/Object;
    //   519: aload #15
    //   521: iload #4
    //   523: putfield Z$0 : Z
    //   526: aload #15
    //   528: iload #5
    //   530: putfield Z$1 : Z
    //   533: aload #15
    //   535: iconst_2
    //   536: putfield label : I
    //   539: invokestatic collectRecursively : (Lme/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope;Lme/rerere/matrix/thirdparty/okio/FileSystem;Lme/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque;Lme/rerere/matrix/thirdparty/okio/Path;ZZLme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   542: dup
    //   543: aload #16
    //   545: if_acmpne -> 619
    //   548: aload #16
    //   550: areturn
    //   551: aload #15
    //   553: getfield Z$1 : Z
    //   556: istore #5
    //   558: aload #15
    //   560: getfield Z$0 : Z
    //   563: istore #4
    //   565: aload #15
    //   567: getfield L$4 : Ljava/lang/Object;
    //   570: checkcast java/util/Iterator
    //   573: astore #12
    //   575: aload #15
    //   577: getfield L$3 : Ljava/lang/Object;
    //   580: checkcast me/rerere/matrix/thirdparty/okio/Path
    //   583: astore_3
    //   584: aload #15
    //   586: getfield L$2 : Ljava/lang/Object;
    //   589: checkcast me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque
    //   592: astore_2
    //   593: aload #15
    //   595: getfield L$1 : Ljava/lang/Object;
    //   598: checkcast me/rerere/matrix/thirdparty/okio/FileSystem
    //   601: astore_1
    //   602: aload #15
    //   604: getfield L$0 : Ljava/lang/Object;
    //   607: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   610: astore_0
    //   611: nop
    //   612: aload #14
    //   614: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   617: aload #14
    //   619: pop
    //   620: goto -> 431
    //   623: aload_2
    //   624: invokevirtual removeLast : ()Ljava/lang/Object;
    //   627: pop
    //   628: goto -> 641
    //   631: astore #12
    //   633: aload_2
    //   634: invokevirtual removeLast : ()Ljava/lang/Object;
    //   637: pop
    //   638: aload #12
    //   640: athrow
    //   641: iload #5
    //   643: ifeq -> 721
    //   646: aload_0
    //   647: aload_3
    //   648: aload #15
    //   650: aload #15
    //   652: aconst_null
    //   653: putfield L$0 : Ljava/lang/Object;
    //   656: aload #15
    //   658: aconst_null
    //   659: putfield L$1 : Ljava/lang/Object;
    //   662: aload #15
    //   664: aconst_null
    //   665: putfield L$2 : Ljava/lang/Object;
    //   668: aload #15
    //   670: aconst_null
    //   671: putfield L$3 : Ljava/lang/Object;
    //   674: aload #15
    //   676: aconst_null
    //   677: putfield L$4 : Ljava/lang/Object;
    //   680: aload #15
    //   682: iconst_3
    //   683: putfield label : I
    //   686: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   689: dup
    //   690: aload #16
    //   692: if_acmpne -> 716
    //   695: goto -> 702
    //   698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   701: athrow
    //   702: aload #16
    //   704: areturn
    //   705: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   708: athrow
    //   709: aload #14
    //   711: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   714: aload #14
    //   716: pop
    //   717: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   720: areturn
    //   721: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   724: areturn
    //   725: new java/lang/IllegalStateException
    //   728: dup
    //   729: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   731: invokespecial <init> : (Ljava/lang/String;)V
    //   734: athrow
    // Exception table:
    //   from	to	target	type
    //   24	50	50	java/lang/IllegalStateException
    //   77	122	125	java/lang/IllegalStateException
    //   112	186	189	java/lang/IllegalStateException
    //   129	196	196	java/lang/IllegalStateException
    //   293	307	307	java/lang/IllegalStateException
    //   321	336	339	java/lang/IllegalStateException
    //   327	357	357	java/lang/IllegalStateException
    //   369	377	377	java/lang/IllegalStateException
    //   398	408	411	java/lang/IllegalStateException
    //   421	542	631	finally
    //   453	467	467	java/lang/IllegalStateException
    //   472	481	481	java/lang/IllegalStateException
    //   611	623	631	finally
    //   631	633	631	finally
    //   641	695	698	java/lang/IllegalStateException
    //   646	705	705	java/lang/IllegalStateException
  }
  
  public static final void commonDeleteRecursively(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt.a : J
    //   3: ldc2_w 84343163318734
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'fileOrDirectory'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: new me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt$commonDeleteRecursively$sequence$1
    //   23: dup
    //   24: aload_0
    //   25: aload_1
    //   26: aconst_null
    //   27: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okio/FileSystem;Lme/rerere/matrix/thirdparty/okio/Path;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)V
    //   30: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2
    //   33: invokestatic sequence : (Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   36: astore #5
    //   38: aload #5
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore #6
    //   47: aload #6
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 108
    //   57: aload #6
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast me/rerere/matrix/thirdparty/okio/Path
    //   67: astore #7
    //   69: aload_0
    //   70: aload #7
    //   72: iload_2
    //   73: ifeq -> 101
    //   76: aload #6
    //   78: invokeinterface hasNext : ()Z
    //   83: ifne -> 101
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 102
    //   97: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   100: athrow
    //   101: iconst_0
    //   102: invokevirtual delete : (Lme/rerere/matrix/thirdparty/okio/Path;Z)V
    //   105: goto -> 47
    //   108: return
    // Exception table:
    //   from	to	target	type
    //   69	86	89	java/io/IOException
    //   76	97	97	java/io/IOException
  }
  
  @NotNull
  public static final FileMetadata commonMetadata(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath) throws IOException {
    long l = a ^ 0x36D05917657L;
    Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
    Intrinsics.checkNotNullParameter(paramPath, "path");
    FileMetadata fileMetadata = paramFileSystem.metadataOrNull(paramPath);
    try {
      if (fileMetadata == null)
        throw new FileNotFoundException(Intrinsics.stringPlus("no such file: ", paramPath)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return fileMetadata;
  }
  
  @Nullable
  public static final Path symlinkTarget(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath) throws IOException {
    long l = a ^ 0x8A15836614CL;
    Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
    Intrinsics.checkNotNullParameter(paramPath, "path");
    Path path2 = paramFileSystem.metadata(paramPath).getSymlinkTarget();
    try {
      if (path2 == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Path path1 = path2;
    Intrinsics.checkNotNull(paramPath.parent());
    return paramPath.parent().resolve(path1);
  }
  
  public static final void commonCreateDirectories(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath, boolean paramBoolean) throws IOException {
    long l = a ^ 0x6914FD080967L;
    Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    ArrayDeque arrayDeque = new ArrayDeque();
    Path path = paramPath;
    while (true) {
      try {
        if (path != null && !paramFileSystem.exists(path)) {
          arrayDeque.addFirst(path);
          path = path.parent();
          continue;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (paramBoolean)
        try {
          if (arrayDeque.isEmpty())
            throw new IOException(paramPath + " already exist."); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    for (Path path1 : arrayDeque)
      paramFileSystem.createDirectory(path1); 
  }
  
  public static final void commonCopy(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath1, @NotNull Path paramPath2) throws IOException {
    long l = a ^ 0x1F294BA4FA4CL;
    Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    Closeable closeable = (Closeable)paramFileSystem.source(paramPath1);
    boolean bool = false;
    Long long_ = null;
    Throwable throwable = null;
    try {
      Source source = (Source)closeable;
      boolean bool1 = false;
      Closeable closeable1 = (Closeable)Okio.buffer(paramFileSystem.sink(paramPath2));
      boolean bool2 = false;
      Long long_1 = null;
      Throwable throwable1 = null;
      try {
        BufferedSink bufferedSink = (BufferedSink)closeable1;
        boolean bool3 = false;
        long_1 = Long.valueOf(bufferedSink.writeAll(source));
      } catch (Throwable throwable2) {
        throwable1 = throwable2;
      } 
      try {
        Closeable closeable2 = closeable1;
        try {
          if (closeable2 != null)
            closeable2.close(); 
        } catch (Throwable throwable2) {
          throw a(null);
        } 
      } catch (Throwable throwable2) {
        if (throwable1 == null) {
          throwable1 = throwable2;
        } else {
          ExceptionsKt.addSuppressed(throwable1, throwable2);
        } 
      } 
      try {
        if (throwable1 != null)
          throw throwable1; 
      } catch (Throwable throwable2) {
        throw a(null);
      } 
      Intrinsics.checkNotNull(long_1);
      long_ = Long.valueOf(long_1.longValue());
    } catch (Throwable throwable1) {
      throwable = throwable1;
    } 
    try {
      Closeable closeable1 = closeable;
      try {
        if (closeable1 != null)
          closeable1.close(); 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
    } catch (Throwable throwable1) {
      if (throwable == null) {
        throwable = throwable1;
      } else {
        ExceptionsKt.addSuppressed(throwable, throwable1);
      } 
    } 
    try {
      if (throwable != null)
        throw throwable; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(long_);
  }
  
  @NotNull
  public static final Sequence commonListRecursively(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath, boolean paramBoolean) throws IOException {
    long l = a ^ 0x3FD3BD17BB6AL;
    Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    return SequencesKt.sequence(new _FileSystemKt$commonListRecursively$1(paramPath, paramFileSystem, paramBoolean, null));
  }
  
  public static final boolean commonExists(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath) throws IOException {
    long l = a ^ 0x47B1D01674F8L;
    try {
      Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
      Intrinsics.checkNotNullParameter(paramPath, "path");
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (paramFileSystem.metadataOrNull(paramPath) != null);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_FileSystemKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */