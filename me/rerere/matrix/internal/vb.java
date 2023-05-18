package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.stream.Collectors;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@Deprecated
public class vb {
  private static final long a = o3.a(-2180605966275985196L, -7594654393754927810L, MethodHandles.lookup().lookupClass()).a(123088976374741L);
  
  @NotNull
  public static ItemStack b(@NotNull Material paramMaterial, @NotNull String paramString) {
    ItemStack itemStack = new ItemStack(paramMaterial);
    ItemMeta itemMeta = itemStack.getItemMeta();
    itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', paramString));
    itemStack.setItemMeta(itemMeta);
    return itemStack;
  }
  
  @NotNull
  public static ItemStack b(@NotNull Material paramMaterial, @NotNull String paramString, short paramShort, @NotNull List paramList) {
    ItemStack itemStack = new ItemStack(paramMaterial);
    itemStack.setDurability(paramShort);
    ItemMeta itemMeta = itemStack.getItemMeta();
    itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', paramString));
    itemMeta.setLore((List)paramList.stream().map(paramString -> ChatColor.translateAlternateColorCodes('&', paramString)).collect(Collectors.toList()));
    itemStack.setItemMeta(itemMeta);
    return itemStack;
  }
  
  @NotNull
  public static String b(long paramLong, @NotNull ItemStack paramItemStack) {
    paramLong = a ^ paramLong;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          if (!paramItemStack.hasItemMeta())
            return paramItemStack.getType().name(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemMeta itemMeta = paramItemStack.getItemMeta();
    try {
      if (i == 0)
        try {
          if (!itemMeta.hasDisplayName())
            return paramItemStack.getType().name(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return itemMeta.getDisplayName();
  }
  
  @NotNull
  public static ItemStack b(@NotNull Material paramMaterial, @NotNull String paramString, @NotNull List paramList) {
    ItemStack itemStack = new ItemStack(paramMaterial);
    ItemMeta itemMeta = itemStack.getItemMeta();
    itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', paramString));
    itemMeta.setLore((List)paramList.stream().map(paramString -> ChatColor.translateAlternateColorCodes('&', paramString)).collect(Collectors.toList()));
    itemStack.setItemMeta(itemMeta);
    return itemStack;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */