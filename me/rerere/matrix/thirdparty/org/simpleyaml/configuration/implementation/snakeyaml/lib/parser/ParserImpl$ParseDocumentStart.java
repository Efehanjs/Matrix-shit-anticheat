package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.StreamEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.StreamEndToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseDocumentStart implements Production {
  private static final long a = o3.a(692270397578126742L, -783475235028576524L, MethodHandles.lookup().lookupClass()).a(262868379702089L);
  
  public Event produce() {
    long l = a ^ 0x4038185E2B35L;
    try {
      while (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.DocumentEnd }))
        ParserImpl.this.scanner.getToken(); 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.StreamEnd })) {
      Token token = ParserImpl.this.scanner.peekToken();
      Mark mark = token.getStartMark();
      VersionTagsTuple versionTagsTuple = ParserImpl.access$800(ParserImpl.this);
      try {
        while (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment }))
          ParserImpl.this.scanner.getToken(); 
      } catch (ParserException parserException) {
        throw a(null);
      } 
      try {
        if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.StreamEnd })) {
          try {
            if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.DocumentStart }))
              throw new ParserException(null, null, "expected '<document start>', but found '" + ParserImpl.this.scanner.peekToken().getTokenId() + "'", ParserImpl.this.scanner.peekToken().getStartMark()); 
          } catch (ParserException parserException) {
            throw a(null);
          } 
          token = ParserImpl.this.scanner.getToken();
          Mark mark1 = token.getEndMark();
          DocumentStartEvent documentStartEvent = new DocumentStartEvent(mark, mark1, true, versionTagsTuple.getVersion(), versionTagsTuple.getTags());
          ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseDocumentEnd(ParserImpl.this, null));
          ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseDocumentContent(ParserImpl.this, null));
          return (Event)documentStartEvent;
        } 
      } catch (ParserException parserException) {
        throw a(null);
      } 
    } 
    StreamEndToken streamEndToken = (StreamEndToken)ParserImpl.this.scanner.getToken();
    StreamEndEvent streamEndEvent = new StreamEndEvent(streamEndToken.getStartMark(), streamEndToken.getEndMark());
    try {
      if (!ParserImpl.access$500(ParserImpl.this).isEmpty())
        throw new YAMLException("Unexpected end of stream. States left: " + ParserImpl.access$500(ParserImpl.this)); 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    try {
      if (!ParserImpl.access$1000(ParserImpl.this).isEmpty())
        throw new YAMLException("Unexpected end of stream. Marks left: " + ParserImpl.access$1000(ParserImpl.this)); 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    ParserImpl.access$102(ParserImpl.this, null);
    return (Event)streamEndEvent;
  }
  
  private static ParserException a(ParserException paramParserException) {
    return paramParserException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseDocumentStart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */