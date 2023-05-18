package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;

public class Constructor$ConstructSequence implements Construct {
  private static final long a = o3.a(7931662789612018034L, 1229490074188905899L, MethodHandles.lookup().lookupClass()).a(53982621879863L);
  
  public Object construct(Node paramNode) {
    long l = a ^ 0x31EFB9C35472L;
    SequenceNode sequenceNode = (SequenceNode)paramNode;
    try {
      if (Set.class.isAssignableFrom(paramNode.getType())) {
        try {
          if (paramNode.isTwoStepsConstruction())
            throw new YAMLException("Set cannot be recursive."); 
        } catch (Exception exception) {
          throw a(null);
        } 
        return Constructor.this.constructSet(sequenceNode);
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (Collection.class.isAssignableFrom(paramNode.getType())) {
        try {
          if (paramNode.isTwoStepsConstruction())
            return Constructor.this.newList(sequenceNode); 
        } catch (Exception exception) {
          throw a(null);
        } 
        return Constructor.this.constructSequence(sequenceNode);
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (paramNode.getType().isArray()) {
        try {
          if (paramNode.isTwoStepsConstruction())
            return Constructor.this.createArray(paramNode.getType(), sequenceNode.getValue().size()); 
        } catch (Exception exception) {
          throw a(null);
        } 
        return Constructor.this.constructArray(sequenceNode);
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Constructor> arrayList = new ArrayList(sequenceNode.getValue().size());
    for (Constructor<?> constructor : paramNode.getType().getDeclaredConstructors()) {
      try {
        if (sequenceNode.getValue().size() == (constructor.getParameterTypes()).length)
          arrayList.add(constructor); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    try {
      if (!arrayList.isEmpty()) {
        if (arrayList.size() == 1) {
          Object[] arrayOfObject = new Object[sequenceNode.getValue().size()];
          Constructor constructor = arrayList.get(0);
          byte b1 = 0;
          for (Node node : sequenceNode.getValue()) {
            Class<?> clazz = constructor.getParameterTypes()[b1];
            node.setType(clazz);
            arrayOfObject[b1++] = Constructor.this.constructObject(node);
          } 
          try {
            constructor.setAccessible(true);
            return constructor.newInstance(arrayOfObject);
          } catch (Exception exception) {
            throw new YAMLException(exception);
          } 
        } 
        List list = Constructor.this.constructSequence(sequenceNode);
        Class[] arrayOfClass = new Class[list.size()];
        byte b = 0;
        for (Object object : list) {
          arrayOfClass[b] = object.getClass();
          b++;
        } 
        for (Constructor constructor : arrayList) {
          Class[] arrayOfClass1 = constructor.getParameterTypes();
          boolean bool = true;
          byte b1 = 0;
          while (true) {
            try {
              if (b1 < arrayOfClass1.length) {
                if (!wrapIfPrimitive(arrayOfClass1[b1]).isAssignableFrom(arrayOfClass[b1])) {
                  bool = false;
                  break;
                } 
                b1++;
                continue;
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
            break;
          } 
          if (bool)
            try {
              constructor.setAccessible(true);
              return constructor.newInstance(list.toArray());
            } catch (Exception exception) {
              throw new YAMLException(exception);
            }  
        } 
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    throw new YAMLException("No suitable constructor with " + sequenceNode.getValue().size() + " arguments found for " + paramNode.getType());
  }
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = a ^ 0x53A7F6969320L;
    SequenceNode sequenceNode = (SequenceNode)paramNode;
    if (List.class.isAssignableFrom(paramNode.getType())) {
      List list = (List)paramObject;
      Constructor.this.constructSequenceStep2(sequenceNode, list);
    } else {
      try {
        if (paramNode.getType().isArray()) {
          Constructor.this.constructArrayStep2(sequenceNode, paramObject);
        } else {
          throw new YAMLException("Immutable objects cannot be recursive.");
        } 
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\Constructor$ConstructSequence.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */