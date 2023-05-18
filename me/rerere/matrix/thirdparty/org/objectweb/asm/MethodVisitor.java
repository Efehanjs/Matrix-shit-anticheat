package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public abstract class MethodVisitor {
  public final int api;
  
  public MethodVisitor mv;
  
  private static final String REQUIRES_ASM5 = "This feature requires ASM5";
  
  private static final long b = o3.a(75194692290007290L, 2430691893818205948L, null).a(158850972212849L);
  
  public void visitMaxs(int paramInt1, int paramInt2) {
    try {
      if (this.mv != null)
        this.mv.visitMaxs(paramInt1, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
    try {
      if (this.mv != null)
        this.mv.visitLookupSwitchInsn(paramLabel, paramArrayOfint, paramArrayOfLabel); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitLdcInsn(Object paramObject) {
    long l = b ^ 0x2D5D28F5BB0EL;
    try {
      if (this.api < 327680)
        try {
          if (!(paramObject instanceof Handle)) {
            try {
              if (paramObject instanceof Type)
                try {
                  if (((Type)paramObject).getSort() == 11)
                    throw new UnsupportedOperationException("This feature requires ASM5"); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
            throw new UnsupportedOperationException("This feature requires ASM5");
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.api < 458752)
        try {
          if (paramObject instanceof ConstantDynamic)
            throw new UnsupportedOperationException("This feature requires ASM7"); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        this.mv.visitLdcInsn(paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
    long l = b ^ 0x2244E3CC717DL;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        this.mv.visitInvokeDynamicInsn(paramString1, paramString2, paramHandle, paramVarArgs); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitVarInsn(int paramInt1, int paramInt2) {
    try {
      if (this.mv != null)
        this.mv.visitVarInsn(paramInt1, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
    try {
      if (this.mv != null)
        this.mv.visitLocalVariable(paramString1, paramString2, paramString3, paramLabel1, paramLabel2, paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitAttribute(Attribute paramAttribute) {
    try {
      if (this.mv != null)
        this.mv.visitAttribute(paramAttribute); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitParameter(String paramString, int paramInt) {
    long l = b ^ 0x725A9C9C005AL;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        this.mv.visitParameter(paramString, paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
    try {
      if (this.mv != null)
        this.mv.visitFieldInsn(paramInt, paramString1, paramString2, paramString3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public MethodVisitor(int paramInt, MethodVisitor paramMethodVisitor) {
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
    this.mv = paramMethodVisitor;
  }
  
  public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
    try {
      if (this.mv != null)
        return this.mv.visitAnnotation(paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
    try {
      if (this.mv != null)
        this.mv.visitFrame(paramInt1, paramInt2, paramArrayOfObject1, paramInt3, paramArrayOfObject2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
    long l = b ^ 0x369D8DE5846DL;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        return this.mv.visitLocalVariableAnnotation(paramInt, paramTypePath, paramArrayOfLabel1, paramArrayOfLabel2, paramArrayOfint, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    long l = b ^ 0x369085732D9BL;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        return this.mv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public MethodVisitor getDelegate() {
    return this.mv;
  }
  
  public void visitInsn(int paramInt) {
    try {
      if (this.mv != null)
        this.mv.visitInsn(paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitJumpInsn(int paramInt, Label paramLabel) {
    try {
      if (this.mv != null)
        this.mv.visitJumpInsn(paramInt, paramLabel); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitLineNumber(int paramInt, Label paramLabel) {
    try {
      if (this.mv != null)
        this.mv.visitLineNumber(paramInt, paramLabel); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    long l = b ^ 0xA6D5336FA5BL;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        return this.mv.visitInsnAnnotation(paramInt, paramTypePath, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitEnd() {
    try {
      if (this.mv != null)
        this.mv.visitEnd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    long l = b ^ 0x2703A456135L;
    try {
      if (this.api < 327680)
        try {
          if ((paramInt & 0x100) == 0) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramBoolean != ((paramInt == 185)))
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5"); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            visitMethodInsn(paramInt, paramString1, paramString2, paramString3);
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        this.mv.visitMethodInsn(paramInt & 0xFFFFFEFF, paramString1, paramString2, paramString3, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitCode() {
    try {
      if (this.mv != null)
        this.mv.visitCode(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
    long l = b ^ 0x153A10E75D8AL;
    try {
      if (this.api < 327680)
        throw new UnsupportedOperationException("This feature requires ASM5"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.mv != null)
        return this.mv.visitTryCatchAnnotation(paramInt, paramTypePath, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
    try {
      if (this.mv != null)
        this.mv.visitTryCatchBlock(paramLabel1, paramLabel2, paramLabel3, paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public AnnotationVisitor visitAnnotationDefault() {
    try {
      if (this.mv != null)
        return this.mv.visitAnnotationDefault(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitLabel(Label paramLabel) {
    try {
      if (this.mv != null)
        this.mv.visitLabel(paramLabel); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public MethodVisitor(int paramInt) {
    this(paramInt, null);
  }
  
  public void visitIntInsn(int paramInt1, int paramInt2) {
    try {
      if (this.mv != null)
        this.mv.visitIntInsn(paramInt1, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitAnnotableParameterCount(int paramInt, boolean paramBoolean) {
    try {
      if (this.mv != null)
        this.mv.visitAnnotableParameterCount(paramInt, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitTypeInsn(int paramInt, String paramString) {
    try {
      if (this.mv != null)
        this.mv.visitTypeInsn(paramInt, paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitMultiANewArrayInsn(String paramString, int paramInt) {
    try {
      if (this.mv != null)
        this.mv.visitMultiANewArrayInsn(paramString, paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @Deprecated
  public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = paramInt | ((this.api < 327680) ? 256 : 0);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    visitMethodInsn(i, paramString1, paramString2, paramString3, (paramInt == 185));
  }
  
  public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
    try {
      if (this.mv != null)
        return this.mv.visitParameterAnnotation(paramInt, paramString, paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
    try {
      if (this.mv != null)
        this.mv.visitTableSwitchInsn(paramInt1, paramInt2, paramLabel, paramVarArgs); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void visitIincInsn(int paramInt1, int paramInt2) {
    try {
      if (this.mv != null)
        this.mv.visitIincInsn(paramInt1, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\MethodVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */