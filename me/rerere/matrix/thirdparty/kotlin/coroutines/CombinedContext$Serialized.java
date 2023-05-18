package me.rerere.matrix.thirdparty.kotlin.coroutines;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CombinedContext$Serialized implements Serializable {
  private static final long serialVersionUID = 0L;
  
  @NotNull
  public static final CombinedContext$Serialized$Companion Companion;
  
  @NotNull
  private final CoroutineContext[] elements;
  
  private static final long a = o3.a(6672176652031969243L, 6642904595241390414L, null).a(135032574562297L);
  
  public CombinedContext$Serialized(@NotNull CoroutineContext[] paramArrayOfCoroutineContext) {
    this.elements = paramArrayOfCoroutineContext;
  }
  
  static {
    Companion = new CombinedContext$Serialized$Companion(null);
  }
  
  @NotNull
  public final CoroutineContext[] getElements() {
    return this.elements;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CombinedContext$Serialized.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */