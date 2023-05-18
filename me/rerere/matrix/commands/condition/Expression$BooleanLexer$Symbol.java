package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum Expression$BooleanLexer$Symbol {
  CMP_EQUALS, CMP_LESS_THAN, EOF, NUMBER, NOT, LEFT, CMP_GREATER_THAN, EOL, AND, RIGHT, OR;
  
  static {
    AND = new Expression$BooleanLexer$Symbol("AND", 3);
    NOT = new Expression$BooleanLexer$Symbol("NOT", 4);
    LEFT = new Expression$BooleanLexer$Symbol("LEFT", 5);
    RIGHT = new Expression$BooleanLexer$Symbol("RIGHT", 6);
    CMP_EQUALS = new Expression$BooleanLexer$Symbol("CMP_EQUALS", 7);
    CMP_LESS_THAN = new Expression$BooleanLexer$Symbol("CMP_LESS_THAN", 8);
    CMP_GREATER_THAN = new Expression$BooleanLexer$Symbol("CMP_GREATER_THAN", 9);
    NUMBER = new Expression$BooleanLexer$Symbol("NUMBER", 10);
    $VALUES = new Expression$BooleanLexer$Symbol[] { 
        EOF, EOL, OR, AND, NOT, LEFT, RIGHT, CMP_EQUALS, CMP_LESS_THAN, CMP_GREATER_THAN, 
        NUMBER };
  }
  
  static {
    long l = o3.a(5551418712344864543L, 4911842944533828773L, MethodHandles.lookup().lookupClass()).a(73275801647996L) ^ 0x34522D684188L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$BooleanLexer$Symbol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */