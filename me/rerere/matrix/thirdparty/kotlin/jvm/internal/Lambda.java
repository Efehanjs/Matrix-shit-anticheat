package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class Lambda implements FunctionBase, Serializable {
  private final int arity;
  
  private static final long c = o3.a(-3008971308777235154L, 4471720360261414792L, null).a(90329268768010L);
  
  @NotNull
  public String toString() {
    long l = c ^ 0x13B2B8C494F0L;
    Intrinsics.checkNotNullExpressionValue(Reflection.renderLambdaToString(this), "renderLambdaToString(this)");
    return Reflection.renderLambdaToString(this);
  }
  
  public int getArity() {
    return this.arity;
  }
  
  public Lambda(int paramInt) {
    this.arity = paramInt;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\Lambda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */