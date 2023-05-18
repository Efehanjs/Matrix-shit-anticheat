package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class FileTreeWalk$WalkState {
  @NotNull
  private final File root;
  
  private static final long c = o3.a(3112409592310386315L, 1458984859834555243L, null).a(214164168819811L);
  
  public FileTreeWalk$WalkState(@NotNull File paramFile) {
    this.root = paramFile;
  }
  
  @NotNull
  public final File getRoot() {
    return this.root;
  }
  
  @Nullable
  public abstract File step();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk$WalkState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */