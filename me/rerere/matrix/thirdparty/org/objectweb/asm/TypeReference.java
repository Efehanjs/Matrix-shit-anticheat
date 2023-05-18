package me.rerere.matrix.thirdparty.org.objectweb.asm;

public class TypeReference {
  public static final int THROWS = 23;
  
  public static final int METHOD_INVOCATION_TYPE_ARGUMENT = 73;
  
  public static final int METHOD_FORMAL_PARAMETER = 22;
  
  public static final int METHOD_REFERENCE_TYPE_ARGUMENT = 75;
  
  public static final int EXCEPTION_PARAMETER = 66;
  
  public static final int METHOD_TYPE_PARAMETER_BOUND = 18;
  
  public static final int LOCAL_VARIABLE = 64;
  
  public static final int INSTANCEOF = 67;
  
  public static final int FIELD = 19;
  
  public static final int CAST = 71;
  
  public static final int CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT = 72;
  
  public static final int CONSTRUCTOR_REFERENCE = 69;
  
  public static final int CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT = 74;
  
  public static final int METHOD_RETURN = 20;
  
  public static final int METHOD_RECEIVER = 21;
  
  public static final int METHOD_REFERENCE = 70;
  
  public static final int CLASS_TYPE_PARAMETER = 0;
  
  private final int targetTypeAndInfo;
  
  public static final int NEW = 68;
  
  public static final int RESOURCE_VARIABLE = 65;
  
  public static final int CLASS_TYPE_PARAMETER_BOUND = 17;
  
  public static final int CLASS_EXTENDS = 16;
  
  public static final int METHOD_TYPE_PARAMETER = 1;
  
  public static TypeReference newTryCatchReference(int paramInt) {
    return new TypeReference(0x42000000 | paramInt << 8);
  }
  
  public int getSuperTypeIndex() {
    return (short)((this.targetTypeAndInfo & 0xFFFF00) >> 8);
  }
  
  public int getFormalParameterIndex() {
    return (this.targetTypeAndInfo & 0xFF0000) >> 16;
  }
  
  public int getTypeArgumentIndex() {
    return this.targetTypeAndInfo & 0xFF;
  }
  
  public int getTryCatchBlockIndex() {
    return (this.targetTypeAndInfo & 0xFFFF00) >> 8;
  }
  
  public static TypeReference newTypeParameterReference(int paramInt1, int paramInt2) {
    return new TypeReference(paramInt1 << 24 | paramInt2 << 16);
  }
  
  public static TypeReference newTypeArgumentReference(int paramInt1, int paramInt2) {
    return new TypeReference(paramInt1 << 24 | paramInt2);
  }
  
  public int getTypeParameterBoundIndex() {
    return (this.targetTypeAndInfo & 0xFF00) >> 8;
  }
  
  public TypeReference(int paramInt) {
    this.targetTypeAndInfo = paramInt;
  }
  
  public static TypeReference newFormalParameterReference(int paramInt) {
    return new TypeReference(0x16000000 | paramInt << 16);
  }
  
  public int getTypeParameterIndex() {
    return (this.targetTypeAndInfo & 0xFF0000) >> 16;
  }
  
  public static TypeReference newTypeReference(int paramInt) {
    return new TypeReference(paramInt << 24);
  }
  
  public static TypeReference newTypeParameterBoundReference(int paramInt1, int paramInt2, int paramInt3) {
    return new TypeReference(paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8);
  }
  
  public int getExceptionIndex() {
    return (this.targetTypeAndInfo & 0xFFFF00) >> 8;
  }
  
  public static void putTarget(int paramInt, ByteVector paramByteVector) {
    try {
      switch (paramInt >>> 24) {
        case 0:
        case 1:
        case 22:
          paramByteVector.putShort(paramInt >>> 16);
          return;
        case 19:
        case 20:
        case 21:
          paramByteVector.putByte(paramInt >>> 24);
          return;
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
          paramByteVector.putInt(paramInt);
          return;
        case 16:
        case 17:
        case 18:
        case 23:
        case 66:
        case 67:
        case 68:
        case 69:
        case 70:
          paramByteVector.put12(paramInt >>> 24, (paramInt & 0xFFFF00) >> 8);
          return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException();
  }
  
  public static TypeReference newExceptionReference(int paramInt) {
    return new TypeReference(0x17000000 | paramInt << 8);
  }
  
  public static TypeReference newSuperTypeReference(int paramInt) {
    return new TypeReference(0x10000000 | (paramInt & 0xFFFF) << 8);
  }
  
  public int getSort() {
    return this.targetTypeAndInfo >>> 24;
  }
  
  public int getValue() {
    return this.targetTypeAndInfo;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\TypeReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */