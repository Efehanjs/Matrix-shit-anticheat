package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ReversedListReadOnly extends AbstractList {
  @NotNull
  private final List delegate;
  
  private static final long c = o3.a(6995381114548864693L, 1597514230201067599L, null).a(11118845041669L);
  
  public int getSize() {
    return this.delegate.size();
  }
  
  public Object get(int paramInt) {
    return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, paramInt));
  }
  
  public ReversedListReadOnly(@NotNull List paramList) {
    this.delegate = paramList;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ReversedListReadOnly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */