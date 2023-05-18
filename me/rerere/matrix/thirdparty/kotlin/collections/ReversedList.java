package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ReversedList extends AbstractMutableList {
  @NotNull
  private final List delegate;
  
  private static final long a = o3.a(8800744109316373902L, 6899084392429521750L, null).a(86165577866943L);
  
  public int getSize() {
    return this.delegate.size();
  }
  
  public void add(int paramInt, Object paramObject) {
    this.delegate.add(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(this, paramInt), paramObject);
  }
  
  public void clear() {
    this.delegate.clear();
  }
  
  public Object set(int paramInt, Object paramObject) {
    return this.delegate.set(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, paramInt), paramObject);
  }
  
  public Object get(int paramInt) {
    return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, paramInt));
  }
  
  public ReversedList(@NotNull List paramList) {
    this.delegate = paramList;
  }
  
  public Object removeAt(int paramInt) {
    return this.delegate.remove(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, paramInt));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ReversedList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */