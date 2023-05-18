package me.rerere.matrix.thirdparty.kotlin.random;

import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class PlatformRandomKt {
  private static final long a = o3.a(-5470101158002863810L, 1015714468366691513L, null).a(47397350751030L);
  
  public static final double doubleFromParts(int paramInt1, int paramInt2) {
    return ((paramInt1 << 27L) + paramInt2) / 9.007199254740992E15D;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Random asKotlinRandom(@NotNull Random paramRandom) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/random/PlatformRandomKt.a : J
    //   3: ldc2_w 32469052368863
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: instanceof me/rerere/matrix/thirdparty/kotlin/random/KotlinRandom
    //   18: ifeq -> 32
    //   21: aload_0
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/random/KotlinRandom
    //   25: goto -> 33
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aconst_null
    //   33: dup
    //   34: ifnull -> 51
    //   37: invokevirtual getImpl : ()Lme/rerere/matrix/thirdparty/kotlin/random/Random;
    //   40: dup
    //   41: ifnonnull -> 70
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: pop
    //   52: new me/rerere/matrix/thirdparty/kotlin/random/PlatformRandom
    //   55: dup
    //   56: aload_0
    //   57: invokespecial <init> : (Ljava/util/Random;)V
    //   60: checkcast me/rerere/matrix/thirdparty/kotlin/random/Random
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: areturn
    // Exception table:
    //   from	to	target	type
    //   8	28	28	java/lang/RuntimeException
    //   33	44	47	java/lang/RuntimeException
    //   37	63	66	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Random asJavaRandom(@NotNull Random paramRandom) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/random/PlatformRandomKt.a : J
    //   3: ldc2_w 64002571776858
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: instanceof me/rerere/matrix/thirdparty/kotlin/random/AbstractPlatformRandom
    //   18: ifeq -> 32
    //   21: aload_0
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/random/AbstractPlatformRandom
    //   25: goto -> 33
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aconst_null
    //   33: dup
    //   34: ifnull -> 51
    //   37: invokevirtual getImpl : ()Ljava/util/Random;
    //   40: dup
    //   41: ifnonnull -> 70
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: pop
    //   52: new me/rerere/matrix/thirdparty/kotlin/random/KotlinRandom
    //   55: dup
    //   56: aload_0
    //   57: invokespecial <init> : (Lme/rerere/matrix/thirdparty/kotlin/random/Random;)V
    //   60: checkcast java/util/Random
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: areturn
    // Exception table:
    //   from	to	target	type
    //   8	28	28	java/lang/RuntimeException
    //   33	44	47	java/lang/RuntimeException
    //   37	63	66	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\PlatformRandomKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */