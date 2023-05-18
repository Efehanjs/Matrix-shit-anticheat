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
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

public class sk extends zk {
  private boolean b = false;
  
  private static boolean i;
  
  private static final long a = o3.a(8033942519800993154L, 7244305616383535091L, MethodHandles.lookup().lookupClass()).a(222872868780754L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public sk(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sk.a : J
    //   3: ldc2_w 21984680740023
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #12398
    //   15: ldc2_w 2118142188548693284
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   25: iconst_0
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/sk.i : Z
    //   34: return
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sk.a : J
    //   3: ldc2_w 117073840316649
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 129236884854754
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 26292523551644
    //   22: lxor
    //   23: dup2
    //   24: bipush #32
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #32
    //   33: lshl
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #9
    //   40: dup2
    //   41: bipush #48
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #10
    //   50: pop2
    //   51: pop2
    //   52: getstatic me/rerere/matrix/internal/sk.i : Z
    //   55: ifne -> 63
    //   58: return
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_1
    //   64: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   67: astore #11
    //   69: aload #11
    //   71: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   76: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   79: if_acmpne -> 87
    //   82: return
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload #11
    //   89: invokeinterface isFlying : ()Z
    //   94: ifne -> 107
    //   97: aload_0
    //   98: iconst_0
    //   99: putfield b : Z
    //   102: return
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: invokestatic b : ()I
    //   110: bipush #9
    //   112: if_icmplt -> 137
    //   115: aload #11
    //   117: invokeinterface isGliding : ()Z
    //   122: ifeq -> 137
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: return
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: invokestatic b : ()I
    //   140: bipush #13
    //   142: if_icmplt -> 184
    //   145: aload #11
    //   147: invokeinterface isSwimming : ()Z
    //   152: ifne -> 179
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: aload #11
    //   164: invokeinterface isRiptiding : ()Z
    //   169: ifeq -> 184
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: return
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_2
    //   185: aload_3
    //   186: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   189: dstore #12
    //   191: aload_0
    //   192: iload #8
    //   194: aload #11
    //   196: iload #9
    //   198: i2s
    //   199: iload #10
    //   201: i2c
    //   202: invokespecial b : (ILorg/bukkit/entity/Player;SC)D
    //   205: dstore #14
    //   207: dload #12
    //   209: dload #14
    //   211: dcmpl
    //   212: ifle -> 335
    //   215: aload_0
    //   216: getfield b : Z
    //   219: ifeq -> 335
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   228: athrow
    //   229: aload_0
    //   230: sipush #10940
    //   233: ldc2_w 4266319480575468458
    //   236: lload #4
    //   238: lxor
    //   239: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   244: new java/lang/StringBuilder
    //   247: dup
    //   248: invokespecial <init> : ()V
    //   251: sipush #29681
    //   254: ldc2_w 2647070752896252646
    //   257: lload #4
    //   259: lxor
    //   260: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: dload #12
    //   270: invokestatic b : (D)D
    //   273: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   276: sipush #21014
    //   279: ldc2_w 5865192456634030851
    //   282: lload #4
    //   284: lxor
    //   285: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: dload #14
    //   295: invokestatic b : (D)D
    //   298: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   301: ldc ')'
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: lload #6
    //   311: bipush #10
    //   313: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;JI)Z
    //   316: istore #16
    //   318: iload #16
    //   320: ifeq -> 335
    //   323: aload_1
    //   324: aload_2
    //   325: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   334: athrow
    //   335: aload_0
    //   336: iconst_1
    //   337: putfield b : Z
    //   340: return
    // Exception table:
    //   from	to	target	type
    //   52	59	59	java/lang/RuntimeException
    //   69	83	83	java/lang/RuntimeException
    //   87	103	103	java/lang/RuntimeException
    //   107	125	128	java/lang/RuntimeException
    //   115	133	133	java/lang/RuntimeException
    //   137	155	158	java/lang/RuntimeException
    //   145	172	175	java/lang/RuntimeException
    //   162	180	180	java/lang/RuntimeException
    //   207	222	225	java/lang/RuntimeException
    //   318	328	331	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x7FAFD55CDC15L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "óÂ³×Ù®gÕ.V<\027Ñ[1øÈÁ£4§ÙCÝìé¥f\003¶¼Ï\037Â» <§@°±*/È\006\016@¼F;Y\000OÏç}â¤©¯q\036Àq@¾").length();
    byte b2 = 40;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1288;
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
        throw new RuntimeException("me/rerere/matrix/internal/sk", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/sk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */