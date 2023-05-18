package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.CommentEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.ImplicitTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.ScalarEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader.StreamReader;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner.Scanner;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner.ScannerImpl;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.DirectiveToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.ArrayStack;

public class ParserImpl implements Parser {
  private Production state;
  
  private final ArrayStack states;
  
  private Event currentEvent;
  
  public final Scanner scanner;
  
  private final ArrayStack marks;
  
  private VersionTagsTuple directives;
  
  private static final Map DEFAULT_TAGS;
  
  private static final long a = o3.a(-640073772574580862L, 2787916967038261996L, MethodHandles.lookup().lookupClass()).a(220524801967744L);
  
  public boolean checkEvent(Event.ID paramID) {
    try {
      peekEvent();
      if (this.currentEvent != null)
        try {
          if (this.currentEvent.is(paramID));
        } catch (ParserException parserException) {
          throw a(null);
        }  
    } catch (ParserException parserException) {
      throw a(null);
    } 
    return false;
  }
  
  public ParserImpl(StreamReader paramStreamReader, LoaderOptions paramLoaderOptions) {
    this((Scanner)new ScannerImpl(paramStreamReader, paramLoaderOptions));
  }
  
  @Deprecated
  public ParserImpl(StreamReader paramStreamReader) {
    this((Scanner)new ScannerImpl(paramStreamReader));
  }
  
  public Event peekEvent() {
    try {
      if (this.currentEvent == null)
        try {
          if (this.state != null)
            this.currentEvent = this.state.produce(); 
        } catch (ParserException parserException) {
          throw a(null);
        }  
    } catch (ParserException parserException) {
      throw a(null);
    } 
    return this.currentEvent;
  }
  
  public Event getEvent() {
    peekEvent();
    Event event = this.currentEvent;
    this.currentEvent = null;
    return event;
  }
  
  @Deprecated
  public ParserImpl(StreamReader paramStreamReader, boolean paramBoolean) {
    this((Scanner)new ScannerImpl(paramStreamReader, (new LoaderOptions()).setProcessComments(paramBoolean)));
  }
  
  public ParserImpl(Scanner paramScanner) {
    this.scanner = paramScanner;
    this.currentEvent = null;
    this.directives = new VersionTagsTuple(null, new HashMap<>(DEFAULT_TAGS));
    this.states = new ArrayStack(100);
    this.marks = new ArrayStack(10);
    this.state = new ParserImpl$ParseStreamStart(this, null);
  }
  
  static {
    long l = a ^ 0x6D79BB4029C8L;
    DEFAULT_TAGS = new HashMap<>();
    DEFAULT_TAGS.put("!", "!");
    DEFAULT_TAGS.put("!!", "tag:yaml.org,2002:");
  }
  
  private static ParserException a(ParserException paramParserException) {
    return paramParserException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */