package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.resolver;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeId;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class Resolver {
  public static final Pattern YAML;
  
  public static final Pattern TIMESTAMP;
  
  public static final Pattern INT;
  
  public static final Pattern VALUE;
  
  public static final Pattern EMPTY;
  
  public static final Pattern FLOAT;
  
  public static final Pattern MERGE;
  
  public static final Pattern BOOL;
  
  public static final Pattern NULL;
  
  public Map yamlImplicitResolvers = new HashMap<>();
  
  private static final long a = o3.a(-5251688076947143275L, -1291932251469881413L, MethodHandles.lookup().lookupClass()).a(174176356230164L);
  
  public void addImplicitResolver(Tag paramTag, Pattern paramPattern, String paramString) {
    addImplicitResolver(paramTag, paramPattern, paramString, 1024);
  }
  
  static {
    long l = a ^ 0x4A31D93B9664L;
    BOOL = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    FLOAT = Pattern.compile("^([-+]?(?:[0-9][0-9_]*)\\.[0-9_]*(?:[eE][-+]?[0-9]+)?|[-+]?(?:[0-9][0-9_]*)(?:[eE][-+]?[0-9]+)|[-+]?\\.[0-9_]+(?:[eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    INT = Pattern.compile("^(?:[-+]?0b_*[0-1][0-1_]*|[-+]?0_*[0-7][0-7_]*|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x_*[0-9a-fA-F][0-9a-fA-F_]*|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    MERGE = Pattern.compile("^(?:<<)$");
    NULL = Pattern.compile("^(?:~|null|Null|NULL| )$");
    EMPTY = Pattern.compile("^$");
    TIMESTAMP = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    VALUE = Pattern.compile("^(?:=)$");
    YAML = Pattern.compile("^(?:!|&|\\*)$");
  }
  
  public Resolver() {
    addImplicitResolvers();
  }
  
  public void addImplicitResolver(Tag paramTag, Pattern paramPattern, String paramString, int paramInt) {
    if (paramString == null) {
      List<ResolverTuple> list = (List)this.yamlImplicitResolvers.get(null);
      if (list == null) {
        list = new ArrayList();
        this.yamlImplicitResolvers.put(null, list);
      } 
      list.add(new ResolverTuple(paramTag, paramPattern, paramInt));
    } else {
      char[] arrayOfChar = paramString.toCharArray();
      byte b = 0;
      int i = arrayOfChar.length;
      while (b < i) {
        Character character = Character.valueOf(arrayOfChar[b]);
        if (character.charValue() == '\000')
          character = null; 
        List<ResolverTuple> list = (List)this.yamlImplicitResolvers.get(character);
        if (list == null) {
          list = new ArrayList();
          this.yamlImplicitResolvers.put(character, list);
        } 
        list.add(new ResolverTuple(paramTag, paramPattern, paramInt));
        b++;
      } 
    } 
  }
  
  public void addImplicitResolvers() {
    long l = a ^ 0x45B1C3A76ADAL;
    addImplicitResolver(Tag.BOOL, BOOL, "yYnNtTfFoO", 10);
    addImplicitResolver(Tag.INT, INT, "-+0123456789");
    addImplicitResolver(Tag.FLOAT, FLOAT, "-+0123456789.");
    addImplicitResolver(Tag.MERGE, MERGE, "<", 10);
    addImplicitResolver(Tag.NULL, NULL, "~nN\000", 10);
    addImplicitResolver(Tag.NULL, EMPTY, null, 10);
    addImplicitResolver(Tag.TIMESTAMP, TIMESTAMP, "0123456789", 50);
    addImplicitResolver(Tag.YAML, YAML, "!&*", 10);
  }
  
  public Tag resolve(NodeId paramNodeId, String paramString, boolean paramBoolean) {
    try {
      if (paramNodeId == NodeId.scalar)
        try {
          if (paramBoolean) {
            List list;
            if (paramString.length() == 0) {
              list = (List)this.yamlImplicitResolvers.get(Character.valueOf(false));
            } else {
              list = (List)this.yamlImplicitResolvers.get(Character.valueOf(paramString.charAt(0)));
            } 
            if (list != null)
              for (ResolverTuple resolverTuple : list) {
                Tag tag = resolverTuple.getTag();
                Pattern pattern = resolverTuple.getRegexp();
                try {
                  if (paramString.length() <= resolverTuple.getLimit())
                    try {
                      if (pattern.matcher(paramString).matches())
                        return tag; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              }  
            if (this.yamlImplicitResolvers.containsKey(null))
              for (ResolverTuple resolverTuple : this.yamlImplicitResolvers.get(null)) {
                Tag tag = resolverTuple.getTag();
                Pattern pattern = resolverTuple.getRegexp();
                try {
                  if (paramString.length() <= resolverTuple.getLimit())
                    try {
                      if (pattern.matcher(paramString).matches())
                        return tag; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              }  
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (Resolver$1.$SwitchMap$org$yaml$snakeyaml$nodes$NodeId[paramNodeId.ordinal()]) {
        case 1:
          return Tag.STR;
        case 2:
          return Tag.SEQ;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Tag.MAP;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\resolver\Resolver.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */