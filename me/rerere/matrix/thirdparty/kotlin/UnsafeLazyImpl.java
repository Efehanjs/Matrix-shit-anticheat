package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class UnsafeLazyImpl implements Lazy, Serializable {
  @Nullable
  private Object _value;
  
  @Nullable
  private Function0 initializer;
  
  private static final long a = o3.a(2456578739946110266L, -5356129533508602924L, null).a(155251823443346L);
  
  public UnsafeLazyImpl(@NotNull Function0 paramFunction0) {
    this.initializer = paramFunction0;
    this._value = UNINITIALIZED_VALUE.INSTANCE;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x4CDA20A6CFEL;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
  }
  
  public Object getValue() {
    try {
      if (this._value == UNINITIALIZED_VALUE.INSTANCE) {
        Intrinsics.checkNotNull(this.initializer);
        this._value = this.initializer.invoke();
        this.initializer = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this._value;
  }
  
  public boolean isInitialized() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this._value != UNINITIALIZED_VALUE.INSTANCE);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UnsafeLazyImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */