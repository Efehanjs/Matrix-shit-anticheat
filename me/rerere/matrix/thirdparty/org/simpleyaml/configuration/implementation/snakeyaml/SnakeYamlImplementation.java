package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.YamlImplementationCommentable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.Yaml;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor.BaseConstructor;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.AnchorNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.resolver.Resolver;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;

public class SnakeYamlImplementation extends YamlImplementationCommentable {
  private SnakeYamlRepresenter yamlRepresenter;
  
  private DumperOptions dumperOptions;
  
  private SnakeYamlConstructor yamlConstructor;
  
  private LoaderOptions loaderOptions;
  
  private Resolver resolver;
  
  private Yaml yaml;
  
  private static final long b = o3.a(4441727376993231449L, -2334689269921409514L, MethodHandles.lookup().lookupClass()).a(41949168364435L);
  
  public DumperOptions getDumperOptions() {
    return this.dumperOptions;
  }
  
  public void dump(Writer paramWriter, ConfigurationSection paramConfigurationSection) throws IOException {
    configure(this.options);
    if (hasContent(paramWriter, paramConfigurationSection))
      try {
        SnakeYamlCommentMapper snakeYamlCommentMapper = null;
        KeyTree.Node node = null;
        try {
          if (this.yamlCommentMapper != null && this.options.useComments()) {
            snakeYamlCommentMapper = (SnakeYamlCommentMapper)this.yamlCommentMapper;
            if (paramConfigurationSection.getParent() == null) {
              node = snakeYamlCommentMapper.getKeyTree().getRoot();
            } else {
              node = snakeYamlCommentMapper.getNode(paramConfigurationSection.getCurrentPath());
            } 
          } 
        } catch (YAMLException yAMLException) {
          throw b(null);
        } 
        MappingNode mappingNode = sectionToMapping(paramConfigurationSection, node, snakeYamlCommentMapper);
        try {
          if (snakeYamlCommentMapper != null)
            snakeYamlCommentMapper.setFooter(mappingNode); 
        } catch (YAMLException yAMLException) {
          throw b(null);
        } 
        this.yaml.serialize((Node)mappingNode, paramWriter);
      } catch (YAMLException yAMLException) {
        throw new IOException(yAMLException);
      } finally {
        paramWriter.close();
      }  
  }
  
  public void trackMapping(MappingNode paramMappingNode, ConfigurationSection paramConfigurationSection, KeyTree.Node paramNode, SnakeYamlCommentMapper paramSnakeYamlCommentMapper) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 307
    //   4: aload_0
    //   5: getfield yamlConstructor : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlConstructor;
    //   8: aload_1
    //   9: invokevirtual flattenMapping : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;)V
    //   12: aload #4
    //   14: ifnull -> 32
    //   17: goto -> 24
    //   20: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: iconst_1
    //   25: goto -> 33
    //   28: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: iconst_0
    //   33: istore #5
    //   35: aload_1
    //   36: invokevirtual getValue : ()Ljava/util/List;
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #6
    //   46: aload #6
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 290
    //   56: aload #6
    //   58: invokeinterface next : ()Ljava/lang/Object;
    //   63: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeTuple
    //   66: astore #7
    //   68: aload #7
    //   70: invokevirtual getKeyNode : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   73: astore #8
    //   75: aload #7
    //   77: invokevirtual getValueNode : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   80: invokestatic resolveAnchor : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   83: astore #9
    //   85: aload_0
    //   86: aload #8
    //   88: iconst_1
    //   89: invokevirtual getName : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;Z)Ljava/lang/String;
    //   92: astore #10
    //   94: aload #9
    //   96: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   99: ifeq -> 132
    //   102: aload_0
    //   103: getfield yamlConstructor : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlConstructor;
    //   106: aload #9
    //   108: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   111: invokevirtual hasSerializedTypeKey : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;)Z
    //   114: ifeq -> 132
    //   117: goto -> 124
    //   120: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: iconst_1
    //   125: goto -> 133
    //   128: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: iconst_0
    //   133: istore #11
    //   135: aconst_null
    //   136: astore #12
    //   138: iload #5
    //   140: ifeq -> 211
    //   143: aload #4
    //   145: aload_3
    //   146: aload #10
    //   148: aload #8
    //   150: aload #9
    //   152: invokevirtual track : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Ljava/lang/String;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   155: astore #12
    //   157: aload #9
    //   159: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode
    //   162: ifeq -> 185
    //   165: aload_0
    //   166: aload #9
    //   168: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode
    //   171: aload #12
    //   173: aload #4
    //   175: invokevirtual trackSequence : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlCommentMapper;)V
    //   178: goto -> 211
    //   181: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: iload #11
    //   187: ifeq -> 211
    //   190: aload_0
    //   191: aload #9
    //   193: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   196: aconst_null
    //   197: aload #12
    //   199: aload #4
    //   201: invokevirtual trackMapping : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlCommentMapper;)V
    //   204: goto -> 211
    //   207: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: aload_2
    //   212: ifnull -> 287
    //   215: aload #9
    //   217: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   220: ifeq -> 270
    //   223: goto -> 230
    //   226: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: iload #11
    //   232: ifne -> 270
    //   235: goto -> 242
    //   238: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: aload_0
    //   243: aload #9
    //   245: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   248: aload_2
    //   249: aload #10
    //   251: invokeinterface createSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   256: aload #12
    //   258: aload #4
    //   260: invokevirtual trackMapping : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlCommentMapper;)V
    //   263: goto -> 287
    //   266: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   269: athrow
    //   270: aload_2
    //   271: aload #10
    //   273: aload_0
    //   274: getfield yamlConstructor : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlConstructor;
    //   277: aload #9
    //   279: invokevirtual construct : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)Ljava/lang/Object;
    //   282: invokeinterface set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   287: goto -> 46
    //   290: iload #5
    //   292: ifeq -> 307
    //   295: aload #4
    //   297: invokevirtual clearCurrentNodeIfNoComments : ()V
    //   300: goto -> 307
    //   303: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   4	28	28	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   94	117	120	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   102	128	128	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   157	181	181	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   185	204	207	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   211	223	226	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   215	235	238	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   230	266	266	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   290	300	303	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
  }
  
  public void setCommentsSequence(SequenceNode paramSequenceNode, KeyTree.Node paramNode, SnakeYamlCommentMapper paramSnakeYamlCommentMapper) {
    try {
      if (paramNode != null && paramNode.isList()) {
        byte b = 0;
        for (Node node : paramSequenceNode.getValue()) {
          node = resolveAnchor(node);
          KeyTree.Node node1 = paramNode.getElement(b);
          if (node1 == null) {
            String str = getName(node, false);
            if (str != null)
              node1 = paramNode.getPriority(str); 
          } 
          try {
            paramSnakeYamlCommentMapper.setComments(node1, node, (Node)null);
            if (node instanceof SequenceNode) {
              setCommentsSequence((SequenceNode)node, node1, paramSnakeYamlCommentMapper);
            } else {
              try {
                if (node instanceof MappingNode)
                  setCommentsMapping((MappingNode)node, node1, paramSnakeYamlCommentMapper); 
              } catch (YAMLException yAMLException) {
                throw b(null);
              } 
            } 
          } catch (YAMLException yAMLException) {
            throw b(null);
          } 
          b++;
        } 
      } 
    } catch (YAMLException yAMLException) {
      throw b(null);
    } 
  }
  
  public void setCommentsMapping(MappingNode paramMappingNode, KeyTree.Node paramNode, SnakeYamlCommentMapper paramSnakeYamlCommentMapper) {
    if (paramNode != null) {
      this.yamlConstructor.flattenMapping(paramMappingNode);
      for (NodeTuple nodeTuple : paramMappingNode.getValue()) {
        Node node1 = nodeTuple.getKeyNode();
        Node node2 = resolveAnchor(nodeTuple.getValueNode());
        String str = getName(node1, true);
        KeyTree.Node node = paramNode.getPriority(str);
        try {
          paramSnakeYamlCommentMapper.setComments(node, node1, node2);
          if (node2 instanceof SequenceNode) {
            setCommentsSequence((SequenceNode)node2, node, paramSnakeYamlCommentMapper);
            continue;
          } 
        } catch (YAMLException yAMLException) {
          throw b(null);
        } 
        try {
          if (node2 instanceof MappingNode)
            setCommentsMapping((MappingNode)node2, node, paramSnakeYamlCommentMapper); 
        } catch (YAMLException yAMLException) {
          throw b(null);
        } 
      } 
    } 
  }
  
  public void configure(YamlConfigurationOptions paramYamlConfigurationOptions) {
    super.configure(paramYamlConfigurationOptions);
    this.dumperOptions.setAllowUnicode(paramYamlConfigurationOptions.isUnicode());
    this.dumperOptions.setIndent(paramYamlConfigurationOptions.indent());
    this.dumperOptions.setIndicatorIndent(paramYamlConfigurationOptions.indentList());
    this.dumperOptions.setIndentWithIndicator(true);
    this.dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
    this.yamlRepresenter.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
    this.yamlRepresenter.setDefaultScalarStyle(SnakeYamlQuoteValue.getQuoteScalarStyle(paramYamlConfigurationOptions.quoteStyleDefaults().getDefaultQuoteStyle()));
    boolean bool = paramYamlConfigurationOptions.useComments();
    this.loaderOptions.setProcessComments(bool);
    this.dumperOptions.setProcessComments(bool);
  }
  
  public String getName(Node paramNode, boolean paramBoolean) {
    null = null;
    Object object = this.yamlConstructor.construct(paramNode);
    try {
      if (!paramBoolean)
        try {
          if (!(object instanceof String)) {
            try {
              if (object instanceof Number || object instanceof Boolean)
                return String.valueOf(object); 
            } catch (YAMLException yAMLException) {
              throw b(null);
            } 
            return null;
          } 
        } catch (YAMLException yAMLException) {
          throw b(null);
        }  
    } catch (YAMLException yAMLException) {
      throw b(null);
    } 
    return String.valueOf(object);
  }
  
  public final void setYaml(SnakeYamlConstructor paramSnakeYamlConstructor, SnakeYamlRepresenter paramSnakeYamlRepresenter, DumperOptions paramDumperOptions) {
    setYaml(paramSnakeYamlConstructor, paramSnakeYamlRepresenter, paramDumperOptions, new LoaderOptions(), new Resolver());
  }
  
  public void load(Reader paramReader, ConfigurationSection paramConfigurationSection) throws IOException, InvalidConfigurationException {
    long l = b ^ 0x2F2064CA791AL;
    try {
      configure(this.options);
      if (paramReader != null && paramConfigurationSection != null)
        try {
          SnakeYamlCommentMapper snakeYamlCommentMapper = null;
          KeyTree.Node node = null;
          if (this.options.useComments()) {
            this.yamlCommentMapper = snakeYamlCommentMapper = new SnakeYamlCommentMapper(this.options);
            node = snakeYamlCommentMapper.getKeyTree().getRoot();
          } 
          MappingNode mappingNode = (MappingNode)this.yaml.compose(paramReader);
          try {
            trackMapping(mappingNode, paramConfigurationSection, node, snakeYamlCommentMapper);
            if (this.yamlCommentMapper != null)
              ((SnakeYamlCommentMapper)this.yamlCommentMapper).trackFooter(mappingNode); 
          } catch (YAMLException yAMLException) {
            throw b(null);
          } 
        } catch (YAMLException yAMLException) {
          throw new InvalidConfigurationException(yAMLException);
        } catch (ClassCastException classCastException) {
          throw new InvalidConfigurationException("Top level is not a Map.");
        } finally {
          paramReader.close();
        }  
    } catch (YAMLException yAMLException) {
      throw b(null);
    } 
  }
  
  public void trackSequence(SequenceNode paramSequenceNode, KeyTree.Node paramNode, SnakeYamlCommentMapper paramSnakeYamlCommentMapper) {
    byte b = 0;
    for (Node node : paramSequenceNode.getValue()) {
      node = resolveAnchor(node);
      KeyTree.Node node1 = paramSnakeYamlCommentMapper.trackElement(paramNode, getName(node, false), node, b);
      try {
        if (node instanceof SequenceNode) {
          trackSequence((SequenceNode)node, node1, paramSnakeYamlCommentMapper);
        } else {
          try {
            if (node instanceof MappingNode)
              trackMapping((MappingNode)node, (ConfigurationSection)null, node1, paramSnakeYamlCommentMapper); 
          } catch (YAMLException yAMLException) {
            throw b(null);
          } 
        } 
      } catch (YAMLException yAMLException) {
        throw b(null);
      } 
      b++;
    } 
  }
  
  public SnakeYamlImplementation() {
    this(new SnakeYamlRepresenter());
  }
  
  public Resolver getResolver() {
    return this.resolver;
  }
  
  public SnakeYamlConstructor getConstructor() {
    return this.yamlConstructor;
  }
  
  public Yaml getYaml() {
    return this.yaml;
  }
  
  public SnakeYamlRepresenter getRepresenter() {
    return this.yamlRepresenter;
  }
  
  public boolean hasContent(Writer paramWriter, ConfigurationSection paramConfigurationSection) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 10
    //   4: iconst_0
    //   5: ireturn
    //   6: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   9: athrow
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_2
    //   13: ifnonnull -> 21
    //   16: iconst_1
    //   17: istore_3
    //   18: goto -> 70
    //   21: aload_2
    //   22: invokeinterface isEmpty : ()Z
    //   27: ifeq -> 70
    //   30: aload_2
    //   31: invokeinterface getDefaultSection : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   36: astore #4
    //   38: aload #4
    //   40: ifnull -> 60
    //   43: aload #4
    //   45: invokeinterface isEmpty : ()Z
    //   50: ifeq -> 68
    //   53: goto -> 60
    //   56: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: iconst_1
    //   61: goto -> 69
    //   64: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: iconst_0
    //   69: istore_3
    //   70: iload_3
    //   71: ifeq -> 88
    //   74: aload_1
    //   75: ldc_w ''
    //   78: invokevirtual write : (Ljava/lang/String;)V
    //   81: goto -> 88
    //   84: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: iload_3
    //   89: ifne -> 100
    //   92: iconst_1
    //   93: goto -> 101
    //   96: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iconst_0
    //   101: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/io/IOException
    //   38	53	56	java/io/IOException
    //   43	64	64	java/io/IOException
    //   70	81	84	java/io/IOException
    //   88	96	96	java/io/IOException
  }
  
  public SnakeYamlImplementation(SnakeYamlConstructor paramSnakeYamlConstructor, SnakeYamlRepresenter paramSnakeYamlRepresenter, DumperOptions paramDumperOptions) {
    setYaml(paramSnakeYamlConstructor, paramSnakeYamlRepresenter, paramDumperOptions);
  }
  
  public MappingNode sectionToMapping(ConfigurationSection paramConfigurationSection, KeyTree.Node paramNode, SnakeYamlCommentMapper paramSnakeYamlCommentMapper) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload_3
    //   10: ifnull -> 32
    //   13: aload_2
    //   14: ifnull -> 32
    //   17: goto -> 24
    //   20: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: iconst_1
    //   25: goto -> 33
    //   28: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: iconst_0
    //   33: istore #5
    //   35: aload_1
    //   36: iconst_0
    //   37: invokeinterface getValues : (Z)Ljava/util/Map;
    //   42: invokeinterface entrySet : ()Ljava/util/Set;
    //   47: invokeinterface iterator : ()Ljava/util/Iterator;
    //   52: astore #6
    //   54: aload #6
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 281
    //   64: aload #6
    //   66: invokeinterface next : ()Ljava/lang/Object;
    //   71: checkcast java/util/Map$Entry
    //   74: astore #7
    //   76: aload_0
    //   77: getfield yamlRepresenter : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlRepresenter;
    //   80: aload #7
    //   82: invokeinterface getKey : ()Ljava/lang/Object;
    //   87: invokevirtual represent : (Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   90: astore #8
    //   92: aload #7
    //   94: invokeinterface getValue : ()Ljava/lang/Object;
    //   99: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection
    //   102: ifeq -> 157
    //   105: aload #7
    //   107: invokeinterface getValue : ()Ljava/lang/Object;
    //   112: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection
    //   115: astore #10
    //   117: iload #5
    //   119: ifeq -> 140
    //   122: aload_2
    //   123: aload #10
    //   125: invokeinterface getName : ()Ljava/lang/String;
    //   130: invokevirtual getPriority : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   133: goto -> 141
    //   136: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aconst_null
    //   141: astore #11
    //   143: aload_0
    //   144: aload #10
    //   146: aload #11
    //   148: aload_3
    //   149: invokevirtual sectionToMapping : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlCommentMapper;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;
    //   152: astore #9
    //   154: goto -> 173
    //   157: aload_0
    //   158: getfield yamlRepresenter : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlRepresenter;
    //   161: aload #7
    //   163: invokeinterface getValue : ()Ljava/lang/Object;
    //   168: invokevirtual represent : (Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;
    //   171: astore #9
    //   173: iload #5
    //   175: ifeq -> 259
    //   178: aload_0
    //   179: aload #8
    //   181: iconst_1
    //   182: invokevirtual getName : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;Z)Ljava/lang/String;
    //   185: astore #10
    //   187: aload_2
    //   188: aload #10
    //   190: invokevirtual getPriority : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;
    //   193: astore #11
    //   195: aload_3
    //   196: aload #11
    //   198: aload #8
    //   200: aload #9
    //   202: invokevirtual setComments : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)V
    //   205: aload #9
    //   207: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode
    //   210: ifeq -> 232
    //   213: aload_0
    //   214: aload #9
    //   216: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode
    //   219: aload #11
    //   221: aload_3
    //   222: invokevirtual setCommentsSequence : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/SequenceNode;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlCommentMapper;)V
    //   225: goto -> 259
    //   228: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: aload #9
    //   234: instanceof me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   237: ifeq -> 259
    //   240: aload_0
    //   241: aload #9
    //   243: checkcast me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   246: aload #11
    //   248: aload_3
    //   249: invokevirtual setCommentsMapping : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/comments/KeyTree$Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/SnakeYamlCommentMapper;)V
    //   252: goto -> 259
    //   255: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload #4
    //   261: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/NodeTuple
    //   264: dup
    //   265: aload #8
    //   267: aload #9
    //   269: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Node;)V
    //   272: invokeinterface add : (Ljava/lang/Object;)Z
    //   277: pop
    //   278: goto -> 54
    //   281: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/MappingNode
    //   284: dup
    //   285: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Tag.MAP : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Tag;
    //   288: aload #4
    //   290: aload_0
    //   291: getfield dumperOptions : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions;
    //   294: invokevirtual getDefaultFlowStyle : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$FlowStyle;
    //   297: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/nodes/Tag;Ljava/util/List;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/DumperOptions$FlowStyle;)V
    //   300: areturn
    // Exception table:
    //   from	to	target	type
    //   9	17	20	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   13	28	28	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   117	136	136	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   195	228	228	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   232	252	255	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
  }
  
  public static Node resolveAnchor(Node paramNode) {
    while (paramNode instanceof AnchorNode)
      paramNode = ((AnchorNode)paramNode).getRealNode(); 
    return paramNode;
  }
  
  public void dumpYaml(Writer paramWriter, ConfigurationSection paramConfigurationSection) throws IOException {
    try {
      this.yaml.dump(paramConfigurationSection, paramWriter);
    } catch (YAMLException yAMLException) {
      throw new IOException(yAMLException);
    } 
  }
  
  public SnakeYamlImplementation(SnakeYamlRepresenter paramSnakeYamlRepresenter) {
    this(new SnakeYamlConstructor(), paramSnakeYamlRepresenter, new DumperOptions());
  }
  
  public LoaderOptions getLoaderOptions() {
    return this.loaderOptions;
  }
  
  public final void setYaml(SnakeYamlConstructor paramSnakeYamlConstructor, SnakeYamlRepresenter paramSnakeYamlRepresenter, DumperOptions paramDumperOptions, LoaderOptions paramLoaderOptions, Resolver paramResolver) {
    this.yamlConstructor = paramSnakeYamlConstructor;
    this.yamlRepresenter = paramSnakeYamlRepresenter;
    this.dumperOptions = paramDumperOptions;
    this.loaderOptions = paramLoaderOptions;
    this.resolver = paramResolver;
    this.yaml = new Yaml((BaseConstructor)this.yamlConstructor, this.yamlRepresenter, this.dumperOptions, this.loaderOptions, this.resolver);
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType) {
    try {
      if (this.yamlCommentMapper == null) {
        this.options.useComments(true);
        this.yamlCommentMapper = new SnakeYamlCommentMapper(this.options);
      } 
    } catch (YAMLException yAMLException) {
      throw b(null);
    } 
    this.yamlCommentMapper.setComment(paramString1, paramString2, paramCommentType);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlImplementation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */