package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class InitializedLazyImpl implements Lazy, Serializable {
  private final Object value;
  
  @NotNull
  public String toString() {
    return String.valueOf(getValue());
  }
  
  public boolean isInitialized() {
    return true;
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public InitializedLazyImpl(Object paramObject) {
    this.value = paramObject;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\InitializedLazyImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */