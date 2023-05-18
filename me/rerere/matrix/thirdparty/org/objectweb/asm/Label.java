package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public class Label {
  public static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
  
  private int[] forwardReferences;
  
  public short outputStackSize;
  
  public Object info;
  
  public Label nextBasicBlock;
  
  public Edge outgoingEdges;
  
  public static final int FLAG_DEBUG_ONLY = 1;
  
  public short flags;
  
  public static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
  
  public static final int FLAG_SUBROUTINE_CALLER = 16;
  
  public static final int LINE_NUMBERS_CAPACITY_INCREMENT = 4;
  
  public static final Label EMPTY_LIST;
  
  public short subroutineId;
  
  public int bytecodeOffset;
  
  public Label nextListElement;
  
  public static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
  
  public static final int FLAG_REACHABLE = 8;
  
  public short inputStackSize;
  
  public short outputStackMax;
  
  public static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
  
  private int[] otherLineNumbers;
  
  public static final int FLAG_SUBROUTINE_END = 64;
  
  public static final int FLAG_SUBROUTINE_START = 32;
  
  public static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
  
  public Frame frame;
  
  public static final int FLAG_JUMP_TARGET = 2;
  
  private short lineNumber;
  
  public static final int FLAG_RESOLVED = 4;
  
  private static final long a = o3.a(6812023505489774129L, 7252885281482675213L, null).a(3648393102778L);
  
  public final void addLineNumber(int paramInt) {
    try {
      if (this.lineNumber == 0) {
        this.lineNumber = (short)paramInt;
      } else {
        try {
          if (this.otherLineNumbers == null)
            this.otherLineNumbers = new int[4]; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        int i = this.otherLineNumbers[0] = this.otherLineNumbers[0] + 1;
        if (i >= this.otherLineNumbers.length) {
          int[] arrayOfInt = new int[this.otherLineNumbers.length + 4];
          System.arraycopy(this.otherLineNumbers, 0, arrayOfInt, 0, this.otherLineNumbers.length);
          this.otherLineNumbers = arrayOfInt;
        } 
        this.otherLineNumbers[i] = paramInt;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public final void put(ByteVector paramByteVector, int paramInt, boolean paramBoolean) {
    try {
      if ((this.flags & 0x4) == 0) {
        try {
          if (paramBoolean) {
            addForwardReference(paramInt, 536870912, paramByteVector.length);
            paramByteVector.putInt(-1);
          } else {
            addForwardReference(paramInt, 268435456, paramByteVector.length);
            paramByteVector.putShort(-1);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramBoolean) {
            paramByteVector.putInt(this.bytecodeOffset - paramInt);
          } else {
            paramByteVector.putShort(this.bytecodeOffset - paramInt);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public int getOffset() {
    long l = a ^ 0xF9EE18AC7FFL;
    try {
      if ((this.flags & 0x4) == 0)
        throw new IllegalStateException("Label offset position has not been resolved yet"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.bytecodeOffset;
  }
  
  public final void markSubroutine(short paramShort) {
    Label label = this;
    label.nextListElement = EMPTY_LIST;
    while (label != EMPTY_LIST) {
      Label label1 = label;
      label = label.nextListElement;
      label1.nextListElement = null;
      if (label1.subroutineId == 0) {
        label1.subroutineId = paramShort;
        label = label1.pushSuccessors(label);
      } 
    } 
  }
  
  public final Label getCanonicalInstance() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.frame == null) ? this : this.frame.owner;
  }
  
  public String toString() {
    return "L" + System.identityHashCode(this);
  }
  
  static {
    EMPTY_LIST = new Label();
  }
  
  public final void accept(MethodVisitor paramMethodVisitor, boolean paramBoolean) {
    try {
      paramMethodVisitor.visitLabel(this);
      if (paramBoolean)
        try {
          if (this.lineNumber != 0) {
            paramMethodVisitor.visitLineNumber(this.lineNumber & 0xFFFF, this);
            if (this.otherLineNumbers != null) {
              byte b = 1;
              try {
                while (b <= this.otherLineNumbers[0]) {
                  paramMethodVisitor.visitLineNumber(this.otherLineNumbers[b], this);
                  b++;
                } 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public final boolean resolve(byte[] paramArrayOfbyte, int paramInt) {
    try {
      this.flags = (short)(this.flags | 0x4);
      this.bytecodeOffset = paramInt;
      if (this.forwardReferences == null)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = false;
    for (int i = this.forwardReferences[0]; i > 0; i -= 2) {
      int j = this.forwardReferences[i - 1];
      int k = this.forwardReferences[i];
      int m = paramInt - j;
      int n = k & 0xFFFFFFF;
      try {
        if ((k & 0xF0000000) == 268435456) {
          try {
            if (m < -32768 || m > 32767) {
              int i1 = paramArrayOfbyte[j] & 0xFF;
              try {
                if (i1 < 198) {
                  paramArrayOfbyte[j] = (byte)(i1 + 49);
                } else {
                  paramArrayOfbyte[j] = (byte)(i1 + 20);
                } 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              bool = true;
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          paramArrayOfbyte[n++] = (byte)(m >>> 8);
          paramArrayOfbyte[n] = (byte)m;
        } else {
          paramArrayOfbyte[n++] = (byte)(m >>> 24);
          paramArrayOfbyte[n++] = (byte)(m >>> 16);
          paramArrayOfbyte[n++] = (byte)(m >>> 8);
          paramArrayOfbyte[n] = (byte)m;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return bool;
  }
  
  public final void addSubroutineRetSuccessors(Label paramLabel) {
    Label label1 = EMPTY_LIST;
    Label label2 = this;
    label2.nextListElement = EMPTY_LIST;
    while (label2 != EMPTY_LIST) {
      Label label = label2;
      label2 = label.nextListElement;
      label.nextListElement = label1;
      label1 = label;
      try {
        if ((label.flags & 0x40) != 0)
          try {
            if (label.subroutineId != paramLabel.subroutineId)
              label.outgoingEdges = new Edge(label.outputStackSize, paramLabel.outgoingEdges.successor, label.outgoingEdges); 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      label2 = label.pushSuccessors(label2);
    } 
    while (label1 != EMPTY_LIST) {
      Label label = label1.nextListElement;
      label1.nextListElement = null;
      label1 = label;
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Label.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */