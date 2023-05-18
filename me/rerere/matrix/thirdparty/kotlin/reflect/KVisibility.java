package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
public enum KVisibility {
  PRIVATE, PROTECTED, INTERNAL, PUBLIC;
  
  static {
    PROTECTED = new KVisibility("PROTECTED", 1);
    INTERNAL = new KVisibility("INTERNAL", 2);
    PRIVATE = new KVisibility("PRIVATE", 3);
    $VALUES = $values();
  }
  
  static {
    long l = o3.a(8869216139287437928L, -6552638150215954994L, null).a(46403903963945L) ^ 0x4EAB53379548L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KVisibility.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */