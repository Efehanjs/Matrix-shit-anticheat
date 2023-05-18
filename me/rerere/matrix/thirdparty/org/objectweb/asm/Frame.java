package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public class Frame {
  private short outputStackStart;
  
  private int[] outputStack;
  
  private static final int FLOAT = 4194306;
  
  private static final int KIND_MASK = 62914560;
  
  private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
  
  private static final int DIM_SIZE = 6;
  
  public static final int ITEM_TOP = 0;
  
  private static final int ITEM_ASM_BYTE = 10;
  
  private static final int ARRAY_OF = 67108864;
  
  public static final int RESERVED = 128;
  
  private int[] inputLocals;
  
  public static final int ITEM_OBJECT = 7;
  
  private static final int UNINITIALIZED_KIND = 12582912;
  
  private static final int NULL = 4194309;
  
  private static final int FLAGS_SIZE = 2;
  
  public static final int ITEM_FLOAT = 2;
  
  private static final int DIM_SHIFT = 26;
  
  private int[] outputLocals;
  
  private static final int ELEMENT_OF = -67108864;
  
  private int initializationCount;
  
  private static final int STACK_KIND = 20971520;
  
  public static final int FULL_FRAME = 255;
  
  private static final int KIND_SHIFT = 22;
  
  public Label owner;
  
  public static final int ITEM_UNINITIALIZED_THIS = 6;
  
  private static final int SHORT = 4194316;
  
  private short outputStackTop;
  
  private static final int ITEM_ASM_CHAR = 11;
  
  public static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
  
  public static final int ITEM_LONG = 4;
  
  private static final int TOP = 4194304;
  
  private static final int UNINITIALIZED_THIS = 4194310;
  
  private static final int CONSTANT_KIND = 4194304;
  
  public static final int SAME_FRAME = 0;
  
  public static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
  
  private int[] inputStack;
  
  private static final int INTEGER = 4194305;
  
  public static final int ITEM_NULL = 5;
  
  private static final int REFERENCE_KIND = 8388608;
  
  private static final int KIND_SIZE = 4;
  
  private static final int BYTE = 4194314;
  
  private static final int DOUBLE = 4194307;
  
  private static final int VALUE_MASK = 1048575;
  
  private static final int CHAR = 4194315;
  
  private static final int ITEM_ASM_BOOLEAN = 9;
  
  private static final int ITEM_ASM_SHORT = 12;
  
  public static final int ITEM_DOUBLE = 3;
  
  private static final int VALUE_SIZE = 20;
  
  private static final int LOCAL_KIND = 16777216;
  
  public static final int CHOP_FRAME = 248;
  
  private static final int BOOLEAN = 4194313;
  
  private int[] initializations;
  
  private static final int DIM_MASK = -67108864;
  
  public static final int APPEND_FRAME = 252;
  
  public static final int SAME_FRAME_EXTENDED = 251;
  
  private static final int LONG = 4194308;
  
  public static final int ITEM_UNINITIALIZED = 8;
  
  public static final int ITEM_INTEGER = 1;
  
  private static final int FLAGS_SHIFT = 20;
  
  private static final long a = o3.a(-5103811034093539119L, -7457467509689038662L, null).a(185700650405294L);
  
  public final void copyFrom(Frame paramFrame) {
    this.inputLocals = paramFrame.inputLocals;
    this.inputStack = paramFrame.inputStack;
    this.outputStackStart = 0;
    this.outputLocals = paramFrame.outputLocals;
    this.outputStack = paramFrame.outputStack;
    this.outputStackTop = paramFrame.outputStackTop;
    this.initializationCount = paramFrame.initializationCount;
    this.initializations = paramFrame.initializations;
  }
  
  public static int getAbstractTypeFromInternalName(SymbolTable paramSymbolTable, String paramString) {
    return 0x800000 | paramSymbolTable.addType(paramString);
  }
  
  public static void putAbstractType(SymbolTable paramSymbolTable, int paramInt, ByteVector paramByteVector) {
    int i = (paramInt & 0xFC000000) >> 26;
    if (i == 0) {
      int j = paramInt & 0xFFFFF;
      try {
        switch (paramInt & 0x3C00000) {
          case 4194304:
            paramByteVector.putByte(j);
            return;
          case 8388608:
            paramByteVector.putByte(7).putShort((paramSymbolTable.addConstantClass((paramSymbolTable.getType(j)).value)).index);
            return;
          case 12582912:
            paramByteVector.putByte(8).putShort((int)(paramSymbolTable.getType(j)).data);
            return;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      throw new AssertionError();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    try {
      while (i-- > 0)
        stringBuilder.append('['); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if ((paramInt & 0x3C00000) == 8388608) {
        stringBuilder.append('L').append((paramSymbolTable.getType(paramInt & 0xFFFFF)).value).append(';');
      } else {
        try {
          switch (paramInt & 0xFFFFF) {
            case 9:
              stringBuilder.append('Z');
              break;
            case 10:
              stringBuilder.append('B');
              break;
            case 11:
              stringBuilder.append('C');
              break;
            case 12:
              stringBuilder.append('S');
              break;
            case 1:
              stringBuilder.append('I');
              break;
            case 2:
              stringBuilder.append('F');
              break;
            case 4:
              stringBuilder.append('J');
              break;
            case 3:
              stringBuilder.append('D');
              break;
            default:
              throw new AssertionError();
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramByteVector.putByte(7).putShort((paramSymbolTable.addConstantClass(stringBuilder.toString())).index);
  }
  
  public final void setInputFrameFromDescriptor(SymbolTable paramSymbolTable, int paramInt1, String paramString, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload #4
    //   3: newarray int
    //   5: putfield inputLocals : [I
    //   8: aload_0
    //   9: iconst_0
    //   10: newarray int
    //   12: putfield inputStack : [I
    //   15: iconst_0
    //   16: istore #5
    //   18: iload_2
    //   19: bipush #8
    //   21: iand
    //   22: ifne -> 80
    //   25: iload_2
    //   26: ldc_w 262144
    //   29: iand
    //   30: ifne -> 68
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: aload_0
    //   41: getfield inputLocals : [I
    //   44: iload #5
    //   46: iinc #5, 1
    //   49: ldc 8388608
    //   51: aload_1
    //   52: aload_1
    //   53: invokevirtual getClassName : ()Ljava/lang/String;
    //   56: invokevirtual addType : (Ljava/lang/String;)I
    //   59: ior
    //   60: iastore
    //   61: goto -> 80
    //   64: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield inputLocals : [I
    //   72: iload #5
    //   74: iinc #5, 1
    //   77: ldc 4194310
    //   79: iastore
    //   80: aload_3
    //   81: invokestatic getArgumentTypes : (Ljava/lang/String;)[Lme/rerere/matrix/thirdparty/org/objectweb/asm/Type;
    //   84: astore #6
    //   86: aload #6
    //   88: arraylength
    //   89: istore #7
    //   91: iconst_0
    //   92: istore #8
    //   94: iload #8
    //   96: iload #7
    //   98: if_icmpge -> 178
    //   101: aload #6
    //   103: iload #8
    //   105: aaload
    //   106: astore #9
    //   108: aload_1
    //   109: aload #9
    //   111: invokevirtual getDescriptor : ()Ljava/lang/String;
    //   114: iconst_0
    //   115: invokestatic getAbstractTypeFromDescriptor : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;I)I
    //   118: istore #10
    //   120: aload_0
    //   121: getfield inputLocals : [I
    //   124: iload #5
    //   126: iinc #5, 1
    //   129: iload #10
    //   131: iastore
    //   132: iload #10
    //   134: ldc 4194308
    //   136: if_icmpeq -> 153
    //   139: iload #10
    //   141: ldc 4194307
    //   143: if_icmpne -> 172
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   152: athrow
    //   153: aload_0
    //   154: getfield inputLocals : [I
    //   157: iload #5
    //   159: iinc #5, 1
    //   162: ldc 4194304
    //   164: iastore
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   171: athrow
    //   172: iinc #8, 1
    //   175: goto -> 94
    //   178: iload #5
    //   180: iload #4
    //   182: if_icmpge -> 204
    //   185: aload_0
    //   186: getfield inputLocals : [I
    //   189: iload #5
    //   191: iinc #5, 1
    //   194: ldc 4194304
    //   196: iastore
    //   197: goto -> 178
    //   200: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   203: athrow
    //   204: return
    // Exception table:
    //   from	to	target	type
    //   18	33	36	java/lang/IllegalArgumentException
    //   25	64	64	java/lang/IllegalArgumentException
    //   120	146	149	java/lang/IllegalArgumentException
    //   139	165	168	java/lang/IllegalArgumentException
    //   178	200	200	java/lang/IllegalArgumentException
  }
  
  public final void setInputFrameFromApiFormat(SymbolTable paramSymbolTable, int paramInt1, Object[] paramArrayOfObject1, int paramInt2, Object[] paramArrayOfObject2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iconst_0
    //   4: istore #7
    //   6: iload #7
    //   8: iload_2
    //   9: if_icmpge -> 89
    //   12: aload_0
    //   13: getfield inputLocals : [I
    //   16: iload #6
    //   18: iinc #6, 1
    //   21: aload_1
    //   22: aload_3
    //   23: iload #7
    //   25: aaload
    //   26: invokestatic getAbstractTypeFromApiFormat : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I
    //   29: iastore
    //   30: aload_3
    //   31: iload #7
    //   33: aaload
    //   34: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.LONG : Ljava/lang/Integer;
    //   37: if_acmpeq -> 64
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   46: athrow
    //   47: aload_3
    //   48: iload #7
    //   50: aaload
    //   51: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.DOUBLE : Ljava/lang/Integer;
    //   54: if_acmpne -> 83
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   63: athrow
    //   64: aload_0
    //   65: getfield inputLocals : [I
    //   68: iload #6
    //   70: iinc #6, 1
    //   73: ldc 4194304
    //   75: iastore
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   82: athrow
    //   83: iinc #7, 1
    //   86: goto -> 6
    //   89: iload #6
    //   91: aload_0
    //   92: getfield inputLocals : [I
    //   95: arraylength
    //   96: if_icmpge -> 118
    //   99: aload_0
    //   100: getfield inputLocals : [I
    //   103: iload #6
    //   105: iinc #6, 1
    //   108: ldc 4194304
    //   110: iastore
    //   111: goto -> 89
    //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: iconst_0
    //   119: istore #7
    //   121: iconst_0
    //   122: istore #8
    //   124: iload #8
    //   126: iload #4
    //   128: if_icmpge -> 183
    //   131: aload #5
    //   133: iload #8
    //   135: aaload
    //   136: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.LONG : Ljava/lang/Integer;
    //   139: if_acmpeq -> 167
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   148: athrow
    //   149: aload #5
    //   151: iload #8
    //   153: aaload
    //   154: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.DOUBLE : Ljava/lang/Integer;
    //   157: if_acmpne -> 177
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   166: athrow
    //   167: iinc #7, 1
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   176: athrow
    //   177: iinc #8, 1
    //   180: goto -> 124
    //   183: aload_0
    //   184: iload #4
    //   186: iload #7
    //   188: iadd
    //   189: newarray int
    //   191: putfield inputStack : [I
    //   194: iconst_0
    //   195: istore #8
    //   197: iconst_0
    //   198: istore #9
    //   200: iload #9
    //   202: iload #4
    //   204: if_icmpge -> 287
    //   207: aload_0
    //   208: getfield inputStack : [I
    //   211: iload #8
    //   213: iinc #8, 1
    //   216: aload_1
    //   217: aload #5
    //   219: iload #9
    //   221: aaload
    //   222: invokestatic getAbstractTypeFromApiFormat : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I
    //   225: iastore
    //   226: aload #5
    //   228: iload #9
    //   230: aaload
    //   231: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.LONG : Ljava/lang/Integer;
    //   234: if_acmpeq -> 262
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   243: athrow
    //   244: aload #5
    //   246: iload #9
    //   248: aaload
    //   249: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Opcodes.DOUBLE : Ljava/lang/Integer;
    //   252: if_acmpne -> 281
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   261: athrow
    //   262: aload_0
    //   263: getfield inputStack : [I
    //   266: iload #8
    //   268: iinc #8, 1
    //   271: ldc 4194304
    //   273: iastore
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   280: athrow
    //   281: iinc #9, 1
    //   284: goto -> 200
    //   287: aload_0
    //   288: iconst_0
    //   289: putfield outputStackTop : S
    //   292: aload_0
    //   293: iconst_0
    //   294: putfield initializationCount : I
    //   297: return
    // Exception table:
    //   from	to	target	type
    //   6	40	43	java/lang/IllegalArgumentException
    //   12	57	60	java/lang/IllegalArgumentException
    //   47	76	79	java/lang/IllegalArgumentException
    //   89	114	114	java/lang/IllegalArgumentException
    //   124	142	145	java/lang/IllegalArgumentException
    //   131	160	163	java/lang/IllegalArgumentException
    //   149	170	173	java/lang/IllegalArgumentException
    //   200	237	240	java/lang/IllegalArgumentException
    //   207	255	258	java/lang/IllegalArgumentException
    //   244	274	277	java/lang/IllegalArgumentException
  }
  
  public static int getAbstractTypeFromApiFormat(SymbolTable paramSymbolTable, Object paramObject) {
    try {
      if (paramObject instanceof Integer)
        return 0x400000 | ((Integer)paramObject).intValue(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramObject instanceof String) {
      String str = Type.getObjectType((String)paramObject).getDescriptor();
      return getAbstractTypeFromDescriptor(paramSymbolTable, str, 0);
    } 
    return 0xC00000 | paramSymbolTable.addUninitializedType("", ((Label)paramObject).bytecodeOffset);
  }
  
  public Frame(Label paramLabel) {
    this.owner = paramLabel;
  }
  
  public final void accept(MethodWriter paramMethodWriter) {
    // Byte code:
    //   0: aload_0
    //   1: getfield inputLocals : [I
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: iconst_0
    //   11: istore #5
    //   13: iload #5
    //   15: aload_2
    //   16: arraylength
    //   17: if_icmpge -> 91
    //   20: aload_2
    //   21: iload #5
    //   23: iaload
    //   24: istore #6
    //   26: iload #5
    //   28: iload #6
    //   30: ldc 4194308
    //   32: if_icmpeq -> 49
    //   35: iload #6
    //   37: ldc 4194307
    //   39: if_icmpne -> 57
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   48: athrow
    //   49: iconst_2
    //   50: goto -> 58
    //   53: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   56: athrow
    //   57: iconst_1
    //   58: iadd
    //   59: istore #5
    //   61: iload #6
    //   63: ldc 4194304
    //   65: if_icmpne -> 78
    //   68: iinc #4, 1
    //   71: goto -> 88
    //   74: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: iload_3
    //   79: iload #4
    //   81: iconst_1
    //   82: iadd
    //   83: iadd
    //   84: istore_3
    //   85: iconst_0
    //   86: istore #4
    //   88: goto -> 13
    //   91: aload_0
    //   92: getfield inputStack : [I
    //   95: astore #6
    //   97: iconst_0
    //   98: istore #7
    //   100: iconst_0
    //   101: istore #5
    //   103: iload #5
    //   105: aload #6
    //   107: arraylength
    //   108: if_icmpge -> 159
    //   111: aload #6
    //   113: iload #5
    //   115: iaload
    //   116: istore #8
    //   118: iload #5
    //   120: iload #8
    //   122: ldc 4194308
    //   124: if_icmpeq -> 141
    //   127: iload #8
    //   129: ldc 4194307
    //   131: if_icmpne -> 149
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   140: athrow
    //   141: iconst_2
    //   142: goto -> 150
    //   145: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   148: athrow
    //   149: iconst_1
    //   150: iadd
    //   151: istore #5
    //   153: iinc #7, 1
    //   156: goto -> 103
    //   159: aload_1
    //   160: aload_0
    //   161: getfield owner : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;
    //   164: getfield bytecodeOffset : I
    //   167: iload_3
    //   168: iload #7
    //   170: invokevirtual visitFrameStart : (III)I
    //   173: istore #8
    //   175: iconst_0
    //   176: istore #5
    //   178: iload_3
    //   179: iinc #3, -1
    //   182: ifle -> 240
    //   185: aload_2
    //   186: iload #5
    //   188: iaload
    //   189: istore #9
    //   191: iload #5
    //   193: iload #9
    //   195: ldc 4194308
    //   197: if_icmpeq -> 214
    //   200: iload #9
    //   202: ldc 4194307
    //   204: if_icmpne -> 222
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   213: athrow
    //   214: iconst_2
    //   215: goto -> 223
    //   218: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   221: athrow
    //   222: iconst_1
    //   223: iadd
    //   224: istore #5
    //   226: aload_1
    //   227: iload #8
    //   229: iinc #8, 1
    //   232: iload #9
    //   234: invokevirtual visitAbstractType : (II)V
    //   237: goto -> 178
    //   240: iconst_0
    //   241: istore #5
    //   243: iload #7
    //   245: iinc #7, -1
    //   248: ifle -> 307
    //   251: aload #6
    //   253: iload #5
    //   255: iaload
    //   256: istore #9
    //   258: iload #5
    //   260: iload #9
    //   262: ldc 4194308
    //   264: if_icmpeq -> 281
    //   267: iload #9
    //   269: ldc 4194307
    //   271: if_icmpne -> 289
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   280: athrow
    //   281: iconst_2
    //   282: goto -> 290
    //   285: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   288: athrow
    //   289: iconst_1
    //   290: iadd
    //   291: istore #5
    //   293: aload_1
    //   294: iload #8
    //   296: iinc #8, 1
    //   299: iload #9
    //   301: invokevirtual visitAbstractType : (II)V
    //   304: goto -> 243
    //   307: aload_1
    //   308: invokevirtual visitFrameEnd : ()V
    //   311: return
    // Exception table:
    //   from	to	target	type
    //   26	42	45	java/lang/IllegalArgumentException
    //   35	53	53	java/lang/IllegalArgumentException
    //   61	74	74	java/lang/IllegalArgumentException
    //   118	134	137	java/lang/IllegalArgumentException
    //   127	145	145	java/lang/IllegalArgumentException
    //   191	207	210	java/lang/IllegalArgumentException
    //   200	218	218	java/lang/IllegalArgumentException
    //   258	274	277	java/lang/IllegalArgumentException
    //   267	285	285	java/lang/IllegalArgumentException
  }
  
  public final int getInputStackSize() {
    return this.inputStack.length;
  }
  
  public final boolean merge(SymbolTable paramSymbolTable, Frame paramFrame, int paramInt) {
    boolean bool = false;
    int i = this.inputLocals.length;
    int j = this.inputStack.length;
    if (paramFrame.inputLocals == null) {
      paramFrame.inputLocals = new int[i];
      bool = true;
    } 
    int k = 0;
    while (true) {
      try {
        if (k < i) {
          int m;
          try {
            if (this.outputLocals != null && k < this.outputLocals.length) {
              int n = this.outputLocals[k];
              if (n == 0) {
                m = this.inputLocals[k];
              } else {
                m = getConcreteOutputType(n, j);
              } 
            } else {
              m = this.inputLocals[k];
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          if (this.initializations != null)
            m = getInitializedType(paramSymbolTable, m); 
          bool |= merge(paramSymbolTable, m, paramFrame.inputLocals, k);
          k++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (paramInt > 0) {
        for (k = 0; k < i; k++)
          bool |= merge(paramSymbolTable, this.inputLocals[k], paramFrame.inputLocals, k); 
        if (paramFrame.inputStack == null) {
          paramFrame.inputStack = new int[1];
          bool = true;
        } 
        bool |= merge(paramSymbolTable, paramInt, paramFrame.inputStack, 0);
        return bool;
      } 
      k = this.inputStack.length + this.outputStackStart;
      if (paramFrame.inputStack == null) {
        paramFrame.inputStack = new int[k + this.outputStackTop];
        bool = true;
      } 
      byte b;
      for (b = 0; b < k; b++) {
        int m = this.inputStack[b];
        if (this.initializations != null)
          m = getInitializedType(paramSymbolTable, m); 
        bool |= merge(paramSymbolTable, m, paramFrame.inputStack, b);
      } 
      for (b = 0; b < this.outputStackTop; b++) {
        int m = this.outputStack[b];
        int n = getConcreteOutputType(m, j);
        if (this.initializations != null)
          n = getInitializedType(paramSymbolTable, n); 
        bool |= merge(paramSymbolTable, n, paramFrame.inputStack, k + b);
      } 
      return bool;
    } 
  }
  
  public void execute(int paramInt1, int paramInt2, Symbol paramSymbol, SymbolTable paramSymbolTable) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/Frame.a : J
    //   3: ldc2_w 5804525092987
    //   6: lxor
    //   7: lstore #5
    //   9: iload_1
    //   10: tableswitch default -> 2405, 0 -> 824, 1 -> 831, 2 -> 840, 3 -> 840, 4 -> 840, 5 -> 840, 6 -> 840, 7 -> 840, 8 -> 840, 9 -> 849, 10 -> 849, 11 -> 864, 12 -> 864, 13 -> 864, 14 -> 873, 15 -> 873, 16 -> 840, 17 -> 840, 18 -> 888, 19 -> 2405, 20 -> 2405, 21 -> 840, 22 -> 849, 23 -> 864, 24 -> 873, 25 -> 1113, 26 -> 2405, 27 -> 2405, 28 -> 2405, 29 -> 2405, 30 -> 2405, 31 -> 2405, 32 -> 2405, 33 -> 2405, 34 -> 2405, 35 -> 2405, 36 -> 2405, 37 -> 2405, 38 -> 2405, 39 -> 2405, 40 -> 2405, 41 -> 2405, 42 -> 2405, 43 -> 2405, 44 -> 2405, 45 -> 2405, 46 -> 1753, 47 -> 1125, 48 -> 1787, 49 -> 1145, 50 -> 1165, 51 -> 1753, 52 -> 1753, 53 -> 1753, 54 -> 1204, 55 -> 1316, 56 -> 1204, 57 -> 1316, 58 -> 1204, 59 -> 2405, 60 -> 2405, 61 -> 2405, 62 -> 2405, 63 -> 2405, 64 -> 2405, 65 -> 2405, 66 -> 2405, 67 -> 2405, 68 -> 2405, 69 -> 2405, 70 -> 2405, 71 -> 2405, 72 -> 2405, 73 -> 2405, 74 -> 2405, 75 -> 2405, 76 -> 2405, 77 -> 2405, 78 -> 2405, 79 -> 1442, 80 -> 1450, 81 -> 1442, 82 -> 1450, 83 -> 1442, 84 -> 1442, 85 -> 1442, 86 -> 1442, 87 -> 1458, 88 -> 1466, 89 -> 1474, 90 -> 1495, 91 -> 1528, 92 -> 1573, 93 -> 1612, 94 -> 1663, 95 -> 1726, 96 -> 1753, 97 -> 1767, 98 -> 1787, 99 -> 1801, 100 -> 1753, 101 -> 1767, 102 -> 1787, 103 -> 1801, 104 -> 1753, 105 -> 1767, 106 -> 1787, 107 -> 1801, 108 -> 1753, 109 -> 1767, 110 -> 1787, 111 -> 1801, 112 -> 1753, 113 -> 1767, 114 -> 1787, 115 -> 1801, 116 -> 824, 117 -> 824, 118 -> 824, 119 -> 824, 120 -> 1753, 121 -> 1821, 122 -> 1753, 123 -> 1821, 124 -> 1753, 125 -> 1821, 126 -> 1753, 127 -> 1767, 128 -> 1753, 129 -> 1767, 130 -> 1753, 131 -> 1767, 132 -> 1841, 133 -> 1851, 134 -> 1871, 135 -> 1885, 136 -> 1753, 137 -> 1787, 138 -> 1145, 139 -> 1905, 140 -> 1851, 141 -> 1885, 142 -> 1753, 143 -> 1125, 144 -> 1787, 145 -> 824, 146 -> 824, 147 -> 824, 148 -> 1919, 149 -> 1753, 150 -> 1753, 151 -> 1919, 152 -> 1919, 153 -> 1458, 154 -> 1458, 155 -> 1458, 156 -> 1458, 157 -> 1458, 158 -> 1458, 159 -> 1466, 160 -> 1466, 161 -> 1466, 162 -> 1466, 163 -> 1466, 164 -> 1466, 165 -> 1466, 166 -> 1466, 167 -> 824, 168 -> 1933, 169 -> 1933, 170 -> 1458, 171 -> 1458, 172 -> 1458, 173 -> 1466, 174 -> 1458, 175 -> 1466, 176 -> 1458, 177 -> 824, 178 -> 1944, 179 -> 1957, 180 -> 1968, 181 -> 1986, 182 -> 2002, 183 -> 2002, 184 -> 2002, 185 -> 2002, 186 -> 2076, 187 -> 2097, 188 -> 2117, 189 -> 2260, 190 -> 1905, 191 -> 1458, 192 -> 2333, 193 -> 1905, 194 -> 1458, 195 -> 1458, 196 -> 2405, 197 -> 2387, 198 -> 1458, 199 -> 1458
    //   824: goto -> 2413
    //   827: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   830: athrow
    //   831: aload_0
    //   832: ldc 4194309
    //   834: invokespecial push : (I)V
    //   837: goto -> 2413
    //   840: aload_0
    //   841: ldc 4194305
    //   843: invokespecial push : (I)V
    //   846: goto -> 2413
    //   849: aload_0
    //   850: ldc 4194308
    //   852: invokespecial push : (I)V
    //   855: aload_0
    //   856: ldc 4194304
    //   858: invokespecial push : (I)V
    //   861: goto -> 2413
    //   864: aload_0
    //   865: ldc 4194306
    //   867: invokespecial push : (I)V
    //   870: goto -> 2413
    //   873: aload_0
    //   874: ldc 4194307
    //   876: invokespecial push : (I)V
    //   879: aload_0
    //   880: ldc 4194304
    //   882: invokespecial push : (I)V
    //   885: goto -> 2413
    //   888: aload_3
    //   889: getfield tag : I
    //   892: tableswitch default -> 1105, 3 -> 968, 4 -> 996, 5 -> 981, 6 -> 1005, 7 -> 1020, 8 -> 1038, 9 -> 1105, 10 -> 1105, 11 -> 1105, 12 -> 1105, 13 -> 1105, 14 -> 1105, 15 -> 1074, 16 -> 1056, 17 -> 1092
    //   968: aload_0
    //   969: ldc 4194305
    //   971: invokespecial push : (I)V
    //   974: goto -> 2413
    //   977: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   980: athrow
    //   981: aload_0
    //   982: ldc 4194308
    //   984: invokespecial push : (I)V
    //   987: aload_0
    //   988: ldc 4194304
    //   990: invokespecial push : (I)V
    //   993: goto -> 2413
    //   996: aload_0
    //   997: ldc 4194306
    //   999: invokespecial push : (I)V
    //   1002: goto -> 2413
    //   1005: aload_0
    //   1006: ldc 4194307
    //   1008: invokespecial push : (I)V
    //   1011: aload_0
    //   1012: ldc 4194304
    //   1014: invokespecial push : (I)V
    //   1017: goto -> 2413
    //   1020: aload_0
    //   1021: ldc 8388608
    //   1023: aload #4
    //   1025: ldc_w 'java/lang/Class'
    //   1028: invokevirtual addType : (Ljava/lang/String;)I
    //   1031: ior
    //   1032: invokespecial push : (I)V
    //   1035: goto -> 2413
    //   1038: aload_0
    //   1039: ldc 8388608
    //   1041: aload #4
    //   1043: ldc_w 'java/lang/String'
    //   1046: invokevirtual addType : (Ljava/lang/String;)I
    //   1049: ior
    //   1050: invokespecial push : (I)V
    //   1053: goto -> 2413
    //   1056: aload_0
    //   1057: ldc 8388608
    //   1059: aload #4
    //   1061: ldc_w 'java/lang/invoke/MethodType'
    //   1064: invokevirtual addType : (Ljava/lang/String;)I
    //   1067: ior
    //   1068: invokespecial push : (I)V
    //   1071: goto -> 2413
    //   1074: aload_0
    //   1075: ldc 8388608
    //   1077: aload #4
    //   1079: ldc_w 'java/lang/invoke/MethodHandle'
    //   1082: invokevirtual addType : (Ljava/lang/String;)I
    //   1085: ior
    //   1086: invokespecial push : (I)V
    //   1089: goto -> 2413
    //   1092: aload_0
    //   1093: aload #4
    //   1095: aload_3
    //   1096: getfield value : Ljava/lang/String;
    //   1099: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   1102: goto -> 2413
    //   1105: new java/lang/AssertionError
    //   1108: dup
    //   1109: invokespecial <init> : ()V
    //   1112: athrow
    //   1113: aload_0
    //   1114: aload_0
    //   1115: iload_2
    //   1116: invokespecial getLocal : (I)I
    //   1119: invokespecial push : (I)V
    //   1122: goto -> 2413
    //   1125: aload_0
    //   1126: iconst_2
    //   1127: invokespecial pop : (I)V
    //   1130: aload_0
    //   1131: ldc 4194308
    //   1133: invokespecial push : (I)V
    //   1136: aload_0
    //   1137: ldc 4194304
    //   1139: invokespecial push : (I)V
    //   1142: goto -> 2413
    //   1145: aload_0
    //   1146: iconst_2
    //   1147: invokespecial pop : (I)V
    //   1150: aload_0
    //   1151: ldc 4194307
    //   1153: invokespecial push : (I)V
    //   1156: aload_0
    //   1157: ldc 4194304
    //   1159: invokespecial push : (I)V
    //   1162: goto -> 2413
    //   1165: aload_0
    //   1166: iconst_1
    //   1167: invokespecial pop : (I)V
    //   1170: aload_0
    //   1171: invokespecial pop : ()I
    //   1174: istore #7
    //   1176: aload_0
    //   1177: iload #7
    //   1179: ldc 4194309
    //   1181: if_icmpne -> 1193
    //   1184: iload #7
    //   1186: goto -> 1198
    //   1189: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1192: athrow
    //   1193: ldc -67108864
    //   1195: iload #7
    //   1197: iadd
    //   1198: invokespecial push : (I)V
    //   1201: goto -> 2413
    //   1204: aload_0
    //   1205: invokespecial pop : ()I
    //   1208: istore #7
    //   1210: aload_0
    //   1211: iload_2
    //   1212: iload #7
    //   1214: invokespecial setLocal : (II)V
    //   1217: iload_2
    //   1218: ifle -> 2413
    //   1221: aload_0
    //   1222: iload_2
    //   1223: iconst_1
    //   1224: isub
    //   1225: invokespecial getLocal : (I)I
    //   1228: istore #11
    //   1230: iload #11
    //   1232: ldc 4194308
    //   1234: if_icmpeq -> 1251
    //   1237: iload #11
    //   1239: ldc 4194307
    //   1241: if_icmpne -> 1267
    //   1244: goto -> 1251
    //   1247: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1250: athrow
    //   1251: aload_0
    //   1252: iload_2
    //   1253: iconst_1
    //   1254: isub
    //   1255: ldc 4194304
    //   1257: invokespecial setLocal : (II)V
    //   1260: goto -> 1313
    //   1263: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1266: athrow
    //   1267: iload #11
    //   1269: ldc 62914560
    //   1271: iand
    //   1272: ldc 16777216
    //   1274: if_icmpeq -> 1294
    //   1277: iload #11
    //   1279: ldc 62914560
    //   1281: iand
    //   1282: ldc 20971520
    //   1284: if_icmpne -> 1313
    //   1287: goto -> 1294
    //   1290: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1293: athrow
    //   1294: aload_0
    //   1295: iload_2
    //   1296: iconst_1
    //   1297: isub
    //   1298: iload #11
    //   1300: ldc 1048576
    //   1302: ior
    //   1303: invokespecial setLocal : (II)V
    //   1306: goto -> 1313
    //   1309: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1312: athrow
    //   1313: goto -> 2413
    //   1316: aload_0
    //   1317: iconst_1
    //   1318: invokespecial pop : (I)V
    //   1321: aload_0
    //   1322: invokespecial pop : ()I
    //   1325: istore #7
    //   1327: aload_0
    //   1328: iload_2
    //   1329: iload #7
    //   1331: invokespecial setLocal : (II)V
    //   1334: aload_0
    //   1335: iload_2
    //   1336: iconst_1
    //   1337: iadd
    //   1338: ldc 4194304
    //   1340: invokespecial setLocal : (II)V
    //   1343: iload_2
    //   1344: ifle -> 2413
    //   1347: aload_0
    //   1348: iload_2
    //   1349: iconst_1
    //   1350: isub
    //   1351: invokespecial getLocal : (I)I
    //   1354: istore #11
    //   1356: iload #11
    //   1358: ldc 4194308
    //   1360: if_icmpeq -> 1377
    //   1363: iload #11
    //   1365: ldc 4194307
    //   1367: if_icmpne -> 1393
    //   1370: goto -> 1377
    //   1373: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1376: athrow
    //   1377: aload_0
    //   1378: iload_2
    //   1379: iconst_1
    //   1380: isub
    //   1381: ldc 4194304
    //   1383: invokespecial setLocal : (II)V
    //   1386: goto -> 1439
    //   1389: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1392: athrow
    //   1393: iload #11
    //   1395: ldc 62914560
    //   1397: iand
    //   1398: ldc 16777216
    //   1400: if_icmpeq -> 1420
    //   1403: iload #11
    //   1405: ldc 62914560
    //   1407: iand
    //   1408: ldc 20971520
    //   1410: if_icmpne -> 1439
    //   1413: goto -> 1420
    //   1416: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1419: athrow
    //   1420: aload_0
    //   1421: iload_2
    //   1422: iconst_1
    //   1423: isub
    //   1424: iload #11
    //   1426: ldc 1048576
    //   1428: ior
    //   1429: invokespecial setLocal : (II)V
    //   1432: goto -> 1439
    //   1435: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1438: athrow
    //   1439: goto -> 2413
    //   1442: aload_0
    //   1443: iconst_3
    //   1444: invokespecial pop : (I)V
    //   1447: goto -> 2413
    //   1450: aload_0
    //   1451: iconst_4
    //   1452: invokespecial pop : (I)V
    //   1455: goto -> 2413
    //   1458: aload_0
    //   1459: iconst_1
    //   1460: invokespecial pop : (I)V
    //   1463: goto -> 2413
    //   1466: aload_0
    //   1467: iconst_2
    //   1468: invokespecial pop : (I)V
    //   1471: goto -> 2413
    //   1474: aload_0
    //   1475: invokespecial pop : ()I
    //   1478: istore #7
    //   1480: aload_0
    //   1481: iload #7
    //   1483: invokespecial push : (I)V
    //   1486: aload_0
    //   1487: iload #7
    //   1489: invokespecial push : (I)V
    //   1492: goto -> 2413
    //   1495: aload_0
    //   1496: invokespecial pop : ()I
    //   1499: istore #7
    //   1501: aload_0
    //   1502: invokespecial pop : ()I
    //   1505: istore #8
    //   1507: aload_0
    //   1508: iload #7
    //   1510: invokespecial push : (I)V
    //   1513: aload_0
    //   1514: iload #8
    //   1516: invokespecial push : (I)V
    //   1519: aload_0
    //   1520: iload #7
    //   1522: invokespecial push : (I)V
    //   1525: goto -> 2413
    //   1528: aload_0
    //   1529: invokespecial pop : ()I
    //   1532: istore #7
    //   1534: aload_0
    //   1535: invokespecial pop : ()I
    //   1538: istore #8
    //   1540: aload_0
    //   1541: invokespecial pop : ()I
    //   1544: istore #9
    //   1546: aload_0
    //   1547: iload #7
    //   1549: invokespecial push : (I)V
    //   1552: aload_0
    //   1553: iload #9
    //   1555: invokespecial push : (I)V
    //   1558: aload_0
    //   1559: iload #8
    //   1561: invokespecial push : (I)V
    //   1564: aload_0
    //   1565: iload #7
    //   1567: invokespecial push : (I)V
    //   1570: goto -> 2413
    //   1573: aload_0
    //   1574: invokespecial pop : ()I
    //   1577: istore #7
    //   1579: aload_0
    //   1580: invokespecial pop : ()I
    //   1583: istore #8
    //   1585: aload_0
    //   1586: iload #8
    //   1588: invokespecial push : (I)V
    //   1591: aload_0
    //   1592: iload #7
    //   1594: invokespecial push : (I)V
    //   1597: aload_0
    //   1598: iload #8
    //   1600: invokespecial push : (I)V
    //   1603: aload_0
    //   1604: iload #7
    //   1606: invokespecial push : (I)V
    //   1609: goto -> 2413
    //   1612: aload_0
    //   1613: invokespecial pop : ()I
    //   1616: istore #7
    //   1618: aload_0
    //   1619: invokespecial pop : ()I
    //   1622: istore #8
    //   1624: aload_0
    //   1625: invokespecial pop : ()I
    //   1628: istore #9
    //   1630: aload_0
    //   1631: iload #8
    //   1633: invokespecial push : (I)V
    //   1636: aload_0
    //   1637: iload #7
    //   1639: invokespecial push : (I)V
    //   1642: aload_0
    //   1643: iload #9
    //   1645: invokespecial push : (I)V
    //   1648: aload_0
    //   1649: iload #8
    //   1651: invokespecial push : (I)V
    //   1654: aload_0
    //   1655: iload #7
    //   1657: invokespecial push : (I)V
    //   1660: goto -> 2413
    //   1663: aload_0
    //   1664: invokespecial pop : ()I
    //   1667: istore #7
    //   1669: aload_0
    //   1670: invokespecial pop : ()I
    //   1673: istore #8
    //   1675: aload_0
    //   1676: invokespecial pop : ()I
    //   1679: istore #9
    //   1681: aload_0
    //   1682: invokespecial pop : ()I
    //   1685: istore #10
    //   1687: aload_0
    //   1688: iload #8
    //   1690: invokespecial push : (I)V
    //   1693: aload_0
    //   1694: iload #7
    //   1696: invokespecial push : (I)V
    //   1699: aload_0
    //   1700: iload #10
    //   1702: invokespecial push : (I)V
    //   1705: aload_0
    //   1706: iload #9
    //   1708: invokespecial push : (I)V
    //   1711: aload_0
    //   1712: iload #8
    //   1714: invokespecial push : (I)V
    //   1717: aload_0
    //   1718: iload #7
    //   1720: invokespecial push : (I)V
    //   1723: goto -> 2413
    //   1726: aload_0
    //   1727: invokespecial pop : ()I
    //   1730: istore #7
    //   1732: aload_0
    //   1733: invokespecial pop : ()I
    //   1736: istore #8
    //   1738: aload_0
    //   1739: iload #7
    //   1741: invokespecial push : (I)V
    //   1744: aload_0
    //   1745: iload #8
    //   1747: invokespecial push : (I)V
    //   1750: goto -> 2413
    //   1753: aload_0
    //   1754: iconst_2
    //   1755: invokespecial pop : (I)V
    //   1758: aload_0
    //   1759: ldc 4194305
    //   1761: invokespecial push : (I)V
    //   1764: goto -> 2413
    //   1767: aload_0
    //   1768: iconst_4
    //   1769: invokespecial pop : (I)V
    //   1772: aload_0
    //   1773: ldc 4194308
    //   1775: invokespecial push : (I)V
    //   1778: aload_0
    //   1779: ldc 4194304
    //   1781: invokespecial push : (I)V
    //   1784: goto -> 2413
    //   1787: aload_0
    //   1788: iconst_2
    //   1789: invokespecial pop : (I)V
    //   1792: aload_0
    //   1793: ldc 4194306
    //   1795: invokespecial push : (I)V
    //   1798: goto -> 2413
    //   1801: aload_0
    //   1802: iconst_4
    //   1803: invokespecial pop : (I)V
    //   1806: aload_0
    //   1807: ldc 4194307
    //   1809: invokespecial push : (I)V
    //   1812: aload_0
    //   1813: ldc 4194304
    //   1815: invokespecial push : (I)V
    //   1818: goto -> 2413
    //   1821: aload_0
    //   1822: iconst_3
    //   1823: invokespecial pop : (I)V
    //   1826: aload_0
    //   1827: ldc 4194308
    //   1829: invokespecial push : (I)V
    //   1832: aload_0
    //   1833: ldc 4194304
    //   1835: invokespecial push : (I)V
    //   1838: goto -> 2413
    //   1841: aload_0
    //   1842: iload_2
    //   1843: ldc 4194305
    //   1845: invokespecial setLocal : (II)V
    //   1848: goto -> 2413
    //   1851: aload_0
    //   1852: iconst_1
    //   1853: invokespecial pop : (I)V
    //   1856: aload_0
    //   1857: ldc 4194308
    //   1859: invokespecial push : (I)V
    //   1862: aload_0
    //   1863: ldc 4194304
    //   1865: invokespecial push : (I)V
    //   1868: goto -> 2413
    //   1871: aload_0
    //   1872: iconst_1
    //   1873: invokespecial pop : (I)V
    //   1876: aload_0
    //   1877: ldc 4194306
    //   1879: invokespecial push : (I)V
    //   1882: goto -> 2413
    //   1885: aload_0
    //   1886: iconst_1
    //   1887: invokespecial pop : (I)V
    //   1890: aload_0
    //   1891: ldc 4194307
    //   1893: invokespecial push : (I)V
    //   1896: aload_0
    //   1897: ldc 4194304
    //   1899: invokespecial push : (I)V
    //   1902: goto -> 2413
    //   1905: aload_0
    //   1906: iconst_1
    //   1907: invokespecial pop : (I)V
    //   1910: aload_0
    //   1911: ldc 4194305
    //   1913: invokespecial push : (I)V
    //   1916: goto -> 2413
    //   1919: aload_0
    //   1920: iconst_4
    //   1921: invokespecial pop : (I)V
    //   1924: aload_0
    //   1925: ldc 4194305
    //   1927: invokespecial push : (I)V
    //   1930: goto -> 2413
    //   1933: new java/lang/IllegalArgumentException
    //   1936: dup
    //   1937: ldc_w 'JSR/RET are not supported with computeFrames option'
    //   1940: invokespecial <init> : (Ljava/lang/String;)V
    //   1943: athrow
    //   1944: aload_0
    //   1945: aload #4
    //   1947: aload_3
    //   1948: getfield value : Ljava/lang/String;
    //   1951: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   1954: goto -> 2413
    //   1957: aload_0
    //   1958: aload_3
    //   1959: getfield value : Ljava/lang/String;
    //   1962: invokespecial pop : (Ljava/lang/String;)V
    //   1965: goto -> 2413
    //   1968: aload_0
    //   1969: iconst_1
    //   1970: invokespecial pop : (I)V
    //   1973: aload_0
    //   1974: aload #4
    //   1976: aload_3
    //   1977: getfield value : Ljava/lang/String;
    //   1980: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   1983: goto -> 2413
    //   1986: aload_0
    //   1987: aload_3
    //   1988: getfield value : Ljava/lang/String;
    //   1991: invokespecial pop : (Ljava/lang/String;)V
    //   1994: aload_0
    //   1995: invokespecial pop : ()I
    //   1998: pop
    //   1999: goto -> 2413
    //   2002: aload_0
    //   2003: aload_3
    //   2004: getfield value : Ljava/lang/String;
    //   2007: invokespecial pop : (Ljava/lang/String;)V
    //   2010: iload_1
    //   2011: sipush #184
    //   2014: if_icmpeq -> 2063
    //   2017: aload_0
    //   2018: invokespecial pop : ()I
    //   2021: istore #7
    //   2023: iload_1
    //   2024: sipush #183
    //   2027: if_icmpne -> 2063
    //   2030: aload_3
    //   2031: getfield name : Ljava/lang/String;
    //   2034: iconst_0
    //   2035: invokevirtual charAt : (I)C
    //   2038: bipush #60
    //   2040: if_icmpne -> 2063
    //   2043: goto -> 2050
    //   2046: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   2049: athrow
    //   2050: aload_0
    //   2051: iload #7
    //   2053: invokespecial addInitializedType : (I)V
    //   2056: goto -> 2063
    //   2059: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   2062: athrow
    //   2063: aload_0
    //   2064: aload #4
    //   2066: aload_3
    //   2067: getfield value : Ljava/lang/String;
    //   2070: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   2073: goto -> 2413
    //   2076: aload_0
    //   2077: aload_3
    //   2078: getfield value : Ljava/lang/String;
    //   2081: invokespecial pop : (Ljava/lang/String;)V
    //   2084: aload_0
    //   2085: aload #4
    //   2087: aload_3
    //   2088: getfield value : Ljava/lang/String;
    //   2091: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   2094: goto -> 2413
    //   2097: aload_0
    //   2098: ldc 12582912
    //   2100: aload #4
    //   2102: aload_3
    //   2103: getfield value : Ljava/lang/String;
    //   2106: iload_2
    //   2107: invokevirtual addUninitializedType : (Ljava/lang/String;I)I
    //   2110: ior
    //   2111: invokespecial push : (I)V
    //   2114: goto -> 2413
    //   2117: aload_0
    //   2118: invokespecial pop : ()I
    //   2121: pop
    //   2122: iload_2
    //   2123: tableswitch default -> 2252, 4 -> 2168, 5 -> 2182, 6 -> 2222, 7 -> 2232, 8 -> 2192, 9 -> 2202, 10 -> 2212, 11 -> 2242
    //   2168: aload_0
    //   2169: ldc_w 71303177
    //   2172: invokespecial push : (I)V
    //   2175: goto -> 2413
    //   2178: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   2181: athrow
    //   2182: aload_0
    //   2183: ldc_w 71303179
    //   2186: invokespecial push : (I)V
    //   2189: goto -> 2413
    //   2192: aload_0
    //   2193: ldc_w 71303178
    //   2196: invokespecial push : (I)V
    //   2199: goto -> 2413
    //   2202: aload_0
    //   2203: ldc_w 71303180
    //   2206: invokespecial push : (I)V
    //   2209: goto -> 2413
    //   2212: aload_0
    //   2213: ldc_w 71303169
    //   2216: invokespecial push : (I)V
    //   2219: goto -> 2413
    //   2222: aload_0
    //   2223: ldc_w 71303170
    //   2226: invokespecial push : (I)V
    //   2229: goto -> 2413
    //   2232: aload_0
    //   2233: ldc_w 71303171
    //   2236: invokespecial push : (I)V
    //   2239: goto -> 2413
    //   2242: aload_0
    //   2243: ldc_w 71303172
    //   2246: invokespecial push : (I)V
    //   2249: goto -> 2413
    //   2252: new java/lang/IllegalArgumentException
    //   2255: dup
    //   2256: invokespecial <init> : ()V
    //   2259: athrow
    //   2260: aload_3
    //   2261: getfield value : Ljava/lang/String;
    //   2264: astore #11
    //   2266: aload_0
    //   2267: invokespecial pop : ()I
    //   2270: pop
    //   2271: aload #11
    //   2273: iconst_0
    //   2274: invokevirtual charAt : (I)C
    //   2277: bipush #91
    //   2279: if_icmpne -> 2315
    //   2282: aload_0
    //   2283: aload #4
    //   2285: new java/lang/StringBuilder
    //   2288: dup
    //   2289: invokespecial <init> : ()V
    //   2292: bipush #91
    //   2294: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2297: aload #11
    //   2299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2302: invokevirtual toString : ()Ljava/lang/String;
    //   2305: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   2308: goto -> 2413
    //   2311: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   2314: athrow
    //   2315: aload_0
    //   2316: ldc_w 75497472
    //   2319: aload #4
    //   2321: aload #11
    //   2323: invokevirtual addType : (Ljava/lang/String;)I
    //   2326: ior
    //   2327: invokespecial push : (I)V
    //   2330: goto -> 2413
    //   2333: aload_3
    //   2334: getfield value : Ljava/lang/String;
    //   2337: astore #12
    //   2339: aload_0
    //   2340: invokespecial pop : ()I
    //   2343: pop
    //   2344: aload #12
    //   2346: iconst_0
    //   2347: invokevirtual charAt : (I)C
    //   2350: bipush #91
    //   2352: if_icmpne -> 2370
    //   2355: aload_0
    //   2356: aload #4
    //   2358: aload #12
    //   2360: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   2363: goto -> 2413
    //   2366: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   2369: athrow
    //   2370: aload_0
    //   2371: ldc 8388608
    //   2373: aload #4
    //   2375: aload #12
    //   2377: invokevirtual addType : (Ljava/lang/String;)I
    //   2380: ior
    //   2381: invokespecial push : (I)V
    //   2384: goto -> 2413
    //   2387: aload_0
    //   2388: iload_2
    //   2389: invokespecial pop : (I)V
    //   2392: aload_0
    //   2393: aload #4
    //   2395: aload_3
    //   2396: getfield value : Ljava/lang/String;
    //   2399: invokespecial push : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    //   2402: goto -> 2413
    //   2405: new java/lang/IllegalArgumentException
    //   2408: dup
    //   2409: invokespecial <init> : ()V
    //   2412: athrow
    //   2413: return
    // Exception table:
    //   from	to	target	type
    //   9	827	827	java/lang/IllegalArgumentException
    //   888	977	977	java/lang/IllegalArgumentException
    //   1176	1189	1189	java/lang/IllegalArgumentException
    //   1230	1244	1247	java/lang/IllegalArgumentException
    //   1237	1263	1263	java/lang/IllegalArgumentException
    //   1267	1287	1290	java/lang/IllegalArgumentException
    //   1277	1306	1309	java/lang/IllegalArgumentException
    //   1356	1370	1373	java/lang/IllegalArgumentException
    //   1363	1389	1389	java/lang/IllegalArgumentException
    //   1393	1413	1416	java/lang/IllegalArgumentException
    //   1403	1432	1435	java/lang/IllegalArgumentException
    //   2023	2043	2046	java/lang/IllegalArgumentException
    //   2030	2056	2059	java/lang/IllegalArgumentException
    //   2117	2178	2178	java/lang/IllegalArgumentException
    //   2266	2311	2311	java/lang/IllegalArgumentException
    //   2339	2366	2366	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Frame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */