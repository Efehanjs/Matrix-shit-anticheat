package me.rerere.matrix.thirdparty.okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class JvmSystemFileSystem extends FileSystem {
  private static final long b = o3.a(-4141656781402323980L, 4520789031212354164L, MethodHandles.lookup().lookupClass()).a(152866933346737L);
  
  public void createSymlink(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = b ^ 0x1BF02DEEC88L;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    throw new IOException("unsupported");
  }
  
  @NotNull
  public Sink sink(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x34FDC8628815L;
    try {
      Intrinsics.checkNotNullParameter(paramPath, "file");
      if (paramBoolean)
        requireCreate(paramPath); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Okio.sink$default(paramPath.toFile(), false, 1, null);
  }
  
  public void delete(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x310A93D64593L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    File file = paramPath.toFile();
    boolean bool = file.delete();
    try {
      if (!bool) {
        try {
          if (file.exists())
            throw new IOException(Intrinsics.stringPlus("failed to delete ", paramPath)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramBoolean)
            throw new FileNotFoundException(Intrinsics.stringPlus("no such file: ", paramPath)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @Nullable
  public List listOrNull(@NotNull Path paramPath) {
    long l = b ^ 0x181F759394B0L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    return list(paramPath, false);
  }
  
  @NotNull
  public FileHandle openReadOnly(@NotNull Path paramPath) {
    long l = b ^ 0x618DA32A34FBL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    return new JvmFileHandle(false, new RandomAccessFile(paramPath.toFile(), "r"));
  }
  
  @NotNull
  public FileHandle openReadWrite(@NotNull Path paramPath, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/JvmSystemFileSystem.b : J
    //   3: ldc2_w 68513665268657
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'file'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: iload_2
    //   16: ifeq -> 30
    //   19: iload_3
    //   20: ifne -> 38
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: iconst_1
    //   31: goto -> 39
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: iconst_0
    //   39: istore #6
    //   41: iconst_0
    //   42: istore #7
    //   44: iconst_0
    //   45: istore #8
    //   47: iload #6
    //   49: ifne -> 75
    //   52: iconst_0
    //   53: istore #9
    //   55: ldc 'Cannot require mustCreate and mustExist at the same time.'
    //   57: astore #8
    //   59: new java/lang/IllegalArgumentException
    //   62: dup
    //   63: aload #8
    //   65: invokevirtual toString : ()Ljava/lang/String;
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: checkcast java/lang/Throwable
    //   74: athrow
    //   75: iload_2
    //   76: ifeq -> 91
    //   79: aload_0
    //   80: aload_1
    //   81: invokespecial requireCreate : (Lme/rerere/matrix/thirdparty/okio/Path;)V
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: iload_3
    //   92: ifeq -> 107
    //   95: aload_0
    //   96: aload_1
    //   97: invokespecial requireExist : (Lme/rerere/matrix/thirdparty/okio/Path;)V
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   106: athrow
    //   107: new me/rerere/matrix/thirdparty/okio/JvmFileHandle
    //   110: dup
    //   111: iconst_1
    //   112: new java/io/RandomAccessFile
    //   115: dup
    //   116: aload_1
    //   117: invokevirtual toFile : ()Ljava/io/File;
    //   120: ldc 'rw'
    //   122: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   125: invokespecial <init> : (ZLjava/io/RandomAccessFile;)V
    //   128: checkcast me/rerere/matrix/thirdparty/okio/FileHandle
    //   131: areturn
    // Exception table:
    //   from	to	target	type
    //   9	23	26	java/lang/IllegalArgumentException
    //   19	34	34	java/lang/IllegalArgumentException
    //   75	84	87	java/lang/IllegalArgumentException
    //   91	100	103	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public Path canonicalize(@NotNull Path paramPath) {
    long l = b ^ 0x57B2B37FF63L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    File file = paramPath.toFile().getCanonicalFile();
    try {
      if (!file.exists())
        throw new FileNotFoundException("no such file"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(file, "canonicalFile");
    return Path$Companion.get$default(Path.Companion, file, false, 1, (Object)null);
  }
  
  public void atomicMove(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = b ^ 0x2A518FF6E404L;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    boolean bool = paramPath1.toFile().renameTo(paramPath2.toFile());
    try {
      if (!bool)
        throw new IOException("failed to move " + paramPath1 + " to " + paramPath2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x2BED068CFF23L;
    return "JvmSystemFileSystem";
  }
  
  public void createDirectory(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x6C71AF031D79L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    if (!paramPath.toFile().mkdir()) {
      FileMetadata fileMetadata = metadataOrNull(paramPath);
      try {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      boolean bool = (fileMetadata == null) ? false : ((fileMetadata.isDirectory() == true) ? true : false);
      try {
        if (bool) {
          try {
            if (paramBoolean)
              throw new IOException(paramPath + " already exist."); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      throw new IOException(Intrinsics.stringPlus("failed to create directory: ", paramPath));
    } 
  }
  
  @NotNull
  public Source source(@NotNull Path paramPath) {
    long l = b ^ 0x10693AC1703CL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    return Okio.source(paramPath.toFile());
  }
  
  @Nullable
  public FileMetadata metadataOrNull(@NotNull Path paramPath) {
    long l1 = b ^ 0x539C76D61B87L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    File file = paramPath.toFile();
    boolean bool1 = file.isFile();
    boolean bool2 = file.isDirectory();
    long l2 = file.lastModified();
    long l3 = file.length();
    try {
      if (!bool1)
        try {
          if (!bool2)
            try {
              if (l2 == 0L)
                try {
                  if (l3 == 0L)
                    try {
                      if (!file.exists())
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
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new FileMetadata(bool1, bool2, null, Long.valueOf(l3), null, Long.valueOf(l2), null, null, 128, null);
  }
  
  @NotNull
  public List list(@NotNull Path paramPath) {
    long l = b ^ 0x2A2738D687E5L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    Intrinsics.checkNotNull(list(paramPath, true));
    return list(paramPath, true);
  }
  
  @NotNull
  public Sink appendingSink(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x6BAE23231E58L;
    try {
      Intrinsics.checkNotNullParameter(paramPath, "file");
      if (paramBoolean)
        requireExist(paramPath); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Okio.sink(paramPath.toFile(), true);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\JvmSystemFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */