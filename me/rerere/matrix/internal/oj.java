package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;

public final class oj implements Runnable, Listener {
  @NotNull
  private final HashMap i = new HashMap<>();
  
  private static yk[] a;
  
  private static final long b = o3.a(806139821599335615L, -8563071509678536139L, MethodHandles.lookup().lookupClass()).a(40874738735887L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void run() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/oj.b : J
    //   3: ldc2_w 123651522640850
    //   6: lxor
    //   7: lstore_1
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: checkcast java/util/List
    //   18: astore #4
    //   20: invokestatic a : ()I
    //   23: aload_0
    //   24: getfield i : Ljava/util/HashMap;
    //   27: checkcast java/util/Map
    //   30: invokeinterface entrySet : ()Ljava/util/Set;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore #5
    //   42: istore_3
    //   43: aload #5
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 146
    //   53: aload #5
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast java/util/Map$Entry
    //   63: astore #6
    //   65: aload #6
    //   67: invokeinterface getKey : ()Ljava/lang/Object;
    //   72: checkcast java/util/UUID
    //   75: astore #7
    //   77: aload #6
    //   79: invokeinterface getValue : ()Ljava/lang/Object;
    //   84: checkcast java/lang/Number
    //   87: invokevirtual longValue : ()J
    //   90: lstore #8
    //   92: iload_3
    //   93: ifne -> 159
    //   96: invokestatic currentTimeMillis : ()J
    //   99: lload #8
    //   101: lsub
    //   102: getstatic me/rerere/matrix/internal/ge.i : I
    //   105: sipush #1000
    //   108: imul
    //   109: i2l
    //   110: lcmp
    //   111: iload_3
    //   112: ifne -> 141
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: ifle -> 43
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: aload #4
    //   134: aload #7
    //   136: invokeinterface add : (Ljava/lang/Object;)Z
    //   141: pop
    //   142: iload_3
    //   143: ifeq -> 43
    //   146: aload #4
    //   148: aload_0
    //   149: <illegal opcode> accept : (Lme/rerere/matrix/internal/oj;)Ljava/util/function/Consumer;
    //   154: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   159: return
    // Exception table:
    //   from	to	target	type
    //   92	115	118	java/lang/RuntimeException
    //   96	125	128	java/lang/RuntimeException
  }
  
  public final void b(@NotNull UUID paramUUID) {
    long l1 = b ^ 0x260F04922C06L;
    long l2 = l1 ^ 0x7725C1EACBD6L;
    Bukkit.getScheduler().runTask((Plugin)Matrix.q.b(l2), () -> paramoj.i.put(paramUUID, Long.valueOf(System.currentTimeMillis())));
  }
  
  @EventHandler
  public final void b(@NotNull PlayerLoginEvent paramPlayerLoginEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/oj.b : J
    //   3: ldc2_w 127465123429924
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   17: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   22: astore #5
    //   24: aload_0
    //   25: getfield i : Ljava/util/HashMap;
    //   28: aload #5
    //   30: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   33: ifeq -> 212
    //   36: invokestatic currentTimeMillis : ()J
    //   39: aload_0
    //   40: getfield i : Ljava/util/HashMap;
    //   43: aload #5
    //   45: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: dup
    //   49: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   52: checkcast java/lang/Number
    //   55: invokevirtual longValue : ()J
    //   58: lsub
    //   59: lstore #6
    //   61: lload #6
    //   63: ldc2_w 1000
    //   66: getstatic me/rerere/matrix/internal/ge.i : I
    //   69: i2l
    //   70: lmul
    //   71: lcmp
    //   72: iload #4
    //   74: ifeq -> 116
    //   77: ifge -> 212
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload_1
    //   88: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   91: sipush #22182
    //   94: ldc2_w 8586475039142058086
    //   97: lload_2
    //   98: lxor
    //   99: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   104: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: iload #4
    //   118: ifeq -> 134
    //   121: ifne -> 212
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: getstatic me/rerere/matrix/internal/ge.i : I
    //   134: i2l
    //   135: ldc2_w 1000
    //   138: lmul
    //   139: lload #6
    //   141: lsub
    //   142: lstore #8
    //   144: lload #8
    //   146: ldc2_w 1000
    //   149: ldiv
    //   150: lstore #8
    //   152: iload #4
    //   154: ifeq -> 181
    //   157: lload #8
    //   159: lconst_0
    //   160: lcmp
    //   161: ifne -> 174
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: lconst_1
    //   172: lstore #8
    //   174: aload_1
    //   175: getstatic org/bukkit/event/player/PlayerLoginEvent$Result.KICK_OTHER : Lorg/bukkit/event/player/PlayerLoginEvent$Result;
    //   178: invokevirtual setResult : (Lorg/bukkit/event/player/PlayerLoginEvent$Result;)V
    //   181: aload_1
    //   182: getstatic me/rerere/matrix/internal/gl.i : Ljava/lang/String;
    //   185: sipush #18800
    //   188: ldc2_w 4780800355887253425
    //   191: lload_2
    //   192: lxor
    //   193: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   198: lload #8
    //   200: invokestatic valueOf : (J)Ljava/lang/String;
    //   203: iconst_0
    //   204: iconst_4
    //   205: aconst_null
    //   206: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   209: invokevirtual setKickMessage : (Ljava/lang/String;)V
    //   212: return
    // Exception table:
    //   from	to	target	type
    //   61	80	83	java/lang/RuntimeException
    //   77	109	112	java/lang/RuntimeException
    //   116	124	127	java/lang/RuntimeException
    //   152	164	167	java/lang/RuntimeException
  }
  
  public static void k(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] J() {
    return a;
  }
  
  static {
    long l = b ^ 0x1CF03FA8D60FL;
    k(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "ªa_¼\034\007·Ð4\b+ÖµG$rðøÃ\tV,N¢o#ëÚBÜ(JÇ\025R¹ßd:ù2i¶\024hã7ztOR7)\020ºG6õÆl¶£³êÂ").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x29E6;
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
        throw new RuntimeException("me/rerere/matrix/internal/oj", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/oj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\oj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */