package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.util.Objects;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class CommentToken extends Token {
  private final String value;
  
  private final CommentType type;
  
  public String getValue() {
    return this.value;
  }
  
  public CommentType getCommentType() {
    return this.type;
  }
  
  public Token$ID getTokenId() {
    return Token$ID.Comment;
  }
  
  public CommentToken(CommentType paramCommentType, String paramString, Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
    Objects.requireNonNull(paramCommentType);
    this.type = paramCommentType;
    Objects.requireNonNull(paramString);
    this.value = paramString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\CommentToken.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */