package me.rerere.matrix.thirdparty.com.google.gson.internal;

import me.rerere.matrix.internal.o3;

public final class UnsafeAllocator$4 extends UnsafeAllocator {
  private static final long b = o3.a(7242635469253313126L, 5950830991332604763L, null).a(195874810676930L);
  
  public Object newInstance(Class paramClass) {
    long l = b ^ 0x7C83A853FEE6L;
    throw new UnsupportedOperationException("Cannot allocate " + paramClass);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\UnsafeAllocator$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */