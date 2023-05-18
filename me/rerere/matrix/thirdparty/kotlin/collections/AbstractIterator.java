package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class AbstractIterator implements Iterator, KMappedMarker {
  @NotNull
  private State state = State.NotReady;
  
  @Nullable
  private Object nextValue;
  
  private static final long a = o3.a(6665682581211963579L, 8984411187509138403L, null).a(105280115217038L);
  
  public boolean hasNext() {
    long l = a ^ 0x7C607DA1319DL;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (this.state != State.Failed) ? true : false;
    if (!bool) {
      String str = "Failed requirement.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      switch (AbstractIterator$WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
        case 1:
        
        case 2:
        
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return tryToComputeNext();
  }
  
  public final void setNext(Object paramObject) {
    this.nextValue = paramObject;
    this.state = State.Ready;
  }
  
  public final void done() {
    this.state = State.Done;
  }
  
  public Object next() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.state = State.NotReady;
    return this.nextValue;
  }
  
  public void remove() {
    long l = a ^ 0x3D6170F3358CL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public abstract void computeNext();
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */