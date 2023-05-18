package me.rerere.matrix.thirdparty.com.google.gson;

import me.rerere.matrix.internal.o3;

public enum LongSerializationPolicy {
  STRING, DEFAULT;
  
  static {
    STRING = new LongSerializationPolicy$2("STRING", 1);
    $VALUES = new LongSerializationPolicy[] { DEFAULT, STRING };
  }
  
  public abstract JsonElement serialize(Long paramLong);
  
  static {
    long l = o3.a(6317199460269331465L, -9140856188239695053L, null).a(140641430983382L) ^ 0x785F2C25FD4L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\LongSerializationPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */