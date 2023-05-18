package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public class KeyTree$Node implements Iterable {
  public Integer listSize;
  
  public String name;
  
  public int indent;
  
  public Map indexByElementIndex;
  
  public List children;
  
  public Map priorityIndex;
  
  public String sideComment;
  
  public boolean isList;
  
  public Integer elementIndex;
  
  public Map indexByName;
  
  public final KeyTree$Node parent;
  
  public String comment;
  
  private static final long a = o3.a(-7983827014148071177L, -4820559651891591745L, MethodHandles.lookup().lookupClass()).a(246181142828426L);
  
  public KeyTree$Node getPriority(String paramString) {
    return get(paramString, false, true);
  }
  
  public Set entries() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.indexByName != null) ? Collections.unmodifiableSet(this.indexByName.entrySet()) : Collections.emptySet();
  }
  
  public KeyTree$Node getElement(int paramInt) {
    return getElement(paramInt, false);
  }
  
  public KeyTree$Node add(String paramString, boolean paramBoolean) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (this == KeyTree.this.root) ? false : (this.indent + KeyTree.this.options.indent());
    return add(bool, paramString, paramBoolean);
  }
  
  public void setComment(String paramString) {
    this.comment = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean clearIf(Predicate paramPredicate) {
    return clearIf(paramPredicate, true);
  }
  
  public void setElementIndex(int paramInt) {
    try {
      if (this.parent != null) {
        try {
          if (this.parent.indexByElementIndex == null) {
            this.parent.indexByElementIndex = new HashMap<>();
          } else {
            try {
              if (this.elementIndex != null)
                this.parent.indexByElementIndex.remove(this.elementIndex); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.elementIndex = Integer.valueOf(paramInt);
        this.parent.indexByElementIndex.put(this.elementIndex, this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public int size() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return hasChildren() ? this.children.size() : 0;
  }
  
  public boolean hasChildren() {
    try {
      if (this.children != null)
        try {
          if (!this.children.isEmpty());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void isList(int paramInt) {
    this.isList = true;
    this.listSize = Integer.valueOf(paramInt);
  }
  
  public boolean isRootNode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.parent == null);
  }
  
  public KeyTree$Node get(int paramInt) {
    KeyTree$Node keyTree$Node = null;
    if (hasChildren()) {
      paramInt = asListIndex(paramInt, this.children.size());
      try {
        if (paramInt >= 0 && paramInt < this.children.size())
          keyTree$Node = this.children.get(paramInt); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return keyTree$Node;
  }
  
  public KeyTree$Node getElement(int paramInt, boolean paramBoolean) {
    KeyTree$Node keyTree$Node = null;
    try {
      if (this.isList) {
        if (this.indexByElementIndex != null) {
          keyTree$Node = (KeyTree$Node)this.indexByElementIndex.get(Integer.valueOf(paramInt));
          try {
            if (keyTree$Node == null)
              try {
                if (!paramBoolean)
                  if (paramInt < 0) {
                    keyTree$Node = (KeyTree$Node)this.indexByElementIndex.get(Integer.valueOf(this.listSize.intValue() + paramInt));
                  } else {
                    keyTree$Node = (KeyTree$Node)this.indexByElementIndex.get(Integer.valueOf(paramInt - this.listSize.intValue()));
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } else if (!paramBoolean) {
        keyTree$Node = get(paramInt);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (keyTree$Node == null && paramBoolean)
        keyTree$Node = addIndexed(paramInt); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return keyTree$Node;
  }
  
  public void clearNode() {
    try {
      if (this.children != null) {
        this.children.clear();
        this.children = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.indexByName != null) {
        this.indexByName.clear();
        this.indexByName = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.priorityIndex != null) {
        this.priorityIndex.clear();
        this.priorityIndex = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.indexByElementIndex != null) {
        this.indexByElementIndex.clear();
        this.indexByElementIndex = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.parent != null)
        try {
          if (this.parent.indexByName != null)
            try {
              if (this.parent.indexByName.get(this.name) == this) {
                try {
                  this.parent.indexByName.remove(this.name);
                  if (this.parent.priorityIndex != null)
                    this.parent.priorityIndex.remove(this.name); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  if (this.parent.indexByElementIndex != null)
                    try {
                      if (this.elementIndex != null)
                        this.parent.indexByElementIndex.remove(this.elementIndex); 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void checkList() {
    try {
      if (this.name != null || this.elementIndex != null) {
        Object object = getValue();
        try {
          if (object instanceof Collection)
            isList(((Collection)object).size()); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public KeyTree$Node get(String paramString) {
    return get(paramString, false, false);
  }
  
  public Integer getListSize() {
    return this.listSize;
  }
  
  public KeyTree$Node getFirst() {
    try {
      if (!hasChildren())
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.children.get(0);
  }
  
  public void setPriority(String paramString, KeyTree$Node paramKeyTree$Node) {
    try {
      if (this.priorityIndex == null)
        this.priorityIndex = new LinkedHashMap<>(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.priorityIndex.putIfAbsent(paramString, paramKeyTree$Node);
  }
  
  public KeyTree$Node add(int paramInt, String paramString, boolean paramBoolean) {
    KeyTree$Node keyTree$Node = KeyTree.this.createNode(this, paramInt, paramString);
    try {
      if (this.children == null)
        this.children = new ArrayList(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.children.add(keyTree$Node);
      if (this.indexByName == null)
        this.indexByName = new LinkedHashMap<>(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.indexByName.putIfAbsent(paramString, keyTree$Node);
      if (paramBoolean)
        setPriority(paramString, keyTree$Node); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    keyTree$Node.checkList();
    return keyTree$Node;
  }
  
  public Set keys() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.indexByName != null) ? Collections.unmodifiableSet(this.indexByName.keySet()) : Collections.emptySet();
  }
  
  public Object getValue() {
    String str = getPath();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (str != null) ? KeyTree.this.options.configuration().get(str) : null;
  }
  
  public KeyTree$Node add(int paramInt, String paramString) {
    return add(paramInt, paramString, false);
  }
  
  public String getPath() {
    try {
      if (this.parent != null)
        try {
          if (this.parent != KeyTree.this.root) {
            try {
              if (this.parent.isList)
                try {
                  if (this.elementIndex != null)
                    return indexedName(this.parent.getPath(), this.elementIndex.intValue()); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return getPathWithNameUnchecked();
          } 
          return this.name;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.name;
  }
  
  public String getComment() {
    return this.comment;
  }
  
  public boolean isList() {
    return this.isList;
  }
  
  public Iterator iterator() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return hasChildren() ? this.children.iterator() : Collections.emptyIterator();
  }
  
  public List children() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return hasChildren() ? Collections.unmodifiableList(this.children) : Collections.emptyList();
  }
  
  public Integer getElementIndex() {
    return this.elementIndex;
  }
  
  public boolean clearIf(Predicate<KeyTree$Node> paramPredicate, boolean paramBoolean) {
    try {
      if (this.children != null)
        this.children.removeIf(paramKeyTree$Node -> paramKeyTree$Node.clearIf(paramPredicate, false)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!hasChildren())
        try {
          if (paramPredicate.test(this)) {
            try {
              clearNode();
              if (paramBoolean)
                try {
                  if (this.parent != null)
                    this.parent.children.remove(this); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public KeyTree$Node get(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: aload_1
    //   4: ifnull -> 193
    //   7: aload_0
    //   8: getfield indexByName : Ljava/util/Map;
    //   11: ifnull -> 41
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_0
    //   22: getfield indexByName : Ljava/util/Map;
    //   25: aload_1
    //   26: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   31: ifne -> 193
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_1
    //   42: aload_0
    //   43: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree;
    //   46: getfield options : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationOptions;
    //   49: invokevirtual pathSeparator : ()C
    //   52: invokestatic firstSeparatorIndex : (Ljava/lang/String;C)I
    //   55: istore #5
    //   57: iload #5
    //   59: iflt -> 108
    //   62: aload_1
    //   63: iconst_0
    //   64: iload #5
    //   66: invokevirtual substring : (II)Ljava/lang/String;
    //   69: astore #6
    //   71: aload_0
    //   72: aload #6
    //   74: iload_2
    //   75: iload_3
    //   76: invokevirtual get : (Ljava/lang/String;ZZ)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   79: astore #7
    //   81: aload #7
    //   83: ifnonnull -> 92
    //   86: aconst_null
    //   87: areturn
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: aload #7
    //   94: aload_1
    //   95: iload #5
    //   97: iconst_1
    //   98: iadd
    //   99: invokevirtual substring : (I)Ljava/lang/String;
    //   102: iload_2
    //   103: iload_3
    //   104: invokevirtual get : (Ljava/lang/String;ZZ)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   107: areturn
    //   108: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/utils/StringUtils.LIST_INDEX : Ljava/util/regex/Pattern;
    //   111: aload_1
    //   112: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   115: astore #6
    //   117: aload #6
    //   119: invokevirtual matches : ()Z
    //   122: ifeq -> 193
    //   125: aload #6
    //   127: iconst_1
    //   128: invokevirtual group : (I)Ljava/lang/String;
    //   131: astore #7
    //   133: aload #7
    //   135: ifnull -> 174
    //   138: aload #7
    //   140: invokevirtual isEmpty : ()Z
    //   143: ifne -> 174
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: aload_0
    //   154: aload #7
    //   156: iload_2
    //   157: iload_3
    //   158: invokevirtual get : (Ljava/lang/String;ZZ)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   161: astore #4
    //   163: aload #4
    //   165: ifnonnull -> 177
    //   168: aconst_null
    //   169: areturn
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload_0
    //   175: astore #4
    //   177: aload #4
    //   179: aload #6
    //   181: iconst_2
    //   182: invokevirtual group : (I)Ljava/lang/String;
    //   185: invokestatic parseInt : (Ljava/lang/String;)I
    //   188: iload_2
    //   189: invokevirtual getElement : (IZ)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   192: areturn
    //   193: iload_3
    //   194: ifeq -> 312
    //   197: aload_0
    //   198: getfield isList : Z
    //   201: ifeq -> 312
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_0
    //   212: getfield priorityIndex : Ljava/util/Map;
    //   215: ifnull -> 245
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: aload_0
    //   226: getfield priorityIndex : Ljava/util/Map;
    //   229: aload_1
    //   230: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   235: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node
    //   238: goto -> 246
    //   241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   244: athrow
    //   245: aconst_null
    //   246: astore #4
    //   248: iload_2
    //   249: ifeq -> 334
    //   252: aload #4
    //   254: ifnonnull -> 334
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: aload_0
    //   265: getfield indexByName : Ljava/util/Map;
    //   268: ifnull -> 334
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   277: athrow
    //   278: aload_0
    //   279: getfield indexByName : Ljava/util/Map;
    //   282: aload_1
    //   283: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   288: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node
    //   291: astore #4
    //   293: aload #4
    //   295: ifnull -> 334
    //   298: aload_0
    //   299: aload_1
    //   300: aload #4
    //   302: invokevirtual setPriority : (Ljava/lang/String;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;)V
    //   305: goto -> 334
    //   308: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   311: athrow
    //   312: aload_0
    //   313: getfield indexByName : Ljava/util/Map;
    //   316: ifnull -> 334
    //   319: aload_0
    //   320: getfield indexByName : Ljava/util/Map;
    //   323: aload_1
    //   324: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   329: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node
    //   332: astore #4
    //   334: aload #4
    //   336: ifnonnull -> 358
    //   339: iload_2
    //   340: ifeq -> 358
    //   343: goto -> 350
    //   346: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   349: athrow
    //   350: aload_0
    //   351: aload_1
    //   352: iload_3
    //   353: invokevirtual add : (Ljava/lang/String;Z)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   356: astore #4
    //   358: aload #4
    //   360: areturn
    // Exception table:
    //   from	to	target	type
    //   3	14	17	java/lang/RuntimeException
    //   7	34	37	java/lang/RuntimeException
    //   81	88	88	java/lang/RuntimeException
    //   133	146	149	java/lang/RuntimeException
    //   163	170	170	java/lang/RuntimeException
    //   193	204	207	java/lang/RuntimeException
    //   197	218	221	java/lang/RuntimeException
    //   211	241	241	java/lang/RuntimeException
    //   248	257	260	java/lang/RuntimeException
    //   252	271	274	java/lang/RuntimeException
    //   293	308	308	java/lang/RuntimeException
    //   334	343	346	java/lang/RuntimeException
  }
  
  public KeyTree$Node add(String paramString) {
    return add(paramString, false);
  }
  
  public KeyTree$Node getParent() {
    return this.parent;
  }
  
  public KeyTree$Node(KeyTree$Node paramKeyTree$Node, int paramInt, String paramString) {
    this.parent = paramKeyTree$Node;
    this.indent = paramInt;
    this.name = paramString;
  }
  
  public boolean isFirstNode() {
    try {
      if (!isRootNode() && this.parent.isRootNode()) {
        KeyTree$Node keyTree$Node = this.parent.getFirst();
        try {
          if (keyTree$Node.getName() == null && this.parent.children.size() > 1)
            keyTree$Node = this.parent.children.get(1); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (keyTree$Node == this) {
          Iterator<String> iterator = KeyTree.this.options.configuration().getKeys(false).iterator();
          try {
            if (iterator.hasNext()) {
              try {
                if (((String)iterator.next()).equals(keyTree$Node.getName()));
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              return false;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
          return false;
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public int getIndentation() {
    return this.indent;
  }
  
  public void clear() {
    try {
      clearNode();
      if (this.parent != null)
        this.parent.children.remove(this); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public KeyTree$Node getLast() {
    try {
      if (!hasChildren())
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.children.get(this.children.size() - 1);
  }
  
  public String toString() {
    long l = a ^ 0x1315A8239C4BL;
    StringBuilder stringBuilder = new StringBuilder("{");
    try {
      stringBuilder.append("indent=").append(this.indent).append(", path=").append(StringUtils.wrap(getPath())).append(", name=").append(StringUtils.wrap(this.name)).append(", comment=").append(StringUtils.wrap(this.comment)).append(", side=").append(StringUtils.wrap(this.sideComment));
      stringBuilder.append(", isList=").append(this.isList);
      if (this.isList)
        stringBuilder.append("(").append(this.listSize).append(")"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append(", children=");
      if (this.children != null) {
        stringBuilder.append('(').append(this.children.size()).append(')');
        stringBuilder.append(this.children.stream().map(KeyTree$Node::getName).collect(Collectors.joining(", ", "[", "]")));
      } else {
        stringBuilder.append("[]");
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return stringBuilder.append('}').toString();
  }
  
  public String getPathWithName() {
    try {
      if (this.parent != null)
        try {
          return (this.parent != KeyTree.this.root) ? getPathWithNameUnchecked() : this.name;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.name;
  }
  
  public String getSideComment() {
    return this.sideComment;
  }
  
  public void setSideComment(String paramString) {
    this.sideComment = paramString;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\KeyTree$Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */