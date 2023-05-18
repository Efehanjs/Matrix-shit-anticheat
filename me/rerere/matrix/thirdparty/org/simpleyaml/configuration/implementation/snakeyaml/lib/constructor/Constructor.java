package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.LoaderOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.TypeDescription;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class Constructor extends SafeConstructor {
  private static final long a = o3.a(-8872737176084136518L, -3818306083907400026L, MethodHandles.lookup().lookupClass()).a(181520061441058L);
  
  public Class getClassForName(String paramString) throws ClassNotFoundException {
    try {
      return Class.forName(paramString, true, Thread.currentThread().getContextClassLoader());
    } catch (ClassNotFoundException classNotFoundException) {
      return Class.forName(paramString);
    } 
  }
  
  public Constructor(Class paramClass) {
    this(new TypeDescription(checkRoot(paramClass)));
  }
  
  public Class getClassForNode(Node paramNode) {
    long l = a ^ 0x26047EA3F17DL;
    Class clazz = (Class)this.typeTags.get(paramNode.getTag());
    if (clazz == null) {
      Class<?> clazz1;
      String str = paramNode.getTag().getClassName();
      try {
        clazz1 = getClassForName(str);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new YAMLException("Class not found: " + str);
      } 
      this.typeTags.put(paramNode.getTag(), clazz1);
      return clazz1;
    } 
    return clazz;
  }
  
  @Deprecated
  public Constructor(TypeDescription paramTypeDescription) {
    this(paramTypeDescription, (Collection)null, new LoaderOptions());
  }
  
  public Constructor(Class paramClass, LoaderOptions paramLoaderOptions) {
    this(new TypeDescription(checkRoot(paramClass)), (Collection)null, paramLoaderOptions);
  }
  
  public Constructor(String paramString) throws ClassNotFoundException {
    this(Class.forName(check(paramString)));
  }
  
  public Constructor(LoaderOptions paramLoaderOptions) {
    this(Object.class, paramLoaderOptions);
  }
  
  public Constructor(TypeDescription paramTypeDescription, Collection paramCollection, LoaderOptions paramLoaderOptions) {
    super(paramLoaderOptions);
    if (paramTypeDescription == null)
      throw new NullPointerException("Root type must be provided."); 
    try {
      this.yamlConstructors.put(null, new Constructor$ConstructYamlObject(this));
      if (!Object.class.equals(paramTypeDescription.getType()))
        this.rootTag = new Tag(paramTypeDescription.getType()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.yamlClassConstructors.put(NodeId.scalar, new Constructor$ConstructScalar(this));
    this.yamlClassConstructors.put(NodeId.mapping, new Constructor$ConstructMapping(this));
    this.yamlClassConstructors.put(NodeId.sequence, new Constructor$ConstructSequence(this));
    addTypeDescription(paramTypeDescription);
    if (paramCollection != null)
      for (TypeDescription typeDescription : paramCollection)
        addTypeDescription(typeDescription);  
  }
  
  public Constructor(TypeDescription paramTypeDescription, LoaderOptions paramLoaderOptions) {
    this(paramTypeDescription, (Collection)null, paramLoaderOptions);
  }
  
  public Constructor(String paramString, LoaderOptions paramLoaderOptions) throws ClassNotFoundException {
    this(Class.forName(check(paramString)), paramLoaderOptions);
  }
  
  @Deprecated
  public Constructor() {
    this(Object.class);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\Constructor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */