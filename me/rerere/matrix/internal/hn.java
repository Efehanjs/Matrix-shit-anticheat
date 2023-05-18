package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class hn {
  @NotNull
  private final List v = new ArrayList();
  
  public static boolean b;
  
  @NotNull
  private final yl i;
  
  private static String a;
  
  private static final long c = o3.a(-5070832648204801977L, 5416215659536702162L, MethodHandles.lookup().lookupClass()).a(245793240908898L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @Deprecated
  public void j(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/hn.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: getstatic me/rerere/matrix/internal/hn.b : Z
    //   9: ifeq -> 17
    //   12: return
    //   13: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   16: athrow
    //   17: aload_0
    //   18: getfield v : Ljava/util/List;
    //   21: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   26: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   31: goto -> 55
    //   34: astore_3
    //   35: sipush #6507
    //   38: aload_3
    //   39: invokevirtual printStackTrace : ()V
    //   42: ldc2_w 6285372463226202028
    //   45: lload_1
    //   46: lxor
    //   47: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   52: invokestatic b : (Ljava/lang/String;)V
    //   55: iconst_1
    //   56: putstatic me/rerere/matrix/internal/hn.b : Z
    //   59: return
    // Exception table:
    //   from	to	target	type
    //   6	13	13	java/lang/Exception
    //   17	31	34	java/lang/Exception
  }
  
  @NotNull
  public yl b() {
    return this.i;
  }
  
  public hn(long paramLong, @NotNull yl paramyl) {
    this.i = paramyl;
    b(paramyl, l1);
    j(l2);
    this.v.forEach(zk::p);
  }
  
  @NotNull
  public List b() {
    return this.v;
  }
  
  static {
    long l = c ^ 0x1765E0EB336L;
    F("ItCwvb");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "Ûÿ\030,sOÆó§4^Í\035­èÑÍODWç¯¡\000ý\n£Çy$¾\037¤Ê\024n´\nÕèjÃ\003<bq[!¬\024W;=\016?Ú]FHFÐÖe\031ÃcÔÖ09MÙd\031¶×_©{æ\017â1á\027\003 û\000¢ü<\037\020]ÆnYÿ70±M¹ê¼").length();
    byte b2 = 104;
    byte b = -1;
    while (true);
  }
  
  @Nullable
  public zk b(char paramChar, Class<?> paramClass, short paramShort, int paramInt) {
    long l = (paramChar << 48L | paramShort << 48L >>> 16L | paramInt << 32L >>> 32L) ^ c;
    int i = yl.a();
    for (zk zk : this.v) {
      try {
        if (i == 0) {
          try {
            if (zk.getClass() == paramClass);
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
          return zk;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    return null;
  }
  
  public static void b(long paramLong) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x54EE4EF2DFEBL;
    new hn(l, null);
  }
  
  public static void F(String paramString) {
    a = paramString;
  }
  
  public static String G() {
    return a;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x81B;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/hn", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/hn'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\hn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */