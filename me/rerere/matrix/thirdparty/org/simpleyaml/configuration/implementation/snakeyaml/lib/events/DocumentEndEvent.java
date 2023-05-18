package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class DocumentEndEvent extends Event {
  private final boolean explicit;
  
  public DocumentEndEvent(Mark paramMark1, Mark paramMark2, boolean paramBoolean) {
    super(paramMark1, paramMark2);
    this.explicit = paramBoolean;
  }
  
  public boolean getExplicit() {
    return this.explicit;
  }
  
  public Event$ID getEventId() {
    return Event$ID.DocumentEnd;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\DocumentEndEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */