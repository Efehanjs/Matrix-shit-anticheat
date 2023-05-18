package me.rerere.matrix.thirdparty.okio.internal;

import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ResourceFileSystem$roots$2 extends Lambda implements Function0 {
  public ResourceFileSystem$roots$2(ClassLoader paramClassLoader) {
    super(0);
  }
  
  @NotNull
  public final List invoke() {
    return ResourceFileSystem.access$getCompanion$p().toClasspathRoots(this.$classLoader);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ResourceFileSystem$roots$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */