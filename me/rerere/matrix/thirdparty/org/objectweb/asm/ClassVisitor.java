package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public abstract class ClassVisitor {
  public final int api;
  
  public ClassVisitor cv;
  
  private static final long b = o3.a(-4529025899843943648L, -1102415629923638671L, null).a(184811034395997L);
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    long l = b ^ 0x536A2CAB4533L;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("TypeAnnotation requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        return this.cv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitPermittedSubclass(String paramString) {
    long l = b ^ 0x322AB92D16E6L;
    try {
      if (this.api < 589824)
        throw new UnsupportedOperationException("PermittedSubclasses requires ASM9"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        this.cv.visitPermittedSubclass(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    long l = b ^ 0x521E02707417L;
    try {
      if (this.api < 524288)
        try {
          if ((paramInt2 & 0x10000) != 0)
            throw new UnsupportedOperationException("Records requires ASM8"); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        this.cv.visit(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitSource(String paramString1, String paramString2) {
    try {
      if (this.cv != null)
        this.cv.visitSource(paramString1, paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public ModuleVisitor visitModule(String paramString1, int paramInt, String paramString2) {
    long l = b ^ 0x1C49E9F81348L;
    try {
      if (this.api < 393216)
        throw new UnsupportedOperationException("Module requires ASM6"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        return this.cv.visitModule(paramString1, paramInt, paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
    try {
      if (this.cv != null)
        this.cv.visitInnerClass(paramString1, paramString2, paramString3, paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (this.cv != null)
        return this.cv.visitAnnotation(paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public ClassVisitor(int paramInt) {
    this(paramInt, null);
  }
  
  public void visitNestHost(String paramString) {
    long l = b ^ 0x376B35910513L;
    try {
      if (this.api < 458752)
        throw new UnsupportedOperationException("NestHost requires ASM7"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        this.cv.visitNestHost(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitEnd() {
    try {
      if (this.cv != null)
        this.cv.visitEnd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    try {
      if (this.cv != null)
        return this.cv.visitMethod(paramInt, paramString1, paramString2, paramString3, paramArrayOfString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public ClassVisitor(int paramInt, ClassVisitor paramClassVisitor) {
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
    this.cv = paramClassVisitor;
  }
  
  public void visitAttribute(Attribute paramAttribute) {
    try {
      if (this.cv != null)
        this.cv.visitAttribute(paramAttribute); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public RecordComponentVisitor visitRecordComponent(String paramString1, String paramString2, String paramString3) {
    long l = b ^ 0x595A94BB3211L;
    try {
      if (this.api < 524288)
        throw new UnsupportedOperationException("Record requires ASM8"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        return this.cv.visitRecordComponent(paramString1, paramString2, paramString3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitOuterClass(String paramString1, String paramString2, String paramString3) {
    try {
      if (this.cv != null)
        this.cv.visitOuterClass(paramString1, paramString2, paramString3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
    try {
      if (this.cv != null)
        return this.cv.visitField(paramInt, paramString1, paramString2, paramString3, paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitNestMember(String paramString) {
    long l = b ^ 0x21C5BBABE02CL;
    try {
      if (this.api < 458752)
        throw new UnsupportedOperationException("NestMember requires ASM7"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.cv != null)
        this.cv.visitNestMember(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public ClassVisitor getDelegate() {
    return this.cv;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ClassVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */