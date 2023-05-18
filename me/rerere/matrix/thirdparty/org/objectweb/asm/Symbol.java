package me.rerere.matrix.thirdparty.org.objectweb.asm;

public abstract class Symbol {
  public static final int CONSTANT_STRING_TAG = 8;
  
  public static final int CONSTANT_UTF8_TAG = 1;
  
  public static final int BOOTSTRAP_METHOD_TAG = 64;
  
  public static final int CONSTANT_CLASS_TAG = 7;
  
  public static final int CONSTANT_FIELDREF_TAG = 9;
  
  public static final int TYPE_TAG = 128;
  
  public static final int CONSTANT_PACKAGE_TAG = 20;
  
  public static final int CONSTANT_METHODREF_TAG = 10;
  
  public static final int UNINITIALIZED_TYPE_TAG = 129;
  
  public static final int CONSTANT_FLOAT_TAG = 4;
  
  public final String value;
  
  public static final int CONSTANT_NAME_AND_TYPE_TAG = 12;
  
  public final String owner;
  
  public final int index;
  
  public static final int CONSTANT_METHOD_HANDLE_TAG = 15;
  
  public final String name;
  
  public int info;
  
  public static final int CONSTANT_METHOD_TYPE_TAG = 16;
  
  public static final int CONSTANT_DOUBLE_TAG = 6;
  
  public static final int CONSTANT_MODULE_TAG = 19;
  
  public static final int MERGED_TYPE_TAG = 130;
  
  public static final int CONSTANT_INTERFACE_METHODREF_TAG = 11;
  
  public final long data;
  
  public static final int CONSTANT_INTEGER_TAG = 3;
  
  public static final int CONSTANT_LONG_TAG = 5;
  
  public final int tag;
  
  public static final int CONSTANT_DYNAMIC_TAG = 17;
  
  public static final int CONSTANT_INVOKE_DYNAMIC_TAG = 18;
  
  public int getArgumentsAndReturnSizes() {
    try {
      if (this.info == 0)
        this.info = Type.getArgumentsAndReturnSizes(this.value); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.info;
  }
  
  public Symbol(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, long paramLong) {
    this.index = paramInt1;
    this.tag = paramInt2;
    this.owner = paramString1;
    this.name = paramString2;
    this.value = paramString3;
    this.data = paramLong;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Symbol.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */