package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SafePublicationLazyImpl implements Lazy, Serializable {
  @NotNull
  public static final SafePublicationLazyImpl$Companion Companion;
  
  @NotNull
  private final Object final;
  
  private static final AtomicReferenceFieldUpdater valueUpdater;
  
  @Nullable
  private volatile Object _value;
  
  @Nullable
  private volatile Function0 initializer;
  
  private static final long a = o3.a(6742785006493825160L, -8244301353892058138L, null).a(160022238590394L);
  
  public boolean isInitialized() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this._value != UNINITIALIZED_VALUE.INSTANCE);
  }
  
  public Object getValue() {
    Object object = this._value;
    try {
      if (object != UNINITIALIZED_VALUE.INSTANCE)
        return object; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Function0 function0 = this.initializer;
    if (function0 != null) {
      Object object1 = function0.invoke();
      try {
        if (valueUpdater.compareAndSet(this, UNINITIALIZED_VALUE.INSTANCE, object1)) {
          this.initializer = null;
          return object1;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return this._value;
  }
  
  static {
    long l = a ^ 0x58DEE4BB55CL;
    Companion = new SafePublicationLazyImpl$Companion(null);
    valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x7BFBB613B597L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
  }
  
  public SafePublicationLazyImpl(@NotNull Function0 paramFunction0) {
    this.initializer = paramFunction0;
    this._value = UNINITIALIZED_VALUE.INSTANCE;
    this.final = UNINITIALIZED_VALUE.INSTANCE;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\SafePublicationLazyImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */