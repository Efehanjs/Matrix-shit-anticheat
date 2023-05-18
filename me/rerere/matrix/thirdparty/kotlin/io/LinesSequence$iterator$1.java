package me.rerere.matrix.thirdparty.kotlin.io;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class LinesSequence$iterator$1 implements Iterator, KMappedMarker {
  private boolean done;
  
  @Nullable
  private String nextValue;
  
  private static final long a = o3.a(46973614587687027L, -6148695661120708998L, null).a(140054391091484L);
  
  public boolean hasNext() {
    try {
      if (this.nextValue == null)
        try {
          if (!this.done)
            try {
              this.nextValue = LinesSequence.access$getReader$p(LinesSequence.this).readLine();
              if (this.nextValue == null)
                this.done = true; 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            }  
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.nextValue != null);
  }
  
  @NotNull
  public String next() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    String str = this.nextValue;
    this.nextValue = null;
    Intrinsics.checkNotNull(str);
    return str;
  }
  
  public void remove() {
    long l = a ^ 0x237F47EEBA8L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\LinesSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */