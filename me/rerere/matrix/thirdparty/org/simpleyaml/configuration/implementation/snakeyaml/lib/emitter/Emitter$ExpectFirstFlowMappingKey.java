package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectFirstFlowMappingKey implements EmitterState {
  public void expect() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   4: aload_0
    //   5: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   8: invokestatic access$1400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   11: aload_0
    //   12: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   15: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   18: invokevirtual collectEventsAndPoll : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   21: invokestatic access$102 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   24: pop
    //   25: aload_0
    //   26: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   29: invokestatic access$1500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)V
    //   32: aload_0
    //   33: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   36: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   39: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/MappingEndEvent
    //   42: ifeq -> 133
    //   45: aload_0
    //   46: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   49: aload_0
    //   50: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   53: invokestatic access$2100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   56: invokevirtual pop : ()Ljava/lang/Object;
    //   59: checkcast java/lang/Integer
    //   62: invokestatic access$2002 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   65: pop
    //   66: aload_0
    //   67: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   70: invokestatic access$2210 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   73: pop
    //   74: aload_0
    //   75: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   78: ldc '}'
    //   80: iconst_0
    //   81: iconst_0
    //   82: iconst_0
    //   83: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   86: aload_0
    //   87: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   90: invokestatic access$2300 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   93: invokevirtual collectEvents : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   96: pop
    //   97: aload_0
    //   98: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   101: invokestatic access$2400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   104: pop
    //   105: aload_0
    //   106: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   109: aload_0
    //   110: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   113: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   116: invokevirtual pop : ()Ljava/lang/Object;
    //   119: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState
    //   122: invokestatic access$202 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/EmitterState;
    //   125: pop
    //   126: goto -> 334
    //   129: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   132: athrow
    //   133: aload_0
    //   134: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   137: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   140: invokevirtual booleanValue : ()Z
    //   143: ifne -> 207
    //   146: aload_0
    //   147: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   150: invokestatic access$2500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   153: aload_0
    //   154: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   157: invokestatic access$2600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   160: if_icmple -> 187
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   169: athrow
    //   170: aload_0
    //   171: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   174: invokestatic access$2700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   177: ifne -> 207
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   186: athrow
    //   187: aload_0
    //   188: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   191: invokestatic access$2800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   194: invokevirtual booleanValue : ()Z
    //   197: ifeq -> 221
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   206: athrow
    //   207: aload_0
    //   208: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   211: invokevirtual writeIndent : ()V
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   220: athrow
    //   221: aload_0
    //   222: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   225: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   228: invokevirtual booleanValue : ()Z
    //   231: ifne -> 290
    //   234: aload_0
    //   235: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   238: invokestatic access$3100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   241: ifeq -> 290
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   250: athrow
    //   251: aload_0
    //   252: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   255: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   258: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectFlowMappingSimpleValue
    //   261: dup
    //   262: aload_0
    //   263: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   266: aconst_null
    //   267: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   270: invokevirtual push : (Ljava/lang/Object;)V
    //   273: aload_0
    //   274: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   277: iconst_0
    //   278: iconst_1
    //   279: iconst_1
    //   280: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   283: goto -> 334
    //   286: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   289: athrow
    //   290: aload_0
    //   291: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   294: ldc '?'
    //   296: iconst_1
    //   297: iconst_0
    //   298: iconst_0
    //   299: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   302: aload_0
    //   303: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   306: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   309: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectFlowMappingValue
    //   312: dup
    //   313: aload_0
    //   314: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   317: aconst_null
    //   318: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   321: invokevirtual push : (Ljava/lang/Object;)V
    //   324: aload_0
    //   325: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   328: iconst_0
    //   329: iconst_1
    //   330: iconst_0
    //   331: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   334: return
    // Exception table:
    //   from	to	target	type
    //   0	129	129	java/io/IOException
    //   133	163	166	java/io/IOException
    //   146	180	183	java/io/IOException
    //   170	200	203	java/io/IOException
    //   187	214	217	java/io/IOException
    //   221	244	247	java/io/IOException
    //   234	286	286	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectFirstFlowMappingKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */