package me.rerere.matrix.thirdparty.org.objectweb.asm;

import java.util.Arrays;
import me.rerere.matrix.internal.o3;

public final class ConstantDynamic {
  private final Handle bootstrapMethod;
  
  private final String name;
  
  private final String descriptor;
  
  private final Object[] bootstrapMethodArguments;
  
  private static final long a = o3.a(1994138043390117891L, 2676728047952488531L, null).a(219318954707321L);
  
  public Object getBootstrapMethodArgument(int paramInt) {
    return this.bootstrapMethodArguments[paramInt];
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getDescriptor() {
    return this.descriptor;
  }
  
  public int hashCode() {
    return this.name.hashCode() ^ Integer.rotateLeft(this.descriptor.hashCode(), 8) ^ Integer.rotateLeft(this.bootstrapMethod.hashCode(), 16) ^ Integer.rotateLeft(Arrays.hashCode(this.bootstrapMethodArguments), 24);
  }
  
  public int getBootstrapMethodArgumentCount() {
    return this.bootstrapMethodArguments.length;
  }
  
  public Handle getBootstrapMethod() {
    return this.bootstrapMethod;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof ConstantDynamic))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ConstantDynamic constantDynamic = (ConstantDynamic)paramObject;
    try {
      if (this.name.equals(constantDynamic.name))
        try {
          if (this.descriptor.equals(constantDynamic.descriptor))
            try {
              if (this.bootstrapMethod.equals(constantDynamic.bootstrapMethod))
                try {
                  if (Arrays.equals(this.bootstrapMethodArguments, constantDynamic.bootstrapMethodArguments));
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public ConstantDynamic(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    this.name = paramString1;
    this.descriptor = paramString2;
    this.bootstrapMethod = paramHandle;
    this.bootstrapMethodArguments = paramVarArgs;
  }
  
  public String toString() {
    long l = a ^ 0x27BCFCBF024DL;
    return this.name + " : " + this.descriptor + ' ' + this.bootstrapMethod + ' ' + Arrays.toString(this.bootstrapMethodArguments);
  }
  
  public int getSize() {
    char c = this.descriptor.charAt(0);
    try {
      if (c != 'J') {
        try {
          if (c == 'D');
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return 1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Object[] getBootstrapMethodArgumentsUnsafe() {
    return this.bootstrapMethodArguments;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ConstantDynamic.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */