package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class SequenceStartEvent extends CollectionStartEvent {
  public Event$ID getEventId() {
    return Event$ID.SequenceStart;
  }
  
  @Deprecated
  public SequenceStartEvent(String paramString1, String paramString2, boolean paramBoolean, Mark paramMark1, Mark paramMark2, Boolean paramBoolean1) {
    this(paramString1, paramString2, paramBoolean, paramMark1, paramMark2, DumperOptions.FlowStyle.fromBoolean(paramBoolean1));
  }
  
  public SequenceStartEvent(String paramString1, String paramString2, boolean paramBoolean, Mark paramMark1, Mark paramMark2, DumperOptions.FlowStyle paramFlowStyle) {
    super(paramString1, paramString2, paramBoolean, paramMark1, paramMark2, paramFlowStyle);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\SequenceStartEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */