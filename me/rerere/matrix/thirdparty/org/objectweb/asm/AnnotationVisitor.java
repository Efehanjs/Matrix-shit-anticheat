package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public abstract class AnnotationVisitor {
  public AnnotationVisitor av;
  
  public final int api;
  
  private static final long a = o3.a(-7310292059294238150L, -5352525027125120246L, null).a(98012660655499L);
  
  public AnnotationVisitor getDelegate() {
    return this.av;
  }
  
  public AnnotationVisitor visitArray(String paramString) {
    try {
      if (this.av != null)
        return this.av.visitArray(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
    try {
      if (this.av != null)
        return this.av.visitAnnotation(paramString1, paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public AnnotationVisitor(int paramInt, AnnotationVisitor paramAnnotationVisitor) {
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
    this.av = paramAnnotationVisitor;
  }
  
  public void visit(String paramString, Object paramObject) {
    try {
      if (this.av != null)
        this.av.visit(paramString, paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitEnd() {
    try {
      if (this.av != null)
        this.av.visitEnd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor(int paramInt) {
    this(paramInt, null);
  }
  
  public void visitEnum(String paramString1, String paramString2, String paramString3) {
    try {
      if (this.av != null)
        this.av.visitEnum(paramString1, paramString2, paramString3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\AnnotationVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */