package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public final class vi implements PluginMessageListener {
  private static final long a = o3.a(-8497641989004244783L, -2545060561906651994L, MethodHandles.lookup().lookupClass()).a(218583148295296L);
  
  private static final String b;
  
  public void onPluginMessageReceived(@NotNull String paramString, @NotNull Player paramPlayer, @NotNull byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vi.a : J
    //   3: ldc2_w 16359923903247
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 84514665289529
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 26610471534383
    //   22: lxor
    //   23: lstore #8
    //   25: pop2
    //   26: invokestatic a : ()I
    //   29: istore #10
    //   31: aload_1
    //   32: getstatic me/rerere/matrix/internal/vi.b : Ljava/lang/String;
    //   35: iconst_1
    //   36: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   39: iload #10
    //   41: ifne -> 58
    //   44: ifne -> 55
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: return
    //   55: getstatic me/rerere/matrix/internal/ge.w : Z
    //   58: iload #10
    //   60: ifne -> 80
    //   63: ifne -> 74
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   72: athrow
    //   73: return
    //   74: nop
    //   75: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   78: pop
    //   79: iconst_0
    //   80: istore #11
    //   82: new java/io/DataInputStream
    //   85: dup
    //   86: new java/io/ByteArrayInputStream
    //   89: dup
    //   90: aload_3
    //   91: invokespecial <init> : ([B)V
    //   94: checkcast java/io/InputStream
    //   97: invokespecial <init> : (Ljava/io/InputStream;)V
    //   100: checkcast java/io/Closeable
    //   103: astore #12
    //   105: aconst_null
    //   106: astore #13
    //   108: nop
    //   109: aload #12
    //   111: checkcast java/io/DataInputStream
    //   114: astore #14
    //   116: iconst_0
    //   117: istore #15
    //   119: aload #14
    //   121: invokevirtual readUTF : ()Ljava/lang/String;
    //   124: astore #16
    //   126: iload #10
    //   128: ifne -> 155
    //   131: aload #16
    //   133: invokestatic getPlayerExact : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   136: dup
    //   137: ifnonnull -> 158
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   146: athrow
    //   147: pop
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   154: athrow
    //   155: goto -> 214
    //   158: astore #17
    //   160: iload #10
    //   162: ifne -> 209
    //   165: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   168: lload #8
    //   170: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   173: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   176: aload #17
    //   178: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   183: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   186: dup
    //   187: ifnull -> 212
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   196: athrow
    //   197: lload #6
    //   199: invokevirtual m : (J)V
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   208: athrow
    //   209: goto -> 213
    //   212: pop
    //   213: nop
    //   214: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   217: astore #14
    //   219: aload #12
    //   221: aload #13
    //   223: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   226: goto -> 250
    //   229: astore #14
    //   231: aload #14
    //   233: astore #13
    //   235: aload #14
    //   237: athrow
    //   238: astore #14
    //   240: aload #12
    //   242: aload #13
    //   244: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   247: aload #14
    //   249: athrow
    //   250: nop
    //   251: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   254: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   257: astore #11
    //   259: goto -> 278
    //   262: astore #12
    //   264: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   267: pop
    //   268: aload #12
    //   270: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   273: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   276: astore #11
    //   278: aload #11
    //   280: astore #11
    //   282: aload #11
    //   284: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   287: dup
    //   288: ifnull -> 309
    //   291: astore #12
    //   293: aload #12
    //   295: astore #13
    //   297: iconst_0
    //   298: istore #14
    //   300: aload #13
    //   302: invokevirtual printStackTrace : ()V
    //   305: nop
    //   306: goto -> 310
    //   309: pop
    //   310: return
    // Exception table:
    //   from	to	target	type
    //   31	47	50	java/lang/Throwable
    //   58	66	69	java/lang/Throwable
    //   74	259	262	java/lang/Throwable
    //   108	219	229	java/lang/Throwable
    //   108	219	238	finally
    //   126	140	143	java/lang/Throwable
    //   131	148	151	java/lang/Throwable
    //   160	190	193	java/lang/Throwable
    //   165	202	205	java/lang/Throwable
    //   229	238	238	finally
    //   238	240	238	finally
  }
  
  static {
    long l = a ^ 0x6EAA01916843L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */