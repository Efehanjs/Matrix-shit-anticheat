package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MovingSubList extends AbstractList implements RandomAccess {
  private int fromIndex;
  
  private int _size;
  
  @NotNull
  private final List list;
  
  private static final long c = o3.a(5925167041466179006L, -1508235031752038202L, null).a(279659069312429L);
  
  public MovingSubList(@NotNull List paramList) {
    this.list = paramList;
  }
  
  public int getSize() {
    return this._size;
  }
  
  public final void move(int paramInt1, int paramInt2) {
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, this.list.size());
    this.fromIndex = paramInt1;
    this._size = paramInt2 - paramInt1;
  }
  
  public Object get(int paramInt) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, this._size);
    return this.list.get(this.fromIndex + paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MovingSubList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */