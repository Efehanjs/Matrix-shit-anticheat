package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class Expression$BooleanParser {
  private Expression$BooleanExpression root;
  
  private final Expression$BooleanLexer lexer;
  
  private Expression$BooleanLexer$SymbolObject symbol;
  
  private static final long a = o3.a(-3265629891676940849L, -2474177220346690838L, MethodHandles.lookup().lookupClass()).a(9524005313973L);
  
  public Expression$BooleanExpression build() {
    long l = a ^ 0x347F94804BEL;
    try {
      expression();
      this.root.interpret();
    } catch (NullPointerException nullPointerException) {
      throw new Expression$ParseException("Failed to parse: root expression is null.");
    } catch (Exception exception) {
      throw new Expression$ParseException(exception.getClass().getSimpleName() + ": " + exception.getMessage());
    } 
    return this.root;
  }
  
  public Expression$BooleanParser(Expression$BooleanLexer paramExpression$BooleanLexer) {
    this.lexer = paramExpression$BooleanLexer;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$BooleanParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */