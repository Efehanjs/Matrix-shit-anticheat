package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class Emitter$ExpectDocumentStart implements EmitterState {
  private final boolean first;
  
  private static final long a = o3.a(194298216759733255L, 7790472674302134953L, MethodHandles.lookup().lookupClass()).a(230483290928171L);
  
  public Emitter$ExpectDocumentStart(boolean paramBoolean) {
    this.first = paramBoolean;
  }
  
  public void expect() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectDocumentStart.a : J
    //   3: ldc2_w 78414902074957
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   12: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   15: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/DocumentStartEvent
    //   18: ifeq -> 465
    //   21: aload_0
    //   22: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   25: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   28: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/DocumentStartEvent
    //   31: astore_3
    //   32: aload_3
    //   33: invokevirtual getVersion : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$Version;
    //   36: ifnonnull -> 53
    //   39: aload_3
    //   40: invokevirtual getTags : ()Ljava/util/Map;
    //   43: ifnull -> 96
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   52: athrow
    //   53: aload_0
    //   54: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   57: invokestatic access$400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   60: ifeq -> 96
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   69: athrow
    //   70: aload_0
    //   71: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   74: ldc '...'
    //   76: iconst_1
    //   77: iconst_0
    //   78: iconst_0
    //   79: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   82: aload_0
    //   83: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   86: invokevirtual writeIndent : ()V
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   95: athrow
    //   96: aload_3
    //   97: invokevirtual getVersion : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$Version;
    //   100: ifnull -> 125
    //   103: aload_0
    //   104: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   107: aload_3
    //   108: invokevirtual getVersion : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$Version;
    //   111: invokestatic access$500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$Version;)Ljava/lang/String;
    //   114: astore #4
    //   116: aload_0
    //   117: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   120: aload #4
    //   122: invokevirtual writeVersionDirective : (Ljava/lang/String;)V
    //   125: aload_0
    //   126: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   129: new java/util/LinkedHashMap
    //   132: dup
    //   133: invokestatic access$700 : ()Ljava/util/Map;
    //   136: invokespecial <init> : (Ljava/util/Map;)V
    //   139: invokestatic access$602 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/util/Map;)Ljava/util/Map;
    //   142: pop
    //   143: aload_3
    //   144: invokevirtual getTags : ()Ljava/util/Map;
    //   147: ifnull -> 268
    //   150: new java/util/TreeSet
    //   153: dup
    //   154: aload_3
    //   155: invokevirtual getTags : ()Ljava/util/Map;
    //   158: invokeinterface keySet : ()Ljava/util/Set;
    //   163: invokespecial <init> : (Ljava/util/Collection;)V
    //   166: astore #4
    //   168: aload #4
    //   170: invokeinterface iterator : ()Ljava/util/Iterator;
    //   175: astore #5
    //   177: aload #5
    //   179: invokeinterface hasNext : ()Z
    //   184: ifeq -> 268
    //   187: aload #5
    //   189: invokeinterface next : ()Ljava/lang/Object;
    //   194: checkcast java/lang/String
    //   197: astore #6
    //   199: aload_3
    //   200: invokevirtual getTags : ()Ljava/util/Map;
    //   203: aload #6
    //   205: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   210: checkcast java/lang/String
    //   213: astore #7
    //   215: aload_0
    //   216: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   219: invokestatic access$600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/util/Map;
    //   222: aload #7
    //   224: aload #6
    //   226: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   231: pop
    //   232: aload_0
    //   233: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   236: aload #6
    //   238: invokestatic access$800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/String;)Ljava/lang/String;
    //   241: astore #8
    //   243: aload_0
    //   244: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   247: aload #7
    //   249: invokestatic access$900 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/String;)Ljava/lang/String;
    //   252: astore #9
    //   254: aload_0
    //   255: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   258: aload #8
    //   260: aload #9
    //   262: invokevirtual writeTagDirective : (Ljava/lang/String;Ljava/lang/String;)V
    //   265: goto -> 177
    //   268: aload_0
    //   269: getfield first : Z
    //   272: ifeq -> 381
    //   275: aload_3
    //   276: invokevirtual getExplicit : ()Z
    //   279: ifne -> 381
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   288: athrow
    //   289: aload_0
    //   290: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   293: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   296: invokevirtual booleanValue : ()Z
    //   299: ifne -> 381
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   308: athrow
    //   309: aload_3
    //   310: invokevirtual getVersion : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$Version;
    //   313: ifnonnull -> 381
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   322: athrow
    //   323: aload_3
    //   324: invokevirtual getTags : ()Ljava/util/Map;
    //   327: ifnull -> 356
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   336: athrow
    //   337: aload_3
    //   338: invokevirtual getTags : ()Ljava/util/Map;
    //   341: invokeinterface isEmpty : ()Z
    //   346: ifeq -> 381
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   355: athrow
    //   356: aload_0
    //   357: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   360: invokestatic access$1100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   363: ifne -> 381
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   372: athrow
    //   373: iconst_1
    //   374: goto -> 382
    //   377: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   380: athrow
    //   381: iconst_0
    //   382: istore #4
    //   384: iload #4
    //   386: ifne -> 442
    //   389: aload_0
    //   390: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   393: invokevirtual writeIndent : ()V
    //   396: aload_0
    //   397: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   400: ldc '---'
    //   402: iconst_1
    //   403: iconst_0
    //   404: iconst_0
    //   405: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   408: aload_0
    //   409: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   412: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   415: invokevirtual booleanValue : ()Z
    //   418: ifeq -> 442
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   427: athrow
    //   428: aload_0
    //   429: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   432: invokevirtual writeIndent : ()V
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   441: athrow
    //   442: aload_0
    //   443: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   446: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectDocumentRoot
    //   449: dup
    //   450: aload_0
    //   451: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   454: aconst_null
    //   455: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   458: invokestatic access$202 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;
    //   461: pop
    //   462: goto -> 590
    //   465: aload_0
    //   466: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   469: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   472: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/StreamEndEvent
    //   475: ifeq -> 512
    //   478: aload_0
    //   479: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   482: invokevirtual writeStreamEnd : ()V
    //   485: aload_0
    //   486: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   489: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectNothing
    //   492: dup
    //   493: aload_0
    //   494: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   497: aconst_null
    //   498: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   501: invokestatic access$202 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;
    //   504: pop
    //   505: goto -> 590
    //   508: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   511: athrow
    //   512: aload_0
    //   513: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   516: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   519: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/CommentEvent
    //   522: ifeq -> 557
    //   525: aload_0
    //   526: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   529: invokestatic access$1400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   532: aload_0
    //   533: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   536: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   539: invokevirtual collectEvents : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   542: pop
    //   543: aload_0
    //   544: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   547: invokestatic access$1500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)V
    //   550: goto -> 590
    //   553: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   556: athrow
    //   557: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterException
    //   560: dup
    //   561: new java/lang/StringBuilder
    //   564: dup
    //   565: invokespecial <init> : ()V
    //   568: ldc 'expected DocumentStartEvent, but got '
    //   570: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   573: aload_0
    //   574: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   577: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   580: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   583: invokevirtual toString : ()Ljava/lang/String;
    //   586: invokespecial <init> : (Ljava/lang/String;)V
    //   589: athrow
    //   590: return
    // Exception table:
    //   from	to	target	type
    //   32	46	49	java/io/IOException
    //   39	63	66	java/io/IOException
    //   53	89	92	java/io/IOException
    //   268	282	285	java/io/IOException
    //   275	302	305	java/io/IOException
    //   289	316	319	java/io/IOException
    //   309	330	333	java/io/IOException
    //   323	349	352	java/io/IOException
    //   337	366	369	java/io/IOException
    //   356	377	377	java/io/IOException
    //   384	421	424	java/io/IOException
    //   389	435	438	java/io/IOException
    //   465	508	508	java/io/IOException
    //   512	553	553	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectDocumentStart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */