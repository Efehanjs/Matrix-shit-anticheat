package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class LazyKt__LazyJVMKt {
  private static final long a = o3.a(-3804637336960495754L, 5839915303435107948L, null).a(147289159012890L);
  
  @NotNull
  public static final Lazy lazy(@Nullable Object paramObject, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x41CF51F025C2L;
    Intrinsics.checkNotNullParameter(paramFunction0, "initializer");
    return new SynchronizedLazyImpl(paramFunction0, paramObject);
  }
  
  @NotNull
  public static final Lazy lazy(@NotNull Function0 paramFunction0) {
    long l = a ^ 0x5915FC4766BEL;
    Intrinsics.checkNotNullParameter(paramFunction0, "initializer");
    return new SynchronizedLazyImpl(paramFunction0, null, 2, null);
  }
  
  @NotNull
  public static final Lazy lazy(@NotNull LazyThreadSafetyMode paramLazyThreadSafetyMode, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x16ED25D6F262L;
    try {
      Intrinsics.checkNotNullParameter(paramLazyThreadSafetyMode, "mode");
      Intrinsics.checkNotNullParameter(paramFunction0, "initializer");
      switch (LazyKt__LazyJVMKt$WhenMappings.$EnumSwitchMapping$0[paramLazyThreadSafetyMode.ordinal()]) {
        case 1:
        
        case 2:
        
        case 3:
        
      } 
    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
      throw a(null);
    } 
    throw new NoWhenBranchMatchedException();
  }
  
  private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException paramNoWhenBranchMatchedException) {
    return paramNoWhenBranchMatchedException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\LazyKt__LazyJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */