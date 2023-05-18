package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.PropertyUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public abstract class BaseRepresenter {
  public final Map representedObjects = new BaseRepresenter$1(this);
  
  public final Map multiRepresenters = new LinkedHashMap<>();
  
  public DumperOptions.ScalarStyle defaultScalarStyle = null;
  
  public Represent nullRepresenter;
  
  public Object objectToRepresent;
  
  private PropertyUtils propertyUtils;
  
  public DumperOptions.FlowStyle defaultFlowStyle = DumperOptions.FlowStyle.AUTO;
  
  public final Map representers = new HashMap<>();
  
  private boolean explicitPropertyUtils = false;
  
  public Node representScalar(Tag paramTag, String paramString) {
    return representScalar(paramTag, paramString, null);
  }
  
  public DumperOptions.ScalarStyle getDefaultScalarStyle() {
    try {
      if (this.defaultScalarStyle == null)
        return DumperOptions.ScalarStyle.PLAIN; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.defaultScalarStyle;
  }
  
  public final boolean isExplicitPropertyUtils() {
    return this.explicitPropertyUtils;
  }
  
  public Node representSequence(Tag paramTag, Iterable paramIterable, DumperOptions.FlowStyle paramFlowStyle) {
    int i = 10;
    if (paramIterable instanceof List)
      i = ((List)paramIterable).size(); 
    ArrayList<Node> arrayList = new ArrayList(i);
    SequenceNode sequenceNode = new SequenceNode(paramTag, arrayList, paramFlowStyle);
    this.representedObjects.put(this.objectToRepresent, sequenceNode);
    DumperOptions.FlowStyle flowStyle = DumperOptions.FlowStyle.FLOW;
    for (Object object : paramIterable) {
      Node node = representData(object);
      try {
        if (!(node instanceof ScalarNode) || !((ScalarNode)node).isPlain())
          flowStyle = DumperOptions.FlowStyle.BLOCK; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      arrayList.add(node);
    } 
    try {
      if (paramFlowStyle == DumperOptions.FlowStyle.AUTO)
        try {
          if (this.defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
            sequenceNode.setFlowStyle(this.defaultFlowStyle);
          } else {
            sequenceNode.setFlowStyle(flowStyle);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Node)sequenceNode;
  }
  
  public void setDefaultFlowStyle(DumperOptions.FlowStyle paramFlowStyle) {
    this.defaultFlowStyle = paramFlowStyle;
  }
  
  public Node represent(Object paramObject) {
    Node node = representData(paramObject);
    this.representedObjects.clear();
    this.objectToRepresent = null;
    return node;
  }
  
  public final Node representData(Object paramObject) {
    Node node;
    this.objectToRepresent = paramObject;
    if (this.representedObjects.containsKey(this.objectToRepresent))
      return (Node)this.representedObjects.get(this.objectToRepresent); 
    if (paramObject == null)
      return this.nullRepresenter.representData(null); 
    Class<?> clazz = paramObject.getClass();
    if (this.representers.containsKey(clazz)) {
      Represent represent = (Represent)this.representers.get(clazz);
      node = represent.representData(paramObject);
    } else {
      for (Class clazz1 : this.multiRepresenters.keySet()) {
        try {
          if (clazz1 != null && clazz1.isInstance(paramObject)) {
            Represent represent = (Represent)this.multiRepresenters.get(clazz1);
            return represent.representData(paramObject);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      if (this.multiRepresenters.containsKey(null)) {
        Represent represent = (Represent)this.multiRepresenters.get(null);
        node = represent.representData(paramObject);
      } else {
        Represent represent = (Represent)this.representers.get(null);
        node = represent.representData(paramObject);
      } 
    } 
    return node;
  }
  
  public Node representScalar(Tag paramTag, String paramString, DumperOptions.ScalarStyle paramScalarStyle) {
    if (paramScalarStyle == null)
      paramScalarStyle = this.defaultScalarStyle; 
    return (Node)new ScalarNode(paramTag, paramString, null, null, paramScalarStyle);
  }
  
  public void setPropertyUtils(PropertyUtils paramPropertyUtils) {
    this.propertyUtils = paramPropertyUtils;
    this.explicitPropertyUtils = true;
  }
  
  public DumperOptions.FlowStyle getDefaultFlowStyle() {
    return this.defaultFlowStyle;
  }
  
  public Node representMapping(Tag paramTag, Map paramMap, DumperOptions.FlowStyle paramFlowStyle) {
    ArrayList<NodeTuple> arrayList = new ArrayList(paramMap.size());
    MappingNode mappingNode = new MappingNode(paramTag, arrayList, paramFlowStyle);
    this.representedObjects.put(this.objectToRepresent, mappingNode);
    DumperOptions.FlowStyle flowStyle = DumperOptions.FlowStyle.FLOW;
    for (Map.Entry entry : paramMap.entrySet()) {
      Node node1 = representData(entry.getKey());
      Node node2 = representData(entry.getValue());
      try {
        if (!(node1 instanceof ScalarNode) || !((ScalarNode)node1).isPlain())
          flowStyle = DumperOptions.FlowStyle.BLOCK; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!(node2 instanceof ScalarNode) || !((ScalarNode)node2).isPlain())
          flowStyle = DumperOptions.FlowStyle.BLOCK; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      arrayList.add(new NodeTuple(node1, node2));
    } 
    try {
      if (paramFlowStyle == DumperOptions.FlowStyle.AUTO)
        try {
          if (this.defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
            mappingNode.setFlowStyle(this.defaultFlowStyle);
          } else {
            mappingNode.setFlowStyle(flowStyle);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Node)mappingNode;
  }
  
  public void setDefaultScalarStyle(DumperOptions.ScalarStyle paramScalarStyle) {
    this.defaultScalarStyle = paramScalarStyle;
  }
  
  public final PropertyUtils getPropertyUtils() {
    try {
      if (this.propertyUtils == null)
        this.propertyUtils = new PropertyUtils(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.propertyUtils;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\BaseRepresenter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */