package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentDate implements Represent {
  private static final long a = o3.a(-3516855930792675162L, -3447177264581437344L, MethodHandles.lookup().lookupClass()).a(75701943376376L);
  
  public Node representData(Object paramObject) {
    Calendar calendar;
    long l = a ^ 0x7591B7D4893DL;
    if (paramObject instanceof Calendar) {
      calendar = (Calendar)paramObject;
    } else {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      calendar = Calendar.getInstance((SafeRepresenter.this.getTimeZone() == null) ? TimeZone.getTimeZone("UTC") : SafeRepresenter.this.timeZone);
      calendar.setTime((Date)paramObject);
    } 
    int i = calendar.get(1);
    int j = calendar.get(2) + 1;
    int k = calendar.get(5);
    int m = calendar.get(11);
    int n = calendar.get(12);
    int i1 = calendar.get(13);
    int i2 = calendar.get(14);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(i));
    try {
      while (stringBuilder.length() < 4)
        stringBuilder.insert(0, "0"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append("-");
      if (j < 10)
        stringBuilder.append("0"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append(j);
      stringBuilder.append("-");
      if (k < 10)
        stringBuilder.append("0"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append(k);
      stringBuilder.append("T");
      if (m < 10)
        stringBuilder.append("0"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append(m);
      stringBuilder.append(":");
      if (n < 10)
        stringBuilder.append("0"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append(n);
      stringBuilder.append(":");
      if (i1 < 10)
        stringBuilder.append("0"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append(i1);
      if (i2 > 0) {
        try {
          if (i2 < 10) {
            stringBuilder.append(".00");
          } else {
            try {
              if (i2 < 100) {
                stringBuilder.append(".0");
              } else {
                stringBuilder.append(".");
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        stringBuilder.append(i2);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i3 = calendar.getTimeZone().getOffset(calendar.getTime().getTime());
    try {
      if (i3 == 0) {
        stringBuilder.append('Z');
      } else {
        if (i3 < 0) {
          stringBuilder.append('-');
          i3 *= -1;
        } else {
          stringBuilder.append('+');
        } 
        int i4 = i3 / 60000;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        try {
          if (i5 < 10)
            stringBuilder.append('0'); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          stringBuilder.append(i5);
          stringBuilder.append(':');
          if (i6 < 10)
            stringBuilder.append('0'); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        stringBuilder.append(i6);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return SafeRepresenter.this.representScalar(SafeRepresenter.this.getTag(paramObject.getClass(), Tag.TIMESTAMP), stringBuilder.toString(), DumperOptions.ScalarStyle.PLAIN);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentDate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */