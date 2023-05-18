package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.CommentEvent;

public class CommentLine {
  private final Mark endMark;
  
  private final Mark startMark;
  
  private final CommentType commentType;
  
  private final String value;
  
  private static final long a = o3.a(1771778456879493829L, -5566614150076392460L, MethodHandles.lookup().lookupClass()).a(64627674825350L);
  
  public Mark getEndMark() {
    return this.endMark;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public CommentLine(CommentEvent paramCommentEvent) {
    this(paramCommentEvent.getStartMark(), paramCommentEvent.getEndMark(), paramCommentEvent.getValue(), paramCommentEvent.getCommentType());
  }
  
  public CommentLine(Mark paramMark1, Mark paramMark2, String paramString, CommentType paramCommentType) {
    this.startMark = paramMark1;
    this.endMark = paramMark2;
    this.value = paramString;
    this.commentType = paramCommentType;
  }
  
  public CommentType getCommentType() {
    return this.commentType;
  }
  
  public String toString() {
    long l = a ^ 0x4BF624454968L;
    return "<" + getClass().getName() + " (type=" + getCommentType() + ", value=" + getValue() + ")>";
  }
  
  public Mark getStartMark() {
    return this.startMark;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\comments\CommentLine.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */