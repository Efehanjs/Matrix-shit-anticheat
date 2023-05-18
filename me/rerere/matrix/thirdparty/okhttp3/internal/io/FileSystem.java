package me.rerere.matrix.thirdparty.okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface FileSystem {
  @JvmField
  @NotNull
  public static final FileSystem SYSTEM;
  
  @NotNull
  public static final FileSystem$Companion Companion = FileSystem$Companion.$$INSTANCE;
  
  long size(@NotNull File paramFile);
  
  @NotNull
  Source source(@NotNull File paramFile) throws FileNotFoundException;
  
  static {
    SYSTEM = new FileSystem$Companion$SystemFileSystem();
  }
  
  void deleteContents(@NotNull File paramFile) throws IOException;
  
  void rename(@NotNull File paramFile1, @NotNull File paramFile2) throws IOException;
  
  void delete(@NotNull File paramFile) throws IOException;
  
  boolean exists(@NotNull File paramFile);
  
  @NotNull
  Sink appendingSink(@NotNull File paramFile) throws FileNotFoundException;
  
  @NotNull
  Sink sink(@NotNull File paramFile) throws FileNotFoundException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\io\FileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */