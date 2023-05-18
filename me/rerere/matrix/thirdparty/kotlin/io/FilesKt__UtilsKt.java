package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
  private static final long d = o3.a(-7270247286582113273L, -1538155966536843444L, null).a(52007161037955L);
  
  @NotNull
  public static final File copyTo(@NotNull File paramFile1, @NotNull File paramFile2, boolean paramBoolean, int paramInt) {
    long l = d ^ 0x63CBBE0ED695L;
    try {
      Intrinsics.checkNotNullParameter(paramFile1, "<this>");
      Intrinsics.checkNotNullParameter(paramFile2, "target");
      if (!paramFile1.exists())
        throw new NoSuchFileException(paramFile1, null, "The source file doesn't exist.", 2, null); 
    } catch (Throwable throwable) {
      throw b(null);
    } 
    try {
      if (paramFile2.exists()) {
        try {
          if (!paramBoolean)
            throw new FileAlreadyExistsException(paramFile1, paramFile2, "The destination file already exists."); 
        } catch (Throwable throwable) {
          throw b(null);
        } 
        try {
          if (!paramFile2.delete())
            throw new FileAlreadyExistsException(paramFile1, paramFile2, "Tried to overwrite the destination, but failed to delete it."); 
        } catch (Throwable throwable) {
          throw b(null);
        } 
      } 
    } catch (Throwable throwable) {
      throw b(null);
    } 
    try {
      if (paramFile1.isDirectory()) {
        try {
          if (!paramFile2.mkdirs())
            throw new FileSystemException(paramFile1, paramFile2, "Failed to create target directory."); 
        } catch (Throwable throwable) {
          throw b(null);
        } 
      } else {
        try {
          if (paramFile2.getParentFile() != null) {
            paramFile2.getParentFile().mkdirs();
          } else {
            paramFile2.getParentFile();
          } 
        } catch (Throwable throwable1) {
          throw b(null);
        } 
        FileInputStream fileInputStream = new FileInputStream(paramFile1);
        Throwable throwable = null;
        try {
          FileInputStream fileInputStream1 = fileInputStream;
          boolean bool = false;
          FileOutputStream fileOutputStream = new FileOutputStream(paramFile2);
          Throwable throwable1 = null;
          try {
            FileOutputStream fileOutputStream1 = fileOutputStream;
            boolean bool1 = false;
            long l2 = ByteStreamsKt.copyTo(fileInputStream1, fileOutputStream1, paramInt);
          } catch (Throwable throwable2) {
            throwable1 = throwable2;
            throw throwable2;
          } finally {
            CloseableKt.closeFinally(fileOutputStream, throwable1);
          } 
          long l1 = l2;
        } catch (Throwable throwable1) {
          throwable = throwable1;
          throw throwable1;
        } finally {
          CloseableKt.closeFinally(fileInputStream, throwable);
        } 
      } 
    } catch (Throwable throwable) {
      throw b(null);
    } 
    return paramFile2;
  }
  
  public static final boolean startsWith(@NotNull File paramFile, @NotNull String paramString) {
    long l = d ^ 0x715C53F150C6L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "other");
    return FilesKt.startsWith(paramFile, new File(paramString));
  }
  
  @NotNull
  public static final File resolveSibling(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x624DD628EF23L;
    Intrinsics.checkNotNullParameter(paramFile1, "<this>");
    Intrinsics.checkNotNullParameter(paramFile2, "relative");
    FilePathComponents filePathComponents = FilesKt.toComponents(paramFile1);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    File file = (filePathComponents.getSize() == 0) ? new File("..") : filePathComponents.subPath(0, filePathComponents.getSize() - 1);
    return FilesKt.resolve(FilesKt.resolve(filePathComponents.getRoot(), file), paramFile2);
  }
  
  public static final boolean endsWith(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x3C21D18B15F7L;
    Intrinsics.checkNotNullParameter(paramFile1, "<this>");
    Intrinsics.checkNotNullParameter(paramFile2, "other");
    FilePathComponents filePathComponents1 = FilesKt.toComponents(paramFile1);
    FilePathComponents filePathComponents2 = FilesKt.toComponents(paramFile2);
    try {
      if (filePathComponents2.isRooted())
        return Intrinsics.areEqual(paramFile1, paramFile2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    int i = filePathComponents1.getSize() - filePathComponents2.getSize();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (i < 0) ? false : filePathComponents1.getSegments().subList(i, filePathComponents1.getSize()).equals(filePathComponents2.getSegments());
  }
  
  @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
  @NotNull
  public static final File createTempFile(@NotNull String paramString1, @Nullable String paramString2, @Nullable File paramFile) {
    long l = d ^ 0x419B50CB1466L;
    Intrinsics.checkNotNullParameter(paramString1, "prefix");
    Intrinsics.checkNotNullExpressionValue(File.createTempFile(paramString1, paramString2, paramFile), "createTempFile(prefix, suffix, directory)");
    return File.createTempFile(paramString1, paramString2, paramFile);
  }
  
  public static final boolean copyRecursively(@NotNull File paramFile1, @NotNull File paramFile2, boolean paramBoolean, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/io/FilesKt__UtilsKt.d : J
    //   3: ldc2_w 104087729764040
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 'target'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_3
    //   22: ldc 'onError'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: aload_0
    //   28: invokevirtual exists : ()Z
    //   31: ifne -> 77
    //   34: aload_3
    //   35: aload_0
    //   36: new me/rerere/matrix/thirdparty/kotlin/io/NoSuchFileException
    //   39: dup
    //   40: aload_0
    //   41: aconst_null
    //   42: ldc 'The source file doesn't exist.'
    //   44: iconst_2
    //   45: aconst_null
    //   46: invokespecial <init> : (Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   49: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   54: getstatic me/rerere/matrix/thirdparty/kotlin/io/OnErrorAction.TERMINATE : Lme/rerere/matrix/thirdparty/kotlin/io/OnErrorAction;
    //   57: if_acmpeq -> 75
    //   60: goto -> 67
    //   63: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   66: athrow
    //   67: iconst_1
    //   68: goto -> 76
    //   71: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   74: athrow
    //   75: iconst_0
    //   76: ireturn
    //   77: nop
    //   78: aload_0
    //   79: invokestatic walkTopDown : (Ljava/io/File;)Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   82: new me/rerere/matrix/thirdparty/kotlin/io/FilesKt__UtilsKt$copyRecursively$2
    //   85: dup
    //   86: aload_3
    //   87: invokespecial <init> : (Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;)V
    //   90: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2
    //   93: invokevirtual onFail : (Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;)Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   96: invokevirtual iterator : ()Ljava/util/Iterator;
    //   99: astore #6
    //   101: aload #6
    //   103: invokeinterface hasNext : ()Z
    //   108: ifeq -> 417
    //   111: aload #6
    //   113: invokeinterface next : ()Ljava/lang/Object;
    //   118: checkcast java/io/File
    //   121: astore #7
    //   123: aload #7
    //   125: invokevirtual exists : ()Z
    //   128: ifne -> 168
    //   131: aload_3
    //   132: aload #7
    //   134: new me/rerere/matrix/thirdparty/kotlin/io/NoSuchFileException
    //   137: dup
    //   138: aload #7
    //   140: aconst_null
    //   141: ldc 'The source file doesn't exist.'
    //   143: iconst_2
    //   144: aconst_null
    //   145: invokespecial <init> : (Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   148: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   153: getstatic me/rerere/matrix/thirdparty/kotlin/io/OnErrorAction.TERMINATE : Lme/rerere/matrix/thirdparty/kotlin/io/OnErrorAction;
    //   156: if_acmpne -> 101
    //   159: goto -> 166
    //   162: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   165: athrow
    //   166: iconst_0
    //   167: ireturn
    //   168: aload #7
    //   170: aload_0
    //   171: invokestatic toRelativeString : (Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    //   174: astore #8
    //   176: new java/io/File
    //   179: dup
    //   180: aload_1
    //   181: aload #8
    //   183: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   186: astore #9
    //   188: aload #9
    //   190: invokevirtual exists : ()Z
    //   193: ifeq -> 347
    //   196: aload #7
    //   198: invokevirtual isDirectory : ()Z
    //   201: ifeq -> 226
    //   204: goto -> 211
    //   207: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   210: athrow
    //   211: aload #9
    //   213: invokevirtual isDirectory : ()Z
    //   216: ifne -> 347
    //   219: goto -> 226
    //   222: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: athrow
    //   226: iload_2
    //   227: ifne -> 245
    //   230: goto -> 237
    //   233: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   236: athrow
    //   237: iconst_1
    //   238: goto -> 297
    //   241: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   244: athrow
    //   245: aload #9
    //   247: invokevirtual isDirectory : ()Z
    //   250: ifeq -> 280
    //   253: aload #9
    //   255: invokestatic deleteRecursively : (Ljava/io/File;)Z
    //   258: ifne -> 276
    //   261: goto -> 268
    //   264: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   267: athrow
    //   268: iconst_1
    //   269: goto -> 297
    //   272: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   275: athrow
    //   276: iconst_0
    //   277: goto -> 297
    //   280: aload #9
    //   282: invokevirtual delete : ()Z
    //   285: ifne -> 296
    //   288: iconst_1
    //   289: goto -> 297
    //   292: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   295: athrow
    //   296: iconst_0
    //   297: istore #10
    //   299: iload #10
    //   301: ifeq -> 347
    //   304: aload_3
    //   305: aload #9
    //   307: new me/rerere/matrix/thirdparty/kotlin/io/FileAlreadyExistsException
    //   310: dup
    //   311: aload #7
    //   313: aload #9
    //   315: ldc 'The destination file already exists.'
    //   317: invokespecial <init> : (Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   320: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   325: getstatic me/rerere/matrix/thirdparty/kotlin/io/OnErrorAction.TERMINATE : Lme/rerere/matrix/thirdparty/kotlin/io/OnErrorAction;
    //   328: if_acmpne -> 344
    //   331: goto -> 338
    //   334: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   337: athrow
    //   338: iconst_0
    //   339: ireturn
    //   340: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   343: athrow
    //   344: goto -> 101
    //   347: aload #7
    //   349: invokevirtual isDirectory : ()Z
    //   352: ifeq -> 368
    //   355: aload #9
    //   357: invokevirtual mkdirs : ()Z
    //   360: pop
    //   361: goto -> 101
    //   364: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   367: athrow
    //   368: aload #7
    //   370: aload #9
    //   372: iload_2
    //   373: iconst_0
    //   374: iconst_4
    //   375: aconst_null
    //   376: invokestatic copyTo$default : (Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;
    //   379: invokevirtual length : ()J
    //   382: aload #7
    //   384: invokevirtual length : ()J
    //   387: lcmp
    //   388: ifeq -> 101
    //   391: aload_3
    //   392: aload #7
    //   394: new java/io/IOException
    //   397: dup
    //   398: ldc_w 'Source file wasn't copied completely, length of destination file differs.'
    //   401: invokespecial <init> : (Ljava/lang/String;)V
    //   404: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   409: getstatic me/rerere/matrix/thirdparty/kotlin/io/OnErrorAction.TERMINATE : Lme/rerere/matrix/thirdparty/kotlin/io/OnErrorAction;
    //   412: if_acmpne -> 101
    //   415: iconst_0
    //   416: ireturn
    //   417: iconst_1
    //   418: ireturn
    //   419: astore #6
    //   421: iconst_0
    //   422: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	60	63	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   34	71	71	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   77	419	419	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   123	159	162	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   188	204	207	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   196	219	222	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   211	230	233	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   226	241	241	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   245	261	264	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   253	272	272	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   280	292	292	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   299	331	334	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   304	340	340	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
    //   347	364	364	me/rerere/matrix/thirdparty/kotlin/io/TerminateException
  }
  
  @NotNull
  public static final String toRelativeString(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x1D8A1FD4B0A9L;
    try {
      Intrinsics.checkNotNullParameter(paramFile1, "<this>");
      Intrinsics.checkNotNullParameter(paramFile2, "base");
      if (toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2) == null) {
        toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2);
        throw new IllegalArgumentException("this and base files have different roots: " + paramFile1 + " and " + paramFile2 + '.');
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2);
  }
  
  public static final boolean startsWith(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0xBF570255D1BL;
    Intrinsics.checkNotNullParameter(paramFile1, "<this>");
    Intrinsics.checkNotNullParameter(paramFile2, "other");
    FilePathComponents filePathComponents1 = FilesKt.toComponents(paramFile1);
    FilePathComponents filePathComponents2 = FilesKt.toComponents(paramFile2);
    try {
      if (!Intrinsics.areEqual(filePathComponents1.getRoot(), filePathComponents2.getRoot()))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (filePathComponents1.getSize() < filePathComponents2.getSize()) ? false : filePathComponents1.getSegments().subList(0, filePathComponents2.getSize()).equals(filePathComponents2.getSegments());
  }
  
  @NotNull
  public static final String getNameWithoutExtension(@NotNull File paramFile) {
    long l = d ^ 0x12C011321C03L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramFile.getName(), "name");
    return StringsKt.substringBeforeLast$default(paramFile.getName(), ".", null, 2, null);
  }
  
  @NotNull
  public static final File resolveSibling(@NotNull File paramFile, @NotNull String paramString) {
    long l = d ^ 0x201C5EB50102L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "relative");
    return FilesKt.resolveSibling(paramFile, new File(paramString));
  }
  
  public static final boolean deleteRecursively(@NotNull File paramFile) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/io/FilesKt__UtilsKt.d : J
    //   3: ldc2_w 102815616760905
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokestatic walkBottomUp : (Ljava/io/File;)Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   18: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/Sequence
    //   21: astore_3
    //   22: iconst_1
    //   23: istore #4
    //   25: iconst_0
    //   26: istore #5
    //   28: iload #4
    //   30: istore #6
    //   32: aload_3
    //   33: invokeinterface iterator : ()Ljava/util/Iterator;
    //   38: astore #7
    //   40: aload #7
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 122
    //   50: aload #7
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: astore #8
    //   59: iload #6
    //   61: aload #8
    //   63: checkcast java/io/File
    //   66: astore #9
    //   68: istore #10
    //   70: iconst_0
    //   71: istore #11
    //   73: aload #9
    //   75: invokevirtual delete : ()Z
    //   78: ifne -> 96
    //   81: aload #9
    //   83: invokevirtual exists : ()Z
    //   86: ifne -> 116
    //   89: goto -> 96
    //   92: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #10
    //   98: ifeq -> 116
    //   101: goto -> 108
    //   104: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   107: athrow
    //   108: iconst_1
    //   109: goto -> 117
    //   112: invokestatic b : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   115: athrow
    //   116: iconst_0
    //   117: istore #6
    //   119: goto -> 40
    //   122: iload #6
    //   124: ireturn
    // Exception table:
    //   from	to	target	type
    //   73	89	92	java/lang/IllegalArgumentException
    //   81	101	104	java/lang/IllegalArgumentException
    //   96	112	112	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final File normalize(@NotNull File paramFile) {
    long l = d ^ 0x683AAF0B06A9L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    FilePathComponents filePathComponents1 = FilesKt.toComponents(paramFile);
    FilePathComponents filePathComponents2 = filePathComponents1;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(File.separator, "separator");
    return FilesKt.resolve(filePathComponents2.getRoot(), CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt(filePathComponents2.getSegments()), File.separator, null, null, 0, null, null, 62, null));
  }
  
  public static final boolean endsWith(@NotNull File paramFile, @NotNull String paramString) {
    long l = d ^ 0x347DCF13CFCBL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "other");
    return FilesKt.endsWith(paramFile, new File(paramString));
  }
  
  @NotNull
  public static final String getInvariantSeparatorsPath(@NotNull File paramFile) {
    long l = d ^ 0x3E1DF4FFB326L;
    try {
      Intrinsics.checkNotNullParameter(paramFile, "<this>");
      Intrinsics.checkNotNullExpressionValue(paramFile.getPath(), "path");
      Intrinsics.checkNotNullExpressionValue(paramFile.getPath(), "path");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (File.separatorChar != '/') ? StringsKt.replace$default(paramFile.getPath(), File.separatorChar, '/', false, 4, null) : paramFile.getPath();
  }
  
  @NotNull
  public static final String getExtension(@NotNull File paramFile) {
    long l = d ^ 0x5118BB192C0L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramFile.getName(), "name");
    return StringsKt.substringAfterLast(paramFile.getName(), '.', "");
  }
  
  @NotNull
  public static final File resolve(@NotNull File paramFile, @NotNull String paramString) {
    long l = d ^ 0x6A2C93C13422L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "relative");
    return FilesKt.resolve(paramFile, new File(paramString));
  }
  
  @NotNull
  public static final File relativeToOrSelf(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x1028F5FE14FL;
    Intrinsics.checkNotNullParameter(paramFile1, "<this>");
    Intrinsics.checkNotNullParameter(paramFile2, "base");
    String str1 = toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2);
    String str2 = str1;
    boolean bool = false;
    toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2);
    return (toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2) != null) ? new File(str2) : paramFile1;
  }
  
  @NotNull
  public static final File resolve(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x156ACC3ABE48L;
    try {
      Intrinsics.checkNotNullParameter(paramFile1, "<this>");
      Intrinsics.checkNotNullParameter(paramFile2, "relative");
      if (FilesKt.isRooted(paramFile2))
        return paramFile2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    Intrinsics.checkNotNullExpressionValue(paramFile1.toString(), "this.toString()");
    String str = paramFile1.toString();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (!((((CharSequence)str).length() == 0) ? 1 : 0)) {
        try {
          if (StringsKt.endsWith$default(str, File.separatorChar, false, 2, null));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        return new File(str + File.separatorChar + paramFile2);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
  @NotNull
  public static final File createTempDir(@NotNull String paramString1, @Nullable String paramString2, @Nullable File paramFile) {
    long l = d ^ 0x735674EC8190L;
    Intrinsics.checkNotNullParameter(paramString1, "prefix");
    File file = File.createTempFile(paramString1, paramString2, paramFile);
    try {
      file.delete();
      if (file.mkdir()) {
        Intrinsics.checkNotNullExpressionValue(file, "dir");
        return file;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    throw new IOException("Unable to create temporary directory " + file + '.');
  }
  
  @Nullable
  public static final File relativeToOrNull(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x2963EF3190B3L;
    Intrinsics.checkNotNullParameter(paramFile1, "<this>");
    Intrinsics.checkNotNullParameter(paramFile2, "base");
    if (toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2) != null) {
      String str1 = toRelativeStringOrNull$FilesKt__UtilsKt(paramFile1, paramFile2);
      String str2 = str1;
      boolean bool = false;
    } else {
      new File(str2);
    } 
    return null;
  }
  
  @NotNull
  public static final File relativeTo(@NotNull File paramFile1, @NotNull File paramFile2) {
    long l = d ^ 0x79A431B85EA5L;
    Intrinsics.checkNotNullParameter(paramFile1, "<this>");
    Intrinsics.checkNotNullParameter(paramFile2, "base");
    return new File(FilesKt.toRelativeString(paramFile1, paramFile2));
  }
  
  private static Throwable b(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__UtilsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */