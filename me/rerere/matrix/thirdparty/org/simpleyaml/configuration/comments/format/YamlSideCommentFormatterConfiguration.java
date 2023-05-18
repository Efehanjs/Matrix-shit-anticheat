package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class YamlSideCommentFormatterConfiguration extends YamlCommentFormatterConfiguration {
  public static final String DEFAULT_SIDE_COMMENT_PREFIX = " # ";
  
  private static final long c = o3.a(-1789342592401052756L, 1050283648342129171L, MethodHandles.lookup().lookupClass()).a(248175546396393L);
  
  public YamlSideCommentFormatterConfiguration(String paramString1, String paramString2) {
    super(paramString1, paramString2);
  }
  
  public void checkCommentPrefix(String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/format/YamlSideCommentFormatterConfiguration.c : J
    //   3: ldc2_w 119580210868429
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ifnull -> 52
    //   12: aload_1
    //   13: invokevirtual isEmpty : ()Z
    //   16: ifne -> 52
    //   19: goto -> 26
    //   22: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   25: athrow
    //   26: aload_1
    //   27: iconst_0
    //   28: invokevirtual charAt : (I)C
    //   31: invokestatic isWhitespace : (C)Z
    //   34: ifeq -> 52
    //   37: goto -> 44
    //   40: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   43: athrow
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   51: athrow
    //   52: iconst_0
    //   53: ldc 'Side comment prefix must start with space'
    //   55: invokestatic isTrue : (ZLjava/lang/String;)V
    //   58: aload_0
    //   59: aload_1
    //   60: invokespecial checkCommentPrefix : (Ljava/lang/String;)V
    //   63: return
    // Exception table:
    //   from	to	target	type
    //   8	19	22	java/lang/RuntimeException
    //   12	37	40	java/lang/RuntimeException
    //   26	48	48	java/lang/RuntimeException
  }
  
  public YamlSideCommentFormatterConfiguration stripPrefix(boolean paramBoolean) {
    super.stripPrefix(paramBoolean);
    return this;
  }
  
  public YamlSideCommentFormatterConfiguration trim(boolean paramBoolean) {
    super.trim(paramBoolean);
    return this;
  }
  
  public YamlSideCommentFormatterConfiguration(String paramString) {
    super(paramString);
  }
  
  public YamlSideCommentFormatterConfiguration prefix(String paramString1, String paramString2) {
    super.prefix(paramString1, paramString2);
    return this;
  }
  
  public YamlSideCommentFormatterConfiguration suffix(String paramString) {
    super.suffix(paramString);
    return this;
  }
  
  public YamlSideCommentFormatterConfiguration suffix(String paramString1, String paramString2) {
    super.suffix(paramString1, paramString2);
    return this;
  }
  
  public void checkCommentPrefixMultiline(String paramString) {
    super.checkCommentPrefix(paramString);
  }
  
  public YamlSideCommentFormatterConfiguration prefix(String paramString) {
    long l = c ^ 0x1F55781F8ADBL;
    super.prefix(paramString, "# ");
    return this;
  }
  
  public YamlSideCommentFormatterConfiguration() {
    this(" # ");
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\YamlSideCommentFormatterConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */