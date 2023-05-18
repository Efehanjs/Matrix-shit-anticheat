package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class FieldWriter extends FieldVisitor {
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
  
  private int signatureIndex;
  
  private final SymbolTable symbolTable;
  
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
  
  private int constantValueIndex;
  
  private final int nameIndex;
  
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
  
  private Attribute firstAttribute;
  
  private final int descriptorIndex;
  
  private final int accessFlags;
  
  private AnnotationWriter lastRuntimeVisibleAnnotation;
  
  private static final long b = o3.a(8185704416533612104L, -7803148743811806508L, null).a(45075083994671L);
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeVisibleAnnotation); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.lastRuntimeInvisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeInvisibleAnnotation);
  }
  
  public FieldWriter(SymbolTable paramSymbolTable, int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
    super(589824);
    this.symbolTable = paramSymbolTable;
    this.accessFlags = paramInt;
    this.nameIndex = paramSymbolTable.addConstantUtf8(paramString1);
    this.descriptorIndex = paramSymbolTable.addConstantUtf8(paramString2);
    if (paramString3 != null)
      this.signatureIndex = paramSymbolTable.addConstantUtf8(paramString3); 
    try {
      if (paramObject != null)
        this.constantValueIndex = (paramSymbolTable.addConstant(paramObject)).index; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public int computeFieldInfoSize() {
    long l = b ^ 0x15CC4C94B979L;
    int i = 8;
    try {
      if (this.constantValueIndex != 0) {
        this.symbolTable.addConstantUtf8("ConstantValue");
        i += 8;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    i += Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex);
    i += AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
    if (this.firstAttribute != null)
      i += this.firstAttribute.computeAttributesSize(this.symbolTable); 
    return i;
  }
  
  public void putFieldInfo(ByteVector paramByteVector) {
    long l = b ^ 0xED7E70C6101L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool1 = (this.symbolTable.getMajorVersion() < 49) ? true : false;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool2 = bool1 ? true : false;
    paramByteVector.putShort(this.accessFlags & (bool2 ^ 0xFFFFFFFF)).putShort(this.nameIndex).putShort(this.descriptorIndex);
    int i = 0;
    try {
      if (this.constantValueIndex != 0)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((this.accessFlags & 0x1000) != 0)
        try {
          if (bool1)
            i++; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.signatureIndex != 0)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((this.accessFlags & 0x20000) != 0)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.lastRuntimeVisibleAnnotation != null)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.lastRuntimeInvisibleAnnotation != null)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.lastRuntimeVisibleTypeAnnotation != null)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.lastRuntimeInvisibleTypeAnnotation != null)
        i++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (this.firstAttribute != null)
      i += this.firstAttribute.getAttributeCount(); 
    try {
      paramByteVector.putShort(i);
      if (this.constantValueIndex != 0)
        paramByteVector.putShort(this.symbolTable.addConstantUtf8("ConstantValue")).putInt(2).putShort(this.constantValueIndex); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, paramByteVector);
      AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, paramByteVector);
      if (this.firstAttribute != null)
        this.firstAttribute.putAttributes(this.symbolTable, paramByteVector); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void visitAttribute(Attribute paramAttribute) {
    paramAttribute.nextAttribute = this.firstAttribute;
    this.firstAttribute = paramAttribute;
  }
  
  public final void collectAttributePrototypes(Attribute$Set paramAttribute$Set) {
    paramAttribute$Set.addAttributes(this.firstAttribute);
  }
  
  public void visitEnd() {}
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeVisibleTypeAnnotation); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.lastRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeInvisibleTypeAnnotation);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\FieldWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */