package me.rerere.matrix.thirdparty.kotlin.annotation;

import me.rerere.matrix.internal.o3;

public enum AnnotationRetention {
  BINARY, SOURCE, RUNTIME;
  
  static {
    BINARY = new AnnotationRetention("BINARY", 1);
    RUNTIME = new AnnotationRetention("RUNTIME", 2);
    $VALUES = $values();
  }
  
  static {
    long l = o3.a(-5906560894726945046L, 8841105140083984856L, null).a(132304412687542L) ^ 0x36537056C33BL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\annotation\AnnotationRetention.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */