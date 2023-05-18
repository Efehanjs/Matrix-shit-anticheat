package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class CommentEvent extends Event {
  private final String value;
  
  private final CommentType type;
  
  private static final long a = o3.a(8424433028993936802L, -1108317594601470076L, MethodHandles.lookup().lookupClass()).a(252263333095531L);
  
  public Event$ID getEventId() {
    return Event$ID.Comment;
  }
  
  public String getArguments() {
    long l = a ^ 0x5F0CB872804EL;
    return super.getArguments() + "type=" + this.type + ", value=" + this.value;
  }
  
  public CommentEvent(CommentType paramCommentType, String paramString, Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
    if (paramCommentType == null)
      throw new NullPointerException("Event Type must be provided."); 
    try {
      this.type = paramCommentType;
      if (paramString == null)
        throw new NullPointerException("Value must be provided."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.value = paramString;
  }
  
  public CommentType getCommentType() {
    return this.type;
  }
  
  public String getValue() {
    return this.value;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\CommentEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */