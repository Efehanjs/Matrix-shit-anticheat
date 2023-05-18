package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteValue;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer.Representer;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization.ConfigurationSerializable;

public class SnakeYamlRepresenter extends Representer {
  public SnakeYamlRepresenter() {
    this.multiRepresenters.put(ConfigurationSection.class, new SnakeYamlRepresenter$RepresentConfigurationSection(this, null));
    this.multiRepresenters.put(ConfigurationSerializable.class, new SnakeYamlRepresenter$RepresentConfigurationSerializable(this, null));
    this.multiRepresenters.put(QuoteValue.class, new SnakeYamlRepresenter$RepresentQuoteValue(this, null));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlRepresenter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */