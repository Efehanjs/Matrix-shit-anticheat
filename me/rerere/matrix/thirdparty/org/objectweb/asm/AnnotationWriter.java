package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class AnnotationWriter extends AnnotationVisitor {
  private final boolean useNamedValues;
  
  private int numElementValuePairs;
  
  private final AnnotationWriter previousAnnotation;
  
  private final int numElementValuePairsOffset;
  
  private final ByteVector annotation;
  
  private AnnotationWriter nextAnnotation;
  
  private final SymbolTable symbolTable;
  
  private static final long b = o3.a(3690177056862530952L, -2483585453076299733L, null).a(165371595100071L);
  
  public static AnnotationWriter create(SymbolTable paramSymbolTable, int paramInt, TypePath paramTypePath, String paramString, AnnotationWriter paramAnnotationWriter) {
    ByteVector byteVector = new ByteVector();
    TypeReference.putTarget(paramInt, byteVector);
    TypePath.put(paramTypePath, byteVector);
    byteVector.putShort(paramSymbolTable.addConstantUtf8(paramString)).putShort(0);
    return new AnnotationWriter(paramSymbolTable, true, byteVector, paramAnnotationWriter);
  }
  
  public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
    try {
      this.numElementValuePairs++;
      if (this.useNamedValues)
        this.annotation.putShort(this.symbolTable.addConstantUtf8(paramString1)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.annotation.put12(64, this.symbolTable.addConstantUtf8(paramString2)).putShort(0);
    return new AnnotationWriter(this.symbolTable, true, this.annotation, null);
  }
  
  public void visit(String paramString, Object paramObject) {
    long l = b ^ 0x23AD8777CD71L;
    try {
      this.numElementValuePairs++;
      if (this.useNamedValues)
        this.annotation.putShort(this.symbolTable.addConstantUtf8(paramString)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof String) {
        this.annotation.put12(115, this.symbolTable.addConstantUtf8((String)paramObject));
      } else {
        try {
          if (paramObject instanceof Byte) {
            this.annotation.put12(66, (this.symbolTable.addConstantInteger(((Byte)paramObject).byteValue())).index);
          } else {
            try {
              if (paramObject instanceof Boolean) {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                boolean bool = ((Boolean)paramObject).booleanValue() ? true : false;
                this.annotation.put12(90, (this.symbolTable.addConstantInteger(bool)).index);
              } else {
                try {
                  if (paramObject instanceof Character) {
                    this.annotation.put12(67, (this.symbolTable.addConstantInteger(((Character)paramObject).charValue())).index);
                  } else {
                    try {
                      if (paramObject instanceof Short) {
                        this.annotation.put12(83, (this.symbolTable.addConstantInteger(((Short)paramObject).shortValue())).index);
                      } else {
                        try {
                          if (paramObject instanceof Type) {
                            this.annotation.put12(99, this.symbolTable.addConstantUtf8(((Type)paramObject).getDescriptor()));
                          } else if (paramObject instanceof byte[]) {
                            byte[] arrayOfByte = (byte[])paramObject;
                            this.annotation.put12(91, arrayOfByte.length);
                            for (byte b : arrayOfByte)
                              this.annotation.put12(66, (this.symbolTable.addConstantInteger(b)).index); 
                          } else if (paramObject instanceof boolean[]) {
                            boolean[] arrayOfBoolean = (boolean[])paramObject;
                            this.annotation.put12(91, arrayOfBoolean.length);
                            for (boolean bool : arrayOfBoolean) {
                              try {
                              
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              } 
                              this.annotation.put12(90, (this.symbolTable.addConstantInteger(bool ? 1 : 0)).index);
                            } 
                          } else if (paramObject instanceof short[]) {
                            short[] arrayOfShort = (short[])paramObject;
                            this.annotation.put12(91, arrayOfShort.length);
                            for (short s : arrayOfShort)
                              this.annotation.put12(83, (this.symbolTable.addConstantInteger(s)).index); 
                          } else if (paramObject instanceof char[]) {
                            char[] arrayOfChar = (char[])paramObject;
                            this.annotation.put12(91, arrayOfChar.length);
                            for (char c : arrayOfChar)
                              this.annotation.put12(67, (this.symbolTable.addConstantInteger(c)).index); 
                          } else if (paramObject instanceof int[]) {
                            int[] arrayOfInt = (int[])paramObject;
                            this.annotation.put12(91, arrayOfInt.length);
                            for (int i : arrayOfInt)
                              this.annotation.put12(73, (this.symbolTable.addConstantInteger(i)).index); 
                          } else if (paramObject instanceof long[]) {
                            long[] arrayOfLong = (long[])paramObject;
                            this.annotation.put12(91, arrayOfLong.length);
                            for (long l1 : arrayOfLong)
                              this.annotation.put12(74, (this.symbolTable.addConstantLong(l1)).index); 
                          } else if (paramObject instanceof float[]) {
                            float[] arrayOfFloat = (float[])paramObject;
                            this.annotation.put12(91, arrayOfFloat.length);
                            for (float f : arrayOfFloat)
                              this.annotation.put12(70, (this.symbolTable.addConstantFloat(f)).index); 
                          } else if (paramObject instanceof double[]) {
                            double[] arrayOfDouble = (double[])paramObject;
                            this.annotation.put12(91, arrayOfDouble.length);
                            for (double d : arrayOfDouble)
                              this.annotation.put12(68, (this.symbolTable.addConstantDouble(d)).index); 
                          } else {
                            Symbol symbol = this.symbolTable.addConstant(paramObject);
                            this.annotation.put12(".s.IFJDCS".charAt(symbol.tag), symbol.index);
                          } 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public int computeAnnotationsSize(String paramString) {
    try {
      if (paramString != null)
        this.symbolTable.addConstantUtf8(paramString); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = 8;
    for (AnnotationWriter annotationWriter = this; annotationWriter != null; annotationWriter = annotationWriter.previousAnnotation)
      i += annotationWriter.annotation.length; 
    return i;
  }
  
  public static AnnotationWriter create(SymbolTable paramSymbolTable, String paramString, AnnotationWriter paramAnnotationWriter) {
    ByteVector byteVector = new ByteVector();
    byteVector.putShort(paramSymbolTable.addConstantUtf8(paramString)).putShort(0);
    return new AnnotationWriter(paramSymbolTable, true, byteVector, paramAnnotationWriter);
  }
  
  public static int computeAnnotationsSize(AnnotationWriter paramAnnotationWriter1, AnnotationWriter paramAnnotationWriter2, AnnotationWriter paramAnnotationWriter3, AnnotationWriter paramAnnotationWriter4) {
    long l = b ^ 0x2E6A4BF75072L;
    int i = 0;
    if (paramAnnotationWriter1 != null)
      i += paramAnnotationWriter1.computeAnnotationsSize("RuntimeVisibleAnnotations"); 
    if (paramAnnotationWriter2 != null)
      i += paramAnnotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations"); 
    if (paramAnnotationWriter3 != null)
      i += paramAnnotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations"); 
    if (paramAnnotationWriter4 != null)
      i += paramAnnotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations"); 
    return i;
  }
  
  public AnnotationVisitor visitArray(String paramString) {
    try {
      this.numElementValuePairs++;
      if (this.useNamedValues)
        this.annotation.putShort(this.symbolTable.addConstantUtf8(paramString)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.annotation.put12(91, 0);
    return new AnnotationWriter(this.symbolTable, false, this.annotation, null);
  }
  
  public void visitEnum(String paramString1, String paramString2, String paramString3) {
    try {
      this.numElementValuePairs++;
      if (this.useNamedValues)
        this.annotation.putShort(this.symbolTable.addConstantUtf8(paramString1)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.annotation.put12(101, this.symbolTable.addConstantUtf8(paramString2)).putShort(this.symbolTable.addConstantUtf8(paramString3));
  }
  
  public void putAnnotations(int paramInt, ByteVector paramByteVector) {
    int i = 2;
    byte b = 0;
    AnnotationWriter annotationWriter1 = this;
    AnnotationWriter annotationWriter2 = null;
    while (annotationWriter1 != null) {
      annotationWriter1.visitEnd();
      i += annotationWriter1.annotation.length;
      b++;
      annotationWriter2 = annotationWriter1;
      annotationWriter1 = annotationWriter1.previousAnnotation;
    } 
    paramByteVector.putShort(paramInt);
    paramByteVector.putInt(i);
    paramByteVector.putShort(b);
    for (annotationWriter1 = annotationWriter2; annotationWriter1 != null; annotationWriter1 = annotationWriter1.nextAnnotation)
      paramByteVector.putByteArray(annotationWriter1.annotation.data, 0, annotationWriter1.annotation.length); 
  }
  
  public static int computeParameterAnnotationsSize(String paramString, AnnotationWriter[] paramArrayOfAnnotationWriter, int paramInt) {
    int i = 7 + 2 * paramInt;
    for (byte b = 0; b < paramInt; b++) {
      AnnotationWriter annotationWriter = paramArrayOfAnnotationWriter[b];
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      i += (annotationWriter == null) ? 0 : (annotationWriter.computeAnnotationsSize(paramString) - 8);
    } 
    return i;
  }
  
  public static void putParameterAnnotations(int paramInt1, AnnotationWriter[] paramArrayOfAnnotationWriter, int paramInt2, ByteVector paramByteVector) {
    int i = 1 + 2 * paramInt2;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      AnnotationWriter annotationWriter = paramArrayOfAnnotationWriter[b];
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      i += (annotationWriter == null) ? 0 : (annotationWriter.computeAnnotationsSize(null) - 8);
    } 
    paramByteVector.putShort(paramInt1);
    paramByteVector.putInt(i);
    paramByteVector.putByte(paramInt2);
    for (b = 0; b < paramInt2; b++) {
      AnnotationWriter annotationWriter1 = paramArrayOfAnnotationWriter[b];
      AnnotationWriter annotationWriter2 = null;
      byte b1 = 0;
      while (annotationWriter1 != null) {
        annotationWriter1.visitEnd();
        b1++;
        annotationWriter2 = annotationWriter1;
        annotationWriter1 = annotationWriter1.previousAnnotation;
      } 
      paramByteVector.putShort(b1);
      for (annotationWriter1 = annotationWriter2; annotationWriter1 != null; annotationWriter1 = annotationWriter1.nextAnnotation)
        paramByteVector.putByteArray(annotationWriter1.annotation.data, 0, annotationWriter1.annotation.length); 
    } 
  }
  
  public void visitEnd() {
    if (this.numElementValuePairsOffset != -1) {
      byte[] arrayOfByte = this.annotation.data;
      arrayOfByte[this.numElementValuePairsOffset] = (byte)(this.numElementValuePairs >>> 8);
      arrayOfByte[this.numElementValuePairsOffset + 1] = (byte)this.numElementValuePairs;
    } 
  }
  
  public static void putAnnotations(SymbolTable paramSymbolTable, AnnotationWriter paramAnnotationWriter1, AnnotationWriter paramAnnotationWriter2, AnnotationWriter paramAnnotationWriter3, AnnotationWriter paramAnnotationWriter4, ByteVector paramByteVector) {
    long l = b ^ 0x6995F4B67963L;
    try {
      if (paramAnnotationWriter1 != null)
        paramAnnotationWriter1.putAnnotations(paramSymbolTable.addConstantUtf8("RuntimeVisibleAnnotations"), paramByteVector); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramAnnotationWriter2 != null)
        paramAnnotationWriter2.putAnnotations(paramSymbolTable.addConstantUtf8("RuntimeInvisibleAnnotations"), paramByteVector); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramAnnotationWriter3 != null)
        paramAnnotationWriter3.putAnnotations(paramSymbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), paramByteVector); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramAnnotationWriter4 != null)
        paramAnnotationWriter4.putAnnotations(paramSymbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), paramByteVector); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public AnnotationWriter(SymbolTable paramSymbolTable, boolean paramBoolean, ByteVector paramByteVector, AnnotationWriter paramAnnotationWriter) {
    super(589824);
    this.symbolTable = paramSymbolTable;
    this.useNamedValues = paramBoolean;
    this.annotation = paramByteVector;
    try {
      this.numElementValuePairsOffset = (paramByteVector.length == 0) ? -1 : (paramByteVector.length - 2);
      this.previousAnnotation = paramAnnotationWriter;
      if (paramAnnotationWriter != null)
        paramAnnotationWriter.nextAnnotation = this; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\AnnotationWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */