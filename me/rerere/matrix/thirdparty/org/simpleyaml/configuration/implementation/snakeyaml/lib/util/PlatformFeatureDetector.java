package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class PlatformFeatureDetector {
  private Boolean isRunningOnAndroid = null;
  
  private static final long a = o3.a(-4931965632849486866L, -6441287005834032644L, MethodHandles.lookup().lookupClass()).a(169739456700554L);
  
  public boolean isRunningOnAndroid() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/util/PlatformFeatureDetector.a : J
    //   3: ldc2_w 103767633950521
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield isRunningOnAndroid : Ljava/lang/Boolean;
    //   12: ifnonnull -> 57
    //   15: ldc 'java.runtime.name'
    //   17: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   20: astore_3
    //   21: aload_0
    //   22: aload_3
    //   23: ifnull -> 50
    //   26: aload_3
    //   27: ldc 'Android Runtime'
    //   29: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   32: ifeq -> 50
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: iconst_1
    //   43: goto -> 51
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: iconst_0
    //   51: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   54: putfield isRunningOnAndroid : Ljava/lang/Boolean;
    //   57: aload_0
    //   58: getfield isRunningOnAndroid : Ljava/lang/Boolean;
    //   61: invokevirtual booleanValue : ()Z
    //   64: ireturn
    // Exception table:
    //   from	to	target	type
    //   21	35	38	java/lang/RuntimeException
    //   26	46	46	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\PlatformFeatureDetector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */