package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectFlowMappingValue implements EmitterState {
  public void expect() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   4: invokestatic access$1000 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   7: invokevirtual booleanValue : ()Z
    //   10: ifne -> 57
    //   13: aload_0
    //   14: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   17: invokestatic access$2500 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   20: aload_0
    //   21: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   24: invokestatic access$2600 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)I
    //   27: if_icmpgt -> 57
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   36: athrow
    //   37: aload_0
    //   38: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   41: invokestatic access$2800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Ljava/lang/Boolean;
    //   44: invokevirtual booleanValue : ()Z
    //   47: ifeq -> 71
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   61: invokevirtual writeIndent : ()V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: aload_0
    //   72: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   75: ldc ':'
    //   77: iconst_1
    //   78: iconst_0
    //   79: iconst_0
    //   80: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   83: aload_0
    //   84: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   87: aload_0
    //   88: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   91: invokestatic access$2300 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   94: aload_0
    //   95: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   98: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   101: invokevirtual collectEventsAndPoll : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   104: invokestatic access$102 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   107: pop
    //   108: aload_0
    //   109: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   112: invokestatic access$2400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   115: pop
    //   116: aload_0
    //   117: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   120: invokestatic access$1700 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/ArrayStack;
    //   123: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$ExpectFlowMappingKey
    //   126: dup
    //   127: aload_0
    //   128: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   131: aconst_null
    //   132: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter$1;)V
    //   135: invokevirtual push : (Ljava/lang/Object;)V
    //   138: aload_0
    //   139: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   142: iconst_0
    //   143: iconst_1
    //   144: iconst_0
    //   145: invokestatic access$1800 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;ZZZ)V
    //   148: aload_0
    //   149: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   152: invokestatic access$2300 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/comments/CommentEventsCollector;
    //   155: aload_0
    //   156: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   159: invokestatic access$100 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   162: invokevirtual collectEvents : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/events/Event;
    //   165: pop
    //   166: aload_0
    //   167: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;
    //   170: invokestatic access$2400 : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter;)Z
    //   173: pop
    //   174: return
    // Exception table:
    //   from	to	target	type
    //   0	30	33	java/io/IOException
    //   13	50	53	java/io/IOException
    //   37	64	67	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectFlowMappingValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */