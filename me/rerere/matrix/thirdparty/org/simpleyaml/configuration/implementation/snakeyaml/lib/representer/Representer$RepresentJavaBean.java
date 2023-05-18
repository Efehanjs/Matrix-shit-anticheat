package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class Representer$RepresentJavaBean implements Represent {
  public Node representData(Object paramObject) {
    return (Node)Representer.this.representJavaBean(Representer.this.getProperties(paramObject.getClass()), paramObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\Representer$RepresentJavaBean.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */