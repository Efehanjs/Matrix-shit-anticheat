package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public abstract class Expression$Terminal implements Expression$BooleanExpression {
  public final Object value;
  
  private static final long a = o3.a(4647717869498754691L, -2521281392445527295L, MethodHandles.lookup().lookupClass()).a(225850738313426L);
  
  public Expression$Terminal(Object paramObject) {
    this.value = paramObject;
  }
  
  public String toString() {
    long l = a ^ 0x256DA27501F3L;
    return String.format("%s", new Object[] { this.value });
  }
  
  public Object interpret() {
    return this.value;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$Terminal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */