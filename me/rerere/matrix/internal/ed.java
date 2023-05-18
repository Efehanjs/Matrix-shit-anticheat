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
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ed extends zk {
  private static int k;
  
  private static int v;
  
  private String b;
  
  private long i;
  
  private static final long a = o3.a(944212223321479873L, 440681398224470347L, MethodHandles.lookup().lookupClass()).a(106337208254556L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ed.a : J
    //   3: ldc2_w 79988232807533
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   12: invokevirtual b : ()Lme/rerere/matrix/internal/ci;
    //   15: invokevirtual j : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   18: sipush #31939
    //   21: ldc2_w 5891405642688597211
    //   24: lload_1
    //   25: lxor
    //   26: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   31: iconst_3
    //   32: invokeinterface getInt : (Ljava/lang/String;I)I
    //   37: putstatic me/rerere/matrix/internal/ed.v : I
    //   40: aload_0
    //   41: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   44: invokevirtual b : ()Lme/rerere/matrix/internal/ci;
    //   47: invokevirtual j : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   50: sipush #4982
    //   53: ldc2_w 8882283146801832815
    //   56: lload_1
    //   57: lxor
    //   58: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   63: iconst_3
    //   64: invokeinterface getInt : (Ljava/lang/String;I)I
    //   69: putstatic me/rerere/matrix/internal/ed.k : I
    //   72: return
  }
  
  public void b(long paramLong, @NotNull AsyncPlayerChatEvent paramAsyncPlayerChatEvent) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 121863570985920
    //   5: lxor
    //   6: lstore #4
    //   8: dup2
    //   9: ldc2_w 38080088932690
    //   12: lxor
    //   13: lstore #6
    //   15: pop2
    //   16: iconst_0
    //   17: istore #8
    //   19: invokestatic currentTimeMillis : ()J
    //   22: aload_0
    //   23: getfield i : J
    //   26: lsub
    //   27: lstore #9
    //   29: lload #9
    //   31: getstatic me/rerere/matrix/internal/ed.v : I
    //   34: i2l
    //   35: ldc2_w 1000
    //   38: lmul
    //   39: lcmp
    //   40: ifge -> 97
    //   43: iconst_1
    //   44: istore #8
    //   46: aload_0
    //   47: lload #4
    //   49: sipush #9935
    //   52: ldc2_w 5983719393995745598
    //   55: lload_1
    //   56: lxor
    //   57: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   62: new java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: sipush #32063
    //   72: ldc2_w 2947612505239597775
    //   75: lload_1
    //   76: lxor
    //   77: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: lload #9
    //   87: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: iconst_1
    //   94: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   97: aload_0
    //   98: getfield b : Ljava/lang/String;
    //   101: ifnull -> 177
    //   104: aload_3
    //   105: invokevirtual getMessage : ()Ljava/lang/String;
    //   108: aload_0
    //   109: getfield b : Ljava/lang/String;
    //   112: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   115: ifeq -> 177
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: lload #9
    //   127: ldc2_w 30000
    //   130: lcmp
    //   131: ifge -> 177
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: iconst_1
    //   142: istore #8
    //   144: aload_0
    //   145: lload #4
    //   147: sipush #17156
    //   150: ldc2_w 8119627546243370227
    //   153: lload_1
    //   154: lxor
    //   155: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   160: sipush #28574
    //   163: ldc2_w 7112698269525123176
    //   166: lload_1
    //   167: lxor
    //   168: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   173: iconst_1
    //   174: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   177: aload_0
    //   178: aload_3
    //   179: invokevirtual getMessage : ()Ljava/lang/String;
    //   182: putfield b : Ljava/lang/String;
    //   185: aload_0
    //   186: invokestatic currentTimeMillis : ()J
    //   189: putfield i : J
    //   192: iload #8
    //   194: ifeq -> 285
    //   197: getstatic me/rerere/matrix/internal/ed.k : I
    //   200: iconst_m1
    //   201: if_icmpeq -> 285
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_0
    //   212: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   215: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   218: aload_0
    //   219: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   222: lload #6
    //   224: dup2_x1
    //   225: pop2
    //   226: invokevirtual b : (JLme/rerere/matrix/internal/yk;)I
    //   229: getstatic me/rerere/matrix/internal/ed.k : I
    //   232: if_icmplt -> 285
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload_3
    //   243: iconst_1
    //   244: invokevirtual setCancelled : (Z)V
    //   247: aload_3
    //   248: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   251: new java/lang/StringBuilder
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: getstatic me/rerere/matrix/internal/gl.v : Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual toString : ()Ljava/lang/String;
    //   273: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: return
    // Exception table:
    //   from	to	target	type
    //   97	118	121	java/lang/RuntimeException
    //   104	134	137	java/lang/RuntimeException
    //   177	204	207	java/lang/RuntimeException
    //   197	235	238	java/lang/RuntimeException
    //   211	278	281	java/lang/RuntimeException
  }
  
  public ed(yl paramyl) {
    super(paramyl);
    b(yk.j);
  }
  
  static {
    long l = a ^ 0x5B7BA18F0566L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "cªÈa4ññðÍE¸aÎXG'c§/õ­^Ç]øÊ@ µ{ã×aÆ|\034W\\\017¸p \021=ú¾Y r.µÝ² !ªÖ÷xÓ9÷ÖiÈ.)&úÚ<WL©ð=\\Ì5d(Ùo¤\020®$»³xî¤Ç\006Tþù¼«>X3M}ïEG£Ív\021ô\nÉ¸\0000&").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4FD9;
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
        throw new RuntimeException("me/rerere/matrix/internal/ed", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ed'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */