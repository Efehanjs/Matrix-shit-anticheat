package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.okio.internal.ResourceFileSystem;
import me.rerere.matrix.thirdparty.okio.internal._FileSystemKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class FileSystem {
  @JvmField
  @NotNull
  public static final FileSystem SYSTEM;
  
  @JvmField
  @NotNull
  public static final FileSystem RESOURCES;
  
  @JvmField
  @NotNull
  public static final Path SYSTEM_TEMPORARY_DIRECTORY;
  
  @NotNull
  public static final FileSystem$Companion Companion;
  
  private static final long a = o3.a(8222928923377156896L, -2323922903637382352L, MethodHandles.lookup().lookupClass()).a(135122100498739L);
  
  public abstract void atomicMove(@NotNull Path paramPath1, @NotNull Path paramPath2) throws IOException;
  
  @NotNull
  public final Sequence listRecursively(@NotNull Path paramPath) {
    long l = a ^ 0x743EFED8F743L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    return listRecursively(paramPath, false);
  }
  
  public final void delete(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x691A1E7AECA2L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    delete(paramPath, false);
  }
  
  @NotNull
  public abstract Path canonicalize(@NotNull Path paramPath) throws IOException;
  
  public final void deleteRecursively(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x134F02845670L;
    Intrinsics.checkNotNullParameter(paramPath, "fileOrDirectory");
    deleteRecursively(paramPath, false);
  }
  
  public abstract void delete(@NotNull Path paramPath, boolean paramBoolean) throws IOException;
  
  public final void createDirectory(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x409E2BCC9D52L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    createDirectory(paramPath, false);
  }
  
  public abstract void createSymlink(@NotNull Path paramPath1, @NotNull Path paramPath2) throws IOException;
  
  public final void createDirectories(@NotNull Path paramPath, boolean paramBoolean) throws IOException {
    long l = a ^ 0x660050440CBEL;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    _FileSystemKt.commonCreateDirectories(this, paramPath, paramBoolean);
  }
  
  @NotNull
  public final FileHandle openReadWrite(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x4A0A6B2796CAL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    return openReadWrite(paramPath, false, false);
  }
  
  public final Object -read(@NotNull Path paramPath, @NotNull Function1 paramFunction1) throws IOException {
    long l = a ^ 0x658A743E1FABL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    Intrinsics.checkNotNullParameter(paramFunction1, "readerAction");
    boolean bool1 = false;
    BufferedSource bufferedSource = Okio.buffer(source(paramPath));
    boolean bool2 = false;
    Object object = null;
    Throwable throwable = null;
    try {
      BufferedSource bufferedSource1 = bufferedSource;
      boolean bool = false;
      object = paramFunction1.invoke(bufferedSource1);
    } catch (Throwable throwable1) {
      throwable = throwable1;
    } 
    try {
      BufferedSource bufferedSource1 = bufferedSource;
      try {
        if (bufferedSource1 != null)
          bufferedSource1.close(); 
      } catch (Throwable throwable1) {
        throw b(null);
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
      throw b(null);
    } 
    Intrinsics.checkNotNull(object);
    return object;
  }
  
  public final void createDirectories(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x314CAE7ADA82L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    createDirectories(paramPath, false);
  }
  
  static {
    long l = a ^ 0x792EC1385D02L;
    Companion = new FileSystem$Companion(null);
    FileSystem$Companion fileSystem$Companion1 = Companion;
    boolean bool1 = false;
    boolean bool2 = false;
    FileSystem$Companion fileSystem$Companion2 = fileSystem$Companion1;
    boolean bool3 = false;
    try {
      Class.forName("java.nio.file.Files");
    } catch (ClassNotFoundException classNotFoundException) {}
    SYSTEM = new JvmSystemFileSystem();
    String str = System.getProperty("java.io.tmpdir");
    Intrinsics.checkNotNullExpressionValue(str, "getProperty(\"java.io.tmpdir\")");
    SYSTEM_TEMPORARY_DIRECTORY = Path$Companion.get$default(Path.Companion, str, false, 1, (Object)null);
    ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
    Intrinsics.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
    RESOURCES = (FileSystem)new ResourceFileSystem(classLoader, false);
  }
  
  @Nullable
  public abstract FileMetadata metadataOrNull(@NotNull Path paramPath) throws IOException;
  
  public final boolean exists(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x5D1B1B26B697L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    return _FileSystemKt.commonExists(this, paramPath);
  }
  
  public abstract void createDirectory(@NotNull Path paramPath, boolean paramBoolean) throws IOException;
  
  @NotNull
  public abstract FileHandle openReadOnly(@NotNull Path paramPath) throws IOException;
  
  @NotNull
  public abstract List list(@NotNull Path paramPath) throws IOException;
  
  public void deleteRecursively(@NotNull Path paramPath, boolean paramBoolean) throws IOException {
    long l = a ^ 0x2DAC1243F08L;
    Intrinsics.checkNotNullParameter(paramPath, "fileOrDirectory");
    _FileSystemKt.commonDeleteRecursively(this, paramPath, paramBoolean);
  }
  
  @NotNull
  public final FileMetadata metadata(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x18DDC24F88BCL;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    return _FileSystemKt.commonMetadata(this, paramPath);
  }
  
  @NotNull
  public abstract Source source(@NotNull Path paramPath) throws IOException;
  
  @Nullable
  public abstract List listOrNull(@NotNull Path paramPath);
  
  public void copy(@NotNull Path paramPath1, @NotNull Path paramPath2) throws IOException {
    long l = a ^ 0x5B933ACFE71BL;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    _FileSystemKt.commonCopy(this, paramPath1, paramPath2);
  }
  
  public final Object -write(@NotNull Path paramPath, boolean paramBoolean, @NotNull Function1 paramFunction1) throws IOException {
    long l = a ^ 0xEA48758C795L;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    Intrinsics.checkNotNullParameter(paramFunction1, "writerAction");
    boolean bool1 = false;
    BufferedSink bufferedSink = Okio.buffer(sink(paramPath, paramBoolean));
    boolean bool2 = false;
    Object object = null;
    Throwable throwable = null;
    try {
      BufferedSink bufferedSink1 = bufferedSink;
      boolean bool = false;
      object = paramFunction1.invoke(bufferedSink1);
    } catch (Throwable throwable1) {
      throwable = throwable1;
    } 
    try {
      BufferedSink bufferedSink1 = bufferedSink;
      try {
        if (bufferedSink1 != null)
          bufferedSink1.close(); 
      } catch (Throwable throwable1) {
        throw b(null);
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
      throw b(null);
    } 
    Intrinsics.checkNotNull(object);
    return object;
  }
  
  @NotNull
  public abstract FileHandle openReadWrite(@NotNull Path paramPath, boolean paramBoolean1, boolean paramBoolean2) throws IOException;
  
  @NotNull
  public final Sink appendingSink(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0xC5F0AC270CCL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    return appendingSink(paramPath, false);
  }
  
  @NotNull
  public final Sink sink(@NotNull Path paramPath) throws IOException {
    long l = a ^ 0x3B94C26C79FAL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    return sink(paramPath, false);
  }
  
  @NotNull
  public Sequence listRecursively(@NotNull Path paramPath, boolean paramBoolean) {
    long l = a ^ 0x3B4597C869E1L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    return _FileSystemKt.commonListRecursively(this, paramPath, paramBoolean);
  }
  
  @NotNull
  public abstract Sink appendingSink(@NotNull Path paramPath, boolean paramBoolean) throws IOException;
  
  @NotNull
  public abstract Sink sink(@NotNull Path paramPath, boolean paramBoolean) throws IOException;
  
  private static Throwable b(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\FileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */