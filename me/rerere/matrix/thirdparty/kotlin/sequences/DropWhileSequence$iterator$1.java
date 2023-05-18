package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DropWhileSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  @Nullable
  private Object nextItem;
  
  private int dropState;
  
  private static final long a = o3.a(2936059424278968518L, 6816104289088719390L, null).a(18933848372407L);
  
  public DropWhileSequence$iterator$1() {
    this.iterator = DropWhileSequence.access$getSequence$p(paramDropWhileSequence).iterator();
    this.dropState = -1;
  }
  
  public Object next() {
    try {
      if (this.dropState == -1)
        drop(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    if (this.dropState == 1) {
      Object object = this.nextItem;
      this.nextItem = null;
      this.dropState = 0;
      return object;
    } 
    return this.iterator.next();
  }
  
  public void remove() {
    long l = a ^ 0x3DECF3F2717AL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public boolean hasNext() {
    try {
      if (this.dropState == -1)
        drop(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.dropState != 1) {
        try {
          if (this.iterator.hasNext());
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  @Nullable
  public final Object getNextItem() {
    return this.nextItem;
  }
  
  public final int getDropState() {
    return this.dropState;
  }
  
  public final void setDropState(int paramInt) {
    this.dropState = paramInt;
  }
  
  public final void setNextItem(@Nullable Object paramObject) {
    this.nextItem = paramObject;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\DropWhileSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */