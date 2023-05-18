package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.SequenceEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowSequenceEntry implements Production {
  private final boolean first;
  
  private static final long a = o3.a(2992181015859349362L, 845624924086049702L, MethodHandles.lookup().lookupClass()).a(36980327777423L);
  
  public ParserImpl$ParseFlowSequenceEntry(boolean paramBoolean) {
    this.first = paramBoolean;
  }
  
  public Event produce() {
    long l = a ^ 0x553830DA24E1L;
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowSequenceEntry(this.first));
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowSequenceEnd })) {
        try {
          if (!this.first)
            try {
              if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowEntry })) {
                try {
                  ParserImpl.this.scanner.getToken();
                  if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
                    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowSequenceEntry(true));
                    return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
                  } 
                } catch (ParserException parserException) {
                  throw a(null);
                } 
              } else {
                Token token1 = ParserImpl.this.scanner.peekToken();
                throw new ParserException("while parsing a flow sequence", (Mark)ParserImpl.access$1000(ParserImpl.this).pop(), "expected ',' or ']', but got " + token1.getTokenId(), token1.getStartMark());
              } 
            } catch (ParserException parserException) {
              throw a(null);
            }  
        } catch (ParserException parserException) {
          throw a(null);
        } 
        if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Key })) {
          Token token1 = ParserImpl.this.scanner.peekToken();
          MappingStartEvent mappingStartEvent = new MappingStartEvent(null, null, true, token1.getStartMark(), token1.getEndMark(), DumperOptions.FlowStyle.FLOW);
          ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowSequenceEntryMappingKey(ParserImpl.this, null));
          return (Event)mappingStartEvent;
        } 
        try {
          if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowSequenceEnd })) {
            ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseFlowSequenceEntry(false));
            return ParserImpl.access$2400(ParserImpl.this);
          } 
        } catch (ParserException parserException) {
          throw a(null);
        } 
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    Token token = ParserImpl.this.scanner.getToken();
    SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, (Production)ParserImpl.access$500(ParserImpl.this).pop());
      } else {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowEndComment(ParserImpl.this, null));
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    ParserImpl.access$1000(ParserImpl.this).pop();
    return (Event)sequenceEndEvent;
  }
  
  private static ParserException a(ParserException paramParserException) {
    return paramParserException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowSequenceEntry.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */