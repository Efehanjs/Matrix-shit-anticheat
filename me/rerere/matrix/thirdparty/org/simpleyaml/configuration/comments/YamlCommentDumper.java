package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.DumperBus;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public class YamlCommentDumper extends YamlCommentReader {
  public KeyTree$Node commentNodeFallback;
  
  public final YamlCommentMapper yamlCommentMapper;
  
  public KeyTree$Node firstListMapElement;
  
  public BufferedWriter writer;
  
  public StringWriter explicitBlock;
  
  public KeyTree$Node commentNode;
  
  public final DumperBus bus;
  
  public void appendBlockComment() throws IOException {
    String str = null;
    if (this.commentNode != null)
      str = this.commentNode.getComment(); 
    try {
      if (str == null && this.commentNodeFallback != null)
        str = this.commentNodeFallback.getComment(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      appendBlockComment(str);
      if (this.firstListMapElement != null)
        appendBlockComment(this.firstListMapElement.getComment()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.explicitBlock != null) {
        this.writer.write(this.explicitBlock.toString());
        this.writer.newLine();
        this.explicitBlock = null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void skipMultiline() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual hasChar : ()Z
    //   4: ifeq -> 29
    //   7: aload_0
    //   8: invokevirtual nextChar : ()Z
    //   11: ifeq -> 29
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: iconst_0
    //   30: istore_1
    //   31: iload_1
    //   32: ifeq -> 43
    //   35: aload_0
    //   36: invokevirtual nextChar : ()Z
    //   39: istore_1
    //   40: goto -> 31
    //   43: aload_0
    //   44: invokevirtual isMultiline : ()Z
    //   47: ifeq -> 61
    //   50: aload_0
    //   51: invokevirtual readValueMultiline : ()V
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/io/IOException
    //   7	25	25	java/io/IOException
    //   43	54	57	java/io/IOException
  }
  
  public void checkFirstListMapElement(KeyTree$Node paramKeyTree$Node1, KeyTree$Node paramKeyTree$Node2) {
    KeyTree$Node keyTree$Node = paramKeyTree$Node1.getFirst();
    Integer integer = keyTree$Node.getElementIndex();
    if (integer == null) {
      String str = keyTree$Node.getName();
      try {
        if (str != null)
          try {
            if (str.equals(paramKeyTree$Node2.getName()))
              this.firstListMapElement = keyTree$Node; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } else {
      try {
        if (integer.intValue() == 0)
          this.firstListMapElement = keyTree$Node; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public YamlCommentDumper(YamlCommentMapper paramYamlCommentMapper, DumperBus.Dumper paramDumper, Writer paramWriter) {
    super(paramYamlCommentMapper.options());
    this.yamlCommentMapper = paramYamlCommentMapper;
    this.writer = (paramWriter instanceof BufferedWriter) ? (BufferedWriter)paramWriter : new BufferedWriter(paramWriter);
    this.bus = new DumperBus(paramDumper);
  }
  
  public void appendSideComment() throws IOException {
    String str = null;
    if (this.commentNode != null)
      str = this.commentNode.getSideComment(); 
    try {
      if (str == null && this.firstListMapElement != null)
        str = this.firstListMapElement.getSideComment(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (str == null && this.commentNodeFallback != null)
        str = this.commentNodeFallback.getSideComment(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      readValue();
      if (str != null)
        try {
          if (!str.isEmpty())
            try {
              if (this.isLiteral) {
                appendSideCommentLiteral(str);
              } else {
                this.writer.write(str);
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void appendBlockComment(String paramString) throws IOException {
    try {
      if (paramString != null)
        try {
          this.writer.write(paramString);
          if (!paramString.endsWith("\n"))
            this.writer.newLine(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void close() throws IOException {
    this.writer.close();
  }
  
  public void processLine() throws IOException {
    clearSection();
    getCommentNode(track());
    appendBlockComment();
    this.writer.write(this.currentLine);
    appendSideComment();
  }
  
  public void appendSideCommentLiteral(String paramString) throws IOException {
    String[] arrayOfString = StringUtils.splitNewLines(paramString, 2);
    try {
      this.writer.write(arrayOfString[0]);
      if (arrayOfString.length > 1)
        try {
          if (nextLine()) {
            this.writer.newLine();
            this.writer.write(this.currentLine);
            while (true) {
              try {
                if (nextLine())
                  try {
                    if (this.isLiteral) {
                      this.writer.newLine();
                      this.writer.write(this.currentLine);
                      continue;
                    } 
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              } 
              break;
            } 
            try {
              this.writer.newLine();
              this.writer.write(arrayOfString[1]);
              if (this.stage != YamlCommentReader$ReaderStage.END_OF_FILE) {
                this.writer.newLine();
                processLine();
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void dump() throws IOException {
    this.bus.dump();
    try {
      while (nextLine()) {
        processLine();
        this.writer.newLine();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    clearSection();
    this.commentNode = getNode((String)null);
    appendBlockComment();
    close();
  }
  
  public void clearSection() {
    try {
      this.commentNode = this.commentNodeFallback = this.firstListMapElement = null;
      if (isSectionEnd())
        clearCurrentNode(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void getCommentNode(KeyTree$Node paramKeyTree$Node) {
    try {
      if (paramKeyTree$Node != null) {
        try {
          this.commentNode = getNode(paramKeyTree$Node.getPath());
          if (this.commentNode != null)
            try {
              if (this.commentNode.parent != null)
                try {
                  if (this.commentNode.parent.isList)
                    try {
                      if (this.commentNode.size() == 1)
                        checkFirstListMapElement(this.commentNode, paramKeyTree$Node); 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
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
        try {
          if (this.commentNode != null)
            try {
              if (paramKeyTree$Node.name != null) {
                try {
                  if (this.commentNode.comment != null) {
                    try {
                      if (this.commentNode.sideComment == null) {
                        try {
                          if (paramKeyTree$Node.parent != null)
                            try {
                              if (paramKeyTree$Node.parent.isList)
                                try {
                                  if (paramKeyTree$Node.elementIndex != null)
                                    this.commentNodeFallback = getNode(paramKeyTree$Node.getPathWithName()); 
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                }  
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                        return;
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    return;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramKeyTree$Node.parent != null)
        try {
          if (paramKeyTree$Node.parent.isList)
            try {
              if (paramKeyTree$Node.elementIndex != null)
                this.commentNodeFallback = getNode(paramKeyTree$Node.getPathWithName()); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void readValue() throws IOException {
    try {
      if (hasChar()) {
        try {
          this.stage = YamlCommentReader$ReaderStage.VALUE;
          if (isInQuote())
            try {
              if (!this.isLiteral) {
                skipMultiline();
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        skipToEnd();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public KeyTree$Node getNode(String paramString) {
    return this.yamlCommentMapper.getPriorityNode(paramString);
  }
  
  public String readLine() throws IOException {
    return this.bus.await();
  }
  
  public void processMultiline(boolean paramBoolean) throws IOException {
    BufferedWriter bufferedWriter;
    try {
      if (isExplicit()) {
        try {
          if (this.explicitBlock == null)
            this.explicitBlock = new StringWriter(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        StringWriter stringWriter = this.explicitBlock;
      } else {
        bufferedWriter = this.writer;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.isLiteral)
        try {
          if (this.quoteNotation != YamlCommentReader$ReadingQuoteStyle.LITERAL) {
            bufferedWriter.write(this.currentLine);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      bufferedWriter.write(System.lineSeparator());
      if (paramBoolean)
        bufferedWriter.write(this.currentLine); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentDumper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */