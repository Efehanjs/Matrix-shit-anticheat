package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class MappingStartEvent extends CollectionStartEvent {
  public Event$ID getEventId() {
    return Event$ID.MappingStart;
  }
  
  public MappingStartEvent(String paramString1, String paramString2, boolean paramBoolean, Mark paramMark1, Mark paramMark2, DumperOptions.FlowStyle paramFlowStyle) {
    super(paramString1, paramString2, paramBoolean, paramMark1, paramMark2, paramFlowStyle);
  }
  
  @Deprecated
  public MappingStartEvent(String paramString1, String paramString2, boolean paramBoolean, Mark paramMark1, Mark paramMark2, Boolean paramBoolean1) {
    this(paramString1, paramString2, paramBoolean, paramMark1, paramMark2, DumperOptions.FlowStyle.fromBoolean(paramBoolean1));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\MappingStartEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */