package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.serializer;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentLine;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter.Emitable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.AliasEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.CommentEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.ImplicitTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.ScalarEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.SequenceEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.SequenceStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.StreamEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.StreamStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.AnchorNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.resolver.Resolver;

public final class Serializer {
  private Boolean closed;
  
  private final Map anchors;
  
  private DumperOptions.Version useVersion;
  
  private final boolean explicitEnd;
  
  private final Emitable emitter;
  
  private final AnchorGenerator anchorGenerator;
  
  private final Set serializedNodes;
  
  private final Resolver resolver;
  
  private final boolean explicitStart;
  
  private final Map useTags;
  
  private final Tag explicitRoot;
  
  private static final long a = o3.a(-2120480945411405211L, 8755514346904707985L, MethodHandles.lookup().lookupClass()).a(90470610332372L);
  
  public void open() throws IOException {
    long l = a ^ 0x1FE338C39840L;
    try {
      if (this.closed == null) {
        this.emitter.emit((Event)new StreamStartEvent(null, null));
        this.closed = Boolean.FALSE;
      } else {
        try {
          if (Boolean.TRUE.equals(this.closed))
            throw new SerializerException("serializer is closed"); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        throw new SerializerException("serializer is already opened");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void serialize(Node paramNode) throws IOException {
    long l = a ^ 0x184A7F2426C8L;
    try {
      if (this.closed == null)
        throw new SerializerException("serializer is not opened"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.closed.booleanValue())
        throw new SerializerException("serializer is closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.emitter.emit((Event)new DocumentStartEvent(null, null, this.explicitStart, this.useVersion, this.useTags));
      anchorNode(paramNode);
      if (this.explicitRoot != null)
        paramNode.setTag(this.explicitRoot); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    serializeNode(paramNode, null);
    this.emitter.emit((Event)new DocumentEndEvent(null, null, this.explicitEnd));
    this.serializedNodes.clear();
    this.anchors.clear();
  }
  
  public void close() throws IOException {
    long l = a ^ 0x7B2588467E2FL;
    try {
      if (this.closed == null)
        throw new SerializerException("serializer is not opened"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!Boolean.TRUE.equals(this.closed)) {
        this.emitter.emit((Event)new StreamEndEvent(null, null));
        this.closed = Boolean.TRUE;
        this.serializedNodes.clear();
        this.anchors.clear();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Serializer(Emitable paramEmitable, Resolver paramResolver, DumperOptions paramDumperOptions, Tag paramTag) {
    this.emitter = paramEmitable;
    this.resolver = paramResolver;
    this.explicitStart = paramDumperOptions.isExplicitStart();
    this.explicitEnd = paramDumperOptions.isExplicitEnd();
    if (paramDumperOptions.getVersion() != null)
      this.useVersion = paramDumperOptions.getVersion(); 
    this.useTags = paramDumperOptions.getTags();
    this.serializedNodes = new HashSet();
    this.anchors = new HashMap<>();
    this.anchorGenerator = paramDumperOptions.getAnchorGenerator();
    this.closed = null;
    this.explicitRoot = paramTag;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\serializer\Serializer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */