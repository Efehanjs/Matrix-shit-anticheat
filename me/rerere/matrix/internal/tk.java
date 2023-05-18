package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
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

public class tk extends zk {
  private int v = 0;
  
  private int b = 0;
  
  private int i = 0;
  
  private static final long a = o3.a(3934786211094105092L, -7010048527671437248L, MethodHandles.lookup().lookupClass()).a(259448742203634L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: lstore_3
    //   15: lload_3
    //   16: dup2
    //   17: ldc2_w 78396785392265
    //   20: lxor
    //   21: lstore #5
    //   23: dup2
    //   24: ldc2_w 119942378139598
    //   27: lxor
    //   28: dup2
    //   29: bipush #56
    //   31: lushr
    //   32: l2i
    //   33: istore #7
    //   35: dup2
    //   36: bipush #8
    //   38: lshl
    //   39: bipush #8
    //   41: lushr
    //   42: lstore #8
    //   44: pop2
    //   45: dup2
    //   46: ldc2_w 83214370752244
    //   49: lxor
    //   50: lstore #10
    //   52: pop2
    //   53: aload_0
    //   54: aload_0
    //   55: getfield i : I
    //   58: iconst_1
    //   59: iadd
    //   60: bipush #40
    //   62: invokestatic min : (II)I
    //   65: putfield i : I
    //   68: aload_0
    //   69: getfield i : I
    //   72: bipush #40
    //   74: if_icmplt -> 121
    //   77: aload_0
    //   78: dup
    //   79: getfield v : I
    //   82: iconst_1
    //   83: iadd
    //   84: putfield v : I
    //   87: aload_0
    //   88: getfield v : I
    //   91: bipush #20
    //   93: if_icmplt -> 121
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: aload_0
    //   104: iconst_0
    //   105: putfield v : I
    //   108: aload_0
    //   109: lload #10
    //   111: invokespecial h : (J)V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: aload_0
    //   122: getfield i : I
    //   125: bipush #40
    //   127: if_icmplt -> 289
    //   130: aload_0
    //   131: getfield b : I
    //   134: iconst_1
    //   135: if_icmple -> 289
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: aload_0
    //   146: iload #7
    //   148: i2b
    //   149: lload #8
    //   151: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   154: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   159: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   162: if_acmpne -> 289
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: aload_0
    //   173: iload #7
    //   175: i2b
    //   176: lload #8
    //   178: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   181: invokeinterface isDead : ()Z
    //   186: ifne -> 289
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   199: invokevirtual j : ()Z
    //   202: ifeq -> 289
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_0
    //   213: lload #5
    //   215: sipush #2817
    //   218: ldc2_w 6981722253155099079
    //   221: lload_3
    //   222: lxor
    //   223: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   228: sipush #651
    //   231: ldc2_w 2676162178956453967
    //   234: lload_3
    //   235: lxor
    //   236: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   241: iconst_5
    //   242: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   245: aload_0
    //   246: iload #7
    //   248: i2b
    //   249: lload #8
    //   251: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   254: aload_0
    //   255: iload #7
    //   257: i2b
    //   258: lload #8
    //   260: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   263: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   268: invokevirtual clone : ()Lorg/bukkit/Location;
    //   271: invokeinterface teleport : (Lorg/bukkit/Location;)Z
    //   276: pop
    //   277: aload_0
    //   278: iconst_0
    //   279: putfield b : I
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   288: athrow
    //   289: return
    // Exception table:
    //   from	to	target	type
    //   53	96	99	java/lang/RuntimeException
    //   77	114	117	java/lang/RuntimeException
    //   121	138	141	java/lang/RuntimeException
    //   130	165	168	java/lang/RuntimeException
    //   145	189	192	java/lang/RuntimeException
    //   172	205	208	java/lang/RuntimeException
    //   196	282	285	java/lang/RuntimeException
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l = paramLong ^ 0x24D765D0E236L;
    try {
      if (v.j(l, paramPacketType)) {
        this.i = 0;
        this.b = 0;
      } else {
        try {
          if (paramPacketType == PacketType.Play.Client.VEHICLE_MOVE) {
            this.i = 0;
            this.b = 0;
          } else {
            this.b++;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public tk(yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  static {
    long l = a ^ 0x9E9D1DB495CL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "]\025ø\016¬¬\022øÌa¼-_eÄ(#\031¹ØìN~\003\025Hlð×LaìTaÞ\001FÂ|bû­*Ö@;\034\035^Q\030R4þÊ\026\026­,çxÌM#¨1\026\016Z÷P").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3A7;
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
        throw new RuntimeException("me/rerere/matrix/internal/tk", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/tk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\tk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */