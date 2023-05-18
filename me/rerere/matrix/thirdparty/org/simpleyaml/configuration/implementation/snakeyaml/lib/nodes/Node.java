package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public abstract class Node {
  public boolean resolved;
  
  private List endComments;
  
  private List inLineComments;
  
  public Mark endMark;
  
  private boolean twoStepsConstruction;
  
  private String anchor;
  
  private Class type;
  
  private Tag tag;
  
  private final Mark startMark;
  
  private List blockComments;
  
  public Boolean useClassConstructor;
  
  private static final long c = o3.a(-6863865593531920670L, -4536809744091986715L, MethodHandles.lookup().lookupClass()).a(154550383276011L);
  
  public void setTag(Tag paramTag) {
    long l = c ^ 0x7037A7EFF4F9L;
    try {
      if (paramTag == null)
        throw new NullPointerException("tag in a Node is required."); 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
    this.tag = paramTag;
  }
  
  public final int hashCode() {
    return super.hashCode();
  }
  
  public void setBlockComments(List paramList) {
    this.blockComments = paramList;
  }
  
  public List getInLineComments() {
    return this.inLineComments;
  }
  
  public Class getType() {
    return this.type;
  }
  
  public Mark getEndMark() {
    return this.endMark;
  }
  
  public void setInLineComments(List paramList) {
    this.inLineComments = paramList;
  }
  
  public List getEndComments() {
    return this.endComments;
  }
  
  public boolean useClassConstructor() {
    try {
      if (this.useClassConstructor == null) {
        try {
          if (!this.tag.isSecondary())
            try {
              if (this.resolved)
                try {
                  if (!Object.class.equals(this.type))
                    try {
                      if (!this.tag.equals(Tag.NULL))
                        return true; 
                    } catch (NullPointerException nullPointerException) {
                      throw c(null);
                    }  
                } catch (NullPointerException nullPointerException) {
                  throw c(null);
                }  
            } catch (NullPointerException nullPointerException) {
              throw c(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw c(null);
        } 
        return this.tag.isCompatible(getType());
      } 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
    return this.useClassConstructor.booleanValue();
  }
  
  public boolean isTwoStepsConstruction() {
    return this.twoStepsConstruction;
  }
  
  public void setTwoStepsConstruction(boolean paramBoolean) {
    this.twoStepsConstruction = paramBoolean;
  }
  
  public void setAnchor(String paramString) {
    this.anchor = paramString;
  }
  
  public void setEndComments(List paramList) {
    this.endComments = paramList;
  }
  
  public final boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  public Mark getStartMark() {
    return this.startMark;
  }
  
  public List getBlockComments() {
    return this.blockComments;
  }
  
  public abstract NodeId getNodeId();
  
  public Node(Tag paramTag, Mark paramMark1, Mark paramMark2) {
    setTag(paramTag);
    this.startMark = paramMark1;
    this.endMark = paramMark2;
    this.type = Object.class;
    this.twoStepsConstruction = false;
    this.resolved = true;
    this.useClassConstructor = null;
    this.inLineComments = null;
    this.blockComments = null;
    this.endComments = null;
  }
  
  public void setType(Class paramClass) {
    try {
      if (!paramClass.isAssignableFrom(this.type))
        this.type = paramClass; 
    } catch (NullPointerException nullPointerException) {
      throw c(null);
    } 
  }
  
  public String getAnchor() {
    return this.anchor;
  }
  
  @Deprecated
  public boolean isResolved() {
    return this.resolved;
  }
  
  public Tag getTag() {
    return this.tag;
  }
  
  public void setUseClassConstructor(Boolean paramBoolean) {
    this.useClassConstructor = paramBoolean;
  }
  
  private static NullPointerException c(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\Node.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */