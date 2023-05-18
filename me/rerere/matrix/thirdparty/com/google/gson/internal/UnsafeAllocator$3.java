package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Method;

public final class UnsafeAllocator$3 extends UnsafeAllocator {
  public Object newInstance(Class paramClass) throws Exception {
    assertInstantiable(paramClass);
    return newInstance.invoke(null, new Object[] { paramClass, Object.class });
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\UnsafeAllocator$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */