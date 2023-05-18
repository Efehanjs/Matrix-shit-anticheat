package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import me.rerere.matrix.thirdparty.kotlin.NoWhenBranchMatchedException;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractIterator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FileTreeWalk$FileTreeWalkIterator extends AbstractIterator {
  @NotNull
  private final ArrayDeque state = new ArrayDeque();
  
  public FileTreeWalk$FileTreeWalkIterator() {
    if (FileTreeWalk.access$getStart$p(FileTreeWalk.this).isDirectory()) {
      this.state.push(directoryState(FileTreeWalk.access$getStart$p(FileTreeWalk.this)));
    } else {
      try {
        if (FileTreeWalk.access$getStart$p(FileTreeWalk.this).isFile()) {
          this.state.push(new FileTreeWalk$FileTreeWalkIterator$SingleFileState(this, FileTreeWalk.access$getStart$p(FileTreeWalk.this)));
        } else {
          done();
        } 
      } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
        throw a(null);
      } 
    } 
  }
  
  public void computeNext() {
    File file = gotoNext();
    try {
      if (file != null) {
        setNext(file);
      } else {
        done();
      } 
    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
      throw a(null);
    } 
  }
  
  private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException paramNoWhenBranchMatchedException) {
    return paramNoWhenBranchMatchedException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk$FileTreeWalkIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */