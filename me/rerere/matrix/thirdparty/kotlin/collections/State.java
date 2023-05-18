package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.internal.o3;

public enum State {
  Done, Failed, NotReady, Ready;
  
  static {
    NotReady = new State("NotReady", 1);
    Done = new State("Done", 2);
    Failed = new State("Failed", 3);
    $VALUES = $values();
  }
  
  static {
    long l = o3.a(1948629073268777075L, -4314808675733306634L, null).a(133666197586566L) ^ 0x6A808B43F143L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */