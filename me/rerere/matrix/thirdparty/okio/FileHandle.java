package me.rerere.matrix.thirdparty.okio;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class FileHandle implements Closeable {
  private int openStreamCount;
  
  private boolean closed;
  
  private final boolean readWrite;
  
  private static final long a = o3.a(937162698913742562L, 4542401203249144474L, MethodHandles.lookup().lookupClass()).a(48185623788349L);
  
  public abstract void protectedFlush() throws IOException;
  
  @NotNull
  public final Sink sink(long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 24476197885230
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: getfield readWrite : Z
    //   12: istore #5
    //   14: iconst_0
    //   15: istore #6
    //   17: iconst_0
    //   18: istore #7
    //   20: iload #5
    //   22: ifne -> 48
    //   25: iconst_0
    //   26: istore #8
    //   28: ldc 'file handle is read-only'
    //   30: astore #7
    //   32: new java/lang/IllegalStateException
    //   35: dup
    //   36: aload #7
    //   38: invokevirtual toString : ()Ljava/lang/String;
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: checkcast java/lang/Throwable
    //   47: athrow
    //   48: iconst_0
    //   49: istore #5
    //   51: iconst_0
    //   52: istore #6
    //   54: iconst_0
    //   55: istore #7
    //   57: aload_0
    //   58: monitorenter
    //   59: nop
    //   60: iconst_0
    //   61: istore #8
    //   63: aload_0
    //   64: getfield closed : Z
    //   67: ifne -> 78
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iconst_0
    //   79: istore #9
    //   81: iconst_0
    //   82: istore #10
    //   84: iconst_0
    //   85: istore #11
    //   87: iload #9
    //   89: ifne -> 115
    //   92: iconst_0
    //   93: istore #12
    //   95: ldc 'closed'
    //   97: astore #11
    //   99: new java/lang/IllegalStateException
    //   102: dup
    //   103: aload #11
    //   105: invokevirtual toString : ()Ljava/lang/String;
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: checkcast java/lang/Throwable
    //   114: athrow
    //   115: aload_0
    //   116: astore #9
    //   118: aload #9
    //   120: getfield openStreamCount : I
    //   123: istore #10
    //   125: aload #9
    //   127: iload #10
    //   129: iconst_1
    //   130: iadd
    //   131: putfield openStreamCount : I
    //   134: iload #10
    //   136: istore #7
    //   138: aload_0
    //   139: monitorexit
    //   140: goto -> 150
    //   143: astore #7
    //   145: aload_0
    //   146: monitorexit
    //   147: aload #7
    //   149: athrow
    //   150: nop
    //   151: new me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   154: dup
    //   155: aload_0
    //   156: lload_1
    //   157: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okio/FileHandle;J)V
    //   160: checkcast me/rerere/matrix/thirdparty/okio/Sink
    //   163: areturn
    // Exception table:
    //   from	to	target	type
    //   59	138	143	finally
    //   63	74	74	java/io/IOException
    //   143	145	143	finally
  }
  
  public final int read(long paramLong, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 49347235396176
    //   6: lxor
    //   7: lstore #6
    //   9: aload_3
    //   10: ldc 'array'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: iconst_0
    //   16: istore #8
    //   18: iconst_0
    //   19: istore #9
    //   21: iconst_0
    //   22: istore #10
    //   24: aload_0
    //   25: monitorenter
    //   26: nop
    //   27: iconst_0
    //   28: istore #11
    //   30: aload_0
    //   31: getfield closed : Z
    //   34: ifne -> 45
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iconst_0
    //   46: istore #12
    //   48: iconst_0
    //   49: istore #13
    //   51: iconst_0
    //   52: istore #14
    //   54: iload #12
    //   56: ifne -> 82
    //   59: iconst_0
    //   60: istore #15
    //   62: ldc 'closed'
    //   64: astore #14
    //   66: new java/lang/IllegalStateException
    //   69: dup
    //   70: aload #14
    //   72: invokevirtual toString : ()Ljava/lang/String;
    //   75: invokespecial <init> : (Ljava/lang/String;)V
    //   78: checkcast java/lang/Throwable
    //   81: athrow
    //   82: nop
    //   83: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   86: astore #10
    //   88: aload_0
    //   89: monitorexit
    //   90: goto -> 100
    //   93: astore #10
    //   95: aload_0
    //   96: monitorexit
    //   97: aload #10
    //   99: athrow
    //   100: nop
    //   101: aload_0
    //   102: lload_1
    //   103: aload_3
    //   104: iload #4
    //   106: iload #5
    //   108: invokevirtual protectedRead : (J[BII)I
    //   111: ireturn
    // Exception table:
    //   from	to	target	type
    //   26	88	93	finally
    //   30	41	41	java/io/IOException
    //   93	95	93	finally
  }
  
  public final void flush() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 79015701132492
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield readWrite : Z
    //   12: istore_3
    //   13: iconst_0
    //   14: istore #4
    //   16: iconst_0
    //   17: istore #5
    //   19: iload_3
    //   20: ifne -> 46
    //   23: iconst_0
    //   24: istore #6
    //   26: ldc 'file handle is read-only'
    //   28: astore #5
    //   30: new java/lang/IllegalStateException
    //   33: dup
    //   34: aload #5
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: checkcast java/lang/Throwable
    //   45: athrow
    //   46: iconst_0
    //   47: istore_3
    //   48: iconst_0
    //   49: istore #4
    //   51: iconst_0
    //   52: istore #5
    //   54: aload_0
    //   55: monitorenter
    //   56: nop
    //   57: iconst_0
    //   58: istore #6
    //   60: aload_0
    //   61: getfield closed : Z
    //   64: ifne -> 75
    //   67: iconst_1
    //   68: goto -> 76
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: iconst_0
    //   76: istore #7
    //   78: iconst_0
    //   79: istore #8
    //   81: iconst_0
    //   82: istore #9
    //   84: iload #7
    //   86: ifne -> 112
    //   89: iconst_0
    //   90: istore #10
    //   92: ldc 'closed'
    //   94: astore #9
    //   96: new java/lang/IllegalStateException
    //   99: dup
    //   100: aload #9
    //   102: invokevirtual toString : ()Ljava/lang/String;
    //   105: invokespecial <init> : (Ljava/lang/String;)V
    //   108: checkcast java/lang/Throwable
    //   111: athrow
    //   112: nop
    //   113: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   116: astore #5
    //   118: aload_0
    //   119: monitorexit
    //   120: goto -> 130
    //   123: astore #5
    //   125: aload_0
    //   126: monitorexit
    //   127: aload #5
    //   129: athrow
    //   130: nop
    //   131: aload_0
    //   132: invokevirtual protectedFlush : ()V
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   56	118	123	finally
    //   60	71	71	java/io/IOException
    //   123	125	123	finally
  }
  
  public final long position(@NotNull Sink paramSink) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 22405764743728
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'sink'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: astore #4
    //   17: lconst_0
    //   18: lstore #5
    //   20: aload #4
    //   22: instanceof me/rerere/matrix/thirdparty/okio/RealBufferedSink
    //   25: ifeq -> 58
    //   28: aload #4
    //   30: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSink
    //   33: astore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: aload #7
    //   40: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   43: invokevirtual size : ()J
    //   46: lstore #5
    //   48: aload #4
    //   50: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSink
    //   53: getfield sink : Lme/rerere/matrix/thirdparty/okio/Sink;
    //   56: astore #4
    //   58: aload #4
    //   60: instanceof me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   63: ifeq -> 93
    //   66: aload #4
    //   68: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   71: invokevirtual getFileHandle : ()Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   74: aload_0
    //   75: if_acmpne -> 93
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iconst_1
    //   86: goto -> 94
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iconst_0
    //   94: istore #7
    //   96: iconst_0
    //   97: istore #8
    //   99: iconst_0
    //   100: istore #9
    //   102: iload #7
    //   104: ifne -> 130
    //   107: iconst_0
    //   108: istore #10
    //   110: ldc 'sink was not created by this FileHandle'
    //   112: astore #9
    //   114: new java/lang/IllegalArgumentException
    //   117: dup
    //   118: aload #9
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: invokespecial <init> : (Ljava/lang/String;)V
    //   126: checkcast java/lang/Throwable
    //   129: athrow
    //   130: aload #4
    //   132: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   135: invokevirtual getClosed : ()Z
    //   138: ifne -> 149
    //   141: iconst_1
    //   142: goto -> 150
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: iconst_0
    //   150: istore #7
    //   152: iconst_0
    //   153: istore #8
    //   155: iconst_0
    //   156: istore #9
    //   158: iload #7
    //   160: ifne -> 186
    //   163: iconst_0
    //   164: istore #10
    //   166: ldc 'closed'
    //   168: astore #9
    //   170: new java/lang/IllegalStateException
    //   173: dup
    //   174: aload #9
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: invokespecial <init> : (Ljava/lang/String;)V
    //   182: checkcast java/lang/Throwable
    //   185: athrow
    //   186: aload #4
    //   188: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   191: invokevirtual getPosition : ()J
    //   194: lload #5
    //   196: ladd
    //   197: lreturn
    // Exception table:
    //   from	to	target	type
    //   58	78	81	java/io/IOException
    //   66	89	89	java/io/IOException
    //   130	145	145	java/io/IOException
  }
  
  public final long read(long paramLong1, @NotNull Buffer paramBuffer, long paramLong2) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 121314298552852
    //   6: lxor
    //   7: lstore #6
    //   9: aload_3
    //   10: ldc 'sink'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: iconst_0
    //   16: istore #8
    //   18: iconst_0
    //   19: istore #9
    //   21: iconst_0
    //   22: istore #10
    //   24: aload_0
    //   25: monitorenter
    //   26: nop
    //   27: iconst_0
    //   28: istore #11
    //   30: aload_0
    //   31: getfield closed : Z
    //   34: ifne -> 45
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iconst_0
    //   46: istore #12
    //   48: iconst_0
    //   49: istore #13
    //   51: iconst_0
    //   52: istore #14
    //   54: iload #12
    //   56: ifne -> 82
    //   59: iconst_0
    //   60: istore #15
    //   62: ldc 'closed'
    //   64: astore #14
    //   66: new java/lang/IllegalStateException
    //   69: dup
    //   70: aload #14
    //   72: invokevirtual toString : ()Ljava/lang/String;
    //   75: invokespecial <init> : (Ljava/lang/String;)V
    //   78: checkcast java/lang/Throwable
    //   81: athrow
    //   82: nop
    //   83: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   86: astore #10
    //   88: aload_0
    //   89: monitorexit
    //   90: goto -> 100
    //   93: astore #10
    //   95: aload_0
    //   96: monitorexit
    //   97: aload #10
    //   99: athrow
    //   100: nop
    //   101: aload_0
    //   102: lload_1
    //   103: aload_3
    //   104: lload #4
    //   106: invokespecial readNoCloseCheck : (JLme/rerere/matrix/thirdparty/okio/Buffer;J)J
    //   109: lreturn
    // Exception table:
    //   from	to	target	type
    //   26	88	93	finally
    //   30	41	41	java/io/IOException
    //   93	95	93	finally
  }
  
  public final void reposition(@NotNull Source paramSource, long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 68220728217758
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'source'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: instanceof me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   19: ifeq -> 276
    //   22: aload_1
    //   23: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   26: getfield source : Lme/rerere/matrix/thirdparty/okio/Source;
    //   29: astore #6
    //   31: aload #6
    //   33: instanceof me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   36: ifeq -> 66
    //   39: aload #6
    //   41: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   44: invokevirtual getFileHandle : ()Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   47: aload_0
    //   48: if_acmpne -> 66
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iconst_1
    //   59: goto -> 67
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: iconst_0
    //   67: istore #7
    //   69: iconst_0
    //   70: istore #8
    //   72: iconst_0
    //   73: istore #9
    //   75: iload #7
    //   77: ifne -> 103
    //   80: iconst_0
    //   81: istore #10
    //   83: ldc 'source was not created by this FileHandle'
    //   85: astore #9
    //   87: new java/lang/IllegalArgumentException
    //   90: dup
    //   91: aload #9
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: checkcast java/lang/Throwable
    //   102: athrow
    //   103: aload #6
    //   105: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   108: invokevirtual getClosed : ()Z
    //   111: ifne -> 122
    //   114: iconst_1
    //   115: goto -> 123
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: iconst_0
    //   123: istore #7
    //   125: iconst_0
    //   126: istore #8
    //   128: iconst_0
    //   129: istore #9
    //   131: iload #7
    //   133: ifne -> 159
    //   136: iconst_0
    //   137: istore #10
    //   139: ldc 'closed'
    //   141: astore #9
    //   143: new java/lang/IllegalStateException
    //   146: dup
    //   147: aload #9
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: checkcast java/lang/Throwable
    //   158: athrow
    //   159: aload_1
    //   160: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   163: astore #9
    //   165: iconst_0
    //   166: istore #10
    //   168: aload #9
    //   170: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   173: invokevirtual size : ()J
    //   176: lstore #7
    //   178: lload_2
    //   179: aload #6
    //   181: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   184: invokevirtual getPosition : ()J
    //   187: lload #7
    //   189: lsub
    //   190: lsub
    //   191: lstore #9
    //   193: lconst_0
    //   194: lload #9
    //   196: lcmp
    //   197: ifgt -> 227
    //   200: lload #9
    //   202: lload #7
    //   204: lcmp
    //   205: ifge -> 223
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: iconst_1
    //   216: goto -> 228
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: iconst_0
    //   224: goto -> 228
    //   227: iconst_0
    //   228: ifeq -> 247
    //   231: aload_1
    //   232: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   235: lload #9
    //   237: invokevirtual skip : (J)V
    //   240: goto -> 409
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: aload_1
    //   248: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   251: astore #11
    //   253: iconst_0
    //   254: istore #12
    //   256: aload #11
    //   258: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   261: invokevirtual clear : ()V
    //   264: aload #6
    //   266: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   269: lload_2
    //   270: invokevirtual setPosition : (J)V
    //   273: goto -> 409
    //   276: aload_1
    //   277: instanceof me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   280: ifeq -> 309
    //   283: aload_1
    //   284: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   287: invokevirtual getFileHandle : ()Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   290: aload_0
    //   291: if_acmpne -> 309
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   300: athrow
    //   301: iconst_1
    //   302: goto -> 310
    //   305: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   308: athrow
    //   309: iconst_0
    //   310: istore #6
    //   312: iconst_0
    //   313: istore #7
    //   315: iconst_0
    //   316: istore #8
    //   318: iload #6
    //   320: ifne -> 346
    //   323: iconst_0
    //   324: istore #9
    //   326: ldc 'source was not created by this FileHandle'
    //   328: astore #8
    //   330: new java/lang/IllegalArgumentException
    //   333: dup
    //   334: aload #8
    //   336: invokevirtual toString : ()Ljava/lang/String;
    //   339: invokespecial <init> : (Ljava/lang/String;)V
    //   342: checkcast java/lang/Throwable
    //   345: athrow
    //   346: aload_1
    //   347: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   350: invokevirtual getClosed : ()Z
    //   353: ifne -> 364
    //   356: iconst_1
    //   357: goto -> 365
    //   360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   363: athrow
    //   364: iconst_0
    //   365: istore #6
    //   367: iconst_0
    //   368: istore #7
    //   370: iconst_0
    //   371: istore #8
    //   373: iload #6
    //   375: ifne -> 401
    //   378: iconst_0
    //   379: istore #9
    //   381: ldc 'closed'
    //   383: astore #8
    //   385: new java/lang/IllegalStateException
    //   388: dup
    //   389: aload #8
    //   391: invokevirtual toString : ()Ljava/lang/String;
    //   394: invokespecial <init> : (Ljava/lang/String;)V
    //   397: checkcast java/lang/Throwable
    //   400: athrow
    //   401: aload_1
    //   402: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   405: lload_2
    //   406: invokevirtual setPosition : (J)V
    //   409: return
    // Exception table:
    //   from	to	target	type
    //   31	51	54	java/io/IOException
    //   39	62	62	java/io/IOException
    //   103	118	118	java/io/IOException
    //   193	208	211	java/io/IOException
    //   200	219	219	java/io/IOException
    //   228	243	243	java/io/IOException
    //   276	294	297	java/io/IOException
    //   283	305	305	java/io/IOException
    //   346	360	360	java/io/IOException
  }
  
  @NotNull
  public final Source source(long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 49537525920264
    //   6: lxor
    //   7: lstore_3
    //   8: iconst_0
    //   9: istore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: iconst_0
    //   15: istore #7
    //   17: aload_0
    //   18: monitorenter
    //   19: nop
    //   20: iconst_0
    //   21: istore #8
    //   23: aload_0
    //   24: getfield closed : Z
    //   27: ifne -> 38
    //   30: iconst_1
    //   31: goto -> 39
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: iconst_0
    //   39: istore #9
    //   41: iconst_0
    //   42: istore #10
    //   44: iconst_0
    //   45: istore #11
    //   47: iload #9
    //   49: ifne -> 75
    //   52: iconst_0
    //   53: istore #12
    //   55: ldc 'closed'
    //   57: astore #11
    //   59: new java/lang/IllegalStateException
    //   62: dup
    //   63: aload #11
    //   65: invokevirtual toString : ()Ljava/lang/String;
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: checkcast java/lang/Throwable
    //   74: athrow
    //   75: aload_0
    //   76: astore #9
    //   78: aload #9
    //   80: getfield openStreamCount : I
    //   83: istore #10
    //   85: aload #9
    //   87: iload #10
    //   89: iconst_1
    //   90: iadd
    //   91: putfield openStreamCount : I
    //   94: iload #10
    //   96: istore #7
    //   98: aload_0
    //   99: monitorexit
    //   100: goto -> 110
    //   103: astore #7
    //   105: aload_0
    //   106: monitorexit
    //   107: aload #7
    //   109: athrow
    //   110: nop
    //   111: new me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   114: dup
    //   115: aload_0
    //   116: lload_1
    //   117: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okio/FileHandle;J)V
    //   120: checkcast me/rerere/matrix/thirdparty/okio/Source
    //   123: areturn
    // Exception table:
    //   from	to	target	type
    //   19	98	103	finally
    //   23	34	34	java/io/IOException
    //   103	105	103	finally
  }
  
  public abstract long protectedSize() throws IOException;
  
  public final void close() throws IOException {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_0
    //   7: monitorenter
    //   8: nop
    //   9: iconst_0
    //   10: istore #4
    //   12: aload_0
    //   13: getfield closed : Z
    //   16: ifeq -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: iconst_1
    //   24: putfield closed : Z
    //   27: aload_0
    //   28: getfield openStreamCount : I
    //   31: ifeq -> 37
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: nop
    //   38: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   41: astore_3
    //   42: aload_0
    //   43: monitorexit
    //   44: goto -> 52
    //   47: astore_3
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_3
    //   51: athrow
    //   52: nop
    //   53: aload_0
    //   54: invokevirtual protectedClose : ()V
    //   57: return
    // Exception table:
    //   from	to	target	type
    //   8	19	47	finally
    //   22	34	47	finally
    //   37	42	47	finally
    //   47	48	47	finally
  }
  
  public abstract int protectedRead(long paramLong, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  public FileHandle(boolean paramBoolean) {
    this.readWrite = paramBoolean;
  }
  
  public abstract void protectedWrite(long paramLong, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  public abstract void protectedResize(long paramLong) throws IOException;
  
  public abstract void protectedClose() throws IOException;
  
  public final void write(long paramLong, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 125521217947049
    //   6: lxor
    //   7: lstore #6
    //   9: aload_3
    //   10: ldc 'array'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield readWrite : Z
    //   19: istore #8
    //   21: iconst_0
    //   22: istore #9
    //   24: iconst_0
    //   25: istore #10
    //   27: iload #8
    //   29: ifne -> 55
    //   32: iconst_0
    //   33: istore #11
    //   35: ldc 'file handle is read-only'
    //   37: astore #10
    //   39: new java/lang/IllegalStateException
    //   42: dup
    //   43: aload #10
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: checkcast java/lang/Throwable
    //   54: athrow
    //   55: iconst_0
    //   56: istore #8
    //   58: iconst_0
    //   59: istore #9
    //   61: iconst_0
    //   62: istore #10
    //   64: aload_0
    //   65: monitorenter
    //   66: nop
    //   67: iconst_0
    //   68: istore #11
    //   70: aload_0
    //   71: getfield closed : Z
    //   74: ifne -> 85
    //   77: iconst_1
    //   78: goto -> 86
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iconst_0
    //   86: istore #12
    //   88: iconst_0
    //   89: istore #13
    //   91: iconst_0
    //   92: istore #14
    //   94: iload #12
    //   96: ifne -> 122
    //   99: iconst_0
    //   100: istore #15
    //   102: ldc 'closed'
    //   104: astore #14
    //   106: new java/lang/IllegalStateException
    //   109: dup
    //   110: aload #14
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: checkcast java/lang/Throwable
    //   121: athrow
    //   122: nop
    //   123: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   126: astore #10
    //   128: aload_0
    //   129: monitorexit
    //   130: goto -> 140
    //   133: astore #10
    //   135: aload_0
    //   136: monitorexit
    //   137: aload #10
    //   139: athrow
    //   140: nop
    //   141: aload_0
    //   142: lload_1
    //   143: aload_3
    //   144: iload #4
    //   146: iload #5
    //   148: invokevirtual protectedWrite : (J[BII)V
    //   151: return
    // Exception table:
    //   from	to	target	type
    //   66	128	133	finally
    //   70	81	81	java/lang/IllegalStateException
    //   133	135	133	finally
  }
  
  public final void write(long paramLong1, @NotNull Buffer paramBuffer, long paramLong2) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 115294697348221
    //   6: lxor
    //   7: lstore #6
    //   9: aload_3
    //   10: ldc 'source'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield readWrite : Z
    //   19: istore #8
    //   21: iconst_0
    //   22: istore #9
    //   24: iconst_0
    //   25: istore #10
    //   27: iload #8
    //   29: ifne -> 55
    //   32: iconst_0
    //   33: istore #11
    //   35: ldc 'file handle is read-only'
    //   37: astore #10
    //   39: new java/lang/IllegalStateException
    //   42: dup
    //   43: aload #10
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: checkcast java/lang/Throwable
    //   54: athrow
    //   55: iconst_0
    //   56: istore #8
    //   58: iconst_0
    //   59: istore #9
    //   61: iconst_0
    //   62: istore #10
    //   64: aload_0
    //   65: monitorenter
    //   66: nop
    //   67: iconst_0
    //   68: istore #11
    //   70: aload_0
    //   71: getfield closed : Z
    //   74: ifne -> 85
    //   77: iconst_1
    //   78: goto -> 86
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iconst_0
    //   86: istore #12
    //   88: iconst_0
    //   89: istore #13
    //   91: iconst_0
    //   92: istore #14
    //   94: iload #12
    //   96: ifne -> 122
    //   99: iconst_0
    //   100: istore #15
    //   102: ldc 'closed'
    //   104: astore #14
    //   106: new java/lang/IllegalStateException
    //   109: dup
    //   110: aload #14
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: checkcast java/lang/Throwable
    //   121: athrow
    //   122: nop
    //   123: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   126: astore #10
    //   128: aload_0
    //   129: monitorexit
    //   130: goto -> 140
    //   133: astore #10
    //   135: aload_0
    //   136: monitorexit
    //   137: aload #10
    //   139: athrow
    //   140: nop
    //   141: aload_0
    //   142: lload_1
    //   143: aload_3
    //   144: lload #4
    //   146: invokespecial writeNoCloseCheck : (JLme/rerere/matrix/thirdparty/okio/Buffer;J)V
    //   149: return
    // Exception table:
    //   from	to	target	type
    //   66	128	133	finally
    //   70	81	81	java/io/IOException
    //   133	135	133	finally
  }
  
  public final void reposition(@NotNull Sink paramSink, long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 79298317965954
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sink'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: instanceof me/rerere/matrix/thirdparty/okio/RealBufferedSink
    //   19: ifeq -> 179
    //   22: aload_1
    //   23: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSink
    //   26: getfield sink : Lme/rerere/matrix/thirdparty/okio/Sink;
    //   29: astore #6
    //   31: aload #6
    //   33: instanceof me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   36: ifeq -> 66
    //   39: aload #6
    //   41: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   44: invokevirtual getFileHandle : ()Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   47: aload_0
    //   48: if_acmpne -> 66
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iconst_1
    //   59: goto -> 67
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: iconst_0
    //   67: istore #7
    //   69: iconst_0
    //   70: istore #8
    //   72: iconst_0
    //   73: istore #9
    //   75: iload #7
    //   77: ifne -> 103
    //   80: iconst_0
    //   81: istore #10
    //   83: ldc 'sink was not created by this FileHandle'
    //   85: astore #9
    //   87: new java/lang/IllegalArgumentException
    //   90: dup
    //   91: aload #9
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: checkcast java/lang/Throwable
    //   102: athrow
    //   103: aload #6
    //   105: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   108: invokevirtual getClosed : ()Z
    //   111: ifne -> 122
    //   114: iconst_1
    //   115: goto -> 123
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: iconst_0
    //   123: istore #7
    //   125: iconst_0
    //   126: istore #8
    //   128: iconst_0
    //   129: istore #9
    //   131: iload #7
    //   133: ifne -> 159
    //   136: iconst_0
    //   137: istore #10
    //   139: ldc 'closed'
    //   141: astore #9
    //   143: new java/lang/IllegalStateException
    //   146: dup
    //   147: aload #9
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: checkcast java/lang/Throwable
    //   158: athrow
    //   159: aload_1
    //   160: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSink
    //   163: invokevirtual emit : ()Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   166: pop
    //   167: aload #6
    //   169: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   172: lload_2
    //   173: invokevirtual setPosition : (J)V
    //   176: goto -> 312
    //   179: aload_1
    //   180: instanceof me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   183: ifeq -> 212
    //   186: aload_1
    //   187: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   190: invokevirtual getFileHandle : ()Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   193: aload_0
    //   194: if_acmpne -> 212
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: iconst_1
    //   205: goto -> 213
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: iconst_0
    //   213: istore #6
    //   215: iconst_0
    //   216: istore #7
    //   218: iconst_0
    //   219: istore #8
    //   221: iload #6
    //   223: ifne -> 249
    //   226: iconst_0
    //   227: istore #9
    //   229: ldc 'sink was not created by this FileHandle'
    //   231: astore #8
    //   233: new java/lang/IllegalArgumentException
    //   236: dup
    //   237: aload #8
    //   239: invokevirtual toString : ()Ljava/lang/String;
    //   242: invokespecial <init> : (Ljava/lang/String;)V
    //   245: checkcast java/lang/Throwable
    //   248: athrow
    //   249: aload_1
    //   250: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   253: invokevirtual getClosed : ()Z
    //   256: ifne -> 267
    //   259: iconst_1
    //   260: goto -> 268
    //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   266: athrow
    //   267: iconst_0
    //   268: istore #6
    //   270: iconst_0
    //   271: istore #7
    //   273: iconst_0
    //   274: istore #8
    //   276: iload #6
    //   278: ifne -> 304
    //   281: iconst_0
    //   282: istore #9
    //   284: ldc 'closed'
    //   286: astore #8
    //   288: new java/lang/IllegalStateException
    //   291: dup
    //   292: aload #8
    //   294: invokevirtual toString : ()Ljava/lang/String;
    //   297: invokespecial <init> : (Ljava/lang/String;)V
    //   300: checkcast java/lang/Throwable
    //   303: athrow
    //   304: aload_1
    //   305: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSink
    //   308: lload_2
    //   309: invokevirtual setPosition : (J)V
    //   312: return
    // Exception table:
    //   from	to	target	type
    //   31	51	54	java/io/IOException
    //   39	62	62	java/io/IOException
    //   103	118	118	java/io/IOException
    //   179	197	200	java/io/IOException
    //   186	208	208	java/io/IOException
    //   249	263	263	java/io/IOException
  }
  
  public final boolean getReadWrite() {
    return this.readWrite;
  }
  
  @NotNull
  public final Sink appendingSink() throws IOException {
    return sink(size());
  }
  
  public final void resize(long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 122391577956940
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: getfield readWrite : Z
    //   12: istore #5
    //   14: iconst_0
    //   15: istore #6
    //   17: iconst_0
    //   18: istore #7
    //   20: iload #5
    //   22: ifne -> 48
    //   25: iconst_0
    //   26: istore #8
    //   28: ldc 'file handle is read-only'
    //   30: astore #7
    //   32: new java/lang/IllegalStateException
    //   35: dup
    //   36: aload #7
    //   38: invokevirtual toString : ()Ljava/lang/String;
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: checkcast java/lang/Throwable
    //   47: athrow
    //   48: iconst_0
    //   49: istore #5
    //   51: iconst_0
    //   52: istore #6
    //   54: iconst_0
    //   55: istore #7
    //   57: aload_0
    //   58: monitorenter
    //   59: nop
    //   60: iconst_0
    //   61: istore #8
    //   63: aload_0
    //   64: getfield closed : Z
    //   67: ifne -> 78
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iconst_0
    //   79: istore #9
    //   81: iconst_0
    //   82: istore #10
    //   84: iconst_0
    //   85: istore #11
    //   87: iload #9
    //   89: ifne -> 115
    //   92: iconst_0
    //   93: istore #12
    //   95: ldc 'closed'
    //   97: astore #11
    //   99: new java/lang/IllegalStateException
    //   102: dup
    //   103: aload #11
    //   105: invokevirtual toString : ()Ljava/lang/String;
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: checkcast java/lang/Throwable
    //   114: athrow
    //   115: nop
    //   116: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   119: astore #7
    //   121: aload_0
    //   122: monitorexit
    //   123: goto -> 133
    //   126: astore #7
    //   128: aload_0
    //   129: monitorexit
    //   130: aload #7
    //   132: athrow
    //   133: nop
    //   134: aload_0
    //   135: lload_1
    //   136: invokevirtual protectedResize : (J)V
    //   139: return
    // Exception table:
    //   from	to	target	type
    //   59	121	126	finally
    //   63	74	74	java/io/IOException
    //   126	128	126	finally
  }
  
  public final long position(@NotNull Source paramSource) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 50533310516768
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'source'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: astore #4
    //   17: lconst_0
    //   18: lstore #5
    //   20: aload #4
    //   22: instanceof me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   25: ifeq -> 58
    //   28: aload #4
    //   30: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   33: astore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: aload #7
    //   40: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   43: invokevirtual size : ()J
    //   46: lstore #5
    //   48: aload #4
    //   50: checkcast me/rerere/matrix/thirdparty/okio/RealBufferedSource
    //   53: getfield source : Lme/rerere/matrix/thirdparty/okio/Source;
    //   56: astore #4
    //   58: aload #4
    //   60: instanceof me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   63: ifeq -> 93
    //   66: aload #4
    //   68: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   71: invokevirtual getFileHandle : ()Lme/rerere/matrix/thirdparty/okio/FileHandle;
    //   74: aload_0
    //   75: if_acmpne -> 93
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iconst_1
    //   86: goto -> 94
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iconst_0
    //   94: istore #7
    //   96: iconst_0
    //   97: istore #8
    //   99: iconst_0
    //   100: istore #9
    //   102: iload #7
    //   104: ifne -> 130
    //   107: iconst_0
    //   108: istore #10
    //   110: ldc 'source was not created by this FileHandle'
    //   112: astore #9
    //   114: new java/lang/IllegalArgumentException
    //   117: dup
    //   118: aload #9
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: invokespecial <init> : (Ljava/lang/String;)V
    //   126: checkcast java/lang/Throwable
    //   129: athrow
    //   130: aload #4
    //   132: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   135: invokevirtual getClosed : ()Z
    //   138: ifne -> 149
    //   141: iconst_1
    //   142: goto -> 150
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: iconst_0
    //   150: istore #7
    //   152: iconst_0
    //   153: istore #8
    //   155: iconst_0
    //   156: istore #9
    //   158: iload #7
    //   160: ifne -> 186
    //   163: iconst_0
    //   164: istore #10
    //   166: ldc 'closed'
    //   168: astore #9
    //   170: new java/lang/IllegalStateException
    //   173: dup
    //   174: aload #9
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: invokespecial <init> : (Ljava/lang/String;)V
    //   182: checkcast java/lang/Throwable
    //   185: athrow
    //   186: aload #4
    //   188: checkcast me/rerere/matrix/thirdparty/okio/FileHandle$FileHandleSource
    //   191: invokevirtual getPosition : ()J
    //   194: lload #5
    //   196: lsub
    //   197: lreturn
    // Exception table:
    //   from	to	target	type
    //   58	78	81	java/io/IOException
    //   66	89	89	java/io/IOException
    //   130	145	145	java/io/IOException
  }
  
  public final long size() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/FileHandle.a : J
    //   3: ldc2_w 122728631697470
    //   6: lxor
    //   7: lstore_1
    //   8: iconst_0
    //   9: istore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: aload_0
    //   17: monitorenter
    //   18: nop
    //   19: iconst_0
    //   20: istore #6
    //   22: aload_0
    //   23: getfield closed : Z
    //   26: ifne -> 37
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #7
    //   40: iconst_0
    //   41: istore #8
    //   43: iconst_0
    //   44: istore #9
    //   46: iload #7
    //   48: ifne -> 74
    //   51: iconst_0
    //   52: istore #10
    //   54: ldc 'closed'
    //   56: astore #9
    //   58: new java/lang/IllegalStateException
    //   61: dup
    //   62: aload #9
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: checkcast java/lang/Throwable
    //   73: athrow
    //   74: nop
    //   75: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   78: astore #5
    //   80: aload_0
    //   81: monitorexit
    //   82: goto -> 92
    //   85: astore #5
    //   87: aload_0
    //   88: monitorexit
    //   89: aload #5
    //   91: athrow
    //   92: nop
    //   93: aload_0
    //   94: invokevirtual protectedSize : ()J
    //   97: lreturn
    // Exception table:
    //   from	to	target	type
    //   18	80	85	finally
    //   22	33	33	java/io/IOException
    //   85	87	85	finally
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\FileHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */