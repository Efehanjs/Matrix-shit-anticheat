package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FixedLengthSource extends ForwardingSource {
  private final long size;
  
  private final boolean truncate;
  
  private long bytesReceived;
  
  private static final long a = o3.a(-2346759168619617416L, -6041533860436817918L, MethodHandles.lookup().lookupClass()).a(144487150731813L);
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/FixedLengthSource.a : J
    //   3: ldc2_w 4694987679808
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sink'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: nop
    //   16: aload_0
    //   17: getfield bytesReceived : J
    //   20: aload_0
    //   21: getfield size : J
    //   24: lcmp
    //   25: ifle -> 36
    //   28: lconst_0
    //   29: goto -> 82
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_0
    //   37: getfield truncate : Z
    //   40: ifeq -> 81
    //   43: aload_0
    //   44: getfield size : J
    //   47: aload_0
    //   48: getfield bytesReceived : J
    //   51: lsub
    //   52: lstore #8
    //   54: lload #8
    //   56: lconst_0
    //   57: lcmp
    //   58: ifne -> 69
    //   61: ldc2_w -1
    //   64: lreturn
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: iconst_0
    //   70: istore #10
    //   72: lload_2
    //   73: lload #8
    //   75: invokestatic min : (JJ)J
    //   78: goto -> 82
    //   81: lload_2
    //   82: lstore #6
    //   84: aload_0
    //   85: aload_1
    //   86: lload #6
    //   88: invokespecial read : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)J
    //   91: lstore #8
    //   93: lload #8
    //   95: ldc2_w -1
    //   98: lcmp
    //   99: ifeq -> 118
    //   102: aload_0
    //   103: astore #10
    //   105: aload #10
    //   107: aload #10
    //   109: getfield bytesReceived : J
    //   112: lload #8
    //   114: ladd
    //   115: putfield bytesReceived : J
    //   118: aload_0
    //   119: getfield bytesReceived : J
    //   122: aload_0
    //   123: getfield size : J
    //   126: lcmp
    //   127: ifge -> 146
    //   130: lload #8
    //   132: ldc2_w -1
    //   135: lcmp
    //   136: ifeq -> 165
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: aload_0
    //   147: getfield bytesReceived : J
    //   150: aload_0
    //   151: getfield size : J
    //   154: lcmp
    //   155: ifle -> 266
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: lload #8
    //   167: lconst_0
    //   168: lcmp
    //   169: ifle -> 224
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: aload_0
    //   180: getfield bytesReceived : J
    //   183: aload_0
    //   184: getfield size : J
    //   187: lcmp
    //   188: ifle -> 224
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   197: athrow
    //   198: aload_0
    //   199: aload_1
    //   200: aload_1
    //   201: invokevirtual size : ()J
    //   204: aload_0
    //   205: getfield bytesReceived : J
    //   208: aload_0
    //   209: getfield size : J
    //   212: lsub
    //   213: lsub
    //   214: invokespecial truncateToSize : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)V
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: new java/io/IOException
    //   227: dup
    //   228: new java/lang/StringBuilder
    //   231: dup
    //   232: invokespecial <init> : ()V
    //   235: ldc 'expected '
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: aload_0
    //   241: getfield size : J
    //   244: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   247: ldc ' bytes but got '
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload_0
    //   253: getfield bytesReceived : J
    //   256: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   259: invokevirtual toString : ()Ljava/lang/String;
    //   262: invokespecial <init> : (Ljava/lang/String;)V
    //   265: athrow
    //   266: lload #8
    //   268: lreturn
    // Exception table:
    //   from	to	target	type
    //   9	32	32	java/lang/RuntimeException
    //   54	65	65	java/lang/RuntimeException
    //   118	139	142	java/lang/RuntimeException
    //   130	158	161	java/lang/RuntimeException
    //   146	172	175	java/lang/RuntimeException
    //   165	191	194	java/lang/RuntimeException
    //   179	217	220	java/lang/RuntimeException
  }
  
  public FixedLengthSource(@NotNull Source paramSource, long paramLong, boolean paramBoolean) {
    super(paramSource);
    this.size = paramLong;
    this.truncate = paramBoolean;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\FixedLengthSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */