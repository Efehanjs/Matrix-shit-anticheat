package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public class ClassWriter extends ClassVisitor {
  private int superClass;
  
  private int signatureIndex;
  
  private int numberOfNestMemberClasses;
  
  private final int flags;
  
  private ModuleWriter moduleWriter;
  
  private final SymbolTable symbolTable;
  
  private RecordComponentWriter firstRecordComponent;
  
  private int[] interfaces;
  
  private ByteVector permittedSubclasses;
  
  private MethodWriter firstMethod;
  
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
  
  private AnnotationWriter lastRuntimeVisibleAnnotation;
  
  private RecordComponentWriter lastRecordComponent;
  
  private int thisClass;
  
  private Attribute firstAttribute;
  
  private int interfaceCount;
  
  private int accessFlags;
  
  private int version;
  
  private FieldWriter lastField;
  
  private ByteVector debugExtension;
  
  private ByteVector innerClasses;
  
  private int compute;
  
  public static final int COMPUTE_FRAMES = 2;
  
  private MethodWriter lastMethod;
  
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
  
  public static final int COMPUTE_MAXS = 1;
  
  private int numberOfInnerClasses;
  
  private int sourceFileIndex;
  
  private int nestHostClassIndex;
  
  private ByteVector nestMemberClasses;
  
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
  
  private FieldWriter firstField;
  
  private int numberOfPermittedSubclasses;
  
  private int enclosingMethodIndex;
  
  private int enclosingClassIndex;
  
  private static final long a = o3.a(3994795428897170115L, 6492859832987694375L, null).a(89870999835418L);
  
  public final RecordComponentVisitor visitRecordComponent(String paramString1, String paramString2, String paramString3) {
    RecordComponentWriter recordComponentWriter = new RecordComponentWriter(this.symbolTable, paramString1, paramString2, paramString3);
    try {
      if (this.firstRecordComponent == null) {
        this.firstRecordComponent = recordComponentWriter;
      } else {
        this.lastRecordComponent.delegate = recordComponentWriter;
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return this.lastRecordComponent = recordComponentWriter;
  }
  
  public int newUTF8(String paramString) {
    return this.symbolTable.addConstantUtf8(paramString);
  }
  
  public int newNameType(String paramString1, String paramString2) {
    return this.symbolTable.addConstantNameAndType(paramString1, paramString2);
  }
  
  public final void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
    try {
      if (this.innerClasses == null)
        this.innerClasses = new ByteVector(); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    Symbol symbol = this.symbolTable.addConstantClass(paramString1);
    try {
      if (symbol.info == 0) {
        try {
          this.numberOfInnerClasses++;
          this.innerClasses.putShort(symbol.index);
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        } 
        try {
          this.innerClasses.putShort((paramString2 == null) ? 0 : (this.symbolTable.addConstantClass(paramString2)).index);
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        } 
        this.innerClasses.putShort((paramString3 == null) ? 0 : this.symbolTable.addConstantUtf8(paramString3));
        this.innerClasses.putShort(paramInt);
        symbol.info = this.numberOfInnerClasses;
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
  }
  
  public final AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeVisibleTypeAnnotation); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return this.lastRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeInvisibleTypeAnnotation);
  }
  
  public final MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    MethodWriter methodWriter = new MethodWriter(this.symbolTable, paramInt, paramString1, paramString2, paramString3, paramArrayOfString, this.compute);
    try {
      if (this.firstMethod == null) {
        this.firstMethod = methodWriter;
      } else {
        this.lastMethod.mv = methodWriter;
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return this.lastMethod = methodWriter;
  }
  
  public byte[] toByteArray() {
    boolean bool1;
    long l = a ^ 0x1E2A082AF8DL;
    int i = 24 + 2 * this.interfaceCount;
    byte b1 = 0;
    FieldWriter fieldWriter;
    for (fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (FieldWriter)fieldWriter.fv) {
      b1++;
      i += fieldWriter.computeFieldInfoSize();
    } 
    byte b2 = 0;
    MethodWriter methodWriter;
    for (methodWriter = this.firstMethod; methodWriter != null; methodWriter = (MethodWriter)methodWriter.mv) {
      b2++;
      i += methodWriter.computeMethodInfoSize();
    } 
    int j = 0;
    if (this.innerClasses != null) {
      j++;
      i += 8 + this.innerClasses.length;
      this.symbolTable.addConstantUtf8("InnerClasses");
    } 
    try {
      if (this.enclosingClassIndex != 0) {
        j++;
        i += 10;
        this.symbolTable.addConstantUtf8("EnclosingMethod");
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if ((this.accessFlags & 0x1000) != 0)
        try {
          if ((this.version & 0xFFFF) < 49) {
            j++;
            i += 6;
            this.symbolTable.addConstantUtf8("Synthetic");
          } 
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        }  
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.signatureIndex != 0) {
        j++;
        i += 8;
        this.symbolTable.addConstantUtf8("Signature");
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.sourceFileIndex != 0) {
        j++;
        i += 8;
        this.symbolTable.addConstantUtf8("SourceFile");
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    if (this.debugExtension != null) {
      j++;
      i += 6 + this.debugExtension.length;
      this.symbolTable.addConstantUtf8("SourceDebugExtension");
    } 
    try {
      if ((this.accessFlags & 0x20000) != 0) {
        j++;
        i += 6;
        this.symbolTable.addConstantUtf8("Deprecated");
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    if (this.lastRuntimeVisibleAnnotation != null) {
      j++;
      i += this.lastRuntimeVisibleAnnotation.computeAnnotationsSize("RuntimeVisibleAnnotations");
    } 
    if (this.lastRuntimeInvisibleAnnotation != null) {
      j++;
      i += this.lastRuntimeInvisibleAnnotation.computeAnnotationsSize("RuntimeInvisibleAnnotations");
    } 
    if (this.lastRuntimeVisibleTypeAnnotation != null) {
      j++;
      i += this.lastRuntimeVisibleTypeAnnotation.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
    } 
    if (this.lastRuntimeInvisibleTypeAnnotation != null) {
      j++;
      i += this.lastRuntimeInvisibleTypeAnnotation.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
    } 
    if (this.symbolTable.computeBootstrapMethodsSize() > 0) {
      j++;
      i += this.symbolTable.computeBootstrapMethodsSize();
    } 
    if (this.moduleWriter != null) {
      j += this.moduleWriter.getAttributeCount();
      i += this.moduleWriter.computeAttributesSize();
    } 
    try {
      if (this.nestHostClassIndex != 0) {
        j++;
        i += 8;
        this.symbolTable.addConstantUtf8("NestHost");
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    if (this.nestMemberClasses != null) {
      j++;
      i += 8 + this.nestMemberClasses.length;
      this.symbolTable.addConstantUtf8("NestMembers");
    } 
    if (this.permittedSubclasses != null) {
      j++;
      i += 8 + this.permittedSubclasses.length;
      this.symbolTable.addConstantUtf8("PermittedSubclasses");
    } 
    byte b3 = 0;
    int k = 0;
    try {
      if ((this.accessFlags & 0x10000) != 0 || this.firstRecordComponent != null) {
        for (RecordComponentWriter recordComponentWriter = this.firstRecordComponent; recordComponentWriter != null; recordComponentWriter = (RecordComponentWriter)recordComponentWriter.delegate) {
          b3++;
          k += recordComponentWriter.computeRecordComponentInfoSize();
        } 
        j++;
        i += 8 + k;
        this.symbolTable.addConstantUtf8("Record");
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    if (this.firstAttribute != null) {
      j += this.firstAttribute.getAttributeCount();
      i += this.firstAttribute.computeAttributesSize(this.symbolTable);
    } 
    i += this.symbolTable.getConstantPoolLength();
    int m = this.symbolTable.getConstantPoolCount();
    try {
      if (m > 65535)
        throw new ClassTooLargeException(this.symbolTable.getClassName(), m); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    ByteVector byteVector = new ByteVector(i);
    try {
      byteVector.putInt(-889275714).putInt(this.version);
      this.symbolTable.putConstantPool(byteVector);
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    boolean bool = ((this.version & 0xFFFF) < 49) ? true : false;
    byteVector.putShort(this.accessFlags & (bool ^ 0xFFFFFFFF)).putShort(this.thisClass).putShort(this.superClass);
    byteVector.putShort(this.interfaceCount);
    byte b4 = 0;
    try {
      while (b4 < this.interfaceCount) {
        byteVector.putShort(this.interfaces[b4]);
        b4++;
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    byteVector.putShort(b1);
    for (fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (FieldWriter)fieldWriter.fv)
      fieldWriter.putFieldInfo(byteVector); 
    byteVector.putShort(b2);
    b4 = 0;
    boolean bool2 = false;
    for (methodWriter = this.firstMethod; methodWriter != null; methodWriter = (MethodWriter)methodWriter.mv) {
      bool1 = b4 | methodWriter.hasFrames();
      bool2 |= methodWriter.hasAsmInstructions();
      methodWriter.putMethodInfo(byteVector);
    } 
    try {
      byteVector.putShort(j);
      if (this.innerClasses != null)
        byteVector.putShort(this.symbolTable.addConstantUtf8("InnerClasses")).putInt(this.innerClasses.length + 2).putShort(this.numberOfInnerClasses).putByteArray(this.innerClasses.data, 0, this.innerClasses.length); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.enclosingClassIndex != 0)
        byteVector.putShort(this.symbolTable.addConstantUtf8("EnclosingMethod")).putInt(4).putShort(this.enclosingClassIndex).putShort(this.enclosingMethodIndex); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if ((this.accessFlags & 0x1000) != 0)
        try {
          if ((this.version & 0xFFFF) < 49)
            byteVector.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0); 
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        }  
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.signatureIndex != 0)
        byteVector.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.sourceFileIndex != 0)
        byteVector.putShort(this.symbolTable.addConstantUtf8("SourceFile")).putInt(2).putShort(this.sourceFileIndex); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    if (this.debugExtension != null) {
      int n = this.debugExtension.length;
      byteVector.putShort(this.symbolTable.addConstantUtf8("SourceDebugExtension")).putInt(n).putByteArray(this.debugExtension.data, 0, n);
    } 
    try {
      if ((this.accessFlags & 0x20000) != 0)
        byteVector.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(0); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector);
      this.symbolTable.putBootstrapMethods(byteVector);
      if (this.moduleWriter != null)
        this.moduleWriter.putAttributes(byteVector); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.nestHostClassIndex != 0)
        byteVector.putShort(this.symbolTable.addConstantUtf8("NestHost")).putInt(2).putShort(this.nestHostClassIndex); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.nestMemberClasses != null)
        byteVector.putShort(this.symbolTable.addConstantUtf8("NestMembers")).putInt(this.nestMemberClasses.length + 2).putShort(this.numberOfNestMemberClasses).putByteArray(this.nestMemberClasses.data, 0, this.nestMemberClasses.length); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.permittedSubclasses != null)
        byteVector.putShort(this.symbolTable.addConstantUtf8("PermittedSubclasses")).putInt(this.permittedSubclasses.length + 2).putShort(this.numberOfPermittedSubclasses).putByteArray(this.permittedSubclasses.data, 0, this.permittedSubclasses.length); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if ((this.accessFlags & 0x10000) != 0 || this.firstRecordComponent != null) {
        byteVector.putShort(this.symbolTable.addConstantUtf8("Record")).putInt(k + 2).putShort(b3);
        for (RecordComponentWriter recordComponentWriter = this.firstRecordComponent; recordComponentWriter != null; recordComponentWriter = (RecordComponentWriter)recordComponentWriter.delegate)
          recordComponentWriter.putRecordComponentInfo(byteVector); 
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.firstAttribute != null)
        this.firstAttribute.putAttributes(this.symbolTable, byteVector); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (bool2)
        return replaceAsmInstructions(byteVector.data, bool1); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return byteVector.data;
  }
  
  public int newModule(String paramString) {
    return (this.symbolTable.addConstantModule(paramString)).index;
  }
  
  public int newInvokeDynamic(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    return (this.symbolTable.addConstantInvokeDynamic(paramString1, paramString2, paramHandle, paramVarArgs)).index;
  }
  
  public ClassWriter(ClassReader paramClassReader, int paramInt) {
    super(589824);
    this.flags = paramInt;
    try {
      this.symbolTable = (paramClassReader == null) ? new SymbolTable(this) : new SymbolTable(this, paramClassReader);
      if ((paramInt & 0x2) != 0) {
        this.compute = 4;
      } else {
        try {
          if ((paramInt & 0x1) != 0) {
            this.compute = 1;
          } else {
            this.compute = 0;
          } 
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        } 
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
  }
  
  public int newField(String paramString1, String paramString2, String paramString3) {
    return (this.symbolTable.addConstantFieldref(paramString1, paramString2, paramString3)).index;
  }
  
  public final void visitOuterClass(String paramString1, String paramString2, String paramString3) {
    try {
      this.enclosingClassIndex = (this.symbolTable.addConstantClass(paramString1)).index;
      if (paramString2 != null)
        try {
          if (paramString3 != null)
            this.enclosingMethodIndex = this.symbolTable.addConstantNameAndType(paramString2, paramString3); 
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        }  
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
  }
  
  public final void visitAttribute(Attribute paramAttribute) {
    paramAttribute.nextAttribute = this.firstAttribute;
    this.firstAttribute = paramAttribute;
  }
  
  public final void visitPermittedSubclass(String paramString) {
    try {
      if (this.permittedSubclasses == null)
        this.permittedSubclasses = new ByteVector(); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    this.numberOfPermittedSubclasses++;
    this.permittedSubclasses.putShort((this.symbolTable.addConstantClass(paramString)).index);
  }
  
  public final AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeVisibleAnnotation); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return this.lastRuntimeInvisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeInvisibleAnnotation);
  }
  
  public int newHandle(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    return (this.symbolTable.addConstantMethodHandle(paramInt, paramString1, paramString2, paramString3, paramBoolean)).index;
  }
  
  public int newClass(String paramString) {
    return (this.symbolTable.addConstantClass(paramString)).index;
  }
  
  public int newMethodType(String paramString) {
    return (this.symbolTable.addConstantMethodType(paramString)).index;
  }
  
  public ClassWriter(int paramInt) {
    this(null, paramInt);
  }
  
  public final void visitEnd() {}
  
  public final void visitNestMember(String paramString) {
    try {
      if (this.nestMemberClasses == null)
        this.nestMemberClasses = new ByteVector(); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    this.numberOfNestMemberClasses++;
    this.nestMemberClasses.putShort((this.symbolTable.addConstantClass(paramString)).index);
  }
  
  public ClassLoader getClassLoader() {
    return getClass().getClassLoader();
  }
  
  public int newConst(Object paramObject) {
    return (this.symbolTable.addConstant(paramObject)).index;
  }
  
  public final FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
    FieldWriter fieldWriter = new FieldWriter(this.symbolTable, paramInt, paramString1, paramString2, paramString3, paramObject);
    try {
      if (this.firstField == null) {
        this.firstField = fieldWriter;
      } else {
        this.lastField.fv = fieldWriter;
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return this.lastField = fieldWriter;
  }
  
  public int newConstantDynamic(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    return (this.symbolTable.addConstantDynamic(paramString1, paramString2, paramHandle, paramVarArgs)).index;
  }
  
  public int newMethod(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    return (this.symbolTable.addConstantMethodref(paramString1, paramString2, paramString3, paramBoolean)).index;
  }
  
  public boolean hasFlags(int paramInt) {
    try {
    
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return ((this.flags & paramInt) == paramInt);
  }
  
  public final void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    try {
      this.version = paramInt1;
      this.accessFlags = paramInt2;
      this.thisClass = this.symbolTable.setMajorVersionAndClassName(paramInt1 & 0xFFFF, paramString1);
      if (paramString2 != null)
        this.signatureIndex = this.symbolTable.addConstantUtf8(paramString2); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
    
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      this.superClass = (paramString3 == null) ? 0 : (this.symbolTable.addConstantClass(paramString3)).index;
      if (paramArrayOfString != null && paramArrayOfString.length > 0) {
        this.interfaceCount = paramArrayOfString.length;
        this.interfaces = new int[this.interfaceCount];
        byte b = 0;
        try {
          while (b < this.interfaceCount) {
            this.interfaces[b] = (this.symbolTable.addConstantClass(paramArrayOfString[b])).index;
            b++;
          } 
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        } 
      } 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (this.compute == 1)
        try {
          if ((paramInt1 & 0xFFFF) >= 51)
            this.compute = 2; 
        } catch (ClassTooLargeException classTooLargeException) {
          throw a(null);
        }  
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
  }
  
  public int newPackage(String paramString) {
    return (this.symbolTable.addConstantPackage(paramString)).index;
  }
  
  public String getCommonSuperClass(String paramString1, String paramString2) {
    Class<?> clazz1;
    Class<?> clazz2;
    long l = a ^ 0x38B4C09F9FFCL;
    ClassLoader classLoader = getClassLoader();
    try {
      clazz1 = Class.forName(paramString1.replace('/', '.'), false, classLoader);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new TypeNotPresentException(paramString1, classNotFoundException);
    } 
    try {
      clazz2 = Class.forName(paramString2.replace('/', '.'), false, classLoader);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new TypeNotPresentException(paramString2, classNotFoundException);
    } 
    try {
      if (clazz1.isAssignableFrom(clazz2))
        return paramString1; 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    try {
      if (clazz2.isAssignableFrom(clazz1))
        return paramString2; 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    try {
      if (!clazz1.isInterface())
        try {
          if (!clazz2.isInterface())
            while (true) {
              clazz1 = clazz1.getSuperclass();
              if (clazz1.isAssignableFrom(clazz2))
                return clazz1.getName().replace('.', '/'); 
            }  
          return "java/lang/Object";
        } catch (ClassNotFoundException classNotFoundException) {
          throw a(null);
        }  
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    return "java/lang/Object";
  }
  
  public final ModuleVisitor visitModule(String paramString1, int paramInt, String paramString2) {
    try {
    
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return this.moduleWriter = new ModuleWriter(this.symbolTable, (this.symbolTable.addConstantModule(paramString1)).index, paramInt, (paramString2 == null) ? 0 : this.symbolTable.addConstantUtf8(paramString2));
  }
  
  @Deprecated
  public int newHandle(int paramInt, String paramString1, String paramString2, String paramString3) {
    try {
    
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    return newHandle(paramInt, paramString1, paramString2, paramString3, (paramInt == 9));
  }
  
  public final void visitSource(String paramString1, String paramString2) {
    try {
      if (paramString1 != null)
        this.sourceFileIndex = this.symbolTable.addConstantUtf8(paramString1); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
    try {
      if (paramString2 != null)
        this.debugExtension = (new ByteVector()).encodeUtf8(paramString2, 0, 2147483647); 
    } catch (ClassTooLargeException classTooLargeException) {
      throw a(null);
    } 
  }
  
  public final void visitNestHost(String paramString) {
    this.nestHostClassIndex = (this.symbolTable.addConstantClass(paramString)).index;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ClassWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */