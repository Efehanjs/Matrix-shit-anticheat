package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class Context {
  public TypePath currentTypeAnnotationTargetPath;
  
  public String currentMethodName;
  
  public Label[] currentMethodLabels;
  
  public Label[] currentLocalVariableAnnotationRangeEnds;
  
  public Label[] currentLocalVariableAnnotationRangeStarts;
  
  public int currentFrameStackCount;
  
  public int currentFrameType;
  
  public int[] currentLocalVariableAnnotationRangeIndices;
  
  public int currentMethodAccessFlags;
  
  public Object[] currentFrameStackTypes;
  
  public int currentTypeAnnotationTarget;
  
  public int parsingOptions;
  
  public Object[] currentFrameLocalTypes;
  
  public Attribute[] attributePrototypes;
  
  public String currentMethodDescriptor;
  
  public int currentFrameLocalCount;
  
  public int currentFrameLocalCountDelta;
  
  public char[] charBuffer;
  
  public int currentFrameOffset;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Context.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */