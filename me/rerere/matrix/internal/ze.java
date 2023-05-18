package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.plugin.Plugin;

public final class ze implements Listener {
  private static final long a = o3.a(6639796288798291095L, 7751183848302485033L, MethodHandles.lookup().lookupClass()).a(135962904917116L);
  
  private static final String b;
  
  @EventHandler
  public final void b(@NotNull EntityToggleGlideEvent paramEntityToggleGlideEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ze.a : J
    //   3: ldc2_w 69569481752030
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 114463761483079
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 81836183082717
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 121221282964473
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 26853703309725
    //   34: lxor
    //   35: dup2
    //   36: bipush #32
    //   38: lushr
    //   39: l2i
    //   40: istore #10
    //   42: dup2
    //   43: bipush #32
    //   45: lshl
    //   46: bipush #48
    //   48: lushr
    //   49: l2i
    //   50: istore #11
    //   52: dup2
    //   53: bipush #48
    //   55: lshl
    //   56: bipush #48
    //   58: lushr
    //   59: l2i
    //   60: istore #12
    //   62: pop2
    //   63: dup2
    //   64: ldc2_w 75350977510102
    //   67: lxor
    //   68: lstore #13
    //   70: pop2
    //   71: invokestatic a : ()I
    //   74: istore #15
    //   76: aload_1
    //   77: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   80: iload #15
    //   82: ifne -> 116
    //   85: instanceof org/bukkit/entity/Player
    //   88: ifeq -> 414
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: aload_1
    //   99: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   102: dup
    //   103: getstatic me/rerere/matrix/internal/ze.b : Ljava/lang/String;
    //   106: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: checkcast org/bukkit/entity/Player
    //   119: astore #16
    //   121: iload #15
    //   123: ifne -> 166
    //   126: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   129: lload #13
    //   131: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   134: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   137: aload #16
    //   139: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   144: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   147: dup
    //   148: ifnonnull -> 167
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: pop
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: return
    //   167: astore #17
    //   169: aload #17
    //   171: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   174: invokevirtual b : ()Ljava/util/List;
    //   177: invokeinterface iterator : ()Ljava/util/Iterator;
    //   182: astore #18
    //   184: aload #18
    //   186: invokeinterface hasNext : ()Z
    //   191: ifeq -> 349
    //   194: aload #18
    //   196: invokeinterface next : ()Ljava/lang/Object;
    //   201: checkcast me/rerere/matrix/internal/zk
    //   204: astore #19
    //   206: aload #19
    //   208: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   211: lload #6
    //   213: invokevirtual b : (J)Z
    //   216: iload #15
    //   218: ifne -> 353
    //   221: iload #15
    //   223: ifne -> 262
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: ifeq -> 281
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload #17
    //   245: iload #10
    //   247: iload #11
    //   249: i2s
    //   250: iload #12
    //   252: invokevirtual t : (ISI)Z
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: iload #15
    //   264: ifne -> 278
    //   267: ifne -> 281
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   276: athrow
    //   277: iconst_1
    //   278: goto -> 282
    //   281: iconst_0
    //   282: istore #20
    //   284: iload #20
    //   286: iload #15
    //   288: ifne -> 332
    //   291: ifeq -> 184
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: aload #19
    //   303: iload #15
    //   305: ifne -> 337
    //   308: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   311: aload #16
    //   313: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   318: lload #8
    //   320: dup2_x1
    //   321: pop2
    //   322: invokevirtual b : (JLorg/bukkit/World;)Z
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   331: athrow
    //   332: ifeq -> 184
    //   335: aload #19
    //   337: aload_1
    //   338: invokevirtual isGliding : ()Z
    //   341: invokevirtual b : (Z)V
    //   344: iload #15
    //   346: ifeq -> 184
    //   349: aload_1
    //   350: invokevirtual isGliding : ()Z
    //   353: istore #18
    //   355: iload #18
    //   357: iload #15
    //   359: ifne -> 413
    //   362: ifeq -> 390
    //   365: goto -> 372
    //   368: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   371: athrow
    //   372: aload #17
    //   374: iconst_1
    //   375: invokevirtual p : (Z)V
    //   378: iload #15
    //   380: ifeq -> 414
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   389: athrow
    //   390: aload #17
    //   392: aload #17
    //   394: <illegal opcode> accept : (Lme/rerere/matrix/internal/yl;)Ljava/util/function/Consumer;
    //   399: lload #4
    //   401: dup2_x1
    //   402: pop2
    //   403: invokevirtual b : (JLjava/util/function/Consumer;)I
    //   406: goto -> 413
    //   409: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   412: athrow
    //   413: pop
    //   414: return
    // Exception table:
    //   from	to	target	type
    //   76	91	94	java/lang/RuntimeException
    //   85	109	112	java/lang/RuntimeException
    //   121	151	154	java/lang/RuntimeException
    //   126	159	162	java/lang/RuntimeException
    //   206	226	229	java/lang/RuntimeException
    //   221	236	239	java/lang/RuntimeException
    //   233	255	258	java/lang/RuntimeException
    //   262	270	273	java/lang/RuntimeException
    //   284	294	297	java/lang/RuntimeException
    //   301	325	328	java/lang/RuntimeException
    //   355	365	368	java/lang/RuntimeException
    //   362	383	386	java/lang/RuntimeException
    //   372	406	409	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x52E6AEE8D2CBL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */