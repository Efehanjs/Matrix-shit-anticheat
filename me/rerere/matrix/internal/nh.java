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
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class nh extends zk {
  private static boolean k;
  
  private long v;
  
  private long b;
  
  private static int i;
  
  private static final long a = o3.a(6130986626112504882L, 6456731389814325986L, MethodHandles.lookup().lookupClass()).a(154323970693820L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(long paramLong, @NotNull EntityRegainHealthEvent paramEntityRegainHealthEvent) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 59098879436035
    //   5: lxor
    //   6: lstore #4
    //   8: dup2
    //   9: ldc2_w 859010148713
    //   12: lxor
    //   13: lstore #6
    //   15: pop2
    //   16: invokestatic currentTimeMillis : ()J
    //   19: aload_0
    //   20: getfield v : J
    //   23: lsub
    //   24: lstore #8
    //   26: aload_3
    //   27: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   30: checkcast org/bukkit/entity/Player
    //   33: astore #10
    //   35: aload #10
    //   37: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   42: invokeinterface getDifficulty : ()Lorg/bukkit/Difficulty;
    //   47: astore #11
    //   49: aload_3
    //   50: invokevirtual getRegainReason : ()Lorg/bukkit/event/entity/EntityRegainHealthEvent$RegainReason;
    //   53: getstatic org/bukkit/event/entity/EntityRegainHealthEvent$RegainReason.SATIATED : Lorg/bukkit/event/entity/EntityRegainHealthEvent$RegainReason;
    //   56: if_acmpeq -> 64
    //   59: return
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: aload #10
    //   66: getstatic org/bukkit/potion/PotionEffectType.REGENERATION : Lorg/bukkit/potion/PotionEffectType;
    //   69: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   74: ifeq -> 82
    //   77: return
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: invokestatic j : ()D
    //   85: ldc2_w 19.5
    //   88: dcmpg
    //   89: ifge -> 97
    //   92: return
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: ldc2_w 495.0
    //   100: dstore #12
    //   102: aload #11
    //   104: getstatic org/bukkit/Difficulty.PEACEFUL : Lorg/bukkit/Difficulty;
    //   107: if_acmpne -> 115
    //   110: ldc2_w 450.0
    //   113: dstore #12
    //   115: aload #11
    //   117: getstatic org/bukkit/Difficulty.EASY : Lorg/bukkit/Difficulty;
    //   120: if_acmpeq -> 153
    //   123: aload #11
    //   125: getstatic org/bukkit/Difficulty.NORMAL : Lorg/bukkit/Difficulty;
    //   128: if_acmpeq -> 153
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: aload #11
    //   140: getstatic org/bukkit/Difficulty.HARD : Lorg/bukkit/Difficulty;
    //   143: if_acmpne -> 158
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: ldc2_w 3800.0
    //   156: dstore #12
    //   158: invokestatic b : ()I
    //   161: bipush #9
    //   163: if_icmplt -> 171
    //   166: ldc2_w 420.0
    //   169: dstore #12
    //   171: invokestatic currentTimeMillis : ()J
    //   174: aload_0
    //   175: getfield b : J
    //   178: lsub
    //   179: ldc2_w 500
    //   182: lcmp
    //   183: ifge -> 194
    //   186: dload #12
    //   188: ldc2_w 100.0
    //   191: dsub
    //   192: dstore #12
    //   194: lload #8
    //   196: l2d
    //   197: dload #12
    //   199: dcmpg
    //   200: ifge -> 392
    //   203: getstatic me/rerere/matrix/internal/nh.i : I
    //   206: iflt -> 392
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   215: athrow
    //   216: lload #8
    //   218: invokestatic b : (J)D
    //   221: invokestatic b : (D)D
    //   224: invokestatic toString : (D)Ljava/lang/String;
    //   227: astore #14
    //   229: aload_0
    //   230: lload #4
    //   232: sipush #6249
    //   235: ldc2_w 6365882668616044875
    //   238: lload_1
    //   239: lxor
    //   240: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   245: new java/lang/StringBuilder
    //   248: dup
    //   249: invokespecial <init> : ()V
    //   252: sipush #29290
    //   255: ldc2_w 8798456569445825359
    //   258: lload_1
    //   259: lxor
    //   260: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: aload #11
    //   270: invokevirtual name : ()Ljava/lang/String;
    //   273: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: sipush #8642
    //   282: ldc2_w 7852072677506312419
    //   285: lload_1
    //   286: lxor
    //   287: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload #14
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: sipush #17266
    //   303: ldc2_w 5386377548441160273
    //   306: lload_1
    //   307: lxor
    //   308: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: lload #6
    //   318: invokestatic b : (J)Lme/rerere/matrix/internal/q;
    //   321: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   324: sipush #13090
    //   327: ldc2_w 8751960827201911302
    //   330: lload_1
    //   331: lxor
    //   332: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: aload_0
    //   341: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   344: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   347: invokevirtual b : ()Ljava/lang/String;
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: ldc ')'
    //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual toString : ()Ljava/lang/String;
    //   361: getstatic me/rerere/matrix/internal/nh.i : I
    //   364: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   367: getstatic me/rerere/matrix/internal/nh.k : Z
    //   370: ifeq -> 392
    //   373: aload_3
    //   374: aload_3
    //   375: invokevirtual getAmount : ()D
    //   378: ldc2_w 2.0
    //   381: ddiv
    //   382: invokevirtual setAmount : (D)V
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   391: athrow
    //   392: aload_0
    //   393: invokestatic currentTimeMillis : ()J
    //   396: putfield v : J
    //   399: return
    // Exception table:
    //   from	to	target	type
    //   49	60	60	java/lang/RuntimeException
    //   64	78	78	java/lang/RuntimeException
    //   82	93	93	java/lang/RuntimeException
    //   115	131	134	java/lang/RuntimeException
    //   123	146	149	java/lang/RuntimeException
    //   194	209	212	java/lang/RuntimeException
    //   229	385	388	java/lang/RuntimeException
  }
  
  public void b(@NotNull EntityDamageEvent paramEntityDamageEvent) {
    this.b = System.currentTimeMillis();
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/nh.a : J
    //   3: ldc2_w 43718835750161
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #6883
    //   15: ldc2_w 3531613824528636652
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getInt : (Ljava/lang/String;I)I
    //   31: putstatic me/rerere/matrix/internal/nh.i : I
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #26439
    //   41: ldc2_w 5687060760866662223
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   57: putstatic me/rerere/matrix/internal/nh.k : Z
    //   60: return
  }
  
  public nh(yl paramyl) {
    super(paramyl);
    b(yk.u);
  }
  
  static {
    long l = a ^ 0x40C28847FEECL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "þPºFV_?_4¥ÜYèT¶YX8£ö¿¾ ÐRd®_JYO\017©4Ï;² Ø;\tÏ\001\rî%þI_\020@\020Wpßt5\025à_Æö=Äeu ]Ùö\003Fw\rcôRiG\016\\êüDNQ®z¬6(U\032;Â`ðªà\016\022\002[Õ\036&ÁPÄ÷ú-\001Ì2¿\002\026à¡§¡\tdðü«\030¥lGáùy&Guá4ä\025\013¡°Uþ\022½UÏyÝhsÀ\003¯¿!Ðöyt<w\020ÔYêÌc\b\"E8£±Å").length();
    byte b2 = 24;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7FC8;
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
        throw new RuntimeException("me/rerere/matrix/internal/nh", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/nh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */