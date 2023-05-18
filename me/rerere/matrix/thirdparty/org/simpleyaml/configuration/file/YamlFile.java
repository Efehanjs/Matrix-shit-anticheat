package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Collection;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.Commentable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentMapper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormat;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlHeaderFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.SimpleYamlImplementation;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteValue;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.YamlImplementation;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.YamlImplementationCommentable;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.SupplierIO;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public class YamlFile extends YamlConfiguration implements Commentable {
  private File configFile;
  
  private static final long e = o3.a(-8517383119975631560L, -7555250813674001891L, MethodHandles.lookup().lookupClass()).a(175226632765374L);
  
  public String getFilePath() {
    long l = e ^ 0x74A7353D768BL;
    Validate.notNull(this.configFile, "This configuration file is null!");
    return this.configFile.getAbsolutePath();
  }
  
  public static YamlFile loadConfiguration(SupplierIO.Reader paramReader) throws IOException {
    return loadConfiguration(paramReader, false);
  }
  
  public String getComment(String paramString, CommentType paramCommentType, YamlCommentFormat paramYamlCommentFormat) {
    long l = e ^ 0x7AF19CF6BF4CL;
    Validate.notNull(paramYamlCommentFormat, "yamlCommentFormat cannot be null!");
    return getComment(paramString, paramCommentType, paramYamlCommentFormat.commentFormatter());
  }
  
  public String getComment(String paramString, CommentType paramCommentType) {
    try {
      if (this.yamlImplementation instanceof YamlImplementationCommentable)
        return ((YamlImplementationCommentable)this.yamlImplementation).getComment(paramString, paramCommentType); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return null;
  }
  
  public void setConfigurationFile(URI paramURI) throws IllegalArgumentException {
    long l = e ^ 0x2D87B89181A1L;
    Validate.notNull(paramURI, "URI cannot be null.");
    setConfigFile(new File(paramURI));
  }
  
  public long getSize() {
    return this.configFile.length();
  }
  
  public YamlFile(File paramFile) throws IllegalArgumentException {
    this();
    setConfigurationFile(paramFile);
  }
  
  public String getFooter() {
    return getComment((String)null);
  }
  
  public boolean exists() {
    try {
      if (this.configFile != null)
        try {
          if (this.configFile.exists());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return false;
  }
  
  public String toString() {
    try {
      return saveToString();
    } catch (IOException iOException) {
      return iOException.getMessage();
    } 
  }
  
  public void setComment(String paramString1, String paramString2, YamlCommentFormatter paramYamlCommentFormatter) {
    setComment(paramString1, paramString2, CommentType.BLOCK, paramYamlCommentFormatter);
  }
  
  public YamlFile() {
    super((YamlImplementation)new SimpleYamlImplementation());
  }
  
  public void loadWithComments() throws InvalidConfigurationException, IOException {
    options().useComments(true);
    load();
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType) {
    try {
      if (this.yamlImplementation instanceof YamlImplementationCommentable)
        ((YamlImplementationCommentable)this.yamlImplementation).setComment(paramString1, paramString2, paramCommentType); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  @Deprecated
  public static YamlFile loadConfiguration(Reader paramReader, boolean paramBoolean) throws IOException {
    long l = e ^ 0x2C876D78332CL;
    Validate.notNull(paramReader, "Reader cannot be null");
    return load(paramYamlFile -> paramYamlFile.load(paramReader), paramBoolean);
  }
  
  public String saveToString() throws IOException {
    return super.saveToString();
  }
  
  public void copyTo(File paramFile) throws FileNotFoundException, IllegalArgumentException, IOException {
    long l = e ^ 0x4C2B4578C2C0L;
    try {
      Validate.notNull(this.configFile, "This configuration file is null!");
      if (!this.configFile.exists())
        throw new FileNotFoundException(this.configFile.getName() + " is not found in " + this.configFile.getAbsolutePath()); 
    } catch (Throwable throwable) {
      throw b(null);
    } 
    try {
      if (paramFile.isDirectory())
        throw new IllegalArgumentException(paramFile.getAbsolutePath() + " is a directory!"); 
    } catch (Throwable throwable) {
      throw b(null);
    } 
    try {
      OutputStream outputStream = Files.newOutputStream(paramFile.toPath(), new java.nio.file.OpenOption[0]);
      Throwable throwable = null;
      try {
        Files.copy(this.configFile.toPath(), outputStream);
      } catch (Throwable throwable1) {
        throwable = throwable1;
        throw throwable1;
      } finally {
        try {
          if (outputStream != null)
            if (throwable != null) {
              try {
                outputStream.close();
              } catch (Throwable throwable1) {
                throwable.addSuppressed(throwable1);
              } 
            } else {
              outputStream.close();
            }  
        } catch (Throwable throwable1) {
          throw b(null);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void setFooter(String paramString) {
    setComment((String)null, paramString);
  }
  
  public YamlFile(URL paramURL) throws IllegalArgumentException, URISyntaxException {
    this(paramURL.toURI());
  }
  
  public YamlFileWrapper path(String paramString) {
    return new YamlFileWrapper(this, paramString);
  }
  
  public String getComment(String paramString, YamlCommentFormatter paramYamlCommentFormatter) {
    return getComment(paramString, CommentType.BLOCK, paramYamlCommentFormatter);
  }
  
  public void createOrLoadWithComments() throws IOException, InvalidConfigurationException {
    createNewFile(false);
    loadWithComments();
  }
  
  public File getConfigurationFile() {
    return this.configFile;
  }
  
  public static YamlFile loadConfiguration(SupplierIO.InputStream paramInputStream, boolean paramBoolean) throws IOException {
    long l = e ^ 0x7336639D992BL;
    Validate.notNull(paramInputStream, "Stream supplier cannot be null");
    return load(paramYamlFile -> paramYamlFile.load(paramInputStream), paramBoolean);
  }
  
  public void setCommentFormat(YamlCommentFormatter paramYamlCommentFormatter) {
    options().commentFormatter(paramYamlCommentFormatter);
  }
  
  public void deleteFile() throws IOException {
    long l = e ^ 0x1ECA9AF5157FL;
    try {
      Validate.notNull(this.configFile, "This configuration file is null!");
      if (!this.configFile.delete())
        throw new IOException("Failed to delete " + this.configFile); 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  public YamlFile(String paramString) throws IllegalArgumentException {
    this();
    setConfigurationFile(paramString);
  }
  
  public static YamlFile loadConfiguration(File paramFile, boolean paramBoolean) throws IOException {
    long l = e ^ 0x10567ED6152EL;
    Validate.notNull(paramFile, "File cannot be null");
    return load(paramYamlFile -> {
          paramYamlFile.setConfigurationFile(paramFile);
          paramYamlFile.load();
        }paramBoolean);
  }
  
  public String getComment(String paramString) {
    return getComment(paramString, CommentType.BLOCK);
  }
  
  public void setConfigurationFile(File paramFile) throws IllegalArgumentException {
    long l = e ^ 0x8464F1D992BL;
    Validate.notNull(paramFile, "File cannot be null.");
    setConfigFile(paramFile);
  }
  
  public void setBlankLine(String paramString) {
    YamlCommentFormatter yamlCommentFormatter = options().commentFormatter();
    setCommentFormat(YamlCommentFormat.RAW);
    String str = getComment(paramString, CommentType.BLOCK);
    try {
      if (str == null) {
        setComment(paramString, "\n", CommentType.BLOCK);
      } else {
        setComment(paramString, '\n' + str, CommentType.BLOCK);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    setCommentFormat(yamlCommentFormatter);
  }
  
  public static YamlFile loadConfiguration(SupplierIO.Reader paramReader, boolean paramBoolean) throws IOException {
    long l = e ^ 0x6CD448613245L;
    Validate.notNull(paramReader, "Reader supplier cannot be null");
    return load(paramYamlFile -> paramYamlFile.load(paramReader), paramBoolean);
  }
  
  public String fileToString() throws IOException {
    try {
      if (!exists())
        return null; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return new String(Files.readAllBytes(this.configFile.toPath()));
  }
  
  public void createOrLoad() throws IOException, InvalidConfigurationException {
    createNewFile(false);
    load();
  }
  
  public void setHeader(String paramString) {
    options().header(paramString);
  }
  
  public YamlFile(YamlImplementation paramYamlImplementation) {
    super(paramYamlImplementation);
  }
  
  public static YamlFile loadConfiguration(SupplierIO.InputStream paramInputStream) throws IOException {
    return loadConfiguration(paramInputStream, false);
  }
  
  public void setConfigurationFile(String paramString) throws IllegalArgumentException {
    long l = e ^ 0x587CC5DA2475L;
    Validate.notNull(paramString, "Path cannot be null.");
    setConfigFile(new File(paramString));
  }
  
  public String getComment(String paramString, YamlCommentFormat paramYamlCommentFormat) {
    return getComment(paramString, CommentType.BLOCK, paramYamlCommentFormat);
  }
  
  public void setCommentFormat(YamlCommentFormat paramYamlCommentFormat) {
    long l = e ^ 0x79F3C6EC2EA9L;
    Validate.notNull(paramYamlCommentFormat, "yamlCommentFormat cannot be null!");
    setCommentFormat(paramYamlCommentFormat.commentFormatter());
  }
  
  @Deprecated
  public static YamlFile loadConfiguration(InputStream paramInputStream) throws IOException {
    return loadConfiguration(paramInputStream, false);
  }
  
  public static YamlFile loadConfigurationFromString(String paramString, boolean paramBoolean) throws IOException {
    return load(paramYamlFile -> paramYamlFile.loadFromString(paramString), paramBoolean);
  }
  
  public static YamlFile loadConfigurationFromString(String paramString) throws IOException {
    return loadConfigurationFromString(paramString, false);
  }
  
  public String getHeader() {
    long l = e ^ 0x6F6CF85D70ABL;
    YamlConfigurationOptions yamlConfigurationOptions = options();
    YamlHeaderFormatter yamlHeaderFormatter = yamlConfigurationOptions.headerFormatter();
    try {
      return yamlHeaderFormatter.parse(yamlHeaderFormatter.dump(yamlConfigurationOptions.header()));
    } catch (IOException iOException) {
      throw new RuntimeException("Cannot parse header", iOException);
    } 
  }
  
  public void createNewFile() throws IOException {
    createNewFile(false);
  }
  
  public void createNewFile(boolean paramBoolean) throws IOException {
    long l = e ^ 0x213830F27CDFL;
    try {
      Validate.notNull(this.configFile, "This configuration file is null!");
      if (paramBoolean || !this.configFile.exists())
        try {
          File file = this.configFile.getParentFile();
          try {
            if (file != null)
              try {
                if (!file.exists())
                  try {
                    if (!file.mkdirs())
                      throw new IOException("Cannot create successfully all needed parent directories!"); 
                  } catch (SecurityException securityException) {
                    throw b(null);
                  }  
              } catch (SecurityException securityException) {
                throw b(null);
              }  
          } catch (SecurityException securityException) {
            throw b(null);
          } 
          try {
            if (!this.configFile.createNewFile())
              try {
                if (paramBoolean) {
                  try {
                    if (!this.configFile.exists())
                      throw new IOException("Cannot create successfully the configuration file!"); 
                  } catch (SecurityException securityException) {
                    throw b(null);
                  } 
                } else {
                  throw new IOException("Cannot create successfully the configuration file!");
                } 
              } catch (SecurityException securityException) {
                throw b(null);
              }  
          } catch (SecurityException securityException) {
            throw b(null);
          } 
        } catch (SecurityException securityException) {
          throw new IOException(securityException.getMessage(), securityException.getCause());
        }  
    } catch (SecurityException securityException) {
      throw b(null);
    } 
  }
  
  @Deprecated
  public static YamlFile loadConfiguration(Reader paramReader) throws IOException {
    return loadConfiguration(paramReader, false);
  }
  
  public void load() throws InvalidConfigurationException, IOException {
    long l = e ^ 0x6438862F2693L;
    Validate.notNull(this.configFile, "This configuration file is null!");
    load(this.configFile);
  }
  
  public String getComment(String paramString, CommentType paramCommentType, YamlCommentFormatter paramYamlCommentFormatter) {
    YamlCommentFormatter yamlCommentFormatter = options().commentFormatter();
    setCommentFormat(paramYamlCommentFormatter);
    String str = getComment(paramString, paramCommentType);
    setCommentFormat(yamlCommentFormatter);
    return str;
  }
  
  public void save() throws IOException {
    long l = e ^ 0x20B0C4C482D2L;
    Validate.notNull(this.configFile, "The configuration file is not set!");
    save(this.configFile);
  }
  
  public File copyTo(String paramString) throws FileNotFoundException, IllegalArgumentException, IOException {
    long l = e ^ 0x54F50F766C9DL;
    Validate.notNull(paramString, "Path cannot be null.");
    File file = new File(paramString);
    copyTo(file);
    return file;
  }
  
  public void setComment(String paramString1, String paramString2) {
    setComment(paramString1, paramString2, CommentType.BLOCK);
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType, YamlCommentFormat paramYamlCommentFormat) {
    long l = e ^ 0x65C7BB900967L;
    Validate.notNull(paramYamlCommentFormat, "yamlCommentFormat cannot be null!");
    setComment(paramString1, paramString2, paramCommentType, paramYamlCommentFormat.commentFormatter());
  }
  
  public static YamlFile loadConfiguration(File paramFile) throws IOException {
    return loadConfiguration(paramFile, false);
  }
  
  public void setComment(String paramString1, String paramString2, CommentType paramCommentType, YamlCommentFormatter paramYamlCommentFormatter) {
    YamlCommentFormatter yamlCommentFormatter = options().commentFormatter();
    setCommentFormat(paramYamlCommentFormatter);
    setComment(paramString1, paramString2, paramCommentType);
    setCommentFormat(yamlCommentFormatter);
  }
  
  public void set(String paramString, Object paramObject) {
    try {
      super.set(paramString, paramObject);
      if (getCommentMapper() != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        Object object = (paramObject instanceof QuoteValue) ? ((QuoteValue)paramObject).getValue() : paramObject;
        try {
          if (object instanceof Collection)
            setListNode((Collection)object, getCommentMapper().getNode(paramString)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  public YamlFile(URI paramURI) throws IllegalArgumentException {
    this();
    setConfigurationFile(paramURI);
  }
  
  public void setComment(String paramString1, String paramString2, YamlCommentFormat paramYamlCommentFormat) {
    setComment(paramString1, paramString2, CommentType.BLOCK, paramYamlCommentFormat);
  }
  
  public YamlCommentMapper getCommentMapper() {
    try {
      if (this.yamlImplementation instanceof YamlImplementationCommentable)
        return ((YamlImplementationCommentable)this.yamlImplementation).getCommentMapper(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return null;
  }
  
  public void load(SupplierIO.Reader paramReader) throws IOException, InvalidConfigurationException {
    super.load(paramReader);
  }
  
  public void setListNode(Collection paramCollection, KeyTree.Node paramNode) {
    if (paramNode != null) {
      paramNode.isList(paramCollection.size());
      byte b = 0;
      for (Collection collection : paramCollection) {
        try {
          if (!(collection instanceof Collection))
            return; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        paramNode = paramNode.getElement(b++);
        setListNode(collection, paramNode);
      } 
    } 
  }
  
  @Deprecated
  public static YamlFile loadConfiguration(InputStream paramInputStream, boolean paramBoolean) throws IOException {
    long l = e ^ 0x15E57FEDC017L;
    Validate.notNull(paramInputStream, "Stream cannot be null");
    return load(paramYamlFile -> paramYamlFile.load(paramInputStream), paramBoolean);
  }
  
  private static Throwable b(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\YamlFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */