package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.TypeDescription;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.Property;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.PropertyUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class Representer extends SafeRepresenter {
  public Map typeDefinitions = Collections.emptyMap();
  
  public Set getProperties(Class paramClass) {
    try {
      if (this.typeDefinitions.containsKey(paramClass))
        return ((TypeDescription)this.typeDefinitions.get(paramClass)).getProperties(); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return getPropertyUtils().getProperties(paramClass);
  }
  
  public void checkGlobalTag(Property paramProperty, Node paramNode, Object paramObject) {
    try {
      if (paramObject.getClass().isArray())
        try {
          if (paramObject.getClass().getComponentType().isPrimitive())
            return; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Class[] arrayOfClass = paramProperty.getActualTypeArguments();
    try {
      if (arrayOfClass != null)
        if (paramNode.getNodeId() == NodeId.sequence) {
          Class clazz = arrayOfClass[0];
          SequenceNode sequenceNode = (SequenceNode)paramNode;
          Iterable iterable = Collections.EMPTY_LIST;
          if (paramObject.getClass().isArray()) {
            iterable = Arrays.asList((Object[])paramObject);
          } else if (paramObject instanceof Iterable) {
            iterable = (Iterable)paramObject;
          } 
          Iterator<Object> iterator = iterable.iterator();
          if (iterator.hasNext())
            for (Node node : sequenceNode.getValue()) {
              Object object = iterator.next();
              try {
                if (object != null)
                  try {
                    if (clazz.equals(object.getClass()))
                      try {
                        if (node.getNodeId() == NodeId.mapping)
                          node.setTag(Tag.MAP); 
                      } catch (RuntimeException runtimeException) {
                        throw b(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw b(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw b(null);
              } 
            }  
        } else if (paramObject instanceof Set) {
          Class clazz = arrayOfClass[0];
          MappingNode mappingNode = (MappingNode)paramNode;
          Iterator<NodeTuple> iterator = mappingNode.getValue().iterator();
          Set set = (Set)paramObject;
          for (Object object : set) {
            NodeTuple nodeTuple = iterator.next();
            Node node = nodeTuple.getKeyNode();
            try {
              if (clazz.equals(object.getClass()))
                try {
                  if (node.getNodeId() == NodeId.mapping)
                    node.setTag(Tag.MAP); 
                } catch (RuntimeException runtimeException) {
                  throw b(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
          } 
        } else if (paramObject instanceof Map) {
          Class clazz1 = arrayOfClass[0];
          Class clazz2 = arrayOfClass[1];
          MappingNode mappingNode = (MappingNode)paramNode;
          for (NodeTuple nodeTuple : mappingNode.getValue()) {
            resetTag(clazz1, nodeTuple.getKeyNode());
            resetTag(clazz2, nodeTuple.getValueNode());
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public Representer(DumperOptions paramDumperOptions) {
    super(paramDumperOptions);
    this.representers.put(null, new Representer$RepresentJavaBean(this));
  }
  
  public NodeTuple representJavaBeanProperty(Object paramObject1, Property paramProperty, Object paramObject2, Tag paramTag) {
    ScalarNode scalarNode = (ScalarNode)representData(paramProperty.getName());
    boolean bool = this.representedObjects.containsKey(paramObject2);
    Node node = representData(paramObject2);
    try {
      if (paramObject2 != null && !bool) {
        NodeId nodeId = node.getNodeId();
        try {
          if (paramTag == null)
            try {
              if (nodeId == NodeId.scalar) {
                try {
                  if (paramProperty.getType() != Enum.class)
                    try {
                      if (paramObject2 instanceof Enum)
                        node.setTag(Tag.STR); 
                    } catch (RuntimeException runtimeException) {
                      throw b(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw b(null);
                } 
              } else {
                try {
                  if (nodeId == NodeId.mapping)
                    try {
                      if (paramProperty.getType() == paramObject2.getClass())
                        try {
                          if (!(paramObject2 instanceof Map))
                            try {
                              if (!node.getTag().equals(Tag.SET))
                                node.setTag(Tag.MAP); 
                            } catch (RuntimeException runtimeException) {
                              throw b(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw b(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw b(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw b(null);
                } 
                checkGlobalTag(paramProperty, node, paramObject2);
              } 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return new NodeTuple((Node)scalarNode, node);
  }
  
  public void setPropertyUtils(PropertyUtils paramPropertyUtils) {
    super.setPropertyUtils(paramPropertyUtils);
    Collection collection = this.typeDefinitions.values();
    for (TypeDescription typeDescription : collection)
      typeDescription.setPropertyUtils(paramPropertyUtils); 
  }
  
  public TypeDescription addTypeDescription(TypeDescription paramTypeDescription) {
    try {
      if (Collections.EMPTY_MAP == this.typeDefinitions)
        this.typeDefinitions = new HashMap<>(); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (paramTypeDescription.getTag() != null)
        addClassTag(paramTypeDescription.getType(), paramTypeDescription.getTag()); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramTypeDescription.setPropertyUtils(getPropertyUtils());
    return this.typeDefinitions.put(paramTypeDescription.getType(), paramTypeDescription);
  }
  
  @Deprecated
  public Representer() {
    this.representers.put(null, new Representer$RepresentJavaBean(this));
  }
  
  public MappingNode representJavaBean(Set paramSet, Object paramObject) {
    ArrayList<NodeTuple> arrayList = new ArrayList(paramSet.size());
    Tag tag2 = (Tag)this.classTags.get(paramObject.getClass());
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Tag tag1 = (tag2 != null) ? tag2 : new Tag(paramObject.getClass());
    MappingNode mappingNode = new MappingNode(tag1, arrayList, DumperOptions.FlowStyle.AUTO);
    this.representedObjects.put(paramObject, mappingNode);
    DumperOptions.FlowStyle flowStyle = DumperOptions.FlowStyle.FLOW;
    for (Property property : paramSet) {
      Object object = property.get(paramObject);
      try {
      
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      Tag tag = (object == null) ? null : (Tag)this.classTags.get(object.getClass());
      NodeTuple nodeTuple = representJavaBeanProperty(paramObject, property, object, tag);
      try {
        if (nodeTuple == null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      if (!((ScalarNode)nodeTuple.getKeyNode()).isPlain())
        flowStyle = DumperOptions.FlowStyle.BLOCK; 
      Node node = nodeTuple.getValueNode();
      try {
        if (!(node instanceof ScalarNode) || !((ScalarNode)node).isPlain())
          flowStyle = DumperOptions.FlowStyle.BLOCK; 
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      arrayList.add(nodeTuple);
    } 
    try {
      if (this.defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
        mappingNode.setFlowStyle(this.defaultFlowStyle);
      } else {
        mappingNode.setFlowStyle(flowStyle);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return mappingNode;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\Representer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */