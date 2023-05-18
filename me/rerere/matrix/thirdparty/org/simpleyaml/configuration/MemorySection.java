package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.lang.invoke.MethodHandles;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization.ConfigurationSerializable;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.NumberConversions;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class MemorySection implements ConfigurationSection {
  private final String path;
  
  private final ConfigurationSection parent;
  
  private final Configuration root;
  
  private final String fullPath;
  
  public final Map map = new LinkedHashMap<>();
  
  private static final long b = o3.a(6849435460873352005L, -4896388189958222323L, MethodHandles.lookup().lookupClass()).a(70803439925009L);
  
  public ConfigurationSection createSection(String paramString) {
    long l = b ^ 0x189F2F77E844L;
    Validate.notEmpty(paramString, "Cannot create section at empty path");
    Configuration configuration = getRoot();
    try {
      if (configuration == null)
        throw new IllegalStateException("Cannot create section without a root"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    char c = configuration.options().pathSeparator();
    int i = -1;
    Object object = this;
    int j;
    while ((i = StringUtils.firstSeparatorIndex(paramString, c, j = i + 1)) != -1) {
      String str1 = paramString.substring(j, i);
      Object object1 = getSection(object, str1);
      try {
        if (object1 == null) {
          if (object instanceof ConfigurationSection) {
            ConfigurationSection configurationSection = object.createSection(str1);
            continue;
          } 
          return null;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      object = object1;
    } 
    String str = paramString.substring(j);
    if (object == this) {
      MemorySection memorySection = new MemorySection(this, str);
      this.map.put(str, memorySection);
      return memorySection;
    } 
    try {
      if (object instanceof ConfigurationSection)
        return ((ConfigurationSection)object).createSection(str); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public ConfigurationSection getParent() {
    return this.parent;
  }
  
  public static String createPath(ConfigurationSection paramConfigurationSection, String paramString) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return createPath(paramConfigurationSection, paramString, (paramConfigurationSection == null) ? null : paramConfigurationSection.getRoot());
  }
  
  public Map getValues(boolean paramBoolean) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Configuration configuration = getRoot();
    try {
      if (configuration != null && configuration.options().copyDefaults()) {
        ConfigurationSection configurationSection = getDefaultSection();
        try {
          if (configurationSection != null)
            linkedHashMap.putAll(configurationSection.getValues(paramBoolean)); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    mapChildrenValues(linkedHashMap, this, paramBoolean);
    return linkedHashMap;
  }
  
  public String getString(String paramString) {
    Object object = getDefault(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return getString(paramString, (object != null) ? object.toString() : null);
  }
  
  public boolean isBoolean(String paramString) {
    Object object = get(paramString);
    return object instanceof Boolean;
  }
  
  public String toString() {
    long l = b ^ 0x2FAD179D5ED6L;
    Configuration configuration = getRoot();
    return getClass().getSimpleName() + "[path='" + getCurrentPath() + "', root='" + ((configuration == null) ? null : configuration.getClass().getSimpleName()) + "']";
  }
  
  public List getFloatList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Float> arrayList = new ArrayList();
    for (Float float_ : list) {
      try {
        if (float_ instanceof Float) {
          arrayList.add(float_);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (float_ instanceof String) {
        try {
          arrayList.add(Float.valueOf((String)float_));
        } catch (Exception exception) {}
        continue;
      } 
      try {
        if (float_ instanceof Character) {
          arrayList.add(Float.valueOf(((Character)float_).charValue()));
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (float_ instanceof Number)
          arrayList.add(Float.valueOf(float_.floatValue())); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public List getStringList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    ArrayList<String> arrayList = new ArrayList();
    for (Object object : list) {
      try {
        if (!(object instanceof String)) {
          try {
            if (isPrimitiveWrapper(object))
              continue; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      continue;
      arrayList.add(String.valueOf(SYNTHETIC_LOCAL_VARIABLE_5));
    } 
    return arrayList;
  }
  
  public List getBooleanList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    ArrayList<Boolean> arrayList = new ArrayList();
    for (Boolean bool : list) {
      try {
        if (bool instanceof Boolean) {
          arrayList.add(bool);
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (bool instanceof String) {
          try {
            if (Boolean.TRUE.toString().equals(bool)) {
              arrayList.add(Boolean.valueOf(true));
              continue;
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          try {
            if (Boolean.FALSE.toString().equals(bool))
              arrayList.add(Boolean.valueOf(false)); 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public List getList(String paramString) {
    Object object = getDefault(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return getList(paramString, (object instanceof List) ? (List)object : null);
  }
  
  public List getMapList(String paramString) {
    List list = getList(paramString);
    ArrayList<Map> arrayList = new ArrayList();
    try {
      if (list == null)
        return arrayList; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (Map map : list) {
      try {
        if (map instanceof Map)
          arrayList.add(map); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public boolean isEmpty() {
    return this.map.isEmpty();
  }
  
  public String getName() {
    return this.path;
  }
  
  public void mapChildrenValues(Map paramMap, ConfigurationSection paramConfigurationSection, boolean paramBoolean) {
    if (paramConfigurationSection instanceof MemorySection) {
      MemorySection memorySection = (MemorySection)paramConfigurationSection;
      for (Map.Entry entry : memorySection.map.entrySet()) {
        try {
          paramMap.put(createPath(paramConfigurationSection, (String)entry.getKey(), this), entry.getValue());
          if (paramBoolean)
            try {
              if (entry.getValue() instanceof ConfigurationSection)
                mapChildrenValues(paramMap, (ConfigurationSection)entry.getValue(), true); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } else {
      Map map = paramConfigurationSection.getValues(paramBoolean);
      for (Map.Entry entry : map.entrySet())
        paramMap.put(createPath(paramConfigurationSection, (String)entry.getKey(), this), entry.getValue()); 
    } 
  }
  
  public int size() {
    return this.map.size();
  }
  
  public Configuration getRoot() {
    return this.root;
  }
  
  public Set getKeys(boolean paramBoolean) {
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    Configuration configuration = getRoot();
    try {
      if (configuration != null && configuration.options().copyDefaults()) {
        ConfigurationSection configurationSection = getDefaultSection();
        try {
          if (configurationSection != null)
            linkedHashSet.addAll(configurationSection.getKeys(paramBoolean)); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    mapChildrenKeys(linkedHashSet, this, paramBoolean);
    return linkedHashSet;
  }
  
  public long getLong(String paramString, long paramLong) {
    Object object = get(paramString, Long.valueOf(paramLong));
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object instanceof Number) ? NumberConversions.toLong(object) : paramLong;
  }
  
  public long getLong(String paramString) {
    Object object = getDefault(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return getLong(paramString, (object instanceof Number) ? NumberConversions.toLong(object) : 0L);
  }
  
  public List getList(String paramString, List paramList) {
    Object object = get(paramString, paramList);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object instanceof List) ? (List)object : paramList;
  }
  
  public int getInt(String paramString) {
    Object object = getDefault(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return getInt(paramString, (object instanceof Number) ? NumberConversions.toInt(object) : 0);
  }
  
  public Object get(String paramString, Object paramObject) {
    long l = b ^ 0x5F39A93AF866L;
    try {
      Validate.notNull(paramString, "Path cannot be null");
      if (paramString.length() == 0)
        return this; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Configuration configuration = getRoot();
    try {
      if (configuration == null)
        throw new IllegalStateException("Cannot access section without a root"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    char c = configuration.options().pathSeparator();
    int i = -1;
    Object object = this;
    int j;
    while ((i = StringUtils.firstSeparatorIndex(paramString, c, j = i + 1)) != -1) {
      String str1 = paramString.substring(j, i);
      object = getSection(object, str1);
      try {
        if (object == null)
          return paramObject; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    String str = paramString.substring(j);
    return getObject(object, str, paramObject);
  }
  
  public List getDoubleList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Double> arrayList = new ArrayList();
    for (Double double_ : list) {
      try {
        if (double_ instanceof Double) {
          arrayList.add(double_);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (double_ instanceof String) {
        try {
          arrayList.add(Double.valueOf((String)double_));
        } catch (Exception exception) {}
        continue;
      } 
      try {
        if (double_ instanceof Character) {
          arrayList.add(Double.valueOf(((Character)double_).charValue()));
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (double_ instanceof Number)
          arrayList.add(Double.valueOf(double_.doubleValue())); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public List getIntegerList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Integer> arrayList = new ArrayList();
    for (Integer integer : list) {
      try {
        if (integer instanceof Integer) {
          arrayList.add(integer);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (integer instanceof String) {
        try {
          arrayList.add(Integer.valueOf((String)integer));
        } catch (Exception exception) {}
        continue;
      } 
      try {
        if (integer instanceof Character) {
          arrayList.add(Integer.valueOf(((Character)integer).charValue()));
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (integer instanceof Number)
          arrayList.add(Integer.valueOf(integer.intValue())); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public ConfigurationSection createSection(String paramString, Map paramMap) {
    ConfigurationSection configurationSection = createSection(paramString);
    for (Map.Entry entry : paramMap.entrySet()) {
      try {
        if (entry.getValue() instanceof Map) {
          configurationSection.createSection(entry.getKey().toString(), (Map)entry.getValue());
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      configurationSection.set(entry.getKey().toString(), entry.getValue());
    } 
    return configurationSection;
  }
  
  public double getDouble(String paramString, double paramDouble) {
    Object object = get(paramString, Double.valueOf(paramDouble));
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object instanceof Number) ? NumberConversions.toDouble(object) : paramDouble;
  }
  
  public double getDouble(String paramString) {
    Object object = getDefault(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return getDouble(paramString, (object instanceof Number) ? NumberConversions.toDouble(object) : 0.0D);
  }
  
  public MemorySection(ConfigurationSection paramConfigurationSection, String paramString) {
    Validate.notNull(paramConfigurationSection, "Parent cannot be null");
    Validate.notNull(paramString, "Path cannot be null");
    this.path = paramString;
    this.parent = paramConfigurationSection;
    this.root = paramConfigurationSection.getRoot();
    Validate.notNull(this.root, "Path cannot be orphaned");
    this.fullPath = createPath(paramConfigurationSection, paramString);
  }
  
  public boolean contains(String paramString) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (get(paramString) != null);
  }
  
  public static String createPath(ConfigurationSection paramConfigurationSection1, String paramString, ConfigurationSection paramConfigurationSection2) {
    long l = b ^ 0x4D39CFD8C01DL;
    Validate.notNull(paramConfigurationSection1, "Cannot create path without a section");
    Configuration configuration = paramConfigurationSection1.getRoot();
    try {
      if (configuration == null)
        throw new IllegalStateException("Cannot create path without a root"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    char c = configuration.options().pathSeparator();
    StringBuilder stringBuilder = new StringBuilder();
    ConfigurationSection configurationSection = paramConfigurationSection1;
    while (true) {
      try {
        if (configurationSection != null)
          try {
            if (configurationSection != paramConfigurationSection2) {
              try {
                if (stringBuilder.length() > 0)
                  stringBuilder.insert(0, c); 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              stringBuilder.insert(0, configurationSection.getName());
              configurationSection = configurationSection.getParent();
              continue;
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (paramString != null)
        try {
          if (paramString.length() > 0) {
            try {
              if (stringBuilder.length() > 0)
                stringBuilder.append(c); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            stringBuilder.append(paramString);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  public List getByteList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Byte> arrayList = new ArrayList();
    for (Byte byte_ : list) {
      try {
        if (byte_ instanceof Byte) {
          arrayList.add(byte_);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (byte_ instanceof String) {
        try {
          arrayList.add(Byte.valueOf((String)byte_));
        } catch (Exception exception) {}
        continue;
      } 
      try {
        if (byte_ instanceof Character) {
          arrayList.add(Byte.valueOf((byte)((Character)byte_).charValue()));
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (byte_ instanceof Number)
          arrayList.add(Byte.valueOf(byte_.byteValue())); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public boolean getBoolean(String paramString) {
    Object object = getDefault(paramString);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return getBoolean(paramString, (object instanceof Boolean) ? ((Boolean)object).booleanValue() : false);
  }
  
  public String getCurrentPath() {
    return this.fullPath;
  }
  
  public List getCharacterList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    ArrayList<Character> arrayList = new ArrayList();
    for (Character character : list) {
      try {
        if (character instanceof Character) {
          arrayList.add(character);
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      if (character instanceof String) {
        String str = (String)character;
        try {
          if (str.length() == 1)
            arrayList.add(Character.valueOf(str.charAt(0))); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        continue;
      } 
      try {
        if (character instanceof Number)
          arrayList.add(Character.valueOf((char)((Number)character).intValue())); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public void addDefault(String paramString, Object paramObject) {
    long l = b ^ 0x2AAEA64217CEL;
    Validate.notNull(paramString, "Path cannot be null");
    Configuration configuration = getRoot();
    try {
      if (configuration == null)
        throw new IllegalStateException("Cannot add default without root"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (configuration == this)
        throw new UnsupportedOperationException("Unsupported addDefault(String, Object) implementation"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    configuration.addDefault(createPath(this, paramString), paramObject);
  }
  
  public void set(String paramString, Object paramObject) {
    long l = b ^ 0x31284D2F7888L;
    Validate.notNull(paramString, "Path cannot be null");
    Configuration configuration = getRoot();
    try {
      if (configuration == null)
        throw new IllegalStateException("Cannot use section without a root"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    char c = configuration.options().pathSeparator();
    int i = -1;
    Object object = this;
    int j;
    while ((i = StringUtils.firstSeparatorIndex(paramString, c, j = i + 1)) != -1) {
      String str1 = paramString.substring(j, i);
      Object object1 = getSection(object, str1);
      try {
        if (object1 == null) {
          if (object instanceof ConfigurationSection) {
            ConfigurationSection configurationSection = object.createSection(str1);
            continue;
          } 
          return;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      object = object1;
    } 
    String str = paramString.substring(j);
    setObject(object, str, paramObject);
  }
  
  public boolean isDouble(String paramString) {
    Object object = get(paramString);
    return object instanceof Double;
  }
  
  public String getString(String paramString1, String paramString2) {
    Object object = get(paramString1, paramString2);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object != null) ? object.toString() : paramString2;
  }
  
  public List getShortList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Short> arrayList = new ArrayList();
    for (Short short_ : list) {
      try {
        if (short_ instanceof Short) {
          arrayList.add(short_);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (short_ instanceof String) {
        try {
          arrayList.add(Short.valueOf((String)short_));
        } catch (Exception exception) {}
        continue;
      } 
      try {
        if (short_ instanceof Character) {
          arrayList.add(Short.valueOf((short)((Character)short_).charValue()));
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (short_ instanceof Number)
          arrayList.add(Short.valueOf(short_.shortValue())); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public List getLongList(String paramString) {
    List list = getList(paramString);
    try {
      if (list == null)
        return new ArrayList(0); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Long> arrayList = new ArrayList();
    for (Long long_ : list) {
      try {
        if (long_ instanceof Long) {
          arrayList.add(long_);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (long_ instanceof String) {
        try {
          arrayList.add(Long.valueOf((String)long_));
        } catch (Exception exception) {}
        continue;
      } 
      try {
        if (long_ instanceof Character) {
          arrayList.add(Long.valueOf(((Character)long_).charValue()));
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (long_ instanceof Number)
          arrayList.add(Long.valueOf(long_.longValue())); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  public boolean isLong(String paramString) {
    Object object = get(paramString);
    return object instanceof Long;
  }
  
  public boolean isPrimitiveWrapper(Object paramObject) {
    try {
      if (!(paramObject instanceof Integer))
        try {
          if (!(paramObject instanceof Boolean))
            try {
              if (!(paramObject instanceof Character))
                try {
                  if (!(paramObject instanceof Byte))
                    try {
                      if (!(paramObject instanceof Short))
                        try {
                          if (!(paramObject instanceof Double))
                            try {
                              if (!(paramObject instanceof Long)) {
                                try {
                                  if (paramObject instanceof Float);
                                } catch (IllegalStateException illegalStateException) {
                                  throw a(null);
                                } 
                                return false;
                              } 
                            } catch (IllegalStateException illegalStateException) {
                              throw a(null);
                            }  
                        } catch (IllegalStateException illegalStateException) {
                          throw a(null);
                        }  
                    } catch (IllegalStateException illegalStateException) {
                      throw a(null);
                    }  
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                }  
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public ConfigurationSection getConfigurationSection(String paramString) {
    Object object = get(paramString, null);
    try {
      if (object != null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return (object instanceof ConfigurationSection) ? (ConfigurationSection)object : null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    object = get(paramString, getDefault(paramString));
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object instanceof ConfigurationSection) ? createSection(paramString) : null;
  }
  
  public Object get(String paramString) {
    return get(paramString, getDefault(paramString));
  }
  
  public boolean isSet(String paramString) {
    Configuration configuration = getRoot();
    try {
      if (configuration == null)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (configuration.options().copyDefaults())
        return contains(paramString); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (get(paramString, null) != null);
  }
  
  public boolean isString(String paramString) {
    Object object = get(paramString);
    return object instanceof String;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean) {
    Object object = get(paramString, Boolean.valueOf(paramBoolean));
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object instanceof Boolean) ? ((Boolean)object).booleanValue() : paramBoolean;
  }
  
  public MemorySection() {
    if (!(this instanceof Configuration))
      throw new IllegalStateException("Cannot construct a root MemorySection when not a Configuration"); 
    this.path = "";
    this.fullPath = "";
    this.parent = null;
    this.root = (Configuration)this;
  }
  
  public ConfigurationSection getDefaultSection() {
    Configuration configuration1 = getRoot();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Configuration configuration2 = (configuration1 == null) ? null : configuration1.getDefaults();
    try {
      if (configuration2 != null)
        try {
          if (configuration2.isConfigurationSection(getCurrentPath()))
            return configuration2.getConfigurationSection(getCurrentPath()); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public boolean isInt(String paramString) {
    Object object = get(paramString);
    return object instanceof Integer;
  }
  
  public Object getDefault(String paramString) {
    long l = b ^ 0x43562BFC75C8L;
    Validate.notNull(paramString, "Path cannot be null");
    Configuration configuration1 = getRoot();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Configuration configuration2 = (configuration1 == null) ? null : configuration1.getDefaults();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (configuration2 == null) ? null : configuration2.get(createPath(this, paramString));
  }
  
  public boolean isConfigurationSection(String paramString) {
    Object object = get(paramString);
    return object instanceof ConfigurationSection;
  }
  
  public boolean isList(String paramString) {
    Object object = get(paramString);
    return object instanceof List;
  }
  
  public Map getMapValues(boolean paramBoolean) {
    return (Map)getValues(paramBoolean).entrySet().stream().map(paramEntry -> {
          String str = (String)paramEntry.getKey();
          Object object = paramEntry.getValue();
          try {
            if (object instanceof ConfigurationSection)
              return (Function)new AbstractMap.SimpleEntry<>(str, ((ConfigurationSection)object).getMapValues(paramBoolean)); 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return (Function)new AbstractMap.SimpleEntry<>(str, object);
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  }
  
  public int getInt(String paramString, int paramInt) {
    Object object = get(paramString, Integer.valueOf(paramInt));
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object instanceof Number) ? NumberConversions.toInt(object) : paramInt;
  }
  
  public void mapChildrenKeys(Set<String> paramSet, ConfigurationSection paramConfigurationSection, boolean paramBoolean) {
    if (paramConfigurationSection instanceof MemorySection) {
      MemorySection memorySection = (MemorySection)paramConfigurationSection;
      for (Map.Entry entry : memorySection.map.entrySet()) {
        try {
          paramSet.add(createPath(paramConfigurationSection, (String)entry.getKey(), this));
          if (paramBoolean && entry.getValue() instanceof ConfigurationSection) {
            ConfigurationSection configurationSection = (ConfigurationSection)entry.getValue();
            mapChildrenKeys(paramSet, configurationSection, paramBoolean);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } else {
      Set set = paramConfigurationSection.getKeys(paramBoolean);
      for (String str : set)
        paramSet.add(createPath(paramConfigurationSection, str, this)); 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\MemorySection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */