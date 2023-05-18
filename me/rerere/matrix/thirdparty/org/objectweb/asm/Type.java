package me.rerere.matrix.thirdparty.org.objectweb.asm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import me.rerere.matrix.internal.o3;

public final class Type {
  public static final int SHORT = 4;
  
  public static final int DOUBLE = 8;
  
  public static final Type DOUBLE_TYPE;
  
  public static final Type FLOAT_TYPE;
  
  public static final Type BOOLEAN_TYPE;
  
  public static final int VOID = 0;
  
  private final int sort;
  
  public static final Type CHAR_TYPE;
  
  public static final Type SHORT_TYPE;
  
  public static final int CHAR = 2;
  
  public static final int INT = 5;
  
  public static final int METHOD = 11;
  
  private final int valueEnd;
  
  public static final int BYTE = 3;
  
  private final int valueBegin;
  
  public static final int BOOLEAN = 1;
  
  public static final Type VOID_TYPE;
  
  private static final String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
  
  private final String valueBuffer;
  
  public static final int LONG = 7;
  
  public static final Type INT_TYPE;
  
  public static final Type LONG_TYPE;
  
  public static final int ARRAY = 9;
  
  private static final int INTERNAL = 12;
  
  public static final int OBJECT = 10;
  
  public static final Type BYTE_TYPE;
  
  public static final int FLOAT = 6;
  
  private static final long a = o3.a(7691113191107426676L, -7987907536909274997L, null).a(128115413946264L);
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Type))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Type type = (Type)paramObject;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (((this.sort == 12) ? true : this.sort) != ((type.sort == 12) ? true : type.sort))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = this.valueBegin;
    int j = this.valueEnd;
    int k = type.valueBegin;
    int m = type.valueEnd;
    try {
      if (j - i != m - k)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int n = i;
    int i1 = k;
    while (true) {
      try {
        if (n < j) {
          try {
            if (this.valueBuffer.charAt(n) != type.valueBuffer.charAt(i1))
              return false; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          n++;
          i1++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return true;
    } 
  }
  
  public static Type getMethodType(String paramString) {
    return new Type(11, paramString, 0, paramString.length());
  }
  
  public static Type getType(Method paramMethod) {
    return getType(getMethodDescriptor(paramMethod));
  }
  
  public static Type[] getArgumentTypes(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: aload_0
    //   5: iload_2
    //   6: invokevirtual charAt : (I)C
    //   9: bipush #41
    //   11: if_icmpeq -> 76
    //   14: aload_0
    //   15: iload_2
    //   16: invokevirtual charAt : (I)C
    //   19: bipush #91
    //   21: if_icmpne -> 41
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   30: athrow
    //   31: iinc #2, 1
    //   34: goto -> 14
    //   37: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   40: athrow
    //   41: aload_0
    //   42: iload_2
    //   43: iinc #2, 1
    //   46: invokevirtual charAt : (I)C
    //   49: bipush #76
    //   51: if_icmpne -> 70
    //   54: aload_0
    //   55: bipush #59
    //   57: iload_2
    //   58: invokevirtual indexOf : (II)I
    //   61: istore_3
    //   62: iload_2
    //   63: iload_3
    //   64: iconst_1
    //   65: iadd
    //   66: invokestatic max : (II)I
    //   69: istore_2
    //   70: iinc #1, 1
    //   73: goto -> 4
    //   76: iload_1
    //   77: anewarray me/rerere/matrix/thirdparty/org/objectweb/asm/Type
    //   80: astore_3
    //   81: iconst_1
    //   82: istore_2
    //   83: iconst_0
    //   84: istore #4
    //   86: aload_0
    //   87: iload_2
    //   88: invokevirtual charAt : (I)C
    //   91: bipush #41
    //   93: if_icmpeq -> 167
    //   96: iload_2
    //   97: istore #5
    //   99: aload_0
    //   100: iload_2
    //   101: invokevirtual charAt : (I)C
    //   104: bipush #91
    //   106: if_icmpne -> 119
    //   109: iinc #2, 1
    //   112: goto -> 99
    //   115: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   118: athrow
    //   119: aload_0
    //   120: iload_2
    //   121: iinc #2, 1
    //   124: invokevirtual charAt : (I)C
    //   127: bipush #76
    //   129: if_icmpne -> 150
    //   132: aload_0
    //   133: bipush #59
    //   135: iload_2
    //   136: invokevirtual indexOf : (II)I
    //   139: istore #6
    //   141: iload_2
    //   142: iload #6
    //   144: iconst_1
    //   145: iadd
    //   146: invokestatic max : (II)I
    //   149: istore_2
    //   150: aload_3
    //   151: iload #4
    //   153: iinc #4, 1
    //   156: aload_0
    //   157: iload #5
    //   159: iload_2
    //   160: invokestatic getTypeInternal : (Ljava/lang/String;II)Lme/rerere/matrix/thirdparty/org/objectweb/asm/Type;
    //   163: aastore
    //   164: goto -> 86
    //   167: aload_3
    //   168: areturn
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/IllegalArgumentException
    //   14	37	37	java/lang/IllegalArgumentException
    //   99	115	115	java/lang/IllegalArgumentException
  }
  
  public int getSort() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.sort == 12) ? 10 : this.sort;
  }
  
  public Type getReturnType() {
    return getReturnType(getDescriptor());
  }
  
  public int getSize() {
    try {
      switch (this.sort) {
        case 0:
          return 0;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 9:
        case 10:
        case 12:
          return 1;
        case 7:
        case 8:
          return 2;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new AssertionError();
  }
  
  public static Type getObjectType(String paramString) {
    return new Type((paramString.charAt(0) == '[') ? 9 : 12, paramString, 0, paramString.length());
  }
  
  public static Type getReturnType(Method paramMethod) {
    return getType(paramMethod.getReturnType());
  }
  
  public int getArgumentsAndReturnSizes() {
    return getArgumentsAndReturnSizes(getDescriptor());
  }
  
  public int getOpcode(int paramInt) {
    try {
      if (paramInt != 46)
        try {
          if (paramInt != 79) {
            try {
              switch (this.sort) {
                case 0:
                  try {
                    if (paramInt != 172)
                      throw new UnsupportedOperationException(); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                  return 177;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                  return paramInt;
                case 6:
                  return paramInt + 2;
                case 7:
                  return paramInt + 1;
                case 8:
                  return paramInt + 3;
                case 9:
                case 10:
                case 12:
                  try {
                    if (paramInt != 21)
                      try {
                        if (paramInt != 54)
                          try {
                            if (paramInt != 172)
                              throw new UnsupportedOperationException(); 
                          } catch (IllegalArgumentException illegalArgumentException) {
                            throw a(null);
                          }  
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      }  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                  return paramInt + 4;
                case 11:
                  throw new UnsupportedOperationException();
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            throw new AssertionError();
          } 
          try {
            switch (this.sort) {
              case 1:
              case 3:
                return paramInt + 5;
              case 2:
                return paramInt + 6;
              case 4:
                return paramInt + 7;
              case 5:
                return paramInt;
              case 6:
                return paramInt + 2;
              case 7:
                return paramInt + 1;
              case 8:
                return paramInt + 3;
              case 9:
              case 10:
              case 12:
                return paramInt + 4;
              case 0:
              case 11:
                throw new UnsupportedOperationException();
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
    try {
      switch (this.sort) {
        case 1:
        case 3:
          return paramInt + 5;
        case 2:
          return paramInt + 6;
        case 4:
          return paramInt + 7;
        case 5:
          return paramInt;
        case 6:
          return paramInt + 2;
        case 7:
          return paramInt + 1;
        case 8:
          return paramInt + 3;
        case 9:
        case 10:
        case 12:
          return paramInt + 4;
        case 0:
        case 11:
          throw new UnsupportedOperationException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static int getReturnTypeOffset(String paramString) {
    int i = 1;
    while (true) {
      try {
        if (paramString.charAt(i) != ')') {
          try {
            while (paramString.charAt(i) == '[')
              i++; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          if (paramString.charAt(i++) == 'L') {
            int j = paramString.indexOf(';', i);
            i = Math.max(i, j + 1);
          } 
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return i + 1;
    } 
  }
  
  public String getInternalName() {
    return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
  }
  
  public int getDimensions() {
    byte b = 1;
    try {
      while (this.valueBuffer.charAt(this.valueBegin + b) == '[')
        b++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return b;
  }
  
  public String toString() {
    return getDescriptor();
  }
  
  public static Type[] getArgumentTypes(Method paramMethod) {
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    Type[] arrayOfType = new Type[arrayOfClass.length];
    int i = arrayOfClass.length - 1;
    try {
      while (i >= 0) {
        arrayOfType[i] = getType(arrayOfClass[i]);
        i--;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return arrayOfType;
  }
  
  public static String getDescriptor(Class paramClass) {
    StringBuilder stringBuilder = new StringBuilder();
    appendDescriptor(paramClass, stringBuilder);
    return stringBuilder.toString();
  }
  
  public static String getInternalName(Class paramClass) {
    return paramClass.getName().replace('.', '/');
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = 13 * ((this.sort == 12) ? 10 : this.sort);
    if (this.sort >= 9) {
      int j = this.valueBegin;
      int k = this.valueEnd;
      while (j < k) {
        i = 17 * (i + this.valueBuffer.charAt(j));
        j++;
      } 
    } 
    return i;
  }
  
  public static Type getReturnType(String paramString) {
    return getTypeInternal(paramString, getReturnTypeOffset(paramString), paramString.length());
  }
  
  public static Type getType(Constructor paramConstructor) {
    return getType(getConstructorDescriptor(paramConstructor));
  }
  
  public String getClassName() {
    long l = a ^ 0x45D399A2CA0DL;
    try {
      StringBuilder stringBuilder;
      int i;
      switch (this.sort) {
        case 0:
          return "void";
        case 1:
          return "boolean";
        case 2:
          return "char";
        case 3:
          return "byte";
        case 4:
          return "short";
        case 5:
          return "int";
        case 6:
          return "float";
        case 7:
          return "long";
        case 8:
          return "double";
        case 9:
          stringBuilder = new StringBuilder(getElementType().getClassName());
          i = getDimensions();
          try {
            while (i > 0) {
              stringBuilder.append("[]");
              i--;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return stringBuilder.toString();
        case 10:
        case 12:
          return this.valueBuffer.substring(this.valueBegin, this.valueEnd).replace('/', '.');
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new AssertionError();
  }
  
  public String getDescriptor() {
    try {
      if (this.sort == 10)
        return this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.sort == 12)
        return 'L' + this.valueBuffer.substring(this.valueBegin, this.valueEnd) + ';'; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
  }
  
  public static Type getType(String paramString) {
    return getTypeInternal(paramString, 0, paramString.length());
  }
  
  public static Type getType(Class<int> paramClass) {
    try {
      if (paramClass.isPrimitive()) {
        try {
          if (paramClass == int.class)
            return INT_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == void.class)
            return VOID_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == boolean.class)
            return BOOLEAN_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == byte.class)
            return BYTE_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == char.class)
            return CHAR_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == short.class)
            return SHORT_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == double.class)
            return DOUBLE_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == float.class)
            return FLOAT_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == long.class)
            return LONG_TYPE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        throw new AssertionError();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return getType(getDescriptor(paramClass));
  }
  
  public Type[] getArgumentTypes() {
    return getArgumentTypes(getDescriptor());
  }
  
  public static String getMethodDescriptor(Type paramType, Type... paramVarArgs) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('(');
    for (Type type : paramVarArgs)
      type.appendDescriptor(stringBuilder); 
    stringBuilder.append(')');
    paramType.appendDescriptor(stringBuilder);
    return stringBuilder.toString();
  }
  
  static {
    long l = a ^ 0x4681EDACB8A7L;
    VOID_TYPE = new Type(0, "VZCBSIFJD", 0, 1);
    BOOLEAN_TYPE = new Type(1, "VZCBSIFJD", 1, 2);
    CHAR_TYPE = new Type(2, "VZCBSIFJD", 2, 3);
    BYTE_TYPE = new Type(3, "VZCBSIFJD", 3, 4);
    SHORT_TYPE = new Type(4, "VZCBSIFJD", 4, 5);
    INT_TYPE = new Type(5, "VZCBSIFJD", 5, 6);
    FLOAT_TYPE = new Type(6, "VZCBSIFJD", 6, 7);
    LONG_TYPE = new Type(7, "VZCBSIFJD", 7, 8);
    DOUBLE_TYPE = new Type(8, "VZCBSIFJD", 8, 9);
  }
  
  public static int getArgumentsAndReturnSizes(String paramString) {
    byte b = 1;
    int i = 1;
    for (char c = paramString.charAt(i);; c = paramString.charAt(i)) {
      try {
        if (c != ')') {
          try {
            if (c != 'J') {
              try {
                if (c != 'D') {
                  try {
                    while (paramString.charAt(i) == '[')
                      i++; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                  if (paramString.charAt(i++) == 'L') {
                    int j = paramString.indexOf(';', i);
                    i = Math.max(i, j + 1);
                  } 
                  b++;
                  continue;
                } 
                i++;
                b += 2;
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          c = paramString.charAt(i + 1);
          try {
            if (c == 'V')
              return b << 2; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          try {
            if (c != 'J') {
              try {
                if (c == 'D');
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              boolean bool = true;
              return b << 2 | bool;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i++;
      b += 2;
    } 
    throw a(2);
  }
  
  public static Type getMethodType(Type paramType, Type... paramVarArgs) {
    return getType(getMethodDescriptor(paramType, paramVarArgs));
  }
  
  public Type getElementType() {
    int i = getDimensions();
    return getTypeInternal(this.valueBuffer, this.valueBegin + i, this.valueEnd);
  }
  
  public static String getMethodDescriptor(Method paramMethod) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('(');
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    for (Class clazz : arrayOfClass)
      appendDescriptor(clazz, stringBuilder); 
    stringBuilder.append(')');
    appendDescriptor(paramMethod.getReturnType(), stringBuilder);
    return stringBuilder.toString();
  }
  
  public static String getConstructorDescriptor(Constructor paramConstructor) {
    long l = a ^ 0x76446C52BDCFL;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('(');
    Class[] arrayOfClass = paramConstructor.getParameterTypes();
    for (Class clazz : arrayOfClass)
      appendDescriptor(clazz, stringBuilder); 
    return stringBuilder.append(")V").toString();
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */