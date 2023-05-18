package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin._Assertions;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FileTreeWalk$FileTreeWalkIterator$SingleFileState extends FileTreeWalk$WalkState {
  private boolean visited;
  
  private static final long a = o3.a(5959579968990763710L, 3650010445386478135L, null).a(17361368806712L);
  
  @Nullable
  public File step() {
    try {
      if (this.visited)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.visited = true;
    return getRoot();
  }
  
  public FileTreeWalk$FileTreeWalkIterator$SingleFileState(File paramFile) {
    super(paramFile);
    if (_Assertions.ENABLED) {
      boolean bool = paramFile.isFile();
      try {
        if (_Assertions.ENABLED && !bool) {
          boolean bool1 = false;
          String str = "rootFile must be verified to be file beforehand.";
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk$FileTreeWalkIterator$SingleFileState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */