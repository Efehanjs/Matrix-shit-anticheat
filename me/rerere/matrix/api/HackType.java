package me.rerere.matrix.api;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum HackType {
  DELAY, CHAT, CLICK, SCAFFOLD, MOVE, PHASE, BADPACKETS, AUTOBOT, ELYTRA, INTERACT, VELOCITY, VEHICLE, HITBOX, BLOCK, KILLAURA;
  
  static {
    CLICK = new HackType("CLICK", 1);
    HITBOX = new HackType("HITBOX", 2);
    MOVE = new HackType("MOVE", 3);
    BADPACKETS = new HackType("BADPACKETS", 4);
    DELAY = new HackType("DELAY", 5);
    BLOCK = new HackType("BLOCK", 6);
    SCAFFOLD = new HackType("SCAFFOLD", 7);
    VELOCITY = new HackType("VELOCITY", 8);
    CHAT = new HackType("CHAT", 9);
    INTERACT = new HackType("INTERACT", 10);
    PHASE = new HackType("PHASE", 11);
    AUTOBOT = new HackType("AUTOBOT", 12);
    ELYTRA = new HackType("ELYTRA", 13);
    VEHICLE = new HackType("VEHICLE", 14);
    $VALUES = new HackType[] { 
        KILLAURA, CLICK, HITBOX, MOVE, BADPACKETS, DELAY, BLOCK, SCAFFOLD, VELOCITY, CHAT, 
        INTERACT, PHASE, AUTOBOT, ELYTRA, VEHICLE };
  }
  
  static {
    long l = o3.a(2933841030707653409L, -3852235742574185231L, MethodHandles.lookup().lookupClass()).a(14351113785315L) ^ 0x63723E941280L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\HackType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */