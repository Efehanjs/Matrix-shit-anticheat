package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin._Assertions;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class FileTreeWalk$DirectoryState extends FileTreeWalk$WalkState {
  private static final long a = o3.a(-900144638822429202L, -5072605411750807734L, null).a(230051977583119L);
  
  public FileTreeWalk$DirectoryState(@NotNull File paramFile) {
    super(paramFile);
    if (_Assertions.ENABLED) {
      boolean bool = paramFile.isDirectory();
      try {
        if (_Assertions.ENABLED && !bool) {
          boolean bool1 = false;
          String str = "rootDir must be verified to be directory beforehand.";
          throw new AssertionError(str);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk$DirectoryState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */