package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class Handler {
  public Handler nextHandler;
  
  public final Label endPc;
  
  public final String catchTypeDescriptor;
  
  public final int catchType;
  
  public final Label handlerPc;
  
  public final Label startPc;
  
  public static int getExceptionTableLength(Handler paramHandler) {
    byte b = 0;
    for (Handler handler = paramHandler; handler != null; handler = handler.nextHandler)
      b++; 
    return b;
  }
  
  public Handler(Handler paramHandler, Label paramLabel1, Label paramLabel2) {
    this(paramLabel1, paramLabel2, paramHandler.handlerPc, paramHandler.catchType, paramHandler.catchTypeDescriptor);
    this.nextHandler = paramHandler.nextHandler;
  }
  
  public Handler(Label paramLabel1, Label paramLabel2, Label paramLabel3, int paramInt, String paramString) {
    this.startPc = paramLabel1;
    this.endPc = paramLabel2;
    this.handlerPc = paramLabel3;
    this.catchType = paramInt;
    this.catchTypeDescriptor = paramString;
  }
  
  public static void putExceptionTable(Handler paramHandler, ByteVector paramByteVector) {
    paramByteVector.putShort(getExceptionTableLength(paramHandler));
    for (Handler handler = paramHandler; handler != null; handler = handler.nextHandler)
      paramByteVector.putShort(handler.startPc.bytecodeOffset).putShort(handler.endPc.bytecodeOffset).putShort(handler.handlerPc.bytecodeOffset).putShort(handler.catchType); 
  }
  
  public static Handler removeRange(Handler paramHandler, Label paramLabel1, Label paramLabel2) {
    try {
      if (paramHandler == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramHandler.nextHandler = removeRange(paramHandler.nextHandler, paramLabel1, paramLabel2);
    int i = paramHandler.startPc.bytecodeOffset;
    int j = paramHandler.endPc.bytecodeOffset;
    int k = paramLabel1.bytecodeOffset;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int m = (paramLabel2 == null) ? Integer.MAX_VALUE : paramLabel2.bytecodeOffset;
    try {
      if (k < j)
        try {
          if (m > i) {
            try {
              if (k <= i) {
                try {
                  if (m >= j)
                    return paramHandler.nextHandler; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                return new Handler(paramHandler, paramLabel2, paramHandler.endPc);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (m >= j)
                return new Handler(paramHandler, paramHandler.startPc, paramLabel1); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            paramHandler.nextHandler = new Handler(paramHandler, paramLabel2, paramHandler.endPc);
            return new Handler(paramHandler, paramHandler.startPc, paramLabel1);
          } 
          return paramHandler;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramHandler;
  }
  
  public static int getExceptionTableSize(Handler paramHandler) {
    return 2 + 8 * getExceptionTableLength(paramHandler);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Handler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */