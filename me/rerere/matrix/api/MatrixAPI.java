package me.rerere.matrix.api;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public interface MatrixAPI {
  void markAsBedrockPlayer(Player paramPlayer);
  
  boolean hasVerbose(Player paramPlayer);
  
  void flag(Player paramPlayer, HackType paramHackType, String paramString1, String paramString2, int paramInt);
  
  int getLatency(Player paramPlayer);
  
  int getViolations(Player paramPlayer, HackType paramHackType);
  
  void reloadPermissionCache(Player paramPlayer);
  
  boolean isEnable(HackType paramHackType);
  
  double getTPS();
  
  void setVerbose(Player paramPlayer, boolean paramBoolean);
  
  void setEnable(HackType paramHackType, boolean paramBoolean);
  
  void setVerbose(Player paramPlayer1, boolean paramBoolean, Player paramPlayer2);
  
  void tempBypass(Player paramPlayer, HackType paramHackType, Long paramLong);
  
  void setViolations(Player paramPlayer, HackType paramHackType, int paramInt);
  
  boolean isBypass(Player paramPlayer);
  
  boolean isBypass(@NotNull Player paramPlayer, @NotNull HackType paramHackType);
  
  void registerClientBlock(Block paramBlock);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\MatrixAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */