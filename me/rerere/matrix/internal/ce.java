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
import org.bukkit.event.entity.EntityShootBowEvent;

public class ce extends zk {
  private int z = 0;
  
  private long k;
  
  private static boolean v;
  
  private static int b;
  
  private long i;
  
  private static final long a = o3.a(3027524507667412510L, -6189006727354103806L, MethodHandles.lookup().lookupClass()).a(102944340723767L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public ce(yl paramyl) {
    super(paramyl);
    b(yk.u);
  }
  
  public void b(char paramChar, long paramLong, @NotNull EntityShootBowEvent paramEntityShootBowEvent) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_2
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: lstore #5
    //   15: lload #5
    //   17: dup2
    //   18: ldc2_w 52211906537997
    //   21: lxor
    //   22: lstore #7
    //   24: dup2
    //   25: ldc2_w 69104772617130
    //   28: lxor
    //   29: lstore #9
    //   31: pop2
    //   32: aload_0
    //   33: getfield z : I
    //   36: bipush #7
    //   38: if_icmplt -> 257
    //   41: aload #4
    //   43: invokevirtual getForce : ()F
    //   46: f2d
    //   47: ldc2_w 0.274
    //   50: dcmpl
    //   51: iflt -> 257
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: getstatic me/rerere/matrix/internal/ce.b : I
    //   64: iflt -> 257
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: invokestatic j : ()J
    //   77: aload_0
    //   78: getfield k : J
    //   81: lsub
    //   82: lstore #11
    //   84: lload #11
    //   86: l2f
    //   87: aload #4
    //   89: invokevirtual getForce : ()F
    //   92: ldc 1075.0
    //   94: fmul
    //   95: fcmpg
    //   96: ifgt -> 252
    //   99: aload_0
    //   100: lload #7
    //   102: sipush #29627
    //   105: ldc2_w 5475739390025226044
    //   108: lload #5
    //   110: lxor
    //   111: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   116: new java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: sipush #21559
    //   126: ldc2_w 2214183663559405746
    //   129: lload #5
    //   131: lxor
    //   132: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload_0
    //   141: getfield z : I
    //   144: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   147: sipush #4614
    //   150: ldc2_w 8826329265990710919
    //   153: lload #5
    //   155: lxor
    //   156: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: aload #4
    //   166: invokevirtual getForce : ()F
    //   169: invokestatic b : (F)F
    //   172: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   175: ldc ')'
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual toString : ()Ljava/lang/String;
    //   183: getstatic me/rerere/matrix/internal/ce.b : I
    //   186: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   189: getstatic me/rerere/matrix/internal/ce.v : Z
    //   192: ifeq -> 252
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload_0
    //   203: lload #9
    //   205: invokevirtual j : (J)I
    //   208: getstatic me/rerere/matrix/internal/ce.b : I
    //   211: iconst_2
    //   212: imul
    //   213: if_icmpge -> 239
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   222: athrow
    //   223: aload_0
    //   224: getfield z : I
    //   227: bipush #19
    //   229: if_icmplt -> 252
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: aload #4
    //   241: iconst_1
    //   242: invokevirtual setCancelled : (Z)V
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   251: athrow
    //   252: aload_0
    //   253: iconst_0
    //   254: putfield z : I
    //   257: return
    // Exception table:
    //   from	to	target	type
    //   32	54	57	java/lang/RuntimeException
    //   41	67	70	java/lang/RuntimeException
    //   84	195	198	java/lang/RuntimeException
    //   99	216	219	java/lang/RuntimeException
    //   202	232	235	java/lang/RuntimeException
    //   223	245	248	java/lang/RuntimeException
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ce.a : J
    //   3: ldc2_w 140574395144134
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #29724
    //   15: ldc2_w 6742403040214783678
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/ce.v : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #22426
    //   41: ldc2_w 4403087580938286394
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/ce.b : I
    //   60: return
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l1 = paramLong ^ 0x48113204757AL;
    long l2 = paramLong ^ 0x24D765D0E236L;
    if (v.j(l2, paramPacketType)) {
      long l3 = pc.j();
      long l4 = l3 - this.i;
      try {
        if (l4 <= 40L) {
          this.z++;
        } else {
          this.z = 0;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      this.i = l3;
    } 
    try {
      if (v.m(paramPacketType, l1))
        this.k = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x56F031E22C05L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "C¬.G¯²\035r.;c2ºQôi\007­wO±¡> í\013;Þ\033{\023é(M\032\030^¢X´½ï\0325·r\0327R:\022º\002Wñ$û¹Q@\000\034«-Pê9a\0061<¹>b<!\000í ¿¢ï\037¹³Xïòµñ\"Nî\027­\027ú#v|\037Ù$\fµ\023\030^jbFÃ\022éÒÁ$,:q8)u§cEz`Æ").length();
    byte b2 = 88;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5D62;
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
        throw new RuntimeException("me/rerere/matrix/internal/ce", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ce'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */