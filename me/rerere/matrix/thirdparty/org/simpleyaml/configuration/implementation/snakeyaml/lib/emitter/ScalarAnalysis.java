package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

public final class ScalarAnalysis {
  private final boolean allowFlowPlain;
  
  private final boolean multiline;
  
  private final boolean empty;
  
  private final boolean allowSingleQuoted;
  
  private final String scalar;
  
  private final boolean allowBlock;
  
  private final boolean allowBlockPlain;
  
  public boolean isEmpty() {
    return this.empty;
  }
  
  public boolean isMultiline() {
    return this.multiline;
  }
  
  public boolean isAllowSingleQuoted() {
    return this.allowSingleQuoted;
  }
  
  public boolean isAllowBlock() {
    return this.allowBlock;
  }
  
  public ScalarAnalysis(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6) {
    this.scalar = paramString;
    this.empty = paramBoolean1;
    this.multiline = paramBoolean2;
    this.allowFlowPlain = paramBoolean3;
    this.allowBlockPlain = paramBoolean4;
    this.allowSingleQuoted = paramBoolean5;
    this.allowBlock = paramBoolean6;
  }
  
  public boolean isAllowBlockPlain() {
    return this.allowBlockPlain;
  }
  
  public boolean isAllowFlowPlain() {
    return this.allowFlowPlain;
  }
  
  public String getScalar() {
    return this.scalar;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\ScalarAnalysis.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */