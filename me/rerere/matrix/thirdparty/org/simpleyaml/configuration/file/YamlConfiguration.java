package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.Configuration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlHeaderFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteStyle;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteValue;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.YamlImplementation;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.SnakeYamlImplementation;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.SupplierIO;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlConfiguration extends FileConfiguration {
  public YamlImplementation yamlImplementation;
  
  private static final long d = o3.a(-3011732201394720579L, 1098667170092959174L, MethodHandles.lookup().lookupClass()).a(108521087577658L);
  
  public void save(Writer paramWriter) throws IOException {
    long l = d ^ 0x3BBE785554EL;
    Validate.notNull(paramWriter, "Writer cannot be null");
    try {
      paramWriter.write(buildHeader());
      dump(paramWriter);
    } finally {
      paramWriter.close();
    } 
  }
  
  public void set(String paramString, Object paramObject, QuoteStyle paramQuoteStyle) {
    set(paramString, new QuoteValue(paramObject, paramQuoteStyle));
  }
  
  public YamlConfiguration(Configuration paramConfiguration) {
    this(paramConfiguration, (YamlImplementation)new SnakeYamlImplementation());
  }
  
  public void setImplementation(YamlImplementation paramYamlImplementation) {
    long l = d ^ 0x160A5D0F5B3BL;
    Validate.notNull(paramYamlImplementation, "YAML implementation cannot be null!");
    this.yamlImplementation = paramYamlImplementation;
    this.yamlImplementation.configure(options());
  }
  
  public String dump() throws IOException {
    return this.yamlImplementation.dump((ConfigurationSection)this);
  }
  
  @Deprecated
  public void load(InputStream paramInputStream) throws IOException, InvalidConfigurationException {
    super.load(paramInputStream);
  }
  
  public YamlConfigurationOptions options() {
    try {
      if (this.options == null)
        this.options = new YamlConfigurationOptions(this); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (YamlConfigurationOptions)this.options;
  }
  
  public static YamlConfiguration loadConfiguration(File paramFile) throws IOException {
    long l = d ^ 0x63CAA7318432L;
    Validate.notNull(paramFile, "File cannot be null");
    return load(paramYamlConfiguration -> paramYamlConfiguration.load(paramFile));
  }
  
  public void load(SupplierIO.InputStream paramInputStream) throws IOException, InvalidConfigurationException {
    long l = d ^ 0x7D92873141FAL;
    Validate.notNull(paramInputStream, "Stream supplier cannot be null");
    load(() -> new InputStreamReader((InputStream)paramInputStream.get(), options().charset()));
  }
  
  public YamlConfiguration(Configuration paramConfiguration, YamlImplementation paramYamlImplementation) {
    super(paramConfiguration);
    setImplementation(paramYamlImplementation);
  }
  
  @Deprecated
  public static YamlConfiguration loadConfiguration(Reader paramReader) throws IOException {
    long l = d ^ 0x70E42DD42BE7L;
    Validate.notNull(paramReader, "Reader cannot be null");
    return load(paramYamlConfiguration -> paramYamlConfiguration.load(paramReader));
  }
  
  public void load(File paramFile) throws FileNotFoundException, IOException, InvalidConfigurationException {
    long l = d ^ 0x7F6BFB01381FL;
    Validate.notNull(paramFile, "File cannot be null");
    load(() -> new FileInputStream(paramFile));
  }
  
  public void loadFromString(String paramString) throws IOException {
    long l = d ^ 0x305ADB0698A3L;
    Validate.notNull(paramString, "Contents cannot be null");
    load(() -> new StringReader(paramString));
  }
  
  public YamlConfiguration() {
    this((Configuration)null);
  }
  
  @Deprecated
  public static YamlConfiguration loadConfiguration(InputStream paramInputStream) throws IOException {
    long l = d ^ 0x4A3064446A6CL;
    Validate.notNull(paramInputStream, "Stream cannot be null");
    return load(paramYamlConfiguration -> paramYamlConfiguration.load(paramInputStream));
  }
  
  public void loadHeader(Reader paramReader) throws IOException {
    YamlConfigurationOptions yamlConfigurationOptions = options();
    YamlHeaderFormatter yamlHeaderFormatter = yamlConfigurationOptions.headerFormatter();
    boolean bool = yamlHeaderFormatter.stripPrefix();
    yamlHeaderFormatter.stripPrefix(false);
    yamlConfigurationOptions.header(yamlHeaderFormatter.parse(paramReader));
    yamlHeaderFormatter.stripPrefix(bool);
  }
  
  public YamlImplementation getImplementation() {
    return this.yamlImplementation;
  }
  
  public static YamlConfiguration loadConfiguration(SupplierIO.Reader paramReader) throws IOException {
    long l = d ^ 0x6418634C7E7FL;
    Validate.notNull(paramReader, "Reader supplier cannot be null");
    return load(paramYamlConfiguration -> paramYamlConfiguration.load(paramReader));
  }
  
  public static YamlConfiguration loadConfiguration(SupplierIO.InputStream paramInputStream) throws IOException {
    long l = d ^ 0x76D85E795A00L;
    Validate.notNull(paramInputStream, "Reader supplier cannot be null");
    return load(paramYamlConfiguration -> paramYamlConfiguration.load(paramInputStream));
  }
  
  public void load(SupplierIO.Reader paramReader) throws IOException, InvalidConfigurationException {
    long l = d ^ 0x233B46F1977AL;
    Validate.notNull(paramReader, "Reader supplier cannot be null");
    loadHeader((Reader)paramReader.get());
    this.yamlImplementation.load(paramReader, (ConfigurationSection)this);
  }
  
  public YamlConfiguration(YamlImplementation paramYamlImplementation) {
    this((Configuration)null, paramYamlImplementation);
  }
  
  public Object get(String paramString, Object paramObject) {
    Object object = super.get(paramString, paramObject);
    if (object instanceof QuoteValue)
      object = ((QuoteValue)object).getValue(); 
    return object;
  }
  
  public void set(String paramString, Object paramObject) {
    try {
      if (paramObject != null && !(paramObject instanceof QuoteValue)) {
        QuoteStyle quoteStyle = options().quoteStyleDefaults().getExplicitQuoteStyleInstanceOf(paramObject.getClass());
        try {
          if (quoteStyle != null) {
            set(paramString, paramObject, quoteStyle);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    super.set(paramString, paramObject);
  }
  
  public static YamlConfiguration loadConfigurationFromString(String paramString) throws IOException {
    return load(paramYamlConfiguration -> paramYamlConfiguration.loadFromString(paramString));
  }
  
  @Deprecated
  public void load(Reader paramReader) throws IOException, InvalidConfigurationException {
    super.load(paramReader);
  }
  
  public void dump(Writer paramWriter) throws IOException {
    long l = d ^ 0x5C1DCF83D302L;
    Validate.notNull(paramWriter, "Writer cannot be null");
    this.yamlImplementation.dump(paramWriter, (ConfigurationSection)this);
  }
  
  public String saveToString() throws IOException {
    StringWriter stringWriter = new StringWriter();
    save(stringWriter);
    return StringUtils.stripCarriage(stringWriter.toString());
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\YamlConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */