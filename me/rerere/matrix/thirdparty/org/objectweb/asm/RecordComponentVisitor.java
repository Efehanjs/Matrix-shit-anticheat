package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public abstract class RecordComponentVisitor {
  public RecordComponentVisitor delegate;
  
  public final int api;
  
  private static final long a = o3.a(7680441055647014962L, -7656131554670639936L, null).a(267897955853069L);
  
  public RecordComponentVisitor(int paramInt) {
    this(paramInt, null);
  }
  
  public void visitEnd() {
    try {
      if (this.delegate != null)
        this.delegate.visitEnd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public RecordComponentVisitor(int paramInt, RecordComponentVisitor paramRecordComponentVisitor) {
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
    this.delegate = paramRecordComponentVisitor;
  }
  
  public RecordComponentVisitor getDelegate() {
    return this.delegate;
  }
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (this.delegate != null)
        return this.delegate.visitAnnotation(paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitAttribute(Attribute paramAttribute) {
    try {
      if (this.delegate != null)
        this.delegate.visitAttribute(paramAttribute); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    try {
      if (this.delegate != null)
        return this.delegate.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\RecordComponentVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */