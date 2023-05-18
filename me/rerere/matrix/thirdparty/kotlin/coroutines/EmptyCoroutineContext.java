package me.rerere.matrix.thirdparty.kotlin.coroutines;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {
  private static final long serialVersionUID = 0L;
  
  @NotNull
  public static final EmptyCoroutineContext INSTANCE;
  
  private static final long a = o3.a(-3348445479067275959L, 7710869056290189099L, null).a(113806771846236L);
  
  public int hashCode() {
    return 0;
  }
  
  @Nullable
  public CoroutineContext$Element get(@NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x71A8412D117DL;
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
    return null;
  }
  
  @NotNull
  public CoroutineContext minusKey(@NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x6E1F75F0B146L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
    return this;
  }
  
  public Object fold(Object paramObject, @NotNull Function2 paramFunction2) {
    long l = a ^ 0x7FDE5DA7455L;
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return paramObject;
  }
  
  static {
    INSTANCE = new EmptyCoroutineContext();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x3389451BFC2FL;
    return "EmptyCoroutineContext";
  }
  
  @NotNull
  public CoroutineContext plus(@NotNull CoroutineContext paramCoroutineContext) {
    long l = a ^ 0x380CBD1054F7L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext, "context");
    return paramCoroutineContext;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\EmptyCoroutineContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */