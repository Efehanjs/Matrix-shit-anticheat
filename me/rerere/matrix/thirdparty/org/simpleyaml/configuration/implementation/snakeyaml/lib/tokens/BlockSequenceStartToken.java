package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class BlockSequenceStartToken extends Token {
  public Token$ID getTokenId() {
    return Token$ID.BlockSequenceStart;
  }
  
  public BlockSequenceStartToken(Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\BlockSequenceStartToken.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */