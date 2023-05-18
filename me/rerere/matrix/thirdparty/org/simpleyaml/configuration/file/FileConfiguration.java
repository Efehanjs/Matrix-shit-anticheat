package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.Configuration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.LoadableConfiguration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfiguration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.MemoryConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.CommentFormatter;
import me.rerere.matrix.thirdparty.org.simpleyaml.exceptions.InvalidConfigurationException;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.Validate;

public abstract class FileConfiguration extends MemoryConfiguration implements LoadableConfiguration {
  private static final long c = o3.a(3969166469706795760L, -2108505122191678149L, MethodHandles.lookup().lookupClass()).a(59162391780320L);
  
  public void load(String paramString) throws FileNotFoundException, IOException, InvalidConfigurationException {
    long l = c ^ 0x3AFCFA67F836L;
    Validate.notNull(paramString, "File cannot be null");
    load(new File(paramString));
  }
  
  public FileConfigurationOptions options() {
    try {
      if (this.options == null)
        this.options = new FileConfigurationOptions(this); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (FileConfigurationOptions)this.options;
  }
  
  public String buildHeader() {
    FileConfigurationOptions fileConfigurationOptions = options();
    try {
      if (!fileConfigurationOptions.copyHeader())
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Configuration configuration = getDefaults();
    if (configuration instanceof FileConfiguration) {
      FileConfiguration fileConfiguration = (FileConfiguration)configuration;
      String str1 = fileConfiguration.buildHeader();
      try {
        if (str1 != null)
          try {
            if (!str1.isEmpty())
              return str1; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    String str = fileConfigurationOptions.header();
    CommentFormatter commentFormatter = fileConfigurationOptions.headerFormatter();
    if (commentFormatter != null) {
      String str1 = commentFormatter.dump(str);
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return (str1 != null) ? str1 : "";
    } 
    try {
      if (str != null)
        try {
          if (!str.isEmpty());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "";
  }
  
  public void save(String paramString) throws IOException {
    long l = c ^ 0x6A9A202B8E32L;
    Validate.notNull(paramString, "File cannot be null");
    save(new File(paramString));
  }
  
  public FileConfiguration(Configuration paramConfiguration) {
    super(paramConfiguration);
  }
  
  public void load(Reader paramReader) throws IOException, InvalidConfigurationException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/FileConfiguration.c : J
    //   3: ldc2_w 31190579408195
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'Reader cannot be null'
    //   11: invokestatic notNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: instanceof java/io/BufferedReader
    //   18: ifeq -> 32
    //   21: aload_1
    //   22: checkcast java/io/BufferedReader
    //   25: goto -> 40
    //   28: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   31: athrow
    //   32: new java/io/BufferedReader
    //   35: dup
    //   36: aload_1
    //   37: invokespecial <init> : (Ljava/io/Reader;)V
    //   40: astore #4
    //   42: aconst_null
    //   43: astore #5
    //   45: new java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #6
    //   54: aload #4
    //   56: invokevirtual readLine : ()Ljava/lang/String;
    //   59: dup
    //   60: astore #7
    //   62: ifnull -> 88
    //   65: aload #6
    //   67: aload #7
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload #6
    //   75: bipush #10
    //   77: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: goto -> 54
    //   84: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   87: athrow
    //   88: aload_0
    //   89: aload #6
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokevirtual loadFromString : (Ljava/lang/String;)V
    //   97: aload #4
    //   99: ifnull -> 191
    //   102: aload #5
    //   104: ifnull -> 127
    //   107: aload #4
    //   109: invokevirtual close : ()V
    //   112: goto -> 191
    //   115: astore #6
    //   117: aload #5
    //   119: aload #6
    //   121: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   124: goto -> 191
    //   127: aload #4
    //   129: invokevirtual close : ()V
    //   132: goto -> 191
    //   135: astore #6
    //   137: aload #6
    //   139: astore #5
    //   141: aload #6
    //   143: athrow
    //   144: astore #8
    //   146: aload #4
    //   148: ifnull -> 188
    //   151: aload #5
    //   153: ifnull -> 183
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   162: athrow
    //   163: aload #4
    //   165: invokevirtual close : ()V
    //   168: goto -> 188
    //   171: astore #9
    //   173: aload #5
    //   175: aload #9
    //   177: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   180: goto -> 188
    //   183: aload #4
    //   185: invokevirtual close : ()V
    //   188: aload #8
    //   190: athrow
    //   191: return
    // Exception table:
    //   from	to	target	type
    //   8	28	28	java/lang/Throwable
    //   45	97	135	java/lang/Throwable
    //   45	97	144	finally
    //   62	84	84	java/lang/Throwable
    //   107	112	115	java/lang/Throwable
    //   135	146	144	finally
    //   146	156	159	java/lang/Throwable
    //   163	168	171	java/lang/Throwable
  }
  
  public void load(InputStream paramInputStream) throws IOException, InvalidConfigurationException {
    long l = c ^ 0x3660040CA051L;
    Validate.notNull(paramInputStream, "Stream cannot be null");
    load(new InputStreamReader(paramInputStream, options().charset()));
  }
  
  public void load(File paramFile) throws FileNotFoundException, IOException, InvalidConfigurationException {
    long l = c ^ 0x4A1F4724418L;
    Validate.notNull(paramFile, "File cannot be null");
    load(Files.newInputStream(paramFile.toPath(), new java.nio.file.OpenOption[0]));
  }
  
  public FileConfiguration() {}
  
  public void save(Writer paramWriter) throws IOException {
    long l = c ^ 0x7871E8F62949L;
    Validate.notNull(paramWriter, "Writer cannot be null");
    try {
      paramWriter.write(saveToString());
    } finally {
      paramWriter.close();
    } 
  }
  
  public void save(File paramFile) throws IOException {
    long l = c ^ 0x62707B175516L;
    Validate.notNull(paramFile, "File cannot be null");
    File file = paramFile.getParentFile();
    try {
      if (file != null)
        try {
          if (!file.exists())
            try {
              if (!file.mkdirs())
                throw new IOException("Cannot create successfully all needed parent directories!"); 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    save(new OutputStreamWriter(Files.newOutputStream(paramFile.toPath(), new java.nio.file.OpenOption[0]), options().charset()));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\FileConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */