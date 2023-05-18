package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class WebSocketProtocol {
  public static final long PAYLOAD_BYTE_MAX = 125L;
  
  public static final long CLOSE_MESSAGE_MAX = 123L;
  
  public static final int OPCODE_CONTINUATION = 0;
  
  public static final long PAYLOAD_SHORT_MAX = 65535L;
  
  public static final int B1_FLAG_MASK = 128;
  
  public static final int PAYLOAD_LONG = 127;
  
  @NotNull
  public static final WebSocketProtocol INSTANCE;
  
  public static final int B0_FLAG_FIN = 128;
  
  public static final int B1_MASK_LENGTH = 127;
  
  public static final int B0_MASK_OPCODE = 15;
  
  public static final int OPCODE_CONTROL_PING = 9;
  
  public static final int PAYLOAD_SHORT = 126;
  
  public static final int B0_FLAG_RSV1 = 64;
  
  public static final int B0_FLAG_RSV3 = 16;
  
  public static final int B0_FLAG_RSV2 = 32;
  
  @NotNull
  public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
  
  public static final int OPCODE_FLAG_CONTROL = 8;
  
  public static final int OPCODE_CONTROL_CLOSE = 8;
  
  public static final int CLOSE_NO_STATUS_CODE = 1005;
  
  public static final int OPCODE_TEXT = 1;
  
  public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
  
  public static final int OPCODE_CONTROL_PONG = 10;
  
  public static final int OPCODE_BINARY = 2;
  
  private static final long a = o3.a(1984948709389231691L, 6464755404763958535L, MethodHandles.lookup().lookupClass()).a(254055148030590L);
  
  public final void validateCloseCode(int paramInt) {
    String str = closeCodeExceptionMessage(paramInt);
    try {
      if (!((str == null) ? 1 : 0)) {
        boolean bool = false;
        Intrinsics.checkNotNull(str);
        String str1 = str;
        throw new IllegalArgumentException(str1.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public final void toggleMask(@NotNull Buffer.UnsafeCursor paramUnsafeCursor, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x2917B9B71177L;
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "cursor");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "key");
    int i = 0;
    int j = paramArrayOfbyte.length;
    do {
      byte[] arrayOfByte = paramUnsafeCursor.data;
      int k = paramUnsafeCursor.start;
      int m = paramUnsafeCursor.end;
      if (arrayOfByte == null)
        continue; 
      while (k < m) {
        i %= j;
        byte b1 = arrayOfByte[k];
        byte b2 = paramArrayOfbyte[i];
        arrayOfByte[k] = (byte)(b1 ^ b2);
        int n = k;
        k = n + 1;
        n = i;
        i = n + 1;
      } 
    } while (paramUnsafeCursor.next() != -1);
  }
  
  @NotNull
  public final String acceptHeader(@NotNull String paramString) {
    long l = a ^ 0x7A2585A7F914L;
    Intrinsics.checkNotNullParameter(paramString, "key");
    return ByteString.Companion.encodeUtf8(Intrinsics.stringPlus(paramString, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).sha1().base64();
  }
  
  static {
    INSTANCE = new WebSocketProtocol();
  }
  
  @Nullable
  public final String closeCodeExceptionMessage(int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/ws/WebSocketProtocol.a : J
    //   3: ldc2_w 105976944196619
    //   6: lxor
    //   7: lstore_2
    //   8: iload_1
    //   9: sipush #1000
    //   12: if_icmplt -> 29
    //   15: iload_1
    //   16: sipush #5000
    //   19: if_icmplt -> 45
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: ldc 'Code must be in range [1000,5000): '
    //   31: iload_1
    //   32: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   35: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   38: goto -> 161
    //   41: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   44: athrow
    //   45: sipush #1004
    //   48: iload_1
    //   49: if_icmpgt -> 78
    //   52: iload_1
    //   53: sipush #1007
    //   56: if_icmpge -> 74
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   65: athrow
    //   66: iconst_1
    //   67: goto -> 79
    //   70: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   73: athrow
    //   74: iconst_0
    //   75: goto -> 79
    //   78: iconst_0
    //   79: ifne -> 126
    //   82: sipush #1015
    //   85: iload_1
    //   86: if_icmpgt -> 122
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   95: athrow
    //   96: iload_1
    //   97: sipush #3000
    //   100: if_icmpge -> 118
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   109: athrow
    //   110: iconst_1
    //   111: goto -> 123
    //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: iconst_0
    //   119: goto -> 123
    //   122: iconst_0
    //   123: ifeq -> 157
    //   126: new java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial <init> : ()V
    //   133: ldc 'Code '
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: iload_1
    //   139: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   142: ldc ' is reserved and may not be used.'
    //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: invokevirtual toString : ()Ljava/lang/String;
    //   150: goto -> 161
    //   153: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   156: athrow
    //   157: aconst_null
    //   158: checkcast java/lang/String
    //   161: areturn
    // Exception table:
    //   from	to	target	type
    //   8	22	25	java/lang/IllegalArgumentException
    //   15	41	41	java/lang/IllegalArgumentException
    //   45	59	62	java/lang/IllegalArgumentException
    //   52	70	70	java/lang/IllegalArgumentException
    //   79	89	92	java/lang/IllegalArgumentException
    //   82	103	106	java/lang/IllegalArgumentException
    //   96	114	114	java/lang/IllegalArgumentException
    //   123	153	153	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\WebSocketProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */