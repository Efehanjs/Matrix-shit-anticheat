package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlCommentParser extends YamlCommentReader {
  public final BufferedReader reader;
  
  public StringBuilder blockComment;
  
  public boolean headerParsed = false;
  
  public boolean blockCommentStarted = false;
  
  private static final long b = o3.a(-2031185867849087482L, -1971003278128858203L, MethodHandles.lookup().lookupClass()).a(230460894436443L);
  
  public String trackBlockComment(KeyTree$Node paramKeyTree$Node) {
    String str = null;
    try {
      if (paramKeyTree$Node != null)
        try {
          if (this.blockComment != null)
            try {
              if (!isExplicit() || this.explicitNotation.getNode() == paramKeyTree$Node) {
                str = this.blockComment.toString();
                if (!this.headerParsed) {
                  str = removeHeader(str, options());
                  this.headerParsed = true;
                } 
                setRawComment(paramKeyTree$Node, str, CommentType.BLOCK);
                this.blockComment = null;
                this.blockCommentStarted = false;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str;
  }
  
  public void close() throws IOException {
    this.reader.close();
  }
  
  public void endExplicitBlock() throws IOException {
    trackBlockCommentExplicit(this.currentNode);
    trackSideComment(this.currentNode);
  }
  
  public void trackSideComment(KeyTree$Node paramKeyTree$Node) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isExplicit : ()Z
    //   4: ifeq -> 151
    //   7: aload_0
    //   8: getfield currentLine : Ljava/lang/String;
    //   11: ifnull -> 128
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   25: invokevirtual isFinished : ()Z
    //   28: ifne -> 128
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual readValue : ()V
    //   42: aload_0
    //   43: invokevirtual isComment : ()Z
    //   46: ifeq -> 210
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_0
    //   57: invokevirtual isExplicit : ()Z
    //   60: ifeq -> 210
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_0
    //   71: getfield currentLine : Ljava/lang/String;
    //   74: aload_0
    //   75: getfield position : I
    //   78: invokevirtual substring : (I)Ljava/lang/String;
    //   81: astore_2
    //   82: aload_1
    //   83: ifnull -> 104
    //   86: aload_1
    //   87: aload_0
    //   88: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   91: invokevirtual getNode : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   94: if_acmpne -> 119
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   108: aload_2
    //   109: invokevirtual addComment : (Ljava/lang/String;)V
    //   112: goto -> 125
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: aload_0
    //   120: aload_1
    //   121: aload_2
    //   122: invokevirtual setSideComment : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Ljava/lang/String;)V
    //   125: goto -> 210
    //   128: aload_1
    //   129: ifnull -> 210
    //   132: aload_0
    //   133: aload_1
    //   134: aload_0
    //   135: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   138: invokevirtual getValueComment : ()Ljava/lang/String;
    //   141: invokevirtual setSideComment : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Ljava/lang/String;)V
    //   144: goto -> 210
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield currentLine : Ljava/lang/String;
    //   155: ifnull -> 210
    //   158: aload_1
    //   159: ifnull -> 210
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: aload_0
    //   170: invokevirtual readValue : ()V
    //   173: aload_0
    //   174: invokevirtual isComment : ()Z
    //   177: ifeq -> 210
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: aload_1
    //   189: aload_0
    //   190: getfield currentLine : Ljava/lang/String;
    //   193: aload_0
    //   194: getfield position : I
    //   197: invokevirtual substring : (I)Ljava/lang/String;
    //   200: invokevirtual setSideComment : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Ljava/lang/String;)V
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/io/IOException
    //   7	31	34	java/io/IOException
    //   21	49	52	java/io/IOException
    //   38	63	66	java/io/IOException
    //   82	97	100	java/io/IOException
    //   86	115	115	java/io/IOException
    //   128	147	147	java/io/IOException
    //   151	162	165	java/io/IOException
    //   158	180	183	java/io/IOException
    //   169	203	206	java/io/IOException
  }
  
  public void trackSideCommentBelow() {
    try {
      if (isSectionEnd()) {
        try {
          if (this.blockComment != null && this.blockCommentStarted) {
            String str = getRawComment(this.currentNode, CommentType.SIDE);
            if (str == null)
              str = ""; 
            str = str + '\n';
            String[] arrayOfString = StringUtils.splitTrailingNewLines(this.blockComment.toString());
            str = str + arrayOfString[0];
            try {
              if (arrayOfString[1].isEmpty()) {
                this.blockComment = null;
              } else {
                this.blockComment = new StringBuilder(arrayOfString[1]);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            this.blockCommentStarted = false;
            setRawComment(this.currentNode, str, CommentType.SIDE);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        clearCurrentNodeIfNoComments();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static String removeHeader(String paramString, YamlConfigurationOptions paramYamlConfigurationOptions) {
    long l = b ^ 0x34FF2B78D3BFL;
    String str = paramYamlConfigurationOptions.headerFormatter().dump(paramYamlConfigurationOptions.header());
    try {
      if (str != null && !str.isEmpty()) {
        boolean bool = str.endsWith("\n\n");
        if (bool)
          paramString = paramString + '\n'; 
        paramString = paramString.replaceFirst(Pattern.quote(str), "");
        if (paramString.isEmpty()) {
          paramString = null;
        } else if (bool) {
          paramString = paramString.substring(0, paramString.length() - 1);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramString;
  }
  
  public void processLine() throws IOException {
    try {
      if (isBlank()) {
        appendLine();
      } else {
        try {
          if (isComment()) {
            appendCommentLine();
          } else {
            track();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public String readLine() throws IOException {
    return this.reader.readLine();
  }
  
  public void appendCommentLine() {
    try {
      trackSideCommentBelow();
      if (isExplicit()) {
        this.explicitNotation.addComment(this.currentLine);
      } else {
        try {
          if (this.blockComment == null) {
            this.blockComment = new StringBuilder(this.currentLine);
          } else {
            try {
              if (this.blockCommentStarted)
                this.blockComment.append('\n'); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            this.blockComment.append(this.currentLine);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.blockCommentStarted = true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void appendLine() {
    try {
      if (!isExplicit()) {
        try {
          if (this.blockComment == null)
            this.blockComment = new StringBuilder(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.blockComment.append('\n');
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void parse() throws IOException {
    try {
      while (nextLine())
        processLine(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    track();
    close();
  }
  
  public YamlCommentParser(YamlConfigurationOptions paramYamlConfigurationOptions, Reader paramReader) {
    super(paramYamlConfigurationOptions);
    Validate.notNull(paramReader, "Reader is null!");
    this.reader = (paramReader instanceof BufferedReader) ? (BufferedReader)paramReader : new BufferedReader(paramReader);
  }
  
  public KeyTree$Node track() throws IOException {
    trackSideCommentBelow();
    this.currentNode = super.track();
    trackBlockComment(this.currentNode);
    trackSideComment(this.currentNode);
    return this.currentNode;
  }
  
  public void processMultiline(boolean paramBoolean) {
    try {
      if (isExplicit())
        try {
          if (isComment())
            this.explicitNotation.addComment(this.currentLine.substring(this.position)); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void trackBlockCommentExplicit(KeyTree$Node paramKeyTree$Node) {
    String str1 = trackBlockComment(paramKeyTree$Node);
    String str2 = this.explicitNotation.getKeyComment();
    try {
      if (str2 != null) {
        if (str1 == null)
          str1 = paramKeyTree$Node.getComment(); 
        if (str1 == null) {
          str1 = str2;
        } else {
          str1 = str1 + '\n' + str2;
        } 
        setRawComment(paramKeyTree$Node, str1, CommentType.BLOCK);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void setSideComment(KeyTree$Node paramKeyTree$Node, String paramString) {
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty() && !isSpace(paramString.charAt(0)))
            paramString = " " + paramString; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    setRawComment(paramKeyTree$Node, paramString, CommentType.SIDE);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */