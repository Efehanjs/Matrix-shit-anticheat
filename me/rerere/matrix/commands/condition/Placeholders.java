package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.commands.condition.placeholders.Placeholder;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderChance;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderLagPoint;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderMatrixVL;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderPerm;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderPing;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderPlayerCount;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderTPS;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderTimeOnline;
import me.rerere.matrix.commands.condition.placeholders.PlaceholderUptime;
import me.rerere.matrix.internal.o3;

public enum Placeholders {
  PING((Placeholder)new PlaceholderPing()),
  UPTIME((Placeholder)new PlaceholderPing()),
  PLAYER_COUNT((Placeholder)new PlaceholderPing()),
  TPS((Placeholder)new PlaceholderPing()),
  CHANCE((Placeholder)new PlaceholderPing()),
  PERM((Placeholder)new PlaceholderPing()),
  VL((Placeholder)new PlaceholderPing()),
  TIME_ONLINE((Placeholder)new PlaceholderPing()),
  LAG_POINT((Placeholder)new PlaceholderLagPoint());
  
  private final Placeholder placeholder;
  
  public Placeholder getPlaceholder() {
    return this.placeholder;
  }
  
  Placeholders(Placeholder paramPlaceholder) {
    this.placeholder = paramPlaceholder;
  }
  
  static {
    TPS = new Placeholders("TPS", 2, (Placeholder)new PlaceholderTPS());
    TIME_ONLINE = new Placeholders("TIME_ONLINE", 3, (Placeholder)new PlaceholderTimeOnline());
    PLAYER_COUNT = new Placeholders("PLAYER_COUNT", 4, (Placeholder)new PlaceholderPlayerCount());
    UPTIME = new Placeholders("UPTIME", 5, (Placeholder)new PlaceholderUptime());
    PERM = new Placeholders("PERM", 6, (Placeholder)new PlaceholderPerm());
    VL = new Placeholders("VL", 7, (Placeholder)new PlaceholderMatrixVL());
    CHANCE = new Placeholders("CHANCE", 8, (Placeholder)new PlaceholderChance());
    $VALUES = new Placeholders[] { PING, LAG_POINT, TPS, TIME_ONLINE, PLAYER_COUNT, UPTIME, PERM, VL, CHANCE };
  }
  
  static {
    long l = o3.a(-6360121806981723180L, -2045453162951357061L, MethodHandles.lookup().lookupClass()).a(222149816033671L) ^ 0x197D3046DEA0L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Placeholders.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */