package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteValue;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer.Represent;

public final class SnakeYamlRepresenter$RepresentQuoteValue implements Represent {
  public Node representData(Object paramObject) {
    QuoteValue quoteValue = (QuoteValue)paramObject;
    DumperOptions.ScalarStyle scalarStyle1 = SnakeYamlQuoteValue.getQuoteScalarStyle(quoteValue.getQuoteStyle());
    Object object = quoteValue.getValue();
    try {
      if (object == null)
        return SnakeYamlRepresenter.access$300(SnakeYamlRepresenter.this, Tag.NULL, "", scalarStyle1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    DumperOptions.ScalarStyle scalarStyle2 = SnakeYamlRepresenter.this.getDefaultScalarStyle();
    SnakeYamlRepresenter.this.setDefaultScalarStyle(scalarStyle1);
    Node node = SnakeYamlRepresenter.access$400(SnakeYamlRepresenter.this, object);
    SnakeYamlRepresenter.this.setDefaultScalarStyle(scalarStyle2);
    return node;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlRepresenter$RepresentQuoteValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */