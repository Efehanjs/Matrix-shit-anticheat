package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;

public final class CollectionsKt___CollectionsKt$elementAt$1 extends Lambda implements Function1 {
  private static final long a = o3.a(-6475404261692310375L, -8316421302790008832L, null).a(35589024145807L);
  
  public CollectionsKt___CollectionsKt$elementAt$1(int paramInt) {
    super(1);
  }
  
  public final Object invoke(int paramInt) {
    long l = a ^ 0x4A9DFFC99CF2L;
    throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.$index + '.');
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionsKt___CollectionsKt$elementAt$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */