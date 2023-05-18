package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlTimestamp extends AbstractConstruct {
  private Calendar calendar;
  
  private static final long b = o3.a(-5387031321221309286L, 6205246349359899288L, MethodHandles.lookup().lookupClass()).a(110466899088636L);
  
  public Calendar getCalendar() {
    return this.calendar;
  }
  
  public Object construct(Node paramNode) {
    TimeZone timeZone;
    long l = b ^ 0x718FD88D822DL;
    ScalarNode scalarNode = (ScalarNode)paramNode;
    String str1 = scalarNode.getValue();
    Matcher matcher = SafeConstructor.access$200().matcher(str1);
    if (matcher.matches()) {
      String str11 = matcher.group(1);
      String str12 = matcher.group(2);
      String str13 = matcher.group(3);
      this.calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
      this.calendar.clear();
      this.calendar.set(1, Integer.parseInt(str11));
      this.calendar.set(2, Integer.parseInt(str12) - 1);
      this.calendar.set(5, Integer.parseInt(str13));
      return this.calendar.getTime();
    } 
    matcher = SafeConstructor.access$300().matcher(str1);
    try {
      if (!matcher.matches())
        throw new YAMLException("Unexpected timestamp: " + str1); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    String str2 = matcher.group(1);
    String str3 = matcher.group(2);
    String str4 = matcher.group(3);
    String str5 = matcher.group(4);
    String str6 = matcher.group(5);
    String str7 = matcher.group(6);
    String str8 = matcher.group(7);
    if (str8 != null)
      str7 = str7 + "." + str8; 
    double d = Double.parseDouble(str7);
    int i = (int)Math.round(Math.floor(d));
    int j = (int)Math.round((d - i) * 1000.0D);
    String str9 = matcher.group(8);
    String str10 = matcher.group(9);
    try {
      if (str9 != null) {
        try {
        
        } catch (YAMLException yAMLException) {
          throw a(null);
        } 
        String str = (str10 != null) ? (":" + str10) : "00";
        timeZone = TimeZone.getTimeZone("GMT" + str9 + str);
      } else {
        timeZone = TimeZone.getTimeZone("UTC");
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    this.calendar = Calendar.getInstance(timeZone);
    this.calendar.set(1, Integer.parseInt(str2));
    this.calendar.set(2, Integer.parseInt(str3) - 1);
    this.calendar.set(5, Integer.parseInt(str4));
    this.calendar.set(11, Integer.parseInt(str5));
    this.calendar.set(12, Integer.parseInt(str6));
    this.calendar.set(13, i);
    this.calendar.set(14, j);
    return this.calendar.getTime();
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlTimestamp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */