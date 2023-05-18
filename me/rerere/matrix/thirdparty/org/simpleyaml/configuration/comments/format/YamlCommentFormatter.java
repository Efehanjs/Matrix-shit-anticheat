package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlCommentFormatter implements CommentFormatter {
  public final YamlSideCommentFormatterConfiguration sideFormatter;
  
  public final YamlCommentFormatterConfiguration blockFormatter;
  
  private static final long a = o3.a(-1786811960201570523L, 8409275589111137598L, MethodHandles.lookup().lookupClass()).a(13812834082649L);
  
  public YamlCommentFormatter trim(boolean paramBoolean) {
    this.blockFormatter.trim(paramBoolean);
    this.sideFormatter.trim(paramBoolean);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    YamlCommentFormatter yamlCommentFormatter = (YamlCommentFormatter)paramObject;
    try {
      if (Objects.equals(this.blockFormatter, yamlCommentFormatter.blockFormatter))
        try {
          if (Objects.equals(this.sideFormatter, yamlCommentFormatter.sideFormatter));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public String parseCommentLine(String paramString1, String paramString2, boolean paramBoolean) {
    String str = StringUtils.stripIndentation(paramString1);
    if (paramBoolean)
      str = StringUtils.stripPrefix(str, paramString2, "#"); 
    return str;
  }
  
  public final YamlCommentFormatterConfiguration formatterConfiguration(CommentType paramCommentType) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramCommentType == CommentType.BLOCK) ? this.blockFormatter : this.sideFormatter;
  }
  
  public final YamlSideCommentFormatterConfiguration sideFormatter() {
    return this.sideFormatter;
  }
  
  public YamlCommentFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration, YamlSideCommentFormatterConfiguration paramYamlSideCommentFormatterConfiguration) {
    Validate.notNull(paramYamlCommentFormatterConfiguration, "blockFormatter configuration cannot be null!");
    Validate.notNull(paramYamlCommentFormatterConfiguration, "sideFormatter configuration cannot be null!");
    this.blockFormatter = paramYamlCommentFormatterConfiguration;
    this.sideFormatter = paramYamlSideCommentFormatterConfiguration;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.blockFormatter, this.sideFormatter });
  }
  
  public YamlCommentFormatter() {
    this(new YamlCommentFormatterConfiguration());
  }
  
  public String parse(Reader paramReader, CommentType paramCommentType, KeyTree.Node paramNode) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 10
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   9: athrow
    //   10: aload_0
    //   11: aload_2
    //   12: invokevirtual formatterConfiguration : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/CommentType;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/format/YamlCommentFormatterConfiguration;
    //   15: astore #4
    //   17: aload #4
    //   19: invokevirtual prefixFirst : ()Ljava/lang/String;
    //   22: invokestatic stripIndentation : (Ljava/lang/String;)Ljava/lang/String;
    //   25: astore #5
    //   27: aload #4
    //   29: invokevirtual prefixMultiline : ()Ljava/lang/String;
    //   32: invokestatic stripIndentation : (Ljava/lang/String;)Ljava/lang/String;
    //   35: astore #6
    //   37: aload_1
    //   38: instanceof java/io/BufferedReader
    //   41: ifeq -> 55
    //   44: aload_1
    //   45: checkcast java/io/BufferedReader
    //   48: goto -> 63
    //   51: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   54: athrow
    //   55: new java/io/BufferedReader
    //   58: dup
    //   59: aload_1
    //   60: invokespecial <init> : (Ljava/io/Reader;)V
    //   63: astore #7
    //   65: aconst_null
    //   66: astore #8
    //   68: new java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: astore #9
    //   77: aload #4
    //   79: invokevirtual stripPrefix : ()Z
    //   82: istore #10
    //   84: aload #7
    //   86: invokevirtual readLine : ()Ljava/lang/String;
    //   89: astore #11
    //   91: aload #11
    //   93: ifnull -> 119
    //   96: aload #9
    //   98: aload_0
    //   99: aload #11
    //   101: aload #5
    //   103: iload #10
    //   105: invokevirtual parseCommentLine : (Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   118: athrow
    //   119: aload #7
    //   121: invokevirtual readLine : ()Ljava/lang/String;
    //   124: dup
    //   125: astore #12
    //   127: ifnull -> 158
    //   130: aload #9
    //   132: bipush #10
    //   134: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   137: aload_0
    //   138: aload #12
    //   140: aload #6
    //   142: iload #10
    //   144: invokevirtual parseCommentLine : (Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: goto -> 119
    //   154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   157: athrow
    //   158: aload #9
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: astore #13
    //   165: aload #4
    //   167: invokevirtual trim : ()Z
    //   170: ifeq -> 185
    //   173: aload #13
    //   175: invokevirtual trim : ()Ljava/lang/String;
    //   178: goto -> 187
    //   181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   184: athrow
    //   185: aload #13
    //   187: astore #14
    //   189: aload #7
    //   191: ifnull -> 231
    //   194: aload #8
    //   196: ifnull -> 226
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   205: athrow
    //   206: aload #7
    //   208: invokevirtual close : ()V
    //   211: goto -> 231
    //   214: astore #15
    //   216: aload #8
    //   218: aload #15
    //   220: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   223: goto -> 231
    //   226: aload #7
    //   228: invokevirtual close : ()V
    //   231: aload #14
    //   233: areturn
    //   234: astore #9
    //   236: aload #9
    //   238: astore #8
    //   240: aload #9
    //   242: athrow
    //   243: astore #16
    //   245: aload #7
    //   247: ifnull -> 287
    //   250: aload #8
    //   252: ifnull -> 282
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #7
    //   264: invokevirtual close : ()V
    //   267: goto -> 287
    //   270: astore #17
    //   272: aload #8
    //   274: aload #17
    //   276: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   279: goto -> 287
    //   282: aload #7
    //   284: invokevirtual close : ()V
    //   287: aload #16
    //   289: athrow
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/Throwable
    //   37	51	51	java/lang/Throwable
    //   68	189	234	java/lang/Throwable
    //   68	189	243	finally
    //   91	112	115	java/lang/Throwable
    //   127	154	154	java/lang/Throwable
    //   165	181	181	java/lang/Throwable
    //   189	199	202	java/lang/Throwable
    //   206	211	214	java/lang/Throwable
    //   234	245	243	finally
    //   245	255	258	java/lang/Throwable
    //   262	267	270	java/lang/Throwable
  }
  
  public String toString() {
    long l = a ^ 0x5FAAF2944EB3L;
    return getClass().getSimpleName() + "{\nblockFormatter=" + this.blockFormatter + ",\nsideFormatter=" + this.sideFormatter + "\n}";
  }
  
  public String dump(String paramString, CommentType paramCommentType, KeyTree.Node paramNode) {
    YamlCommentFormatterConfiguration yamlCommentFormatterConfiguration = formatterConfiguration(paramCommentType);
    String str1 = null;
    String str2 = null;
    try {
      if (paramString != null)
        try {
          if (StringUtils.allLinesArePrefixedOrBlank(paramString, "#")) {
            try {
              if (paramCommentType == CommentType.SIDE && !paramString.startsWith(" ")) {
                str1 = " ";
                str2 = "";
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            str1 = yamlCommentFormatterConfiguration.prefixFirst();
            str2 = yamlCommentFormatterConfiguration.prefixMultiline();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return CommentFormatter.format(paramNode.getIndentation(), str1, str2, paramString, paramCommentType, yamlCommentFormatterConfiguration.suffixMultiline(), yamlCommentFormatterConfiguration.suffixLast());
  }
  
  public final YamlCommentFormatterConfiguration blockFormatter() {
    return this.blockFormatter;
  }
  
  public YamlCommentFormatter stripPrefix(boolean paramBoolean) {
    this.blockFormatter.stripPrefix(paramBoolean);
    this.sideFormatter.stripPrefix(paramBoolean);
    return this;
  }
  
  public YamlCommentFormatter(YamlCommentFormatterConfiguration paramYamlCommentFormatterConfiguration) {
    this(paramYamlCommentFormatterConfiguration, new YamlSideCommentFormatterConfiguration());
    stripPrefix(true);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\YamlCommentFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */