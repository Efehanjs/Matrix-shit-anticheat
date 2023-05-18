package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.thirdparty.kotlin.Function;

public interface KFunction extends KCallable, Function {
  boolean isInline();
  
  boolean isInfix();
  
  boolean isOperator();
  
  boolean isExternal();
  
  boolean isSuspend();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */