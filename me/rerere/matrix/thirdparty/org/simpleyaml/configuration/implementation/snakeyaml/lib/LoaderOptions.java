package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

public class LoaderOptions {
  private boolean processComments = false;
  
  private boolean allowRecursiveKeys = false;
  
  private boolean wrappedToRootException = false;
  
  private boolean allowDuplicateKeys = true;
  
  private int maxAliasesForCollections = 50;
  
  private boolean enumCaseSensitive = true;
  
  private int codePointLimit = 3145728;
  
  private int nestingDepthLimit = 50;
  
  public final int getNestingDepthLimit() {
    return this.nestingDepthLimit;
  }
  
  public final int getCodePointLimit() {
    return this.codePointLimit;
  }
  
  public void setCodePointLimit(int paramInt) {
    this.codePointLimit = paramInt;
  }
  
  public void setAllowRecursiveKeys(boolean paramBoolean) {
    this.allowRecursiveKeys = paramBoolean;
  }
  
  public final boolean getAllowRecursiveKeys() {
    return this.allowRecursiveKeys;
  }
  
  public void setAllowDuplicateKeys(boolean paramBoolean) {
    this.allowDuplicateKeys = paramBoolean;
  }
  
  public void setWrappedToRootException(boolean paramBoolean) {
    this.wrappedToRootException = paramBoolean;
  }
  
  public final boolean isWrappedToRootException() {
    return this.wrappedToRootException;
  }
  
  public final boolean isEnumCaseSensitive() {
    return this.enumCaseSensitive;
  }
  
  public void setNestingDepthLimit(int paramInt) {
    this.nestingDepthLimit = paramInt;
  }
  
  public LoaderOptions setProcessComments(boolean paramBoolean) {
    this.processComments = paramBoolean;
    return this;
  }
  
  public final int getMaxAliasesForCollections() {
    return this.maxAliasesForCollections;
  }
  
  public final boolean isAllowDuplicateKeys() {
    return this.allowDuplicateKeys;
  }
  
  public final boolean isProcessComments() {
    return this.processComments;
  }
  
  public void setEnumCaseSensitive(boolean paramBoolean) {
    this.enumCaseSensitive = paramBoolean;
  }
  
  public void setMaxAliasesForCollections(int paramInt) {
    this.maxAliasesForCollections = paramInt;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\LoaderOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */