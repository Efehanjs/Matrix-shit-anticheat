package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SynchronizedLazyImpl implements Lazy, Serializable {
  @Nullable
  private volatile Object _value;
  
  @NotNull
  private final Object lock;
  
  @Nullable
  private Function0 initializer;
  
  private static final long a = o3.a(-6588001989595610780L, -492337763992606582L, null).a(134488779388023L);
  
  public Object getValue() {
    Object object1 = this._value;
    try {
      if (object1 != UNINITIALIZED_VALUE.INSTANCE)
        return object1; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Object object2 = this.lock;
    synchronized (object2) {
      boolean bool = false;
      Object object4 = this._value;
      try {
        Intrinsics.checkNotNull(this.initializer);
        Object object = this.initializer.invoke();
        this._value = object;
        this.initializer = null;
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Object object3 = (object4 != UNINITIALIZED_VALUE.INSTANCE) ? object4 : object;
    } 
    return object3;
  }
  
  public SynchronizedLazyImpl(@NotNull Function0 paramFunction0, @Nullable Object paramObject) {
    this.initializer = paramFunction0;
    this._value = UNINITIALIZED_VALUE.INSTANCE;
    if (paramObject == null);
    ((SynchronizedLazyImpl)paramObject).lock = this;
  }
  
  public boolean isInitialized() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this._value != UNINITIALIZED_VALUE.INSTANCE);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x404C3F2A3AAAL;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\SynchronizedLazyImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */