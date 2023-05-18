package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public interface CoroutineStackFrame {
  @Nullable
  StackTraceElement getStackTraceElement();
  
  @Nullable
  CoroutineStackFrame getCallerFrame();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\CoroutineStackFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */