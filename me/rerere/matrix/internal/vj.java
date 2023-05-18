package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class vj {
  public Location r;
  
  public int x;
  
  public Location z;
  
  public Player k;
  
  public Block v;
  
  public PlayerInteractEvent b;
  
  public Material i;
  
  private static final long a = o3.a(8691175264290170053L, 5200959017040551693L, MethodHandles.lookup().lookupClass()).a(33196752730392L);
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vj.a : J
    //   3: ldc2_w 12378046412618
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/vj
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/vj
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifne -> 110
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload_0
    //   95: iload #4
    //   97: ifne -> 125
    //   100: getfield x : I
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: aload #5
    //   112: getfield x : I
    //   115: if_icmpeq -> 124
    //   118: iconst_0
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload_0
    //   125: getfield k : Lorg/bukkit/entity/Player;
    //   128: astore #6
    //   130: aload #5
    //   132: getfield k : Lorg/bukkit/entity/Player;
    //   135: astore #7
    //   137: aload #6
    //   139: iload #4
    //   141: ifne -> 175
    //   144: ifnonnull -> 173
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: aload #7
    //   156: ifnull -> 197
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: goto -> 195
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: aload #6
    //   175: aload #7
    //   177: invokevirtual equals : (Ljava/lang/Object;)Z
    //   180: iload #4
    //   182: ifne -> 196
    //   185: ifne -> 197
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: iconst_0
    //   196: ireturn
    //   197: aload_0
    //   198: getfield v : Lorg/bukkit/block/Block;
    //   201: astore #8
    //   203: aload #5
    //   205: getfield v : Lorg/bukkit/block/Block;
    //   208: astore #9
    //   210: aload #8
    //   212: iload #4
    //   214: ifne -> 248
    //   217: ifnonnull -> 246
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: aload #9
    //   229: ifnull -> 270
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: goto -> 268
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: aload #8
    //   248: aload #9
    //   250: invokevirtual equals : (Ljava/lang/Object;)Z
    //   253: iload #4
    //   255: ifne -> 269
    //   258: ifne -> 270
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: iconst_0
    //   269: ireturn
    //   270: aload_0
    //   271: getfield i : Lorg/bukkit/Material;
    //   274: astore #10
    //   276: aload #5
    //   278: getfield i : Lorg/bukkit/Material;
    //   281: astore #11
    //   283: aload #10
    //   285: iload #4
    //   287: ifne -> 321
    //   290: ifnonnull -> 319
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   299: athrow
    //   300: aload #11
    //   302: ifnull -> 343
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   311: athrow
    //   312: goto -> 341
    //   315: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: aload #10
    //   321: aload #11
    //   323: invokevirtual equals : (Ljava/lang/Object;)Z
    //   326: iload #4
    //   328: ifne -> 342
    //   331: ifne -> 343
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   340: athrow
    //   341: iconst_0
    //   342: ireturn
    //   343: aload_0
    //   344: getfield r : Lorg/bukkit/Location;
    //   347: astore #12
    //   349: aload #5
    //   351: getfield r : Lorg/bukkit/Location;
    //   354: astore #13
    //   356: aload #12
    //   358: iload #4
    //   360: ifne -> 402
    //   363: ifnonnull -> 400
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: aload #13
    //   375: iload #4
    //   377: ifne -> 432
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   386: athrow
    //   387: ifnull -> 428
    //   390: goto -> 397
    //   393: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   396: athrow
    //   397: goto -> 422
    //   400: aload #12
    //   402: iload #4
    //   404: ifne -> 432
    //   407: aload #13
    //   409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   412: ifne -> 428
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   421: athrow
    //   422: iconst_0
    //   423: ireturn
    //   424: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   427: athrow
    //   428: aload_0
    //   429: getfield z : Lorg/bukkit/Location;
    //   432: astore #14
    //   434: aload #5
    //   436: getfield z : Lorg/bukkit/Location;
    //   439: astore #15
    //   441: aload #14
    //   443: iload #4
    //   445: ifne -> 479
    //   448: ifnonnull -> 477
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   457: athrow
    //   458: aload #15
    //   460: ifnull -> 501
    //   463: goto -> 470
    //   466: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   469: athrow
    //   470: goto -> 499
    //   473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   476: athrow
    //   477: aload #14
    //   479: aload #15
    //   481: invokevirtual equals : (Ljava/lang/Object;)Z
    //   484: iload #4
    //   486: ifne -> 500
    //   489: ifne -> 501
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   498: athrow
    //   499: iconst_0
    //   500: ireturn
    //   501: aload_0
    //   502: getfield b : Lorg/bukkit/event/player/PlayerInteractEvent;
    //   505: astore #16
    //   507: aload #5
    //   509: getfield b : Lorg/bukkit/event/player/PlayerInteractEvent;
    //   512: astore #17
    //   514: aload #16
    //   516: iload #4
    //   518: ifne -> 552
    //   521: ifnonnull -> 550
    //   524: goto -> 531
    //   527: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   530: athrow
    //   531: aload #17
    //   533: ifnull -> 578
    //   536: goto -> 543
    //   539: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   542: athrow
    //   543: goto -> 572
    //   546: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   549: athrow
    //   550: aload #16
    //   552: aload #17
    //   554: invokevirtual equals : (Ljava/lang/Object;)Z
    //   557: iload #4
    //   559: ifne -> 579
    //   562: ifne -> 578
    //   565: goto -> 572
    //   568: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   571: athrow
    //   572: iconst_0
    //   573: ireturn
    //   574: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   577: athrow
    //   578: iconst_1
    //   579: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	81	84	java/lang/RuntimeException
    //   78	90	90	java/lang/RuntimeException
    //   94	103	106	java/lang/RuntimeException
    //   110	120	120	java/lang/RuntimeException
    //   137	147	150	java/lang/RuntimeException
    //   144	159	162	java/lang/RuntimeException
    //   154	169	169	java/lang/RuntimeException
    //   175	188	191	java/lang/RuntimeException
    //   210	220	223	java/lang/RuntimeException
    //   217	232	235	java/lang/RuntimeException
    //   227	242	242	java/lang/RuntimeException
    //   248	261	264	java/lang/RuntimeException
    //   283	293	296	java/lang/RuntimeException
    //   290	305	308	java/lang/RuntimeException
    //   300	315	315	java/lang/RuntimeException
    //   321	334	337	java/lang/RuntimeException
    //   356	366	369	java/lang/RuntimeException
    //   363	380	383	java/lang/RuntimeException
    //   373	390	393	java/lang/RuntimeException
    //   402	415	418	java/lang/RuntimeException
    //   407	424	424	java/lang/RuntimeException
    //   441	451	454	java/lang/RuntimeException
    //   448	463	466	java/lang/RuntimeException
    //   458	473	473	java/lang/RuntimeException
    //   479	492	495	java/lang/RuntimeException
    //   514	524	527	java/lang/RuntimeException
    //   521	536	539	java/lang/RuntimeException
    //   531	546	546	java/lang/RuntimeException
    //   552	565	568	java/lang/RuntimeException
    //   562	574	574	java/lang/RuntimeException
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vj.a : J
    //   3: ldc2_w 26082915692293
    //   6: lxor
    //   7: lstore_1
    //   8: bipush #59
    //   10: istore #4
    //   12: invokestatic r : ()I
    //   15: iconst_1
    //   16: istore #5
    //   18: iload #5
    //   20: bipush #59
    //   22: imul
    //   23: aload_0
    //   24: getfield x : I
    //   27: iadd
    //   28: istore #5
    //   30: istore_3
    //   31: aload_0
    //   32: getfield k : Lorg/bukkit/entity/Player;
    //   35: astore #6
    //   37: iload #5
    //   39: bipush #59
    //   41: imul
    //   42: aload #6
    //   44: iload_3
    //   45: ifeq -> 69
    //   48: ifnonnull -> 67
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: bipush #43
    //   60: goto -> 72
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: aload #6
    //   69: invokevirtual hashCode : ()I
    //   72: iadd
    //   73: istore #5
    //   75: aload_0
    //   76: getfield v : Lorg/bukkit/block/Block;
    //   79: astore #7
    //   81: iload #5
    //   83: bipush #59
    //   85: imul
    //   86: aload #7
    //   88: iload_3
    //   89: ifeq -> 113
    //   92: ifnonnull -> 111
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: bipush #43
    //   104: goto -> 116
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: aload #7
    //   113: invokevirtual hashCode : ()I
    //   116: iadd
    //   117: istore #5
    //   119: aload_0
    //   120: getfield i : Lorg/bukkit/Material;
    //   123: astore #8
    //   125: iload #5
    //   127: bipush #59
    //   129: imul
    //   130: aload #8
    //   132: iload_3
    //   133: ifeq -> 157
    //   136: ifnonnull -> 155
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: bipush #43
    //   148: goto -> 160
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: aload #8
    //   157: invokevirtual hashCode : ()I
    //   160: iadd
    //   161: istore #5
    //   163: aload_0
    //   164: getfield r : Lorg/bukkit/Location;
    //   167: astore #9
    //   169: iload #5
    //   171: bipush #59
    //   173: imul
    //   174: aload #9
    //   176: iload_3
    //   177: ifeq -> 201
    //   180: ifnonnull -> 199
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: bipush #43
    //   192: goto -> 204
    //   195: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   198: athrow
    //   199: aload #9
    //   201: invokevirtual hashCode : ()I
    //   204: iadd
    //   205: istore #5
    //   207: aload_0
    //   208: getfield z : Lorg/bukkit/Location;
    //   211: astore #10
    //   213: iload #5
    //   215: bipush #59
    //   217: imul
    //   218: aload #10
    //   220: iload_3
    //   221: ifeq -> 245
    //   224: ifnonnull -> 243
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   233: athrow
    //   234: bipush #43
    //   236: goto -> 248
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload #10
    //   245: invokevirtual hashCode : ()I
    //   248: iadd
    //   249: istore #5
    //   251: aload_0
    //   252: getfield b : Lorg/bukkit/event/player/PlayerInteractEvent;
    //   255: astore #11
    //   257: iload #5
    //   259: bipush #59
    //   261: imul
    //   262: aload #11
    //   264: iload_3
    //   265: ifeq -> 289
    //   268: ifnonnull -> 287
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   277: athrow
    //   278: bipush #43
    //   280: goto -> 292
    //   283: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   286: athrow
    //   287: aload #11
    //   289: invokevirtual hashCode : ()I
    //   292: iadd
    //   293: istore #5
    //   295: iload #5
    //   297: ireturn
    // Exception table:
    //   from	to	target	type
    //   37	51	54	java/lang/RuntimeException
    //   48	63	63	java/lang/RuntimeException
    //   81	95	98	java/lang/RuntimeException
    //   92	107	107	java/lang/RuntimeException
    //   125	139	142	java/lang/RuntimeException
    //   136	151	151	java/lang/RuntimeException
    //   169	183	186	java/lang/RuntimeException
    //   180	195	195	java/lang/RuntimeException
    //   213	227	230	java/lang/RuntimeException
    //   224	239	239	java/lang/RuntimeException
    //   257	271	274	java/lang/RuntimeException
    //   268	283	283	java/lang/RuntimeException
  }
  
  public vj(Player paramPlayer, Block paramBlock, Material paramMaterial, Location paramLocation1, Location paramLocation2, PlayerInteractEvent paramPlayerInteractEvent, int paramInt) {
    this.k = paramPlayer;
    this.v = paramBlock;
    this.i = paramMaterial;
    this.r = paramLocation1;
    this.z = paramLocation2;
    this.b = paramPlayerInteractEvent;
    this.x = paramInt;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof vj;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */