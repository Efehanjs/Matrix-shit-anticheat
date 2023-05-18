package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

public class YamlKeyTree$YamlCommentNode extends KeyTree$Node {
  public KeyTree$Node add(String paramString, boolean paramBoolean) {
    int i = 0;
    if (this != YamlKeyTree.this.root) {
      i = this.indent;
      if (this.isList) {
        i += YamlKeyTree.this.options().indentList();
      } else {
        i += YamlKeyTree.this.options.indent();
      } 
    } 
    return add(i, paramString, paramBoolean);
  }
  
  public YamlKeyTree$YamlCommentNode(KeyTree$Node paramKeyTree$Node, int paramInt, String paramString) {
    super(paramYamlKeyTree, paramKeyTree$Node, paramInt, paramString);
  }
  
  public void isList(int paramInt) {
    try {
      super.isList(paramInt);
      if (this.parent != null)
        try {
          if (this.parent.isList)
            this.indent = this.parent.indent + YamlKeyTree.this.options().indentList() + 2; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlKeyTree$YamlCommentNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */