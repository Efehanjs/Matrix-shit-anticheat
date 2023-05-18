package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.TimeZone;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.serializer.AnchorGenerator;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.serializer.NumberAnchorGenerator;

public class DumperOptions {
  private boolean indentWithIndicator = false;
  
  private DumperOptions$LineBreak lineBreak = DumperOptions$LineBreak.UNIX;
  
  private DumperOptions$FlowStyle defaultFlowStyle = DumperOptions$FlowStyle.AUTO;
  
  private DumperOptions$ScalarStyle defaultStyle = DumperOptions$ScalarStyle.PLAIN;
  
  private int bestWidth = 80;
  
  private boolean allowReadOnlyProperties = false;
  
  private boolean processComments = false;
  
  private int indicatorIndent = 0;
  
  private boolean explicitEnd = false;
  
  private Map tags = null;
  
  private DumperOptions$Version version = null;
  
  private boolean allowUnicode = true;
  
  private Boolean prettyFlow = Boolean.valueOf(false);
  
  private TimeZone timeZone = null;
  
  private boolean explicitStart = false;
  
  private int indent = 2;
  
  private boolean splitLines = true;
  
  private int maxSimpleKeyLength = 128;
  
  private AnchorGenerator anchorGenerator = (AnchorGenerator)new NumberAnchorGenerator(0);
  
  private boolean canonical = false;
  
  private DumperOptions$NonPrintableStyle nonPrintableStyle = DumperOptions$NonPrintableStyle.BINARY;
  
  private static final long a = o3.a(4550632103597834993L, 6596293159813214228L, MethodHandles.lookup().lookupClass()).a(19538626275951L);
  
  public boolean isAllowReadOnlyProperties() {
    return this.allowReadOnlyProperties;
  }
  
  public void setExplicitStart(boolean paramBoolean) {
    this.explicitStart = paramBoolean;
  }
  
  public void setDefaultFlowStyle(DumperOptions$FlowStyle paramDumperOptions$FlowStyle) {
    long l = a ^ 0x483BA143F9B4L;
    try {
      if (paramDumperOptions$FlowStyle == null)
        throw new NullPointerException("Use FlowStyle enum."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.defaultFlowStyle = paramDumperOptions$FlowStyle;
  }
  
  public AnchorGenerator getAnchorGenerator() {
    return this.anchorGenerator;
  }
  
  public boolean getIndentWithIndicator() {
    return this.indentWithIndicator;
  }
  
  public void setExplicitEnd(boolean paramBoolean) {
    this.explicitEnd = paramBoolean;
  }
  
  public int getIndicatorIndent() {
    return this.indicatorIndent;
  }
  
  public void setAllowUnicode(boolean paramBoolean) {
    this.allowUnicode = paramBoolean;
  }
  
  public void setNonPrintableStyle(DumperOptions$NonPrintableStyle paramDumperOptions$NonPrintableStyle) {
    this.nonPrintableStyle = paramDumperOptions$NonPrintableStyle;
  }
  
  public int getMaxSimpleKeyLength() {
    return this.maxSimpleKeyLength;
  }
  
  public void setCanonical(boolean paramBoolean) {
    this.canonical = paramBoolean;
  }
  
  public void setTimeZone(TimeZone paramTimeZone) {
    this.timeZone = paramTimeZone;
  }
  
  public void setIndicatorIndent(int paramInt) {
    long l = a ^ 0x3BE3A4FAB98FL;
    try {
      if (paramInt < 0)
        throw new YAMLException("Indicator indent must be non-negative."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramInt > 9)
        throw new YAMLException("Indicator indent must be at most Emitter.MAX_INDENT-1: 9"); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.indicatorIndent = paramInt;
  }
  
  public boolean isAllowUnicode() {
    return this.allowUnicode;
  }
  
  public void setLineBreak(DumperOptions$LineBreak paramDumperOptions$LineBreak) {
    long l = a ^ 0xB4DC9D330F6L;
    try {
      if (paramDumperOptions$LineBreak == null)
        throw new NullPointerException("Specify line break."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.lineBreak = paramDumperOptions$LineBreak;
  }
  
  public boolean isCanonical() {
    return this.canonical;
  }
  
  public boolean getSplitLines() {
    return this.splitLines;
  }
  
  public void setDefaultScalarStyle(DumperOptions$ScalarStyle paramDumperOptions$ScalarStyle) {
    long l = a ^ 0x3429432982CDL;
    try {
      if (paramDumperOptions$ScalarStyle == null)
        throw new NullPointerException("Use ScalarStyle enum."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.defaultStyle = paramDumperOptions$ScalarStyle;
  }
  
  public void setTags(Map paramMap) {
    this.tags = paramMap;
  }
  
  public void setVersion(DumperOptions$Version paramDumperOptions$Version) {
    this.version = paramDumperOptions$Version;
  }
  
  public DumperOptions$ScalarStyle getDefaultScalarStyle() {
    return this.defaultStyle;
  }
  
  public void setIndentWithIndicator(boolean paramBoolean) {
    this.indentWithIndicator = paramBoolean;
  }
  
  public void setIndent(int paramInt) {
    long l = a ^ 0x3D537F4C14A4L;
    try {
      if (paramInt < 1)
        throw new YAMLException("Indent must be at least 1"); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramInt > 10)
        throw new YAMLException("Indent must be at most 10"); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.indent = paramInt;
  }
  
  public DumperOptions$LineBreak getLineBreak() {
    return this.lineBreak;
  }
  
  public DumperOptions$NonPrintableStyle getNonPrintableStyle() {
    return this.nonPrintableStyle;
  }
  
  public boolean isExplicitEnd() {
    return this.explicitEnd;
  }
  
  public void setAllowReadOnlyProperties(boolean paramBoolean) {
    this.allowReadOnlyProperties = paramBoolean;
  }
  
  public int getWidth() {
    return this.bestWidth;
  }
  
  public void setAnchorGenerator(AnchorGenerator paramAnchorGenerator) {
    this.anchorGenerator = paramAnchorGenerator;
  }
  
  public int getIndent() {
    return this.indent;
  }
  
  public void setProcessComments(boolean paramBoolean) {
    this.processComments = paramBoolean;
  }
  
  public TimeZone getTimeZone() {
    return this.timeZone;
  }
  
  public DumperOptions$FlowStyle getDefaultFlowStyle() {
    return this.defaultFlowStyle;
  }
  
  public DumperOptions$Version getVersion() {
    return this.version;
  }
  
  public boolean isExplicitStart() {
    return this.explicitStart;
  }
  
  public boolean isPrettyFlow() {
    return this.prettyFlow.booleanValue();
  }
  
  public void setMaxSimpleKeyLength(int paramInt) {
    long l = a ^ 0x12D9F397F95BL;
    try {
      if (paramInt > 1024)
        throw new YAMLException("The simple key must not span more than 1024 stream characters. See https://yaml.org/spec/1.1/#id934537"); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.maxSimpleKeyLength = paramInt;
  }
  
  public void setPrettyFlow(boolean paramBoolean) {
    this.prettyFlow = Boolean.valueOf(paramBoolean);
  }
  
  public void setWidth(int paramInt) {
    this.bestWidth = paramInt;
  }
  
  public Map getTags() {
    return this.tags;
  }
  
  public boolean isProcessComments() {
    return this.processComments;
  }
  
  public void setSplitLines(boolean paramBoolean) {
    this.splitLines = paramBoolean;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\DumperOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */