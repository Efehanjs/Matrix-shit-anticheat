package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class RecordComponentWriter extends RecordComponentVisitor {
  private int signatureIndex;
  
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
  
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
  
  private Attribute firstAttribute;
  
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
  
  private AnnotationWriter lastRuntimeVisibleAnnotation;
  
  private final int descriptorIndex;
  
  private final SymbolTable symbolTable;
  
  private final int nameIndex;
  
  public void visitAttribute(Attribute paramAttribute) {
    paramAttribute.nextAttribute = this.firstAttribute;
    this.firstAttribute = paramAttribute;
  }
  
  public final void collectAttributePrototypes(Attribute$Set paramAttribute$Set) {
    paramAttribute$Set.addAttributes(this.firstAttribute);
  }
  
  public RecordComponentWriter(SymbolTable paramSymbolTable, String paramString1, String paramString2, String paramString3) {
    super(589824);
    this.symbolTable = paramSymbolTable;
    this.nameIndex = paramSymbolTable.addConstantUtf8(paramString1);
    this.descriptorIndex = paramSymbolTable.addConstantUtf8(paramString2);
    if (paramString3 != null)
      this.signatureIndex = paramSymbolTable.addConstantUtf8(paramString3); 
  }
  
  public int computeRecordComponentInfoSize() {
    int i = 6;
    i += Attribute.computeAttributesSize(this.symbolTable, 0, this.signatureIndex);
    i += AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
    if (this.firstAttribute != null)
      i += this.firstAttribute.computeAttributesSize(this.symbolTable); 
    return i;
  }
  
  public void putRecordComponentInfo(ByteVector paramByteVector) {
    paramByteVector.putShort(this.nameIndex).putShort(this.descriptorIndex);
    int i = 0;
    try {
      if (this.signatureIndex != 0)
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
      Attribute.putAttributes(this.symbolTable, 0, this.signatureIndex, paramByteVector);
      AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, paramByteVector);
      if (this.firstAttribute != null)
        this.firstAttribute.putAttributes(this.symbolTable, paramByteVector); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeVisibleTypeAnnotation); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.lastRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeInvisibleTypeAnnotation);
  }
  
  public void visitEnd() {}
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeVisibleAnnotation); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.lastRuntimeInvisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeInvisibleAnnotation);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\RecordComponentWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */