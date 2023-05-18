package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;

public abstract class YamlCommentReader extends YamlCommentMapper implements Closeable {
  public String currentLine;
  
  public KeyTree$Node currentNode;
  
  public String key;
  
  public boolean isLiteral = false;
  
  public boolean isEscaping = false;
  
  public int indent;
  
  public YamlCommentReader$ReaderStage stage = YamlCommentReader$ReaderStage.START;
  
  public String trim;
  
  public int position = -1;
  
  public boolean isListElement = false;
  
  public KeyTree$Node currentList;
  
  public char currentChar;
  
  public boolean beginExplicit = false;
  
  public YamlCommentReader$ReadingQuoteStyle quoteNotation = YamlCommentReader$ReadingQuoteStyle.NONE;
  
  public YamlCommentReader$ReadingExplicitStyle explicitNotation;
  
  private static final long c = o3.a(8496732405511704350L, -7059832718246952136L, MethodHandles.lookup().lookupClass()).a(141467293434625L);
  
  public void endExplicitNotation() throws IOException {
    try {
      if (isExplicit()) {
        this.explicitNotation.finish();
        this.currentNode = this.explicitNotation.getNode();
        endExplicitBlock();
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    this.explicitNotation = null;
  }
  
  public boolean isSectionEnd() {
    try {
      if (this.currentNode != null)
        try {
          if (this.indent <= this.currentNode.getIndentation() - options().indent());
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public boolean isExplicitChar() {
    try {
      if (this.currentChar == '?')
        try {
          if (nextIsSpace()) {
            this.beginExplicit = true;
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (isExplicit())
        try {
          if (this.currentChar == ':')
            try {
              if (nextIsSpace()) {
                this.explicitNotation.valueStep();
                return true;
              } 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public void processMultiline(boolean paramBoolean) throws IOException {}
  
  public final boolean nextIsSpace() {
    try {
      if (hasNext())
        try {
          if (isSpace(peek(1)));
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public void readValueMultiline() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual nextLine : ()Z
    //   9: ifeq -> 106
    //   12: aload_0
    //   13: invokevirtual isExplicit : ()Z
    //   16: ifeq -> 43
    //   19: goto -> 26
    //   22: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   30: invokevirtual isValue : ()Z
    //   33: ifeq -> 106
    //   36: goto -> 43
    //   39: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_1
    //   44: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.LITERAL : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   47: if_acmpne -> 72
    //   50: goto -> 57
    //   53: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   61: aload_1
    //   62: if_acmpne -> 80
    //   65: goto -> 72
    //   68: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: iconst_1
    //   73: goto -> 81
    //   76: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: iconst_0
    //   81: istore_2
    //   82: aload_0
    //   83: iload_2
    //   84: invokevirtual processMultiline : (Z)V
    //   87: iload_2
    //   88: ifeq -> 102
    //   91: aload_0
    //   92: invokevirtual readValue : ()V
    //   95: goto -> 106
    //   98: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: invokevirtual processLine : ()V
    //   106: return
    // Exception table:
    //   from	to	target	type
    //   5	19	22	java/io/IOException
    //   12	36	39	java/io/IOException
    //   26	50	53	java/io/IOException
    //   43	65	68	java/io/IOException
    //   57	76	76	java/io/IOException
    //   82	98	98	java/io/IOException
  }
  
  public void checkSpecialLines(boolean paramBoolean, int paramInt) throws IOException {
    // Byte code:
    //   0: iload_1
    //   1: ifeq -> 86
    //   4: aload_0
    //   5: getfield isLiteral : Z
    //   8: ifeq -> 86
    //   11: goto -> 18
    //   14: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   17: athrow
    //   18: aload_0
    //   19: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   22: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.LITERAL : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   25: if_acmpeq -> 49
    //   28: goto -> 35
    //   31: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.LITERAL : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   39: putfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   42: goto -> 91
    //   45: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: iload_2
    //   50: aload_0
    //   51: getfield indent : I
    //   54: if_icmpgt -> 91
    //   57: aload_0
    //   58: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.NONE : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   61: putfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield isLiteral : Z
    //   69: aload_0
    //   70: iload_2
    //   71: putfield indent : I
    //   74: aload_0
    //   75: invokevirtual checkSpecialChars : ()Z
    //   78: pop
    //   79: goto -> 91
    //   82: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: iload_2
    //   88: putfield indent : I
    //   91: aload_0
    //   92: getfield beginExplicit : Z
    //   95: ifeq -> 127
    //   98: aload_0
    //   99: iconst_0
    //   100: putfield beginExplicit : Z
    //   103: aload_0
    //   104: invokevirtual endExplicitNotation : ()V
    //   107: aload_0
    //   108: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle
    //   111: dup
    //   112: aload_0
    //   113: iload_2
    //   114: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader;I)V
    //   117: putfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   120: goto -> 197
    //   123: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload_0
    //   128: invokevirtual isExplicit : ()Z
    //   131: ifeq -> 197
    //   134: aload_0
    //   135: invokevirtual isBlank : ()Z
    //   138: ifne -> 197
    //   141: goto -> 148
    //   144: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: iload_2
    //   149: aload_0
    //   150: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   153: invokevirtual getIndentation : ()I
    //   156: if_icmpgt -> 197
    //   159: goto -> 166
    //   162: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload_0
    //   167: getfield trim : Ljava/lang/String;
    //   170: iconst_0
    //   171: invokevirtual charAt : (I)C
    //   174: bipush #58
    //   176: if_icmpeq -> 197
    //   179: goto -> 186
    //   182: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload_0
    //   187: invokevirtual endExplicitNotation : ()V
    //   190: goto -> 197
    //   193: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: aload_0
    //   198: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   201: ifnull -> 255
    //   204: aload_0
    //   205: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   208: invokevirtual getIndentation : ()I
    //   211: istore_3
    //   212: iload_2
    //   213: iload_3
    //   214: if_icmplt -> 243
    //   217: aload_0
    //   218: getfield isListElement : Z
    //   221: ifne -> 255
    //   224: goto -> 231
    //   227: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: iload_2
    //   232: iload_3
    //   233: if_icmpne -> 255
    //   236: goto -> 243
    //   239: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: aload_0
    //   244: aconst_null
    //   245: putfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   248: goto -> 255
    //   251: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: return
    // Exception table:
    //   from	to	target	type
    //   0	11	14	java/io/IOException
    //   4	28	31	java/io/IOException
    //   18	45	45	java/io/IOException
    //   49	82	82	java/io/IOException
    //   91	123	123	java/io/IOException
    //   127	141	144	java/io/IOException
    //   134	159	162	java/io/IOException
    //   148	179	182	java/io/IOException
    //   166	190	193	java/io/IOException
    //   212	224	227	java/io/IOException
    //   217	236	239	java/io/IOException
    //   231	248	251	java/io/IOException
  }
  
  public boolean isComment() {
    try {
      if (this.stage == YamlCommentReader$ReaderStage.COMMENT)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (this.currentChar == '#')
        try {
          if (canStartComment()) {
            this.stage = YamlCommentReader$ReaderStage.COMMENT;
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public KeyTree$Node track() throws IOException {
    try {
      if (this.quoteNotation == YamlCommentReader$ReadingQuoteStyle.LITERAL)
        return null; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (isExplicit())
        return trackExplicit(); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      this.key = readKey();
      if (this.isListElement) {
        trackListElement();
      } else {
        track(this.indent, this.key);
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return this.currentNode;
  }
  
  public void readValue() throws IOException {
    boolean bool = hasChar();
    try {
      if (bool) {
        try {
          if (this.stage != YamlCommentReader$ReaderStage.QUOTE_CLOSE)
            this.stage = YamlCommentReader$ReaderStage.VALUE; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (this.quoteNotation == YamlCommentReader$ReadingQuoteStyle.LITERAL) {
            skipToEnd();
          } else {
            try {
              if (!isComment())
                while (true) {
                  try {
                    if (bool && !isComment()) {
                      bool = nextChar();
                      continue;
                    } 
                  } catch (IOException iOException) {
                    throw c(null);
                  } 
                  break;
                }  
            } catch (IOException iOException) {
              throw c(null);
            } 
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (isMultiline())
        readValueMultiline(); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (isComment())
        while (true) {
          try {
            if (this.position > 0)
              try {
                if (isSpace(peek(-1))) {
                  this.position--;
                  continue;
                } 
              } catch (IOException iOException) {
                throw c(null);
              }  
          } catch (IOException iOException) {
            throw c(null);
          } 
          break;
        }  
    } catch (IOException iOException) {
      throw c(null);
    } 
  }
  
  public int readIndent() {
    return readIndent(true);
  }
  
  public void processLine() throws IOException {}
  
  public void readKeyMultiline(StringBuilder paramStringBuilder) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   4: astore_2
    //   5: aload_0
    //   6: invokevirtual nextLine : ()Z
    //   9: ifeq -> 144
    //   12: aload_0
    //   13: invokevirtual isExplicit : ()Z
    //   16: ifeq -> 43
    //   19: goto -> 26
    //   22: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   30: invokevirtual isKey : ()Z
    //   33: ifeq -> 144
    //   36: goto -> 43
    //   39: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_2
    //   44: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.LITERAL : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   47: if_acmpne -> 72
    //   50: goto -> 57
    //   53: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   61: aload_2
    //   62: if_acmpne -> 80
    //   65: goto -> 72
    //   68: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: iconst_1
    //   73: goto -> 81
    //   76: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: iconst_0
    //   81: istore_3
    //   82: aload_0
    //   83: iload_3
    //   84: invokevirtual processMultiline : (Z)V
    //   87: iload_3
    //   88: ifeq -> 140
    //   91: aload_0
    //   92: invokevirtual readKey : ()Ljava/lang/String;
    //   95: astore #4
    //   97: aload #4
    //   99: ifnull -> 137
    //   102: aload_1
    //   103: invokevirtual length : ()I
    //   106: ifle -> 130
    //   109: goto -> 116
    //   112: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload_1
    //   117: bipush #32
    //   119: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: goto -> 130
    //   126: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: aload_1
    //   131: aload #4
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: goto -> 144
    //   140: aload_0
    //   141: invokevirtual processLine : ()V
    //   144: return
    // Exception table:
    //   from	to	target	type
    //   5	19	22	java/io/IOException
    //   12	36	39	java/io/IOException
    //   26	50	53	java/io/IOException
    //   43	65	68	java/io/IOException
    //   57	76	76	java/io/IOException
    //   97	109	112	java/io/IOException
    //   102	123	126	java/io/IOException
  }
  
  public KeyTree$Node trackExplicit() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   4: invokevirtual isKey : ()Z
    //   7: istore_1
    //   8: iload_1
    //   9: ifeq -> 34
    //   12: aload_0
    //   13: getfield isListElement : Z
    //   16: ifeq -> 34
    //   19: goto -> 26
    //   22: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: iconst_1
    //   27: goto -> 35
    //   30: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: iconst_0
    //   35: istore_2
    //   36: aload_0
    //   37: aload_0
    //   38: invokevirtual readKey : ()Ljava/lang/String;
    //   41: putfield key : Ljava/lang/String;
    //   44: iload_1
    //   45: ifeq -> 83
    //   48: aload_0
    //   49: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   52: aload_0
    //   53: getfield key : Ljava/lang/String;
    //   56: iload_2
    //   57: invokevirtual addKey : (Ljava/lang/String;Z)V
    //   60: aload_0
    //   61: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   64: invokevirtual isKey : ()Z
    //   67: ifeq -> 83
    //   70: goto -> 77
    //   73: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aconst_null
    //   78: areturn
    //   79: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: aload_0
    //   85: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   88: invokevirtual track : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   91: putfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   94: iload_1
    //   95: ifne -> 123
    //   98: aload_0
    //   99: getfield isListElement : Z
    //   102: ifeq -> 123
    //   105: goto -> 112
    //   108: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload_0
    //   113: invokevirtual trackListElement : ()V
    //   116: goto -> 123
    //   119: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: getfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   127: areturn
    // Exception table:
    //   from	to	target	type
    //   8	19	22	java/io/IOException
    //   12	30	30	java/io/IOException
    //   36	70	73	java/io/IOException
    //   48	79	79	java/io/IOException
    //   83	105	108	java/io/IOException
    //   98	116	119	java/io/IOException
  }
  
  public boolean canStartComment() {
    try {
      if (this.position != 0)
        try {
          if (this.stage != YamlCommentReader$ReaderStage.QUOTE_CLOSE) {
            try {
              if (!isInQuote())
                try {
                  if (this.position > 0)
                    try {
                      if (isSpace(peek(-1)));
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
            return false;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public boolean canStartSpecialIndent(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield stage : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   4: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage.NEW_LINE : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   7: if_acmpne -> 67
    //   10: aload_0
    //   11: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   14: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.NONE : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   17: if_acmpeq -> 59
    //   20: goto -> 27
    //   23: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   31: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.LITERAL : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   34: if_acmpne -> 67
    //   37: goto -> 44
    //   40: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: iload_1
    //   45: aload_0
    //   46: getfield indent : I
    //   49: if_icmpgt -> 67
    //   52: goto -> 59
    //   55: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: iconst_1
    //   60: goto -> 68
    //   63: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: iconst_0
    //   68: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	20	23	java/lang/RuntimeException
    //   10	37	40	java/lang/RuntimeException
    //   27	52	55	java/lang/RuntimeException
    //   44	63	63	java/lang/RuntimeException
  }
  
  public boolean hasChar() {
    try {
      if (this.stage != YamlCommentReader$ReaderStage.END_OF_LINE)
        try {
          if (this.stage != YamlCommentReader$ReaderStage.END_OF_FILE);
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public boolean isBlank() {
    return this.trim.isEmpty();
  }
  
  public KeyTree$Node track(int paramInt, String paramString) {
    KeyTree$Node keyTree$Node = this.keyTree.findParent(paramInt);
    this.currentNode = keyTree$Node.add(paramInt, paramString);
    return this.currentNode;
  }
  
  public String toString() {
    long l = c ^ 0x5C1348D1A381L;
    return "YamlCommentReader{currentLine='" + this.currentLine + '\'' + ", trim='" + this.trim + '\'' + ", stage=" + this.stage + ", indent=" + this.indent + ", key='" + this.key + '\'' + ", position=" + this.position + ", currentChar=" + this.currentChar + ", isEscaping=" + this.isEscaping + ", isLiteral=" + this.isLiteral + ", quoteNotation=" + this.quoteNotation + ", explicit= " + this.explicitNotation + ", keyTree=" + this.keyTree + '}';
  }
  
  public void readTag() {
    try {
      readIndent(false);
      if (hasChar())
        try {
          if (this.currentChar == '!')
            try {
              if (hasNext())
                try {
                  if (peek(1) == '!') {
                    nextChar();
                    try {
                      while (nextChar()) {
                        try {
                          if (!isSpace(this.currentChar));
                        } catch (RuntimeException runtimeException) {
                          throw c(null);
                        } 
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                    readIndent(false);
                  } 
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw c(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public void endExplicitBlock() throws IOException {}
  
  public boolean nextChar() {
    try {
      if (hasNext()) {
        this.position++;
        this.currentChar = this.currentLine.charAt(this.position);
        return checkSpecialChars();
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    this.stage = YamlCommentReader$ReaderStage.END_OF_LINE;
    return false;
  }
  
  public boolean isLiteralChar() {
    try {
      if (this.currentChar != '|') {
        try {
          if (this.currentChar == '>');
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public YamlCommentReader(YamlConfigurationOptions paramYamlConfigurationOptions) {
    super(paramYamlConfigurationOptions);
  }
  
  public void clearCurrentNode() {
    clearNode(this.currentNode);
    this.currentNode = null;
  }
  
  public void inQuote(YamlCommentReader$ReadingQuoteStyle paramYamlCommentReader$ReadingQuoteStyle) {
    try {
      this.quoteNotation = paramYamlCommentReader$ReadingQuoteStyle;
      if (hasChar())
        try {
          if (paramYamlCommentReader$ReadingQuoteStyle == YamlCommentReader$ReadingQuoteStyle.NONE) {
            this.stage = YamlCommentReader$ReaderStage.QUOTE_CLOSE;
          } else {
            this.stage = YamlCommentReader$ReaderStage.QUOTE_OPEN;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public boolean hasNext() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return (this.position + 1 < this.currentLine.length());
  }
  
  public char peek(int paramInt) {
    return this.currentLine.charAt(this.position + paramInt);
  }
  
  public void clearCurrentNodeIfNoComments() {
    clearNodeIfNoComments(this.currentNode);
    this.currentNode = null;
  }
  
  public final boolean isMultiline() {
    try {
      if (!hasChar())
        try {
          if (isInQuote());
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  public boolean checkSpecialChars() {
    try {
      if (this.quoteNotation == YamlCommentReader$ReadingQuoteStyle.NONE) {
        try {
          if (!this.isLiteral) {
            try {
              if (this.stage != YamlCommentReader$ReaderStage.NEW_LINE) {
                try {
                  if (this.stage == YamlCommentReader$ReaderStage.AFTER_KEY) {
                    try {
                      if (this.currentChar == YamlCommentReader$ReadingQuoteStyle.SINGLE.getChar()) {
                        inQuote(YamlCommentReader$ReadingQuoteStyle.SINGLE);
                        return nextChar();
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                    try {
                      if (this.currentChar == YamlCommentReader$ReadingQuoteStyle.DOUBLE.getChar()) {
                        inQuote(YamlCommentReader$ReadingQuoteStyle.DOUBLE);
                        return nextChar();
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                    try {
                      if (isLiteralChar())
                        this.isLiteral = true; 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                    return true;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                return true;
              } 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
          } else {
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      } else {
        try {
          if (this.quoteNotation == YamlCommentReader$ReadingQuoteStyle.SINGLE) {
            try {
              if (!this.isEscaping) {
                if (this.currentChar == this.quoteNotation.getChar()) {
                  this.isEscaping = true;
                  boolean bool = nextChar();
                  try {
                    if (bool) {
                      try {
                        if (this.currentChar != this.quoteNotation.getChar()) {
                          inQuote(YamlCommentReader$ReadingQuoteStyle.NONE);
                          this.isEscaping = false;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw c(null);
                      } 
                      return bool;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  } 
                } else {
                  return true;
                } 
              } else {
                this.isEscaping = false;
                return true;
              } 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
          } else {
            try {
              if (this.quoteNotation == YamlCommentReader$ReadingQuoteStyle.DOUBLE)
                try {
                  if (!this.isEscaping) {
                    try {
                      if (this.currentChar == this.quoteNotation.getChar()) {
                        inQuote(YamlCommentReader$ReadingQuoteStyle.NONE);
                        return nextChar();
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                    try {
                      if (this.currentChar == '\\') {
                        this.isEscaping = true;
                        return nextChar();
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                  } else {
                    this.isEscaping = false;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        inQuote(YamlCommentReader$ReadingQuoteStyle.NONE);
        this.isEscaping = false;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (this.currentChar == YamlCommentReader$ReadingQuoteStyle.SINGLE.getChar()) {
        inQuote(YamlCommentReader$ReadingQuoteStyle.SINGLE);
        return nextChar();
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (this.currentChar == YamlCommentReader$ReadingQuoteStyle.DOUBLE.getChar()) {
        inQuote(YamlCommentReader$ReadingQuoteStyle.DOUBLE);
        return nextChar();
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (isLiteralChar())
        this.isLiteral = true; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return true;
  }
  
  public int readIndent(boolean paramBoolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokevirtual nextChar : ()Z
    //   6: ifeq -> 136
    //   9: aload_0
    //   10: getfield stage : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   13: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage.QUOTE_OPEN : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   16: if_acmpeq -> 136
    //   19: goto -> 26
    //   22: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: getfield currentChar : C
    //   30: invokestatic isSpace : (C)Z
    //   33: ifeq -> 53
    //   36: goto -> 43
    //   39: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: iinc #2, 1
    //   46: goto -> 2
    //   49: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: iload_1
    //   54: ifeq -> 136
    //   57: aload_0
    //   58: iload_2
    //   59: invokevirtual canStartSpecialIndent : (I)Z
    //   62: ifeq -> 136
    //   65: goto -> 72
    //   68: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_0
    //   73: invokevirtual isListChar : ()Z
    //   76: ifne -> 100
    //   79: goto -> 86
    //   82: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: invokevirtual isExplicitChar : ()Z
    //   90: ifeq -> 136
    //   93: goto -> 100
    //   96: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: invokevirtual nextChar : ()Z
    //   104: pop
    //   105: aload_0
    //   106: aload_0
    //   107: getfield isListElement : Z
    //   110: ifne -> 128
    //   113: goto -> 120
    //   116: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: iconst_1
    //   121: goto -> 129
    //   124: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: iconst_0
    //   129: invokevirtual readIndent : (Z)I
    //   132: pop
    //   133: goto -> 136
    //   136: iload_2
    //   137: ireturn
    // Exception table:
    //   from	to	target	type
    //   2	19	22	java/lang/RuntimeException
    //   9	36	39	java/lang/RuntimeException
    //   26	49	49	java/lang/RuntimeException
    //   53	65	68	java/lang/RuntimeException
    //   57	79	82	java/lang/RuntimeException
    //   72	93	96	java/lang/RuntimeException
    //   86	113	116	java/lang/RuntimeException
    //   100	124	124	java/lang/RuntimeException
  }
  
  public boolean isSectionKey() {
    try {
      if (this.currentChar == ':') {
        try {
          if (this.stage != YamlCommentReader$ReaderStage.KEY) {
            try {
              if (this.stage == YamlCommentReader$ReaderStage.QUOTE_CLOSE) {
                try {
                  if (hasNext()) {
                    try {
                      if (isSpace(peek(1))) {
                        nextChar();
                        this.stage = YamlCommentReader$ReaderStage.AFTER_KEY;
                        readTag();
                        return true;
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw c(null);
                    } 
                    return false;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                return true;
              } 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
            return false;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (hasNext()) {
        try {
          if (isSpace(peek(1))) {
            nextChar();
            this.stage = YamlCommentReader$ReaderStage.AFTER_KEY;
            readTag();
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return true;
  }
  
  public String readKey() throws IOException {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual hasChar : ()Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 277
    //   11: aload_0
    //   12: invokevirtual hasKey : ()Z
    //   15: ifeq -> 277
    //   18: goto -> 25
    //   21: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: new java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore_3
    //   33: aload_0
    //   34: invokevirtual isInQuote : ()Z
    //   37: istore #4
    //   39: aload_0
    //   40: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage.KEY : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   43: putfield stage : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   46: aload_0
    //   47: getfield isLiteral : Z
    //   50: ifeq -> 75
    //   53: aload_0
    //   54: invokevirtual isExplicit : ()Z
    //   57: ifeq -> 75
    //   60: goto -> 67
    //   63: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: iconst_1
    //   68: goto -> 76
    //   71: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: iconst_0
    //   76: istore #5
    //   78: aload_0
    //   79: getfield quoteNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   82: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle.LITERAL : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingQuoteStyle;
    //   85: if_acmpne -> 115
    //   88: aload_3
    //   89: aload_0
    //   90: getfield currentLine : Ljava/lang/String;
    //   93: aload_0
    //   94: getfield position : I
    //   97: invokevirtual substring : (I)Ljava/lang/String;
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_0
    //   105: invokevirtual skipToEnd : ()V
    //   108: goto -> 231
    //   111: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: iload #5
    //   117: ifeq -> 165
    //   120: aload_0
    //   121: invokevirtual isLiteralChar : ()Z
    //   124: ifeq -> 146
    //   127: goto -> 134
    //   130: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: invokevirtual nextChar : ()Z
    //   138: pop
    //   139: goto -> 146
    //   142: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_0
    //   147: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage.COMMENT : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   150: putfield stage : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   153: aload_0
    //   154: iconst_1
    //   155: invokevirtual processMultiline : (Z)V
    //   158: aload_0
    //   159: invokevirtual skipToEnd : ()V
    //   162: goto -> 231
    //   165: iload_2
    //   166: ifeq -> 231
    //   169: aload_0
    //   170: invokevirtual isSectionKey : ()Z
    //   173: ifne -> 231
    //   176: goto -> 183
    //   179: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_0
    //   184: getfield stage : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   187: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage.QUOTE_CLOSE : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReaderStage;
    //   190: if_acmpeq -> 231
    //   193: goto -> 200
    //   196: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload_0
    //   201: invokevirtual isComment : ()Z
    //   204: ifne -> 231
    //   207: goto -> 214
    //   210: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_3
    //   215: aload_0
    //   216: getfield currentChar : C
    //   219: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload_0
    //   224: invokevirtual nextChar : ()Z
    //   227: istore_2
    //   228: goto -> 165
    //   231: iload #5
    //   233: ifne -> 250
    //   236: aload_0
    //   237: invokevirtual isMultiline : ()Z
    //   240: ifeq -> 262
    //   243: goto -> 250
    //   246: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   249: athrow
    //   250: aload_0
    //   251: aload_3
    //   252: invokevirtual readKeyMultiline : (Ljava/lang/StringBuilder;)V
    //   255: goto -> 262
    //   258: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: aload_3
    //   263: invokevirtual toString : ()Ljava/lang/String;
    //   266: astore_1
    //   267: iload #4
    //   269: ifne -> 277
    //   272: aload_1
    //   273: invokevirtual trim : ()Ljava/lang/String;
    //   276: astore_1
    //   277: aload_1
    //   278: areturn
    // Exception table:
    //   from	to	target	type
    //   7	18	21	java/io/IOException
    //   39	60	63	java/io/IOException
    //   53	71	71	java/io/IOException
    //   78	111	111	java/io/IOException
    //   115	127	130	java/io/IOException
    //   120	139	142	java/io/IOException
    //   165	176	179	java/io/IOException
    //   169	193	196	java/io/IOException
    //   183	207	210	java/io/IOException
    //   231	243	246	java/io/IOException
    //   236	255	258	java/io/IOException
  }
  
  public boolean isInQuote() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return (this.quoteNotation != YamlCommentReader$ReadingQuoteStyle.NONE);
  }
  
  public synchronized boolean nextLine() throws IOException {
    this.currentLine = readLine();
    this.position = -1;
    this.currentChar = Character.MIN_VALUE;
    this.isListElement = false;
    if (this.currentLine != null) {
      this.stage = YamlCommentReader$ReaderStage.NEW_LINE;
      boolean bool = this.isLiteral;
      int i = readIndent();
      this.trim = this.currentLine.substring(i).trim();
      checkSpecialLines(bool, i);
      return true;
    } 
    this.indent = 0;
    this.trim = null;
    this.stage = YamlCommentReader$ReaderStage.END_OF_FILE;
    endExplicitNotation();
    return false;
  }
  
  public void trackListElement() {
    // Byte code:
    //   0: aload_0
    //   1: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   4: ifnull -> 42
    //   7: aload_0
    //   8: getfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   11: ifnull -> 108
    //   14: goto -> 21
    //   17: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: getfield indent : I
    //   25: aload_0
    //   26: getfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   29: getfield indent : I
    //   32: if_icmple -> 108
    //   35: goto -> 42
    //   38: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: aload_0
    //   44: getfield keyTree : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree;
    //   47: aload_0
    //   48: getfield indent : I
    //   51: iconst_2
    //   52: iadd
    //   53: invokevirtual findParent : (I)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   56: putfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   59: aload_0
    //   60: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   63: getfield listSize : Ljava/lang/Integer;
    //   66: ifnull -> 93
    //   69: goto -> 76
    //   72: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload_0
    //   77: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   80: invokevirtual size : ()I
    //   83: ifne -> 108
    //   86: goto -> 93
    //   89: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_0
    //   94: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   97: iconst_0
    //   98: invokevirtual isList : (I)V
    //   101: goto -> 108
    //   104: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: invokevirtual isExplicit : ()Z
    //   112: ifeq -> 158
    //   115: aload_0
    //   116: getfield indent : I
    //   119: aload_0
    //   120: getfield explicitNotation : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/YamlCommentReader$ReadingExplicitStyle;
    //   123: invokevirtual getIndentation : ()I
    //   126: if_icmpne -> 158
    //   129: goto -> 136
    //   132: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   135: athrow
    //   136: aload_0
    //   137: aload_0
    //   138: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   141: aload_0
    //   142: getfield key : Ljava/lang/String;
    //   145: invokevirtual add : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   148: putfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   151: goto -> 177
    //   154: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_0
    //   159: aload_0
    //   160: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   163: aload_0
    //   164: getfield indent : I
    //   167: aload_0
    //   168: getfield key : Ljava/lang/String;
    //   171: invokevirtual add : (ILjava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   174: putfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   177: aload_0
    //   178: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   181: aload_0
    //   182: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   185: getfield listSize : Ljava/lang/Integer;
    //   188: invokevirtual intValue : ()I
    //   191: iconst_1
    //   192: iadd
    //   193: invokevirtual isList : (I)V
    //   196: aload_0
    //   197: getfield currentNode : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   200: aload_0
    //   201: getfield currentList : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   204: getfield listSize : Ljava/lang/Integer;
    //   207: invokevirtual intValue : ()I
    //   210: iconst_1
    //   211: isub
    //   212: invokevirtual setElementIndex : (I)V
    //   215: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/RuntimeException
    //   7	35	38	java/lang/RuntimeException
    //   21	69	72	java/lang/RuntimeException
    //   42	86	89	java/lang/RuntimeException
    //   76	101	104	java/lang/RuntimeException
    //   108	129	132	java/lang/RuntimeException
    //   115	154	154	java/lang/RuntimeException
  }
  
  public abstract String readLine() throws IOException;
  
  public boolean hasKey() {
    try {
      if (isExplicit()) {
        try {
          if (!this.explicitNotation.isKey()) {
            try {
              if (YamlCommentReader$ReadingExplicitStyle.access$000(this.explicitNotation));
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
            return false;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        return !this.isLiteral;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public void skipToEnd() {
    this.position = this.currentLine.length() - 1;
    this.currentChar = peek(0);
    nextChar();
  }
  
  public boolean isExplicit() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return (this.explicitNotation != null);
  }
  
  public static boolean isSpace(char paramChar) {
    try {
      if (paramChar != ' ') {
        try {
          if (paramChar == '\t');
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public boolean isListChar() {
    try {
      if (this.currentChar == '-') {
        this.isListElement = nextIsSpace();
        return this.isListElement;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return false;
  }
  
  private static Exception c(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */