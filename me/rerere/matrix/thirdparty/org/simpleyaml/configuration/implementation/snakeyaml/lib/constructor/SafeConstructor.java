package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeConstructor extends BaseConstructor {
  private static final int[][] RADIX_MAX;
  
  private static final Pattern YMD_REGEXP;
  
  private static final Pattern TIMESTAMP_REGEXP;
  
  public static final SafeConstructor$ConstructUndefined undefinedConstructor;
  
  private static final Map BOOL_VALUES;
  
  private static final long c = o3.a(-751438226991847103L, -4493733931201723198L, MethodHandles.lookup().lookupClass()).a(64942159257425L);
  
  @Deprecated
  public SafeConstructor() {
    this(new LoaderOptions());
  }
  
  public void processDuplicateKeys(MappingNode paramMappingNode) {
    processDuplicateKeys(paramMappingNode, false);
  }
  
  static {
    long l = c ^ 0x607C9028705AL;
    undefinedConstructor = new SafeConstructor$ConstructUndefined();
    BOOL_VALUES = new HashMap<>();
    BOOL_VALUES.put("yes", Boolean.TRUE);
    BOOL_VALUES.put("no", Boolean.FALSE);
    BOOL_VALUES.put("true", Boolean.TRUE);
    BOOL_VALUES.put("false", Boolean.FALSE);
    BOOL_VALUES.put("on", Boolean.TRUE);
    BOOL_VALUES.put("off", Boolean.FALSE);
    RADIX_MAX = new int[17][2];
    int[] arrayOfInt = { 2, 8, 10, 16 };
    for (int i : arrayOfInt) {
      (new int[2])[0] = maxLen(2147483647, i);
      (new int[2])[1] = maxLen(Long.MAX_VALUE, i);
      RADIX_MAX[i] = new int[2];
    } 
    TIMESTAMP_REGEXP = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
    YMD_REGEXP = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
  }
  
  public void flattenMapping(MappingNode paramMappingNode) {
    flattenMapping(paramMappingNode, false);
  }
  
  public void processDuplicateKeys(MappingNode paramMappingNode, boolean paramBoolean) {
    long l = c ^ 0x343DF64FF4B7L;
    List list = paramMappingNode.getValue();
    HashMap<Object, Object> hashMap = new HashMap<>(list.size());
    TreeSet<Integer> treeSet = new TreeSet();
    int i = 0;
    for (NodeTuple nodeTuple : list) {
      Node node = nodeTuple.getKeyNode();
      try {
        if (!node.getTag().equals(Tag.MERGE)) {
          try {
            if (paramBoolean)
              try {
                if (node instanceof me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode) {
                  node.setType(String.class);
                  node.setTag(Tag.STR);
                } else {
                  throw new YAMLException("Keys must be scalars but found: " + node);
                } 
              } catch (Exception exception) {
                throw b(null);
              }  
          } catch (Exception exception) {
            throw b(null);
          } 
          Object object = constructObject(node);
          try {
            if (object != null)
              try {
                if (!paramBoolean)
                  try {
                    if (node.isTwoStepsConstruction()) {
                      try {
                        if (!this.loadingConfig.getAllowRecursiveKeys())
                          throw new YAMLException("Recursive key for mapping is detected but it is not configured to be allowed."); 
                      } catch (Exception exception) {
                        throw b(null);
                      } 
                      try {
                        object.hashCode();
                      } catch (Exception exception) {
                        throw new ConstructorException("while constructing a mapping", paramMappingNode.getStartMark(), "found unacceptable key " + object, nodeTuple.getKeyNode().getStartMark(), exception);
                      } 
                    } 
                  } catch (Exception exception) {
                    throw b(null);
                  }  
              } catch (Exception exception) {
                throw b(null);
              }  
          } catch (Exception exception) {
            throw b(null);
          } 
          Integer integer = (Integer)hashMap.put(object, Integer.valueOf(i));
          try {
            if (integer != null) {
              try {
                if (!isAllowDuplicateKeys())
                  throw new DuplicateKeyException(paramMappingNode.getStartMark(), object, nodeTuple.getKeyNode().getStartMark()); 
              } catch (Exception exception) {
                throw b(null);
              } 
              treeSet.add(integer);
            } 
          } catch (Exception exception) {
            throw b(null);
          } 
        } 
      } catch (Exception exception) {
        throw b(null);
      } 
      i++;
    } 
    Iterator<Integer> iterator = treeSet.descendingIterator();
    try {
      while (iterator.hasNext())
        list.remove(((Integer)iterator.next()).intValue()); 
    } catch (Exception exception) {
      throw b(null);
    } 
  }
  
  public static Number createLongOrBigInteger(String paramString, int paramInt) {
    try {
      return Long.valueOf(paramString, paramInt);
    } catch (NumberFormatException numberFormatException) {
      return new BigInteger(paramString, paramInt);
    } 
  }
  
  public void constructSet2ndStep(MappingNode paramMappingNode, Set paramSet) {
    flattenMapping(paramMappingNode);
    super.constructSet2ndStep(paramMappingNode, paramSet);
  }
  
  public void constructMapping2ndStep(MappingNode paramMappingNode, Map paramMap) {
    flattenMapping(paramMappingNode);
    super.constructMapping2ndStep(paramMappingNode, paramMap);
  }
  
  public SafeConstructor(LoaderOptions paramLoaderOptions) {
    super(paramLoaderOptions);
    this.yamlConstructors.put(Tag.NULL, new SafeConstructor$ConstructYamlNull(this));
    this.yamlConstructors.put(Tag.BOOL, new SafeConstructor$ConstructYamlBool(this));
    this.yamlConstructors.put(Tag.INT, new SafeConstructor$ConstructYamlInt(this));
    this.yamlConstructors.put(Tag.FLOAT, new SafeConstructor$ConstructYamlFloat(this));
    this.yamlConstructors.put(Tag.BINARY, new SafeConstructor$ConstructYamlBinary(this));
    this.yamlConstructors.put(Tag.TIMESTAMP, new SafeConstructor$ConstructYamlTimestamp());
    this.yamlConstructors.put(Tag.OMAP, new SafeConstructor$ConstructYamlOmap(this));
    this.yamlConstructors.put(Tag.PAIRS, new SafeConstructor$ConstructYamlPairs(this));
    this.yamlConstructors.put(Tag.SET, new SafeConstructor$ConstructYamlSet(this));
    this.yamlConstructors.put(Tag.STR, new SafeConstructor$ConstructYamlStr(this));
    this.yamlConstructors.put(Tag.SEQ, new SafeConstructor$ConstructYamlSeq(this));
    this.yamlConstructors.put(Tag.MAP, new SafeConstructor$ConstructYamlMap(this));
    this.yamlConstructors.put(null, undefinedConstructor);
    this.yamlClassConstructors.put(NodeId.scalar, undefinedConstructor);
    this.yamlClassConstructors.put(NodeId.sequence, undefinedConstructor);
    this.yamlClassConstructors.put(NodeId.mapping, undefinedConstructor);
  }
  
  public void flattenMapping(MappingNode paramMappingNode, boolean paramBoolean) {
    try {
      processDuplicateKeys(paramMappingNode, paramBoolean);
      if (paramMappingNode.isMerged())
        paramMappingNode.setValue(mergeNode(paramMappingNode, true, new HashMap<>(), new ArrayList(), paramBoolean)); 
    } catch (ConstructorException constructorException) {
      throw b(null);
    } 
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */