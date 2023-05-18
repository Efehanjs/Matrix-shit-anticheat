package me.rerere.matrix.thirdparty.kotlin.internal;

import java.util.List;
import java.util.regex.MatchResult;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.FallbackThreadLocalRandom;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.text.MatchGroup;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class PlatformImplementations {
  private static final long a = o3.a(-3406054793858680688L, 2538018558487788731L, null).a(76992854611965L);
  
  @NotNull
  public List getSuppressed(@NotNull Throwable paramThrowable) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations.a : J
    //   3: ldc2_w 115091291546587
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'exception'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: getstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations$ReflectThrowable.getSuppressed : Ljava/lang/reflect/Method;
    //   17: dup
    //   18: ifnull -> 62
    //   21: aload_1
    //   22: iconst_0
    //   23: anewarray java/lang/Object
    //   26: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   29: dup
    //   30: ifnull -> 62
    //   33: goto -> 40
    //   36: invokestatic b : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   39: athrow
    //   40: astore #4
    //   42: aload #4
    //   44: astore #5
    //   46: iconst_0
    //   47: istore #6
    //   49: aload #5
    //   51: checkcast [Ljava/lang/Throwable;
    //   54: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   57: nop
    //   58: dup
    //   59: ifnonnull -> 73
    //   62: pop
    //   63: invokestatic emptyList : ()Ljava/util/List;
    //   66: goto -> 73
    //   69: invokestatic b : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   72: athrow
    //   73: areturn
    // Exception table:
    //   from	to	target	type
    //   8	33	36	java/lang/UnsupportedOperationException
    //   49	66	69	java/lang/UnsupportedOperationException
  }
  
  @NotNull
  public Random defaultPlatformRandom() {
    return (Random)new FallbackThreadLocalRandom();
  }
  
  @Nullable
  public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult paramMatchResult, @NotNull String paramString) {
    long l = a ^ 0x2CD9D5597C5DL;
    Intrinsics.checkNotNullParameter(paramMatchResult, "matchResult");
    Intrinsics.checkNotNullParameter(paramString, "name");
    throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
  }
  
  public void addSuppressed(@NotNull Throwable paramThrowable1, @NotNull Throwable paramThrowable2) {
    long l = a ^ 0x21C562F53D1BL;
    Intrinsics.checkNotNullParameter(paramThrowable1, "cause");
    Intrinsics.checkNotNullParameter(paramThrowable2, "exception");
    if (PlatformImplementations$ReflectThrowable.addSuppressed != null) {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramThrowable2;
      PlatformImplementations$ReflectThrowable.addSuppressed.invoke(paramThrowable1, arrayOfObject);
    } else {
    
    } 
  }
  
  private static UnsupportedOperationException b(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\PlatformImplementations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */