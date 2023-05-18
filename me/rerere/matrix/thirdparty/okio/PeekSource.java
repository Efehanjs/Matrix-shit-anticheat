package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class PeekSource implements Source {
  @NotNull
  private final BufferedSource upstream;
  
  private int expectedPos;
  
  @NotNull
  private final Buffer buffer;
  
  @Nullable
  private Segment expectedSegment;
  
  private long pos;
  
  private boolean closed;
  
  private static final long a = o3.a(-5284142844496135807L, 5131152194357354532L, MethodHandles.lookup().lookupClass()).a(93069937389191L);
  
  @NotNull
  public Timeout timeout() {
    return this.upstream.timeout();
  }
  
  public PeekSource(@NotNull BufferedSource paramBufferedSource) {
    this.upstream = paramBufferedSource;
    this.buffer = this.upstream.getBuffer();
    this.expectedSegment = this.buffer.head;
    Segment segment = this.buffer.head;
    try {
      int i = segment.pos;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.expectedPos = (segment == null) ? -1 : i;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/PeekSource.a : J
    //   3: ldc2_w 78045868592160
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sink'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: lload_2
    //   16: lconst_0
    //   17: lcmp
    //   18: iflt -> 29
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: iconst_0
    //   30: istore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: iload #6
    //   40: ifne -> 73
    //   43: iconst_0
    //   44: istore #9
    //   46: ldc 'byteCount < 0: '
    //   48: lload_2
    //   49: invokestatic valueOf : (J)Ljava/lang/Long;
    //   52: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   55: astore #8
    //   57: new java/lang/IllegalArgumentException
    //   60: dup
    //   61: aload #8
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokespecial <init> : (Ljava/lang/String;)V
    //   69: checkcast java/lang/Throwable
    //   72: athrow
    //   73: aload_0
    //   74: getfield closed : Z
    //   77: ifne -> 88
    //   80: iconst_1
    //   81: goto -> 89
    //   84: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   87: athrow
    //   88: iconst_0
    //   89: istore #6
    //   91: iconst_0
    //   92: istore #7
    //   94: iconst_0
    //   95: istore #8
    //   97: iload #6
    //   99: ifne -> 125
    //   102: iconst_0
    //   103: istore #9
    //   105: ldc 'closed'
    //   107: astore #8
    //   109: new java/lang/IllegalStateException
    //   112: dup
    //   113: aload #8
    //   115: invokevirtual toString : ()Ljava/lang/String;
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: checkcast java/lang/Throwable
    //   124: athrow
    //   125: aload_0
    //   126: getfield expectedSegment : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   129: ifnull -> 181
    //   132: aload_0
    //   133: getfield expectedSegment : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   136: aload_0
    //   137: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   140: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   143: if_acmpne -> 189
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   152: athrow
    //   153: aload_0
    //   154: getfield expectedPos : I
    //   157: aload_0
    //   158: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   161: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   164: dup
    //   165: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   168: getfield pos : I
    //   171: if_icmpne -> 189
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   180: athrow
    //   181: iconst_1
    //   182: goto -> 190
    //   185: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   188: athrow
    //   189: iconst_0
    //   190: istore #6
    //   192: iconst_0
    //   193: istore #7
    //   195: iconst_0
    //   196: istore #8
    //   198: iload #6
    //   200: ifne -> 226
    //   203: iconst_0
    //   204: istore #9
    //   206: ldc 'Peek source is invalid because upstream source was used'
    //   208: astore #8
    //   210: new java/lang/IllegalStateException
    //   213: dup
    //   214: aload #8
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: invokespecial <init> : (Ljava/lang/String;)V
    //   222: checkcast java/lang/Throwable
    //   225: athrow
    //   226: lload_2
    //   227: lconst_0
    //   228: lcmp
    //   229: ifne -> 238
    //   232: lconst_0
    //   233: lreturn
    //   234: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   237: athrow
    //   238: aload_0
    //   239: getfield upstream : Lme/rerere/matrix/thirdparty/okio/BufferedSource;
    //   242: aload_0
    //   243: getfield pos : J
    //   246: lconst_1
    //   247: ladd
    //   248: invokeinterface request : (J)Z
    //   253: ifne -> 264
    //   256: ldc2_w -1
    //   259: lreturn
    //   260: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   263: athrow
    //   264: aload_0
    //   265: getfield expectedSegment : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   268: ifnonnull -> 324
    //   271: aload_0
    //   272: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   275: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   278: ifnull -> 324
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   287: athrow
    //   288: aload_0
    //   289: aload_0
    //   290: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   293: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   296: putfield expectedSegment : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   299: aload_0
    //   300: aload_0
    //   301: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   304: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   307: dup
    //   308: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   311: getfield pos : I
    //   314: putfield expectedPos : I
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   323: athrow
    //   324: aload_0
    //   325: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   328: invokevirtual size : ()J
    //   331: aload_0
    //   332: getfield pos : J
    //   335: lsub
    //   336: lstore #8
    //   338: iconst_0
    //   339: istore #10
    //   341: lload_2
    //   342: lload #8
    //   344: invokestatic min : (JJ)J
    //   347: lstore #6
    //   349: aload_0
    //   350: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   353: aload_1
    //   354: aload_0
    //   355: getfield pos : J
    //   358: lload #6
    //   360: invokevirtual copyTo : (Lme/rerere/matrix/thirdparty/okio/Buffer;JJ)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   363: pop
    //   364: aload_0
    //   365: astore #8
    //   367: aload #8
    //   369: aload #8
    //   371: getfield pos : J
    //   374: lload #6
    //   376: ladd
    //   377: putfield pos : J
    //   380: lload #6
    //   382: lreturn
    // Exception table:
    //   from	to	target	type
    //   9	25	25	java/lang/IllegalArgumentException
    //   73	84	84	java/lang/IllegalArgumentException
    //   125	146	149	java/lang/IllegalArgumentException
    //   132	174	177	java/lang/IllegalArgumentException
    //   153	185	185	java/lang/IllegalArgumentException
    //   226	234	234	java/lang/IllegalArgumentException
    //   238	260	260	java/lang/IllegalArgumentException
    //   264	281	284	java/lang/IllegalArgumentException
    //   271	317	320	java/lang/IllegalArgumentException
  }
  
  public void close() {
    this.closed = true;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\PeekSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */