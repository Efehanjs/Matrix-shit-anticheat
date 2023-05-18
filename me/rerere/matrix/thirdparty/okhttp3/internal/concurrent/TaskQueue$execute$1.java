package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;

public final class TaskQueue$execute$1 extends Task {
  public long runOnce() {
    this.$block.invoke();
    return -1L;
  }
  
  public TaskQueue$execute$1(String paramString, boolean paramBoolean, Function0 paramFunction0) {
    super(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskQueue$execute$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */