package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class FileSystemException extends IOException {
  @Nullable
  private final String reason;
  
  @Nullable
  private final File other;
  
  @NotNull
  private final File file;
  
  private static final long b = o3.a(-5642432427520789348L, -2044804058503652447L, null).a(259681167608844L);
  
  @NotNull
  public final File getFile() {
    return this.file;
  }
  
  public FileSystemException(@NotNull File paramFile1, @Nullable File paramFile2, @Nullable String paramString) {
    super(ExceptionsKt.access$constructMessage(paramFile1, paramFile2, paramString));
    this.file = paramFile1;
    this.other = paramFile2;
    this.reason = paramString;
  }
  
  @Nullable
  public final File getOther() {
    return this.other;
  }
  
  @Nullable
  public final String getReason() {
    return this.reason;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileSystemException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */