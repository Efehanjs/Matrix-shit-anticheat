package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class EmptyIterator implements ListIterator, KMappedMarker {
  @NotNull
  public static final EmptyIterator INSTANCE;
  
  private static final long a = o3.a(7439787726667680421L, 1022544217758208712L, null).a(271440231168273L);
  
  public boolean hasPrevious() {
    return false;
  }
  
  public void add(Void paramVoid) {
    long l = a ^ 0x6D29C71B7EE6L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void remove() {
    long l = a ^ 0x37739BD4849L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int nextIndex() {
    return 0;
  }
  
  public int previousIndex() {
    return -1;
  }
  
  public void set(Void paramVoid) {
    long l = a ^ 0x55791B3B5265L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Void previous() {
    throw new NoSuchElementException();
  }
  
  @NotNull
  public Void next() {
    throw new NoSuchElementException();
  }
  
  static {
    INSTANCE = new EmptyIterator();
  }
  
  public boolean hasNext() {
    return false;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\EmptyIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */