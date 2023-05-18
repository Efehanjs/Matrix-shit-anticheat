package me.rerere.matrix.thirdparty.okio;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Options extends AbstractList implements RandomAccess {
  @NotNull
  public static final Options$Companion Companion = new Options$Companion(null);
  
  @NotNull
  private final int[] trie;
  
  @NotNull
  private final ByteString[] byteStrings;
  
  @NotNull
  public ByteString get(int paramInt) {
    return this.byteStrings[paramInt];
  }
  
  @NotNull
  public final ByteString[] getByteStrings$okio() {
    return this.byteStrings;
  }
  
  public int getSize() {
    return this.byteStrings.length;
  }
  
  @NotNull
  public final int[] getTrie$okio() {
    return this.trie;
  }
  
  @NotNull
  public static final Options of(@NotNull ByteString... paramVarArgs) {
    return Companion.of(paramVarArgs);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Options.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */