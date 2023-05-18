package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

public class AnchorNode extends Node {
  private final Node realNode;
  
  public Node getRealNode() {
    return this.realNode;
  }
  
  public NodeId getNodeId() {
    return NodeId.anchor;
  }
  
  public AnchorNode(Node paramNode) {
    super(paramNode.getTag(), paramNode.getStartMark(), paramNode.getEndMark());
    this.realNode = paramNode;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\AnchorNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */