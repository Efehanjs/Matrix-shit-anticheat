package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.TypeDescription;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.composer.Composer;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.PropertyUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.CollectionNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public abstract class BaseConstructor {
  private PropertyUtils propertyUtils;
  
  private boolean allowDuplicateKeys = true;
  
  public final Map typeDefinitions = new HashMap<>();
  
  private final ArrayList sets2fill = new ArrayList();
  
  private final ArrayList maps2fill = new ArrayList();
  
  public final Map typeTags = new HashMap<>();
  
  private final Set recursiveObjects = new HashSet();
  
  public Composer composer;
  
  public final Map yamlMultiConstructors = new HashMap<>();
  
  public LoaderOptions loadingConfig;
  
  public final Map yamlConstructors = new HashMap<>();
  
  private boolean explicitPropertyUtils = false;
  
  public Tag rootTag = null;
  
  private boolean enumCaseSensitive = false;
  
  public final Map yamlClassConstructors = new EnumMap<>(NodeId.class);
  
  private boolean wrappedToRootException = false;
  
  public final Map constructedObjects = new HashMap<>();
  
  public static final Object NOT_INSTANTIATED_OBJECT;
  
  private static final long b = o3.a(-8894375578199000124L, 4867550902497547815L, MethodHandles.lookup().lookupClass()).a(199651318198839L);
  
  public final PropertyUtils getPropertyUtils() {
    try {
      if (this.propertyUtils == null)
        this.propertyUtils = new PropertyUtils(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return this.propertyUtils;
  }
  
  public boolean isEnumCaseSensitive() {
    return this.enumCaseSensitive;
  }
  
  public void postponeMapFilling(Map paramMap, Object paramObject1, Object paramObject2) {
    this.maps2fill.add(0, new BaseConstructor$RecursiveTuple(paramMap, new BaseConstructor$RecursiveTuple(paramObject1, paramObject2)));
  }
  
  public void setPropertyUtils(PropertyUtils paramPropertyUtils) {
    this.propertyUtils = paramPropertyUtils;
    this.explicitPropertyUtils = true;
    Collection collection = this.typeDefinitions.values();
    for (TypeDescription typeDescription : collection)
      typeDescription.setPropertyUtils(paramPropertyUtils); 
  }
  
  public List createDefaultList(int paramInt) {
    return new ArrayList(paramInt);
  }
  
  public Object getData() throws NoSuchElementException {
    long l = b ^ 0x1C122E2200A1L;
    try {
      if (!this.composer.checkNode())
        throw new NoSuchElementException("No document is available."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Node node = this.composer.getNode();
    try {
      if (this.rootTag != null)
        node.setTag(this.rootTag); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return constructDocument(node);
  }
  
  public final Object constructDocument(Node paramNode) {
    try {
      Object object = constructObject(paramNode);
      fillRecursive();
      return object;
    } catch (RuntimeException runtimeException) {
      try {
        if (this.wrappedToRootException)
          try {
            if (!(runtimeException instanceof YAMLException))
              throw new YAMLException(runtimeException); 
          } catch (RuntimeException runtimeException1) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException1) {
        throw a(null);
      } 
      throw runtimeException;
    } finally {
      this.constructedObjects.clear();
      this.recursiveObjects.clear();
    } 
  }
  
  public boolean isAllowDuplicateKeys() {
    return this.allowDuplicateKeys;
  }
  
  public Object constructArray(SequenceNode paramSequenceNode) {
    return constructArrayStep2(paramSequenceNode, createArray(paramSequenceNode.getType(), paramSequenceNode.getValue().size()));
  }
  
  public Set constructSet(MappingNode paramMappingNode) {
    Set set = newSet((CollectionNode)paramMappingNode);
    constructSet2ndStep(paramMappingNode, set);
    return set;
  }
  
  public void constructSet2ndStep(MappingNode paramMappingNode, Set<Object> paramSet) {
    long l = b ^ 0x6665333FD890L;
    List list = paramMappingNode.getValue();
    for (NodeTuple nodeTuple : list) {
      Node node = nodeTuple.getKeyNode();
      Object object = constructObject(node);
      if (object != null)
        try {
          object.hashCode();
        } catch (Exception exception) {
          throw new ConstructorException("while constructing a Set", paramMappingNode.getStartMark(), "found unacceptable key " + object, nodeTuple.getKeyNode().getStartMark(), exception);
        }  
      try {
        if (node.isTwoStepsConstruction()) {
          postponeSetFilling(paramSet, object);
          continue;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      paramSet.add(object);
    } 
  }
  
  public void setAllowDuplicateKeys(boolean paramBoolean) {
    this.allowDuplicateKeys = paramBoolean;
  }
  
  public Set constructSet(SequenceNode paramSequenceNode) {
    Set set = newSet((CollectionNode)paramSequenceNode);
    constructSequenceStep2(paramSequenceNode, set);
    return set;
  }
  
  public void setWrappedToRootException(boolean paramBoolean) {
    this.wrappedToRootException = paramBoolean;
  }
  
  public Object constructObjectNoCheck(Node paramNode) {
    long l = b ^ 0x37616EE40261L;
    try {
      if (this.recursiveObjects.contains(paramNode))
        throw new ConstructorException(null, null, "found unconstructable recursive node", paramNode.getStartMark()); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.recursiveObjects.add(paramNode);
    Construct construct = getConstructor(paramNode);
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Object object = this.constructedObjects.containsKey(paramNode) ? this.constructedObjects.get(paramNode) : construct.construct(paramNode);
    try {
      finalizeConstruction(paramNode, object);
      this.constructedObjects.put(paramNode, object);
      this.recursiveObjects.remove(paramNode);
      if (paramNode.isTwoStepsConstruction())
        construct.construct2ndStep(paramNode, object); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return object;
  }
  
  public Object newInstance(Class paramClass, Node paramNode, boolean paramBoolean) {
    try {
      Class<?> clazz = paramNode.getType();
      if (this.typeDefinitions.containsKey(clazz)) {
        TypeDescription typeDescription = (TypeDescription)this.typeDefinitions.get(clazz);
        Object object = typeDescription.newInstance(paramNode);
        if (object != null)
          return object; 
      } 
      try {
        if (paramBoolean)
          try {
            if (paramClass.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers())) {
              Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[0]);
              constructor.setAccessible(true);
              return constructor.newInstance(new Object[0]);
            } 
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      throw new YAMLException(exception);
    } 
    return NOT_INSTANTIATED_OBJECT;
  }
  
  public boolean isWrappedToRootException() {
    return this.wrappedToRootException;
  }
  
  public String constructScalar(ScalarNode paramScalarNode) {
    return paramScalarNode.getValue();
  }
  
  public Object getSingleData(Class<Object> paramClass) {
    Node node = this.composer.getSingleNode();
    try {
      if (node != null)
        try {
          if (!Tag.NULL.equals(node.getTag())) {
            try {
              if (Object.class != paramClass) {
                node.setTag(new Tag(paramClass));
              } else {
                try {
                  if (this.rootTag != null)
                    node.setTag(this.rootTag); 
                } catch (NoSuchElementException noSuchElementException) {
                  throw a(null);
                } 
              } 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            return constructDocument(node);
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Construct construct = (Construct)this.yamlConstructors.get(Tag.NULL);
    return construct.construct(node);
  }
  
  public List constructSequence(SequenceNode paramSequenceNode) {
    List list = newList(paramSequenceNode);
    constructSequenceStep2(paramSequenceNode, list);
    return list;
  }
  
  public boolean checkData() {
    return this.composer.checkNode();
  }
  
  public Object constructObject(Node paramNode) {
    try {
      if (this.constructedObjects.containsKey(paramNode))
        return this.constructedObjects.get(paramNode); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return constructObjectNoCheck(paramNode);
  }
  
  public Object finalizeConstruction(Node paramNode, Object paramObject) {
    Class clazz = paramNode.getType();
    try {
      if (this.typeDefinitions.containsKey(clazz))
        return ((TypeDescription)this.typeDefinitions.get(clazz)).finalizeConstruction(paramObject); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramObject;
  }
  
  public Set createDefaultSet(int paramInt) {
    return new LinkedHashSet(paramInt);
  }
  
  public BaseConstructor(LoaderOptions paramLoaderOptions) {
    this.typeDefinitions.put(SortedMap.class, new TypeDescription(SortedMap.class, Tag.OMAP, TreeMap.class));
    this.typeDefinitions.put(SortedSet.class, new TypeDescription(SortedSet.class, Tag.SET, TreeSet.class));
    this.loadingConfig = paramLoaderOptions;
  }
  
  public List newList(SequenceNode paramSequenceNode) {
    Object object = newInstance(List.class, (Node)paramSequenceNode);
    try {
      if (object != NOT_INSTANTIATED_OBJECT)
        return (List)object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return createDefaultList(paramSequenceNode.getValue().size());
  }
  
  public Map newMap(MappingNode paramMappingNode) {
    Object object = newInstance(Map.class, (Node)paramMappingNode);
    try {
      if (object != NOT_INSTANTIATED_OBJECT)
        return (Map)object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return createDefaultMap(paramMappingNode.getValue().size());
  }
  
  public TypeDescription addTypeDescription(TypeDescription paramTypeDescription) {
    long l = b ^ 0x374609B81FD6L;
    try {
      if (paramTypeDescription == null)
        throw new NullPointerException("TypeDescription is required."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Tag tag = paramTypeDescription.getTag();
    this.typeTags.put(tag, paramTypeDescription.getType());
    paramTypeDescription.setPropertyUtils(getPropertyUtils());
    return this.typeDefinitions.put(paramTypeDescription.getType(), paramTypeDescription);
  }
  
  public void setEnumCaseSensitive(boolean paramBoolean) {
    this.enumCaseSensitive = paramBoolean;
  }
  
  public Construct getConstructor(Node paramNode) {
    try {
      if (paramNode.useClassConstructor())
        return (Construct)this.yamlClassConstructors.get(paramNode.getNodeId()); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Construct construct = (Construct)this.yamlConstructors.get(paramNode.getTag());
    if (construct == null) {
      for (String str : this.yamlMultiConstructors.keySet()) {
        try {
          if (paramNode.getTag().startsWith(str))
            return (Construct)this.yamlMultiConstructors.get(str); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } 
      return (Construct)this.yamlConstructors.get(null);
    } 
    return construct;
  }
  
  public Object newInstance(Node paramNode) {
    return newInstance(Object.class, paramNode);
  }
  
  public void constructMapping2ndStep(MappingNode paramMappingNode, Map<Object, Object> paramMap) {
    long l = b ^ 0x2D63CDA87DD4L;
    List list = paramMappingNode.getValue();
    for (NodeTuple nodeTuple : list) {
      Node node1 = nodeTuple.getKeyNode();
      Node node2 = nodeTuple.getValueNode();
      Object object1 = constructObject(node1);
      if (object1 != null)
        try {
          object1.hashCode();
        } catch (Exception exception) {
          throw new ConstructorException("while constructing a mapping", paramMappingNode.getStartMark(), "found unacceptable key " + object1, nodeTuple.getKeyNode().getStartMark(), exception);
        }  
      Object object2 = constructObject(node2);
      try {
        if (node1.isTwoStepsConstruction()) {
          try {
            if (this.loadingConfig.getAllowRecursiveKeys()) {
              postponeMapFilling(paramMap, object1, object2);
              continue;
            } 
          } catch (Exception exception) {
            throw a(null);
          } 
          throw new YAMLException("Recursive key for mapping is detected but it is not configured to be allowed.");
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      paramMap.put(object1, object2);
    } 
  }
  
  public void constructSequenceStep2(SequenceNode paramSequenceNode, Collection<Object> paramCollection) {
    for (Node node : paramSequenceNode.getValue())
      paramCollection.add(constructObject(node)); 
  }
  
  static {
    NOT_INSTANTIATED_OBJECT = new Object();
  }
  
  public final boolean isExplicitPropertyUtils() {
    return this.explicitPropertyUtils;
  }
  
  public Object createArray(Class paramClass, int paramInt) {
    return Array.newInstance(paramClass.getComponentType(), paramInt);
  }
  
  public final Object newInstance(Class paramClass, Node paramNode) {
    return newInstance(paramClass, paramNode, true);
  }
  
  @Deprecated
  public BaseConstructor() {
    this(new LoaderOptions());
  }
  
  public Object constructArrayStep2(SequenceNode paramSequenceNode, Object paramObject) {
    long l = b ^ 0x6AEC21F76DEAL;
    Class<?> clazz = paramSequenceNode.getType().getComponentType();
    byte b = 0;
    for (Node node : paramSequenceNode.getValue()) {
      try {
        if (node.getType() == Object.class)
          node.setType(clazz); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      Object object = constructObject(node);
      try {
        if (clazz.isPrimitive()) {
          try {
            if (object == null)
              throw new NullPointerException("Unable to construct element value for " + node); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
          try {
            if (byte.class.equals(clazz)) {
              Array.setByte(paramObject, b, ((Number)object).byteValue());
            } else {
              try {
                if (short.class.equals(clazz)) {
                  Array.setShort(paramObject, b, ((Number)object).shortValue());
                } else {
                  try {
                    if (int.class.equals(clazz)) {
                      Array.setInt(paramObject, b, ((Number)object).intValue());
                    } else {
                      try {
                        if (long.class.equals(clazz)) {
                          Array.setLong(paramObject, b, ((Number)object).longValue());
                        } else {
                          try {
                            if (float.class.equals(clazz)) {
                              Array.setFloat(paramObject, b, ((Number)object).floatValue());
                            } else {
                              try {
                                if (double.class.equals(clazz)) {
                                  Array.setDouble(paramObject, b, ((Number)object).doubleValue());
                                } else {
                                  try {
                                    if (char.class.equals(clazz)) {
                                      Array.setChar(paramObject, b, ((Character)object).charValue());
                                    } else {
                                      try {
                                        if (boolean.class.equals(clazz)) {
                                          Array.setBoolean(paramObject, b, ((Boolean)object).booleanValue());
                                        } else {
                                          throw new YAMLException("unexpected primitive type");
                                        } 
                                      } catch (NoSuchElementException noSuchElementException) {
                                        throw a(null);
                                      } 
                                    } 
                                  } catch (NoSuchElementException noSuchElementException) {
                                    throw a(null);
                                  } 
                                } 
                              } catch (NoSuchElementException noSuchElementException) {
                                throw a(null);
                              } 
                            } 
                          } catch (NoSuchElementException noSuchElementException) {
                            throw a(null);
                          } 
                        } 
                      } catch (NoSuchElementException noSuchElementException) {
                        throw a(null);
                      } 
                    } 
                  } catch (NoSuchElementException noSuchElementException) {
                    throw a(null);
                  } 
                } 
              } catch (NoSuchElementException noSuchElementException) {
                throw a(null);
              } 
            } 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          } 
        } else {
          Array.set(paramObject, b, object);
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
    } 
    return paramObject;
  }
  
  public Map constructMapping(MappingNode paramMappingNode) {
    Map map = newMap(paramMappingNode);
    constructMapping2ndStep(paramMappingNode, map);
    return map;
  }
  
  public void postponeSetFilling(Set paramSet, Object paramObject) {
    this.sets2fill.add(0, new BaseConstructor$RecursiveTuple(paramSet, paramObject));
  }
  
  public Map createDefaultMap(int paramInt) {
    return new LinkedHashMap<>(paramInt);
  }
  
  public Set newSet(CollectionNode paramCollectionNode) {
    Object object = newInstance(Set.class, (Node)paramCollectionNode);
    try {
      if (object != NOT_INSTANTIATED_OBJECT)
        return (Set)object; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return createDefaultSet(paramCollectionNode.getValue().size());
  }
  
  public void setComposer(Composer paramComposer) {
    this.composer = paramComposer;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\BaseConstructor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */