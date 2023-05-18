package me.rerere.matrix.thirdparty.kotlin.collections;

public final class RingBuffer$iterator$1 extends AbstractIterator {
  private int index;
  
  private int count;
  
  public RingBuffer$iterator$1() {
    this.count = paramRingBuffer.size();
    this.index = RingBuffer.access$getStartIndex$p(paramRingBuffer);
  }
  
  public void computeNext() {
    try {
      if (this.count == 0) {
        done();
      } else {
        setNext(RingBuffer.access$getBuffer$p(RingBuffer.this)[this.index]);
        RingBuffer ringBuffer = RingBuffer.this;
        int j = this.index;
        byte b = 1;
        boolean bool = false;
        this.index = (j + b) % RingBuffer.access$getCapacity$p(ringBuffer);
        int i = this.count;
        this.count = i + -1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\RingBuffer$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */