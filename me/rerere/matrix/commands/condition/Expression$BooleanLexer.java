package me.rerere.matrix.commands.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class Expression$BooleanLexer {
  @NotNull
  private final StreamTokenizer input;
  
  private static final long a = o3.a(-1079724474565469952L, -8319464535003846445L, MethodHandles.lookup().lookupClass()).a(78611609399574L);
  
  @NotNull
  public Expression$BooleanLexer$SymbolObject nextToken() {
    Expression$BooleanLexer$Symbol expression$BooleanLexer$Symbol;
    long l = a ^ 0x2BCC529BA094L;
    Double double_ = null;
    try {
      int i = this.input.nextToken();
      switch (i) {
        case 10:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.EOL;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case -1:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.EOF;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case -2:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.NUMBER;
          double_ = Double.valueOf(this.input.nval);
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 40:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.LEFT;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 41:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.RIGHT;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 38:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.AND;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 124:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.OR;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 33:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.NOT;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 62:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.CMP_GREATER_THAN;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 61:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.CMP_EQUALS;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
        case 60:
          expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.CMP_LESS_THAN;
          return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
      } 
      throw new RuntimeException("Lexer error: Got an invalid token");
    } catch (IOException iOException) {
      expression$BooleanLexer$Symbol = Expression$BooleanLexer$Symbol.EOF;
    } 
    return new Expression$BooleanLexer$SymbolObject(expression$BooleanLexer$Symbol, double_);
  }
  
  public Expression$BooleanLexer(@NotNull String paramString) {
    this.input = new StreamTokenizer(new BufferedReader(new StringReader(paramString)));
    this.input.resetSyntax();
    this.input.wordChars(97, 122);
    this.input.wordChars(65, 90);
    this.input.whitespaceChars(0, 32);
    this.input.whitespaceChars(10, 9);
    this.input.ordinaryChar(40);
    this.input.ordinaryChar(41);
    this.input.ordinaryChar(38);
    this.input.ordinaryChar(124);
    this.input.ordinaryChar(33);
    this.input.ordinaryChar(62);
    this.input.ordinaryChar(61);
    this.input.ordinaryChar(60);
    this.input.parseNumbers();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$BooleanLexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */