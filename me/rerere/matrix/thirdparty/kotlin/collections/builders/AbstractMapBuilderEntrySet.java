package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractMutableSet;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class AbstractMapBuilderEntrySet extends AbstractMutableSet {
  private static final long a = o3.a(-2434800873562112237L, 3612902153643864480L, null).a(165322646257434L);
  
  public final boolean contains(@NotNull Map.Entry paramEntry) {
    long l = a ^ 0x4777D0B5F226L;
    Intrinsics.checkNotNullParameter(paramEntry, "element");
    return containsEntry(paramEntry);
  }
  
  public abstract boolean containsEntry(@NotNull Map.Entry paramEntry);
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\AbstractMapBuilderEntrySet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */