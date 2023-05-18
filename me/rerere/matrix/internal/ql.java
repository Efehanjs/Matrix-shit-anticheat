package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.event.player.PlayerInteractEvent;

public class ql extends zk {
  private static int z;
  
  private long k;
  
  private static boolean v;
  
  private static int b;
  
  private int i = 0;
  
  private static final long a = o3.a(-8926731926151088545L, -5680182900773123047L, MethodHandles.lookup().lookupClass()).a(218115653797604L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public ql(yl paramyl) {
    super(paramyl);
    b(yk.x);
  }
  
  public void b(char paramChar, int paramInt, @NotNull PlayerInteractEvent paramPlayerInteractEvent, short paramShort) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: lstore #5
    //   26: lload #5
    //   28: dup2
    //   29: ldc2_w 123056812294605
    //   32: lxor
    //   33: lstore #7
    //   35: pop2
    //   36: getstatic me/rerere/matrix/internal/ql.v : Z
    //   39: ifne -> 47
    //   42: return
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: aload_3
    //   48: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   51: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_AIR : Lorg/bukkit/event/block/Action;
    //   54: if_acmpeq -> 74
    //   57: aload_3
    //   58: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   61: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   64: if_acmpne -> 232
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: dup
    //   76: getfield i : I
    //   79: iconst_1
    //   80: iadd
    //   81: putfield i : I
    //   84: invokestatic j : ()J
    //   87: aload_0
    //   88: getfield k : J
    //   91: lsub
    //   92: ldc2_w 970
    //   95: lcmp
    //   96: iflt -> 232
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: aload_0
    //   107: getfield i : I
    //   110: getstatic me/rerere/matrix/internal/ql.z : I
    //   113: if_icmple -> 220
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload_0
    //   124: lload #7
    //   126: sipush #5155
    //   129: ldc2_w 3941476700839508830
    //   132: lload #5
    //   134: lxor
    //   135: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: sipush #5339
    //   150: ldc2_w 6376789142462200736
    //   153: lload #5
    //   155: lxor
    //   156: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: aload_0
    //   165: getfield i : I
    //   168: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   171: sipush #27611
    //   174: ldc2_w 5492299417870533797
    //   177: lload #5
    //   179: lxor
    //   180: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokestatic j : ()J
    //   191: aload_0
    //   192: getfield k : J
    //   195: lsub
    //   196: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   199: ldc ')'
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual toString : ()Ljava/lang/String;
    //   207: getstatic me/rerere/matrix/internal/ql.b : I
    //   210: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   219: athrow
    //   220: aload_0
    //   221: invokestatic j : ()J
    //   224: putfield k : J
    //   227: aload_0
    //   228: iconst_0
    //   229: putfield i : I
    //   232: return
    // Exception table:
    //   from	to	target	type
    //   36	43	43	java/lang/RuntimeException
    //   47	67	70	java/lang/RuntimeException
    //   57	99	102	java/lang/RuntimeException
    //   74	116	119	java/lang/RuntimeException
    //   106	213	216	java/lang/RuntimeException
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ql.a : J
    //   3: ldc2_w 13779760773633
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #19829
    //   15: ldc2_w 5483134122116911084
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/ql.v : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #1230
    //   41: ldc2_w 1993094304852362836
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   51: iconst_2
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/ql.b : I
    //   60: aload_0
    //   61: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   64: sipush #16037
    //   67: ldc2_w 8655471080636578873
    //   70: lload_1
    //   71: lxor
    //   72: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   77: bipush #29
    //   79: invokeinterface getInt : (Ljava/lang/String;I)I
    //   84: putstatic me/rerere/matrix/internal/ql.z : I
    //   87: return
  }
  
  static {
    long l = a ^ 0x48641FABC0DEL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "#ÂÌWñfN=ûÜ¢Ö\024\nÍ¶I³où­C±w^§FYöÜB±VÜ\026|7Ky *\rp*ÇµI 2$í¼\032ó?ç)4°öÓx%\002©åß\021{{\023ò§ÒÌ\0135\0276\0205mfx0J)\022}dÓF,%0ÀeÕ\032ò¦óyñðÉ*(=qÃÁÚ¯FÜÏûßûU©\\5á³ÁÊ\b·$_Ï7n¨").length();
    byte b2 = 56;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7D58;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ql", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/ql'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */