package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectFlowSequenceItem implements EmitterState {
  public void expect() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   4: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   7: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/SequenceEndEvent
    //   10: ifeq -> 197
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
    //   81: goto -> 115
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
    //   119: ldc ']'
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
    //   150: invokestatic access$2800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   153: invokevirtual booleanValue : ()Z
    //   156: ifeq -> 173
    //   159: aload_0
    //   160: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   163: invokevirtual writeIndent : ()V
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   172: athrow
    //   173: aload_0
    //   174: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   177: aload_0
    //   178: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   181: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   184: invokevirtual pop : ()Ljava/lang/Object;
    //   187: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState
    //   190: invokestatic access$202 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;
    //   193: pop
    //   194: goto -> 413
    //   197: aload_0
    //   198: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   201: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   204: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/CommentEvent
    //   207: ifeq -> 242
    //   210: aload_0
    //   211: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   214: aload_0
    //   215: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   218: invokestatic access$1400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   221: aload_0
    //   222: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   225: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   228: invokevirtual collectEvents : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   231: invokestatic access$102 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   234: pop
    //   235: goto -> 413
    //   238: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   241: athrow
    //   242: aload_0
    //   243: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   246: ldc ','
    //   248: iconst_0
    //   249: iconst_0
    //   250: iconst_0
    //   251: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   254: aload_0
    //   255: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   258: invokestatic access$1500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)V
    //   261: aload_0
    //   262: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   265: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   268: invokevirtual booleanValue : ()Z
    //   271: ifne -> 335
    //   274: aload_0
    //   275: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   278: invokestatic access$2500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   281: aload_0
    //   282: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   285: invokestatic access$2600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   288: if_icmple -> 315
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   297: athrow
    //   298: aload_0
    //   299: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   302: invokestatic access$2700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   305: ifne -> 335
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   314: athrow
    //   315: aload_0
    //   316: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   319: invokestatic access$2800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   322: invokevirtual booleanValue : ()Z
    //   325: ifeq -> 349
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
    //   353: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   356: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectFlowSequenceItem
    //   359: dup
    //   360: aload_0
    //   361: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   364: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)V
    //   367: invokevirtual push : (Ljava/lang/Object;)V
    //   370: aload_0
    //   371: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   374: iconst_0
    //   375: iconst_0
    //   376: iconst_0
    //   377: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   380: aload_0
    //   381: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   384: aload_0
    //   385: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   388: invokestatic access$2300 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   391: aload_0
    //   392: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   395: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   398: invokevirtual collectEvents : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   401: invokestatic access$102 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   404: pop
    //   405: aload_0
    //   406: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   409: invokestatic access$2400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   412: pop
    //   413: return
    // Exception table:
    //   from	to	target	type
    //   0	55	58	java/io/IOException
    //   13	84	84	java/io/IOException
    //   88	108	111	java/io/IOException
    //   115	166	169	java/io/IOException
    //   197	238	238	java/io/IOException
    //   242	291	294	java/io/IOException
    //   274	308	311	java/io/IOException
    //   298	328	331	java/io/IOException
    //   315	342	345	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectFlowSequenceItem.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */