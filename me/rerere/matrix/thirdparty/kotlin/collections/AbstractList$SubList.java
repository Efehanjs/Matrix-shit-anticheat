package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AbstractList$SubList extends AbstractList implements RandomAccess {
  private final int fromIndex;
  
  @NotNull
  private final AbstractList list;
  
  private int _size;
  
  private static final long c = o3.a(4342072030329861695L, 8908196101469770196L, null).a(252125660260576L);
  
  public AbstractList$SubList(@NotNull AbstractList paramAbstractList, int paramInt1, int paramInt2) {
    this.list = paramAbstractList;
    this.fromIndex = paramInt1;
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(this.fromIndex, paramInt2, this.list.size());
    this._size = paramInt2 - this.fromIndex;
  }
  
  public int getSize() {
    return this._size;
  }
  
  public Object get(int paramInt) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, this._size);
    return this.list.get(this.fromIndex + paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractList$SubList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */