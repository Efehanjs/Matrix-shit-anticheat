package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.CommentEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser.Parser;

public class CommentEventsCollector {
  private final Queue eventSource;
  
  private final CommentType[] expectedCommentTypes;
  
  private List commentLineList;
  
  public List consume() {
    try {
      return this.commentLineList;
    } finally {
      this.commentLineList = new ArrayList();
    } 
  }
  
  public CommentEventsCollector(Parser paramParser, CommentType... paramVarArgs) {
    this.eventSource = new CommentEventsCollector$1(this, paramParser);
    this.expectedCommentTypes = paramVarArgs;
    this.commentLineList = new ArrayList();
  }
  
  public CommentEventsCollector(Queue paramQueue, CommentType... paramVarArgs) {
    this.eventSource = paramQueue;
    this.expectedCommentTypes = paramVarArgs;
    this.commentLineList = new ArrayList();
  }
  
  public Event collectEvents(Event paramEvent) {
    try {
      if (paramEvent != null) {
        try {
          if (isEventExpected(paramEvent)) {
            this.commentLineList.add(new CommentLine((CommentEvent)paramEvent));
          } else {
            return paramEvent;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        try {
          while (isEventExpected(this.eventSource.peek()))
            this.commentLineList.add(new CommentLine(this.eventSource.poll())); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    while (isEventExpected(this.eventSource.peek()))
      this.commentLineList.add(new CommentLine(this.eventSource.poll())); 
  }
  
  public CommentEventsCollector collectEvents() {
    collectEvents(null);
    return this;
  }
  
  public boolean isEmpty() {
    return this.commentLineList.isEmpty();
  }
  
  public Event collectEventsAndPoll(Event paramEvent) {
    Event event = collectEvents(paramEvent);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (event != null) ? event : this.eventSource.poll();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\comments\CommentEventsCollector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */