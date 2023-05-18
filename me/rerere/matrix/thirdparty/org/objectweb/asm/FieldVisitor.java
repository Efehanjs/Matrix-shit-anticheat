package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public abstract class FieldVisitor {
  public final int api;
  
  public FieldVisitor fv;
  
  private static final long a = o3.a(-8020846162043883746L, 8901589339341634131L, null).a(226069881803914L);
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    long l = a ^ 0x5ADA6E743D40L;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.fv != null)
        return this.fv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public FieldVisitor getDelegate() {
    return this.fv;
  }
  
  public void visitEnd() {
    try {
      if (this.fv != null)
        this.fv.visitEnd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitAttribute(Attribute paramAttribute) {
    try {
      if (this.fv != null)
        this.fv.visitAttribute(paramAttribute); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (this.fv != null)
        return this.fv.visitAnnotation(paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public FieldVisitor(int paramInt, FieldVisitor paramFieldVisitor) {
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
    this.fv = paramFieldVisitor;
  }
  
  public FieldVisitor(int paramInt) {
    this(paramInt, null);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\FieldVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */