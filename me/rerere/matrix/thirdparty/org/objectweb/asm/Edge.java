package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class Edge {
  public final Label successor;
  
  public static final int JUMP = 0;
  
  public Edge nextEdge;
  
  public static final int EXCEPTION = 2147483647;
  
  public final int info;
  
  public Edge(int paramInt, Label paramLabel, Edge paramEdge) {
    this.info = paramInt;
    this.successor = paramLabel;
    this.nextEdge = paramEdge;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Edge.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */