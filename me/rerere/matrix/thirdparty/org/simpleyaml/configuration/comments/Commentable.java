package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

public interface Commentable {
  void setComment(String paramString1, String paramString2, CommentType paramCommentType);
  
  default String getComment(String paramString) {
    return getComment(paramString, CommentType.BLOCK);
  }
  
  default void setComment(String paramString1, String paramString2) {
    setComment(paramString1, paramString2, CommentType.BLOCK);
  }
  
  String getComment(String paramString, CommentType paramCommentType);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\Commentable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */