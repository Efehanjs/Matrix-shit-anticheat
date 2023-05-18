package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _PathKt {
  @NotNull
  private static final ByteString DOT;
  
  @NotNull
  private static final ByteString ANY_SLASH;
  
  @NotNull
  private static final ByteString BACKSLASH;
  
  @NotNull
  private static final ByteString SLASH;
  
  @NotNull
  private static final ByteString DOT_DOT;
  
  private static final long a = o3.a(6891823740147684556L, 2824532273663928670L, MethodHandles.lookup().lookupClass()).a(17732732397722L);
  
  @Nullable
  public static final Path commonRoot(@NotNull Path paramPath) {
    long l = a ^ 0x4ACC3101A526L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    int i = access$rootLength(paramPath);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i == -1) ? null : new Path(paramPath.getBytes$okio().substring(0, i));
  }
  
  @NotNull
  public static final Path commonResolve(@NotNull Path paramPath, @NotNull Buffer paramBuffer, boolean paramBoolean) {
    long l = a ^ 0x79D885664ADDL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer, "child");
    boolean bool = false;
    return commonResolve(paramPath, toPath(paramBuffer, false), paramBoolean);
  }
  
  @NotNull
  public static final ByteString commonNameBytes(@NotNull Path paramPath) {
    long l = a ^ 0x760D3E24F5F3L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    int i = access$getIndexOfLastSlash(paramPath);
    try {
      try {
        if (paramPath.volumeLetter() != null)
          try {
            if (paramPath.getBytes$okio().size() == 2);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i != -1) ? ByteString.substring$default(paramPath.getBytes$okio(), i + 1, 0, 2, null) : paramPath.getBytes$okio();
  }
  
  @NotNull
  public static final List commonSegmentsBytes(@NotNull Path paramPath) {
    long l = a ^ 0x73AD4CA99CA3L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    int i = 0;
    ArrayList<ByteString> arrayList = new ArrayList();
    i = access$rootLength(paramPath);
    if (i == -1) {
      i = 0;
    } else {
      int m = 92;
      boolean bool1 = false;
      if (i < paramPath.getBytes$okio().size() && paramPath.getBytes$okio().getByte(i) == (byte)m) {
        m = i;
        i = m + 1;
      } 
    } 
    int j = i;
    int k = paramPath.getBytes$okio().size();
    if (j < k)
      do {
        int m = j;
        j++;
        byte b = 47;
        boolean bool1 = false;
        b = 92;
        bool1 = false;
        if (paramPath.getBytes$okio().getByte(m) != (byte)b && paramPath.getBytes$okio().getByte(m) != (byte)b)
          continue; 
        ArrayList<ByteString> arrayList1 = arrayList;
        ByteString byteString = paramPath.getBytes$okio().substring(i, m);
        boolean bool2 = false;
        arrayList1.add(byteString);
        i = m + 1;
      } while (j < k); 
    if (i < paramPath.getBytes$okio().size()) {
      ArrayList<ByteString> arrayList1 = arrayList;
      ByteString byteString = paramPath.getBytes$okio().substring(i, paramPath.getBytes$okio().size());
      boolean bool1 = false;
      arrayList1.add(byteString);
    } 
    return arrayList;
  }
  
  public static final int commonCompareTo(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = a ^ 0x7D04A901C3CBL;
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "other");
    boolean bool = false;
    return paramPath1.getBytes$okio().compareTo(paramPath2.getBytes$okio());
  }
  
  public static final boolean commonIsAbsolute(@NotNull Path paramPath) {
    long l = a ^ 0xEB0F458522BL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (access$rootLength(paramPath) != -1);
  }
  
  @Nullable
  public static final Character commonVolumeLetter(@NotNull Path paramPath) {
    long l = a ^ 0x65C4EFF842AAL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool1 = false;
    try {
      if (ByteString.indexOf$default(paramPath.getBytes$okio(), access$getSLASH$p(), 0, 2, null) != -1)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramPath.getBytes$okio().size() < 2)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    char c = ':';
    boolean bool2 = false;
    try {
      if (paramPath.getBytes$okio().getByte(1) != (byte)c)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    c = (char)paramPath.getBytes$okio().getByte(0);
    try {
      if ('a' <= c) {
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
          if ('A' <= c) {
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
          if (!false)
            return null; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Character.valueOf(c);
  }
  
  @NotNull
  public static final Path commonNormalized(@NotNull Path paramPath) {
    long l = a ^ 0x37B332A64AAEL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    return Path.Companion.get(paramPath.toString(), true);
  }
  
  public static final boolean commonIsRoot(@NotNull Path paramPath) {
    long l = a ^ 0x4BE3ED9EFF85L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (access$rootLength(paramPath) == paramPath.getBytes$okio().size());
  }
  
  public static final boolean commonEquals(@NotNull Path paramPath, @Nullable Object paramObject) {
    long l = a ^ 0x5D60572B4EA5L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    try {
      if (paramObject instanceof Path)
        try {
          if (Intrinsics.areEqual(((Path)paramObject).getBytes$okio(), paramPath.getBytes$okio()));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public static final Path commonResolve(@NotNull Path paramPath, @NotNull ByteString paramByteString, boolean paramBoolean) {
    long l = a ^ 0x4DEC8AED83DFL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString, "child");
    boolean bool1 = false;
    Path path = paramPath;
    Buffer buffer = (new Buffer()).write(paramByteString);
    boolean bool2 = false;
    return commonResolve(path, toPath(buffer, false), paramBoolean);
  }
  
  @NotNull
  public static final Path commonToPath(@NotNull String paramString, boolean paramBoolean) {
    long l = a ^ 0x3F3BAFCE3572L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return toPath((new Buffer()).writeUtf8(paramString), paramBoolean);
  }
  
  @NotNull
  public static final Path commonRelativeTo(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = a ^ 0x7C3330BCF64AL;
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "other");
    boolean bool1 = false;
    boolean bool = Intrinsics.areEqual(paramPath1.getRoot(), paramPath2.getRoot());
    boolean bool2 = false;
    int i = 0;
    if (!bool) {
      boolean bool4 = false;
      String str = "Paths of different roots cannot be relative to each other: " + paramPath1 + " and " + paramPath2;
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    List<ByteString> list = paramPath1.getSegmentsBytes();
    List list1 = paramPath2.getSegmentsBytes();
    i = 0;
    int k = list.size();
    int m = list1.size();
    boolean bool3 = false;
    int j = Math.min(k, m);
    while (true) {
      try {
        if (i < j && Intrinsics.areEqual(list.get(i), list1.get(i))) {
          k = i;
          i = k + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (i == j)
        try {
          if (paramPath1.getBytes$okio().size() == paramPath2.getBytes$okio().size())
            return Path.Companion.get$default(Path.Companion, ".", false, 1, null); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    k = (list1.subList(i, list1.size()).indexOf(access$getDOT_DOT$p()) == -1) ? 1 : 0;
    m = 0;
    bool3 = false;
    if (k == 0) {
      boolean bool4 = false;
      String str = "Impossible relative path to resolve: " + paramPath1 + " and " + paramPath2;
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    Buffer buffer = new Buffer();
    ByteString byteString2 = access$getSlash(paramPath2);
    if (byteString2 == null) {
      ByteString byteString = access$getSlash(paramPath1);
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } else {
    
    } 
    ByteString byteString1 = byteString2;
    int n = i;
    int i1 = list1.size();
    if (n < i1)
      do {
        int i2 = n;
        n++;
        buffer.write(access$getDOT_DOT$p());
        buffer.write(byteString1);
      } while (n < i1); 
    n = i;
    i1 = list.size();
    if (n < i1)
      do {
        int i2 = n;
        n++;
        buffer.write(list.get(i2));
        buffer.write(byteString1);
      } while (n < i1); 
    return toPath(buffer, false);
  }
  
  @NotNull
  public static final Path toPath(@NotNull Buffer paramBuffer, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.a : J
    //   3: ldc2_w 19006047433308
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aconst_null
    //   15: astore #4
    //   17: new me/rerere/matrix/thirdparty/okio/Buffer
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore #5
    //   26: iconst_0
    //   27: istore #6
    //   29: aload_0
    //   30: lconst_0
    //   31: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.SLASH : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   34: invokevirtual rangeEquals : (JLme/rerere/matrix/thirdparty/okio/ByteString;)Z
    //   37: ifne -> 58
    //   40: aload_0
    //   41: lconst_0
    //   42: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.BACKSLASH : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   45: invokevirtual rangeEquals : (JLme/rerere/matrix/thirdparty/okio/ByteString;)Z
    //   48: ifeq -> 102
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   57: athrow
    //   58: aload_0
    //   59: invokevirtual readByte : ()B
    //   62: istore #7
    //   64: aload #4
    //   66: astore #8
    //   68: aload #8
    //   70: ifnonnull -> 85
    //   73: iload #7
    //   75: invokestatic toSlash : (B)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   78: goto -> 87
    //   81: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   84: athrow
    //   85: aload #8
    //   87: astore #4
    //   89: iload #6
    //   91: istore #8
    //   93: iload #8
    //   95: iconst_1
    //   96: iadd
    //   97: istore #6
    //   99: goto -> 29
    //   102: iload #6
    //   104: iconst_2
    //   105: if_icmplt -> 134
    //   108: aload #4
    //   110: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.BACKSLASH : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   113: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   116: ifeq -> 134
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   125: athrow
    //   126: iconst_1
    //   127: goto -> 135
    //   130: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   133: athrow
    //   134: iconst_0
    //   135: istore #7
    //   137: iload #7
    //   139: ifeq -> 169
    //   142: aload #5
    //   144: aload #4
    //   146: dup
    //   147: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   150: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   153: pop
    //   154: aload #5
    //   156: aload #4
    //   158: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   161: pop
    //   162: goto -> 303
    //   165: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   168: athrow
    //   169: iload #6
    //   171: ifle -> 193
    //   174: aload #5
    //   176: aload #4
    //   178: dup
    //   179: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   182: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   185: pop
    //   186: goto -> 303
    //   189: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   192: athrow
    //   193: aload_0
    //   194: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.ANY_SLASH : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   197: invokevirtual indexOfElement : (Lme/rerere/matrix/thirdparty/okio/ByteString;)J
    //   200: lstore #8
    //   202: aload #4
    //   204: astore #10
    //   206: aload #10
    //   208: ifnonnull -> 249
    //   211: lload #8
    //   213: lstore #11
    //   215: lload #11
    //   217: ldc2_w -1
    //   220: lcmp
    //   221: ifne -> 237
    //   224: getstatic me/rerere/matrix/thirdparty/okio/Path.DIRECTORY_SEPARATOR : Ljava/lang/String;
    //   227: invokestatic toSlash : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   230: goto -> 251
    //   233: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   236: athrow
    //   237: aload_0
    //   238: lload #8
    //   240: invokevirtual getByte : (J)B
    //   243: invokestatic toSlash : (B)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   246: goto -> 251
    //   249: aload #10
    //   251: astore #4
    //   253: aload_0
    //   254: aload #4
    //   256: invokestatic startsWithVolumeLetterAndColon : (Lme/rerere/matrix/thirdparty/okio/Buffer;Lme/rerere/matrix/thirdparty/okio/ByteString;)Z
    //   259: ifeq -> 303
    //   262: lload #8
    //   264: ldc2_w 2
    //   267: lcmp
    //   268: ifne -> 294
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   277: athrow
    //   278: aload #5
    //   280: aload_0
    //   281: ldc2_w 3
    //   284: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)V
    //   287: goto -> 303
    //   290: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   293: athrow
    //   294: aload #5
    //   296: aload_0
    //   297: ldc2_w 2
    //   300: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)V
    //   303: aload #5
    //   305: invokevirtual size : ()J
    //   308: lconst_0
    //   309: lcmp
    //   310: ifle -> 321
    //   313: iconst_1
    //   314: goto -> 322
    //   317: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   320: athrow
    //   321: iconst_0
    //   322: istore #8
    //   324: iconst_0
    //   325: istore #10
    //   327: new java/util/ArrayList
    //   330: dup
    //   331: invokespecial <init> : ()V
    //   334: checkcast java/util/List
    //   337: astore #9
    //   339: aload_0
    //   340: invokevirtual exhausted : ()Z
    //   343: ifne -> 581
    //   346: aload_0
    //   347: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.ANY_SLASH : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   350: invokevirtual indexOfElement : (Lme/rerere/matrix/thirdparty/okio/ByteString;)J
    //   353: lstore #10
    //   355: aconst_null
    //   356: astore #12
    //   358: lload #10
    //   360: ldc2_w -1
    //   363: lcmp
    //   364: ifne -> 376
    //   367: aload_0
    //   368: invokevirtual readByteString : ()Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   371: astore #12
    //   373: goto -> 389
    //   376: aload_0
    //   377: lload #10
    //   379: invokevirtual readByteString : (J)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   382: astore #12
    //   384: aload_0
    //   385: invokevirtual readByte : ()B
    //   388: pop
    //   389: aload #12
    //   391: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.DOT_DOT : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   394: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   397: ifeq -> 546
    //   400: iload #8
    //   402: ifeq -> 436
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   411: athrow
    //   412: aload #9
    //   414: invokeinterface isEmpty : ()Z
    //   419: ifeq -> 436
    //   422: goto -> 429
    //   425: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   428: athrow
    //   429: goto -> 339
    //   432: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   435: athrow
    //   436: iload_1
    //   437: ifeq -> 490
    //   440: iload #8
    //   442: ifne -> 507
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   451: athrow
    //   452: aload #9
    //   454: invokeinterface isEmpty : ()Z
    //   459: ifne -> 490
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   468: athrow
    //   469: aload #9
    //   471: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
    //   474: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.DOT_DOT : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   477: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   480: ifeq -> 507
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   489: athrow
    //   490: aload #9
    //   492: aload #12
    //   494: invokeinterface add : (Ljava/lang/Object;)Z
    //   499: pop
    //   500: goto -> 339
    //   503: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   506: athrow
    //   507: iload #7
    //   509: ifeq -> 537
    //   512: aload #9
    //   514: invokeinterface size : ()I
    //   519: iconst_1
    //   520: if_icmpne -> 537
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   529: athrow
    //   530: goto -> 339
    //   533: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   536: athrow
    //   537: aload #9
    //   539: invokestatic removeLastOrNull : (Ljava/util/List;)Ljava/lang/Object;
    //   542: pop
    //   543: goto -> 339
    //   546: aload #12
    //   548: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.DOT : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   551: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   554: ifne -> 339
    //   557: aload #12
    //   559: getstatic me/rerere/matrix/thirdparty/okio/ByteString.EMPTY : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   562: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   565: ifne -> 339
    //   568: aload #9
    //   570: aload #12
    //   572: invokeinterface add : (Ljava/lang/Object;)Z
    //   577: pop
    //   578: goto -> 339
    //   581: iconst_0
    //   582: istore #10
    //   584: aload #9
    //   586: invokeinterface size : ()I
    //   591: istore #11
    //   593: iload #10
    //   595: iload #11
    //   597: if_icmpge -> 645
    //   600: iload #10
    //   602: istore #12
    //   604: iinc #10, 1
    //   607: iload #12
    //   609: ifle -> 620
    //   612: aload #5
    //   614: aload #4
    //   616: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   619: pop
    //   620: aload #5
    //   622: aload #9
    //   624: iload #12
    //   626: invokeinterface get : (I)Ljava/lang/Object;
    //   631: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   634: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   637: pop
    //   638: iload #10
    //   640: iload #11
    //   642: if_icmplt -> 600
    //   645: aload #5
    //   647: invokevirtual size : ()J
    //   650: lconst_0
    //   651: lcmp
    //   652: ifne -> 671
    //   655: aload #5
    //   657: getstatic me/rerere/matrix/thirdparty/okio/internal/_PathKt.DOT : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   660: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   663: pop
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   670: athrow
    //   671: new me/rerere/matrix/thirdparty/okio/Path
    //   674: dup
    //   675: aload #5
    //   677: invokevirtual readByteString : ()Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   680: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okio/ByteString;)V
    //   683: areturn
    // Exception table:
    //   from	to	target	type
    //   29	51	54	java/lang/IllegalArgumentException
    //   68	81	81	java/lang/IllegalArgumentException
    //   102	119	122	java/lang/IllegalArgumentException
    //   108	130	130	java/lang/IllegalArgumentException
    //   137	165	165	java/lang/IllegalArgumentException
    //   169	189	189	java/lang/IllegalArgumentException
    //   215	233	233	java/lang/IllegalArgumentException
    //   253	271	274	java/lang/IllegalArgumentException
    //   262	290	290	java/lang/IllegalArgumentException
    //   303	317	317	java/lang/IllegalArgumentException
    //   389	405	408	java/lang/IllegalArgumentException
    //   400	422	425	java/lang/IllegalArgumentException
    //   412	432	432	java/lang/IllegalArgumentException
    //   436	445	448	java/lang/IllegalArgumentException
    //   440	462	465	java/lang/IllegalArgumentException
    //   452	483	486	java/lang/IllegalArgumentException
    //   469	503	503	java/lang/IllegalArgumentException
    //   507	523	526	java/lang/IllegalArgumentException
    //   512	533	533	java/lang/IllegalArgumentException
    //   645	664	667	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final List commonSegments(@NotNull Path paramPath) {
    long l = a ^ 0x275A04152060L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool1 = false;
    Path path = paramPath;
    boolean bool2 = false;
    int i = 0;
    ArrayList<ByteString> arrayList3 = new ArrayList();
    i = access$rootLength(path);
    if (i == -1) {
      i = 0;
    } else {
      int m = 92;
      boolean bool = false;
      if (i < path.getBytes$okio().size() && path.getBytes$okio().getByte(i) == (byte)m) {
        m = i;
        i = m + 1;
      } 
    } 
    int j = i;
    int k = path.getBytes$okio().size();
    if (j < k)
      do {
        int m = j;
        j++;
        byte b = 47;
        boolean bool3 = false;
        b = 92;
        bool3 = false;
        if (path.getBytes$okio().getByte(m) != (byte)b && path.getBytes$okio().getByte(m) != (byte)b)
          continue; 
        ArrayList<ByteString> arrayList = arrayList3;
        ByteString byteString = path.getBytes$okio().substring(i, m);
        boolean bool4 = false;
        arrayList.add(byteString);
        i = m + 1;
      } while (j < k); 
    if (i < path.getBytes$okio().size()) {
      ArrayList<ByteString> arrayList = arrayList3;
      ByteString byteString = path.getBytes$okio().substring(i, path.getBytes$okio().size());
      boolean bool = false;
      arrayList.add(byteString);
    } 
    ArrayList<ByteString> arrayList1 = arrayList3;
    bool2 = false;
    ArrayList<ByteString> arrayList2 = arrayList1;
    arrayList3 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList1, 10));
    j = 0;
    for (ByteString byteString1 : arrayList2) {
      ByteString byteString2 = byteString1;
      ArrayList<ByteString> arrayList = arrayList3;
      boolean bool = false;
      String str = byteString2.utf8();
      arrayList.add(str);
    } 
    return arrayList3;
  }
  
  @Nullable
  public static final Path commonParent(@NotNull Path paramPath) {
    long l = a ^ 0x3DFAE2C0A271L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(paramPath.getBytes$okio(), access$getDOT$p()))
        try {
          if (!Intrinsics.areEqual(paramPath.getBytes$okio(), access$getSLASH$p()))
            try {
              if (!Intrinsics.areEqual(paramPath.getBytes$okio(), access$getBACKSLASH$p()))
                try {
                  if (!access$lastSegmentIsDotDot(paramPath)) {
                    int i = access$getIndexOfLastSlash(paramPath);
                    try {
                      if (i == 2)
                        try {
                          if (paramPath.volumeLetter() != null) {
                            try {
                              if (paramPath.getBytes$okio().size() == 3)
                                return null; 
                            } catch (IllegalArgumentException illegalArgumentException) {
                              throw a(null);
                            } 
                            return new Path(ByteString.substring$default(paramPath.getBytes$okio(), 0, 3, 1, null));
                          } 
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        }  
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    try {
                      if (i == 1)
                        try {
                          if (paramPath.getBytes$okio().startsWith(access$getBACKSLASH$p()))
                            return null; 
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        }  
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    try {
                      if (i == -1)
                        try {
                          if (paramPath.volumeLetter() != null) {
                            try {
                              if (paramPath.getBytes$okio().size() == 2)
                                return null; 
                            } catch (IllegalArgumentException illegalArgumentException) {
                              throw a(null);
                            } 
                            return new Path(ByteString.substring$default(paramPath.getBytes$okio(), 0, 2, 1, null));
                          } 
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        }  
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    try {
                      if (i == -1)
                        return new Path(access$getDOT$p()); 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    try {
                      if (i == 0)
                        return new Path(ByteString.substring$default(paramPath.getBytes$okio(), 0, 1, 1, null)); 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    return new Path(ByteString.substring$default(paramPath.getBytes$okio(), 0, i, 1, null));
                  } 
                  return null;
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
    return null;
  }
  
  @NotNull
  public static final Path commonResolve(@NotNull Path paramPath1, @NotNull Path paramPath2, boolean paramBoolean) {
    long l = a ^ 0x7972BE274667L;
    try {
      Intrinsics.checkNotNullParameter(paramPath1, "<this>");
      Intrinsics.checkNotNullParameter(paramPath2, "child");
      if (!paramPath2.isAbsolute())
        try {
          if (paramPath2.volumeLetter() == null) {
            ByteString byteString2 = getSlash(paramPath1);
            if (byteString2 == null) {
              ByteString byteString = getSlash(paramPath2);
              try {
              
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
            
            } 
            ByteString byteString1 = byteString2;
            Buffer buffer = new Buffer();
            try {
              buffer.write(paramPath1.getBytes$okio());
              if (buffer.size() > 0L)
                buffer.write(byteString1); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            buffer.write(paramPath2.getBytes$okio());
            return toPath(buffer, paramBoolean);
          } 
          return paramPath2;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramPath2;
  }
  
  @NotNull
  public static final String commonToString(@NotNull Path paramPath) {
    long l = a ^ 0xFEF43DF3853L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    return paramPath.getBytes$okio().utf8();
  }
  
  @NotNull
  public static final String commonName(@NotNull Path paramPath) {
    long l = a ^ 0x533B621A9206L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    return paramPath.nameBytes().utf8();
  }
  
  public static final int commonHashCode(@NotNull Path paramPath) {
    long l = a ^ 0x3BFCAD38E4C1L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    return paramPath.getBytes$okio().hashCode();
  }
  
  @NotNull
  public static final Path commonResolve(@NotNull Path paramPath, @NotNull String paramString, boolean paramBoolean) {
    long l = a ^ 0x7D890AB441B0L;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "child");
    boolean bool1 = false;
    Path path = paramPath;
    Buffer buffer = (new Buffer()).writeUtf8(paramString);
    boolean bool2 = false;
    return commonResolve(path, toPath(buffer, false), paramBoolean);
  }
  
  public static final boolean commonIsRelative(@NotNull Path paramPath) {
    long l = a ^ 0x26E4314E180AL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (access$rootLength(paramPath) == -1);
  }
  
  static {
    long l = a ^ 0x13BB218753EFL;
    SLASH = ByteString.Companion.encodeUtf8("/");
    BACKSLASH = ByteString.Companion.encodeUtf8("\\");
    ANY_SLASH = ByteString.Companion.encodeUtf8("/\\");
    DOT = ByteString.Companion.encodeUtf8(".");
    DOT_DOT = ByteString.Companion.encodeUtf8("..");
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_PathKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */