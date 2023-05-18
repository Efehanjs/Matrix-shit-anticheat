package me.rerere.matrix.internal;

public enum ca {
  v, b, i;
  
  static {
    b = new ca("Y", 1);
    v = new ca("Z", 2);
    k = new ca[] { i, b, v };
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */