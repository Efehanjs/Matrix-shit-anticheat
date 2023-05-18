package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.TypeDescription;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.Property;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.CollectionNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class Constructor$ConstructMapping implements Construct {
  private static final long a = o3.a(4942737248834145537L, 2027598828943932867L, MethodHandles.lookup().lookupClass()).a(180295895037347L);
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    try {
      if (Map.class.isAssignableFrom(paramNode.getType())) {
        Constructor.this.constructMapping2ndStep((MappingNode)paramNode, (Map)paramObject);
      } else {
        try {
          if (Set.class.isAssignableFrom(paramNode.getType())) {
            Constructor.this.constructSet2ndStep((MappingNode)paramNode, (Set)paramObject);
          } else {
            constructJavaBean2ndStep((MappingNode)paramNode, paramObject);
          } 
        } catch (ConstructorException constructorException) {
          throw a(null);
        } 
      } 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
  }
  
  public Property getProperty(Class paramClass, String paramString) {
    return Constructor.this.getPropertyUtils().getProperty(paramClass, paramString);
  }
  
  public Object construct(Node paramNode) {
    long l = a ^ 0x5E98D7E1CB32L;
    MappingNode mappingNode = (MappingNode)paramNode;
    try {
      if (Map.class.isAssignableFrom(paramNode.getType())) {
        try {
          if (paramNode.isTwoStepsConstruction())
            return Constructor.this.newMap(mappingNode); 
        } catch (ConstructorException constructorException) {
          throw a(null);
        } 
        return Constructor.this.constructMapping(mappingNode);
      } 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    try {
      if (Collection.class.isAssignableFrom(paramNode.getType())) {
        try {
          if (paramNode.isTwoStepsConstruction())
            return Constructor.this.newSet((CollectionNode)mappingNode); 
        } catch (ConstructorException constructorException) {
          throw a(null);
        } 
        return Constructor.this.constructSet(mappingNode);
      } 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    Object object = Constructor.this.newInstance((Node)mappingNode);
    try {
      if (object != BaseConstructor.NOT_INSTANTIATED_OBJECT) {
        try {
          if (paramNode.isTwoStepsConstruction())
            return object; 
        } catch (ConstructorException constructorException) {
          throw a(null);
        } 
        return constructJavaBean2ndStep(mappingNode, object);
      } 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    throw new ConstructorException(null, null, "Can't create an instance for " + mappingNode.getTag(), paramNode.getStartMark());
  }
  
  public Object constructJavaBean2ndStep(MappingNode paramMappingNode, Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/Constructor$ConstructMapping.a : J
    //   3: ldc2_w 126894449710401
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/Constructor;
    //   12: aload_1
    //   13: iconst_1
    //   14: invokevirtual flattenMapping : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;Z)V
    //   17: aload_1
    //   18: invokevirtual getType : ()Ljava/lang/Class;
    //   21: astore #5
    //   23: aload_1
    //   24: invokevirtual getValue : ()Ljava/util/List;
    //   27: astore #6
    //   29: aload #6
    //   31: invokeinterface iterator : ()Ljava/util/Iterator;
    //   36: astore #7
    //   38: aload #7
    //   40: invokeinterface hasNext : ()Z
    //   45: ifeq -> 675
    //   48: aload #7
    //   50: invokeinterface next : ()Ljava/lang/Object;
    //   55: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeTuple
    //   58: astore #8
    //   60: aload #8
    //   62: invokevirtual getValueNode : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   65: astore #9
    //   67: aload_0
    //   68: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/Constructor;
    //   71: aload #8
    //   73: invokevirtual getKeyNode : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   76: invokevirtual constructObject : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Ljava/lang/Object;
    //   79: checkcast java/lang/String
    //   82: astore #10
    //   84: aload_0
    //   85: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/Constructor;
    //   88: getfield typeDefinitions : Ljava/util/Map;
    //   91: aload #5
    //   93: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   98: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/TypeDescription
    //   101: astore #11
    //   103: aload #11
    //   105: ifnonnull -> 123
    //   108: aload_0
    //   109: aload #5
    //   111: aload #10
    //   113: invokevirtual getProperty : (Ljava/lang/Class;Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/Property;
    //   116: goto -> 130
    //   119: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   122: athrow
    //   123: aload #11
    //   125: aload #10
    //   127: invokevirtual getProperty : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/Property;
    //   130: astore #12
    //   132: aload #12
    //   134: invokevirtual isWritable : ()Z
    //   137: ifne -> 185
    //   140: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   143: dup
    //   144: new java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: ldc 'No writable property ''
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload #10
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: ldc '' on class: '
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: aload #5
    //   168: invokevirtual getName : ()Ljava/lang/String;
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: invokespecial <init> : (Ljava/lang/String;)V
    //   180: athrow
    //   181: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   184: athrow
    //   185: aload #9
    //   187: aload #12
    //   189: invokevirtual getType : ()Ljava/lang/Class;
    //   192: invokevirtual setType : (Ljava/lang/Class;)V
    //   195: aload #11
    //   197: ifnull -> 227
    //   200: aload #11
    //   202: aload #10
    //   204: aload #9
    //   206: invokevirtual setupPropertyType : (Ljava/lang/String;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Z
    //   209: ifeq -> 227
    //   212: goto -> 219
    //   215: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   218: athrow
    //   219: iconst_1
    //   220: goto -> 228
    //   223: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   226: athrow
    //   227: iconst_0
    //   228: istore #13
    //   230: iload #13
    //   232: ifne -> 414
    //   235: aload #9
    //   237: invokevirtual getNodeId : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeId;
    //   240: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeId.scalar : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeId;
    //   243: if_acmpeq -> 414
    //   246: goto -> 253
    //   249: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   252: athrow
    //   253: aload #12
    //   255: invokevirtual getActualTypeArguments : ()[Ljava/lang/Class;
    //   258: astore #14
    //   260: aload #14
    //   262: ifnull -> 414
    //   265: aload #14
    //   267: arraylength
    //   268: ifle -> 414
    //   271: goto -> 278
    //   274: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   277: athrow
    //   278: aload #9
    //   280: invokevirtual getNodeId : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeId;
    //   283: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeId.sequence : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeId;
    //   286: if_acmpne -> 319
    //   289: goto -> 296
    //   292: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   295: athrow
    //   296: aload #14
    //   298: iconst_0
    //   299: aaload
    //   300: astore #15
    //   302: aload #9
    //   304: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode
    //   307: astore #16
    //   309: aload #16
    //   311: aload #15
    //   313: invokevirtual setListType : (Ljava/lang/Class;)V
    //   316: goto -> 414
    //   319: ldc java/util/Map
    //   321: aload #9
    //   323: invokevirtual getType : ()Ljava/lang/Class;
    //   326: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   329: ifeq -> 372
    //   332: aload #14
    //   334: iconst_0
    //   335: aaload
    //   336: astore #15
    //   338: aload #14
    //   340: iconst_1
    //   341: aaload
    //   342: astore #16
    //   344: aload #9
    //   346: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   349: astore #17
    //   351: aload #17
    //   353: aload #15
    //   355: aload #16
    //   357: invokevirtual setTypes : (Ljava/lang/Class;Ljava/lang/Class;)V
    //   360: aload #17
    //   362: iconst_1
    //   363: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   366: invokevirtual setUseClassConstructor : (Ljava/lang/Boolean;)V
    //   369: goto -> 414
    //   372: ldc java/util/Collection
    //   374: aload #9
    //   376: invokevirtual getType : ()Ljava/lang/Class;
    //   379: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   382: ifeq -> 414
    //   385: aload #14
    //   387: iconst_0
    //   388: aaload
    //   389: astore #15
    //   391: aload #9
    //   393: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   396: astore #16
    //   398: aload #16
    //   400: aload #15
    //   402: invokevirtual setOnlyKeyType : (Ljava/lang/Class;)V
    //   405: aload #16
    //   407: iconst_1
    //   408: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   411: invokevirtual setUseClassConstructor : (Ljava/lang/Boolean;)V
    //   414: aload #11
    //   416: ifnull -> 436
    //   419: aload_0
    //   420: aload #11
    //   422: aload #10
    //   424: aload #9
    //   426: invokespecial newInstance : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/TypeDescription;Ljava/lang/String;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Ljava/lang/Object;
    //   429: goto -> 445
    //   432: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   435: athrow
    //   436: aload_0
    //   437: getfield this$0 : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/Constructor;
    //   440: aload #9
    //   442: invokevirtual constructObject : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Ljava/lang/Object;
    //   445: astore #14
    //   447: aload #12
    //   449: invokevirtual getType : ()Ljava/lang/Class;
    //   452: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   455: if_acmpeq -> 476
    //   458: aload #12
    //   460: invokevirtual getType : ()Ljava/lang/Class;
    //   463: ldc_w java/lang/Float
    //   466: if_acmpne -> 504
    //   469: goto -> 476
    //   472: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   475: athrow
    //   476: aload #14
    //   478: instanceof java/lang/Double
    //   481: ifeq -> 504
    //   484: goto -> 491
    //   487: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   490: athrow
    //   491: aload #14
    //   493: checkcast java/lang/Double
    //   496: invokevirtual floatValue : ()F
    //   499: invokestatic valueOf : (F)Ljava/lang/Float;
    //   502: astore #14
    //   504: aload #12
    //   506: invokevirtual getType : ()Ljava/lang/Class;
    //   509: ldc java/lang/String
    //   511: if_acmpne -> 567
    //   514: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Tag.BINARY : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Tag;
    //   517: aload #9
    //   519: invokevirtual getTag : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Tag;
    //   522: invokevirtual equals : (Ljava/lang/Object;)Z
    //   525: ifeq -> 567
    //   528: goto -> 535
    //   531: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   534: athrow
    //   535: aload #14
    //   537: instanceof [B
    //   540: ifeq -> 567
    //   543: goto -> 550
    //   546: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   549: athrow
    //   550: new java/lang/String
    //   553: dup
    //   554: aload #14
    //   556: checkcast [B
    //   559: checkcast [B
    //   562: invokespecial <init> : ([B)V
    //   565: astore #14
    //   567: aload #11
    //   569: ifnull -> 592
    //   572: aload #11
    //   574: aload_2
    //   575: aload #10
    //   577: aload #14
    //   579: invokevirtual setProperty : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
    //   582: ifne -> 607
    //   585: goto -> 592
    //   588: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   591: athrow
    //   592: aload #12
    //   594: aload_2
    //   595: aload #14
    //   597: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   600: goto -> 607
    //   603: invokestatic a : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException;
    //   606: athrow
    //   607: goto -> 672
    //   610: astore #11
    //   612: aload #11
    //   614: athrow
    //   615: astore #11
    //   617: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/ConstructorException
    //   620: dup
    //   621: new java/lang/StringBuilder
    //   624: dup
    //   625: invokespecial <init> : ()V
    //   628: ldc_w 'Cannot create property='
    //   631: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   634: aload #10
    //   636: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   639: ldc_w ' for JavaBean='
    //   642: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   645: aload_2
    //   646: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   649: invokevirtual toString : ()Ljava/lang/String;
    //   652: aload_1
    //   653: invokevirtual getStartMark : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   656: aload #11
    //   658: invokevirtual getMessage : ()Ljava/lang/String;
    //   661: aload #9
    //   663: invokevirtual getStartMark : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;
    //   666: aload #11
    //   668: invokespecial <init> : (Ljava/lang/String;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;Ljava/lang/String;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/Mark;Ljava/lang/Throwable;)V
    //   671: athrow
    //   672: goto -> 38
    //   675: aload_2
    //   676: areturn
    // Exception table:
    //   from	to	target	type
    //   84	607	610	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   84	607	615	java/lang/Exception
    //   103	119	119	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   132	181	181	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   185	212	215	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   200	223	223	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   230	246	249	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   260	271	274	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   265	289	292	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   414	432	432	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   447	469	472	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   458	484	487	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   504	528	531	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   514	543	546	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   567	585	588	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
    //   572	600	603	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/constructor/DuplicateKeyException
  }
  
  private static ConstructorException a(ConstructorException paramConstructorException) {
    return paramConstructorException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\Constructor$ConstructMapping.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */