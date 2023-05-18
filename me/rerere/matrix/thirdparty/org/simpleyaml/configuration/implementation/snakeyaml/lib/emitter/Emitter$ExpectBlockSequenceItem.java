package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectBlockSequenceItem implements EmitterState {
  private final boolean first;
  
  public void expect() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield first : Z
    //   4: ifne -> 76
    //   7: aload_0
    //   8: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   11: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   14: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/SequenceEndEvent
    //   17: ifeq -> 76
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   26: athrow
    //   27: aload_0
    //   28: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   31: aload_0
    //   32: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   35: invokestatic access$2100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   38: invokevirtual pop : ()Ljava/lang/Object;
    //   41: checkcast java/lang/Integer
    //   44: invokestatic access$2002 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   47: pop
    //   48: aload_0
    //   49: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   52: aload_0
    //   53: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   56: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   59: invokevirtual pop : ()Ljava/lang/Object;
    //   62: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState
    //   65: invokestatic access$202 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;
    //   68: pop
    //   69: goto -> 421
    //   72: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   75: athrow
    //   76: aload_0
    //   77: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   80: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   83: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/CommentEvent
    //   86: ifeq -> 114
    //   89: aload_0
    //   90: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   93: invokestatic access$1400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   96: aload_0
    //   97: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   100: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   103: invokevirtual collectEvents : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   106: pop
    //   107: goto -> 421
    //   110: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   113: athrow
    //   114: aload_0
    //   115: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   118: invokevirtual writeIndent : ()V
    //   121: aload_0
    //   122: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   125: invokestatic access$3600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   128: ifeq -> 145
    //   131: aload_0
    //   132: getfield first : Z
    //   135: ifeq -> 166
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   144: athrow
    //   145: aload_0
    //   146: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   149: aload_0
    //   150: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   153: invokestatic access$3700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   156: invokestatic access$3800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;I)V
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   165: athrow
    //   166: aload_0
    //   167: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   170: ldc '-'
    //   172: iconst_1
    //   173: iconst_0
    //   174: iconst_1
    //   175: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   178: aload_0
    //   179: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   182: invokestatic access$3600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   185: ifeq -> 238
    //   188: aload_0
    //   189: getfield first : Z
    //   192: ifeq -> 238
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   201: athrow
    //   202: aload_0
    //   203: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   206: aload_0
    //   207: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   210: invokestatic access$2000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Integer;
    //   213: invokevirtual intValue : ()I
    //   216: aload_0
    //   217: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   220: invokestatic access$3700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   223: iadd
    //   224: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   227: invokestatic access$2002 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   230: pop
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   237: athrow
    //   238: aload_0
    //   239: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   242: invokestatic access$1400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   245: invokevirtual isEmpty : ()Z
    //   248: ifne -> 370
    //   251: aload_0
    //   252: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   255: iconst_0
    //   256: iconst_0
    //   257: invokestatic access$3900 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZ)V
    //   260: aload_0
    //   261: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   264: invokestatic access$1500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)V
    //   267: aload_0
    //   268: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   271: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   274: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/ScalarEvent
    //   277: ifeq -> 349
    //   280: goto -> 287
    //   283: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   286: athrow
    //   287: aload_0
    //   288: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   291: aload_0
    //   292: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   295: aload_0
    //   296: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   299: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   302: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/ScalarEvent
    //   305: invokevirtual getValue : ()Ljava/lang/String;
    //   308: invokestatic access$4100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/ScalarAnalysis;
    //   311: invokestatic access$4002 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/ScalarAnalysis;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/ScalarAnalysis;
    //   314: pop
    //   315: aload_0
    //   316: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   319: invokestatic access$4000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/ScalarAnalysis;
    //   322: invokevirtual isEmpty : ()Z
    //   325: ifne -> 349
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   334: athrow
    //   335: aload_0
    //   336: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   339: invokevirtual writeIndent : ()V
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   348: athrow
    //   349: aload_0
    //   350: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   353: aload_0
    //   354: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   357: invokestatic access$2100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   360: invokevirtual pop : ()Ljava/lang/Object;
    //   363: checkcast java/lang/Integer
    //   366: invokestatic access$2002 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   369: pop
    //   370: aload_0
    //   371: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   374: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   377: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectBlockSequenceItem
    //   380: dup
    //   381: aload_0
    //   382: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   385: iconst_0
    //   386: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Z)V
    //   389: invokevirtual push : (Ljava/lang/Object;)V
    //   392: aload_0
    //   393: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   396: iconst_0
    //   397: iconst_0
    //   398: iconst_0
    //   399: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   402: aload_0
    //   403: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   406: invokestatic access$2300 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   409: invokevirtual collectEvents : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   412: pop
    //   413: aload_0
    //   414: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   417: invokestatic access$2400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   420: pop
    //   421: return
    // Exception table:
    //   from	to	target	type
    //   0	20	23	java/io/IOException
    //   7	72	72	java/io/IOException
    //   76	110	110	java/io/IOException
    //   114	138	141	java/io/IOException
    //   131	159	162	java/io/IOException
    //   166	195	198	java/io/IOException
    //   188	231	234	java/io/IOException
    //   238	280	283	java/io/IOException
    //   251	328	331	java/io/IOException
    //   287	342	345	java/io/IOException
  }
  
  public Emitter$ExpectBlockSequenceItem(boolean paramBoolean) {
    this.first = paramBoolean;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectBlockSequenceItem.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */