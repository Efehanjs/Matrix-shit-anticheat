package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.util.Map;

public final class LinkedTreeMap$Node implements Map.Entry {
  public Object value;
  
  public LinkedTreeMap$Node next;
  
  public LinkedTreeMap$Node right;
  
  public LinkedTreeMap$Node prev;
  
  public final Object key;
  
  public int height;
  
  public LinkedTreeMap$Node left;
  
  public LinkedTreeMap$Node parent;
  
  public LinkedTreeMap$Node last() {
    LinkedTreeMap$Node linkedTreeMap$Node1 = this;
    for (LinkedTreeMap$Node linkedTreeMap$Node2 = linkedTreeMap$Node1.right; linkedTreeMap$Node2 != null; linkedTreeMap$Node2 = linkedTreeMap$Node1.right)
      linkedTreeMap$Node1 = linkedTreeMap$Node2; 
    return linkedTreeMap$Node1;
  }
  
  public LinkedTreeMap$Node() {
    this.key = null;
    this.next = this.prev = this;
  }
  
  public LinkedTreeMap$Node(LinkedTreeMap$Node paramLinkedTreeMap$Node1, Object paramObject, LinkedTreeMap$Node paramLinkedTreeMap$Node2, LinkedTreeMap$Node paramLinkedTreeMap$Node3) {
    this.parent = paramLinkedTreeMap$Node1;
    this.key = paramObject;
    this.height = 1;
    this.next = paramLinkedTreeMap$Node2;
    this.prev = paramLinkedTreeMap$Node3;
    paramLinkedTreeMap$Node3.next = this;
    paramLinkedTreeMap$Node2.prev = this;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/util/Map$Entry
    //   4: ifeq -> 121
    //   7: aload_1
    //   8: checkcast java/util/Map$Entry
    //   11: astore_2
    //   12: aload_0
    //   13: getfield key : Ljava/lang/Object;
    //   16: ifnonnull -> 42
    //   19: aload_2
    //   20: invokeinterface getKey : ()Ljava/lang/Object;
    //   25: ifnonnull -> 119
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: goto -> 58
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield key : Ljava/lang/Object;
    //   46: aload_2
    //   47: invokeinterface getKey : ()Ljava/lang/Object;
    //   52: invokevirtual equals : (Ljava/lang/Object;)Z
    //   55: ifeq -> 119
    //   58: aload_0
    //   59: getfield value : Ljava/lang/Object;
    //   62: ifnonnull -> 95
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: aload_2
    //   73: invokeinterface getValue : ()Ljava/lang/Object;
    //   78: ifnonnull -> 119
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: goto -> 111
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload_0
    //   96: getfield value : Ljava/lang/Object;
    //   99: aload_2
    //   100: invokeinterface getValue : ()Ljava/lang/Object;
    //   105: invokevirtual equals : (Ljava/lang/Object;)Z
    //   108: ifeq -> 119
    //   111: iconst_1
    //   112: goto -> 120
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: iconst_0
    //   120: ireturn
    //   121: iconst_0
    //   122: ireturn
    // Exception table:
    //   from	to	target	type
    //   12	28	31	java/lang/RuntimeException
    //   19	38	38	java/lang/RuntimeException
    //   42	65	68	java/lang/RuntimeException
    //   58	81	84	java/lang/RuntimeException
    //   72	91	91	java/lang/RuntimeException
    //   95	115	115	java/lang/RuntimeException
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((this.key == null) ? 0 : this.key.hashCode()) ^ ((this.value == null) ? 0 : this.value.hashCode());
  }
  
  public Object setValue(Object paramObject) {
    Object object = this.value;
    this.value = paramObject;
    return object;
  }
  
  public Object getKey() {
    return this.key;
  }
  
  public String toString() {
    return this.key + "=" + this.value;
  }
  
  public LinkedTreeMap$Node first() {
    LinkedTreeMap$Node linkedTreeMap$Node1 = this;
    for (LinkedTreeMap$Node linkedTreeMap$Node2 = linkedTreeMap$Node1.left; linkedTreeMap$Node2 != null; linkedTreeMap$Node2 = linkedTreeMap$Node1.left)
      linkedTreeMap$Node1 = linkedTreeMap$Node2; 
    return linkedTreeMap$Node1;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\LinkedTreeMap$Node.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */