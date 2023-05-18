package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class Handle {
  private final String name;
  
  private final int tag;
  
  private final String owner;
  
  private final boolean isInterface;
  
  private final String descriptor;
  
  private static final long a = o3.a(1910626512769572991L, -2224223236361527438L, null).a(205497411366164L);
  
  public String getOwner() {
    return this.owner;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getTag() {
    return this.tag;
  }
  
  public String getDesc() {
    return this.descriptor;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Handle))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Handle handle = (Handle)paramObject;
    try {
      if (this.tag == handle.tag)
        try {
          if (this.isInterface == handle.isInterface)
            try {
              if (this.owner.equals(handle.owner))
                try {
                  if (this.name.equals(handle.name))
                    try {
                      if (this.descriptor.equals(handle.descriptor));
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
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public Handle(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    this.tag = paramInt;
    this.owner = paramString1;
    this.name = paramString2;
    this.descriptor = paramString3;
    this.isInterface = paramBoolean;
  }
  
  @Deprecated
  public Handle(int paramInt, String paramString1, String paramString2, String paramString3) {
    this(paramInt, paramString1, paramString2, paramString3, (paramInt == 9));
  }
  
  public String toString() {
    long l = a ^ 0xF0BD722FE44L;
    return this.owner + '.' + this.name + this.descriptor + " (" + this.tag + (this.isInterface ? " itf" : "") + ')';
  }
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.tag + (this.isInterface ? 64 : 0) + this.owner.hashCode() * this.name.hashCode() * this.descriptor.hashCode();
  }
  
  public boolean isInterface() {
    return this.isInterface;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Handle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */