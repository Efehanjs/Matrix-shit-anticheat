package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public abstract class ModuleVisitor {
  public final int api;
  
  public ModuleVisitor mv;
  
  private static final long a = o3.a(-4633263017002845689L, -4708838116860853698L, null).a(253239983512811L);
  
  public ModuleVisitor(int paramInt, ModuleVisitor paramModuleVisitor) {
    if (paramInt != 589824)
      try {
        if (paramInt != 524288)
          try {
            if (paramInt != 458752)
              try {
                if (paramInt != 393216)
                  try {
                    if (paramInt != 327680)
                      try {
                        if (paramInt != 262144)
                          try {
                            if (paramInt != 17432576)
                              throw new IllegalArgumentException("Unsupported api " + paramInt); 
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
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      }  
    try {
      if (paramInt == 17432576)
        Constants.checkAsmExperimental(this); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.api = paramInt;
    this.mv = paramModuleVisitor;
  }
  
  public void visitMainClass(String paramString) {
    try {
      if (this.mv != null)
        this.mv.visitMainClass(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitUse(String paramString) {
    try {
      if (this.mv != null)
        this.mv.visitUse(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitRequire(String paramString1, int paramInt, String paramString2) {
    try {
      if (this.mv != null)
        this.mv.visitRequire(paramString1, paramInt, paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitProvide(String paramString, String... paramVarArgs) {
    try {
      if (this.mv != null)
        this.mv.visitProvide(paramString, paramVarArgs); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitPackage(String paramString) {
    try {
      if (this.mv != null)
        this.mv.visitPackage(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitExport(String paramString, int paramInt, String... paramVarArgs) {
    try {
      if (this.mv != null)
        this.mv.visitExport(paramString, paramInt, paramVarArgs); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public ModuleVisitor getDelegate() {
    return this.mv;
  }
  
  public void visitOpen(String paramString, int paramInt, String... paramVarArgs) {
    try {
      if (this.mv != null)
        this.mv.visitOpen(paramString, paramInt, paramVarArgs); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitEnd() {
    try {
      if (this.mv != null)
        this.mv.visitEnd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public ModuleVisitor(int paramInt) {
    this(paramInt, null);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ModuleVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */