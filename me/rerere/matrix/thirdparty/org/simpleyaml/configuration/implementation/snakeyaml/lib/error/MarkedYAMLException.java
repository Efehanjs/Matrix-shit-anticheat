package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class MarkedYAMLException extends YAMLException {
  private final Mark problemMark;
  
  private final Mark contextMark;
  
  private final String note;
  
  private final String problem;
  
  private final String context;
  
  private static final long serialVersionUID = -9119388488683035101L;
  
  private static final long b = o3.a(-2947398709626441908L, 4264546868875902670L, MethodHandles.lookup().lookupClass()).a(137314396623988L);
  
  public String getContext() {
    return this.context;
  }
  
  public String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield context : Ljava/lang/String;
    //   12: ifnull -> 38
    //   15: aload_1
    //   16: aload_0
    //   17: getfield context : Ljava/lang/String;
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_1
    //   25: ldc '\\n'
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: goto -> 38
    //   34: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield contextMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   42: ifnull -> 171
    //   45: aload_0
    //   46: getfield problem : Ljava/lang/String;
    //   49: ifnull -> 148
    //   52: goto -> 59
    //   55: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   58: athrow
    //   59: aload_0
    //   60: getfield problemMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   63: ifnull -> 148
    //   66: goto -> 73
    //   69: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield contextMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   77: invokevirtual getName : ()Ljava/lang/String;
    //   80: aload_0
    //   81: getfield problemMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   84: invokevirtual getName : ()Ljava/lang/String;
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifne -> 148
    //   93: goto -> 100
    //   96: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   99: athrow
    //   100: aload_0
    //   101: getfield contextMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   104: invokevirtual getLine : ()I
    //   107: aload_0
    //   108: getfield problemMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   111: invokevirtual getLine : ()I
    //   114: if_icmpne -> 148
    //   117: goto -> 124
    //   120: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   123: athrow
    //   124: aload_0
    //   125: getfield contextMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   128: invokevirtual getColumn : ()I
    //   131: aload_0
    //   132: getfield problemMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   135: invokevirtual getColumn : ()I
    //   138: if_icmpeq -> 171
    //   141: goto -> 148
    //   144: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   147: athrow
    //   148: aload_1
    //   149: aload_0
    //   150: getfield contextMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   153: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_1
    //   158: ldc '\\n'
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: goto -> 171
    //   167: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   170: athrow
    //   171: aload_0
    //   172: getfield problem : Ljava/lang/String;
    //   175: ifnull -> 201
    //   178: aload_1
    //   179: aload_0
    //   180: getfield problem : Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_1
    //   188: ldc '\\n'
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: goto -> 201
    //   197: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   200: athrow
    //   201: aload_0
    //   202: getfield problemMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   205: ifnull -> 231
    //   208: aload_1
    //   209: aload_0
    //   210: getfield problemMark : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   213: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload_1
    //   218: ldc '\\n'
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: goto -> 231
    //   227: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   230: athrow
    //   231: aload_0
    //   232: getfield note : Ljava/lang/String;
    //   235: ifnull -> 261
    //   238: aload_1
    //   239: aload_0
    //   240: getfield note : Ljava/lang/String;
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload_1
    //   248: ldc '\\n'
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: goto -> 261
    //   257: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException;
    //   260: athrow
    //   261: aload_1
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: areturn
    // Exception table:
    //   from	to	target	type
    //   8	31	34	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   38	52	55	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   45	66	69	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   59	93	96	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   73	117	120	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   100	141	144	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   124	164	167	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   171	194	197	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   201	224	227	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
    //   231	254	257	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/MarkedYAMLException
  }
  
  public String getProblem() {
    return this.problem;
  }
  
  public MarkedYAMLException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2, String paramString3, Throwable paramThrowable) {
    super(paramString1 + "; " + paramString2 + "; " + paramMark2, paramThrowable);
    this.context = paramString1;
    this.contextMark = paramMark1;
    this.problem = paramString2;
    this.problemMark = paramMark2;
    this.note = paramString3;
  }
  
  public Mark getProblemMark() {
    return this.problemMark;
  }
  
  public MarkedYAMLException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2) {
    this(paramString1, paramMark1, paramString2, paramMark2, null, null);
  }
  
  public Mark getContextMark() {
    return this.contextMark;
  }
  
  public MarkedYAMLException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2, Throwable paramThrowable) {
    this(paramString1, paramMark1, paramString2, paramMark2, null, paramThrowable);
  }
  
  public MarkedYAMLException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2, String paramString3) {
    this(paramString1, paramMark1, paramString2, paramMark2, paramString3, null);
  }
  
  public String getMessage() {
    return toString();
  }
  
  private static MarkedYAMLException a(MarkedYAMLException paramMarkedYAMLException) {
    return paramMarkedYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\error\MarkedYAMLException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */