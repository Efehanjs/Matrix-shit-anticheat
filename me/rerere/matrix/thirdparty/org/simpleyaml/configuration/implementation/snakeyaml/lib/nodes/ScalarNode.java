package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public class ScalarNode extends Node {
  private final String value;
  
  private final DumperOptions.ScalarStyle style;
  
  private static final long a = o3.a(8265997898794310062L, 880175285180949103L, MethodHandles.lookup().lookupClass()).a(175587437665030L);
  
  public boolean isPlain() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.style == DumperOptions.ScalarStyle.PLAIN);
  }
  
  public DumperOptions.ScalarStyle getScalarStyle() {
    return this.style;
  }
  
  @Deprecated
  public Character getStyle() {
    return this.style.getChar();
  }
  
  public String getValue() {
    return this.value;
  }
  
  public NodeId getNodeId() {
    return NodeId.scalar;
  }
  
  public ScalarNode(Tag paramTag, String paramString, Mark paramMark1, Mark paramMark2, DumperOptions.ScalarStyle paramScalarStyle) {
    this(paramTag, true, paramString, paramMark1, paramMark2, paramScalarStyle);
  }
  
  @Deprecated
  public ScalarNode(Tag paramTag, String paramString, Mark paramMark1, Mark paramMark2, Character paramCharacter) {
    this(paramTag, paramString, paramMark1, paramMark2, DumperOptions.ScalarStyle.createStyle(paramCharacter));
  }
  
  public ScalarNode(Tag paramTag, boolean paramBoolean, String paramString, Mark paramMark1, Mark paramMark2, DumperOptions.ScalarStyle paramScalarStyle) {
    super(paramTag, paramMark1, paramMark2);
    if (paramString == null)
      throw new NullPointerException("value in a Node is required."); 
    try {
      this.value = paramString;
      if (paramScalarStyle == null)
        throw new NullPointerException("Scalar style must be provided."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.style = paramScalarStyle;
    this.resolved = paramBoolean;
  }
  
  public String toString() {
    long l = a ^ 0x6C7F543D3EE2L;
    return "<" + getClass().getName() + " (tag=" + getTag() + ", value=" + getValue() + ")>";
  }
  
  @Deprecated
  public ScalarNode(Tag paramTag, boolean paramBoolean, String paramString, Mark paramMark1, Mark paramMark2, Character paramCharacter) {
    this(paramTag, paramBoolean, paramString, paramMark1, paramMark2, DumperOptions.ScalarStyle.createStyle(paramCharacter));
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\ScalarNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */