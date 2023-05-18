package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FlatteningSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  @Nullable
  private Iterator itemIterator;
  
  private static final long a = o3.a(-606392863231347033L, 8546614488494670362L, null).a(170799160655150L);
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
  }
  
  public Object next() {
    try {
      if (!ensureItemIterator())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.itemIterator);
    return this.itemIterator.next();
  }
  
  public FlatteningSequence$iterator$1() {
    this.iterator = FlatteningSequence.access$getSequence$p(paramFlatteningSequence).iterator();
  }
  
  public final void setItemIterator(@Nullable Iterator paramIterator) {
    this.itemIterator = paramIterator;
  }
  
  @Nullable
  public final Iterator getItemIterator() {
    return this.itemIterator;
  }
  
  public void remove() {
    long l = a ^ 0x7C84D5DD074L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean hasNext() {
    return ensureItemIterator();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\FlatteningSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */