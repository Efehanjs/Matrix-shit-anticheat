package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedEnumEntityUseAction;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.entity.Player;

public final class v {
  @NotNull
  public static final v i;
  
  private static int a;
  
  private static final long b = o3.a(-6656779462131802392L, -8164746916896730295L, MethodHandles.lookup().lookupClass()).a(260555709558577L);
  
  private static final String c;
  
  public static final boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/v.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic r : ()I
    //   9: istore #4
    //   11: invokestatic b : ()I
    //   14: bipush #8
    //   16: if_icmpne -> 84
    //   19: aload_0
    //   20: lload_2
    //   21: lconst_0
    //   22: lcmp
    //   23: iflt -> 66
    //   26: iload #4
    //   28: ifeq -> 66
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: getstatic com/comphenix/protocol/PacketType$Play$Client.CLIENT_COMMAND : Lcom/comphenix/protocol/PacketType;
    //   41: if_acmpne -> 80
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   50: athrow
    //   51: aload_1
    //   52: invokevirtual getClientCommands : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   55: iconst_0
    //   56: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   65: athrow
    //   66: getstatic com/comphenix/protocol/wrappers/EnumWrappers$ClientCommand.OPEN_INVENTORY_ACHIEVEMENT : Lcom/comphenix/protocol/wrappers/EnumWrappers$ClientCommand;
    //   69: if_acmpne -> 80
    //   72: iconst_1
    //   73: goto -> 85
    //   76: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: iconst_0
    //   81: goto -> 85
    //   84: iconst_0
    //   85: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	31	34	java/lang/IllegalArgumentException
    //   19	44	47	java/lang/IllegalArgumentException
    //   38	59	62	java/lang/IllegalArgumentException
    //   66	76	76	java/lang/IllegalArgumentException
  }
  
  public static final boolean h(@NotNull PacketType paramPacketType, long paramLong) {
    paramLong = b ^ paramLong;
    try {
      if (b.b() < 17) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramPacketType == PacketType.Play.Client.PONG);
  }
  
  @Nullable
  public static final EnumWrappers.PlayerAction b(@NotNull StructureModifier paramStructureModifier) {
    EnumWrappers.PlayerAction playerAction;
    try {
      playerAction = (EnumWrappers.PlayerAction)paramStructureModifier.read(0);
    } catch (IllegalArgumentException illegalArgumentException) {
      playerAction = EnumWrappers.PlayerAction.START_RIDING_JUMP;
    } 
    return playerAction;
  }
  
  public final void b(@Nullable Player paramPlayer) {
    PacketContainer packetContainer = new PacketContainer(PacketType.Play.Client.CLIENT_COMMAND);
    packetContainer.getClientCommands().write(0, EnumWrappers.ClientCommand.PERFORM_RESPAWN);
    ProtocolLibrary.getProtocolManager().receiveClientPacket(paramPlayer, packetContainer);
  }
  
  static {
    long l = b ^ 0x51B6333FBD24L;
    M(74);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  public static final boolean b(long paramLong, @NotNull PacketContainer paramPacketContainer) {
    paramLong = b ^ paramLong;
    try {
      if (paramPacketContainer.getType() != PacketType.Play.Client.USE_ENTITY)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramLong >= 0L && b.b() < 17) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (((WrappedEnumEntityUseAction)paramPacketContainer.getEnumEntityUseActions().read(0)).getAction() == EnumWrappers.EntityUseAction.ATTACK);
  }
  
  public static final boolean m(@NotNull PacketType paramPacketType, long paramLong) {
    paramLong = b ^ paramLong;
    try {
      if (b.b() == 8) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramPacketType == PacketType.Play.Client.USE_ITEM);
  }
  
  public static final void b(long paramLong, byte paramByte, @Nullable Player paramPlayer, @NotNull PacketContainer paramPacketContainer) {
    long l = (paramLong << 8L | paramByte << 56L >>> 56L) ^ b;
    try {
      if (paramPlayer == null)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      ProtocolLibrary.getProtocolManager().sendServerPacket(paramPlayer, paramPacketContainer);
    } catch (IllegalArgumentException illegalArgumentException) {
      System.out.println(c);
    } 
  }
  
  public static final boolean p(long paramLong, @NotNull PacketType paramPacketType) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/v.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic r : ()I
    //   9: istore_3
    //   10: aload_2
    //   11: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   14: iload_3
    //   15: ifeq -> 39
    //   18: if_acmpeq -> 42
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   27: athrow
    //   28: aload_2
    //   29: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   38: athrow
    //   39: if_acmpne -> 50
    //   42: iconst_1
    //   43: goto -> 51
    //   46: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   49: athrow
    //   50: iconst_0
    //   51: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	21	24	java/lang/IllegalArgumentException
    //   18	32	35	java/lang/IllegalArgumentException
    //   39	46	46	java/lang/IllegalArgumentException
  }
  
  public static final boolean j(long paramLong, @NotNull PacketType paramPacketType) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/v.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 72663078534903
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic a : ()I
    //   17: istore #5
    //   19: getstatic me/rerere/matrix/internal/v.i : Lme/rerere/matrix/internal/v;
    //   22: pop
    //   23: lload_3
    //   24: aload_2
    //   25: invokestatic b : (JLcom/comphenix/protocol/PacketType;)Z
    //   28: iload #5
    //   30: ifne -> 116
    //   33: ifne -> 115
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: aload_2
    //   44: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
    //   47: iload #5
    //   49: lload_0
    //   50: lconst_0
    //   51: lcmp
    //   52: iflt -> 88
    //   55: ifne -> 86
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   64: athrow
    //   65: if_acmpeq -> 115
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   74: athrow
    //   75: aload_2
    //   76: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   85: athrow
    //   86: iload #5
    //   88: ifne -> 112
    //   91: if_acmpeq -> 115
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: aload_2
    //   102: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   111: athrow
    //   112: if_acmpne -> 119
    //   115: iconst_1
    //   116: goto -> 120
    //   119: iconst_0
    //   120: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	36	39	java/lang/IllegalArgumentException
    //   33	58	61	java/lang/IllegalArgumentException
    //   43	68	71	java/lang/IllegalArgumentException
    //   65	79	82	java/lang/IllegalArgumentException
    //   86	94	97	java/lang/IllegalArgumentException
    //   91	105	108	java/lang/IllegalArgumentException
  }
  
  public static final boolean b(long paramLong, @NotNull PacketType paramPacketType) {
    paramLong = b ^ paramLong;
    try {
      if (b.b() >= 17) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramPacketType == PacketType.Play.Client.FLYING);
  }
  
  public static void M(int paramInt) {
    a = paramInt;
  }
  
  public static int e() {
    return a;
  }
  
  public static int d() {
    int i = e();
    try {
      if (i == 0)
        return 126; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */