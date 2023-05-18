package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.util.Map;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class DocumentStartEvent extends Event {
  private final boolean explicit;
  
  private final DumperOptions.Version version;
  
  private final Map tags;
  
  public boolean getExplicit() {
    return this.explicit;
  }
  
  public DocumentStartEvent(Mark paramMark1, Mark paramMark2, boolean paramBoolean, DumperOptions.Version paramVersion, Map paramMap) {
    super(paramMark1, paramMark2);
    this.explicit = paramBoolean;
    this.version = paramVersion;
    this.tags = paramMap;
  }
  
  public DumperOptions.Version getVersion() {
    return this.version;
  }
  
  public Map getTags() {
    return this.tags;
  }
  
  public Event$ID getEventId() {
    return Event$ID.DocumentStart;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\DocumentStartEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */