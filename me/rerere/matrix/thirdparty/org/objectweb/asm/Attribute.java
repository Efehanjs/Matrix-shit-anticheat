package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public class Attribute {
  public final String type;
  
  private byte[] content;
  
  public Attribute nextAttribute;
  
  private static final long a = o3.a(4731646297009088721L, -1187711522613310009L, null).a(53018659002052L);
  
  public final void putAttributes(SymbolTable paramSymbolTable, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, ByteVector paramByteVector) {
    ClassWriter classWriter = paramSymbolTable.classWriter;
    for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
      ByteVector byteVector = attribute.write(classWriter, paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
      paramByteVector.putShort(paramSymbolTable.addConstantUtf8(attribute.type)).putInt(byteVector.length);
      paramByteVector.putByteArray(byteVector.data, 0, byteVector.length);
    } 
  }
  
  public static int computeAttributesSize(SymbolTable paramSymbolTable, int paramInt1, int paramInt2) {
    long l = a ^ 0x69E8A84F93E8L;
    boolean bool = false;
    try {
      if ((paramInt1 & 0x1000) != 0)
        try {
          if (paramSymbolTable.getMajorVersion() < 49) {
            paramSymbolTable.addConstantUtf8("Synthetic");
            bool += true;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt2 != 0) {
        paramSymbolTable.addConstantUtf8("Signature");
        bool += true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((paramInt1 & 0x20000) != 0) {
        paramSymbolTable.addConstantUtf8("Deprecated");
        bool += true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return bool;
  }
  
  public static void putAttributes(SymbolTable paramSymbolTable, int paramInt1, int paramInt2, ByteVector paramByteVector) {
    long l = a ^ 0x272D006D2F42L;
    try {
      if ((paramInt1 & 0x1000) != 0)
        try {
          if (paramSymbolTable.getMajorVersion() < 49)
            paramByteVector.putShort(paramSymbolTable.addConstantUtf8("Synthetic")).putInt(0); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt2 != 0)
        paramByteVector.putShort(paramSymbolTable.addConstantUtf8("Signature")).putInt(2).putShort(paramInt2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((paramInt1 & 0x20000) != 0)
        paramByteVector.putShort(paramSymbolTable.addConstantUtf8("Deprecated")).putInt(0); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final int getAttributeCount() {
    byte b = 0;
    for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute)
      b++; 
    return b;
  }
  
  public Label[] getLabels() {
    return new Label[0];
  }
  
  public ByteVector write(ClassWriter paramClassWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    return new ByteVector(this.content);
  }
  
  public final int computeAttributesSize(SymbolTable paramSymbolTable) {
    byte[] arrayOfByte = null;
    boolean bool = false;
    byte b1 = -1;
    byte b2 = -1;
    return computeAttributesSize(paramSymbolTable, arrayOfByte, 0, -1, -1);
  }
  
  public final int computeAttributesSize(SymbolTable paramSymbolTable, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    ClassWriter classWriter = paramSymbolTable.classWriter;
    int i = 0;
    for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
      paramSymbolTable.addConstantUtf8(attribute.type);
      i += 6 + (attribute.write(classWriter, paramArrayOfbyte, paramInt1, paramInt2, paramInt3)).length;
    } 
    return i;
  }
  
  public boolean isCodeAttribute() {
    return false;
  }
  
  public Attribute(String paramString) {
    this.type = paramString;
  }
  
  public Attribute read(ClassReader paramClassReader, int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3, Label[] paramArrayOfLabel) {
    Attribute attribute = new Attribute(this.type);
    attribute.content = new byte[paramInt2];
    System.arraycopy(paramClassReader.classFileBuffer, paramInt1, attribute.content, 0, paramInt2);
    return attribute;
  }
  
  public boolean isUnknown() {
    return true;
  }
  
  public final void putAttributes(SymbolTable paramSymbolTable, ByteVector paramByteVector) {
    byte[] arrayOfByte = null;
    boolean bool = false;
    byte b1 = -1;
    byte b2 = -1;
    putAttributes(paramSymbolTable, arrayOfByte, 0, -1, -1, paramByteVector);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Attribute.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */