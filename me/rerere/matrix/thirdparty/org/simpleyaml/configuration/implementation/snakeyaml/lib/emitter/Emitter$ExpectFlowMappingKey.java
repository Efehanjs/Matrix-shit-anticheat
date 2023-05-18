package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectFlowMappingKey implements EmitterState {
  public void expect() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   4: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   7: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/MappingEndEvent
    //   10: ifeq -> 170
    //   13: aload_0
    //   14: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   17: aload_0
    //   18: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   21: invokestatic access$2100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   24: invokevirtual pop : ()Ljava/lang/Object;
    //   27: checkcast java/lang/Integer
    //   30: invokestatic access$2002 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   33: pop
    //   34: aload_0
    //   35: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   38: invokestatic access$2210 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   41: pop
    //   42: aload_0
    //   43: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   46: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   49: invokevirtual booleanValue : ()Z
    //   52: ifeq -> 88
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   61: athrow
    //   62: aload_0
    //   63: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   66: ldc ','
    //   68: iconst_0
    //   69: iconst_0
    //   70: iconst_0
    //   71: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   74: aload_0
    //   75: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   78: invokevirtual writeIndent : ()V
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   87: athrow
    //   88: aload_0
    //   89: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   92: invokestatic access$2800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   95: invokevirtual booleanValue : ()Z
    //   98: ifeq -> 115
    //   101: aload_0
    //   102: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   105: invokevirtual writeIndent : ()V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   114: athrow
    //   115: aload_0
    //   116: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   119: ldc '}'
    //   121: iconst_0
    //   122: iconst_0
    //   123: iconst_0
    //   124: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   127: aload_0
    //   128: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   131: invokestatic access$2300 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   134: invokevirtual collectEvents : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   137: pop
    //   138: aload_0
    //   139: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   142: invokestatic access$2400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   145: pop
    //   146: aload_0
    //   147: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   150: aload_0
    //   151: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   154: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   157: invokevirtual pop : ()Ljava/lang/Object;
    //   160: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState
    //   163: invokestatic access$202 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;
    //   166: pop
    //   167: goto -> 415
    //   170: aload_0
    //   171: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   174: ldc ','
    //   176: iconst_0
    //   177: iconst_0
    //   178: iconst_0
    //   179: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   182: aload_0
    //   183: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   186: aload_0
    //   187: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   190: invokestatic access$1400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   193: aload_0
    //   194: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   197: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   200: invokevirtual collectEventsAndPoll : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   203: invokestatic access$102 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   206: pop
    //   207: aload_0
    //   208: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   211: invokestatic access$1500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)V
    //   214: aload_0
    //   215: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   218: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   221: invokevirtual booleanValue : ()Z
    //   224: ifne -> 288
    //   227: aload_0
    //   228: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   231: invokestatic access$2500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   234: aload_0
    //   235: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   238: invokestatic access$2600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   241: if_icmple -> 268
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   250: athrow
    //   251: aload_0
    //   252: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   255: invokestatic access$2700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   258: ifne -> 288
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   267: athrow
    //   268: aload_0
    //   269: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   272: invokestatic access$2800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   275: invokevirtual booleanValue : ()Z
    //   278: ifeq -> 302
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   287: athrow
    //   288: aload_0
    //   289: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   292: invokevirtual writeIndent : ()V
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   301: athrow
    //   302: aload_0
    //   303: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   306: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   309: invokevirtual booleanValue : ()Z
    //   312: ifne -> 371
    //   315: aload_0
    //   316: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   319: invokestatic access$3100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   322: ifeq -> 371
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   331: athrow
    //   332: aload_0
    //   333: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   336: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   339: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectFlowMappingSimpleValue
    //   342: dup
    //   343: aload_0
    //   344: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   347: aconst_null
    //   348: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   351: invokevirtual push : (Ljava/lang/Object;)V
    //   354: aload_0
    //   355: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   358: iconst_0
    //   359: iconst_1
    //   360: iconst_1
    //   361: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   364: goto -> 415
    //   367: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   370: athrow
    //   371: aload_0
    //   372: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   375: ldc '?'
    //   377: iconst_1
    //   378: iconst_0
    //   379: iconst_0
    //   380: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   383: aload_0
    //   384: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   387: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   390: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectFlowMappingValue
    //   393: dup
    //   394: aload_0
    //   395: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   398: aconst_null
    //   399: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   402: invokevirtual push : (Ljava/lang/Object;)V
    //   405: aload_0
    //   406: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   409: iconst_0
    //   410: iconst_1
    //   411: iconst_0
    //   412: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   415: return
    // Exception table:
    //   from	to	target	type
    //   0	55	58	java/io/IOException
    //   13	81	84	java/io/IOException
    //   88	108	111	java/io/IOException
    //   170	244	247	java/io/IOException
    //   227	261	264	java/io/IOException
    //   251	281	284	java/io/IOException
    //   268	295	298	java/io/IOException
    //   302	325	328	java/io/IOException
    //   315	367	367	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectFlowMappingKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */