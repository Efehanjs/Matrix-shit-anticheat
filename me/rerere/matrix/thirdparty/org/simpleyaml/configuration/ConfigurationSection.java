package me.rerere.matrix.thirdparty.org.simpleyaml.configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ConfigurationSection {
  Object get(String paramString, Object paramObject);
  
  Object get(String paramString);
  
  default void remove(String paramString) {
    set(paramString, null);
  }
  
  String getCurrentPath();
  
  int getInt(String paramString, int paramInt);
  
  String getString(String paramString);
  
  List getBooleanList(String paramString);
  
  Set getKeys(boolean paramBoolean);
  
  List getMapList(String paramString);
  
  List getStringList(String paramString);
  
  ConfigurationSection getConfigurationSection(String paramString);
  
  double getDouble(String paramString, double paramDouble);
  
  boolean isLong(String paramString);
  
  List getCharacterList(String paramString);
  
  List getList(String paramString);
  
  double getDouble(String paramString);
  
  List getList(String paramString, List paramList);
  
  List getShortList(String paramString);
  
  long getLong(String paramString);
  
  boolean isSet(String paramString);
  
  String getName();
  
  long getLong(String paramString, long paramLong);
  
  boolean getBoolean(String paramString);
  
  Configuration getRoot();
  
  boolean isEmpty();
  
  Map getMapValues(boolean paramBoolean);
  
  boolean getBoolean(String paramString, boolean paramBoolean);
  
  ConfigurationSection createSection(String paramString);
  
  boolean isConfigurationSection(String paramString);
  
  List getDoubleList(String paramString);
  
  boolean isList(String paramString);
  
  int size();
  
  List getIntegerList(String paramString);
  
  Map getValues(boolean paramBoolean);
  
  String getString(String paramString1, String paramString2);
  
  ConfigurationSection getDefaultSection();
  
  List getByteList(String paramString);
  
  List getFloatList(String paramString);
  
  ConfigurationSection getParent();
  
  void addDefault(String paramString, Object paramObject);
  
  List getLongList(String paramString);
  
  boolean isString(String paramString);
  
  void set(String paramString, Object paramObject);
  
  boolean isBoolean(String paramString);
  
  boolean contains(String paramString);
  
  boolean isDouble(String paramString);
  
  ConfigurationSection createSection(String paramString, Map paramMap);
  
  boolean isInt(String paramString);
  
  int getInt(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\ConfigurationSection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */