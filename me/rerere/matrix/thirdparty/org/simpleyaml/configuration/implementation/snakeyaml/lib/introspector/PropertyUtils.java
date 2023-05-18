package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.beans.FeatureDescriptor;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.PlatformFeatureDetector;

public class PropertyUtils {
  private final Map propertiesCache = new HashMap<>();
  
  private BeanAccess beanAccess = BeanAccess.DEFAULT;
  
  private boolean skipMissingProperties = false;
  
  private final PlatformFeatureDetector platformFeatureDetector;
  
  private static final String TRANSIENT = "transient";
  
  private final Map readableProperties = new HashMap<>();
  
  private boolean allowReadOnlyProperties = false;
  
  private static final long a = o3.a(-7201906662897138745L, 8224476068044377894L, MethodHandles.lookup().lookupClass()).a(69364461982123L);
  
  public Set createPropertySet(Class paramClass, BeanAccess paramBeanAccess) {
    TreeSet<Object> treeSet = new TreeSet();
    Collection collection = getPropertiesMap(paramClass, paramBeanAccess).values();
    for (Property property : collection) {
      try {
        if (property.isReadable()) {
          try {
            if (!this.allowReadOnlyProperties) {
              try {
                if (property.isWritable())
                  continue; 
              } catch (YAMLException yAMLException) {
                throw a(null);
              } 
              continue;
            } 
          } catch (YAMLException yAMLException) {
            throw a(null);
          } 
          continue;
        } 
      } catch (YAMLException yAMLException) {
        throw a(null);
      } 
      continue;
      treeSet.add(SYNTHETIC_LOCAL_VARIABLE_6);
    } 
    return treeSet;
  }
  
  public PropertyUtils(PlatformFeatureDetector paramPlatformFeatureDetector) {
    this.platformFeatureDetector = paramPlatformFeatureDetector;
    if (paramPlatformFeatureDetector.isRunningOnAndroid())
      this.beanAccess = BeanAccess.FIELD; 
  }
  
  public Property getProperty(Class paramClass, String paramString, BeanAccess paramBeanAccess) {
    long l = a ^ 0x61D96391AB08L;
    Map map = getPropertiesMap(paramClass, paramBeanAccess);
    Property property = (Property)map.get(paramString);
    try {
      if (property == null && this.skipMissingProperties)
        property = new MissingProperty(paramString); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (property == null)
        throw new YAMLException("Unable to find property '" + paramString + "' on class: " + paramClass.getName()); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return property;
  }
  
  public Property getProperty(Class paramClass, String paramString) {
    return getProperty(paramClass, paramString, this.beanAccess);
  }
  
  public void setAllowReadOnlyProperties(boolean paramBoolean) {
    try {
      if (this.allowReadOnlyProperties != paramBoolean) {
        this.allowReadOnlyProperties = paramBoolean;
        this.readableProperties.clear();
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public Set getProperties(Class<?> paramClass, BeanAccess paramBeanAccess) {
    try {
      if (this.readableProperties.containsKey(paramClass))
        return (Set)this.readableProperties.get(paramClass); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    Set set = createPropertySet(paramClass, paramBeanAccess);
    this.readableProperties.put(paramClass, set);
    return set;
  }
  
  public boolean isAllowReadOnlyProperties() {
    return this.allowReadOnlyProperties;
  }
  
  public void setBeanAccess(BeanAccess paramBeanAccess) {
    long l = a ^ 0x62BAB5CFEEC8L;
    try {
      if (this.platformFeatureDetector.isRunningOnAndroid())
        try {
          if (paramBeanAccess != BeanAccess.FIELD)
            throw new IllegalArgumentException("JVM is Android - only BeanAccess.FIELD is available"); 
        } catch (YAMLException yAMLException) {
          throw a(null);
        }  
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (this.beanAccess != paramBeanAccess) {
        this.beanAccess = paramBeanAccess;
        this.propertiesCache.clear();
        this.readableProperties.clear();
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public Set getProperties(Class paramClass) {
    return getProperties(paramClass, this.beanAccess);
  }
  
  public void setSkipMissingProperties(boolean paramBoolean) {
    try {
      if (this.skipMissingProperties != paramBoolean) {
        this.skipMissingProperties = paramBoolean;
        this.readableProperties.clear();
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public Map getPropertiesMap(Class paramClass, BeanAccess paramBeanAccess) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/PropertyUtils.a : J
    //   3: ldc2_w 36821131380203
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: getfield propertiesCache : Ljava/util/Map;
    //   12: aload_1
    //   13: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   18: ifeq -> 39
    //   21: aload_0
    //   22: getfield propertiesCache : Ljava/util/Map;
    //   25: aload_1
    //   26: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast java/util/Map
    //   34: areturn
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: new java/util/LinkedHashMap
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: astore #5
    //   48: iconst_0
    //   49: istore #6
    //   51: aload_2
    //   52: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/BeanAccess.FIELD : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/BeanAccess;
    //   55: if_acmpne -> 195
    //   58: aload_1
    //   59: astore #7
    //   61: aload #7
    //   63: ifnull -> 192
    //   66: aload #7
    //   68: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   71: astore #8
    //   73: aload #8
    //   75: arraylength
    //   76: istore #9
    //   78: iconst_0
    //   79: istore #10
    //   81: iload #10
    //   83: iload #9
    //   85: if_icmpge -> 182
    //   88: aload #8
    //   90: iload #10
    //   92: aaload
    //   93: astore #11
    //   95: aload #11
    //   97: invokevirtual getModifiers : ()I
    //   100: istore #12
    //   102: iload #12
    //   104: invokestatic isStatic : (I)Z
    //   107: ifne -> 176
    //   110: iload #12
    //   112: invokestatic isTransient : (I)Z
    //   115: ifne -> 176
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload #5
    //   127: aload #11
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   137: ifne -> 176
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload #5
    //   149: aload #11
    //   151: invokevirtual getName : ()Ljava/lang/String;
    //   154: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/FieldProperty
    //   157: dup
    //   158: aload #11
    //   160: invokespecial <init> : (Ljava/lang/reflect/Field;)V
    //   163: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   168: pop
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: iinc #10, 1
    //   179: goto -> 81
    //   182: aload #7
    //   184: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   187: astore #7
    //   189: goto -> 61
    //   192: goto -> 456
    //   195: aload_1
    //   196: invokestatic getBeanInfo : (Ljava/lang/Class;)Ljava/beans/BeanInfo;
    //   199: invokeinterface getPropertyDescriptors : ()[Ljava/beans/PropertyDescriptor;
    //   204: astore #7
    //   206: aload #7
    //   208: arraylength
    //   209: istore #8
    //   211: iconst_0
    //   212: istore #9
    //   214: iload #9
    //   216: iload #8
    //   218: if_icmpge -> 311
    //   221: aload #7
    //   223: iload #9
    //   225: aaload
    //   226: astore #10
    //   228: aload #10
    //   230: invokevirtual getReadMethod : ()Ljava/lang/reflect/Method;
    //   233: astore #11
    //   235: aload #11
    //   237: ifnull -> 260
    //   240: aload #11
    //   242: invokevirtual getName : ()Ljava/lang/String;
    //   245: ldc 'getClass'
    //   247: invokevirtual equals : (Ljava/lang/Object;)Z
    //   250: ifne -> 305
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   259: athrow
    //   260: aload_0
    //   261: aload #10
    //   263: invokespecial isTransient : (Ljava/beans/FeatureDescriptor;)Z
    //   266: ifne -> 305
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: aload #5
    //   278: aload #10
    //   280: invokevirtual getName : ()Ljava/lang/String;
    //   283: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/MethodProperty
    //   286: dup
    //   287: aload #10
    //   289: invokespecial <init> : (Ljava/beans/PropertyDescriptor;)V
    //   292: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   297: pop
    //   298: goto -> 305
    //   301: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   304: athrow
    //   305: iinc #9, 1
    //   308: goto -> 214
    //   311: goto -> 326
    //   314: astore #7
    //   316: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   319: dup
    //   320: aload #7
    //   322: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   325: athrow
    //   326: aload_1
    //   327: astore #7
    //   329: aload #7
    //   331: ifnull -> 456
    //   334: aload #7
    //   336: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   339: astore #8
    //   341: aload #8
    //   343: arraylength
    //   344: istore #9
    //   346: iconst_0
    //   347: istore #10
    //   349: iload #10
    //   351: iload #9
    //   353: if_icmpge -> 446
    //   356: aload #8
    //   358: iload #10
    //   360: aaload
    //   361: astore #11
    //   363: aload #11
    //   365: invokevirtual getModifiers : ()I
    //   368: istore #12
    //   370: iload #12
    //   372: invokestatic isStatic : (I)Z
    //   375: ifne -> 440
    //   378: iload #12
    //   380: invokestatic isTransient : (I)Z
    //   383: ifne -> 440
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   392: athrow
    //   393: iload #12
    //   395: invokestatic isPublic : (I)Z
    //   398: ifeq -> 437
    //   401: goto -> 408
    //   404: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   407: athrow
    //   408: aload #5
    //   410: aload #11
    //   412: invokevirtual getName : ()Ljava/lang/String;
    //   415: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/introspector/FieldProperty
    //   418: dup
    //   419: aload #11
    //   421: invokespecial <init> : (Ljava/lang/reflect/Field;)V
    //   424: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   429: pop
    //   430: goto -> 440
    //   433: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   436: athrow
    //   437: iconst_1
    //   438: istore #6
    //   440: iinc #10, 1
    //   443: goto -> 349
    //   446: aload #7
    //   448: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   451: astore #7
    //   453: goto -> 329
    //   456: aload #5
    //   458: invokeinterface isEmpty : ()Z
    //   463: ifeq -> 513
    //   466: iload #6
    //   468: ifeq -> 513
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   477: athrow
    //   478: new me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/error/YAMLException
    //   481: dup
    //   482: new java/lang/StringBuilder
    //   485: dup
    //   486: invokespecial <init> : ()V
    //   489: ldc_w 'No JavaBean properties found in '
    //   492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: aload_1
    //   496: invokevirtual getName : ()Ljava/lang/String;
    //   499: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: invokevirtual toString : ()Ljava/lang/String;
    //   505: invokespecial <init> : (Ljava/lang/String;)V
    //   508: athrow
    //   509: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   512: athrow
    //   513: aload_0
    //   514: getfield propertiesCache : Ljava/util/Map;
    //   517: aload_1
    //   518: aload #5
    //   520: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   525: pop
    //   526: aload #5
    //   528: areturn
    // Exception table:
    //   from	to	target	type
    //   8	35	35	java/beans/IntrospectionException
    //   102	118	121	java/beans/IntrospectionException
    //   110	140	143	java/beans/IntrospectionException
    //   125	169	172	java/beans/IntrospectionException
    //   195	311	314	java/beans/IntrospectionException
    //   235	253	256	java/beans/IntrospectionException
    //   240	269	272	java/beans/IntrospectionException
    //   260	298	301	java/beans/IntrospectionException
    //   370	386	389	java/beans/IntrospectionException
    //   378	401	404	java/beans/IntrospectionException
    //   393	433	433	java/beans/IntrospectionException
    //   456	471	474	java/beans/IntrospectionException
    //   466	509	509	java/beans/IntrospectionException
  }
  
  public PropertyUtils() {
    this(new PlatformFeatureDetector());
  }
  
  public boolean isSkipMissingProperties() {
    return this.skipMissingProperties;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\PropertyUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */