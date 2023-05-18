package me.rerere.matrix.thirdparty.okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FileSystem$Companion$SystemFileSystem implements FileSystem {
  private static final long a = o3.a(663002380948602223L, -8631741559710912928L, MethodHandles.lookup().lookupClass()).a(45345565475620L);
  
  public void deleteContents(@NotNull File paramFile) throws IOException {
    File[] arrayOfFile;
    long l = a ^ 0x15BE612B5B24L;
    try {
      Intrinsics.checkNotNullParameter(paramFile, "directory");
      if (paramFile.listFiles() == null) {
        paramFile.listFiles();
        throw new IOException(Intrinsics.stringPlus("not a readable directory: ", paramFile));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = 0;
    int i = arrayOfFile.length;
    while (b < i) {
      File file = arrayOfFile[b];
      try {
        b++;
        if (file.isDirectory()) {
          Intrinsics.checkNotNullExpressionValue(file, "file");
          deleteContents(file);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      if (!file.delete())
        throw new IOException(Intrinsics.stringPlus("failed to delete ", file)); 
    } 
  }
  
  @NotNull
  public Sink sink(@NotNull File paramFile) throws FileNotFoundException {
    Sink sink;
    long l = a ^ 0x2F012811F017L;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    try {
      sink = Okio.sink$default(paramFile, false, 1, null);
    } catch (FileNotFoundException fileNotFoundException) {
      paramFile.getParentFile().mkdirs();
      sink = Okio.sink$default(paramFile, false, 1, null);
    } 
    return sink;
  }
  
  @NotNull
  public Source source(@NotNull File paramFile) throws FileNotFoundException {
    long l = a ^ 0x56B394F42083L;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return Okio.source(paramFile);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x5ACE3FC32E5FL;
    return "FileSystem.SYSTEM";
  }
  
  @NotNull
  public Sink appendingSink(@NotNull File paramFile) throws FileNotFoundException {
    Sink sink;
    long l = a ^ 0xE4DA2399E83L;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    try {
      sink = Okio.appendingSink(paramFile);
    } catch (FileNotFoundException fileNotFoundException) {
      paramFile.getParentFile().mkdirs();
      sink = Okio.appendingSink(paramFile);
    } 
    return sink;
  }
  
  public boolean exists(@NotNull File paramFile) {
    long l = a ^ 0x387469002615L;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return paramFile.exists();
  }
  
  public long size(@NotNull File paramFile) {
    long l = a ^ 0x5EE429771286L;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return paramFile.length();
  }
  
  public void delete(@NotNull File paramFile) throws IOException {
    long l = a ^ 0x4CED0312ECF7L;
    try {
      Intrinsics.checkNotNullParameter(paramFile, "file");
      if (!paramFile.delete())
        try {
          if (paramFile.exists())
            throw new IOException(Intrinsics.stringPlus("failed to delete ", paramFile)); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void rename(@NotNull File paramFile1, @NotNull File paramFile2) throws IOException {
    long l = a ^ 0x84E1CBCD59BL;
    try {
      Intrinsics.checkNotNullParameter(paramFile1, "from");
      Intrinsics.checkNotNullParameter(paramFile2, "to");
      delete(paramFile2);
      if (!paramFile1.renameTo(paramFile2))
        throw new IOException("failed to rename " + paramFile1 + " to " + paramFile2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\io\FileSystem$Companion$SystemFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */