package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.composer;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentEventsCollector;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentLine;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.AliasEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.NodeEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.ScalarEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.SequenceStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser.Parser;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.resolver.Resolver;

public class Composer {
  private int nonScalarAliasesCount = 0;
  
  private final Set recursiveNodes;
  
  public final Parser parser;
  
  private final Resolver resolver;
  
  private final CommentEventsCollector inlineCommentsCollector;
  
  private final Map anchors;
  
  private int nestingDepth = 0;
  
  private final CommentEventsCollector blockCommentsCollector;
  
  private final LoaderOptions loadingConfig;
  
  private final int nestingDepthLimit;
  
  private static final long a = o3.a(8185343529496567520L, -98080041681503143L, MethodHandles.lookup().lookupClass()).a(202082747719592L);
  
  public Node composeSequenceNode(String paramString) {
    Tag tag;
    SequenceStartEvent sequenceStartEvent = (SequenceStartEvent)this.parser.getEvent();
    String str = sequenceStartEvent.getTag();
    boolean bool = false;
    try {
      if (str == null || str.equals("!")) {
        tag = this.resolver.resolve(NodeId.sequence, null, sequenceStartEvent.getImplicit());
        bool = true;
      } else {
        tag = new Tag(str);
      } 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    ArrayList<Node> arrayList = new ArrayList();
    SequenceNode sequenceNode = new SequenceNode(tag, bool, arrayList, sequenceStartEvent.getStartMark(), null, sequenceStartEvent.getFlowStyle());
    try {
      if (sequenceStartEvent.isFlow())
        sequenceNode.setBlockComments(this.blockCommentsCollector.consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    try {
      if (paramString != null) {
        sequenceNode.setAnchor(paramString);
        this.anchors.put(paramString, sequenceNode);
      } 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    while (true) {
      try {
        if (!this.parser.checkEvent(Event.ID.SequenceEnd)) {
          try {
            this.blockCommentsCollector.collectEvents();
            if (this.parser.checkEvent(Event.ID.SequenceEnd))
              break; 
          } catch (ComposerException composerException) {
            throw a(null);
          } 
          arrayList.add(composeNode((Node)sequenceNode));
          continue;
        } 
      } catch (ComposerException composerException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (sequenceStartEvent.isFlow())
        sequenceNode.setInLineComments(this.inlineCommentsCollector.collectEvents().consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    Event event = this.parser.getEvent();
    try {
      sequenceNode.setEndMark(event.getEndMark());
      this.inlineCommentsCollector.collectEvents();
      if (!this.inlineCommentsCollector.isEmpty())
        sequenceNode.setInLineComments(this.inlineCommentsCollector.consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    return (Node)sequenceNode;
  }
  
  public Node getNode() {
    this.blockCommentsCollector.collectEvents();
    if (this.parser.checkEvent(Event.ID.StreamEnd)) {
      List<CommentLine> list = this.blockCommentsCollector.consume();
      Mark mark = ((CommentLine)list.get(0)).getStartMark();
      List<?> list1 = Collections.emptyList();
      MappingNode mappingNode = new MappingNode(Tag.COMMENT, false, list1, mark, null, DumperOptions.FlowStyle.BLOCK);
      mappingNode.setBlockComments(list);
      return (Node)mappingNode;
    } 
    this.parser.getEvent();
    Node node = composeNode(null);
    try {
      this.blockCommentsCollector.collectEvents();
      if (!this.blockCommentsCollector.isEmpty())
        node.setEndComments(this.blockCommentsCollector.consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    this.parser.getEvent();
    this.anchors.clear();
    this.recursiveNodes.clear();
    return node;
  }
  
  public boolean checkNode() {
    try {
      if (this.parser.checkEvent(Event.ID.StreamStart))
        this.parser.getEvent(); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    try {
    
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    return !this.parser.checkEvent(Event.ID.StreamEnd);
  }
  
  public Node composeScalarNode(String paramString, List paramList) {
    Tag tag;
    ScalarEvent scalarEvent = (ScalarEvent)this.parser.getEvent();
    String str = scalarEvent.getTag();
    boolean bool = false;
    try {
      if (str == null || str.equals("!")) {
        tag = this.resolver.resolve(NodeId.scalar, scalarEvent.getValue(), scalarEvent.getImplicit().canOmitTagInPlainScalar());
        bool = true;
      } else {
        tag = new Tag(str);
      } 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    ScalarNode scalarNode = new ScalarNode(tag, bool, scalarEvent.getValue(), scalarEvent.getStartMark(), scalarEvent.getEndMark(), scalarEvent.getScalarStyle());
    try {
      if (paramString != null) {
        scalarNode.setAnchor(paramString);
        this.anchors.put(paramString, scalarNode);
      } 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    scalarNode.setBlockComments(paramList);
    scalarNode.setInLineComments(this.inlineCommentsCollector.collectEvents().consume());
    return (Node)scalarNode;
  }
  
  public Composer(Parser paramParser, Resolver paramResolver, LoaderOptions paramLoaderOptions) {
    this.parser = paramParser;
    this.resolver = paramResolver;
    this.anchors = new HashMap<>();
    this.recursiveNodes = new HashSet();
    this.loadingConfig = paramLoaderOptions;
    this.blockCommentsCollector = new CommentEventsCollector(paramParser, new CommentType[] { CommentType.BLANK_LINE, CommentType.BLOCK });
    this.inlineCommentsCollector = new CommentEventsCollector(paramParser, new CommentType[] { CommentType.IN_LINE });
    this.nestingDepthLimit = paramLoaderOptions.getNestingDepthLimit();
  }
  
  @Deprecated
  public Composer(Parser paramParser, Resolver paramResolver) {
    this(paramParser, paramResolver, new LoaderOptions());
  }
  
  public Node composeKeyNode(MappingNode paramMappingNode) {
    return composeNode((Node)paramMappingNode);
  }
  
  public Node composeMappingNode(String paramString) {
    Tag tag;
    MappingStartEvent mappingStartEvent = (MappingStartEvent)this.parser.getEvent();
    String str = mappingStartEvent.getTag();
    boolean bool = false;
    try {
      if (str == null || str.equals("!")) {
        tag = this.resolver.resolve(NodeId.mapping, null, mappingStartEvent.getImplicit());
        bool = true;
      } else {
        tag = new Tag(str);
      } 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    ArrayList arrayList = new ArrayList();
    MappingNode mappingNode = new MappingNode(tag, bool, arrayList, mappingStartEvent.getStartMark(), null, mappingStartEvent.getFlowStyle());
    try {
      if (mappingStartEvent.isFlow())
        mappingNode.setBlockComments(this.blockCommentsCollector.consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    try {
      if (paramString != null) {
        mappingNode.setAnchor(paramString);
        this.anchors.put(paramString, mappingNode);
      } 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    while (true) {
      try {
        if (!this.parser.checkEvent(Event.ID.MappingEnd)) {
          try {
            this.blockCommentsCollector.collectEvents();
            if (this.parser.checkEvent(Event.ID.MappingEnd))
              break; 
          } catch (ComposerException composerException) {
            throw a(null);
          } 
          composeMappingChildren(arrayList, mappingNode);
          continue;
        } 
      } catch (ComposerException composerException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (mappingStartEvent.isFlow())
        mappingNode.setInLineComments(this.inlineCommentsCollector.collectEvents().consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    Event event = this.parser.getEvent();
    try {
      mappingNode.setEndMark(event.getEndMark());
      this.inlineCommentsCollector.collectEvents();
      if (!this.inlineCommentsCollector.isEmpty())
        mappingNode.setInLineComments(this.inlineCommentsCollector.consume()); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    return (Node)mappingNode;
  }
  
  public void composeMappingChildren(List<NodeTuple> paramList, MappingNode paramMappingNode) {
    Node node1 = composeKeyNode(paramMappingNode);
    try {
      if (node1.getTag().equals(Tag.MERGE))
        paramMappingNode.setMerged(true); 
    } catch (ComposerException composerException) {
      throw a(null);
    } 
    Node node2 = composeValueNode(paramMappingNode);
    paramList.add(new NodeTuple(node1, node2));
  }
  
  public Node composeValueNode(MappingNode paramMappingNode) {
    return composeNode((Node)paramMappingNode);
  }
  
  public Node getSingleNode() {
    long l = a ^ 0x15A281C667F8L;
    this.parser.getEvent();
    Node node = null;
    if (!this.parser.checkEvent(Event.ID.StreamEnd))
      node = getNode(); 
    if (!this.parser.checkEvent(Event.ID.StreamEnd)) {
      Event event = this.parser.getEvent();
      try {
      
      } catch (ComposerException composerException) {
        throw a(null);
      } 
      Mark mark = (node != null) ? node.getStartMark() : null;
      throw new ComposerException("expected a single document in the stream", mark, "but found another document", event.getStartMark());
    } 
    this.parser.getEvent();
    return node;
  }
  
  private static ComposerException a(ComposerException paramComposerException) {
    return paramComposerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\composer\Composer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */