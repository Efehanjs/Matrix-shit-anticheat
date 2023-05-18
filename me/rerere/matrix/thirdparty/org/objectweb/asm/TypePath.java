package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class TypePath {
  private final int typePathOffset;
  
  public static final int ARRAY_ELEMENT = 0;
  
  public static final int WILDCARD_BOUND = 2;
  
  private final byte[] typePathContainer;
  
  public static final int TYPE_ARGUMENT = 3;
  
  public static final int INNER_TYPE = 1;
  
  public String toString() {
    int i = getLength();
    StringBuilder stringBuilder = new StringBuilder(i * 2);
    byte b = 0;
    while (true) {
      try {
        if (b < i) {
          try {
            switch (getStep(b)) {
              case 0:
                stringBuilder.append('[');
                break;
              case 1:
                stringBuilder.append('.');
                break;
              case 2:
                stringBuilder.append('*');
                break;
              case 3:
                stringBuilder.append(getStepArgument(b)).append(';');
                break;
              default:
                throw new AssertionError();
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return stringBuilder.toString();
    } 
  }
  
  public static void put(TypePath paramTypePath, ByteVector paramByteVector) {
    try {
      if (paramTypePath == null) {
        paramByteVector.putByte(0);
      } else {
        int i = paramTypePath.typePathContainer[paramTypePath.typePathOffset] * 2 + 1;
        paramByteVector.putByteArray(paramTypePath.typePathContainer, paramTypePath.typePathOffset, i);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int getStep(int paramInt) {
    return this.typePathContainer[this.typePathOffset + 2 * paramInt + 1];
  }
  
  public static TypePath fromString(String paramString) {
    try {
      if (paramString != null)
        try {
          if (paramString.length() != 0) {
            int i = paramString.length();
            ByteVector byteVector = new ByteVector(i);
            byteVector.putByte(0);
            byte b = 0;
            while (b < i) {
              char c = paramString.charAt(b++);
              try {
                if (c == '[') {
                  byteVector.put11(0, 0);
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              try {
                if (c == '.') {
                  byteVector.put11(1, 0);
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              try {
                if (c == '*') {
                  byteVector.put11(2, 0);
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              try {
                if (c >= '0' && c <= '9') {
                  int j = c - 48;
                  while (b < i) {
                    c = paramString.charAt(b++);
                    try {
                      if (c >= '0' && c <= '9') {
                        j = j * 10 + c - 48;
                        continue;
                      } 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    try {
                      if (c == ';')
                        break; 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    throw new IllegalArgumentException();
                  } 
                  byteVector.put11(3, j);
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              throw new IllegalArgumentException();
            } 
            byteVector.data[0] = (byte)(byteVector.length / 2);
            return new TypePath(byteVector.data, 0);
          } 
          return null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public int getLength() {
    return this.typePathContainer[this.typePathOffset];
  }
  
  public int getStepArgument(int paramInt) {
    return this.typePathContainer[this.typePathOffset + 2 * paramInt + 2];
  }
  
  public TypePath(byte[] paramArrayOfbyte, int paramInt) {
    this.typePathContainer = paramArrayOfbyte;
    this.typePathOffset = paramInt;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\TypePath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */