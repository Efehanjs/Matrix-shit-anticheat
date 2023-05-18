package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner;

import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader.StreamReader;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.AliasToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.AnchorToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockEndToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockEntryToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockMappingStartToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockSequenceStartToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.DirectiveToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.DocumentEndToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.DocumentStartToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.FlowEntryToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.FlowMappingEndToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.FlowMappingStartToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.FlowSequenceEndToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.FlowSequenceStartToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.KeyToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.ScalarToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.StreamEndToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.StreamStartToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.TagToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.TagTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.ValueToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.ArrayStack;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.UriEncoder;

public final class ScannerImpl implements Scanner {
  private boolean parseComments;
  
  private int tokensTaken = 0;
  
  private final StreamReader reader;
  
  private Token lastToken;
  
  private final Map possibleSimpleKeys;
  
  public static final Map ESCAPE_REPLACEMENTS;
  
  private int flowLevel = 0;
  
  private final ArrayStack indents;
  
  private final LoaderOptions loaderOptions;
  
  public static final Map ESCAPE_CODES;
  
  private static final Pattern NOT_HEXA;
  
  private final List tokens;
  
  private boolean done = false;
  
  private boolean allowSimpleKey = true;
  
  private int indent = -1;
  
  private static final long a = o3.a(-1364979170318089288L, -3772181464577850847L, MethodHandles.lookup().lookupClass()).a(56106309899480L);
  
  public Token peekToken() {
    try {
      while (needMoreTokens())
        fetchMoreTokens(); 
    } catch (ScannerException scannerException) {
      throw a(null);
    } 
    return this.tokens.get(0);
  }
  
  public ScannerImpl(StreamReader paramStreamReader, LoaderOptions paramLoaderOptions) {
    this.parseComments = paramLoaderOptions.isProcessComments();
    this.reader = paramStreamReader;
    this.tokens = new ArrayList(100);
    this.indents = new ArrayStack(10);
    this.possibleSimpleKeys = new LinkedHashMap<>();
    this.loaderOptions = paramLoaderOptions;
    fetchStreamStart();
  }
  
  static {
    long l = a ^ 0x2618F8D6530DL;
    NOT_HEXA = Pattern.compile("[^0-9A-Fa-f]");
    ESCAPE_REPLACEMENTS = new HashMap<>();
    ESCAPE_CODES = new HashMap<>();
    ESCAPE_REPLACEMENTS.put(Character.valueOf('0'), "\000");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('a'), "\007");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('b'), "\b");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('t'), "\t");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('n'), "\n");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('v'), "\013");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('f'), "\f");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('r'), "\r");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('e'), "\033");
    ESCAPE_REPLACEMENTS.put(Character.valueOf(' '), " ");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('"'), "\"");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\\'), "\\");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('N'), "");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('_'), " ");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('L'), " ");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('P'), " ");
    ESCAPE_CODES.put(Character.valueOf('x'), Integer.valueOf(2));
    ESCAPE_CODES.put(Character.valueOf('u'), Integer.valueOf(4));
    ESCAPE_CODES.put(Character.valueOf('U'), Integer.valueOf(8));
  }
  
  public boolean checkToken(Token.ID... paramVarArgs) {
    try {
      while (needMoreTokens())
        fetchMoreTokens(); 
    } catch (ScannerException scannerException) {
      throw a(null);
    } 
    try {
      if (!this.tokens.isEmpty()) {
        try {
          if (paramVarArgs.length == 0)
            return true; 
        } catch (ScannerException scannerException) {
          throw a(null);
        } 
        Token.ID iD = ((Token)this.tokens.get(0)).getTokenId();
        byte b = 0;
        while (true) {
          try {
            if (b < paramVarArgs.length) {
              try {
                if (iD == paramVarArgs[b])
                  return true; 
              } catch (ScannerException scannerException) {
                throw a(null);
              } 
              b++;
              continue;
            } 
          } catch (ScannerException scannerException) {
            throw a(null);
          } 
          break;
        } 
      } 
    } catch (ScannerException scannerException) {
      throw a(null);
    } 
    return false;
  }
  
  @Deprecated
  public boolean isParseComments() {
    return this.parseComments;
  }
  
  public Token getToken() {
    this.tokensTaken++;
    return this.tokens.remove(0);
  }
  
  @Deprecated
  public ScannerImpl setParseComments(boolean paramBoolean) {
    this.parseComments = paramBoolean;
    return this;
  }
  
  @Deprecated
  public ScannerImpl(StreamReader paramStreamReader) {
    this(paramStreamReader, new LoaderOptions());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\scanner\ScannerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */