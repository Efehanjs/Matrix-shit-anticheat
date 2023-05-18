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
import org.bukkit.event.block.BlockPlaceEvent;

public class lm extends zk {
  private static boolean z;
  
  private static int k;
  
  private static int v;
  
  private int b;
  
  private long i;
  
  private static final long a = o3.a(-7473514572726480050L, -4502562111939332801L, MethodHandles.lookup().lookupClass()).a(140974738872957L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lm.a : J
    //   3: ldc2_w 24179076239102
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #23231
    //   15: ldc2_w 809328899298927458
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/lm.z : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #31802
    //   41: ldc2_w 7301158073443976677
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   51: invokeinterface getInt : (Ljava/lang/String;)I
    //   56: putstatic me/rerere/matrix/internal/lm.k : I
    //   59: aload_0
    //   60: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   63: sipush #24953
    //   66: ldc2_w 2870728604035127458
    //   69: lload_1
    //   70: lxor
    //   71: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   76: bipush #10
    //   78: invokeinterface getInt : (Ljava/lang/String;I)I
    //   83: putstatic me/rerere/matrix/internal/lm.v : I
    //   86: return
  }
  
  public lm(yl paramyl) {
    super(paramyl);
    b(yk.r);
  }
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_3
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
    //   29: ldc2_w 137262009759190
    //   32: lxor
    //   33: lstore #7
    //   35: dup2
    //   36: ldc2_w 48740968429332
    //   39: lxor
    //   40: lstore #9
    //   42: pop2
    //   43: aload_2
    //   44: invokevirtual isCancelled : ()Z
    //   47: ifeq -> 55
    //   50: return
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: getstatic me/rerere/matrix/internal/lm.z : Z
    //   58: ifne -> 66
    //   61: return
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: aload_2
    //   67: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   70: invokeinterface getType : ()Lorg/bukkit/Material;
    //   75: invokevirtual isBlock : ()Z
    //   78: ifne -> 86
    //   81: return
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: aload_2
    //   87: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   90: invokeinterface getType : ()Lorg/bukkit/Material;
    //   95: getstatic org/bukkit/Material.FIRE : Lorg/bukkit/Material;
    //   98: if_acmpne -> 106
    //   101: return
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: invokestatic b : ()I
    //   109: bipush #14
    //   111: if_icmplt -> 138
    //   114: aload_2
    //   115: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   118: astore #11
    //   120: aload #11
    //   122: invokeinterface getType : ()Lorg/bukkit/Material;
    //   127: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
    //   130: if_acmpne -> 138
    //   133: return
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: aload_0
    //   139: dup
    //   140: getfield b : I
    //   143: iconst_1
    //   144: iadd
    //   145: putfield b : I
    //   148: aload_0
    //   149: getfield b : I
    //   152: getstatic me/rerere/matrix/internal/lm.v : I
    //   155: if_icmple -> 259
    //   158: lload #9
    //   160: invokestatic b : (J)Z
    //   163: ifeq -> 259
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: aload_0
    //   174: lload #7
    //   176: sipush #29629
    //   179: ldc2_w 6014625396514067358
    //   182: lload #5
    //   184: lxor
    //   185: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   190: new java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial <init> : ()V
    //   197: sipush #1950
    //   200: ldc2_w 5386084674516707257
    //   203: lload #5
    //   205: lxor
    //   206: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload_0
    //   215: getfield b : I
    //   218: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   221: sipush #9649
    //   224: ldc2_w 5383259645456565648
    //   227: lload #5
    //   229: lxor
    //   230: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual toString : ()Ljava/lang/String;
    //   241: getstatic me/rerere/matrix/internal/lm.k : I
    //   244: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   247: aload_2
    //   248: iconst_1
    //   249: invokevirtual setCancelled : (Z)V
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   258: athrow
    //   259: invokestatic currentTimeMillis : ()J
    //   262: aload_0
    //   263: getfield i : J
    //   266: lsub
    //   267: ldc2_w 995
    //   270: lcmp
    //   271: ifle -> 293
    //   274: aload_0
    //   275: iconst_0
    //   276: putfield b : I
    //   279: aload_0
    //   280: invokestatic currentTimeMillis : ()J
    //   283: putfield i : J
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   292: athrow
    //   293: return
    // Exception table:
    //   from	to	target	type
    //   43	51	51	java/lang/RuntimeException
    //   55	62	62	java/lang/RuntimeException
    //   66	82	82	java/lang/RuntimeException
    //   86	102	102	java/lang/RuntimeException
    //   120	134	134	java/lang/RuntimeException
    //   138	166	169	java/lang/RuntimeException
    //   158	252	255	java/lang/RuntimeException
    //   259	286	289	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x46052097820CL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "vvH\n\0167Ü\033\0134ÁÂNä+·H¦\026gPEîY\f¢¯Ë0¶p4fÆ\\\001Zx\000mÖqmuSôÊìÐN\013\027o'î)\016Ïy@\005l\021\r´õs¥¢áç\033(¹ÒE§|\023¯\020\005¬ð=êìJ´ô|+£ØìN$ñÚ\034L:Kµz&\0048IÉX^³\t\020Æ[È=\030Òhä.¦·\037\021\0359?SÞ³ú-2\000Ø\002\0314há\002¾ßþmm´").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x461F;
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
        throw new RuntimeException("me/rerere/matrix/internal/lm", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/lm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\lm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */