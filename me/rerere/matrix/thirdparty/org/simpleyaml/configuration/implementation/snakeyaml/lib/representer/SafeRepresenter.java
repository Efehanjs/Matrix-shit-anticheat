package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter extends BaseRepresenter {
  public TimeZone timeZone = null;
  
  public Map classTags;
  
  private static final Pattern MULTILINE_PATTERN;
  
  public DumperOptions.NonPrintableStyle nonPrintableStyle;
  
  private static final long a = o3.a(-8054042157293526945L, 1841144828939785849L, MethodHandles.lookup().lookupClass()).a(137711910044345L);
  
  public void setTimeZone(TimeZone paramTimeZone) {
    this.timeZone = paramTimeZone;
  }
  
  @Deprecated
  public SafeRepresenter() {
    this(new DumperOptions());
  }
  
  public Tag addClassTag(Class<?> paramClass, Tag paramTag) {
    long l = a ^ 0x394EDBB3E665L;
    try {
      if (paramTag == null)
        throw new NullPointerException("Tag must be provided."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return this.classTags.put(paramClass, paramTag);
  }
  
  public Tag getTag(Class paramClass, Tag paramTag) {
    try {
      if (this.classTags.containsKey(paramClass))
        return (Tag)this.classTags.get(paramClass); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return paramTag;
  }
  
  public SafeRepresenter(DumperOptions paramDumperOptions) {
    this.representers.put(String.class, new SafeRepresenter$RepresentString(this));
    this.representers.put(Boolean.class, new SafeRepresenter$RepresentBoolean(this));
    this.representers.put(Character.class, new SafeRepresenter$RepresentString(this));
    this.representers.put(UUID.class, new SafeRepresenter$RepresentUuid(this));
    this.representers.put(byte[].class, new SafeRepresenter$RepresentByteArray(this));
    SafeRepresenter$RepresentPrimitiveArray safeRepresenter$RepresentPrimitiveArray = new SafeRepresenter$RepresentPrimitiveArray(this);
    this.representers.put(short[].class, safeRepresenter$RepresentPrimitiveArray);
    this.representers.put(int[].class, safeRepresenter$RepresentPrimitiveArray);
    this.representers.put(long[].class, safeRepresenter$RepresentPrimitiveArray);
    this.representers.put(float[].class, safeRepresenter$RepresentPrimitiveArray);
    this.representers.put(double[].class, safeRepresenter$RepresentPrimitiveArray);
    this.representers.put(char[].class, safeRepresenter$RepresentPrimitiveArray);
    this.representers.put(boolean[].class, safeRepresenter$RepresentPrimitiveArray);
    this.multiRepresenters.put(Number.class, new SafeRepresenter$RepresentNumber(this));
    this.multiRepresenters.put(List.class, new SafeRepresenter$RepresentList(this));
    this.multiRepresenters.put(Map.class, new SafeRepresenter$RepresentMap(this));
    this.multiRepresenters.put(Set.class, new SafeRepresenter$RepresentSet(this));
    this.multiRepresenters.put(Iterator.class, new SafeRepresenter$RepresentIterator(this));
    this.multiRepresenters.put((new Object[0]).getClass(), new SafeRepresenter$RepresentArray(this));
    this.multiRepresenters.put(Date.class, new SafeRepresenter$RepresentDate(this));
    this.multiRepresenters.put(Enum.class, new SafeRepresenter$RepresentEnum(this));
    this.multiRepresenters.put(Calendar.class, new SafeRepresenter$RepresentDate(this));
    this.classTags = new HashMap<>();
    this.nonPrintableStyle = paramDumperOptions.getNonPrintableStyle();
  }
  
  public TimeZone getTimeZone() {
    return this.timeZone;
  }
  
  static {
    long l = a ^ 0x4C6D0341F5B5L;
    MULTILINE_PATTERN = Pattern.compile("\n|| | ");
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */