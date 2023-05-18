package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.UriEncoder;

public final class Tag {
  private final String value;
  
  public static final Tag BINARY;
  
  public static final Tag MAP;
  
  public static final Tag NULL;
  
  public static final Tag SET;
  
  public static final Tag STR;
  
  public static final Tag INT;
  
  public static final Tag SEQ;
  
  public static final Tag PAIRS;
  
  public static final Tag MERGE;
  
  public static final String PREFIX = "tag:yaml.org,2002:";
  
  private static final Map COMPATIBILITY_MAP;
  
  private boolean secondary = false;
  
  public static final Tag BOOL;
  
  public static final Tag FLOAT;
  
  public static final Tag YAML;
  
  public static final Tag TIMESTAMP;
  
  public static final Tag OMAP;
  
  public static final Tag COMMENT;
  
  private static final long a = o3.a(4737531472753828729L, 4845238144377695392L, MethodHandles.lookup().lookupClass()).a(2075603855490L);
  
  public boolean isCompatible(Class paramClass) {
    Set set = (Set)COMPATIBILITY_MAP.get(this);
    try {
      if (set != null)
        return set.contains(paramClass); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean matches(Class paramClass) {
    long l = a ^ 0x2FA135459B63L;
    return this.value.equals("tag:yaml.org,2002:" + paramClass.getName());
  }
  
  public Tag(Class paramClass) {
    if (paramClass == null)
      throw new NullPointerException("Class for tag must be provided."); 
    this.value = "tag:yaml.org,2002:" + UriEncoder.encode(paramClass.getName());
  }
  
  public int hashCode() {
    return this.value.hashCode();
  }
  
  public String getValue() {
    return this.value;
  }
  
  public boolean isSecondary() {
    return this.secondary;
  }
  
  public String getClassName() {
    long l = a ^ 0x24B3CC81028BL;
    try {
      if (!this.value.startsWith("tag:yaml.org,2002:"))
        throw new YAMLException("Invalid tag: " + this.value); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return UriEncoder.decode(this.value.substring("tag:yaml.org,2002:".length()));
  }
  
  public Tag(String paramString) {
    if (paramString == null)
      throw new NullPointerException("Tag must be provided."); 
    try {
      if (paramString.length() == 0)
        throw new IllegalArgumentException("Tag must not be empty."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramString.trim().length() != paramString.length())
        throw new IllegalArgumentException("Tag must not contain leading or trailing spaces."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.value = UriEncoder.encode(paramString);
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.secondary = !paramString.startsWith("tag:yaml.org,2002:");
  }
  
  public boolean startsWith(String paramString) {
    return this.value.startsWith(paramString);
  }
  
  static {
    long l = a ^ 0x155444FD93BL;
    YAML = new Tag("tag:yaml.org,2002:yaml");
    MERGE = new Tag("tag:yaml.org,2002:merge");
    SET = new Tag("tag:yaml.org,2002:set");
    PAIRS = new Tag("tag:yaml.org,2002:pairs");
    OMAP = new Tag("tag:yaml.org,2002:omap");
    BINARY = new Tag("tag:yaml.org,2002:binary");
    INT = new Tag("tag:yaml.org,2002:int");
    FLOAT = new Tag("tag:yaml.org,2002:float");
    TIMESTAMP = new Tag("tag:yaml.org,2002:timestamp");
    BOOL = new Tag("tag:yaml.org,2002:bool");
    NULL = new Tag("tag:yaml.org,2002:null");
    STR = new Tag("tag:yaml.org,2002:str");
    SEQ = new Tag("tag:yaml.org,2002:seq");
    MAP = new Tag("tag:yaml.org,2002:map");
    COMMENT = new Tag("tag:yaml.org,2002:comment");
    COMPATIBILITY_MAP = new HashMap<>();
    HashSet<Class<Double>> hashSet = new HashSet();
    hashSet.add(Double.class);
    hashSet.add(Float.class);
    hashSet.add(BigDecimal.class);
    COMPATIBILITY_MAP.put(FLOAT, hashSet);
    HashSet<Class<Integer>> hashSet1 = new HashSet();
    hashSet1.add(Integer.class);
    hashSet1.add(Long.class);
    hashSet1.add(BigInteger.class);
    COMPATIBILITY_MAP.put(INT, hashSet1);
    HashSet<Class<Date>> hashSet2 = new HashSet();
    hashSet2.add(Date.class);
    try {
      hashSet2.add(Class.forName("java.sql.Date"));
      hashSet2.add(Class.forName("java.sql.Timestamp"));
    } catch (ClassNotFoundException classNotFoundException) {}
    COMPATIBILITY_MAP.put(TIMESTAMP, hashSet2);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof Tag)
        return this.value.equals(((Tag)paramObject).getValue()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public String toString() {
    return this.value;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\Tag.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */