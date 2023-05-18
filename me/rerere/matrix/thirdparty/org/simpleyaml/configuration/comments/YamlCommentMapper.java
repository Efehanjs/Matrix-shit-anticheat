package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.function.Predicate;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;

public class YamlCommentMapper implements Commentable {
  public final KeyTree keyTree;
  
  public static final Predicate NO_COMMENTS;
  
  private static final long a = o3.a(1992112099141428163L, 404541382328404759L, MethodHandles.lookup().lookupClass()).a(162381540294008L);
  
  public KeyTree getKeyTree() {
    return this.keyTree;
  }
  
  public final void setRawComment(KeyTree$Node paramKeyTree$Node, String paramString, CommentType paramCommentType) {
    try {
      if (paramKeyTree$Node == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (paramCommentType == CommentType.BLOCK) {
        paramKeyTree$Node.setComment(paramString);
      } else {
        paramKeyTree$Node.setSideComment(paramString);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public KeyTree$Node getNode(String paramString) {
    return this.keyTree.get(paramString);
  }
  
  public final void setFormattedComment(KeyTree$Node paramKeyTree$Node, String paramString, CommentType paramCommentType) {
    try {
      if (paramKeyTree$Node == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    String str = options().commentFormatter().dump(paramString, paramCommentType, paramKeyTree$Node);
    setRawComment(paramKeyTree$Node, str, paramCommentType);
  }
  
  public KeyTree$Node getOrAddNode(String paramString) {
    return this.keyTree.add(paramString);
  }
  
  public void removeComment(String paramString, CommentType paramCommentType) {
    removeComment(getNode(paramString), paramCommentType);
  }
  
  static {
    NO_COMMENTS = (paramKeyTree$Node -> {
        try {
          if (paramKeyTree$Node.getComment() == null)
            try {
              if (paramKeyTree$Node.getSideComment() == null);
            } catch (RuntimeException runtimeException) {
              throw b(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
        return false;
      });
  }
  
  public final void removeComment(KeyTree$Node paramKeyTree$Node, CommentType paramCommentType) {
    try {
      if (paramKeyTree$Node != null)
        try {
          if (paramCommentType == CommentType.BLOCK) {
            paramKeyTree$Node.setComment(null);
          } else {
            paramKeyTree$Node.setSideComment(null);
          } 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public final String getComment(KeyTree$Node paramKeyTree$Node, CommentType paramCommentType) {
    long l = a ^ 0x66AF69EA8923L;
    String str = getRawComment(paramKeyTree$Node, paramCommentType);
    try {
      if (str == null)
        return null; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      return options().commentFormatter().parse(str, paramCommentType, paramKeyTree$Node);
    } catch (IOException iOException) {
      throw new RuntimeException("Cannot parse comment", iOException);
    } 
  }
  
  public YamlCommentMapper(YamlConfigurationOptions paramYamlConfigurationOptions) {
    this(new YamlKeyTree(paramYamlConfigurationOptions));
  }
  
  public void clearNode(KeyTree$Node paramKeyTree$Node) {
    if (paramKeyTree$Node != null) {
      KeyTree$Node keyTree$Node = paramKeyTree$Node.getParent();
      try {
      
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      keyTree$Node = (keyTree$Node != null) ? keyTree$Node : paramKeyTree$Node;
      keyTree$Node.clear();
    } 
  }
  
  public final String getRawComment(KeyTree$Node paramKeyTree$Node, CommentType paramCommentType) {
    try {
      if (paramKeyTree$Node == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (paramCommentType == CommentType.BLOCK) ? paramKeyTree$Node.getComment() : paramKeyTree$Node.getSideComment();
  }
  
  public String getRawComment(String paramString, CommentType paramCommentType) {
    return getRawComment(getNode(paramString), paramCommentType);
  }
  
  public YamlConfigurationOptions options() {
    return (YamlConfigurationOptions)this.keyTree.options();
  }
  
  public void clearNodeIfNoComments(KeyTree$Node paramKeyTree$Node) {
    if (paramKeyTree$Node != null) {
      KeyTree$Node keyTree$Node = paramKeyTree$Node.getParent();
      try {
      
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      keyTree$Node = (keyTree$Node != null) ? keyTree$Node : paramKeyTree$Node;
      keyTree$Node.clearIf(NO_COMMENTS);
    } 
  }
  
  public YamlCommentMapper(YamlKeyTree paramYamlKeyTree) {
    this.keyTree = paramYamlKeyTree;
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType) {
    try {
      if (paramString2 == null) {
        removeComment(getNode(paramString1), paramCommentType);
      } else {
        setFormattedComment(getOrAddNode(paramString1), paramString2, paramCommentType);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public String getComment(String paramString, CommentType paramCommentType) {
    return getComment(getNode(paramString), paramCommentType);
  }
  
  public KeyTree$Node getPriorityNode(String paramString) {
    return this.keyTree.getPriority(paramString);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */