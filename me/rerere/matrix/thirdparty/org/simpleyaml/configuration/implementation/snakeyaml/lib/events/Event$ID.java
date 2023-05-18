package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum Event$ID {
  StreamEnd, SequenceStart, MappingStart, Alias, StreamStart, Comment, MappingEnd, DocumentStart, DocumentEnd, SequenceEnd, Scalar;
  
  static {
    DocumentStart = new Event$ID("DocumentStart", 3);
    MappingEnd = new Event$ID("MappingEnd", 4);
    MappingStart = new Event$ID("MappingStart", 5);
    Scalar = new Event$ID("Scalar", 6);
    SequenceEnd = new Event$ID("SequenceEnd", 7);
    SequenceStart = new Event$ID("SequenceStart", 8);
    StreamEnd = new Event$ID("StreamEnd", 9);
    StreamStart = new Event$ID("StreamStart", 10);
    $VALUES = new Event$ID[] { 
        Alias, Comment, DocumentEnd, DocumentStart, MappingEnd, MappingStart, Scalar, SequenceEnd, SequenceStart, StreamEnd, 
        StreamStart };
  }
  
  static {
    long l = o3.a(-2734198589180993646L, 437162179570424269L, MethodHandles.lookup().lookupClass()).a(208745180800560L) ^ 0x4F046FB759ABL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\Event$ID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */