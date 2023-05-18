package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class TagToken extends Token {
  private final TagTuple value;
  
  public Token$ID getTokenId() {
    return Token$ID.Tag;
  }
  
  public TagToken(TagTuple paramTagTuple, Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
    this.value = paramTagTuple;
  }
  
  public TagTuple getValue() {
    return this.value;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\TagToken.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */