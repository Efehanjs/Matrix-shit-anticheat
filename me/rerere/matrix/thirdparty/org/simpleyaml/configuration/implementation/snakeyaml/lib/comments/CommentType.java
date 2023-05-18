package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum CommentType {
  IN_LINE, BLANK_LINE, BLOCK;
  
  static {
    IN_LINE = new CommentType("IN_LINE", 2);
    $VALUES = new CommentType[] { BLANK_LINE, BLOCK, IN_LINE };
  }
  
  static {
    long l = o3.a(-2693911747077903744L, 5442125163473876292L, MethodHandles.lookup().lookupClass()).a(163206192723296L) ^ 0x15209A439278L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\comments\CommentType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */