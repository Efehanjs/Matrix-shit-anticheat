package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer.SafeRepresenter;

public final class SnakeYamlRepresenter$RepresentConfigurationSection extends SafeRepresenter.RepresentMap {
  public Node representData(Object paramObject) {
    return super.representData(((ConfigurationSection)paramObject).getValues(false));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlRepresenter$RepresentConfigurationSection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */