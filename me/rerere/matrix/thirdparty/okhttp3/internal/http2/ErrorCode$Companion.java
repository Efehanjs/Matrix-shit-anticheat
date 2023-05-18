package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ErrorCode$Companion {
  @Nullable
  public final ErrorCode fromHttp2(int paramInt) {
    // Byte code:
    //   0: invokestatic values : ()[Lme/rerere/matrix/thirdparty/okhttp3/internal/http2/ErrorCode;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_2
    //   7: arraylength
    //   8: istore #4
    //   10: iload_3
    //   11: iload #4
    //   13: if_icmpge -> 64
    //   16: aload_2
    //   17: iload_3
    //   18: aaload
    //   19: astore #5
    //   21: aload #5
    //   23: astore #6
    //   25: iconst_0
    //   26: istore #7
    //   28: aload #6
    //   30: invokevirtual getHttpCode : ()I
    //   33: iload_1
    //   34: if_icmpne -> 45
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   44: athrow
    //   45: iconst_0
    //   46: ifeq -> 58
    //   49: aload #5
    //   51: goto -> 65
    //   54: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: iinc #3, 1
    //   61: goto -> 10
    //   64: aconst_null
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   28	41	41	java/lang/RuntimeException
    //   46	54	54	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\ErrorCode$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */