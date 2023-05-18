package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public class BlankLineYamlCommentFormatter extends YamlCommentFormatter {
  public BlankLineYamlCommentFormatter() {
    this(new YamlCommentFormatterConfiguration());
  }
  
  public BlankLineYamlCommentFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration, YamlSideCommentFormatterConfiguration paramYamlSideCommentFormatterConfiguration) {
    super(paramYamlCommentFormatterConfiguration, paramYamlSideCommentFormatterConfiguration);
    stripPrefix(true).trim(false);
    paramYamlCommentFormatterConfiguration.prefix('\n' + paramYamlCommentFormatterConfiguration.prefixFirst(), paramYamlCommentFormatterConfiguration.prefixMultiline());
  }
  
  public String dump(String paramString, CommentType paramCommentType, KeyTree.Node paramNode) {
    if (paramCommentType == CommentType.SIDE) {
      String str1 = this.sideFormatter.prefixFirst();
      String str2 = '\n' + StringUtils.stripIndentation(str1);
      this.sideFormatter.prefix(str2, this.sideFormatter.prefixMultiline());
      String str3 = super.dump(paramString, paramCommentType, paramNode);
      this.sideFormatter.prefix(str1, this.sideFormatter.prefixMultiline());
      return str3;
    } 
    return super.dump(paramString, paramCommentType, paramNode);
  }
  
  public BlankLineYamlCommentFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration) {
    this(paramYamlCommentFormatterConfiguration, new YamlSideCommentFormatterConfiguration());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\BlankLineYamlCommentFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */