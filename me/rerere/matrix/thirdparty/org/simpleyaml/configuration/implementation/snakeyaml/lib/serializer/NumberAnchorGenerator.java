package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.serializer;

import java.lang.invoke.MethodHandles;
import java.text.NumberFormat;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class NumberAnchorGenerator implements AnchorGenerator {
  private int lastAnchorId = 0;
  
  private static final long a = o3.a(3965851215436070377L, 6929822620943044331L, MethodHandles.lookup().lookupClass()).a(32220403427061L);
  
  public String nextAnchor(Node paramNode) {
    long l = a ^ 0x5732F88BBB47L;
    this.lastAnchorId++;
    NumberFormat numberFormat = NumberFormat.getNumberInstance();
    numberFormat.setMinimumIntegerDigits(3);
    numberFormat.setMaximumFractionDigits(0);
    numberFormat.setGroupingUsed(false);
    String str = numberFormat.format(this.lastAnchorId);
    return "id" + str;
  }
  
  public NumberAnchorGenerator(int paramInt) {
    this.lastAnchorId = paramInt;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\serializer\NumberAnchorGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */