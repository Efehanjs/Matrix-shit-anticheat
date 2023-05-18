package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class SymbolTable {
  private int bootstrapMethodCount;
  
  private int majorVersion;
  
  private ByteVector constantPool;
  
  public final ClassWriter classWriter;
  
  private SymbolTable$Entry[] typeTable;
  
  private SymbolTable$Entry[] entries;
  
  private int entryCount;
  
  private String className;
  
  private int constantPoolCount;
  
  private ByteVector bootstrapMethods;
  
  private final ClassReader sourceClassReader;
  
  private int typeCount;
  
  private static final long a = o3.a(-4207941548014626646L, -5100950074730567283L, null).a(185088470335561L);
  
  public Symbol addConstantModule(String paramString) {
    return addConstantUtf8Reference(19, paramString);
  }
  
  public Symbol addConstantInvokeDynamic(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    Symbol symbol = addBootstrapMethod(paramHandle, paramVarArgs);
    return addConstantDynamicOrInvokeDynamicReference(18, paramString1, paramString2, symbol.index);
  }
  
  public Symbol addBootstrapMethod(Handle paramHandle, Object... paramVarArgs) {
    ByteVector byteVector = this.bootstrapMethods;
    if (byteVector == null)
      byteVector = this.bootstrapMethods = new ByteVector(); 
    int i = paramVarArgs.length;
    int[] arrayOfInt = new int[i];
    int j = 0;
    try {
      while (j < i) {
        arrayOfInt[j] = (addConstant(paramVarArgs[j])).index;
        j++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    j = byteVector.length;
    byteVector.putShort((addConstantMethodHandle(paramHandle.getTag(), paramHandle.getOwner(), paramHandle.getName(), paramHandle.getDesc(), paramHandle.isInterface())).index);
    byteVector.putShort(i);
    int k = 0;
    try {
      while (k < i) {
        byteVector.putShort(arrayOfInt[k]);
        k++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    k = byteVector.length - j;
    int m = paramHandle.hashCode();
    for (Object object : paramVarArgs)
      m ^= object.hashCode(); 
    m &= Integer.MAX_VALUE;
    return addBootstrapMethod(j, k, m);
  }
  
  public Symbol addConstantFloat(float paramFloat) {
    return addConstantIntegerOrFloat(4, Float.floatToRawIntBits(paramFloat));
  }
  
  public int addType(String paramString) {
    int i = hash(128, paramString);
    SymbolTable$Entry symbolTable$Entry = get(i);
    while (true) {
      try {
        if (symbolTable$Entry != null) {
          try {
            if (symbolTable$Entry.tag == 128)
              try {
                if (symbolTable$Entry.hashCode == i)
                  try {
                    if (symbolTable$Entry.value.equals(paramString))
                      return symbolTable$Entry.index; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          symbolTable$Entry = symbolTable$Entry.next;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return addTypeInternal(new SymbolTable$Entry(this.typeCount, 128, paramString, i));
    } 
  }
  
  public Symbol getType(int paramInt) {
    return this.typeTable[paramInt];
  }
  
  public Symbol addConstantDynamic(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    Symbol symbol = addBootstrapMethod(paramHandle, paramVarArgs);
    return addConstantDynamicOrInvokeDynamicReference(17, paramString1, paramString2, symbol.index);
  }
  
  public Symbol addConstantMethodHandle(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    // Byte code:
    //   0: bipush #15
    //   2: istore #6
    //   4: bipush #15
    //   6: aload_2
    //   7: aload_3
    //   8: aload #4
    //   10: iload_1
    //   11: invokestatic hash : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
    //   14: istore #7
    //   16: aload_0
    //   17: iload #7
    //   19: invokespecial get : (I)Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry;
    //   22: astore #8
    //   24: aload #8
    //   26: ifnull -> 156
    //   29: aload #8
    //   31: getfield tag : I
    //   34: bipush #15
    //   36: if_icmpne -> 146
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: aload #8
    //   48: getfield hashCode : I
    //   51: iload #7
    //   53: if_icmpne -> 146
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   62: athrow
    //   63: aload #8
    //   65: getfield data : J
    //   68: iload_1
    //   69: i2l
    //   70: lcmp
    //   71: ifne -> 146
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   80: athrow
    //   81: aload #8
    //   83: getfield owner : Ljava/lang/String;
    //   86: aload_2
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifeq -> 146
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   99: athrow
    //   100: aload #8
    //   102: getfield name : Ljava/lang/String;
    //   105: aload_3
    //   106: invokevirtual equals : (Ljava/lang/Object;)Z
    //   109: ifeq -> 146
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   118: athrow
    //   119: aload #8
    //   121: getfield value : Ljava/lang/String;
    //   124: aload #4
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifeq -> 146
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   138: athrow
    //   139: aload #8
    //   141: areturn
    //   142: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   145: athrow
    //   146: aload #8
    //   148: getfield next : Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry;
    //   151: astore #8
    //   153: goto -> 24
    //   156: iload_1
    //   157: iconst_4
    //   158: if_icmpgt -> 190
    //   161: aload_0
    //   162: getfield constantPool : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   165: bipush #15
    //   167: iload_1
    //   168: aload_0
    //   169: aload_2
    //   170: aload_3
    //   171: aload #4
    //   173: invokevirtual addConstantFieldref : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;
    //   176: getfield index : I
    //   179: invokevirtual put112 : (III)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   182: pop
    //   183: goto -> 214
    //   186: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   189: athrow
    //   190: aload_0
    //   191: getfield constantPool : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   194: bipush #15
    //   196: iload_1
    //   197: aload_0
    //   198: aload_2
    //   199: aload_3
    //   200: aload #4
    //   202: iload #5
    //   204: invokevirtual addConstantMethodref : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lme/rerere/matrix/thirdparty/org/objectweb/asm/Symbol;
    //   207: getfield index : I
    //   210: invokevirtual put112 : (III)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   213: pop
    //   214: aload_0
    //   215: new me/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry
    //   218: dup
    //   219: aload_0
    //   220: dup
    //   221: getfield constantPoolCount : I
    //   224: dup_x1
    //   225: iconst_1
    //   226: iadd
    //   227: putfield constantPoolCount : I
    //   230: bipush #15
    //   232: aload_2
    //   233: aload_3
    //   234: aload #4
    //   236: iload_1
    //   237: i2l
    //   238: iload #7
    //   240: invokespecial <init> : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
    //   243: invokespecial put : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry;)Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry;
    //   246: areturn
    // Exception table:
    //   from	to	target	type
    //   24	39	42	java/lang/IllegalArgumentException
    //   29	56	59	java/lang/IllegalArgumentException
    //   46	74	77	java/lang/IllegalArgumentException
    //   63	93	96	java/lang/IllegalArgumentException
    //   81	112	115	java/lang/IllegalArgumentException
    //   100	132	135	java/lang/IllegalArgumentException
    //   119	142	142	java/lang/IllegalArgumentException
    //   156	186	186	java/lang/IllegalArgumentException
  }
  
  public int setMajorVersionAndClassName(int paramInt, String paramString) {
    this.majorVersion = paramInt;
    this.className = paramString;
    return (addConstantClass(paramString)).index;
  }
  
  public int getMajorVersion() {
    return this.majorVersion;
  }
  
  public SymbolTable(ClassWriter paramClassWriter) {
    this.classWriter = paramClassWriter;
    this.sourceClassReader = null;
    this.entries = new SymbolTable$Entry[256];
    this.constantPoolCount = 1;
    this.constantPool = new ByteVector();
  }
  
  public Symbol addConstantClass(String paramString) {
    return addConstantUtf8Reference(7, paramString);
  }
  
  public Symbol addConstant(Object paramObject) {
    long l = a ^ 0x325CC02CA7D2L;
    try {
      if (paramObject instanceof Integer)
        return addConstantInteger(((Integer)paramObject).intValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Byte)
        return addConstantInteger(((Byte)paramObject).intValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Character)
        return addConstantInteger(((Character)paramObject).charValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Short)
        return addConstantInteger(((Short)paramObject).intValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Boolean) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return addConstantInteger(((Boolean)paramObject).booleanValue() ? 1 : 0);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Float)
        return addConstantFloat(((Float)paramObject).floatValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Long)
        return addConstantLong(((Long)paramObject).longValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Double)
        return addConstantDouble(((Double)paramObject).doubleValue()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof String)
        return addConstantString((String)paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramObject instanceof Type) {
      Type type = (Type)paramObject;
      int i = type.getSort();
      try {
        if (i == 10)
          return addConstantClass(type.getInternalName()); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (i == 11)
          return addConstantMethodType(type.getDescriptor()); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return addConstantClass(type.getDescriptor());
    } 
    if (paramObject instanceof Handle) {
      Handle handle = (Handle)paramObject;
      return addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface());
    } 
    if (paramObject instanceof ConstantDynamic) {
      ConstantDynamic constantDynamic = (ConstantDynamic)paramObject;
      return addConstantDynamic(constantDynamic.getName(), constantDynamic.getDescriptor(), constantDynamic.getBootstrapMethod(), constantDynamic.getBootstrapMethodArgumentsUnsafe());
    } 
    throw new IllegalArgumentException("value " + paramObject);
  }
  
  public int getConstantPoolLength() {
    return this.constantPool.length;
  }
  
  public Symbol addConstantMethodType(String paramString) {
    return addConstantUtf8Reference(16, paramString);
  }
  
  public Symbol addConstantMethodref(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = paramBoolean ? 11 : 10;
    return addConstantMemberReference(b, paramString1, paramString2, paramString3);
  }
  
  public ClassReader getSource() {
    return this.sourceClassReader;
  }
  
  public int addMergedType(int paramInt1, int paramInt2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l = (paramInt1 < paramInt2) ? (paramInt1 | paramInt2 << 32L) : (paramInt2 | paramInt1 << 32L);
    int i = hash(130, paramInt1 + paramInt2);
    SymbolTable$Entry symbolTable$Entry = get(i);
    while (true) {
      try {
        if (symbolTable$Entry != null) {
          try {
            if (symbolTable$Entry.tag == 130)
              try {
                if (symbolTable$Entry.hashCode == i)
                  try {
                    if (symbolTable$Entry.data == l)
                      return symbolTable$Entry.info; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          symbolTable$Entry = symbolTable$Entry.next;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      String str1 = (this.typeTable[paramInt1]).value;
      String str2 = (this.typeTable[paramInt2]).value;
      int j = addType(this.classWriter.getCommonSuperClass(str1, str2));
      (put(new SymbolTable$Entry(this.typeCount, 130, l, i))).info = j;
      return j;
    } 
  }
  
  public SymbolTable(ClassWriter paramClassWriter, ClassReader paramClassReader) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield classWriter : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassWriter;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield sourceClassReader : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassReader;
    //   14: aload_2
    //   15: getfield classFileBuffer : [B
    //   18: astore_3
    //   19: aload_2
    //   20: iconst_1
    //   21: invokevirtual getItem : (I)I
    //   24: iconst_1
    //   25: isub
    //   26: istore #4
    //   28: aload_2
    //   29: getfield header : I
    //   32: iload #4
    //   34: isub
    //   35: istore #5
    //   37: aload_0
    //   38: aload_2
    //   39: invokevirtual getItemCount : ()I
    //   42: putfield constantPoolCount : I
    //   45: aload_0
    //   46: new me/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector
    //   49: dup
    //   50: iload #5
    //   52: invokespecial <init> : (I)V
    //   55: putfield constantPool : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   58: aload_0
    //   59: getfield constantPool : Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   62: aload_3
    //   63: iload #4
    //   65: iload #5
    //   67: invokevirtual putByteArray : ([BII)Lme/rerere/matrix/thirdparty/org/objectweb/asm/ByteVector;
    //   70: pop
    //   71: aload_0
    //   72: aload_0
    //   73: getfield constantPoolCount : I
    //   76: iconst_2
    //   77: imul
    //   78: anewarray me/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry
    //   81: putfield entries : [Lme/rerere/matrix/thirdparty/org/objectweb/asm/SymbolTable$Entry;
    //   84: aload_2
    //   85: invokevirtual getMaxStringLength : ()I
    //   88: newarray char
    //   90: astore #6
    //   92: iconst_0
    //   93: istore #7
    //   95: iconst_1
    //   96: istore #8
    //   98: iload #8
    //   100: aload_0
    //   101: getfield constantPoolCount : I
    //   104: if_icmpge -> 534
    //   107: aload_2
    //   108: iload #8
    //   110: invokevirtual getItem : (I)I
    //   113: istore #9
    //   115: aload_3
    //   116: iload #9
    //   118: iconst_1
    //   119: isub
    //   120: baload
    //   121: istore #10
    //   123: iload #10
    //   125: tableswitch default -> 489, 1 -> 332, 2 -> 489, 3 -> 271, 4 -> 271, 5 -> 315, 6 -> 315, 7 -> 470, 8 -> 470, 9 -> 220, 10 -> 220, 11 -> 220, 12 -> 288, 13 -> 489, 14 -> 489, 15 -> 349, 16 -> 470, 17 -> 418, 18 -> 418, 19 -> 470, 20 -> 470
    //   220: aload_2
    //   221: aload_2
    //   222: iload #9
    //   224: iconst_2
    //   225: iadd
    //   226: invokevirtual readUnsignedShort : (I)I
    //   229: invokevirtual getItem : (I)I
    //   232: istore #11
    //   234: aload_0
    //   235: iload #8
    //   237: iload #10
    //   239: aload_2
    //   240: iload #9
    //   242: aload #6
    //   244: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   247: aload_2
    //   248: iload #11
    //   250: aload #6
    //   252: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   255: aload_2
    //   256: iload #11
    //   258: iconst_2
    //   259: iadd
    //   260: aload #6
    //   262: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   265: invokespecial addConstantMemberReference : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   268: goto -> 497
    //   271: aload_0
    //   272: iload #8
    //   274: iload #10
    //   276: aload_2
    //   277: iload #9
    //   279: invokevirtual readInt : (I)I
    //   282: invokespecial addConstantIntegerOrFloat : (III)V
    //   285: goto -> 497
    //   288: aload_0
    //   289: iload #8
    //   291: aload_2
    //   292: iload #9
    //   294: aload #6
    //   296: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   299: aload_2
    //   300: iload #9
    //   302: iconst_2
    //   303: iadd
    //   304: aload #6
    //   306: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   309: invokespecial addConstantNameAndType : (ILjava/lang/String;Ljava/lang/String;)V
    //   312: goto -> 497
    //   315: aload_0
    //   316: iload #8
    //   318: iload #10
    //   320: aload_2
    //   321: iload #9
    //   323: invokevirtual readLong : (I)J
    //   326: invokespecial addConstantLongOrDouble : (IIJ)V
    //   329: goto -> 497
    //   332: aload_0
    //   333: iload #8
    //   335: aload_2
    //   336: iload #8
    //   338: aload #6
    //   340: invokevirtual readUtf : (I[C)Ljava/lang/String;
    //   343: invokespecial addConstantUtf8 : (ILjava/lang/String;)V
    //   346: goto -> 497
    //   349: aload_2
    //   350: aload_2
    //   351: iload #9
    //   353: iconst_1
    //   354: iadd
    //   355: invokevirtual readUnsignedShort : (I)I
    //   358: invokevirtual getItem : (I)I
    //   361: istore #12
    //   363: aload_2
    //   364: aload_2
    //   365: iload #12
    //   367: iconst_2
    //   368: iadd
    //   369: invokevirtual readUnsignedShort : (I)I
    //   372: invokevirtual getItem : (I)I
    //   375: istore #11
    //   377: aload_0
    //   378: iload #8
    //   380: aload_2
    //   381: iload #9
    //   383: invokevirtual readByte : (I)I
    //   386: aload_2
    //   387: iload #12
    //   389: aload #6
    //   391: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   394: aload_2
    //   395: iload #11
    //   397: aload #6
    //   399: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   402: aload_2
    //   403: iload #11
    //   405: iconst_2
    //   406: iadd
    //   407: aload #6
    //   409: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   412: invokespecial addConstantMethodHandle : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   415: goto -> 497
    //   418: iconst_1
    //   419: istore #7
    //   421: aload_2
    //   422: aload_2
    //   423: iload #9
    //   425: iconst_2
    //   426: iadd
    //   427: invokevirtual readUnsignedShort : (I)I
    //   430: invokevirtual getItem : (I)I
    //   433: istore #11
    //   435: aload_0
    //   436: iload #10
    //   438: iload #8
    //   440: aload_2
    //   441: iload #11
    //   443: aload #6
    //   445: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   448: aload_2
    //   449: iload #11
    //   451: iconst_2
    //   452: iadd
    //   453: aload #6
    //   455: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   458: aload_2
    //   459: iload #9
    //   461: invokevirtual readUnsignedShort : (I)I
    //   464: invokespecial addConstantDynamicOrInvokeDynamicReference : (IILjava/lang/String;Ljava/lang/String;I)V
    //   467: goto -> 497
    //   470: aload_0
    //   471: iload #8
    //   473: iload #10
    //   475: aload_2
    //   476: iload #9
    //   478: aload #6
    //   480: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   483: invokespecial addConstantUtf8Reference : (IILjava/lang/String;)V
    //   486: goto -> 497
    //   489: new java/lang/IllegalArgumentException
    //   492: dup
    //   493: invokespecial <init> : ()V
    //   496: athrow
    //   497: iload #8
    //   499: iload #10
    //   501: iconst_5
    //   502: if_icmpeq -> 519
    //   505: iload #10
    //   507: bipush #6
    //   509: if_icmpne -> 527
    //   512: goto -> 519
    //   515: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   518: athrow
    //   519: iconst_2
    //   520: goto -> 528
    //   523: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   526: athrow
    //   527: iconst_1
    //   528: iadd
    //   529: istore #8
    //   531: goto -> 98
    //   534: iload #7
    //   536: ifeq -> 553
    //   539: aload_0
    //   540: aload_2
    //   541: aload #6
    //   543: invokespecial copyBootstrapMethods : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassReader;[C)V
    //   546: goto -> 553
    //   549: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   552: athrow
    //   553: return
    // Exception table:
    //   from	to	target	type
    //   497	512	515	java/lang/IllegalArgumentException
    //   505	523	523	java/lang/IllegalArgumentException
    //   534	546	549	java/lang/IllegalArgumentException
  }
  
  public Symbol addConstantFieldref(String paramString1, String paramString2, String paramString3) {
    return addConstantMemberReference(9, paramString1, paramString2, paramString3);
  }
  
  public void putConstantPool(ByteVector paramByteVector) {
    paramByteVector.putShort(this.constantPoolCount).putByteArray(this.constantPool.data, 0, this.constantPool.length);
  }
  
  public Symbol addConstantInteger(int paramInt) {
    return addConstantIntegerOrFloat(3, paramInt);
  }
  
  public int addUninitializedType(String paramString, int paramInt) {
    int i = hash(129, paramString, paramInt);
    SymbolTable$Entry symbolTable$Entry = get(i);
    while (true) {
      try {
        if (symbolTable$Entry != null) {
          try {
            if (symbolTable$Entry.tag == 129)
              try {
                if (symbolTable$Entry.hashCode == i)
                  try {
                    if (symbolTable$Entry.data == paramInt)
                      try {
                        if (symbolTable$Entry.value.equals(paramString))
                          return symbolTable$Entry.index; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      }  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          symbolTable$Entry = symbolTable$Entry.next;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return addTypeInternal(new SymbolTable$Entry(this.typeCount, 129, paramString, paramInt, i));
    } 
  }
  
  public int addConstantUtf8(String paramString) {
    int i = hash(1, paramString);
    SymbolTable$Entry symbolTable$Entry = get(i);
    while (true) {
      try {
        if (symbolTable$Entry != null) {
          try {
            if (symbolTable$Entry.tag == 1)
              try {
                if (symbolTable$Entry.hashCode == i)
                  try {
                    if (symbolTable$Entry.value.equals(paramString))
                      return symbolTable$Entry.index; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          symbolTable$Entry = symbolTable$Entry.next;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.constantPool.putByte(1).putUTF8(paramString);
      return (put(new SymbolTable$Entry(this.constantPoolCount++, 1, paramString, i))).index;
    } 
  }
  
  public String getClassName() {
    return this.className;
  }
  
  public int getConstantPoolCount() {
    return this.constantPoolCount;
  }
  
  public int addConstantNameAndType(String paramString1, String paramString2) {
    byte b = 12;
    int i = hash(12, paramString1, paramString2);
    SymbolTable$Entry symbolTable$Entry = get(i);
    while (true) {
      try {
        if (symbolTable$Entry != null) {
          try {
            if (symbolTable$Entry.tag == 12)
              try {
                if (symbolTable$Entry.hashCode == i)
                  try {
                    if (symbolTable$Entry.name.equals(paramString1))
                      try {
                        if (symbolTable$Entry.value.equals(paramString2))
                          return symbolTable$Entry.index; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      }  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          symbolTable$Entry = symbolTable$Entry.next;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.constantPool.put122(12, addConstantUtf8(paramString1), addConstantUtf8(paramString2));
      return (put(new SymbolTable$Entry(this.constantPoolCount++, 12, paramString1, paramString2, i))).index;
    } 
  }
  
  public Symbol addConstantLong(long paramLong) {
    return addConstantLongOrDouble(5, paramLong);
  }
  
  public void putBootstrapMethods(ByteVector paramByteVector) {
    long l = a ^ 0x3C0E4101862CL;
    try {
      if (this.bootstrapMethods != null)
        paramByteVector.putShort(addConstantUtf8("BootstrapMethods")).putInt(this.bootstrapMethods.length + 2).putShort(this.bootstrapMethodCount).putByteArray(this.bootstrapMethods.data, 0, this.bootstrapMethods.length); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Symbol addConstantPackage(String paramString) {
    return addConstantUtf8Reference(20, paramString);
  }
  
  public Symbol addConstantString(String paramString) {
    return addConstantUtf8Reference(8, paramString);
  }
  
  public Symbol addConstantDouble(double paramDouble) {
    return addConstantLongOrDouble(6, Double.doubleToRawLongBits(paramDouble));
  }
  
  public int computeBootstrapMethodsSize() {
    long l = a ^ 0x2C41D16F17CEL;
    try {
      if (this.bootstrapMethods != null) {
        addConstantUtf8("BootstrapMethods");
        return 8 + this.bootstrapMethods.length;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\SymbolTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */