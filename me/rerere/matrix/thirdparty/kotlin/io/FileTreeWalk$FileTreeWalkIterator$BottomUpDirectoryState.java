package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState extends FileTreeWalk$DirectoryState {
  private boolean rootVisited;
  
  private int fileIndex;
  
  @Nullable
  private File[] fileList;
  
  private boolean failed;
  
  private static final long b = o3.a(4434074103862113303L, -8206407732936805510L, null).a(135249021361889L);
  
  @Nullable
  public File step() {
    long l = b ^ 0x708E439C5DBL;
    try {
      if (!this.failed)
        try {
          if (this.fileList == null) {
            try {
              if (FileTreeWalk.access$getOnEnter$p(this.this$0.this$0) != null) {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw b(null);
                } 
              } else {
                !((Boolean)FileTreeWalk.access$getOnEnter$p(this.this$0.this$0).invoke(getRoot())).booleanValue() ? 1 : 0;
              } 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            try {
              if (false)
                return null; 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            try {
              this.fileList = getRoot().listFiles();
              if (this.fileList == null) {
                try {
                  if (FileTreeWalk.access$getOnFail$p(this.this$0.this$0) != null) {
                    FileTreeWalk.access$getOnFail$p(this.this$0.this$0).invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                  } else {
                    FileTreeWalk.access$getOnFail$p(this.this$0.this$0);
                  } 
                } catch (RuntimeException runtimeException) {
                  throw b(null);
                } 
                this.failed = true;
              } 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      Intrinsics.checkNotNull(this.fileList);
      if (this.fileList != null && this.fileIndex < this.fileList.length) {
        Intrinsics.checkNotNull(this.fileList);
        int i = this.fileIndex;
        this.fileIndex = i + 1;
        return this.fileList[i];
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!this.rootVisited) {
        this.rootVisited = true;
        return getRoot();
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (FileTreeWalk.access$getOnLeave$p(this.this$0.this$0) != null) {
        FileTreeWalk.access$getOnLeave$p(this.this$0.this$0).invoke(getRoot());
      } else {
        FileTreeWalk.access$getOnLeave$p(this.this$0.this$0);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return null;
  }
  
  public FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState(File paramFile) {
    super(paramFile);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */