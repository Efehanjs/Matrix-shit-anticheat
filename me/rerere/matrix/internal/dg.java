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
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.event.block.BlockBreakEvent;

public final class dg extends zk {
  private static boolean k;
  
  @NotNull
  private final i v;
  
  @NotNull
  public static final jm b;
  
  private int i;
  
  private static final long a = o3.a(6484624213813240763L, -1583753805674348971L, MethodHandles.lookup().lookupClass()).a(179647300351110L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 48574722703755
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 90604108735287
    //   19: lxor
    //   20: lstore #9
    //   22: dup2
    //   23: ldc2_w 40507544756790
    //   26: lxor
    //   27: lstore #11
    //   29: pop2
    //   30: lload #11
    //   32: aload_1
    //   33: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   36: ifne -> 56
    //   39: aload_1
    //   40: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   43: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   46: ifeq -> 447
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: aload_0
    //   57: getfield v : Lme/rerere/matrix/internal/i;
    //   60: astore #13
    //   62: iconst_0
    //   63: istore #14
    //   65: aload #4
    //   67: astore #15
    //   69: iconst_0
    //   70: istore #16
    //   72: getstatic me/rerere/matrix/internal/dg.k : Z
    //   75: ifeq -> 446
    //   78: aload #13
    //   80: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   83: new me/rerere/matrix/internal/s
    //   86: dup
    //   87: aload #4
    //   89: invokestatic currentTimeMillis : ()J
    //   92: invokespecial <init> : (Lcom/comphenix/protocol/events/PacketContainer;J)V
    //   95: lload #9
    //   97: dup2_x1
    //   98: pop2
    //   99: invokevirtual p : (JLjava/lang/Object;)V
    //   102: aload #13
    //   104: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   107: lload #7
    //   109: invokevirtual p : (J)Z
    //   112: ifeq -> 446
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload #13
    //   124: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   127: checkcast java/lang/Iterable
    //   130: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
    //   133: astore #15
    //   135: iconst_0
    //   136: istore #16
    //   138: iconst_1
    //   139: istore #17
    //   141: aload #15
    //   143: invokestatic getLastIndex : (Ljava/util/List;)I
    //   146: istore #18
    //   148: iload #17
    //   150: iload #18
    //   152: if_icmpgt -> 444
    //   155: aload #15
    //   157: iload #17
    //   159: invokeinterface get : (I)Ljava/lang/Object;
    //   164: checkcast me/rerere/matrix/internal/s
    //   167: invokevirtual b : ()J
    //   170: aload #15
    //   172: iload #17
    //   174: iconst_1
    //   175: isub
    //   176: invokeinterface get : (I)Ljava/lang/Object;
    //   181: checkcast me/rerere/matrix/internal/s
    //   184: invokevirtual b : ()J
    //   187: lsub
    //   188: ldc2_w 10
    //   191: lcmp
    //   192: ifge -> 427
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload #15
    //   204: iload #17
    //   206: invokeinterface get : (I)Ljava/lang/Object;
    //   211: checkcast me/rerere/matrix/internal/s
    //   214: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   217: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   220: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   223: ifeq -> 427
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: aload #15
    //   235: iload #17
    //   237: invokeinterface get : (I)Ljava/lang/Object;
    //   242: checkcast me/rerere/matrix/internal/s
    //   245: invokevirtual b : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   248: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   251: iconst_0
    //   252: invokevirtual read : (I)Ljava/lang/Object;
    //   255: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.START_DESTROY_BLOCK : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   258: if_acmpeq -> 303
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: aload #15
    //   270: iload #17
    //   272: invokeinterface get : (I)Ljava/lang/Object;
    //   277: checkcast me/rerere/matrix/internal/s
    //   280: invokevirtual b : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   283: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   286: iconst_0
    //   287: invokevirtual read : (I)Ljava/lang/Object;
    //   290: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.STOP_DESTROY_BLOCK : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   293: if_acmpne -> 427
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   302: athrow
    //   303: aload #15
    //   305: iload #17
    //   307: iconst_1
    //   308: isub
    //   309: invokeinterface get : (I)Ljava/lang/Object;
    //   314: checkcast me/rerere/matrix/internal/s
    //   317: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   320: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   323: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   326: ifeq -> 427
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload #15
    //   338: iload #17
    //   340: iconst_1
    //   341: isub
    //   342: invokeinterface get : (I)Ljava/lang/Object;
    //   347: checkcast me/rerere/matrix/internal/s
    //   350: invokevirtual b : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   353: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   356: iconst_0
    //   357: invokevirtual read : (I)Ljava/lang/Object;
    //   360: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.START_DESTROY_BLOCK : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   363: if_acmpne -> 427
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: aload_0
    //   374: lload #5
    //   376: sipush #20249
    //   379: ldc2_w 4365683640382992118
    //   382: lload_2
    //   383: lxor
    //   384: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   389: sipush #24620
    //   392: ldc2_w 2203906847938675137
    //   395: lload_2
    //   396: lxor
    //   397: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   402: iconst_0
    //   403: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   406: aload_0
    //   407: aload_0
    //   408: getfield i : I
    //   411: iconst_1
    //   412: iadd
    //   413: iconst_5
    //   414: invokestatic coerceAtMost : (II)I
    //   417: putfield i : I
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   426: athrow
    //   427: iload #17
    //   429: iload #18
    //   431: if_icmpeq -> 444
    //   434: iinc #17, 1
    //   437: goto -> 155
    //   440: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   443: athrow
    //   444: nop
    //   445: nop
    //   446: nop
    //   447: iconst_0
    //   448: ireturn
    // Exception table:
    //   from	to	target	type
    //   30	49	52	java/lang/RuntimeException
    //   72	115	118	java/lang/RuntimeException
    //   148	195	198	java/lang/RuntimeException
    //   155	226	229	java/lang/RuntimeException
    //   202	261	264	java/lang/RuntimeException
    //   233	296	299	java/lang/RuntimeException
    //   268	329	332	java/lang/RuntimeException
    //   303	366	369	java/lang/RuntimeException
    //   336	420	423	java/lang/RuntimeException
    //   427	440	440	java/lang/RuntimeException
  }
  
  public dg(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.r);
    this.v = new i(4);
  }
  
  static {
    long l = a ^ 0x3A48B909E582L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int j = (str = "!|­ªÝ½¯½¾ái>\013iÞêT¶(Ç>\006B0à\023ï¨,xÖÿØÂä&.áN\020R]`\026Íi¦ôæh±Ã8ÿ½`BÏ9u\n²ÇÅßHvÚ¢Öô\023é¢]:ù]¬¬rËm\004rìëèûeøÎ¸Í^¢k¨Æ`Íc\013Ú&+ÉÉ}F\023Ñ%SÍ£\016 $!àÍ,\033Ò)OG»à").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dg.a : J
    //   3: ldc2_w 64319094868861
    //   6: lxor
    //   7: lstore_1
    //   8: getstatic me/rerere/matrix/internal/dg.b : Lme/rerere/matrix/internal/jm;
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   16: sipush #3615
    //   19: ldc2_w 7443294653916300040
    //   22: lload_1
    //   23: lxor
    //   24: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   29: iconst_1
    //   30: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   35: putstatic me/rerere/matrix/internal/dg.k : Z
    //   38: return
  }
  
  public void b(short paramShort, int paramInt1, int paramInt2, @NotNull BlockBreakEvent paramBlockBreakEvent) {
    if (this.i > 0) {
      paramBlockBreakEvent.setCancelled(true);
      int j = this.i;
      this.i = j + -1;
      this.i = RangesKt.coerceAtLeast(this.i, 0);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int j;
    char[] arrayOfChar = new char[j = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < j; b2++) {
      int k;
      if ((k = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)k;
      } else if (k < 224) {
        char c = (char)((char)(k & 0x1F) << 6);
        k = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(k & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < j - 2) {
        char c = (char)((char)(k & 0xF) << 12);
        k = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(k & 0x3F) << 6);
        k = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(k & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String c(int paramInt, long paramLong) {
    int j = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x72D7;
    if (d[j] == null) {
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
        throw new RuntimeException("me/rerere/matrix/internal/dg", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[j].getBytes("ISO-8859-1");
      d[j] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[j];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int j = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(j, l);
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
    //   66: ldc_w 'me/rerere/matrix/internal/dg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */