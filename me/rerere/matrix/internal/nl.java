package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.command.CommandSender;

public class nl extends xl {
  private static final long a = o3.a(-102389883090662323L, -5904055439706449176L, MethodHandles.lookup().lookupClass()).a(146391958153949L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public nl(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/nl.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 15000358015459
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: sipush #23943
    //   18: ldc2_w 7671366584596970975
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   28: sipush #12583
    //   31: ldc2_w 8520759387772735859
    //   34: lload_1
    //   35: lxor
    //   36: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   41: sipush #6835
    //   44: ldc2_w 3228271725825260268
    //   47: lload_1
    //   48: lxor
    //   49: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   54: lload_3
    //   55: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   58: sipush #4725
    //   61: ldc2_w 7435236373590471203
    //   64: lload_1
    //   65: lxor
    //   66: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   71: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   74: return
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 21532826850257
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 83089816486276
    //   12: lxor
    //   13: lstore #7
    //   15: pop2
    //   16: invokestatic a : ()I
    //   19: istore #9
    //   21: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   24: lload #5
    //   26: invokevirtual m : (J)Z
    //   29: iload #9
    //   31: ifne -> 76
    //   34: ifeq -> 68
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_1
    //   45: sipush #2198
    //   48: ldc2_w 1931931481599195055
    //   51: lload_2
    //   52: lxor
    //   53: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   58: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   63: return
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: getstatic me/rerere/matrix/internal/yk.n : Lme/rerere/matrix/internal/yk;
    //   71: lload #7
    //   73: invokevirtual b : (J)Z
    //   76: iload #9
    //   78: lload_2
    //   79: lconst_0
    //   80: lcmp
    //   81: iflt -> 145
    //   84: ifne -> 143
    //   87: ifne -> 140
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_1
    //   98: new java/lang/StringBuilder
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   108: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   111: sipush #23413
    //   114: ldc2_w 6295007386241033295
    //   117: lload_2
    //   118: lxor
    //   119: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   135: return
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: getstatic me/rerere/matrix/internal/lj.o : Z
    //   143: iload #9
    //   145: lload_2
    //   146: lconst_0
    //   147: lcmp
    //   148: iflt -> 229
    //   151: ifne -> 228
    //   154: ifne -> 207
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_1
    //   165: new java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   175: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   178: sipush #1654
    //   181: ldc2_w 8048867888468703559
    //   184: lload_2
    //   185: lxor
    //   186: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   202: return
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: aload #4
    //   209: iload #9
    //   211: lload_2
    //   212: lconst_0
    //   213: lcmp
    //   214: iflt -> 278
    //   217: ifne -> 277
    //   220: arraylength
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: iconst_3
    //   229: if_icmpge -> 275
    //   232: aload_1
    //   233: new java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   243: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   246: sipush #20250
    //   249: ldc2_w 3763845256910499879
    //   252: lload_2
    //   253: lxor
    //   254: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   270: return
    //   271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   274: athrow
    //   275: aload #4
    //   277: iconst_1
    //   278: aaload
    //   279: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   282: astore #10
    //   284: lload_2
    //   285: lconst_0
    //   286: lcmp
    //   287: iflt -> 368
    //   290: aload #10
    //   292: iload #9
    //   294: ifne -> 308
    //   297: ifnonnull -> 369
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_1
    //   308: new java/lang/StringBuilder
    //   311: dup
    //   312: invokespecial <init> : ()V
    //   315: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   318: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   321: sipush #5531
    //   324: ldc2_w 4444969877827496611
    //   327: lload_2
    //   328: lxor
    //   329: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: aload #4
    //   339: iconst_1
    //   340: aaload
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: sipush #18871
    //   347: ldc2_w 2196831454783174273
    //   350: lload_2
    //   351: lxor
    //   352: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: invokevirtual toString : ()Ljava/lang/String;
    //   363: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   368: return
    //   369: aload #4
    //   371: iconst_2
    //   372: aaload
    //   373: invokestatic parseInt : (Ljava/lang/String;)I
    //   376: istore #11
    //   378: aload #10
    //   380: iload #11
    //   382: invokestatic b : (Lorg/bukkit/entity/Player;I)V
    //   385: aload_1
    //   386: new java/lang/StringBuilder
    //   389: dup
    //   390: invokespecial <init> : ()V
    //   393: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   396: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   399: sipush #15127
    //   402: ldc2_w 1854963033866503212
    //   405: lload_2
    //   406: lxor
    //   407: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: aload #10
    //   417: invokeinterface getName : ()Ljava/lang/String;
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: sipush #19179
    //   428: ldc2_w 1932611284289418712
    //   431: lload_2
    //   432: lxor
    //   433: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   438: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: aload #4
    //   443: iconst_2
    //   444: aaload
    //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: sipush #14693
    //   451: ldc2_w 7225747445362329175
    //   454: lload_2
    //   455: lxor
    //   456: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: invokevirtual toString : ()Ljava/lang/String;
    //   467: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   472: goto -> 522
    //   475: astore #11
    //   477: aload_1
    //   478: new java/lang/StringBuilder
    //   481: dup
    //   482: invokespecial <init> : ()V
    //   485: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   488: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   491: sipush #1445
    //   494: ldc2_w 3003280036427676314
    //   497: lload_2
    //   498: lxor
    //   499: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   504: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: aload #4
    //   509: iconst_2
    //   510: aaload
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: invokevirtual toString : ()Ljava/lang/String;
    //   517: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   522: return
    // Exception table:
    //   from	to	target	type
    //   21	37	40	java/lang/Exception
    //   34	64	64	java/lang/Exception
    //   76	90	93	java/lang/Exception
    //   87	136	136	java/lang/Exception
    //   143	157	160	java/lang/Exception
    //   154	203	203	java/lang/Exception
    //   207	221	224	java/lang/Exception
    //   228	271	271	java/lang/Exception
    //   284	300	303	java/lang/Exception
    //   369	472	475	java/lang/Exception
  }
  
  public List b(long paramLong) {
    return null;
  }
  
  static {
    long l = a ^ 0x5CFE81DF18BAL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "ÆBsþÍÃbHgÌ/\005ª\025nf7\001êÏ\007$]ij²%§«+Z\003dÈv4\004èð\020Ïâ©\001µaópÁâ¹»xÞQWs\030\004À\035[ªÿ]íUÛ­oP\004an^18«pä´ïa9\037|\030G\fqu/È#ÀÐ'>®yÏx>\021é§dm\002¢Á \000ïåÏ1\013\033®\013\020O ÈgôÜ0\001e»GÎ|k¤xÃ¡ú\024Âð\"ãÿ+U c\021\002YOD½O\001\013&Î´qøw>nwã%ó×¾³«Ñ18\b2\036%ïm\002Ù4´]î\001ß¡¯\017¡\002(\002Å&)\006Tî\003ÿV]é´¿ñ\013$éUTéÒó@óÿßÒI{\006×#^F&\021ÖUËßµÿ)R¯U,x: \033óyÞ-\035¹D@Ä½ÈË\027RPÆÒÃR`¤¸³ÆÌK\t@pWYÌ(Ð´Î£be®J(ö÷Â\020V£#ØÞÐ3ÃÍ­À³¤Äx<ï\002ñÀX\0256Å\\\021Ì±\037\006á\022mæZß/½(ÿ}(ØòÉZ\037¾·£áíÆoVo\tÒ|ôÅ\007Ë\027þÒ\024\003SKÇ8ßü\026ÚÅ*¯âL4òk®Ò\020ç$C<\005\021¬@<¬\027ÓWU°\026U\000>³\026Ì\035Ét\bÃ³J,ÚýfÒú\020ñ\023ÜØ(­¤¦ \017ëH\033\027\t\t\020úØÈ_pO\003¯YáhñKcÜ\020ÔÏC³4\007\fëîl\031»£`ã\nðGxö.EÔ2ÎþÇO§î\r&½Zf \000µºøN`\022¬h\021\006~\027?r\0256Rß¼7¿!eî¾Ì0_°\024÷Ú\003\033\003Z£d\\î®L\002]ò´D°ÕÓR¬\025JlUj\013z").length();
    byte b2 = 88;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2C66;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/nl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/nl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */