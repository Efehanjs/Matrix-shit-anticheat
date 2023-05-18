package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FileTreeWalk implements Sequence {
  @Nullable
  private final Function1 onEnter;
  
  @Nullable
  private final Function2 onFail;
  
  @NotNull
  private final FileWalkDirection direction;
  
  @Nullable
  private final Function1 onLeave;
  
  private final int maxDepth;
  
  @NotNull
  private final File start;
  
  private static final long a = o3.a(-2147295629867080157L, -7529694660812906166L, null).a(280690189817588L);
  
  public FileTreeWalk(@NotNull File paramFile, @NotNull FileWalkDirection paramFileWalkDirection) {
    this(paramFile, paramFileWalkDirection, null, null, null, 0, 32, null);
  }
  
  @NotNull
  public final FileTreeWalk onFail(@NotNull Function2 paramFunction2) {
    long l = a ^ 0x141BD8BA43CL;
    Intrinsics.checkNotNullParameter(paramFunction2, "function");
    return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, paramFunction2, this.maxDepth);
  }
  
  @NotNull
  public final FileTreeWalk onEnter(@NotNull Function1 paramFunction1) {
    long l = a ^ 0x59907EB7856EL;
    Intrinsics.checkNotNullParameter(paramFunction1, "function");
    return new FileTreeWalk(this.start, this.direction, paramFunction1, this.onLeave, this.onFail, this.maxDepth);
  }
  
  @NotNull
  public Iterator iterator() {
    return (Iterator)new FileTreeWalk$FileTreeWalkIterator(this);
  }
  
  @NotNull
  public final FileTreeWalk maxDepth(int paramInt) {
    long l = a ^ 0x16009B411449L;
    try {
      if (paramInt <= 0)
        throw new IllegalArgumentException("depth must be positive, but was " + paramInt + '.'); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, paramInt);
  }
  
  @NotNull
  public final FileTreeWalk onLeave(@NotNull Function1 paramFunction1) {
    long l = a ^ 0x7CC9981F9C11L;
    Intrinsics.checkNotNullParameter(paramFunction1, "function");
    return new FileTreeWalk(this.start, this.direction, this.onEnter, paramFunction1, this.onFail, this.maxDepth);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */