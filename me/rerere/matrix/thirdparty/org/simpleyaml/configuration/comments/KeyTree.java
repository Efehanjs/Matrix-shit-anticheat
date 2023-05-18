package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class KeyTree implements Iterable {
  public final ConfigurationOptions options;
  
  public final KeyTree$Node root;
  
  public Set keys() {
    return this.root.keys();
  }
  
  public KeyTree$Node createNode(KeyTree$Node paramKeyTree$Node, int paramInt, String paramString) {
    return new KeyTree$Node(this, paramKeyTree$Node, paramInt, paramString);
  }
  
  public KeyTree$Node getOrAdd(String paramString) {
    return this.root.get(paramString, true, false);
  }
  
  public KeyTree$Node add(String paramString) {
    return this.root.get(paramString, true, true);
  }
  
  public KeyTree$Node findParent(KeyTree$Node paramKeyTree$Node, int paramInt) {
    KeyTree$Node keyTree$Node = paramKeyTree$Node.getLast();
    try {
      if (keyTree$Node != null)
        try {
          if (keyTree$Node.indent < paramInt)
            return findParent(keyTree$Node, paramInt); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramKeyTree$Node;
  }
  
  public KeyTree$Node findParent(int paramInt) {
    return findParent(this.root, paramInt);
  }
  
  public KeyTree$Node getRoot() {
    return this.root;
  }
  
  public Iterator iterator() {
    return this.root.iterator();
  }
  
  public ConfigurationOptions options() {
    return this.options;
  }
  
  public KeyTree(ConfigurationOptions paramConfigurationOptions) {
    Validate.notNull(paramConfigurationOptions);
    this.options = paramConfigurationOptions;
    this.root = createNode(null, 0, "");
  }
  
  public String toString() {
    return this.root.toString();
  }
  
  public List children() {
    return this.root.children();
  }
  
  public KeyTree$Node get(String paramString) {
    return this.root.get(paramString, false, false);
  }
  
  public KeyTree$Node getPriority(String paramString) {
    return this.root.get(paramString, false, true);
  }
  
  public Set entries() {
    return this.root.entries();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\KeyTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */