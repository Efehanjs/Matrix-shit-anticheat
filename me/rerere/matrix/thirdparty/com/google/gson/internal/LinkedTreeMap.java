package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;

public final class LinkedTreeMap extends AbstractMap implements Serializable {
  private LinkedTreeMap$EntrySet entrySet;
  
  public LinkedTreeMap$Node root;
  
  public Comparator comparator;
  
  private LinkedTreeMap$KeySet keySet;
  
  public int modCount = 0;
  
  public final LinkedTreeMap$Node header = new LinkedTreeMap$Node();
  
  public int size = 0;
  
  private static final Comparator NATURAL_ORDER;
  
  private static final long a = o3.a(-4595266719575132240L, 701505486688757112L, null).a(77816805757814L);
  
  static {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    $assertionsDisabled = !LinkedTreeMap.class.desiredAssertionStatus();
    NATURAL_ORDER = new LinkedTreeMap$1();
  }
  
  public Object put(Object paramObject1, Object paramObject2) {
    long l = a ^ 0x7EAC83956C1EL;
    try {
      if (paramObject1 == null)
        throw new NullPointerException("key == null"); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    LinkedTreeMap$Node linkedTreeMap$Node = find(paramObject1, true);
    Object object = linkedTreeMap$Node.value;
    linkedTreeMap$Node.value = paramObject2;
    return object;
  }
  
  public LinkedTreeMap$Node find(Object paramObject, boolean paramBoolean) {
    LinkedTreeMap$Node linkedTreeMap$Node3;
    long l = a ^ 0xFB213E673F2L;
    Comparator<Object> comparator = this.comparator;
    LinkedTreeMap$Node linkedTreeMap$Node1 = this.root;
    int i = 0;
    try {
      if (linkedTreeMap$Node1 != null) {
        try {
        
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        Comparable<Object> comparable = (comparator == NATURAL_ORDER) ? (Comparable)paramObject : null;
        while (true) {
          try {
          
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          i = (comparable != null) ? comparable.compareTo(linkedTreeMap$Node1.key) : comparator.compare(paramObject, linkedTreeMap$Node1.key);
          try {
            if (i == 0)
              return linkedTreeMap$Node1; 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          try {
          
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          linkedTreeMap$Node3 = (i < 0) ? linkedTreeMap$Node1.left : linkedTreeMap$Node1.right;
          try {
            if (linkedTreeMap$Node3 == null)
              break; 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          linkedTreeMap$Node1 = linkedTreeMap$Node3;
        } 
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (!paramBoolean)
        return null; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    LinkedTreeMap$Node linkedTreeMap$Node2 = this.header;
    try {
      if (linkedTreeMap$Node1 == null) {
        try {
          if (comparator == NATURAL_ORDER)
            try {
              if (!(paramObject instanceof Comparable))
                throw new ClassCastException(paramObject.getClass().getName() + " is not Comparable"); 
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        linkedTreeMap$Node3 = new LinkedTreeMap$Node(linkedTreeMap$Node1, paramObject, linkedTreeMap$Node2, linkedTreeMap$Node2.prev);
        this.root = linkedTreeMap$Node3;
      } else {
        linkedTreeMap$Node3 = new LinkedTreeMap$Node(linkedTreeMap$Node1, paramObject, linkedTreeMap$Node2, linkedTreeMap$Node2.prev);
        try {
          if (i < 0) {
            linkedTreeMap$Node1.left = linkedTreeMap$Node3;
          } else {
            linkedTreeMap$Node1.right = linkedTreeMap$Node3;
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        rebalance(linkedTreeMap$Node1, true);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.size++;
    this.modCount++;
    return linkedTreeMap$Node3;
  }
  
  public Set entrySet() {
    LinkedTreeMap$EntrySet linkedTreeMap$EntrySet = this.entrySet;
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (linkedTreeMap$EntrySet != null) ? linkedTreeMap$EntrySet : (this.entrySet = new LinkedTreeMap$EntrySet(this));
  }
  
  public LinkedTreeMap$Node findByEntry(Map.Entry paramEntry) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface getKey : ()Ljava/lang/Object;
    //   7: invokevirtual findByObject : (Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/com/google/gson/internal/LinkedTreeMap$Node;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull -> 47
    //   15: aload_0
    //   16: aload_2
    //   17: getfield value : Ljava/lang/Object;
    //   20: aload_1
    //   21: invokeinterface getValue : ()Ljava/lang/Object;
    //   26: invokespecial equal : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   29: ifeq -> 47
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   38: athrow
    //   39: iconst_1
    //   40: goto -> 48
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: iconst_0
    //   48: istore_3
    //   49: iload_3
    //   50: ifeq -> 61
    //   53: aload_2
    //   54: goto -> 62
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aconst_null
    //   62: areturn
    // Exception table:
    //   from	to	target	type
    //   11	32	35	java/lang/NullPointerException
    //   15	43	43	java/lang/NullPointerException
    //   49	57	57	java/lang/NullPointerException
  }
  
  public int size() {
    return this.size;
  }
  
  public LinkedTreeMap(Comparator paramComparator) {
    this.comparator = (paramComparator != null) ? paramComparator : NATURAL_ORDER;
  }
  
  public Object get(Object paramObject) {
    LinkedTreeMap$Node linkedTreeMap$Node = findByObject(paramObject);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (linkedTreeMap$Node != null) ? linkedTreeMap$Node.value : null;
  }
  
  public void removeInternal(LinkedTreeMap$Node paramLinkedTreeMap$Node, boolean paramBoolean) {
    try {
      if (paramBoolean) {
        paramLinkedTreeMap$Node.prev.next = paramLinkedTreeMap$Node.next;
        paramLinkedTreeMap$Node.next.prev = paramLinkedTreeMap$Node.prev;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    LinkedTreeMap$Node linkedTreeMap$Node1 = paramLinkedTreeMap$Node.left;
    LinkedTreeMap$Node linkedTreeMap$Node2 = paramLinkedTreeMap$Node.right;
    LinkedTreeMap$Node linkedTreeMap$Node3 = paramLinkedTreeMap$Node.parent;
    try {
      if (linkedTreeMap$Node1 != null)
        try {
          if (linkedTreeMap$Node2 != null) {
            try {
            
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            } 
            LinkedTreeMap$Node linkedTreeMap$Node = (linkedTreeMap$Node1.height > linkedTreeMap$Node2.height) ? linkedTreeMap$Node1.last() : linkedTreeMap$Node2.first();
            removeInternal(linkedTreeMap$Node, false);
            int i = 0;
            linkedTreeMap$Node1 = paramLinkedTreeMap$Node.left;
            if (linkedTreeMap$Node1 != null) {
              i = linkedTreeMap$Node1.height;
              linkedTreeMap$Node.left = linkedTreeMap$Node1;
              linkedTreeMap$Node1.parent = linkedTreeMap$Node;
              paramLinkedTreeMap$Node.left = null;
            } 
            int j = 0;
            linkedTreeMap$Node2 = paramLinkedTreeMap$Node.right;
            if (linkedTreeMap$Node2 != null) {
              j = linkedTreeMap$Node2.height;
              linkedTreeMap$Node.right = linkedTreeMap$Node2;
              linkedTreeMap$Node2.parent = linkedTreeMap$Node;
              paramLinkedTreeMap$Node.right = null;
            } 
            linkedTreeMap$Node.height = Math.max(i, j) + 1;
            replaceInParent(paramLinkedTreeMap$Node, linkedTreeMap$Node);
            return;
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (linkedTreeMap$Node1 != null) {
        replaceInParent(paramLinkedTreeMap$Node, linkedTreeMap$Node1);
        paramLinkedTreeMap$Node.left = null;
      } else {
        try {
          if (linkedTreeMap$Node2 != null) {
            replaceInParent(paramLinkedTreeMap$Node, linkedTreeMap$Node2);
            paramLinkedTreeMap$Node.right = null;
          } else {
            replaceInParent(paramLinkedTreeMap$Node, null);
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    rebalance(linkedTreeMap$Node3, false);
    this.size--;
    this.modCount++;
  }
  
  public Set keySet() {
    LinkedTreeMap$KeySet linkedTreeMap$KeySet = this.keySet;
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (linkedTreeMap$KeySet != null) ? linkedTreeMap$KeySet : (this.keySet = new LinkedTreeMap$KeySet(this));
  }
  
  public LinkedTreeMap() {
    this(NATURAL_ORDER);
  }
  
  public Object remove(Object paramObject) {
    LinkedTreeMap$Node linkedTreeMap$Node = removeInternalByKey(paramObject);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (linkedTreeMap$Node != null) ? linkedTreeMap$Node.value : null;
  }
  
  public boolean containsKey(Object paramObject) {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (findByObject(paramObject) != null);
  }
  
  public LinkedTreeMap$Node findByObject(Object paramObject) {
    try {
      try {
      
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      return (paramObject != null) ? find(paramObject, false) : null;
    } catch (ClassCastException classCastException) {
      return null;
    } 
  }
  
  public LinkedTreeMap$Node removeInternalByKey(Object paramObject) {
    LinkedTreeMap$Node linkedTreeMap$Node = findByObject(paramObject);
    try {
      if (linkedTreeMap$Node != null)
        removeInternal(linkedTreeMap$Node, true); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return linkedTreeMap$Node;
  }
  
  public void clear() {
    this.root = null;
    this.size = 0;
    this.modCount++;
    LinkedTreeMap$Node linkedTreeMap$Node = this.header;
    linkedTreeMap$Node.next = linkedTreeMap$Node.prev = linkedTreeMap$Node;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\LinkedTreeMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */