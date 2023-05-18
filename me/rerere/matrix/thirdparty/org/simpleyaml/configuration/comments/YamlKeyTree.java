package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;

public class YamlKeyTree extends KeyTree {
  public YamlConfigurationOptions options() {
    return (YamlConfigurationOptions)this.options;
  }
  
  public YamlKeyTree(YamlConfigurationOptions paramYamlConfigurationOptions) {
    super((ConfigurationOptions)paramYamlConfigurationOptions);
  }
  
  public KeyTree$Node createNode(KeyTree$Node paramKeyTree$Node, int paramInt, String paramString) {
    return new YamlKeyTree$YamlCommentNode(this, paramKeyTree$Node, paramInt, paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlKeyTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */