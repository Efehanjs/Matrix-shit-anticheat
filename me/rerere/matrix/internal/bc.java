package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class bc {
  private static int[] a;
  
  private static final long b = o3.a(-4498171474874333101L, -4381055063083849737L, MethodHandles.lookup().lookupClass()).a(155024438384286L);
  
  @SafeVarargs
  public static Set b(Object... paramVarArgs) {
    return (Set)Stream.<Object>of(paramVarArgs).collect(Collectors.toSet());
  }
  
  @NotNull
  public static Set b() {
    return Collections.newSetFromMap(new ConcurrentHashMap<>());
  }
  
  public static int b(@NotNull List paramList, long paramLong, @NotNull Function paramFunction) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bc.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: iconst_0
    //   7: istore #5
    //   9: invokestatic r : ()I
    //   12: aload_0
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #6
    //   20: istore #4
    //   22: aload #6
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 78
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: astore #7
    //   41: aload_3
    //   42: aload #7
    //   44: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   49: checkcast java/lang/Boolean
    //   52: invokevirtual booleanValue : ()Z
    //   55: iload #4
    //   57: ifeq -> 80
    //   60: ifeq -> 73
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: iinc #5, 1
    //   73: iload #4
    //   75: ifne -> 22
    //   78: iload #5
    //   80: ireturn
    // Exception table:
    //   from	to	target	type
    //   41	63	66	java/lang/RuntimeException
  }
  
  @NotNull
  public static Map b() {
    return new HashMap<>();
  }
  
  public static boolean b(Enum[] paramArrayOfEnum, Enum paramEnum, long paramLong) {
    paramLong = b ^ paramLong;
    Enum[] arrayOfEnum = paramArrayOfEnum;
    int j = arrayOfEnum.length;
    int i = yl.a();
    byte b = 0;
    while (b < j) {
      Enum enum_ = arrayOfEnum[b];
      try {
        if (paramLong > 0L)
          if (i == 0) {
            try {
              if (enum_ == paramEnum)
                return true; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            b++;
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  @NotNull
  public static List b(@NotNull Stream paramStream) {
    ArrayList arrayList = new ArrayList();
    paramStream.forEach(arrayList::add);
    return arrayList;
  }
  
  @NotNull
  public static uc b() {
    return new uc();
  }
  
  public static void main(String[] paramArrayOfString) {
    long l1 = b ^ 0x4DC2968E5418L;
    long l2 = l1 ^ 0x6859EB18DBC4L;
    System.out.println(b(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6) }, ), l2, paramInteger -> {
            long l = b ^ 0x5D1ACD77F1DAL;
            int i = yl.r();
            try {
              if (i != 0)
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return (Function)Boolean.valueOf((paramInteger.intValue() >= 2));
          }));
  }
  
  public static void n(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] R() {
    return a;
  }
  
  static {
    if (R() != null)
      n(new int[4]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */