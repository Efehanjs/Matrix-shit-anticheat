package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
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
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class jj extends zk {
  private final hc a;
  
  private int s;
  
  private float u = 90.0F;
  
  private static final float w = 0.0096F;
  
  private int f;
  
  private static int l;
  
  private final hc r;
  
  private float x;
  
  private float z;
  
  private int k;
  
  private float v = 0.0F;
  
  private static boolean b;
  
  private int i;
  
  private static final long c = o3.a(7174243138446068796L, -7189212782406276044L, MethodHandles.lookup().lookupClass()).a(118630807439703L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map g = new HashMap<>(13);
  
  public static strictfp float b(float paramFloat1, float paramFloat2) {
    float f = Math.abs(paramFloat1 - paramFloat2) % 360.0F;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (f > 180.0F) ? (360.0F - f) : f;
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jj.c : J
    //   3: ldc2_w 78029825294484
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: astore_3
    //   13: aload_3
    //   14: sipush #30925
    //   17: ldc2_w 6334022725169405352
    //   20: lload_1
    //   21: lxor
    //   22: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   27: bipush #7
    //   29: invokeinterface getInt : (Ljava/lang/String;I)I
    //   34: putstatic me/rerere/matrix/internal/jj.l : I
    //   37: aload_3
    //   38: sipush #20823
    //   41: ldc2_w 5831992286392513584
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   57: putstatic me/rerere/matrix/internal/jj.b : Z
    //   60: return
  }
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (this.f > 0)
        try {
          this.f--;
          if (this.f == 0)
            this.r.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public jj(long paramLong, yl paramyl) {
    super(paramyl);
    this.r = new hc(l, 10);
    this.a = new hc(l, 10);
    this.f = 0;
    this.k = 0;
    this.i = 0;
    b(yk.n);
  }
  
  public void b(long paramLong, @NotNull PacketType paramPacketType, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 45177640179193
    //   5: lxor
    //   6: lstore #6
    //   8: pop2
    //   9: fload #4
    //   11: aload_0
    //   12: getfield z : F
    //   15: invokestatic b : (FF)F
    //   18: fstore #8
    //   20: fload #5
    //   22: aload_0
    //   23: getfield v : F
    //   26: fsub
    //   27: invokestatic abs : (F)F
    //   30: fstore #9
    //   32: aload_0
    //   33: fload #8
    //   35: fload #9
    //   37: invokespecial b : (FF)Z
    //   40: ifeq -> 265
    //   43: aload_0
    //   44: dup
    //   45: getfield k : I
    //   48: iconst_1
    //   49: iadd
    //   50: putfield k : I
    //   53: getstatic me/rerere/matrix/internal/pd.r : Z
    //   56: ifeq -> 228
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: aload_0
    //   67: getfield f : I
    //   70: ifle -> 228
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: new java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: sipush #15832
    //   90: ldc2_w 8496756339973153000
    //   93: lload_1
    //   94: lxor
    //   95: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_0
    //   104: getfield u : F
    //   107: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   110: sipush #9132
    //   113: ldc2_w 6089295250913001106
    //   116: lload_1
    //   117: lxor
    //   118: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: aload_0
    //   127: getfield k : I
    //   130: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   133: sipush #26126
    //   136: ldc2_w 1911163437051329337
    //   139: lload_1
    //   140: lxor
    //   141: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: fload #8
    //   151: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   154: ldc ','
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: fload #9
    //   161: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   164: sipush #7796
    //   167: ldc2_w 5082702338545730374
    //   170: lload_1
    //   171: lxor
    //   172: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: aload_0
    //   181: fload #4
    //   183: invokespecial b : (F)Z
    //   186: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   189: sipush #8936
    //   192: ldc2_w 557523062981492693
    //   195: lload_1
    //   196: lxor
    //   197: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: aload_0
    //   206: fload #5
    //   208: invokespecial b : (F)Z
    //   211: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   214: invokevirtual toString : ()Ljava/lang/String;
    //   217: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   220: pop
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   227: athrow
    //   228: fload #8
    //   230: aload_0
    //   231: getfield u : F
    //   234: fdiv
    //   235: invokestatic b : (F)I
    //   238: istore #10
    //   240: fload #9
    //   242: aload_0
    //   243: getfield u : F
    //   246: fdiv
    //   247: invokestatic b : (F)I
    //   250: istore #11
    //   252: aload_0
    //   253: iload #10
    //   255: lload #6
    //   257: iload #11
    //   259: invokespecial b : (IJI)V
    //   262: goto -> 446
    //   265: getstatic me/rerere/matrix/internal/pd.r : Z
    //   268: ifeq -> 360
    //   271: aload_0
    //   272: getfield f : I
    //   275: ifle -> 360
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: new java/lang/StringBuilder
    //   288: dup
    //   289: invokespecial <init> : ()V
    //   292: sipush #20818
    //   295: ldc2_w 8926142402854128737
    //   298: lload_1
    //   299: lxor
    //   300: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: aload_0
    //   309: getfield u : F
    //   312: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   315: sipush #24129
    //   318: ldc2_w 7278564308394705780
    //   321: lload_1
    //   322: lxor
    //   323: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: fload #8
    //   333: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   336: ldc ','
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: fload #9
    //   343: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   346: invokevirtual toString : ()Ljava/lang/String;
    //   349: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   352: pop
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   359: athrow
    //   360: aload_0
    //   361: iconst_0
    //   362: putfield k : I
    //   365: fload #9
    //   367: ldc 0.0096
    //   369: fcmpl
    //   370: iflt -> 393
    //   373: aload_0
    //   374: fload #9
    //   376: aload_0
    //   377: getfield u : F
    //   380: invokestatic min : (FF)F
    //   383: putfield u : F
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   392: athrow
    //   393: aload_0
    //   394: getfield u : F
    //   397: aload_0
    //   398: getfield x : F
    //   401: fcmpl
    //   402: ifne -> 441
    //   405: aload_0
    //   406: dup
    //   407: getfield s : I
    //   410: iconst_1
    //   411: iadd
    //   412: dup_x1
    //   413: putfield s : I
    //   416: bipush #10
    //   418: if_icmple -> 446
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   427: athrow
    //   428: aload_0
    //   429: ldc 90.0
    //   431: putfield u : F
    //   434: goto -> 446
    //   437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   440: athrow
    //   441: aload_0
    //   442: iconst_0
    //   443: putfield s : I
    //   446: aload_0
    //   447: fload #4
    //   449: putfield z : F
    //   452: aload_0
    //   453: fload #5
    //   455: putfield v : F
    //   458: aload_0
    //   459: aload_0
    //   460: getfield u : F
    //   463: putfield x : F
    //   466: return
    // Exception table:
    //   from	to	target	type
    //   32	59	62	java/lang/RuntimeException
    //   43	73	76	java/lang/RuntimeException
    //   66	221	224	java/lang/RuntimeException
    //   265	278	281	java/lang/RuntimeException
    //   271	353	356	java/lang/RuntimeException
    //   360	386	389	java/lang/RuntimeException
    //   393	421	424	java/lang/RuntimeException
    //   405	437	437	java/lang/RuntimeException
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    try {
      if (this.i > 0)
        try {
          this.i--;
          if (this.i % 3 == 0) {
            paramEntityDamageByEntityEvent.setDamage(0.0D);
          } else {
            paramEntityDamageByEntityEvent.setCancelled(true);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public int p() {
    return this.k;
  }
  
  public void b(int paramInt, long paramLong) {
    this.f = 20;
  }
  
  public float b() {
    return this.u;
  }
  
  static {
    long l = c ^ 0x604B310BAA7L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "{ÍïKhx\017\020¹|]õ¸Ä¶\017¨@º`ÈâH5\037UãóDÊUJ+_£Ë÷j\005\026ÛËÀ5ÊÍ\027½ot\007f\t\021©¹a\rs«jé#òuß¾]S\030¯)\026Ý,÷¼ÓÜ \f,ªÜàM\034t°XË\0164T¦'Â÷[u`Æý?\004®:n\003Ñ8°\020\016P~`ùÿ\"Ó\t£Z¼Ñ\fIÐxê´ÌO\023\022Ü'vÐ¾á}{\\@@i~r|*ü¦÷\035\0368}ð&&¾~7\016grúý@¨ÎùòF,Â`®ö\f\026ü<$ê&Ñò<B+zD\031²Í¹\023Ì\036-S1\025HO(54VéÂù\003A­üÆ`§¾\004}\025ïÔ4'|àþæAÂô½\003¯|9ßh¹t­ô¤s^£\f\007æ¹Ü,a{-ãéb·µ3{^\030·\f\\\\GËl^ÂÑl«ØH2­B\036\0312ï9«\006FN\013Ô\000Z\000_õM\0018®ü{J\0344Êr¥J\033²4õ¹D* \râ²Y±Í´®´0L¸~z(Î\tÊ¶¨«$¯º¿âÄAu*ìæ@@á\005Ü\033'á\033§¢¹ðØÌÐ(àMC ¥BmF¹\026öu}Ïóøè1Å¬ZR&ºoº÷jj\000Äs").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1AA7;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])g.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          g.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/jj", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/jj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\jj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */