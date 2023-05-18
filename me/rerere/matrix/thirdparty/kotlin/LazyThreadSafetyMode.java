package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;

public enum LazyThreadSafetyMode {
  NONE, PUBLICATION, SYNCHRONIZED;
  
  static {
    PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
    NONE = new LazyThreadSafetyMode("NONE", 2);
    $VALUES = $values();
  }
  
  static {
    long l = o3.a(-1398956048581983591L, -8491940638387648973L, null).a(60337206573667L) ^ 0x34400F9E6E0AL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\LazyThreadSafetyMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */