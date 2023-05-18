package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;

public class PrettyYamlCommentFormatter extends YamlCommentFormatter {
  public PrettyYamlCommentFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration) {
    this(paramYamlCommentFormatterConfiguration, new YamlSideCommentFormatterConfiguration());
  }
  
  public String dump(String paramString, CommentType paramCommentType, KeyTree.Node paramNode) {
    try {
      if (paramCommentType == CommentType.BLOCK)
        try {
          if (paramNode != null)
            try {
              if (paramNode.getIndentation() == 0 && !paramNode.isFirstNode()) {
                YamlCommentFormatterConfiguration yamlCommentFormatterConfiguration = formatterConfiguration(CommentType.BLOCK);
                String str1 = yamlCommentFormatterConfiguration.prefixFirst();
                String str2 = yamlCommentFormatterConfiguration.prefixMultiline();
                yamlCommentFormatterConfiguration.prefix('\n' + str1, str2);
                String str3 = super.dump(paramString, paramCommentType, paramNode);
                yamlCommentFormatterConfiguration.prefix(str1, str2);
                return str3;
              } 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return super.dump(paramString, paramCommentType, paramNode);
  }
  
  public PrettyYamlCommentFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration, YamlSideCommentFormatterConfiguration paramYamlSideCommentFormatterConfiguration) {
    super(paramYamlCommentFormatterConfiguration, paramYamlSideCommentFormatterConfiguration);
    stripPrefix(true).trim(true);
  }
  
  public PrettyYamlCommentFormatter() {
    this(new YamlCommentFormatterConfiguration());
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\PrettyYamlCommentFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */