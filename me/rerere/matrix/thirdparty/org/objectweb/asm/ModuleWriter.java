package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class ModuleWriter extends ModuleVisitor {
  private int providesCount;
  
  private final ByteVector requires;
  
  private int usesCount;
  
  private final ByteVector opens;
  
  private final ByteVector provides;
  
  private int packageCount;
  
  private final ByteVector usesIndex;
  
  private int mainClassIndex;
  
  private int opensCount;
  
  private final ByteVector exports;
  
  private final int moduleVersionIndex;
  
  private final SymbolTable symbolTable;
  
  private final int moduleFlags;
  
  private int exportsCount;
  
  private final int moduleNameIndex;
  
  private final ByteVector packageIndex;
  
  private int requiresCount;
  
  private static final long b = o3.a(8021559613190224578L, 4875680302861568768L, null).a(186660548461591L);
  
  public void visitExport(String paramString, int paramInt, String... paramVarArgs) {
    try {
      this.exports.putShort((this.symbolTable.addConstantPackage(paramString)).index).putShort(paramInt);
      if (paramVarArgs == null) {
        this.exports.putShort(0);
      } else {
        this.exports.putShort(paramVarArgs.length);
        for (String str : paramVarArgs)
          this.exports.putShort((this.symbolTable.addConstantModule(str)).index); 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.exportsCount++;
  }
  
  public void putAttributes(ByteVector paramByteVector) {
    long l = b ^ 0x1E69297349ECL;
    int i = 16 + this.requires.length + this.exports.length + this.opens.length + this.usesIndex.length + this.provides.length;
    try {
      paramByteVector.putShort(this.symbolTable.addConstantUtf8("Module")).putInt(i).putShort(this.moduleNameIndex).putShort(this.moduleFlags).putShort(this.moduleVersionIndex).putShort(this.requiresCount).putByteArray(this.requires.data, 0, this.requires.length).putShort(this.exportsCount).putByteArray(this.exports.data, 0, this.exports.length).putShort(this.opensCount).putByteArray(this.opens.data, 0, this.opens.length).putShort(this.usesCount).putByteArray(this.usesIndex.data, 0, this.usesIndex.length).putShort(this.providesCount).putByteArray(this.provides.data, 0, this.provides.length);
      if (this.packageCount > 0)
        paramByteVector.putShort(this.symbolTable.addConstantUtf8("ModulePackages")).putInt(2 + this.packageIndex.length).putShort(this.packageCount).putByteArray(this.packageIndex.data, 0, this.packageIndex.length); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.mainClassIndex > 0)
        paramByteVector.putShort(this.symbolTable.addConstantUtf8("ModuleMainClass")).putInt(2).putShort(this.mainClassIndex); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void visitProvide(String paramString, String... paramVarArgs) {
    this.provides.putShort((this.symbolTable.addConstantClass(paramString)).index);
    this.provides.putShort(paramVarArgs.length);
    for (String str : paramVarArgs)
      this.provides.putShort((this.symbolTable.addConstantClass(str)).index); 
    this.providesCount++;
  }
  
  public void visitMainClass(String paramString) {
    this.mainClassIndex = (this.symbolTable.addConstantClass(paramString)).index;
  }
  
  public void visitPackage(String paramString) {
    this.packageIndex.putShort((this.symbolTable.addConstantPackage(paramString)).index);
    this.packageCount++;
  }
  
  public ModuleWriter(SymbolTable paramSymbolTable, int paramInt1, int paramInt2, int paramInt3) {
    super(589824);
    this.symbolTable = paramSymbolTable;
    this.moduleNameIndex = paramInt1;
    this.moduleFlags = paramInt2;
    this.moduleVersionIndex = paramInt3;
    this.requires = new ByteVector();
    this.exports = new ByteVector();
    this.opens = new ByteVector();
    this.usesIndex = new ByteVector();
    this.provides = new ByteVector();
    this.packageIndex = new ByteVector();
  }
  
  public void visitRequire(String paramString1, int paramInt, String paramString2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.requires.putShort((this.symbolTable.addConstantModule(paramString1)).index).putShort(paramInt).putShort((paramString2 == null) ? 0 : this.symbolTable.addConstantUtf8(paramString2));
    this.requiresCount++;
  }
  
  public void visitEnd() {}
  
  public int getAttributeCount() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 1 + ((this.packageCount > 0) ? 1 : 0) + ((this.mainClassIndex > 0) ? 1 : 0);
  }
  
  public void visitUse(String paramString) {
    this.usesIndex.putShort((this.symbolTable.addConstantClass(paramString)).index);
    this.usesCount++;
  }
  
  public void visitOpen(String paramString, int paramInt, String... paramVarArgs) {
    try {
      this.opens.putShort((this.symbolTable.addConstantPackage(paramString)).index).putShort(paramInt);
      if (paramVarArgs == null) {
        this.opens.putShort(0);
      } else {
        this.opens.putShort(paramVarArgs.length);
        for (String str : paramVarArgs)
          this.opens.putShort((this.symbolTable.addConstantModule(str)).index); 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.opensCount++;
  }
  
  public int computeAttributesSize() {
    long l = b ^ 0xFE4A955D1E2L;
    this.symbolTable.addConstantUtf8("Module");
    int i = 22 + this.requires.length + this.exports.length + this.opens.length + this.usesIndex.length + this.provides.length;
    if (this.packageCount > 0) {
      this.symbolTable.addConstantUtf8("ModulePackages");
      i += 8 + this.packageIndex.length;
    } 
    try {
      if (this.mainClassIndex > 0) {
        this.symbolTable.addConstantUtf8("ModuleMainClass");
        i += 8;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return i;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ModuleWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */