package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class MethodWriter extends MethodVisitor {
  private Handler lastHandler;
  
  public static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
  
  private int stackMapTableNumberOfEntries;
  
  private AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
  
  private int maxStack;
  
  private int sourceOffset;
  
  private Handler firstHandler;
  
  public static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
  
  private AnnotationWriter lastRuntimeVisibleAnnotation;
  
  private int maxLocals;
  
  private int[] currentFrame;
  
  private boolean hasSubroutines;
  
  private ByteVector stackMapTableEntries;
  
  private Attribute firstAttribute;
  
  public static final int COMPUTE_ALL_FRAMES = 4;
  
  private ByteVector lineNumberTable;
  
  private int[] previousFrame;
  
  private ByteVector localVariableTypeTable;
  
  private final int descriptorIndex;
  
  private final int accessFlags;
  
  private final ByteVector code = new ByteVector();
  
  private final int nameIndex;
  
  private int sourceLength;
  
  private ByteVector localVariableTable;
  
  private int currentLocals;
  
  private final String descriptor;
  
  private boolean hasAsmInstructions;
  
  private int localVariableTypeTableLength;
  
  private Label firstBasicBlock;
  
  private Label currentBasicBlock;
  
  private int localVariableTableLength;
  
  private final int numberOfExceptions;
  
  private int lastBytecodeOffset;
  
  private AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
  
  public static final int COMPUTE_NOTHING = 0;
  
  private int maxRelativeStackSize;
  
  private static final int NA = 0;
  
  private final String name;
  
  private final int compute;
  
  private static final int[] STACK_SIZE_DELTA;
  
  private Attribute firstCodeAttribute;
  
  private Label lastBasicBlock;
  
  private AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
  
  private ByteVector parameters;
  
  private final SymbolTable symbolTable;
  
  private final int signatureIndex;
  
  private final int[] exceptionIndexTable;
  
  public static final int COMPUTE_INSERTED_FRAMES = 3;
  
  private ByteVector defaultValue;
  
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
  
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
  
  private int relativeStackSize;
  
  private int previousFrameOffset;
  
  private int lineNumberTableLength;
  
  private int parametersCount;
  
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
  
  private int visibleAnnotableParameterCount;
  
  private AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
  
  private int invisibleAnnotableParameterCount;
  
  private static final long a = o3.a(-1544232432764105652L, 6492392274991255244L, null).a(115711856639995L);
  
  public void visitCode() {}
  
  public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    this.lastBytecodeOffset = this.code.length;
    Symbol symbol = this.symbolTable.addConstantInvokeDynamic(paramString1, paramString2, paramHandle, paramVarArgs);
    try {
      this.code.put12(186, symbol.index);
      this.code.putShort(0);
      if (this.currentBasicBlock != null) {
        try {
          if (this.compute != 4) {
            try {
              if (this.compute == 3) {
                this.currentBasicBlock.frame.execute(186, 0, symbol, this.symbolTable);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            int i = symbol.getArgumentsAndReturnSizes();
            int j = (i & 0x3) - (i >> 2) + 1;
            int k = this.relativeStackSize + j;
            try {
              if (k > this.maxRelativeStackSize)
                this.maxRelativeStackSize = k; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            this.relativeStackSize = k;
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.currentBasicBlock.frame.execute(186, 0, symbol, this.symbolTable);
  }
  
  public void visitIincInsn(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   5: getfield length : I
    //   8: putfield lastBytecodeOffset : I
    //   11: iload_1
    //   12: sipush #255
    //   15: if_icmpgt -> 44
    //   18: iload_2
    //   19: bipush #127
    //   21: if_icmpgt -> 44
    //   24: goto -> 31
    //   27: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   30: athrow
    //   31: iload_2
    //   32: bipush #-128
    //   34: if_icmpge -> 73
    //   37: goto -> 44
    //   40: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_0
    //   45: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   48: sipush #196
    //   51: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   54: sipush #132
    //   57: iload_1
    //   58: invokevirtual put12 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   61: iload_2
    //   62: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   65: pop
    //   66: goto -> 89
    //   69: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   77: sipush #132
    //   80: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   83: iload_1
    //   84: iload_2
    //   85: invokevirtual put11 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   88: pop
    //   89: aload_0
    //   90: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   93: ifnull -> 149
    //   96: aload_0
    //   97: getfield compute : I
    //   100: iconst_4
    //   101: if_icmpeq -> 126
    //   104: goto -> 111
    //   107: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   110: athrow
    //   111: aload_0
    //   112: getfield compute : I
    //   115: iconst_3
    //   116: if_icmpne -> 149
    //   119: goto -> 126
    //   122: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   125: athrow
    //   126: aload_0
    //   127: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   130: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   133: sipush #132
    //   136: iload_1
    //   137: aconst_null
    //   138: aconst_null
    //   139: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   142: goto -> 149
    //   145: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   148: athrow
    //   149: aload_0
    //   150: getfield compute : I
    //   153: ifeq -> 180
    //   156: iload_1
    //   157: iconst_1
    //   158: iadd
    //   159: istore_3
    //   160: iload_3
    //   161: aload_0
    //   162: getfield maxLocals : I
    //   165: if_icmple -> 180
    //   168: aload_0
    //   169: iload_3
    //   170: putfield maxLocals : I
    //   173: goto -> 180
    //   176: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   179: athrow
    //   180: return
    // Exception table:
    //   from	to	target	type
    //   0	24	27	java/lang/IllegalArgumentException
    //   18	37	40	java/lang/IllegalArgumentException
    //   31	69	69	java/lang/IllegalArgumentException
    //   89	104	107	java/lang/IllegalArgumentException
    //   96	119	122	java/lang/IllegalArgumentException
    //   111	142	145	java/lang/IllegalArgumentException
    //   160	173	176	java/lang/IllegalArgumentException
  }
  
  public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
    this.lastBytecodeOffset = this.code.length;
    this.code.putByte(170).putByteArray(null, 0, (4 - this.code.length % 4) % 4);
    paramLabel.put(this.code, this.lastBytecodeOffset, true);
    this.code.putInt(paramInt1).putInt(paramInt2);
    for (Label label : paramVarArgs)
      label.put(this.code, this.lastBytecodeOffset, true); 
    visitSwitchInsn(paramLabel, paramVarArgs);
  }
  
  public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
    // Byte code:
    //   0: aload_3
    //   1: ifnull -> 100
    //   4: aload_0
    //   5: getfield localVariableTypeTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   8: ifnonnull -> 36
    //   11: goto -> 18
    //   14: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   17: athrow
    //   18: aload_0
    //   19: new me/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield localVariableTypeTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   29: goto -> 36
    //   32: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   35: athrow
    //   36: aload_0
    //   37: dup
    //   38: getfield localVariableTypeTableLength : I
    //   41: iconst_1
    //   42: iadd
    //   43: putfield localVariableTypeTableLength : I
    //   46: aload_0
    //   47: getfield localVariableTypeTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   50: aload #4
    //   52: getfield bytecodeOffset : I
    //   55: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   58: aload #5
    //   60: getfield bytecodeOffset : I
    //   63: aload #4
    //   65: getfield bytecodeOffset : I
    //   68: isub
    //   69: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   72: aload_0
    //   73: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   76: aload_1
    //   77: invokevirtual addConstantUtf8 : (Ljava/lang/String;)I
    //   80: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   83: aload_0
    //   84: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   87: aload_3
    //   88: invokevirtual addConstantUtf8 : (Ljava/lang/String;)I
    //   91: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   94: iload #6
    //   96: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   99: pop
    //   100: aload_0
    //   101: getfield localVariableTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   104: ifnonnull -> 125
    //   107: aload_0
    //   108: new me/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: putfield localVariableTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   118: goto -> 125
    //   121: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   124: athrow
    //   125: aload_0
    //   126: dup
    //   127: getfield localVariableTableLength : I
    //   130: iconst_1
    //   131: iadd
    //   132: putfield localVariableTableLength : I
    //   135: aload_0
    //   136: getfield localVariableTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   139: aload #4
    //   141: getfield bytecodeOffset : I
    //   144: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   147: aload #5
    //   149: getfield bytecodeOffset : I
    //   152: aload #4
    //   154: getfield bytecodeOffset : I
    //   157: isub
    //   158: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   161: aload_0
    //   162: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   165: aload_1
    //   166: invokevirtual addConstantUtf8 : (Ljava/lang/String;)I
    //   169: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   172: aload_0
    //   173: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   176: aload_2
    //   177: invokevirtual addConstantUtf8 : (Ljava/lang/String;)I
    //   180: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   183: iload #6
    //   185: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   188: pop
    //   189: aload_0
    //   190: getfield compute : I
    //   193: ifeq -> 260
    //   196: aload_2
    //   197: iconst_0
    //   198: invokevirtual charAt : (I)C
    //   201: istore #7
    //   203: iload #6
    //   205: iload #7
    //   207: bipush #74
    //   209: if_icmpeq -> 226
    //   212: iload #7
    //   214: bipush #68
    //   216: if_icmpne -> 234
    //   219: goto -> 226
    //   222: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   225: athrow
    //   226: iconst_2
    //   227: goto -> 235
    //   230: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   233: athrow
    //   234: iconst_1
    //   235: iadd
    //   236: istore #8
    //   238: iload #8
    //   240: aload_0
    //   241: getfield maxLocals : I
    //   244: if_icmple -> 260
    //   247: aload_0
    //   248: iload #8
    //   250: putfield maxLocals : I
    //   253: goto -> 260
    //   256: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   259: athrow
    //   260: return
    // Exception table:
    //   from	to	target	type
    //   0	11	14	java/lang/IllegalArgumentException
    //   4	29	32	java/lang/IllegalArgumentException
    //   100	118	121	java/lang/IllegalArgumentException
    //   203	219	222	java/lang/IllegalArgumentException
    //   212	230	230	java/lang/IllegalArgumentException
    //   238	253	256	java/lang/IllegalArgumentException
  }
  
  public void visitLabel(Label paramLabel) {
    try {
      this.hasAsmInstructions |= paramLabel.resolve(this.code.data, this.code.length);
      if ((paramLabel.flags & 0x1) != 0)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.compute == 4) {
        try {
          if (this.currentBasicBlock != null) {
            try {
              if (paramLabel.bytecodeOffset == this.currentBasicBlock.bytecodeOffset) {
                this.currentBasicBlock.flags = (short)(this.currentBasicBlock.flags | paramLabel.flags & 0x2);
                paramLabel.frame = this.currentBasicBlock.frame;
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            addSuccessorToCurrentBasicBlock(0, paramLabel);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        try {
          if (this.lastBasicBlock != null) {
            try {
              if (paramLabel.bytecodeOffset == this.lastBasicBlock.bytecodeOffset) {
                this.lastBasicBlock.flags = (short)(this.lastBasicBlock.flags | paramLabel.flags & 0x2);
                paramLabel.frame = this.lastBasicBlock.frame;
                this.currentBasicBlock = this.lastBasicBlock;
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            this.lastBasicBlock.nextBasicBlock = paramLabel;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        this.lastBasicBlock = paramLabel;
        this.currentBasicBlock = paramLabel;
        paramLabel.frame = new Frame(paramLabel);
      } else {
        try {
          if (this.compute == 3) {
            try {
              if (this.currentBasicBlock == null) {
                this.currentBasicBlock = paramLabel;
              } else {
                this.currentBasicBlock.frame.owner = paramLabel;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
          } else {
            try {
              if (this.compute == 1) {
                try {
                  if (this.currentBasicBlock != null) {
                    this.currentBasicBlock.outputStackMax = (short)this.maxRelativeStackSize;
                    addSuccessorToCurrentBasicBlock(this.relativeStackSize, paramLabel);
                  } 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw b(null);
                } 
                try {
                  this.currentBasicBlock = paramLabel;
                  this.relativeStackSize = 0;
                  this.maxRelativeStackSize = 0;
                  if (this.lastBasicBlock != null)
                    this.lastBasicBlock.nextBasicBlock = paramLabel; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw b(null);
                } 
                this.lastBasicBlock = paramLabel;
              } else {
                try {
                  if (this.compute == 2)
                    try {
                      if (this.currentBasicBlock == null)
                        this.currentBasicBlock = paramLabel; 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw b(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw b(null);
                } 
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public boolean hasFrames() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (this.stackMapTableNumberOfEntries > 0);
  }
  
  public void visitMaxs(int paramInt1, int paramInt2) {
    try {
      if (this.compute == 4) {
        computeAllFrames();
      } else {
        try {
          if (this.compute == 1) {
            computeMaxStackAndLocal();
          } else {
            try {
              if (this.compute == 2) {
                this.maxStack = this.maxRelativeStackSize;
              } else {
                this.maxStack = paramInt1;
                this.maxLocals = paramInt2;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public boolean canCopyMethodAttributes(ClassReader paramClassReader, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   5: invokevirtual getSource : ()Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassReader;
    //   8: if_acmpne -> 74
    //   11: iload #4
    //   13: aload_0
    //   14: getfield descriptorIndex : I
    //   17: if_icmpne -> 74
    //   20: goto -> 27
    //   23: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   26: athrow
    //   27: iload #5
    //   29: aload_0
    //   30: getfield signatureIndex : I
    //   33: if_icmpne -> 74
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: iload_3
    //   44: aload_0
    //   45: getfield accessFlags : I
    //   48: ldc_w 131072
    //   51: iand
    //   52: ifeq -> 70
    //   55: goto -> 62
    //   58: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   61: athrow
    //   62: iconst_1
    //   63: goto -> 71
    //   66: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   69: athrow
    //   70: iconst_0
    //   71: if_icmpeq -> 80
    //   74: iconst_0
    //   75: ireturn
    //   76: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   84: invokevirtual getMajorVersion : ()I
    //   87: bipush #49
    //   89: if_icmpge -> 118
    //   92: aload_0
    //   93: getfield accessFlags : I
    //   96: sipush #4096
    //   99: iand
    //   100: ifeq -> 118
    //   103: goto -> 110
    //   106: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   109: athrow
    //   110: iconst_1
    //   111: goto -> 119
    //   114: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: iconst_0
    //   119: istore #7
    //   121: iload_2
    //   122: iload #7
    //   124: if_icmpeq -> 133
    //   127: iconst_0
    //   128: ireturn
    //   129: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   132: athrow
    //   133: iload #6
    //   135: ifne -> 158
    //   138: aload_0
    //   139: getfield numberOfExceptions : I
    //   142: ifeq -> 227
    //   145: goto -> 152
    //   148: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   151: athrow
    //   152: iconst_0
    //   153: ireturn
    //   154: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   157: athrow
    //   158: aload_1
    //   159: iload #6
    //   161: invokevirtual readUnsignedShort : (I)I
    //   164: aload_0
    //   165: getfield numberOfExceptions : I
    //   168: if_icmpne -> 227
    //   171: iload #6
    //   173: iconst_2
    //   174: iadd
    //   175: istore #8
    //   177: iconst_0
    //   178: istore #9
    //   180: iload #9
    //   182: aload_0
    //   183: getfield numberOfExceptions : I
    //   186: if_icmpge -> 227
    //   189: aload_1
    //   190: iload #8
    //   192: invokevirtual readUnsignedShort : (I)I
    //   195: aload_0
    //   196: getfield exceptionIndexTable : [I
    //   199: iload #9
    //   201: iaload
    //   202: if_icmpeq -> 218
    //   205: goto -> 212
    //   208: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   211: athrow
    //   212: iconst_0
    //   213: ireturn
    //   214: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   217: athrow
    //   218: iinc #8, 2
    //   221: iinc #9, 1
    //   224: goto -> 180
    //   227: iconst_1
    //   228: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	20	23	java/lang/IllegalArgumentException
    //   11	36	39	java/lang/IllegalArgumentException
    //   27	55	58	java/lang/IllegalArgumentException
    //   43	66	66	java/lang/IllegalArgumentException
    //   71	76	76	java/lang/IllegalArgumentException
    //   80	103	106	java/lang/IllegalArgumentException
    //   92	114	114	java/lang/IllegalArgumentException
    //   121	129	129	java/lang/IllegalArgumentException
    //   133	145	148	java/lang/IllegalArgumentException
    //   138	154	154	java/lang/IllegalArgumentException
    //   180	205	208	java/lang/IllegalArgumentException
    //   189	214	214	java/lang/IllegalArgumentException
  }
  
  public void visitInsn(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   5: getfield length : I
    //   8: putfield lastBytecodeOffset : I
    //   11: aload_0
    //   12: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   15: iload_1
    //   16: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   19: pop
    //   20: aload_0
    //   21: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   24: ifnull -> 160
    //   27: aload_0
    //   28: getfield compute : I
    //   31: iconst_4
    //   32: if_icmpeq -> 57
    //   35: goto -> 42
    //   38: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield compute : I
    //   46: iconst_3
    //   47: if_icmpne -> 78
    //   50: goto -> 57
    //   53: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   61: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   64: iload_1
    //   65: iconst_0
    //   66: aconst_null
    //   67: aconst_null
    //   68: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   71: goto -> 114
    //   74: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: aload_0
    //   79: getfield relativeStackSize : I
    //   82: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter.STACK_SIZE_DELTA : [I
    //   85: iload_1
    //   86: iaload
    //   87: iadd
    //   88: istore_2
    //   89: iload_2
    //   90: aload_0
    //   91: getfield maxRelativeStackSize : I
    //   94: if_icmple -> 109
    //   97: aload_0
    //   98: iload_2
    //   99: putfield maxRelativeStackSize : I
    //   102: goto -> 109
    //   105: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   108: athrow
    //   109: aload_0
    //   110: iload_2
    //   111: putfield relativeStackSize : I
    //   114: iload_1
    //   115: sipush #172
    //   118: if_icmplt -> 135
    //   121: iload_1
    //   122: sipush #177
    //   125: if_icmple -> 149
    //   128: goto -> 135
    //   131: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   134: athrow
    //   135: iload_1
    //   136: sipush #191
    //   139: if_icmpne -> 160
    //   142: goto -> 149
    //   145: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   148: athrow
    //   149: aload_0
    //   150: invokespecial endCurrentBasicBlockWithNoSuccessor : ()V
    //   153: goto -> 160
    //   156: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   159: athrow
    //   160: return
    // Exception table:
    //   from	to	target	type
    //   0	35	38	java/lang/IllegalArgumentException
    //   27	50	53	java/lang/IllegalArgumentException
    //   42	74	74	java/lang/IllegalArgumentException
    //   89	102	105	java/lang/IllegalArgumentException
    //   114	128	131	java/lang/IllegalArgumentException
    //   121	142	145	java/lang/IllegalArgumentException
    //   135	153	156	java/lang/IllegalArgumentException
  }
  
  public void visitLdcInsn(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   5: getfield length : I
    //   8: putfield lastBytecodeOffset : I
    //   11: aload_0
    //   12: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   15: aload_1
    //   16: invokevirtual addConstant : (Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;
    //   19: astore_2
    //   20: aload_2
    //   21: getfield index : I
    //   24: istore_3
    //   25: aload_2
    //   26: getfield tag : I
    //   29: iconst_5
    //   30: if_icmpeq -> 95
    //   33: aload_2
    //   34: getfield tag : I
    //   37: bipush #6
    //   39: if_icmpeq -> 95
    //   42: goto -> 49
    //   45: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   48: athrow
    //   49: aload_2
    //   50: getfield tag : I
    //   53: bipush #17
    //   55: if_icmpne -> 103
    //   58: goto -> 65
    //   61: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   64: athrow
    //   65: aload_2
    //   66: getfield value : Ljava/lang/String;
    //   69: iconst_0
    //   70: invokevirtual charAt : (I)C
    //   73: dup
    //   74: istore #4
    //   76: bipush #74
    //   78: if_icmpeq -> 95
    //   81: iload #4
    //   83: bipush #68
    //   85: if_icmpne -> 103
    //   88: goto -> 95
    //   91: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   94: athrow
    //   95: iconst_1
    //   96: goto -> 104
    //   99: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   102: athrow
    //   103: iconst_0
    //   104: istore #5
    //   106: iload #5
    //   108: ifeq -> 129
    //   111: aload_0
    //   112: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   115: bipush #20
    //   117: iload_3
    //   118: invokevirtual put12 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   121: pop
    //   122: goto -> 165
    //   125: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   128: athrow
    //   129: iload_3
    //   130: sipush #256
    //   133: if_icmplt -> 154
    //   136: aload_0
    //   137: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   140: bipush #19
    //   142: iload_3
    //   143: invokevirtual put12 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   146: pop
    //   147: goto -> 165
    //   150: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   153: athrow
    //   154: aload_0
    //   155: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   158: bipush #18
    //   160: iload_3
    //   161: invokevirtual put11 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   164: pop
    //   165: aload_0
    //   166: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   169: ifnull -> 276
    //   172: aload_0
    //   173: getfield compute : I
    //   176: iconst_4
    //   177: if_icmpeq -> 202
    //   180: goto -> 187
    //   183: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   186: athrow
    //   187: aload_0
    //   188: getfield compute : I
    //   191: iconst_3
    //   192: if_icmpne -> 227
    //   195: goto -> 202
    //   198: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   201: athrow
    //   202: aload_0
    //   203: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   206: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   209: bipush #18
    //   211: iconst_0
    //   212: aload_2
    //   213: aload_0
    //   214: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   217: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   220: goto -> 276
    //   223: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   226: athrow
    //   227: aload_0
    //   228: getfield relativeStackSize : I
    //   231: iload #5
    //   233: ifeq -> 244
    //   236: iconst_2
    //   237: goto -> 245
    //   240: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   243: athrow
    //   244: iconst_1
    //   245: iadd
    //   246: istore #6
    //   248: iload #6
    //   250: aload_0
    //   251: getfield maxRelativeStackSize : I
    //   254: if_icmple -> 270
    //   257: aload_0
    //   258: iload #6
    //   260: putfield maxRelativeStackSize : I
    //   263: goto -> 270
    //   266: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   269: athrow
    //   270: aload_0
    //   271: iload #6
    //   273: putfield relativeStackSize : I
    //   276: return
    // Exception table:
    //   from	to	target	type
    //   25	42	45	java/lang/IllegalArgumentException
    //   33	58	61	java/lang/IllegalArgumentException
    //   76	88	91	java/lang/IllegalArgumentException
    //   81	99	99	java/lang/IllegalArgumentException
    //   106	125	125	java/lang/IllegalArgumentException
    //   129	150	150	java/lang/IllegalArgumentException
    //   165	180	183	java/lang/IllegalArgumentException
    //   172	195	198	java/lang/IllegalArgumentException
    //   187	223	223	java/lang/IllegalArgumentException
    //   227	240	240	java/lang/IllegalArgumentException
    //   248	263	266	java/lang/IllegalArgumentException
  }
  
  public void visitEnd() {}
  
  public void setMethodAttributesSource(int paramInt1, int paramInt2) {
    this.sourceOffset = paramInt1 + 6;
    this.sourceLength = paramInt2 - 6;
  }
  
  public void visitJumpInsn(int paramInt, Label paramLabel) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   5: getfield length : I
    //   8: putfield lastBytecodeOffset : I
    //   11: iload_1
    //   12: sipush #200
    //   15: if_icmplt -> 29
    //   18: iload_1
    //   19: bipush #33
    //   21: isub
    //   22: goto -> 30
    //   25: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: iload_1
    //   30: istore_3
    //   31: iconst_0
    //   32: istore #4
    //   34: aload_2
    //   35: getfield flags : S
    //   38: iconst_4
    //   39: iand
    //   40: ifeq -> 207
    //   43: aload_2
    //   44: getfield bytecodeOffset : I
    //   47: aload_0
    //   48: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   51: getfield length : I
    //   54: isub
    //   55: sipush #-32768
    //   58: if_icmpge -> 207
    //   61: goto -> 68
    //   64: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   67: athrow
    //   68: iload_3
    //   69: sipush #167
    //   72: if_icmpne -> 100
    //   75: goto -> 82
    //   78: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   81: athrow
    //   82: aload_0
    //   83: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   86: sipush #200
    //   89: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   92: pop
    //   93: goto -> 186
    //   96: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   99: athrow
    //   100: iload_3
    //   101: sipush #168
    //   104: if_icmpne -> 125
    //   107: aload_0
    //   108: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   111: sipush #201
    //   114: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   117: pop
    //   118: goto -> 186
    //   121: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   124: athrow
    //   125: aload_0
    //   126: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   129: iload_3
    //   130: sipush #198
    //   133: if_icmplt -> 146
    //   136: iload_3
    //   137: iconst_1
    //   138: ixor
    //   139: goto -> 153
    //   142: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   145: athrow
    //   146: iload_3
    //   147: iconst_1
    //   148: iadd
    //   149: iconst_1
    //   150: ixor
    //   151: iconst_1
    //   152: isub
    //   153: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   156: pop
    //   157: aload_0
    //   158: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   161: bipush #8
    //   163: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   166: pop
    //   167: aload_0
    //   168: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   171: sipush #220
    //   174: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   177: pop
    //   178: aload_0
    //   179: iconst_1
    //   180: putfield hasAsmInstructions : Z
    //   183: iconst_1
    //   184: istore #4
    //   186: aload_2
    //   187: aload_0
    //   188: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   191: aload_0
    //   192: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   195: getfield length : I
    //   198: iconst_1
    //   199: isub
    //   200: iconst_1
    //   201: invokevirtual put : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;IZ)V
    //   204: goto -> 273
    //   207: iload_3
    //   208: iload_1
    //   209: if_icmpeq -> 246
    //   212: aload_0
    //   213: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   216: iload_1
    //   217: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   220: pop
    //   221: aload_2
    //   222: aload_0
    //   223: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   226: aload_0
    //   227: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   230: getfield length : I
    //   233: iconst_1
    //   234: isub
    //   235: iconst_1
    //   236: invokevirtual put : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;IZ)V
    //   239: goto -> 273
    //   242: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   245: athrow
    //   246: aload_0
    //   247: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   250: iload_3
    //   251: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   254: pop
    //   255: aload_2
    //   256: aload_0
    //   257: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   260: aload_0
    //   261: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   264: getfield length : I
    //   267: iconst_1
    //   268: isub
    //   269: iconst_0
    //   270: invokevirtual put : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;IZ)V
    //   273: aload_0
    //   274: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   277: ifnull -> 578
    //   280: aconst_null
    //   281: astore #5
    //   283: aload_0
    //   284: getfield compute : I
    //   287: iconst_4
    //   288: if_icmpne -> 351
    //   291: aload_0
    //   292: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   295: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   298: iload_3
    //   299: iconst_0
    //   300: aconst_null
    //   301: aconst_null
    //   302: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   305: aload_2
    //   306: invokevirtual getCanonicalInstance : ()Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   309: dup
    //   310: getfield flags : S
    //   313: iconst_2
    //   314: ior
    //   315: i2s
    //   316: putfield flags : S
    //   319: aload_0
    //   320: iconst_0
    //   321: aload_2
    //   322: invokespecial addSuccessorToCurrentBasicBlock : (ILme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   325: iload_3
    //   326: sipush #167
    //   329: if_icmpeq -> 518
    //   332: goto -> 339
    //   335: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   338: athrow
    //   339: new me/rerere/matrix/thirdparty/org/objectweb/asm/Label
    //   342: dup
    //   343: invokespecial <init> : ()V
    //   346: astore #5
    //   348: goto -> 518
    //   351: aload_0
    //   352: getfield compute : I
    //   355: iconst_3
    //   356: if_icmpne -> 380
    //   359: aload_0
    //   360: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   363: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   366: iload_3
    //   367: iconst_0
    //   368: aconst_null
    //   369: aconst_null
    //   370: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   373: goto -> 518
    //   376: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   379: athrow
    //   380: aload_0
    //   381: getfield compute : I
    //   384: iconst_2
    //   385: if_icmpne -> 409
    //   388: aload_0
    //   389: dup
    //   390: getfield relativeStackSize : I
    //   393: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter.STACK_SIZE_DELTA : [I
    //   396: iload_3
    //   397: iaload
    //   398: iadd
    //   399: putfield relativeStackSize : I
    //   402: goto -> 518
    //   405: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   408: athrow
    //   409: iload_3
    //   410: sipush #168
    //   413: if_icmpne -> 495
    //   416: aload_2
    //   417: getfield flags : S
    //   420: bipush #32
    //   422: iand
    //   423: ifne -> 457
    //   426: goto -> 433
    //   429: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   432: athrow
    //   433: aload_2
    //   434: dup
    //   435: getfield flags : S
    //   438: bipush #32
    //   440: ior
    //   441: i2s
    //   442: putfield flags : S
    //   445: aload_0
    //   446: iconst_1
    //   447: putfield hasSubroutines : Z
    //   450: goto -> 457
    //   453: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   456: athrow
    //   457: aload_0
    //   458: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   461: dup
    //   462: getfield flags : S
    //   465: bipush #16
    //   467: ior
    //   468: i2s
    //   469: putfield flags : S
    //   472: aload_0
    //   473: aload_0
    //   474: getfield relativeStackSize : I
    //   477: iconst_1
    //   478: iadd
    //   479: aload_2
    //   480: invokespecial addSuccessorToCurrentBasicBlock : (ILme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   483: new me/rerere/matrix/thirdparty/org/objectweb/asm/Label
    //   486: dup
    //   487: invokespecial <init> : ()V
    //   490: astore #5
    //   492: goto -> 518
    //   495: aload_0
    //   496: dup
    //   497: getfield relativeStackSize : I
    //   500: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter.STACK_SIZE_DELTA : [I
    //   503: iload_3
    //   504: iaload
    //   505: iadd
    //   506: putfield relativeStackSize : I
    //   509: aload_0
    //   510: aload_0
    //   511: getfield relativeStackSize : I
    //   514: aload_2
    //   515: invokespecial addSuccessorToCurrentBasicBlock : (ILme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   518: aload #5
    //   520: ifnull -> 560
    //   523: iload #4
    //   525: ifeq -> 554
    //   528: goto -> 535
    //   531: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   534: athrow
    //   535: aload #5
    //   537: dup
    //   538: getfield flags : S
    //   541: iconst_2
    //   542: ior
    //   543: i2s
    //   544: putfield flags : S
    //   547: goto -> 554
    //   550: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   553: athrow
    //   554: aload_0
    //   555: aload #5
    //   557: invokevirtual visitLabel : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   560: iload_3
    //   561: sipush #167
    //   564: if_icmpne -> 578
    //   567: aload_0
    //   568: invokespecial endCurrentBasicBlockWithNoSuccessor : ()V
    //   571: goto -> 578
    //   574: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   577: athrow
    //   578: return
    // Exception table:
    //   from	to	target	type
    //   0	25	25	java/lang/IllegalArgumentException
    //   34	61	64	java/lang/IllegalArgumentException
    //   43	75	78	java/lang/IllegalArgumentException
    //   68	96	96	java/lang/IllegalArgumentException
    //   100	121	121	java/lang/IllegalArgumentException
    //   125	142	142	java/lang/IllegalArgumentException
    //   207	242	242	java/lang/IllegalArgumentException
    //   283	332	335	java/lang/IllegalArgumentException
    //   351	376	376	java/lang/IllegalArgumentException
    //   380	405	405	java/lang/IllegalArgumentException
    //   409	426	429	java/lang/IllegalArgumentException
    //   416	450	453	java/lang/IllegalArgumentException
    //   518	528	531	java/lang/IllegalArgumentException
    //   523	547	550	java/lang/IllegalArgumentException
    //   560	571	574	java/lang/IllegalArgumentException
  }
  
  public void visitFrameEnd() {
    try {
      if (this.previousFrame != null) {
        try {
          if (this.stackMapTableEntries == null)
            this.stackMapTableEntries = new ByteVector(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        putFrame();
        this.stackMapTableNumberOfEntries++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.previousFrame = this.currentFrame;
    this.currentFrame = null;
  }
  
  public void visitTypeInsn(int paramInt, String paramString) {
    this.lastBytecodeOffset = this.code.length;
    Symbol symbol = this.symbolTable.addConstantClass(paramString);
    try {
      this.code.put12(paramInt, symbol.index);
      if (this.currentBasicBlock != null) {
        try {
          if (this.compute != 4) {
            try {
              if (this.compute == 3) {
                this.currentBasicBlock.frame.execute(paramInt, this.lastBytecodeOffset, symbol, this.symbolTable);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            if (paramInt == 187) {
              int i = this.relativeStackSize + 1;
              try {
                if (i > this.maxRelativeStackSize)
                  this.maxRelativeStackSize = i; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw b(null);
              } 
              this.relativeStackSize = i;
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.currentBasicBlock.frame.execute(paramInt, this.lastBytecodeOffset, symbol, this.symbolTable);
  }
  
  static {
    STACK_SIZE_DELTA = new int[] { 
        0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 
        2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 
        0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 
        -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 
        -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 
        1, 1, 2, 2, 2, 0, -1, -2, -1, -2, 
        -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 
        -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, 
        -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, 
        -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 
        1, 1, -1, 0, -1, 0, 0, 0, -3, -1, 
        -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, 
        -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, 
        -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 
        0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 
        0, 0 };
  }
  
  public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
    this.lastBytecodeOffset = this.code.length;
    this.code.putByte(171).putByteArray(null, 0, (4 - this.code.length % 4) % 4);
    paramLabel.put(this.code, this.lastBytecodeOffset, true);
    this.code.putInt(paramArrayOfLabel.length);
    byte b = 0;
    try {
      while (b < paramArrayOfLabel.length) {
        this.code.putInt(paramArrayOfint[b]);
        paramArrayOfLabel[b].put(this.code, this.lastBytecodeOffset, true);
        b++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    visitSwitchInsn(paramLabel, paramArrayOfLabel);
  }
  
  public boolean hasAsmInstructions() {
    return this.hasAsmInstructions;
  }
  
  public void visitLineNumber(int paramInt, Label paramLabel) {
    try {
      if (this.lineNumberTable == null)
        this.lineNumberTable = new ByteVector(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.lineNumberTableLength++;
    this.lineNumberTable.putShort(paramLabel.bytecodeOffset);
    this.lineNumberTable.putShort(paramInt);
  }
  
  public void visitAnnotableParameterCount(int paramInt, boolean paramBoolean) {
    try {
      if (paramBoolean) {
        this.visibleAnnotableParameterCount = paramInt;
      } else {
        this.invisibleAnnotableParameterCount = paramInt;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastCodeRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt & 0xFF0000FF | this.lastBytecodeOffset << 8, paramTypePath, paramString, this.lastCodeRuntimeVisibleTypeAnnotation); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return this.lastCodeRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt & 0xFF0000FF | this.lastBytecodeOffset << 8, paramTypePath, paramString, this.lastCodeRuntimeInvisibleTypeAnnotation);
  }
  
  public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastCodeRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastCodeRuntimeVisibleTypeAnnotation); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return this.lastCodeRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastCodeRuntimeInvisibleTypeAnnotation);
  }
  
  public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
    Handler handler = new Handler(paramLabel1, paramLabel2, paramLabel3, (paramString != null) ? (this.symbolTable.addConstantClass(paramString)).index : 0, paramString);
    try {
      if (this.firstHandler == null) {
        this.firstHandler = handler;
      } else {
        this.lastHandler.nextHandler = handler;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.lastHandler = handler;
  }
  
  public void visitMultiANewArrayInsn(String paramString, int paramInt) {
    this.lastBytecodeOffset = this.code.length;
    Symbol symbol = this.symbolTable.addConstantClass(paramString);
    try {
      this.code.put12(197, symbol.index).putByte(paramInt);
      if (this.currentBasicBlock != null) {
        try {
          if (this.compute != 4) {
            try {
              if (this.compute == 3) {
                this.currentBasicBlock.frame.execute(197, paramInt, symbol, this.symbolTable);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            this.relativeStackSize += 1 - paramInt;
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.currentBasicBlock.frame.execute(197, paramInt, symbol, this.symbolTable);
  }
  
  public AnnotationVisitor visitAnnotationDefault() {
    this.defaultValue = new ByteVector();
    return new AnnotationWriter(this.symbolTable, false, this.defaultValue, null);
  }
  
  public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   5: getfield length : I
    //   8: putfield lastBytecodeOffset : I
    //   11: aload_0
    //   12: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   15: aload_2
    //   16: aload_3
    //   17: aload #4
    //   19: invokevirtual addConstantFieldref : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;
    //   22: astore #5
    //   24: aload_0
    //   25: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   28: iload_1
    //   29: aload #5
    //   31: getfield index : I
    //   34: invokevirtual put12 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   37: pop
    //   38: aload_0
    //   39: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   42: ifnull -> 335
    //   45: aload_0
    //   46: getfield compute : I
    //   49: iconst_4
    //   50: if_icmpeq -> 75
    //   53: goto -> 60
    //   56: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   59: athrow
    //   60: aload_0
    //   61: getfield compute : I
    //   64: iconst_3
    //   65: if_icmpne -> 100
    //   68: goto -> 75
    //   71: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   74: athrow
    //   75: aload_0
    //   76: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   79: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   82: iload_1
    //   83: iconst_0
    //   84: aload #5
    //   86: aload_0
    //   87: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   90: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   93: goto -> 335
    //   96: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   99: athrow
    //   100: aload #4
    //   102: iconst_0
    //   103: invokevirtual charAt : (I)C
    //   106: istore #7
    //   108: iload_1
    //   109: tableswitch default -> 268, 178 -> 140, 179 -> 187, 180 -> 228, 181 -> 268
    //   140: aload_0
    //   141: getfield relativeStackSize : I
    //   144: iload #7
    //   146: bipush #68
    //   148: if_icmpeq -> 172
    //   151: goto -> 158
    //   154: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   157: athrow
    //   158: iload #7
    //   160: bipush #74
    //   162: if_icmpne -> 180
    //   165: goto -> 172
    //   168: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   171: athrow
    //   172: iconst_2
    //   173: goto -> 181
    //   176: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   179: athrow
    //   180: iconst_1
    //   181: iadd
    //   182: istore #6
    //   184: goto -> 307
    //   187: aload_0
    //   188: getfield relativeStackSize : I
    //   191: iload #7
    //   193: bipush #68
    //   195: if_icmpeq -> 212
    //   198: iload #7
    //   200: bipush #74
    //   202: if_icmpne -> 221
    //   205: goto -> 212
    //   208: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   211: athrow
    //   212: bipush #-2
    //   214: goto -> 222
    //   217: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   220: athrow
    //   221: iconst_m1
    //   222: iadd
    //   223: istore #6
    //   225: goto -> 307
    //   228: aload_0
    //   229: getfield relativeStackSize : I
    //   232: iload #7
    //   234: bipush #68
    //   236: if_icmpeq -> 253
    //   239: iload #7
    //   241: bipush #74
    //   243: if_icmpne -> 261
    //   246: goto -> 253
    //   249: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   252: athrow
    //   253: iconst_1
    //   254: goto -> 262
    //   257: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   260: athrow
    //   261: iconst_0
    //   262: iadd
    //   263: istore #6
    //   265: goto -> 307
    //   268: aload_0
    //   269: getfield relativeStackSize : I
    //   272: iload #7
    //   274: bipush #68
    //   276: if_icmpeq -> 293
    //   279: iload #7
    //   281: bipush #74
    //   283: if_icmpne -> 302
    //   286: goto -> 293
    //   289: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   292: athrow
    //   293: bipush #-3
    //   295: goto -> 304
    //   298: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   301: athrow
    //   302: bipush #-2
    //   304: iadd
    //   305: istore #6
    //   307: iload #6
    //   309: aload_0
    //   310: getfield maxRelativeStackSize : I
    //   313: if_icmple -> 329
    //   316: aload_0
    //   317: iload #6
    //   319: putfield maxRelativeStackSize : I
    //   322: goto -> 329
    //   325: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   328: athrow
    //   329: aload_0
    //   330: iload #6
    //   332: putfield relativeStackSize : I
    //   335: return
    // Exception table:
    //   from	to	target	type
    //   24	53	56	java/lang/IllegalArgumentException
    //   45	68	71	java/lang/IllegalArgumentException
    //   60	96	96	java/lang/IllegalArgumentException
    //   108	151	154	java/lang/IllegalArgumentException
    //   140	165	168	java/lang/IllegalArgumentException
    //   158	176	176	java/lang/IllegalArgumentException
    //   187	205	208	java/lang/IllegalArgumentException
    //   198	217	217	java/lang/IllegalArgumentException
    //   228	246	249	java/lang/IllegalArgumentException
    //   239	257	257	java/lang/IllegalArgumentException
    //   268	286	289	java/lang/IllegalArgumentException
    //   279	298	298	java/lang/IllegalArgumentException
    //   307	322	325	java/lang/IllegalArgumentException
  }
  
  public void visitIntInsn(int paramInt1, int paramInt2) {
    try {
      this.lastBytecodeOffset = this.code.length;
      if (paramInt1 == 17) {
        this.code.put12(paramInt1, paramInt2);
      } else {
        this.code.put11(paramInt1, paramInt2);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.currentBasicBlock != null) {
        try {
          if (this.compute != 4) {
            try {
              if (this.compute == 3) {
                this.currentBasicBlock.frame.execute(paramInt1, paramInt2, null, null);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            if (paramInt1 != 188) {
              int i = this.relativeStackSize + 1;
              try {
                if (i > this.maxRelativeStackSize)
                  this.maxRelativeStackSize = i; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw b(null);
              } 
              this.relativeStackSize = i;
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.currentBasicBlock.frame.execute(paramInt1, paramInt2, null, null);
  }
  
  public int computeMethodInfoSize() {
    long l = a ^ 0x120EEF343262L;
    try {
      if (this.sourceOffset != 0)
        return 6 + this.sourceLength; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    int i = 8;
    try {
      if (this.code.length > 0) {
        try {
          if (this.code.length > 65535)
            throw new MethodTooLargeException(this.symbolTable.getClassName(), this.name, this.descriptor, this.code.length); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        this.symbolTable.addConstantUtf8("Code");
        i += 16 + this.code.length + Handler.getExceptionTableSize(this.firstHandler);
        try {
          if (this.stackMapTableEntries != null) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            boolean bool = (this.symbolTable.getMajorVersion() >= 50) ? true : false;
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            this.symbolTable.addConstantUtf8(bool ? "StackMapTable" : "StackMap");
            i += 8 + this.stackMapTableEntries.length;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        if (this.lineNumberTable != null) {
          this.symbolTable.addConstantUtf8("LineNumberTable");
          i += 8 + this.lineNumberTable.length;
        } 
        if (this.localVariableTable != null) {
          this.symbolTable.addConstantUtf8("LocalVariableTable");
          i += 8 + this.localVariableTable.length;
        } 
        if (this.localVariableTypeTable != null) {
          this.symbolTable.addConstantUtf8("LocalVariableTypeTable");
          i += 8 + this.localVariableTypeTable.length;
        } 
        if (this.lastCodeRuntimeVisibleTypeAnnotation != null)
          i += this.lastCodeRuntimeVisibleTypeAnnotation.computeAnnotationsSize("RuntimeVisibleTypeAnnotations"); 
        if (this.lastCodeRuntimeInvisibleTypeAnnotation != null)
          i += this.lastCodeRuntimeInvisibleTypeAnnotation.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations"); 
        if (this.firstCodeAttribute != null)
          i += this.firstCodeAttribute.computeAttributesSize(this.symbolTable, this.code.data, this.code.length, this.maxStack, this.maxLocals); 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    if (this.numberOfExceptions > 0) {
      this.symbolTable.addConstantUtf8("Exceptions");
      i += 8 + 2 * this.numberOfExceptions;
    } 
    i += Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex);
    i += AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
    try {
      if (this.lastRuntimeVisibleParameterAnnotations != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        i += AnnotationWriter.computeParameterAnnotationsSize("RuntimeVisibleParameterAnnotations", this.lastRuntimeVisibleParameterAnnotations, (this.visibleAnnotableParameterCount == 0) ? this.lastRuntimeVisibleParameterAnnotations.length : this.visibleAnnotableParameterCount);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeInvisibleParameterAnnotations != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        i += AnnotationWriter.computeParameterAnnotationsSize("RuntimeInvisibleParameterAnnotations", this.lastRuntimeInvisibleParameterAnnotations, (this.invisibleAnnotableParameterCount == 0) ? this.lastRuntimeInvisibleParameterAnnotations.length : this.invisibleAnnotableParameterCount);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    if (this.defaultValue != null) {
      this.symbolTable.addConstantUtf8("AnnotationDefault");
      i += 6 + this.defaultValue.length;
    } 
    if (this.parameters != null) {
      this.symbolTable.addConstantUtf8("MethodParameters");
      i += 7 + this.parameters.length;
    } 
    if (this.firstAttribute != null)
      i += this.firstAttribute.computeAttributesSize(this.symbolTable); 
    return i;
  }
  
  public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
    ByteVector byteVector = new ByteVector();
    byteVector.putByte(paramInt >>> 24).putShort(paramArrayOfLabel1.length);
    byte b = 0;
    try {
      while (b < paramArrayOfLabel1.length) {
        byteVector.putShort((paramArrayOfLabel1[b]).bytecodeOffset).putShort((paramArrayOfLabel2[b]).bytecodeOffset - (paramArrayOfLabel1[b]).bytecodeOffset).putShort(paramArrayOfint[b]);
        b++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      TypePath.put(paramTypePath, byteVector);
      byteVector.putShort(this.symbolTable.addConstantUtf8(paramString)).putShort(0);
      if (paramBoolean)
        return this.lastCodeRuntimeVisibleTypeAnnotation = new AnnotationWriter(this.symbolTable, true, byteVector, this.lastCodeRuntimeVisibleTypeAnnotation); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return this.lastCodeRuntimeInvisibleTypeAnnotation = new AnnotationWriter(this.symbolTable, true, byteVector, this.lastCodeRuntimeInvisibleTypeAnnotation);
  }
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeVisibleTypeAnnotation); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return this.lastRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, paramInt, paramTypePath, paramString, this.lastRuntimeInvisibleTypeAnnotation);
  }
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean)
        return this.lastRuntimeVisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeVisibleAnnotation); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return this.lastRuntimeInvisibleAnnotation = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeInvisibleAnnotation);
  }
  
  public void putMethodInfo(ByteVector paramByteVector) {
    long l = a ^ 0x753E4081FA25L;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    boolean bool1 = (this.symbolTable.getMajorVersion() < 49) ? true : false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    boolean bool2 = bool1 ? true : false;
    try {
      paramByteVector.putShort(this.accessFlags & (bool2 ^ 0xFFFFFFFF)).putShort(this.nameIndex).putShort(this.descriptorIndex);
      if (this.sourceOffset != 0) {
        paramByteVector.putByteArray((this.symbolTable.getSource()).classFileBuffer, this.sourceOffset, this.sourceLength);
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    int i = 0;
    try {
      if (this.code.length > 0)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.numberOfExceptions > 0)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if ((this.accessFlags & 0x1000) != 0)
        try {
          if (bool1)
            i++; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.signatureIndex != 0)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if ((this.accessFlags & 0x20000) != 0)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeVisibleAnnotation != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeInvisibleAnnotation != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeVisibleParameterAnnotations != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeInvisibleParameterAnnotations != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeVisibleTypeAnnotation != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeInvisibleTypeAnnotation != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.defaultValue != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.parameters != null)
        i++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    if (this.firstAttribute != null)
      i += this.firstAttribute.getAttributeCount(); 
    paramByteVector.putShort(i);
    if (this.code.length > 0) {
      int j = 10 + this.code.length + Handler.getExceptionTableSize(this.firstHandler);
      int k = 0;
      if (this.stackMapTableEntries != null) {
        j += 8 + this.stackMapTableEntries.length;
        k++;
      } 
      if (this.lineNumberTable != null) {
        j += 8 + this.lineNumberTable.length;
        k++;
      } 
      if (this.localVariableTable != null) {
        j += 8 + this.localVariableTable.length;
        k++;
      } 
      if (this.localVariableTypeTable != null) {
        j += 8 + this.localVariableTypeTable.length;
        k++;
      } 
      if (this.lastCodeRuntimeVisibleTypeAnnotation != null) {
        j += this.lastCodeRuntimeVisibleTypeAnnotation.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        k++;
      } 
      if (this.lastCodeRuntimeInvisibleTypeAnnotation != null) {
        j += this.lastCodeRuntimeInvisibleTypeAnnotation.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
        k++;
      } 
      if (this.firstCodeAttribute != null) {
        j += this.firstCodeAttribute.computeAttributesSize(this.symbolTable, this.code.data, this.code.length, this.maxStack, this.maxLocals);
        k += this.firstCodeAttribute.getAttributeCount();
      } 
      try {
        paramByteVector.putShort(this.symbolTable.addConstantUtf8("Code")).putInt(j).putShort(this.maxStack).putShort(this.maxLocals).putInt(this.code.length).putByteArray(this.code.data, 0, this.code.length);
        Handler.putExceptionTable(this.firstHandler, paramByteVector);
        paramByteVector.putShort(k);
        if (this.stackMapTableEntries != null) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          boolean bool = (this.symbolTable.getMajorVersion() >= 50) ? true : false;
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          } 
          paramByteVector.putShort(this.symbolTable.addConstantUtf8(bool ? "StackMapTable" : "StackMap")).putInt(2 + this.stackMapTableEntries.length).putShort(this.stackMapTableNumberOfEntries).putByteArray(this.stackMapTableEntries.data, 0, this.stackMapTableEntries.length);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        if (this.lineNumberTable != null)
          paramByteVector.putShort(this.symbolTable.addConstantUtf8("LineNumberTable")).putInt(2 + this.lineNumberTable.length).putShort(this.lineNumberTableLength).putByteArray(this.lineNumberTable.data, 0, this.lineNumberTable.length); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        if (this.localVariableTable != null)
          paramByteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTable")).putInt(2 + this.localVariableTable.length).putShort(this.localVariableTableLength).putByteArray(this.localVariableTable.data, 0, this.localVariableTable.length); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        if (this.localVariableTypeTable != null)
          paramByteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTypeTable")).putInt(2 + this.localVariableTypeTable.length).putShort(this.localVariableTypeTableLength).putByteArray(this.localVariableTypeTable.data, 0, this.localVariableTypeTable.length); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        if (this.lastCodeRuntimeVisibleTypeAnnotation != null)
          this.lastCodeRuntimeVisibleTypeAnnotation.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), paramByteVector); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        if (this.lastCodeRuntimeInvisibleTypeAnnotation != null)
          this.lastCodeRuntimeInvisibleTypeAnnotation.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), paramByteVector); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        if (this.firstCodeAttribute != null)
          this.firstCodeAttribute.putAttributes(this.symbolTable, this.code.data, this.code.length, this.maxStack, this.maxLocals, paramByteVector); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
    } 
    if (this.numberOfExceptions > 0) {
      paramByteVector.putShort(this.symbolTable.addConstantUtf8("Exceptions")).putInt(2 + 2 * this.numberOfExceptions).putShort(this.numberOfExceptions);
      for (int j : this.exceptionIndexTable)
        paramByteVector.putShort(j); 
    } 
    try {
      Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, paramByteVector);
      AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, paramByteVector);
      if (this.lastRuntimeVisibleParameterAnnotations != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        AnnotationWriter.putParameterAnnotations(this.symbolTable.addConstantUtf8("RuntimeVisibleParameterAnnotations"), this.lastRuntimeVisibleParameterAnnotations, (this.visibleAnnotableParameterCount == 0) ? this.lastRuntimeVisibleParameterAnnotations.length : this.visibleAnnotableParameterCount, paramByteVector);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeInvisibleParameterAnnotations != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        AnnotationWriter.putParameterAnnotations(this.symbolTable.addConstantUtf8("RuntimeInvisibleParameterAnnotations"), this.lastRuntimeInvisibleParameterAnnotations, (this.invisibleAnnotableParameterCount == 0) ? this.lastRuntimeInvisibleParameterAnnotations.length : this.invisibleAnnotableParameterCount, paramByteVector);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.defaultValue != null)
        paramByteVector.putShort(this.symbolTable.addConstantUtf8("AnnotationDefault")).putInt(this.defaultValue.length).putByteArray(this.defaultValue.data, 0, this.defaultValue.length); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.parameters != null)
        paramByteVector.putShort(this.symbolTable.addConstantUtf8("MethodParameters")).putInt(1 + this.parameters.length).putByte(this.parametersCount).putByteArray(this.parameters.data, 0, this.parameters.length); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.firstAttribute != null)
        this.firstAttribute.putAttributes(this.symbolTable, paramByteVector); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
    try {
      if (paramBoolean) {
        try {
          if (this.lastRuntimeVisibleParameterAnnotations == null)
            this.lastRuntimeVisibleParameterAnnotations = new AnnotationWriter[(Type.getArgumentTypes(this.descriptor)).length]; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        this.lastRuntimeVisibleParameterAnnotations[paramInt] = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeVisibleParameterAnnotations[paramInt]);
        return AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeVisibleParameterAnnotations[paramInt]);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.lastRuntimeInvisibleParameterAnnotations == null)
        this.lastRuntimeInvisibleParameterAnnotations = new AnnotationWriter[(Type.getArgumentTypes(this.descriptor)).length]; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.lastRuntimeInvisibleParameterAnnotations[paramInt] = AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeInvisibleParameterAnnotations[paramInt]);
    return AnnotationWriter.create(this.symbolTable, paramString, this.lastRuntimeInvisibleParameterAnnotations[paramInt]);
  }
  
  public void visitParameter(String paramString, int paramInt) {
    try {
      if (this.parameters == null)
        this.parameters = new ByteVector(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      this.parametersCount++;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.parameters.putShort((paramString == null) ? 0 : this.symbolTable.addConstantUtf8(paramString)).putShort(paramInt);
  }
  
  public void visitAttribute(Attribute paramAttribute) {
    try {
      if (paramAttribute.isCodeAttribute()) {
        paramAttribute.nextAttribute = this.firstCodeAttribute;
        this.firstCodeAttribute = paramAttribute;
      } else {
        paramAttribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = paramAttribute;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter.a : J
    //   3: ldc2_w 63839294763676
    //   6: lxor
    //   7: lstore #6
    //   9: aload_0
    //   10: getfield compute : I
    //   13: iconst_4
    //   14: if_icmpne -> 22
    //   17: return
    //   18: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   21: athrow
    //   22: aload_0
    //   23: getfield compute : I
    //   26: iconst_3
    //   27: if_icmpne -> 152
    //   30: aload_0
    //   31: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   34: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   37: ifnonnull -> 106
    //   40: goto -> 47
    //   43: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   46: athrow
    //   47: aload_0
    //   48: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   51: new me/rerere/matrix/thirdparty/org/objectweb/asm/CurrentFrame
    //   54: dup
    //   55: aload_0
    //   56: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   59: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   62: putfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   65: aload_0
    //   66: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   69: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   72: aload_0
    //   73: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   76: aload_0
    //   77: getfield accessFlags : I
    //   80: aload_0
    //   81: getfield descriptor : Ljava/lang/String;
    //   84: iload_2
    //   85: invokevirtual setInputFrameFromDescriptor : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;ILjava/lang/String;I)V
    //   88: aload_0
    //   89: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   92: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   95: aload_0
    //   96: invokevirtual accept : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter;)V
    //   99: goto -> 781
    //   102: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   105: athrow
    //   106: iload_1
    //   107: iconst_m1
    //   108: if_icmpne -> 138
    //   111: aload_0
    //   112: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   115: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   118: aload_0
    //   119: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   122: iload_2
    //   123: aload_3
    //   124: iload #4
    //   126: aload #5
    //   128: invokevirtual setInputFrameFromApiFormat : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;I[Ljava/lang/Object;I[Ljava/lang/Object;)V
    //   131: goto -> 138
    //   134: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   137: athrow
    //   138: aload_0
    //   139: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   142: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   145: aload_0
    //   146: invokevirtual accept : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter;)V
    //   149: goto -> 781
    //   152: iload_1
    //   153: iconst_m1
    //   154: if_icmpne -> 333
    //   157: aload_0
    //   158: getfield previousFrame : [I
    //   161: ifnonnull -> 223
    //   164: goto -> 171
    //   167: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   170: athrow
    //   171: aload_0
    //   172: getfield descriptor : Ljava/lang/String;
    //   175: invokestatic getArgumentsAndReturnSizes : (Ljava/lang/String;)I
    //   178: iconst_2
    //   179: ishr
    //   180: istore #8
    //   182: new me/rerere/matrix/thirdparty/org/objectweb/asm/Frame
    //   185: dup
    //   186: new me/rerere/matrix/thirdparty/org/objectweb/asm/Label
    //   189: dup
    //   190: invokespecial <init> : ()V
    //   193: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   196: astore #9
    //   198: aload #9
    //   200: aload_0
    //   201: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   204: aload_0
    //   205: getfield accessFlags : I
    //   208: aload_0
    //   209: getfield descriptor : Ljava/lang/String;
    //   212: iload #8
    //   214: invokevirtual setInputFrameFromDescriptor : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;ILjava/lang/String;I)V
    //   217: aload #9
    //   219: aload_0
    //   220: invokevirtual accept : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter;)V
    //   223: aload_0
    //   224: iload_2
    //   225: putfield currentLocals : I
    //   228: aload_0
    //   229: aload_0
    //   230: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   233: getfield length : I
    //   236: iload_2
    //   237: iload #4
    //   239: invokevirtual visitFrameStart : (III)I
    //   242: istore #8
    //   244: iconst_0
    //   245: istore #9
    //   247: iload #9
    //   249: iload_2
    //   250: if_icmpge -> 284
    //   253: aload_0
    //   254: getfield currentFrame : [I
    //   257: iload #8
    //   259: iinc #8, 1
    //   262: aload_0
    //   263: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   266: aload_3
    //   267: iload #9
    //   269: aaload
    //   270: invokestatic getAbstractTypeFromApiFormat : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I
    //   273: iastore
    //   274: iinc #9, 1
    //   277: goto -> 247
    //   280: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   283: athrow
    //   284: iconst_0
    //   285: istore #9
    //   287: iload #9
    //   289: iload #4
    //   291: if_icmpge -> 326
    //   294: aload_0
    //   295: getfield currentFrame : [I
    //   298: iload #8
    //   300: iinc #8, 1
    //   303: aload_0
    //   304: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   307: aload #5
    //   309: iload #9
    //   311: aaload
    //   312: invokestatic getAbstractTypeFromApiFormat : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I
    //   315: iastore
    //   316: iinc #9, 1
    //   319: goto -> 287
    //   322: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   325: athrow
    //   326: aload_0
    //   327: invokevirtual visitFrameEnd : ()V
    //   330: goto -> 781
    //   333: aload_0
    //   334: getfield symbolTable : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;
    //   337: invokevirtual getMajorVersion : ()I
    //   340: bipush #50
    //   342: if_icmpge -> 360
    //   345: new java/lang/IllegalArgumentException
    //   348: dup
    //   349: ldc_w 'Class versions V1_5 or less must use F_NEW frames.'
    //   352: invokespecial <init> : (Ljava/lang/String;)V
    //   355: athrow
    //   356: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   359: athrow
    //   360: aload_0
    //   361: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   364: ifnonnull -> 390
    //   367: aload_0
    //   368: new me/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector
    //   371: dup
    //   372: invokespecial <init> : ()V
    //   375: putfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   378: aload_0
    //   379: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   382: getfield length : I
    //   385: istore #8
    //   387: goto -> 436
    //   390: aload_0
    //   391: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   394: getfield length : I
    //   397: aload_0
    //   398: getfield previousFrameOffset : I
    //   401: isub
    //   402: iconst_1
    //   403: isub
    //   404: istore #8
    //   406: iload #8
    //   408: ifge -> 436
    //   411: iload_1
    //   412: iconst_3
    //   413: if_icmpne -> 428
    //   416: goto -> 423
    //   419: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   422: athrow
    //   423: return
    //   424: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   427: athrow
    //   428: new java/lang/IllegalStateException
    //   431: dup
    //   432: invokespecial <init> : ()V
    //   435: athrow
    //   436: iload_1
    //   437: tableswitch default -> 752, 0 -> 472, 1 -> 566, 2 -> 624, 3 -> 655, 4 -> 698
    //   472: aload_0
    //   473: iload_2
    //   474: putfield currentLocals : I
    //   477: aload_0
    //   478: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   481: sipush #255
    //   484: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   487: iload #8
    //   489: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   492: iload_2
    //   493: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   496: pop
    //   497: iconst_0
    //   498: istore #9
    //   500: iload #9
    //   502: iload_2
    //   503: if_icmpge -> 524
    //   506: aload_0
    //   507: aload_3
    //   508: iload #9
    //   510: aaload
    //   511: invokespecial putFrameType : (Ljava/lang/Object;)V
    //   514: iinc #9, 1
    //   517: goto -> 500
    //   520: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   523: athrow
    //   524: aload_0
    //   525: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   528: iload #4
    //   530: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   533: pop
    //   534: iconst_0
    //   535: istore #9
    //   537: iload #9
    //   539: iload #4
    //   541: if_icmpge -> 563
    //   544: aload_0
    //   545: aload #5
    //   547: iload #9
    //   549: aaload
    //   550: invokespecial putFrameType : (Ljava/lang/Object;)V
    //   553: iinc #9, 1
    //   556: goto -> 537
    //   559: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   562: athrow
    //   563: goto -> 760
    //   566: aload_0
    //   567: dup
    //   568: getfield currentLocals : I
    //   571: iload_2
    //   572: iadd
    //   573: putfield currentLocals : I
    //   576: aload_0
    //   577: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   580: sipush #251
    //   583: iload_2
    //   584: iadd
    //   585: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   588: iload #8
    //   590: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   593: pop
    //   594: iconst_0
    //   595: istore #9
    //   597: iload #9
    //   599: iload_2
    //   600: if_icmpge -> 621
    //   603: aload_0
    //   604: aload_3
    //   605: iload #9
    //   607: aaload
    //   608: invokespecial putFrameType : (Ljava/lang/Object;)V
    //   611: iinc #9, 1
    //   614: goto -> 597
    //   617: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   620: athrow
    //   621: goto -> 760
    //   624: aload_0
    //   625: dup
    //   626: getfield currentLocals : I
    //   629: iload_2
    //   630: isub
    //   631: putfield currentLocals : I
    //   634: aload_0
    //   635: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   638: sipush #251
    //   641: iload_2
    //   642: isub
    //   643: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   646: iload #8
    //   648: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   651: pop
    //   652: goto -> 760
    //   655: iload #8
    //   657: bipush #64
    //   659: if_icmpge -> 679
    //   662: aload_0
    //   663: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   666: iload #8
    //   668: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   671: pop
    //   672: goto -> 760
    //   675: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   678: athrow
    //   679: aload_0
    //   680: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   683: sipush #251
    //   686: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   689: iload #8
    //   691: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   694: pop
    //   695: goto -> 760
    //   698: iload #8
    //   700: bipush #64
    //   702: if_icmpge -> 725
    //   705: aload_0
    //   706: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   709: bipush #64
    //   711: iload #8
    //   713: iadd
    //   714: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   717: pop
    //   718: goto -> 741
    //   721: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   724: athrow
    //   725: aload_0
    //   726: getfield stackMapTableEntries : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   729: sipush #247
    //   732: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   735: iload #8
    //   737: invokevirtual putShort : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   740: pop
    //   741: aload_0
    //   742: aload #5
    //   744: iconst_0
    //   745: aaload
    //   746: invokespecial putFrameType : (Ljava/lang/Object;)V
    //   749: goto -> 760
    //   752: new java/lang/IllegalArgumentException
    //   755: dup
    //   756: invokespecial <init> : ()V
    //   759: athrow
    //   760: aload_0
    //   761: aload_0
    //   762: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   765: getfield length : I
    //   768: putfield previousFrameOffset : I
    //   771: aload_0
    //   772: dup
    //   773: getfield stackMapTableNumberOfEntries : I
    //   776: iconst_1
    //   777: iadd
    //   778: putfield stackMapTableNumberOfEntries : I
    //   781: aload_0
    //   782: getfield compute : I
    //   785: iconst_2
    //   786: if_icmpne -> 890
    //   789: aload_0
    //   790: iload #4
    //   792: putfield relativeStackSize : I
    //   795: iconst_0
    //   796: istore #8
    //   798: iload #8
    //   800: iload #4
    //   802: if_icmpge -> 864
    //   805: aload #5
    //   807: iload #8
    //   809: aaload
    //   810: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.LONG : Ljava/lang/Integer;
    //   813: if_acmpeq -> 841
    //   816: goto -> 823
    //   819: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   822: athrow
    //   823: aload #5
    //   825: iload #8
    //   827: aaload
    //   828: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.DOUBLE : Ljava/lang/Integer;
    //   831: if_acmpne -> 858
    //   834: goto -> 841
    //   837: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   840: athrow
    //   841: aload_0
    //   842: dup
    //   843: getfield relativeStackSize : I
    //   846: iconst_1
    //   847: iadd
    //   848: putfield relativeStackSize : I
    //   851: goto -> 858
    //   854: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   857: athrow
    //   858: iinc #8, 1
    //   861: goto -> 798
    //   864: aload_0
    //   865: getfield relativeStackSize : I
    //   868: aload_0
    //   869: getfield maxRelativeStackSize : I
    //   872: if_icmple -> 890
    //   875: aload_0
    //   876: aload_0
    //   877: getfield relativeStackSize : I
    //   880: putfield maxRelativeStackSize : I
    //   883: goto -> 890
    //   886: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   889: athrow
    //   890: aload_0
    //   891: aload_0
    //   892: getfield maxStack : I
    //   895: iload #4
    //   897: invokestatic max : (II)I
    //   900: putfield maxStack : I
    //   903: aload_0
    //   904: aload_0
    //   905: getfield maxLocals : I
    //   908: aload_0
    //   909: getfield currentLocals : I
    //   912: invokestatic max : (II)I
    //   915: putfield maxLocals : I
    //   918: return
    // Exception table:
    //   from	to	target	type
    //   9	18	18	java/lang/IllegalArgumentException
    //   22	40	43	java/lang/IllegalArgumentException
    //   30	102	102	java/lang/IllegalArgumentException
    //   106	131	134	java/lang/IllegalArgumentException
    //   152	164	167	java/lang/IllegalArgumentException
    //   247	280	280	java/lang/IllegalArgumentException
    //   287	322	322	java/lang/IllegalArgumentException
    //   333	356	356	java/lang/IllegalArgumentException
    //   406	416	419	java/lang/IllegalArgumentException
    //   411	424	424	java/lang/IllegalArgumentException
    //   500	520	520	java/lang/IllegalArgumentException
    //   537	559	559	java/lang/IllegalArgumentException
    //   597	617	617	java/lang/IllegalArgumentException
    //   655	675	675	java/lang/IllegalArgumentException
    //   698	721	721	java/lang/IllegalArgumentException
    //   798	816	819	java/lang/IllegalArgumentException
    //   805	834	837	java/lang/IllegalArgumentException
    //   823	851	854	java/lang/IllegalArgumentException
    //   864	883	886	java/lang/IllegalArgumentException
  }
  
  public final void collectAttributePrototypes(Attribute$Set paramAttribute$Set) {
    paramAttribute$Set.addAttributes(this.firstAttribute);
    paramAttribute$Set.addAttributes(this.firstCodeAttribute);
  }
  
  public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    this.lastBytecodeOffset = this.code.length;
    Symbol symbol = this.symbolTable.addConstantMethodref(paramString1, paramString2, paramString3, paramBoolean);
    try {
      if (paramInt == 185) {
        this.code.put12(185, symbol.index).put11(symbol.getArgumentsAndReturnSizes() >> 2, 0);
      } else {
        this.code.put12(paramInt, symbol.index);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (this.currentBasicBlock != null) {
        try {
          if (this.compute != 4) {
            int k;
            try {
              if (this.compute == 3) {
                this.currentBasicBlock.frame.execute(paramInt, 0, symbol, this.symbolTable);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            int i = symbol.getArgumentsAndReturnSizes();
            int j = (i & 0x3) - (i >> 2);
            if (paramInt == 184) {
              k = this.relativeStackSize + j + 1;
            } else {
              k = this.relativeStackSize + j;
            } 
            try {
              if (k > this.maxRelativeStackSize)
                this.maxRelativeStackSize = k; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            this.relativeStackSize = k;
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.currentBasicBlock.frame.execute(paramInt, 0, symbol, this.symbolTable);
  }
  
  public int visitFrameStart(int paramInt1, int paramInt2, int paramInt3) {
    int i = 3 + paramInt2 + paramInt3;
    try {
      if (this.currentFrame != null) {
        try {
          if (this.currentFrame.length < i) {
            this.currentFrame = new int[i];
            this.currentFrame[0] = paramInt1;
            this.currentFrame[1] = paramInt2;
            this.currentFrame[2] = paramInt3;
            return 3;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        this.currentFrame[0] = paramInt1;
        this.currentFrame[1] = paramInt2;
        this.currentFrame[2] = paramInt3;
        return 3;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.currentFrame = new int[i];
    this.currentFrame[0] = paramInt1;
    this.currentFrame[1] = paramInt2;
    this.currentFrame[2] = paramInt3;
    return 3;
  }
  
  public void visitAbstractType(int paramInt1, int paramInt2) {
    this.currentFrame[paramInt1] = paramInt2;
  }
  
  public MethodWriter(SymbolTable paramSymbolTable, int paramInt1, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString, int paramInt2) {
    super(589824);
    this.symbolTable = paramSymbolTable;
    try {
      this.accessFlags = "<init>".equals(paramString1) ? (paramInt1 | 0x40000) : paramInt1;
      this.nameIndex = paramSymbolTable.addConstantUtf8(paramString1);
      this.name = paramString1;
      this.descriptorIndex = paramSymbolTable.addConstantUtf8(paramString2);
      this.descriptor = paramString2;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      this.signatureIndex = (paramString3 == null) ? 0 : paramSymbolTable.addConstantUtf8(paramString3);
      if (paramArrayOfString != null && paramArrayOfString.length > 0) {
        this.numberOfExceptions = paramArrayOfString.length;
        this.exceptionIndexTable = new int[this.numberOfExceptions];
        byte b = 0;
        try {
          while (b < this.numberOfExceptions) {
            this.exceptionIndexTable[b] = (paramSymbolTable.addConstantClass(paramArrayOfString[b])).index;
            b++;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } else {
        this.numberOfExceptions = 0;
        this.exceptionIndexTable = null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    this.compute = paramInt2;
    if (paramInt2 != 0) {
      int i = Type.getArgumentsAndReturnSizes(paramString2) >> 2;
      try {
        if ((paramInt1 & 0x8) != 0)
          i--; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      this.maxLocals = i;
      this.currentLocals = i;
      this.firstBasicBlock = new Label();
      visitLabel(this.firstBasicBlock);
    } 
  }
  
  public void visitVarInsn(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   5: getfield length : I
    //   8: putfield lastBytecodeOffset : I
    //   11: iload_2
    //   12: iconst_4
    //   13: if_icmpge -> 82
    //   16: iload_1
    //   17: sipush #169
    //   20: if_icmpeq -> 82
    //   23: goto -> 30
    //   26: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: iload_1
    //   31: bipush #54
    //   33: if_icmpge -> 58
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: bipush #26
    //   45: iload_1
    //   46: bipush #21
    //   48: isub
    //   49: iconst_2
    //   50: ishl
    //   51: iadd
    //   52: iload_2
    //   53: iadd
    //   54: istore_3
    //   55: goto -> 70
    //   58: bipush #59
    //   60: iload_1
    //   61: bipush #54
    //   63: isub
    //   64: iconst_2
    //   65: ishl
    //   66: iadd
    //   67: iload_2
    //   68: iadd
    //   69: istore_3
    //   70: aload_0
    //   71: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   74: iload_3
    //   75: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   78: pop
    //   79: goto -> 122
    //   82: iload_2
    //   83: sipush #256
    //   86: if_icmplt -> 112
    //   89: aload_0
    //   90: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   93: sipush #196
    //   96: invokevirtual putByte : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   99: iload_1
    //   100: iload_2
    //   101: invokevirtual put12 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   104: pop
    //   105: goto -> 122
    //   108: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   111: athrow
    //   112: aload_0
    //   113: getfield code : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   116: iload_1
    //   117: iload_2
    //   118: invokevirtual put11 : (II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   121: pop
    //   122: aload_0
    //   123: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   126: ifnull -> 261
    //   129: aload_0
    //   130: getfield compute : I
    //   133: iconst_4
    //   134: if_icmpeq -> 159
    //   137: goto -> 144
    //   140: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   143: athrow
    //   144: aload_0
    //   145: getfield compute : I
    //   148: iconst_3
    //   149: if_icmpne -> 180
    //   152: goto -> 159
    //   155: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   158: athrow
    //   159: aload_0
    //   160: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   163: getfield frame : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Frame;
    //   166: iload_1
    //   167: iload_2
    //   168: aconst_null
    //   169: aconst_null
    //   170: invokevirtual execute : (IILme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;)V
    //   173: goto -> 261
    //   176: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   179: athrow
    //   180: iload_1
    //   181: sipush #169
    //   184: if_icmpne -> 225
    //   187: aload_0
    //   188: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   191: dup
    //   192: getfield flags : S
    //   195: bipush #64
    //   197: ior
    //   198: i2s
    //   199: putfield flags : S
    //   202: aload_0
    //   203: getfield currentBasicBlock : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   206: aload_0
    //   207: getfield relativeStackSize : I
    //   210: i2s
    //   211: putfield outputStackSize : S
    //   214: aload_0
    //   215: invokespecial endCurrentBasicBlockWithNoSuccessor : ()V
    //   218: goto -> 261
    //   221: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   224: athrow
    //   225: aload_0
    //   226: getfield relativeStackSize : I
    //   229: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/MethodWriter.STACK_SIZE_DELTA : [I
    //   232: iload_1
    //   233: iaload
    //   234: iadd
    //   235: istore_3
    //   236: iload_3
    //   237: aload_0
    //   238: getfield maxRelativeStackSize : I
    //   241: if_icmple -> 256
    //   244: aload_0
    //   245: iload_3
    //   246: putfield maxRelativeStackSize : I
    //   249: goto -> 256
    //   252: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   255: athrow
    //   256: aload_0
    //   257: iload_3
    //   258: putfield relativeStackSize : I
    //   261: aload_0
    //   262: getfield compute : I
    //   265: ifeq -> 351
    //   268: iload_1
    //   269: bipush #22
    //   271: if_icmpeq -> 320
    //   274: goto -> 281
    //   277: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   280: athrow
    //   281: iload_1
    //   282: bipush #24
    //   284: if_icmpeq -> 320
    //   287: goto -> 294
    //   290: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   293: athrow
    //   294: iload_1
    //   295: bipush #55
    //   297: if_icmpeq -> 320
    //   300: goto -> 307
    //   303: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   306: athrow
    //   307: iload_1
    //   308: bipush #57
    //   310: if_icmpne -> 327
    //   313: goto -> 320
    //   316: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   319: athrow
    //   320: iload_2
    //   321: iconst_2
    //   322: iadd
    //   323: istore_3
    //   324: goto -> 331
    //   327: iload_2
    //   328: iconst_1
    //   329: iadd
    //   330: istore_3
    //   331: iload_3
    //   332: aload_0
    //   333: getfield maxLocals : I
    //   336: if_icmple -> 351
    //   339: aload_0
    //   340: iload_3
    //   341: putfield maxLocals : I
    //   344: goto -> 351
    //   347: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   350: athrow
    //   351: iload_1
    //   352: bipush #54
    //   354: if_icmplt -> 404
    //   357: aload_0
    //   358: getfield compute : I
    //   361: iconst_4
    //   362: if_icmpne -> 404
    //   365: goto -> 372
    //   368: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   371: athrow
    //   372: aload_0
    //   373: getfield firstHandler : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Handler;
    //   376: ifnull -> 404
    //   379: goto -> 386
    //   382: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   385: athrow
    //   386: aload_0
    //   387: new me/rerere/matrix/thirdparty/org/objectweb/asm/Label
    //   390: dup
    //   391: invokespecial <init> : ()V
    //   394: invokevirtual visitLabel : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)V
    //   397: goto -> 404
    //   400: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   403: athrow
    //   404: return
    // Exception table:
    //   from	to	target	type
    //   0	23	26	java/lang/IllegalArgumentException
    //   16	36	39	java/lang/IllegalArgumentException
    //   82	108	108	java/lang/IllegalArgumentException
    //   122	137	140	java/lang/IllegalArgumentException
    //   129	152	155	java/lang/IllegalArgumentException
    //   144	176	176	java/lang/IllegalArgumentException
    //   180	221	221	java/lang/IllegalArgumentException
    //   236	249	252	java/lang/IllegalArgumentException
    //   261	274	277	java/lang/IllegalArgumentException
    //   268	287	290	java/lang/IllegalArgumentException
    //   281	300	303	java/lang/IllegalArgumentException
    //   294	313	316	java/lang/IllegalArgumentException
    //   331	344	347	java/lang/IllegalArgumentException
    //   351	365	368	java/lang/IllegalArgumentException
    //   357	379	382	java/lang/IllegalArgumentException
    //   372	397	400	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\MethodWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */