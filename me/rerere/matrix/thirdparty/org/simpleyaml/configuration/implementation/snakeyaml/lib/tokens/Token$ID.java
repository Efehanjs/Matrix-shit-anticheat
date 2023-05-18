package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum Token$ID {
  FlowMappingStart,
  FlowMappingEnd,
  Error,
  BlockEnd,
  DocumentStart,
  BlockEntry,
  FlowEntry,
  Alias("<alias>"),
  FlowSequenceStart("<alias>"),
  StreamEnd("<alias>"),
  Directive("<alias>"),
  Value("<alias>"),
  Anchor("<anchor>"),
  Key("<anchor>"),
  BlockSequenceStart("<anchor>"),
  DocumentEnd("<anchor>"),
  StreamStart("<anchor>"),
  BlockMappingStart("<anchor>"),
  FlowSequenceEnd("<anchor>"),
  Comment("<anchor>"),
  Whitespace("<anchor>"),
  Scalar("<anchor>"),
  Tag("<anchor>");
  
  private final String description;
  
  public String toString() {
    return this.description;
  }
  
  static {
    BlockEnd = new Token$ID("BlockEnd", 2, "<block end>");
    BlockEntry = new Token$ID("BlockEntry", 3, "-");
    BlockMappingStart = new Token$ID("BlockMappingStart", 4, "<block mapping start>");
    BlockSequenceStart = new Token$ID("BlockSequenceStart", 5, "<block sequence start>");
    Directive = new Token$ID("Directive", 6, "<directive>");
    DocumentEnd = new Token$ID("DocumentEnd", 7, "<document end>");
    DocumentStart = new Token$ID("DocumentStart", 8, "<document start>");
    FlowEntry = new Token$ID("FlowEntry", 9, ",");
    FlowMappingEnd = new Token$ID("FlowMappingEnd", 10, "}");
    FlowMappingStart = new Token$ID("FlowMappingStart", 11, "{");
    FlowSequenceEnd = new Token$ID("FlowSequenceEnd", 12, "]");
    FlowSequenceStart = new Token$ID("FlowSequenceStart", 13, "[");
    Key = new Token$ID("Key", 14, "?");
    Scalar = new Token$ID("Scalar", 15, "<scalar>");
    StreamEnd = new Token$ID("StreamEnd", 16, "<stream end>");
    StreamStart = new Token$ID("StreamStart", 17, "<stream start>");
    Tag = new Token$ID("Tag", 18, "<tag>");
    Value = new Token$ID("Value", 19, ":");
    Whitespace = new Token$ID("Whitespace", 20, "<whitespace>");
    Comment = new Token$ID("Comment", 21, "#");
    Error = new Token$ID("Error", 22, "<error>");
    $VALUES = new Token$ID[] { 
        Alias, Anchor, BlockEnd, BlockEntry, BlockMappingStart, BlockSequenceStart, Directive, DocumentEnd, DocumentStart, FlowEntry, 
        FlowMappingEnd, FlowMappingStart, FlowSequenceEnd, FlowSequenceStart, Key, Scalar, StreamEnd, StreamStart, Tag, Value, 
        Whitespace, Comment, Error };
  }
  
  Token$ID(String paramString1) {
    this.description = paramString1;
  }
  
  static {
    long l = o3.a(7215993798058044315L, -7706599870421713802L, MethodHandles.lookup().lookupClass()).a(188483103446644L) ^ 0x4E488B820BE2L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\Token$ID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */