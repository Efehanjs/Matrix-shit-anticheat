package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRiptideEvent;

public final class lf implements Listener {
  private static final long a = o3.a(6067943458753924070L, -8502181705804550519L, MethodHandles.lookup().lookupClass()).a(257019385357883L);
  
  @EventHandler
  public final void b(@NotNull PlayerRiptideEvent paramPlayerRiptideEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lf.a : J
    //   3: ldc2_w 125193104170311
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 34729029907192
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 65661533439964
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 41190381423402
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 85299637042616
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
    //   64: ldc2_w 19172865974003
    //   67: lxor
    //   68: lstore #13
    //   70: pop2
    //   71: invokestatic a : ()I
    //   74: istore #15
    //   76: aload_1
    //   77: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   80: astore #16
    //   82: iload #15
    //   84: ifne -> 127
    //   87: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   90: lload #13
    //   92: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   95: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   98: aload #16
    //   100: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   105: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   108: dup
    //   109: ifnonnull -> 128
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: pop
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: return
    //   128: astore #17
    //   130: aload #17
    //   132: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   135: ldc2_w 1.5
    //   138: lload #8
    //   140: ldc2_w 4.0
    //   143: ldc2_w 3.0
    //   146: invokevirtual j : (DJDD)V
    //   149: aload #17
    //   151: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   154: invokevirtual b : ()Ljava/util/List;
    //   157: checkcast java/lang/Iterable
    //   160: astore #18
    //   162: iconst_0
    //   163: istore #19
    //   165: aload #18
    //   167: invokeinterface iterator : ()Ljava/util/Iterator;
    //   172: astore #20
    //   174: aload #20
    //   176: invokeinterface hasNext : ()Z
    //   181: ifeq -> 327
    //   184: aload #20
    //   186: invokeinterface next : ()Ljava/lang/Object;
    //   191: astore #21
    //   193: aload #21
    //   195: checkcast me/rerere/matrix/internal/zk
    //   198: astore #22
    //   200: iconst_0
    //   201: istore #23
    //   203: iload #15
    //   205: ifne -> 328
    //   208: iload #15
    //   210: ifne -> 322
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   219: athrow
    //   220: aload #22
    //   222: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   225: lload #4
    //   227: invokevirtual b : (J)Z
    //   230: ifeq -> 320
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   239: athrow
    //   240: aload #17
    //   242: iload #10
    //   244: iload #11
    //   246: i2s
    //   247: iload #12
    //   249: invokevirtual t : (ISI)Z
    //   252: iload #15
    //   254: ifne -> 312
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: ifne -> 320
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: aload #22
    //   276: iload #15
    //   278: ifne -> 317
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   291: aload #16
    //   293: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   298: lload #6
    //   300: dup2_x1
    //   301: pop2
    //   302: invokevirtual b : (JLorg/bukkit/World;)Z
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   311: athrow
    //   312: ifeq -> 320
    //   315: aload #22
    //   317: invokevirtual j : ()V
    //   320: nop
    //   321: nop
    //   322: iload #15
    //   324: ifeq -> 174
    //   327: nop
    //   328: return
    // Exception table:
    //   from	to	target	type
    //   82	112	115	java/lang/RuntimeException
    //   87	120	123	java/lang/RuntimeException
    //   203	213	216	java/lang/RuntimeException
    //   208	233	236	java/lang/RuntimeException
    //   220	257	260	java/lang/RuntimeException
    //   240	267	270	java/lang/RuntimeException
    //   264	281	284	java/lang/RuntimeException
    //   274	305	308	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\lf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */