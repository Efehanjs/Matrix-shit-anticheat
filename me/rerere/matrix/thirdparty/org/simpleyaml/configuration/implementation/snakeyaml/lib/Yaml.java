package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.composer.Composer;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor.BaseConstructor;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor.Constructor;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter.Emitable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter.Emitter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector.BeanAccess;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser.Parser;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser.ParserImpl;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader.StreamReader;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader.UnicodeReader;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer.Representer;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.resolver.Resolver;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.serializer.Serializer;

public class Yaml {
  private String name;
  
  public BaseConstructor constructor;
  
  public Representer representer;
  
  public LoaderOptions loadingConfig;
  
  public final Resolver resolver;
  
  public DumperOptions dumperOptions;
  
  private static final long a = o3.a(-1294089039909913417L, -3566009651245799480L, MethodHandles.lookup().lookupClass()).a(14903868929010L);
  
  public Yaml(Representer paramRepresenter) {
    this((BaseConstructor)new Constructor(new LoaderOptions()), paramRepresenter);
  }
  
  public Node compose(Reader paramReader) {
    Composer composer = new Composer((Parser)new ParserImpl(new StreamReader(paramReader), this.loadingConfig), this.resolver, this.loadingConfig);
    return composer.getSingleNode();
  }
  
  public void addTypeDescription(TypeDescription paramTypeDescription) {
    this.constructor.addTypeDescription(paramTypeDescription);
    this.representer.addTypeDescription(paramTypeDescription);
  }
  
  public void dump(Object paramObject, Writer paramWriter) {
    ArrayList<Object> arrayList = new ArrayList(1);
    arrayList.add(paramObject);
    dumpAll(arrayList.iterator(), paramWriter, null);
  }
  
  public String dumpAs(Object paramObject, Tag paramTag, DumperOptions$FlowStyle paramDumperOptions$FlowStyle) {
    DumperOptions$FlowStyle dumperOptions$FlowStyle = this.representer.getDefaultFlowStyle();
    try {
      if (paramDumperOptions$FlowStyle != null)
        this.representer.setDefaultFlowStyle(paramDumperOptions$FlowStyle); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList = new ArrayList(1);
    arrayList.add(paramObject);
    StringWriter stringWriter = new StringWriter();
    dumpAll(arrayList.iterator(), stringWriter, paramTag);
    this.representer.setDefaultFlowStyle(dumperOptions$FlowStyle);
    return stringWriter.toString();
  }
  
  public Yaml(BaseConstructor paramBaseConstructor, Representer paramRepresenter, DumperOptions paramDumperOptions, Resolver paramResolver) {
    this(paramBaseConstructor, paramRepresenter, paramDumperOptions, new LoaderOptions(), paramResolver);
  }
  
  public Object load(String paramString) {
    return loadFromReader(new StreamReader(paramString), Object.class);
  }
  
  public Yaml(Representer paramRepresenter, DumperOptions paramDumperOptions) {
    this((BaseConstructor)new Constructor(new LoaderOptions()), paramRepresenter, paramDumperOptions);
  }
  
  public Node represent(Object paramObject) {
    return this.representer.represent(paramObject);
  }
  
  public void addImplicitResolver(Tag paramTag, Pattern paramPattern, String paramString) {
    this.resolver.addImplicitResolver(paramTag, paramPattern, paramString);
  }
  
  public String toString() {
    return this.name;
  }
  
  public Yaml(BaseConstructor paramBaseConstructor, Representer paramRepresenter, DumperOptions paramDumperOptions, LoaderOptions paramLoaderOptions, Resolver paramResolver) {
    if (!paramBaseConstructor.isExplicitPropertyUtils()) {
      paramBaseConstructor.setPropertyUtils(paramRepresenter.getPropertyUtils());
    } else {
      try {
        if (!paramRepresenter.isExplicitPropertyUtils())
          paramRepresenter.setPropertyUtils(paramBaseConstructor.getPropertyUtils()); 
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
    } 
    try {
      this.constructor = paramBaseConstructor;
      this.constructor.setAllowDuplicateKeys(paramLoaderOptions.isAllowDuplicateKeys());
      this.constructor.setWrappedToRootException(paramLoaderOptions.isWrappedToRootException());
      if (!paramDumperOptions.getIndentWithIndicator())
        try {
          if (paramDumperOptions.getIndent() <= paramDumperOptions.getIndicatorIndent())
            throw new YAMLException("Indicator indent must be smaller then indent."); 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    paramRepresenter.setDefaultFlowStyle(paramDumperOptions.getDefaultFlowStyle());
    paramRepresenter.setDefaultScalarStyle(paramDumperOptions.getDefaultScalarStyle());
    paramRepresenter.getPropertyUtils().setAllowReadOnlyProperties(paramDumperOptions.isAllowReadOnlyProperties());
    paramRepresenter.setTimeZone(paramDumperOptions.getTimeZone());
    this.representer = paramRepresenter;
    this.dumperOptions = paramDumperOptions;
    this.loadingConfig = paramLoaderOptions;
    this.resolver = paramResolver;
    this.name = "Yaml:" + System.identityHashCode(this);
  }
  
  public Yaml(DumperOptions paramDumperOptions) {
    this((BaseConstructor)new Constructor(new LoaderOptions()), new Representer(paramDumperOptions), paramDumperOptions);
  }
  
  public void setBeanAccess(BeanAccess paramBeanAccess) {
    this.constructor.getPropertyUtils().setBeanAccess(paramBeanAccess);
    this.representer.getPropertyUtils().setBeanAccess(paramBeanAccess);
  }
  
  public Iterable loadAll(String paramString) {
    return loadAll(new StringReader(paramString));
  }
  
  public void serialize(Node paramNode, Writer paramWriter) {
    Serializer serializer = new Serializer((Emitable)new Emitter(paramWriter, this.dumperOptions), this.resolver, this.dumperOptions, null);
    try {
      serializer.open();
      serializer.serialize(paramNode);
      serializer.close();
    } catch (IOException iOException) {
      throw new YAMLException(iOException);
    } 
  }
  
  public void dumpAll(Iterator paramIterator, Writer paramWriter) {
    dumpAll(paramIterator, paramWriter, null);
  }
  
  public Yaml() {
    this((BaseConstructor)new Constructor(new LoaderOptions()), new Representer(new DumperOptions()));
  }
  
  public String dump(Object paramObject) {
    ArrayList<Object> arrayList = new ArrayList(1);
    arrayList.add(paramObject);
    return dumpAll(arrayList.iterator());
  }
  
  public Object loadAs(Reader paramReader, Class paramClass) {
    return loadFromReader(new StreamReader(paramReader), paramClass);
  }
  
  public void addImplicitResolver(Tag paramTag, Pattern paramPattern, String paramString, int paramInt) {
    this.resolver.addImplicitResolver(paramTag, paramPattern, paramString, paramInt);
  }
  
  public String dumpAsMap(Object paramObject) {
    return dumpAs(paramObject, Tag.MAP, DumperOptions$FlowStyle.BLOCK);
  }
  
  public Yaml(BaseConstructor paramBaseConstructor) {
    this(paramBaseConstructor, new Representer(new DumperOptions()));
  }
  
  public Yaml(BaseConstructor paramBaseConstructor, Representer paramRepresenter, DumperOptions paramDumperOptions, LoaderOptions paramLoaderOptions) {
    this(paramBaseConstructor, paramRepresenter, paramDumperOptions, paramLoaderOptions, new Resolver());
  }
  
  public String getName() {
    return this.name;
  }
  
  public Yaml(BaseConstructor paramBaseConstructor, Representer paramRepresenter, DumperOptions paramDumperOptions) {
    this(paramBaseConstructor, paramRepresenter, paramDumperOptions, new LoaderOptions(), new Resolver());
  }
  
  public List serialize(Node paramNode) {
    Yaml$SilentEmitter yaml$SilentEmitter = new Yaml$SilentEmitter(null);
    Serializer serializer = new Serializer(yaml$SilentEmitter, this.resolver, this.dumperOptions, null);
    try {
      serializer.open();
      serializer.serialize(paramNode);
      serializer.close();
    } catch (IOException iOException) {
      throw new YAMLException(iOException);
    } 
    return yaml$SilentEmitter.getEvents();
  }
  
  public Iterable parse(Reader paramReader) {
    ParserImpl parserImpl = new ParserImpl(new StreamReader(paramReader), this.loadingConfig);
    Yaml$3 yaml$3 = new Yaml$3(this, (Parser)parserImpl);
    return new Yaml$EventIterable(yaml$3);
  }
  
  public String dumpAll(Iterator paramIterator) {
    StringWriter stringWriter = new StringWriter();
    dumpAll(paramIterator, stringWriter, null);
    return stringWriter.toString();
  }
  
  public Yaml(BaseConstructor paramBaseConstructor, Representer paramRepresenter) {
    this(paramBaseConstructor, paramRepresenter, initDumperOptions(paramRepresenter));
  }
  
  public Object loadAs(String paramString, Class paramClass) {
    return loadFromReader(new StreamReader(paramString), paramClass);
  }
  
  public Object load(InputStream paramInputStream) {
    return loadFromReader(new StreamReader((Reader)new UnicodeReader(paramInputStream)), Object.class);
  }
  
  public Iterable loadAll(InputStream paramInputStream) {
    return loadAll((Reader)new UnicodeReader(paramInputStream));
  }
  
  public Yaml(LoaderOptions paramLoaderOptions) {
    this((BaseConstructor)new Constructor(paramLoaderOptions), new Representer(new DumperOptions()), new DumperOptions(), paramLoaderOptions);
  }
  
  public Object loadAs(InputStream paramInputStream, Class paramClass) {
    return loadFromReader(new StreamReader((Reader)new UnicodeReader(paramInputStream)), paramClass);
  }
  
  public Object load(Reader paramReader) {
    return loadFromReader(new StreamReader(paramReader), Object.class);
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Iterable composeAll(Reader paramReader) {
    Composer composer = new Composer((Parser)new ParserImpl(new StreamReader(paramReader), this.loadingConfig), this.resolver, this.loadingConfig);
    Yaml$2 yaml$2 = new Yaml$2(this, composer);
    return new Yaml$NodeIterable(yaml$2);
  }
  
  public Iterable loadAll(Reader paramReader) {
    Composer composer = new Composer((Parser)new ParserImpl(new StreamReader(paramReader), this.loadingConfig), this.resolver, this.loadingConfig);
    this.constructor.setComposer(composer);
    Yaml$1 yaml$1 = new Yaml$1(this);
    return new Yaml$YamlIterable(yaml$1);
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\Yaml.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */